import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "lt")
public class class497 {
	@ObfInfo(name = "au", desc = "[I")
	static int[] field4029;

	static {
		new Object();
		field4029 = new int[33];
		field4029[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field4029[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class497() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(III)I")
	public static int method2490(int var0, int var1) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var3;
		} else {
			return var3;
		}
	}

	@ObfInfo(name = "ae", desc = "(II)I")
	public static int method2489(int var0) {
		return field4029[var0];
	}

	@ObfInfo(name = "at", desc = "(IIIB)I")
	public static int method2491(int var0, int var1, int var2) {
		int var4 = method2489(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	@ObfInfo(name = "ac", desc = "(IIII)I")
	public static int method2493(int var0, int var1, int var2) {
		int var4 = method2489(var2 - var1 + 1);
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	@ObfInfo(name = "ai", desc = "(IB)I")
	public static int method2492(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfInfo(name = "az", desc = "(II)I")
	public static int method2487(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var2 + var0;
	}

	@ObfInfo(name = "ap", desc = "(III)I")
	public static int method2488(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var0 + var3) / var1 - var3;
	}
}
