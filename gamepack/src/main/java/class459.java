import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fw")
public class class459 extends class313 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1888822411)
	int field3727;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field3726;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class459(class220 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field3727 = var1.method1496();
		this.field3726 = var1.method1500();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1601(this.field3727, this.field3726);
	}
}
