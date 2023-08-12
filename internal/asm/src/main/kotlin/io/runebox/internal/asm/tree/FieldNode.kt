package io.runebox.internal.asm.tree

import io.runebox.internal.asm.util.field
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}

var FieldNode.cls: ClassNode by field()

val FieldNode.id get() = "$name $desc"

fun FieldNode.isPublic() = (access and ACC_PUBLIC)
fun FieldNode.isPrivate() = (access and ACC_PRIVATE)
fun FieldNode.isStatic() = (access and ACC_STATIC)