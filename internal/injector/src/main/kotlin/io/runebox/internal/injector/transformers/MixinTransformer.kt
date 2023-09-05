package io.runebox.internal.injector.transformers

import io.runebox.internal.injector.util.AsmUtil.API_BASE
import org.objectweb.asm.tree.ClassNode

class MixinTransformer : AbstractTransformer() {

    override fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode) {
        injectApiInterfaces(mixinCls, clientCls)
    }

    private fun injectApiInterfaces(mixinCls: ClassNode, clientCls: ClassNode) {
        clientCls.interfaces.addAll(mixinCls.interfaces.filter { it.startsWith(API_BASE) })
    }
}