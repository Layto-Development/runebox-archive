package io.runebox.internal.asm.tree

import org.objectweb.asm.ClassReader
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
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
        if(!file.parentFile.exists()) file.parentFile.mkdirs()

        val outClasses = mutableListOf<ClassNode>()
        outClasses.addAll(classes)
        if(includeIgnoredClasses) outClasses.addAll(ignoredClasses)

        JarOutputStream(file.outputStream()).use { jos ->
            outClasses.forEach { cls ->
                val bytes = cls.toByteArray()
                jos.putNextEntry(JarEntry(cls.name))
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

    fun init(postLogic: ClassPool.() -> Unit = { }) {
        repeat(1) { step ->
            classes.forEach { cls ->
                when(step) {
                    0 -> processA(cls)
                }
            }
        }
        postLogic(this)
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

        throw IllegalStateException("Class: $name")
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
}