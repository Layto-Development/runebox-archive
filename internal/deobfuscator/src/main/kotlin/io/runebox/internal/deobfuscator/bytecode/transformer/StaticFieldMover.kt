package io.runebox.internal.deobfuscator.bytecode.transformer

import com.google.common.collect.MultimapBuilder
import io.runebox.internal.deobfuscator.bytecode.BytecodeTransformer
import io.runebox.internal.deobfuscator.bytecode.asm.*
import org.objectweb.asm.Opcodes.GETSTATIC
import org.objectweb.asm.Opcodes.PUTSTATIC
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.tinylog.kotlin.Logger

class StaticFieldMover : BytecodeTransformer {

    private var count = 0
    private val fieldWriteOwnerMap = MultimapBuilder.hashKeys().hashSetValues().build<String, String>()
    private val fieldReadOwnerMap = MultimapBuilder.hashKeys().hashSetValues().build<String, String>()

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(method.isInitializer()) return@methodLoop
                for(insn in method.instructions.filter { it.opcode == PUTSTATIC || it.opcode == GETSTATIC }) {
                    insn as FieldInsnNode
                    val key = "${insn.owner} ${insn.name} ${insn.desc}"
                    if(insn.opcode == PUTSTATIC) fieldWriteOwnerMap.put(key, cls.name)
                    else fieldReadOwnerMap.put(key, cls.name)
                }
            }
        }

        val potentials = fieldWriteOwnerMap.asMap().filter { it.value.size == 1 }.map {
            val split = it.key.split(" ")
            pool.getClass(split[0])?.getField(split[1], split[2]) to pool.getClass(it.value.first())
        }.toMutableList()
        potentials.removeIf { it.first == null || it.second == null }
        potentials.removeIf { it.first!!.cls == it.second!! }

        val toMove = mutableMapOf<FieldNode, ClassNode>()
        potentials.forEach { potential ->
            val field = potential.first!!
            val toClass = potential.second!!
            toMove[field] = toClass
            count++
        }

        val itr = toMove.iterator()
        while(itr.hasNext()) {
            val entry = itr.next()
            entry.key.moveField(entry.value)
        }

        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val toRemove = mutableListOf<AbstractInsnNode>()
                val insns = method.instructions
                for(insn in insns) {
                    if(insn !is FieldInsnNode) continue
                    val key = "${insn.owner} ${insn.name} ${insn.desc}"
                    if(key !in movedFieldsMap) continue
                    if(method.isInitializer()) {
                        val expressionInsns = getExpression(insn)!!
                        toRemove.addAll(expressionInsns)
                        pool.getClass(movedFieldsMap[key]!!)!!.getMethod("<clinit>", "()V")!!.instructions.also {
                            expressionInsns.forEach { i -> it.add(i) }
                        }
                    }
                    insn.owner = movedFieldsMap[key]!!
                }
            }
        }

        Logger.info("Moved $count static fields to more-l")
    }

    private val movedFieldsMap = hashMapOf<String, String>()

    private fun FieldNode.moveField(toClass: ClassNode) {
        movedFieldsMap["${cls.name} $name $desc"] = toClass.name
        val toFields = mutableListOf<FieldNode>().also {
            it.addAll(toClass.fields)
            it.add(FieldNode(access, name, desc, signature, value).also { it.init(toClass) })
        }
        toClass.fields = toFields
        this.cls = toClass
        //(cls.fields as MutableList<FieldNode>).remove(this)
    }
}