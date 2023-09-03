package io.runebox.internal.deobfuscator

import io.runebox.internal.deobfuscator.asm.ClassPool
import io.runebox.internal.deobfuscator.asm.ignored
import io.runebox.internal.deobfuscator.transformer.*
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

class Deobfuscator(
    private val inputJar: File,
    private val outputJar: File,
    private val runTestClient: Boolean = false
) {

    private val pool = ClassPool()
    private val transformers = mutableListOf<Transformer>()

    private fun registerTransformers() {
        transformers.clear()

        /**
         * Register bytecode deob transformers in the order they will run.
         */
        register<RuntimeExceptionRemover>()
        register<DeadCodeRemover>()
        register<IllegalStateExceptionRemover>()
        register<DeadCodeRemover>()
        register<ControlFlowNormalizer>()
        register<UniqueRenamer>()
        register<UnusedArgRemover>()
        register<UnusedFieldRemover>()
        register<UnusedMethodRemover>()
        register<VariableExprFixer>()

        Logger.info("Registered ${transformers.size} bytecode transformers.")
    }

    private fun init() {
        Logger.info("Initializing deobfuscator.")

        pool.clear()
        registerTransformers()

        Logger.info("Loading classes from input jar: ${inputJar.name}.")
        pool.readJar(inputJar)
        pool.init()
        pool.classes.filter { it.name.startsWith("org/") }.forEach { it.ignored = true }
        Logger.info("Loaded ${pool.classes.size} classes from jar.")
    }

    fun run() {
        this.init()

        Logger.info("Running bytecode transformers.")
        transformers.forEach { transformer ->
            Logger.info("Running ${transformer::class.simpleName}.")
            transformer.run(pool)
        }
        Logger.info("Completed all bytecode transforms.")

        Logger.info("Saving deobfuscated classes to output jar: ${outputJar.path}.")
        pool.writeJar(outputJar)
        Logger.info("Saved ${pool.classes.size} classes to jar.")

        if(runTestClient) {
            Logger.info("Starting test client using output jar file.")
            TestClient(outputJar).start()
        }

        Logger.info("Deobfuscator completed successfully.")
    }

    @DslMarker
    private annotation class RegisterDsl

    @RegisterDsl
    private inline fun <reified T : Transformer> register() {
        transformers.add(T::class.createInstance())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size < 2) error("Usage: <input-jar> <output-jar> [-t]")

            val inputJar = File(args[0])
            val outputJar = File(args[1])
            val runTestClient = (args.size == 3 && args[2] == "-t")

            Deobfuscator(inputJar, outputJar, runTestClient).run()
        }
    }
}