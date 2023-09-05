import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fz")
public class class198 extends class313 {
	@ObfInfo(name = "ae", desc = "Z")
	boolean field1806;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -974781301)
	int field1807;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class198(class220 var1) {
		this.this$0 = var1;
		this.field1807 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V", opaqueValue = "-1238726644")
	void method1731(class280 var1) {
		this.field1807 = var1.method1541();
		this.field1806 = var1.method1492() == 1;
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1605(this.field1807, this.field1806);
	}
}
