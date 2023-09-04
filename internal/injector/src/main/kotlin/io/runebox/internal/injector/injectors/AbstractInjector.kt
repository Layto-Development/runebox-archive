package io.runebox.internal.injector.injectors

import io.runebox.internal.injector.InjectionVisitor
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

abstract class AbstractInjector : InjectionVisitor {

    override fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode) {}

    override fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode) {}

    override fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode) {}

}