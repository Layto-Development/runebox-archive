package io.runebox.internal.deobfuscator

import io.runebox.internal.deobfuscator.asm.ClassPool

interface Transformer {
    fun run(pool: ClassPool)
}