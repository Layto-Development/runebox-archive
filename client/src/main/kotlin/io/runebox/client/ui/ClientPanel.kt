package io.runebox.client.ui

import java.applet.Applet
import java.awt.BorderLayout
import java.awt.Color
import javax.swing.JPanel

class ClientPanel(private val applet: Applet) : JPanel() {
    init {
        size = applet.size
        preferredSize = applet.size
        minimumSize = applet.size
        layout = BorderLayout()
        background = Color.BLACK
        add(applet, BorderLayout.CENTER)
    }
}