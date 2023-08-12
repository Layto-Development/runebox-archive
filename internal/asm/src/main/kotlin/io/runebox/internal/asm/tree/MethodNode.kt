package io.runebox.internal.asm.tree

import io.runebox.internal.asm.util.field
import io.runebox.internal.asm.util.identitySetField
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool get() = cls.pool

val MethodNode.refsIn: MutableSet<MethodNode> by identitySetField()
val MethodNode.refsOut: MutableSet<MethodNode> by identitySetField()
val MethodNode.fieldReadRefs: MutableSet<FieldNode> by identitySetField()
val MethodNode.fieldWriteRefs: MutableSet<FieldNode> by identitySetField()
val MethodNode.classRefs: MutableSet<ClassNode> by identitySetField()

var MethodNode.hierarchy: MutableSet<MethodNode> by identitySetField()
val MethodNode.parents: MutableSet<MethodNode> by identitySetField()
val MethodNode.children: MutableSet<MethodNode> by identitySetField()

val MethodNode.id get() = "$name$desc"

fun MethodNode.isPublic() = (access and ACC_PUBLIC)
fun MethodNode.isPrivate() = (access and ACC_PRIVATE)
fun MethodNode.isStatic() = (access and ACC_STATIC)
fun MethodNode.isAbstract() = (access and ACC_ABSTRACT)

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"
