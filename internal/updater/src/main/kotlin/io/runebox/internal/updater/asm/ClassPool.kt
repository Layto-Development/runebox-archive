package io.runebox.internal.updater.asm

import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.TypeInsnNode
import org.tinylog.kotlin.Logger
import java.io.File
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.IdentityHashMap
import java.util.jar.JarFile

class ClassPool(val env: ClassEnv, val shared: Boolean) {

    val otherPool get() = if(env.poolA == this) env.poolB else env.poolA
    val sharedPool get() = env.sharedPool

    private val classMap = hashMapOf<String, ClassEntry>()
    private val arrayClassMap = hashMapOf<String, ClassEntry>()

    val classes get() = classMap.values
    val arrayClasses get() = arrayClassMap.values

    fun addClass(cls: ClassEntry): Boolean {
        if(classMap.containsKey(cls.name)) return false
        cls.init(this)
        classMap[cls.name] = cls
        return true
    }

    fun addArrayClass(cls: ClassEntry): Boolean {
        if(arrayClassMap.containsKey(cls.name)) return false
        cls.init(this)
        arrayClassMap[cls.name] = cls
        return true
    }

    fun getClass(name: String) = classMap[name] ?: arrayClassMap[name]
    fun getClassById(id: String) = getClass(if(id[0] == '[') id else if(id[0] == 'L') id.substring(1, id.length - 1) else id)

    fun getCreateClass(className: String): ClassEntry {
        val name = if(className[0] == '[') className else if(className[0] == 'L') className.substring(1, className.length - 1) else className

        var ret = getClass(name)
        if(ret != null) return ret

        ret = sharedPool.getClass(name)
        if(ret != null) return ret

        var path: Path? = null
        val url = ClassPool::class.java.getResource("/$name.class") ?: ClassLoader.getSystemResource("$name.class")

        if(url != null) {
            try {
                val uri = url.toURI()
                path = Paths.get(uri)
                if(uri.scheme == "jrt" && !Files.exists(path!!)) {
                    path = Paths.get(URI(uri.scheme, uri.userInfo, uri.host, uri.port, "/modules${uri.path}", uri.query, uri.fragment))
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        if(path != null) {
            val node = readClass(Files.readAllBytes(path), ClassReader.SKIP_CODE)
            val cls = ClassEntry(node)
            if(sharedPool.addClass(cls)) {
                processA(cls)
            }
            return cls
        }

        val node = ClassNode()
        node.visit(
            V1_1,
            ACC_PUBLIC or ACC_SUPER,
            name,
            null,
            "java/lang/Object",
            emptyArray()
        )

        var targetPool = sharedPool
        val cls = ClassEntry(node).also {
            if(name[0] == '[') {
                val type = Type.getType(name)
                targetPool = getCreateClass(type.elementType.internalName).pool
            }
        }
        cls.real = false

        if(cls.isArray()) targetPool.addArrayClass(cls) else targetPool.addClass(cls)
        return cls
    }

    fun loadJar(file: File) {
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.name.endsWith(".class")) {
                    val node = readClass(jar.getInputStream(entry).readAllBytes())
                    val cls = ClassEntry(node)
                    addClass(cls)
                }
            }
        }
    }

    fun init() {
        getCreateClass("java/lang/Object")

        repeat(2) { step ->
            classes.forEach { cls ->
                when(step) {
                    0 -> processA(cls)
                    1 -> processB(cls)
                }
            }
        }
    }

    private fun processA(cls: ClassEntry) {
        val cn = cls.node
        cn.methods.forEach { mn ->
            val method = MethodEntry(cls, mn)
            method.init()
            cls.addMethod(method)
        }
        cn.fields.forEach { fn ->
            val field = FieldEntry(cls, fn)
            field.init()
            cls.addField(field)
        }

        run {
            if(cls.outerClass == null) {
                if(cn.outerClass != null) {
                    cls.addOuterClass(cn.outerClass)
                } else {
                    cn.innerClasses.forEach { ic ->
                        if(ic.name == cn.name) {
                            if(ic.outerName == null) {
                                return@forEach
                            } else {
                                cls.addOuterClass(ic.outerName)
                                return@run
                            }
                        }
                    }

                    val pos = cn.name.lastIndexOf('$')
                    if(pos > 0 && pos < cn.name.length - 1) {
                        cls.addOuterClass(cn.name.substring(0, pos))
                    }
                }
            }
        }

        if(cls.superClass == null && cn.superName != null) {
            cls.superClass = cls.pool.getCreateClass(cn.superName)
            cls.superClass?.subClasses?.add(cls)
            cn.interfaces.map { cls.pool.getCreateClass(it) }.forEach { itf ->
                cls.interfaceClasses.add(itf)
                itf.implementerClasses.add(cls)
            }
        }
    }

    private fun ClassEntry.addOuterClass(name: String) {
        var outerCls = pool.getClass(name)
        if(outerCls == null) {
            outerCls = pool.getCreateClass(name)
        }
        outerCls.innerClasses.add(this)
        this.outerClass = outerCls
    }

    private fun processB(cls: ClassEntry) {
        cls.methods.forEach { method ->
            if(!method.real) return
            method.instructions.forEach insnLoop@ { insn ->
                when(insn) {
                    is MethodInsnNode -> {
                        val owner = getCreateClass(insn.owner)
                        val dst = owner.resolveMethod(insn.name, insn.desc, insn.itf || insn.opcode == INVOKEINTERFACE)
                        if(dst == null) {
                            Logger.warn("Could not resolve method: ${insn.owner}.${insn.name}${insn.desc}.")
                            return@insnLoop
                        }

                        dst.refsIn.add(method)
                        method.refsOut.add(dst)
                        dst.cls.methodTypeRefs.add(method)
                        method.classRefs.add(dst.cls)
                    }

                    is FieldInsnNode -> {
                        val owner = getCreateClass(insn.owner)
                        val dst = owner.resolveField(insn.name, insn.desc)
                        if(dst == null) {
                            Logger.warn("Could not resolve field: ${insn.owner}.${insn.name}.")
                            return@insnLoop
                        }

                        if(insn.opcode in listOf(GETFIELD, GETSTATIC)) {
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
                        val dst = getCreateClass(insn.desc)

                        dst.methodTypeRefs.add(method)
                        method.classRefs.add(dst)
                    }
                }
            }
        }
    }

    companion object {

        private fun readClass(bytes: ByteArray, flags: Int = ClassReader.EXPAND_FRAMES): ClassNode {
            val reader = ClassReader(bytes)
            val node = ClassNode()
            reader.accept(node, flags)
            return node
        }
    }
}