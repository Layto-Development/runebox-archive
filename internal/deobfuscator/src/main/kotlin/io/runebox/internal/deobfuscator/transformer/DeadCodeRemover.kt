package io.runebox.internal.deobfuscator.transformer

import io.runebox.internal.deobfuscator.Transformer
import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.cls
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.TryCatchBlockNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.tinylog.kotlin.Logger

class DeadCodeRemover : Transformer {

    private var count = 0

    override fun run(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                var changed: Boolean

                do {
                    changed = false

                    val frames = Analyzer(BasicInterpreter()).analyze(method.cls.name, method)
                    val insns = method.instructions.iterator()
                    var i = 0

                    while(insns.hasNext()) {
                        val insn = insns.next()
                        val frame = frames[i++]

                        if(frame != null || insn is LabelNode) {
                            continue
                        }

                        insns.remove()
                        count++
                        changed = true
                    }
                    changed = changed or method.tryCatchBlocks.removeIf { it.isBodyEmpty() }
                } while(changed)
            }
        }

        Logger.info("Removed $count dead-code instructions.")
    }

    private fun TryCatchBlockNode.isBodyEmpty(): Boolean {
        var cur = start.next
        while(true) {
            when {
                cur == null -> error("Try-catch block has invalid end.")
                cur === end -> return true
                cur.opcode != -1 -> return false
                else -> cur = cur.next
            }
        }
    }
}