import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "oz")
public class class158 {
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	String field1499;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	String field1501;
	@ObfInfo(name = "ao", desc = "Loh;")
	public final class454 field1498;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1109796019)
	public final int field1502;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = -3116197775568989741L)
	public final long field1500;

	@ObfInfo(name = "<init>", desc = "(Ltm;BI)V")
	class158(class280 var1, byte var2, int var3) {
		this.field1501 = var1.method1500();
		this.field1499 = var1.method1500();
		this.field1502 = var1.method1541();
		this.field1500 = var1.method1497();
		int var4 = var1.method1496();
		int var5 = var1.method1496();
		this.field1498 = new class454();
		this.field1498.method2362(2);
		this.field1498.method2366(var2);
		this.field1498.field3713 = var4;
		this.field1498.field3711 = var5;
		this.field1498.field3712 = 0;
		this.field1498.field3708 = 0;
		this.field1498.field3709 = var3;
	}

	@ObfInfo(name = "au", desc = "(I)Ljava/lang/String;")
	public String method912() {
		return this.field1501;
	}

	@ObfInfo(name = "ae", desc = "(B)Ljava/lang/String;")
	public String method911() {
		return this.field1499;
	}
}
