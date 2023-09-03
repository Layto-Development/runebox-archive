package io.runebox.internal.deobfuscator.asm

import io.runebox.internal.deobfuscator.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

fun MethodNode.reset() {
    hierarchy.clear()
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool get() = cls.pool

var MethodNode.hierarchy: HashSet<MethodNode> by field { hashSetOf() }

val MethodNode.id get() = "${cls.id}.$name$desc"