import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "af")
public class class312 implements class425 {
	@ObfInfo(name = "ae", desc = "Laf;")
	public static final class312 field2532;
	@ObfInfo(name = "au", desc = "Laf;")
	public static final class312 field2533;
	@ObfInfo(name = "ox", desc = "Lcz;")
	static class152 field2539;
	@ObfInfo(name = "gq", desc = "Ljava/lang/String;")
	static String field2540;
	@ObfInfo(name = "at", desc = "Laf;")
	static final class312 field2534;
	@ObfInfo(name = "ac", desc = "Laf;")
	static final class312 field2535;
	@ObfInfo(name = "ao", desc = "Laf;")
	static final class312 field2536;
	@ObfInfo(name = "aa", desc = "Z")
	boolean field2538;
	@ObfInfo(name = "ap", desc = "Z")
	boolean field2541;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1495438921)
	int field2531;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	String field2537;

	static {
		field2533 = new class312(0, "POST", true, true);
		field2532 = new class312(1, "GET", true, false);
		field2536 = new class312(2, "PUT", false, true);
		field2534 = new class312(3, "PATCH", false, true);
		field2535 = new class312(4, "DELETE", false, true);
	}

	@ObfInfo(name = "<init>", desc = "(ILjava/lang/String;ZZ)V")
	class312(int var1, String var2, boolean var3, boolean var4) {
		this.field2531 = var1;
		this.field2537 = var2;
		this.field2541 = var3;
		this.field2538 = var4;
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	boolean method1728() {
		return this.field2541;
	}

	@ObfInfo(name = "ao", desc = "(I)Ljava/lang/String;")
	public String method1726() {
		return this.field2537;
	}

	@ObfInfo(name = "at", desc = "(I)Z")
	boolean method1727() {
		return this.field2538;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field2531;
	}

	@ObfInfo(name = "ml", desc = "([Lmi;IIIIIIIB)V", opaqueValue = "0")
	static final void method1729(class131[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class131 var10 = var0[var9];
			if (null != var10 && var1 == var10.field1231 && (var10.method725() || Client.method209(var10) != 0 || var10 == Client.field230)) {
				if (var10.field1294) {
					if (Client.method186(var10)) {
						continue;
					}
				} else if (var10.field1216 == 0 && class220.field1934 != var10 && Client.method186(var10)) {
					continue;
				}

				if (var10.field1216 == 11) {
					if (var10.method746(class248.field2079)) {
						if (var10.method748()) {
							Client.method213(var10);
							Client.method152(var10.field1346, var10, true);
						}

						if (var10.field1279 != null) {
							class20 var11 = new class20();
							var11.field377 = var10;
							var11.field380 = var10.field1279;
							Client.field242.method631(var11);
						}
					}
				} else if (var10.field1216 == 12 && var10.method740()) {
					Client.method213(var10);
				}

				int var27 = var10.field1215 + var6;
				int var12 = var7 + var10.field1228;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var10.field1216 == 9) {
					var17 = var27;
					var18 = var12;
					var19 = var27 + var10.field1229;
					int var20 = var10.field1206 + var12;
					if (var19 < var27) {
						var17 = var19;
						var19 = var27;
					}

					if (var20 < var12) {
						var18 = var20;
						var20 = var12;
					}

					++var19;
					++var20;
					var13 = var17 > var2 ? var17 : var2;
					var14 = var18 > var3 ? var18 : var3;
					var15 = var19 < var4 ? var19 : var4;
					var16 = var20 < var5 ? var20 : var5;
				} else {
					var17 = var27 + var10.field1229;
					var18 = var10.field1206 + var12;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}

				if (Client.field211 == var10) {
					Client.field263 = true;
					Client.field65 = var27;
					Client.field137 = var12;
				}

				boolean var28 = false;
				if (var10.field1286) {
					switch(Client.field41) {
					case 0:
						var28 = true;
					case 1:
					default:
						break;
					case 2:
						if (var10.field1214 >>> 16 == Client.field202) {
							var28 = true;
						}
						break;
					case 3:
						if (Client.field202 == var10.field1214) {
							var28 = true;
						}
					}
				}

				if (var28 || !var10.field1294 || var13 < var15 && var14 < var16) {
					if (var10.field1294) {
						class20 var29;
						if (var10.field1356) {
							if (class166.field1580 >= var13 && class166.field1563 >= var14 && class166.field1580 < var15 && class166.field1563 < var16) {
								for (var29 = (class20)Client.field242.method627(); var29 != null; var29 = (class20)Client.field242.method629()) {
									if (var29.field388) {
										var29.method907();
										var29.field377.field1234 = false;
									}
								}

								Client.method284();
								if (class362.field2821 == 0) {
									Client.field211 = null;
									Client.field230 = null;
								}

								if (!Client.field140) {
									Client.method253();
								}
							}
						} else if (var10.field1357 && class166.field1580 >= var13 && class166.field1563 >= var14 && class166.field1580 < var15 && class166.field1563 < var16) {
							for (var29 = (class20)Client.field242.method627(); null != var29; var29 = (class20)Client.field242.method629()) {
								if (var29.field388 && var29.field377.field1239 == var29.field380) {
									var29.method907();
								}
							}
						}
					}

					var18 = class166.field1580;
					var19 = class166.field1563;
					if (class166.field1574 != 0) {
						var18 = class166.field1575;
						var19 = class166.field1576;
					}

					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (var10.field1240 == 1337) {
						if (!Client.field40 && !Client.field140 && var30) {
							Client.method183(var18, var19, var13, var14);
						}
					} else if (var10.field1240 == 1338) {
						Client.method257(var10, var27, var12);
					} else {
						if (var10.field1240 == 1400) {
							class34.field483.method1320(class166.field1580, class166.field1563, var30, var27, var12, var10.field1229, var10.field1206);
						}

						if (!Client.field140 && var30) {
							if (var10.field1240 == 1400) {
								class34.field483.method1313(var27, var12, var10.field1229, var10.field1206, var18, var19);
							} else {
								Client.method190(var10);
							}
						}

						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field1263.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && null != var10.field1263[var21]) {
									for (var24 = 0; var24 < var10.field1263[var21].length; ++var24) {
										boolean var25 = false;
										if (null != var10.field1355) {
											var25 = Client.field175.method1783(var10.field1263[var21][var24]);
										}

										if (Client.method266(var10.field1263[var21][var24]) || var25) {
											var22 = true;
											if (var10.field1355 != null && var10.field1355[var21] > Client.field330) {
												break;
											}

											byte var26 = var10.field1359[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !Client.field175.method1783(86) && !Client.field175.method1783(82) && !Client.field175.method1783(81)) && ((var26 & 2) == 0 || Client.field175.method1783(86)) && ((var26 & 1) == 0 || Client.field175.method1783(82)) && ((var26 & 4) == 0 || Client.field175.method1783(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var21 < 10) {
										Client.method142(var21 + 1, var10.field1214, var10.field1333, var10.field1342, "");
									} else if (var21 == 10) {
										class446.method2348();
										Client.method247(var10.field1214, var10.field1333, class200.method1122(Client.method209(var10)), var10.field1342);
										Client.field210 = Client.method239(var10);
										if (null == Client.field210) {
											Client.field210 = class453.field3707;
										}

										Client.field221 = var10.field1218 + class479.method2443(16777215);
									}

									var24 = var10.field1289[var21];
									if (var10.field1355 == null) {
										var10.field1355 = new int[var10.field1263.length];
									}

									if (var10.field1290 == null) {
										var10.field1290 = new int[var10.field1263.length];
									}

									if (var24 != 0) {
										if (var10.field1355[var21] == 0) {
											var10.field1355[var21] = var10.field1290[var21] + var24 + Client.field330;
										} else {
											var10.field1355[var21] = Client.field330 + var24;
										}
									} else {
										var10.field1355[var21] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && null != var10.field1355) {
									var10.field1355[var21] = 0;
								}
							}
						}

						if (var10.field1294) {
							if (class166.field1580 >= var13 && class166.field1563 >= var14 && class166.field1580 < var15 && class166.field1563 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}

							boolean var31 = false;
							if ((class166.field1570 == 1 || !class146.field1455 && class166.field1570 == 4) && var30) {
								var31 = true;
							}

							var22 = false;
							if ((class166.field1574 == 1 || !class146.field1455 && class166.field1574 == 4) && class166.field1575 >= var13 && class166.field1576 >= var14 && class166.field1575 < var15 && class166.field1576 < var16) {
								var22 = true;
							}

							if (var22) {
								Client.method216(var10, class166.field1575 - var27, class166.field1576 - var12);
							}

							if (var10.method726()) {
								if (var22) {
									Client.field281.method631(new class498(0, class166.field1580 - var27, class166.field1563 - var12, var10));
								}

								if (var31) {
									Client.field281.method631(new class498(1, class166.field1580 - var27, class166.field1563 - var12, var10));
								}
							}

							if (var10.field1240 == 1400) {
								class34.field483.method1274(var18, var19, var30 & var31, var30 & var22);
							}

							if (null != Client.field211 && Client.field211 != var10 && var30 && class200.method1123(Client.method209(var10))) {
								Client.field215 = var10;
							}

							if (Client.field230 == var10) {
								Client.field216 = true;
								Client.field217 = var27;
								Client.field218 = var12;
							}

							if (var10.field1297) {
								class20 var32;
								if (var30 && Client.field240 != 0 && var10.field1239 != null) {
									var32 = new class20();
									var32.field388 = true;
									var32.field377 = var10;
									var32.field381 = Client.field240;
									var32.field380 = var10.field1239;
									Client.field242.method631(var32);
								}

								if (Client.field211 != null || Client.field140) {
									var22 = false;
									var31 = false;
									var30 = false;
								}

								if (!var10.field1348 && var22) {
									var10.field1348 = true;
									if (var10.field1266 != null) {
										var32 = new class20();
										var32.field388 = true;
										var32.field377 = var10;
										var32.field378 = class166.field1575 - var27;
										var32.field381 = class166.field1576 - var12;
										var32.field380 = var10.field1266;
										Client.field242.method631(var32);
									}
								}

								if (var10.field1348 && var31 && var10.field1212 != null) {
									var32 = new class20();
									var32.field388 = true;
									var32.field377 = var10;
									var32.field378 = class166.field1580 - var27;
									var32.field381 = class166.field1563 - var12;
									var32.field380 = var10.field1212;
									Client.field242.method631(var32);
								}

								if (var10.field1348 && !var31) {
									var10.field1348 = false;
									if (var10.field1299 != null) {
										var32 = new class20();
										var32.field388 = true;
										var32.field377 = var10;
										var32.field378 = class166.field1580 - var27;
										var32.field381 = class166.field1563 - var12;
										var32.field380 = var10.field1299;
										Client.field244.method631(var32);
									}
								}

								if (var31 && null != var10.field1302) {
									var32 = new class20();
									var32.field388 = true;
									var32.field377 = var10;
									var32.field378 = class166.field1580 - var27;
									var32.field381 = class166.field1563 - var12;
									var32.field380 = var10.field1302;
									Client.field242.method631(var32);
								}

								if (!var10.field1234 && var30) {
									var10.field1234 = true;
									if (null != var10.field1303) {
										var32 = new class20();
										var32.field388 = true;
										var32.field377 = var10;
										var32.field378 = class166.field1580 - var27;
										var32.field381 = class166.field1563 - var12;
										var32.field380 = var10.field1303;
										Client.field242.method631(var32);
									}
								}

								if (var10.field1234 && var30 && null != var10.field1304) {
									var32 = new class20();
									var32.field388 = true;
									var32.field377 = var10;
									var32.field378 = class166.field1580 - var27;
									var32.field381 = class166.field1563 - var12;
									var32.field380 = var10.field1304;
									Client.field242.method631(var32);
								}

								if (var10.field1234 && !var30) {
									var10.field1234 = false;
									if (null != var10.field1275) {
										var32 = new class20();
										var32.field388 = true;
										var32.field377 = var10;
										var32.field378 = class166.field1580 - var27;
										var32.field381 = class166.field1563 - var12;
										var32.field380 = var10.field1275;
										Client.field244.method631(var32);
									}
								}

								if (var10.field1207 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1207;
									Client.field228.method631(var32);
								}

								int var35;
								class20 var37;
								int var38;
								if (var10.field1281 != null && Client.field225 > var10.field1350) {
									if (var10.field1311 != null && Client.field225 - var10.field1350 <= 32) {
										label643:
										for (var38 = var10.field1350; var38 < Client.field225; ++var38) {
											var24 = Client.field224[var38 & 31];

											for (var35 = 0; var35 < var10.field1311.length; ++var35) {
												if (var10.field1311[var35] == var24) {
													var37 = new class20();
													var37.field377 = var10;
													var37.field380 = var10.field1281;
													Client.field242.method631(var37);
													break label643;
												}
											}
										}
									} else {
										var32 = new class20();
										var32.field377 = var10;
										var32.field380 = var10.field1281;
										Client.field242.method631(var32);
									}

									var10.field1350 = Client.field225;
								}

								if (null != var10.field1312 && Client.field227 > var10.field1351) {
									if (null != var10.field1243 && Client.field227 - var10.field1351 <= 32) {
										label619:
										for (var38 = var10.field1351; var38 < Client.field227; ++var38) {
											var24 = Client.field226[var38 & 31];

											for (var35 = 0; var35 < var10.field1243.length; ++var35) {
												if (var24 == var10.field1243[var35]) {
													var37 = new class20();
													var37.field377 = var10;
													var37.field380 = var10.field1312;
													Client.field242.method631(var37);
													break label619;
												}
											}
										}
									} else {
										var32 = new class20();
										var32.field377 = var10;
										var32.field380 = var10.field1312;
										Client.field242.method631(var32);
									}

									var10.field1351 = Client.field227;
								}

								if (null != var10.field1314 && Client.field229 > var10.field1352) {
									if (null != var10.field1315 && Client.field229 - var10.field1352 <= 32) {
										label595:
										for (var38 = var10.field1352; var38 < Client.field229; ++var38) {
											var24 = Client.field151[var38 & 31];

											for (var35 = 0; var35 < var10.field1315.length; ++var35) {
												if (var24 == var10.field1315[var35]) {
													var37 = new class20();
													var37.field377 = var10;
													var37.field380 = var10.field1314;
													Client.field242.method631(var37);
													break label595;
												}
											}
										}
									} else {
										var32 = new class20();
										var32.field377 = var10;
										var32.field380 = var10.field1314;
										Client.field242.method631(var32);
									}

									var10.field1352 = Client.field229;
								}

								if (Client.field232 > var10.field1283 && null != var10.field1205) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1205;
									Client.field242.method631(var32);
								}

								if (Client.field233 > var10.field1283 && var10.field1271 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1271;
									Client.field242.method631(var32);
								}

								if (Client.field234 > var10.field1283 && var10.field1325 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1325;
									Client.field242.method631(var32);
								}

								if (Client.field235 > var10.field1283 && var10.field1326 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1326;
									Client.field242.method631(var32);
								}

								if (Client.field236 > var10.field1283 && var10.field1327 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1327;
									Client.field242.method631(var32);
								}

								if (Client.field237 > var10.field1283 && var10.field1332 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1332;
									Client.field242.method631(var32);
								}

								if (Client.field98 > var10.field1283 && var10.field1347 != null) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1347;
									Client.field242.method631(var32);
								}

								if (Client.field79 > var10.field1283 && null != var10.field1328) {
									var32 = new class20();
									var32.field377 = var10;
									var32.field380 = var10.field1328;
									Client.field242.method631(var32);
								}

								var10.field1283 = Client.field29;
								if (var10.field1321 != null) {
									for (var38 = 0; var38 < Client.field267; ++var38) {
										class20 var36 = new class20();
										var36.field377 = var10;
										var36.field379 = Client.field269[var38];
										var36.field385 = Client.field268[var38];
										var36.field380 = var10.field1321;
										Client.field242.method631(var36);
									}
								}

								class20 var39;
								int[] var40;
								if (null != var10.field1331) {
									var40 = Client.field175.method1781();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class20();
										var39.field377 = var10;
										var39.field379 = var40[var24];
										var39.field380 = var10.field1331;
										Client.field242.method631(var39);
									}
								}

								if (var10.field1288 != null) {
									var40 = Client.field175.method1782();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class20();
										var39.field377 = var10;
										var39.field379 = var40[var24];
										var39.field380 = var10.field1288;
										Client.field242.method631(var39);
									}
								}
							}
						}

						if (!var10.field1294) {
							if (null != Client.field211 || Client.field140) {
								continue;
							}

							if ((var10.field1338 >= 0 || var10.field1241 != 0) && class166.field1580 >= var13 && class166.field1563 >= var14 && class166.field1580 < var15 && class166.field1563 < var16) {
								if (var10.field1338 >= 0) {
									class220.field1934 = var0[var10.field1338];
								} else {
									class220.field1934 = var10;
								}
							}

							if (var10.field1216 == 8 && class166.field1580 >= var13 && class166.field1563 >= var14 && class166.field1580 < var15 && class166.field1563 < var16) {
								class106.field1017 = var10;
							}

							if (var10.field1236 > var10.field1206) {
								Client.method267(var10, var10.field1229 + var27, var12, var10.field1206, var10.field1236, class166.field1580, class166.field1563);
							}
						}

						if (var10.field1216 == 0) {
							method1729(var0, var10.field1214, var13, var14, var15, var16, var27 - var10.field1233, var12 - var10.field1247);
							if (var10.field1346 != null) {
								method1729(var10.field1346, var10.field1214, var13, var14, var15, var16, var27 - var10.field1233, var12 - var10.field1247);
							}

							class58 var33 = (class58)Client.field48.method2129((long)var10.field1214);
							if (null != var33) {
								if (var33.field725 == 0 && class166.field1580 >= var13 && class166.field1563 >= var14 && class166.field1580 < var15 && class166.field1563 < var16 && !Client.field140) {
									for (class20 var34 = (class20)Client.field242.method627(); var34 != null; var34 = (class20)Client.field242.method629()) {
										if (var34.field388) {
											var34.method907();
											var34.field377.field1234 = false;
										}
									}

									if (class362.field2821 == 0) {
										Client.field211 = null;
										Client.field230 = null;
									}

									if (!Client.field140) {
										Client.method253();
									}
								}

								Client.method153(var33.field727, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}

	}
}
