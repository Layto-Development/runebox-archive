package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.InsnMatcher
import io.runebox.internal.deobfuscator.bytecode.asm.isConstructor
import org.objectweb.asm.Opcodes.RETURN
import org.objectweb.asm.tree.InsnNode

class ErrorConstructorRemover : BytecodeTransformer {

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