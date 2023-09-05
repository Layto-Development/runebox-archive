package io.runebox.client.ui

import java.awt.Dimension
import javax.swing.JToolBar
import kotlin.math.max

class PluginToolbar : JToolBar(VERTICAL) {

    companion object {
        private const val TOOLBAR_WIDTH = 36
        private const val TOOLBAR_HEIGHT = 503
    }

    init {
        isFloatable = false
        size = Dimension(TOOLBAR_WIDTH, TOOLBAR_HEIGHT)
        minimumSize = size
        preferredSize = size
        maximumSize = Dimension(TOOLBAR_WIDTH, Int.MAX_VALUE)
    }


}