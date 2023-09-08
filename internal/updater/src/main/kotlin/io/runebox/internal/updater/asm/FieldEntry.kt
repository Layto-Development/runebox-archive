package io.runebox.internal.updater.asm

import io.runebox.internal.updater.util.identitySetOf
import io.runebox.internal.updater.util.isObfuscated
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.FieldNode

class FieldEntry(override val cls: ClassEntry, val node: FieldNode) : MemberEntry<FieldEntry>() {

    val access = node.access
    val name = node.name
    val desc = node.desc
    val value = node.value

    val id = "$name $desc"
    var real: Boolean = cls.real

    lateinit var typeClass: ClassEntry

    val readRefs = identitySetOf<MethodEntry>()
    val writeRefs = identitySetOf<MethodEntry>()

    fun isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
    fun isPublic() = (access and Opcodes.ACC_PUBLIC) != 0
    fun isStatic() = (access and Opcodes.ACC_STATIC) != 0

    fun init() {
        nameObfuscated = name.isObfuscated()

        if(shared) {
            match = this
        }

        typeClass = pool.getCreateClass(Type.getType(desc).internalName)
    }

    override fun toString(): String {
        return "${cls.name}.$name"
    }
}