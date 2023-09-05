package io.runebox.internal.injector.transformers

import com.google.common.collect.Iterables
import io.runebox.internal.injector.asm.init
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes.ASM9
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class MethodReplaceTransformer : AbstractTransformer() {

    override fun visitMethodReplace(
        mixinCls: ClassNode,
        clientCls: ClassNode,
        mixinMethod: MethodNode,
        clientMethod: MethodNode
    ) {
        val copy = MethodNode(clientMethod.access, clientMethod.name, clientMethod.desc, clientMethod.signature, Iterables.toArray(mixinMethod.exceptions, String::class.java))
        mixinMethod.accept(ReplaceMethodVisitor(mixinCls, clientCls, copy))

        clientCls.methods.remove(clientMethod)
        copy.init(clientCls)
        clientCls.methods.add(copy)
    }

    private class ReplaceMethodVisitor(private val mixinCls: ClassNode, private val clientCls: ClassNode, parent: MethodVisitor) : MethodVisitor(ASM9, parent) {

        override fun visitMethodInsn(
            opcode: Int,
            owner: String,
            name: String,
            descriptor: String,
            isInterface: Boolean
        ) {
            if(owner == mixinCls.name) {
                super.visitMethodInsn(opcode, clientCls.name, name, descriptor, isInterface)
            } else {
                super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
            }
        }

        override fun visitFieldInsn(opcode: Int, owner: String, name: String, descriptor: String) {
            if(owner == mixinCls.name) {
                super.visitFieldInsn(opcode, clientCls.name, name, descriptor)
            } else {
                super.visitFieldInsn(opcode, owner, name, descriptor)
            }
        }
    }
}