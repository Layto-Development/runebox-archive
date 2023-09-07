package io.runebox.internal.deobfuscator.bytecode.asm

import io.runebox.internal.deobfuscator.bytecode.util.field
import io.runebox.internal.deobfuscator.bytecode.util.nullField
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
    origName
}

fun ClassNode.reset() {
    superClass = null
    interfaceClasses.clear()
    childClasses.clear()
    methods.forEach { it.reset() }
    fields.forEach { it.reset() }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.ignored: Boolean by field { false }

var ClassNode.origName: String by field { it.name }

var ClassNode.superClass: ClassNode? by nullField()
val ClassNode.interfaceClasses: HashSet<ClassNode> by field { hashSetOf() }
val ClassNode.childClasses: HashSet<ClassNode> by field { hashSetOf() }

val ClassNode.id get() = name
val ClassNode.parentClasses get() = listOfNotNull(superClass).plus(interfaceClasses)

val ClassNode.superClasses: Set<ClassNode> get() = parentClasses.flatMap { it.superClasses.plus(it) }.toSet()
val ClassNode.subClasses: Set<ClassNode> get() = childClasses.flatMap { it.subClasses.plus(it) }.toSet()
val ClassNode.ancestorClasses get() = superClasses.plus(subClasses).plus(this)

fun ClassNode.getMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.getField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }

fun ClassNode.fromBytes(bytes: ByteArray, flags: Int = ClassReader.SKIP_FRAMES): ClassNode {
    val reader = ClassReader(bytes)
    reader.accept(this, flags)
    return this
}

fun ClassNode.toBytes(flags: Int = ClassWriter.COMPUTE_MAXS): ByteArray {
    val writer = ClassWriter(flags)
    this.accept(writer)
    return writer.toByteArray()
}