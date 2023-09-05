package io.runebox.client

import org.koin.dsl.module

val ClientModule = module {
    single { RuneBox() }
    single { ClientLoader() }
}