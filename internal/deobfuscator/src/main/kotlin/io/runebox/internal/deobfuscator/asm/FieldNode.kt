package io.runebox.internal.deobfuscator.asm

import io.runebox.internal.deobfuscator.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

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