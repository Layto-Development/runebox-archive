package io.runebox.internal.deobfuscator.asm

import io.runebox.internal.deobfuscator.util.field
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
    origOwner
    origName
    origDesc
    opaqueDesc
    opaqueValue
}

fun MethodNode.reset() {
    hierarchy.clear()
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool get() = cls.pool

var MethodNode.origOwner: String by field { it.cls.name }
var MethodNode.origName: String by field { it.name }
var MethodNode.origDesc: String by field { it.desc }
var MethodNode.opaqueDesc: String by field { "" }
var MethodNode.opaqueValue: String by field { "" }

var MethodNode.hierarchy: HashSet<MethodNode> by field { hashSetOf() }

val MethodNode.id get() = "${cls.id}.$name$desc"
val MethodNode.parents get() = cls.superClasses.mapNotNull { it.getMethod(name, desc) }
val MethodNode.children get() = cls.subClasses.mapNotNull { it.getMethod(name, desc) }

fun MethodNode.isPrivate() = (access and ACC_PRIVATE) != 0
fun MethodNode.isStatic() = (access and ACC_STATIC) != 0
fun MethodNode.isAbstract() = (access and ACC_ABSTRACT) != 0

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"