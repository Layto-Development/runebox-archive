package io.runebox.internal.deobfuscator.ast

interface AstTransformer {

    fun run(module: Module)
}