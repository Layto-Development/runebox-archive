package io.runebox.eventbus.invokers

import java.lang.reflect.Method

interface InvokerType {

    fun setup(obj: Any, clazz: Class<*>, parameterClazz: Class<*>, method: Method): SubscriberMethod

    fun interface SubscriberMethod {
        fun invoke(event: Any?)
    }
}