package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.*
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class ObfInfoAnnotationAdder : Transformer {

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.visibleAnnotations = listOf(cls.createAnnotation())

            cls.methods.forEach methodLoop@ { method ->
                if(method.isInitializer()) return@methodLoop
                method.visibleAnnotations = listOf(method.createAnnotation())
            }

            cls.fields.forEach { field ->
                field.visibleAnnotations = listOf(field.createAnnotation())
            }
        }

        Logger.info("Added ObfInfo annotations.")
    }

    private fun ClassNode.createAnnotation(): AnnotationNode {
        val node = AnnotationNode("Lio/runebox/internal/deobfuscator/includes/ObfInfo;")
        val values = mutableListOf<Any>()
        if(origName != "") {
            values.add("name", origName)
        }
        node.values = values
        return node
    }

    private fun MethodNode.createAnnotation(): AnnotationNode {
        val node = AnnotationNode("Lio/runebox/internal/deobfuscator/includes/ObfInfo;")
        val values = mutableListOf<Any>()
        if(origName != "") values.add("name", origName)
        if(origDesc != "") values.add("desc", origDesc)
        if(opaqueValue != "") values.add("opaqueValue", opaqueValue)
        node.values = values
        return node
    }

    private fun FieldNode.createAnnotation(): AnnotationNode {
        val node = AnnotationNode("Lio/runebox/internal/deobfuscator/includes/ObfInfo;")
        val values = mutableListOf<Any>()
        if(origName != "") values.add("name", origName)
        if(origDesc != "") values.add("desc", origDesc)
        if(intMultiplier != 0) values.add("intMultiplier", intMultiplier)
        if(longMultiplier != 0L) values.add("longMultiplier", longMultiplier)
        node.values = values
        return node
    }

    private fun MutableList<Any>.add(vararg values: Any) {
        values.forEach { this.add(it) }
    }
}