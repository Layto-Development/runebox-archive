package io.runebox.internal.updater.asm

import io.runebox.internal.updater.util.isObfuscated
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.util.ArrayDeque

class ClassEntry(val node: ClassNode) : Matchable<ClassEntry>() {

    lateinit var pool: ClassPool

    val env get() = pool.env
    val shared get() = pool.shared

    var real: Boolean = true
    var elementClass: ClassEntry? = null

    val access = node.access
    val name = node.name

    var superClass: ClassEntry? = null
    val subClasses = mutableListOf<ClassEntry>()
    val interfaceClasses = mutableListOf<ClassEntry>()
    val implementerClasses = mutableListOf<ClassEntry>()

    val arrayClasses = mutableListOf<ClassEntry>()
    var outerClass: ClassEntry? = null
    val innerClasses = mutableListOf<ClassEntry>()
    val methodTypeRefs = mutableListOf<MethodEntry>()
    val fieldTypeRefs = mutableListOf<FieldEntry>()
    val strings = mutableListOf<String>()
    val numbers = mutableListOf<Number>()

    private val methodMap = hashMapOf<String, MethodEntry>()
    private val fieldMap = hashMapOf<String, FieldEntry>()

    val methods get() = methodMap.values
    val fields get() = fieldMap.values

    fun addMethod(method: MethodEntry) {
        if(methodMap.containsKey(method.id)) return
        methodMap[method.id] = method
    }

    fun addField(field: FieldEntry) {
        if(fieldMap.containsKey(field.id)) return
        fieldMap[field.id] = field
    }

    fun init(pool: ClassPool) {
        this.pool = pool
        this.nameObfuscated = name.isObfuscated()

        if(name[0] == '[') {
            val type = Type.getType(name)
            elementClass = pool.getClass(type.elementType.internalName)
            elementClass!!.arrayClasses.add(this)
        }

        if(shared) {
            match = this
        }
    }

    fun isArray() = name[0] == '['
    fun arrayDims() = name.lastIndexOf('[') + 1

    fun getMethod(name: String, desc: String) = methodMap["$name $desc"]
    fun getField(name: String, desc: String) = fieldMap["$name $desc"]

    fun resolveMethod(name: String, desc: String, toInterface: Boolean): MethodEntry? {
        if(!toInterface) {
            var ret = getMethod(name, desc)
            if(ret != null) return ret

            var cls = this
            while(cls.superClass?.also { cls = it } != null) {
                ret = cls.getMethod(name, desc)
                if(ret != null) return ret
            }

            return resolveInterfaceMethod(name, desc)
        } else {
            var ret = getMethod(name, desc)
            if(ret != null) return ret

            if(superClass != null) {
                ret = superClass!!.getMethod(name, desc)
                if(ret != null && !ret.isStatic() && ret.isPublic()) return ret
            }

            return resolveInterfaceMethod(name, desc)
        }
    }

    private fun resolveInterfaceMethod(name: String, desc: String): MethodEntry? {
        val queue = ArrayDeque<ClassEntry>()
        val visited = mutableSetOf<ClassEntry>()

        var cls = this
        do {
            cls.interfaceClasses.forEach { itf ->
                if(visited.add(itf)) queue.add(itf)
            }
        } while(cls.superClass?.also { cls = it } != null)

        if(queue.isEmpty()) return null

        val matches = mutableSetOf<MethodEntry>()
        var foundNonAbstract = false

        while(queue.poll()?.also { cls = it } != null) {
            val ret = cls.getMethod(name, desc)
            if(ret != null && !ret.isStatic() && !ret.isPrivate()) {
                matches.add(ret)
                if(!ret.isAbstract()) {
                    foundNonAbstract = true
                }
            }

            cls.interfaceClasses.forEach { itf ->
                if(visited.add(itf)) queue.add(itf)
            }
        }

        if(matches.isEmpty()) return null
        if(matches.size == 1) return matches.iterator().next()

        if(foundNonAbstract) {
            val itr = matches.iterator()
            for(m in itr) {
                if(m.isAbstract()) {
                    itr.remove()
                }
            }
            if(matches.size == 1) return matches.iterator().next()
        }

        val itr = matches.iterator()
        for(m in itr) {
            cmpLoop@ for(m2 in matches) {
                if(m == m2) continue
                if(m2.cls.interfaceClasses.contains(m.cls)) {
                    itr.remove()
                    break
                }

                queue.addAll(m2.cls.interfaceClasses)
                while(queue.poll()?.also { cls = it } != null) {
                    if(cls.interfaceClasses.contains(m.cls)) {
                        itr.remove()
                        queue.clear()
                        break@cmpLoop
                    }
                    queue.addAll(cls.interfaceClasses)
                }
            }
        }

        return matches.iterator().next()
    }

    fun resolveField(name: String, desc: String): FieldEntry? {
        var ret = getField(name, desc)
        if(ret != null) return ret

        if(interfaceClasses.isNotEmpty()) {
            val queue = ArrayDeque<ClassEntry>()
            queue.addAll(interfaceClasses)

            var cls = this
            while(queue.pollFirst()?.also {  cls = it } != null) {
                ret = cls.getField(name, desc)
                if(ret != null) return ret

                cls.interfaceClasses.forEach { itf ->
                    queue.addFirst(itf)
                }
            }
        }

        var cls = superClass
        while(cls != null) {
            ret = cls!!.getField(name, desc)
            if(ret != null) return ret
            cls = cls!!.superClass
        }

        return null
    }

    override fun toString(): String {
        return name
    }

    companion object {

        fun getId(name: String): String {
            return if(name[0] == '[') name else "L$name;"
        }

        fun getName(id: String): String {
            var name = id

            if(name.length > 1) {
                name = if(name[0] == '[') name else name.substring(1, name.length - 1)
            }

            if(name.length == 1) {
                name = "java/lang/" + Type.getType(name).className.replaceFirstChar { it.uppercase() }
            }

            return name
        }
    }
}