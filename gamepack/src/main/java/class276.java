import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ix")
public class class276 {
	@ObfInfo(name = "ai", desc = "Ljl;")
	public static class529 field2238;
	@ObfInfo(name = "au", desc = "[I")
	public static int[] field2233;
	@ObfInfo(name = "ac", desc = "[I")
	public static int[] field2234;
	@ObfInfo(name = "at", desc = "[I")
	public static int[] field2236;
	@ObfInfo(name = "az", desc = "Lid;")
	static class140 field2239;
	@ObfInfo(name = "ao", desc = "[I")
	static int[] field2235;
	@ObfInfo(name = "ae", desc = "[I")
	static int[] field2237;
	@ObfInfo(name = "ap", desc = "Lid;")
	static final class140 field2240;
	@ObfInfo(name = "aa", desc = "Lid;")
	static final class140 field2241;

	static {
		field2233 = new int[65536];
		field2237 = new int[512];
		field2235 = new int[2048];
		field2236 = new int[2048];
		field2234 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2237[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2235[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2236[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field2234[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		field2238 = new class529();
		field2240 = new class495(field2238);
		field2241 = new class357(field2238);
		field2239 = field2240;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class276() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Z)V")
	public static void method1454(boolean var0) {
		if (var0 && class83.field873 != null) {
			field2239 = field2241;
		} else {
			field2239 = field2240;
		}

	}

	@ObfInfo(name = "ae", desc = "(Ljs;)V")
	public static void method1442(class65 var0) {
		field2238.field4225 = var0;
	}

	@ObfInfo(name = "ao", desc = "(D)V")
	public static void method1443(double var0) {
		method1461(var0, 0, 512);
	}

	@ObfInfo(name = "at", desc = "(DII)V")
	static void method1461(double var0, int var2, int var3) {
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
				var22 = method1460(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field2233[var4++] = var22;
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(ID)I")
	static int method1460(int var0, double var1) {
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

	@ObfInfo(name = "ai", desc = "()I")
	static int method1445() {
		return field2238.field4223;
	}

	@ObfInfo(name = "az", desc = "()I")
	static int method1446() {
		return field2238.field4232;
	}

	@ObfInfo(name = "ap", desc = "()I")
	static int method1447() {
		return field2238.field4228;
	}

	@ObfInfo(name = "aa", desc = "()I")
	static int method1444() {
		return field2238.field4234;
	}

	@ObfInfo(name = "af", desc = "()I")
	static int method1448() {
		return field2238.field4236;
	}

	@ObfInfo(name = "ad", desc = "()I")
	static int method1449() {
		return field2238.field4235;
	}

	@ObfInfo(name = "aq", desc = "()I")
	public static int method1450() {
		return field2238.field4226;
	}

	@ObfInfo(name = "al", desc = "()I")
	static int method1451() {
		return field2238.field4231;
	}

	@ObfInfo(name = "an", desc = "([III[F)V")
	public static void method1452(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2239 == field2241) {
			field2239 = field2240;
		}

		field2239.method818(var0, var1, var2, var3);
	}

	@ObfInfo(name = "ar", desc = "()V")
	public static void method1453() {
		method1462(class83.field875, class83.field876, class83.field869, class83.field874);
	}

	@ObfInfo(name = "ab", desc = "(IIII)V")
	static void method1462(int var0, int var1, int var2, int var3) {
		field2238.field4231 = var2 - var0;
		field2238.field4229 = var3 - var1;
		method1455();
		if (field2238.field4233.length < field2238.field4229) {
			field2238.field4233 = new int[class497.method2492(field2238.field4229)];
		}

		int var4 = var1 * class83.field870 + var0;

		for (int var5 = 0; var5 < field2238.field4229; ++var5) {
			field2238.field4233[var5] = var4;
			var4 += class83.field870;
		}

	}

	@ObfInfo(name = "ag", desc = "()V")
	public static void method1455() {
		field2238.method2573();
	}

	@ObfInfo(name = "am", desc = "(II)V")
	public static void method1464(int var0, int var1) {
		int var2 = field2238.field4233[0];
		int var3 = var2 / class83.field870;
		int var4 = var2 - var3 * class83.field870;
		field2238.method2575(var0, var4, var1, var3);
	}

	@ObfInfo(name = "ax", desc = "(III)V")
	public static void method1456(int var0, int var1, int var2) {
		field2238.method2574(var0, var1, var2);
	}

	@ObfInfo(name = "ah", desc = "(IIIIIIFFFIII)V")
	static void method1459(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2239.method822(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfInfo(name = "as", desc = "(IIIIIIFFFI)V")
	public static void method1466(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2239.method823(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfInfo(name = "ay", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	static void method1457(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2239.method824(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfInfo(name = "aj", desc = "(IIIIIIFFFIIIIIIIIIIIII)V")
	static void method1458(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2239.method821(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfInfo(name = "av", desc = "(IIIIIIFFFIIIBBBB)V")
	static void method1463(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2239.method820(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	@ObfInfo(name = "aw", desc = "(IIIIIIFFFIBBBB)V")
	static void method1465(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2239.method817(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
