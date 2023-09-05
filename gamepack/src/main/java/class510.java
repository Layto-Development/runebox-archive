import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ik")
public abstract class class510 extends class180 {
	@ObfInfo(name = "eq", desc = "I", intMultiplier = 1008243717)
	public int field4095;

	@ObfInfo(name = "<init>", desc = "()V")
	protected class510() {
		this.field4095 = 1000;
	}

	@ObfInfo(name = "db", desc = "(IIIIIIIIJ)V")
	void method2514(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		class384 var11 = this.method2515();
		if (var11 != null) {
			this.field4095 = var11.field4095;
			var11.method2514(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;")
	protected class384 method2515() {
		return null;
	}
}
