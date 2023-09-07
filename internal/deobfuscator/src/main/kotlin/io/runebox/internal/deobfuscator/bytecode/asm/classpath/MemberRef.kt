package io.runebox.internal.deobfuscator.bytecode.asm.classpath

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

data class MemberRef(val owner: String, val name: String, val desc: String) : Comparable<MemberRef> {

    constructor(cls: ClassNode, method: MethodNode) : this(cls.name, method.name, method.desc)
    constructor(cls: ClassNode, field: FieldNode) : this(cls.name, field.name, field.desc)
    constructor(insn: MethodInsnNode) : this(insn.owner, insn.name, insn.desc)
    constructor(insn: FieldInsnNode) : this(insn.owner, insn.name, insn.desc)
    constructor(owner: String, memberDesc: MemberDesc) : this(owner, memberDesc.name, memberDesc.desc)

    override fun compareTo(other: MemberRef): Int {
        var result = owner.compareTo(other.owner)
        if(result != 0) {
            return result
        }
        result = name.compareTo(other.name)
        if(result != 0) {
            return result
        }
        return desc.compareTo(other.desc)
    }

    override fun toString(): String {
        return "$owner.$name $desc"
    }

    companion object {
        private val STRING_REGEX = Regex("([^.]+)[.]([^ ]+) (.+)")

        fun fromString(str: String): MemberRef {
            val result = STRING_REGEX.matchEntire(str)
            require(result != null)
            return MemberRef(result.groupValues[1], result.groupValues[2], result.groupValues[3])
        }
    }
}