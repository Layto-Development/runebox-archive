package io.runebox.eventbus.invokers

import io.runebox.eventbus.invokers.InvokerType.SubscriberMethod
import java.lang.reflect.Method

class ReflectionInvoker : InvokerType {

    override fun setup(obj: Any, clazz: Class<*>, parameterClazz: Class<*>, method: Method): SubscriberMethod {
        method.isAccessible = true
        return SubscriberMethod { paramObject: Any? -> method.invoke(obj, paramObject) }
    }

}