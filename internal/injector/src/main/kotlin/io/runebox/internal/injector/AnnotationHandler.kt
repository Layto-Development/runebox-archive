package io.runebox.internal.injector

import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

interface AnnotationHandler {

    fun handleClassAnnotation(cls: ClassNode, values: List<Any>) {}

    fun handleMethodAnnotation(method: MethodNode, values: List<Any>) {}

    fun handleFieldAnnotation(field: FieldNode, values: List<Any>) {}

}