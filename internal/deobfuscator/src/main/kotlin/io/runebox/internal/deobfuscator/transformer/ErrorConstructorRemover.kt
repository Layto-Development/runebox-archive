package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.InsnMatcher
import io.runebox.internal.deobfuscator.asm.isConstructor
import org.objectweb.asm.Opcodes.RETURN
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

class ErrorConstructorRemover : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            for(method in cls.methods) {
                if(!method.isConstructor()) continue
                matchLoop@ for(match in PATTERN.match(method)) {
                    match.forEach { insn ->
                        method.instructions.remove(insn)
                    }
                    method.instructions.add(InsnNode(RETURN))
                    count++
                    continue
                }
            }
        }
    }

    companion object {
        private val PATTERN = InsnMatcher.compile(
            """
                (NEW)
                (DUP)
                (INVOKESPECIAL)
                (ATHROW)
            """.trimIndent()
        )
    }
}