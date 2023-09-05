package io.runebox.client

import io.runebox.api.Client
import io.runebox.client.rs.ClientLoader
import io.runebox.client.ui.ClientUI
import org.koin.dsl.module
import java.applet.Applet

val ClientModule = module {
    single { RuneBox() }
    single { ClientLoader() }
    single<Client> { (applet: Applet) -> applet as Client }
    single { ClientUI() }
}