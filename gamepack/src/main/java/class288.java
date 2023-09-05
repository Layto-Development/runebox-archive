import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gb")
public class class288 extends class313 {
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field2289;
	@ObfInfo(name = "au", desc = "J", longMultiplier = 5068354842123857345L)
	long field2290;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class288(class220 var1) {
		this.this$0 = var1;
		this.field2290 = -1L;
		this.field2289 = null;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V", opaqueValue = "-1238726644")
	void method1731(class280 var1) {
		if (var1.method1492() != 255) {
			--var1.field2254;
			this.field2290 = var1.method1497();
		}

		this.field2289 = var1.method1551();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1593(this.field2290, this.field2289);
	}
}
