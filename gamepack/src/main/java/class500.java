import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gu")
public class class500 extends class362 {
	@ObfInfo(name = "wl", desc = "[S")
	static short[] field4040;
	@ObfInfo(name = "ae", desc = "B")
	byte field4037;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1314479155)
	int field4036;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1961987563)
	int field4038;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	String field4039;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgg;")
	final class141 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgg;)V")
	class500(class141 var1) {
		this.this$0 = var1;
		this.field4038 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V")
	void method1978(class280 var1) {
		var1.method1492();
		this.field4038 = var1.method1541();
		this.field4037 = var1.method1493();
		this.field4036 = var1.method1541();
		var1.method1497();
		this.field4039 = var1.method1500();
		var1.method1492();
	}

	@ObfInfo(name = "ae", desc = "(Lgo;I)V")
	void method1979(class143 var1) {
		class524 var3 = (class524)var1.field1434.get(this.field4038);
		var3.field4199 = this.field4037;
		var3.field4200 = this.field4036;
		var3.field4198 = new class353(this.field4039);
	}
}
