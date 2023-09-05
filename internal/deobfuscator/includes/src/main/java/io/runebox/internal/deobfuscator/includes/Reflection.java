package io.runebox.internal.deobfuscator.includes;

import com.google.common.reflect.ClassPath;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Reflection {

    private static final boolean DEBUG_MODE = true;

    public static final Map<String, Class<?>> classes = new HashMap<>();

    static {
        try {
            ClassPath.from(ClassLoader.getSystemClassLoader()).getTopLevelClasses().stream()
                    .map(ClassPath.ClassInfo::getName)
                    .forEach(className -> {
                        try {
                            Class<?> clazz = Class.forName(className);
                            ObfInfo annotation = clazz.getAnnotation(ObfInfo.class);
                            if(annotation != null) {
                                String obfClassName = annotation.name();
                                classes.put(obfClassName, clazz);
                            }
                        } catch (Exception | NoClassDefFoundError e) {
                            /* Ignore */
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Class<?>> getClasses() {
        return classes;
    }

    public static Class<?> getClass(String name) throws ClassNotFoundException {
        try {
            var clazz = classes.get(name);
            if (clazz != null) return clazz;

            if (DEBUG_MODE) {
                System.out.println("ReflectionCheck: [Class: " + name + "]");
            }

            return Class.forName(name);
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            if(DEBUG_MODE) {
                e.printStackTrace();
            }
            return Class.forName(name);
        }
    }

    public static Field getField(Class<?> clazz, String name) throws NoSuchFieldException {
        if (DEBUG_MODE) {
            System.out.println("ReflectionCheck: [Field: " + clazz + ", " + name + "]");
        }

        for (Field field : clazz.getDeclaredFields()) {
            var annotation = field.getAnnotation(ObfInfo.class);
            if (annotation != null && annotation.name().equals(name)) {
                return field;
            }
        }

        if (DEBUG_MODE) {
            System.out.println("ReflectionCheck: [DummyField: " + clazz + " - " + name + "]");
        }

        return clazz.getDeclaredField(name);
    }

    public static String getMethodName(Method method) {
        var annotation = method.getAnnotation(ObfInfo.class);
        if (annotation != null) return annotation.name();
        return method.getName();
    }

    public static Class<?>[] getArgumentTypes(Method method) {
        var annotation = method.getAnnotation(ObfInfo.class);
        var types = method.getParameterTypes();

        if (annotation == null) return types;

        var desc = annotation.desc();
        var i = desc.lastIndexOf(')');
        var c = desc.charAt(i - 1);

        Class<?> last;
        switch (c) {
            case 'B':
                last = byte.class;
                break;
            case 'I':
                last = int.class;
                break;
            case 'S':
                last = short.class;
                break;
            default:
                throw new IllegalStateException();
        }

        var extendedTypes = new Class<?>[types.length + 1];
        System.arraycopy(types, 0, extendedTypes, 0, types.length);
        extendedTypes[extendedTypes.length - 1] = last;

        return extendedTypes;
    }

    public static Object invoke(Method method, Object instance, Object[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (DEBUG_MODE) {
            System.out.println("ReflectionCheck: [Invoke: " + method + "]");
        }
        try {
            return method.invoke(instance, args);
        } catch (Throwable ex) {
            if (DEBUG_MODE) {
                ex.printStackTrace();
            }
            throw ex;
        }
    }

    public static int getInt(Field field, Object instance)
            throws IllegalAccessException, IllegalArgumentException {
        if (DEBUG_MODE) {
            System.out.println("ReflectionCheck: [GetField: " + field + "]");
        }

        boolean unset = false;
        if ((field.getModifiers() & Modifier.PRIVATE) == 0) {
            field.setAccessible(true);
            unset = true;
        }

        int value;
        try {
            value = field.getInt(instance);
        } catch (Exception e) {
            if (DEBUG_MODE) e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (unset) {
                field.setAccessible(false);
            }
        }

        var annotation = field.getAnnotation(ObfInfo.class);
        if (annotation != null) {
            int getter = annotation.intMultiplier();
            int setter = invert(getter);
            value *= setter;
        }

        return value;
    }

    public static void setInt(Field field, Object instance, int value)
            throws IllegalAccessException, IllegalArgumentException {
        if (DEBUG_MODE) {
            System.out.println("ReflectionCheck: [SetField: " + field + " = " + value + "]");
        }

        int ret = value;

        var annotation = field.getAnnotation(ObfInfo.class);
        if (annotation != null) {
            int getter = annotation.intMultiplier();
            ret *= getter;
        }

        boolean unset = false;
        if ((field.getModifiers() & Modifier.PRIVATE) == 0) {
            field.setAccessible(true);
            unset = true;
        }

        try {
            field.setInt(instance, ret);
        } finally {
            if (unset) {
                field.setAccessible(false);
            }
        }
    }

    private static int invert(BigInteger value) {
        return value.modInverse(BigInteger.ONE.shiftLeft(32)).intValue();
    }

    public static int invert(int value) {
        return invert(BigInteger.valueOf(value));
    }
}
