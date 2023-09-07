package io.runebox.internal.deobfuscator.bytecode

import io.runebox.internal.deobfuscator.bytecode.asm.ClassPool

interface BytecodeTransformer {
    fun run(pool: ClassPool)
}