public class class398 {
	static class115[] field3353;
	int field3352;
	final class342 field3350;
	final int field3351;

	class398(class342 var1, String var2) {
		this.field3352 = 0;
		this.field3350 = var1;
		this.field3351 = var1.method1224();
	}

	boolean method2076() {
		this.field3352 = 0;

		for (int var2 = 0; var2 < this.field3351; ++var2) {
			if (!this.field3350.method1878(var2) || this.field3350.method1877(var2)) {
				++this.field3352;
			}
		}

		return this.field3352 >= this.field3351;
	}

	public static final int method2075(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var4 * var2;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var0 * 6.0D * (var12 - var14) + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = (var12 - var14) * (0.6666666666666666D - var0) * 6.0D + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	public static class22 method2078(class215 var0, class215 var1, int var2, boolean var3) {
		boolean var5 = true;
		int[] var6 = var0.method1223(var2);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var0.method1220(var2, var6[var7]);
			if (null == var8) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10;
				if (var3) {
					var10 = var1.method1220(0, var9);
				} else {
					var10 = var1.method1220(var9, 0);
				}

				if (null == var10) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new class22(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	static class224 method2077(int var0) {
		class224 var2 = (class224)class451.method2249(class209.method1175(), var0);
		if (var2 == null) {
			var2 = class224.field2036;
		}

		return var2;
	}

	static final void method2079(class60 var0, int var1) {
		if (null == var0.field693) {
			throw new RuntimeException();
		} else {
			if (null == var0.field785) {
				var0.field785 = new int[var0.field693.length];
			}

			var0.field785[var1] = Integer.MAX_VALUE;
		}
	}
}
