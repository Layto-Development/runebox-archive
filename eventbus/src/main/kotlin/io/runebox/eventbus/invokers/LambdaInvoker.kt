package io.runebox.eventbus.invokers

import io.runebox.eventbus.invokers.InvokerType.SubscriberMethod
import sun.misc.Unsafe
import java.lang.invoke.LambdaMetafactory
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field
import java.lang.reflect.Method

class LambdaInvoker : InvokerType {

    private lateinit var lookup: MethodLookup

    override fun setup(obj: Any, clazz: Class<*>, parameterClazz: Class<*>, method: Method): SubscriberMethod {
        method.isAccessible = true
        val caller = lazyPrivateLookup(clazz)
        val subscription: MethodType = MethodType.methodType(Void.TYPE, parameterClazz)
        val target = caller.findVirtual(clazz, method.name, subscription)
        val site = LambdaMetafactory.metafactory(
            caller,
            "invoke",
            MethodType.methodType(SubscriberMethod::class.java, clazz),
            subscription.changeParameterType(0, Any::class.java),
            target,
            subscription
        )
        val factory = site.target
        return factory.bindTo(obj).invokeExact() as SubscriberMethod
    }

    private fun lazyPrivateLookup(clazz: Class<*>): MethodHandles.Lookup {
        return if (!this::lookup.isInitialized) { // try java 9 lookup
            try {
                lookup = MethodLookup.JAVA_9 // cache
                lookup.privateLookup(clazz)
            } catch (e: NoSuchMethodException) { // try java 8 lookup
                lookup = MethodLookup.JAVA_8 // cache
                lookup.privateLookup(clazz)
            }
        } else lookup.privateLookup(clazz)
    }


    internal enum class MethodLookup {
        JAVA_8 {
            // Java 8
            override fun privateLookup(clazz: Class<*>?): MethodHandles.Lookup {
                val lookupIn = MethodHandles.lookup().`in`(clazz)

                // and then we mark it as trusted for private lookup via reflection on private field
                val modes: Field = MethodHandles.Lookup::class.java.getDeclaredField("allowedModes")
                modes.isAccessible = true
                modes.setInt(lookupIn, -1) // -1 == TRUSTED
                return lookupIn
            }
        },
        JAVA_9 {
            // Java 9+
            override fun privateLookup(clazz: Class<*>?): MethodHandles.Lookup {
                val theUnsafe: Field = Unsafe::class.java.getDeclaredField("theUnsafe")
                theUnsafe.isAccessible = true
                val unsafe: Unsafe = theUnsafe.get(null) as Unsafe
                val implLookup: Field = MethodHandles.Lookup::class.java.getDeclaredField("IMPL_LOOKUP")
                MethodHandles.publicLookup()
                val lookup = unsafe.getObject(
                    unsafe.staticFieldBase(implLookup),
                    unsafe.staticFieldOffset(implLookup)
                ) as MethodHandles.Lookup
                return lookup.`in`(clazz)
            }
        };

        abstract fun privateLookup(clazz: Class<*>?): MethodHandles.Lookup
    }


}