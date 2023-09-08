package io.runebox.internal.updater.classifier

import io.runebox.internal.updater.asm.ClassEntry
import io.runebox.internal.updater.asm.FieldEntry
import io.runebox.internal.updater.asm.Matchable
import io.runebox.internal.updater.asm.MethodEntry
import kotlin.math.abs
import kotlin.math.max

object ClassifierUtil {

    fun isMaybeEqual(a: ClassEntry, b: ClassEntry): Boolean {
        if(a == b) return true
        if(a.hasMatch()) return a.match == b
        if(b.hasMatch()) return b.match == a
        if(!a.matchable || !b.matchable) return false
        if(a.isArray() != b.isArray()) return false
        return !(a.isArray() && b.isArray() && isMaybeEqual(a.elementClass!!, b.elementClass!!))
    }

    fun isMaybeEqual(a: MethodEntry, b: MethodEntry): Boolean {
        if(a == b) return true
        if(a.hasMatch()) return a.match == b
        if(b.hasMatch()) return b.match == a
        if(!a.matchable || !b.matchable) return false
        if(!a.isStatic() || !b.isStatic()) {
            if(!isMaybeEqual(a.cls, b.cls)) error("owner classes do not have match.")
        }
        return true
    }

    fun isMaybeEqual(a: FieldEntry, b: FieldEntry): Boolean {
        if(a == b) return true
        if(a.hasMatch()) return a.match == b
        if(b.hasMatch()) return b.match == a
        if(!a.matchable || !b.matchable) return false
        if(!a.isStatic() || !b.isStatic()) {
            if(!isMaybeEqual(a.cls, b.cls)) error("owner classes do not have match.")
        }
        return true
    }

    fun <T : Matchable<T>> isMaybeEqualNullable(a: T?, b: T?): Boolean {
        if(a == null && b == null) return true
        if(a == null || b == null) return false
        return isMaybeEqual(a, b)
    }

    fun <T : Matchable<T>> isMaybeEqual(a: T, b: T): Boolean {
        return when {
            a is ClassEntry && b is ClassEntry -> isMaybeEqual(a, b)
            a is MethodEntry && b is MethodEntry -> isMaybeEqual(a, b)
            a is FieldEntry && b is FieldEntry -> isMaybeEqual(a, b)
            else -> error("")
        }
    }

    fun compareCounts(a: Int, b: Int): Double {
        val delta = abs(a - b)
        if(delta == 0) return 1.0
        return 1 - delta.toDouble() / max(a, b)
    }

    fun <T> compareSets(a: Set<T>, b: Set<T>): Double {
        val setA = mutableSetOf<T>()
        val setB = mutableSetOf<T>()
        setA.addAll(a)
        setB.addAll(b)

        val oldSize = setB.size
        setB.removeAll(setA)

        val matched = oldSize - setB.size
        val total = setA.size - matched + oldSize

        return if(total == 0) 1.0 else matched.toDouble() / total
    }

    fun compareClassSets(a: MutableSet<ClassEntry>, b: MutableSet<ClassEntry>): Double {
        return compareIdentitySets(a, b, ClassifierUtil::isMaybeEqual)
    }

    fun compareMethodSets(a: MutableSet<MethodEntry>, b: MutableSet<MethodEntry>): Double {
        return compareIdentitySets(a, b, ClassifierUtil::isMaybeEqual)
    }

    fun compareFieldSets(a: MutableSet<FieldEntry>, b: MutableSet<FieldEntry>): Double {
        return compareIdentitySets(a, b, ClassifierUtil::isMaybeEqual)
    }

    private fun <T : Matchable<T>> compareIdentitySets(a: MutableSet<T>, b: MutableSet<T>, compare: (T, T) -> Boolean): Double {
        val setA = mutableSetOf<T>().also { it.addAll(a) }
        val setB = mutableSetOf<T>().also { it.addAll(b) }

        if(setA.isEmpty() || setB.isEmpty()) {
            return if(setA.isEmpty() && setB.isEmpty()) 1.0 else 0.0
        }

        val total = setA.size + setB.size
        var unmatched = 0

        var itr = setA.iterator()
        while(itr.hasNext()) {
            val entryA = itr.next()
            if(setB.remove(entryA)) {
                itr.remove()
            } else if(entryA.hasMatch()) {
                if(!setB.remove(entryA.match)) {
                    unmatched++
                }
                itr.remove()
            }
        }

        itr = setA.iterator()
        while(itr.hasNext()) {
            val entryA = itr.next()
            var found = false

            for(entryB in setB) {
                if(compare(entryA, entryB)) {
                    found = true
                    break
                }
            }

            if(!found) {
                unmatched++
                itr.remove()
            }
        }

        for(entryB in setB) {
            var found = false

            for(entryA in setA) {
                if(compare(entryA, entryB)) {
                    found = true
                    break
                }
            }

            if(!found) {
                unmatched++
            }
        }

        return (total - unmatched).toDouble() / total
    }
}