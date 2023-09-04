package io.runebox.internal.injector

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MixinInjectionVisitor(private val visitors: List<InjectionVisitor>) : InjectionVisitor {

    override fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode) {
        visitors.forEach { it.visitMixin(mixinCls, clientCls) }
    }

    override fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode) {
        visitors.forEach { it.visitMethodInject(mixinMethod, clientCls) }
    }

    override fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode) {
        visitors.forEach { it.visitFieldInject(mixinField, clientCls) }
    }
}