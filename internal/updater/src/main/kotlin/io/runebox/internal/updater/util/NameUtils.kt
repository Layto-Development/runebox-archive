package io.runebox.internal.updater.util

fun String.isObfuscated(): Boolean {
    return listOf("class", "method", "field").any { this.startsWith(it) }
}