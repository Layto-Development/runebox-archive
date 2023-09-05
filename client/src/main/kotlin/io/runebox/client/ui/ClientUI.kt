package io.runebox.client.ui

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme
import io.runebox.client.rs.ClientLoader
import io.runebox.common.inject
import java.applet.Applet
import java.awt.CardLayout
import java.awt.Color
import java.awt.Dimension
import javax.swing.BoxLayout
import javax.swing.ImageIcon
import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities
import javax.swing.UIManager

class ClientUI {

    private val clientLoader: ClientLoader by inject()

    private val applet: Applet = clientLoader.applet
    private lateinit var frame: JFrame
    private lateinit var container: JPanel
    private lateinit var navContainer: JPanel
    private val cardLayout = CardLayout()
    private lateinit var pluginToolbar: PluginToolbar

    fun init() {
        SwingUtilities.invokeLater {
            initFrame()
            initComponents()
            show()
        }
    }

    private fun initFrame() {
        frame = JFrame("RuneBox")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setLocationRelativeTo(null)
        frame.isResizable = true
        frame.iconImages = APP_ICON_IMAGES
    }

    private fun initComponents() {
        container = JPanel()
        container.layout = BoxLayout(container, BoxLayout.X_AXIS)
        container.add(ClientPanel(applet))

        navContainer = JPanel()
        navContainer.layout = cardLayout
        navContainer.minimumSize = Dimension(0, 0)
        navContainer.maximumSize = Dimension(0, 0)
        navContainer.preferredSize = Dimension(0, 0)
        container.add(navContainer)

        pluginToolbar = PluginToolbar()
        pluginToolbar.background = Color.RED
        container.add(pluginToolbar)
        container.add(PluginToolbar())

        frame.add(container)
        frame.pack()
        frame.minimumSize = frame.size
    }

    fun show() {
        frame.isVisible = true
    }

    fun hide() {
        frame.isVisible = false
    }

    companion object {

        private val APP_ICON_IMAGES = listOf(
            "app-icon-32.png",
            "app-icon-64.png",
            "app-icon-128.png",
            "app-icon-256.png",
            "app-icon-512.png"
        ).map { ImageIcon(ClientUI::class.java.getResource("/images/$it")!!).image }
    }
}