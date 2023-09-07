package io.runebox.internal.deobfuscator.ast.util

import com.github.javaparser.resolution.types.ResolvedType

fun ResolvedType.isString(): Boolean {
    return isReferenceType && asReferenceType().qualifiedName == "java.lang.String"
}

fun ResolvedType.isClass(): Boolean {
    return isReferenceType && asReferenceType().qualifiedName == "java.lang.Class"
}