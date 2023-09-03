package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.id
import io.runebox.internal.deobfuscator.asm.isFinal
import org.objectweb.asm.tree.FieldInsnNode
import org.tinylog.kotlin.Logger

class UnusedFieldRemover : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        val usedFields = pool.classes.flatMap { it.methods }
            .flatMap { it.instructions.toArray().asIterable() }
            .mapNotNull { it as? FieldInsnNode }
            .map { "${it.owner}.${it.name}" }
            .toSet()

        pool.classes.forEach { cls ->
            val fields = cls.fields.iterator()
            while(fields.hasNext()) {
                val field = fields.next()
                if(field.id !in usedFields && field.isFinal()) {
                    fields.remove()
                    count++
                }
            }
        }

        Logger.info("Removed $count unused fields.")
    }
}