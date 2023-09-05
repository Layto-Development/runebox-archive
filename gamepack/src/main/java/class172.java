import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gd")
public class class172 extends class313 {
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 2053663157)
	int field1597;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field1596;
	@ObfInfo(name = "au", desc = "J", longMultiplier = 3065353145974537921L)
	long field1598;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class172(class220 var1) {
		this.this$0 = var1;
		this.field1598 = -1L;
		this.field1596 = null;
		this.field1597 = 0;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		if (var1.method1492() != 255) {
			--var1.field2254;
			this.field1598 = var1.method1497();
		}

		this.field1596 = var1.method1551();
		this.field1597 = var1.method1541();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1603(this.field1598, this.field1596, this.field1597);
	}
}
