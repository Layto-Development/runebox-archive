package io.runebox.internal.injector.asm

import io.runebox.internal.injector.util.field
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.ACC_INTERFACE
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.util.CheckClassAdapter
import org.tinylog.kotlin.Logger
import java.util.ArrayDeque

fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.ignored: Boolean by field { false }

val ClassNode.superClass get() = pool.getClass(superName)
val ClassNode.interfaceClasses get() = interfaces.mapNotNull { pool.getClass(it) }
val ClassNode.superClasses: Set<ClassNode> get() = listOfNotNull(superClass).plus(interfaceClasses).flatMap { it.superClasses.plus(it) }.toSet()

fun ClassNode.isInterface() = (access and ACC_INTERFACE) != 0

fun ClassNode.getMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.getField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

fun ClassNode.resolveMethod(name: String, desc: String): MethodNode? {
    var ret = getMethod(name, desc)
    if(ret != null) return ret

    val queue = ArrayDeque<ClassNode>()
    val visited = hashSetOf<ClassNode>()
    superClass?.also { queue.add(it) }
    queue.addAll(interfaceClasses)
    while (queue.isNotEmpty()) {
        val cls = queue.poll()
        if(!visited.add(cls)) continue

        ret = cls.getMethod(name, desc)
        if(ret != null) return ret

        cls.superClass?.also { queue.add(it) }
        queue.addAll(cls.interfaceClasses)
    }

    return null
}

fun ClassNode.resolveField(name: String, desc: String): FieldNode? {
    var ret = getField(name, desc)
    if(ret != null) return ret

    val queue = ArrayDeque<ClassNode>()
    val visited = hashSetOf<ClassNode>()

    superClass?.also { queue.add(it) }
    queue.addAll(interfaceClasses)

    while (queue.isNotEmpty()) {
        val cls = queue.poll()
        if(!visited.add(cls)) continue

        ret = cls.getField(name, desc)
        if(ret != null) return ret

        cls.superClass?.also { queue.add(it) }
        queue.addAll(cls.interfaceClasses)
    }

    return null
}

fun ClassNode.fromBytes(bytes: ByteArray, flags: Int = ClassReader.EXPAND_FRAMES): ClassNode {
    val reader = ClassReader(bytes)
    reader.accept(this, flags)
    return this
}

fun ClassNode.toBytes(flags: Int = ClassWriter.COMPUTE_MAXS): ByteArray {
    val writer = ClassWriter(flags)
    val checker = CheckClassAdapter(writer, false)
    this.accept(checker)
    return writer.toByteArray()
}

private fun ByteArray.validateDataFlow(name: String) {
    try {
        val reader = ClassReader(this)
        val writer = ClassWriter(reader, 0)
        val checker = CheckClassAdapter(writer, true)
        reader.accept(checker, 0)
    } catch (e: Exception) {
        Logger.error(e) { "Class $name failed validation." }
    }
}

fun ClassNode.isAssignableFrom(other: ClassNode): Boolean {
    return this == other || this.isSuperClassOf(other) || this.isSuperInterfaceOf(other)
}

private tailrec fun ClassNode.isSuperClassOf(other: ClassNode): Boolean {
    val superClass = other.superClass ?: return false
    if(superClass == this) {
        return true
    }
    return this.isSuperClassOf(superClass)
}

private fun ClassNode.isSuperInterfaceOf(other: ClassNode): Boolean {
    for(superInterface in other.interfaceClasses) {
        if(superInterface == this || this.isSuperInterfaceOf(superInterface)) {
            return true
        }
    }
    return false
}