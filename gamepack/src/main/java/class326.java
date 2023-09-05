import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gw")
public class class326 extends class313 {
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -713647017)
	int field2626;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -2110571145)
	int field2627;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class326(class220 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field2627 = var1.method1496();
		this.field2626 = var1.method1496();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1587(this.field2627, this.field2626);
	}
}
