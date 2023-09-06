public final class class239 {
	static int field2207;

	class239() throws Throwable {
	}

	public static int method1365(int var0, int var1, int var2, class502 var3, class76 var4, boolean var5, int[] var6, int[] var7, class173 var8) {
		var8.method989();
		int var10 = var8.method982();
		int var11 = var8.method987();
		int[][] var12 = var8.method983();
		int[][] var13 = var8.method988();
		int[] var14 = var8.method984();
		int[] var15 = var8.method985();
		boolean var16;
		int var18;
		int var19;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		int var29;
		int var30;
		int var32;
		int var34;
		int var44;
		if (var2 == 1) {
			var18 = var8.method982();
			var19 = var8.method987();
			int[][] var20 = var8.method983();
			int[][] var21 = var8.method988();
			int[] var22 = var8.method984();
			int[] var23 = var8.method985();
			var24 = var8.method986();
			var25 = var0;
			var26 = var1;
			var27 = var18 >> 1;
			var28 = var19 >> 1;
			var29 = var0 - var27;
			var30 = var1 - var28;
			var21[var27][var28] = 99;
			var20[var27][var28] = 0;
			byte var31 = 0;
			var32 = 0;
			var22[var31] = var0;
			var44 = var31 + 1;
			var23[var31] = var1;
			int[][] var33 = var4.field839;

			boolean var17;
			while (true) {
				if (var44 == var32) {
					var8.method979(var25, var26);
					var17 = false;
					break;
				}

				var25 = var22[var32];
				var26 = var23[var32];
				var32 = var32 + 1 & var24;
				var27 = var25 - var29;
				var28 = var26 - var30;
				var34 = var25 - var4.field836;
				int var35 = var26 - var4.field837;
				if (var3.method2421(1, var25, var26, var4)) {
					var8.method979(var25, var26);
					var17 = true;
					break;
				}

				int var36 = 1 + var20[var27][var28];
				if (var27 > 0 && var21[var27 - 1][var28] == 0 && (var33[var34 - 1][var35] & 19136776) == 0) {
					var22[var44] = var25 - 1;
					var23[var44] = var26;
					var44 = var44 + 1 & var24;
					var21[var27 - 1][var28] = 2;
					var20[var27 - 1][var28] = var36;
				}

				if (var27 < var18 - 1 && var21[var27 + 1][var28] == 0 && (var33[var34 + 1][var35] & 19136896) == 0) {
					var22[var44] = var25 + 1;
					var23[var44] = var26;
					var44 = var44 + 1 & var24;
					var21[var27 + 1][var28] = 8;
					var20[var27 + 1][var28] = var36;
				}

				if (var28 > 0 && var21[var27][var28 - 1] == 0 && (var33[var34][var35 - 1] & 19136770) == 0) {
					var22[var44] = var25;
					var23[var44] = var26 - 1;
					var44 = var44 + 1 & var24;
					var21[var27][var28 - 1] = 1;
					var20[var27][var28 - 1] = var36;
				}

				if (var28 < var19 - 1 && var21[var27][var28 + 1] == 0 && (var33[var34][var35 + 1] & 19136800) == 0) {
					var22[var44] = var25;
					var23[var44] = var26 + 1;
					var44 = var44 + 1 & var24;
					var21[var27][var28 + 1] = 4;
					var20[var27][var28 + 1] = var36;
				}

				if (var27 > 0 && var28 > 0 && var21[var27 - 1][var28 - 1] == 0 && (var33[var34 - 1][var35 - 1] & 19136782) == 0 && (var33[var34 - 1][var35] & 19136776) == 0 && (var33[var34][var35 - 1] & 19136770) == 0) {
					var22[var44] = var25 - 1;
					var23[var44] = var26 - 1;
					var44 = var44 + 1 & var24;
					var21[var27 - 1][var28 - 1] = 3;
					var20[var27 - 1][var28 - 1] = var36;
				}

				if (var27 < var18 - 1 && var28 > 0 && var21[var27 + 1][var28 - 1] == 0 && (var33[var34 + 1][var35 - 1] & 19136899) == 0 && (var33[var34 + 1][var35] & 19136896) == 0 && (var33[var34][var35 - 1] & 19136770) == 0) {
					var22[var44] = var25 + 1;
					var23[var44] = var26 - 1;
					var44 = var44 + 1 & var24;
					var21[var27 + 1][var28 - 1] = 9;
					var20[var27 + 1][var28 - 1] = var36;
				}

				if (var27 > 0 && var28 < var19 - 1 && var21[var27 - 1][var28 + 1] == 0 && (var33[var34 - 1][var35 + 1] & 19136824) == 0 && (var33[var34 - 1][var35] & 19136776) == 0 && (var33[var34][var35 + 1] & 19136800) == 0) {
					var22[var44] = var25 - 1;
					var23[var44] = var26 + 1;
					var44 = var44 + 1 & var24;
					var21[var27 - 1][var28 + 1] = 6;
					var20[var27 - 1][var28 + 1] = var36;
				}

				if (var27 < var18 - 1 && var28 < var19 - 1 && var21[var27 + 1][var28 + 1] == 0 && (var33[var34 + 1][var35 + 1] & 19136992) == 0 && (var33[var34 + 1][var35] & 19136896) == 0 && (var33[var34][var35 + 1] & 19136800) == 0) {
					var22[var44] = var25 + 1;
					var23[var44] = var26 + 1;
					var44 = var44 + 1 & var24;
					var21[var27 + 1][var28 + 1] = 12;
					var20[var27 + 1][var28 + 1] = var36;
				}
			}

			var16 = var17;
		} else if (var2 == 2) {
			var16 = class528.method2554(var0, var1, var3, var4, var8);
		} else {
			var16 = class182.method1012(var0, var1, var2, var3, var4, var8);
		}

		int var37 = var0 - (var10 >> 1);
		var18 = var1 - (var11 >> 1);
		var19 = var8.method980();
		int var38 = var8.method981();
		int var39;
		int var41;
		if (!var16) {
			if (!var5) {
				return -1;
			}

			var39 = Integer.MAX_VALUE;
			var41 = Integer.MAX_VALUE;
			byte var42 = 10;
			var24 = var3.field4162;
			var25 = var3.field4161;
			var26 = var3.field4163;
			var27 = var3.field4164;

			for (var28 = var24 - var42; var28 <= var42 + var24; ++var28) {
				for (var29 = var25 - var42; var29 <= var25 + var42; ++var29) {
					var30 = var28 - var37;
					var44 = var29 - var18;
					if (var30 >= 0 && var44 >= 0 && var30 < var10 && var44 < var11 && var12[var30][var44] < 100) {
						var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var24 + var26 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var45 = 0;
						if (var29 < var25) {
							var45 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var45 = var29 - (var27 + var25 - 1);
						}

						var34 = var45 * var45 + var32 * var32;
						if (var34 < var39 || var34 == var39 && var12[var30][var44] < var41) {
							var39 = var34;
							var41 = var12[var30][var44];
							var19 = var28;
							var38 = var29;
						}
					}
				}
			}

			if (var39 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var19 && var1 == var38) {
			var6[0] = var19;
			var7[0] = var38;
			return 0;
		} else {
			byte var40 = 0;
			var14[var40] = var19;
			var39 = var40 + 1;
			var15[var40] = var38;

			int var43;
			for (var41 = var43 = var13[var19 - var37][var38 - var18]; var19 != var0 || var1 != var38; var41 = var13[var19 - var37][var38 - var18]) {
				if (var41 != var43) {
					var43 = var41;
					var14[var39] = var19;
					var15[var39++] = var38;
				}

				if ((var41 & 2) != 0) {
					++var19;
				} else if ((var41 & 8) != 0) {
					--var19;
				}

				if ((var41 & 1) != 0) {
					++var38;
				} else if ((var41 & 4) != 0) {
					--var38;
				}
			}

			var24 = 0;

			while (var39-- > 0) {
				var6[var24] = var14[var39];
				var7[var24++] = var15[var39];
				if (var24 >= var6.length) {
					break;
				}
			}

			return var24;
		}
	}

	public static final class115 method1364(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var7 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
		class115 var9;
		if (!var5) {
			var9 = (class115)class210.field1937.method1890(var7);
			if (var9 != null) {
				return var9;
			}
		}

		class210 var10 = class67.method492(var0);
		if (var1 > 1 && null != var10.field1970) {
			int var11 = -1;

			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field1971[var12] && var10.field1971[var12] != 0) {
					var11 = var10.field1970[var12];
				}
			}

			if (var11 != -1) {
				var10 = class67.method492(var11);
			}
		}

		class250 var23 = var10.method1185(1);
		if (var23 == null) {
			return null;
		} else {
			class115 var24 = null;
			if (var10.field1945 != -1) {
				var24 = method1364(var10.field1972, 10, 1, 0, 0, true);
				if (null == var24) {
					return null;
				}
			} else if (var10.field1966 != -1) {
				var24 = method1364(var10.field1958, var1, var2, var3, 0, false);
				if (var24 == null) {
					return null;
				}
			} else if (var10.field1985 != -1) {
				var24 = method1364(var10.field1944, var1, 0, 0, 0, false);
				if (null == var24) {
					return null;
				}
			}

			int[] var13 = class266.field2406;
			int var14 = class266.field2404;
			int var15 = class266.field2405;
			float[] var16 = class266.field2407;
			int[] var17 = new int[4];
			class266.method1544(var17);
			var9 = new class115(36, 32);
			class133.method790(var9.field1083, 36, 32, (float[])null);
			class266.method1545();
			class133.method791();
			class133.method802(16, 16);
			class133.field1293.field388 = false;
			if (var10.field1985 != -1) {
				var24.method732(0, 0);
			}

			int var18 = var10.field1953;
			if (var5) {
				var18 = (int)((double)var18 * 1.5D);
			} else if (var2 == 2) {
				var18 = (int)((double)var18 * 1.04D);
			}

			int var19 = class133.field1291[var10.field1930] * var18 >> 16;
			int var20 = class133.field1289[var10.field1930] * var18 >> 16;
			var23.method1452();
			var23.method1458(0, var10.field1946, var10.field1932, var10.field1930, var10.field1931, var19 + var23.field4080 / 2 + var10.field1948, var10.field1948 + var20);
			if (var10.field1966 != -1) {
				var24.method732(0, 0);
			}

			if (var2 >= 1) {
				var9.method710(1);
			}

			if (var2 >= 2) {
				var9.method710(16777215);
			}

			if (var3 != 0) {
				var9.method711(var3);
			}

			class133.method790(var9.field1083, 36, 32, (float[])null);
			if (var10.field1945 != -1) {
				var24.method732(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var10.field1949 == 1) {
				class253 var21 = class315.field2825;
				String var22;
				if (var1 < 100000) {
					var22 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var22 = "<col=ffffff>" + var1 / 1000 + class433.field3718 + "</col>";
				} else {
					var22 = "<col=00ff80>" + var1 / 1000000 + class433.field3716 + "</col>";
				}

				var21.method1320(var22, 0, 9, 16776960, 1);
			}

			if (!var5) {
				class210.field1937.method1889(var9, var7);
			}

			class133.method790(var13, var14, var15, var16);
			class266.method1564(var17);
			class133.method791();
			class133.field1293.field388 = true;
			return var9;
		}
	}
}
