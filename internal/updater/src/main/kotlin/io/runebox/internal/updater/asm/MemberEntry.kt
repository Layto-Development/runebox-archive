package io.runebox.internal.updater.asm

import io.runebox.internal.updater.util.identitySetOf

abstract class MemberEntry<T : MemberEntry<T>> : Matchable<T>() {

    abstract val cls: ClassEntry

    val pool get() = cls.pool
    val env get() = pool.env
    val shared get() = cls.shared

    val parents = identitySetOf<T>()
    val children = identitySetOf<T>()

}