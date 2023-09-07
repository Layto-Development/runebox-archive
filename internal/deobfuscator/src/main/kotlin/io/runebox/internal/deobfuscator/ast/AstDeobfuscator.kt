package io.runebox.internal.deobfuscator.ast

import io.runebox.internal.deobfuscator.ast.transformer.EncloseTransformer
import io.runebox.internal.deobfuscator.ast.transformer.NegativeLiteralTransformer
import io.runebox.internal.deobfuscator.ast.transformer.UnencloseTransformer
import org.tinylog.kotlin.Logger
import java.io.File
import kotlin.reflect.full.createInstance

class AstDeobfuscator(private val inputDir: File, private val outputDir: File) {

    private val transformers = mutableListOf<AstTransformer>()
    private lateinit var module: Module

    private fun init() {
        Logger.info("Initializing AST deobfuscator.")
        transformers.clear()

        register<UnencloseTransformer>()
        register<NegativeLiteralTransformer>()
        register<EncloseTransformer>()

        Logger.info("Registered ${transformers.size} AST transformers.")

        /*
         * Parse the input directory source files into an AST module.
         */
        module = Module.parse(inputDir.toPath())
    }

    fun run() {
        this.init()

        Logger.info("Running AST transformers.")

        transformers.forEach { transformer ->
            Logger.info("Running transformer: ${transformer::class.simpleName}.")
            transformer.run(module)
        }
        Logger.info("Completed all AST transformers.")

        module.save()

        if(module.path != outputDir.toPath()) {
            Logger.info("Copying transformed sources to output directory.")
            module.path.toFile().copyRecursively(outputDir)
        }

        Logger.info("Successfully completed AST deobfuscator.")
    }

    @DslMarker
    private annotation class RegisterDsl

    @RegisterDsl
    private inline fun <reified T : AstTransformer> register() {
        transformers.add(T::class.createInstance())
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 2) error("Usage: <input-dir> <output-dir>")

            val inputDir = File(args[0])
            val outputDir = File(args[1])
            AstDeobfuscator(inputDir, outputDir).run()
        }
    }
}