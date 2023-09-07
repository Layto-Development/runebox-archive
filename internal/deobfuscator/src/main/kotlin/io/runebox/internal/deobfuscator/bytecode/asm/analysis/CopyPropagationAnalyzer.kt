package io.runebox.internal.deobfuscator.bytecode.asm.analysis

import io.runebox.internal.deobfuscator.bytecode.asm.analysis.CopyPropagationAnalyzer.*
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import java.util.*

class CopyPropagationAnalyzer(method: MethodNode) : DataFlowAnalyzer<Set<CopyAssignment>>(method) {

    private val allAssignments = mutableSetOf<CopyAssignment>()

    init {
        for(insn in method.instructions) {
            if(insn !is VarInsnNode || insn.opcode !in STORE_OPCODES) {
                continue
            }

            val prevInsn = insn.previous
            if(prevInsn !is VarInsnNode || prevInsn.opcode !in LOAD_OPCODES) {
                continue
            }

            allAssignments += CopyAssignment(insn.`var`, prevInsn.`var`)
        }
    }

    override fun createEntrySet(): Set<CopyAssignment> = Collections.emptySet()
    override fun createInitialSet(): Set<CopyAssignment> = allAssignments

    override fun join(set1: Set<CopyAssignment>, set2: Set<CopyAssignment>): Set<CopyAssignment> {
        return set1 intersect set2
    }

    override fun transfer(set: Set<CopyAssignment>, insn: AbstractInsnNode): Set<CopyAssignment> {
        return when {
            insn is VarInsnNode && insn.opcode in STORE_OPCODES -> {
                val newSet = set.minusKilledByAssignmentTo(insn.`var`)

                val prevInsn = insn.previous
                if(prevInsn is VarInsnNode && prevInsn.opcode in LOAD_OPCODES) {
                    newSet.plus(CopyAssignment(insn.`var`, prevInsn.`var`))
                } else {
                    newSet
                }
            }
            insn is IincInsnNode -> set.minusKilledByAssignmentTo(insn.`var`)
            else -> set
        }
    }

    private fun Set<CopyAssignment>.minusKilledByAssignmentTo(index: Int): Set<CopyAssignment> {
        return filterTo(mutableSetOf()) { it.source != index && it.destination != index }
    }

    data class CopyAssignment(val destination: Int, val source: Int)

    private companion object {
        private val LOAD_OPCODES = setOf(ILOAD, LSTORE, FLOAD, DLOAD, ALOAD)
        private val STORE_OPCODES = setOf(ISTORE, LSTORE, FSTORE, DSTORE, ASTORE)
    }
}