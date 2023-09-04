package io.runebox.internal.deobfuscator.asm

import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LabelNode

private val ANY_INSN = { _: AbstractInsnNode -> true }

fun getExpression(
    last: AbstractInsnNode,
    filter: (AbstractInsnNode) -> Boolean = ANY_INSN
): List<AbstractInsnNode>? {
    val expr = mutableListOf<AbstractInsnNode>()

    var height = 0
    var insn: AbstractInsnNode? = last
    do {
        val (pops, pushes) = insn!!.stackMetadata
        if (insn !== last) {
            expr.add(insn)
            height -= pushes
        }
        height += pops

        if (height == 0) {
            return expr.asReversed()
        }

        insn = insn.previous
    } while (insn != null && insn.isSequential && filter(insn))

    return null
}

fun InsnList.replaceExpression(
    last: AbstractInsnNode,
    replacement: AbstractInsnNode,
    filter: (AbstractInsnNode) -> Boolean = ANY_INSN
): Boolean {
    val expr = getExpression(last, filter) ?: return false
    expr.forEach(this::remove)
    this[last] = replacement
    return true
}

fun InsnList.deleteExpression(
    last: AbstractInsnNode,
    filter: (AbstractInsnNode) -> Boolean = ANY_INSN
): Boolean {
    val expr = getExpression(last, filter) ?: return false
    expr.forEach(this::remove)
    remove(last)
    return true
}

fun InsnList.clone(labels: Map<LabelNode, LabelNode>): InsnList {
    val copy = InsnList()
    for (insn in this) {
        copy.add(insn.clone(labels))
    }
    return copy
}

fun InsnList.append(previous: AbstractInsnNode, vararg insns: AbstractInsnNode) {
    check(contains(previous))
    insns.reversed().forEach { insert(previous, it) }
}

fun InsnList.prepend(next: AbstractInsnNode, vararg insns: AbstractInsnNode) {
    check(contains(next))
    insns.forEach { insertBefore(next, it) }
}

fun InsnList.delete(vararg insns: AbstractInsnNode) {
    insns.forEach {
        check(contains(it))
        remove(it)
    }
}

fun InsnList.replace(old: AbstractInsnNode, replacement: AbstractInsnNode) {
    check(contains(old))
    set(old, replacement)
}

