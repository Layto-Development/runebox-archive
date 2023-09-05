import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "cb")
public class class175 {
	@ObfInfo(name = "aj", desc = "Z")
	static boolean field1616;
	@ObfInfo(name = "ay", desc = "Z")
	static boolean field1622;
	@ObfInfo(name = "al", desc = "[Lcv;")
	static class287[] field1611;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -808541663)
	static int field1613;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -567436227)
	static int field1619;
	@ObfInfo(name = "ai", desc = "[I")
	static int[] field1610;
	@ObfInfo(name = "an", desc = "[I")
	static int[] field1617;
	@ObfInfo(name = "ap", desc = "[I")
	static int[] field1621;
	@ObfInfo(name = "az", desc = "[[I")
	static int[][] field1612;
	@ObfInfo(name = "af", desc = "[Ljava/lang/String;")
	static String[] field1608;
	@ObfInfo(name = "ac", desc = "[Ljava/lang/String;")
	static String[] field1609;
	@ObfInfo(name = "av", desc = "Ljava/util/ArrayList;")
	static ArrayList field1618;
	@ObfInfo(name = "ax", desc = "Ljava/util/Calendar;")
	static Calendar field1614;
	@ObfInfo(name = "bk", desc = "D")
	static final double field1620;
	@ObfInfo(name = "ah", desc = "[Ljava/lang/String;")
	static final String[] field1615;

	static {
		field1610 = new int[5];
		field1612 = new int[5][5000];
		field1621 = new int[1000];
		field1608 = new String[1000];
		field1613 = 0;
		field1611 = new class287[50];
		field1614 = Calendar.getInstance();
		field1615 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field1622 = false;
		field1616 = false;
		field1618 = new ArrayList();
		field1619 = 0;
		field1620 = Math.log(2.0D);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class175() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Ldy;B)V")
	public static void method1006(class20 var0) {
		class412.method2184(var0, 500000, 475000);
	}

	@ObfInfo(name = "ao", desc = "(Ldy;Ldh;III)V")
	static void method991(class20 var0, class333 var1, int var2, int var3) {
		Object[] var5 = var0.field380;
		class293.field2375 = 0;
		class89.field892 = 0;
		int var6 = -1;
		int[] var7 = var1.field2642;
		int[] var8 = var1.field2643;
		byte var9 = -1;
		field1613 = 0;
		field1622 = false;
		boolean var10 = false;
		int var11 = 0;
		boolean var23 = false;

		label860: {
			label861: {
				try {
					int var14;
					try {
						var23 = true;
						class44.field560 = new int[var1.field2645];
						int var12 = 0;
						field1609 = new String[var1.field2649];
						int var28 = 0;

						int var15;
						String var38;
						for (var14 = 1; var14 < var5.length; ++var14) {
							if (var5[var14] instanceof Integer) {
								var15 = (Integer)var5[var14];
								if (var15 == -2147483647) {
									var15 = var0.field378;
								}

								if (var15 == -2147483646) {
									var15 = var0.field381;
								}

								if (var15 == -2147483645) {
									var15 = var0.field377 != null ? var0.field377.field1214 : -1;
								}

								if (var15 == -2147483644) {
									var15 = var0.field382;
								}

								if (var15 == -2147483643) {
									var15 = var0.field377 != null ? -1714711969 * var0.field377.field1333 * 1628260767 : -1;
								}

								if (var15 == -2147483642) {
									var15 = var0.field383 != null ? var0.field383.field1214 : -1;
								}

								if (var15 == -2147483641) {
									var15 = null != var0.field383 ? -1714711969 * var0.field383.field1333 * 1628260767 : -1;
								}

								if (var15 == -2147483640) {
									var15 = var0.field379;
								}

								if (var15 == -2147483639) {
									var15 = var0.field385;
								}

								class44.field560[var12++] = var15;
							} else if (var5[var14] instanceof String) {
								var38 = (String)var5[var14];
								if (var38.equals("event_opbase")) {
									var38 = var0.field386;
								}

								field1609[var28++] = var38;
							}
						}

						field1619 = var0.field387;

						label841:
						while (true) {
							++var11;
							if (var11 > var2) {
								throw new RuntimeException();
							}

							++var6;
							int var26 = var7[var6];
							if (var26 >= 100) {
								boolean var37;
								if (var1.field2643[var6] == 1) {
									var37 = true;
								} else {
									var37 = false;
								}

								var15 = method986(var26, var1, var37);
								switch(var15) {
								case 0:
									var23 = false;
									break label841;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var26 == 0) {
								field1621[++class293.field2375 - 1] = var8[var6];
							} else if (var26 == 1) {
								var14 = var8[var6];
								field1621[++class293.field2375 - 1] = class44.field559[var14];
							} else if (var26 == 2) {
								var14 = var8[var6];
								class44.field559[var14] = field1621[--class293.field2375];
								Client.method235(var14);
							} else if (var26 == 3) {
								field1608[++class89.field892 - 1] = var1.field2644[var6];
							} else if (var26 == 6) {
								var6 += var8[var6];
							} else if (var26 == 7) {
								class293.field2375 -= 2;
								if (field1621[class293.field2375] != field1621[1 + class293.field2375]) {
									var6 += var8[var6];
								}
							} else if (var26 == 8) {
								class293.field2375 -= 2;
								if (field1621[class293.field2375] == field1621[class293.field2375 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 9) {
								class293.field2375 -= 2;
								if (field1621[class293.field2375] < field1621[class293.field2375 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 10) {
								class293.field2375 -= 2;
								if (field1621[class293.field2375] > field1621[class293.field2375 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 21) {
								if (field1613 == 0) {
									var23 = false;
									break label861;
								}

								class287 var36 = field1611[--field1613];
								var1 = var36.field2285;
								var7 = var1.field2642;
								var8 = var1.field2643;
								var6 = var36.field2288;
								class44.field560 = var36.field2286;
								field1609 = var36.field2287;
							} else if (var26 == 25) {
								var14 = var8[var6];
								field1621[++class293.field2375 - 1] = class44.method444(var14);
							} else if (var26 == 27) {
								var14 = var8[var6];
								class399.method2116(var14, field1621[--class293.field2375]);
							} else if (var26 == 31) {
								class293.field2375 -= 2;
								if (field1621[class293.field2375] <= field1621[class293.field2375 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 32) {
								class293.field2375 -= 2;
								if (field1621[class293.field2375] >= field1621[class293.field2375 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 33) {
								field1621[++class293.field2375 - 1] = class44.field560[var8[var6]];
							} else if (var26 == 34) {
								class44.field560[var8[var6]] = field1621[--class293.field2375];
							} else if (var26 == 35) {
								field1608[++class89.field892 - 1] = field1609[var8[var6]];
							} else if (var26 == 36) {
								field1609[var8[var6]] = field1608[--class89.field892];
							} else if (var26 == 37) {
								var14 = var8[var6];
								class89.field892 -= var14;
								var38 = class455.method2381(field1608, class89.field892, var14);
								field1608[++class89.field892 - 1] = var38;
							} else if (var26 == 38) {
								--class293.field2375;
							} else if (var26 == 39) {
								--class89.field892;
							} else {
								int var18;
								if (var26 != 40) {
									if (var26 == 42) {
										field1621[++class293.field2375 - 1] = class171.field1595.method1709(var8[var6]);
									} else if (var26 == 43) {
										class171.field1595.method1720(var8[var6], field1621[--class293.field2375]);
									} else if (var26 == 44) {
										var14 = var8[var6] >> 16;
										var15 = var8[var6] & 65535;
										int var29 = field1621[--class293.field2375];
										if (var29 < 0 || var29 > 5000) {
											throw new RuntimeException();
										}

										field1610[var14] = var29;
										byte var32 = -1;
										if (var15 == 105) {
											var32 = 0;
										}

										for (var18 = 0; var18 < var29; ++var18) {
											field1612[var14][var18] = var32;
										}
									} else if (var26 == 45) {
										var14 = var8[var6];
										var15 = field1621[--class293.field2375];
										if (var15 < 0 || var15 >= field1610[var14]) {
											throw new RuntimeException();
										}

										field1621[++class293.field2375 - 1] = field1612[var14][var15];
									} else if (var26 == 46) {
										var14 = var8[var6];
										class293.field2375 -= 2;
										var15 = field1621[class293.field2375];
										if (var15 < 0 || var15 >= field1610[var14]) {
											throw new RuntimeException();
										}

										field1612[var14][var15] = field1621[1 + class293.field2375];
									} else {
										String var30;
										if (var26 == 47) {
											var30 = class171.field1595.method1711(var8[var6]);
											if (var30 == null) {
												var30 = class453.field3707;
											}

											field1608[++class89.field892 - 1] = var30;
										} else if (var26 == 48) {
											class171.field1595.method1716(var8[var6], field1608[--class89.field892]);
										} else if (var26 == 49) {
											var30 = class171.field1595.method1710(var8[var6]);
											field1608[++class89.field892 - 1] = var30;
										} else if (var26 == 50) {
											class171.field1595.method1717(var8[var6], field1608[--class89.field892]);
										} else if (var26 == 60) {
											class525 var33 = var1.field2650[var8[var6]];
											class149 var41 = (class149)var33.method2558((long)field1621[--class293.field2375]);
											if (var41 != null) {
												var6 += var41.field1457;
											}
										} else {
											Integer var34;
											if (var26 == 74) {
												var34 = class285.field2275.method1590(var8[var6]);
												if (var34 == null) {
													field1621[++class293.field2375 - 1] = -1;
												} else {
													field1621[++class293.field2375 - 1] = var34;
												}
											} else {
												if (var26 != 76) {
													throw new IllegalStateException();
												}

												var34 = class365.field2842.method963(var8[var6]);
												if (var34 == null) {
													field1621[++class293.field2375 - 1] = -1;
												} else {
													field1621[++class293.field2375 - 1] = var34;
												}
											}
										}
									}
								} else {
									var14 = var8[var6];
									class333 var40 = class333.method1816(var14);
									int[] var16 = new int[var40.field2645];
									String[] var17 = new String[var40.field2649];

									for (var18 = 0; var18 < var40.field2647; ++var18) {
										var16[var18] = field1621[class293.field2375 - var40.field2647 + var18];
									}

									for (var18 = 0; var18 < var40.field2648; ++var18) {
										var17[var18] = field1608[class89.field892 - var40.field2648 + var18];
									}

									class293.field2375 -= var40.field2647;
									class89.field892 -= var40.field2648;
									class287 var35 = new class287();
									var35.field2285 = var1;
									var35.field2288 = var6;
									var35.field2286 = class44.field560;
									var35.field2287 = field1609;
									field1611[++field1613 - 1] = var35;
									var1 = var40;
									var7 = var40.field2642;
									var8 = var40.field2643;
									var6 = -1;
									class44.field560 = var16;
									field1609 = var17;
								}
							}
						}
					} catch (Exception var24) {
						var10 = true;
						StringBuilder var13 = new StringBuilder(30);
						var13.append("").append(var1.field1483).append(" ");

						for (var14 = field1613 - 1; var14 >= 0; --var14) {
							var13.append("").append(field1611[var14].field2285.field1483).append(" ");
						}

						var13.append("").append(var9);
						class159.method913(var13.toString(), var24);
						var23 = false;
						break label860;
					}
				} finally {
					if (var23) {
						while (field1618.size() > 0) {
							class522 var20 = (class522)field1618.remove(0);
							Client.method142(var20.method2554(), var20.method2555(), var20.method2553(), var20.method2552(), "");
						}

						if (field1622) {
							field1622 = false;
							Client.method230();
						}

						if (!var10 && var3 > 0 && var11 >= var3) {
							class159.method913("Warning: Script " + var1.field2646 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (field1618.size() > 0) {
					class522 var31 = (class522)field1618.remove(0);
					Client.method142(var31.method2554(), var31.method2555(), var31.method2553(), var31.method2552(), "");
				}

				if (field1622) {
					field1622 = false;
					Client.method230();
				}

				if (!var10 && var3 > 0 && var11 >= var3) {
					class159.method913("Warning: Script " + var1.field2646 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (field1618.size() > 0) {
				class522 var39 = (class522)field1618.remove(0);
				Client.method142(var39.method2554(), var39.method2555(), var39.method2553(), var39.method2552(), "");
			}

			if (field1622) {
				field1622 = false;
				Client.method230();
			}

			if (!var10 && var3 > 0 && var11 >= var3) {
				class159.method913("Warning: Script " + var1.field2646 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (field1618.size() > 0) {
			class522 var27 = (class522)field1618.remove(0);
			Client.method142(var27.method2554(), var27.method2555(), var27.method2553(), var27.method2552(), "");
		}

		if (field1622) {
			field1622 = false;
			Client.method230();
		}

		if (!var10 && var3 > 0 && var11 >= var3) {
			class159.method913("Warning: Script " + var1.field2646 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfInfo(name = "at", desc = "(ILdh;ZI)I")
	static int method986(int var0, class333 var1, boolean var2) {
		if (var0 < 1000) {
			return method1002(var0, var1, var2);
		} else if (var0 < 1100) {
			return method974(var0, var1, var2);
		} else if (var0 < 1200) {
			return method984(var0, var1, var2);
		} else if (var0 < 1300) {
			return method983(var0, var1, var2);
		} else if (var0 < 1400) {
			return method969(var0, var1, var2);
		} else if (var0 < 1500) {
			return method994(var0, var1, var2);
		} else if (var0 < 1600) {
			return method990(var0, var1, var2);
		} else if (var0 < 1700) {
			return method1004(var0, var1, var2);
		} else if (var0 < 1800) {
			return class380.method2029(var0, var1, var2);
		} else if (var0 < 1900) {
			return method975(var0, var1, var2);
		} else if (var0 < 2000) {
			return method1018(var0, var1, var2);
		} else if (var0 < 2100) {
			return method974(var0, var1, var2);
		} else if (var0 < 2200) {
			return method984(var0, var1, var2);
		} else if (var0 < 2300) {
			return method983(var0, var1, var2);
		} else if (var0 < 2400) {
			return method969(var0, var1, var2);
		} else if (var0 < 2500) {
			return method994(var0, var1, var2);
		} else if (var0 < 2600) {
			return method978(var0, var1, var2);
		} else if (var0 < 2700) {
			return method1012(var0, var1, var2);
		} else if (var0 < 2800) {
			return method1008(var0, var1, var2);
		} else if (var0 < 2900) {
			return method980(var0, var1, var2);
		} else if (var0 < 3000) {
			return method1018(var0, var1, var2);
		} else if (var0 < 3200) {
			return method1015(var0, var1, var2);
		} else if (var0 < 3300) {
			return method1005(var0, var1, var2);
		} else if (var0 < 3400) {
			return class216.method1197(var0, var1, var2, (byte)-1);
		} else if (var0 < 3500) {
			return method1014(var0, var1, var2);
		} else if (var0 < 3600) {
			return method1001(var0, var1, var2);
		} else if (var0 < 3700) {
			return method968(var0, var1, var2);
		} else if (var0 < 3800) {
			return method971(var0, var1, var2);
		} else if (var0 < 3900) {
			return method973(var0, var1, var2);
		} else if (var0 < 4000) {
			return method1009(var0, var1, var2);
		} else if (var0 < 4100) {
			return method1010(var0, var1, var2);
		} else if (var0 < 4200) {
			return method977(var0, var1, var2);
		} else if (var0 < 4300) {
			return method979(var0, var1, var2);
		} else if (var0 < 5100) {
			return method1011(var0, var1, var2);
		} else if (var0 < 5400) {
			return method995(var0, var1, var2);
		} else if (var0 < 5600) {
			return method1016(var0, var1, var2);
		} else if (var0 < 5700) {
			return method966(var0, var1, var2);
		} else if (var0 < 6300) {
			return class278.method1475(var0, var1, var2);
		} else if (var0 < 6600) {
			return method989(var0, var1, var2);
		} else if (var0 < 6700) {
			return method967(var0, var1, var2);
		} else if (var0 < 6800) {
			return method982(var0, var1, var2);
		} else if (var0 < 6900) {
			return method997(var0, var1, var2);
		} else if (var0 < 7000) {
			return method976(var0, var1, var2);
		} else if (var0 < 7100) {
			return method970(var0, var1, var2);
		} else if (var0 < 7200) {
			return method985(var0, var1, var2);
		} else if (var0 < 7300) {
			return method992(var0, var1, var2);
		} else if (var0 < 7500) {
			return class58.method470(var0, var1, var2);
		} else if (var0 < 7600) {
			return method972(var0, var1, var2);
		} else if (var0 < 7700) {
			return method993(var0, var1, var2);
		} else {
			return var0 < 8100 ? method998(var0, var1, var2) : 2;
		}
	}

	@ObfInfo(name = "ac", desc = "(ILdh;ZB)I")
	static int method1002(int var0, class333 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			class293.field2375 -= 3;
			var4 = field1621[class293.field2375];
			var5 = field1621[class293.field2375 + 1];
			int var12 = field1621[2 + class293.field2375];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				class131 var7 = class131.method756(var4);
				if (null == var7.field1346) {
					var7.field1346 = new class131[var12 + 1];
				}

				if (var7.field1346.length <= var12) {
					class131[] var8 = new class131[var12 + 1];

					for (int var9 = 0; var9 < var7.field1346.length; ++var9) {
						var8[var9] = var7.field1346[var9];
					}

					var7.field1346 = var8;
				}

				if (var12 > 0 && var7.field1346[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					class131 var13 = new class131();
					var13.field1216 = var5;
					var13.field1231 = var13.field1214 = var7.field1214;
					var13.field1333 = var12;
					var13.field1294 = true;
					if (var5 == 12) {
						var13.method736();
						var13.method751().method42(new class496(var13));
						var13.method751().method41(new class376(var13));
					}

					var7.field1346[var12] = var13;
					if (var2) {
						class241.field2007 = var13;
					} else {
						class95.field959 = var13;
					}

					Client.method213(var7);
					return 1;
				}
			}
		} else {
			class131 var10;
			if (var0 == 101) {
				var10 = var2 ? class241.field2007 : class95.field959;
				class131 var11 = class131.method756(var10.field1214);
				var11.field1346[var10.field1333] = null;
				Client.method213(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = class131.method756(field1621[--class293.field2375]);
				var10.field1346 = null;
				Client.method213(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = class131.method756(field1621[--class293.field2375]);
					if (null != var10) {
						field1621[++class293.field2375 - 1] = 1;
						if (var2) {
							class241.field2007 = var10;
						} else {
							class95.field959 = var10;
						}
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class293.field2375 -= 2;
				var4 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				class131 var6 = class131.method753(var4, var5);
				if (null != var6 && var5 != -1) {
					field1621[++class293.field2375 - 1] = 1;
					if (var2) {
						class241.field2007 = var6;
					} else {
						class95.field959 = var6;
					}
				} else {
					field1621[++class293.field2375 - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfInfo(name = "ai", desc = "(ILdh;ZS)I")
	static int method974(int var0, class333 var1, boolean var2) {
		int var4 = -1;
		class131 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = field1621[--class293.field2375];
			var5 = class131.method756(var4);
		} else {
			var5 = var2 ? class241.field2007 : class95.field959;
		}

		if (var0 == 1000) {
			class293.field2375 -= 4;
			var5.field1223 = field1621[class293.field2375];
			var5.field1224 = field1621[1 + class293.field2375];
			var5.field1219 = field1621[2 + class293.field2375];
			var5.field1220 = field1621[3 + class293.field2375];
			Client.method213(var5);
			class51.field585.method103(var5);
			if (var4 != -1 && var5.field1216 == 0) {
				Client.method152(class121.field1142[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1001) {
			class293.field2375 -= 4;
			var5.field1225 = field1621[class293.field2375];
			var5.field1226 = field1621[class293.field2375 + 1];
			var5.field1221 = field1621[2 + class293.field2375];
			var5.field1222 = field1621[class293.field2375 + 3];
			Client.method213(var5);
			class51.field585.method103(var5);
			if (var4 != -1 && var5.field1216 == 0) {
				Client.method152(class121.field1142[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var6 = field1621[--class293.field2375] == 1;
			if (var5.field1232 != var6) {
				var5.field1232 = var6;
				Client.method213(var5);
			}

			return 1;
		} else if (var0 == 1005) {
			var5.field1356 = field1621[--class293.field2375] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field1357 = field1621[--class293.field2375] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "az", desc = "(ILdh;ZI)I")
	static int method984(int var0, class333 var1, boolean var2) {
		int var5 = -1;
		class131 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = field1621[--class293.field2375];
			var4 = class131.method756(var5);
		} else {
			var4 = var2 ? class241.field2007 : class95.field959;
		}

		int var14;
		if (var0 == 1100) {
			class293.field2375 -= 2;
			var14 = field1621[class293.field2375];
			int var11 = field1621[1 + class293.field2375];
			if (var4.field1216 == 12) {
				class4 var8 = var4.method751();
				if (null != var8 && var8.method15(var14, var11)) {
					Client.method213(var4);
				}
			} else {
				var4.field1233 = var14;
				if (var4.field1233 > var4.field1301 - var4.field1229) {
					var4.field1233 = var4.field1301 - var4.field1229;
				}

				if (var4.field1233 < 0) {
					var4.field1233 = 0;
				}

				var4.field1247 = var11;
				if (var4.field1247 > var4.field1236 - var4.field1206) {
					var4.field1247 = var4.field1236 - var4.field1206;
				}

				if (var4.field1247 < 0) {
					var4.field1247 = 0;
				}

				Client.method213(var4);
			}

			return 1;
		} else if (var0 == 1101) {
			var4.field1237 = field1621[--class293.field2375];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.field1276 = field1621[--class293.field2375] == 1;
			Client.method213(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.field1235 = field1621[--class293.field2375];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.field1245 = field1621[--class293.field2375];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.field1300 = field1621[--class293.field2375];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.field1250 = field1621[--class293.field2375];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.field1251 = field1621[--class293.field2375] == 1;
			Client.method213(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.field1256 = 1;
			var4.field1257 = field1621[--class293.field2375];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1109) {
			class293.field2375 -= 6;
			var4.field1262 = field1621[class293.field2375];
			var4.field1336 = field1621[class293.field2375 + 1];
			var4.field1264 = field1621[class293.field2375 + 2];
			var4.field1282 = field1621[class293.field2375 + 3];
			var4.field1329 = field1621[4 + class293.field2375];
			var4.field1267 = field1621[class293.field2375 + 5];
			Client.method213(var4);
			return 1;
		} else if (var0 == 1110) {
			var14 = field1621[--class293.field2375];
			if (var14 != var4.field1260) {
				var4.field1260 = var14;
				var4.field1344 = 0;
				var4.field1345 = 0;
				Client.method213(var4);
			}

			return 1;
		} else if (var0 == 1111) {
			var4.field1287 = field1621[--class293.field2375] == 1;
			Client.method213(var4);
			return 1;
		} else if (var0 == 1112) {
			String var15 = field1608[--class89.field892];
			if (!var15.equals(var4.field1274)) {
				var4.field1274 = var15;
				Client.method213(var4);
			}

			return 1;
		} else {
			class4 var9;
			if (var0 == 1113) {
				var4.field1319 = field1621[--class293.field2375];
				if (var4.field1216 == 12) {
					var9 = var4.method751();
					if (var9 != null) {
						var9.method19();
					}
				}

				Client.method213(var4);
				return 1;
			} else if (var0 == 1114) {
				class293.field2375 -= 3;
				if (var4.field1216 == 12) {
					var9 = var4.method751();
					if (null != var9) {
						var9.method72(field1621[class293.field2375], field1621[1 + class293.field2375]);
						var9.method16(field1621[2 + class293.field2375]);
					}
				} else {
					var4.field1277 = field1621[class293.field2375];
					var4.field1335 = field1621[class293.field2375 + 1];
					var4.field1310 = field1621[2 + class293.field2375];
				}

				Client.method213(var4);
				return 1;
			} else if (var0 == 1115) {
				var4.field1204 = field1621[--class293.field2375] == 1;
				Client.method213(var4);
				return 1;
			} else if (var0 == 1116) {
				var4.field1252 = field1621[--class293.field2375];
				Client.method213(var4);
				return 1;
			} else if (var0 == 1117) {
				var4.field1253 = field1621[--class293.field2375];
				Client.method213(var4);
				return 1;
			} else if (var0 == 1118) {
				var4.field1254 = field1621[--class293.field2375] == 1;
				Client.method213(var4);
				return 1;
			} else if (var0 == 1119) {
				var4.field1255 = field1621[--class293.field2375] == 1;
				Client.method213(var4);
				return 1;
			} else if (var0 == 1120) {
				class293.field2375 -= 2;
				var4.field1301 = field1621[class293.field2375];
				var4.field1236 = field1621[1 + class293.field2375];
				Client.method213(var4);
				if (var5 != -1 && var4.field1216 == 0) {
					Client.method152(class121.field1142[var5 >> 16], var4, false);
				}

				return 1;
			} else if (var0 == 1121) {
				Client.method279(var4.field1214, var4.field1333);
				Client.field204 = var4;
				Client.method213(var4);
				return 1;
			} else if (var0 == 1122) {
				var4.field1248 = field1621[--class293.field2375];
				Client.method213(var4);
				return 1;
			} else if (var0 == 1123) {
				var4.field1238 = field1621[--class293.field2375];
				Client.method213(var4);
				return 1;
			} else if (var0 == 1124) {
				var4.field1244 = field1621[--class293.field2375];
				Client.method213(var4);
				return 1;
			} else if (var0 == 1125) {
				var14 = field1621[--class293.field2375];
				class394 var10 = (class394)class216.method1198(class394.method2093(), var14);
				if (null != var10) {
					var4.field1242 = var10;
					Client.method213(var4);
				}

				return 1;
			} else {
				boolean var12;
				if (var0 == 1126) {
					var12 = field1621[--class293.field2375] == 1;
					var4.field1246 = var12;
					return 1;
				} else if (var0 == 1127) {
					var12 = field1621[--class293.field2375] == 1;
					var4.field1272 = var12;
					return 1;
				} else if (var0 == 1129) {
					var4.field1249 = field1608[--class89.field892];
					Client.method213(var4);
					return 1;
				} else if (var0 == 1130) {
					var4.method749(field1608[--class89.field892], class248.field2079, Client.method175());
					return 1;
				} else if (var0 == 1131) {
					class293.field2375 -= 2;
					var4.method745(field1621[class293.field2375], field1621[1 + class293.field2375]);
					return 1;
				} else if (var0 == 1132) {
					var4.method728(field1608[--class89.field892], field1621[--class293.field2375]);
					return 1;
				} else {
					class421 var13;
					if (var0 == 1133) {
						--class293.field2375;
						var13 = var4.method737();
						if (var13 != null) {
							var13.field3230 = field1621[class293.field2375];
							Client.method213(var4);
						}

						return 1;
					} else if (var0 == 1134) {
						--class293.field2375;
						var13 = var4.method737();
						if (var13 != null) {
							var13.field3231 = field1621[class293.field2375];
							Client.method213(var4);
						}

						return 1;
					} else if (var0 == 1135) {
						--class89.field892;
						var9 = var4.method751();
						if (null != var9) {
							var4.field1202 = field1608[class89.field892];
						}

						return 1;
					} else if (var0 == 1136) {
						--class293.field2375;
						var13 = var4.method737();
						if (null != var13) {
							var13.field3232 = field1621[class293.field2375];
							Client.method213(var4);
						}

						return 1;
					} else if (var0 == 1137) {
						--class293.field2375;
						var9 = var4.method751();
						if (var9 != null && var9.method12(field1621[class293.field2375])) {
							Client.method213(var4);
						}

						return 1;
					} else if (var0 == 1138) {
						--class293.field2375;
						var9 = var4.method751();
						if (null != var9 && var9.method13(field1621[class293.field2375])) {
							Client.method213(var4);
						}

						return 1;
					} else if (var0 == 1139) {
						--class293.field2375;
						var9 = var4.method751();
						if (null != var9 && var9.method80(field1621[class293.field2375])) {
							Client.method213(var4);
						}

						return 1;
					} else {
						class4 var7;
						if (var0 == 1140) {
							var12 = field1621[--class293.field2375] == 1;
							Client.field266.method1628();
							var7 = var4.method751();
							if (null != var7 && var7.method7(var12)) {
								if (var12) {
									Client.field266.method1629(var4);
								}

								Client.method213(var4);
							}

							return 1;
						} else if (var0 == 1141) {
							var12 = field1621[--class293.field2375] == 1;
							if (!var12 && Client.field266.method1626() == var4) {
								Client.field266.method1628();
								Client.method213(var4);
							}

							var7 = var4.method751();
							if (var7 != null) {
								var7.method37(var12);
							}

							return 1;
						} else if (var0 == 1142) {
							class293.field2375 -= 2;
							var9 = var4.method751();
							if (var9 != null && var9.method26(field1621[class293.field2375], field1621[class293.field2375 + 1])) {
								Client.method213(var4);
							}

							return 1;
						} else if (var0 == 1143) {
							--class293.field2375;
							var9 = var4.method751();
							if (null != var9 && var9.method26(field1621[class293.field2375], field1621[class293.field2375])) {
								Client.method213(var4);
							}

							return 1;
						} else if (var0 == 1144) {
							--class293.field2375;
							var9 = var4.method751();
							if (var9 != null) {
								var9.method86(field1621[class293.field2375]);
								Client.method213(var4);
							}

							return 1;
						} else if (var0 == 1145) {
							--class293.field2375;
							var9 = var4.method751();
							if (var9 != null) {
								var9.method17(field1621[class293.field2375]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class293.field2375;
							var9 = var4.method751();
							if (null != var9) {
								var9.method67(field1621[class293.field2375]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class293.field2375;
							var9 = var4.method751();
							if (null != var9) {
								var9.method85(field1621[class293.field2375]);
								Client.method213(var4);
							}

							return 1;
						} else {
							class435 var6;
							if (var0 == 1148) {
								class293.field2375 -= 2;
								var6 = var4.method727();
								if (null != var6) {
									var6.method2261(field1621[class293.field2375], field1621[class293.field2375 + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class293.field2375 -= 2;
								var6 = var4.method727();
								if (var6 != null) {
									var6.method2264((char)field1621[class293.field2375], field1621[class293.field2375 + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var4.method747(field1608[--class89.field892], class248.field2079);
								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(name = "ap", desc = "(ILdh;ZI)I")
	static int method983(int var0, class333 var1, boolean var2) {
		class131 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class131.method756(field1621[--class293.field2375]);
		} else {
			var4 = var2 ? class241.field2007 : class95.field959;
		}

		Client.method213(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field1256 = 2;
				var4.field1257 = field1621[--class293.field2375];
				return 1;
			} else if (var0 == 1202) {
				var4.field1256 = 3;
				var4.field1257 = class126.field1164.field3299.method1132();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = field1621[--class293.field2375] == 1;
				class141.method828(var4, class126.field1164.field3299, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = field1621[--class293.field2375];
				if (var4.field1270 == null) {
					throw new RuntimeException("");
				} else {
					class131.method752(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				class293.field2375 -= 2;
				var5 = field1621[class293.field2375];
				var6 = field1621[class293.field2375 + 1];
				if (null == var4.field1270) {
					throw new RuntimeException("");
				} else {
					class131.method755(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = field1621[--class293.field2375];
				if (var4.field1270 == null) {
					throw new RuntimeException("");
				} else {
					class131.method757(var4, class126.field1164.field3299.field1818, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class293.field2375 -= 2;
			var5 = field1621[class293.field2375];
			var6 = field1621[class293.field2375 + 1];
			var4.field1342 = var5;
			var4.field1343 = var6;
			class270 var7 = class270.method1424(var5);
			var4.field1264 = var7.field2162;
			var4.field1282 = var7.field2178;
			var4.field1329 = var7.field2164;
			var4.field1262 = var7.field2163;
			var4.field1336 = var7.field2180;
			var4.field1267 = var7.field2185;
			if (var0 == 1205) {
				var4.field1273 = 0;
			} else if (var0 == 1212 | var7.field2181 == 1) {
				var4.field1273 = 1;
			} else {
				var4.field1273 = 2;
			}

			if (var4.field1268 > 0) {
				var4.field1267 = var4.field1267 * 32 / var4.field1268;
			} else if (var4.field1225 > 0) {
				var4.field1267 = var4.field1267 * 32 / var4.field1225;
			}

			return 1;
		}
	}

	@ObfInfo(name = "aa", desc = "(ILdh;ZI)I")
	static int method969(int var0, class333 var1, boolean var2) {
		boolean var4 = true;
		class131 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class131.method756(field1621[--class293.field2375]);
			var4 = false;
		} else {
			var5 = var2 ? class241.field2007 : class95.field959;
		}

		int var10;
		if (var0 == 1300) {
			var10 = field1621[--class293.field2375] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method724(var10, field1608[--class89.field892]);
				return 1;
			} else {
				--class89.field892;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var11 = field1621[class293.field2375 + 1];
				var5.field1313 = class131.method753(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field1295 = field1621[--class293.field2375] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field1227 = field1621[--class293.field2375];
				return 1;
			} else if (var0 == 1304) {
				var5.field1269 = field1621[--class293.field2375];
				return 1;
			} else if (var0 == 1305) {
				var5.field1218 = field1608[--class89.field892];
				return 1;
			} else if (var0 == 1306) {
				var5.field1296 = field1608[--class89.field892];
				return 1;
			} else if (var0 == 1307) {
				var5.field1292 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field1358 = field1621[--class293.field2375] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class293.field2375;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					byte var9;
					if (var0 == 1351) {
						class293.field2375 -= 2;
						var9 = 10;
						var7 = new byte[]{(byte)field1621[class293.field2375]};
						byte[] var12 = new byte[]{(byte)field1621[1 + class293.field2375]};
						method1017(var5, var9, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						class293.field2375 -= 3;
						var10 = field1621[class293.field2375] - 1;
						var11 = field1621[class293.field2375 + 1];
						var8 = field1621[2 + class293.field2375];
						if (var10 >= 0 && var10 <= 9) {
							method987(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = 10;
						var11 = field1621[--class293.field2375];
						var8 = field1621[--class293.field2375];
						method987(var5, var9, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--class293.field2375;
						var10 = field1621[class293.field2375] - 1;
						if (var10 >= 0 && var10 <= 9) {
							method981(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = 10;
						method981(var5, var9);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						class293.field2375 -= 10;

						for (var8 = 0; var8 < 10 && field1621[class293.field2375 + var8] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte)field1621[class293.field2375 + var8];
								var7[var8 / 2] = (byte)field1621[1 + class293.field2375 + var8];
							}
						}
					} else {
						class293.field2375 -= 2;
						var6 = new byte[]{(byte)field1621[class293.field2375]};
						var7 = new byte[]{(byte)field1621[1 + class293.field2375]};
					}

					var8 = field1621[--class293.field2375] - 1;
					if (var8 >= 0 && var8 <= 9) {
						method1017(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfInfo(name = "af", desc = "(Lmi;I[B[BI)V")
	static final void method1017(class131 var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field1263 == null) {
			if (var2 == null) {
				return;
			}

			var0.field1263 = new byte[11][];
			var0.field1359 = new byte[11][];
			var0.field1289 = new int[11];
			var0.field1290 = new int[11];
		}

		var0.field1263[var1] = var2;
		if (null != var2) {
			var0.field1286 = true;
		} else {
			var0.field1286 = false;

			for (int var5 = 0; var5 < var0.field1263.length; ++var5) {
				if (var0.field1263[var5] != null) {
					var0.field1286 = true;
					break;
				}
			}
		}

		var0.field1359[var1] = var3;
	}

	@ObfInfo(name = "ad", desc = "(Lmi;IIIB)V")
	static final void method987(class131 var0, int var1, int var2, int var3) {
		if (null == var0.field1289) {
			throw new RuntimeException();
		} else {
			var0.field1289[var1] = var2;
			var0.field1290[var1] = var3;
		}
	}

	@ObfInfo(name = "aq", desc = "(Lmi;II)V")
	static final void method981(class131 var0, int var1) {
		if (null == var0.field1263) {
			throw new RuntimeException();
		} else {
			if (null == var0.field1355) {
				var0.field1355 = new int[var0.field1263.length];
			}

			var0.field1355[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfInfo(name = "al", desc = "(ILdh;ZI)I")
	static int method994(int var0, class333 var1, boolean var2) {
		class131 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class131.method756(field1621[--class293.field2375]);
		} else {
			var4 = var2 ? class241.field2007 : class95.field959;
		}

		String var5 = field1608[--class89.field892];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = field1621[--class293.field2375];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = field1621[--class293.field2375]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = field1608[--class89.field892];
			} else {
				var10[var8] = new Integer(field1621[--class293.field2375]);
			}
		}

		var8 = field1621[--class293.field2375];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == 1400) {
			var4.field1266 = var10;
		} else if (var0 == 1401) {
			var4.field1302 = var10;
		} else if (var0 == 1402) {
			var4.field1299 = var10;
		} else if (var0 == 1403) {
			var4.field1303 = var10;
		} else if (var0 == 1404) {
			var4.field1275 = var10;
		} else if (var0 == 1405) {
			var4.field1306 = var10;
		} else if (var0 == 1406) {
			var4.field1309 = var10;
		} else if (var0 == 1407) {
			var4.field1281 = var10;
			var4.field1311 = var6;
		} else if (var0 == 1408) {
			var4.field1207 = var10;
		} else if (var0 == 1409) {
			var4.field1317 = var10;
		} else if (var0 == 1410) {
			var4.field1307 = var10;
		} else if (var0 == 1411) {
			var4.field1212 = var10;
		} else if (var0 == 1412) {
			var4.field1304 = var10;
		} else if (var0 == 1414) {
			var4.field1312 = var10;
			var4.field1243 = var6;
		} else if (var0 == 1415) {
			var4.field1314 = var10;
			var4.field1315 = var6;
		} else if (var0 == 1416) {
			var4.field1308 = var10;
		} else if (var0 == 1417) {
			var4.field1239 = var10;
		} else if (var0 == 1418) {
			var4.field1205 = var10;
		} else if (var0 == 1419) {
			var4.field1321 = var10;
		} else if (var0 == 1420) {
			var4.field1271 = var10;
		} else if (var0 == 1421) {
			var4.field1325 = var10;
		} else if (var0 == 1422) {
			var4.field1328 = var10;
		} else if (var0 == 1423) {
			var4.field1261 = var10;
		} else if (var0 == 1424) {
			var4.field1293 = var10;
		} else if (var0 == 1425) {
			var4.field1332 = var10;
		} else if (var0 == 1426) {
			var4.field1347 = var10;
		} else if (var0 == 1427) {
			var4.field1208 = var10;
		} else if (var0 == 1428) {
			var4.field1326 = var10;
		} else if (var0 == 1429) {
			var4.field1327 = var10;
		} else if (var0 == 1430) {
			var4.field1331 = var10;
		} else if (var0 == 1431) {
			var4.field1288 = var10;
		} else if (var0 == 1434) {
			var4.field1279 = var10;
		} else if (var0 == 1435) {
			var4.field1318 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class431 var9 = var4.method738();
			if (var9 != null) {
				if (var0 == 1436) {
					var9.field3269 = var10;
				} else if (var0 == 1437) {
					var9.field3270 = var10;
				} else if (var0 == 1438) {
					var9.field3265 = var10;
				} else if (var0 == 1439) {
					var9.field3267 = var10;
				}
			}
		}

		var4.field1297 = true;
		return 1;
	}

	@ObfInfo(name = "an", desc = "(ILdh;ZI)I")
	static int method990(int var0, class333 var1, boolean var2) {
		class131 var4 = var2 ? class241.field2007 : class95.field959;
		if (var0 == 1500) {
			field1621[++class293.field2375 - 1] = var4.field1215;
			return 1;
		} else if (var0 == 1501) {
			field1621[++class293.field2375 - 1] = var4.field1228;
			return 1;
		} else if (var0 == 1502) {
			field1621[++class293.field2375 - 1] = var4.field1229;
			return 1;
		} else if (var0 == 1503) {
			field1621[++class293.field2375 - 1] = var4.field1206;
			return 1;
		} else if (var0 == 1504) {
			field1621[++class293.field2375 - 1] = var4.field1232 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			field1621[++class293.field2375 - 1] = var4.field1231;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "ar", desc = "(ILdh;ZI)I")
	static int method1004(int var0, class333 var1, boolean var2) {
		class131 var4 = var2 ? class241.field2007 : class95.field959;
		if (var0 == 1600) {
			field1621[++class293.field2375 - 1] = var4.field1233;
			return 1;
		} else if (var0 == 1601) {
			field1621[++class293.field2375 - 1] = var4.field1247;
			return 1;
		} else {
			class4 var8;
			if (var0 == 1602) {
				if (var4.field1216 == 12) {
					var8 = var4.method751();
					if (null != var8) {
						field1608[++class89.field892 - 1] = var8.method69().method1831();
						return 1;
					}
				}

				field1608[++class89.field892 - 1] = var4.field1274;
				return 1;
			} else if (var0 == 1603) {
				field1621[++class293.field2375 - 1] = var4.field1301;
				return 1;
			} else if (var0 == 1604) {
				field1621[++class293.field2375 - 1] = var4.field1236;
				return 1;
			} else if (var0 == 1605) {
				field1621[++class293.field2375 - 1] = var4.field1267;
				return 1;
			} else if (var0 == 1606) {
				field1621[++class293.field2375 - 1] = var4.field1264;
				return 1;
			} else if (var0 == 1607) {
				field1621[++class293.field2375 - 1] = var4.field1329;
				return 1;
			} else if (var0 == 1608) {
				field1621[++class293.field2375 - 1] = var4.field1282;
				return 1;
			} else if (var0 == 1609) {
				field1621[++class293.field2375 - 1] = var4.field1235;
				return 1;
			} else if (var0 == 1610) {
				field1621[++class293.field2375 - 1] = var4.field1244;
				return 1;
			} else if (var0 == 1611) {
				field1621[++class293.field2375 - 1] = var4.field1237;
				return 1;
			} else if (var0 == 1612) {
				field1621[++class293.field2375 - 1] = var4.field1238;
				return 1;
			} else if (var0 == 1613) {
				field1621[++class293.field2375 - 1] = var4.field1242.method2222();
				return 1;
			} else if (var0 == 1614) {
				field1621[++class293.field2375 - 1] = var4.field1272 ? 1 : 0;
				return 1;
			} else {
				class421 var5;
				if (var0 == 1617) {
					var5 = var4.method737();
					field1621[++class293.field2375 - 1] = null != var5 ? var5.field3230 : 0;
				}

				if (var0 == 1618) {
					var5 = var4.method737();
					field1621[++class293.field2375 - 1] = var5 != null ? var5.field3231 : 0;
					return 1;
				} else if (var0 == 1619) {
					var8 = var4.method751();
					field1608[++class89.field892 - 1] = var8 != null ? var8.method43().method1831() : "";
					return 1;
				} else if (var0 == 1620) {
					var5 = var4.method737();
					field1621[++class293.field2375 - 1] = null != var5 ? var5.field3232 : 0;
					return 1;
				} else if (var0 == 1621) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = null != var8 ? var8.method81() : 0;
					return 1;
				} else if (var0 == 1622) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = var8 != null ? var8.method77() : 0;
					return 1;
				} else if (var0 == 1623) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = var8 != null ? var8.method83() : 0;
					return 1;
				} else if (var0 == 1624) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = var8 != null && var8.method45() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var8 = var4.method751();
						field1608[++class89.field892 - 1] = var8 != null ? var8.method18().method2429() : "";
						return 1;
					} else if (var0 == 1627) {
						var8 = var4.method751();
						int var6 = var8 != null ? var8.method48() : 0;
						int var7 = null != var8 ? var8.method47() : 0;
						field1621[++class293.field2375 - 1] = Math.min(var6, var7);
						field1621[++class293.field2375 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 1628) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method47() : 0;
						return 1;
					} else if (var0 == 1629) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method20() : 0;
						return 1;
					} else if (var0 == 1630) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = null != var8 ? var8.method52() : 0;
						return 1;
					} else if (var0 == 1631) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method71() : 0;
						return 1;
					} else if (var0 == 1632) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method14() : 0;
						return 1;
					} else {
						class435 var9;
						if (var0 == 1633) {
							var9 = var4.method727();
							field1621[class293.field2375 - 1] = var9 != null ? var9.method2258(field1621[class293.field2375 - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var9 = var4.method727();
							field1621[class293.field2375 - 1] = null != var9 ? var9.method2262((char)field1621[class293.field2375 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = null != var8 && var8.method46() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(Lmi;I)I")
	static int method1003(class131 var0) {
		if (var0.field1216 != 11) {
			--class89.field892;
			field1621[++class293.field2375 - 1] = -1;
			return 1;
		} else {
			String var2 = field1608[--class89.field892];
			field1621[++class293.field2375 - 1] = var0.method730(var2);
			return 1;
		}
	}

	@ObfInfo(name = "am", desc = "(Lmi;I)I")
	static int method1013(class131 var0) {
		if (var0.field1216 != 11) {
			field1608[class89.field892 - 1] = "";
			return 1;
		} else {
			String var2 = field1608[--class89.field892];
			field1608[++class89.field892 - 1] = var0.method731(var2);
			return 1;
		}
	}

	@ObfInfo(name = "ax", desc = "(ILdh;ZB)I")
	static int method975(int var0, class333 var1, boolean var2) {
		class131 var4 = var2 ? class241.field2007 : class95.field959;
		if (var0 == 1800) {
			field1621[++class293.field2375 - 1] = class200.method1122(Client.method209(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var4.field1218 == null) {
					field1608[++class89.field892 - 1] = "";
				} else {
					field1608[++class89.field892 - 1] = var4.field1218;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field1621[--class293.field2375];
			--var5;
			if (null != var4.field1292 && var5 < var4.field1292.length && null != var4.field1292[var5]) {
				field1608[++class89.field892 - 1] = var4.field1292[var5];
			} else {
				field1608[++class89.field892 - 1] = "";
			}

			return 1;
		}
	}

	@ObfInfo(name = "ah", desc = "(ILdh;ZI)I")
	static int method1018(int var0, class333 var1, boolean var2) {
		class131 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? class241.field2007 : class95.field959;
				var9 = field1621[--class293.field2375];
				if (var9 >= 1 && var9 <= 10) {
					class522 var10 = new class522(var9, var4.field1214, var4.field1333, var4.field1342);
					field1618.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				class293.field2375 -= 3;
				int var8 = field1621[class293.field2375];
				var9 = field1621[class293.field2375 + 1];
				int var6 = field1621[2 + class293.field2375];
				if (var6 >= 1 && var6 <= 10) {
					class522 var7 = new class522(var6, var8, var9, class131.method756(var8).field1342);
					field1618.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (field1619 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = class131.method756(field1621[--class293.field2375]);
			} else {
				var4 = var2 ? class241.field2007 : class95.field959;
			}

			if (null == var4.field1208) {
				return 0;
			} else {
				class20 var5 = new class20();
				var5.field377 = var4;
				var5.field380 = var4.field1208;
				var5.field387 = 1 + field1619;
				Client.field242.method631(var5);
				return 1;
			}
		}
	}

	@ObfInfo(name = "as", desc = "(ILdh;ZB)I")
	static int method978(int var0, class333 var1, boolean var2) {
		class131 var4 = class131.method756(field1621[--class293.field2375]);
		if (var0 == 2500) {
			field1621[++class293.field2375 - 1] = var4.field1215;
			return 1;
		} else if (var0 == 2501) {
			field1621[++class293.field2375 - 1] = var4.field1228;
			return 1;
		} else if (var0 == 2502) {
			field1621[++class293.field2375 - 1] = var4.field1229;
			return 1;
		} else if (var0 == 2503) {
			field1621[++class293.field2375 - 1] = var4.field1206;
			return 1;
		} else if (var0 == 2504) {
			field1621[++class293.field2375 - 1] = var4.field1232 ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			field1621[++class293.field2375 - 1] = var4.field1231;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "ay", desc = "(ILdh;ZI)I")
	static int method1012(int var0, class333 var1, boolean var2) {
		class131 var4 = class131.method756(field1621[--class293.field2375]);
		if (var0 == 2600) {
			field1621[++class293.field2375 - 1] = var4.field1233;
			return 1;
		} else if (var0 == 2601) {
			field1621[++class293.field2375 - 1] = var4.field1247;
			return 1;
		} else if (var0 == 2602) {
			field1608[++class89.field892 - 1] = var4.field1274;
			return 1;
		} else if (var0 == 2603) {
			field1621[++class293.field2375 - 1] = var4.field1301;
			return 1;
		} else if (var0 == 2604) {
			field1621[++class293.field2375 - 1] = var4.field1236;
			return 1;
		} else if (var0 == 2605) {
			field1621[++class293.field2375 - 1] = var4.field1267;
			return 1;
		} else if (var0 == 2606) {
			field1621[++class293.field2375 - 1] = var4.field1264;
			return 1;
		} else if (var0 == 2607) {
			field1621[++class293.field2375 - 1] = var4.field1329;
			return 1;
		} else if (var0 == 2608) {
			field1621[++class293.field2375 - 1] = var4.field1282;
			return 1;
		} else if (var0 == 2609) {
			field1621[++class293.field2375 - 1] = var4.field1235;
			return 1;
		} else if (var0 == 2610) {
			field1621[++class293.field2375 - 1] = var4.field1244;
			return 1;
		} else if (var0 == 2611) {
			field1621[++class293.field2375 - 1] = var4.field1237;
			return 1;
		} else if (var0 == 2612) {
			field1621[++class293.field2375 - 1] = var4.field1238;
			return 1;
		} else if (var0 == 2613) {
			field1621[++class293.field2375 - 1] = var4.field1242.method2222();
			return 1;
		} else if (var0 == 2614) {
			field1621[++class293.field2375 - 1] = var4.field1272 ? 1 : 0;
			return 1;
		} else {
			class421 var5;
			if (var0 == 2617) {
				var5 = var4.method737();
				field1621[++class293.field2375 - 1] = var5 != null ? var5.field3230 : 0;
			}

			if (var0 == 2618) {
				var5 = var4.method737();
				field1621[++class293.field2375 - 1] = null != var5 ? var5.field3231 : 0;
				return 1;
			} else {
				class4 var8;
				if (var0 == 2619) {
					var8 = var4.method751();
					field1608[++class89.field892 - 1] = var8 != null ? var8.method43().method1831() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method737();
					field1621[++class293.field2375 - 1] = var5 != null ? var5.field3232 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = var8 != null ? var8.method81() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = null != var8 ? var8.method77() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = null != var8 ? var8.method83() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = null != var8 && var8.method45() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method751();
						field1608[++class89.field892 - 1] = null != var8 ? var8.method18().method2429() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method751();
						int var6 = null != var8 ? var8.method48() : 0;
						int var7 = null != var8 ? var8.method47() : 0;
						field1621[++class293.field2375 - 1] = Math.min(var6, var7);
						field1621[++class293.field2375 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method47() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method20() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = null != var8 ? var8.method52() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method71() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method751();
						field1621[++class293.field2375 - 1] = var8 != null ? var8.method14() : 0;
						return 1;
					} else {
						class435 var9;
						if (var0 == 2633) {
							var9 = var4.method727();
							field1621[class293.field2375 - 1] = null != var9 ? var9.method2258(field1621[class293.field2375 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method727();
							field1621[class293.field2375 - 1] = null != var9 ? var9.method2262((char)field1621[class293.field2375 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method751();
					field1621[++class293.field2375 - 1] = var8 != null && var8.method46() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(ILdh;ZI)I")
	static int method1008(int var0, class333 var1, boolean var2) {
		class131 var4;
		if (var0 == 2700) {
			var4 = class131.method756(field1621[--class293.field2375]);
			field1621[++class293.field2375 - 1] = var4.field1342;
			return 1;
		} else if (var0 == 2701) {
			var4 = class131.method756(field1621[--class293.field2375]);
			if (var4.field1342 != -1) {
				field1621[++class293.field2375 - 1] = var4.field1343;
			} else {
				field1621[++class293.field2375 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var6 = field1621[--class293.field2375];
			class58 var5 = (class58)Client.field48.method2129((long)var6);
			if (var5 != null) {
				field1621[++class293.field2375 - 1] = 1;
			} else {
				field1621[++class293.field2375 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2706) {
			field1621[++class293.field2375 - 1] = Client.field199;
			return 1;
		} else if (var0 == 2707) {
			var4 = class131.method756(field1621[--class293.field2375]);
			field1621[++class293.field2375 - 1] = var4.method748() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = class131.method756(field1621[--class293.field2375]);
			return method1003(var4);
		} else if (var0 == 2709) {
			var4 = class131.method756(field1621[--class293.field2375]);
			return method1013(var4);
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "av", desc = "(ILdh;ZI)I")
	static int method980(int var0, class333 var1, boolean var2) {
		class131 var4 = class131.method756(field1621[--class293.field2375]);
		if (var0 == 2800) {
			field1621[++class293.field2375 - 1] = class200.method1122(Client.method209(var4));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
				if (null == var4.field1218) {
					field1608[++class89.field892 - 1] = "";
				} else {
					field1608[++class89.field892 - 1] = var4.field1218;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field1621[--class293.field2375];
			--var5;
			if (var4.field1292 != null && var5 < var4.field1292.length && null != var4.field1292[var5]) {
				field1608[++class89.field892 - 1] = var4.field1292[var5];
			} else {
				field1608[++class89.field892 - 1] = "";
			}

			return 1;
		}
	}

	@ObfInfo(name = "aw", desc = "(ILdh;ZI)I")
	static int method1015(int var0, class333 var1, boolean var2) {
		String var12;
		if (var0 == 3100) {
			var12 = field1608[--class89.field892];
			class159.method914(0, "", var12);
			return 1;
		} else if (var0 == 3101) {
			class293.field2375 -= 2;
			Client.method282(class126.field1164, field1621[class293.field2375], field1621[class293.field2375 + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!field1616) {
				field1622 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var12 = field1608[--class89.field892];
				var11 = 0;
				if (class455.method2378(var12)) {
					var11 = class455.method2372(var12);
				}

				class121 var15 = class121.method689(class480.field3921, Client.field92.field2665);
				var15.field1141.method1547(var11);
				Client.field92.method1821(var15);
				return 1;
			} else {
				class121 var9;
				if (var0 == 3105) {
					var12 = field1608[--class89.field892];
					var9 = class121.method689(class480.field3829, Client.field92.field2665);
					var9.field1141.method1481(var12.length() + 1);
					var9.field1141.method1484(var12);
					Client.field92.method1821(var9);
					return 1;
				} else if (var0 == 3106) {
					var12 = field1608[--class89.field892];
					var9 = class121.method689(class480.field3925, Client.field92.field2665);
					var9.field1141.method1481(var12.length() + 1);
					var9.field1141.method1484(var12);
					Client.field92.method1821(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = field1621[--class293.field2375];
						var5 = field1608[--class89.field892];
						class129.method706(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						class293.field2375 -= 3;
						var4 = field1621[class293.field2375];
						var11 = field1621[1 + class293.field2375];
						int var14 = field1621[2 + class293.field2375];
						class131 var16 = class131.method756(var14);
						Client.method216(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						class293.field2375 -= 2;
						var4 = field1621[class293.field2375];
						var11 = field1621[1 + class293.field2375];
						class131 var13 = var2 ? class241.field2007 : class95.field959;
						Client.method216(var13, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						class146.field1455 = field1621[--class293.field2375] == 1;
						return 1;
					} else if (var0 == 3111) {
						field1621[++class293.field2375 - 1] = class281.field2262.method1745() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						class281.field2262.method1744(field1621[--class293.field2375] == 1);
						return 1;
					} else if (var0 == 3113) {
						var12 = field1608[--class89.field892];
						boolean var10 = field1621[--class293.field2375] == 1;
						class341.method1876(var12, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = field1621[--class293.field2375];
						var9 = class121.method689(class480.field3918, Client.field92.field2665);
						var9.field1141.method1522(var4);
						Client.field92.method1821(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = field1621[--class293.field2375];
						class89.field892 -= 2;
						var5 = field1608[class89.field892];
						String var6 = field1608[class89.field892 + 1];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class121 var7 = class121.method689(class480.field3849, Client.field92.field2665);
							var7.field1141.method1522(1 + class280.method1555(var5) + class280.method1555(var6));
							var7.field1141.method1484(var6);
							var7.field1141.method1481(var4);
							var7.field1141.method1484(var5);
							Client.field92.method1821(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--class293.field2375;
						return 1;
					} else if (var0 == 3118) {
						Client.field187 = field1621[--class293.field2375] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field265 = field1621[--class293.field2375] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (field1621[--class293.field2375] == 1) {
							Client.field30 |= 1;
						} else {
							Client.field30 &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (field1621[--class293.field2375] == 1) {
							Client.field30 |= 2;
						} else {
							Client.field30 &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (field1621[--class293.field2375] == 1) {
							Client.field30 |= 4;
						} else {
							Client.field30 &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (field1621[--class293.field2375] == 1) {
							Client.field30 |= 8;
						} else {
							Client.field30 &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.field30 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field316 = field1621[--class293.field2375] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field153 = field1621[--class293.field2375] == 1;
						return 1;
					} else if (var0 == 3127) {
						Client.method127(field1621[--class293.field2375] == 1);
						return 1;
					} else if (var0 == 3128) {
						field1621[++class293.field2375 - 1] = Client.method141() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class293.field2375 -= 2;
						Client.field125 = field1621[class293.field2375];
						Client.field126 = field1621[class293.field2375 + 1];
						return 1;
					} else if (var0 == 3130) {
						class293.field2375 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class293.field2375;
						return 1;
					} else if (var0 == 3132) {
						field1621[++class293.field2375 - 1] = class537.field4270;
						field1621[++class293.field2375 - 1] = class396.field3101;
						return 1;
					} else if (var0 == 3133) {
						--class293.field2375;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						class293.field2375 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field41 = 3;
						Client.field202 = field1621[--class293.field2375];
						return 1;
					} else if (var0 == 3137) {
						Client.field41 = 2;
						Client.field202 = field1621[--class293.field2375];
						return 1;
					} else if (var0 == 3138) {
						Client.field41 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field41 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field41 = 3;
						Client.field202 = var2 ? class241.field2007.field1214 : class95.field959.field1214;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = field1621[--class293.field2375] == 1;
							class281.field2262.method1766(var8);
							return 1;
						} else if (var0 == 3142) {
							field1621[++class293.field2375 - 1] = class281.field2262.method1749() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = field1621[--class293.field2375] == 1;
							Client.field81 = var8;
							if (!var8) {
								class281.field2262.method1756("");
							}

							return 1;
						} else if (var0 == 3144) {
							field1621[++class293.field2375 - 1] = Client.field81 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = field1621[--class293.field2375] == 1;
							class281.field2262.method1764(!var8);
							return 1;
						} else if (var0 == 3147) {
							field1621[++class293.field2375 - 1] = class281.field2262.method1765() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							field1621[++class293.field2375 - 1] = class162.field1527;
							return 1;
						} else if (var0 == 3154) {
							field1621[++class293.field2375 - 1] = Client.method148();
							return 1;
						} else if (var0 == 3155) {
							--class89.field892;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class293.field2375 -= 2;
							return 1;
						} else if (var0 == 3158) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class293.field2375;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class293.field2375;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class89.field892;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class293.field2375;
							field1608[++class89.field892 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class293.field2375;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class293.field2375 -= 2;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class293.field2375 -= 2;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class293.field2375 -= 2;
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class293.field2375;
							return 1;
						} else if (var0 == 3173) {
							--class293.field2375;
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class293.field2375;
							return 1;
						} else if (var0 == 3175) {
							field1621[++class293.field2375 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class89.field892;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class89.field892;
							return 1;
						} else if (var0 == 3181) {
							Client.method129(field1621[--class293.field2375]);
							return 1;
						} else if (var0 == 3182) {
							field1621[++class293.field2375 - 1] = Client.method254();
							return 1;
						} else if (var0 == 3189) {
							var4 = field1621[--class293.field2375];
							Client.method283(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(ILdh;ZB)I")
	static int method1005(int var0, class333 var1, boolean var2) {
		if (var0 == 3200) {
			class293.field2375 -= 3;
			Client.method135(field1621[class293.field2375], field1621[1 + class293.field2375], field1621[2 + class293.field2375]);
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			int var13;
			int var16;
			if (var0 == 3201) {
				class293.field2375 -= 5;
				var13 = field1621[class293.field2375];
				var16 = field1621[class293.field2375 + 1];
				var6 = field1621[2 + class293.field2375];
				var7 = field1621[class293.field2375 + 3];
				var8 = field1621[4 + class293.field2375];
				ArrayList var15 = new ArrayList();
				var15.add(var13);
				class249.method1341(var15, var16, var6, var7, var8);
				return 1;
			} else if (var0 == 3202) {
				class293.field2375 -= 2;
				Client.method151(field1621[class293.field2375], field1621[1 + class293.field2375]);
				return 1;
			} else {
				class534 var4;
				class73 var5;
				String var12;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var11;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var13 = field1621[--class293.field2375];
							var16 = 0;
							class534 var20 = (class534)class216.method1198(class534.method2584(), var13);
							if (var20 != null) {
								var16 = var20 != class534.field4260 ? 1 : 0;
							}

							field1621[++class293.field2375 - 1] = var16;
							return 1;
						} else if (var0 == 3218) {
							var13 = field1621[--class293.field2375];
							var16 = 0;
							class73 var19 = (class73)class216.method1198(class73.method511(), var13);
							if (var19 != null) {
								var16 = class73.field794 != var19 ? 1 : 0;
							}

							field1621[++class293.field2375 - 1] = var16;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class293.field2375 -= 2;
								var13 = field1621[class293.field2375];
								var16 = field1621[class293.field2375 + 1];
								class333.method1815(var13, var16);
								return 1;
							} else if (var0 == 3221) {
								class293.field2375 -= 6;
								var13 = field1621[class293.field2375];
								var16 = field1621[1 + class293.field2375];
								var6 = field1621[class293.field2375 + 2];
								var7 = field1621[3 + class293.field2375];
								var8 = field1621[class293.field2375 + 4];
								int var9 = field1621[class293.field2375 + 5];
								ArrayList var10 = new ArrayList();
								var10.add(var13);
								var10.add(var16);
								class249.method1341(var10, var6, var7, var8, var9);
								return 1;
							} else if (var0 == 3222) {
								class293.field2375 -= 4;
								var13 = field1621[class293.field2375];
								var16 = field1621[class293.field2375 + 1];
								var6 = field1621[class293.field2375 + 2];
								var7 = field1621[class293.field2375 + 3];
								class303.method1678(var13, var16, var6, var7);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = class534.field4260;
							var5 = class73.field794;
							var11 = true;
							boolean var18 = true;
							if (var0 == 3217) {
								var8 = field1621[--class293.field2375];
								var4 = (class534)class216.method1198(class534.method2584(), var8);
								if (var4 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}

							if (var0 == 3219) {
								var8 = field1621[--class293.field2375];
								var5 = (class73)class216.method1198(class73.method511(), var8);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}

							String var14;
							byte var17;
							if (class73.field794 == var5) {
								switch(var4.field4257) {
								case 1:
								case 2:
								case 3:
									var17 = 0;
									var7 = 1;
									break;
								case 4:
									var17 = 0;
									var7 = Integer.MAX_VALUE;
									break;
								case 5:
									var17 = 0;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown device option: %s.", var4.toString());
									throw new RuntimeException(var14);
								}
							} else {
								switch(var5.field793) {
								case 1:
									var17 = 0;
									var7 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var17 = 0;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown game option: %s.", var5.toString());
									throw new RuntimeException(var14);
								}
							}

							field1621[++class293.field2375 - 1] = var17;
							field1621[++class293.field2375 - 1] = var7;
							return 1;
						}
					} else {
						var4 = class534.field4260;
						var5 = class73.field794;
						var11 = false;
						if (var0 == 3214) {
							var7 = field1621[--class293.field2375];
							var4 = (class534)class216.method1198(class534.method2584(), var7);
							if (null == var4) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var7));
							}
						}

						if (var0 == 3215) {
							var7 = field1621[--class293.field2375];
							var5 = (class73)class216.method1198(class73.method511(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var7));
							}
						}

						if (var0 == 3210) {
							var7 = field1621[--class293.field2375];
							var4 = (class534)class216.method1198(class534.method2584(), var7);
							if (var4 == null) {
								var5 = (class73)class216.method1198(class73.method511(), var7);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var7));
								}
							}
						} else if (var0 == 3182) {
							var4 = class534.field4256;
						} else if (var0 == 3204) {
							var5 = class73.field789;
						} else if (var0 == 3206) {
							var5 = class73.field791;
						} else if (var0 == 3208) {
							var5 = class73.field795;
						}

						if (class73.field794 == var5) {
							switch(var4.field4257) {
							case 1:
								var6 = class281.field2262.method1749() ? 1 : 0;
								break;
							case 2:
								var6 = class281.field2262.method1765() ? 1 : 0;
								break;
							case 3:
								var6 = class281.field2262.method1755() ? 1 : 0;
								break;
							case 4:
								var6 = class281.field2262.method1751();
								break;
							case 5:
								var6 = Client.method254();
								break;
							default:
								var12 = String.format("Unkown device option: %s.", var4.toString());
								throw new RuntimeException(var12);
							}
						} else {
							switch(var5.field793) {
							case 1:
								var6 = class281.field2262.method1745() ? 1 : 0;
								break;
							case 2:
								var7 = class281.field2262.method1746();
								var6 = Math.round((float)(var7 * 100) / 255.0F);
								break;
							case 3:
								var7 = class281.field2262.method1754();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							case 4:
								var7 = class281.field2262.method1772();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							default:
								var12 = String.format("Unkown game option: %s.", var5.toString());
								throw new RuntimeException(var12);
							}
						}

						field1621[++class293.field2375 - 1] = var6;
						return 1;
					}
				} else {
					var4 = class534.field4260;
					var5 = class73.field794;
					var6 = field1621[--class293.field2375];
					if (var0 == 3212) {
						var7 = field1621[--class293.field2375];
						var4 = (class534)class216.method1198(class534.method2584(), var7);
						if (null == var4) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == 3213) {
						var7 = field1621[--class293.field2375];
						var5 = (class73)class216.method1198(class73.method511(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == 3209) {
						var7 = field1621[--class293.field2375];
						var4 = (class534)class216.method1198(class534.method2584(), var7);
						if (var4 == null) {
							var5 = (class73)class216.method1198(class73.method511(), var7);
							if (null == var5) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3181) {
						var4 = class534.field4256;
					} else if (var0 == 3203) {
						var5 = class73.field789;
					} else if (var0 == 3205) {
						var5 = class73.field791;
					} else if (var0 == 3207) {
						var5 = class73.field795;
					}

					if (class73.field794 == var5) {
						switch(var4.field4257) {
						case 1:
							class281.field2262.method1766(var6 == 1);
							break;
						case 2:
							class281.field2262.method1764(var6 == 1);
							break;
						case 3:
							class281.field2262.method1747(var6 == 1);
							break;
						case 4:
							if (var6 < 0) {
								var6 = 0;
							}

							class281.field2262.method1750(var6);
							break;
						case 5:
							Client.method129(var6);
							break;
						default:
							var12 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var12);
						}
					} else {
						switch(var5.field793) {
						case 1:
							class281.field2262.method1744(var6 == 1);
							break;
						case 2:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 255) / 100.0F);
							Client.method234(var7);
							break;
						case 3:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method264(var7);
							break;
						case 4:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							Client.method128(var7);
							break;
						default:
							var12 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var12);
						}
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "bj", desc = "(ILdh;ZI)I")
	static int method1014(int var0, class333 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			class293.field2375 -= 2;
			var4 = field1621[class293.field2375];
			var5 = field1621[1 + class293.field2375];
			class134 var11 = class134.method771(var4);
			if (var11.field1373 != 's') {
			}

			for (var7 = 0; var7 < var11.field1376; ++var7) {
				if (var11.field1370[var7] == var5) {
					field1608[++class89.field892 - 1] = var11.field1377[var7];
					var11 = null;
					break;
				}
			}

			if (null != var11) {
				field1608[++class89.field892 - 1] = var11.field1374;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = field1621[--class293.field2375];
				class134 var10 = class134.method771(var4);
				field1621[++class293.field2375 - 1] = var10.method768();
				return 1;
			} else {
				return 2;
			}
		} else {
			class293.field2375 -= 4;
			var4 = field1621[class293.field2375];
			var5 = field1621[class293.field2375 + 1];
			int var6 = field1621[class293.field2375 + 2];
			var7 = field1621[class293.field2375 + 3];
			class134 var8 = class134.method771(var6);
			if (var8.field1372 == var4 && var8.field1373 == var5) {
				for (int var9 = 0; var9 < var8.field1376; ++var9) {
					if (var8.field1370[var9] == var7) {
						if (var5 == 115) {
							field1608[++class89.field892 - 1] = var8.field1377[var9];
						} else {
							field1621[++class293.field2375 - 1] = var8.field1379[var9];
						}

						var8 = null;
						break;
					}
				}

				if (null != var8) {
					if (var5 == 115) {
						field1608[++class89.field892 - 1] = var8.field1374;
					} else {
						field1621[++class293.field2375 - 1] = var8.field1371;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					field1608[++class89.field892 - 1] = class453.field3707;
				} else {
					field1621[++class293.field2375 - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfInfo(name = "bk", desc = "(ILdh;ZB)I")
	static int method1001(int var0, class333 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field175.method1783(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field175.method1780(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field175.method1778(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "bv", desc = "(ILdh;ZB)I")
	static int method968(int var0, class333 var1, boolean var2) {
		if (var0 == 3600) {
			if (class331.field2633.field349 == 0) {
				field1621[++class293.field2375 - 1] = -2;
			} else if (class331.field2633.field349 == 1) {
				field1621[++class293.field2375 - 1] = -1;
			} else {
				field1621[++class293.field2375 - 1] = class331.field2633.field351.method905();
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = field1621[--class293.field2375];
				if (class331.field2633.method307() && var4 >= 0 && var4 < class331.field2633.field351.method905()) {
					class317 var9 = (class317)class331.field2633.field351.method892(var4);
					field1608[++class89.field892 - 1] = var9.method1020();
					field1608[++class89.field892 - 1] = var9.method1021();
				} else {
					field1608[++class89.field892 - 1] = "";
					field1608[++class89.field892 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var4 = field1621[--class293.field2375];
				if (class331.field2633.method307() && var4 >= 0 && var4 < class331.field2633.field351.method905()) {
					field1621[++class293.field2375 - 1] = ((class424)class331.field2633.field351.method892(var4)).field3235;
				} else {
					field1621[++class293.field2375 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var4 = field1621[--class293.field2375];
				if (class331.field2633.method307() && var4 >= 0 && var4 < class331.field2633.field351.method905()) {
					field1621[++class293.field2375 - 1] = ((class424)class331.field2633.field351.method892(var4)).field3236;
				} else {
					field1621[++class293.field2375 - 1] = 0;
				}

				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = field1608[--class89.field892];
					int var8 = field1621[--class293.field2375];
					class14.method324(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = field1608[--class89.field892];
					class331.field2633.method313(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = field1608[--class89.field892];
					class331.field2633.method316(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = field1608[--class89.field892];
					class331.field2633.method315(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = field1608[--class89.field892];
					boolean var7 = true;
					class331.field2633.method317(var10, var7);
					return 1;
				} else if (var0 == 3609) {
					var10 = field1608[--class89.field892];
					var10 = Client.method208(var10);
					field1621[++class293.field2375 - 1] = class331.field2633.method311(new class353(var10, class67.field769), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (class54.field716 != null) {
						field1608[++class89.field892 - 1] = class54.field716.field2072;
					} else {
						field1608[++class89.field892 - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (class54.field716 != null) {
						field1621[++class293.field2375 - 1] = class54.field716.method905();
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var4 = field1621[--class293.field2375];
					if (class54.field716 != null && var4 < class54.field716.method905()) {
						field1608[++class89.field892 - 1] = class54.field716.method892(var4).method1019().method1935();
					} else {
						field1608[++class89.field892 - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var4 = field1621[--class293.field2375];
					if (class54.field716 != null && var4 < class54.field716.method905()) {
						field1621[++class293.field2375 - 1] = ((class424)class54.field716.method892(var4)).method2220();
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var4 = field1621[--class293.field2375];
					if (class54.field716 != null && var4 < class54.field716.method905()) {
						field1621[++class293.field2375 - 1] = ((class424)class54.field716.method892(var4)).field3236;
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					field1621[++class293.field2375 - 1] = class54.field716 != null ? class54.field716.field2076 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = field1608[--class89.field892];
					Client.method189(var10);
					return 1;
				} else if (var0 == 3618) {
					field1621[++class293.field2375 - 1] = class54.field716 != null ? class54.field716.field2077 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = field1608[--class89.field892];
					Client.method177(var10);
					return 1;
				} else if (var0 == 3620) {
					Client.method156();
					return 1;
				} else if (var0 == 3621) {
					if (!class331.field2633.method307()) {
						field1621[++class293.field2375 - 1] = -1;
					} else {
						field1621[++class293.field2375 - 1] = class331.field2633.field350.method905();
					}

					return 1;
				} else if (var0 == 3622) {
					var4 = field1621[--class293.field2375];
					if (class331.field2633.method307() && var4 >= 0 && var4 < class331.field2633.field350.method905()) {
						class462 var5 = (class462)class331.field2633.field350.method892(var4);
						field1608[++class89.field892 - 1] = var5.method1020();
						field1608[++class89.field892 - 1] = var5.method1021();
					} else {
						field1608[++class89.field892 - 1] = "";
						field1608[++class89.field892 - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var10 = field1608[--class89.field892];
					var10 = Client.method208(var10);
					field1621[++class293.field2375 - 1] = class331.field2633.method312(new class353(var10, class67.field769)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = field1621[--class293.field2375];
					if (null != class54.field716 && var4 < class54.field716.method905() && class54.field716.method892(var4).method1019().equals(class126.field1164.field3315)) {
						field1621[++class293.field2375 - 1] = 1;
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (null != class54.field716 && null != class54.field716.field2075) {
						field1608[++class89.field892 - 1] = class54.field716.field2075;
					} else {
						field1608[++class89.field892 - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var4 = field1621[--class293.field2375];
					if (null != class54.field716 && var4 < class54.field716.method905() && ((class55)class54.field716.method892(var4)).method463()) {
						field1621[++class293.field2375 - 1] = 1;
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						class331.field2633.field351.method904();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class87(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class251(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class9(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class110(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class402(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class107(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class413(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class163(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class243(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class181(var6));
							return 1;
						} else if (var0 == 3639) {
							class331.field2633.field351.method906();
							return 1;
						} else if (var0 == 3640) {
							class331.field2633.field350.method904();
							return 1;
						} else if (var0 == 3641) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field350.method897(new class87(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field350.method897(new class251(var6));
							return 1;
						} else if (var0 == 3643) {
							class331.field2633.field350.method906();
							return 1;
						} else if (var0 == 3644) {
							if (null != class54.field716) {
								class54.field716.method904();
							}

							return 1;
						} else if (var0 == 3645) {
							var6 = field1621[--class293.field2375] == 1;
							if (null != class54.field716) {
								class54.field716.method897(new class87(var6));
							}

							return 1;
						} else if (var0 == 3646) {
							var6 = field1621[--class293.field2375] == 1;
							if (null != class54.field716) {
								class54.field716.method897(new class251(var6));
							}

							return 1;
						} else if (var0 == 3647) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class9(var6));
							}

							return 1;
						} else if (var0 == 3648) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class110(var6));
							}

							return 1;
						} else if (var0 == 3649) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class402(var6));
							}

							return 1;
						} else if (var0 == 3650) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class107(var6));
							}

							return 1;
						} else if (var0 == 3651) {
							var6 = field1621[--class293.field2375] == 1;
							if (null != class54.field716) {
								class54.field716.method897(new class413(var6));
							}

							return 1;
						} else if (var0 == 3652) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class163(var6));
							}

							return 1;
						} else if (var0 == 3653) {
							var6 = field1621[--class293.field2375] == 1;
							if (null != class54.field716) {
								class54.field716.method897(new class243(var6));
							}

							return 1;
						} else if (var0 == 3654) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class181(var6));
							}

							return 1;
						} else if (var0 == 3655) {
							if (null != class54.field716) {
								class54.field716.method906();
							}

							return 1;
						} else if (var0 == 3656) {
							var6 = field1621[--class293.field2375] == 1;
							class331.field2633.field351.method897(new class410(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = field1621[--class293.field2375] == 1;
							if (class54.field716 != null) {
								class54.field716.method897(new class410(var6));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field1621[--class293.field2375];
					if (class54.field716 != null && var4 < class54.field716.method905() && ((class55)class54.field716.method892(var4)).method464()) {
						field1621[++class293.field2375 - 1] = 1;
					} else {
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "bt", desc = "(ILdh;ZS)I")
	static int method971(int var0, class333 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(name = "bd", desc = "(ILdh;ZI)I")
	static int method973(int var0, class333 var1, boolean var2) {
		if (var0 == 3800) {
			if (class183.field1662 != null) {
				field1621[++class293.field2375 - 1] = 1;
				class285.field2275 = class183.field1662;
			} else {
				field1621[++class293.field2375 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = field1621[--class293.field2375];
				if (null != Client.field271[var4]) {
					field1621[++class293.field2375 - 1] = 1;
					class285.field2275 = Client.field271[var4];
				} else {
					field1621[++class293.field2375 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				field1608[++class89.field892 - 1] = class285.field2275.field2305;
				return 1;
			} else if (var0 == 3803) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2304 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2318;
				return 1;
			} else if (var0 == 3805) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2306;
				return 1;
			} else if (var0 == 3806) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2307;
				return 1;
			} else if (var0 == 3807) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2308;
				return 1;
			} else if (var0 == 3809) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2309;
				return 1;
			} else if (var0 == 3810) {
				var4 = field1621[--class293.field2375];
				field1608[++class89.field892 - 1] = class285.field2275.field2320[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = field1621[--class293.field2375];
				field1621[++class293.field2375 - 1] = class285.field2275.field2311[var4];
				return 1;
			} else if (var0 == 3812) {
				field1621[++class293.field2375 - 1] = class285.field2275.field2302;
				return 1;
			} else if (var0 == 3813) {
				var4 = field1621[--class293.field2375];
				field1608[++class89.field892 - 1] = class285.field2275.field2321[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					class293.field2375 -= 3;
					var4 = field1621[class293.field2375];
					var7 = field1621[1 + class293.field2375];
					var6 = field1621[class293.field2375 + 2];
					field1621[++class293.field2375 - 1] = class285.field2275.method1597(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					field1621[++class293.field2375 - 1] = class285.field2275.field2316;
					return 1;
				} else if (var0 == 3816) {
					field1621[++class293.field2375 - 1] = class285.field2275.field2301;
					return 1;
				} else if (var0 == 3817) {
					field1621[++class293.field2375 - 1] = class285.field2275.method1595(field1608[--class89.field892]);
					return 1;
				} else if (var0 == 3818) {
					field1621[class293.field2375 - 1] = class285.field2275.method1591()[field1621[class293.field2375 - 1]];
					return 1;
				} else if (var0 == 3819) {
					class293.field2375 -= 2;
					var4 = field1621[class293.field2375];
					var7 = field1621[class293.field2375 + 1];
					Client.method261(var7, var4);
					return 1;
				} else if (var0 == 3820) {
					var4 = field1621[--class293.field2375];
					field1621[++class293.field2375 - 1] = class285.field2275.field2314[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						class293.field2375 -= 3;
						var4 = field1621[class293.field2375];
						boolean var5 = field1621[1 + class293.field2375] == 1;
						var6 = field1621[class293.field2375 + 2];
						class279.method1477(var6, var4, var5);
					}

					if (var0 == 3822) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = class285.field2275.field2315[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (null != class263.field2126) {
							field1621[++class293.field2375 - 1] = 1;
							class457.field3717 = class263.field2126;
						} else {
							field1621[++class293.field2375 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var4 = field1621[--class293.field2375];
						if (null != Client.field272[var4]) {
							field1621[++class293.field2375 - 1] = 1;
							class457.field3717 = Client.field272[var4];
							class537.field4272 = var4;
						} else {
							field1621[++class293.field2375 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						field1608[++class89.field892 - 1] = class457.field3717.field1437;
						return 1;
					} else if (var0 == 3853) {
						field1621[++class293.field2375 - 1] = class457.field3717.field1436;
						return 1;
					} else if (var0 == 3854) {
						field1621[++class293.field2375 - 1] = class457.field3717.field1432;
						return 1;
					} else if (var0 == 3855) {
						field1621[++class293.field2375 - 1] = class457.field3717.method834();
						return 1;
					} else if (var0 == 3856) {
						var4 = field1621[--class293.field2375];
						field1608[++class89.field892 - 1] = ((class524)class457.field3717.field1434.get(var4)).field4198.method1935();
						return 1;
					} else if (var0 == 3857) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = ((class524)class457.field3717.field1434.get(var4)).field4199;
						return 1;
					} else if (var0 == 3858) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = ((class524)class457.field3717.field1434.get(var4)).field4200;
						return 1;
					} else if (var0 == 3859) {
						var4 = field1621[--class293.field2375];
						Client.method169(class537.field4272, var4);
						return 1;
					} else if (var0 == 3860) {
						field1621[++class293.field2375 - 1] = class457.field3717.method835(field1608[--class89.field892]);
						return 1;
					} else if (var0 == 3861) {
						field1621[class293.field2375 - 1] = class457.field3717.method836()[field1621[class293.field2375 - 1]];
						return 1;
					} else if (var0 == 3890) {
						field1621[++class293.field2375 - 1] = null != class365.field2842 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(name = "by", desc = "(ILdh;ZI)I")
	static int method1009(int var0, class333 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field305[var4].method2365();
			return 1;
		} else if (var0 == 3904) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field305[var4].field3709;
			return 1;
		} else if (var0 == 3905) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field305[var4].field3713;
			return 1;
		} else if (var0 == 3906) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field305[var4].field3711;
			return 1;
		} else if (var0 == 3907) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field305[var4].field3712;
			return 1;
		} else if (var0 == 3908) {
			var4 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = Client.field305[var4].field3708;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = field1621[--class293.field2375];
				var14 = Client.field305[var4].method2364();
				field1621[++class293.field2375 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = field1621[--class293.field2375];
				var14 = Client.field305[var4].method2364();
				field1621[++class293.field2375 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = field1621[--class293.field2375];
				var14 = Client.field305[var4].method2364();
				field1621[++class293.field2375 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = field1621[--class293.field2375];
				var14 = Client.field305[var4].method2364();
				field1621[++class293.field2375 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = field1621[--class293.field2375] == 1;
					if (class332.field2640 != null) {
						class332.field2640.method2187(class414.field3188, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = field1621[--class293.field2375] == 1;
					if (null != class332.field2640) {
						class332.field2640.method2187(class414.field3190, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					class293.field2375 -= 2;
					var12 = field1621[class293.field2375] == 1;
					boolean var13 = field1621[1 + class293.field2375] == 1;
					if (null != class332.field2640) {
						Client.field317.field1467 = var13;
						class332.field2640.method2187(Client.field317, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = field1621[--class293.field2375] == 1;
					if (null != class332.field2640) {
						class332.field2640.method2187(class414.field3186, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = field1621[--class293.field2375] == 1;
					if (null != class332.field2640) {
						class332.field2640.method2187(class414.field3189, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					field1621[++class293.field2375 - 1] = class332.field2640 == null ? 0 : class332.field2640.field3187.size();
					return 1;
				} else {
					class158 var5;
					if (var0 == 3920) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						field1621[++class293.field2375 - 1] = var5.field1502;
						return 1;
					} else if (var0 == 3921) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						field1608[++class89.field892 - 1] = var5.method912();
						return 1;
					} else if (var0 == 3922) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						field1608[++class89.field892 - 1] = var5.method911();
						return 1;
					} else if (var0 == 3923) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						long var6 = class43.method443() - class214.field1925 - var5.field1500;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						field1608[++class89.field892 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						field1621[++class293.field2375 - 1] = var5.field1498.field3711;
						return 1;
					} else if (var0 == 3925) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						field1621[++class293.field2375 - 1] = var5.field1498.field3713;
						return 1;
					} else if (var0 == 3926) {
						var4 = field1621[--class293.field2375];
						var5 = (class158)class332.field2640.field3187.get(var4);
						field1621[++class293.field2375 - 1] = var5.field1498.field3709;
						return 1;
					} else if (var0 == 3939) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = class270.method1424(var4).field2214 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(name = "bs", desc = "(ILdh;ZB)I")
	static int method1010(int var0, class333 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			class293.field2375 -= 2;
			var10 = field1621[class293.field2375];
			var5 = field1621[class293.field2375 + 1];
			field1621[++class293.field2375 - 1] = var10 + var5;
			return 1;
		} else if (var0 == 4001) {
			class293.field2375 -= 2;
			var10 = field1621[class293.field2375];
			var5 = field1621[1 + class293.field2375];
			field1621[++class293.field2375 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			class293.field2375 -= 2;
			var10 = field1621[class293.field2375];
			var5 = field1621[1 + class293.field2375];
			field1621[++class293.field2375 - 1] = var10 * var5;
			return 1;
		} else if (var0 == 4003) {
			class293.field2375 -= 2;
			var10 = field1621[class293.field2375];
			var5 = field1621[1 + class293.field2375];
			field1621[++class293.field2375 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = (int)(Math.random() * (double)var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = field1621[--class293.field2375];
			field1621[++class293.field2375 - 1] = (int)(Math.random() * (double)(var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				class293.field2375 -= 5;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				var6 = field1621[2 + class293.field2375];
				var7 = field1621[class293.field2375 + 3];
				var8 = field1621[class293.field2375 + 4];
				field1621[++class293.field2375 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
				return 1;
			} else if (var0 == 4007) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var5 * var10 / 100 + var10;
				return 1;
			} else if (var0 == 4008) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[1 + class293.field2375];
				field1621[++class293.field2375 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[1 + class293.field2375];
				if (var10 == 0) {
					field1621[++class293.field2375 - 1] = 0;
				} else {
					field1621[++class293.field2375 - 1] = (int)Math.pow((double)var10, (double)var5);
				}

				return 1;
			} else if (var0 == 4013) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				if (var10 == 0) {
					field1621[++class293.field2375 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						field1621[++class293.field2375 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						field1621[++class293.field2375 - 1] = var10;
						break;
					case 2:
						field1621[++class293.field2375 - 1] = (int)Math.sqrt((double)var10);
						break;
					case 3:
						field1621[++class293.field2375 - 1] = (int)Math.cbrt((double)var10);
						break;
					case 4:
						field1621[++class293.field2375 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
						break;
					default:
						field1621[++class293.field2375 - 1] = (int)Math.pow((double)var10, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[1 + class293.field2375];
				field1621[++class293.field2375 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				class293.field2375 -= 3;
				long var11 = (long)field1621[class293.field2375];
				long var12 = (long)field1621[1 + class293.field2375];
				long var13 = (long)field1621[class293.field2375 + 2];
				field1621[++class293.field2375 - 1] = (int)(var11 * var13 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = class121.method688(field1621[--class293.field2375]);
				field1621[++class293.field2375 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[1 + class293.field2375];
				field1621[++class293.field2375 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				class293.field2375 -= 3;
				var10 = field1621[class293.field2375];
				var5 = field1621[1 + class293.field2375];
				var6 = field1621[2 + class293.field2375];
				field1621[++class293.field2375 - 1] = class497.method2493(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				class293.field2375 -= 3;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				var6 = field1621[2 + class293.field2375];
				field1621[++class293.field2375 - 1] = class497.method2491(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				class293.field2375 -= 3;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				var6 = field1621[class293.field2375 + 2];
				var7 = 31 - var6;
				field1621[++class293.field2375 - 1] = var10 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == 4030) {
				class293.field2375 -= 4;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				var6 = field1621[2 + class293.field2375];
				var7 = field1621[3 + class293.field2375];
				var10 = class497.method2491(var10, var6, var7);
				var8 = class497.method2489(1 + (var7 - var6));
				if (var5 > var8) {
					var5 = var8;
				}

				field1621[++class293.field2375 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				field1621[class293.field2375 - 1] = class66.method496(field1621[class293.field2375 - 1]);
				return 1;
			} else if (var0 == 4033) {
				field1621[class293.field2375 - 1] = class66.method498(field1621[class293.field2375 - 1]);
				return 1;
			} else if (var0 == 4034) {
				class293.field2375 -= 2;
				var10 = field1621[class293.field2375];
				var5 = field1621[class293.field2375 + 1];
				var6 = class66.method497(var10, var5);
				field1621[++class293.field2375 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				field1621[class293.field2375 - 1] = Math.abs(field1621[class293.field2375 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = field1608[--class89.field892];
				var5 = -1;
				if (class455.method2378(var4)) {
					var5 = class455.method2372(var4);
				}

				field1621[++class293.field2375 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfInfo(name = "bm", desc = "(ILdh;ZB)I")
	static int method977(int var0, class333 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = field1608[--class89.field892];
			var10 = field1621[--class293.field2375];
			field1608[++class89.field892 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				class89.field892 -= 2;
				var4 = field1608[class89.field892];
				var5 = field1608[1 + class89.field892];
				field1608[++class89.field892 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = field1608[--class89.field892];
				var10 = field1621[--class293.field2375];
				field1608[++class89.field892 - 1] = var4 + class455.method2368(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = field1608[--class89.field892];
				field1608[++class89.field892 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = field1621[--class293.field2375];
					long var16 = 86400000L * ((long)var13 + 11745L);
					field1614.setTime(new Date(var16));
					var7 = field1614.get(5);
					int var18 = field1614.get(2);
					int var9 = field1614.get(1);
					field1608[++class89.field892 - 1] = var7 + "-" + field1615[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = field1621[--class293.field2375];
						field1608[++class89.field892 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						class89.field892 -= 2;
						field1621[++class293.field2375 - 1] = class455.method2377(class174.method964(field1608[class89.field892], field1608[1 + class89.field892], class524.field4196));
						return 1;
					} else {
						int var12;
						byte[] var15;
						class258 var17;
						if (var0 == 4108) {
							var4 = field1608[--class89.field892];
							class293.field2375 -= 2;
							var10 = field1621[class293.field2375];
							var12 = field1621[1 + class293.field2375];
							var15 = class439.field3327.method2267(var12, 0);
							var17 = new class258(var15);
							field1621[++class293.field2375 - 1] = var17.method1648(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = field1608[--class89.field892];
							class293.field2375 -= 2;
							var10 = field1621[class293.field2375];
							var12 = field1621[1 + class293.field2375];
							var15 = class439.field3327.method2267(var12, 0);
							var17 = new class258(var15);
							field1621[++class293.field2375 - 1] = var17.method1669(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							class89.field892 -= 2;
							var4 = field1608[class89.field892];
							var5 = field1608[class89.field892 + 1];
							if (field1621[--class293.field2375] == 1) {
								field1608[++class89.field892 - 1] = var4;
							} else {
								field1608[++class89.field892 - 1] = var5;
							}

							return 1;
						} else if (var0 == 4111) {
							var4 = field1608[--class89.field892];
							field1608[++class89.field892 - 1] = class300.method1659(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = field1608[--class89.field892];
							var10 = field1621[--class293.field2375];
							field1608[++class89.field892 - 1] = var4 + (char)var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = field1621[--class293.field2375];
							field1621[++class293.field2375 - 1] = class455.method2370((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = field1621[--class293.field2375];
							field1621[++class293.field2375 - 1] = class455.method2382((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = field1621[--class293.field2375];
							field1621[++class293.field2375 - 1] = class455.method2376((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = field1621[--class293.field2375];
							field1621[++class293.field2375 - 1] = class105.method608((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = field1608[--class89.field892];
							if (null != var4) {
								field1621[++class293.field2375 - 1] = var4.length();
							} else {
								field1621[++class293.field2375 - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var4 = field1608[--class89.field892];
							class293.field2375 -= 2;
							var10 = field1621[class293.field2375];
							var12 = field1621[1 + class293.field2375];
							field1608[++class89.field892 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = field1608[--class89.field892];
							StringBuilder var11 = new StringBuilder(var4.length());
							boolean var14 = false;

							for (var7 = 0; var7 < var4.length(); ++var7) {
								char var8 = var4.charAt(var7);
								if (var8 == '<') {
									var14 = true;
								} else if (var8 == '>') {
									var14 = false;
								} else if (!var14) {
									var11.append(var8);
								}
							}

							field1608[++class89.field892 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = field1608[--class89.field892];
							var10 = field1621[--class293.field2375];
							field1621[++class293.field2375 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							class89.field892 -= 2;
							var4 = field1608[class89.field892];
							var5 = field1608[class89.field892 + 1];
							var12 = field1621[--class293.field2375];
							field1621[++class293.field2375 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = field1608[--class89.field892];
							field1608[++class89.field892 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class89.field892 -= 3;
							var4 = field1608[class89.field892];
							var5 = field1608[1 + class89.field892];
							String var6 = field1608[class89.field892 + 2];
							if (null == class126.field1164.field3299) {
								field1608[++class89.field892 - 1] = var6;
								return 1;
							} else {
								switch(class126.field1164.field3299.field1820) {
								case 0:
									field1608[++class89.field892 - 1] = var4;
									break;
								case 1:
									field1608[++class89.field892 - 1] = var5;
									break;
								case 2:
								default:
									field1608[++class89.field892 - 1] = var6;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class89.field892 -= 2;
					var4 = field1608[class89.field892];
					var5 = field1608[class89.field892 + 1];
					if (null != class126.field1164.field3299 && class126.field1164.field3299.field1818 != 0) {
						field1608[++class89.field892 - 1] = var5;
					} else {
						field1608[++class89.field892 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "bf", desc = "(ILdh;ZB)I")
	static int method979(int var0, class333 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = field1621[--class293.field2375];
			field1608[++class89.field892 - 1] = class270.method1424(var4).field2186;
			return 1;
		} else {
			class270 var6;
			int var7;
			if (var0 == 4201) {
				class293.field2375 -= 2;
				var4 = field1621[class293.field2375];
				var7 = field1621[1 + class293.field2375];
				var6 = class270.method1424(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field2187[var7 - 1] != null) {
					field1608[++class89.field892 - 1] = var6.field2187[var7 - 1];
				} else {
					field1608[++class89.field892 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				class293.field2375 -= 2;
				var4 = field1621[class293.field2375];
				var7 = field1621[1 + class293.field2375];
				var6 = class270.method1424(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field2188[var7 - 1] != null) {
					field1608[++class89.field892 - 1] = var6.field2188[var7 - 1];
				} else {
					field1608[++class89.field892 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var4 = field1621[--class293.field2375];
				field1621[++class293.field2375 - 1] = class270.method1424(var4).field2182;
				return 1;
			} else if (var0 == 4204) {
				var4 = field1621[--class293.field2375];
				field1621[++class293.field2375 - 1] = class270.method1424(var4).field2181 == 1 ? 1 : 0;
				return 1;
			} else {
				class270 var5;
				if (var0 == 4205) {
					var4 = field1621[--class293.field2375];
					var5 = class270.method1424(var4);
					if (var5.field2177 == -1 && var5.field2204 >= 0) {
						field1621[++class293.field2375 - 1] = var5.field2204;
					} else {
						field1621[++class293.field2375 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4206) {
					var4 = field1621[--class293.field2375];
					var5 = class270.method1424(var4);
					if (var5.field2177 >= 0 && var5.field2204 >= 0) {
						field1621[++class293.field2375 - 1] = var5.field2204;
					} else {
						field1621[++class293.field2375 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4207) {
					var4 = field1621[--class293.field2375];
					field1621[++class293.field2375 - 1] = class270.method1424(var4).field2174 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = field1621[--class293.field2375];
					var5 = class270.method1424(var4);
					if (var5.field2217 == -1 && var5.field2176 >= 0) {
						field1621[++class293.field2375 - 1] = var5.field2176;
					} else {
						field1621[++class293.field2375 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4209) {
					var4 = field1621[--class293.field2375];
					var5 = class270.method1424(var4);
					if (var5.field2217 >= 0 && var5.field2176 >= 0) {
						field1621[++class293.field2375 - 1] = var5.field2176;
					} else {
						field1621[++class293.field2375 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4210) {
					String var8 = field1608[--class89.field892];
					var7 = field1621[--class293.field2375];
					Client.method203(var8, var7 == 1);
					field1621[++class293.field2375 - 1] = class310.field2524;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						class216.field1931 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = field1621[--class293.field2375];
						var7 = class270.method1424(var4).method1417();
						if (var7 == -1) {
							field1621[++class293.field2375 - 1] = var7;
						} else {
							field1621[++class293.field2375 - 1] = var7 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = class270.method1424(var4).field2183;
						return 1;
					} else if (var0 == 4215) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = class270.method1424(var4).field2168;
						return 1;
					} else if (var0 == 4216) {
						var4 = field1621[--class293.field2375];
						field1621[++class293.field2375 - 1] = class270.method1424(var4).field2184;
						return 1;
					} else if (var0 == 4217) {
						var4 = field1621[--class293.field2375];
						var5 = class270.method1424(var4);
						field1621[++class293.field2375 - 1] = var5.field2172;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class500.field4040 != null && class216.field1931 < class310.field2524) {
						field1621[++class293.field2375 - 1] = class500.field4040[++class216.field1931 - 1] & '\uffff';
					} else {
						field1621[++class293.field2375 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "bq", desc = "(ILdh;ZB)I")
	static int method1011(int var0, class333 var1, boolean var2) {
		if (var0 == 5000) {
			field1621[++class293.field2375 - 1] = Client.field260;
			return 1;
		} else if (var0 == 5001) {
			class293.field2375 -= 3;
			Client.field260 = field1621[class293.field2375];
			class532.field4247 = class239.method1258(field1621[class293.field2375 + 1]);
			if (null == class532.field4247) {
				class532.field4247 = class239.field1991;
			}

			Client.field261 = field1621[class293.field2375 + 2];
			class121 var14 = class121.method689(class480.field3907, Client.field92.field2665);
			var14.field1141.method1481(Client.field260);
			var14.field1141.method1481(class532.field4247.field1990);
			var14.field1141.method1481(Client.field261);
			Client.field92.method1821(var14);
			return 1;
		} else {
			String var4;
			class121 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = field1608[--class89.field892];
				class293.field2375 -= 2;
				var9 = field1621[class293.field2375];
				var11 = field1621[class293.field2375 + 1];
				var7 = class121.method689(class480.field3911, Client.field92.field2665);
				var7.field1141.method1481(class280.method1555(var4) + 2);
				var7.field1141.method1484(var4);
				var7.field1141.method1481(var9 - 1);
				var7.field1141.method1481(var11);
				Client.field92.method1821(var7);
				return 1;
			} else {
				class212 var6;
				int var8;
				if (var0 == 5003) {
					class293.field2375 -= 2;
					var8 = field1621[class293.field2375];
					var9 = field1621[1 + class293.field2375];
					var6 = class159.method920(var8, var9);
					if (null != var6) {
						field1621[++class293.field2375 - 1] = var6.field1894;
						field1621[++class293.field2375 - 1] = var6.field1890;
						field1608[++class89.field892 - 1] = null != var6.field1892 ? var6.field1892 : "";
						field1608[++class89.field892 - 1] = var6.field1896 != null ? var6.field1896 : "";
						field1608[++class89.field892 - 1] = var6.field1897 != null ? var6.field1897 : "";
						field1621[++class293.field2375 - 1] = var6.method1186() ? 1 : (var6.method1184() ? 2 : 0);
					} else {
						field1621[++class293.field2375 - 1] = -1;
						field1621[++class293.field2375 - 1] = 0;
						field1608[++class89.field892 - 1] = "";
						field1608[++class89.field892 - 1] = "";
						field1608[++class89.field892 - 1] = "";
						field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else {
					class212 var5;
					if (var0 == 5004) {
						var8 = field1621[--class293.field2375];
						var5 = class159.method915(var8);
						if (var5 != null) {
							field1621[++class293.field2375 - 1] = var5.field1891;
							field1621[++class293.field2375 - 1] = var5.field1890;
							field1608[++class89.field892 - 1] = null != var5.field1892 ? var5.field1892 : "";
							field1608[++class89.field892 - 1] = null != var5.field1896 ? var5.field1896 : "";
							field1608[++class89.field892 - 1] = null != var5.field1897 ? var5.field1897 : "";
							field1621[++class293.field2375 - 1] = var5.method1186() ? 1 : (var5.method1184() ? 2 : 0);
						} else {
							field1621[++class293.field2375 - 1] = -1;
							field1621[++class293.field2375 - 1] = 0;
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1608[++class89.field892 - 1] = "";
							field1621[++class293.field2375 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (null == class532.field4247) {
							field1621[++class293.field2375 - 1] = -1;
						} else {
							field1621[++class293.field2375 - 1] = class532.field4247.field1990;
						}

						return 1;
					} else {
						class121 var12;
						if (var0 == 5008) {
							var4 = field1608[--class89.field892];
							var9 = field1621[--class293.field2375];
							var12 = class452.method2360(var9, var4, class524.field4196, -1);
							Client.field92.method1821(var12);
							return 1;
						} else if (var0 == 5009) {
							class89.field892 -= 2;
							var4 = field1608[class89.field892];
							String var10 = field1608[class89.field892 + 1];
							var12 = class121.method689(class480.field3912, Client.field92.field2665);
							var12.field1141.method1522(0);
							int var13 = var12.field1141.field2254;
							var12.field1141.method1484(var4);
							class217.method1201(var12.field1141, var10);
							var12.field1141.method1489(var12.field1141.field2254 - var13);
							Client.field92.method1821(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = field1608[--class89.field892];
							class293.field2375 -= 2;
							var9 = field1621[class293.field2375];
							var11 = field1621[class293.field2375 + 1];
							var7 = class452.method2360(var9, var4, class524.field4196, var11);
							Client.field92.method1821(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								field1621[++class293.field2375 - 1] = Client.field261;
								return 1;
							} else if (var0 == 5017) {
								var8 = field1621[--class293.field2375];
								field1621[++class293.field2375 - 1] = class159.method918(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = field1621[--class293.field2375];
								field1621[++class293.field2375 - 1] = class159.method919(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = field1621[--class293.field2375];
								field1621[++class293.field2375 - 1] = class159.method917(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = field1608[--class89.field892];
								class447.method2351(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field55 = field1608[--class89.field892].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								field1608[++class89.field892 - 1] = Client.field55;
								return 1;
							} else if (var0 == 5023) {
								var4 = field1608[--class89.field892];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								class293.field2375 -= 2;
								var8 = field1621[class293.field2375];
								var9 = field1621[class293.field2375 + 1];
								var6 = class159.method920(var8, var9);
								if (var6 != null) {
									field1621[++class293.field2375 - 1] = var6.field1894;
									field1621[++class293.field2375 - 1] = var6.field1890;
									field1608[++class89.field892 - 1] = var6.field1892 != null ? var6.field1892 : "";
									field1608[++class89.field892 - 1] = var6.field1896 != null ? var6.field1896 : "";
									field1608[++class89.field892 - 1] = null != var6.field1897 ? var6.field1897 : "";
									field1621[++class293.field2375 - 1] = var6.method1186() ? 1 : (var6.method1184() ? 2 : 0);
									field1608[++class89.field892 - 1] = "";
									field1621[++class293.field2375 - 1] = 0;
								} else {
									field1621[++class293.field2375 - 1] = -1;
									field1621[++class293.field2375 - 1] = 0;
									field1608[++class89.field892 - 1] = "";
									field1608[++class89.field892 - 1] = "";
									field1608[++class89.field892 - 1] = "";
									field1621[++class293.field2375 - 1] = 0;
									field1608[++class89.field892 - 1] = "";
									field1621[++class293.field2375 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var8 = field1621[--class293.field2375];
								var5 = class159.method915(var8);
								if (var5 != null) {
									field1621[++class293.field2375 - 1] = var5.field1891;
									field1621[++class293.field2375 - 1] = var5.field1890;
									field1608[++class89.field892 - 1] = null != var5.field1892 ? var5.field1892 : "";
									field1608[++class89.field892 - 1] = var5.field1896 != null ? var5.field1896 : "";
									field1608[++class89.field892 - 1] = null != var5.field1897 ? var5.field1897 : "";
									field1621[++class293.field2375 - 1] = var5.method1186() ? 1 : (var5.method1184() ? 2 : 0);
									field1608[++class89.field892 - 1] = "";
									field1621[++class293.field2375 - 1] = 0;
								} else {
									field1621[++class293.field2375 - 1] = -1;
									field1621[++class293.field2375 - 1] = 0;
									field1608[++class89.field892 - 1] = "";
									field1608[++class89.field892 - 1] = "";
									field1608[++class89.field892 - 1] = "";
									field1621[++class293.field2375 - 1] = 0;
									field1608[++class89.field892 - 1] = "";
									field1621[++class293.field2375 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (null != class126.field1164 && null != class126.field1164.field3315) {
								var4 = class126.field1164.field3315.method1935();
							} else {
								var4 = "";
							}

							field1608[++class89.field892 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfInfo(name = "ba", desc = "(ILdh;ZI)I")
	static int method995(int var0, class333 var1, boolean var2) {
		if (var0 == 5306) {
			field1621[++class293.field2375 - 1] = Client.method212();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = field1621[--class293.field2375];
				if (var4 == 1 || var4 == 2) {
					class343.method1881(var4);
				}

				return 1;
			} else if (var0 == 5308) {
				field1621[++class293.field2375 - 1] = class281.field2262.method1760();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--class293.field2375;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = field1621[--class293.field2375];
				if (var4 == 1 || var4 == 2) {
					class281.field2262.method1759(var4);
				}

				return 1;
			}
		}
	}

	@ObfInfo(name = "bl", desc = "(ILdh;ZI)I")
	static int method1016(int var0, class333 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			class293.field2375 -= 2;
			var4 = field1621[class293.field2375];
			int var5 = field1621[class293.field2375 + 1];
			if (!Client.field288) {
				Client.field66 = var4;
				Client.field205 = var5;
			}

			return 1;
		} else if (var0 == 5505) {
			field1621[++class293.field2375 - 1] = Client.field66;
			return 1;
		} else if (var0 == 5506) {
			field1621[++class293.field2375 - 1] = Client.field205;
			return 1;
		} else if (var0 == 5530) {
			var4 = field1621[--class293.field2375];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.field121 = var4;
			return 1;
		} else if (var0 == 5531) {
			field1621[++class293.field2375 - 1] = Client.field121;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "bp", desc = "(ILdh;ZI)I", opaqueValue = "334602376")
	static int method966(int var0, class333 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field80 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "bu", desc = "(II)I")
	static int method988(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	@ObfInfo(name = "bo", desc = "(II)I")
	static int method1007(int var0) {
		return (int)((Math.log((double)var0) / field1620 - 7.0D) * 256.0D);
	}

	@ObfInfo(name = "br", desc = "(ILdh;ZI)I")
	static int method989(int var0, class333 var1, boolean var2) {
		if (var0 == 6500) {
			field1621[++class293.field2375 - 1] = class516.method2532() ? 1 : 0;
			return 1;
		} else {
			class516 var9;
			if (var0 == 6501) {
				var9 = class516.method2529();
				if (var9 != null) {
					field1621[++class293.field2375 - 1] = var9.field4132;
					field1621[++class293.field2375 - 1] = var9.field4128;
					field1608[++class89.field892 - 1] = var9.field4136;
					field1621[++class293.field2375 - 1] = var9.field4137;
					field1621[++class293.field2375 - 1] = var9.field4134;
					field1608[++class89.field892 - 1] = var9.field4135;
				} else {
					field1621[++class293.field2375 - 1] = -1;
					field1621[++class293.field2375 - 1] = 0;
					field1608[++class89.field892 - 1] = "";
					field1621[++class293.field2375 - 1] = 0;
					field1621[++class293.field2375 - 1] = 0;
					field1608[++class89.field892 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = class516.method2536();
				if (var9 != null) {
					field1621[++class293.field2375 - 1] = var9.field4132;
					field1621[++class293.field2375 - 1] = var9.field4128;
					field1608[++class89.field892 - 1] = var9.field4136;
					field1621[++class293.field2375 - 1] = var9.field4137;
					field1621[++class293.field2375 - 1] = var9.field4134;
					field1608[++class89.field892 - 1] = var9.field4135;
				} else {
					field1621[++class293.field2375 - 1] = -1;
					field1621[++class293.field2375 - 1] = 0;
					field1608[++class89.field892 - 1] = "";
					field1621[++class293.field2375 - 1] = 0;
					field1621[++class293.field2375 - 1] = 0;
					field1608[++class89.field892 - 1] = "";
				}

				return 1;
			} else {
				int var4;
				class516 var5;
				int var11;
				if (var0 == 6506) {
					var4 = field1621[--class293.field2375];
					var5 = null;

					for (var11 = 0; var11 < class516.field4133; ++var11) {
						if (var4 == class69.field774[var11].field4132) {
							var5 = class69.field774[var11];
							break;
						}
					}

					if (var5 != null) {
						field1621[++class293.field2375 - 1] = var5.field4132;
						field1621[++class293.field2375 - 1] = var5.field4128;
						field1608[++class89.field892 - 1] = var5.field4136;
						field1621[++class293.field2375 - 1] = var5.field4137;
						field1621[++class293.field2375 - 1] = var5.field4134;
						field1608[++class89.field892 - 1] = var5.field4135;
					} else {
						field1621[++class293.field2375 - 1] = -1;
						field1621[++class293.field2375 - 1] = 0;
						field1608[++class89.field892 - 1] = "";
						field1621[++class293.field2375 - 1] = 0;
						field1621[++class293.field2375 - 1] = 0;
						field1608[++class89.field892 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					class293.field2375 -= 4;
					var4 = field1621[class293.field2375];
					boolean var10 = field1621[class293.field2375 + 1] == 1;
					var11 = field1621[class293.field2375 + 2];
					boolean var7 = field1621[class293.field2375 + 3] == 1;
					class516.method2534(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field185 = field1621[--class293.field2375] == 1;
						return 1;
					} else {
						class409 var6;
						int var8;
						if (var0 == 6513) {
							class293.field2375 -= 2;
							var4 = field1621[class293.field2375];
							var8 = field1621[1 + class293.field2375];
							var6 = class409.method2147(var8);
							if (var6.method2144()) {
								field1608[++class89.field892 - 1] = class395.method2109(var4).method2106(var8, var6.field3158);
							} else {
								field1621[++class293.field2375 - 1] = class395.method2109(var4).method2108(var8, var6.field3154);
							}

							return 1;
						} else if (var0 == 6514) {
							class293.field2375 -= 2;
							var4 = field1621[class293.field2375];
							var8 = field1621[class293.field2375 + 1];
							var6 = class409.method2147(var8);
							if (var6.method2144()) {
								field1608[++class89.field892 - 1] = class185.method1043(var4, (byte)-25).method1616(var8, var6.field3158);
							} else {
								field1621[++class293.field2375 - 1] = class185.method1043(var4, (byte)32).method1615(var8, var6.field3154);
							}

							return 1;
						} else if (var0 == 6515) {
							class293.field2375 -= 2;
							var4 = field1621[class293.field2375];
							var8 = field1621[1 + class293.field2375];
							var6 = class409.method2147(var8);
							if (var6.method2144()) {
								field1608[++class89.field892 - 1] = class270.method1424(var4).method1406(var8, var6.field3158);
							} else {
								field1621[++class293.field2375 - 1] = class270.method1424(var4).method1415(var8, var6.field3154);
							}

							return 1;
						} else if (var0 == 6516) {
							class293.field2375 -= 2;
							var4 = field1621[class293.field2375];
							var8 = field1621[1 + class293.field2375];
							var6 = class409.method2147(var8);
							if (var6.method2144()) {
								field1608[++class89.field892 - 1] = class12.method303(var4).method301(var8, var6.field3158);
							} else {
								field1621[++class293.field2375 - 1] = class12.method303(var4).method300(var8, var6.field3154);
							}

							return 1;
						} else if (var0 == 6518) {
							field1621[++class293.field2375 - 1] = Client.field262 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							field1621[++class293.field2375 - 1] = Client.field33;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class89.field892;
							--class293.field2375;
							return 1;
						} else if (var0 == 6523) {
							--class89.field892;
							--class293.field2375;
							return 1;
						} else if (var0 == 6524) {
							field1621[++class293.field2375 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							field1621[++class293.field2375 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							field1621[++class293.field2375 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							field1621[++class293.field2375 - 1] = Client.field45;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field1621[--class293.field2375];
					if (var4 >= 0 && var4 < class516.field4133) {
						var5 = class69.field774[var4];
						field1621[++class293.field2375 - 1] = var5.field4132;
						field1621[++class293.field2375 - 1] = var5.field4128;
						field1608[++class89.field892 - 1] = var5.field4136;
						field1621[++class293.field2375 - 1] = var5.field4137;
						field1621[++class293.field2375 - 1] = var5.field4134;
						field1608[++class89.field892 - 1] = var5.field4135;
					} else {
						field1621[++class293.field2375 - 1] = -1;
						field1621[++class293.field2375 - 1] = 0;
						field1608[++class89.field892 - 1] = "";
						field1621[++class293.field2375 - 1] = 0;
						field1621[++class293.field2375 - 1] = 0;
						field1608[++class89.field892 - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfInfo(name = "be", desc = "(ILdh;ZI)I", opaqueValue = "-670890997")
	static int method967(int var0, class333 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = class401.field3120;
			int var17 = class265.field2147 + (class126.field1164.field1061 >> 7);
			int var13 = (class126.field1164.field1032 >> 7) + class508.field4092;
			Client.method215().method1277(var4, var17, var13, true);
			return 1;
		} else {
			class305 var8;
			if (var0 == 6601) {
				var4 = field1621[--class293.field2375];
				String var16 = "";
				var8 = Client.method215().method1316(var4);
				if (var8 != null) {
					var16 = var8.method1691();
				}

				field1608[++class89.field892 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = field1621[--class293.field2375];
				Client.method215().method1281(var4);
				return 1;
			} else if (var0 == 6603) {
				field1621[++class293.field2375 - 1] = Client.method215().method1292();
				return 1;
			} else if (var0 == 6604) {
				var4 = field1621[--class293.field2375];
				Client.method215().method1290(var4);
				return 1;
			} else if (var0 == 6605) {
				field1621[++class293.field2375 - 1] = Client.method215().method1322() ? 1 : 0;
				return 1;
			} else {
				class50 var15;
				if (var0 == 6606) {
					var15 = new class50(field1621[--class293.field2375]);
					Client.method215().method1294(var15.field581, var15.field583);
					return 1;
				} else if (var0 == 6607) {
					var15 = new class50(field1621[--class293.field2375]);
					Client.method215().method1295(var15.field581, var15.field583);
					return 1;
				} else if (var0 == 6608) {
					var15 = new class50(field1621[--class293.field2375]);
					Client.method215().method1296(var15.field582, var15.field581, var15.field583);
					return 1;
				} else if (var0 == 6609) {
					var15 = new class50(field1621[--class293.field2375]);
					Client.method215().method1297(var15.field582, var15.field581, var15.field583);
					return 1;
				} else if (var0 == 6610) {
					field1621[++class293.field2375 - 1] = Client.method215().method1298();
					field1621[++class293.field2375 - 1] = Client.method215().method1321();
					return 1;
				} else {
					class305 var12;
					if (var0 == 6611) {
						var4 = field1621[--class293.field2375];
						var12 = Client.method215().method1316(var4);
						if (var12 == null) {
							field1621[++class293.field2375 - 1] = 0;
						} else {
							field1621[++class293.field2375 - 1] = var12.method1699().method455();
						}

						return 1;
					} else if (var0 == 6612) {
						var4 = field1621[--class293.field2375];
						var12 = Client.method215().method1316(var4);
						if (null == var12) {
							field1621[++class293.field2375 - 1] = 0;
							field1621[++class293.field2375 - 1] = 0;
						} else {
							field1621[++class293.field2375 - 1] = (var12.method1705() - var12.method1694() + 1) * 64;
							field1621[++class293.field2375 - 1] = (var12.method1701() - var12.method1703() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var4 = field1621[--class293.field2375];
						var12 = Client.method215().method1316(var4);
						if (var12 == null) {
							field1621[++class293.field2375 - 1] = 0;
							field1621[++class293.field2375 - 1] = 0;
							field1621[++class293.field2375 - 1] = 0;
							field1621[++class293.field2375 - 1] = 0;
						} else {
							field1621[++class293.field2375 - 1] = var12.method1694() * 64;
							field1621[++class293.field2375 - 1] = var12.method1703() * 64;
							field1621[++class293.field2375 - 1] = var12.method1705() * 64 + 64 - 1;
							field1621[++class293.field2375 - 1] = var12.method1701() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var4 = field1621[--class293.field2375];
						var12 = Client.method215().method1316(var4);
						if (null == var12) {
							field1621[++class293.field2375 - 1] = -1;
						} else {
							field1621[++class293.field2375 - 1] = var12.method1693();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = Client.method215().method1278();
						if (null == var15) {
							field1621[++class293.field2375 - 1] = -1;
							field1621[++class293.field2375 - 1] = -1;
						} else {
							field1621[++class293.field2375 - 1] = var15.field581;
							field1621[++class293.field2375 - 1] = var15.field583;
						}

						return 1;
					} else if (var0 == 6616) {
						field1621[++class293.field2375 - 1] = Client.method215().method1282();
						return 1;
					} else if (var0 == 6617) {
						var15 = new class50(field1621[--class293.field2375]);
						var12 = Client.method215().method1283();
						if (null == var12) {
							field1621[++class293.field2375 - 1] = -1;
							field1621[++class293.field2375 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method1700(var15.field582, var15.field581, var15.field583);
							if (var11 == null) {
								field1621[++class293.field2375 - 1] = -1;
								field1621[++class293.field2375 - 1] = -1;
							} else {
								field1621[++class293.field2375 - 1] = var11[0];
								field1621[++class293.field2375 - 1] = var11[1];
							}

							return 1;
						}
					} else {
						class50 var6;
						if (var0 == 6618) {
							var15 = new class50(field1621[--class293.field2375]);
							var12 = Client.method215().method1283();
							if (var12 == null) {
								field1621[++class293.field2375 - 1] = -1;
								field1621[++class293.field2375 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method1688(var15.field581, var15.field583);
								if (var6 == null) {
									field1621[++class293.field2375 - 1] = -1;
								} else {
									field1621[++class293.field2375 - 1] = var6.method455();
								}

								return 1;
							}
						} else {
							class50 var9;
							if (var0 == 6619) {
								class293.field2375 -= 2;
								var4 = field1621[class293.field2375];
								var9 = new class50(field1621[1 + class293.field2375]);
								class164.method944(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								class293.field2375 -= 2;
								var4 = field1621[class293.field2375];
								var9 = new class50(field1621[1 + class293.field2375]);
								class164.method944(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								class293.field2375 -= 2;
								var4 = field1621[class293.field2375];
								var9 = new class50(field1621[class293.field2375 + 1]);
								var8 = Client.method215().method1316(var4);
								if (null == var8) {
									field1621[++class293.field2375 - 1] = 0;
									return 1;
								} else {
									field1621[++class293.field2375 - 1] = var8.method1687(var9.field582, var9.field581, var9.field583) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								field1621[++class293.field2375 - 1] = Client.method215().method1300();
								field1621[++class293.field2375 - 1] = Client.method215().method1301();
								return 1;
							} else if (var0 == 6623) {
								var15 = new class50(field1621[--class293.field2375]);
								var12 = Client.method215().method1279(var15.field582, var15.field581, var15.field583);
								if (null == var12) {
									field1621[++class293.field2375 - 1] = -1;
								} else {
									field1621[++class293.field2375 - 1] = var12.method1696();
								}

								return 1;
							} else if (var0 == 6624) {
								Client.method215().method1302(field1621[--class293.field2375]);
								return 1;
							} else if (var0 == 6625) {
								Client.method215().method1303();
								return 1;
							} else if (var0 == 6626) {
								Client.method215().method1304(field1621[--class293.field2375]);
								return 1;
							} else if (var0 == 6627) {
								Client.method215().method1305();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = field1621[--class293.field2375] == 1;
									Client.method215().method1306(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = field1621[--class293.field2375];
									Client.method215().method1288(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = field1621[--class293.field2375];
									Client.method215().method1307(var4);
									return 1;
								} else if (var0 == 6631) {
									Client.method215().method1308();
									return 1;
								} else if (var0 == 6632) {
									var14 = field1621[--class293.field2375] == 1;
									Client.method215().method1309(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										class293.field2375 -= 2;
										var4 = field1621[class293.field2375];
										var10 = field1621[class293.field2375 + 1] == 1;
										Client.method215().method1317(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										class293.field2375 -= 2;
										var4 = field1621[class293.field2375];
										var10 = field1621[class293.field2375 + 1] == 1;
										Client.method215().method1280(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										field1621[++class293.field2375 - 1] = Client.method215().method1310() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = field1621[--class293.field2375];
										field1621[++class293.field2375 - 1] = Client.method215().method1326(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = field1621[--class293.field2375];
										field1621[++class293.field2375 - 1] = Client.method215().method1311(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class293.field2375 -= 2;
										var4 = field1621[class293.field2375];
										var9 = new class50(field1621[1 + class293.field2375]);
										var6 = Client.method215().method1314(var4, var9);
										if (null == var6) {
											field1621[++class293.field2375 - 1] = -1;
										} else {
											field1621[++class293.field2375 - 1] = var6.method455();
										}

										return 1;
									} else {
										class223 var7;
										if (var0 == 6639) {
											var7 = Client.method215().method1273();
											if (null == var7) {
												field1621[++class293.field2375 - 1] = -1;
												field1621[++class293.field2375 - 1] = -1;
											} else {
												field1621[++class293.field2375 - 1] = var7.method1208();
												field1621[++class293.field2375 - 1] = var7.field1939.method455();
											}

											return 1;
										} else if (var0 == 6640) {
											var7 = Client.method215().method1315();
											if (null == var7) {
												field1621[++class293.field2375 - 1] = -1;
												field1621[++class293.field2375 - 1] = -1;
											} else {
												field1621[++class293.field2375 - 1] = var7.method1208();
												field1621[++class293.field2375 - 1] = var7.field1939.method455();
											}

											return 1;
										} else {
											class185 var5;
											if (var0 == 6693) {
												var4 = field1621[--class293.field2375];
												var5 = class185.method1044(var4);
												if (null == var5.field1673) {
													field1608[++class89.field892 - 1] = "";
												} else {
													field1608[++class89.field892 - 1] = var5.field1673;
												}

												return 1;
											} else if (var0 == 6694) {
												var4 = field1621[--class293.field2375];
												var5 = class185.method1044(var4);
												field1621[++class293.field2375 - 1] = var5.field1675;
												return 1;
											} else if (var0 == 6695) {
												var4 = field1621[--class293.field2375];
												var5 = class185.method1044(var4);
												if (var5 == null) {
													field1621[++class293.field2375 - 1] = -1;
												} else {
													field1621[++class293.field2375 - 1] = var5.field1688;
												}

												return 1;
											} else if (var0 == 6696) {
												var4 = field1621[--class293.field2375];
												var5 = class185.method1044(var4);
												if (var5 == null) {
													field1621[++class293.field2375 - 1] = -1;
												} else {
													field1621[++class293.field2375 - 1] = var5.field1671;
												}

												return 1;
											} else if (var0 == 6697) {
												field1621[++class293.field2375 - 1] = class151.field1466.field773;
												return 1;
											} else if (var0 == 6698) {
												field1621[++class293.field2375 - 1] = class151.field1466.field771.method455();
												return 1;
											} else if (var0 == 6699) {
												field1621[++class293.field2375 - 1] = class151.field1466.field772.method455();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(name = "bi", desc = "(ILdh;ZI)I")
	static int method982(int var0, class333 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = field1621[--class293.field2375];
			class395 var7 = class395.method2109(var6);
			field1608[++class89.field892 - 1] = null != var7 ? var7.field3056 : "";
			return 1;
		} else {
			class395 var4;
			if (var0 == 6764) {
				class293.field2375 -= 2;
				var4 = class395.method2109(field1621[class293.field2375]);
				int var5 = field1621[class293.field2375 + 1];
				field1621[++class293.field2375 - 1] = var4.method2100(var5);
				field1621[++class293.field2375 - 1] = var4.method2105(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = class395.method2109(field1621[--class293.field2375]);
				field1621[++class293.field2375 - 1] = null != var4 ? var4.field3080 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfInfo(name = "bz", desc = "(ILdh;ZI)I")
	static int method997(int var0, class333 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = field1621[--class293.field2375];
			class292 var5 = class185.method1043(var4, (byte)104);
			field1608[++class89.field892 - 1] = null != var5 ? var5.field2334 : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "bx", desc = "(ILdh;ZI)I")
	static int method976(int var0, class333 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(name = "bn", desc = "(ILdh;ZI)I")
	static int method970(int var0, class333 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(name = "bw", desc = "(ILdh;ZI)I")
	static int method985(int var0, class333 var1, boolean var2) {
		if (var0 == 7108) {
			field1621[++class293.field2375 - 1] = Client.method275() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "bc", desc = "(ILdh;ZI)I")
	static int method992(int var0, class333 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(name = "cw", desc = "(ILdh;ZI)I")
	static int method972(int var0, class333 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		class328 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					class293.field2375 -= 3;
					var4 = field1621[class293.field2375];
					var21 = field1621[1 + class293.field2375];
					var6 = field1621[class293.field2375 + 2];
					var23 = class316.method1738(var21);
					var8 = class316.method1739(var21);
					int var25 = class316.method1740(var21);
					class360 var26 = class360.method1975(var4);
					class96 var27 = class96.method592(var23);
					int[] var28 = var27.field963[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}

						var13 = var25;
						var14 = var25 + 1;
					}

					Object[] var15 = var26.method1972(var8);
					if (null == var15 && null != var27.field964) {
						var15 = var27.field964[var8];
					}

					int var16;
					int var17;
					if (null == var15) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							class49 var29 = class76.method517(var17);
							if (var29 == class49.field574) {
								field1608[++class89.field892 - 1] = "";
							} else {
								field1621[++class293.field2375 - 1] = class76.method516(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var17 + var28.length * var6;
								class49 var19 = class76.method517(var28[var17]);
								if (var19 == class49.field574) {
									field1608[++class89.field892 - 1] = (String)var15[var18];
								} else {
									field1621[++class293.field2375 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					class293.field2375 -= 2;
					var4 = field1621[class293.field2375];
					var21 = field1621[1 + class293.field2375];
					var6 = 0;
					var23 = class316.method1738(var21);
					var8 = class316.method1739(var21);
					class360 var24 = class360.method1975(var4);
					class96 var10 = class96.method592(var23);
					int[] var11 = var10.field963[var8];
					Object[] var12 = var24.method1972(var8);
					if (null == var12 && null != var10.field964) {
						var12 = var10.field964[var8];
					}

					if (null != var12) {
						var6 = var12.length / var11.length;
					}

					field1621[++class293.field2375 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = field1621[--class293.field2375];
						class360 var22 = class360.method1975(var4);
						field1621[++class293.field2375 - 1] = var22.field2819;
						return 1;
					} else if (var0 == 7506) {
						var4 = field1621[--class293.field2375];
						var21 = -1;
						if (null != class26.field424 && var4 >= 0 && var4 < class26.field424.size()) {
							var21 = (Integer)class26.field424.get(var4);
						}

						field1621[++class293.field2375 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = field1621[--class293.field2375];
						var5 = method1000(var4);
						var6 = field1621[--class293.field2375];
						var7 = Client.method255(var6);
						if (var7 == null) {
							throw new RuntimeException();
						} else if (class316.method1738(var6) != Client.field321) {
							throw new RuntimeException();
						} else if (null == class26.field424 && class26.field424.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = class316.method1740(var6);
							List var9 = var7.method1804(var5, var8);
							class26.field424 = new LinkedList(class26.field424);
							if (var9 != null) {
								class26.field424.retainAll(var9);
							} else {
								class26.field424.clear();
							}

							class124.field1154 = class26.field424.iterator();
							if (var0 == 7507) {
								field1621[++class293.field2375 - 1] = class26.field424.size();
							}

							return 1;
						}
					}
				} else {
					--class293.field2375;
					var4 = field1621[class293.field2375];
					class328 var20 = Client.method274(var4);
					if (var20 == null) {
						throw new RuntimeException();
					} else {
						class26.field424 = var20.method1804(0, 0);
						var6 = 0;
						if (class26.field424 != null) {
							Client.field321 = var4;
							class124.field1154 = class26.field424.iterator();
							var6 = class26.field424.size();
						}

						if (var0 == 7504) {
							field1621[++class293.field2375 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (class124.field1154 != null && class124.field1154.hasNext()) {
					field1621[++class293.field2375 - 1] = (Integer)class124.field1154.next();
				} else {
					field1621[++class293.field2375 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = field1621[--class293.field2375];
			var5 = method1000(var4);
			var6 = field1621[--class293.field2375];
			var7 = Client.method255(var6);
			if (null == var7) {
				throw new RuntimeException();
			} else {
				var8 = class316.method1740(var6);
				class26.field424 = var7.method1804(var5, var8);
				if (null != class26.field424) {
					Client.field321 = class316.method1738(var6);
					class124.field1154 = class26.field424.iterator();
					if (var0 == 7500) {
						field1621[++class293.field2375 - 1] = class26.field424.size();
					}
				} else {
					Client.field321 = -1;
					class124.field1154 = null;
					if (var0 == 7500) {
						field1621[++class293.field2375 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfInfo(name = "cf", desc = "(ILdh;ZI)I")
	static int method993(int var0, class333 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(name = "cm", desc = "(ILdh;ZI)I")
	static int method998(int var0, class333 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 8000) {
			--class293.field2375;
			var4 = field1621[class293.field2375];
			var5 = field1610[var4];
			class330.method1808(field1612[var4], new int[var5], 0, var5 - 1);
			return 1;
		} else if (var0 == 8001) {
			class293.field2375 -= 3;
			var4 = field1621[class293.field2375];
			var5 = field1621[1 + class293.field2375];
			int var6 = field1621[2 + class293.field2375];
			int var7 = field1610[var4];
			if (var7 <= 1) {
				return 1;
			} else {
				class80.method530(field1612[var4], var7, var5, var6);
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfInfo(name = "cn", desc = "(IS)V")
	static void method999(int var0) {
		if (var0 != -1) {
			if (class131.method760(var0)) {
				class131[] var2 = class121.field1142[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					class131 var4 = var2[var3];
					if (null != var4.field1298) {
						class20 var5 = new class20();
						var5.field377 = var4;
						var5.field380 = var4.field1298;
						class412.method2184(var5, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfInfo(name = "cx", desc = "(Ltb;I)Ljava/lang/Object;")
	static Object method996(class49 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field575) {
			case 1:
				return field1621[--class293.field2375];
			case 2:
				return field1608[--class89.field892];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfInfo(name = "cr", desc = "(IB)Ljava/lang/Object;")
	static Object method1000(int var0) {
		return method996((class49)class216.method1198(class49.method452(), var0));
	}
}
