package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.LabelMap
import io.runebox.internal.deobfuscator.bytecode.asm.cls
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.JumpInsnNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.LookupSwitchInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TableSwitchInsnNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.objectweb.asm.tree.analysis.BasicValue
import org.tinylog.kotlin.Logger
import java.util.Stack

class ControlFlowNormalizer : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(method.tryCatchBlocks.isNotEmpty()) return@methodLoop

                val cfg = ControlFlowGraph()
                cfg.analyze(method.cls.name, method)

                val blocks = cfg.blocks
                val newInsns = InsnList()

                if(cfg.blocks.isNotEmpty()) {
                    val labelMap = LabelMap()
                    val queue = Stack<Block>()
                    val placed = hashSetOf<Block>()

                    queue.add(blocks.first())
                    while(queue.isNotEmpty()) {
                        val block = queue.pop()
                        if(block in placed) continue
                        placed.add(block)

                        block.successors.sortedBy { it.lineNumber }.forEach { queue.add(it.head) }
                        block.next?.also { queue.add(it) }

                        for(i in block.startIndex until block.endIndex) {
                            newInsns.add(method.instructions[i].clone(labelMap))
                        }
                    }
                }

                method.instructions = newInsns
                count += blocks.size
            }
        }

        Logger.info("Normalized $count control-flow blocks.")
    }

    private class ControlFlowGraph : Analyzer<BasicValue>(BasicInterpreter()) {

        val blocks = mutableListOf<Block>()

        override fun init(owner: String, method: MethodNode) {
            var cur = Block()
            blocks.add(cur)

            val insns = method.instructions.toArray()
            for(i in insns.indices) {
                val insn = insns[i]
                cur.endIndex++
                cur.instructions.add(insn)

                if(insn is LineNumberNode) {
                    cur.lineNumber = insn.line
                }

                if(insn.next == null) break
                if(insn.next is LabelNode || insn is JumpInsnNode || insn is LookupSwitchInsnNode || insn is TableSwitchInsnNode) {
                    cur = Block()
                    cur.startIndex = i + 1
                    cur.endIndex = i + 1
                    cur.id = blocks.size - 1
                    blocks.add(cur)
                }
            }
        }

        override fun newControlFlowEdge(insnIndex: Int, successorIndex: Int) {
            val block1 = blocks.first { insnIndex in it.startIndex until it.endIndex }
            val block2 = blocks.first { successorIndex in it.startIndex until it.endIndex }

            if(block1 != block2) {
                if(insnIndex + 1 == successorIndex) {
                    block1.next = block2
                    block2.prev = block1
                } else {
                    block1.successors.add(block2)
                    block2.predecessors.add(block1)
                }
            }
        }
    }

    private class Block : Comparable<Block> {

        var id = -1

        var lineNumber = -1
        var startIndex = 0
        var endIndex = 0

        var prev: Block? = null
        var next: Block? = null

        val predecessors = mutableListOf<Block>()
        val successors = mutableListOf<Block>()

        val instructions = mutableListOf<AbstractInsnNode>()

        val head: Block
            get() {
            var cur = this
            while(true) {
                if(cur.prev == null) {
                    return cur
                } else {
                    cur = cur.prev!!
                }
            }
        }

        override fun compareTo(other: Block): Int {
            return if(lineNumber == other.lineNumber || lineNumber == -1 || other.lineNumber == -1) {
                0
            } else {
                lineNumber.compareTo(other.lineNumber)
            }
        }

        override fun toString(): String {
            return "BLOCK[line=$lineNumber]"
        }

    }
}