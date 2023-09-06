public class class43 extends class462 {
	static class25 field534;
	class54 field533;
	int field529;
	int field530;
	int[] field531;
	int[][] field532;

	public class43(int var1, byte[] var2) {
		this.field529 = var1;
		class42 var3 = new class42(var2);
		this.field530 = var3.method278();
		this.field531 = new int[this.field530];
		this.field532 = new int[this.field530][];

		int var4;
		for (var4 = 0; var4 < this.field530; ++var4) {
			this.field531[var4] = var3.method278();
		}

		for (var4 = 0; var4 < this.field530; ++var4) {
			this.field532[var4] = new int[var3.method278()];
		}

		for (var4 = 0; var4 < this.field530; ++var4) {
			for (int var5 = 0; var5 < this.field532[var4].length; ++var5) {
				this.field532[var4][var5] = var3.method278();
			}
		}

		if (var3.field527 < var3.field525.length) {
			var4 = var3.method327();
			if (var4 > 0) {
				this.field533 = new class54(var3, var4);
			}
		}

	}

	public int method343() {
		return this.field530;
	}

	public class54 method342() {
		return this.field533;
	}

	static float method341(class415 var0, float var1) {
		if (var0 != null && var0.method2141() != 0) {
			if (var1 < (float)var0.field3470[0].field986) {
				return class224.field2036 == var0.field3468 ? var0.field3470[0].field989 : class293.method1675(var0, var1, true);
			} else if (var1 > (float)var0.field3470[var0.method2141() - 1].field986) {
				return class224.field2036 == var0.field3488 ? var0.field3470[var0.method2141() - 1].field989 : class293.method1675(var0, var1, false);
			} else if (var0.field3467) {
				return var0.field3470[0].field989;
			} else {
				class98 var3 = var0.method2140(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (null == var3) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					if (0.0D == (double)var3.field990 && (double)var3.field991 == 0.0D) {
						var4 = true;
					} else if (Float.MAX_VALUE == var3.field990 && Float.MAX_VALUE == var3.field991) {
						var5 = true;
					} else if (null != var3.field992) {
						if (var0.field3482) {
							var6 = (float)var3.field986;
							float var10 = var3.field989;
							var7 = var3.field990 * 0.33333334F + var6;
							float var11 = var3.field991 * 0.33333334F + var10;
							float var9 = (float)var3.field992.field986;
							float var13 = var3.field992.field989;
							float var8 = var9 - var3.field992.field995 * 0.33333334F;
							float var12 = var13 - var3.field992.field987 * 0.33333334F;
							float var16;
							float var17;
							float var18;
							float var19;
							float var20;
							if (var0.field3481) {
								var16 = var11;
								var17 = var12;
								if (null != var0) {
									var18 = var9 - var6;
									if ((double)var18 != 0.0D) {
										var19 = var7 - var6;
										var20 = var8 - var6;
										float[] var30 = new float[]{var19 / var18, var20 / var18};
										var0.field3469 = 0.33333334F == var30[0] && var30[1] == 0.6666667F;
										float var22 = var30[0];
										float var23 = var30[1];
										if ((double)var30[0] < 0.0D) {
											var30[0] = 0.0F;
										}

										if ((double)var30[1] > 1.0D) {
											var30[1] = 1.0F;
										}

										if ((double)var30[0] > 1.0D || var30[1] < -1.0F) {
											class90.method611(var30);
										}

										float var10000;
										if (var30[0] != var22) {
											var10000 = var6 + var18 * var30[0];
											if (0.0D != (double)var22) {
												var16 = (var11 - var10) * var30[0] / var22 + var10;
											}
										}

										if (var23 != var30[1]) {
											var10000 = var6 + var18 * var30[1];
											if (1.0D != (double)var23) {
												var17 = (float)((double)var13 - (1.0D - (double)var30[1]) * (double)(var13 - var12) / (1.0D - (double)var23));
											}
										}

										var0.field3472 = var6;
										var0.field3473 = var9;
										float var24 = var30[0];
										float var25 = var30[1];
										float var26 = var24 - 0.0F;
										float var27 = var25 - var24;
										float var28 = 1.0F - var25;
										float var29 = var27 - var26;
										var0.field3471 = var28 - var27 - var29;
										var0.field3476 = var29 + var29 + var29;
										var0.field3475 = var26 + var26 + var26;
										var0.field3474 = 0.0F;
										var26 = var16 - var10;
										var27 = var17 - var16;
										var28 = var13 - var17;
										var29 = var27 - var26;
										var0.field3466 = var28 - var27 - var29;
										var0.field3479 = var29 + var29 + var29;
										var0.field3478 = var26 + var26 + var26;
										var0.field3489 = var10;
									}
								}
							} else if (var0 != null) {
								var0.field3472 = var6;
								float var14 = var9 - var6;
								float var15 = var13 - var10;
								var16 = var7 - var6;
								var17 = 0.0F;
								var18 = 0.0F;
								if ((double)var16 != 0.0D) {
									var17 = (var11 - var10) / var16;
								}

								var16 = var9 - var8;
								if ((double)var16 != 0.0D) {
									var18 = (var13 - var12) / var16;
								}

								var19 = 1.0F / (var14 * var14);
								var20 = var17 * var14;
								float var21 = var18 * var14;
								var0.field3474 = var19 * (var20 + var21 - var15 - var15) / var14;
								var0.field3475 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
								var0.field3476 = var17;
								var0.field3471 = var10;
							}

							var0.field3482 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field989;
					} else if (var5) {
						return (float)var3.field986 != var1 && null != var3.field992 ? var3.field992.field989 : var3.field989;
					} else if (var0.field3481) {
						return class403.method2085(var0, var1);
					} else {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							var7 = var1 - var0.field3472;
							var6 = var0.field3471 + var7 * ((var7 * var0.field3474 + var0.field3475) * var7 + var0.field3476);
						}

						return var6;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	public static void method344(int var0) {
		if (var0 != -1) {
			if (class105.field1038[var0]) {
				class475.field4032.method1226(var0);
				if (null != class160.field1484[var0]) {
					for (int var2 = 0; var2 < class160.field1484[var0].length; ++var2) {
						if (null != class160.field1484[var0][var2]) {
							class160.field1484[var0][var2] = null;
						}
					}

					class160.field1484[var0] = null;
					class105.field1038[var0] = false;
				}
			}
		}
	}
}
