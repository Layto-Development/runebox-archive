package io.runebox.mixins;

import io.runebox.api.Client;
import io.runebox.internal.injector.annotations.*;

@Mixin(Client.class)
public abstract class ClientMixin implements Client {

}
