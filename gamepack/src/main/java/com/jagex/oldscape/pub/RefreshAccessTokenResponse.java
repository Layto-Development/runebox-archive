package com.jagex.oldscape.pub;

import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "com/jagex/oldscape/pub/RefreshAccessTokenResponse")
public interface RefreshAccessTokenResponse {
	@ObfInfo(name = "isSuccess", desc = "()Z")
	boolean isSuccess();

	@ObfInfo(name = "getAccessToken", desc = "()Ljava/lang/String;")
	String getAccessToken();

	@ObfInfo(name = "getRefreshToken", desc = "()Ljava/lang/String;")
	String getRefreshToken();
}
