package io.runebox.internal.deobfuscator.bytecode.asm

import io.runebox.internal.deobfuscator.bytecode.util.field
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ACC_FINAL
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
    origOwner
    origName
    origDesc
    intMultiplier
    longMultiplier
}

fun FieldNode.reset() {
    hierarchy.clear()
}

var FieldNode.cls: ClassNode by field()
val FieldNode.pool get() = cls.pool

var FieldNode.origOwner: String by field { it.cls.name }
var FieldNode.origName: String by field { it.name }
var FieldNode.origDesc: String by field { it.desc }
var FieldNode.intMultiplier: Int by field { 0 }
var FieldNode.longMultiplier: Long by field { 0L }

var FieldNode.hierarchy: HashSet<FieldNode> by field { hashSetOf() }

val FieldNode.id get() = "${cls.id}.$name"

fun FieldNode.isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
fun FieldNode.isStatic() = (access and Opcodes.ACC_STATIC) != 0
fun FieldNode.isFinal() = (access and ACC_FINAL) != 0