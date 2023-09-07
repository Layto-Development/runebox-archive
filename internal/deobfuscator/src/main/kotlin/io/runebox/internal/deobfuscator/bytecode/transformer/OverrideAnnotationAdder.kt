package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.classpath.MemberDesc
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.tinylog.kotlin.Logger

class OverrideAnnotationAdder : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        val classPath = pool.classPath
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if (method.name == "<init>" || method.name == "<clinit>" || method.access and ACC_STATIC != 0) {
                    return@methodLoop
                }

                if (!classPath[cls.name]!!.isOverride(MemberDesc(method))) {
                    return@methodLoop
                }

                if (method.invisibleAnnotations != null && method.invisibleAnnotations.any { it.desc == OVERRIDE_DESC }) {
                    return@methodLoop
                }

                if (method.invisibleAnnotations == null) {
                    method.invisibleAnnotations = mutableListOf()
                }
                method.invisibleAnnotations.add(AnnotationNode(OVERRIDE_DESC))
                count++
            }
        }

        Logger.info("Added $count override annotations.")
    }

    private companion object {
        private val OVERRIDE_DESC = Type.getDescriptor(Override::class.java)
    }
}