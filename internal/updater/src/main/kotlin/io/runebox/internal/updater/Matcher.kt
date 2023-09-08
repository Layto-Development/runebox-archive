package io.runebox.internal.updater

import org.tinylog.kotlin.Logger

class Matcher(val updater: Updater) {

    val env get() = updater.env

    val poolA get() = env.poolA
    val poolB get() = env.poolB
    val sharedPool get() = env.sharedPool

    fun init() {
        Logger.info("Initializing updater matcher.")


    }

    fun run() {
        Logger.info("Running matcher.")
    }
}