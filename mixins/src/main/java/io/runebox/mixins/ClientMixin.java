package io.runebox.mixins;

import io.runebox.api.Client;
import io.runebox.internal.injector.annotations.*;

@Mixin(Client.class)
public abstract class ClientMixin implements Client {

    @Shadow("gameState")
    private static int gameState;

    @Override
    @Inject
    public int getGameState() { return gameState; }

    @Override
    @Inject
    public void setGameState(int value) { gameState = value; }

    @Inject
    @Override
    public void test() {
        System.out.println("Hello World!");
    }

    @Copy("init")
    @Replace("init")
    public void rs$init() {
        System.out.println("Successfully injected client.init()V! GameState: " + gameState);
        rs$init();
    }
}
