package io.runebox.internal.asm.tree

import io.runebox.internal.asm.util.field
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

var MethodNode.cls: ClassNode by field()

val MethodNode.id get() = "$name $desc"

fun MethodNode.isPublic() = (access and ACC_PUBLIC)
fun MethodNode.isPrivate() = (access and ACC_PRIVATE)
fun MethodNode.isStatic() = (access and ACC_STATIC)
fun MethodNode.isAbstract() = (access and ACC_ABSTRACT)

