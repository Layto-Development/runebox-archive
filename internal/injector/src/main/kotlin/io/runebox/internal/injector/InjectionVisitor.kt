package io.runebox.internal.injector

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

interface InjectionVisitor {

    fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode)

    fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode)

    fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode)

}