package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import org.objectweb.asm.Opcodes.V1_5
import org.tinylog.kotlin.Logger

class ClassVersionUpgrader : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.version = V1_5
            count++
        }

        Logger.info("Upgraded $count classes to support Java 1.5.")
    }
}