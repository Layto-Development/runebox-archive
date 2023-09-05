import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fp")
public class class237 extends class313 {
	@ObfInfo(name = "fc", desc = "Lnk;")
	static class505 field1983;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field1981;
	@ObfInfo(name = "au", desc = "J", longMultiplier = -6503402518445918241L)
	long field1982;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class237(class220 var1) {
		this.this$0 = var1;
		this.field1982 = -1L;
		this.field1981 = null;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V", opaqueValue = "-1238726644")
	void method1731(class280 var1) {
		if (var1.method1492() != 255) {
			--var1.field2254;
			this.field1982 = var1.method1497();
		}

		this.field1981 = var1.method1551();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1603(this.field1982, this.field1981, 0);
	}
}
