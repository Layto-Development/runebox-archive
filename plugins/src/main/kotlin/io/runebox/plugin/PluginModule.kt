package io.runebox.plugin

import org.koin.dsl.module

val PluginModule = module {
    single { RuneBoxPluginManager() }
}