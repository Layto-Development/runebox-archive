import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "eb")
public class class163 extends class381 {
	@ObfInfo(name = "au", desc = "Z")
	final boolean field1555;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class163(boolean var1) {
		this.field1555 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;I)I", opaqueValue = "1204798937")
	int method941(class424 var1, class424 var2) {
		if (var1.field3235 == Client.field27) {
			if (Client.field27 != var2.field3235) {
				return this.field1555 ? -1 : 1;
			}
		} else if (Client.field27 == var2.field3235) {
			return this.field1555 ? 1 : -1;
		}

		return this.method2031(var1, var2);
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method941((class424)var1, (class424)var2);
	}
}
