package io.runebox.internal.injector.transformers

import io.runebox.internal.injector.asm.cls
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode

class FieldReplaceTransformer : AbstractTransformer() {

    override fun visitFieldReplace(
        mixinCls: ClassNode,
        clientCls: ClassNode,
        mixinField: FieldNode,
        clientField: FieldNode
    ) {
        clientCls.methods.forEach { clientMethod ->
            clientMethod.instructions.filterIsInstance<FieldInsnNode>().forEach { insn ->
                if(insn.owner == mixinField.cls.name && insn.name == mixinField.name && insn.desc == mixinField.desc) {
                    insn.owner = clientField.cls.name
                    insn.name = clientField.name
                    insn.desc = clientField.desc
                }
            }
        }
    }
}