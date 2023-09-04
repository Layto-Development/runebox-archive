package io.runebox.mixins;

import io.runebox.api.Client;
import io.runebox.internal.injector.annotations.*;

@Mixin(Client.class)
public abstract class ClientMixin implements Client {

    public void printHello() {
        System.out.println("Hello World");
    }

    // Overrided from runebox-api Client.java
    @Override
    @Inject
    public int getGameState() {
        return 0;
    }
}
