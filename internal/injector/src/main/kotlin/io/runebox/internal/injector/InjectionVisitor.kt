package io.runebox.internal.injector

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

interface InjectionVisitor {

    fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode)

    fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode)

    fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode)

    fun visitCopy(clientCls: ClassNode, copyMethod: MethodNode, origName: String, desc: String)

    fun visitMethodReplace(mixinCls: ClassNode, clientCls: ClassNode, mixinMethod: MethodNode, clientMethod: MethodNode)

    fun visitFieldReplace(mixinCls: ClassNode, clientCls: ClassNode, mixinField: FieldNode, clientField: FieldNode)

}