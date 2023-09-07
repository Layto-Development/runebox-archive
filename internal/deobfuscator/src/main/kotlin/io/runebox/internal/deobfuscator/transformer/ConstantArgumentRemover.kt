package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.*
import io.runebox.internal.deobfuscator.asm.analysis.IntInterpreter
import io.runebox.internal.deobfuscator.asm.analysis.IntValueSet
import io.runebox.internal.deobfuscator.asm.classpath.*
import io.runebox.util.DisjointSet
import io.runebox.util.UniqueQueue
import org.objectweb.asm.Opcodes.*

import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.objectweb.asm.tree.analysis.Analyzer
import org.tinylog.kotlin.Logger

class ConstantArgumentRemover : Transformer {

    private val pendingMethods = UniqueQueue<MemberRef>()
    private val arglessMethods = mutableSetOf<DisjointSet.Partition<MemberRef>>()
    private val argValues = mutableMapOf<ArgPartition, IntValueSet>()
    private lateinit var inheritedMethodSets: DisjointSet<MemberRef>
    private lateinit var entryPoints: MemberFilter
    private var branchesSimplified = 0
    private var constantsPropagated = 0

    override fun run(pool: ClassPool) {
        val classPath = pool.classPath

        pendingMethods.clear()
        arglessMethods.clear()
        argValues.clear()
        inheritedMethodSets = classPath.createHierarchyMethodSets()
        entryPoints = UnionMemberFilter(ENTRY_POINTS, ReflectedConstructorFilter.create(classPath))
        branchesSimplified = 0
        constantsPropagated = 0

        queueEntryPoints(classPath)

        while (true) {
            val method = pendingMethods.removeFirstOrNull() ?: break
            analyzeMethod(classPath, method)
        }

        pool.classes.flatMap { it.methods }.forEach { method ->
            val args = getArgs(MemberRef(method.cls, method))
            branchesSimplified += simplifyBranches(method.cls, method, args)
            constantsPropagated += propagateConstantArgs(classPath, method.cls, method, args)
        }

        Logger.info("Simplified $branchesSimplified branches and propagated $constantsPropagated constants")
    }

    private fun queueEntryPoints(classPath: ClassPath) {
        for (partition in inheritedMethodSets) {
            if (isEntryPoint(classPath, partition)) {
                pendingMethods.addAll(partition)
            }
        }
    }

    private fun isEntryPoint(classPath: ClassPath, partition: DisjointSet.Partition<MemberRef>): Boolean {
        for (method in partition) {
            val clazz = classPath[method.owner]!!

            if (entryPoints.matches(method) || clazz.isDependency) {
                return true
            }
        }

        return false
    }

    private fun analyzeMethod(classPath: ClassPath, ref: MemberRef) {
        // find ClassNode/MethodNode
        val owner = classPath.getClassNode(ref.owner) ?: return
        val originalMethod = owner.methods.singleOrNull { it.name == ref.name && it.desc == ref.desc } ?: return
        if (!originalMethod.hasCode) {
            return
        }

        val method = originalMethod.copy()

        // find existing constant arguments
        val args = getArgs(ref)

        // simplify branches
        simplifyBranches(owner, method, args)

        addArgValues(owner, method, args)
    }

    private fun getArgs(ref: MemberRef): Array<IntValueSet> {
        val partition = inheritedMethodSets[ref]!!
        val size = Type.getArgumentTypes(ref.desc).sumOf { it.size }
        return Array(size) { i -> argValues[ArgPartition(partition, i)] ?: IntValueSet.Unknown }
    }

    private fun addArgValues(owner: ClassNode, method: MethodNode, args: Array<IntValueSet>) {
        val analyzer = Analyzer(IntInterpreter(args))
        val frames = analyzer.analyze(owner.name, method)
        for ((i, frame) in frames.withIndex()) {
            if (frame == null) {
                continue
            }

            val insn = method.instructions[i]
            if (insn !is MethodInsnNode) {
                continue
            }

            val invokedMethod = inheritedMethodSets[MemberRef(insn)] ?: continue
            val size = Type.getArgumentTypes(insn.desc).size

            var index = 0
            for (j in 0 until size) {
                val value = frame.getStack(frame.stackSize - size + j)
                if (addArgValues(ArgPartition(invokedMethod, index), value.set)) {
                    pendingMethods.addAll(invokedMethod)
                }
                index += value.size
            }

            if (size == 0 && arglessMethods.add(invokedMethod)) {
                pendingMethods.addAll(invokedMethod)
            }
        }
    }

    private fun addArgValues(partition: ArgPartition, value: IntValueSet): Boolean {
        val old = argValues[partition]

        val new = if (value.singleton != null) {
            if (old != null) {
                old union value
            } else {
                value
            }
        } else {
            IntValueSet.Unknown
        }
        argValues[partition] = new

        return old != new
    }

    private fun simplifyBranches(owner: ClassNode, method: MethodNode, args: Array<IntValueSet>): Int {
        val analyzer = Analyzer(IntInterpreter(args))
        val frames = analyzer.analyze(owner.name, method)

        val alwaysTakenBranches = mutableListOf<JumpInsnNode>()
        val neverTakenBranches = mutableListOf<JumpInsnNode>()

        frame@ for ((i, frame) in frames.withIndex()) {
            if (frame == null) {
                continue
            }

            val insn = method.instructions[i]
            if (insn !is JumpInsnNode) {
                continue
            }

            when (insn.opcode) {
                IFEQ, IFNE, IFLT, IFGE, IFGT, IFLE -> {
                    val value = frame.getStack(frame.stackSize - 1)
                    if (value.set !is IntValueSet.Constant) {
                        continue@frame
                    }

                    when (IntBranch.evaluateUnary(insn.opcode, value.set.values)) {
                        IntBranchResult.ALWAYS_TAKEN -> alwaysTakenBranches += insn
                        IntBranchResult.NEVER_TAKEN -> neverTakenBranches += insn
                        else -> Unit
                    }
                }

                IF_ICMPEQ, IF_ICMPNE, IF_ICMPLT, IF_ICMPGE, IF_ICMPGT, IF_ICMPLE -> {
                    val value1 = frame.getStack(frame.stackSize - 2)
                    val value2 = frame.getStack(frame.stackSize - 1)
                    if (value1.set !is IntValueSet.Constant || value2.set !is IntValueSet.Constant) {
                        continue@frame
                    }

                    when (IntBranch.evaluateBinary(insn.opcode, value1.set.values, value2.set.values)) {
                        IntBranchResult.ALWAYS_TAKEN -> alwaysTakenBranches += insn
                        IntBranchResult.NEVER_TAKEN -> neverTakenBranches += insn
                        else -> Unit
                    }
                }
            }
        }

        var simplified = 0

        for (insn in alwaysTakenBranches) {
            val replacement = JumpInsnNode(GOTO, insn.label)
            if (method.instructions.replaceExpression(insn, replacement, AbstractInsnNode::isPure)) {
                simplified++
            }
        }

        for (insn in neverTakenBranches) {
            if (method.instructions.deleteExpression(insn, AbstractInsnNode::isPure)) {
                simplified++
            }
        }

        return simplified
    }

    private fun propagateConstantArgs(
        classPath: ClassPath,
        clazz: ClassNode,
        method: MethodNode,
        args: Array<IntValueSet>
    ): Int {
        val partition = inheritedMethodSets[MemberRef(clazz, method)]!!
        if (!isRenamable(classPath, partition)) {
            return 0
        }

        val analyzer = Analyzer(IntInterpreter(args))
        val frames = analyzer.analyze(clazz.name, method)

        val constInsns = mutableMapOf<AbstractInsnNode, Int>()

        for ((i, frame) in frames.withIndex()) {
            if (frame == null) {
                continue
            }

            val insn = method.instructions[i]
            if (insn.intConstant != null) {
                // already constant
                continue
            } else if (!insn.isPure) {
                // can't replace instructions with a side effect
                continue
            } else if (insn.stackMetadata.pushes != 1) {
                // can't replace instructions pushing more than one result
                continue
            }

            // the value pushed by this instruction is held in the following frame
            val nextInsn = insn.nextReal ?: continue
            val nextInsnIndex = method.instructions.indexOf(nextInsn)
            val nextFrame = frames[nextInsnIndex]

            val value = nextFrame.getStack(nextFrame.stackSize - 1)
            val singleton = value.set.singleton
            if (singleton != null) {
                constInsns[insn] = singleton
            }
        }

        var inlined = 0

        for ((insn, value) in constInsns) {
            if (insn !in method.instructions) {
                continue
            }

            val replacement = value.toAbstractInsnNode()
            if (method.instructions.replaceExpression(insn, replacement, AbstractInsnNode::isPure)) {
                inlined++
            }
        }

        return inlined
    }


    data class ArgPartition(val method: DisjointSet.Partition<MemberRef>, val index: Int)

    enum class IntBranchResult {
        ALWAYS_TAKEN, NEVER_TAKEN, UNKNOWN;

        companion object {
            fun fromTakenNotTaken(taken: Int, notTaken: Int): IntBranchResult {
                require(taken != 0 || notTaken != 0)

                return when {
                    taken == 0 -> NEVER_TAKEN
                    notTaken == 0 -> ALWAYS_TAKEN
                    else -> UNKNOWN
                }
            }
        }
    }
    
    object IntBranch {
        fun evaluateUnary(opcode: Int, values: Set<Int>): IntBranchResult {
            require(values.isNotEmpty())

            var taken = 0
            var notTaken = 0

            for (v in values) {
                if (evaluateUnary(opcode, v)) {
                    taken++
                } else {
                    notTaken++
                }
            }

            return IntBranchResult.fromTakenNotTaken(taken, notTaken)
        }

        private fun evaluateUnary(opcode: Int, value: Int): Boolean {
            return when (opcode) {
                IFEQ -> value == 0
                IFNE -> value != 0
                IFLT -> value < 0
                IFGE -> value >= 0
                IFGT -> value > 0
                IFLE -> value <= 0
                else -> throw IllegalArgumentException("Opcode $opcode is not a unary conditional branch instruction")
            }
        }

        fun evaluateBinary(opcode: Int, values1: Set<Int>, values2: Set<Int>): IntBranchResult {
            require(values1.isNotEmpty())
            require(values2.isNotEmpty())

            var taken = 0
            var notTaken = 0

            for (v1 in values1) {
                for (v2 in values2) {
                    if (evaluateBinary(opcode, v1, v2)) {
                        taken++
                    } else {
                        notTaken++
                    }
                }
            }

            return IntBranchResult.fromTakenNotTaken(taken, notTaken)
        }

        private fun evaluateBinary(opcode: Int, value1: Int, value2: Int): Boolean {
            return when (opcode) {
                IF_ICMPEQ -> value1 == value2
                IF_ICMPNE -> value1 != value2
                IF_ICMPLT -> value1 < value2
                IF_ICMPGE -> value1 >= value2
                IF_ICMPGT -> value1 > value2
                IF_ICMPLE -> value1 <= value2
                else -> throw IllegalArgumentException("Opcode $opcode is not a binary conditional branch instruction")
            }
        }
    }

    private fun isRenamable(classPath: ClassPath, partition: DisjointSet.Partition<MemberRef>): Boolean {
        for(method in partition) {
            val cls = classPath[method.owner]!!

            if(EXCLUDED_METHODS.matches(method) || cls.isDependency) {
                return false
            }

            val access = cls.methodModifiers(MemberDesc(method))
            if(access != null && access and ACC_NATIVE != 0) {
                return false
            }
        }

        return true
    }

    companion object {

        private val ENTRY_POINTS = GlobMemberFilter(listOf(
            MemberRef("*", "<clinit>", "*"),
            MemberRef("*", "main", "*"),
            MemberRef("client", "<init>", "*")
        ))

        private val EXCLUDED_METHODS = GlobMemberFilter(listOf(
            MemberRef("*", "<clinit>", "*"),
            MemberRef("*", "<init>", "*"),
            MemberRef("*", "main", "*"),
            MemberRef("*", "quit", "*")
        ))
    }
}