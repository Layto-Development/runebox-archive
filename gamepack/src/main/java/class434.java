public class class434 {
	static class169 field3851;
	int field3852;
	int field3853;
	int field3854;
	int field3855;

	class434(int var1, int var2, int var3, int var4) {
		this.field3854 = var1;
		this.field3855 = var2;
		this.field3852 = var3;
		this.field3853 = var4;
	}

	int method2203() {
		return this.field3854;
	}

	int method2204() {
		return this.field3855;
	}

	int method2202() {
		return this.field3852;
	}

	int method2200() {
		return this.field3853;
	}

	static String method2205(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / var1; var5 != 0; ++var4) {
					var5 /= var1;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var0;
					var0 /= var1;
					int var9 = var8 - var1 * var0;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				return new String(var6);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	static final void method2201(int var0, int var1, int var2, int var3, int var4) {
		long var6 = class415.field3487.method1790(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var24;
		if (0L != var6) {
			var8 = class415.field3487.method1772(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = 0L != var6;
			if (var13) {
				boolean var14 = (int)(var6 >>> 16 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var23 = class268.field2420.field1083;
			var24 = (103 - var2) * 2048 + 24624 + var1 * 4;
			var15 = class67.method491(var6);
			class235 var16 = class96.method638(var15, (byte)8);
			if (var16.field2139 != -1) {
				class25 var17 = class316.field2828[var16.field2139];
				if (null != var17) {
					int var18 = (var16.field2121 * 4 - var17.field450) / 2;
					int var19 = (var16.field2106 * 4 - var17.field451) / 2;
					var17.method207(var18 + var1 * 4 + 48, var19 + 48 + 4 * (104 - var2 - var16.field2106));
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var23[var24] = var11;
						var23[var24 + 512] = var11;
						var23[var24 + 1024] = var11;
						var23[var24 + 1536] = var11;
					} else if (var9 == 1) {
						var23[var24] = var11;
						var23[var24 + 1] = var11;
						var23[var24 + 2] = var11;
						var23[var24 + 3] = var11;
					} else if (var9 == 2) {
						var23[var24 + 3] = var11;
						var23[var24 + 3 + 512] = var11;
						var23[var24 + 3 + 1024] = var11;
						var23[1536 + var24 + 3] = var11;
					} else if (var9 == 3) {
						var23[var24 + 1536] = var11;
						var23[1 + var24 + 1536] = var11;
						var23[2 + var24 + 1536] = var11;
						var23[3 + var24 + 1536] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var23[var24] = var11;
					} else if (var9 == 1) {
						var23[var24 + 3] = var11;
					} else if (var9 == 2) {
						var23[var24 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var23[var24 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var23[var24] = var11;
						var23[var24 + 512] = var11;
						var23[var24 + 1024] = var11;
						var23[var24 + 1536] = var11;
					} else if (var9 == 0) {
						var23[var24] = var11;
						var23[var24 + 1] = var11;
						var23[var24 + 2] = var11;
						var23[var24 + 3] = var11;
					} else if (var9 == 1) {
						var23[var24 + 3] = var11;
						var23[var24 + 3 + 512] = var11;
						var23[1024 + var24 + 3] = var11;
						var23[var24 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var23[var24 + 1536] = var11;
						var23[1 + var24 + 1536] = var11;
						var23[var24 + 1536 + 2] = var11;
						var23[3 + var24 + 1536] = var11;
					}
				}
			}
		}

		var6 = class415.field3487.method1771(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class415.field3487.method1772(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class67.method491(var6);
			class235 var12 = class96.method638(var11, (byte)17);
			if (var12.field2139 != -1) {
				class25 var25 = class316.field2828[var12.field2139];
				if (null != var25) {
					var24 = (var12.field2121 * 4 - var25.field450) / 2;
					var15 = (var12.field2106 * 4 - var25.field451) / 2;
					var25.method207(var24 + 48 + var1 * 4, var15 + 4 * (104 - var2 - var12.field2106) + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var27 = 0L != var6;
				if (var27) {
					boolean var28 = (int)(var6 >>> 16 & 1L) == 1;
					var27 = !var28;
				}

				if (var27) {
					var26 = 15597568;
				}

				int[] var29 = class268.field2420.field1083;
				int var30 = 24624 + var1 * 4 + (103 - var2) * 2048;
				if (var9 != 0 && var9 != 2) {
					var29[var30] = var26;
					var29[1 + var30 + 512] = var26;
					var29[2 + var30 + 1024] = var26;
					var29[var30 + 1536 + 3] = var26;
				} else {
					var29[var30 + 1536] = var26;
					var29[1 + var30 + 1024] = var26;
					var29[2 + var30 + 512] = var26;
					var29[var30 + 3] = var26;
				}
			}
		}

		var6 = class415.field3487.method1804(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class67.method491(var6);
			class235 var20 = class96.method638(var8, (byte)35);
			if (var20.field2139 != -1) {
				class25 var21 = class316.field2828[var20.field2139];
				if (var21 != null) {
					var11 = (var20.field2121 * 4 - var21.field450) / 2;
					int var22 = (var20.field2106 * 4 - var21.field451) / 2;
					var21.method207(var11 + var1 * 4 + 48, 4 * (104 - var2 - var20.field2106) + 48 + var22);
				}
			}
		}

	}
}
