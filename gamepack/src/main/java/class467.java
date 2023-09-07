public class class467 {

	public static final float field3702;

	public static final float field3703;

	static class135 field3701;

	static class250 field3706;

	static float[] field3704;

	static float[] field3705;

	static {
		field3702 = Math.ulp(1.0F);
		field3703 = field3702 * 2.0F;
		field3704 = new float[4];
		field3705 = new float[5];
	}

	class467() throws Throwable {
	}

	static float method2290(class377 var0, float var1) {
		if (var0 != null && var0.method2002() != 0) {
			if (var1 < (float) var0.field3044[0].field4177) {
				return class339.field2587 == var0.field3042 ? var0.field3044[0].field4180 : method2289(var0, var1, true);
			} else if (var1 > (float) var0.field3044[var0.method2002() - 1].field4177) {
				return class339.field2587 == var0.field3062 ? var0.field3044[var0.method2002() - 1].field4180 : method2289(var0, var1, false);
			} else if (var0.field3041) {
				return var0.field3044[0].field4180;
			} else {
				class528 var3 = var0.method2001(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (null == var3) {
					return 0.0F;
				} else {
					float var6;
					float var7;
					if (0.0D == (double) var3.field4181 && (double) var3.field4182 == 0.0D) {
						var4 = true;
					} else if (Float.MAX_VALUE == var3.field4181 && Float.MAX_VALUE == var3.field4182) {
						var5 = true;
					} else if (null != var3.field4183) {
						if (var0.field3056) {
							var6 = (float) var3.field4177;
							float var10 = var3.field4180;
							var7 = var3.field4181 * 0.33333334F + var6;
							float var11 = var3.field4182 * 0.33333334F + var10;
							float var9 = (float) var3.field4183.field4177;
							float var13 = var3.field4183.field4180;
							float var8 = var9 - var3.field4183.field4186 * 0.33333334F;
							float var12 = var13 - var3.field4183.field4178 * 0.33333334F;
							float var16;
							float var17;
							float var18;
							float var19;
							float var20;
							if (var0.field3055) {
								var16 = var11;
								var17 = var12;
								if (null != var0) {
									var18 = var9 - var6;
									if ((double) var18 != 0.0D) {
										var19 = var7 - var6;
										var20 = var8 - var6;
										float[] var30 = new float[] { var19 / var18, var20 / var18 };
										var0.field3043 = 0.33333334F == var30[0] && var30[1] == 0.6666667F;
										float var22 = var30[0];
										float var23 = var30[1];
										if ((double) var30[0] < 0.0D) {
											var30[0] = 0.0F;
										}
										if ((double) var30[1] > 1.0D) {
											var30[1] = 1.0F;
										}
										if ((double) var30[0] > 1.0D || var30[1] < -1.0F) {
											class390.method2027(var30);
										}
										float var10000;
										if (var30[0] != var22) {
											var10000 = var6 + var18 * var30[0];
											if (0.0D != (double) var22) {
												var16 = (var11 - var10) * var30[0] / var22 + var10;
											}
										}
										if (var23 != var30[1]) {
											var10000 = var6 + var18 * var30[1];
											if (1.0D != (double) var23) {
												var17 = (float) ((double) var13 - (1.0D - (double) var30[1]) * (double) (var13 - var12) / (1.0D - (double) var23));
											}
										}
										var0.field3046 = var6;
										var0.field3047 = var9;
										float var24 = var30[0];
										float var25 = var30[1];
										float var26 = var24 - 0.0F;
										float var27 = var25 - var24;
										float var28 = 1.0F - var25;
										float var29 = var27 - var26;
										var0.field3045 = var28 - var27 - var29;
										var0.field3050 = var29 + var29 + var29;
										var0.field3049 = var26 + var26 + var26;
										var0.field3048 = 0.0F;
										var26 = var16 - var10;
										var27 = var17 - var16;
										var28 = var13 - var17;
										var29 = var27 - var26;
										var0.field3040 = var28 - var27 - var29;
										var0.field3053 = var29 + var29 + var29;
										var0.field3052 = var26 + var26 + var26;
										var0.field3063 = var10;
									}
								}
							} else if (var0 != null) {
								var0.field3046 = var6;
								float var14 = var9 - var6;
								float var15 = var13 - var10;
								var16 = var7 - var6;
								var17 = 0.0F;
								var18 = 0.0F;
								if ((double) var16 != 0.0D) {
									var17 = (var11 - var10) / var16;
								}
								var16 = var9 - var8;
								if ((double) var16 != 0.0D) {
									var18 = (var13 - var12) / var16;
								}
								var19 = 1.0F / (var14 * var14);
								var20 = var17 * var14;
								float var21 = var18 * var14;
								var0.field3048 = var19 * (var20 + var21 - var15 - var15) / var14;
								var0.field3049 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
								var0.field3050 = var17;
								var0.field3045 = var10;
							}
							var0.field3056 = false;
						}
					} else {
						var4 = true;
					}
					if (var4) {
						return var3.field4180;
					} else if (var5) {
						return (float) var3.field4177 != var1 && null != var3.field4183 ? var3.field4183.field4180 : var3.field4180;
					} else if (var0.field3055) {
						return method2291(var0, var1);
					} else {
						if (var0 == null) {
							var6 = 0.0F;
						} else {
							var7 = var1 - var0.field3046;
							var6 = var0.field3045 + var7 * ((var7 * var0.field3048 + var0.field3049) * var7 + var0.field3050);
						}
						return var6;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	static float method2291(class377 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3;
			if (var0.field3046 == var1) {
				var3 = 0.0F;
			} else if (var1 == var0.field3047) {
				var3 = 1.0F;
			} else {
				var3 = (var1 - var0.field3046) / (var0.field3047 - var0.field3046);
			}
			float var4;
			if (var0.field3043) {
				var4 = var3;
			} else {
				field3704[3] = var0.field3045;
				field3704[2] = var0.field3050;
				field3704[1] = var0.field3049;
				field3704[0] = var0.field3048 - var3;
				field3705[0] = 0.0F;
				field3705[1] = 0.0F;
				field3705[2] = 0.0F;
				field3705[3] = 0.0F;
				field3705[4] = 0.0F;
				int var5 = class154.method908(field3704, 3, 0.0F, true, 1.0F, true, field3705);
				if (var5 == 1) {
					var4 = field3705[0];
				} else {
					var4 = 0.0F;
				}
			}
			return var4 * (var0.field3052 + var4 * (var4 * var0.field3040 + var0.field3053)) + var0.field3063;
		}
	}

	static float method2289(class377 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (null != var0 && var0.method2002() != 0) {
			float var5 = (float) var0.field3044[0].field4177;
			float var6 = (float) var0.field3044[var0.method2002() - 1].field4177;
			float var7 = var6 - var5;
			if ((double) var7 == 0.0D) {
				return var0.field3044[0].field4180;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}
				double var9 = (double) (int) var8;
				float var11 = Math.abs((float) ((double) var8 - var9));
				float var12 = var11 * var7;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double) (int) var13;
				var11 = (float) (var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (class339.field2593 == var0.field3042) {
						if ((double) var11 != 0.0D) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (var0.field3042 != class339.field2588 && var0.field3042 != class339.field2589) {
						if (class339.field2590 == var0.field3042) {
							var12 = var5 - var1;
							var17 = var0.field3044[0].field4186;
							var18 = var0.field3044[0].field4178;
							var4 = var0.field3044[0].field4180;
							if (0.0D != (double) var17) {
								var4 -= var12 * var18 / var17;
							}
							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (class339.field2593 == var0.field3062) {
					if ((double) var11 != 0.0D) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (class339.field2588 != var0.field3062 && var0.field3062 != class339.field2589) {
					if (var0.field3062 == class339.field2590) {
						var12 = var1 - var6;
						var17 = var0.field3044[var0.method2002() - 1].field4181;
						var18 = var0.field3044[var0.method2002() - 1].field4182;
						var4 = var0.field3044[var0.method2002() - 1].field4180;
						if (0.0D != (double) var17) {
							var4 += var18 * var12 / var17;
						}
						return var4;
					}
				} else {
					var12 += var5;
				}
				var4 = method2290(var0, var12);
				float var19;
				if (var2 && class339.field2589 == var0.field3042) {
					var19 = var0.field3044[var0.method2002() - 1].field4180 - var0.field3044[0].field4180;
					var4 = (float) ((double) var4 - (double) var19 * var9);
				} else if (!var2 && var0.field3062 == class339.field2589) {
					var19 = var0.field3044[var0.method2002() - 1].field4180 - var0.field3044[0].field4180;
					var4 = (float) ((double) var4 + (double) var19 * var9);
				}
				return var4;
			}
		} else {
			return var4;
		}
	}
}
