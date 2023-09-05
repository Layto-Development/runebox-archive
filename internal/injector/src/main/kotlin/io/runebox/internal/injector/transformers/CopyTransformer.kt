package io.runebox.internal.injector.transformers

import io.runebox.internal.injector.InjectionException
import io.runebox.internal.injector.asm.init
import io.runebox.internal.injector.asm.isStatic
import io.runebox.internal.injector.asm.pool
import io.runebox.internal.injector.asm.resolveMethod
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class CopyTransformer : AbstractTransformer() {

    override fun visitCopy(clientCls: ClassNode, copyMethod: MethodNode, origName: String, desc: String) {
        val method = if(copyMethod.isStatic()) {
            clientCls.pool.getStaticMethod(clientCls.name, origName, desc)
        } else {
            clientCls.resolveMethod(origName, desc)
        }

        if(method == null) throw InjectionException("No such method found: $origName$desc.")

        val copy = MethodNode(method.access, copyMethod.name, desc, method.signature, method.exceptions.toTypedArray().copyOf())
        method.accept(copy)

        copy.init(clientCls)
        clientCls.methods.add(copy)
    }
}