import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ec")
public class class107 extends class381 {
	@ObfInfo(name = "ar", desc = "Luk;")
	static class398 field1020;
	@ObfInfo(name = "au", desc = "Z")
	final boolean field1019;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class107(boolean var1) {
		this.field1019 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "1019583195")
	int method609(class424 var1, class424 var2) {
		if (var1.field3235 != 0 && var2.field3235 != 0) {
			return this.field1019 ? var1.method1019().method1934(var2.method1019()) : var2.method1019().method1934(var1.method1019());
		} else {
			return this.method2031(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method609((class424)var1, (class424)var2);
	}
}
