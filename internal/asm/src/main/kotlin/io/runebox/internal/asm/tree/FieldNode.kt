package io.runebox.internal.asm.tree

import io.runebox.internal.asm.util.field
import io.runebox.internal.asm.util.identitySetField
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}

var FieldNode.cls: ClassNode by field()
val FieldNode.pool get() = cls.pool

val FieldNode.readRefs: MutableSet<MethodNode> by identitySetField()
val FieldNode.writeRefs: MutableSet<MethodNode> by identitySetField()
val FieldNode.classRefs: MutableSet<ClassNode> by identitySetField()

val FieldNode.initializer: MutableList<AbstractInsnNode> by field { mutableListOf() }

var FieldNode.hierarchy: MutableSet<FieldNode> by identitySetField()
val FieldNode.parents: MutableSet<FieldNode> by identitySetField()
val FieldNode.children: MutableSet<FieldNode> by identitySetField()

val FieldNode.id get() = "$name$desc"

fun FieldNode.isPublic() = (access and ACC_PUBLIC)
fun FieldNode.isPrivate() = (access and ACC_PRIVATE)
fun FieldNode.isStatic() = (access and ACC_STATIC)