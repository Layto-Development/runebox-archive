package io.runebox.internal.injector.transformers

import com.google.common.collect.Iterables
import io.runebox.internal.injector.asm.init
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class MethodInjectTransformer : AbstractTransformer() {

    override fun visitMethodInject(mixinMethod: MethodNode, clientCls: ClassNode) {
        val copy = MethodNode(mixinMethod.access, mixinMethod.name, mixinMethod.desc, mixinMethod.signature, Iterables.toArray(mixinMethod.exceptions, String::class.java))
        mixinMethod.accept(copy)
        copy.init(clientCls)
        clientCls.methods.add(copy)
    }

}