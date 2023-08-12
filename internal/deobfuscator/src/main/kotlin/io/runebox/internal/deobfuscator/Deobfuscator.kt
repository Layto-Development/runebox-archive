package io.runebox.internal.deobfuscator

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file
import io.runebox.internal.asm.tree.ClassPool
import io.runebox.internal.asm.tree.ignored
import org.tinylog.kotlin.Logger
import kotlin.reflect.full.createInstance

class Deobfuscator : CliktCommand(
    name = "deobfuscate",
    invokeWithoutSubcommand = true,
    printHelpOnEmptyArgs = true
) {

    private val inputJar by argument("input-jar", help = "Obfuscated input jar").file(canBeDir = false, mustExist = true)
    private val outputJar by argument("output-jar", help = "Deobfuscated output jar").file(canBeDir = false)
    private val runTestClient by option("--test", "-t", help = "Run the test client after deob").flag(default = false)
    private val includeDependencies by option("--dependencies", "-d", help = "Include gamepack dependencies when writing").flag(default = false)

    private val transformers = mutableListOf<Transformer>()
    private val pool = ClassPool()

    private fun init() {
        Logger.info("Initializing.")

        /*
         * Register all transformers.
         */

        Logger.info("Found ${transformers.size} bytecode transformers.")

        Logger.info("Loading classes from input jar: ${inputJar.path}.")

        pool.addJarClasses(inputJar)
        pool.classes.forEach { cls ->
            if(cls.name.startsWith("org/")) {
                cls.ignored = true
            }
        }
        pool.init()

        Logger.info("Successfully loaded ${pool.classes.size} classes from jar.")
    }

    override fun run() {
        this.init()

        Logger.info("Starting deobfuscation.")

        val start = System.currentTimeMillis()
        transformers.forEach { transformer ->
            Logger.info("Running transformer: ${transformer::class.simpleName}.")
            transformer.run(pool)
        }
        val delta = System.currentTimeMillis() - start
        Logger.info("Completed deobfuscation of classes. (Time ${(delta / 1000)} seconds)")

        Logger.info("Exporting deobfuscated classes to jar: ${outputJar.path}.")
        pool.writeJarFile(outputJar)

        if(runTestClient) {
            Logger.info("Starting test client using output jar file.")
            TestClient(outputJar).start()
        }

        Logger.info("Deobfuscator completed successfully.")
    }

    private inline fun <reified T : Transformer> register() {
        transformers.add(T::class.createInstance())
    }
}

fun main(args: Array<String>) = Deobfuscator().main(args)