import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fq")
public class class142 extends class313 {
	@ObfInfo(name = "aq", desc = "[[S")
	public static short[][] field1430;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -947832085)
	int field1427;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1547450271)
	int field1428;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1568997835)
	int field1429;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -20381335)
	int field1431;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class142(class220 var1) {
		this.this$0 = var1;
		this.field1429 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field1429 = var1.method1541();
		this.field1428 = var1.method1496();
		this.field1431 = var1.method1492();
		this.field1427 = var1.method1492();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1598(this.field1429, this.field1428, this.field1431, this.field1427);
	}
}
