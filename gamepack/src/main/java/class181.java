import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ef")
public class class181 extends class381 {
	@ObfInfo(name = "kh", desc = "I", intMultiplier = 1799410691)
	static int field1636;
	@ObfInfo(name = "au", desc = "Z")
	final boolean field1635;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class181(boolean var1) {
		this.field1635 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "-893772022")
	int method1025(class424 var1, class424 var2) {
		if (var1.field3235 == Client.field27 && var2.field3235 == Client.field27) {
			return this.field1635 ? var1.field3234 - var2.field3234 : var2.field3234 - var1.field3234;
		} else {
			return this.method2031(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method1025((class424)var1, (class424)var2);
	}
}
