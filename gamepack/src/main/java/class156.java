import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "pn")
public class class156 extends class236 {
	@ObfInfo(name = "ag", desc = "[Ljava/lang/String;")
	static String[] field1487;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 942710907)
	int field1486;
	@ObfInfo(name = "au", desc = "J", longMultiplier = -5325232572376689765L)
	long field1485;

	@ObfInfo(name = "<init>", desc = "(Lpm;I)V")
	public class156(class236 var1, int var2) {
		super(var1);
		this.field1486 = var2;
		super.field1978 = "DelayFadeTask";
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		if (this.field1485 < (long)this.field1486) {
			++this.field1485;
			return false;
		} else {
			return true;
		}
	}
}
