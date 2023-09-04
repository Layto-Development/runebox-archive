package io.runebox.internal.injector.asm

import io.runebox.internal.injector.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}

var FieldNode.cls: ClassNode by field()