import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ei")
public class class413 extends class381 {
	@ObfInfo(name = "au", desc = "Z")
	final boolean field3185;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class413(boolean var1) {
		this.field3185 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "-2143241619")
	int method2186(class424 var1, class424 var2) {
		if (var1.field3235 != 0 && var2.field3235 != 0) {
			return this.field3185 ? var1.field3234 - var2.field3234 : var2.field3234 - var1.field3234;
		} else {
			return this.method2031(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2186((class424)var1, (class424)var2);
	}
}
