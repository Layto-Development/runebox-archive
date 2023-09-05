import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fm")
public class class111 extends class362 {
	@ObfInfo(name = "bw", desc = "Ljava/lang/String;")
	static String field1027;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1307725651)
	int field1026;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgg;")
	final class141 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgg;)V")
	class111(class141 var1) {
		this.this$0 = var1;
		this.field1026 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V", opaqueValue = "1")
	void method1978(class280 var1) {
		this.field1026 = var1.method1541();
		var1.method1492();
		if (var1.method1492() != 255) {
			--var1.field2254;
			var1.method1497();
		}

	}

	@ObfInfo(name = "ae", desc = "(Lgo;I)V")
	void method1979(class143 var1) {
		var1.method833(this.field1026);
	}
}
