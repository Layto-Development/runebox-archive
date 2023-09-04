package io.runebox.internal.injector.injectors

import io.runebox.internal.injector.Handles
import io.runebox.internal.injector.annotations.Mixin
import io.runebox.internal.injector.util.AsmUtil.API_BASE
import org.objectweb.asm.tree.ClassNode

@Handles(Mixin::class)
class MixinInjector : AbstractInjector() {

    override fun visitMixin(mixinCls: ClassNode, clientCls: ClassNode) {
        injectApiInterfaces(mixinCls, clientCls)
    }

    private fun injectApiInterfaces(mixinCls: ClassNode, clientCls: ClassNode) {
        clientCls.interfaces.addAll(mixinCls.interfaces.filter { it.startsWith(API_BASE) })
    }
}