package io.runebox.internal.deobfuscator.bytecode.asm.classpath

import org.objectweb.asm.Type

private val Class<*>.asmName: String get() = name.replace(".", "/")

class ReflectionClassInfo(private val classPath: ClassPath, private val cls: Class<*>) : ClassInfo() {

    override val name get() = cls.asmName
    override val superClass get() = cls.superclass?.let { classPath[cls.superclass.asmName]!! }
    override val interfaces get() = cls.interfaces.map { classPath[it.asmName]!! }
    override val methods get() = cls.declaredMethods.map { MemberDesc(it.name, Type.getMethodDescriptor(it)) }
    override val fields get() = cls.declaredFields.map { MemberDesc(it.name, Type.getDescriptor(it.type)) }
    override val isDependency get() = true
    override val isInterface get() = cls.isInterface

    override fun methodModifiers(method: MemberDesc) = cls.declaredMethods.find { it.name == method.name && Type.getMethodDescriptor(it) == method.desc }?.modifiers
    override fun fieldModifiers(field: MemberDesc) = cls.declaredFields.find { it.name == field.name && Type.getDescriptor(it.type) == field.desc }?.modifiers
}