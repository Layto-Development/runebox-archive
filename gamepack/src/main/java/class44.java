import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "mz")
public class class44 {
	@ObfInfo(name = "ao", desc = "[I")
	public static int[] field559;
	@ObfInfo(name = "ae", desc = "[I")
	public static int[] field561;
	@ObfInfo(name = "au", desc = "[I")
	static int[] field558;
	@ObfInfo(name = "at", desc = "[I")
	static int[] field560;

	static {
		field558 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field558[var1] = var0 - 1;
			var0 += var0;
		}

		field561 = new int[4000];
		field559 = new int[4000];
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class44() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(II)I")
	public static int method444(int var0) {
		class126 var2 = class126.method701(var0);
		int var3 = var2.field1159;
		int var4 = var2.field1160;
		int var5 = var2.field1163;
		int var6 = field558[var5 - var4];
		return field559[var3] >> var4 & var6;
	}
}
