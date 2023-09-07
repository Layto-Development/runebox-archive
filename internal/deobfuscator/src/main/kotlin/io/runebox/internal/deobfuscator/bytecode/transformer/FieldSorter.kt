package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool
import io.runebox.internal.deobfuscator.bytecode.asm.isStatic
import org.objectweb.asm.Type
import org.objectweb.asm.tree.FieldNode
import org.tinylog.kotlin.Logger
import java.lang.reflect.Modifier

class FieldSorter : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            count += cls.fields.size
            cls.fields = cls.fields.sortedWith(compareBy<FieldNode> { !it.isStatic() }
                .thenBy { Modifier.toString(it.access and Modifier.fieldModifiers()) }
                .thenBy { Type.getType(it.desc).className }
                .thenBy { it.name }
            )
        }

        Logger.info("Sorted $count fields.")
    }
}