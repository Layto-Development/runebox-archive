import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "mj")
public class class93 {
	@ObfInfo(name = "<init>", desc = "()V")
	class93() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(IIIB)I")
	public static int method584(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfInfo(name = "ae", desc = "(IIII)I")
	public static int method586(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfInfo(name = "ao", desc = "(IIIIIII)I")
	public static int method585(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}
}
