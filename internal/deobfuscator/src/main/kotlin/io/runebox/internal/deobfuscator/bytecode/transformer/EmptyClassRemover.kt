package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.isConstructor
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.tinylog.kotlin.Logger

class EmptyClassRemover : BytecodeTransformer {

    private var count = 0
    private val emptyClasses = mutableSetOf<String>()
    private val referencedClasses = mutableSetOf<String>()

    override fun run(pool: ClassPool) {
        var changed: Boolean
        do {
            changed = prePass(pool)
            for(cls in pool.classes) {
                changed = changed or transformClass(cls)
                cls.methods.forEach { method ->
                    changed = changed or preTransformMethod(method)
                    changed = changed or transformMethod(method)
                }
                cls.fields.forEach { field ->
                    changed = changed or transformField(field)
                }
            }
            changed = changed or postPass(pool)
        } while(changed)

        Logger.info("Removed $count empty classes.")
    }

    private fun prePass(pool: ClassPool): Boolean {
        referencedClasses.clear()
        return false
    }

    private fun transformClass(cls: ClassNode): Boolean {
        if((cls.methods.isEmpty() || (cls.methods.size == 1 && cls.methods.first().isConstructor())) && cls.fields.isEmpty()) {
            emptyClasses.add(cls.name)
        }

        if(cls.superName != null) {
            referencedClasses.add(cls.superName)
        }

        cls.interfaces.forEach { itf ->
            referencedClasses.add(itf)
        }

        if(cls.visibleAnnotations != null) {
            cls.visibleAnnotations.forEach {
                referencedClasses.add(Type.getType(it.desc).internalName)
            }
        }

        if(cls.invisibleAnnotations != null) {
            cls.invisibleAnnotations.forEach {
                referencedClasses.add(Type.getType(it.desc).internalName)
            }
        }

        return false
    }

    private fun preTransformMethod(method: MethodNode): Boolean {
        addTypeReference(Type.getType(method.desc))
        return false
    }

    private fun transformMethod(method: MethodNode): Boolean {
        for(insn in method.instructions) {
            when(insn) {
                is LdcInsnNode -> {
                    val cst = insn.cst
                    if(cst is Type) {
                        addTypeReference(cst)
                    }
                }
                is TypeInsnNode -> referencedClasses.add(insn.desc)
            }
        }

        return false
    }

    private fun transformField(field: FieldNode): Boolean {
        addTypeReference(Type.getType(field.desc))
        return false
    }

    private fun postPass(pool: ClassPool): Boolean {
        var changed = false
        for(name in emptyClasses.subtract(referencedClasses)) {
            val cls = pool.getClass(name) ?: continue
            pool.removeClass(cls)
            count++
            changed = true
        }
        return changed
    }

    private fun addTypeReference(type: Type) {
        when(type.sort) {
            Type.OBJECT -> referencedClasses.add(type.internalName)
            Type.ARRAY -> addTypeReference(type.elementType)
            Type.METHOD -> {
                type.argumentTypes.forEach(::addTypeReference)
                addTypeReference(type.returnType)
            }
        }
    }
}