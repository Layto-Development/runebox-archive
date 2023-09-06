package io.runebox;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ObfInfo {

    String name();

    String desc() default "";

    String opaqueValue() default "";

    int intMultiplier() default 0;

    long longMultiplier() default 0L;
}
