package io.runebox.internal.deobfuscator.transformer

import com.google.common.collect.MultimapBuilder
import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.*
import org.objectweb.asm.Type
import org.objectweb.asm.Type.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import org.tinylog.kotlin.Logger

class UnusedArgRemover : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        val rootMethods = hashSetOf<String>()
        val opaqueMethodsMap = MultimapBuilder.hashKeys().arrayListValues().build<String, MethodNode>()
        val opaqueMethods = opaqueMethodsMap.asMap()

        pool.classes.forEach { cls ->
            val supers = cls.superClasses
            cls.methods.forEach { method ->
                if(supers.none { it.getMethod(method.name, method.desc) != null }) {
                    rootMethods.add(method.id)
                }
            }
        }

        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                val key = pool.findOverride(method.cls.name, method.name, method.desc, rootMethods) ?: return@methodLoop
                opaqueMethodsMap.put(key, method)
            }
        }

        val itr = opaqueMethods.iterator()
        for((_, method) in itr) {
            if(method.any { !it.hasOpaqueArg() }) itr.remove()
        }

        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                method.instructions.forEach insnLoop@ { insn ->
                    if(insn !is MethodInsnNode) return@insnLoop
                    val key = pool.findOverride(insn.owner, insn.name, insn.desc, opaqueMethods.keys) ?: return@insnLoop
                    if(insn.previous.intConstant == null) opaqueMethods.remove(key)
                }
            }
        }

        opaqueMethodsMap.values().forEach { method ->
            val oldDesc = method.desc
            val newDesc = oldDesc.dropLastArg()
            method.desc = newDesc
            count++
        }

        pool.classes.flatMap { it.methods }.forEach { method ->
            val insns = method.instructions
            for(insn in insns) {
                if(insn !is MethodInsnNode) continue
                if(pool.findOverride(insn.owner, insn.name, insn.desc, opaqueMethods.keys) != null) {
                    insn.desc = insn.desc.dropLastArg()
                    val prev = insn.previous
                    insns.remove(prev)
                }
            }
        }

        Logger.info("Removed $count unused method arguments.")
    }

    private fun String.dropLastArg(): String {
        val type = Type.getMethodType(this)
        return Type.getMethodDescriptor(type.returnType, *type.argumentTypes.copyOf(type.argumentTypes.size - 1))
    }

    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(isStatic()) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    private fun MethodNode.hasOpaqueArg(): Boolean {
        val argTypes = Type.getArgumentTypes(desc)
        if(argTypes.isEmpty()) return false
        val lastArg = argTypes.last()
        if(lastArg !in arrayOf(BYTE_TYPE, SHORT_TYPE, INT_TYPE)) return false
        if(isAbstract()) return true
        instructions.forEach { insn ->
            if(insn !is VarInsnNode) return@forEach
            if(insn.`var` == lastArgIndex) return false
        }
        return name.isObfuscatedName()
    }

    private fun String.isObfuscatedName(): Boolean {
        return arrayOf("class", "method", "field").any { this.startsWith(it) }
    }

    private fun ClassPool.findOverride(owner: String, name: String, desc: String, methods: Set<String>): String? {
        val id = "$owner.$name$desc"
        if(id in methods) return id
        if(name.startsWith("<init>")) return null
        val cls = getClass(owner) ?: return null
        for(superCls in cls.superClasses) {
            return findOverride(superCls.name, name, desc, methods) ?: continue
        }
        return null
    }
}