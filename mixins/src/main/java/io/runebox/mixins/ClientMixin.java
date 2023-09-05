package io.runebox.mixins;

import io.runebox.api.Client;
import io.runebox.internal.injector.annotations.Copy;
import io.runebox.internal.injector.annotations.Inject;
import io.runebox.internal.injector.annotations.Mixin;
import io.runebox.internal.injector.annotations.Replace;

@Mixin(Client.class)
public abstract class ClientMixin implements Client {

    @Inject
    @Override
    public void test() {
        System.out.println("Hello World!");
    }

    @Copy("init")
    @Replace("init")
    public void rs$init() {
        System.out.println("Successfully injected client.init()V!");
        rs$init();
    }
}
