import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sk")
public class class289 extends class13 {
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 373417651)
	int field2291;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -2053401073)
	int field2292;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1621911947)
	int field2293;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1883870413)
	int field2294;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 479610193)
	int field2295;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 198014367)
	int field2296;

	@ObfInfo(name = "<init>", desc = "(IIIIIIII)V")
	public class289(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field2295 = 0;
		this.field2292 = 0;
		this.field2293 = 0;
		this.field2294 = 0;
		this.field2291 = 0;
		this.field2296 = 0;
		this.field2295 = var1;
		this.field2292 = var2;
		this.field2293 = var3;
		this.field2294 = var4;
		this.field2291 = var5;
		this.field2296 = var6;
	}

	@ObfInfo(name = "au", desc = "(I)I")
	public int method304() {
		double var2 = this.method1189();
		return (int)Math.round((double)(this.field2294 - this.field2295) * var2 + (double)this.field2295);
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method305() {
		double var2 = this.method1189();
		return (int)Math.round(var2 * (double)(this.field2291 - this.field2292) + (double)this.field2292);
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method306() {
		double var2 = this.method1189();
		return (int)Math.round((double)this.field2293 + (double)(this.field2296 - this.field2293) * var2);
	}
}
