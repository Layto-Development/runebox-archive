import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ew")
public class class532 implements class425 {
	@ObfInfo(name = "sy", desc = "Lub;")
	static class239 field4247;
	@ObfInfo(name = "al", desc = "[I")
	static int[] field4245;
	@ObfInfo(name = "au", desc = "Lew;")
	static final class532 field4240;
	@ObfInfo(name = "ao", desc = "Lew;")
	static final class532 field4241;
	@ObfInfo(name = "at", desc = "Lew;")
	static final class532 field4242;
	@ObfInfo(name = "ae", desc = "Lew;")
	static final class532 field4243;
	@ObfInfo(name = "ac", desc = "Lew;")
	static final class532 field4246;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1352772367)
	final int field4239;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -497734091)
	final int field4244;

	static {
		field4240 = new class532(0, 0);
		field4243 = new class532(1, 1);
		field4241 = new class532(2, 2);
		field4242 = new class532(3, 3);
		field4246 = new class532(4, 4);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class532(int var1, int var2) {
		this.field4239 = var1;
		this.field4244 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field4244;
	}

	@ObfInfo(name = "au", desc = "(B)[Lew;")
	static class532[] method2582() {
		return new class532[]{field4240, field4243, field4241, field4242, field4246};
	}

	@ObfInfo(name = "ao", desc = "(II)Lew;")
	static class532 method2581(int var0) {
		class532 var2 = (class532)class216.method1198(method2582(), var0);
		if (var2 == null) {
			var2 = field4240;
		}

		return var2;
	}

	@ObfInfo(name = "ad", desc = "(IIIIIILiv;Lis;I)V", opaqueValue = "1473798651")
	static final void method2580(int var0, int var1, int var2, int var3, int var4, int var5, class194 var6, class77 var7) {
		if (!Client.field31 || (class411.field3174[0][var1][var2] & 2) != 0 || (class411.field3174[var0][var1][var2] & 16) == 0) {
			if (var0 < class411.field3164) {
				class411.field3164 = var0;
			}

			class292 var9 = class185.method1043(var3, (byte)-23);
			int var10;
			int var11;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.field2339;
				var11 = var9.field2324;
			} else {
				var10 = var9.field2324;
				var11 = var9.field2339;
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

			int[][] var16 = class411.field3172[var0];
			int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
			int var18 = (var1 << 7) + (var10 << 6);
			int var19 = (var11 << 6) + (var2 << 7);
			long var20 = class487.method2467(var1, var2, 2, var9.field2348 == 0, var3);
			int var22 = var5 + (var4 << 6);
			if (var9.field2364 == 1) {
				var22 += 256;
			}

			if (var9.method1619()) {
				class470.method2414(var0, var1, var2, var9, var4);
			}

			Object var23;
			if (var5 == 22) {
				if (!Client.field31 || var9.field2348 != 0 || var9.field2341 == 1 || var9.field2328) {
					if (var9.field2351 == -1 && var9.field2365 == null) {
						var23 = var9.method1611(22, var4, var16, var18, var17, var19);
					} else {
						var23 = new class380(var3, 22, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
					}

					var6.method1061(var0, var1, var2, var17, (class510)var23, var20, var22);
					if (var9.field2341 == 1 && null != var7) {
						var7.method522(var1, var2);
					}

				}
			} else {
				int var24;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var9.field2351 == -1 && null == var9.field2365) {
							var23 = var9.method1611(var5, var4, var16, var18, var17, var19);
						} else {
							var23 = new class380(var3, var5, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
						}

						var6.method1063(var0, var1, var2, var17, 1, 1, (class510)var23, 0, var20, var22);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class177.field1627[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var9.field2341 != 0 && null != var7) {
							var7.method520(var1, var2, var10, var11, var9.field2342);
						}

					} else if (var5 == 0) {
						if (var9.field2351 == -1 && var9.field2365 == null) {
							var23 = var9.method1611(0, var4, var16, var18, var17, var19);
						} else {
							var23 = new class380(var3, 0, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
						}

						var6.method1083(var0, var1, var2, var17, (class510)var23, (class510)null, class411.field3167[var4], 0, var20, var22);
						if (var4 == 0) {
							if (var9.field2355) {
								class386.field3028[var0][var1][var2] = 50;
								class386.field3028[var0][var1][var2 + 1] = 50;
							}

							if (var9.field2350) {
								var10000 = class177.field1627[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var9.field2355) {
								class386.field3028[var0][var1][var2 + 1] = 50;
								class386.field3028[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2350) {
								var10000 = class177.field1627[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var9.field2355) {
								class386.field3028[var0][var1 + 1][var2] = 50;
								class386.field3028[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2350) {
								var10000 = class177.field1627[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var9.field2355) {
								class386.field3028[var0][var1][var2] = 50;
								class386.field3028[var0][var1 + 1][var2] = 50;
							}

							if (var9.field2350) {
								var10000 = class177.field1627[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var9.field2341 != 0 && var7 != null) {
							var7.method519(var1, var2, var5, var4, var9.field2342);
						}

						if (var9.field2345 != 16) {
							var6.method1066(var0, var1, var2, var9.field2345);
						}

					} else if (var5 == 1) {
						if (var9.field2351 == -1 && null == var9.field2365) {
							var23 = var9.method1611(1, var4, var16, var18, var17, var19);
						} else {
							var23 = new class380(var3, 1, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
						}

						var6.method1083(var0, var1, var2, var17, (class510)var23, (class510)null, class411.field3168[var4], 0, var20, var22);
						if (var9.field2355) {
							if (var4 == 0) {
								class386.field3028[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class386.field3028[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class386.field3028[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class386.field3028[var0][var1][var2] = 50;
							}
						}

						if (var9.field2341 != 0 && var7 != null) {
							var7.method519(var1, var2, var5, var4, var9.field2342);
						}

					} else {
						int var29;
						if (var5 == 2) {
							var29 = var4 + 1 & 3;
							Object var31;
							Object var32;
							if (var9.field2351 == -1 && var9.field2365 == null) {
								var32 = var9.method1611(2, var4 + 4, var16, var18, var17, var19);
								var31 = var9.method1611(2, var29, var16, var18, var17, var19);
							} else {
								var32 = new class380(var3, 2, var4 + 4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
								var31 = new class380(var3, 2, var29, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
							}

							var6.method1083(var0, var1, var2, var17, (class510)var32, (class510)var31, class411.field3167[var4], class411.field3167[var29], var20, var22);
							if (var9.field2350) {
								if (var4 == 0) {
									var10000 = class177.field1627[var0][var1];
									var10000[var2] |= 585;
									var10000 = class177.field1627[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class177.field1627[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = class177.field1627[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class177.field1627[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class177.field1627[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class177.field1627[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class177.field1627[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var9.field2341 != 0 && var7 != null) {
								var7.method519(var1, var2, var5, var4, var9.field2342);
							}

							if (var9.field2345 != 16) {
								var6.method1066(var0, var1, var2, var9.field2345);
							}

						} else if (var5 == 3) {
							if (var9.field2351 == -1 && null == var9.field2365) {
								var23 = var9.method1611(3, var4, var16, var18, var17, var19);
							} else {
								var23 = new class380(var3, 3, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
							}

							var6.method1083(var0, var1, var2, var17, (class510)var23, (class510)null, class411.field3168[var4], 0, var20, var22);
							if (var9.field2355) {
								if (var4 == 0) {
									class386.field3028[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class386.field3028[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class386.field3028[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class386.field3028[var0][var1][var2] = 50;
								}
							}

							if (var9.field2341 != 0 && null != var7) {
								var7.method519(var1, var2, var5, var4, var9.field2342);
							}

						} else if (var5 == 9) {
							if (var9.field2351 == -1 && null == var9.field2365) {
								var23 = var9.method1611(var5, var4, var16, var18, var17, var19);
							} else {
								var23 = new class380(var3, var5, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
							}

							var6.method1063(var0, var1, var2, var17, 1, 1, (class510)var23, 0, var20, var22);
							if (var9.field2341 != 0 && var7 != null) {
								var7.method520(var1, var2, var10, var11, var9.field2342);
							}

							if (var9.field2345 != 16) {
								var6.method1066(var0, var1, var2, var9.field2345);
							}

						} else if (var5 == 4) {
							if (var9.field2351 == -1 && null == var9.field2365) {
								var23 = var9.method1611(4, var4, var16, var18, var17, var19);
							} else {
								var23 = new class380(var3, 4, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
							}

							var6.method1098(var0, var1, var2, var17, (class510)var23, (class510)null, class411.field3167[var4], 0, 0, 0, var20, var22);
						} else {
							long var30;
							Object var33;
							if (var5 == 5) {
								var29 = 16;
								var30 = var6.method1092(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class185.method1043(class487.method2465(var30), (byte)104).field2345;
								}

								if (var9.field2351 == -1 && null == var9.field2365) {
									var33 = var9.method1611(4, var4, var16, var18, var17, var19);
								} else {
									var33 = new class380(var3, 4, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
								}

								var6.method1098(var0, var1, var2, var17, (class510)var33, (class510)null, class411.field3167[var4], 0, class411.field3169[var4] * var29, class411.field3170[var4] * var29, var20, var22);
							} else if (var5 == 6) {
								var29 = 8;
								var30 = var6.method1092(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class185.method1043(class487.method2465(var30), (byte)-6).field2345 / 2;
								}

								if (var9.field2351 == -1 && var9.field2365 == null) {
									var33 = var9.method1611(4, var4 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class380(var3, 4, var4 + 4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
								}

								var6.method1098(var0, var1, var2, var17, (class510)var33, (class510)null, 256, var4, var29 * class411.field3175[var4], var29 * class411.field3173[var4], var20, var22);
							} else if (var5 == 7) {
								var24 = var4 + 2 & 3;
								if (var9.field2351 == -1 && null == var9.field2365) {
									var23 = var9.method1611(4, var24 + 4, var16, var18, var17, var19);
								} else {
									var23 = new class380(var3, 4, var24 + 4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
								}

								var6.method1098(var0, var1, var2, var17, (class510)var23, (class510)null, 256, var24, 0, 0, var20, var22);
							} else if (var5 == 8) {
								var29 = 8;
								var30 = var6.method1092(var0, var1, var2);
								if (0L != var30) {
									var29 = class185.method1043(class487.method2465(var30), (byte)-21).field2345 / 2;
								}

								int var28 = var4 + 2 & 3;
								Object var27;
								if (var9.field2351 == -1 && var9.field2365 == null) {
									var33 = var9.method1611(4, var4 + 4, var16, var18, var17, var19);
									var27 = var9.method1611(4, var28 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class380(var3, 4, var4 + 4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
									var27 = new class380(var3, 4, var28 + 4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
								}

								var6.method1098(var0, var1, var2, var17, (class510)var33, (class510)var27, 256, var4, var29 * class411.field3175[var4], class411.field3173[var4] * var29, var20, var22);
							}
						}
					}
				} else {
					if (var9.field2351 == -1 && var9.field2365 == null) {
						var23 = var9.method1611(10, var4, var16, var18, var17, var19);
					} else {
						var23 = new class380(var3, 10, var4, var0, var1, var2, var9.field2351, var9.field2356, (class510)null);
					}

					if (null != var23 && var6.method1063(var0, var1, var2, var17, var10, var11, (class510)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field2355) {
						var24 = 15;
						if (var23 instanceof class384) {
							var24 = ((class384)var23).method2047() / 4;
							if (var24 > 30) {
								var24 = 30;
							}
						}

						for (int var25 = 0; var25 <= var10; ++var25) {
							for (int var26 = 0; var26 <= var11; ++var26) {
								if (var24 > class386.field3028[var0][var1 + var25][var26 + var2]) {
									class386.field3028[var0][var1 + var25][var2 + var26] = (byte)var24;
								}
							}
						}
					}

					if (var9.field2341 != 0 && var7 != null) {
						var7.method520(var1, var2, var10, var11, var9.field2342);
					}

				}
			}
		}
	}
}
