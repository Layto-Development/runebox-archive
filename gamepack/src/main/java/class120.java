import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ff")
public class class120 extends class313 {
	@ObfInfo(name = "aw", desc = "[I")
	static int[] field1135;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 2023525395)
	int field1131;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -513761011)
	int field1132;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 22358023)
	int field1133;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1866813797)
	int field1134;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class120(class220 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field1131 = var1.method1496();
		this.field1134 = var1.method1496();
		this.field1132 = var1.method1492();
		this.field1133 = var1.method1492();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1599(this.field1131, this.field1134, this.field1132, this.field1133);
	}
}
