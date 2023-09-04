package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.isConstructor
import io.runebox.internal.deobfuscator.asm.isInitializer
import io.runebox.internal.deobfuscator.asm.isStatic
import org.objectweb.asm.Type
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

class MethodSorter : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            count += cls.methods.size
            cls.methods = cls.methods.sortedWith(compareBy<MethodNode> { !it.isInitializer() }
                .thenBy { !it.isConstructor() }
                .thenBy { it.isStatic() }
                .thenBy { it.lineNumber }
                .thenBy { Modifier.toString(it.access and Modifier.methodModifiers()) }
                .thenBy { Type.getMethodType(it.desc).returnType.className }
                .thenBy { it.name }
            )
        }
    }

    private val MethodNode.lineNumber: Int? get() {
        for(insn in instructions) {
            if(insn is LineNumberNode) {
                return insn.line
            }
        }
        return null
    }
}