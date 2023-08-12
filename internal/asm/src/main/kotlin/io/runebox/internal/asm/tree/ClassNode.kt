package io.runebox.internal.asm.tree

import io.runebox.internal.asm.util.field
import io.runebox.internal.asm.util.identitySetField
import io.runebox.internal.asm.util.nullField
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import java.util.ArrayDeque

fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.shared: Boolean by field { false }
var ClassNode.ignored: Boolean by field { false }

var ClassNode.superClass: ClassNode? by nullField()
val ClassNode.childClasses: MutableSet<ClassNode> by identitySetField()
val ClassNode.interfaceClasses: MutableSet<ClassNode> by identitySetField()
val ClassNode.implementerClasses: MutableSet<ClassNode> by identitySetField()

val ClassNode.methodTypeRefs: MutableSet<MethodNode> by identitySetField()
val ClassNode.fieldTypeRefs: MutableSet<FieldNode> by identitySetField()

val ClassNode.ancestors get() = listOfNotNull(superClass) + interfaceClasses
val ClassNode.id get() = name

fun ClassNode.isPublic() = (access and ACC_PUBLIC) != 0
fun ClassNode.isPrivate() = (access and ACC_PRIVATE) != 0
fun ClassNode.isAbstract() = (access and ACC_ABSTRACT) != 0
fun ClassNode.isInterface() = (access and ACC_INTERFACE) != 0

fun ClassNode.getMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.getField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

fun ClassNode.resolveMethod(name: String, desc: String): MethodNode? {
    var ret = getMethod(name, desc)
    if(ret != null) return ret

    val queue = ArrayDeque<ClassNode>()
    val visited = hashSetOf<ClassNode>()

    queue.addAll(ancestors)
    while(queue.isNotEmpty()) {
        val cls = queue.poll()
        if(!visited.add(cls)) continue

        ret = cls.resolveMethod(name, desc)
        if(ret != null) return ret

        queue.addAll(cls.ancestors)
    }

    return null
}

fun ClassNode.resolveField(name: String, desc: String): FieldNode? {
    var ret = getField(name, desc)
    if(ret != null) return ret

    val queue = ArrayDeque<ClassNode>()
    val visited = hashSetOf<ClassNode>()

    queue.addAll(ancestors)
    while(queue.isNotEmpty()) {
        val cls = queue.poll()
        if(!visited.add(cls)) continue

        ret = cls.getField(name, desc)
        if(ret != null) return ret

        queue.addAll(cls.ancestors)
    }

    return null
}

fun ClassNode.toByteArray(flags: Int = ClassWriter.COMPUTE_FRAMES): ByteArray {
    val writer = ClassWriter(flags)
    this.accept(writer)
    return writer.toByteArray()
}

fun ClassNode.fromByteArray(bytes: ByteArray, flags: Int = ClassReader.EXPAND_FRAMES): ClassNode {
    val reader = ClassReader(bytes)
    reader.accept(this, flags)
    return this
}