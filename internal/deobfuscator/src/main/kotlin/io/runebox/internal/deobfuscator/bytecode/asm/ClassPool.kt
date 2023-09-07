package io.runebox.internal.deobfuscator.bytecode.asm

import io.runebox.internal.deobfuscator.bytecode.asm.classpath.ClassPath
import org.objectweb.asm.Opcodes.ACC_PRIVATE
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.commons.Remapper
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import java.io.File
import java.util.ArrayDeque
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassPool {

    private val classMap = hashSetOf<ClassNode>()

    val classes get() = classMap.filter { !it.ignored }
    val ignoredClasses get() = classMap.filter { it.ignored }
    val allClasses get() = classMap.toList()

    val classPath get() = ClassPath(ClassLoader.getPlatformClassLoader(), this)

    fun addClass(cls: ClassNode) {
        if(cls in classMap) return
        cls.init(this)
        classMap.add(cls)
    }

    fun removeClass(cls: ClassNode) {
        if(cls !in classMap) return
        classMap.remove(cls)
    }

    fun replaceClass(old: ClassNode, new: ClassNode) {
        removeClass(old)
        addClass(new)
    }

    fun readJar(file: File) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val cls = ClassNode().fromBytes(jar.getInputStream(entry).readAllBytes())
                    addClass(cls)
                }
            }
        }
    }

    fun writeJar(file: File, writeIgnored: Boolean = false) {
        if(file.exists()) {
            file.delete()
        }
        JarOutputStream(file.outputStream()).use { jos ->
            val clsList = if(writeIgnored) allClasses else classes
            clsList.forEach { cls ->
                jos.putNextEntry(JarEntry("${cls.name}.class"))
                jos.write(cls.toBytes())
                jos.closeEntry()
            }
        }
    }

    fun clear() {
        classMap.clear()
    }

    fun getClass(name: String) = classMap.firstOrNull { it.name == name }

    fun remap(remapper: Remapper) {
        allClasses.forEach { cls ->
            cls.remap(remapper)
        }
    }

    fun init() {
        allClasses.forEach { it.reset() }

        // Step 1
        allClasses.forEach { cls ->
            cls.superClass = getClass(cls.superName)
            cls.superClass?.childClasses?.add(cls)
            cls.interfaces.mapNotNull { getClass(it) }.forEach { itf ->
                cls.interfaceClasses.add(itf)
                itf.childClasses.add(cls)
            }
        }

        // Step 2
        allClasses.forEach { cls ->
            if(cls.childClasses.isNotEmpty()) return@forEach

            val methods = hashMapOf<String, MethodNode>()
            val fields = hashMapOf<String, FieldNode>()
            val queue = ArrayDeque<ClassNode>()

            queue.add(cls)
            var cur = cls
            while(queue.poll()?.also { cur = it } != null) {
                cur.methods.forEach { method ->
                    var prev: MethodNode = method
                    if(method.isHierarchyBarrier()) {
                        if(method.hierarchy.isEmpty()) {
                            method.hierarchy.clear()
                            method.hierarchy.add(method)
                        }
                    } else if(methods["${method.name}${method.desc}"]?.also { prev = it } != null) {
                        if(method.hierarchy.isEmpty()) {
                            method.hierarchy = prev.hierarchy
                            method.hierarchy.add(method)
                        } else if(method.hierarchy != prev.hierarchy) {
                            prev.hierarchy.forEach {
                                method.hierarchy.add(it)
                                it.hierarchy = method.hierarchy
                            }
                        }
                    } else {
                        methods["${method.name}${method.desc}"] = method
                        if(method.hierarchy.isEmpty()) {
                            method.hierarchy.clear()
                            method.hierarchy.add(method)
                        }
                    }
                }

                cur.fields.forEach { field ->
                    var prev: FieldNode = field
                    if(field.isHierarchyBarrier()) {
                        if(field.hierarchy.isEmpty()) {
                            field.hierarchy.clear()
                            field.hierarchy.add(field)
                        }
                    } else if(fields["${field.name}:${field.desc}"]?.also { prev = it } != null) {
                        if(field.hierarchy.isEmpty()) {
                            field.hierarchy = prev.hierarchy
                            field.hierarchy.add(field)
                        } else if(field.hierarchy != prev.hierarchy) {
                            prev.hierarchy.forEach {
                                field.hierarchy.add(it)
                                it.hierarchy = field.hierarchy
                            }
                        }
                    } else {
                        fields["${field.name}:${field.desc}"] = field
                        if(field.hierarchy.isEmpty()) {
                            field.hierarchy.clear()
                            field.hierarchy.add(field)
                        }
                    }
                }

                if(cur.superClass != null) queue.add(cur.superClass!!)
                queue.addAll(cur.interfaceClasses)
            }
        }
    }

    private fun MethodNode.isHierarchyBarrier(): Boolean {
        return (access and (ACC_PRIVATE or ACC_STATIC)) != 0
    }

    private fun FieldNode.isHierarchyBarrier(): Boolean {
        return (access and (ACC_PRIVATE or ACC_STATIC)) != 0
    }
}