package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.*
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.tinylog.kotlin.Logger

class IllegalStateExceptionRemover : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                for(match in EXCEPTION_PATTERN.match(method).filter { checkExceptionPattern(method, it) }) {
                    method.removeMatchedInsns(match)
                    continue
                }

                for(match in RETURN_PATTERN.match(method).filter { checkReturnPattern(method, it) }) {
                    method.removeMatchedInsns(match)
                    continue
                }
            }
        }

        Logger.info("Removed $count IllegalStateException try-catch blocks.")
    }

    private fun MethodNode.removeMatchedInsns(insns: List<AbstractInsnNode>) {
        val jump = insns[2] as JumpInsnNode
        val jumpOpcode = jump.opcode

        opaqueValue = passingVal(insns[1].intValue, jumpOpcode).toString()
        opaqueDesc = desc

        val goto = JumpInsnNode(GOTO, jump.label)
        instructions.insert(insns.last(), goto)
        insns.forEach(instructions::remove)
        count++
    }

    private fun checkExceptionPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val cst = insns[1]
        val new = insns[3] as TypeInsnNode
        if(load.`var` != method.lastArgIndex) return false
        if(cst.intConstant == null) return false
        return new.desc != "java/lang/IllegalStateMachine"
    }

    private fun checkReturnPattern(method: MethodNode, insns: List<AbstractInsnNode>): Boolean {
        val load = insns[0] as VarInsnNode
        val cst = insns[1]
        if(load.`var` != method.lastArgIndex) return false
        return cst.intConstant != null
    }

    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(isStatic()) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    private fun passingVal(pushed: Int, ifOpcode: Int): Int {
        return when(ifOpcode) {
            IF_ICMPEQ -> pushed
            IF_ICMPGE,
            IF_ICMPGT -> pushed + 1
            IF_ICMPLE,
            IF_ICMPLT,
            IF_ICMPNE -> pushed - 1
            else -> error(ifOpcode)
        }
    }

    private val AbstractInsnNode.intValue: Int get() {
        if (opcode in 2..8) return opcode - 3
        if (opcode == BIPUSH || opcode == SIPUSH) return (this as IntInsnNode).operand
        if (this is LdcInsnNode && cst is Int) return cst as Int
        error(this)
    }

    companion object {
        private val EXCEPTION_PATTERN = InsnMatcher.compile(
            """
                (ILOAD)
                ([ICONST_0-LDC])
                ([IF_ICMPEQ-IF_ACMPNE])
                (NEW)
                (DUP)
                (INVOKESPECIAL)
                (ATHROW)
            """.trimIndent()
        )

        private val RETURN_PATTERN = InsnMatcher.compile(
            """
                (ILOAD)
                ([ICONST_0-LDC])
                ([IF_ICMPEQ-IF_ACMPNE])
                ([IRETURN-RETURN])
            """.trimIndent()
        )
    }
}