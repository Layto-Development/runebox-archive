public final class class502 {

	static byte[][][] field4037;

	static class13 field4026;

	static int field4025;

	static int field4027;

	static int field4034;

	static int field4039;

	static int[] field4029;

	static int[][][] field4035;

	static short[][][] field4028;

	static final int[] field4030;

	static final int[] field4031;

	static final int[] field4032;

	static final int[] field4033;

	static final int[] field4036;

	static final int[] field4038;

	static {
		field4035 = new int[4][105][105];
		field4037 = new byte[4][104][104];
		field4027 = 99;
		field4030 = new int[] { 1, 2, 4, 8 };
		field4031 = new int[] { 16, 32, 64, 128 };
		field4032 = new int[] { 1, 0, -1, 0 };
		field4033 = new int[] { 0, -1, 0, 1 };
		field4038 = new int[] { 1, -1, -1, 1 };
		field4036 = new int[] { -1, -1, 1, 1 };
		field4034 = (int) (Math.random() * 17.0D) - 8;
		field4039 = (int) (Math.random() * 33.0D) - 16;
	}

	class502() throws Throwable {
	}

	public static class84 method2418(class338 var0, int var1, int var2) {
		return !class494.method2361(var0, var1, 0) ? null : class494.method2363();
	}

	static void method2434() {
		field4027 = 99;
		field4028 = new short[4][104][104];
		class357.field2836 = new short[4][104][104];
		class132.field1475 = new byte[4][104][104];
		class446.field3466 = new byte[4][104][104];
		class119.field1432 = new int[4][105][105];
		class343.field2606 = new byte[4][105][105];
		class236.field2029 = new int[105][105];
		class507.field4073 = new int[104];
		class320.field2509 = new int[104];
		field4029 = new int[104];
		class339.field2592 = new int[104];
		class221.field1978 = new int[104];
	}

	static void method2421() {
		field4028 = (short[][][]) null;
		class357.field2836 = (short[][][]) null;
		class132.field1475 = (byte[][][]) null;
		class446.field3466 = (byte[][][]) null;
		class119.field1432 = (int[][][]) null;
		class343.field2606 = (byte[][][]) null;
		class236.field2029 = (int[][]) null;
		class507.field4073 = null;
		class320.field2509 = null;
		field4029 = null;
		class339.field2592 = null;
		class221.field1978 = null;
	}

	static final void method2420(int var0, int var1, int var2, int var3) {
		for (int var5 = var1; var5 <= var1 + var3; ++var5) {
			for (int var6 = var0; var6 <= var0 + var2; ++var6) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					class343.field2606[0][var6][var5] = 127;
					if (var6 == var0 && var6 > 0) {
						field4035[0][var6][var5] = field4035[0][var6 - 1][var5];
					}
					if (var6 == var2 + var0 && var6 < 103) {
						field4035[0][var6][var5] = field4035[0][var6 + 1][var5];
					}
					if (var5 == var1 && var5 > 0) {
						field4035[0][var6][var5] = field4035[0][var6][var5 - 1];
					}
					if (var5 == var3 + var1 && var5 < 103) {
						field4035[0][var6][var5] = field4035[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	static final void method2430(byte[] var0, int var1, int var2, int var3, int var4, class438[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var8 + var1 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
						int[] var10000 = var5[var7].field3436[var8 + var1];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}
		class187 var13 = new class187(var0);
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var2 + var10;
					method2422(var13, var8, var11, var12, var3 + var11, var12 + var4, 0);
				}
			}
		}
	}

	static final void method2433(int var0, int var1, int var2) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				field4035[var0][var4 + var1][var5 + var2] = 0;
			}
		}
		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				field4035[var0][var1][var2 + var4] = field4035[var0][var1 - 1][var4 + var2];
			}
		}
		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				field4035[var0][var1 + var4][var2] = field4035[var0][var4 + var1][var2 - 1];
			}
		}
		if (var1 > 0 && field4035[var0][var1 - 1][var2] != 0) {
			field4035[var0][var1][var2] = field4035[var0][var1 - 1][var2];
		} else if (var2 > 0 && field4035[var0][var1][var2 - 1] != 0) {
			field4035[var0][var1][var2] = field4035[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && field4035[var0][var1 - 1][var2 - 1] != 0) {
			field4035[var0][var1][var2] = field4035[var0][var1 - 1][var2 - 1];
		}
	}

	static final void method2422(class187 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (class512.method2460(var1, var2, var3)) {
			field4037[var1][var2][var3] = 0;
			while (true) {
				var8 = var0.method1145();
				if (var8 == 0) {
					if (var1 == 0) {
						int[] var15 = field4035[0][var2];
						int var12 = var4 + 932731;
						int var13 = var5 + 556238;
						int var14 = method2428(var12 + 45365, var13 + 91923, 4) - 128 + (method2428(var12 + 10294, var13 + 37821, 2) - 128 >> 1) + (method2428(var12, var13, 1) - 128 >> 2);
						var14 = (int) ((double) var14 * 0.3D) + 35;
						if (var14 < 10) {
							var14 = 10;
						} else if (var14 > 60) {
							var14 = 60;
						}
						var15[var3] = -var14 * 8;
					} else {
						field4035[var1][var2][var3] = field4035[var1 - 1][var2][var3] - 240;
					}
					break;
				}
				if (var8 == 1) {
					int var9 = var0.method1096();
					if (var9 == 1) {
						var9 = 0;
					}
					if (var1 == 0) {
						field4035[0][var2][var3] = -var9 * 8;
					} else {
						field4035[var1][var2][var3] = field4035[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}
				if (var8 <= 49) {
					class357.field2836[var1][var2][var3] = (short) var0.method1098();
					class132.field1475[var1][var2][var3] = (byte) ((var8 - 2) / 4);
					class446.field3466[var1][var2][var3] = (byte) (var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					field4037[var1][var2][var3] = (byte) (var8 - 49);
				} else {
					field4028[var1][var2][var3] = (short) (var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.method1145();
				if (var8 == 0) {
					break;
				}
				if (var8 == 1) {
					var0.method1096();
					break;
				}
				if (var8 <= 49) {
					var0.method1098();
				}
			}
		}
	}

	static final boolean method2427(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		class187 var5 = new class187(var0);
		int var6 = -1;
		label57: while (true) {
			int var7 = var5.method1109();
			if (var7 == 0) {
				return var4;
			}
			var6 += var7;
			int var8 = 0;
			boolean var9 = false;
			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method1143();
					if (var10 == 0) {
						continue label57;
					}
					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method1096() >> 2;
					int var14 = var12 + var1;
					int var15 = var11 + var2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class362 var16 = class319.method1705(var6, (byte) -45);
						if (var13 != 22 || !Client.field902 || var16.field2892 != 0 || var16.field2885 == 1 || var16.field2872) {
							if (!var16.method1889()) {
								++Client.field970;
								var4 = false;
							}
							var9 = true;
						}
					}
				}
				var10 = var5.method1143();
				if (var10 == 0) {
					break;
				}
				var5.method1096();
			}
		}
	}

	static final void method2435(byte[] var0, int var1, int var2, class372 var3, class438[] var4) {
		class187 var6 = new class187(var0);
		int var7 = -1;
		while (true) {
			int var8 = var6.method1109();
			if (var8 == 0) {
				return;
			}
			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method1143();
				if (var10 == 0) {
					break;
				}
				var9 += var10 - 1;
				int var11 = var9 & 63;
				int var12 = var9 >> 6 & 63;
				int var13 = var9 >> 12;
				int var14 = var6.method1096();
				int var15 = var14 >> 2;
				int var16 = var14 & 3;
				int var17 = var1 + var12;
				int var18 = var11 + var2;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field4037[1][var17][var18] & 2) == 2) {
						var19 = var13 - 1;
					}
					class438 var20 = null;
					if (var19 >= 0) {
						var20 = var4[var19];
					}
					class339.method1791(var13, var17, var18, var7, var16, var15, var3, var20);
				}
			}
		}
	}

	static final void method2417(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class372 var8, class438[] var9) {
		class187 var10 = new class187(var0);
		int var11 = -1;
		while (true) {
			int var12 = var10.method1109();
			if (var12 == 0) {
				return;
			}
			var11 += var12;
			int var13 = 0;
			while (true) {
				int var14 = var10.method1143();
				if (var14 == 0) {
					break;
				}
				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.method1096();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					class362 var21 = class319.method1705(var11, (byte) -48);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.field2883;
					int var28 = var21.field2868;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}
					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}
					var29 = var2 + var23;
					int var30 = var3 + class215.method1294(var16 & 7, var15 & 7, var7, var21.field2883, var21.field2868, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((field4037[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}
						class438 var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}
						class339.method1791(var1, var29, var30, var11, var7 + var20 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	static final void method2425(class372 var0, class438[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((field4037[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if ((field4037[1][var4][var5] & 2) == 2) {
							var6 = var3 - 1;
						}
						if (var6 >= 0) {
							var1[var6].method2182(var4, var5);
						}
					}
				}
			}
		}
		field4034 += (int) (Math.random() * 5.0D) - 2;
		if (field4034 < -8) {
			field4034 = -8;
		}
		if (field4034 > 8) {
			field4034 = 8;
		}
		field4039 += (int) (Math.random() * 5.0D) - 2;
		if (field4039 < -16) {
			field4039 = -16;
		}
		if (field4039 > 16) {
			field4039 = 16;
		}
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		for (var3 = 0; var3 < 4; ++var3) {
			byte[][] var48 = class343.field2606[var3];
			boolean var49 = true;
			boolean var50 = true;
			boolean var7 = true;
			boolean var8 = true;
			boolean var9 = true;
			var10 = (int) Math.sqrt(5100.0D);
			var11 = var10 * 768 >> 8;
			int var20;
			int var21;
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var14 = field4035[var3][var13 + 1][var12] - field4035[var3][var13 - 1][var12];
					var15 = field4035[var3][var13][var12 + 1] - field4035[var3][var13][var12 - 1];
					var16 = (int) Math.sqrt((double) (var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
					var21 = (var48[var13][var12] >> 1) + (var48[var13][var12 + 1] >> 3) + (var48[var13 - 1][var12] >> 2) + (var48[var13 + 1][var12] >> 3) + (var48[var13][var12 - 1] >> 2);
					class236.field2029[var13][var12] = var20 - var21;
				}
			}
			for (var12 = 0; var12 < 104; ++var12) {
				class507.field4073[var12] = 0;
				class320.field2509[var12] = 0;
				field4029[var12] = 0;
				class339.field2592[var12] = 0;
				class221.field1978[var12] = 0;
			}
			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						long var54 = (long) Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int) var54;
						var18 = field4028[var3][var14][var13] & var17;
						if (var18 > 0) {
							var20 = var18 - 1;
							class122 var59 = (class122) class122.field1440.method648((long) var20);
							class122 var57;
							if (var59 != null) {
								var57 = var59;
							} else {
								byte[] var22 = class122.field1439.method1762(1, var20);
								var59 = new class122();
								if (null != var22) {
									var59.method841(new class187(var22), var20);
								}
								var59.method840();
								class122.field1440.method647(var59, (long) var20);
								var57 = var59;
							}
							var10000 = class507.field4073;
							var10000[var13] += var57.field1445;
							var10000 = class320.field2509;
							var10000[var13] += var57.field1443;
							var10000 = field4029;
							var10000[var13] += var57.field1442;
							var10000 = class339.field2592;
							var10000[var13] += var57.field1444;
							var10002 = class221.field1978[var13]++;
						}
					}
					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						long var55 = (long) Math.pow(2.0D, 15.0D) - 1L;
						var18 = (int) var55;
						var19 = field4028[var3][var15][var13] & var18;
						if (var19 > 0) {
							var21 = var19 - 1;
							class122 var60 = (class122) class122.field1440.method648((long) var21);
							class122 var58;
							if (null != var60) {
								var58 = var60;
							} else {
								byte[] var23 = class122.field1439.method1762(1, var21);
								var60 = new class122();
								if (null != var23) {
									var60.method841(new class187(var23), var21);
								}
								var60.method840();
								class122.field1440.method647(var60, (long) var21);
								var58 = var60;
							}
							var10000 = class507.field4073;
							var10000[var13] -= var58.field1445;
							var10000 = class320.field2509;
							var10000[var13] -= var58.field1443;
							var10000 = field4029;
							var10000[var13] -= var58.field1442;
							var10000 = class339.field2592;
							var10000[var13] -= var58.field1444;
							var10002 = class221.field1978[var13]--;
						}
					}
				}
				if (var12 >= 1 && var12 < 103) {
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;
					var17 = 0;
					for (var18 = -5; var18 < 109; ++var18) {
						var19 = var18 + 5;
						if (var19 >= 0 && var19 < 104) {
							var13 += class507.field4073[var19];
							var14 += class320.field2509[var19];
							var15 += field4029[var19];
							var16 += class339.field2592[var19];
							var17 += class221.field1978[var19];
						}
						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class507.field4073[var20];
							var14 -= class320.field2509[var20];
							var15 -= field4029[var20];
							var16 -= class339.field2592[var20];
							var17 -= class221.field1978[var20];
						}
						if (var18 >= 1 && var18 < 103 && (!Client.field902 || (field4037[0][var12][var18] & 2) != 0 || (field4037[var3][var12][var18] & 16) == 0)) {
							if (var3 < field4027) {
								field4027 = var3;
							}
							long var61 = (long) Math.pow(2.0D, 15.0D) - 1L;
							int var62 = (int) var61;
							int var24 = field4028[var3][var12][var18] & var62;
							int var25 = class357.field2836[var3][var12][var18] & var62;
							if (var24 > 0 || var25 > 0) {
								int var26 = field4035[var3][var12][var18];
								int var27 = field4035[var3][var12 + 1][var18];
								int var28 = field4035[var3][var12 + 1][var18 + 1];
								int var29 = field4035[var3][var12][var18 + 1];
								int var30 = class236.field2029[var12][var18];
								int var31 = class236.field2029[var12 + 1][var18];
								int var32 = class236.field2029[var12 + 1][var18 + 1];
								int var33 = class236.field2029[var12][var18 + 1];
								int var34 = -1;
								int var35 = -1;
								int var36;
								int var37;
								int var38;
								if (var24 > 0) {
									var36 = var13 * 256 / var16;
									var37 = var14 / var17;
									var38 = var15 / var17;
									var34 = method2426(var36, var37, var38);
									var36 = var36 + field4034 & 255;
									var38 += field4039;
									if (var38 < 0) {
										var38 = 0;
									} else if (var38 > 255) {
										var38 = 255;
									}
									var35 = method2426(var36, var37, var38);
								}
								class541 var39;
								if (var3 > 0) {
									boolean var63 = true;
									if (var24 == 0 && class132.field1475[var3][var12][var18] != 0) {
										var63 = false;
									}
									if (var25 > 0) {
										var38 = var25 - 1;
										var39 = (class541) class541.field4288.method648((long) var38);
										class541 var64;
										if (null != var39) {
											var64 = var39;
										} else {
											byte[] var40 = class541.field4293.method1762(4, var38);
											var39 = new class541();
											if (var40 != null) {
												var39.method2607(new class187(var40), var38);
											}
											var39.method2606();
											class541.field4288.method647(var39, (long) var38);
											var64 = var39;
										}
										if (!var64.field4284) {
											var63 = false;
										}
									}
									if (var63 && var27 == var26 && var28 == var26 && var26 == var29) {
										var10000 = class119.field1432[var3][var12];
										var10000[var18] |= 2340;
									}
								}
								var36 = 0;
								if (var35 != -1) {
									var36 = class238.field2034[method2424(var35, 96)];
								}
								if (var25 == 0) {
									var0.method1955(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, method2424(var34, var30), method2424(var34, var31), method2424(var34, var32), method2424(var34, var33), 0, 0, 0, 0, var36, 0);
								} else {
									var37 = 1 + class132.field1475[var3][var12][var18];
									byte var65 = class446.field3466[var3][var12][var18];
									int var66 = var25 - 1;
									class541 var41 = (class541) class541.field4288.method648((long) var66);
									if (null != var41) {
										var39 = var41;
									} else {
										byte[] var42 = class541.field4293.method1762(4, var66);
										var41 = new class541();
										if (var42 != null) {
											var41.method2607(new class187(var42), var66);
										}
										var41.method2606();
										class541.field4288.method647(var41, (long) var66);
										var39 = var41;
									}
									int var67 = var39.field4281;
									int var43;
									int var44;
									int var45;
									int var46;
									if (var67 >= 0) {
										var44 = class238.field2039.field2270.method172(var67);
										var43 = -1;
									} else if (var39.field4282 == 16711935) {
										var43 = -2;
										var67 = -1;
										var44 = -2;
									} else {
										var43 = method2426(var39.field4286, var39.field4287, var39.field4292);
										var45 = field4034 + var39.field4286 & 255;
										var46 = var39.field4292 + field4039;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}
										var44 = method2426(var45, var39.field4287, var46);
									}
									var45 = 0;
									if (var44 != -2) {
										var45 = class238.field2034[method2423(var44, 96)];
									}
									if (var39.field4285 != -1) {
										var46 = field4034 + var39.field4290 & 255;
										int var47 = field4039 + var39.field4291;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}
										var44 = method2426(var46, var39.field4289, var47);
										var45 = class238.field2034[method2423(var44, 96)];
									}
									var0.method1955(var3, var12, var18, var37, var65, var67, var26, var27, var28, var29, method2424(var34, var30), method2424(var34, var31), method2424(var34, var32), method2424(var34, var33), method2423(var43, var30), method2423(var43, var31), method2423(var43, var32), method2423(var43, var33), var36, var45);
								}
							}
						}
					}
				}
			}
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method1970(var3, var13, var12, method2429(var3, var13, var12));
				}
			}
			field4028[var3] = (short[][]) null;
			class357.field2836[var3] = (short[][]) null;
			class132.field1475[var3] = (byte[][]) null;
			class446.field3466[var3] = (byte[][]) null;
			class343.field2606[var3] = (byte[][]) null;
		}
		var0.method1935(-50, -10, -50);
		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if ((field4037[1][var3][var4] & 2) == 2) {
					var0.method1918(var3, var4);
				}
			}
		}
		var3 = 1;
		var4 = 2;
		var5 = 4;
		for (var6 = 0; var6 < 4; ++var6) {
			if (var6 > 0) {
				var3 <<= 3;
				var4 <<= 3;
				var5 <<= 3;
			}
			for (int var51 = 0; var51 <= var6; ++var51) {
				for (int var52 = 0; var52 <= 104; ++var52) {
					for (int var53 = 0; var53 <= 104; ++var53) {
						boolean var56;
						if ((class119.field1432[var51][var53][var52] & var3) != 0) {
							var10 = var52;
							var11 = var52;
							var12 = var51;
							for (var13 = var51; var10 > 0 && (class119.field1432[var51][var53][var10 - 1] & var3) != 0; --var10) {
							}
							while (var11 < 104 && (class119.field1432[var51][var53][var11 + 1] & var3) != 0) {
								++var11;
							}
							label367: while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class119.field1432[var12 - 1][var53][var14] & var3) == 0) {
										break label367;
									}
								}
								--var12;
							}
							label356: while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class119.field1432[var13 + 1][var53][var14] & var3) == 0) {
										break label356;
									}
								}
								++var13;
							}
							var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
							if (var14 >= 8) {
								var56 = true;
								var16 = field4035[var13][var53][var10] - 240;
								var17 = field4035[var12][var53][var10];
								class372.method1919(var6, 1, var53 * 128, var53 * 128, var10 * 128, var11 * 128 + 128, var16, var17);
								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class119.field1432[var18][var53];
										var10000[var19] &= ~var3;
									}
								}
							}
						}
						if ((class119.field1432[var51][var53][var52] & var4) != 0) {
							var10 = var53;
							var11 = var53;
							var12 = var51;
							for (var13 = var51; var10 > 0 && (class119.field1432[var51][var10 - 1][var52] & var4) != 0; --var10) {
							}
							while (var11 < 104 && (class119.field1432[var51][var11 + 1][var52] & var4) != 0) {
								++var11;
							}
							label420: while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class119.field1432[var12 - 1][var14][var52] & var4) == 0) {
										break label420;
									}
								}
								--var12;
							}
							label409: while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class119.field1432[var13 + 1][var14][var52] & var4) == 0) {
										break label409;
									}
								}
								++var13;
							}
							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var56 = true;
								var16 = field4035[var13][var10][var52] - 240;
								var17 = field4035[var12][var10][var52];
								class372.method1919(var6, 2, var10 * 128, 128 + var11 * 128, var52 * 128, var52 * 128, var16, var17);
								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class119.field1432[var18][var19];
										var10000[var52] &= ~var4;
									}
								}
							}
						}
						if ((class119.field1432[var51][var53][var52] & var5) != 0) {
							var10 = var53;
							var11 = var53;
							var12 = var52;
							for (var13 = var52; var12 > 0 && (class119.field1432[var51][var53][var12 - 1] & var5) != 0; --var12) {
							}
							while (var13 < 104 && (class119.field1432[var51][var53][var13 + 1] & var5) != 0) {
								++var13;
							}
							label473: while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class119.field1432[var51][var10 - 1][var14] & var5) == 0) {
										break label473;
									}
								}
								--var10;
							}
							label462: while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class119.field1432[var51][var11 + 1][var14] & var5) == 0) {
										break label462;
									}
								}
								++var11;
							}
							if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
								var14 = field4035[var51][var10][var12];
								class372.method1919(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);
								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class119.field1432[var51][var15];
										var10000[var16] &= ~var5;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static int method2429(int var0, int var1, int var2) {
		if ((field4037[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (field4037[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	static final int method2428(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = method2431(var4, var6);
		int var9 = method2431(var4 + 1, var6);
		int var10 = method2431(var4, var6 + 1);
		int var11 = method2431(var4 + 1, var6 + 1);
		int var12 = method2419(var8, var9, var5, var2);
		int var13 = method2419(var10, var11, var5, var2);
		return method2419(var12, var13, var7, var2);
	}

	static final int method2419(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - class238.field2035[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
	}

	static final int method2431(int var0, int var1) {
		int var3 = method2432(var0 - 1, var1 - 1) + method2432(var0 + 1, var1 - 1) + method2432(var0 - 1, var1 + 1) + method2432(var0 + 1, var1 + 1);
		int var4 = method2432(var0 - 1, var1) + method2432(var0 + 1, var1) + method2432(var0, var1 - 1) + method2432(var0, var1 + 1);
		int var5 = method2432(var0, var1);
		return var3 / 16 + var4 / 8 + var5 / 4;
	}

	static final int method2432(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	static final int method2424(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 65408) + var1;
		}
	}

	static final int method2423(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 65408) + var1;
		}
	}

	static final int method2426(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}
		if (var2 > 192) {
			var1 /= 2;
		}
		if (var2 > 217) {
			var1 /= 2;
		}
		if (var2 > 243) {
			var1 /= 2;
		}
		int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var4;
	}
}
