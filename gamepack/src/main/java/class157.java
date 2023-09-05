import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "eg")
public class class157 {
	@ObfInfo(name = "lw", desc = "I", intMultiplier = -644441085)
	static int field1490;
	@ObfInfo(name = "jh", desc = "I", intMultiplier = 788509083)
	static int field1495;
	@ObfInfo(name = "iy", desc = "J", longMultiplier = -1653606137358564459L)
	static long field1496;
	@ObfInfo(name = "az", desc = "Leg;")
	class157 field1494;
	@ObfInfo(name = "at", desc = "F")
	float field1489;
	@ObfInfo(name = "ae", desc = "F")
	float field1491;
	@ObfInfo(name = "ac", desc = "F")
	float field1492;
	@ObfInfo(name = "ai", desc = "F")
	float field1493;
	@ObfInfo(name = "ao", desc = "F")
	float field1497;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1852442399)
	int field1488;

	@ObfInfo(name = "<init>", desc = "()V")
	class157() {
		this.field1497 = Float.MAX_VALUE;
		this.field1489 = Float.MAX_VALUE;
		this.field1492 = Float.MAX_VALUE;
		this.field1493 = Float.MAX_VALUE;
	}

	@ObfInfo(name = "au", desc = "(Ltm;IS)V")
	void method910(class280 var1, int var2) {
		this.field1488 = var1.method1494();
		this.field1491 = var1.method1498();
		this.field1497 = var1.method1498();
		this.field1489 = var1.method1498();
		this.field1492 = var1.method1498();
		this.field1493 = var1.method1498();
	}
}
