package io.runebox.client

import io.runebox.common.RuneboxPaths
import org.tinylog.ThreadContext
import org.tinylog.kotlin.Logger
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.net.URL
import java.net.URLClassLoader

class ClientLoader {

    lateinit var applet: Applet private set
    lateinit var classLoader: ClassLoader private set
    lateinit var javConfig: JavConfig private set

    fun load() {
        Logger.info("Loading jagex configurations.")
        javConfig = JavConfig.load()

        Logger.info("Loading runescape client.")
        classLoader = URLClassLoader(arrayOf(INJECTED_GAMEPACK.toURI().toURL(), VANILLA_GAMEPACK.toURI().toURL()), ClassLoader.getSystemClassLoader())

        val initialClass = javConfig["initial_class"]!!.replace(".class", "").replaceFirstChar { it.uppercase() }
        applet = classLoader.loadClass(initialClass).newInstance() as Applet
        applet.background = Color.BLACK
        applet.layout = null
        applet.size = Dimension(javConfig["applet_minwidth"]!!.toInt(), javConfig["applet_minheight"]!!.toInt())
        applet.preferredSize = applet.size
        applet.createStub()
        applet.isVisible = true
        applet.init()

        Logger.info("RuneScape client successfully loaded.")
    }

    private fun Applet.createStub() {
        val stub = object : AppletStub {
            override fun isActive(): Boolean = true
            override fun getParameter(name: String): String? = javConfig[name]
            override fun getDocumentBase(): URL = URL(javConfig["codebase"]!!)
            override fun getCodeBase(): URL = URL(javConfig["codebase"]!!)
            override fun getAppletContext(): AppletContext? = null
            override fun appletResize(width: Int, height: Int) {
                this@createStub.size = Dimension(width, height)
            }
        }
        this.setStub(stub)
    }

    companion object {
        private val VANILLA_GAMEPACK = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.jar")
        private val INJECTED_GAMEPACK = RuneboxPaths.GAMEPACKS_DIR.resolve("gamepack.injected.jar")
    }
}