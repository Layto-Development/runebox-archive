package io.runebox.internal.injector

import io.runebox.internal.injector.annotations.Inject
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MixinNode(mixinCls: ClassNode, clientCls: ClassNode) {

    val mixinCls = ClassNode()
    val clientCls = ClassNode()

    init {
        mixinCls.accept(this.mixinCls)
        clientCls.accept(this.clientCls)
    }

    fun result() = clientCls

    fun accept(visitor: InjectionVisitor) {
        visitor.visitMixin(mixinCls, clientCls)

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
    }

    private fun MethodNode.shouldInject() = visibleAnnotations?.any { Type.getType(Inject::class.java) == Type.getType(it.desc) } ?: false
    private fun FieldNode.shouldInject() = visibleAnnotations?.any { Type.getType(Inject::class.java) == Type.getType(it.desc) } ?: false

    private companion object {

        inline fun <reified T> MethodNode.getAnnotation() = visibleAnnotations?.firstOrNull { Type.getType(T::class.java) == Type.getType(it.desc) }

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