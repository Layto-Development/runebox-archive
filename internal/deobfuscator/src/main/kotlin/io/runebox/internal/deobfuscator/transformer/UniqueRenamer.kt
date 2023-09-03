package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.*
import org.objectweb.asm.commons.SimpleRemapper
import org.tinylog.kotlin.Logger

class UniqueRenamer : Transformer {

    private var classCount = 0
    private var methodCount = 0
    private var fieldCount = 0

    private val mappings = hashMapOf<String, String>()

    override fun run(pool: ClassPool) {
        /*
         * Generate name mappings.
         */
        pool.classes.forEach { cls ->
            if(!cls.name.isObfuscatedName()) return@forEach
            mappings[cls.id] = "class${++classCount}"
        }

        pool.classes.flatMap { it.methods }.forEach { method ->
            if(!method.name.isObfuscatedName() || method.id in mappings.keys) return@forEach
            val newName = "method${++methodCount}"
            mappings[method.id] = newName
            method.cls.subClasses.forEach { c ->
                mappings["${c.name}.${method.name}${method.desc}"] = newName
            }
        }

        pool.classes.flatMap { it.fields }.forEach { field ->
            if(!field.name.isObfuscatedName() || field.id in mappings.keys) return@forEach
            val newName = "field${++fieldCount}"
            mappings[field.id] = newName
            field.cls.subClasses.forEach { c ->
                mappings["${c.name}.${field.name}"] = newName
            }
        }

        /*
         * Apply Mappings
         */
        pool.remap(SimpleRemapper(mappings))

        Logger.info("Renamed $classCount classes.")
        Logger.info("Renamed $methodCount methods.")
        Logger.info("Renamed $fieldCount fields.")
    }

    private fun String.isObfuscatedName(): Boolean {
        return (this.length <= 2) || (this.length == 3 && this !in listOf("add", "run", "put", "set", "get"))
    }
}