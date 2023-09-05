import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fg")
public class class247 extends class313 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = -2045378669)
	int field2071;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class247(class220 var1) {
		this.this$0 = var1;
		this.field2071 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field2071 = var1.method1541();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1592(this.field2071);
	}
}
