import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gi")
public class class164 extends class313 {
	@ObfInfo(name = "qv", desc = "[Lmi;")
	static class131[] field1558;
	@ObfInfo(name = "tm", desc = "Lbl;")
	static class363 field1556;
	@ObfInfo(name = "aa", desc = "[[I")
	static int[][] field1557;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 519523655)
	int field1559;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class164(class220 var1) {
		this.this$0 = var1;
		this.field1559 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field1559 = var1.method1541();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1596(this.field1559);
	}

	@ObfInfo(name = "cs", desc = "(ILmc;ZI)V")
	static void method944(int var0, class50 var1, boolean var2) {
		class305 var4 = Client.method215().method1316(var0);
		int var5 = class126.field1164.field3319;
		int var6 = class265.field2147 + (class126.field1164.field1061 >> 7);
		int var7 = (class126.field1164.field1032 >> 7) + class508.field4092;
		class50 var8 = new class50(var5, var6, var7);
		Client.method215().method1286(var4, var8, var1, var2);
	}
}
