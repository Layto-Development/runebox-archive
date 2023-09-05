import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fk")
public class class215 extends class313 {
	@ObfInfo(name = "au", desc = "Z")
	boolean field1930;
	@ObfInfo(name = "at", desc = "B")
	byte field1926;
	@ObfInfo(name = "ae", desc = "B")
	byte field1927;
	@ObfInfo(name = "ao", desc = "B")
	byte field1928;
	@ObfInfo(name = "ac", desc = "B")
	byte field1929;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class215(class220 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field1930 = var1.method1492() == 1;
		this.field1927 = var1.method1493();
		this.field1928 = var1.method1493();
		this.field1926 = var1.method1493();
		this.field1929 = var1.method1493();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.field2304 = this.field1930;
		var1.field2318 = this.field1927;
		var1.field2306 = this.field1928;
		var1.field2307 = this.field1926;
		var1.field2308 = this.field1929;
	}
}
