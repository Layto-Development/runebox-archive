package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.fromBytes
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger

class ClassIncluder : Transformer {

    override fun run(pool: ClassPool) {
        pool.includeObfInfoClass()
        pool.includeReflectionsClass()

        Logger.info("Added deobfuscator class inclusions.")
    }

    private fun ClassPool.includeObfInfoClass() {
        val cls = ClassIncluder::class.java.getResourceAsStream("/io/runebox/internal/deobfuscator/include/ObfInfo.class")!!
            .readAllBytes().let { ClassNode().fromBytes(it) }
        cls.name = "include/ObfInfo"
        addClass(cls)
    }

    private fun ClassPool.includeReflectionsClass() {
        val cls = ClassIncluder::class.java.getResourceAsStream("/io/runebox/internal/deobfuscator/include/Reflections.class")!!
            .readAllBytes().let { ClassNode().fromBytes(it) }
        cls.name = "include/Reflections"
        cls.visibleAnnotations.clear()
        addClass(cls)
    }
}