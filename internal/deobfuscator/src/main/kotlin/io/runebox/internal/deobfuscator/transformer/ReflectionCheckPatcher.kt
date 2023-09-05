package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.InsnModifier
import io.runebox.internal.deobfuscator.asm.fromBytes
import org.objectweb.asm.Opcodes.INVOKESTATIC
import org.objectweb.asm.Opcodes.INVOKEVIRTUAL
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode
import org.tinylog.kotlin.Logger

class ReflectionCheckPatcher : Transformer {

    companion object {
        private const val REFLECTION_CLASS = "io/runebox/internal/deobfuscator/includes/Reflection"
    }

    override fun run(pool: ClassPool) {
        /*
         * Patch all reflection java calls to point to the proxy Reflection.class methods.
         */
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val modifier = InsnModifier()
                for(insn in method.instructions) {
                    patchFindClass(insn, modifier)
                    patchMethodName(insn, modifier)
                    patchGetParameterTypes(insn, modifier)
                    patchGetDeclaredField(insn, modifier)
                    patchSetInt(insn, modifier)
                    patchGetInt(insn, modifier)
                    patchInvoke(insn, modifier)
                }
                modifier.apply(method)
            }
        }

        Logger.info("Patched all reflection checks.")
    }

    private fun patchFindClass(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKESTATIC) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/Class" && insn.name == "forName") {
            insn.owner = REFLECTION_CLASS
            insn.name = "getClass"
            insn.desc = "(Ljava/lang/String;)Ljava/lang/Class;"

            Logger.info("Patched Class.forName call.")
        }
    }

    private fun patchMethodName(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Method" && insn.name == "getName") {
            val newInsn = MethodInsnNode(INVOKESTATIC, REFLECTION_CLASS, "getMethodName", "(Ljava/lang/reflect/Method;)Ljava/lang/Class;")
            modifier.replace(insn, newInsn)

            Logger.info("Patched Method.getName call.")
        }
    }

    private fun patchGetParameterTypes(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Method" && insn.name == "getParameterTypes") {
            val newInsn = MethodInsnNode(INVOKESTATIC, REFLECTION_CLASS, "getArgumentTypes", "(Ljava/lang/reflect/Method;)[Ljava/lang/Class;")
            modifier.replace(insn, newInsn)

            Logger.info("Patched Method.getParameterTypes call.")
        }
    }

    private fun patchGetDeclaredField(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/Class" && insn.name == "getDeclaredField") {
            val newInsn = MethodInsnNode(INVOKESTATIC, REFLECTION_CLASS, "getField", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;")
            modifier.replace(insn, newInsn)

            Logger.info("Patched Class.getDeclaredField call.")
        }
    }

    private fun patchSetInt(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Field" && insn.name == "setInt") {
            val newInsn = MethodInsnNode(INVOKESTATIC, REFLECTION_CLASS, "setInt", "(Ljava/lang/reflect/Field;Ljava/lang/Object;I)V")
            modifier.replace(insn, newInsn)

            Logger.info("Patched Field.setInt call.")
        }
    }

    private fun patchGetInt(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Field" && insn.name == "getInt") {
            val newInsn = MethodInsnNode(INVOKESTATIC, REFLECTION_CLASS, "getInt", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)I")
            modifier.replace(insn, newInsn)

            Logger.info("Patched Field.getInt call.")
        }
    }

    private fun patchInvoke(insn: AbstractInsnNode, modifier: InsnModifier) {
        if(insn.opcode != INVOKEVIRTUAL) return
        insn as MethodInsnNode

        if(insn.owner == "java/lang/reflect/Method" && insn.name == "invoke") {
            val newInsn = MethodInsnNode(INVOKESTATIC, REFLECTION_CLASS, "invoke", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;")
            modifier.replace(insn, newInsn)

            Logger.info("Patched Method.invoke call.")
        }
    }
}