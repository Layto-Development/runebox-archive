package io.runebox.internal.deobfuscator.asm.analysis

import io.runebox.internal.deobfuscator.asm.intConstant
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.objectweb.asm.tree.analysis.BasicValue
import org.objectweb.asm.tree.analysis.Interpreter
import org.objectweb.asm.tree.analysis.Value

class IntInterpreter(private val args: Array<IntValueSet>) : Interpreter<IntValue>(ASM9) {

    private val interp = BasicInterpreter()

    override fun newValue(type: Type?) = interp.newValue(type)?.let { IntValue(it) }

    override fun newParameterValue(isInstanceMethod: Boolean, local: Int, type: Type): IntValue {
        val bv = interp.newParameterValue(isInstanceMethod, local, type)
        val index = when {
            isInstanceMethod && local == 0 -> return IntValue(bv)
            isInstanceMethod -> local - 1
            else -> local
        }
        return IntValue(bv, args[index])
    }

    override fun newOperation(insn: AbstractInsnNode): IntValue {
        val bv = interp.newOperation(insn)
        val number = insn.intConstant
        return if(number != null) {
            IntValue(bv, IntValueSet.singleton(number))
        } else {
            IntValue(bv)
        }
    }

    override fun copyOperation(insn: AbstractInsnNode, value: IntValue): IntValue {
        return value
    }

    override fun unaryOperation(insn: AbstractInsnNode, value: IntValue): IntValue? {
        val bv = interp.unaryOperation(insn, value.bv) ?: return null

        if(value.set !is IntValueSet.Constant) {
            return IntValue(bv)
        }

        val set = mutableSetOf<Int>()
        for(v in value.set.values) {
            val result = when {
                insn.opcode == INEG -> -v
                insn is IincInsnNode -> v + insn.incr
                insn.opcode == I2B -> v.toByte().toInt()
                insn.opcode == I2C -> v.toChar().code
                insn.opcode == I2S -> v.toShort().toInt()
                else -> return IntValue(bv)
            }
            set.add(result)
        }

        return IntValue(bv, IntValueSet.Constant(set))
    }

    override fun binaryOperation(insn: AbstractInsnNode, value1: IntValue, value2: IntValue): IntValue? {
        val bv = interp.binaryOperation(insn, value1.bv, value2.bv) ?: return null

        if(value1.set !is IntValueSet.Constant || value2.set !is IntValueSet.Constant) {
            return IntValue(bv)
        }

        val set = mutableSetOf<Int>()
        for(v1 in value1.set.values) {
            for(v2 in value2.set.values) {
                val result = when(insn.opcode) {
                    IADD -> v1 + v2
                    ISUB -> v1 - v2
                    IMUL -> v1 * v2
                    IDIV -> {
                        if (v2 == 0) {
                            return IntValue(bv)
                        }
                        v1 / v2
                    }

                    IREM -> {
                        if (v2 == 0) {
                            return IntValue(bv)
                        }
                        v1 % v2
                    }

                    ISHL -> v1 shl v2
                    ISHR -> v1 shr v2
                    IUSHR -> v1 ushr v2
                    IAND -> v1 and v2
                    IOR -> v1 or v2
                    IXOR -> v1 xor v2
                    else -> return IntValue(bv)
                }
                set.add(result)
            }
        }
        return IntValue(bv, IntValueSet.Constant(set))
    }

    override fun ternaryOperation(
        insn: AbstractInsnNode,
        value1: IntValue,
        value2: IntValue,
        value3: IntValue
    ): IntValue? {
        val bv =
            interp.ternaryOperation(insn, value1.bv, value2.bv, value3.bv)
                ?: return null
        return IntValue(bv)
    }

    override fun naryOperation(insn: AbstractInsnNode, values: List<IntValue>): IntValue? {
        val args = values.map(IntValue::bv)
        val bv = interp.naryOperation(insn, args) ?: return null
        return IntValue(bv)
    }

    override fun returnOperation(insn: AbstractInsnNode, value: IntValue, expected: IntValue) {
        interp.returnOperation(insn, value.bv, expected.bv)
    }

    override fun merge(value1: IntValue, value2: IntValue): IntValue {
        val bv = interp.merge(value1.bv, value2.bv)

        if (value1 == value2) {
            return value1
        }

        if (value1.set !is IntValueSet.Constant || value2.set !is IntValueSet.Constant) {
            return IntValue(bv)
        }

        val set = value1.set union value2.set
        return if (set is IntValueSet.Constant && set.values.size > MAX_TRACKED_VALUES) {
            IntValue(bv)
        } else {
            IntValue(bv, set)
        }
    }

    private companion object {
        private const val MAX_TRACKED_VALUES = 1
    }
}

data class IntValue(val bv: BasicValue, val set: IntValueSet = IntValueSet.Unknown) : Value {
    override fun getSize() = bv.size
}

sealed class IntValueSet {

    abstract val singleton: Int?
    abstract infix fun union(other: IntValueSet): IntValueSet

    data class Constant(val values: Set<Int>) : IntValueSet() {
        init {
            require(values.isNotEmpty())
        }

        override val singleton: Int? get() = if(values.size == 1) {
            values.first()
        } else {
            null
        }

        override fun union(other: IntValueSet): IntValueSet {
            return if(other is Constant) {
                Constant(values union other.values)
            } else {
                Unknown
            }
        }
    }

    data object Unknown : IntValueSet() {

        override val singleton: Int? get() = null

        override fun union(other: IntValueSet): IntValueSet {
            return Unknown
        }
    }

    companion object {

        fun singleton(value: Int): IntValueSet {
            return Constant(setOf(value))
        }
    }
}