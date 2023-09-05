package io.runebox.eventbus

import io.runebox.eventbus.exception.ExceptionHandler
import io.runebox.eventbus.invokers.InvokerType
import io.runebox.eventbus.invokers.LambdaInvoker
import io.runebox.eventbus.invokers.ReflectionInvoker

@DslMarker
private annotation class EventBusBuilderDsl

@DslMarker
private annotation class EventBusBuilderInnerDsl

@EventBusBuilderDsl
fun EventBus(lambda: EventBusBuilder.() -> Unit): EventBus {
    return EventBusBuilder().apply(lambda).build()
}

class EventBusBuilder {
    /**
     * Default: reflection invoker
     */
    var invokerType: InvokerType = LambdaInvoker()

    /**
     * Default: throws exception again
     */
    var exceptionHandler: ExceptionHandler = ExceptionHandler { exception -> throw exception }

    var threadSafe = false

    @EventBusBuilderInnerDsl
    fun invoker(lambda: () -> InvokerType) {
        this.invokerType = lambda()
    }

    @EventBusBuilderInnerDsl
    fun threadSafe(lambda: () -> Boolean) {
        this.threadSafe = lambda()
    }

    @EventBusBuilderInnerDsl
    inline fun exceptionHandler(crossinline lambda: (Exception) -> Unit) {
        this.exceptionHandler = ExceptionHandler { exception -> lambda(exception) }
    }

    fun build() = EventBus(this.invokerType, this.exceptionHandler, this.threadSafe)

}