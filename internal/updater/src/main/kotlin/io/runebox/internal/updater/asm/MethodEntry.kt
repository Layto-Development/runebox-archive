package io.runebox.internal.updater.asm

import io.runebox.internal.updater.util.isObfuscated
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.MethodNode

class MethodEntry(override val cls: ClassEntry, val node: MethodNode) : MemberEntry<MethodEntry>() {

    val access = node.access
    val name = node.name
    val desc = node.desc
    val tryCatchBlocks = node.tryCatchBlocks
    val instructions = node.instructions
    val exceptions = node.exceptions

    val id = "$name $desc"
    var real: Boolean = cls.real

    lateinit var retTypeClass: ClassEntry
    val argTypeClasses = mutableListOf<ClassEntry>()

    val refsIn = mutableSetOf<MethodEntry>()
    val refsOut = mutableSetOf<MethodEntry>()
    val fieldReadRefs = mutableSetOf<FieldEntry>()
    val fieldWriteRefs = mutableSetOf<FieldEntry>()
    val classRefs = mutableSetOf<ClassEntry>()

    fun isPrivate() = (access and ACC_PRIVATE) != 0
    fun isPublic() = (access and ACC_PUBLIC) != 0
    fun isAbstract() = (access and ACC_ABSTRACT) != 0
    fun isStatic() = (access and ACC_STATIC) != 0

    fun init() {
        nameObfuscated = name.isObfuscated()

        if(shared) {
            match = this
        }

        retTypeClass = pool.getCreateClass(Type.getReturnType(desc).internalName)
        Type.getArgumentTypes(desc).forEach { argType ->
            argTypeClasses.add(pool.getCreateClass(argType.internalName))
        }
    }

    override fun toString(): String {
        return "${cls.name}.$name$desc"
    }
}