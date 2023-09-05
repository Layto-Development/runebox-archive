import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fa")
public class class466 extends class362 {
	@ObfInfo(name = "bt", desc = "Lnu;")
	public static class437 field3769;
	@ObfInfo(name = "ao", desc = "B")
	byte field3767;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 2093210631)
	int field3766;
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	String field3768;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgg;")
	final class141 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgg;)V")
	class466(class141 var1) {
		this.this$0 = var1;
		this.field3768 = null;
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V")
	void method1978(class280 var1) {
		if (var1.method1492() != 255) {
			--var1.field2254;
			var1.method1497();
		}

		this.field3768 = var1.method1551();
		this.field3766 = var1.method1541();
		this.field3767 = var1.method1493();
		var1.method1497();
	}

	@ObfInfo(name = "ae", desc = "(Lgo;I)V")
	void method1979(class143 var1) {
		class524 var3 = new class524();
		var3.field4198 = new class353(this.field3768);
		var3.field4200 = this.field3766;
		var3.field4199 = this.field3767;
		var1.method832(var3);
	}
}
