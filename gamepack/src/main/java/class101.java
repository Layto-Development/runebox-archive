import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sy")
public class class101 extends class213 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1265993553)
	int field985;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1614524249)
	int field986;

	@ObfInfo(name = "<init>", desc = "(IIII)V")
	public class101(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field985 = 0;
		this.field986 = 0;
		this.field985 = var1;
		this.field986 = var2;
	}

	@ObfInfo(name = "au", desc = "(I)I")
	public int method601() {
		double var2 = this.method1189();
		return (int)Math.round((double)this.field985 + var2 * (double)(this.field986 - this.field985));
	}
}
