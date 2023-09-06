package io.runebox.plugin

import org.pf4j.DefaultPluginFactory
import org.pf4j.DefaultPluginManager
import org.pf4j.Plugin
import org.pf4j.PluginWrapper
import org.tinylog.kotlin.Logger
import java.io.File

class RuneBoxPluginManager : DefaultPluginManager() {

    init {
        System.setProperty("pf4j.pluginsDir", File("build/plugins/").absolutePath)
    }

}