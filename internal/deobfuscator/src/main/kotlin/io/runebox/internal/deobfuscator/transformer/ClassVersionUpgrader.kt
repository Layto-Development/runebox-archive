package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.ClassVersionUtil
import org.objectweb.asm.Opcodes.V1_5
import org.objectweb.asm.Opcodes.V1_7
import org.tinylog.kotlin.Logger

class ClassVersionUpgrader : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.version = V1_5
            count++
        }

        Logger.info("Upgraded $count classes to support Java 1.5.")
    }
}