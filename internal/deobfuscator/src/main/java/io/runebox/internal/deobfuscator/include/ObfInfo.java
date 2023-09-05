package io.runebox.internal.deobfuscator.include;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface ObfInfo {

    String owner() default "";

    String name() default "";

    String desc() default "";

    String opaqueDesc() default "";

    String opaqueValue() default "";

    int intMultiplier() default 0;

    long longMultiplier() default 0L;

}
