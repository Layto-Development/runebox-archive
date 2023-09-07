public class class339 implements class228 {

	static class100 field2594;

	static int[] field2592;

	static final class339 field2587;

	static final class339 field2588;

	static final class339 field2589;

	static final class339 field2590;

	static final class339 field2593;

	final int field2586;

	final int field2591;

	static {
		field2587 = new class339(0, 0);
		field2590 = new class339(1, 1);
		field2588 = new class339(2, 2);
		field2589 = new class339(3, 3);
		field2593 = new class339(4, 4);
	}

	class339(int var1, int var2) {
		this.field2586 = var1;
		this.field2591 = var2;
	}

	@Override
	public int method1362() {
		return this.field2591;
	}

	static class339[] method1793() {
		return new class339[] { field2587, field2590, field2588, field2589, field2593 };
	}

	static class339 method1792(int var0) {
		class339 var2 = (class339) class433.method2167(method1793(), var0);
		if (var2 == null) {
			var2 = field2587;
		}
		return var2;
	}

	static final void method1791(int var0, int var1, int var2, int var3, int var4, int var5, class372 var6, class438 var7) {
		if (!Client.field902 || (class502.field4037[0][var1][var2] & 2) != 0 || (class502.field4037[var0][var1][var2] & 16) == 0) {
			if (var0 < class502.field4027) {
				class502.field4027 = var0;
			}
			class362 var9 = class319.method1705(var3, (byte) -23);
			int var10;
			int var11;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.field2883;
				var11 = var9.field2868;
			} else {
				var10 = var9.field2868;
				var11 = var9.field2883;
			}
			int var12;
			int var13;
			if (var1 + var10 <= 104) {
				var12 = var1 + (var10 >> 1);
				var13 = (var10 + 1 >> 1) + var1;
			} else {
				var12 = var1;
				var13 = var1 + 1;
			}
			int var14;
			int var15;
			if (var2 + var11 <= 104) {
				var14 = var2 + (var11 >> 1);
				var15 = (var11 + 1 >> 1) + var2;
			} else {
				var14 = var2;
				var15 = var2 + 1;
			}
			int[][] var16 = class502.field4035[var0];
			int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
			int var18 = (var1 << 7) + (var10 << 6);
			int var19 = (var11 << 6) + (var2 << 7);
			long var20 = class424.method2134(var1, var2, 2, var9.field2892 == 0, var3);
			int var22 = var5 + (var4 << 6);
			if (var9.field2908 == 1) {
				var22 += 256;
			}
			if (var9.method1898()) {
				class46.method195(var0, var1, var2, var9, var4);
			}
			Object var23;
			if (var5 == 22) {
				if (!Client.field902 || var9.field2892 != 0 || var9.field2885 == 1 || var9.field2872) {
					if (var9.field2895 == -1 && var9.field2909 == null) {
						var23 = var9.method1890(22, var4, var16, var18, var17, var19);
					} else {
						var23 = new class57(var3, 22, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
					}
					var6.method1921(var0, var1, var2, var17, (class189) var23, var20, var22);
					if (var9.field2885 == 1 && null != var7) {
						var7.method2183(var1, var2);
					}
				}
			} else {
				int var24;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var9.field2895 == -1 && null == var9.field2909) {
							var23 = var9.method1890(var5, var4, var16, var18, var17, var19);
						} else {
							var23 = new class57(var3, var5, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
						}
						var6.method1923(var0, var1, var2, var17, 1, 1, (class189) var23, 0, var20, var22);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class119.field1432[var0][var1];
							var10000[var2] |= 2340;
						}
						if (var9.field2885 != 0 && null != var7) {
							var7.method2181(var1, var2, var10, var11, var9.field2886);
						}
					} else if (var5 == 0) {
						if (var9.field2895 == -1 && var9.field2909 == null) {
							var23 = var9.method1890(0, var4, var16, var18, var17, var19);
						} else {
							var23 = new class57(var3, 0, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
						}
						var6.method1943(var0, var1, var2, var17, (class189) var23, (class189) null, class502.field4030[var4], 0, var20, var22);
						if (var4 == 0) {
							if (var9.field2899) {
								class343.field2606[var0][var1][var2] = 50;
								class343.field2606[var0][var1][var2 + 1] = 50;
							}
							if (var9.field2894) {
								var10000 = class119.field1432[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var9.field2899) {
								class343.field2606[var0][var1][var2 + 1] = 50;
								class343.field2606[var0][var1 + 1][var2 + 1] = 50;
							}
							if (var9.field2894) {
								var10000 = class119.field1432[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var9.field2899) {
								class343.field2606[var0][var1 + 1][var2] = 50;
								class343.field2606[var0][var1 + 1][var2 + 1] = 50;
							}
							if (var9.field2894) {
								var10000 = class119.field1432[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var9.field2899) {
								class343.field2606[var0][var1][var2] = 50;
								class343.field2606[var0][var1 + 1][var2] = 50;
							}
							if (var9.field2894) {
								var10000 = class119.field1432[var0][var1];
								var10000[var2] |= 1170;
							}
						}
						if (var9.field2885 != 0 && var7 != null) {
							var7.method2180(var1, var2, var5, var4, var9.field2886);
						}
						if (var9.field2889 != 16) {
							var6.method1926(var0, var1, var2, var9.field2889);
						}
					} else if (var5 == 1) {
						if (var9.field2895 == -1 && null == var9.field2909) {
							var23 = var9.method1890(1, var4, var16, var18, var17, var19);
						} else {
							var23 = new class57(var3, 1, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
						}
						var6.method1943(var0, var1, var2, var17, (class189) var23, (class189) null, class502.field4031[var4], 0, var20, var22);
						if (var9.field2899) {
							if (var4 == 0) {
								class343.field2606[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class343.field2606[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class343.field2606[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class343.field2606[var0][var1][var2] = 50;
							}
						}
						if (var9.field2885 != 0 && var7 != null) {
							var7.method2180(var1, var2, var5, var4, var9.field2886);
						}
					} else {
						int var29;
						if (var5 == 2) {
							var29 = var4 + 1 & 3;
							Object var31;
							Object var32;
							if (var9.field2895 == -1 && var9.field2909 == null) {
								var32 = var9.method1890(2, var4 + 4, var16, var18, var17, var19);
								var31 = var9.method1890(2, var29, var16, var18, var17, var19);
							} else {
								var32 = new class57(var3, 2, var4 + 4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
								var31 = new class57(var3, 2, var29, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
							}
							var6.method1943(var0, var1, var2, var17, (class189) var32, (class189) var31, class502.field4030[var4], class502.field4030[var29], var20, var22);
							if (var9.field2894) {
								if (var4 == 0) {
									var10000 = class119.field1432[var0][var1];
									var10000[var2] |= 585;
									var10000 = class119.field1432[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class119.field1432[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = class119.field1432[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class119.field1432[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class119.field1432[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class119.field1432[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class119.field1432[var0][var1];
									var10000[var2] |= 585;
								}
							}
							if (var9.field2885 != 0 && var7 != null) {
								var7.method2180(var1, var2, var5, var4, var9.field2886);
							}
							if (var9.field2889 != 16) {
								var6.method1926(var0, var1, var2, var9.field2889);
							}
						} else if (var5 == 3) {
							if (var9.field2895 == -1 && null == var9.field2909) {
								var23 = var9.method1890(3, var4, var16, var18, var17, var19);
							} else {
								var23 = new class57(var3, 3, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
							}
							var6.method1943(var0, var1, var2, var17, (class189) var23, (class189) null, class502.field4031[var4], 0, var20, var22);
							if (var9.field2899) {
								if (var4 == 0) {
									class343.field2606[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class343.field2606[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class343.field2606[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class343.field2606[var0][var1][var2] = 50;
								}
							}
							if (var9.field2885 != 0 && null != var7) {
								var7.method2180(var1, var2, var5, var4, var9.field2886);
							}
						} else if (var5 == 9) {
							if (var9.field2895 == -1 && null == var9.field2909) {
								var23 = var9.method1890(var5, var4, var16, var18, var17, var19);
							} else {
								var23 = new class57(var3, var5, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
							}
							var6.method1923(var0, var1, var2, var17, 1, 1, (class189) var23, 0, var20, var22);
							if (var9.field2885 != 0 && var7 != null) {
								var7.method2181(var1, var2, var10, var11, var9.field2886);
							}
							if (var9.field2889 != 16) {
								var6.method1926(var0, var1, var2, var9.field2889);
							}
						} else if (var5 == 4) {
							if (var9.field2895 == -1 && null == var9.field2909) {
								var23 = var9.method1890(4, var4, var16, var18, var17, var19);
							} else {
								var23 = new class57(var3, 4, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
							}
							var6.method1958(var0, var1, var2, var17, (class189) var23, (class189) null, class502.field4030[var4], 0, 0, 0, var20, var22);
						} else {
							long var30;
							Object var33;
							if (var5 == 5) {
								var29 = 16;
								var30 = var6.method1952(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class319.method1705(class424.method2132(var30), (byte) 104).field2889;
								}
								if (var9.field2895 == -1 && null == var9.field2909) {
									var33 = var9.method1890(4, var4, var16, var18, var17, var19);
								} else {
									var33 = new class57(var3, 4, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
								}
								var6.method1958(var0, var1, var2, var17, (class189) var33, (class189) null, class502.field4030[var4], 0, class502.field4032[var4] * var29, class502.field4033[var4] * var29, var20, var22);
							} else if (var5 == 6) {
								var29 = 8;
								var30 = var6.method1952(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class319.method1705(class424.method2132(var30), (byte) -6).field2889 / 2;
								}
								if (var9.field2895 == -1 && var9.field2909 == null) {
									var33 = var9.method1890(4, var4 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class57(var3, 4, var4 + 4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
								}
								var6.method1958(var0, var1, var2, var17, (class189) var33, (class189) null, 256, var4, var29 * class502.field4038[var4], var29 * class502.field4036[var4], var20, var22);
							} else if (var5 == 7) {
								var24 = var4 + 2 & 3;
								if (var9.field2895 == -1 && null == var9.field2909) {
									var23 = var9.method1890(4, var24 + 4, var16, var18, var17, var19);
								} else {
									var23 = new class57(var3, 4, var24 + 4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
								}
								var6.method1958(var0, var1, var2, var17, (class189) var23, (class189) null, 256, var24, 0, 0, var20, var22);
							} else if (var5 == 8) {
								var29 = 8;
								var30 = var6.method1952(var0, var1, var2);
								if (0L != var30) {
									var29 = class319.method1705(class424.method2132(var30), (byte) -21).field2889 / 2;
								}
								int var28 = var4 + 2 & 3;
								Object var27;
								if (var9.field2895 == -1 && var9.field2909 == null) {
									var33 = var9.method1890(4, var4 + 4, var16, var18, var17, var19);
									var27 = var9.method1890(4, var28 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class57(var3, 4, var4 + 4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
									var27 = new class57(var3, 4, var28 + 4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
								}
								var6.method1958(var0, var1, var2, var17, (class189) var33, (class189) var27, 256, var4, var29 * class502.field4038[var4], class502.field4036[var4] * var29, var20, var22);
							}
						}
					}
				} else {
					if (var9.field2895 == -1 && var9.field2909 == null) {
						var23 = var9.method1890(10, var4, var16, var18, var17, var19);
					} else {
						var23 = new class57(var3, 10, var4, var0, var1, var2, var9.field2895, var9.field2900, (class189) null);
					}
					if (null != var23 && var6.method1923(var0, var1, var2, var17, var10, var11, (class189) var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field2899) {
						var24 = 15;
						if (var23 instanceof class113) {
							var24 = ((class113) var23).method681() / 4;
							if (var24 > 30) {
								var24 = 30;
							}
						}
						for (int var25 = 0; var25 <= var10; ++var25) {
							for (int var26 = 0; var26 <= var11; ++var26) {
								if (var24 > class343.field2606[var0][var1 + var25][var26 + var2]) {
									class343.field2606[var0][var1 + var25][var2 + var26] = (byte) var24;
								}
							}
						}
					}
					if (var9.field2885 != 0 && var7 != null) {
						var7.method2181(var1, var2, var10, var11, var9.field2886);
					}
				}
			}
		}
	}
}
