package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.isConstructor
import io.runebox.internal.deobfuscator.bytecode.asm.isInitializer
import io.runebox.internal.deobfuscator.bytecode.asm.isStatic
import org.objectweb.asm.Type
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger
import java.lang.reflect.Modifier

class MethodSorter : BytecodeTransformer {

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

        Logger.info("Sorted $count methods.")
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