package io.runebox.internal.injector

import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
annotation class Handles(
    val value: KClass<*>
)
