public class class63 {

	public static class370[] field680;

	class63() throws Throwable {
	}

	public static int method280(int var0, int var1, int var2, class321 var3, class438 var4, boolean var5, int[] var6, int[] var7, class370 var8) {
		var8.method1915();
		int var10 = var8.method1908();
		int var11 = var8.method1913();
		int[][] var12 = var8.method1909();
		int[][] var13 = var8.method1914();
		int[] var14 = var8.method1910();
		int[] var15 = var8.method1911();
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
			var18 = var8.method1908();
			var19 = var8.method1913();
			int[][] var20 = var8.method1909();
			int[][] var21 = var8.method1914();
			int[] var22 = var8.method1910();
			int[] var23 = var8.method1911();
			var24 = var8.method1912();
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
			var22[0] = var0;
			var44 = var31 + 1;
			var23[0] = var1;
			int[][] var33 = var4.field3436;
			boolean var17;
			while (true) {
				if (var44 == var32) {
					var8.method1905(var25, var26);
					var17 = false;
					break;
				}
				var25 = var22[var32];
				var26 = var23[var32];
				var32 = var32 + 1 & var24;
				var27 = var25 - var29;
				var28 = var26 - var30;
				var34 = var25 - var4.field3433;
				int var35 = var26 - var4.field3434;
				if (var3.method1711(1, var25, var26, var4)) {
					var8.method1905(var25, var26);
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
			var16 = method281(var0, var1, var3, var4, var8);
		} else {
			var16 = method282(var0, var1, var2, var3, var4, var8);
		}
		int var37 = var0 - (var10 >> 1);
		var18 = var1 - (var11 >> 1);
		var19 = var8.method1906();
		int var38 = var8.method1907();
		int var39;
		int var41;
		if (!var16) {
			var39 = Integer.MAX_VALUE;
			var41 = Integer.MAX_VALUE;
			boolean var42 = true;
			var24 = var3.field2511;
			var25 = var3.field2510;
			var26 = var3.field2512;
			var27 = var3.field2513;
			for (var28 = var24 - 10; var28 <= 10 + var24; ++var28) {
				for (var29 = var25 - 10; var29 <= var25 + 10; ++var29) {
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
			var14[0] = var19;
			var39 = var40 + 1;
			var15[0] = var38;
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

	static final boolean method281(int var0, int var1, class321 var2, class438 var3, class370 var4) {
		int var6 = var4.method1908();
		int var7 = var4.method1913();
		int[][] var8 = var4.method1909();
		int[][] var9 = var4.method1914();
		int[] var10 = var4.method1910();
		int[] var11 = var4.method1911();
		int var12 = var4.method1912();
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
		var10[0] = var0;
		int var25 = var19 + 1;
		var11[0] = var1;
		int[][] var21 = var3.field3436;
		while (var20 != var25) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var22 = var13 - var3.field3433;
			int var23 = var14 - var3.field3434;
			if (var2.method1711(2, var13, var14, var3)) {
				var4.method1905(var13, var14);
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
		var4.method1905(var13, var14);
		return false;
	}

	static final boolean method282(int var0, int var1, int var2, class321 var3, class438 var4, class370 var5) {
		int var7 = var5.method1908();
		int var8 = var5.method1913();
		int[][] var9 = var5.method1909();
		int[][] var10 = var5.method1914();
		int[] var11 = var5.method1910();
		int[] var12 = var5.method1911();
		int var13 = var5.method1912();
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
		var11[0] = var0;
		int var27 = var20 + 1;
		var12[0] = var1;
		int[][] var22 = var4.field3436;
		while (true) {
			label264: while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label241: do {
								if (var21 == var27) {
									var5.method1905(var14, var15);
									return false;
								}
								var14 = var11[var21];
								var15 = var12[var21];
								var21 = var21 + 1 & var13;
								var16 = var14 - var18;
								var17 = var15 - var19;
								var23 = var14 - var4.field3433;
								var24 = var15 - var4.field3434;
								if (var3.method1711(var2, var14, var15, var4)) {
									var5.method1905(var14, var15);
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
							} while (var16 >= var7 - var2);
						} while (var17 >= var8 - var2);
					} while (var10[var16 + 1][var17 + 1] != 0);
				} while ((var22[var23 + var2][var2 + var24] & 19136992) != 0);
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
}
