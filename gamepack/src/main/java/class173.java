import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rs")
public class class173 implements class170 {
	@ObfInfo(name = "au", desc = "Lsu;")
	public final class3 field1599;

	@ObfInfo(name = "<init>", desc = "(Lrp;)V")
	public class173(class392 var1) {
		this(new class8(var1));
	}

	@ObfInfo(name = "<init>", desc = "(Lsx;)V")
	class173(class8 var1) {
		this.field1599 = var1;
	}

	@ObfInfo(name = "au", desc = "(II)I")
	public int method963(int var1) {
		return this.field1599.method5(var1);
	}
}
