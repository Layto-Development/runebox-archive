import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "du")
public final class class411 {
	@ObfInfo(name = "ae", desc = "[[[B")
	static byte[][][] field3174;
	@ObfInfo(name = "fi", desc = "Lnk;")
	static class505 field3163;
	@ObfInfo(name = "jc", desc = "I", intMultiplier = 683914525)
	static int field3162;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -224206529)
	static int field3164;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -1918244679)
	static int field3171;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1547931623)
	static int field3176;
	@ObfInfo(name = "aq", desc = "[I")
	static int[] field3166;
	@ObfInfo(name = "au", desc = "[[[I")
	static int[][][] field3172;
	@ObfInfo(name = "at", desc = "[[[S")
	static short[][][] field3165;
	@ObfInfo(name = "ax", desc = "[I")
	static final int[] field3167;
	@ObfInfo(name = "ah", desc = "[I")
	static final int[] field3168;
	@ObfInfo(name = "as", desc = "[I")
	static final int[] field3169;
	@ObfInfo(name = "ay", desc = "[I")
	static final int[] field3170;
	@ObfInfo(name = "av", desc = "[I")
	static final int[] field3173;
	@ObfInfo(name = "aj", desc = "[I")
	static final int[] field3175;

	static {
		field3172 = new int[4][105][105];
		field3174 = new byte[4][104][104];
		field3164 = 99;
		field3167 = new int[]{1, 2, 4, 8};
		field3168 = new int[]{16, 32, 64, 128};
		field3169 = new int[]{1, 0, -1, 0};
		field3170 = new int[]{0, -1, 0, 1};
		field3175 = new int[]{1, -1, -1, 1};
		field3173 = new int[]{-1, -1, 1, 1};
		field3171 = (int)(Math.random() * 17.0D) - 8;
		field3176 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class411() throws Throwable {
	}

	@ObfInfo(name = "ao", desc = "(Lnu;III)Lui;")
	public static class150 method2150(class437 var0, int var1, int var2) {
		return !class273.method1429(var0, var1, var2) ? null : class273.method1431();
	}

	@ObfInfo(name = "au", desc = "(I)V")
	static void method2166() {
		field3164 = 99;
		field3165 = new short[4][104][104];
		class38.field505 = new short[4][104][104];
		class190.field1716 = new byte[4][104][104];
		class178.field1628 = new byte[4][104][104];
		class177.field1627 = new int[4][105][105];
		class386.field3028 = new byte[4][105][105];
		class164.field1557 = new int[105][105];
		class389.field3039 = new int[104];
		class285.field2276 = new int[104];
		field3166 = new int[104];
		class532.field4245 = new int[104];
		class175.field1617 = new int[104];
	}

	@ObfInfo(name = "ae", desc = "(B)V")
	static void method2153() {
		field3165 = (short[][][])null;
		class38.field505 = (short[][][])null;
		class190.field1716 = (byte[][][])null;
		class178.field1628 = (byte[][][])null;
		class177.field1627 = (int[][][])null;
		class386.field3028 = (byte[][][])null;
		class164.field1557 = (int[][])null;
		class389.field3039 = null;
		class285.field2276 = null;
		field3166 = null;
		class532.field4245 = null;
		class175.field1617 = null;
	}

	@ObfInfo(name = "ao", desc = "(IIIII)V")
	static final void method2152(int var0, int var1, int var2, int var3) {
		for (int var5 = var1; var5 <= var1 + var3; ++var5) {
			for (int var6 = var0; var6 <= var0 + var2; ++var6) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					class386.field3028[0][var6][var5] = 127;
					if (var6 == var0 && var6 > 0) {
						field3172[0][var6][var5] = field3172[0][var6 - 1][var5];
					}

					if (var6 == var2 + var0 && var6 < 103) {
						field3172[0][var6][var5] = field3172[0][var6 + 1][var5];
					}

					if (var5 == var1 && var5 > 0) {
						field3172[0][var6][var5] = field3172[0][var6][var5 - 1];
					}

					if (var5 == var3 + var1 && var5 < 103) {
						field3172[0][var6][var5] = field3172[0][var6][var5 + 1];
					}
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "([BIIII[Lis;I)V")
	static final void method2162(byte[] var0, int var1, int var2, int var3, int var4, class77[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var8 + var1 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
						int[] var10000 = var5[var7].field830[var8 + var1];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}

		class280 var13 = new class280(var0);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var2 + var10;
					method2154(var13, var8, var11, var12, var3 + var11, var12 + var4, 0);
				}
			}
		}

	}

	@ObfInfo(name = "ai", desc = "(IIII)V")
	static final void method2165(int var0, int var1, int var2) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				field3172[var0][var4 + var1][var5 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				field3172[var0][var1][var2 + var4] = field3172[var0][var1 - 1][var4 + var2];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				field3172[var0][var1 + var4][var2] = field3172[var0][var4 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && field3172[var0][var1 - 1][var2] != 0) {
			field3172[var0][var1][var2] = field3172[var0][var1 - 1][var2];
		} else if (var2 > 0 && field3172[var0][var1][var2 - 1] != 0) {
			field3172[var0][var1][var2] = field3172[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && field3172[var0][var1 - 1][var2 - 1] != 0) {
			field3172[var0][var1][var2] = field3172[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfInfo(name = "az", desc = "(Ltm;IIIIIII)V")
	static final void method2154(class280 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (class499.method2494(var1, var2, var3)) {
			field3174[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.method1541();
				if (var8 == 0) {
					if (var1 == 0) {
						int[] var15 = field3172[0][var2];
						int var12 = var4 + 932731;
						int var13 = var5 + 556238;
						int var14 = method2160(var12 + 45365, var13 + 91923, 4) - 128 + (method2160(var12 + 10294, var13 + 37821, 2) - 128 >> 1) + (method2160(var12, var13, 1) - 128 >> 2);
						var14 = (int)((double)var14 * 0.3D) + 35;
						if (var14 < 10) {
							var14 = 10;
						} else if (var14 > 60) {
							var14 = 60;
						}

						var15[var3] = -var14 * 8;
					} else {
						field3172[var1][var2][var3] = field3172[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.method1492();
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						field3172[0][var2][var3] = -var9 * 8;
					} else {
						field3172[var1][var2][var3] = field3172[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					class38.field505[var1][var2][var3] = (short)var0.method1494();
					class190.field1716[var1][var2][var3] = (byte)((var8 - 2) / 4);
					class178.field1628[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					field3174[var1][var2][var3] = (byte)(var8 - 49);
				} else {
					field3165[var1][var2][var3] = (short)(var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.method1541();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.method1492();
					break;
				}

				if (var8 <= 49) {
					var0.method1494();
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "([BIII)Z")
	static final boolean method2159(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		class280 var5 = new class280(var0);
		int var6 = -1;

		label57:
		while (true) {
			int var7 = var5.method1505();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method1539();
					if (var10 == 0) {
						continue label57;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method1492() >> 2;
					int var14 = var12 + var1;
					int var15 = var11 + var2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class292 var16 = class185.method1043(var6, (byte)-45);
						if (var13 != 22 || !Client.field31 || var16.field2348 != 0 || var16.field2341 == 1 || var16.field2328) {
							if (!var16.method1610()) {
								++Client.field99;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method1539();
				if (var10 == 0) {
					break;
				}

				var5.method1492();
			}
		}
	}

	@ObfInfo(name = "aa", desc = "([BIILiv;[Lis;I)V")
	static final void method2167(byte[] var0, int var1, int var2, class194 var3, class77[] var4) {
		class280 var6 = new class280(var0);
		int var7 = -1;

		while (true) {
			int var8 = var6.method1505();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;

			while (true) {
				int var10 = var6.method1539();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 63;
				int var12 = var9 >> 6 & 63;
				int var13 = var9 >> 12;
				int var14 = var6.method1492();
				int var15 = var14 >> 2;
				int var16 = var14 & 3;
				int var17 = var1 + var12;
				int var18 = var11 + var2;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field3174[1][var17][var18] & 2) == 2) {
						var19 = var13 - 1;
					}

					class77 var20 = null;
					if (var19 >= 0) {
						var20 = var4[var19];
					}

					class532.method2580(var13, var17, var18, var7, var16, var15, var3, var20);
				}
			}
		}
	}

	@ObfInfo(name = "af", desc = "([BIIIIIIILiv;[Lis;)V")
	static final void method2149(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class194 var8, class77[] var9) {
		class280 var10 = new class280(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method1505();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.method1539();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.method1492();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					class292 var21 = class185.method1043(var11, (byte)-48);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.field2339;
					int var28 = var21.field2324;
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
					int var30 = var3 + class93.method585(var16 & 7, var15 & 7, var7, var21.field2339, var21.field2324, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((field3174[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						class77 var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						class532.method2580(var1, var29, var30, var11, var7 + var20 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	@ObfInfo(name = "aq", desc = "(Liv;[Lis;I)V")
	static final void method2157(class194 var0, class77[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((field3174[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if ((field3174[1][var4][var5] & 2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							var1[var6].method521(var4, var5);
						}
					}
				}
			}
		}

		field3171 += (int)(Math.random() * 5.0D) - 2;
		if (field3171 < -8) {
			field3171 = -8;
		}

		if (field3171 > 8) {
			field3171 = 8;
		}

		field3176 += (int)(Math.random() * 5.0D) - 2;
		if (field3176 < -16) {
			field3176 = -16;
		}

		if (field3176 > 16) {
			field3176 = 16;
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
			byte[][] var48 = class386.field3028[var3];
			boolean var49 = true;
			boolean var50 = true;
			boolean var7 = true;
			boolean var8 = true;
			boolean var9 = true;
			var10 = (int)Math.sqrt(5100.0D);
			var11 = var10 * 768 >> 8;

			int var20;
			int var21;
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var14 = field3172[var3][var13 + 1][var12] - field3172[var3][var13 - 1][var12];
					var15 = field3172[var3][var13][var12 + 1] - field3172[var3][var13][var12 - 1];
					var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
					var21 = (var48[var13][var12] >> 1) + (var48[var13][var12 + 1] >> 3) + (var48[var13 - 1][var12] >> 2) + (var48[var13 + 1][var12] >> 3) + (var48[var13][var12 - 1] >> 2);
					class164.field1557[var13][var12] = var20 - var21;
				}
			}

			for (var12 = 0; var12 < 104; ++var12) {
				class389.field3039[var12] = 0;
				class285.field2276[var12] = 0;
				field3166[var12] = 0;
				class532.field4245[var12] = 0;
				class175.field1617[var12] = 0;
			}

			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						long var54 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var54;
						var18 = field3165[var3][var14][var13] & var17;
						if (var18 > 0) {
							var20 = var18 - 1;
							class541 var59 = (class541)class541.field4288.method294((long)var20);
							class541 var57;
							if (var59 != null) {
								var57 = var59;
							} else {
								byte[] var22 = class541.field4287.method2267(1, var20);
								var59 = new class541();
								if (null != var22) {
									var59.method2598(new class280(var22), var20);
								}

								var59.method2597();
								class541.field4288.method293(var59, (long)var20);
								var57 = var59;
							}

							var10000 = class389.field3039;
							var10000[var13] += var57.field4293;
							var10000 = class285.field2276;
							var10000[var13] += var57.field4291;
							var10000 = field3166;
							var10000[var13] += var57.field4290;
							var10000 = class532.field4245;
							var10000[var13] += var57.field4292;
							var10002 = class175.field1617[var13]++;
						}
					}

					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						long var55 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var18 = (int)var55;
						var19 = field3165[var3][var15][var13] & var18;
						if (var19 > 0) {
							var21 = var19 - 1;
							class541 var60 = (class541)class541.field4288.method294((long)var21);
							class541 var58;
							if (null != var60) {
								var58 = var60;
							} else {
								byte[] var23 = class541.field4287.method2267(1, var21);
								var60 = new class541();
								if (null != var23) {
									var60.method2598(new class280(var23), var21);
								}

								var60.method2597();
								class541.field4288.method293(var60, (long)var21);
								var58 = var60;
							}

							var10000 = class389.field3039;
							var10000[var13] -= var58.field4293;
							var10000 = class285.field2276;
							var10000[var13] -= var58.field4291;
							var10000 = field3166;
							var10000[var13] -= var58.field4290;
							var10000 = class532.field4245;
							var10000[var13] -= var58.field4292;
							var10002 = class175.field1617[var13]--;
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
							var13 += class389.field3039[var19];
							var14 += class285.field2276[var19];
							var15 += field3166[var19];
							var16 += class532.field4245[var19];
							var17 += class175.field1617[var19];
						}

						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class389.field3039[var20];
							var14 -= class285.field2276[var20];
							var15 -= field3166[var20];
							var16 -= class532.field4245[var20];
							var17 -= class175.field1617[var20];
						}

						if (var18 >= 1 && var18 < 103 && (!Client.field31 || (field3174[0][var12][var18] & 2) != 0 || (field3174[var3][var12][var18] & 16) == 0)) {
							if (var3 < field3164) {
								field3164 = var3;
							}

							long var61 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var62 = (int)var61;
							int var24 = field3165[var3][var12][var18] & var62;
							int var25 = class38.field505[var3][var12][var18] & var62;
							if (var24 > 0 || var25 > 0) {
								int var26 = field3172[var3][var12][var18];
								int var27 = field3172[var3][var12 + 1][var18];
								int var28 = field3172[var3][var12 + 1][var18 + 1];
								int var29 = field3172[var3][var12][var18 + 1];
								int var30 = class164.field1557[var12][var18];
								int var31 = class164.field1557[var12 + 1][var18];
								int var32 = class164.field1557[var12 + 1][var18 + 1];
								int var33 = class164.field1557[var12][var18 + 1];
								int var34 = -1;
								int var35 = -1;
								int var36;
								int var37;
								int var38;
								if (var24 > 0) {
									var36 = var13 * 256 / var16;
									var37 = var14 / var17;
									var38 = var15 / var17;
									var34 = method2158(var36, var37, var38);
									var36 = var36 + field3171 & 255;
									var38 += field3176;
									if (var38 < 0) {
										var38 = 0;
									} else if (var38 > 255) {
										var38 = 255;
									}

									var35 = method2158(var36, var37, var38);
								}

								class102 var39;
								if (var3 > 0) {
									boolean var63 = true;
									if (var24 == 0 && class190.field1716[var3][var12][var18] != 0) {
										var63 = false;
									}

									if (var25 > 0) {
										var38 = var25 - 1;
										var39 = (class102)class102.field994.method294((long)var38);
										class102 var64;
										if (null != var39) {
											var64 = var39;
										} else {
											byte[] var40 = class102.field999.method2267(4, var38);
											var39 = new class102();
											if (var40 != null) {
												var39.method604(new class280(var40), var38);
											}

											var39.method603();
											class102.field994.method293(var39, (long)var38);
											var64 = var39;
										}

										if (!var64.field990) {
											var63 = false;
										}
									}

									if (var63 && var27 == var26 && var28 == var26 && var26 == var29) {
										var10000 = class177.field1627[var3][var12];
										var10000[var18] |= 2340;
									}
								}

								var36 = 0;
								if (var35 != -1) {
									var36 = class276.field2233[method2156(var35, 96)];
								}

								if (var25 == 0) {
									var0.method1095(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, method2156(var34, var30), method2156(var34, var31), method2156(var34, var32), method2156(var34, var33), 0, 0, 0, 0, var36, 0);
								} else {
									var37 = 1 + class190.field1716[var3][var12][var18];
									byte var65 = class178.field1628[var3][var12][var18];
									int var66 = var25 - 1;
									class102 var41 = (class102)class102.field994.method294((long)var66);
									if (null != var41) {
										var39 = var41;
									} else {
										byte[] var42 = class102.field999.method2267(4, var66);
										var41 = new class102();
										if (var42 != null) {
											var41.method604(new class280(var42), var66);
										}

										var41.method603();
										class102.field994.method293(var41, (long)var66);
										var39 = var41;
									}

									int var67 = var39.field987;
									int var43;
									int var44;
									int var45;
									int var46;
									if (var67 >= 0) {
										var44 = class276.field2238.field4225.method492(var67);
										var43 = -1;
									} else if (var39.field988 == 16711935) {
										var43 = -2;
										var67 = -1;
										var44 = -2;
									} else {
										var43 = method2158(var39.field992, var39.field993, var39.field998);
										var45 = field3171 + var39.field992 & 255;
										var46 = var39.field998 + field3176;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = method2158(var45, var39.field993, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = class276.field2233[method2155(var44, 96)];
									}

									if (var39.field991 != -1) {
										var46 = field3171 + var39.field996 & 255;
										int var47 = field3176 + var39.field997;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = method2158(var46, var39.field995, var47);
										var45 = class276.field2233[method2155(var44, 96)];
									}

									var0.method1095(var3, var12, var18, var37, var65, var67, var26, var27, var28, var29, method2156(var34, var30), method2156(var34, var31), method2156(var34, var32), method2156(var34, var33), method2155(var43, var30), method2155(var43, var31), method2155(var43, var32), method2155(var43, var33), var36, var45);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method1110(var3, var13, var12, method2161(var3, var13, var12));
				}
			}

			field3165[var3] = (short[][])null;
			class38.field505[var3] = (short[][])null;
			class190.field1716[var3] = (byte[][])null;
			class178.field1628[var3] = (byte[][])null;
			class386.field3028[var3] = (byte[][])null;
		}

		var0.method1075(-50, -10, -50);

		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if ((field3174[1][var3][var4] & 2) == 2) {
					var0.method1058(var3, var4);
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
						short var56;
						if ((class177.field1627[var51][var53][var52] & var3) != 0) {
							var10 = var52;
							var11 = var52;
							var12 = var51;

							for (var13 = var51; var10 > 0 && (class177.field1627[var51][var53][var10 - 1] & var3) != 0; --var10) {
							}

							while (var11 < 104 && (class177.field1627[var51][var53][var11 + 1] & var3) != 0) {
								++var11;
							}

							label367:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class177.field1627[var12 - 1][var53][var14] & var3) == 0) {
										break label367;
									}
								}

								--var12;
							}

							label356:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class177.field1627[var13 + 1][var53][var14] & var3) == 0) {
										break label356;
									}
								}

								++var13;
							}

							var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
							if (var14 >= 8) {
								var56 = 240;
								var16 = field3172[var13][var53][var10] - var56;
								var17 = field3172[var12][var53][var10];
								class194.method1059(var6, 1, var53 * 128, var53 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class177.field1627[var18][var53];
										var10000[var19] &= ~var3;
									}
								}
							}
						}

						if ((class177.field1627[var51][var53][var52] & var4) != 0) {
							var10 = var53;
							var11 = var53;
							var12 = var51;

							for (var13 = var51; var10 > 0 && (class177.field1627[var51][var10 - 1][var52] & var4) != 0; --var10) {
							}

							while (var11 < 104 && (class177.field1627[var51][var11 + 1][var52] & var4) != 0) {
								++var11;
							}

							label420:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class177.field1627[var12 - 1][var14][var52] & var4) == 0) {
										break label420;
									}
								}

								--var12;
							}

							label409:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class177.field1627[var13 + 1][var14][var52] & var4) == 0) {
										break label409;
									}
								}

								++var13;
							}

							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var56 = 240;
								var16 = field3172[var13][var10][var52] - var56;
								var17 = field3172[var12][var10][var52];
								class194.method1059(var6, 2, var10 * 128, 128 + var11 * 128, var52 * 128, var52 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class177.field1627[var18][var19];
										var10000[var52] &= ~var4;
									}
								}
							}
						}

						if ((class177.field1627[var51][var53][var52] & var5) != 0) {
							var10 = var53;
							var11 = var53;
							var12 = var52;

							for (var13 = var52; var12 > 0 && (class177.field1627[var51][var53][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < 104 && (class177.field1627[var51][var53][var13 + 1] & var5) != 0) {
								++var13;
							}

							label473:
							while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class177.field1627[var51][var10 - 1][var14] & var5) == 0) {
										break label473;
									}
								}

								--var10;
							}

							label462:
							while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class177.field1627[var51][var11 + 1][var14] & var5) == 0) {
										break label462;
									}
								}

								++var11;
							}

							if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
								var14 = field3172[var51][var10][var12];
								class194.method1059(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class177.field1627[var51][var15];
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

	@ObfInfo(name = "al", desc = "(IIII)I")
	static int method2161(int var0, int var1, int var2) {
		if ((field3174[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (field3174[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	@ObfInfo(name = "an", desc = "(IIIB)I")
	static final int method2160(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = method2163(var4, var6);
		int var9 = method2163(var4 + 1, var6);
		int var10 = method2163(var4, var6 + 1);
		int var11 = method2163(var4 + 1, var6 + 1);
		int var12 = method2151(var8, var9, var5, var2);
		int var13 = method2151(var10, var11, var5, var2);
		return method2151(var12, var13, var7, var2);
	}

	@ObfInfo(name = "ar", desc = "(IIIII)I")
	static final int method2151(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - class276.field2234[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
	}

	@ObfInfo(name = "ab", desc = "(III)I")
	static final int method2163(int var0, int var1) {
		int var3 = method2164(var0 - 1, var1 - 1) + method2164(var0 + 1, var1 - 1) + method2164(var0 - 1, var1 + 1) + method2164(var0 + 1, var1 + 1);
		int var4 = method2164(var0 - 1, var1) + method2164(var0 + 1, var1) + method2164(var0, var1 - 1) + method2164(var0, var1 + 1);
		int var5 = method2164(var0, var1);
		return var3 / 16 + var4 / 8 + var5 / 4;
	}

	@ObfInfo(name = "ag", desc = "(IIB)I")
	static final int method2164(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	@ObfInfo(name = "am", desc = "(III)I")
	static final int method2156(int var0, int var1) {
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

	@ObfInfo(name = "ax", desc = "(IIB)I")
	static final int method2155(int var0, int var1) {
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

	@ObfInfo(name = "ah", desc = "(IIIB)I")
	static final int method2158(int var0, int var1, int var2) {
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
