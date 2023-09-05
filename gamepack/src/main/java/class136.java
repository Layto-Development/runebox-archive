import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fy")
public class class136 extends class313 {
	@ObfInfo(name = "kd", desc = "[Lui;")
	static class150[] field1382;
	@ObfInfo(name = "ac", desc = "[I")
	static int[] field1380;
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	String field1381;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class136(class220 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field1381 = var1.method1500();
		var1.method1496();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.field2305 = this.field1381;
	}
}
