package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.LabelMap
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger

class VariableExprFixer : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val labelMap = LabelMap()
                val insns = method.instructions.toArray().filter { it.isOrderable() }

                for(insn in insns) {
                    if(insn.previous is VarInsnNode && insn.previous.previous.isConstant()) {
                        val newLeft = insn.previous.previous.clone(labelMap)
                        val newRight = insn.previous.clone(labelMap)
                        method.instructions.set(insn.previous.previous, newRight)
                        method.instructions.set(insn.previous, newLeft)
                        count++
                    }
                    else if(insn.previous.opcode == GETFIELD && (insn.previous.previous is VarInsnNode || insn.previous.previous.opcode == GETSTATIC) && insn.previous.previous.previous.isConstant()) {
                        val newLeft0 = insn.previous.previous.clone(labelMap)
                        val newLeft1 = insn.previous.clone(labelMap)
                        val newRight = insn.previous.previous.previous.clone(labelMap)
                        method.instructions.set(insn.previous.previous.previous, newLeft0)
                        method.instructions.set(insn.previous.previous, newLeft1)
                        method.instructions.set(insn.previous, newRight)
                        count++
                    }
                    else if(insn.previous.opcode == GETSTATIC && insn.previous.previous.isConstant()) {
                        val newLeft = insn.previous.clone(labelMap)
                        val newRight = insn.previous.previous.clone(labelMap)
                        method.instructions.set(insn.previous.previous, newLeft)
                        method.instructions.set(insn.previous, newRight)
                        count++
                    }
                }
            }
        }

        Logger.info("Reordered $count variable binary expressions.")
    }


    private fun AbstractInsnNode.isOrderable(): Boolean {
        return opcode in listOf(IF_ICMPEQ, IF_ICMPNE, IF_ACMPEQ, IF_ACMPNE) || opcode in IMUL..DMUL || opcode in IADD..DADD
    }

    private fun AbstractInsnNode.isConstant(): Boolean = opcode in ICONST_M1..LDC
}