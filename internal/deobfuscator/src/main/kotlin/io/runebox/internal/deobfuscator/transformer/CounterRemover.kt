package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.InsnMatcher
import io.runebox.internal.deobfuscator.asm.classpath.MemberRef
import io.runebox.internal.deobfuscator.asm.hasCode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodNode
import org.tinylog.kotlin.Logger

class CounterRemover : Transformer {

    private val counters = mutableSetOf<MemberRef>()

    override fun run(pool: ClassPool) {
        counters.clear()

        val references = mutableMapOf<MemberRef, Int>()
        val resets = mutableMapOf<MemberRef, Int>()
        val increments = mutableMapOf<MemberRef, Int>()

        for (cls in pool.classes) {
            for (method in cls.methods) {
                if (method.hasCode) {
                    findCounters(method, references, resets, increments)
                }
            }
        }

        deleteCounters(pool, references, resets, increments)

        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                for (match in RESET_PATTERN.match(method)) {
                    val putstatic = match[1] as FieldInsnNode
                    if (MemberRef(putstatic) in counters) {
                        match.forEach(method.instructions::remove)
                    }
                }

                for (match in INCREMENT_PATTERN.match(method)) {
                    val getstatic = MemberRef(match[0] as FieldInsnNode)
                    val putstatic = MemberRef(match[3] as FieldInsnNode)
                    if (getstatic == putstatic && putstatic in counters) {
                        match.forEach(method.instructions::remove)
                    }
                }

            }
        }

        Logger.info("Removed ${counters.size} counters.")
    }

    private fun findCounters(
        method: MethodNode,
        references: MutableMap<MemberRef, Int>,
        resets: MutableMap<MemberRef, Int>,
        increments: MutableMap<MemberRef, Int>
    ) {
        for (insn in method.instructions) {
            if (insn is FieldInsnNode) {
                references.merge(MemberRef(insn), 1, Integer::sum)
            }
        }

        for (match in RESET_PATTERN.match(method)) {
            val putstatic = MemberRef(match[1] as FieldInsnNode)
            resets.merge(putstatic, 1, Integer::sum)
        }

        for (match in INCREMENT_PATTERN.match(method)) {
            val getstatic = MemberRef(match[0] as FieldInsnNode)
            val putstatic = MemberRef(match[3] as FieldInsnNode)
            if (getstatic == putstatic) {
                increments.merge(putstatic, 1, Integer::sum)
            }
        }
    }

    private fun deleteCounters(
        pool: ClassPool,
        references: Map<MemberRef, Int>,
        resets: Map<MemberRef, Int>,
        increments: Map<MemberRef, Int>
    ) {
        for ((counter, value) in references) {
            if (resets[counter] != 1) {
                continue
            }

            // one for the reset, two for each increment
            val counterIncrements = increments[counter] ?: 0
            if (value != counterIncrements * 2 + 1) {
                continue
            }

            val owner = pool.getClass(counter.owner)!!
            owner.fields.removeIf { it.name == counter.name && it.desc == counter.desc }
            counters.add(counter)
        }
    }

    private companion object {
        private val RESET_PATTERN = InsnMatcher.compile("ICONST_0 PUTSTATIC")
        private val INCREMENT_PATTERN = InsnMatcher.compile("GETSTATIC ICONST_1 IADD PUTSTATIC")
    }
}