package io.runebox.internal.injector.asm

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

class PoolClassWriter(private val pool: ClassPool, flags: Int = COMPUTE_FRAMES or COMPUTE_MAXS) : ClassWriter(flags) {

    override fun getCommonSuperClass(type1: String, type2: String): String {
        var c = pool.getClass(type1)!!
        val d = pool.getClass(type2) ?: return "java/lang/Object"
        return when {
            c.isAssignableFrom(d) -> type1
            d.isAssignableFrom(c) -> type2
            c.isInterface() || d.isInterface() -> "java/lang/Object"
            else -> {
                do {
                    c = c.superClass!!
                } while(!c.isAssignableFrom(d))
                c.name
            }
        }
    }
}