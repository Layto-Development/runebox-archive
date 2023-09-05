package io.runebox.common

import java.io.File

object RuneboxPaths {

    val BASE_DIR = File(System.getProperty("user.home")).resolve(".runebox/")
    val BIN_DIR = BASE_DIR.resolve("bin/")
    val CONFIGS_DIR = BASE_DIR.resolve("configs/")
    val GAMEPACKS_DIR = BASE_DIR.resolve("gamepacks/")
    val LOGS_DIR = BASE_DIR.resolve("logs/")
    val PLUGINS_DIR = BASE_DIR.resolve("plugins/")

    val ALL get() = listOf(
        BASE_DIR,
        BIN_DIR,
        CONFIGS_DIR,
        GAMEPACKS_DIR,
        LOGS_DIR,
        PLUGINS_DIR
    )
}