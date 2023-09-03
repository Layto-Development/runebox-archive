package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.InsnMatcher
import io.runebox.internal.deobfuscator.asm.intConstant
import io.runebox.internal.deobfuscator.asm.isStatic
import org.objectweb.asm.Opcodes.GOTO
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.tinylog.kotlin.Logger

class IllegalStateExceptionRemover : Transformer {

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