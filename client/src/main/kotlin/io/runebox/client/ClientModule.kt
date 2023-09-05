package io.runebox.client

import io.runebox.api.Client
import org.koin.dsl.module
import java.applet.Applet

val ClientModule = module {
    single { RuneBox() }
    single { ClientLoader() }
    single<Client> { (applet: Applet) -> applet as Client }
}