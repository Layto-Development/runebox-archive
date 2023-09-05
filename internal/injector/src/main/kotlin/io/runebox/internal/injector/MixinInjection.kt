package io.runebox.internal.injector

import io.runebox.internal.injector.annotations.Copy
import io.runebox.internal.injector.annotations.Inject
import io.runebox.internal.injector.annotations.Replace
import io.runebox.internal.injector.annotations.Shadow
import io.runebox.internal.injector.asm.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MixinInjection(val mixinCls: ClassNode, val clientCls: ClassNode) {

    fun result() = clientCls

    fun accept(visitor: InjectionVisitor) {
        visitor.visitMixin(mixinCls, clientCls)

        /*
         * === COPY INJECTION ===
         */
        mixinCls.methods.forEach { mixinMethod ->
            val copyMethodName = mixinMethod.getCopyName() ?: return@forEach
            visitor.visitCopy(clientCls, mixinMethod, copyMethodName, mixinMethod.desc)
        }

        /*
         * === REPLACE INJECTION ===
         */
        mixinCls.methods.forEach { mixinMethod ->
            val replaceMethodName = mixinMethod.getReplaceName() ?: return@forEach
            val clientMethod = if(mixinMethod.isStatic()) {
                clientCls.pool.getStaticMethod(clientCls.name, replaceMethodName, mixinMethod.desc)
            }  else {
                clientCls.resolveMethod(replaceMethodName, mixinMethod.desc)
            } ?: throw InjectionException("Method not found for replace: $replaceMethodName${mixinMethod.desc}.")
            visitor.visitMethodReplace(mixinCls, clientCls, mixinMethod, clientMethod)
        }

        /*
         * === INJECT INJECTION ===
         */
        mixinCls.methods.forEach { mixinMethod ->
            if(mixinMethod.shouldInject()) {
                visitor.visitMethodInject(mixinMethod, clientCls)
            }
        }

        mixinCls.fields.forEach { mixinField ->
            if(mixinField.shouldInject()) {
                visitor.visitFieldInject(mixinField, clientCls)
            }
        }

        /*
         * === SHADOW INJECTION ===
         */
        val fieldsToReplace = getFieldsToReplace()
        fieldsToReplace.forEach { mixinField ->
            val replaceFieldName = mixinField.readAnnotation<Shadow>() ?: mixinField.readAnnotation<Inject>() ?: return@forEach
            val clientField = if(mixinField.isStatic()) {
               clientCls.pool.getStaticField(clientCls.name, replaceFieldName, mixinField.desc)
            } else {
                clientCls.resolveField(replaceFieldName, mixinField.desc)
            } ?: throw InjectionException("Field not found for shadow: $replaceFieldName:${mixinField.desc}.")
            visitor.visitFieldReplace(mixinCls, clientCls, mixinField, clientField)
        }
    }

    private fun MethodNode.shouldInject() = visibleAnnotations?.any { Type.getType(Inject::class.java) == Type.getType(it.desc) } ?: false
    private fun FieldNode.shouldInject() = visibleAnnotations?.any { Type.getType(Inject::class.java) == Type.getType(it.desc) } ?: false

    private fun MethodNode.getCopyName() = readAnnotation<Copy>()
    private fun MethodNode.getReplaceName() = readAnnotation<Replace>()

    private fun getFieldsToReplace(): List<FieldNode> {
        val fields = mutableListOf<FieldNode>()
        mixinCls.fields.forEach { mixinField ->
            val found = mixinField.visibleAnnotations
                ?.any { Type.getType(it.desc) in listOf(
                    Inject::class.java,
                    Shadow::class.java
                ).map { v -> Type.getType(v) }
            } ?: return@forEach
            if(found) fields.add(mixinField)
        }
        return fields
    }

    private companion object {

        inline fun <reified T> MethodNode.getAnnotation() = visibleAnnotations?.firstOrNull { Type.getType(T::class.java) == Type.getType(it.desc) }

        inline fun <reified T> MethodNode.readAnnotation() = visibleAnnotations?.filter { it.desc == Type.getDescriptor(T::class.java) }
            ?.map { it.values }
            ?.filter { it.size == 2 }
            ?.map { it[1] }
            ?.map { when(it) {
                is Type -> it.descriptor
                else -> it.toString()
            } }?.let {
                if(it.size != 1) return@let null
                it[0].replace(".", "/")
            }

        inline fun <reified T> FieldNode.readAnnotation() = visibleAnnotations?.filter { it.desc == Type.getDescriptor(T::class.java) }
            ?.map { it.values }
            ?.filter { it.size == 2 }
            ?.map { it[1] }
            ?.map { when(it) {
                is Type -> it.descriptor
                else -> it.toString()
            } }?.let {
                if(it.size != 1) return@let null
                it[0].replace(".", "/")
            }

        @Suppress("UNCHECKED_CAST")
        fun <T> AnnotationNode.getValueOrDefault(key: Any, defaultValue: T): T {
            var i = 0
            while(i < values.size) {
                if(values[i] == key) {
                    return values[i + 1] as T
                }
                i += 2
            }
            return defaultValue
        }
    }
}