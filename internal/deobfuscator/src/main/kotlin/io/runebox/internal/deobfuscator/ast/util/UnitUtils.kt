package io.runebox.internal.deobfuscator.ast.util

import com.github.javaparser.ast.Node

inline fun <reified T : Node> Node.walk(crossinline consumer: (T) -> Unit) {
    this.walk(Node.TreeTraversal.POSTORDER) {
        if (it is T) {
            consumer(it)
        }
    }
}