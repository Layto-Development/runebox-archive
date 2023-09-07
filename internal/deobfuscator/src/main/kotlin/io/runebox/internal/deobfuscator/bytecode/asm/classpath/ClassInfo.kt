package io.runebox.internal.deobfuscator.bytecode.asm.classpath

abstract class ClassInfo {

    abstract val name: String
    abstract val superClass: ClassInfo?
    abstract val interfaces: List<ClassInfo>
    abstract val methods: List<MemberDesc>
    abstract val fields: List<MemberDesc>
    abstract val isDependency: Boolean
    abstract val isInterface: Boolean

    val ancestorClasses: List<ClassInfo> get() = listOfNotNull(superClass).plus(interfaces)

    abstract fun methodModifiers(method: MemberDesc): Int?
    abstract fun fieldModifiers(field: MemberDesc): Int?

    fun isOverride(method: MemberDesc): Boolean {
        val superClass = this.superClass
        if (superClass != null) {
            if (method in superClass.methods) {
                return true
            }

            if (superClass.isOverride(method)) {
                return true
            }
        }

        for (superInterface in interfaces) {
            if (method in superInterface.methods) {
                return true
            }

            if (superInterface.isOverride(method)) {
                return true
            }
        }

        return false
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is ClassInfo) return false
        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}