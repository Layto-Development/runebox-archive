package io.runebox.internal.updater.asm

import io.runebox.internal.updater.util.isObfuscated
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.MethodNode

class MethodEntry(val cls: ClassEntry, val node: MethodNode) : Matchable<MethodEntry>() {

    val pool get() = cls.pool
    val env get() = pool.env
    val shared get() = cls.shared

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

    val refsIn = mutableListOf<MethodEntry>()
    val refsOut = mutableListOf<MethodEntry>()
    val fieldReadRefs = mutableListOf<FieldEntry>()
    val fieldWriteRefs = mutableListOf<FieldEntry>()
    val classRefs = mutableListOf<ClassEntry>()

    fun isPrivate() = (access and ACC_PRIVATE) != 0
    fun isPublic() = (access and ACC_PUBLIC) != 0
    fun isAbstract() = (access and ACC_ABSTRACT) != 0
    fun isStatic() = (access and ACC_STATIC) != 0

    fun init() {
        nameObfuscated = name.isObfuscated()
        if(shared) {
            match = this
        }
    }

    override fun toString(): String {
        return "${cls.name}.$name$desc"
    }
}