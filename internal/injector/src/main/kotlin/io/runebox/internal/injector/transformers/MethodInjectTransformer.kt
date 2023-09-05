package io.runebox.internal.injector.transformers

import io.runebox.internal.injector.asm.init
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class MethodInjectTransformer : AbstractTransformer() {

    override fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode) {
        val copy = MethodNode(mixinMethod.access, mixinMethod.name, mixinMethod.desc, mixinMethod.signature, mixinMethod.exceptions.toTypedArray().copyOf())
        mixinMethod.accept(copy)
        copy.init(clientCls)
        clientCls.methods.add(copy)
    }

}