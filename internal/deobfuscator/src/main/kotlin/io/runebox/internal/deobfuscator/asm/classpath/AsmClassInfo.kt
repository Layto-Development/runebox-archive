package io.runebox.internal.deobfuscator.asm.classpath

import org.objectweb.asm.Opcodes.ACC_INTERFACE
import org.objectweb.asm.tree.ClassNode

class AsmClassInfo(
    private val classPath: ClassPath,
    private val cls: ClassNode,
    override val isDependency: Boolean
) : ClassInfo() {

    override val name get() = cls.name
    override val superClass get() = cls.superName?.let { classPath[it] ?: error("Failed to find $it on provided classpath.") }
    override val interfaces get() = cls.interfaces.map { classPath[it] ?: error("Failed to find $it on provided classpath." ) }
    override val methods get() = cls.methods.map { MemberDesc(it.name, it.desc) }
    override val fields get() = cls.fields.map { MemberDesc(it.name, it.desc) }
    override val isInterface get() = cls.access and ACC_INTERFACE != 0

    override fun methodModifiers(method: MemberDesc) = cls.methods.find { it.name == method.name && it.desc == method.desc }?.access
    override fun fieldModifiers(field: MemberDesc) = cls.fields.find { it.name == field.name && it.desc == field.desc }?.access
}