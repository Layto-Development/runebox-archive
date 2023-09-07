public class class238 {

	public static class278 field2039;

	public static int[] field2034;

	public static int[] field2035;

	public static int[] field2037;

	static class418 field2040;

	static int[] field2036;

	static int[] field2038;

	static final class418 field2041;

	static final class418 field2042;

	static {
		field2034 = new int[65536];
		field2038 = new int[512];
		field2036 = new int[2048];
		field2037 = new int[2048];
		field2035 = new int[2048];
		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2038[var0] = 32768 / var0;
		}
		for (var0 = 1; var0 < 2048; ++var0) {
			field2036[var0] = 65536 / var0;
		}
		for (var0 = 0; var0 < 2048; ++var0) {
			field2037[var0] = (int) (65536.0D * Math.sin((double) var0 * 0.0030679615D));
			field2035[var0] = (int) (65536.0D * Math.cos((double) var0 * 0.0030679615D));
		}
		field2039 = new class278();
		field2041 = new class42(field2039);
		field2042 = new class475(field2039);
		field2040 = field2041;
	}

	class238() throws Throwable {
	}

	public static void method1398(boolean var0) {
		if (var0 && class206.field1907 != null) {
			field2040 = field2042;
		} else {
			field2040 = field2041;
		}
	}

	public static void method1386(class40 var0) {
		field2039.field2270 = var0;
	}

	public static void method1387(double var0) {
		method1405(var0, 0, 512);
	}

	static void method1405(double var0, int var2, int var3) {
		int var4 = 0;
		for (int var5 = 0; var5 < 512; ++var5) {
			double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double) (var5 & 7) / 8.0D + 0.0625D;
			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double) var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (var8 + 1.0D);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}
					double var21 = var11 * 2.0D - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}
					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}
					if (var23 * 6.0D < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var19;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}
					if (var6 * 6.0D < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (var6 * 2.0D < 1.0D) {
						var15 = var19;
					} else if (var6 * 3.0D < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}
					if (var27 * 6.0D < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (var27 * 2.0D < 1.0D) {
						var17 = var19;
					} else if (var27 * 3.0D < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}
				int var29 = (int) (var13 * 256.0D);
				int var20 = (int) (var15 * 256.0D);
				int var30 = (int) (var17 * 256.0D);
				int var22 = (var29 << 16) + (var20 << 8) + var30;
				var22 = method1404(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}
				field2034[var4++] = var22;
			}
		}
	}

	static int method1404(int var0, double var1) {
		double var3 = (double) (var0 >> 16) / 256.0D;
		double var5 = (double) (var0 >> 8 & 255) / 256.0D;
		double var7 = (double) (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int) (var3 * 256.0D);
		int var10 = (int) (var5 * 256.0D);
		int var11 = (int) (var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	static int method1389() {
		return field2039.field2268;
	}

	static int method1390() {
		return field2039.field2277;
	}

	static int method1391() {
		return field2039.field2273;
	}

	static int method1388() {
		return field2039.field2279;
	}

	static int method1392() {
		return field2039.field2281;
	}

	static int method1393() {
		return field2039.field2280;
	}

	public static int method1394() {
		return field2039.field2271;
	}

	static int method1395() {
		return field2039.field2276;
	}

	public static void method1396(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2040 == field2042) {
			field2040 = field2041;
		}
		field2040.method2097(var0, var1, var2, var3);
	}

	public static void method1397() {
		method1406(class206.field1909, class206.field1910, class206.field1903, class206.field1908);
	}

	static void method1406(int var0, int var1, int var2, int var3) {
		field2039.field2276 = var2 - var0;
		field2039.field2274 = var3 - var1;
		method1399();
		if (field2039.field2278.length < field2039.field2274) {
			field2039.field2278 = new int[class50.method204(field2039.field2274)];
		}
		int var4 = var1 * class206.field1904 + var0;
		for (int var5 = 0; var5 < field2039.field2274; ++var5) {
			field2039.field2278[var5] = var4;
			var4 += class206.field1904;
		}
	}

	public static void method1399() {
		field2039.method1553();
	}

	public static void method1408(int var0, int var1) {
		int var2 = field2039.field2278[0];
		int var3 = var2 / class206.field1904;
		int var4 = var2 - var3 * class206.field1904;
		field2039.method1555(var0, var4, var1, var3);
	}

	public static void method1400(int var0, int var1, int var2) {
		field2039.method1554(var0, var1, var2);
	}

	static void method1403(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2040.method2101(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	public static void method1410(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2040.method2102(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	static void method1401(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2040.method2103(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method1402(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2040.method2100(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method1407(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2040.method2099(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	static void method1409(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2040.method2096(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
