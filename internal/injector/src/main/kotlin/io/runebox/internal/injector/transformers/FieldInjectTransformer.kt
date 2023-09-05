package io.runebox.internal.injector.transformers

import io.runebox.internal.injector.asm.init
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

class FieldInjectTransformer : AbstractTransformer() {

    override fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode) {
        val copy = FieldNode(mixinField.access, mixinField.name, mixinField.desc, mixinField.signature, mixinField.value)
        copy.init(clientCls)
        clientCls.fields.add(copy)
    }

}