package io.runebox.mixins;

import io.runebox.api.Client;
import io.runebox.internal.injector.annotations.*;

@SuppressWarnings("ALL")
@Mixin(Client.class)
public abstract class ClientMixin implements Client {

    @Shadow("gameState")
    private static int gameState;

    @Inject
    public void printGameState() {
        System.out.println("GameState: " + gameState);
    }

    @Override
    @Inject
    public int getGameState() {
        return gameState;
    }

    @Copy("init")
    @Replace("init")
    public final void rs$init() {
        System.out.println("Hello World!");
        printGameState();
        rs$init();
    }
}
