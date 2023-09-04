package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import org.objectweb.asm.Opcodes.POP
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.tinylog.kotlin.Logger

class GetPathErrorFixer : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        var visitedCount = 0
        pool.classes.forEach { cls ->
            for(method in cls.methods) {
                val insns = method.instructions.toArray()
                for(insn in insns) {
                    if(insn !is MethodInsnNode) continue
                    if(insn.name != "getPath") continue
                    if(++visitedCount == 2) {
                        val pop = InsnNode(POP)
                        val ldc = LdcInsnNode("")
                        method.instructions.insert(insn, pop)
                        method.instructions.insert(pop, ldc)
                        method.instructions.remove(insn)
                        count++
                        break
                    }
                }
            }
        }

        Logger.info("Fixed $count getPath() method calls.")
    }
}