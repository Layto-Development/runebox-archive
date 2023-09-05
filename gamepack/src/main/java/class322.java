import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gj")
public class class322 extends class362 {
	@ObfInfo(name = "ae", desc = "B")
	byte field2602;
	@ObfInfo(name = "ao", desc = "B")
	byte field2603;
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	String field2604;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgg;")
	final class141 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgg;)V")
	class322(class141 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V", opaqueValue = "1")
	void method1978(class280 var1) {
		this.field2604 = var1.method1551();
		if (null != this.field2604) {
			var1.method1492();
			this.field2602 = var1.method1493();
			this.field2603 = var1.method1493();
		}

	}

	@ObfInfo(name = "ae", desc = "(Lgo;I)V", opaqueValue = "-510575280")
	void method1979(class143 var1) {
		var1.field1437 = this.field2604;
		if (null != this.field2604) {
			var1.field1432 = this.field2602;
			var1.field1436 = this.field2603;
		}

	}
}
