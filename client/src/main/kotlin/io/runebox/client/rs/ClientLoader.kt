package io.runebox.client.rs

import io.runebox.common.RuneboxPaths
import org.tinylog.kotlin.Logger
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.io.Closeable
import java.net.URL
import java.util.jar.JarFile

class ClientLoader {

    lateinit var applet: Applet private set
    lateinit var classLoader: ClassLoader private set
    lateinit var clientConfig: ClientConfig private set

    fun load() {
        Logger.info("Loading client config.")
        clientConfig = ClientConfig.load()

        Logger.info("Loading gamepack classes.")

        classLoader = createClientClassLoader()

        Logger.info("Loading Oldschool RuneScape applet.")
        val initialClass = clientConfig["initial_class"]!!.replace(".class", "").replaceFirstChar { it.uppercase() }
        applet = classLoader.loadClass(initialClass).newInstance() as Applet
        applet.background = Color.BLACK
        applet.layout = null
        applet.size = Dimension(clientConfig["applet_minwidth"]!!.toInt(), clientConfig["applet_minheight"]!!.toInt())
        applet.preferredSize = applet.size
        applet.createStub()
        applet.isVisible = true
        applet.init()
    }

    private fun Applet.createStub() {
        val stub = object : AppletStub {
            override fun isActive(): Boolean = true
            override fun getParameter(name: String): String? = clientConfig[name]
            override fun getDocumentBase(): URL = URL(clientConfig["codebase"]!!)
            override fun getCodeBase(): URL = URL(clientConfig["codebase"]!!)
            override fun getAppletContext(): AppletContext? = null
            override fun appletResize(width: Int, height: Int) {
                this@createStub.size = Dimension(width, height)
            }
        }
        this.setStub(stub)
    }

    private fun createClientClassLoader(): ClassLoader {
        val ret: ClassLoader
        JarFile(INJECTED_GAMEPACK).use { jar1 ->
            JarFile(VANILLA_GAMEPACK).use { jar2 ->
                ret = object : ClassLoader(ClientLoader::class.java.classLoader) {

                    private val jar1Classes = hashMapOf<String, ByteArray>()
                    private val jar2Classes = hashMapOf<String, ByteArray>()

                    init {
                        jar1.entries().asSequence().forEach { entry ->
                            if(entry.name.endsWith(".class")) {
                                jar1Classes[entry.name] = jar1.getInputStream(entry).readAllBytes()
                            }
                        }

                        jar2.entries().asSequence().forEach { entry ->
                            if(entry.name.endsWith(".class")) {
                                jar2Classes[entry.name] = jar2.getInputStream(entry).readAllBytes()
                            }
                        }
                    }

                    override fun findClass(name: String): Class<*> {
                        val entryName = name.replace(".", "/").plus(".class")
                        val bytes = jar1Classes.remove(entryName) ?: jar2Classes.remove(entryName)
                        return if(bytes != null) {
                            defineClass(name, bytes, 0, bytes.size)
                        } else {
                            super.findClass(name)
                        }
                    }
                }

                jar1.entries().asSequence().forEach { entry ->
                    if(entry.name.endsWith(".class")) {
                        ret.loadClass(entry.name.replace("/", ".").replace(".class", ""))
                    }
                }

                jar2.entries().asSequence().forEach { entry ->
                    if(entry.name.endsWith(".class")) {
                        ret.loadClass(entry.name.replace("/", ".").replace(".class", ""))
                    }
                }
            }
        }
        return ret
    }

    private inline fun <T : Closeable?, R> List<T>.use(block: (List<T>) -> R): R {
        var exception: Throwable? = null
        try {
            return block(this)
        } catch (e: Throwable) {
            exception = e
            throw e
        } finally {
            when (exception) {
                null -> forEach { it?.close() }
                else -> forEach {
                    try {
                        it?.close()
                    } catch (closeException: Throwable) {
                        exception.addSuppressed(closeException)
                    }
                }
            }
        }
    }

    companion object {
        private val VANILLA_GAMEPACK = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.jar")
        private val INJECTED_GAMEPACK = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.injected.jar")
    }
}