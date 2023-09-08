import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class class221 {

	static boolean field1977;

	static boolean field1983;

	static class265[] field1972;

	static int field1974;

	static int field1980;

	static int[] field1971;

	static int[] field1978;

	static int[] field1982;

	static int[][] field1973;

	static String[] field1969;

	static String[] field1970;

	static ArrayList field1979;

	static Calendar field1975;

	static final double field1981;

	static final String[] field1976;

	static {
		field1971 = new int[5];
		field1973 = new int[5][5000];
		field1982 = new int[1000];
		field1969 = new String[1000];
		field1974 = 0;
		field1972 = new class265[50];
		field1975 = Calendar.getInstance();
		field1976 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		field1983 = false;
		field1977 = false;
		field1979 = new ArrayList();
		field1980 = 0;
		field1981 = Math.log(2.0D);
	}

	class221() throws Throwable {
	}

	public static void method1344(class165 var0) {
		class373.method1986(var0, 500000, 475000);
	}

	static void method1329(class165 var0, class436 var1, int var2, int var3) {
		Object[] var5 = var0.field1667;
		class439.field3437 = 0;
		class421.field3247 = 0;
		int var6 = -1;
		int[] var7 = var1.field3422;
		int[] var8 = var1.field3423;
		byte var9 = -1;
		field1974 = 0;
		field1983 = false;
		boolean var10 = false;
		int var11 = 0;
		boolean var23 = false;
		label836: {
			label837: {
				try {
					int var14;
					try {
						var23 = true;
						class410.field3199 = new int[var1.field3425];
						int var12 = 0;
						field1970 = new String[var1.field3429];
						int var28 = 0;
						int var15;
						String var38;
						for (var14 = 1; var14 < var5.length; ++var14) {
							if (var5[var14] instanceof Integer) {
								var15 = (Integer) var5[var14];
								if (var15 == -2147483647) {
									var15 = var0.field1665;
								}
								if (var15 == -2147483646) {
									var15 = var0.field1668;
								}
								if (var15 == -2147483645) {
									var15 = var0.field1664 != null ? var0.field1664.field2688 : -1;
								}
								if (var15 == -2147483644) {
									var15 = var0.field1669;
								}
								if (var15 == -2147483643) {
									var15 = var0.field1664 != null ? -1714711969 * var0.field1664.field2807 * 1628260767 : -1;
								}
								if (var15 == -2147483642) {
									var15 = var0.field1670 != null ? var0.field1670.field2688 : -1;
								}
								if (var15 == -2147483641) {
									var15 = null != var0.field1670 ? -1714711969 * var0.field1670.field2807 * 1628260767 : -1;
								}
								if (var15 == -2147483640) {
									var15 = var0.field1666;
								}
								if (var15 == -2147483639) {
									var15 = var0.field1672;
								}
								class410.field3199[var12++] = var15;
							} else if (var5[var14] instanceof String) {
								var38 = (String) var5[var14];
								if (var38.equals("event_opbase")) {
									var38 = var0.field1673;
								}
								field1970[var28++] = var38;
							}
						}
						field1980 = var0.field1674;
						while (true) {
							++var11;
							if (var11 > var2) {
								throw new RuntimeException();
							}
							++var6;
							int var26 = var7[var6];
							if (var26 >= 100) {
								boolean var37;
								if (var1.field3423[var6] == 1) {
									var37 = true;
								} else {
									var37 = false;
								}
								var15 = method1324(var26, var1, var37);
								switch(var15) {
									case 0:
										var23 = false;
										break label837;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
								}
							} else if (var26 == 0) {
								field1982[++class439.field3437 - 1] = var8[var6];
							} else if (var26 == 1) {
								var14 = var8[var6];
								field1982[++class439.field3437 - 1] = class410.field3198[var14];
							} else if (var26 == 2) {
								var14 = var8[var6];
								class410.field3198[var14] = field1982[--class439.field3437];
								Client.method554(var14);
							} else if (var26 == 3) {
								field1969[++class421.field3247 - 1] = var1.field3424[var6];
							} else if (var26 == 6) {
								var6 += var8[var6];
							} else if (var26 == 7) {
								class439.field3437 -= 2;
								if (field1982[class439.field3437] != field1982[1 + class439.field3437]) {
									var6 += var8[var6];
								}
							} else if (var26 == 8) {
								class439.field3437 -= 2;
								if (field1982[class439.field3437] == field1982[class439.field3437 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 9) {
								class439.field3437 -= 2;
								if (field1982[class439.field3437] < field1982[class439.field3437 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 10) {
								class439.field3437 -= 2;
								if (field1982[class439.field3437] > field1982[class439.field3437 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 21) {
								if (field1974 == 0) {
									var23 = false;
									break label836;
								}
								class265 var36 = field1972[--field1974];
								var1 = var36.field2177;
								var7 = var1.field3422;
								var8 = var1.field3423;
								var6 = var36.field2180;
								class410.field3199 = var36.field2178;
								field1970 = var36.field2179;
							} else if (var26 == 25) {
								var14 = var8[var6];
								field1982[++class439.field3437 - 1] = class410.method2082(var14);
							} else if (var26 == 27) {
								var14 = var8[var6];
								class513.method2462(var14, field1982[--class439.field3437]);
							} else if (var26 == 31) {
								class439.field3437 -= 2;
								if (field1982[class439.field3437] <= field1982[class439.field3437 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 32) {
								class439.field3437 -= 2;
								if (field1982[class439.field3437] >= field1982[class439.field3437 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 33) {
								field1982[++class439.field3437 - 1] = class410.field3199[var8[var6]];
							} else if (var26 == 34) {
								class410.field3199[var8[var6]] = field1982[--class439.field3437];
							} else if (var26 == 35) {
								field1969[++class421.field3247 - 1] = field1970[var8[var6]];
							} else if (var26 == 36) {
								field1970[var8[var6]] = field1969[--class421.field3247];
							} else if (var26 == 37) {
								var14 = var8[var6];
								class421.field3247 -= var14;
								var38 = class514.method2479(field1969, class421.field3247, var14);
								field1969[++class421.field3247 - 1] = var38;
							} else if (var26 == 38) {
								--class439.field3437;
							} else if (var26 == 39) {
								--class421.field3247;
							} else {
								int var18;
								if (var26 != 40) {
									if (var26 == 42) {
										field1982[++class439.field3437 - 1] = class471.field3719.method1412(var8[var6]);
									} else if (var26 == 43) {
										class471.field3719.method1423(var8[var6], field1982[--class439.field3437]);
									} else if (var26 == 44) {
										var14 = var8[var6] >> 16;
										var15 = var8[var6] & 65535;
										int var29 = field1982[--class439.field3437];
										if (var29 < 0 || var29 > 5000) {
											throw new RuntimeException();
										}
										field1971[var14] = var29;
										byte var32 = -1;
										if (var15 == 105) {
											var32 = 0;
										}
										for (var18 = 0; var18 < var29; ++var18) {
											field1973[var14][var18] = var32;
										}
									} else if (var26 == 45) {
										var14 = var8[var6];
										var15 = field1982[--class439.field3437];
										if (var15 < 0 || var15 >= field1971[var14]) {
											throw new RuntimeException();
										}
										field1982[++class439.field3437 - 1] = field1973[var14][var15];
									} else if (var26 == 46) {
										var14 = var8[var6];
										class439.field3437 -= 2;
										var15 = field1982[class439.field3437];
										if (var15 < 0 || var15 >= field1971[var14]) {
											throw new RuntimeException();
										}
										field1973[var14][var15] = field1982[1 + class439.field3437];
									} else {
										String var30;
										if (var26 == 47) {
											var30 = class471.field3719.method1414(var8[var6]);
											if (var30 == null) {
												var30 = class55.field629;
											}
											field1969[++class421.field3247 - 1] = var30;
										} else if (var26 == 48) {
											class471.field3719.method1419(var8[var6], field1969[--class421.field3247]);
										} else if (var26 == 49) {
											var30 = class471.field3719.method1413(var8[var6]);
											field1969[++class421.field3247 - 1] = var30;
										} else if (var26 == 50) {
											class471.field3719.method1420(var8[var6], field1969[--class421.field3247]);
										} else if (var26 == 60) {
											class419 var33 = var1.field3430[var8[var6]];
											class239 var41 = (class239) var33.method2105((long) field1982[--class439.field3437]);
											if (var41 != null) {
												var6 += var41.field2043;
											}
										} else {
											Integer var34;
											if (var26 == 74) {
												var34 = class320.field2508.method2500(var8[var6]);
												if (var34 == null) {
													field1982[++class439.field3437 - 1] = -1;
												} else {
													field1982[++class439.field3437 - 1] = var34;
												}
											} else {
												if (var26 != 76) {
													throw new IllegalStateException();
												}
												var34 = class225.field1994.method11(var8[var6]);
												if (var34 == null) {
													field1982[++class439.field3437 - 1] = -1;
												} else {
													field1982[++class439.field3437 - 1] = var34;
												}
											}
										}
									}
								} else {
									var14 = var8[var6];
									class436 var40 = class436.method2173(var14);
									int[] var16 = new int[var40.field3425];
									String[] var17 = new String[var40.field3429];
									for (var18 = 0; var18 < var40.field3427; ++var18) {
										var16[var18] = field1982[class439.field3437 - var40.field3427 + var18];
									}
									for (var18 = 0; var18 < var40.field3428; ++var18) {
										var17[var18] = field1969[class421.field3247 - var40.field3428 + var18];
									}
									class439.field3437 -= var40.field3427;
									class421.field3247 -= var40.field3428;
									class265 var35 = new class265();
									var35.field2177 = var1;
									var35.field2180 = var6;
									var35.field2178 = class410.field3199;
									var35.field2179 = field1970;
									field1972[++field1974 - 1] = var35;
									var1 = var40;
									var7 = var40.field3422;
									var8 = var40.field3423;
									var6 = -1;
									class410.field3199 = var16;
									field1970 = var17;
								}
							}
						}
					} catch (Exception var24) {
						var10 = true;
						StringBuilder var13 = new StringBuilder(30);
						var13.append("").append(var1.field785).append(" ");
						var14 = field1974 - 1;
						while (true) {
							if (var14 < 0) {
								var13.append("").append(var9);
								class156.method917(var13.toString(), var24);
								var23 = false;
								break;
							}
							var13.append("").append(field1972[var14].field2177.field785).append(" ");
							--var14;
						}
					}
				} finally {
					if (var23) {
						while (field1979.size() > 0) {
							class298 var20 = (class298) field1979.remove(0);
							Client.method461(var20.method1597(), var20.method1598(), var20.method1596(), var20.method1595(), "");
						}
						if (field1983) {
							field1983 = false;
							Client.method549();
						}
						if (!var10 && var3 > 0 && var11 >= var3) {
							class156.method917("Warning: Script " + var1.field3426 + " finished at op count " + var11 + " of max " + var2, (Throwable) null);
						}
					}
				}
				while (field1979.size() > 0) {
					class298 var27 = (class298) field1979.remove(0);
					Client.method461(var27.method1597(), var27.method1598(), var27.method1596(), var27.method1595(), "");
				}
				if (field1983) {
					field1983 = false;
					Client.method549();
				}
				return;
			}
			while (field1979.size() > 0) {
				class298 var31 = (class298) field1979.remove(0);
				Client.method461(var31.method1597(), var31.method1598(), var31.method1596(), var31.method1595(), "");
			}
			if (field1983) {
				field1983 = false;
				Client.method549();
			}
			if (var3 > 0 && var11 >= var3) {
				class156.method917("Warning: Script " + var1.field3426 + " finished at op count " + var11 + " of max " + var2, (Throwable) null);
			}
			return;
		}
		while (field1979.size() > 0) {
			class298 var39 = (class298) field1979.remove(0);
			Client.method461(var39.method1597(), var39.method1598(), var39.method1596(), var39.method1595(), "");
		}
		if (field1983) {
			field1983 = false;
			Client.method549();
		}
		if (var3 > 0 && var11 >= var3) {
			class156.method917("Warning: Script " + var1.field3426 + " finished at op count " + var11 + " of max " + var2, (Throwable) null);
		}
	}

	static int method1324(int var0, class436 var1, boolean var2) {
		if (var0 < 1000) {
			return method1340(var0, var1, var2);
		} else if (var0 < 1100) {
			return method1312(var0, var1, var2);
		} else if (var0 < 1200) {
			return method1322(var0, var1, var2);
		} else if (var0 < 1300) {
			return method1321(var0, var1, var2);
		} else if (var0 < 1400) {
			return method1307(var0, var1, var2);
		} else if (var0 < 1500) {
			return method1332(var0, var1, var2);
		} else if (var0 < 1600) {
			return method1328(var0, var1, var2);
		} else if (var0 < 1700) {
			return method1342(var0, var1, var2);
		} else if (var0 < 1800) {
			return class57.method228(var0, var1, var2);
		} else if (var0 < 1900) {
			return method1313(var0, var1, var2);
		} else if (var0 < 2000) {
			return method1356(var0, var1, var2);
		} else if (var0 < 2100) {
			return method1312(var0, var1, var2);
		} else if (var0 < 2200) {
			return method1322(var0, var1, var2);
		} else if (var0 < 2300) {
			return method1321(var0, var1, var2);
		} else if (var0 < 2400) {
			return method1307(var0, var1, var2);
		} else if (var0 < 2500) {
			return method1332(var0, var1, var2);
		} else if (var0 < 2600) {
			return method1316(var0, var1, var2);
		} else if (var0 < 2700) {
			return method1350(var0, var1, var2);
		} else if (var0 < 2800) {
			return method1346(var0, var1, var2);
		} else if (var0 < 2900) {
			return method1318(var0, var1, var2);
		} else if (var0 < 3000) {
			return method1356(var0, var1, var2);
		} else if (var0 < 3200) {
			return method1353(var0, var1, var2);
		} else if (var0 < 3300) {
			return method1343(var0, var1, var2);
		} else if (var0 < 3400) {
			return class433.method2166(var0, var1, var2, (byte) -1);
		} else if (var0 < 3500) {
			return method1352(var0, var1, var2);
		} else if (var0 < 3600) {
			return method1339(var0, var1, var2);
		} else if (var0 < 3700) {
			return method1306(var0, var1, var2);
		} else if (var0 < 3800) {
			return method1309(var0, var1, var2);
		} else if (var0 < 3900) {
			return method1311(var0, var1, var2);
		} else if (var0 < 4000) {
			return method1347(var0, var1, var2);
		} else if (var0 < 4100) {
			return method1348(var0, var1, var2);
		} else if (var0 < 4200) {
			return method1315(var0, var1, var2);
		} else if (var0 < 4300) {
			return method1317(var0, var1, var2);
		} else if (var0 < 5100) {
			return method1349(var0, var1, var2);
		} else if (var0 < 5400) {
			return method1333(var0, var1, var2);
		} else if (var0 < 5600) {
			return method1354(var0, var1, var2);
		} else if (var0 < 5700) {
			return method1304(var0, var1, var2);
		} else if (var0 < 6300) {
			return class405.method2066(var0, var1, var2);
		} else if (var0 < 6600) {
			return method1327(var0, var1, var2);
		} else if (var0 < 6700) {
			return method1305(var0, var1, var2);
		} else if (var0 < 6800) {
			return method1320(var0, var1, var2);
		} else if (var0 < 6900) {
			return method1335(var0, var1, var2);
		} else if (var0 < 7000) {
			return method1314(var0, var1, var2);
		} else if (var0 < 7100) {
			return method1308(var0, var1, var2);
		} else if (var0 < 7200) {
			return method1323(var0, var1, var2);
		} else if (var0 < 7300) {
			return method1330(var0, var1, var2);
		} else if (var0 < 7500) {
			return class208.method1259(var0, var1, var2);
		} else if (var0 < 7600) {
			return method1310(var0, var1, var2);
		} else if (var0 < 7700) {
			return method1331(var0, var1, var2);
		} else {
			return var0 < 8100 ? method1336(var0, var1, var2) : 2;
		}
	}

	static int method1340(int var0, class436 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			class439.field3437 -= 3;
			var4 = field1982[class439.field3437];
			var5 = field1982[class439.field3437 + 1];
			int var12 = field1982[2 + class439.field3437];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				class354 var7 = class354.method1860(var4);
				if (null == var7.field2820) {
					var7.field2820 = new class354[var12 + 1];
				}
				if (var7.field2820.length <= var12) {
					class354[] var8 = new class354[var12 + 1];
					for (int var9 = 0; var9 < var7.field2820.length; ++var9) {
						var8[var9] = var7.field2820[var9];
					}
					var7.field2820 = var8;
				}
				if (var12 > 0 && var7.field2820[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					class354 var13 = new class354();
					var13.field2690 = var5;
					var13.field2705 = var13.field2688 = var7.field2688;
					var13.field2807 = var12;
					var13.field2768 = true;
					if (var5 == 12) {
						var13.method1840();
						var13.method1855().method747(new class301(var13));
						var13.method1855().method746(new class385(var13));
					}
					var7.field2820[var12] = var13;
					if (var2) {
						class430.field3370 = var13;
					} else {
						class153.field1593 = var13;
					}
					Client.method532(var7);
					return 1;
				}
			}
		} else {
			class354 var10;
			if (var0 == 101) {
				var10 = var2 ? class430.field3370 : class153.field1593;
				class354 var11 = class354.method1860(var10.field2688);
				var11.field2820[var10.field2807] = null;
				Client.method532(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = class354.method1860(field1982[--class439.field3437]);
				var10.field2820 = null;
				Client.method532(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = class354.method1860(field1982[--class439.field3437]);
					if (null != var10) {
						field1982[++class439.field3437 - 1] = 1;
						if (var2) {
							class430.field3370 = var10;
						} else {
							class153.field1593 = var10;
						}
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else {
					return 2;
				}
			} else {
				class439.field3437 -= 2;
				var4 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				class354 var6 = class354.method1857(var4, var5);
				if (null != var6 && var5 != -1) {
					field1982[++class439.field3437 - 1] = 1;
					if (var2) {
						class430.field3370 = var6;
					} else {
						class153.field1593 = var6;
					}
				} else {
					field1982[++class439.field3437 - 1] = 0;
				}
				return 1;
			}
		}
	}

	static int method1312(int var0, class436 var1, boolean var2) {
		int var4 = -1;
		class354 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = field1982[--class439.field3437];
			var5 = class354.method1860(var4);
		} else {
			var5 = var2 ? class430.field3370 : class153.field1593;
		}
		if (var0 == 1000) {
			class439.field3437 -= 4;
			var5.field2697 = field1982[class439.field3437];
			var5.field2698 = field1982[1 + class439.field3437];
			var5.field2693 = field1982[2 + class439.field3437];
			var5.field2694 = field1982[3 + class439.field3437];
			Client.method532(var5);
			class501.field4023.method422(var5);
			if (var4 != -1 && var5.field2690 == 0) {
				Client.method471(class457.field3488[var4 >> 16], var5, false);
			}
			return 1;
		} else if (var0 == 1001) {
			class439.field3437 -= 4;
			var5.field2699 = field1982[class439.field3437];
			var5.field2700 = field1982[class439.field3437 + 1];
			var5.field2695 = field1982[2 + class439.field3437];
			var5.field2696 = field1982[class439.field3437 + 3];
			Client.method532(var5);
			class501.field4023.method422(var5);
			if (var4 != -1 && var5.field2690 == 0) {
				Client.method471(class457.field3488[var4 >> 16], var5, false);
			}
			return 1;
		} else if (var0 == 1003) {
			boolean var6 = field1982[--class439.field3437] == 1;
			if (var5.field2706 != var6) {
				var5.field2706 = var6;
				Client.method532(var5);
			}
			return 1;
		} else if (var0 == 1005) {
			var5.field2830 = field1982[--class439.field3437] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field2831 = field1982[--class439.field3437] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1322(int var0, class436 var1, boolean var2) {
		int var5 = -1;
		class354 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = field1982[--class439.field3437];
			var4 = class354.method1860(var5);
		} else {
			var4 = var2 ? class430.field3370 : class153.field1593;
		}
		int var14;
		if (var0 == 1100) {
			class439.field3437 -= 2;
			var14 = field1982[class439.field3437];
			int var11 = field1982[1 + class439.field3437];
			if (var4.field2690 == 12) {
				class114 var8 = var4.method1855();
				if (null != var8 && var8.method720(var14, var11)) {
					Client.method532(var4);
				}
			} else {
				var4.field2707 = var14;
				if (var4.field2707 > var4.field2775 - var4.field2703) {
					var4.field2707 = var4.field2775 - var4.field2703;
				}
				if (var4.field2707 < 0) {
					var4.field2707 = 0;
				}
				var4.field2721 = var11;
				if (var4.field2721 > var4.field2710 - var4.field2680) {
					var4.field2721 = var4.field2710 - var4.field2680;
				}
				if (var4.field2721 < 0) {
					var4.field2721 = 0;
				}
				Client.method532(var4);
			}
			return 1;
		} else if (var0 == 1101) {
			var4.field2711 = field1982[--class439.field3437];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1102) {
			var4.field2750 = field1982[--class439.field3437] == 1;
			Client.method532(var4);
			return 1;
		} else if (var0 == 1103) {
			var4.field2709 = field1982[--class439.field3437];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1104) {
			var4.field2719 = field1982[--class439.field3437];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1105) {
			var4.field2774 = field1982[--class439.field3437];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1106) {
			var4.field2724 = field1982[--class439.field3437];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1107) {
			var4.field2725 = field1982[--class439.field3437] == 1;
			Client.method532(var4);
			return 1;
		} else if (var0 == 1108) {
			var4.field2730 = 1;
			var4.field2731 = field1982[--class439.field3437];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1109) {
			class439.field3437 -= 6;
			var4.field2736 = field1982[class439.field3437];
			var4.field2810 = field1982[class439.field3437 + 1];
			var4.field2738 = field1982[class439.field3437 + 2];
			var4.field2756 = field1982[class439.field3437 + 3];
			var4.field2803 = field1982[4 + class439.field3437];
			var4.field2741 = field1982[class439.field3437 + 5];
			Client.method532(var4);
			return 1;
		} else if (var0 == 1110) {
			var14 = field1982[--class439.field3437];
			if (var14 != var4.field2734) {
				var4.field2734 = var14;
				var4.field2818 = 0;
				var4.field2819 = 0;
				Client.method532(var4);
			}
			return 1;
		} else if (var0 == 1111) {
			var4.field2761 = field1982[--class439.field3437] == 1;
			Client.method532(var4);
			return 1;
		} else if (var0 == 1112) {
			String var15 = field1969[--class421.field3247];
			if (!var15.equals(var4.field2748)) {
				var4.field2748 = var15;
				Client.method532(var4);
			}
			return 1;
		} else {
			class114 var9;
			if (var0 == 1113) {
				var4.field2793 = field1982[--class439.field3437];
				if (var4.field2690 == 12) {
					var9 = var4.method1855();
					if (var9 != null) {
						var9.method724();
					}
				}
				Client.method532(var4);
				return 1;
			} else if (var0 == 1114) {
				class439.field3437 -= 3;
				if (var4.field2690 == 12) {
					var9 = var4.method1855();
					if (null != var9) {
						var9.method777(field1982[class439.field3437], field1982[1 + class439.field3437]);
						var9.method721(field1982[2 + class439.field3437]);
					}
				} else {
					var4.field2751 = field1982[class439.field3437];
					var4.field2809 = field1982[class439.field3437 + 1];
					var4.field2784 = field1982[2 + class439.field3437];
				}
				Client.method532(var4);
				return 1;
			} else if (var0 == 1115) {
				var4.field2678 = field1982[--class439.field3437] == 1;
				Client.method532(var4);
				return 1;
			} else if (var0 == 1116) {
				var4.field2726 = field1982[--class439.field3437];
				Client.method532(var4);
				return 1;
			} else if (var0 == 1117) {
				var4.field2727 = field1982[--class439.field3437];
				Client.method532(var4);
				return 1;
			} else if (var0 == 1118) {
				var4.field2728 = field1982[--class439.field3437] == 1;
				Client.method532(var4);
				return 1;
			} else if (var0 == 1119) {
				var4.field2729 = field1982[--class439.field3437] == 1;
				Client.method532(var4);
				return 1;
			} else if (var0 == 1120) {
				class439.field3437 -= 2;
				var4.field2775 = field1982[class439.field3437];
				var4.field2710 = field1982[1 + class439.field3437];
				Client.method532(var4);
				if (var5 != -1 && var4.field2690 == 0) {
					Client.method471(class457.field3488[var5 >> 16], var4, false);
				}
				return 1;
			} else if (var0 == 1121) {
				Client.method598(var4.field2688, var4.field2807);
				Client.field1075 = var4;
				Client.method532(var4);
				return 1;
			} else if (var0 == 1122) {
				var4.field2722 = field1982[--class439.field3437];
				Client.method532(var4);
				return 1;
			} else if (var0 == 1123) {
				var4.field2712 = field1982[--class439.field3437];
				Client.method532(var4);
				return 1;
			} else if (var0 == 1124) {
				var4.field2718 = field1982[--class439.field3437];
				Client.method532(var4);
				return 1;
			} else if (var0 == 1125) {
				var14 = field1982[--class439.field3437];
				class105 var10 = (class105) class433.method2167(class105.method644(), var14);
				if (null != var10) {
					var4.field2716 = var10;
					Client.method532(var4);
				}
				return 1;
			} else {
				boolean var12;
				if (var0 == 1126) {
					var12 = field1982[--class439.field3437] == 1;
					var4.field2720 = var12;
					return 1;
				} else if (var0 == 1127) {
					var12 = field1982[--class439.field3437] == 1;
					var4.field2746 = var12;
					return 1;
				} else if (var0 == 1129) {
					var4.field2723 = field1969[--class421.field3247];
					Client.method532(var4);
					return 1;
				} else if (var0 == 1130) {
					var4.method1853(field1969[--class421.field3247], class28.field142, Client.method494());
					return 1;
				} else if (var0 == 1131) {
					class439.field3437 -= 2;
					var4.method1849(field1982[class439.field3437], field1982[1 + class439.field3437]);
					return 1;
				} else if (var0 == 1132) {
					var4.method1832(field1969[--class421.field3247], field1982[--class439.field3437]);
					return 1;
				} else {
					class452 var13;
					if (var0 == 1133) {
						--class439.field3437;
						var13 = var4.method1841();
						if (var13 != null) {
							var13.field3473 = field1982[class439.field3437];
							Client.method532(var4);
						}
						return 1;
					} else if (var0 == 1134) {
						--class439.field3437;
						var13 = var4.method1841();
						if (var13 != null) {
							var13.field3474 = field1982[class439.field3437];
							Client.method532(var4);
						}
						return 1;
					} else if (var0 == 1135) {
						--class421.field3247;
						var9 = var4.method1855();
						if (null != var9) {
							var4.field2676 = field1969[class421.field3247];
						}
						return 1;
					} else if (var0 == 1136) {
						--class439.field3437;
						var13 = var4.method1841();
						if (null != var13) {
							var13.field3475 = field1982[class439.field3437];
							Client.method532(var4);
						}
						return 1;
					} else if (var0 == 1137) {
						--class439.field3437;
						var9 = var4.method1855();
						if (var9 != null && var9.method717(field1982[class439.field3437])) {
							Client.method532(var4);
						}
						return 1;
					} else if (var0 == 1138) {
						--class439.field3437;
						var9 = var4.method1855();
						if (null != var9 && var9.method718(field1982[class439.field3437])) {
							Client.method532(var4);
						}
						return 1;
					} else if (var0 == 1139) {
						--class439.field3437;
						var9 = var4.method1855();
						if (null != var9 && var9.method785(field1982[class439.field3437])) {
							Client.method532(var4);
						}
						return 1;
					} else {
						class114 var7;
						if (var0 == 1140) {
							var12 = field1982[--class439.field3437] == 1;
							Client.field1137.method1732();
							var7 = var4.method1855();
							if (null != var7 && var7.method712(var12)) {
								if (var12) {
									Client.field1137.method1733(var4);
								}
								Client.method532(var4);
							}
							return 1;
						} else if (var0 == 1141) {
							var12 = field1982[--class439.field3437] == 1;
							if (!var12 && Client.field1137.method1730() == var4) {
								Client.field1137.method1732();
								Client.method532(var4);
							}
							var7 = var4.method1855();
							if (var7 != null) {
								var7.method742(var12);
							}
							return 1;
						} else if (var0 == 1142) {
							class439.field3437 -= 2;
							var9 = var4.method1855();
							if (var9 != null && var9.method731(field1982[class439.field3437], field1982[class439.field3437 + 1])) {
								Client.method532(var4);
							}
							return 1;
						} else if (var0 == 1143) {
							--class439.field3437;
							var9 = var4.method1855();
							if (null != var9 && var9.method731(field1982[class439.field3437], field1982[class439.field3437])) {
								Client.method532(var4);
							}
							return 1;
						} else if (var0 == 1144) {
							--class439.field3437;
							var9 = var4.method1855();
							if (var9 != null) {
								var9.method791(field1982[class439.field3437]);
								Client.method532(var4);
							}
							return 1;
						} else if (var0 == 1145) {
							--class439.field3437;
							var9 = var4.method1855();
							if (var9 != null) {
								var9.method722(field1982[class439.field3437]);
							}
							return 1;
						} else if (var0 == 1146) {
							--class439.field3437;
							var9 = var4.method1855();
							if (null != var9) {
								var9.method772(field1982[class439.field3437]);
							}
							return 1;
						} else if (var0 == 1147) {
							--class439.field3437;
							var9 = var4.method1855();
							if (null != var9) {
								var9.method790(field1982[class439.field3437]);
								Client.method532(var4);
							}
							return 1;
						} else {
							class530 var6;
							if (var0 == 1148) {
								class439.field3437 -= 2;
								var6 = var4.method1831();
								if (null != var6) {
									var6.method2570(field1982[class439.field3437], field1982[class439.field3437 + 1]);
								}
								return 1;
							} else if (var0 == 1149) {
								class439.field3437 -= 2;
								var6 = var4.method1831();
								if (var6 != null) {
									var6.method2573((char) field1982[class439.field3437], field1982[class439.field3437 + 1]);
								}
								return 1;
							} else if (var0 == 1150) {
								var4.method1851(field1969[--class421.field3247], class28.field142);
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

	static int method1321(int var0, class436 var1, boolean var2) {
		class354 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class354.method1860(field1982[--class439.field3437]);
		} else {
			var4 = var2 ? class430.field3370 : class153.field1593;
		}
		Client.method532(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field2730 = 2;
				var4.field2731 = field1982[--class439.field3437];
				return 1;
			} else if (var0 == 1202) {
				var4.field2730 = 3;
				var4.field2731 = class431.field3378.field806.method2450();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = field1982[--class439.field3437] == 1;
				class390.method2026(var4, class431.field3378.field806, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = field1982[--class439.field3437];
				if (var4.field2744 == null) {
					throw new RuntimeException("");
				} else {
					class354.method1856(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				class439.field3437 -= 2;
				var5 = field1982[class439.field3437];
				var6 = field1982[class439.field3437 + 1];
				if (null == var4.field2744) {
					throw new RuntimeException("");
				} else {
					class354.method1859(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = field1982[--class439.field3437];
				if (var4.field2744 == null) {
					throw new RuntimeException("");
				} else {
					class354.method1861(var4, class431.field3378.field806.field4058, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class439.field3437 -= 2;
			var5 = field1982[class439.field3437];
			var6 = field1982[class439.field3437 + 1];
			var4.field2816 = var5;
			var4.field2817 = var6;
			class426 var7 = class426.method2155(var5);
			var4.field2738 = var7.field3289;
			var4.field2756 = var7.field3305;
			var4.field2803 = var7.field3291;
			var4.field2736 = var7.field3290;
			var4.field2810 = var7.field3307;
			var4.field2741 = var7.field3312;
			if (var0 == 1205) {
				var4.field2747 = 0;
			} else if (var0 == 1212 | var7.field3308 == 1) {
				var4.field2747 = 1;
			} else {
				var4.field2747 = 2;
			}
			if (var4.field2742 > 0) {
				var4.field2741 = var4.field2741 * 32 / var4.field2742;
			} else if (var4.field2699 > 0) {
				var4.field2741 = var4.field2741 * 32 / var4.field2699;
			}
			return 1;
		}
	}

	static int method1307(int var0, class436 var1, boolean var2) {
		boolean var4 = true;
		class354 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class354.method1860(field1982[--class439.field3437]);
			var4 = false;
		} else {
			var5 = var2 ? class430.field3370 : class153.field1593;
		}
		int var10;
		if (var0 == 1300) {
			var10 = field1982[--class439.field3437] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method1828(var10, field1969[--class421.field3247]);
				return 1;
			} else {
				--class421.field3247;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var11 = field1982[class439.field3437 + 1];
				var5.field2787 = class354.method1857(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field2769 = field1982[--class439.field3437] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field2701 = field1982[--class439.field3437];
				return 1;
			} else if (var0 == 1304) {
				var5.field2743 = field1982[--class439.field3437];
				return 1;
			} else if (var0 == 1305) {
				var5.field2692 = field1969[--class421.field3247];
				return 1;
			} else if (var0 == 1306) {
				var5.field2770 = field1969[--class421.field3247];
				return 1;
			} else if (var0 == 1307) {
				var5.field2766 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field2832 = field1982[--class439.field3437] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class439.field3437;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					boolean var9;
					if (var0 == 1351) {
						class439.field3437 -= 2;
						var9 = true;
						var7 = new byte[] { (byte) field1982[class439.field3437] };
						byte[] var12 = new byte[] { (byte) field1982[1 + class439.field3437] };
						method1355(var5, 10, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						class439.field3437 -= 3;
						var10 = field1982[class439.field3437] - 1;
						var11 = field1982[class439.field3437 + 1];
						var8 = field1982[2 + class439.field3437];
						if (var10 >= 0 && var10 <= 9) {
							method1325(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = true;
						var11 = field1982[--class439.field3437];
						var8 = field1982[--class439.field3437];
						method1325(var5, 10, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--class439.field3437;
						var10 = field1982[class439.field3437] - 1;
						if (var10 >= 0 && var10 <= 9) {
							method1319(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = true;
						method1319(var5, 10);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						class439.field3437 -= 10;
						for (var8 = 0; var8 < 10 && field1982[class439.field3437 + var8] >= 0; var8 += 2) {
						}
						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];
							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte) field1982[class439.field3437 + var8];
								var7[var8 / 2] = (byte) field1982[1 + class439.field3437 + var8];
							}
						}
					} else {
						class439.field3437 -= 2;
						var6 = new byte[] { (byte) field1982[class439.field3437] };
						var7 = new byte[] { (byte) field1982[1 + class439.field3437] };
					}
					var8 = field1982[--class439.field3437] - 1;
					if (var8 >= 0 && var8 <= 9) {
						method1355(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	static final void method1355(class354 var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2737 == null) {
			if (var2 == null) {
				return;
			}
			var0.field2737 = new byte[11][];
			var0.field2833 = new byte[11][];
			var0.field2763 = new int[11];
			var0.field2764 = new int[11];
		}
		var0.field2737[var1] = var2;
		if (null != var2) {
			var0.field2760 = true;
		} else {
			var0.field2760 = false;
			for (int var5 = 0; var5 < var0.field2737.length; ++var5) {
				if (var0.field2737[var5] != null) {
					var0.field2760 = true;
					break;
				}
			}
		}
		var0.field2833[var1] = var3;
	}

	static final void method1325(class354 var0, int var1, int var2, int var3) {
		if (null == var0.field2763) {
			throw new RuntimeException();
		} else {
			var0.field2763[var1] = var2;
			var0.field2764[var1] = var3;
		}
	}

	static final void method1319(class354 var0, int var1) {
		if (null == var0.field2737) {
			throw new RuntimeException();
		} else {
			if (null == var0.field2829) {
				var0.field2829 = new int[var0.field2737.length];
			}
			var0.field2829[var1] = Integer.MAX_VALUE;
		}
	}

	static int method1332(int var0, class436 var1, boolean var2) {
		class354 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class354.method1860(field1982[--class439.field3437]);
		} else {
			var4 = var2 ? class430.field3370 : class153.field1593;
		}
		String var5 = field1969[--class421.field3247];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = field1982[--class439.field3437];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = field1982[--class439.field3437]) {
				}
			}
			var5 = var5.substring(0, var5.length() - 1);
		}
		Object[] var10 = new Object[var5.length() + 1];
		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = field1969[--class421.field3247];
			} else {
				var10[var8] = new Integer(field1982[--class439.field3437]);
			}
		}
		var8 = field1982[--class439.field3437];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}
		if (var0 == 1400) {
			var4.field2740 = var10;
		} else if (var0 == 1401) {
			var4.field2776 = var10;
		} else if (var0 == 1402) {
			var4.field2773 = var10;
		} else if (var0 == 1403) {
			var4.field2777 = var10;
		} else if (var0 == 1404) {
			var4.field2749 = var10;
		} else if (var0 == 1405) {
			var4.field2780 = var10;
		} else if (var0 == 1406) {
			var4.field2783 = var10;
		} else if (var0 == 1407) {
			var4.field2755 = var10;
			var4.field2785 = var6;
		} else if (var0 == 1408) {
			var4.field2681 = var10;
		} else if (var0 == 1409) {
			var4.field2791 = var10;
		} else if (var0 == 1410) {
			var4.field2781 = var10;
		} else if (var0 == 1411) {
			var4.field2686 = var10;
		} else if (var0 == 1412) {
			var4.field2778 = var10;
		} else if (var0 == 1414) {
			var4.field2786 = var10;
			var4.field2717 = var6;
		} else if (var0 == 1415) {
			var4.field2788 = var10;
			var4.field2789 = var6;
		} else if (var0 == 1416) {
			var4.field2782 = var10;
		} else if (var0 == 1417) {
			var4.field2713 = var10;
		} else if (var0 == 1418) {
			var4.field2679 = var10;
		} else if (var0 == 1419) {
			var4.field2795 = var10;
		} else if (var0 == 1420) {
			var4.field2745 = var10;
		} else if (var0 == 1421) {
			var4.field2799 = var10;
		} else if (var0 == 1422) {
			var4.field2802 = var10;
		} else if (var0 == 1423) {
			var4.field2735 = var10;
		} else if (var0 == 1424) {
			var4.field2767 = var10;
		} else if (var0 == 1425) {
			var4.field2806 = var10;
		} else if (var0 == 1426) {
			var4.field2821 = var10;
		} else if (var0 == 1427) {
			var4.field2682 = var10;
		} else if (var0 == 1428) {
			var4.field2800 = var10;
		} else if (var0 == 1429) {
			var4.field2801 = var10;
		} else if (var0 == 1430) {
			var4.field2805 = var10;
		} else if (var0 == 1431) {
			var4.field2762 = var10;
		} else if (var0 == 1434) {
			var4.field2753 = var10;
		} else if (var0 == 1435) {
			var4.field2792 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}
			class409 var9 = var4.method1842();
			if (var9 != null) {
				if (var0 == 1436) {
					var9.field3194 = var10;
				} else if (var0 == 1437) {
					var9.field3195 = var10;
				} else if (var0 == 1438) {
					var9.field3190 = var10;
				} else if (var0 == 1439) {
					var9.field3192 = var10;
				}
			}
		}
		var4.field2771 = true;
		return 1;
	}

	static int method1328(int var0, class436 var1, boolean var2) {
		class354 var4 = var2 ? class430.field3370 : class153.field1593;
		if (var0 == 1500) {
			field1982[++class439.field3437 - 1] = var4.field2689;
			return 1;
		} else if (var0 == 1501) {
			field1982[++class439.field3437 - 1] = var4.field2702;
			return 1;
		} else if (var0 == 1502) {
			field1982[++class439.field3437 - 1] = var4.field2703;
			return 1;
		} else if (var0 == 1503) {
			field1982[++class439.field3437 - 1] = var4.field2680;
			return 1;
		} else if (var0 == 1504) {
			field1982[++class439.field3437 - 1] = var4.field2706 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			field1982[++class439.field3437 - 1] = var4.field2705;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1342(int var0, class436 var1, boolean var2) {
		class354 var4 = var2 ? class430.field3370 : class153.field1593;
		if (var0 == 1600) {
			field1982[++class439.field3437 - 1] = var4.field2707;
			return 1;
		} else if (var0 == 1601) {
			field1982[++class439.field3437 - 1] = var4.field2721;
			return 1;
		} else {
			class114 var8;
			if (var0 == 1602) {
				if (var4.field2690 == 12) {
					var8 = var4.method1855();
					if (null != var8) {
						field1969[++class421.field3247 - 1] = var8.method774().method1475();
						return 1;
					}
				}
				field1969[++class421.field3247 - 1] = var4.field2748;
				return 1;
			} else if (var0 == 1603) {
				field1982[++class439.field3437 - 1] = var4.field2775;
				return 1;
			} else if (var0 == 1604) {
				field1982[++class439.field3437 - 1] = var4.field2710;
				return 1;
			} else if (var0 == 1605) {
				field1982[++class439.field3437 - 1] = var4.field2741;
				return 1;
			} else if (var0 == 1606) {
				field1982[++class439.field3437 - 1] = var4.field2738;
				return 1;
			} else if (var0 == 1607) {
				field1982[++class439.field3437 - 1] = var4.field2803;
				return 1;
			} else if (var0 == 1608) {
				field1982[++class439.field3437 - 1] = var4.field2756;
				return 1;
			} else if (var0 == 1609) {
				field1982[++class439.field3437 - 1] = var4.field2709;
				return 1;
			} else if (var0 == 1610) {
				field1982[++class439.field3437 - 1] = var4.field2718;
				return 1;
			} else if (var0 == 1611) {
				field1982[++class439.field3437 - 1] = var4.field2711;
				return 1;
			} else if (var0 == 1612) {
				field1982[++class439.field3437 - 1] = var4.field2712;
				return 1;
			} else if (var0 == 1613) {
				field1982[++class439.field3437 - 1] = var4.field2716.method1362();
				return 1;
			} else if (var0 == 1614) {
				field1982[++class439.field3437 - 1] = var4.field2746 ? 1 : 0;
				return 1;
			} else {
				class452 var5;
				if (var0 == 1617) {
					var5 = var4.method1841();
					field1982[++class439.field3437 - 1] = null != var5 ? var5.field3473 : 0;
				}
				if (var0 == 1618) {
					var5 = var4.method1841();
					field1982[++class439.field3437 - 1] = var5 != null ? var5.field3474 : 0;
					return 1;
				} else if (var0 == 1619) {
					var8 = var4.method1855();
					field1969[++class421.field3247 - 1] = var8 != null ? var8.method748().method1475() : "";
					return 1;
				} else if (var0 == 1620) {
					var5 = var4.method1841();
					field1982[++class439.field3437 - 1] = null != var5 ? var5.field3475 : 0;
					return 1;
				} else if (var0 == 1621) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = null != var8 ? var8.method786() : 0;
					return 1;
				} else if (var0 == 1622) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = var8 != null ? var8.method782() : 0;
					return 1;
				} else if (var0 == 1623) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = var8 != null ? var8.method788() : 0;
					return 1;
				} else if (var0 == 1624) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = var8 != null && var8.method750() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var8 = var4.method1855();
						field1969[++class421.field3247 - 1] = var8 != null ? var8.method723().method1210() : "";
						return 1;
					} else if (var0 == 1627) {
						var8 = var4.method1855();
						int var6 = var8 != null ? var8.method753() : 0;
						int var7 = null != var8 ? var8.method752() : 0;
						field1982[++class439.field3437 - 1] = Math.min(var6, var7);
						field1982[++class439.field3437 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 1628) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method752() : 0;
						return 1;
					} else if (var0 == 1629) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method725() : 0;
						return 1;
					} else if (var0 == 1630) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = null != var8 ? var8.method757() : 0;
						return 1;
					} else if (var0 == 1631) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method776() : 0;
						return 1;
					} else if (var0 == 1632) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method719() : 0;
						return 1;
					} else {
						class530 var9;
						if (var0 == 1633) {
							var9 = var4.method1831();
							field1982[class439.field3437 - 1] = var9 != null ? var9.method2567(field1982[class439.field3437 - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var9 = var4.method1831();
							field1982[class439.field3437 - 1] = null != var9 ? var9.method2571((char) field1982[class439.field3437 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = null != var8 && var8.method751() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static int method1341(class354 var0) {
		if (var0.field2690 != 11) {
			--class421.field3247;
			field1982[++class439.field3437 - 1] = -1;
			return 1;
		} else {
			String var2 = field1969[--class421.field3247];
			field1982[++class439.field3437 - 1] = var0.method1834(var2);
			return 1;
		}
	}

	static int method1351(class354 var0) {
		if (var0.field2690 != 11) {
			field1969[class421.field3247 - 1] = "";
			return 1;
		} else {
			String var2 = field1969[--class421.field3247];
			field1969[++class421.field3247 - 1] = var0.method1835(var2);
			return 1;
		}
	}

	static int method1313(int var0, class436 var1, boolean var2) {
		class354 var4 = var2 ? class430.field3370 : class153.field1593;
		if (var0 == 1800) {
			field1982[++class439.field3437 - 1] = class313.method1677(Client.method528(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var4.field2692 == null) {
					field1969[++class421.field3247 - 1] = "";
				} else {
					field1969[++class421.field3247 - 1] = var4.field2692;
				}
				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field1982[--class439.field3437];
			--var5;
			if (null != var4.field2766 && var5 < var4.field2766.length && null != var4.field2766[var5]) {
				field1969[++class421.field3247 - 1] = var4.field2766[var5];
			} else {
				field1969[++class421.field3247 - 1] = "";
			}
			return 1;
		}
	}

	static int method1356(int var0, class436 var1, boolean var2) {
		class354 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? class430.field3370 : class153.field1593;
				var9 = field1982[--class439.field3437];
				if (var9 >= 1 && var9 <= 10) {
					class298 var10 = new class298(var9, var4.field2688, var4.field2807, var4.field2816);
					field1979.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				class439.field3437 -= 3;
				int var8 = field1982[class439.field3437];
				var9 = field1982[class439.field3437 + 1];
				int var6 = field1982[2 + class439.field3437];
				if (var6 >= 1 && var6 <= 10) {
					class298 var7 = new class298(var6, var8, var9, class354.method1860(var8).field2816);
					field1979.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (field1980 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = class354.method1860(field1982[--class439.field3437]);
			} else {
				var4 = var2 ? class430.field3370 : class153.field1593;
			}
			if (null == var4.field2682) {
				return 0;
			} else {
				class165 var5 = new class165();
				var5.field1664 = var4;
				var5.field1667 = var4.field2682;
				var5.field1674 = 1 + field1980;
				Client.field1113.method2222(var5);
				return 1;
			}
		}
	}

	static int method1316(int var0, class436 var1, boolean var2) {
		class354 var4 = class354.method1860(field1982[--class439.field3437]);
		if (var0 == 2500) {
			field1982[++class439.field3437 - 1] = var4.field2689;
			return 1;
		} else if (var0 == 2501) {
			field1982[++class439.field3437 - 1] = var4.field2702;
			return 1;
		} else if (var0 == 2502) {
			field1982[++class439.field3437 - 1] = var4.field2703;
			return 1;
		} else if (var0 == 2503) {
			field1982[++class439.field3437 - 1] = var4.field2680;
			return 1;
		} else if (var0 == 2504) {
			field1982[++class439.field3437 - 1] = var4.field2706 ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			field1982[++class439.field3437 - 1] = var4.field2705;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1350(int var0, class436 var1, boolean var2) {
		class354 var4 = class354.method1860(field1982[--class439.field3437]);
		if (var0 == 2600) {
			field1982[++class439.field3437 - 1] = var4.field2707;
			return 1;
		} else if (var0 == 2601) {
			field1982[++class439.field3437 - 1] = var4.field2721;
			return 1;
		} else if (var0 == 2602) {
			field1969[++class421.field3247 - 1] = var4.field2748;
			return 1;
		} else if (var0 == 2603) {
			field1982[++class439.field3437 - 1] = var4.field2775;
			return 1;
		} else if (var0 == 2604) {
			field1982[++class439.field3437 - 1] = var4.field2710;
			return 1;
		} else if (var0 == 2605) {
			field1982[++class439.field3437 - 1] = var4.field2741;
			return 1;
		} else if (var0 == 2606) {
			field1982[++class439.field3437 - 1] = var4.field2738;
			return 1;
		} else if (var0 == 2607) {
			field1982[++class439.field3437 - 1] = var4.field2803;
			return 1;
		} else if (var0 == 2608) {
			field1982[++class439.field3437 - 1] = var4.field2756;
			return 1;
		} else if (var0 == 2609) {
			field1982[++class439.field3437 - 1] = var4.field2709;
			return 1;
		} else if (var0 == 2610) {
			field1982[++class439.field3437 - 1] = var4.field2718;
			return 1;
		} else if (var0 == 2611) {
			field1982[++class439.field3437 - 1] = var4.field2711;
			return 1;
		} else if (var0 == 2612) {
			field1982[++class439.field3437 - 1] = var4.field2712;
			return 1;
		} else if (var0 == 2613) {
			field1982[++class439.field3437 - 1] = var4.field2716.method1362();
			return 1;
		} else if (var0 == 2614) {
			field1982[++class439.field3437 - 1] = var4.field2746 ? 1 : 0;
			return 1;
		} else {
			class452 var5;
			if (var0 == 2617) {
				var5 = var4.method1841();
				field1982[++class439.field3437 - 1] = var5 != null ? var5.field3473 : 0;
			}
			if (var0 == 2618) {
				var5 = var4.method1841();
				field1982[++class439.field3437 - 1] = null != var5 ? var5.field3474 : 0;
				return 1;
			} else {
				class114 var8;
				if (var0 == 2619) {
					var8 = var4.method1855();
					field1969[++class421.field3247 - 1] = var8 != null ? var8.method748().method1475() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method1841();
					field1982[++class439.field3437 - 1] = var5 != null ? var5.field3475 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = var8 != null ? var8.method786() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = null != var8 ? var8.method782() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = null != var8 ? var8.method788() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = null != var8 && var8.method750() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method1855();
						field1969[++class421.field3247 - 1] = null != var8 ? var8.method723().method1210() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method1855();
						int var6 = null != var8 ? var8.method753() : 0;
						int var7 = null != var8 ? var8.method752() : 0;
						field1982[++class439.field3437 - 1] = Math.min(var6, var7);
						field1982[++class439.field3437 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method752() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method725() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = null != var8 ? var8.method757() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method776() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method1855();
						field1982[++class439.field3437 - 1] = var8 != null ? var8.method719() : 0;
						return 1;
					} else {
						class530 var9;
						if (var0 == 2633) {
							var9 = var4.method1831();
							field1982[class439.field3437 - 1] = null != var9 ? var9.method2567(field1982[class439.field3437 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method1831();
							field1982[class439.field3437 - 1] = null != var9 ? var9.method2571((char) field1982[class439.field3437 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method1855();
					field1982[++class439.field3437 - 1] = var8 != null && var8.method751() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static int method1346(int var0, class436 var1, boolean var2) {
		class354 var4;
		if (var0 == 2700) {
			var4 = class354.method1860(field1982[--class439.field3437]);
			field1982[++class439.field3437 - 1] = var4.field2816;
			return 1;
		} else if (var0 == 2701) {
			var4 = class354.method1860(field1982[--class439.field3437]);
			if (var4.field2816 != -1) {
				field1982[++class439.field3437 - 1] = var4.field2817;
			} else {
				field1982[++class439.field3437 - 1] = 0;
			}
			return 1;
		} else if (var0 == 2702) {
			int var6 = field1982[--class439.field3437];
			class208 var5 = (class208) Client.field919.method2582((long) var6);
			if (var5 != null) {
				field1982[++class439.field3437 - 1] = 1;
			} else {
				field1982[++class439.field3437 - 1] = 0;
			}
			return 1;
		} else if (var0 == 2706) {
			field1982[++class439.field3437 - 1] = Client.field1070;
			return 1;
		} else if (var0 == 2707) {
			var4 = class354.method1860(field1982[--class439.field3437]);
			field1982[++class439.field3437 - 1] = var4.method1852() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = class354.method1860(field1982[--class439.field3437]);
			return method1341(var4);
		} else if (var0 == 2709) {
			var4 = class354.method1860(field1982[--class439.field3437]);
			return method1351(var4);
		} else {
			return 2;
		}
	}

	static int method1318(int var0, class436 var1, boolean var2) {
		class354 var4 = class354.method1860(field1982[--class439.field3437]);
		if (var0 == 2800) {
			field1982[++class439.field3437 - 1] = class313.method1677(Client.method528(var4));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
				if (null == var4.field2692) {
					field1969[++class421.field3247 - 1] = "";
				} else {
					field1969[++class421.field3247 - 1] = var4.field2692;
				}
				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = field1982[--class439.field3437];
			--var5;
			if (var4.field2766 != null && var5 < var4.field2766.length && null != var4.field2766[var5]) {
				field1969[++class421.field3247 - 1] = var4.field2766[var5];
			} else {
				field1969[++class421.field3247 - 1] = "";
			}
			return 1;
		}
	}

	static int method1353(int var0, class436 var1, boolean var2) {
		String var12;
		if (var0 == 3100) {
			var12 = field1969[--class421.field3247];
			class156.method918(0, "", var12);
			return 1;
		} else if (var0 == 3101) {
			class439.field3437 -= 2;
			Client.method601(class431.field3378, field1982[class439.field3437], field1982[class439.field3437 + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!field1977) {
				field1983 = true;
			}
			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var12 = field1969[--class421.field3247];
				var11 = 0;
				if (class514.method2476(var12)) {
					var11 = class514.method2470(var12);
				}
				class457 var15 = class457.method2237(class483.field3884, Client.field963.field1603);
				var15.field3487.method1151(var11);
				Client.field963.method911(var15);
				return 1;
			} else {
				class457 var9;
				if (var0 == 3105) {
					var12 = field1969[--class421.field3247];
					var9 = class457.method2237(class483.field3792, Client.field963.field1603);
					var9.field3487.method1085(var12.length() + 1);
					var9.field3487.method1088(var12);
					Client.field963.method911(var9);
					return 1;
				} else if (var0 == 3106) {
					var12 = field1969[--class421.field3247];
					var9 = class457.method2237(class483.field3888, Client.field963.field1603);
					var9.field3487.method1085(var12.length() + 1);
					var9.field3487.method1088(var12);
					Client.field963.method911(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = field1982[--class439.field3437];
						var5 = field1969[--class421.field3247];
						class171.method993(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						class439.field3437 -= 3;
						var4 = field1982[class439.field3437];
						var11 = field1982[1 + class439.field3437];
						int var14 = field1982[2 + class439.field3437];
						class354 var16 = class354.method1860(var14);
						Client.method535(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						class439.field3437 -= 2;
						var4 = field1982[class439.field3437];
						var11 = field1982[1 + class439.field3437];
						class354 var13 = var2 ? class430.field3370 : class153.field1593;
						Client.method535(var13, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						class349.field2637 = field1982[--class439.field3437] == 1;
						return 1;
					} else if (var0 == 3111) {
						field1982[++class439.field3437 - 1] = class83.field841.method1000() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						class83.field841.method999(field1982[--class439.field3437] == 1);
						return 1;
					} else if (var0 == 3113) {
						var12 = field1969[--class421.field3247];
						boolean var10 = field1982[--class439.field3437] == 1;
						class41.method177(var12, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = field1982[--class439.field3437];
						var9 = class457.method2237(class483.field3881, Client.field963.field1603);
						var9.field3487.method1126(var4);
						Client.field963.method911(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = field1982[--class439.field3437];
						class421.field3247 -= 2;
						var5 = field1969[class421.field3247];
						String var6 = field1969[class421.field3247 + 1];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class457 var7 = class457.method2237(class483.field3812, Client.field963.field1603);
							var7.field3487.method1126(1 + class187.method1159(var5) + class187.method1159(var6));
							var7.field3487.method1088(var6);
							var7.field3487.method1085(var4);
							var7.field3487.method1088(var5);
							Client.field963.method911(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--class439.field3437;
						return 1;
					} else if (var0 == 3118) {
						Client.field1058 = field1982[--class439.field3437] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field1136 = field1982[--class439.field3437] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (field1982[--class439.field3437] == 1) {
							Client.field901 |= 1;
						} else {
							Client.field901 &= -2;
						}
						return 1;
					} else if (var0 == 3121) {
						if (field1982[--class439.field3437] == 1) {
							Client.field901 |= 2;
						} else {
							Client.field901 &= -3;
						}
						return 1;
					} else if (var0 == 3122) {
						if (field1982[--class439.field3437] == 1) {
							Client.field901 |= 4;
						} else {
							Client.field901 &= -5;
						}
						return 1;
					} else if (var0 == 3123) {
						if (field1982[--class439.field3437] == 1) {
							Client.field901 |= 8;
						} else {
							Client.field901 &= -9;
						}
						return 1;
					} else if (var0 == 3124) {
						Client.field901 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field1187 = field1982[--class439.field3437] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field1024 = field1982[--class439.field3437] == 1;
						return 1;
					} else if (var0 == 3127) {
						Client.method446(field1982[--class439.field3437] == 1);
						return 1;
					} else if (var0 == 3128) {
						field1982[++class439.field3437 - 1] = Client.method460() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class439.field3437 -= 2;
						Client.field996 = field1982[class439.field3437];
						Client.field997 = field1982[class439.field3437 + 1];
						return 1;
					} else if (var0 == 3130) {
						class439.field3437 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class439.field3437;
						return 1;
					} else if (var0 == 3132) {
						field1982[++class439.field3437 - 1] = class86.field856;
						field1982[++class439.field3437 - 1] = class271.field2226;
						return 1;
					} else if (var0 == 3133) {
						--class439.field3437;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						class439.field3437 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field912 = 3;
						Client.field1073 = field1982[--class439.field3437];
						return 1;
					} else if (var0 == 3137) {
						Client.field912 = 2;
						Client.field1073 = field1982[--class439.field3437];
						return 1;
					} else if (var0 == 3138) {
						Client.field912 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field912 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field912 = 3;
						Client.field1073 = var2 ? class430.field3370.field2688 : class153.field1593.field2688;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = field1982[--class439.field3437] == 1;
							class83.field841.method1021(var8);
							return 1;
						} else if (var0 == 3142) {
							field1982[++class439.field3437 - 1] = class83.field841.method1004() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = field1982[--class439.field3437] == 1;
							Client.field952 = var8;
							if (!var8) {
								class83.field841.method1011("");
							}
							return 1;
						} else if (var0 == 3144) {
							field1982[++class439.field3437 - 1] = Client.field952 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = field1982[--class439.field3437] == 1;
							class83.field841.method1019(!var8);
							return 1;
						} else if (var0 == 3147) {
							field1982[++class439.field3437 - 1] = class83.field841.method1020() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							field1982[++class439.field3437 - 1] = class174.field1725;
							return 1;
						} else if (var0 == 3154) {
							field1982[++class439.field3437 - 1] = Client.method467();
							return 1;
						} else if (var0 == 3155) {
							--class421.field3247;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class439.field3437 -= 2;
							return 1;
						} else if (var0 == 3158) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class439.field3437;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class439.field3437;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class421.field3247;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class439.field3437;
							field1969[++class421.field3247 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class439.field3437;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class439.field3437 -= 2;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class439.field3437 -= 2;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class439.field3437 -= 2;
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class439.field3437;
							return 1;
						} else if (var0 == 3173) {
							--class439.field3437;
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class439.field3437;
							return 1;
						} else if (var0 == 3175) {
							field1982[++class439.field3437 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class421.field3247;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class421.field3247;
							return 1;
						} else if (var0 == 3181) {
							Client.method448(field1982[--class439.field3437]);
							return 1;
						} else if (var0 == 3182) {
							field1982[++class439.field3437 - 1] = Client.method573();
							return 1;
						} else if (var0 == 3189) {
							var4 = field1982[--class439.field3437];
							Client.method602(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	static int method1343(int var0, class436 var1, boolean var2) {
		if (var0 == 3200) {
			class439.field3437 -= 3;
			Client.method454(field1982[class439.field3437], field1982[1 + class439.field3437], field1982[2 + class439.field3437]);
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			int var13;
			int var16;
			if (var0 == 3201) {
				class439.field3437 -= 5;
				var13 = field1982[class439.field3437];
				var16 = field1982[class439.field3437 + 1];
				var6 = field1982[2 + class439.field3437];
				var7 = field1982[class439.field3437 + 3];
				var8 = field1982[4 + class439.field3437];
				ArrayList var15 = new ArrayList();
				var15.add(var13);
				class81.method328(var15, var16, var6, var7, var8);
				return 1;
			} else if (var0 == 3202) {
				class439.field3437 -= 2;
				Client.method470(field1982[class439.field3437], field1982[1 + class439.field3437]);
				return 1;
			} else {
				class163 var4;
				class368 var5;
				String var12;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var11;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var13 = field1982[--class439.field3437];
							var16 = 0;
							class163 var19 = (class163) class433.method2167(class163.method962(), var13);
							if (var19 != null) {
								var16 = var19 != class163.field1658 ? 1 : 0;
							}
							field1982[++class439.field3437 - 1] = var16;
							return 1;
						} else if (var0 == 3218) {
							var13 = field1982[--class439.field3437];
							var16 = 0;
							class368 var18 = (class368) class433.method2167(class368.method1902(), var13);
							if (var18 != null) {
								var16 = class368.field2941 != var18 ? 1 : 0;
							}
							field1982[++class439.field3437 - 1] = var16;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class439.field3437 -= 2;
								var13 = field1982[class439.field3437];
								var16 = field1982[class439.field3437 + 1];
								class436.method2172(var13, var16);
								return 1;
							} else if (var0 == 3221) {
								class439.field3437 -= 6;
								var13 = field1982[class439.field3437];
								var16 = field1982[1 + class439.field3437];
								var6 = field1982[class439.field3437 + 2];
								var7 = field1982[3 + class439.field3437];
								var8 = field1982[class439.field3437 + 4];
								int var9 = field1982[class439.field3437 + 5];
								ArrayList var10 = new ArrayList();
								var10.add(var13);
								var10.add(var16);
								class81.method328(var10, var6, var7, var8, var9);
								return 1;
							} else if (var0 == 3222) {
								class439.field3437 -= 4;
								var13 = field1982[class439.field3437];
								var16 = field1982[class439.field3437 + 1];
								var6 = field1982[class439.field3437 + 2];
								var7 = field1982[class439.field3437 + 3];
								class388.method2016(var13, var16, var6, var7);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = class163.field1658;
							var5 = class368.field2941;
							var11 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var8 = field1982[--class439.field3437];
								var4 = (class163) class433.method2167(class163.method962(), var8);
								if (var4 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}
							if (var0 == 3219) {
								var8 = field1982[--class439.field3437];
								var5 = (class368) class433.method2167(class368.method1902(), var8);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}
							String var14;
							if (class368.field2941 == var5) {
								switch(var4.field1655) {
									case 1:
									case 2:
									case 3:
										var11 = false;
										var7 = 1;
										break;
									case 4:
										var11 = false;
										var7 = Integer.MAX_VALUE;
										break;
									case 5:
										var11 = false;
										var7 = 100;
										break;
									default:
										var14 = String.format("Unkown device option: %s.", var4.toString());
										throw new RuntimeException(var14);
								}
							} else {
								switch(var5.field2940) {
									case 1:
										var11 = false;
										var7 = 1;
										break;
									case 2:
									case 3:
									case 4:
										var11 = false;
										var7 = 100;
										break;
									default:
										var14 = String.format("Unkown game option: %s.", var5.toString());
										throw new RuntimeException(var14);
								}
							}
							field1982[++class439.field3437 - 1] = 0;
							field1982[++class439.field3437 - 1] = var7;
							return 1;
						}
					} else {
						var4 = class163.field1658;
						var5 = class368.field2941;
						var11 = false;
						if (var0 == 3214) {
							var7 = field1982[--class439.field3437];
							var4 = (class163) class433.method2167(class163.method962(), var7);
							if (null == var4) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var7));
							}
						}
						if (var0 == 3215) {
							var7 = field1982[--class439.field3437];
							var5 = (class368) class433.method2167(class368.method1902(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var7));
							}
						}
						if (var0 == 3210) {
							var7 = field1982[--class439.field3437];
							var4 = (class163) class433.method2167(class163.method962(), var7);
							if (var4 == null) {
								var5 = (class368) class433.method2167(class368.method1902(), var7);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var7));
								}
							}
						} else if (var0 == 3182) {
							var4 = class163.field1654;
						} else if (var0 == 3204) {
							var5 = class368.field2936;
						} else if (var0 == 3206) {
							var5 = class368.field2938;
						} else if (var0 == 3208) {
							var5 = class368.field2942;
						}
						if (class368.field2941 == var5) {
							switch(var4.field1655) {
								case 1:
									var6 = class83.field841.method1004() ? 1 : 0;
									break;
								case 2:
									var6 = class83.field841.method1020() ? 1 : 0;
									break;
								case 3:
									var6 = class83.field841.method1010() ? 1 : 0;
									break;
								case 4:
									var6 = class83.field841.method1006();
									break;
								case 5:
									var6 = Client.method573();
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var4.toString());
									throw new RuntimeException(var12);
							}
						} else {
							switch(var5.field2940) {
								case 1:
									var6 = class83.field841.method1000() ? 1 : 0;
									break;
								case 2:
									var7 = class83.field841.method1001();
									var6 = Math.round((float) (var7 * 100) / 255.0F);
									break;
								case 3:
									var7 = class83.field841.method1009();
									var6 = Math.round((float) (var7 * 100) / 127.0F);
									break;
								case 4:
									var7 = class83.field841.method1027();
									var6 = Math.round((float) (var7 * 100) / 127.0F);
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var5.toString());
									throw new RuntimeException(var12);
							}
						}
						field1982[++class439.field3437 - 1] = var6;
						return 1;
					}
				} else {
					var4 = class163.field1658;
					var5 = class368.field2941;
					var6 = field1982[--class439.field3437];
					if (var0 == 3212) {
						var7 = field1982[--class439.field3437];
						var4 = (class163) class433.method2167(class163.method962(), var7);
						if (null == var4) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}
					if (var0 == 3213) {
						var7 = field1982[--class439.field3437];
						var5 = (class368) class433.method2167(class368.method1902(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}
					if (var0 == 3209) {
						var7 = field1982[--class439.field3437];
						var4 = (class163) class433.method2167(class163.method962(), var7);
						if (var4 == null) {
							var5 = (class368) class433.method2167(class368.method1902(), var7);
							if (null == var5) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3181) {
						var4 = class163.field1654;
					} else if (var0 == 3203) {
						var5 = class368.field2936;
					} else if (var0 == 3205) {
						var5 = class368.field2938;
					} else if (var0 == 3207) {
						var5 = class368.field2942;
					}
					if (class368.field2941 == var5) {
						switch(var4.field1655) {
							case 1:
								class83.field841.method1021(var6 == 1);
								break;
							case 2:
								class83.field841.method1019(var6 == 1);
								break;
							case 3:
								class83.field841.method1002(var6 == 1);
								break;
							case 4:
								if (var6 < 0) {
									var6 = 0;
								}
								class83.field841.method1005(var6);
								break;
							case 5:
								Client.method448(var6);
								break;
							default:
								var12 = String.format("Unkown device option: %s.", var4.toString());
								throw new RuntimeException(var12);
						}
					} else {
						switch(var5.field2940) {
							case 1:
								class83.field841.method999(var6 == 1);
								break;
							case 2:
								var6 = Math.min(Math.max(var6, 0), 100);
								var7 = Math.round((float) (var6 * 255) / 100.0F);
								Client.method553(var7);
								break;
							case 3:
								var6 = Math.min(Math.max(var6, 0), 100);
								var7 = Math.round((float) (var6 * 127) / 100.0F);
								Client.method583(var7);
								break;
							case 4:
								var6 = Math.min(Math.max(var6, 0), 100);
								var7 = Math.round((float) (var6 * 127) / 100.0F);
								Client.method447(var7);
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

	static int method1352(int var0, class436 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			class439.field3437 -= 2;
			var4 = field1982[class439.field3437];
			var5 = field1982[1 + class439.field3437];
			class159 var11 = class159.method930(var4);
			if (var11.field1624 != 's') {
			}
			for (var7 = 0; var7 < var11.field1627; ++var7) {
				if (var11.field1621[var7] == var5) {
					field1969[++class421.field3247 - 1] = var11.field1628[var7];
					var11 = null;
					break;
				}
			}
			if (null != var11) {
				field1969[++class421.field3247 - 1] = var11.field1625;
			}
			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = field1982[--class439.field3437];
				class159 var10 = class159.method930(var4);
				field1982[++class439.field3437 - 1] = var10.method927();
				return 1;
			} else {
				return 2;
			}
		} else {
			class439.field3437 -= 4;
			var4 = field1982[class439.field3437];
			var5 = field1982[class439.field3437 + 1];
			int var6 = field1982[class439.field3437 + 2];
			var7 = field1982[class439.field3437 + 3];
			class159 var8 = class159.method930(var6);
			if (var8.field1623 == var4 && var8.field1624 == var5) {
				for (int var9 = 0; var9 < var8.field1627; ++var9) {
					if (var8.field1621[var9] == var7) {
						if (var5 == 115) {
							field1969[++class421.field3247 - 1] = var8.field1628[var9];
						} else {
							field1982[++class439.field3437 - 1] = var8.field1630[var9];
						}
						var8 = null;
						break;
					}
				}
				if (null != var8) {
					if (var5 == 115) {
						field1969[++class421.field3247 - 1] = var8.field1625;
					} else {
						field1982[++class439.field3437 - 1] = var8.field1622;
					}
				}
				return 1;
			} else {
				if (var5 == 115) {
					field1969[++class421.field3247 - 1] = class55.field629;
				} else {
					field1982[++class439.field3437 - 1] = 0;
				}
				return 1;
			}
		}
	}

	static int method1339(int var0, class436 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1046.method2323(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1046.method2320(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1046.method2318(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1306(int var0, class436 var1, boolean var2) {
		if (var0 == 3600) {
			if (class147.field1555.field1642 == 0) {
				field1982[++class439.field3437 - 1] = -2;
			} else if (class147.field1555.field1642 == 1) {
				field1982[++class439.field3437 - 1] = -1;
			} else {
				field1982[++class439.field3437 - 1] = class147.field1555.field1644.method2285();
			}
			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = field1982[--class439.field3437];
				if (class147.field1555.method939() && var4 >= 0 && var4 < class147.field1555.field1644.method2285()) {
					class175 var9 = (class175) class147.field1555.field1644.method2272(var4);
					field1969[++class421.field3247 - 1] = var9.method1196();
					field1969[++class421.field3247 - 1] = var9.method1197();
				} else {
					field1969[++class421.field3247 - 1] = "";
					field1969[++class421.field3247 - 1] = "";
				}
				return 1;
			} else if (var0 == 3602) {
				var4 = field1982[--class439.field3437];
				if (class147.field1555.method939() && var4 >= 0 && var4 < class147.field1555.field1644.method2285()) {
					field1982[++class439.field3437 - 1] = ((class150) class147.field1555.field1644.method2272(var4)).field1577;
				} else {
					field1982[++class439.field3437 - 1] = 0;
				}
				return 1;
			} else if (var0 == 3603) {
				var4 = field1982[--class439.field3437];
				if (class147.field1555.method939() && var4 >= 0 && var4 < class147.field1555.field1644.method2285()) {
					field1982[++class439.field3437 - 1] = ((class150) class147.field1555.field1644.method2272(var4)).field1578;
				} else {
					field1982[++class439.field3437 - 1] = 0;
				}
				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = field1969[--class421.field3247];
					int var8 = field1982[--class439.field3437];
					class161.method956(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = field1969[--class421.field3247];
					class147.field1555.method945(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = field1969[--class421.field3247];
					class147.field1555.method948(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = field1969[--class421.field3247];
					class147.field1555.method947(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = field1969[--class421.field3247];
					boolean var7 = true;
					class147.field1555.method949(var10, true);
					return 1;
				} else if (var0 == 3609) {
					var10 = field1969[--class421.field3247];
					var10 = Client.method527(var10);
					field1982[++class439.field3437 - 1] = class147.field1555.method943(new UsernameDisplayName(var10, class267.field2198), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (class366.field2930 != null) {
						field1969[++class421.field3247 - 1] = class366.field2930.field135;
					} else {
						field1969[++class421.field3247 - 1] = "";
					}
					return 1;
				} else if (var0 == 3612) {
					if (class366.field2930 != null) {
						field1982[++class439.field3437 - 1] = class366.field2930.method2285();
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 == 3613) {
					var4 = field1982[--class439.field3437];
					if (class366.field2930 != null && var4 < class366.field2930.method2285()) {
						field1969[++class421.field3247 - 1] = class366.field2930.method2272(var4).method1195().method322();
					} else {
						field1969[++class421.field3247 - 1] = "";
					}
					return 1;
				} else if (var0 == 3614) {
					var4 = field1982[--class439.field3437];
					if (class366.field2930 != null && var4 < class366.field2930.method2285()) {
						field1982[++class439.field3437 - 1] = ((class150) class366.field2930.method2272(var4)).method906();
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 == 3615) {
					var4 = field1982[--class439.field3437];
					if (class366.field2930 != null && var4 < class366.field2930.method2285()) {
						field1982[++class439.field3437 - 1] = ((class150) class366.field2930.method2272(var4)).field1578;
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 == 3616) {
					field1982[++class439.field3437 - 1] = class366.field2930 != null ? class366.field2930.field139 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = field1969[--class421.field3247];
					Client.method508(var10);
					return 1;
				} else if (var0 == 3618) {
					field1982[++class439.field3437 - 1] = class366.field2930 != null ? class366.field2930.field140 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = field1969[--class421.field3247];
					Client.method496(var10);
					return 1;
				} else if (var0 == 3620) {
					Client.method475();
					return 1;
				} else if (var0 == 3621) {
					if (!class147.field1555.method939()) {
						field1982[++class439.field3437 - 1] = -1;
					} else {
						field1982[++class439.field3437 - 1] = class147.field1555.field1643.method2285();
					}
					return 1;
				} else if (var0 == 3622) {
					var4 = field1982[--class439.field3437];
					if (class147.field1555.method939() && var4 >= 0 && var4 < class147.field1555.field1643.method2285()) {
						class95 var5 = (class95) class147.field1555.field1643.method2272(var4);
						field1969[++class421.field3247 - 1] = var5.method1196();
						field1969[++class421.field3247 - 1] = var5.method1197();
					} else {
						field1969[++class421.field3247 - 1] = "";
						field1969[++class421.field3247 - 1] = "";
					}
					return 1;
				} else if (var0 == 3623) {
					var10 = field1969[--class421.field3247];
					var10 = Client.method527(var10);
					field1982[++class439.field3437 - 1] = class147.field1555.method944(new UsernameDisplayName(var10, class267.field2198)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = field1982[--class439.field3437];
					if (null != class366.field2930 && var4 < class366.field2930.method2285() && class366.field2930.method2272(var4).method1195().equals(class431.field3378.field822)) {
						field1982[++class439.field3437 - 1] = 1;
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 == 3625) {
					if (null != class366.field2930 && null != class366.field2930.field138) {
						field1969[++class421.field3247 - 1] = class366.field2930.field138;
					} else {
						field1969[++class421.field3247 - 1] = "";
					}
					return 1;
				} else if (var0 == 3626) {
					var4 = field1982[--class439.field3437];
					if (null != class366.field2930 && var4 < class366.field2930.method2285() && ((class65) class366.field2930.method2272(var4)).method287()) {
						field1982[++class439.field3437 - 1] = 1;
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						class147.field1555.field1644.method2284();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class269(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class497(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class102(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class262(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class249(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class202(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class285(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class224(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class394(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class511(var6));
							return 1;
						} else if (var0 == 3639) {
							class147.field1555.field1644.method2286();
							return 1;
						} else if (var0 == 3640) {
							class147.field1555.field1643.method2284();
							return 1;
						} else if (var0 == 3641) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1643.method2277(new class269(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1643.method2277(new class497(var6));
							return 1;
						} else if (var0 == 3643) {
							class147.field1555.field1643.method2286();
							return 1;
						} else if (var0 == 3644) {
							if (null != class366.field2930) {
								class366.field2930.method2284();
							}
							return 1;
						} else if (var0 == 3645) {
							var6 = field1982[--class439.field3437] == 1;
							if (null != class366.field2930) {
								class366.field2930.method2277(new class269(var6));
							}
							return 1;
						} else if (var0 == 3646) {
							var6 = field1982[--class439.field3437] == 1;
							if (null != class366.field2930) {
								class366.field2930.method2277(new class497(var6));
							}
							return 1;
						} else if (var0 == 3647) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class102(var6));
							}
							return 1;
						} else if (var0 == 3648) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class262(var6));
							}
							return 1;
						} else if (var0 == 3649) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class249(var6));
							}
							return 1;
						} else if (var0 == 3650) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class202(var6));
							}
							return 1;
						} else if (var0 == 3651) {
							var6 = field1982[--class439.field3437] == 1;
							if (null != class366.field2930) {
								class366.field2930.method2277(new class285(var6));
							}
							return 1;
						} else if (var0 == 3652) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class224(var6));
							}
							return 1;
						} else if (var0 == 3653) {
							var6 = field1982[--class439.field3437] == 1;
							if (null != class366.field2930) {
								class366.field2930.method2277(new class394(var6));
							}
							return 1;
						} else if (var0 == 3654) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class511(var6));
							}
							return 1;
						} else if (var0 == 3655) {
							if (null != class366.field2930) {
								class366.field2930.method2286();
							}
							return 1;
						} else if (var0 == 3656) {
							var6 = field1982[--class439.field3437] == 1;
							class147.field1555.field1644.method2277(new class177(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = field1982[--class439.field3437] == 1;
							if (class366.field2930 != null) {
								class366.field2930.method2277(new class177(var6));
							}
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field1982[--class439.field3437];
					if (class366.field2930 != null && var4 < class366.field2930.method2285() && ((class65) class366.field2930.method2272(var4)).method288()) {
						field1982[++class439.field3437 - 1] = 1;
					} else {
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				}
			}
		}
	}

	static int method1309(int var0, class436 var1, boolean var2) {
		return 2;
	}

	static int method1311(int var0, class436 var1, boolean var2) {
		if (var0 == 3800) {
			if (class274.field2250 != null) {
				field1982[++class439.field3437 - 1] = 1;
				class320.field2508 = class274.field2250;
			} else {
				field1982[++class439.field3437 - 1] = 0;
			}
			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = field1982[--class439.field3437];
				if (null != Client.field1142[var4]) {
					field1982[++class439.field3437 - 1] = 1;
					class320.field2508 = Client.field1142[var4];
				} else {
					field1982[++class439.field3437 - 1] = 0;
				}
				return 1;
			} else if (var0 == 3802) {
				field1969[++class421.field3247 - 1] = class320.field2508.field4107;
				return 1;
			} else if (var0 == 3803) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4106 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4120;
				return 1;
			} else if (var0 == 3805) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4108;
				return 1;
			} else if (var0 == 3806) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4109;
				return 1;
			} else if (var0 == 3807) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4110;
				return 1;
			} else if (var0 == 3809) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4111;
				return 1;
			} else if (var0 == 3810) {
				var4 = field1982[--class439.field3437];
				field1969[++class421.field3247 - 1] = class320.field2508.field4122[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = field1982[--class439.field3437];
				field1982[++class439.field3437 - 1] = class320.field2508.field4113[var4];
				return 1;
			} else if (var0 == 3812) {
				field1982[++class439.field3437 - 1] = class320.field2508.field4104;
				return 1;
			} else if (var0 == 3813) {
				var4 = field1982[--class439.field3437];
				field1969[++class421.field3247 - 1] = class320.field2508.field4123[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					class439.field3437 -= 3;
					var4 = field1982[class439.field3437];
					var7 = field1982[1 + class439.field3437];
					var6 = field1982[class439.field3437 + 2];
					field1982[++class439.field3437 - 1] = class320.field2508.method2507(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					field1982[++class439.field3437 - 1] = class320.field2508.field4118;
					return 1;
				} else if (var0 == 3816) {
					field1982[++class439.field3437 - 1] = class320.field2508.field4103;
					return 1;
				} else if (var0 == 3817) {
					field1982[++class439.field3437 - 1] = class320.field2508.method2505(field1969[--class421.field3247]);
					return 1;
				} else if (var0 == 3818) {
					field1982[class439.field3437 - 1] = class320.field2508.method2501()[field1982[class439.field3437 - 1]];
					return 1;
				} else if (var0 == 3819) {
					class439.field3437 -= 2;
					var4 = field1982[class439.field3437];
					var7 = field1982[class439.field3437 + 1];
					Client.method580(var7, var4);
					return 1;
				} else if (var0 == 3820) {
					var4 = field1982[--class439.field3437];
					field1982[++class439.field3437 - 1] = class320.field2508.field4116[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						class439.field3437 -= 3;
						var4 = field1982[class439.field3437];
						boolean var5 = field1982[1 + class439.field3437] == 1;
						var6 = field1982[class439.field3437 + 2];
						class365.method1899(var6, var4, var5);
					}
					if (var0 == 3822) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = class320.field2508.field4117[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (null != class141.field1541) {
							field1982[++class439.field3437 - 1] = 1;
							class201.field1888 = class141.field1541;
						} else {
							field1982[++class439.field3437 - 1] = 0;
						}
						return 1;
					} else if (var0 == 3851) {
						var4 = field1982[--class439.field3437];
						if (null != Client.field1143[var4]) {
							field1982[++class439.field3437 - 1] = 1;
							class201.field1888 = Client.field1143[var4];
							class86.field858 = var4;
						} else {
							field1982[++class439.field3437 - 1] = 0;
						}
						return 1;
					} else if (var0 == 3852) {
						field1969[++class421.field3247 - 1] = class201.field1888.field2617;
						return 1;
					} else if (var0 == 3853) {
						field1982[++class439.field3437 - 1] = class201.field1888.field2616;
						return 1;
					} else if (var0 == 3854) {
						field1982[++class439.field3437 - 1] = class201.field1888.field2612;
						return 1;
					} else if (var0 == 3855) {
						field1982[++class439.field3437 - 1] = class201.field1888.method1800();
						return 1;
					} else if (var0 == 3856) {
						var4 = field1982[--class439.field3437];
						field1969[++class421.field3247 - 1] = ((class162) class201.field1888.field2614.get(var4)).field1647.method322();
						return 1;
					} else if (var0 == 3857) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = ((class162) class201.field1888.field2614.get(var4)).field1648;
						return 1;
					} else if (var0 == 3858) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = ((class162) class201.field1888.field2614.get(var4)).field1649;
						return 1;
					} else if (var0 == 3859) {
						var4 = field1982[--class439.field3437];
						Client.method488(class86.field858, var4);
						return 1;
					} else if (var0 == 3860) {
						field1982[++class439.field3437 - 1] = class201.field1888.method1801(field1969[--class421.field3247]);
						return 1;
					} else if (var0 == 3861) {
						field1982[class439.field3437 - 1] = class201.field1888.method1802()[field1982[class439.field3437 - 1]];
						return 1;
					} else if (var0 == 3890) {
						field1982[++class439.field3437 - 1] = null != class225.field1994 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static int method1347(int var0, class436 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1176[var4].method2495();
			return 1;
		} else if (var0 == 3904) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1176[var4].field4094;
			return 1;
		} else if (var0 == 3905) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1176[var4].field4098;
			return 1;
		} else if (var0 == 3906) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1176[var4].field4096;
			return 1;
		} else if (var0 == 3907) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1176[var4].field4097;
			return 1;
		} else if (var0 == 3908) {
			var4 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = Client.field1176[var4].field4093;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = field1982[--class439.field3437];
				var14 = Client.field1176[var4].method2494();
				field1982[++class439.field3437 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = field1982[--class439.field3437];
				var14 = Client.field1176[var4].method2494();
				field1982[++class439.field3437 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = field1982[--class439.field3437];
				var14 = Client.field1176[var4].method2494();
				field1982[++class439.field3437 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = field1982[--class439.field3437];
				var14 = Client.field1176[var4].method2494();
				field1982[++class439.field3437 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = field1982[--class439.field3437] == 1;
					if (class505.field4054 != null) {
						class505.field4054.method2238(class458.field3492, var12);
					}
					return 1;
				} else if (var0 == 3915) {
					var12 = field1982[--class439.field3437] == 1;
					if (null != class505.field4054) {
						class505.field4054.method2238(class458.field3494, var12);
					}
					return 1;
				} else if (var0 == 3916) {
					class439.field3437 -= 2;
					var12 = field1982[class439.field3437] == 1;
					boolean var13 = field1982[1 + class439.field3437] == 1;
					if (null != class505.field4054) {
						Client.field1188.field1895 = var13;
						class505.field4054.method2238(Client.field1188, var12);
					}
					return 1;
				} else if (var0 == 3917) {
					var12 = field1982[--class439.field3437] == 1;
					if (null != class505.field4054) {
						class505.field4054.method2238(class458.field3490, var12);
					}
					return 1;
				} else if (var0 == 3918) {
					var12 = field1982[--class439.field3437] == 1;
					if (null != class505.field4054) {
						class505.field4054.method2238(class458.field3493, var12);
					}
					return 1;
				} else if (var0 == 3919) {
					field1982[++class439.field3437 - 1] = class505.field4054 == null ? 0 : class505.field4054.field3491.size();
					return 1;
				} else {
					class342 var5;
					if (var0 == 3920) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						field1982[++class439.field3437 - 1] = var5.field2601;
						return 1;
					} else if (var0 == 3921) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						field1969[++class421.field3247 - 1] = var5.method1797();
						return 1;
					} else if (var0 == 3922) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						field1969[++class421.field3247 - 1] = var5.method1796();
						return 1;
					} else if (var0 == 3923) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						long var6 = class48.method197() - class259.field2166 - var5.field2599;
						int var8 = (int) (var6 / 3600000L);
						int var9 = (int) ((var6 - (long) (var8 * 3600000)) / 60000L);
						int var10 = (int) ((var6 - (long) (var8 * 3600000) - (long) (var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						field1969[++class421.field3247 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						field1982[++class439.field3437 - 1] = var5.field2597.field4096;
						return 1;
					} else if (var0 == 3925) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						field1982[++class439.field3437 - 1] = var5.field2597.field4098;
						return 1;
					} else if (var0 == 3926) {
						var4 = field1982[--class439.field3437];
						var5 = (class342) class505.field4054.field3491.get(var4);
						field1982[++class439.field3437 - 1] = var5.field2597.field4094;
						return 1;
					} else if (var0 == 3939) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = class426.method2155(var4).field3341 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static int method1348(int var0, class436 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			class439.field3437 -= 2;
			var10 = field1982[class439.field3437];
			var5 = field1982[class439.field3437 + 1];
			field1982[++class439.field3437 - 1] = var10 + var5;
			return 1;
		} else if (var0 == 4001) {
			class439.field3437 -= 2;
			var10 = field1982[class439.field3437];
			var5 = field1982[1 + class439.field3437];
			field1982[++class439.field3437 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			class439.field3437 -= 2;
			var10 = field1982[class439.field3437];
			var5 = field1982[1 + class439.field3437];
			field1982[++class439.field3437 - 1] = var10 * var5;
			return 1;
		} else if (var0 == 4003) {
			class439.field3437 -= 2;
			var10 = field1982[class439.field3437];
			var5 = field1982[1 + class439.field3437];
			field1982[++class439.field3437 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = (int) (Math.random() * (double) var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = field1982[--class439.field3437];
			field1982[++class439.field3437 - 1] = (int) (Math.random() * (double) (var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				class439.field3437 -= 5;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				var6 = field1982[2 + class439.field3437];
				var7 = field1982[class439.field3437 + 3];
				var8 = field1982[class439.field3437 + 4];
				field1982[++class439.field3437 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
				return 1;
			} else if (var0 == 4007) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var5 * var10 / 100 + var10;
				return 1;
			} else if (var0 == 4008) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[1 + class439.field3437];
				field1982[++class439.field3437 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[1 + class439.field3437];
				if (var10 == 0) {
					field1982[++class439.field3437 - 1] = 0;
				} else {
					field1982[++class439.field3437 - 1] = (int) Math.pow((double) var10, (double) var5);
				}
				return 1;
			} else if (var0 == 4013) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				if (var10 == 0) {
					field1982[++class439.field3437 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
						case 0:
							field1982[++class439.field3437 - 1] = Integer.MAX_VALUE;
							break;
						case 1:
							field1982[++class439.field3437 - 1] = var10;
							break;
						case 2:
							field1982[++class439.field3437 - 1] = (int) Math.sqrt((double) var10);
							break;
						case 3:
							field1982[++class439.field3437 - 1] = (int) Math.cbrt((double) var10);
							break;
						case 4:
							field1982[++class439.field3437 - 1] = (int) Math.sqrt(Math.sqrt((double) var10));
							break;
						default:
							field1982[++class439.field3437 - 1] = (int) Math.pow((double) var10, 1.0D / (double) var5);
					}
					return 1;
				}
			} else if (var0 == 4014) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[1 + class439.field3437];
				field1982[++class439.field3437 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				class439.field3437 -= 3;
				long var11 = (long) field1982[class439.field3437];
				long var12 = (long) field1982[1 + class439.field3437];
				long var13 = (long) field1982[class439.field3437 + 2];
				field1982[++class439.field3437 - 1] = (int) (var11 * var13 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = class457.method2236(field1982[--class439.field3437]);
				field1982[++class439.field3437 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[1 + class439.field3437];
				field1982[++class439.field3437 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				class439.field3437 -= 3;
				var10 = field1982[class439.field3437];
				var5 = field1982[1 + class439.field3437];
				var6 = field1982[2 + class439.field3437];
				field1982[++class439.field3437 - 1] = class50.method205(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				class439.field3437 -= 3;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				var6 = field1982[2 + class439.field3437];
				field1982[++class439.field3437 - 1] = class50.method203(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				class439.field3437 -= 3;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				var6 = field1982[class439.field3437 + 2];
				var7 = 31 - var6;
				field1982[++class439.field3437 - 1] = var10 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == 4030) {
				class439.field3437 -= 4;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				var6 = field1982[2 + class439.field3437];
				var7 = field1982[3 + class439.field3437];
				var10 = class50.method203(var10, var6, var7);
				var8 = class50.method201(1 + (var7 - var6));
				if (var5 > var8) {
					var5 = var8;
				}
				field1982[++class439.field3437 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				field1982[class439.field3437 - 1] = class209.method1260(field1982[class439.field3437 - 1]);
				return 1;
			} else if (var0 == 4033) {
				field1982[class439.field3437 - 1] = class209.method1262(field1982[class439.field3437 - 1]);
				return 1;
			} else if (var0 == 4034) {
				class439.field3437 -= 2;
				var10 = field1982[class439.field3437];
				var5 = field1982[class439.field3437 + 1];
				var6 = class209.method1261(var10, var5);
				field1982[++class439.field3437 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				field1982[class439.field3437 - 1] = Math.abs(field1982[class439.field3437 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = field1969[--class421.field3247];
				var5 = -1;
				if (class514.method2476(var4)) {
					var5 = class514.method2470(var4);
				}
				field1982[++class439.field3437 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}

	static int method1315(int var0, class436 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = field1969[--class421.field3247];
			var10 = field1982[--class439.field3437];
			field1969[++class421.field3247 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				class421.field3247 -= 2;
				var4 = field1969[class421.field3247];
				var5 = field1969[1 + class421.field3247];
				field1969[++class421.field3247 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = field1969[--class421.field3247];
				var10 = field1982[--class439.field3437];
				field1969[++class421.field3247 - 1] = var4 + class514.method2466(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = field1969[--class421.field3247];
				field1969[++class421.field3247 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = field1982[--class439.field3437];
					long var16 = 86400000L * ((long) var13 + 11745L);
					field1975.setTime(new Date(var16));
					var7 = field1975.get(5);
					int var18 = field1975.get(2);
					int var9 = field1975.get(1);
					field1969[++class421.field3247 - 1] = var7 + "-" + field1976[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = field1982[--class439.field3437];
						field1969[++class421.field3247 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						class421.field3247 -= 2;
						field1982[++class439.field3437 - 1] = class514.method2475(class476.method2316(field1969[class421.field3247], field1969[1 + class421.field3247], class162.field1645));
						return 1;
					} else {
						int var12;
						byte[] var15;
						class61 var17;
						if (var0 == 4108) {
							var4 = field1969[--class421.field3247];
							class439.field3437 -= 2;
							var10 = field1982[class439.field3437];
							var12 = field1982[1 + class439.field3437];
							var15 = class82.field834.method1762(var12, 0);
							var17 = new class61(var15);
							field1982[++class439.field3437 - 1] = var17.method2388(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = field1969[--class421.field3247];
							class439.field3437 -= 2;
							var10 = field1982[class439.field3437];
							var12 = field1982[1 + class439.field3437];
							var15 = class82.field834.method1762(var12, 0);
							var17 = new class61(var15);
							field1982[++class439.field3437 - 1] = var17.method2409(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							class421.field3247 -= 2;
							var4 = field1969[class421.field3247];
							var5 = field1969[class421.field3247 + 1];
							if (field1982[--class439.field3437] == 1) {
								field1969[++class421.field3247 - 1] = var4;
							} else {
								field1969[++class421.field3247 - 1] = var5;
							}
							return 1;
						} else if (var0 == 4111) {
							var4 = field1969[--class421.field3247];
							field1969[++class421.field3247 - 1] = class500.method2399(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = field1969[--class421.field3247];
							var10 = field1982[--class439.field3437];
							field1969[++class421.field3247 - 1] = var4 + (char) var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = field1982[--class439.field3437];
							field1982[++class439.field3437 - 1] = class514.method2468((char) var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = field1982[--class439.field3437];
							field1982[++class439.field3437 - 1] = class514.method2480((char) var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = field1982[--class439.field3437];
							field1982[++class439.field3437 - 1] = class514.method2474((char) var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = field1982[--class439.field3437];
							field1982[++class439.field3437 - 1] = class414.method2089((char) var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = field1969[--class421.field3247];
							if (null != var4) {
								field1982[++class439.field3437 - 1] = var4.length();
							} else {
								field1982[++class439.field3437 - 1] = 0;
							}
							return 1;
						} else if (var0 == 4118) {
							var4 = field1969[--class421.field3247];
							class439.field3437 -= 2;
							var10 = field1982[class439.field3437];
							var12 = field1982[1 + class439.field3437];
							field1969[++class421.field3247 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = field1969[--class421.field3247];
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
							field1969[++class421.field3247 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = field1969[--class421.field3247];
							var10 = field1982[--class439.field3437];
							field1982[++class439.field3437 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							class421.field3247 -= 2;
							var4 = field1969[class421.field3247];
							var5 = field1969[class421.field3247 + 1];
							var12 = field1982[--class439.field3437];
							field1982[++class439.field3437 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = field1969[--class421.field3247];
							field1969[++class421.field3247 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class421.field3247 -= 3;
							var4 = field1969[class421.field3247];
							var5 = field1969[1 + class421.field3247];
							String var6 = field1969[class421.field3247 + 2];
							if (null == class431.field3378.field806) {
								field1969[++class421.field3247 - 1] = var6;
								return 1;
							} else {
								switch(class431.field3378.field806.field4060) {
									case 0:
										field1969[++class421.field3247 - 1] = var4;
										break;
									case 1:
										field1969[++class421.field3247 - 1] = var5;
										break;
									case 2:
									default:
										field1969[++class421.field3247 - 1] = var6;
								}
								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class421.field3247 -= 2;
					var4 = field1969[class421.field3247];
					var5 = field1969[class421.field3247 + 1];
					if (null != class431.field3378.field806 && class431.field3378.field806.field4058 != 0) {
						field1969[++class421.field3247 - 1] = var5;
					} else {
						field1969[++class421.field3247 - 1] = var4;
					}
					return 1;
				}
			}
		}
	}

	static int method1317(int var0, class436 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = field1982[--class439.field3437];
			field1969[++class421.field3247 - 1] = class426.method2155(var4).field3313;
			return 1;
		} else {
			class426 var6;
			int var7;
			if (var0 == 4201) {
				class439.field3437 -= 2;
				var4 = field1982[class439.field3437];
				var7 = field1982[1 + class439.field3437];
				var6 = class426.method2155(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field3314[var7 - 1] != null) {
					field1969[++class421.field3247 - 1] = var6.field3314[var7 - 1];
				} else {
					field1969[++class421.field3247 - 1] = "";
				}
				return 1;
			} else if (var0 == 4202) {
				class439.field3437 -= 2;
				var4 = field1982[class439.field3437];
				var7 = field1982[1 + class439.field3437];
				var6 = class426.method2155(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field3315[var7 - 1] != null) {
					field1969[++class421.field3247 - 1] = var6.field3315[var7 - 1];
				} else {
					field1969[++class421.field3247 - 1] = "";
				}
				return 1;
			} else if (var0 == 4203) {
				var4 = field1982[--class439.field3437];
				field1982[++class439.field3437 - 1] = class426.method2155(var4).field3309;
				return 1;
			} else if (var0 == 4204) {
				var4 = field1982[--class439.field3437];
				field1982[++class439.field3437 - 1] = class426.method2155(var4).field3308 == 1 ? 1 : 0;
				return 1;
			} else {
				class426 var5;
				if (var0 == 4205) {
					var4 = field1982[--class439.field3437];
					var5 = class426.method2155(var4);
					if (var5.field3304 == -1 && var5.field3331 >= 0) {
						field1982[++class439.field3437 - 1] = var5.field3331;
					} else {
						field1982[++class439.field3437 - 1] = var4;
					}
					return 1;
				} else if (var0 == 4206) {
					var4 = field1982[--class439.field3437];
					var5 = class426.method2155(var4);
					if (var5.field3304 >= 0 && var5.field3331 >= 0) {
						field1982[++class439.field3437 - 1] = var5.field3331;
					} else {
						field1982[++class439.field3437 - 1] = var4;
					}
					return 1;
				} else if (var0 == 4207) {
					var4 = field1982[--class439.field3437];
					field1982[++class439.field3437 - 1] = class426.method2155(var4).field3301 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = field1982[--class439.field3437];
					var5 = class426.method2155(var4);
					if (var5.field3344 == -1 && var5.field3303 >= 0) {
						field1982[++class439.field3437 - 1] = var5.field3303;
					} else {
						field1982[++class439.field3437 - 1] = var4;
					}
					return 1;
				} else if (var0 == 4209) {
					var4 = field1982[--class439.field3437];
					var5 = class426.method2155(var4);
					if (var5.field3344 >= 0 && var5.field3303 >= 0) {
						field1982[++class439.field3437 - 1] = var5.field3303;
					} else {
						field1982[++class439.field3437 - 1] = var4;
					}
					return 1;
				} else if (var0 == 4210) {
					String var8 = field1969[--class421.field3247];
					var7 = field1982[--class439.field3437];
					Client.method522(var8, var7 == 1);
					field1982[++class439.field3437 - 1] = class73.field731;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						class433.field3405 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = field1982[--class439.field3437];
						var7 = class426.method2155(var4).method2148();
						if (var7 == -1) {
							field1982[++class439.field3437 - 1] = var7;
						} else {
							field1982[++class439.field3437 - 1] = var7 + 1;
						}
						return 1;
					} else if (var0 == 4214) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = class426.method2155(var4).field3310;
						return 1;
					} else if (var0 == 4215) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = class426.method2155(var4).field3295;
						return 1;
					} else if (var0 == 4216) {
						var4 = field1982[--class439.field3437];
						field1982[++class439.field3437 - 1] = class426.method2155(var4).field3311;
						return 1;
					} else if (var0 == 4217) {
						var4 = field1982[--class439.field3437];
						var5 = class426.method2155(var4);
						field1982[++class439.field3437 - 1] = var5.field3299;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class379.field3068 != null && class433.field3405 < class73.field731) {
						field1982[++class439.field3437 - 1] = class379.field3068[++class433.field3405 - 1] & '\uffff';
					} else {
						field1982[++class439.field3437 - 1] = -1;
					}
					return 1;
				}
			}
		}
	}

	static int method1349(int var0, class436 var1, boolean var2) {
		if (var0 == 5000) {
			field1982[++class439.field3437 - 1] = Client.field1131;
			return 1;
		} else if (var0 == 5001) {
			class439.field3437 -= 3;
			Client.field1131 = field1982[class439.field3437];
			class339.field2594 = class100.method627(field1982[class439.field3437 + 1]);
			if (null == class339.field2594) {
				class339.field2594 = class100.field1267;
			}
			Client.field1132 = field1982[class439.field3437 + 2];
			class457 var14 = class457.method2237(class483.field3870, Client.field963.field1603);
			var14.field3487.method1085(Client.field1131);
			var14.field3487.method1085(class339.field2594.field1266);
			var14.field3487.method1085(Client.field1132);
			Client.field963.method911(var14);
			return 1;
		} else {
			String var4;
			class457 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = field1969[--class421.field3247];
				class439.field3437 -= 2;
				var9 = field1982[class439.field3437];
				var11 = field1982[class439.field3437 + 1];
				var7 = class457.method2237(class483.field3874, Client.field963.field1603);
				var7.field3487.method1085(class187.method1159(var4) + 2);
				var7.field3487.method1088(var4);
				var7.field3487.method1085(var9 - 1);
				var7.field3487.method1085(var11);
				Client.field963.method911(var7);
				return 1;
			} else {
				class374 var6;
				int var8;
				if (var0 == 5003) {
					class439.field3437 -= 2;
					var8 = field1982[class439.field3437];
					var9 = field1982[1 + class439.field3437];
					var6 = class156.method924(var8, var9);
					if (null != var6) {
						field1982[++class439.field3437 - 1] = var6.field3031;
						field1982[++class439.field3437 - 1] = var6.field3027;
						field1969[++class421.field3247 - 1] = null != var6.field3029 ? var6.field3029 : "";
						field1969[++class421.field3247 - 1] = var6.field3033 != null ? var6.field3033 : "";
						field1969[++class421.field3247 - 1] = var6.field3034 != null ? var6.field3034 : "";
						field1982[++class439.field3437 - 1] = var6.method1993() ? 1 : var6.method1991() ? 2 : 0;
					} else {
						field1982[++class439.field3437 - 1] = -1;
						field1982[++class439.field3437 - 1] = 0;
						field1969[++class421.field3247 - 1] = "";
						field1969[++class421.field3247 - 1] = "";
						field1969[++class421.field3247 - 1] = "";
						field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else {
					class374 var5;
					if (var0 == 5004) {
						var8 = field1982[--class439.field3437];
						var5 = class156.method919(var8);
						if (var5 != null) {
							field1982[++class439.field3437 - 1] = var5.field3028;
							field1982[++class439.field3437 - 1] = var5.field3027;
							field1969[++class421.field3247 - 1] = null != var5.field3029 ? var5.field3029 : "";
							field1969[++class421.field3247 - 1] = null != var5.field3033 ? var5.field3033 : "";
							field1969[++class421.field3247 - 1] = null != var5.field3034 ? var5.field3034 : "";
							field1982[++class439.field3437 - 1] = var5.method1993() ? 1 : var5.method1991() ? 2 : 0;
						} else {
							field1982[++class439.field3437 - 1] = -1;
							field1982[++class439.field3437 - 1] = 0;
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1969[++class421.field3247 - 1] = "";
							field1982[++class439.field3437 - 1] = 0;
						}
						return 1;
					} else if (var0 == 5005) {
						if (null == class339.field2594) {
							field1982[++class439.field3437 - 1] = -1;
						} else {
							field1982[++class439.field3437 - 1] = class339.field2594.field1266;
						}
						return 1;
					} else {
						class457 var12;
						if (var0 == 5008) {
							var4 = field1969[--class421.field3247];
							var9 = field1982[--class439.field3437];
							var12 = class223.method1358(var9, var4, class162.field1645, -1);
							Client.field963.method911(var12);
							return 1;
						} else if (var0 == 5009) {
							class421.field3247 -= 2;
							var4 = field1969[class421.field3247];
							String var10 = field1969[class421.field3247 + 1];
							var12 = class457.method2237(class483.field3875, Client.field963.field1603);
							var12.field3487.method1126(0);
							int var13 = var12.field3487.field1832;
							var12.field3487.method1088(var4);
							class291.method1576(var12.field3487, var10);
							var12.field3487.method1093(var12.field3487.field1832 - var13);
							Client.field963.method911(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = field1969[--class421.field3247];
							class439.field3437 -= 2;
							var9 = field1982[class439.field3437];
							var11 = field1982[class439.field3437 + 1];
							var7 = class223.method1358(var9, var4, class162.field1645, var11);
							Client.field963.method911(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								field1982[++class439.field3437 - 1] = Client.field1132;
								return 1;
							} else if (var0 == 5017) {
								var8 = field1982[--class439.field3437];
								field1982[++class439.field3437 - 1] = class156.method922(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = field1982[--class439.field3437];
								field1982[++class439.field3437 - 1] = class156.method923(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = field1982[--class439.field3437];
								field1982[++class439.field3437 - 1] = class156.method921(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = field1969[--class421.field3247];
								class240.method1411(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field926 = field1969[--class421.field3247].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								field1969[++class421.field3247 - 1] = Client.field926;
								return 1;
							} else if (var0 == 5023) {
								var4 = field1969[--class421.field3247];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								class439.field3437 -= 2;
								var8 = field1982[class439.field3437];
								var9 = field1982[class439.field3437 + 1];
								var6 = class156.method924(var8, var9);
								if (var6 != null) {
									field1982[++class439.field3437 - 1] = var6.field3031;
									field1982[++class439.field3437 - 1] = var6.field3027;
									field1969[++class421.field3247 - 1] = var6.field3029 != null ? var6.field3029 : "";
									field1969[++class421.field3247 - 1] = var6.field3033 != null ? var6.field3033 : "";
									field1969[++class421.field3247 - 1] = null != var6.field3034 ? var6.field3034 : "";
									field1982[++class439.field3437 - 1] = var6.method1993() ? 1 : var6.method1991() ? 2 : 0;
									field1969[++class421.field3247 - 1] = "";
									field1982[++class439.field3437 - 1] = 0;
								} else {
									field1982[++class439.field3437 - 1] = -1;
									field1982[++class439.field3437 - 1] = 0;
									field1969[++class421.field3247 - 1] = "";
									field1969[++class421.field3247 - 1] = "";
									field1969[++class421.field3247 - 1] = "";
									field1982[++class439.field3437 - 1] = 0;
									field1969[++class421.field3247 - 1] = "";
									field1982[++class439.field3437 - 1] = 0;
								}
								return 1;
							} else if (var0 == 5031) {
								var8 = field1982[--class439.field3437];
								var5 = class156.method919(var8);
								if (var5 != null) {
									field1982[++class439.field3437 - 1] = var5.field3028;
									field1982[++class439.field3437 - 1] = var5.field3027;
									field1969[++class421.field3247 - 1] = null != var5.field3029 ? var5.field3029 : "";
									field1969[++class421.field3247 - 1] = var5.field3033 != null ? var5.field3033 : "";
									field1969[++class421.field3247 - 1] = null != var5.field3034 ? var5.field3034 : "";
									field1982[++class439.field3437 - 1] = var5.method1993() ? 1 : var5.method1991() ? 2 : 0;
									field1969[++class421.field3247 - 1] = "";
									field1982[++class439.field3437 - 1] = 0;
								} else {
									field1982[++class439.field3437 - 1] = -1;
									field1982[++class439.field3437 - 1] = 0;
									field1969[++class421.field3247 - 1] = "";
									field1969[++class421.field3247 - 1] = "";
									field1969[++class421.field3247 - 1] = "";
									field1982[++class439.field3437 - 1] = 0;
									field1969[++class421.field3247 - 1] = "";
									field1982[++class439.field3437 - 1] = 0;
								}
								return 1;
							} else {
								return 2;
							}
						} else {
							if (null != class431.field3378 && null != class431.field3378.field822) {
								var4 = class431.field3378.field822.method322();
							} else {
								var4 = "";
							}
							field1969[++class421.field3247 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	static int method1333(int var0, class436 var1, boolean var2) {
		if (var0 == 5306) {
			field1982[++class439.field3437 - 1] = Client.method531();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = field1982[--class439.field3437];
				if (var4 == 1 || var4 == 2) {
					class328.method1729(var4);
				}
				return 1;
			} else if (var0 == 5308) {
				field1982[++class439.field3437 - 1] = class83.field841.method1015();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--class439.field3437;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = field1982[--class439.field3437];
				if (var4 == 1 || var4 == 2) {
					class83.field841.method1014(var4);
				}
				return 1;
			}
		}
	}

	static int method1354(int var0, class436 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			class439.field3437 -= 2;
			var4 = field1982[class439.field3437];
			int var5 = field1982[class439.field3437 + 1];
			if (!Client.field1159) {
				Client.field937 = var4;
				Client.field1076 = var5;
			}
			return 1;
		} else if (var0 == 5505) {
			field1982[++class439.field3437 - 1] = Client.field937;
			return 1;
		} else if (var0 == 5506) {
			field1982[++class439.field3437 - 1] = Client.field1076;
			return 1;
		} else if (var0 == 5530) {
			var4 = field1982[--class439.field3437];
			if (var4 < 0) {
				var4 = 0;
			}
			Client.field992 = var4;
			return 1;
		} else if (var0 == 5531) {
			field1982[++class439.field3437 - 1] = Client.field992;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1304(int var0, class436 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field951 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1326(int var0) {
		return (int) Math.pow(2.0D, (double) (7.0F + (float) var0 / 256.0F));
	}

	static int method1345(int var0) {
		return (int) ((Math.log((double) var0) / field1981 - 7.0D) * 256.0D);
	}

	static int method1327(int var0, class436 var1, boolean var2) {
		if (var0 == 6500) {
			field1982[++class439.field3437 - 1] = class192.method1187() ? 1 : 0;
			return 1;
		} else {
			class192 var9;
			if (var0 == 6501) {
				var9 = class192.method1184();
				if (var9 != null) {
					field1982[++class439.field3437 - 1] = var9.field1844;
					field1982[++class439.field3437 - 1] = var9.field1840;
					field1969[++class421.field3247 - 1] = var9.field1848;
					field1982[++class439.field3437 - 1] = var9.field1849;
					field1982[++class439.field3437 - 1] = var9.field1846;
					field1969[++class421.field3247 - 1] = var9.field1847;
				} else {
					field1982[++class439.field3437 - 1] = -1;
					field1982[++class439.field3437 - 1] = 0;
					field1969[++class421.field3247 - 1] = "";
					field1982[++class439.field3437 - 1] = 0;
					field1982[++class439.field3437 - 1] = 0;
					field1969[++class421.field3247 - 1] = "";
				}
				return 1;
			} else if (var0 == 6502) {
				var9 = class192.method1191();
				if (var9 != null) {
					field1982[++class439.field3437 - 1] = var9.field1844;
					field1982[++class439.field3437 - 1] = var9.field1840;
					field1969[++class421.field3247 - 1] = var9.field1848;
					field1982[++class439.field3437 - 1] = var9.field1849;
					field1982[++class439.field3437 - 1] = var9.field1846;
					field1969[++class421.field3247 - 1] = var9.field1847;
				} else {
					field1982[++class439.field3437 - 1] = -1;
					field1982[++class439.field3437 - 1] = 0;
					field1969[++class421.field3247 - 1] = "";
					field1982[++class439.field3437 - 1] = 0;
					field1982[++class439.field3437 - 1] = 0;
					field1969[++class421.field3247 - 1] = "";
				}
				return 1;
			} else {
				int var4;
				class192 var5;
				int var11;
				if (var0 == 6506) {
					var4 = field1982[--class439.field3437];
					var5 = null;
					for (var11 = 0; var11 < class192.field1845; ++var11) {
						if (var4 == class253.field2125[var11].field1844) {
							var5 = class253.field2125[var11];
							break;
						}
					}
					if (var5 != null) {
						field1982[++class439.field3437 - 1] = var5.field1844;
						field1982[++class439.field3437 - 1] = var5.field1840;
						field1969[++class421.field3247 - 1] = var5.field1848;
						field1982[++class439.field3437 - 1] = var5.field1849;
						field1982[++class439.field3437 - 1] = var5.field1846;
						field1969[++class421.field3247 - 1] = var5.field1847;
					} else {
						field1982[++class439.field3437 - 1] = -1;
						field1982[++class439.field3437 - 1] = 0;
						field1969[++class421.field3247 - 1] = "";
						field1982[++class439.field3437 - 1] = 0;
						field1982[++class439.field3437 - 1] = 0;
						field1969[++class421.field3247 - 1] = "";
					}
					return 1;
				} else if (var0 == 6507) {
					class439.field3437 -= 4;
					var4 = field1982[class439.field3437];
					boolean var10 = field1982[class439.field3437 + 1] == 1;
					var11 = field1982[class439.field3437 + 2];
					boolean var7 = field1982[class439.field3437 + 3] == 1;
					class192.method1189(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field1056 = field1982[--class439.field3437] == 1;
						return 1;
					} else {
						class408 var6;
						int var8;
						if (var0 == 6513) {
							class439.field3437 -= 2;
							var4 = field1982[class439.field3437];
							var8 = field1982[1 + class439.field3437];
							var6 = class408.method2081(var8);
							if (var6.method2078()) {
								field1969[++class421.field3247 - 1] = class314.method1695(var4).method1692(var8, var6.field3187);
							} else {
								field1982[++class439.field3437 - 1] = class314.method1695(var4).method1694(var8, var6.field3183);
							}
							return 1;
						} else if (var0 == 6514) {
							class439.field3437 -= 2;
							var4 = field1982[class439.field3437];
							var8 = field1982[class439.field3437 + 1];
							var6 = class408.method2081(var8);
							if (var6.method2078()) {
								field1969[++class421.field3247 - 1] = class319.method1705(var4, (byte) -25).method1895(var8, var6.field3187);
							} else {
								field1982[++class439.field3437 - 1] = class319.method1705(var4, (byte) 32).method1894(var8, var6.field3183);
							}
							return 1;
						} else if (var0 == 6515) {
							class439.field3437 -= 2;
							var4 = field1982[class439.field3437];
							var8 = field1982[1 + class439.field3437];
							var6 = class408.method2081(var8);
							if (var6.method2078()) {
								field1969[++class421.field3247 - 1] = class426.method2155(var4).method2137(var8, var6.field3187);
							} else {
								field1982[++class439.field3437 - 1] = class426.method2155(var4).method2146(var8, var6.field3183);
							}
							return 1;
						} else if (var0 == 6516) {
							class439.field3437 -= 2;
							var4 = field1982[class439.field3437];
							var8 = field1982[1 + class439.field3437];
							var6 = class408.method2081(var8);
							if (var6.method2078()) {
								field1969[++class421.field3247 - 1] = class91.method609(var4).method607(var8, var6.field3187);
							} else {
								field1982[++class439.field3437 - 1] = class91.method609(var4).method606(var8, var6.field3183);
							}
							return 1;
						} else if (var0 == 6518) {
							field1982[++class439.field3437 - 1] = Client.field1133 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							field1982[++class439.field3437 - 1] = Client.field904;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class421.field3247;
							--class439.field3437;
							return 1;
						} else if (var0 == 6523) {
							--class421.field3247;
							--class439.field3437;
							return 1;
						} else if (var0 == 6524) {
							field1982[++class439.field3437 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							field1982[++class439.field3437 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							field1982[++class439.field3437 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							field1982[++class439.field3437 - 1] = Client.field916;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = field1982[--class439.field3437];
					if (var4 >= 0 && var4 < class192.field1845) {
						var5 = class253.field2125[var4];
						field1982[++class439.field3437 - 1] = var5.field1844;
						field1982[++class439.field3437 - 1] = var5.field1840;
						field1969[++class421.field3247 - 1] = var5.field1848;
						field1982[++class439.field3437 - 1] = var5.field1849;
						field1982[++class439.field3437 - 1] = var5.field1846;
						field1969[++class421.field3247 - 1] = var5.field1847;
					} else {
						field1982[++class439.field3437 - 1] = -1;
						field1982[++class439.field3437 - 1] = 0;
						field1969[++class421.field3247 - 1] = "";
						field1982[++class439.field3437 - 1] = 0;
						field1982[++class439.field3437 - 1] = 0;
						field1969[++class421.field3247 - 1] = "";
					}
					return 1;
				}
			}
		}
	}

	static int method1305(int var0, class436 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = class121.field1436;
			int var17 = class346.field2624 + (class431.field3378.field272 >> 7);
			int var13 = (class431.field3378.field243 >> 7) + class211.field1922;
			Client.method534().method1617(var4, var17, var13, true);
			return 1;
		} else {
			class277 var8;
			if (var0 == 6601) {
				var4 = field1982[--class439.field3437];
				String var16 = "";
				var8 = Client.method534().method1656(var4);
				if (var8 != null) {
					var16 = var8.method1538();
				}
				field1969[++class421.field3247 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = field1982[--class439.field3437];
				Client.method534().method1621(var4);
				return 1;
			} else if (var0 == 6603) {
				field1982[++class439.field3437 - 1] = Client.method534().method1632();
				return 1;
			} else if (var0 == 6604) {
				var4 = field1982[--class439.field3437];
				Client.method534().method1630(var4);
				return 1;
			} else if (var0 == 6605) {
				field1982[++class439.field3437 - 1] = Client.method534().method1662() ? 1 : 0;
				return 1;
			} else {
				class402 var15;
				if (var0 == 6606) {
					var15 = new class402(field1982[--class439.field3437]);
					Client.method534().method1634(var15.field3174, var15.field3176);
					return 1;
				} else if (var0 == 6607) {
					var15 = new class402(field1982[--class439.field3437]);
					Client.method534().method1635(var15.field3174, var15.field3176);
					return 1;
				} else if (var0 == 6608) {
					var15 = new class402(field1982[--class439.field3437]);
					Client.method534().method1636(var15.field3175, var15.field3174, var15.field3176);
					return 1;
				} else if (var0 == 6609) {
					var15 = new class402(field1982[--class439.field3437]);
					Client.method534().method1637(var15.field3175, var15.field3174, var15.field3176);
					return 1;
				} else if (var0 == 6610) {
					field1982[++class439.field3437 - 1] = Client.method534().method1638();
					field1982[++class439.field3437 - 1] = Client.method534().method1661();
					return 1;
				} else {
					class277 var12;
					if (var0 == 6611) {
						var4 = field1982[--class439.field3437];
						var12 = Client.method534().method1656(var4);
						if (var12 == null) {
							field1982[++class439.field3437 - 1] = 0;
						} else {
							field1982[++class439.field3437 - 1] = var12.method1546().method2063();
						}
						return 1;
					} else if (var0 == 6612) {
						var4 = field1982[--class439.field3437];
						var12 = Client.method534().method1656(var4);
						if (null == var12) {
							field1982[++class439.field3437 - 1] = 0;
							field1982[++class439.field3437 - 1] = 0;
						} else {
							field1982[++class439.field3437 - 1] = (var12.method1552() - var12.method1541() + 1) * 64;
							field1982[++class439.field3437 - 1] = (var12.method1548() - var12.method1550() + 1) * 64;
						}
						return 1;
					} else if (var0 == 6613) {
						var4 = field1982[--class439.field3437];
						var12 = Client.method534().method1656(var4);
						if (var12 == null) {
							field1982[++class439.field3437 - 1] = 0;
							field1982[++class439.field3437 - 1] = 0;
							field1982[++class439.field3437 - 1] = 0;
							field1982[++class439.field3437 - 1] = 0;
						} else {
							field1982[++class439.field3437 - 1] = var12.method1541() * 64;
							field1982[++class439.field3437 - 1] = var12.method1550() * 64;
							field1982[++class439.field3437 - 1] = var12.method1552() * 64 + 64 - 1;
							field1982[++class439.field3437 - 1] = var12.method1548() * 64 + 64 - 1;
						}
						return 1;
					} else if (var0 == 6614) {
						var4 = field1982[--class439.field3437];
						var12 = Client.method534().method1656(var4);
						if (null == var12) {
							field1982[++class439.field3437 - 1] = -1;
						} else {
							field1982[++class439.field3437 - 1] = var12.method1540();
						}
						return 1;
					} else if (var0 == 6615) {
						var15 = Client.method534().method1618();
						if (null == var15) {
							field1982[++class439.field3437 - 1] = -1;
							field1982[++class439.field3437 - 1] = -1;
						} else {
							field1982[++class439.field3437 - 1] = var15.field3174;
							field1982[++class439.field3437 - 1] = var15.field3176;
						}
						return 1;
					} else if (var0 == 6616) {
						field1982[++class439.field3437 - 1] = Client.method534().method1622();
						return 1;
					} else if (var0 == 6617) {
						var15 = new class402(field1982[--class439.field3437]);
						var12 = Client.method534().method1623();
						if (null == var12) {
							field1982[++class439.field3437 - 1] = -1;
							field1982[++class439.field3437 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method1547(var15.field3175, var15.field3174, var15.field3176);
							if (var11 == null) {
								field1982[++class439.field3437 - 1] = -1;
								field1982[++class439.field3437 - 1] = -1;
							} else {
								field1982[++class439.field3437 - 1] = var11[0];
								field1982[++class439.field3437 - 1] = var11[1];
							}
							return 1;
						}
					} else {
						class402 var6;
						if (var0 == 6618) {
							var15 = new class402(field1982[--class439.field3437]);
							var12 = Client.method534().method1623();
							if (var12 == null) {
								field1982[++class439.field3437 - 1] = -1;
								field1982[++class439.field3437 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method1535(var15.field3174, var15.field3176);
								if (var6 == null) {
									field1982[++class439.field3437 - 1] = -1;
								} else {
									field1982[++class439.field3437 - 1] = var6.method2063();
								}
								return 1;
							}
						} else {
							class402 var9;
							if (var0 == 6619) {
								class439.field3437 -= 2;
								var4 = field1982[class439.field3437];
								var9 = new class402(field1982[1 + class439.field3437]);
								class236.method1385(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								class439.field3437 -= 2;
								var4 = field1982[class439.field3437];
								var9 = new class402(field1982[1 + class439.field3437]);
								class236.method1385(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								class439.field3437 -= 2;
								var4 = field1982[class439.field3437];
								var9 = new class402(field1982[class439.field3437 + 1]);
								var8 = Client.method534().method1656(var4);
								if (null == var8) {
									field1982[++class439.field3437 - 1] = 0;
									return 1;
								} else {
									field1982[++class439.field3437 - 1] = var8.method1534(var9.field3175, var9.field3174, var9.field3176) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								field1982[++class439.field3437 - 1] = Client.method534().method1640();
								field1982[++class439.field3437 - 1] = Client.method534().method1641();
								return 1;
							} else if (var0 == 6623) {
								var15 = new class402(field1982[--class439.field3437]);
								var12 = Client.method534().method1619(var15.field3175, var15.field3174, var15.field3176);
								if (null == var12) {
									field1982[++class439.field3437 - 1] = -1;
								} else {
									field1982[++class439.field3437 - 1] = var12.method1543();
								}
								return 1;
							} else if (var0 == 6624) {
								Client.method534().method1642(field1982[--class439.field3437]);
								return 1;
							} else if (var0 == 6625) {
								Client.method534().method1643();
								return 1;
							} else if (var0 == 6626) {
								Client.method534().method1644(field1982[--class439.field3437]);
								return 1;
							} else if (var0 == 6627) {
								Client.method534().method1645();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = field1982[--class439.field3437] == 1;
									Client.method534().method1646(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = field1982[--class439.field3437];
									Client.method534().method1628(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = field1982[--class439.field3437];
									Client.method534().method1647(var4);
									return 1;
								} else if (var0 == 6631) {
									Client.method534().method1648();
									return 1;
								} else if (var0 == 6632) {
									var14 = field1982[--class439.field3437] == 1;
									Client.method534().method1649(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										class439.field3437 -= 2;
										var4 = field1982[class439.field3437];
										var10 = field1982[class439.field3437 + 1] == 1;
										Client.method534().method1657(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										class439.field3437 -= 2;
										var4 = field1982[class439.field3437];
										var10 = field1982[class439.field3437 + 1] == 1;
										Client.method534().method1620(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										field1982[++class439.field3437 - 1] = Client.method534().method1650() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = field1982[--class439.field3437];
										field1982[++class439.field3437 - 1] = Client.method534().method1666(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = field1982[--class439.field3437];
										field1982[++class439.field3437 - 1] = Client.method534().method1651(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class439.field3437 -= 2;
										var4 = field1982[class439.field3437];
										var9 = new class402(field1982[1 + class439.field3437]);
										var6 = Client.method534().method1654(var4, var9);
										if (null == var6) {
											field1982[++class439.field3437 - 1] = -1;
										} else {
											field1982[++class439.field3437 - 1] = var6.method2063();
										}
										return 1;
									} else {
										class234 var7;
										if (var0 == 6639) {
											var7 = Client.method534().method1613();
											if (null == var7) {
												field1982[++class439.field3437 - 1] = -1;
												field1982[++class439.field3437 - 1] = -1;
											} else {
												field1982[++class439.field3437 - 1] = var7.method1371();
												field1982[++class439.field3437 - 1] = var7.field2023.method2063();
											}
											return 1;
										} else if (var0 == 6640) {
											var7 = Client.method534().method1655();
											if (null == var7) {
												field1982[++class439.field3437 - 1] = -1;
												field1982[++class439.field3437 - 1] = -1;
											} else {
												field1982[++class439.field3437 - 1] = var7.method1371();
												field1982[++class439.field3437 - 1] = var7.field2023.method2063();
											}
											return 1;
										} else {
											class319 var5;
											if (var0 == 6693) {
												var4 = field1982[--class439.field3437];
												var5 = class319.method1706(var4);
												if (null == var5.field2487) {
													field1969[++class421.field3247 - 1] = "";
												} else {
													field1969[++class421.field3247 - 1] = var5.field2487;
												}
												return 1;
											} else if (var0 == 6694) {
												var4 = field1982[--class439.field3437];
												var5 = class319.method1706(var4);
												field1982[++class439.field3437 - 1] = var5.field2489;
												return 1;
											} else if (var0 == 6695) {
												var4 = field1982[--class439.field3437];
												var5 = class319.method1706(var4);
												if (var5 == null) {
													field1982[++class439.field3437 - 1] = -1;
												} else {
													field1982[++class439.field3437 - 1] = var5.field2502;
												}
												return 1;
											} else if (var0 == 6696) {
												var4 = field1982[--class439.field3437];
												var5 = class319.method1706(var4);
												if (var5 == null) {
													field1982[++class439.field3437 - 1] = -1;
												} else {
													field1982[++class439.field3437 - 1] = var5.field2485;
												}
												return 1;
											} else if (var0 == 6697) {
												field1982[++class439.field3437 - 1] = class204.field1894.field1544;
												return 1;
											} else if (var0 == 6698) {
												field1982[++class439.field3437 - 1] = class204.field1894.field1542.method2063();
												return 1;
											} else if (var0 == 6699) {
												field1982[++class439.field3437 - 1] = class204.field1894.field1543.method2063();
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

	static int method1320(int var0, class436 var1, boolean var2) {
		if (var0 == 6754) {
			int var6 = field1982[--class439.field3437];
			class314 var7 = class314.method1695(var6);
			field1969[++class421.field3247 - 1] = null != var7 ? var7.field2439 : "";
			return 1;
		} else {
			class314 var4;
			if (var0 == 6764) {
				class439.field3437 -= 2;
				var4 = class314.method1695(field1982[class439.field3437]);
				int var5 = field1982[class439.field3437 + 1];
				field1982[++class439.field3437 - 1] = var4.method1686(var5);
				field1982[++class439.field3437 - 1] = var4.method1691(var5);
				return 1;
			} else if (var0 == 6765) {
				var4 = class314.method1695(field1982[--class439.field3437]);
				field1982[++class439.field3437 - 1] = null != var4 ? var4.field2463 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	static int method1335(int var0, class436 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = field1982[--class439.field3437];
			class362 var5 = class319.method1705(var4, (byte) 104);
			field1969[++class421.field3247 - 1] = null != var5 ? var5.field2878 : "";
			return 1;
		} else {
			return 2;
		}
	}

	static int method1314(int var0, class436 var1, boolean var2) {
		return 2;
	}

	static int method1308(int var0, class436 var1, boolean var2) {
		return 2;
	}

	static int method1323(int var0, class436 var1, boolean var2) {
		if (var0 == 7108) {
			field1982[++class439.field3437 - 1] = Client.method594() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	static int method1330(int var0, class436 var1, boolean var2) {
		return 2;
	}

	static int method1310(int var0, class436 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		class80 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					class439.field3437 -= 3;
					var4 = field1982[class439.field3437];
					var21 = field1982[1 + class439.field3437];
					var6 = field1982[class439.field3437 + 2];
					var23 = class128.method853(var21);
					var8 = class128.method854(var21);
					int var25 = class128.method855(var21);
					class289 var26 = class289.method1570(var4);
					class251 var27 = class251.method1441(var23);
					int[] var28 = var27.field2122[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}
						var13 = var25;
						var14 = var25 + 1;
					}
					Object[] var15 = var26.method1567(var8);
					if (null == var15 && null != var27.field2123) {
						var15 = var27.field2123[var8];
					}
					int var16;
					int var17;
					if (null == var15) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							class272 var29 = class367.method1901(var17);
							if (var29 == class272.field2229) {
								field1969[++class421.field3247 - 1] = "";
							} else {
								field1982[++class439.field3437 - 1] = class367.method1900(var17);
							}
						}
						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var17 + var28.length * var6;
								class272 var19 = class367.method1901(var28[var17]);
								if (var19 == class272.field2229) {
									field1969[++class421.field3247 - 1] = (String) var15[var18];
								} else {
									field1982[++class439.field3437 - 1] = (Integer) var15[var18];
								}
							}
							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					class439.field3437 -= 2;
					var4 = field1982[class439.field3437];
					var21 = field1982[1 + class439.field3437];
					var6 = 0;
					var23 = class128.method853(var21);
					var8 = class128.method854(var21);
					class289 var24 = class289.method1570(var4);
					class251 var10 = class251.method1441(var23);
					int[] var11 = var10.field2122[var8];
					Object[] var12 = var24.method1567(var8);
					if (null == var12 && null != var10.field2123) {
						var12 = var10.field2123[var8];
					}
					if (null != var12) {
						var6 = var12.length / var11.length;
					}
					field1982[++class439.field3437 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = field1982[--class439.field3437];
						class289 var22 = class289.method1570(var4);
						field1982[++class439.field3437 - 1] = var22.field2331;
						return 1;
					} else if (var0 == 7506) {
						var4 = field1982[--class439.field3437];
						var21 = -1;
						if (null != class29.field146 && var4 >= 0 && var4 < class29.field146.size()) {
							var21 = (Integer) class29.field146.get(var4);
						}
						field1982[++class439.field3437 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = field1982[--class439.field3437];
						var5 = method1338(var4);
						var6 = field1982[--class439.field3437];
						var7 = Client.method574(var6);
						if (var7 == null) {
							throw new RuntimeException();
						} else if (class128.method853(var6) != Client.field1192) {
							throw new RuntimeException();
						} else if (null == class29.field146 && class29.field146.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = class128.method855(var6);
							List var9 = var7.method325(var5, var8);
							class29.field146 = new LinkedList(class29.field146);
							if (var9 != null) {
								class29.field146.retainAll(var9);
							} else {
								class29.field146.clear();
							}
							class496.field3990 = class29.field146.iterator();
							if (var0 == 7507) {
								field1982[++class439.field3437 - 1] = class29.field146.size();
							}
							return 1;
						}
					}
				} else {
					--class439.field3437;
					var4 = field1982[class439.field3437];
					class80 var20 = Client.method593(var4);
					if (var20 == null) {
						throw new RuntimeException();
					} else {
						class29.field146 = var20.method325(0, 0);
						var6 = 0;
						if (class29.field146 != null) {
							Client.field1192 = var4;
							class496.field3990 = class29.field146.iterator();
							var6 = class29.field146.size();
						}
						if (var0 == 7504) {
							field1982[++class439.field3437 - 1] = var6;
						}
						return 1;
					}
				}
			} else {
				if (class496.field3990 != null && class496.field3990.hasNext()) {
					field1982[++class439.field3437 - 1] = (Integer) class496.field3990.next();
				} else {
					field1982[++class439.field3437 - 1] = -1;
				}
				return 1;
			}
		} else {
			var4 = field1982[--class439.field3437];
			var5 = method1338(var4);
			var6 = field1982[--class439.field3437];
			var7 = Client.method574(var6);
			if (null == var7) {
				throw new RuntimeException();
			} else {
				var8 = class128.method855(var6);
				class29.field146 = var7.method325(var5, var8);
				if (null != class29.field146) {
					Client.field1192 = class128.method853(var6);
					class496.field3990 = class29.field146.iterator();
					if (var0 == 7500) {
						field1982[++class439.field3437 - 1] = class29.field146.size();
					}
				} else {
					Client.field1192 = -1;
					class496.field3990 = null;
					if (var0 == 7500) {
						field1982[++class439.field3437 - 1] = 0;
					}
				}
				return 1;
			}
		}
	}

	static int method1331(int var0, class436 var1, boolean var2) {
		return 2;
	}

	static int method1336(int var0, class436 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 8000) {
			--class439.field3437;
			var4 = field1982[class439.field3437];
			var5 = field1971[var4];
			class295.method1592(field1973[var4], new int[var5], 0, var5 - 1);
			return 1;
		} else if (var0 == 8001) {
			class439.field3437 -= 3;
			var4 = field1982[class439.field3437];
			var5 = field1982[1 + class439.field3437];
			int var6 = field1982[2 + class439.field3437];
			int var7 = field1971[var4];
			if (var7 <= 1) {
				return 1;
			} else {
				class355.method1866(field1973[var4], var7, var5, var6);
				return 1;
			}
		} else {
			return 2;
		}
	}

	static void method1337(int var0) {
		if (var0 != -1) {
			if (class354.method1864(var0)) {
				class354[] var2 = class457.field3488[var0];
				for (int var3 = 0; var3 < var2.length; ++var3) {
					class354 var4 = var2[var3];
					if (null != var4.field2772) {
						class165 var5 = new class165();
						var5.field1664 = var4;
						var5.field1667 = var4.field2772;
						class373.method1986(var5, 5000000, 0);
					}
				}
			}
		}
	}

	static Object method1334(class272 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field2230) {
				case 1:
					return field1982[--class439.field3437];
				case 2:
					return field1969[--class421.field3247];
				default:
					throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	static Object method1338(int var0) {
		return method1334((class272) class433.method2167(class272.method1518(), var0));
	}
}
