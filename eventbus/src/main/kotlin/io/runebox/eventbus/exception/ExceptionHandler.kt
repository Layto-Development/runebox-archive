package io.runebox.eventbus.exception

fun interface ExceptionHandler {
    fun handle(exception: Exception)
}