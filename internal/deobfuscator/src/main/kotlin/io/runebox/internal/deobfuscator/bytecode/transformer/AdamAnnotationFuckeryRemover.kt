package io.runebox.internal.deobfuscator.bytecode.transformer

import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool

class AdamAnnotationFuckeryRemover : BytecodeTransformer {

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.visibleAnnotations?.removeIf { it.desc.contains("Named") }
            cls.invisibleAnnotations?.removeIf { it.desc.contains("Named") }
            
            cls.methods.forEach { method ->
                method.visibleAnnotations?.removeIf { it.desc.contains("Named") }
                method.invisibleAnnotations?.removeIf { it.desc.contains("Named") }
                method.tryCatchBlocks.removeIf { it.type == "java/lang/NoSuchFieldError" }
            }

            cls.fields.forEach { field ->
                field.visibleAnnotations?.removeIf { it.desc.contains("Named") }
                field.invisibleAnnotations?.removeIf { it.desc.contains("Named") }
            }
        }
    }
}