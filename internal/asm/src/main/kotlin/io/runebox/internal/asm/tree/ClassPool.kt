package io.runebox.internal.asm.tree

import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import java.io.File
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayDeque
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class ClassPool {

    private val classMap = hashMapOf<String, ClassNode>()
    private val sharedClassMap = hashMapOf<String, ClassNode>()
    private val resourceMap = hashMapOf<String, ByteArray>()

    val allClasses get() = classMap.values
    val sharedClasses get() = sharedClassMap.values
    val ignoredClasses get() = classMap.values.filter { it.ignored }
    val classes get() = classMap.values.filter { !it.ignored }

    fun addClass(cls: ClassNode, shared: Boolean = false): Boolean {
        val map = if(shared) sharedClassMap else classMap
        if(map.containsKey(cls.id)) return false
        cls.shared = shared
        cls.init(this)
        map[cls.id] = cls
        return true
    }

    fun removeClass(cls: ClassNode): Boolean {
        val map = if(cls.shared) sharedClassMap else classMap
        if(!map.containsKey(cls.id)) return false
        map.remove(cls.id)
        return true
    }

    fun addJarClasses(file: File) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val cn = ClassNode().fromByteArray(jar.getInputStream(entry).readAllBytes())
                    addClass(cn)
                } else {
                    val bytes = jar.getInputStream(entry).readAllBytes()
                    resourceMap[entry.name] = bytes
                }
            }
        }
    }

    fun writeJarFile(file: File, includeIgnoredClasses: Boolean = true, includeResources: Boolean = false) {
        if(file.exists()) file.deleteRecursively()

        val outClasses = mutableListOf<ClassNode>()
        outClasses.addAll(classes)
        if(includeIgnoredClasses) outClasses.addAll(ignoredClasses)

        JarOutputStream(file.outputStream()).use { jos ->
            outClasses.forEach { cls ->
                val bytes = cls.toByteArray()
                jos.putNextEntry(JarEntry("${cls.name}.class"))
                jos.write(bytes)
                jos.closeEntry()
            }

            if(includeResources) {
                resourceMap.forEach { (name, bytes) ->
                    jos.putNextEntry(JarEntry(name))
                    jos.write(bytes)
                    jos.closeEntry()
                }
            }
        }
    }

    fun getClass(name: String): ClassNode {
        var ret = classMap[name]
        if(ret != null) return ret

        ret = sharedClassMap[name]
        if(ret != null) return ret

        var path: Path? = null
        val url = ClassPool::class.java.classLoader.getResource("$name.class") ?: ClassLoader.getSystemResource("$name.class")
        if(url != null) {
            try {
                val uri = url.toURI()
                path = Paths.get(uri)
                if(uri.scheme == "jrt" && !Files.exists(path!!)) {
                    path = Paths.get(URI(uri.scheme, uri.userInfo, uri.host, uri.port, "/modules${uri.path}", uri.query, uri.fragment))
                }
            } catch (e: Exception) { /* Do Nothing */ }
        }

        if(path != null) {
            val bytes = Files.readAllBytes(path)
            val cls = ClassNode().fromByteArray(bytes, ClassReader.SKIP_CODE)
            if(addClass(cls, shared = true)) {
                processA(cls)
            }
            return cls
        }

        val cls = ClassNode()
        cls.name = name
        addClass(cls, shared = true)

        return cls
    }

    fun init(postLogic: ClassPool.() -> Unit = { }) {
        repeat(4) { step ->
            classes.forEach { cls ->
                when(step) {
                    0 -> processA(cls)
                    1 -> processB(cls)
                    2 -> processC(cls)
                    4 -> processD(cls)
                }
            }
        }
        postLogic(this)
    }

    /**
     * ========== CLASS INITIALIZATION FUNCTIONS ==========
     */

    private fun processA(cls: ClassNode) {
        if(cls.superName != null && cls.superClass == null) {
            cls.superClass = getClass(cls.superName)
            cls.superClass?.childClasses?.add(cls)
        }

        cls.interfaces.map { getClass(it) }.forEach { itf ->
            cls.interfaceClasses.add(itf)
            itf.implementerClasses.add(cls)
        }
    }

    private fun processB(cls: ClassNode) {
        cls.methods.forEach { method ->
            method.instructions.forEach insnLoop@ { insn ->
                when(insn) {
                    is MethodInsnNode -> {
                        val owner = getClass(insn.owner)
                        val dst = owner.resolveMethod(insn.name, insn.desc) ?: return@insnLoop

                        dst.refsIn.add(method)
                        method.refsOut.add(dst)
                        dst.cls.methodTypeRefs.add(method)
                        method.classRefs.add(dst.cls)
                    }

                    is FieldInsnNode -> {
                        val owner = getClass(insn.owner)
                        val dst = owner.resolveField(insn.name, insn.desc) ?: return@insnLoop

                        if(insn.opcode == GETSTATIC || insn.opcode == GETFIELD) {
                            dst.readRefs.add(method)
                            method.fieldReadRefs.add(dst)
                        } else {
                            dst.writeRefs.add(method)
                            method.fieldWriteRefs.add(dst)
                        }

                        dst.cls.methodTypeRefs.add(method)
                        method.classRefs.add(dst.cls)
                    }

                    is TypeInsnNode -> {
                        val dst = getClass(insn.desc)

                        dst.methodTypeRefs.add(method)
                        method.classRefs.add(dst)
                    }
                }
            }
        }
    }

    private fun processC(cls: ClassNode) {
        if(cls.childClasses.isNotEmpty() || cls.implementerClasses.isNotEmpty()) return

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
                } else if(methods[method.id]?.also { prev = it } != null) {
                    if(method.hierarchy.isEmpty()) {
                        method.hierarchy = prev.hierarchy
                        method.hierarchy.add(method)
                    } else if(method.hierarchy != prev.hierarchy) {
                        prev.hierarchy.forEach { m ->
                            method.hierarchy.add(m)
                            m.hierarchy = method.hierarchy
                        }
                    }
                } else {
                    methods[method.id] = method
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
                } else if(fields[field.id]?.also { prev = it } != null) {
                    if(field.hierarchy.isEmpty()) {
                        field.hierarchy = prev.hierarchy
                        field.hierarchy.add(field)
                    } else if(field.hierarchy != prev.hierarchy) {
                        prev.hierarchy.forEach { m ->
                            field.hierarchy.add(m)
                            m.hierarchy = field.hierarchy
                        }
                    }
                } else {
                    fields[field.id] = field
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

    private fun processD(cls: ClassNode) {
        val queue = ArrayDeque<ClassNode>()
        val visited = hashSetOf<ClassNode>()

        cls.methods.forEach { method ->
            if(method.hierarchy.size > 1) {
                run childLoop@ {
                    if(method.isConstructor() || method.isInitializer()) return@forEach
                    if(method.isHierarchyBarrier()) return@childLoop

                    if(method.cls.superClass != null) queue.add(method.cls.superClass!!)
                    queue.addAll(method.cls.interfaceClasses)

                    var cur = cls
                    while(queue.poll()?.also { cur = it } != null) {
                        if(!visited.add(cur)) continue

                        val m = cur.getMethod(method.name, method.desc)
                        if(m != null && !m.isHierarchyBarrier()) {
                            method.parents.add(m)
                            m.children.add(m)
                        }
                        if(cur.superClass != null) queue.add(cur.superClass!!)
                        queue.addAll(cur.interfaceClasses)
                    }
                }
            }
        }

        queue.clear()
        visited.clear()

        cls.fields.forEach { field ->
            if(field.hierarchy.size > 1) {
                run childLoop@ {
                    if(field.isHierarchyBarrier()) return@childLoop

                    if(field.cls.superClass != null) queue.add(field.cls.superClass!!)
                    queue.addAll(field.cls.interfaceClasses)

                    var cur = cls
                    while(queue.poll()?.also { cur = it } != null) {
                        if(!visited.add(cur)) continue

                        val f = cur.getField(field.name, field.desc)
                        if(f != null && !f.isHierarchyBarrier()) {
                            field.parents.add(f)
                            f.children.add(f)
                        }
                        if(cur.superClass != null) queue.add(cur.superClass!!)
                        queue.addAll(cur.interfaceClasses)
                    }
                }
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