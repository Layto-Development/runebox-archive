package io.runebox.internal.updater.asm

abstract class Matchable<T> {

    var isMatchable: Boolean = true
    var nameObfuscated: Boolean = false

    var match: T? = null

    fun hasMatch() = match != null

    fun match(other: T) { match = other }

    fun unmatch() { match = null }

}