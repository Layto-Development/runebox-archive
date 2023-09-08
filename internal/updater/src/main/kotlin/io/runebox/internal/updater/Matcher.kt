package io.runebox.internal.updater

import io.runebox.internal.updater.asm.ClassEntry
import io.runebox.internal.updater.asm.FieldEntry
import io.runebox.internal.updater.asm.MethodEntry
import org.tinylog.kotlin.Logger

class Matcher(val updater: Updater) {

    val env get() = updater.env

    val poolA get() = env.poolA
    val poolB get() = env.poolB
    val sharedPool get() = env.sharedPool

    fun init() {
        Logger.info("Initializing updater matcher.")


    }

    fun run() {
        Logger.info("Running matcher.")

        /*
         * Pre-match all non-obfuscated classes.
         */
        matchNonObfuscatedClasses()
    }

    private fun matchNonObfuscatedClasses() {
        poolA.classes.forEach { clsA ->
            if(clsA.nameObfuscated) return@forEach
            val clsB = poolB.getClass(clsA.name)
            if(clsB != null && !clsB.nameObfuscated) {
                match(clsA, clsB)
            }
        }
    }

    fun match(a: ClassEntry, b: ClassEntry) {
        if(!a.isMatchable || !b.isMatchable) error("Either $a or $b are not matchable.")
        if(a.match == b) return
        unmatchMembers(a)
        unmatchMembers(b)
        a.match(b)
        b.match(a)

        a.methods.forEach { methodA ->
            if(methodA.nameObfuscated) return@forEach
            val methodB = b.getMethod(methodA.name, methodA.desc)
            if(methodB != null && !methodB.nameObfuscated) {
                match(methodA, methodB)
            }
        }

        a.fields.forEach { fieldA ->
            if(fieldA.nameObfuscated) return@forEach
            val fieldB = b.getField(fieldA.name, fieldA.desc)
            if(fieldB != null && !fieldB.nameObfuscated) {
                match(fieldA, fieldB)
            }
        }

        Logger.info("Matched Class: $a -> $b")
    }

    fun match(a: MethodEntry, b: MethodEntry) {
        if(!a.isMatchable || !b.isMatchable) error("Either $a or $b are not matchable.")
        if(a.match == b) return
        if(!a.isStatic() && !b.isStatic()) {
            if(a.cls.match != b.cls) error("$a class is not matched to $b class.")
        }

        a.match(b)
        b.match(a)

        if(a.isStatic() && b.isStatic()) {
            Logger.info("Matched Static-Method: $a -> $b")
        } else {
            Logger.info("Matched Member-Method: $a -> $b")
        }
    }

    fun match(a: FieldEntry, b: FieldEntry) {
        if(!a.isMatchable || !b.isMatchable) error("Either $a or $b are not matchable.")
        if(a.match == b) return
        if(!a.isStatic() && !b.isStatic()) {
            if(a.cls.match != b.cls) error("$a class is not matched to $b class.")
        }

        a.match(b)
        b.match(a)

        if(a.isStatic() && b.isStatic()) {
            Logger.info("Matched Static-Field: $a -> $b")
        } else {
            Logger.info("Matched Member-Field: $a -> $b")
        }
    }

    private fun unmatchMembers(cls: ClassEntry) {
        cls.memberMethods.forEach { method ->
            if(method.hasMatch()) {
                method.unmatch()
            }
        }
        cls.memberFields.forEach { field ->
            if(field.hasMatch()) {
                field.unmatch()
            }
        }
    }
}