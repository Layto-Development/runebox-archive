import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ek")
public class class410 extends class381 {
	@ObfInfo(name = "au", desc = "Z")
	final boolean field3161;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class410(boolean var1) {
		this.field3161 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "-1754879265")
	int method2148(class424 var1, class424 var2) {
		if (var2.field3236 != var1.field3236) {
			return this.field3161 ? var1.field3236 - var2.field3236 : var2.field3236 - var1.field3236;
		} else {
			return this.method2031(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2148((class424)var1, (class424)var2);
	}
}
