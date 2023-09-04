package io.runebox.internal.injector.asm

import io.runebox.internal.injector.util.field
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}

var FieldNode.cls: ClassNode by field()
val FieldNode.pool get() = cls.pool

fun FieldNode.isPrivate() = (access and Opcodes.ACC_PRIVATE) != 0
fun FieldNode.isStatic() = (access and Opcodes.ACC_STATIC) != 0