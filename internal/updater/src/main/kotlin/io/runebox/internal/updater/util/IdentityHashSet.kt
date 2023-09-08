package io.runebox.internal.updater.util

import java.util.*

fun <T> identityHashSetOf(entries: Set<T> = emptySet()): MutableSet<T> {
    return Collections.newSetFromMap<T>(IdentityHashMap()).also { it.addAll(entries) }
}