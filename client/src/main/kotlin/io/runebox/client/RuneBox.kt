package io.runebox.client

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme
import io.runebox.api.Client
import io.runebox.client.rs.ClientLoader
import io.runebox.client.ui.ClientUI
import io.runebox.common.RuneboxPaths
import io.runebox.common.get
import io.runebox.common.inject
import org.koin.core.context.startKoin
import org.koin.core.parameter.parametersOf
import org.tinylog.kotlin.Logger
import java.io.ByteArrayOutputStream
import java.io.File
import java.math.BigInteger
import java.net.URL
import java.security.MessageDigest
import java.util.jar.JarFile

class RuneBox {

    private val clientLoader: ClientLoader by inject()
    private val ui: ClientUI by inject()

    /**
     * The RuneBox Client api instance.
     * This is the cast client applet with our api interfaces injected.
     */
    val client: Client by inject { parametersOf(clientLoader.applet) }

    /**
     * Starts the runebox client.
     */
    fun start() {
        Logger.info("Starting RuneBox client.")

        this.checkDirs()
        this.checkGamepacks()
        clientLoader.load()

        /*
         * Open the client UI.
         */
        this.setupSwingDefaults()
        ui.init()
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

    private fun getVanillaGamepackBytes(): ByteArray {
        val bytes = URL("http://oldschool1.runescape.com/gamepack.jar").openConnection().getInputStream().readAllBytes()
        val tempJar = File.createTempFile("temp-", "gamepack.jar")
        tempJar.writeBytes(bytes)
        val output = ByteArrayOutputStream().also { it.use { bos ->
            JarFile(tempJar).use { jar ->
                jar.entries().asSequence().forEach { entry ->
                    if(entry.name.endsWith(".class")) {
                        val entryBytes = jar.getInputStream(entry).readAllBytes()
                        bos.writeBytes(entryBytes)
                    }
                }
            }
        } }
        tempJar.delete()
        return output.toByteArray()
    }

    private fun ByteArray.checksum(): String {
        return BigInteger(1, MessageDigest.getInstance("MD5").digest(this)).toString(16).padStart(32, '0')
    }

    private fun setupSwingDefaults() {
        FlatAtomOneDarkContrastIJTheme.setUseNativeWindowDecorations(true)
        FlatAtomOneDarkContrastIJTheme.setup()
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