package io.runebox.internal.injector

import com.google.common.reflect.ClassPath
import io.runebox.internal.injector.annotations.Mixin
import io.runebox.internal.injector.asm.ClassPool
import io.runebox.internal.injector.asm.ignored
import io.runebox.internal.injector.util.AsmUtil
import io.runebox.internal.injector.util.AsmUtil.MIXIN_BASE
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.tinylog.kotlin.Logger
import java.io.File
import java.lang.reflect.Modifier

class Injector(
    private val mixinsJar: File,
    private val clientJar: File,
    private val outputJar: File
) {

    val mixinPool = ClassPool(this)
    val clientPool = ClassPool(this)

    private fun init() {
        Logger.info("Loading mixin and client classes from jar files.")

        mixinPool.readJar(mixinsJar)
        clientPool.readJar(clientJar)

        clientPool.classes.filter { it.name.startsWith("org/") }.forEach { cls ->
            cls.ignored = true
        }
    }

    fun inject() {
        this.init()

        val mixins = findMixins()
        val injectors = findTransformers()
        val visitor = MixinInjectionVisitor(injectors)
        val results = mutableListOf<ClassNode>()

        Logger.info("Running mixin injections.")

        mixins.forEach { mixin ->
            Logger.info("Injecting mixin: ${mixin.mixinCls.name.replace(MIXIN_BASE, "")} -> ${mixin.clientCls.name}.")
            mixin.accept(visitor)
            results.add(mixin.result())
        }

        Logger.info("Saving injected client classes to output jar.")

        clientPool.writeJar(outputJar, includeIgnored = true)

        Logger.info("Injector completed successfully.")
    }

    private fun findMixins(): List<MixinInjection> {
        Logger.info("Loading injector mixins.")

        val nodes = mutableListOf<MixinInjection>()
        mixinPool.classes.forEach { mixinCls ->
            val apiClsName = mixinCls.readAnnotation<Mixin>() ?: return@forEach
            val clientClsName = apiClsName.replace(AsmUtil.API_BASE, "")
            val clientCls = clientPool.getClass(clientClsName) ?: error("Failed to find client class $clientClsName. [api-class: $apiClsName, mixin-class: ${mixinCls.name}]")
            nodes.add(MixinInjection(mixinCls, clientCls))
        }
        return nodes
    }

    private fun findTransformers(): List<InjectionVisitor> {
        Logger.info("Loading injector transformers.")

        val transformers = mutableListOf<InjectionVisitor>()
        ClassPath.from(Injector::class.java.classLoader).getTopLevelClassesRecursive("io.runebox.internal.injector.transformers")
            .map { it.name }
            .forEach { clsName ->
                try {
                    val clazz = Class.forName(clsName)
                    if(InjectionVisitor::class.java.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.modifiers)) {
                        transformers.add(clazz.getDeclaredConstructor().newInstance() as InjectionVisitor)
                    }
                } catch (e: Exception) {
                    Logger.warn(e) { "Failed to load injector transformer: $clsName." }
                }
            }
        return transformers
    }

    private inline fun <reified T> ClassNode.readAnnotation(): String? {
        if(visibleAnnotations == null) { visibleAnnotations = mutableListOf() }
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

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: <mixins-jar> <client-jar> <output-jar>")
            val mixinsJar = File(args[0])
            val clientJar = File(args[1])
            val outputJar = File(args[2])
            Injector(mixinsJar, clientJar, outputJar).inject()
        }
    }
}