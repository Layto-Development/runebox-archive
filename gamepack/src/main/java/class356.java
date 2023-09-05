import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "me")
public class class356 extends class180 {
	@ObfInfo(name = "az", desc = "[I")
	static int[] field2808;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1476740129)
	public final int field2809;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 933190117)
	public final int field2810;
	@ObfInfo(name = "ao", desc = "[I")
	public final int[] field2811;
	@ObfInfo(name = "at", desc = "[I")
	public final int[] field2812;

	@ObfInfo(name = "<init>", desc = "(II[I[II)V")
	class356(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field2810 = var1;
		this.field2809 = var2;
		this.field2811 = var3;
		this.field2812 = var4;
	}

	@ObfInfo(name = "au", desc = "(III)Z", opaqueValue = "152224212")
	public boolean method1938(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field2812.length) {
			int var4 = this.field2812[var2];
			if (var1 >= var4 && var1 <= this.field2811[var2] + var4) {
				return true;
			}
		}

		return false;
	}
}
