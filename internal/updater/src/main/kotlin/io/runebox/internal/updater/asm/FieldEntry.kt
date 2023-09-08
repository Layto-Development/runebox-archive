package io.runebox.internal.updater.asm

import io.runebox.internal.updater.util.isObfuscated
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.FieldNode

class FieldEntry(val cls: ClassEntry, val node: FieldNode) : Matchable<FieldEntry>() {

    val pool get() = cls.pool
    val env get() = pool.env
    val shared get() = cls.shared

    val access = node.access
    val name = node.name
    val desc = node.desc
    val value = node.value

    val id = "$name $desc"
    var real: Boolean = cls.real

    val readRefs = mutableListOf<MethodEntry>()
    val writeRefs = mutableListOf<MethodEntry>()
    val classRefs = mutableListOf<ClassEntry>()

    fun isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
    fun isPublic() = (access and Opcodes.ACC_PUBLIC) != 0
    fun isStatic() = (access and Opcodes.ACC_STATIC) != 0

    fun init() {
        nameObfuscated = name.isObfuscated()

        if(shared) {
            match = this
        }
    }

    override fun toString(): String {
        return "${cls.name}.$name"
    }
}