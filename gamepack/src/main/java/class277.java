public class class277 {
	public static int field2460;
	public static long[] field2462;
	static boolean field2455;
	static boolean field2457;
	static int field2452;
	static int field2453;
	static int field2454;
	static int field2456;
	static int field2458;
	static int field2459;
	static int field2461;

	static {
		field2457 = false;
		field2453 = 0;
		field2456 = 0;
		field2455 = false;
		field2460 = 0;
		field2462 = new long[1000];
	}

	class277() throws Throwable {
	}

	public static char method1591(byte var0) {
		int var2 = var0 & 255;
		if (var2 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var2, 16));
		} else {
			if (var2 >= 128 && var2 < 160) {
				char var3 = class389.field3272[var2 - 128];
				if (var3 == 0) {
					var3 = '?';
				}

				var2 = var3;
			}

			return (char)var2;
		}
	}

	static int method1592(int var0, int var1, int var2) {
		if ((class38.field513[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (class38.field513[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}
}
