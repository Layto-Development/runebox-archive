import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "el")
public class class9 extends class381 {
	@ObfInfo(name = "au", desc = "Z")
	final boolean field339;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class9(boolean var1) {
		this.field339 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "1675983004")
	int method295(class424 var1, class424 var2) {
		if (var1.field3235 != var2.field3235) {
			return this.field339 ? var1.field3235 - var2.field3235 : var2.field3235 - var1.field3235;
		} else {
			return this.method2031(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method295((class424)var1, (class424)var2);
	}
}
