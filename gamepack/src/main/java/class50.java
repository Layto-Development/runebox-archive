public class class50 {

	static int[] field236;

	static {
		new Object();
		field236 = new int[33];
		field236[0] = 0;
		int var0 = 2;
		for (int var1 = 1; var1 < 33; ++var1) {
			field236[var1] = var0 - 1;
			var0 += var0;
		}
	}

	class50() throws Throwable {
	}

	public static int method202(int var0, int var1) {
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

	public static int method201(int var0) {
		return field236[var0];
	}

	public static int method203(int var0, int var1, int var2) {
		int var4 = method201(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	public static int method205(int var0, int var1, int var2) {
		int var4 = method201(var2 - var1 + 1);
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	public static int method204(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	public static int method199(int var0) {
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

	public static int method200(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var0 + var3) / var1 - var3;
	}
}
