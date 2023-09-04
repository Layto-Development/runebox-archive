package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.LabelMap
import io.runebox.internal.deobfuscator.asm.getExpression
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.analysis.*
import org.tinylog.kotlin.Logger

class ExprOrderNormalizer : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                val frames = Analyzer(ExprInterpreter()).analyze(cls.name, method)
                val insns = method.instructions
                val labelMap = LabelMap()

                for(i in 0 until insns.size()) {
                    val insn = insns[i]
                    val frame = frames[i] ?: continue

                    if(insn.isOrderable()) {
                        val left = frame.getStackFromTop(0)
                        val right = frame.getStackFromTop(1)

                        if(right is Expr.Constant && left !is Expr.Constant) {
                            if(!right.insn.isConstant()) continue

                            val leftInsns = getExpression(left.insn)!!.plus(left.insn)
                            val rightInsns = getExpression(right.insn)!!.plus(right.insn)

                            val newLeftInsns = leftInsns.map { it.clone(null) }.toInsnList()
                            val newRightInsns = rightInsns.map { it.clone(null) }.toInsnList()

                            leftInsns.forEach { insns.remove(it) }
                            rightInsns.forEach { insns.remove(it) }

                            insns.insertBefore(insn, newLeftInsns)
                            insns.insertBefore(insn, newRightInsns)

                            continue
                        }
                    }
                }

            }
        }

        Logger.info("Reordered $count expressions.")
    }

    private fun AbstractInsnNode.isOrderable(): Boolean {
        return opcode in listOf(IF_ICMPEQ, IF_ICMPNE, IF_ACMPEQ, IF_ACMPNE) || opcode in IMUL..DMUL
    }

    private fun AbstractInsnNode.isConstant(): Boolean = opcode in ICONST_M1..SIPUSH || (opcode == LDC && (this as LdcInsnNode).cst is Number)

    private fun Frame<Expr>.getStackFromTop(index: Int): Expr {
        return this.getStack(this.stackSize - 1 - index)
    }

    private fun <T : AbstractInsnNode> List<T>.toInsnList(): InsnList {
        val list = InsnList()
        this.reversed().forEach { list.insert(it) }
        return list
    }

    private open class Expr(var type: SourceValue, vararg val values: Expr): Value {

        val insn get() = type.insns.single()
        val insns get() = type.insns

        override fun getSize(): Int = type.size

        override fun equals(other: Any?): Boolean = other is Expr && type == other.type
        override fun hashCode(): Int = type.hashCode()



        class Binary(type: SourceValue, val left: Expr, val right: Expr) : Expr(type, left, right)
        class Unary(type: SourceValue, val value: Expr) : Expr(type, value)
        class Constant(type: SourceValue) : Expr(type)
        class Variable(type: SourceValue) : Expr(type)

    }

    private class ExprInterpreter : Interpreter<Expr>(ASM9) {

        private val interp = SourceInterpreter()

        override fun newValue(type: Type?) = interp.newValue(type)?.let { Expr(it) }

        override fun newOperation(insn: AbstractInsnNode): Expr = interp.newOperation(insn).let {
            when(insn.opcode) {
                in ICONST_M1..LDC -> Expr.Constant(it)
                else -> Expr(it)
            }
        }

        override fun merge(value1: Expr, value2: Expr): Expr = Expr(interp.merge(value1.type, value2.type))

        override fun returnOperation(insn: AbstractInsnNode?, value: Expr?, expected: Expr?) {}

        override fun naryOperation(insn: AbstractInsnNode, values: MutableList<out Expr>) = Expr(interp.naryOperation(insn, values.map { it.type }))

        override fun ternaryOperation(insn: AbstractInsnNode, value1: Expr, value2: Expr, value3: Expr) = Expr(interp.ternaryOperation(insn, value1.type, value2.type, value3.type))

        override fun binaryOperation(insn: AbstractInsnNode, value1: Expr, value2: Expr) = interp.binaryOperation(insn, value1.type, value2.type).let {
            Expr.Binary(it, value1, value2)
        }

        override fun unaryOperation(insn: AbstractInsnNode, value: Expr) = Expr(interp.unaryOperation(insn, value.type))

        override fun copyOperation(insn: AbstractInsnNode, value: Expr) = interp.copyOperation(insn, value.type).let {
            when(insn.opcode) {
                in ILOAD..ALOAD -> Expr.Variable(it)
                else -> Expr(it)
            }
        }
    }
}