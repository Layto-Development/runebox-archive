public class class528 implements class494 {
	public static final class528 field4256;
	public static final class528 field4257;
	public static final class528 field4258;
	public static final class528 field4262;
	static final class528 field4259;
	static final class528 field4261;
	static final class528[] field4255;
	public final int field4260;

	static {
		field4262 = new class528(14, 0);
		field4261 = new class528(15, 4);
		field4256 = new class528(16, -2);
		field4257 = new class528(18, -2);
		field4258 = new class528(19, -2);
		field4259 = new class528(27, 0);
		field4255 = new class528[32];
		class528[] var0 = new class528[]{field4262, field4261, field4257, field4259, field4258, field4256};
		class528[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field4255[var1[var2].field4260] = var1[var2];
		}

	}

	class528(int var1, int var2) {
		this.field4260 = var1;
	}

	public static class253 method2553(class215 var0, class215 var1, int var2, int var3) {
		return !class85.method558(var0, var2, var3) ? null : class190.method1039(var1.method1212(var2, var3));
	}

	static void method2551() {
		class281.field2506 = new class254(32);
	}

	public static int method2552(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(var7 + var1);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var3[var7 + var4] = -128;
				} else if (var8 == 8218) {
					var3[var4 + var7] = -126;
				} else if (var8 == 402) {
					var3[var7 + var4] = -125;
				} else if (var8 == 8222) {
					var3[var4 + var7] = -124;
				} else if (var8 == 8230) {
					var3[var4 + var7] = -123;
				} else if (var8 == 8224) {
					var3[var7 + var4] = -122;
				} else if (var8 == 8225) {
					var3[var7 + var4] = -121;
				} else if (var8 == 710) {
					var3[var7 + var4] = -120;
				} else if (var8 == 8240) {
					var3[var4 + var7] = -119;
				} else if (var8 == 352) {
					var3[var7 + var4] = -118;
				} else if (var8 == 8249) {
					var3[var4 + var7] = -117;
				} else if (var8 == 338) {
					var3[var7 + var4] = -116;
				} else if (var8 == 381) {
					var3[var7 + var4] = -114;
				} else if (var8 == 8216) {
					var3[var4 + var7] = -111;
				} else if (var8 == 8217) {
					var3[var7 + var4] = -110;
				} else if (var8 == 8220) {
					var3[var4 + var7] = -109;
				} else if (var8 == 8221) {
					var3[var7 + var4] = -108;
				} else if (var8 == 8226) {
					var3[var4 + var7] = -107;
				} else if (var8 == 8211) {
					var3[var4 + var7] = -106;
				} else if (var8 == 8212) {
					var3[var4 + var7] = -105;
				} else if (var8 == 732) {
					var3[var4 + var7] = -104;
				} else if (var8 == 8482) {
					var3[var4 + var7] = -103;
				} else if (var8 == 353) {
					var3[var4 + var7] = -102;
				} else if (var8 == 8250) {
					var3[var4 + var7] = -101;
				} else if (var8 == 339) {
					var3[var7 + var4] = -100;
				} else if (var8 == 382) {
					var3[var4 + var7] = -98;
				} else if (var8 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var4 + var7] = 63;
				}
			} else {
				var3[var7 + var4] = (byte)var8;
			}
		}

		return var6;
	}

	static final boolean method2554(int var0, int var1, class502 var2, class76 var3, class173 var4) {
		int var6 = var4.method982();
		int var7 = var4.method987();
		int[][] var8 = var4.method983();
		int[][] var9 = var4.method988();
		int[] var10 = var4.method984();
		int[] var11 = var4.method985();
		int var12 = var4.method986();
		int var13 = var0;
		int var14 = var1;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var0 - var15;
		int var18 = var1 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = var0;
		byte var10001 = var19;
		int var25 = var19 + 1;
		var11[var10001] = var1;
		int[][] var21 = var3.field839;

		while (var20 != var25) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var22 = var13 - var3.field836;
			int var23 = var14 - var3.field837;
			if (var2.method2421(2, var13, var14, var3)) {
				var4.method979(var13, var14);
				return true;
			}

			int var24 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + 1] & 19136824) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var24;
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 19136899) == 0 && (var21[var22 + 2][var23 + 1] & 19136992) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var24;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + 1][var23 - 1] & 19136899) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var24;
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 19136824) == 0 && (var21[var22 + 1][var23 + 2] & 19136992) == 0) {
				var10[var25] = var13;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var24;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 19136830) == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0 && (var21[var22][var23 - 1] & 19136911) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var24;
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 19136911) == 0 && (var21[var22 + 2][var23 - 1] & 19136899) == 0 && (var21[var22 + 2][var23] & 19136995) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 - 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var24;
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 19136830) == 0 && (var21[var22 - 1][var23 + 2] & 19136824) == 0 && (var21[var22][var23 + 2] & 19137016) == 0) {
				var10[var25] = var13 - 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var24;
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 2] & 19137016) == 0 && (var21[var22 + 2][var23 + 2] & 19136992) == 0 && (var21[var22 + 2][var23 + 1] & 19136995) == 0) {
				var10[var25] = var13 + 1;
				var11[var25] = var14 + 1;
				var25 = var25 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var24;
			}
		}

		var4.method979(var13, var14);
		return false;
	}
}
