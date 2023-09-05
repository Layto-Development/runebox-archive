import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ex")
public class class306 {
	@ObfInfo(name = "at", desc = "F")
	public static final float field2473;
	@ObfInfo(name = "ac", desc = "F")
	public static final float field2474;
	@ObfInfo(name = "ee", desc = "Ldt;")
	static class334 field2472;
	@ObfInfo(name = "fe", desc = "Lgz;")
	static class407 field2477;
	@ObfInfo(name = "ai", desc = "[F")
	static float[] field2475;
	@ObfInfo(name = "az", desc = "[F")
	static float[] field2476;

	static {
		field2473 = Math.ulp(1.0F);
		field2474 = field2473 * 2.0F;
		field2475 = new float[4];
		field2476 = new float[5];
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class306() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Lfh;FB)F")
	static float method1707(class27 var0, float var1) {
		if (var0 != null && var0.method362() != 0) {
			if (var1 < (float)var0.field431[0].field1488) {
				return class532.field4240 == var0.field429 ? var0.field431[0].field1491 : method1706(var0, var1, true);
			} else if (var1 > (float)var0.field431[var0.method362() - 1].field1488) {
				return class532.field4240 == var0.field449 ? var0.field431[var0.method362() - 1].field1491 : method1706(var0, var1, false);
			} else if (var0.field428) {
				return var0.field431[0].field1491;
			} else {
				class157 var3 = var0.method361(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (null == var3) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					if (0.0D == (double)var3.field1492 && (double)var3.field1493 == 0.0D) {
						var4 = true;
					} else if (Float.MAX_VALUE == var3.field1492 && Float.MAX_VALUE == var3.field1493) {
						var5 = true;
					} else if (null != var3.field1494) {
						if (var0.field443) {
							var6 = (float)var3.field1488;
							float var10 = var3.field1491;
							var7 = var3.field1492 * 0.33333334F + var6;
							float var11 = var3.field1493 * 0.33333334F + var10;
							float var9 = (float)var3.field1494.field1488;
							float var13 = var3.field1494.field1491;
							float var8 = var9 - var3.field1494.field1497 * 0.33333334F;
							float var12 = var13 - var3.field1494.field1489 * 0.33333334F;
							float var16;
							float var17;
							float var18;
							float var19;
							float var20;
							if (var0.field442) {
								var16 = var11;
								var17 = var12;
								if (null != var0) {
									var18 = var9 - var6;
									if ((double)var18 != 0.0D) {
										var19 = var7 - var6;
										var20 = var8 - var6;
										float[] var30 = new float[]{var19 / var18, var20 / var18};
										var0.field430 = 0.33333334F == var30[0] && var30[1] == 0.6666667F;
										float var22 = var30[0];
										float var23 = var30[1];
										if ((double)var30[0] < 0.0D) {
											var30[0] = 0.0F;
										}

										if ((double)var30[1] > 1.0D) {
											var30[1] = 1.0F;
										}

										if ((double)var30[0] > 1.0D || var30[1] < -1.0F) {
											class141.method829(var30);
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

										var0.field433 = var6;
										var0.field434 = var9;
										float var24 = var30[0];
										float var25 = var30[1];
										float var26 = var24 - 0.0F;
										float var27 = var25 - var24;
										float var28 = 1.0F - var25;
										float var29 = var27 - var26;
										var0.field432 = var28 - var27 - var29;
										var0.field437 = var29 + var29 + var29;
										var0.field436 = var26 + var26 + var26;
										var0.field435 = 0.0F;
										var26 = var16 - var10;
										var27 = var17 - var16;
										var28 = var13 - var17;
										var29 = var27 - var26;
										var0.field427 = var28 - var27 - var29;
										var0.field440 = var29 + var29 + var29;
										var0.field439 = var26 + var26 + var26;
										var0.field450 = var10;
									}
								}
							} else if (var0 != null) {
								var0.field433 = var6;
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
								var0.field435 = var19 * (var20 + var21 - var15 - var15) / var14;
								var0.field436 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
								var0.field437 = var17;
								var0.field432 = var10;
							}

							var0.field443 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field1491;
					} else if (var5) {
						return (float)var3.field1488 != var1 && null != var3.field1494 ? var3.field1494.field1491 : var3.field1491;
					} else if (var0.field442) {
						return method1708(var0, var1);
					} else {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							var7 = var1 - var0.field433;
							var6 = var0.field432 + var7 * ((var7 * var0.field435 + var0.field436) * var7 + var0.field437);
						}

						return var6;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfInfo(name = "ae", desc = "(Lfh;FS)F")
	static float method1708(class27 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3;
			if (var0.field433 == var1) {
				var3 = 0.0F;
			} else if (var1 == var0.field434) {
				var3 = 1.0F;
			} else {
				var3 = (var1 - var0.field433) / (var0.field434 - var0.field433);
			}

			float var4;
			if (var0.field430) {
				var4 = var3;
			} else {
				field2475[3] = var0.field432;
				field2475[2] = var0.field437;
				field2475[1] = var0.field436;
				field2475[0] = var0.field435 - var3;
				field2476[0] = 0.0F;
				field2476[1] = 0.0F;
				field2476[2] = 0.0F;
				field2476[3] = 0.0F;
				field2476[4] = 0.0F;
				int var5 = class254.method1346(field2475, 3, 0.0F, true, 1.0F, true, field2476);
				if (var5 == 1) {
					var4 = field2476[0];
				} else {
					var4 = 0.0F;
				}
			}

			return var4 * (var0.field439 + var4 * (var4 * var0.field427 + var0.field440)) + var0.field450;
		}
	}

	@ObfInfo(name = "ao", desc = "(Lfh;FZI)F")
	static float method1706(class27 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (null != var0 && var0.method362() != 0) {
			float var5 = (float)var0.field431[0].field1488;
			float var6 = (float)var0.field431[var0.method362() - 1].field1488;
			float var7 = var6 - var5;
			if ((double)var7 == 0.0D) {
				return var0.field431[0].field1491;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				double var9 = (double)((int)var8);
				float var11 = Math.abs((float)((double)var8 - var9));
				float var12 = var11 * var7;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (class532.field4246 == var0.field429) {
						if ((double)var11 != 0.0D) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (var0.field429 != class532.field4241 && var0.field429 != class532.field4242) {
						if (class532.field4243 == var0.field429) {
							var12 = var5 - var1;
							var17 = var0.field431[0].field1497;
							var18 = var0.field431[0].field1489;
							var4 = var0.field431[0].field1491;
							if (0.0D != (double)var17) {
								var4 -= var12 * var18 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (class532.field4246 == var0.field449) {
					if ((double)var11 != 0.0D) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (class532.field4241 != var0.field449 && var0.field449 != class532.field4242) {
					if (var0.field449 == class532.field4243) {
						var12 = var1 - var6;
						var17 = var0.field431[var0.method362() - 1].field1492;
						var18 = var0.field431[var0.method362() - 1].field1493;
						var4 = var0.field431[var0.method362() - 1].field1491;
						if (0.0D != (double)var17) {
							var4 += var18 * var12 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = method1707(var0, var12);
				float var19;
				if (var2 && class532.field4242 == var0.field429) {
					var19 = var0.field431[var0.method362() - 1].field1491 - var0.field431[0].field1491;
					var4 = (float)((double)var4 - (double)var19 * var9);
				} else if (!var2 && var0.field449 == class532.field4242) {
					var19 = var0.field431[var0.method362() - 1].field1491 - var0.field431[0].field1491;
					var4 = (float)((double)var4 + (double)var19 * var9);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}
}
