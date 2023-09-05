import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "aa")
public class class184 {
	@ObfInfo(name = "au", desc = "I")
	final int field1663;
	@ObfInfo(name = "ae", desc = "I")
	final int field1664;
	@ObfInfo(name = "ao", desc = "Ljava/lang/String;")
	final String field1665;

	@ObfInfo(name = "<init>", desc = "(IILjava/lang/String;)V")
	class184(int var1, int var2, String var3) {
		this.field1663 = var1;
		this.field1664 = var2;
		this.field1665 = var3;
	}

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	class184(class280 var1) {
		this(var1.method1492(), var1.method1492(), var1.method1500());
	}

	@ObfInfo(name = "au", desc = "()Ljava/lang/String;")
	String method1036() {
		return Integer.toHexString(this.field1663) + Integer.toHexString(this.field1664) + this.field1665;
	}

	@ObfInfo(name = "ae", desc = "()I")
	int method1035() {
		return this.field1664;
	}
}
