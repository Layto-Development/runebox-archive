package io.runebox.client

import io.runebox.api.Client
import io.runebox.common.RuneboxPaths
import io.runebox.common.get
import io.runebox.common.inject
import org.koin.core.context.startKoin
import org.koin.core.parameter.parametersOf
import org.tinylog.kotlin.Logger
import java.awt.GridLayout
import java.io.File
import java.math.BigInteger
import java.net.URL
import java.security.MessageDigest
import java.util.concurrent.Executors
import javax.swing.JFrame

class RuneBox {

    private val clientLoader: ClientLoader by inject()

    fun start() {
        Logger.info("Starting RuneBox client.")

        this.checkDirs()
        this.checkGamepacks()
        clientLoader.load()

        val frame = JFrame("RuneBox")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.layout = GridLayout(1, 0)
        frame.setLocationRelativeTo(null)
        frame.add(clientLoader.applet)
        frame.pack()
        frame.isVisible = true

        val client = get<Client> { parametersOf(clientLoader.applet) }
    }

    private fun checkDirs() {
        Logger.info("Checking required directories.")

        RuneboxPaths.ALL.forEach { dir ->
            if(!dir.exists()) {
                Logger.info("Creating required directory: ${dir.path}.")
                dir.mkdirs()
            }
        }
    }

    private fun checkGamepacks() {
        Logger.info("Checking gamepack files.")

        val vanillaGamepack = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.jar")
        val injectedGamepack = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.injected.jar")

        val latestInjectedGamepackBytes = RuneBox::class.java.getResourceAsStream("/runebox-gamepack.injected.jar")!!.readAllBytes()

        if(!vanillaGamepack.exists() || !injectedGamepack.exists()) {
            updateGamepacks()
        } else if(injectedGamepack.readBytes().checksum() != latestInjectedGamepackBytes.checksum()) {
            updateGamepacks()
        }
    }

    private fun updateGamepacks() {
        Logger.info("Updating gamepack files.")

        val vanillaGamepack = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.jar")
        val injectedGamepack = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.injected.jar")

        val latestVanillaGamepackBytes = URL("http://oldschool1.runescape.com/gamepack.jar").openConnection().getInputStream().readAllBytes()
        val latestInjectedGamepackBytes = RuneBox::class.java.getResourceAsStream("/runebox-gamepack.injected.jar")!!.readAllBytes()

        vanillaGamepack.deleteRecursively()
        injectedGamepack.deleteRecursively()

        vanillaGamepack.createNewFile()
        vanillaGamepack.writeBytes(latestVanillaGamepackBytes)

        injectedGamepack.createNewFile()
        injectedGamepack.writeBytes(latestInjectedGamepackBytes)
    }

    private fun ByteArray.checksum(): String {
        return BigInteger(1, MessageDigest.getInstance("MD5").digest(this)).toString(16).padStart(32, '0')
    }

    companion object {

        private val DI_MODULES = listOf(
            ClientModule
        )

        @JvmStatic
        fun main(args: Array<String>) {
            /*
             * Initialize dependency injector
             */
            startKoin { modules(DI_MODULES) }

            /*
             * Start RuneBox client
             */
            get<RuneBox>().start()
        }
    }
}