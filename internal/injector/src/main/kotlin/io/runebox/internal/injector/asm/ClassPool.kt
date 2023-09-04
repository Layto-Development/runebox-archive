package io.runebox.internal.injector.asm

import io.runebox.internal.injector.Injector
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassPool(val injector: Injector) {

    private val classMap = hashSetOf<ClassNode>()
    val classes get() = classMap

    fun containsClass(name: String) = classMap.any { it.name == name }
    fun containsClass(cls: ClassNode) = containsClass(cls.name)

    fun addClass(cls: ClassNode) {
        if(containsClass(cls)) return
        cls.init(this)
        classMap.add(cls)
    }

    fun removeClass(cls: ClassNode) {
        if(!containsClass(cls)) return
        classMap.remove(cls)
    }

    fun readJar(file: File) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val bytes = jar.getInputStream(entry).readAllBytes()
                    val cls = ClassNode().fromBytes(bytes)
                    addClass(cls)
                }
            }
        }
    }

    fun writeJar(file: File) {
        if(file.exists()) {
            file.deleteRecursively()
        }
        JarOutputStream(file.outputStream()).use { jos ->
            classes.forEach { cls ->
                jos.putNextEntry(JarEntry("${cls.name}.class"))
                jos.write(cls.toBytes())
                jos.closeEntry()
            }
        }
    }

    fun getClass(name: String) = classMap.firstOrNull { it.name == name }

    fun clear() {
        classMap.clear()
    }
}