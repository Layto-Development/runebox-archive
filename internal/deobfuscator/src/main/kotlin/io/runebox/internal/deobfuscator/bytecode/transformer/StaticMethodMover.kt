package io.runebox.internal.deobfuscator.bytecode.transformer

import com.google.common.collect.Iterables
import com.google.common.collect.TreeMultimap
import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import org.tinylog.kotlin.Logger
import java.util.*

class StaticMethodMover : BytecodeTransformer {

    private var count = 0

    private val duplicateMethodsMap = TreeMultimap.create<String, String>()
    private val origMethodOwnersMap = TreeMap<String, String>()

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(!method.isStatic() && !method.isInitializer()) return@methodLoop
                duplicateMethodsMap.put(method.fingerprint, "${cls.name}.${method.name}${method.desc}")
            }
        }

        duplicateMethodsMap.asMap().entries.removeIf { it.value.size == 1 }
        val duplicateMethods = duplicateMethodsMap.asMap().values.sortedBy { it.first() }

        pool.classes.forEach { cls ->
            for(method in cls.methods) {
                val dups = duplicateMethods.firstOrNull { it.contains(method.id) } ?: continue
                val classNames = dups.minus(method.id).map { it.split(".").first() }.distinct()
                val realClassName = classNames.first()
                if(cls.name == realClassName) continue
                origMethodOwnersMap[method.id] = realClassName
            }
        }

        val methodNameMap = pool.classes.flatMap { it.methods }.associateBy { it.id }
        val movedMethods = hashSetOf<MethodNode>()

        origMethodOwnersMap.forEach { (src, orig) ->
            val srcMethod = methodNameMap[src] ?: return@forEach
            val origCls = pool.getClass(orig) ?: return@forEach

            val exceptions = Iterables.toArray(srcMethod.exceptions, String::class.java)
            val movedMethod = MethodNode(srcMethod.access, srcMethod.name, srcMethod.desc, srcMethod.signature, exceptions)
            srcMethod.accept(movedMethod)
            origCls.methods.add(movedMethod)

            movedMethod.init(origCls)
            placedMethods.add(movedMethod.id)

            movedMethods.add(movedMethod)
            count++
        }

        val movedMethodsNameMap = movedMethods.associateBy { it.id }
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val insns = method.instructions.iterator()
                while(insns.hasNext()) {
                    val insn = insns.next()
                    if(insn !is MethodInsnNode) continue
                    val identifier = "${insn.owner}.${insn.name}${insn.desc}"
                    if(origMethodOwnersMap.containsKey(identifier)) {
                        val origCls = origMethodOwnersMap[identifier] ?: continue
                        insn.owner = origCls
                        count++
                    }
                }
            }
        }

        origMethodOwnersMap.keys.mapNotNull { methodNameMap[it] }.forEach { method ->
            method.cls.methods.remove(method)
            count++
        }

        pool.init()

        Logger.info("Moved $count static methods to their original classes.")
    }

    private val MethodNode.fingerprint: String get() = "${Type.getReturnType(desc)}.${(instructions.lineNumberRange ?: "*")}.${instructions.hash}"

    private val InsnList.lineNumberRange: IntRange? get() {
        val lineNumbers = iterator().asSequence().mapNotNull { it as? LineNumberNode }.mapNotNull { it.line }.toList()
        if(lineNumbers.isEmpty()) return null
        return lineNumbers.first()..lineNumbers.last()
    }

    private val InsnList.hash: Int get() = iterator().asSequence().mapNotNull {
        when(it) {
            is FieldInsnNode -> "${it.owner}.${it.name}:${it.opcode}"
            is MethodInsnNode -> "${it.opcode}:${it.owner}.${it.name}"
            is JumpInsnNode -> "${it.opcode}"
            is TypeInsnNode -> it.desc
            else -> null
        }
    }.toSet().hashCode()

    companion object {
        internal val placedMethods = hashSetOf<String>()
    }
}