package io.runebox.internal.deobfuscator.asm

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.*

private val THROW_RETURN_OPCODES = listOf(
    IRETURN,
    LRETURN,
    FRETURN,
    DRETURN,
    ARETURN,
    RETURN,
    RET,
    ATHROW
)

val AbstractInsnNode.nextReal: AbstractInsnNode?
    get() {
        var insn = next
        while (insn != null && insn.opcode == -1) {
            insn = insn.next
        }
        return insn
    }

val AbstractInsnNode.previousReal: AbstractInsnNode?
    get() {
        var insn = previous
        while (insn != null && insn.opcode == -1) {
            insn = insn.previous
        }
        return insn
    }

val AbstractInsnNode.nextVirtual: AbstractInsnNode?
    get() {
        var insn = next
        while (insn != null && insn.opcode != -1) {
            insn = insn.next
        }
        return insn
    }

val AbstractInsnNode.previousVirtual: AbstractInsnNode?
    get() {
        var insn = previous
        while (insn != null && insn.opcode != -1) {
            insn = insn.previous
        }
        return insn
    }

val AbstractInsnNode.intConstant: Int?
    get() = when (this) {
        is IntInsnNode -> {
            if (opcode == BIPUSH || opcode == SIPUSH) {
                operand
            } else {
                null
            }
        }
        is LdcInsnNode -> {
            val cst = cst
            if (cst is Int) {
                cst
            } else {
                null
            }
        }
        else -> when (opcode) {
            ICONST_M1 -> -1
            ICONST_0 -> 0
            ICONST_1 -> 1
            ICONST_2 -> 2
            ICONST_3 -> 3
            ICONST_4 -> 4
            ICONST_5 -> 5
            else -> null
        }
    }

val AbstractInsnNode.isSequential: Boolean
    get() = when (this) {
        is LabelNode -> false
        is JumpInsnNode -> false
        is TableSwitchInsnNode -> false
        is LookupSwitchInsnNode -> false
        else -> opcode !in THROW_RETURN_OPCODES
    }