package io.runebox.internal.injector.injectors

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class MethodInjector : AbstractInjector() {

    override fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode) {
        val copy = MethodNode(mixinMethod.access, mixinMethod.name, mixinMethod.desc, mixinMethod.signature, mixinMethod.exceptions.toTypedArray().copyOf())
        mixinMethod.accept(copy)
        clientCls.methods.add(copy)
    }

}