package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class UnusedMethodRemover : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        val usedMethods = pool.classes.flatMap { it.methods.asSequence() }
            .flatMap { it.instructions.iterator().asSequence() }
            .mapNotNull { it as? MethodInsnNode }
            .map { "${it.owner}.${it.name}${it.desc}" }
            .toSet()

        val toRemove = hashSetOf<String>()
        pool.classes.flatMap { it.methods }.forEach { method ->
            if(method.isUsed(usedMethods)) return@forEach
            toRemove.add(method.id)
        }

        pool.classes.forEach { cls ->
            val methods = cls.methods.iterator()
            while(methods.hasNext()) {
                val method = methods.next()
                if(method.id !in toRemove) continue
                methods.remove()
                count++
            }
        }

        Logger.info("Removed $count unused methods.")
    }

    private fun MethodNode.isUsed(usedMethods: Set<String>): Boolean {
        if(isConstructor() || isInitializer()) return true
        if(!name.isObfuscatedName()) return true
        if(id in usedMethods) return true

        var supers = cls.superClasses
        while(supers.isNotEmpty()) {
            supers.forEach { c ->
                if(isJvmMethod(c.name, name, desc)) return true
                if(usedMethods.contains("${c.name}.$name$desc")) return true
            }
            supers = supers.flatMap { it.superClasses }.toSet()
        }

        var subs = cls.subClasses
        while(subs.isNotEmpty()) {
            subs.forEach { c ->
                if(usedMethods.contains("${c.name}.$name$desc")) return true
            }
            subs = subs.flatMap { it.subClasses }.toSet()
        }

        return false
    }

    private fun isJvmMethod(owner: String, name: String, desc: String): Boolean {
        try {
            var classes = listOf(Class.forName(Type.getObjectType(owner).className))
            while(classes.isNotEmpty()) {
                for(cls in classes) {
                    if(cls.declaredMethods.any { it.name == name && Type.getMethodDescriptor(it) == desc }) {
                        return true
                    }
                }
                classes = classes.flatMap {
                    mutableListOf<Class<*>>().apply {
                        addAll(it.interfaces)
                        if(it.superclass != null) {
                            add(it.superclass)
                        }
                    }
                }
            }
        } catch(e: Exception) { /* Do Nothing */ }
        return false
    }

    private fun String.isObfuscatedName(): Boolean {
        return arrayOf("class", "method", "field").any { this.startsWith(it) }
    }
}