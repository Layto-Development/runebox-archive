import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "se")
public class class372 extends class13 {
	@ObfInfo(name = "ao", desc = "D")
	double field2883;
	@ObfInfo(name = "at", desc = "D")
	double field2884;
	@ObfInfo(name = "ac", desc = "D")
	double field2885;
	@ObfInfo(name = "az", desc = "D")
	double field2886;
	@ObfInfo(name = "ai", desc = "D")
	double field2887;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 545069597)
	int field2881;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 70390181)
	int field2882;

	@ObfInfo(name = "<init>", desc = "(IIIIIIIIII)V")
	public class372(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field2881 = 0;
		this.field2882 = 0;
		this.field2883 = 0.0D;
		this.field2884 = 0.0D;
		this.field2885 = 0.0D;
		this.field2887 = 0.0D;
		this.field2886 = 0.0D;
		this.field2881 = var3;
		this.field2882 = var6;
		if ((var7 - var1) * (var5 - var8) == (var4 - var7) * (var8 - var2)) {
			this.field2883 = (double)var4;
			this.field2884 = (double)var5;
		} else {
			double var11 = (double)((float)(var1 + var7)) / 2.0D;
			double var13 = (double)((float)(var2 + var8)) / 2.0D;
			double var15 = (double)((float)(var7 + var4)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field2883 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.field2884 = var13 + var19 * (this.field2883 - var11);
			this.field2885 = Math.sqrt(Math.pow(this.field2883 - (double)var1, 2.0D) + Math.pow(this.field2884 - (double)var2, 2.0D));
			this.field2887 = Math.atan2((double)var2 - this.field2884, (double)var1 - this.field2883);
			double var23 = Math.atan2((double)var8 - this.field2884, (double)var7 - this.field2883);
			this.field2886 = Math.atan2((double)var5 - this.field2884, (double)var4 - this.field2883);
			boolean var25 = this.field2887 <= var23 && var23 <= this.field2886 || this.field2886 <= var23 && var23 <= this.field2887;
			if (!var25) {
				this.field2886 += (double)(this.field2887 - this.field2886 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfInfo(name = "au", desc = "(I)I")
	public int method304() {
		double var2 = this.method1189();
		double var4 = this.field2887 + (this.field2886 - this.field2887) * var2;
		return (int)Math.round(this.field2883 + this.field2885 * Math.cos(var4));
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method305() {
		double var2 = this.method1189();
		double var4 = this.field2887 + var2 * (this.field2886 - this.field2887);
		return (int)Math.round(this.field2884 + this.field2885 * Math.sin(var4));
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method306() {
		double var2 = this.method1189();
		return (int)Math.round((double)this.field2881 + var2 * (double)(this.field2882 - this.field2881));
	}
}
