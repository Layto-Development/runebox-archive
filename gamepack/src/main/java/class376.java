import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ey")
final class class376 implements class284 {
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	public static String field2891;
	@ObfInfo(name = "fw", desc = "Lnk;")
	static class505 field2892;
	// $FF: synthetic field
	@ObfInfo(name = "val$cc", desc = "Lmi;")
	final class131 val$cc;

	@ObfInfo(name = "<init>", desc = "(Lmi;)V")
	class376(class131 var1) {
		this.val$cc = var1;
	}

	@ObfInfo(name = "au", desc = "(B)V", opaqueValue = "17")
	public void method1569() {
		if (this.val$cc != null && this.val$cc.method738().field3267 != null) {
			class20 var2 = new class20();
			var2.method332(this.val$cc);
			var2.method333(this.val$cc.method738().field3267);
			Client.method140().method631(var2);
		}

	}
}
