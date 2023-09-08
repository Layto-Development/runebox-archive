package io.runebox.internal.updater

import io.runebox.internal.updater.asm.ClassEnv
import org.tinylog.kotlin.Logger
import java.io.File

class Updater(
    private val jarA: File,
    private val jarB: File,
    private val outputJar: File
) {

    val env = ClassEnv(this)
    val matcher = Matcher(this)

    fun run() {
        Logger.info("Initializing updater.")

        env.init(jarA, jarB)
        matcher.init()

        /*
         * After initialization, run the matcher.
         */
        matcher.run()
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: <old-jar> <new-jar> <output-jar>")

            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outputJar = File(args[2])
            Updater(oldJar, newJar, outputJar).run()
        }
    }
}