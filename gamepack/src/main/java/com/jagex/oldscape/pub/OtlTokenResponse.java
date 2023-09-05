package com.jagex.oldscape.pub;

import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "com/jagex/oldscape/pub/OtlTokenResponse")
public interface OtlTokenResponse {
	@ObfInfo(name = "isSuccess", desc = "()Z")
	boolean isSuccess();

	@ObfInfo(name = "getToken", desc = "()Ljava/lang/String;")
	String getToken();
}
