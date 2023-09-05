package io.runebox.internal.injector.transformers

import io.runebox.internal.injector.InjectionVisitor
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

abstract class AbstractTransformer : InjectionVisitor {

    override fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode) {}

    override fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode) {}

    override fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode) {}

    override fun visitCopy(clientCls: ClassNode, copyMethod: MethodNode, origName: String, desc: String) {}

    override fun visitMethodReplace(
        mixinCls: ClassNode,
        clientCls: ClassNode,
        mixinMethod: MethodNode,
        clientMethod: MethodNode
    ) {}

    override fun visitFieldReplace(
        mixinCls: ClassNode,
        clientCls: ClassNode,
        mixinField: FieldNode,
        clientField: FieldNode
    ) {}
}