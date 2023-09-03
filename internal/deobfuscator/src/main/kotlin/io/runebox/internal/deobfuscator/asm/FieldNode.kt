package io.runebox.internal.deobfuscator.asm

import io.runebox.internal.deobfuscator.util.field
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.ACC_FINAL
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}

fun FieldNode.reset() {
    hierarchy.clear()
}

var FieldNode.cls: ClassNode by field()
val FieldNode.pool get() = cls.pool

var FieldNode.hierarchy: HashSet<FieldNode> by field { hashSetOf() }

val FieldNode.id get() = "${cls.id}.$name"

fun FieldNode.isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
fun FieldNode.isStatic() = (access and Opcodes.ACC_STATIC) != 0
fun FieldNode.isFinal() = (access and ACC_FINAL) != 0