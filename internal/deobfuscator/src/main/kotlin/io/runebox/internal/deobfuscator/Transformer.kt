package io.runebox.internal.deobfuscator

import io.runebox.internal.asm.tree.ClassPool

interface Transformer {

    fun run(pool: ClassPool)

}