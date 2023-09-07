package io.runebox.internal.deobfuscator.asm

import io.runebox.internal.deobfuscator.util.field
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
    origOwner
    origName
    origDesc
    opaqueDesc
    opaqueValue
}

fun MethodNode.reset() {
    hierarchy.clear()
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool get() = cls.pool

var MethodNode.origOwner: String by field { it.cls.name }
var MethodNode.origName: String by field { it.name }
var MethodNode.origDesc: String by field { it.desc }
var MethodNode.opaqueDesc: String by field { "" }
var MethodNode.opaqueValue: String by field { "" }

var MethodNode.hierarchy: HashSet<MethodNode> by field { hashSetOf() }

val MethodNode.id get() = "${cls.id}.$name$desc"
val MethodNode.parents get() = cls.superClasses.mapNotNull { it.getMethod(name, desc) }
val MethodNode.children get() = cls.subClasses.mapNotNull { it.getMethod(name, desc) }

fun MethodNode.isPrivate() = (access and ACC_PRIVATE) != 0
fun MethodNode.isStatic() = (access and ACC_STATIC) != 0
fun MethodNode.isAbstract() = (access and ACC_ABSTRACT) != 0

fun MethodNode.isConstructor() = name == "<init>"
fun MethodNode.isInitializer() = name == "<clinit>"

private fun localIndex(access: Int, argTypes: Array<Type>, argIndex: Int): Int {
    var localIndex = 0
    if (access and Opcodes.ACC_STATIC == 0) {
        localIndex++
    }
    for (i in 0 until argIndex) {
        localIndex += argTypes[i].size
    }
    return localIndex
}

private fun remap(i: Int, argType: Type, localIndex: Int, newLocalIndex: Int): Int {
    return when {
        i > localIndex -> i - argType.size
        i == localIndex -> newLocalIndex
        else -> i
    }
}

private fun remapAll(indexes: List<Int>, argType: Type, localIndex: Int, newLocalIndex: Int): MutableList<Int> {
    return indexes.mapTo(mutableListOf()) { remap(it, argType, localIndex, newLocalIndex) }
}

fun MethodNode.removeArgument(argIndex: Int) {
    // remove argument from the descriptor
    val type = Type.getType(desc)
    val argType = type.argumentTypes[argIndex]
    val argTypes = type.argumentTypes.filterIndexed { index, _ -> index != argIndex }.toTypedArray()
    desc = Type.getMethodDescriptor(type.returnType, *argTypes)

    // the client doesn't use signatures so don't bother with them
    if (signature != null) {
        throw UnsupportedOperationException("Signatures unsupported")
    }

    parameters?.removeAt(argIndex)

    // remove annotations
    if (visibleAnnotableParameterCount != 0) {
        throw UnsupportedOperationException("Non-zero visibleAnnotableParameterCount unsupported")
    }

    if (visibleParameterAnnotations != null) {
        visibleParameterAnnotations =
            visibleParameterAnnotations.filterIndexed { index, _ -> index != argIndex }.toTypedArray()
    }

    if (invisibleAnnotableParameterCount != 0) {
        throw UnsupportedOperationException("Non-zero invisibleAnnotableParameterCount unsupported")
    }

    if (invisibleParameterAnnotations != null) {
        invisibleParameterAnnotations =
            invisibleParameterAnnotations.filterIndexed { index, _ -> index != argIndex }.toTypedArray()
    }

    // remap locals
    val localIndex = localIndex(access, argTypes, argIndex)
    val newLocalIndex = maxLocals - argType.size

    if (localVariables != null) {
        for (v in localVariables) {
            v.index = remap(v.index, argType, localIndex, newLocalIndex)
        }
    }

    if (visibleLocalVariableAnnotations != null) {
        for (annotation in visibleLocalVariableAnnotations) {
            annotation.index = remapAll(annotation.index, argType, localIndex, newLocalIndex)
        }
    }

    if (invisibleLocalVariableAnnotations != null) {
        for (annotation in invisibleLocalVariableAnnotations) {
            annotation.index = remapAll(annotation.index, argType, localIndex, newLocalIndex)
        }
    }

    var newLocalIndexUsed = false

    for (insn in instructions) {
        when (insn) {
            is VarInsnNode -> {
                insn.`var` = remap(insn.`var`, argType, localIndex, newLocalIndex)

                if (insn.`var` == newLocalIndex) {
                    newLocalIndexUsed = true
                }
            }

            is IincInsnNode -> {
                insn.`var` = remap(insn.`var`, argType, localIndex, newLocalIndex)

                if (insn.`var` == newLocalIndex) {
                    newLocalIndexUsed = true
                }
            }

            is FrameNode -> throw UnsupportedOperationException("SKIP_FRAMES and COMPUTE_FRAMES must be used")
        }
    }

    if (newLocalIndexUsed) {
        return
    }

    maxLocals -= argType.size

    if (localVariables != null) {
        localVariables.removeIf { it.index == newLocalIndex }
    }

    if (visibleLocalVariableAnnotations != null) {
        visibleLocalVariableAnnotations.removeIf { newLocalIndex in it.index }
    }

    if (invisibleLocalVariableAnnotations != null) {
        invisibleLocalVariableAnnotations.removeIf { newLocalIndex in it.index }
    }
}

fun MethodNode.removeDeadCode(owner: String) {
    var changed: Boolean
    do {
        changed = false

        val analyzer = Analyzer(BasicInterpreter())
        val frames = analyzer.analyze(owner, this)

        val it = instructions.iterator()
        var i = 0
        for (insn in it) {
            if (frames[i++] != null || insn is LabelNode) {
                continue
            }

            it.remove()
            changed = true
        }

        changed = changed or tryCatchBlocks.removeIf { it.isBodyEmpty() }
    } while (changed)
}

val MethodNode.hasCode: Boolean
    get() = access and (Opcodes.ACC_NATIVE or Opcodes.ACC_ABSTRACT) == 0

fun MethodNode.copy(): MethodNode {
    val copy = MethodNode(
        access,
        name,
        desc,
        signature,
        exceptions?.toTypedArray()
    )
    accept(copy)
    return copy
}
