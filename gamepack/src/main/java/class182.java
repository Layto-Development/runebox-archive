public class class182 {
	public static final class182 field1714;
	public static final class182 field1715;
	public static final class182 field1716;
	public static final class182 field1717;
	public static final class182 field1719;
	public static final class182 field1721;
	static int field1720;
	String field1718;

	static {
		field1717 = new class182("p11_full");
		field1716 = new class182("p12_full");
		field1719 = new class182("b12_full");
		field1715 = new class182("verdana_11pt_regular");
		field1721 = new class182("verdana_13pt_regular");
		field1714 = new class182("verdana_15pt_regular");
	}

	class182(String var1) {
		this.field1718 = var1;
	}

	public static long method1013(int var0, int var1, int var2, boolean var3, int var4) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	static final boolean method1012(int var0, int var1, int var2, class502 var3, class76 var4, class173 var5) {
		int var7 = var5.method982();
		int var8 = var5.method987();
		int[][] var9 = var5.method983();
		int[][] var10 = var5.method988();
		int[] var11 = var5.method984();
		int[] var12 = var5.method985();
		int var13 = var5.method986();
		int var14 = var0;
		int var15 = var1;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var0 - var16;
		int var19 = var1 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[var20] = var0;
		int var27 = var20 + 1;
		var12[var20] = var1;
		int[][] var22 = var4.field839;

		while (true) {
			label264:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label241:
							do {
								if (var21 == var27) {
									var5.method979(var14, var15);
									return false;
								}

								var14 = var11[var21];
								var15 = var12[var21];
								var21 = var21 + 1 & var13;
								var16 = var14 - var18;
								var17 = var15 - var19;
								var23 = var14 - var4.field836;
								var24 = var15 - var4.field837;
								if (var3.method2421(var2, var14, var15, var4)) {
									var5.method979(var14, var15);
									return true;
								}

								var25 = 1 + var9[var16][var17];
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 19136782) == 0 && (var22[var23 - 1][var2 + var24 - 1] & 19136824) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var2 - 1) {
											var11[var27] = var14 - 1;
											var12[var27] = var15;
											var27 = var27 + 1 & var13;
											var10[var16 - 1][var17] = 2;
											var9[var16 - 1][var17] = var25;
											break;
										}

										if ((var22[var23 - 1][var26 + var24] & 19136830) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 < var7 - var2 && var10[var16 + 1][var17] == 0 && (var22[var23 + var2][var24] & 19136899) == 0 && (var22[var23 + var2][var2 + var24 - 1] & 19136992) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var2 - 1) {
											var11[var27] = var14 + 1;
											var12[var27] = var15;
											var27 = var27 + 1 & var13;
											var10[var16 + 1][var17] = 8;
											var9[var16 + 1][var17] = var25;
											break;
										}

										if ((var22[var23 + var2][var26 + var24] & 19136995) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 19136782) == 0 && (var22[var23 + var2 - 1][var24 - 1] & 19136899) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var2 - 1) {
											var11[var27] = var14;
											var12[var27] = var15 - 1;
											var27 = var27 + 1 & var13;
											var10[var16][var17 - 1] = 1;
											var9[var16][var17 - 1] = var25;
											break;
										}

										if ((var22[var23 + var26][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var17 < var8 - var2 && var10[var16][var17 + 1] == 0 && (var22[var23][var24 + var2] & 19136824) == 0 && (var22[var23 + var2 - 1][var2 + var24] & 19136992) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var2 - 1) {
											var11[var27] = var14;
											var12[var27] = var15 + 1;
											var27 = var27 + 1 & var13;
											var10[var16][var17 + 1] = 4;
											var9[var16][var17 + 1] = var25;
											break;
										}

										if ((var22[var26 + var23][var2 + var24] & 19137016) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 19136782) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var2) {
											var11[var27] = var14 - 1;
											var12[var27] = var15 - 1;
											var27 = var27 + 1 & var13;
											var10[var16 - 1][var17 - 1] = 3;
											var9[var16 - 1][var17 - 1] = var25;
											break;
										}

										if ((var22[var23 - 1][var26 + (var24 - 1)] & 19136830) != 0 || (var22[var23 - 1 + var26][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 < var7 - var2 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var23 + var2][var24 - 1] & 19136899) == 0) {
									var26 = 1;

									while (true) {
										if (var26 >= var2) {
											var11[var27] = var14 + 1;
											var12[var27] = var15 - 1;
											var27 = var27 + 1 & var13;
											var10[var16 + 1][var17 - 1] = 9;
											var9[var16 + 1][var17 - 1] = var25;
											break;
										}

										if ((var22[var23 + var2][var24 - 1 + var26] & 19136995) != 0 || (var22[var23 + var26][var24 - 1] & 19136911) != 0) {
											break;
										}

										++var26;
									}
								}

								if (var16 > 0 && var17 < var8 - var2 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var24 + var2] & 19136824) == 0) {
									for (var26 = 1; var26 < var2; ++var26) {
										if ((var22[var23 - 1][var24 + var26] & 19136830) != 0 || (var22[var23 - 1 + var26][var2 + var24] & 19137016) != 0) {
											continue label241;
										}
									}

									var11[var27] = var14 - 1;
									var12[var27] = var15 + 1;
									var27 = var27 + 1 & var13;
									var10[var16 - 1][var17 + 1] = 6;
									var9[var16 - 1][var17 + 1] = var25;
								}
							} while(var16 >= var7 - var2);
						} while(var17 >= var8 - var2);
					} while(var10[var16 + 1][var17 + 1] != 0);
				} while((var22[var23 + var2][var2 + var24] & 19136992) != 0);

				for (var26 = 1; var26 < var2; ++var26) {
					if ((var22[var23 + var26][var24 + var2] & 19137016) != 0 || (var22[var2 + var23][var24 + var26] & 19136995) != 0) {
						continue label264;
					}
				}

				var11[var27] = var14 + 1;
				var12[var27] = var15 + 1;
				var27 = var27 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var25;
			}
		}
	}

	static void method1011(int var0) {
		class393 var2 = class114.method702(var0);
		if (var2.method2062()) {
			if (class516.method2515(var2.field3292, (byte)94) == 2) {
				Client.field172.add(var2.field3292);
			}

		}
	}
}
