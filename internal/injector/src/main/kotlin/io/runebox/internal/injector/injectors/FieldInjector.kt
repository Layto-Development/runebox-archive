package io.runebox.internal.injector.injectors

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

class FieldInjector : AbstractInjector() {

    override fun visitFieldInject(mixinField: FieldNode, clientCls: ClassNode) {
        val copy = FieldNode(mixinField.access, mixinField.name, mixinField.desc, mixinField.signature, mixinField.value)
        clientCls.fields.add(copy)
    }

}