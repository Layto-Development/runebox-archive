package io.runebox.internal.deobfuscator.bytecode.transformer

import com.google.common.collect.MultimapBuilder
import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.*
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.Type.INT_TYPE
import org.objectweb.asm.Type.LONG_TYPE
import org.objectweb.asm.tree.*
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.Interpreter
import org.objectweb.asm.tree.analysis.SourceInterpreter
import org.objectweb.asm.tree.analysis.SourceValue
import org.objectweb.asm.tree.analysis.Value
import org.tinylog.kotlin.Logger
import java.math.BigInteger
import kotlin.math.absoluteValue

class NewMultiplierRemover : BytecodeTransformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        Logger.info("Computing multipliers...")

        val multipliers = MultiplierSolver.Multipliers()

        MultiplierSolver(pool, multipliers).also { it.run() }
        MultiplierRemover(pool, multipliers).also { it.run(); count = it.removedCount }

        Logger.info("Removed $count field multipliers.")
    }

    private class MultiplierSolver(private val pool: ClassPool, private val multipliers: Multipliers) {

        fun run() {
            val analyzer = Analyzer(MultiplierSolverInterpreter(multipliers))

            pool.classes.forEach { cls ->
                cls.methods.forEach { method ->
                    analyzer.analyze(method.cls.name, method)
                }
            }

            multipliers.solve()
        }

        private data class Multiplier(val number: Number, val isDecoder: Boolean) {

            val invNumber = if(isDecoder) number else invert(number)

            companion object {
                fun decoder(number: Number) = Multiplier(number, true)
                fun encoder(number: Number) = Multiplier(number, false)
            }
        }

        private data class FieldMultiplier(val putter: String, val getter: String, val number: Number)

        class Multipliers {

            val decoders = hashMapOf<String, Number>()

            val fieldMultipliers = hashSetOf<FieldMultiplier>()
            val unsolvedMultipliers = MultimapBuilder.hashKeys().arrayListValues().build<String, Multiplier>()

            fun solve() {
                while(true) {
                    simplify()
                    if(unsolvedMultipliers.isEmpty) return
                    solveStep()
                }
            }

            private fun simplify() {
                val itr = fieldMultipliers.iterator()
                for(fieldMul in itr) {
                    if(fieldMul.putter in decoders) {
                        itr.remove()
                        val dec = decoders.getValue(fieldMul.putter)
                        val invDec = multiply(dec, fieldMul.number)
                        if(invDec.isMultiplier()) unsolvedMultipliers.put(fieldMul.getter, Multiplier.decoder(invDec))
                    } else if(fieldMul.getter in decoders) {
                        itr.remove()
                        val enc = invert(decoders.getValue(fieldMul.getter))
                        val invEnc = multiply(enc, fieldMul.number)
                        if(invEnc.isMultiplier()) unsolvedMultipliers.put(fieldMul.putter, Multiplier.encoder(invEnc))
                    }
                }
            }

            private fun solveStep() {
                var mulsMap = unsolvedMultipliers.asMap().entries.firstOrNull { e -> fieldMultipliers.none { it.getter == e.key || it.putter == e.key } }
                if(mulsMap == null) mulsMap = unsolvedMultipliers.asMap().entries.first()
                val (field, muls) = mulsMap
                val unfoldedNum = unfold(muls)
                if(unfoldedNum == Int.MAX_VALUE) {
                    Logger.warn("Failed to compute multiplier decoder for field: $field.")
                    unsolvedMultipliers.removeAll(field)
                } else {
                    decoders[field] = unfold(muls)
                    unsolvedMultipliers.removeAll(field)
                }
            }

            private fun unfold(muls: Collection<Multiplier>): Number {
                val uniqueMuls = muls.distinct()
                if(uniqueMuls.size == 1) return uniqueMuls.single().invNumber
                val pairs = uniqueMuls.filter { a -> a.isDecoder && uniqueMuls.any { b -> !b.isDecoder && a.invNumber == b.invNumber } }
                if(pairs.isNotEmpty()) return pairs.single().invNumber
                val factors = uniqueMuls.filter { m -> uniqueMuls.all { isFactor(it, m) } }
                if(factors.size == 1) return factors.single().invNumber
                return factors.first { it.isDecoder }.invNumber
            }

            private fun Number.isMultiplier() = isInvertible(this) && invert(this) != this

            private fun isFactor(product: Multiplier, factor: Multiplier) = divide(product, factor).toLong().absoluteValue <= 0xFF

            private fun divide(a: Multiplier, b: Multiplier): Number = if(a.isDecoder == b.isDecoder) {
                multiply(invert(b.number), a.number)
            } else {
                multiply(b.number, a.number)
            }

            private fun multiply(a: Number, b: Number): Number = when(a) {
                is Int -> a.toInt() * b.toInt()
                is Long -> a.toLong() * b.toLong()
                else -> error(a)
            }
        }

        private class MultiplierSolverInterpreter(private val multipliers: Multipliers) : Interpreter<MulValue>(ASM9) {

            private val putters = hashMapOf<MulValue, MulValue>()
            private val ldcMuls = hashSetOf<MulValue>()
            private val fieldMuls = hashSetOf<MulValue>()

            private val inter = SourceInterpreter()

            override fun newValue(type: Type?) = inter.newValue(type)?.let { MulValue(it) }

            override fun copyOperation(insn: AbstractInsnNode, value: MulValue) = when(insn.opcode) {
                DUP, DUP2, DUP_X1, DUP2_X1 -> value
                else -> MulValue(inter.copyOperation(insn, value.src))
            }

            override fun newOperation(insn: AbstractInsnNode) = MulValue(inter.newOperation(insn))

            override fun returnOperation(insn: AbstractInsnNode?, value: MulValue?, expected: MulValue?) {}

            override fun merge(value1: MulValue, value2: MulValue) = MulValue(inter.merge(value1.src, value2.src))

            override fun naryOperation(insn: AbstractInsnNode, values: MutableList<out MulValue>) = MulValue(inter.naryOperation(insn, values.map { it.src }))

            override fun ternaryOperation(insn: AbstractInsnNode, value1: MulValue, value2: MulValue, value3: MulValue) = MulValue(inter.ternaryOperation(insn, value1.src, value2.src, value3.src))

            override fun unaryOperation(insn: AbstractInsnNode, value: MulValue) = MulValue(inter.unaryOperation(insn, value.src)).also {
                if(insn.opcode == PUTSTATIC) putField(it, value)
            }

            override fun binaryOperation(insn: AbstractInsnNode, value1: MulValue, value2: MulValue) = MulValue.Binary(
                inter.binaryOperation(insn, value1.src, value2.src),
                value1,
                value2
            ).also {
                when(insn.opcode) {
                    IMUL, LMUL -> {
                        val fieldMul = it.asFieldMul() ?: return@also
                        if(ldcMuls.add(fieldMul.ldc)) {
                            multipliers.unsolvedMultipliers.put(fieldMul.field.id,
                                Multiplier.decoder(fieldMul.ldc.number)
                            )
                        }
                    }
                    PUTFIELD -> putField(it, value2)
                }
            }

            private fun putField(putter: MulValue, value: MulValue) {
                putters[value] = putter
                if(!value.isLdc() && value is MulValue.Binary) {
                    distribute(putter.src.insn as FieldInsnNode, value)
                }
            }

            private fun distribute(putter: FieldInsnNode, value: MulValue.Binary) {
                if(value.isMultiply()) {
                    val fieldMul = value.asFieldMul()
                    if(fieldMul != null && fieldMuls.add(fieldMul.ldc)) {
                        multipliers.unsolvedMultipliers.remove(fieldMul.field.id,
                            Multiplier.decoder(fieldMul.ldc.number)
                        )
                        multipliers.fieldMultipliers.add(FieldMultiplier(putter.id, fieldMul.field.id, fieldMul.ldc.number))
                        return
                    }
                }

                if(!value.isMultiply() && !value.isAdd()) return
                val a = value.a
                val b = value.b

                var ldc: MulValue? = null
                var other: MulValue? = null
                if(a.isLdc()) {
                    ldc = a
                    other = b
                } else if(b.isLdc()) {
                    ldc = b
                    other = a
                }

                if(ldc != null && other != null) {
                    val number = ldc.number
                    if(number.isMultiplier() && ldcMuls.add(ldc)) {
                        val getter = putters[other]
                        if(getter == null) {
                            multipliers.unsolvedMultipliers.put(putter.id, Multiplier.encoder(number))
                        } else {
                            multipliers.fieldMultipliers.add(FieldMultiplier(putter.id, getter.id, number))
                        }
                    }
                    if(value.isMultiply()) return
                }

                if(a is MulValue.Binary) distribute(putter, a)
                if(b is MulValue.Binary) distribute(putter, b)
            }

            private fun MulValue.Binary.asFieldMul(): FieldMul? {
                var ldc: MulValue? = null
                var field: MulValue? = null
                if(a.isLdc() && b.isFieldGetter()) {
                    ldc = a
                    field = b
                } else if(b.isLdc() && a.isFieldGetter()) {
                    ldc = b
                    field = a
                }
                if(ldc != null && field != null) {
                    if(ldc.number.isMultiplier()) return FieldMul(field, ldc)
                }
                return null
            }

            private data class LdcMul(val a: MulValue, val b: MulValue)
            private data class FieldMul(val field: MulValue, val ldc: MulValue)

            private val SourceValue.insn: AbstractInsnNode? get() = insns.singleOrNull()
            private fun MulValue.isLdc() = src.insn.let { it != null && it is LdcInsnNode && (it.cst is Int || it.cst is Long) }
            private fun MulValue.isFieldGetter() = src.insn.let { it != null && it.opcode in arrayOf(GETSTATIC, GETFIELD) }
            private fun MulValue.isMultiply() = src.insn.let { it != null && it.opcode in arrayOf(IMUL, LMUL) }
            private fun MulValue.isAdd() = src.insn.let { it != null && it.opcode in arrayOf(IADD, LADD, ISUB, LSUB) }
            private val MulValue.number get() = src.insns.single().let { it as LdcInsnNode; it.cst as Number }
            private val FieldInsnNode.id get() = "$owner.$name"
            private val MulValue.id get() = src.insns.single().let { it as FieldInsnNode; it.id }

            private fun Number.isMultiplier() = isInvertible(this) && invert(this) != this
        }

        private open class MulValue(val src: SourceValue) : Value {

            override fun getSize() = src.size
            override fun equals(other: Any?) = other is MulValue && src == other.src
            override fun hashCode() = src.hashCode()

            class Binary(src: SourceValue, val a: MulValue, val b: MulValue) : MulValue(src)
        }
    }

    private class MultiplierRemover(private val pool: ClassPool, private val multipliers: MultiplierSolver.Multipliers) {

        var removedCount = 0

        fun run() {
            Logger.info("Removing multipliers...")

            val decoders = multipliers.decoders.mapKeys { it.key }.mapValues { it.value.toLong() }
            pool.classes.forEach { cls ->
                cls.methods.forEach { method ->
                    method.maxStack += 2
                    method.applyDecoders(decoders)
                    method.reduceMathExprs()
                    method.maxStack -= 2
                }
            }

            pool.classes.forEach { cls ->
                cls.methods.forEach { method ->
                    val insns = method.instructions.iterator()
                    while(insns.hasNext()) {
                        val insn = insns.next()
                        if(insn is LdcInsnNode) {
                            if(insn.next.opcode == IMUL && insn.next.next.opcode == LDC && insn.next.next.next.opcode == IMUL) {
                                val ldc1 = insn.number!!
                                val ldc2 = (insn.next.next as LdcInsnNode).number!!
                                val product = ldc1 * ldc2
                                if(product == 1) {
                                    insns.remove()
                                    repeat(3) {
                                        insns.next()
                                        insns.remove()
                                    }
                                    removedCount++
                                }
                            }
                        }
                    }
                }
            }
        }

        private fun MethodNode.applyDecoders(decoders: Map<String, Long>) {
            val insns = instructions
            for(insn in insns.iterator()) {
                if(insn !is FieldInsnNode) continue
                if(insn.desc != INT_TYPE.descriptor && insn.desc != LONG_TYPE.descriptor) continue
                val fieldId = "${insn.owner}.${insn.name}"
                val decoder = decoders[fieldId] ?: continue
                when(insn.opcode) {
                    GETFIELD, GETSTATIC -> {
                        when(insn.desc) {
                            INT_TYPE.descriptor -> {
                                when(insn.next.opcode) {
                                    I2L -> insns.append(insn.next, LdcInsnNode(invert(decoder)), InsnNode(LMUL))
                                    else -> insns.append(insn, LdcInsnNode(invert(decoder.toInt())), InsnNode(IMUL))
                                }
                            }
                            LONG_TYPE.descriptor -> insns.append(insn, LdcInsnNode(invert(decoder)), InsnNode(LMUL))
                            else -> error(insn)
                        }
                        removedCount++
                    }
                    PUTFIELD -> {
                        when(insn.desc) {
                            INT_TYPE.descriptor -> {
                                when(insn.previous.opcode) {
                                    DUP_X1 -> {
                                        insns.prepend(insn.previous, LdcInsnNode(decoder.toInt()), InsnNode(IMUL))
                                        insns.append(insn, LdcInsnNode(invert(decoder.toInt())), InsnNode(IMUL))
                                    }
                                    else -> insns.prepend(insn, LdcInsnNode(decoder.toInt()), InsnNode(IMUL))
                                }
                            }
                            LONG_TYPE.descriptor -> {
                                when(insn.previous.opcode) {
                                    DUP2_X1 -> {
                                        insns.prepend(insn.previous, LdcInsnNode(decoder), InsnNode(LMUL))
                                        insns.append(insn, LdcInsnNode(invert(decoder)), InsnNode(LMUL))
                                    }
                                    else -> insns.prepend(insn, LdcInsnNode(decoder), InsnNode(LMUL))
                                }
                            }
                            else -> error(insn)
                        }
                        removedCount++
                    }
                    PUTSTATIC -> {
                        when(insn.desc) {
                            INT_TYPE.descriptor -> {
                                when(insn.previous.opcode) {
                                    DUP -> {
                                        insns.prepend(insn.previous, LdcInsnNode(decoder.toInt()), InsnNode(IMUL))
                                        insns.append(insn, LdcInsnNode(invert(decoder.toInt())), InsnNode(IMUL))
                                    }
                                    else -> insns.prepend(insn, LdcInsnNode(decoder.toInt()), InsnNode(IMUL))
                                }
                            }
                            LONG_TYPE.descriptor -> {
                                when(insn.previous.opcode) {
                                    DUP2 -> {
                                        insns.prepend(insn.previous, LdcInsnNode(decoder), InsnNode(LMUL))
                                        insns.append(insn, LdcInsnNode(invert(decoder)), InsnNode(LMUL))
                                    }
                                    else -> insns.prepend(insn, LdcInsnNode(decoder), InsnNode(LMUL))
                                }
                            }
                            else -> error(insn)
                        }
                        removedCount++
                    }
                }
            }
        }

        private fun MethodNode.reduceMathExprs() {
            val insns = instructions
            val interp = MultiplierRemoverInterpreter()
            Analyzer(interp).analyze(cls.name, this)
            for(mul in interp.constantMulExprs) {
                when(mul.insn.opcode) {
                    IMUL -> insns.associateMultiplication(mul, 1)
                    LMUL -> insns.associateMultiplication(mul, 1L)
                    else -> error(mul)
                }
            }
        }

        private fun InsnList.associateMultiplication(mul: Expr.Mul, num: Int) {
            val number = num * mul.ldc.number.toInt()
            val other = mul.other
            when {
                other is Expr.Mul -> {
                    this.delete(mul.insn, mul.ldc.insn)
                    associateMultiplication(other, number)
                }
                other is Expr.Ldc -> {
                    this.delete(mul.insn, mul.ldc.insn)
                    this.replace(other.insn, loadInt(number * other.number.toInt()))
                }
                other is Expr.Add -> {
                    this.delete(mul.insn, mul.ldc.insn)
                    distributeAddition(other.a, number)
                    distributeAddition(other.b, number)
                }
                number == 1 -> this.delete(mul.insn, mul.ldc.insn)
                else -> this.replace(mul.ldc.insn, loadInt(number))
            }
        }

        private fun InsnList.associateMultiplication(mul: Expr.Mul, num: Long) {
            val number = num * mul.ldc.number.toLong()
            val other = mul.other
            when {
                other is Expr.Mul -> {
                    this.delete(mul.insn, mul.ldc.insn)
                    associateMultiplication(other, number)
                }
                other is Expr.Ldc -> {
                    this.delete(mul.insn, mul.ldc.insn)
                    this.replace(other.insn, loadLong(number * other.number.toLong()))
                }
                other is Expr.Add -> {
                    this.delete(mul.insn, mul.ldc.insn)
                    distributeAddition(other.a, number)
                    distributeAddition(other.b, number)
                }
                number == 1L -> this.delete(mul.insn, mul.ldc.insn)
                else -> this.replace(mul.ldc.insn, loadLong(number))
            }
        }

        private fun InsnList.distributeAddition(expr: Expr, num: Int) {
            when(expr) {
                is Expr.Ldc -> this.replace(expr.insn, loadInt(num * expr.number.toInt()))
                is Expr.Mul -> associateMultiplication(expr, num)
                else -> error(expr)
            }
        }

        private fun InsnList.distributeAddition(expr: Expr, num: Long) {
            when(expr) {
                is Expr.Ldc -> this.replace(expr.insn, loadLong(num * expr.number.toLong()))
                is Expr.Mul -> associateMultiplication(expr, num)
                else -> error(expr)
            }
        }

        fun AbstractInsnNode.isIf(): Boolean {
            return this is JumpInsnNode && opcode != GOTO
        }

        fun AbstractInsnNode.isReturn(): Boolean = when(opcode) {
            in IRETURN..RETURN -> true
            else -> false
        }

        fun AbstractInsnNode.pushesInt(): Boolean = when(opcode) {
            LDC -> (this as LdcInsnNode).cst is Int
            SIPUSH, BIPUSH -> true
            in ICONST_M1..ICONST_5 -> true
            else -> false
        }

        val AbstractInsnNode.pushedInt: Int get() = when {
            opcode in 2..8 -> opcode - 3
            opcode == BIPUSH || opcode == SIPUSH -> (this as IntInsnNode).operand
            this is LdcInsnNode && cst is Int -> cst as Int
            else -> throw IllegalStateException()
        }

        fun loadInt(n: Int): AbstractInsnNode = when (n) {
            in -1..5 -> InsnNode(n + 3)
            in Byte.MIN_VALUE..Byte.MAX_VALUE -> IntInsnNode(BIPUSH, n)
            in Short.MIN_VALUE..Short.MAX_VALUE -> IntInsnNode(SIPUSH, n)
            else -> LdcInsnNode(n)
        }

        fun loadLong(n: Long): AbstractInsnNode = when (n) {
            0L, 1L -> InsnNode((n + 9).toInt())
            else -> LdcInsnNode(n)
        }

        private class MultiplierRemoverInterpreter : Interpreter<Expr>(ASM9) {

            private val inter = SourceInterpreter()
            private val mulExprs = LinkedHashMap<AbstractInsnNode, Expr.Mul>()

            val constantMulExprs: Collection<Expr.Mul> get() {
                val exprs = LinkedHashSet<Expr.Mul>()
                mulExprs.values.forEach { expr ->
                    val other = expr.other
                    if(other is Expr.Mul) {
                        exprs.remove(other)
                    }
                    if(other is Expr.Add && other.a is Expr.Mul) {
                        exprs.remove(other.a)
                    }
                    if(other is Expr.Add && other.b is Expr.Mul) {
                        exprs.remove(other.b)
                    }
                    exprs.add(expr)
                }
                return exprs
            }

            override fun newValue(type: Type?) = inter.newValue(type)?.let { Expr.Var(it) }

            override fun returnOperation(insn: AbstractInsnNode?, value: Expr?, expected: Expr?) {}

            override fun newOperation(insn: AbstractInsnNode): Expr {
                val sv = inter.newOperation(insn)
                return when(insn.opcode) {
                    LDC -> {
                        val cst = (insn as LdcInsnNode).cst
                        when(cst) {
                            is Int, is Long -> Expr.Ldc(sv, cst as Number)
                            else -> Expr.Var(sv)
                        }
                    }
                    ICONST_0, LCONST_0 -> Expr.Ldc(sv, 0)
                    ICONST_1, LCONST_1 -> Expr.Ldc(sv, 1)
                    else -> Expr.Var(sv)
                }
            }

            override fun copyOperation(insn: AbstractInsnNode, value: Expr) =
                Expr.Var(inter.copyOperation(insn, value.src))

            override fun unaryOperation(insn: AbstractInsnNode, value: Expr) = inter.unaryOperation(insn, value.src)?.let {
                Expr.Var(
                    it
                )
            }

            override fun naryOperation(insn: AbstractInsnNode, values: MutableList<out Expr>) = inter.naryOperation(insn, emptyList())?.let {
                Expr.Var(it)
            }

            override fun ternaryOperation(insn: AbstractInsnNode, value1: Expr, value2: Expr, value3: Expr): Expr? = null

            override fun binaryOperation(insn: AbstractInsnNode, value1: Expr, value2: Expr): Expr? {
                val sv = inter.binaryOperation(insn, value1.src, value2.src) ?: return null
                if(value1 == value2) return Expr.Var(sv)
                return when(insn.opcode) {
                    IMUL, LMUL -> {
                        if(value1 !is Expr.Ldc && value2 !is Expr.Ldc) {
                            Expr.Var(sv)
                        } else {
                            Expr.Mul(sv, value1, value2).also {
                                mulExprs[insn] = it
                            }
                        }
                    }
                    IADD, ISUB, LADD, LSUB -> {
                        if((value1 is Expr.Ldc || value1 is Expr.Mul) && (value2 is Expr.Ldc || value2 is Expr.Mul)) {
                            Expr.Add(sv, value1, value2)
                        } else {
                            Expr.Var(sv)
                        }
                    }
                    else -> Expr.Var(sv)
                }
            }

            override fun merge(value1: Expr, value2: Expr): Expr {
                if(value1 == value2) {
                    return value1
                } else if(value1 is Expr.Mul && value2 is Expr.Mul && value1.insn == value2.insn) {
                    if(value1.a == value2.a && value1.a is Expr.Ldc) {
                        return Expr.Mul(value1.src, value1.a, merge(value1.b, value2.b))
                            .also { mulExprs[value1.insn] = it }
                    } else if(value1.b == value2.b && value1.b is Expr.Ldc) {
                        return Expr.Mul(value1.src, merge(value1.a, value2.a), value1.b)
                            .also { mulExprs[value1.insn] = it }
                    }
                } else if(value1 is Expr.Add && value2 is Expr.Add && value1.insn == value2.insn) {
                    if(value1.a == value2.a && value1.a !is Expr.Var) {
                        val bb = merge(value1.b, value2.b)
                        if(bb is Expr.Ldc || bb is Expr.Mul) {
                            return Expr.Add(value1.src, value1.a, bb)
                        }
                    }  else if(value1.b == value2.b && value2.b !is Expr.Var) {
                        val aa = merge(value1.a, value2.a)
                        if(aa is Expr.Ldc || aa is Expr.Mul) {
                            return Expr.Add(value1.src, aa, value1.b)
                        }
                    }
                }
                if(value1 is Expr.Mul) mulExprs.remove(value1.insn)
                if(value2 is Expr.Mul) mulExprs.remove(value2.insn)
                return Expr.Var(inter.merge(value1.src, value2.src))
            }
        }

        private sealed class Expr : Value {
            abstract val src: SourceValue

            override fun getSize() = src.size
            val insn get() = src.insns.single()

            data class Var(override val src: SourceValue) : Expr() {
                override fun toString() = "(#${src.hashCode().toString(16)})"
            }

            data class Ldc(override val src: SourceValue, val number: Number) : Expr() {
                override fun toString() = "($number)"
            }

            data class Mul(override val src: SourceValue, val a: Expr, val b: Expr) : Expr() {
                val ldc get() = a as? Ldc ?: b as Ldc
                val other get() = if(ldc == a) b else a
                override fun toString() = "($a*$b)"
            }

            data class Add(override val src: SourceValue, val a: Expr, val b: Expr) : Expr() {
                override fun toString() = "($a${if(insn.opcode in arrayOf(IADD, LADD)) "+" else "-"}$b)"
            }
        }

        private val LdcInsnNode.number: Int? get() = if(cst is Int) cst as Int else null
        private fun Number.isMultiplier() = isInvertible(this) && invert(this) != this
    }

    companion object {

        private val SHIFT_32 = BigInteger.ONE.shiftLeft(32)
        private val SHIFT_64 = BigInteger.ONE.shiftLeft(64)

        fun invert(number: Int): Int = number.toBigInteger().modInverse(SHIFT_32).toInt()
        fun invert(number: Long): Long = number.toBigInteger().modInverse(SHIFT_64).toLong()

        fun invert(number: Number): Number = when(number) {
            is Int -> invert(number)
            is Long -> invert(number)
            else -> error(number)
        }

        fun isInvertible(number: Int) = number and 1 == 1
        fun isInvertible(number: Long) = isInvertible(number.toInt())

        fun isInvertible(number: Number) = when(number) {
            is Int -> isInvertible(number)
            is Long -> isInvertible(number)
            else -> error(number)
        }
    }
}