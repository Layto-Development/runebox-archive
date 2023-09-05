import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fc")
public class class250 extends class362 {
	@ObfInfo(name = "ae", desc = "B")
	byte field2083;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 866882705)
	int field2084;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 544061623)
	int field2086;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	String field2085;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgg;")
	final class141 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgg;)V")
	class250(class141 var1) {
		this.this$0 = var1;
		this.field2086 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V")
	void method1978(class280 var1) {
		this.field2086 = var1.method1541();
		this.field2083 = var1.method1493();
		this.field2084 = var1.method1541();
		var1.method1497();
		this.field2085 = var1.method1500();
	}

	@ObfInfo(name = "ae", desc = "(Lgo;I)V")
	void method1979(class143 var1) {
		class524 var3 = (class524)var1.field1434.get(this.field2086);
		var3.field4199 = this.field2083;
		var3.field4200 = this.field2084;
		var3.field4198 = new class353(this.field2085);
	}
}
