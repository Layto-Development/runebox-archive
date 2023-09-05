package com.jagex.oldscape.pub;

import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;

@ObfInfo(name = "com/jagex/oldscape/pub/RefreshAccessTokenRequester")
public interface RefreshAccessTokenRequester {
	@ObfInfo(name = "request", desc = "(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Ljava/lang/String;)Ljava/util/concurrent/Future;")
	Future request(String var1, URL var2, Map var3, String var4);
}
