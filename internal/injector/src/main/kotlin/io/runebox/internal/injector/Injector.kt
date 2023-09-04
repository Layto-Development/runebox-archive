package io.runebox.internal.injector

import io.runebox.internal.injector.annotations.Mixin
import io.runebox.internal.injector.asm.ClassPool
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger
import java.io.File

class Injector(
    private val clientJar: File,
    private val mixinsJar: File,
    private val outputJar: File
) {

    private val mixinPool = ClassPool()
    private val clientPool = ClassPool()

    private fun init() {
        Logger.info("Initializing injector.")

        Logger.info("Loading classes client jar.")
        clientPool.readJar(clientJar)

        Logger.info("Loading classes from mixin jar.")
        mixinPool.readJar(mixinsJar)
    }

    fun inject() {
        this.init()

        Logger.info("Starting mixin injections.")

        val pairings = pairClasses(mixinPool, clientPool)

        Logger.info("Completed mixin injections.")
    }

    private fun pairClasses(mixinPool: ClassPool, clientPool: ClassPool): HashMap<ClassNode, ClassNode> {
        val pairs = hashMapOf<ClassNode, ClassNode>()
        mixinPool.classes.forEach { srcCls ->
            val mixinCls = srcCls.readAnnotation<Mixin>()
            if(mixinCls != null) {
                val targetName = mixinCls.replace(RSAPI_BASE, "").substring(2)
                val targetCls = clientPool.getClass(targetName) ?: return@forEach
                pairs[srcCls] = targetCls
            }
        }
        return pairs
    }

    private inline fun <reified T> ClassNode.readAnnotation(): String? {
        val types = this.visibleAnnotations
            .asSequence()
            .filter { it.desc == Type.getDescriptor(T::class.java) }
            .map { it.values }
            .filter { it.size == 2 }
            .map { it[1] }
            .map { v -> when(v) {
                is Type -> v.internalName
                else -> v.toString()
            } }.toList()
        if(types.size != 1) return null
        return types[0].replace(".", "/")
    }

    companion object {

        internal const val RSAPI_BASE = "io/runebox/internal/gamepack/api/"

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: <gamepack-jar> <mixins-jar> <output-jar>")
            val gamepackJar = File(args[0])
            val mixinsJar = File(args[1])
            val outputJar = File(args[2])
            Injector(gamepackJar, mixinsJar, outputJar).inject()
        }
    }
}