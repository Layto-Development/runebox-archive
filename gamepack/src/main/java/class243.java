import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "em")
public class class243 extends class381 {
	@ObfInfo(name = "au", desc = "Z")
	final boolean field2011;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class243(boolean var1) {
		this.field2011 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "399087736")
	int method1263(class424 var1, class424 var2) {
		if (Client.field27 == var1.field3235 && var2.field3235 == Client.field27) {
			return this.field2011 ? var1.method1019().method1934(var2.method1019()) : var2.method1019().method1934(var1.method1019());
		} else {
			return this.method2031(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method1263((class424)var1, (class424)var2);
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public static void method1264() {
		class292.field2326.method291();
		class292.field2353.method291();
		class292.field2329.method291();
		class292.field2347.method291();
	}
}
