public class class133 {
	public static class17 field1293;
	public static int[] field1288;
	public static int[] field1289;
	public static int[] field1291;
	static class193 field1294;
	static int[] field1290;
	static int[] field1292;
	static final class193 field1295;
	static final class193 field1296;

	static {
		field1288 = new int[65536];
		field1292 = new int[512];
		field1290 = new int[2048];
		field1291 = new int[2048];
		field1289 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field1292[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field1290[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field1291[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field1289[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		field1293 = new class17();
		field1295 = new class373(field1293);
		field1296 = new class195(field1293);
		field1294 = field1295;
	}

	class133() throws Throwable {
	}

	public static void method792(boolean var0) {
		if (var0 && class266.field2407 != null) {
			field1294 = field1296;
		} else {
			field1294 = field1295;
		}

	}

	public static void method780(class360 var0) {
		field1293.field389 = var0;
	}

	public static void method781(double var0) {
		method799(var0, 0, 512);
	}

	static void method799(double var0, int var2, int var3) {
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
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

				int var30 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var29 = (int)(var17 * 256.0D);
				int var22 = (var30 << 16) + (var20 << 8) + var29;
				var22 = method798(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field1288[var4++] = var22;
			}
		}

	}

	static int method798(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	static int method783() {
		return field1293.field387;
	}

	static int method784() {
		return field1293.field396;
	}

	static int method785() {
		return field1293.field392;
	}

	static int method782() {
		return field1293.field398;
	}

	static int method786() {
		return field1293.field400;
	}

	static int method787() {
		return field1293.field399;
	}

	public static int method788() {
		return field1293.field390;
	}

	static int method789() {
		return field1293.field395;
	}

	public static void method790(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field1294 == field1296) {
			field1294 = field1295;
		}

		field1294.method1050(var0, var1, var2, var3);
	}

	public static void method791() {
		method800(class266.field2409, class266.field2410, class266.field2403, class266.field2408);
	}

	static void method800(int var0, int var1, int var2, int var3) {
		field1293.field395 = var2 - var0;
		field1293.field393 = var3 - var1;
		method793();
		if (field1293.field397.length < field1293.field393) {
			field1293.field397 = new int[class476.method2304(field1293.field393)];
		}

		int var4 = var1 * class266.field2404 + var0;

		for (int var5 = 0; var5 < field1293.field393; ++var5) {
			field1293.field397[var5] = var4;
			var4 += class266.field2404;
		}

	}

	public static void method793() {
		field1293.method127();
	}

	public static void method802(int var0, int var1) {
		int var2 = field1293.field397[0];
		int var3 = var2 / class266.field2404;
		int var4 = var2 - var3 * class266.field2404;
		field1293.method129(var0, var4, var1, var3);
	}

	public static void method794(int var0, int var1, int var2) {
		field1293.method128(var0, var1, var2);
	}

	static void method797(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field1294.method1054(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	public static void method804(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field1294.method1055(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	static void method795(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field1294.method1056(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method796(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field1294.method1053(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	static void method801(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field1294.method1052(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	static void method803(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field1294.method1049(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
