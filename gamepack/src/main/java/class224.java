public class class224 implements class367 {
	static class459 field2043;
	static int[] field2041;
	static final class224 field2036;
	static final class224 field2037;
	static final class224 field2038;
	static final class224 field2039;
	static final class224 field2042;
	final int field2035;
	final int field2040;

	static {
		field2036 = new class224(0, 0);
		field2039 = new class224(1, 1);
		field2037 = new class224(2, 2);
		field2038 = new class224(3, 3);
		field2042 = new class224(4, 4);
	}

	class224(int var1, int var2) {
		this.field2035 = var1;
		this.field2040 = var2;
	}

	public int method1970() {
		return this.field2040;
	}

	static final void method1264(int var0, int var1, int var2, int var3, int var4, int var5, class317 var6, class76 var7) {
		if (!Client.field7 || (class38.field513[0][var1][var2] & 2) != 0 || (class38.field513[var0][var1][var2] & 16) == 0) {
			if (var0 < class38.field503) {
				class38.field503 = var0;
			}

			class235 var9 = class96.method638(var3, (byte)-23);
			int var10;
			int var11;
			if (var4 != 1 && var4 != 3) {
				var10 = var9.field2121;
				var11 = var9.field2106;
			} else {
				var10 = var9.field2106;
				var11 = var9.field2121;
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

			int[][] var16 = class38.field511[var0];
			int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
			int var18 = (var1 << 7) + (var10 << 6);
			int var19 = (var11 << 6) + (var2 << 7);
			long var20 = class182.method1013(var1, var2, 2, var9.field2130 == 0, var3);
			int var22 = var5 + (var4 << 6);
			if (var9.field2146 == 1) {
				var22 += 256;
			}

			if (var9.method1355()) {
				class517.method2523(var0, var1, var2, var9, var4);
			}

			Object var23;
			if (var5 == 22) {
				if (!Client.field7 || var9.field2130 != 0 || var9.field2123 == 1 || var9.field2110) {
					if (var9.field2133 == -1 && var9.field2147 == null) {
						var23 = var9.method1347(22, var4, var16, var18, var17, var19);
					} else {
						var23 = new class165(var3, 22, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
					}

					var6.method1759(var0, var1, var2, var17, (class480)var23, var20, var22);
					if (var9.field2123 == 1 && null != var7) {
						var7.method528(var1, var2);
					}

				}
			} else {
				int var24;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var9.field2133 == -1 && null == var9.field2147) {
							var23 = var9.method1347(var5, var4, var16, var18, var17, var19);
						} else {
							var23 = new class165(var3, var5, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
						}

						var6.method1761(var0, var1, var2, var17, 1, 1, (class480)var23, 0, var20, var22);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class244.field2223[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var9.field2123 != 0 && null != var7) {
							var7.method526(var1, var2, var10, var11, var9.field2124);
						}

					} else if (var5 == 0) {
						if (var9.field2133 == -1 && var9.field2147 == null) {
							var23 = var9.method1347(0, var4, var16, var18, var17, var19);
						} else {
							var23 = new class165(var3, 0, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
						}

						var6.method1781(var0, var1, var2, var17, (class480)var23, (class480)null, class38.field506[var4], 0, var20, var22);
						if (var4 == 0) {
							if (var9.field2137) {
								class394.field3316[var0][var1][var2] = 50;
								class394.field3316[var0][var1][var2 + 1] = 50;
							}

							if (var9.field2132) {
								var10000 = class244.field2223[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var9.field2137) {
								class394.field3316[var0][var1][var2 + 1] = 50;
								class394.field3316[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2132) {
								var10000 = class244.field2223[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var9.field2137) {
								class394.field3316[var0][var1 + 1][var2] = 50;
								class394.field3316[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var9.field2132) {
								var10000 = class244.field2223[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var9.field2137) {
								class394.field3316[var0][var1][var2] = 50;
								class394.field3316[var0][var1 + 1][var2] = 50;
							}

							if (var9.field2132) {
								var10000 = class244.field2223[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var9.field2123 != 0 && var7 != null) {
							var7.method525(var1, var2, var5, var4, var9.field2124);
						}

						if (var9.field2127 != 16) {
							var6.method1764(var0, var1, var2, var9.field2127);
						}

					} else if (var5 == 1) {
						if (var9.field2133 == -1 && null == var9.field2147) {
							var23 = var9.method1347(1, var4, var16, var18, var17, var19);
						} else {
							var23 = new class165(var3, 1, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
						}

						var6.method1781(var0, var1, var2, var17, (class480)var23, (class480)null, class38.field507[var4], 0, var20, var22);
						if (var9.field2137) {
							if (var4 == 0) {
								class394.field3316[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class394.field3316[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class394.field3316[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class394.field3316[var0][var1][var2] = 50;
							}
						}

						if (var9.field2123 != 0 && var7 != null) {
							var7.method525(var1, var2, var5, var4, var9.field2124);
						}

					} else {
						int var29;
						if (var5 == 2) {
							var29 = var4 + 1 & 3;
							Object var31;
							Object var32;
							if (var9.field2133 == -1 && var9.field2147 == null) {
								var32 = var9.method1347(2, var4 + 4, var16, var18, var17, var19);
								var31 = var9.method1347(2, var29, var16, var18, var17, var19);
							} else {
								var32 = new class165(var3, 2, var4 + 4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
								var31 = new class165(var3, 2, var29, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
							}

							var6.method1781(var0, var1, var2, var17, (class480)var32, (class480)var31, class38.field506[var4], class38.field506[var29], var20, var22);
							if (var9.field2132) {
								if (var4 == 0) {
									var10000 = class244.field2223[var0][var1];
									var10000[var2] |= 585;
									var10000 = class244.field2223[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class244.field2223[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = class244.field2223[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class244.field2223[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class244.field2223[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class244.field2223[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class244.field2223[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var9.field2123 != 0 && var7 != null) {
								var7.method525(var1, var2, var5, var4, var9.field2124);
							}

							if (var9.field2127 != 16) {
								var6.method1764(var0, var1, var2, var9.field2127);
							}

						} else if (var5 == 3) {
							if (var9.field2133 == -1 && null == var9.field2147) {
								var23 = var9.method1347(3, var4, var16, var18, var17, var19);
							} else {
								var23 = new class165(var3, 3, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
							}

							var6.method1781(var0, var1, var2, var17, (class480)var23, (class480)null, class38.field507[var4], 0, var20, var22);
							if (var9.field2137) {
								if (var4 == 0) {
									class394.field3316[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class394.field3316[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class394.field3316[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class394.field3316[var0][var1][var2] = 50;
								}
							}

							if (var9.field2123 != 0 && null != var7) {
								var7.method525(var1, var2, var5, var4, var9.field2124);
							}

						} else if (var5 == 9) {
							if (var9.field2133 == -1 && null == var9.field2147) {
								var23 = var9.method1347(var5, var4, var16, var18, var17, var19);
							} else {
								var23 = new class165(var3, var5, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
							}

							var6.method1761(var0, var1, var2, var17, 1, 1, (class480)var23, 0, var20, var22);
							if (var9.field2123 != 0 && var7 != null) {
								var7.method526(var1, var2, var10, var11, var9.field2124);
							}

							if (var9.field2127 != 16) {
								var6.method1764(var0, var1, var2, var9.field2127);
							}

						} else if (var5 == 4) {
							if (var9.field2133 == -1 && null == var9.field2147) {
								var23 = var9.method1347(4, var4, var16, var18, var17, var19);
							} else {
								var23 = new class165(var3, 4, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
							}

							var6.method1796(var0, var1, var2, var17, (class480)var23, (class480)null, class38.field506[var4], 0, 0, 0, var20, var22);
						} else {
							long var30;
							Object var33;
							if (var5 == 5) {
								var29 = 16;
								var30 = var6.method1790(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class96.method638(class67.method491(var30), (byte)104).field2127;
								}

								if (var9.field2133 == -1 && null == var9.field2147) {
									var33 = var9.method1347(4, var4, var16, var18, var17, var19);
								} else {
									var33 = new class165(var3, 4, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
								}

								var6.method1796(var0, var1, var2, var17, (class480)var33, (class480)null, class38.field506[var4], 0, class38.field508[var4] * var29, class38.field509[var4] * var29, var20, var22);
							} else if (var5 == 6) {
								var29 = 8;
								var30 = var6.method1790(var0, var1, var2);
								if (var30 != 0L) {
									var29 = class96.method638(class67.method491(var30), (byte)-6).field2127 / 2;
								}

								if (var9.field2133 == -1 && var9.field2147 == null) {
									var33 = var9.method1347(4, var4 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class165(var3, 4, var4 + 4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
								}

								var6.method1796(var0, var1, var2, var17, (class480)var33, (class480)null, 256, var4, var29 * class38.field514[var4], var29 * class38.field512[var4], var20, var22);
							} else if (var5 == 7) {
								var24 = var4 + 2 & 3;
								if (var9.field2133 == -1 && null == var9.field2147) {
									var23 = var9.method1347(4, var24 + 4, var16, var18, var17, var19);
								} else {
									var23 = new class165(var3, 4, var24 + 4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
								}

								var6.method1796(var0, var1, var2, var17, (class480)var23, (class480)null, 256, var24, 0, 0, var20, var22);
							} else if (var5 == 8) {
								var29 = 8;
								var30 = var6.method1790(var0, var1, var2);
								if (0L != var30) {
									var29 = class96.method638(class67.method491(var30), (byte)-21).field2127 / 2;
								}

								int var28 = var4 + 2 & 3;
								Object var27;
								if (var9.field2133 == -1 && var9.field2147 == null) {
									var33 = var9.method1347(4, var4 + 4, var16, var18, var17, var19);
									var27 = var9.method1347(4, var28 + 4, var16, var18, var17, var19);
								} else {
									var33 = new class165(var3, 4, var4 + 4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
									var27 = new class165(var3, 4, var28 + 4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
								}

								var6.method1796(var0, var1, var2, var17, (class480)var33, (class480)var27, 256, var4, var29 * class38.field514[var4], class38.field512[var4] * var29, var20, var22);
							}
						}
					}
				} else {
					if (var9.field2133 == -1 && var9.field2147 == null) {
						var23 = var9.method1347(10, var4, var16, var18, var17, var19);
					} else {
						var23 = new class165(var3, 10, var4, var0, var1, var2, var9.field2133, var9.field2138, (class480)null);
					}

					if (null != var23 && var6.method1761(var0, var1, var2, var17, var10, var11, (class480)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field2137) {
						var24 = 15;
						if (var23 instanceof class250) {
							var24 = ((class250)var23).method1454() / 4;
							if (var24 > 30) {
								var24 = 30;
							}
						}

						for (int var25 = 0; var25 <= var10; ++var25) {
							for (int var26 = 0; var26 <= var11; ++var26) {
								if (var24 > class394.field3316[var0][var1 + var25][var26 + var2]) {
									class394.field3316[var0][var1 + var25][var2 + var26] = (byte)var24;
								}
							}
						}
					}

					if (var9.field2123 != 0 && var7 != null) {
						var7.method526(var1, var2, var10, var11, var9.field2124);
					}

				}
			}
		}
	}
}
