package io.runebox.internal.deobfuscator.ast

import com.github.javaparser.ParserConfiguration
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.printer.DefaultPrettyPrinter
import com.github.javaparser.printer.configuration.DefaultConfigurationOption
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration
import com.github.javaparser.printer.configuration.Indentation
import com.github.javaparser.symbolsolver.JavaSymbolSolver
import com.github.javaparser.symbolsolver.resolution.typesolvers.ClassLoaderTypeSolver
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver
import com.github.javaparser.utils.SourceRoot
import org.tinylog.kotlin.Logger
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import java.util.function.Function

class Module private constructor(
    val path: Path,
    private val root: SourceRoot
) : Iterable<CompilationUnit> {

    private val units = mutableMapOf<String, CompilationUnit>()

    init {
        for(unit in root.compilationUnits) {
            val name = unit.primaryType.get().fullyQualifiedName.get()
            units[name] = unit
        }
    }

    operator fun get(name: String) = units[name]

    override fun iterator() = units.values.iterator()

    fun save() {
        Logger.info("Saving source module...")
        root.saveAll()
    }

    companion object {

        private val PC_ANNOTATION_REGEX = Regex("@Pc\\(([0-9]+)\\)\\s+")

        private val printer = Function<CompilationUnit, String>(
            DefaultPrettyPrinter(
                DefaultPrinterConfiguration()
                    .addOption(DefaultConfigurationOption(DefaultPrinterConfiguration.ConfigOption.INDENTATION, Indentation(Indentation.IndentType.TABS_WITH_SPACE_ALIGN, 1)))
                    .addOption(DefaultConfigurationOption(DefaultPrinterConfiguration.ConfigOption.INDENT_CASE_IN_SWITCH, false))
                    .addOption(DefaultConfigurationOption(DefaultPrinterConfiguration.ConfigOption.ORDER_IMPORTS, true))
            )::print
        ).andThen(::stripNewlineAfterPcAnnotation)

        private fun stripNewlineAfterPcAnnotation(s: String): String {
            return s.replace(PC_ANNOTATION_REGEX, "@Pc($1) ")
        }

        fun parse(path: Path): Module {
            Logger.info("Parsing source module...")

            val solver = CombinedTypeSolver(
                ClassLoaderTypeSolver(ClassLoader.getPlatformClassLoader()),
                JavaParserTypeSolver(path)
            )

            val config = ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_11)
                .setSymbolResolver(JavaSymbolSolver(solver))

            val root = SourceRoot(path, config)
            root.printer = printer

            val results = root.tryToParseParallelized()
            for (result in results) {
                require(result.isSuccessful) { result }
            }

            return Module(path, root)
        }
    }
}