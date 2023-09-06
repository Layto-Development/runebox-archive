public class class12 {
	static int field365;
	static int field369;
	static int[] field366;
	static int[] field367;
	int field364;
	int field368;
	int field370;
	int field373;
	int field374;
	String field371;
	String field372;
	String field375;

	static {
		field369 = 0;
		field365 = 0;
		field366 = new int[]{1, 1, 1, 1};
		field367 = new int[]{0, 1, 2, 3};
	}

	class12() {
	}

	boolean method108() {
		return (class162.field1517.method1970() & this.field364) != 0;
	}

	boolean method109() {
		return (class162.field1507.method1970() & this.field364) != 0;
	}

	boolean method110() {
		return (class162.field1492.method1970() & this.field364) != 0;
	}

	boolean method119() {
		return (class162.field1501.method1970() & this.field364) != 0;
	}

	boolean method116() {
		return (class162.field1505.method1970() & this.field364) != 0;
	}

	boolean method112() {
		return (class162.field1520.method1970() & this.field364) != 0;
	}

	boolean method115() {
		return (class162.field1516.method1970() & this.field364) != 0;
	}

	boolean method113() {
		return (class162.field1521.method1970() & this.field364) != 0;
	}

	boolean method118() {
		return (class162.field1499.method1970() & this.field364) != 0;
	}

	boolean method114() {
		return (class162.field1518.method1970() & this.field364) != 0;
	}

	public static String method117(String var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		byte var4 = 2;

		for (int var5 = 0; var5 < var2; ++var5) {
			char var6 = var0.charAt(var5);
			if (var4 == 0) {
				var6 = Character.toLowerCase(var6);
			} else if (var4 == 2 || Character.isUpperCase(var6)) {
				var6 = class52.method386(var6);
			}

			if (Character.isLetter(var6)) {
				var4 = 0;
			} else if (var6 != '.' && var6 != '?' && var6 != '!') {
				if (Character.isSpaceChar(var6)) {
					if (var4 != 2) {
						var4 = 1;
					}
				} else {
					var4 = 1;
				}
			} else {
				var4 = 2;
			}

			var3[var5] = var6;
		}

		return new String(var3);
	}

	static final void method111(class144 var0) {
		class347 var2 = Client.field68.field2427;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class144.field1375 == var0) {
			var3 = var2.method317();
			var4 = var2.method318();
			var5 = var2.method278();
			var6 = (var5 >> 4 & 7) + class154.field1435;
			var7 = class98.field993 + (var5 & 7);
			var8 = var2.method306();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				class86 var41 = Client.field143[class358.field3038][var6][var7];
				if (var41 != null) {
					for (class13 var37 = (class13)var41.method563(); var37 != null; var37 = (class13)var41.method565()) {
						if ((var8 & 32767) == var37.field376 && var37.field377 == var4) {
							var37.field377 = var3;
							break;
						}
					}

					class540.method2589(var6, var7);
				}
			}

		} else {
			int var9;
			int var10;
			byte var11;
			int var13;
			int var14;
			if (class144.field1378 == var0) {
				var3 = var2.method299();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = Client.field188[var4];
				var7 = var2.method338();
				var8 = class154.field1435 + (var7 >> 4 & 7);
				var9 = (var7 & 7) + class98.field993;
				var10 = var2.method307();
				var11 = var2.method293();
				byte var12 = var2.method301();
				var13 = var2.method305();
				var14 = var2.method305();
				byte var15 = var2.method302();
				byte var16 = var2.method279();
				int var17 = var2.method307();
				class287 var18;
				if (Client.field131 == var10) {
					var18 = class82.field863;
				} else {
					var18 = Client.field176[var10];
				}

				if (var18 != null) {
					class235 var19 = class96.method638(var14, (byte)-34);
					int var20;
					int var21;
					if (var5 != 1 && var5 != 3) {
						var20 = var19.field2121;
						var21 = var19.field2106;
					} else {
						var20 = var19.field2106;
						var21 = var19.field2121;
					}

					int var22 = var8 + (var20 >> 1);
					int var23 = var8 + (var20 + 1 >> 1);
					int var24 = var9 + (var21 >> 1);
					int var25 = (var21 + 1 >> 1) + var9;
					int[][] var26 = class38.field511[class358.field3038];
					int var27 = var26[var23][var25] + var26[var22][var25] + var26[var23][var24] + var26[var22][var24] >> 2;
					int var28 = (var8 << 7) + (var20 << 6);
					int var29 = (var21 << 6) + (var9 << 7);
					class250 var30 = var19.method1349(var4, var5, var26, var28, var27, var29);
					if (var30 != null) {
						class516.method2508(class358.field3038, var8, var9, var6, -1, 0, 0, 31, var13 + 1, var17 + 1);
						var18.field2531 = Client.field306 + var13;
						var18.field2541 = var17 + Client.field306;
						var18.field2535 = var30;
						var18.field2532 = var8 * 128 + var20 * 64;
						var18.field2534 = var9 * 128 + var21 * 64;
						var18.field2533 = var27;
						byte var31;
						if (var15 > var11) {
							var31 = var15;
							var15 = var11;
							var11 = var31;
						}

						if (var12 > var16) {
							var31 = var12;
							var12 = var16;
							var16 = var31;
						}

						var18.field2547 = var8 + var15;
						var18.field2538 = var11 + var8;
						var18.field2537 = var12 + var9;
						var18.field2527 = var16 + var9;
					}
				}
			}

			if (var0 == class144.field1371) {
				var3 = var2.method338();
				var4 = (var3 >> 4 & 7) + class154.field1435;
				var5 = class98.field993 + (var3 & 7);
				var6 = var2.method327();
				var7 = var2.method338();
				var8 = var2.method306();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var4 = 64 + var4 * 128;
					var5 = 64 + var5 * 128;
					class402 var39 = new class402(var8, class358.field3038, var4, var5, class454.method2262(var4, var5, class358.field3038) - var7, var6, Client.field306);
					Client.field273.method567(var39);
				}

			} else {
				int var38;
				if (class144.field1379 == var0) {
					var3 = var2.method299();
					var4 = var2.method338();
					var5 = var4 >> 2;
					var6 = var4 & 3;
					var7 = Client.field188[var5];
					var8 = var2.method307();
					var9 = var2.method300();
					var10 = class154.field1435 + (var9 >> 4 & 7);
					var38 = class98.field993 + (var9 & 7);
					if (var10 >= 0 && var38 >= 0 && var10 < 104 && var38 < 104) {
						class516.method2508(class358.field3038, var10, var38, var7, var8, var5, var6, var3, 0, -1);
					}

				} else {
					int var40;
					if (class144.field1372 == var0) {
						var3 = var2.method338();
						var4 = var3 >> 2;
						var5 = var3 & 3;
						var6 = Client.field188[var4];
						var7 = var2.method305();
						var8 = var2.method338();
						var9 = (var8 >> 4 & 7) + class154.field1435;
						var10 = (var8 & 7) + class98.field993;
						if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
							if (var6 == 0) {
								class267 var42 = class415.field3487.method1769(class358.field3038, var9, var10);
								if (var42 != null) {
									var40 = class67.method491(var42.field2417);
									if (var4 == 2) {
										var42.field2418 = new class165(var40, 2, var5 + 4, class358.field3038, var9, var10, var7, false, var42.field2418);
										var42.field2416 = new class165(var40, 2, var5 + 1 & 3, class358.field3038, var9, var10, var7, false, var42.field2416);
									} else {
										var42.field2418 = new class165(var40, var4, var5, class358.field3038, var9, var10, var7, false, var42.field2418);
									}

									return;
								}
							}

							if (var6 == 1) {
								class436 var43 = class415.field3487.method1770(class358.field3038, var9, var10);
								if (null != var43) {
									var40 = class67.method491(var43.field3866);
									if (var4 != 4 && var4 != 5) {
										if (var4 == 6) {
											var43.field3863 = new class165(var40, 4, var5 + 4, class358.field3038, var9, var10, var7, false, var43.field3863);
										} else if (var4 == 7) {
											var43.field3863 = new class165(var40, 4, (var5 + 2 & 3) + 4, class358.field3038, var9, var10, var7, false, var43.field3863);
										} else if (var4 == 8) {
											var43.field3863 = new class165(var40, 4, var5 + 4, class358.field3038, var9, var10, var7, false, var43.field3863);
											var43.field3864 = new class165(var40, 4, 4 + (var5 + 2 & 3), class358.field3038, var9, var10, var7, false, var43.field3864);
										}
									} else {
										var43.field3863 = new class165(var40, 4, var5, class358.field3038, var9, var10, var7, false, var43.field3863);
									}

									return;
								}
							}

							if (var6 == 2) {
								class491 var44 = class415.field3487.method1807(class358.field3038, var9, var10);
								if (var4 == 11) {
									var4 = 10;
								}

								if (null != var44) {
									var44.field4127 = new class165(class67.method491(var44.field4132), var4, var5, class358.field3038, var9, var10, var7, false, var44.field4127);
									return;
								}
							}

							if (var6 == 3) {
								class400 var45 = class415.field3487.method1794(class358.field3038, var9, var10);
								if (var45 != null) {
									var45.field3357 = new class165(class67.method491(var45.field3356), 22, var5, class358.field3038, var9, var10, var7, false, var45.field3357);
									return;
								}
							}

							class272.method1587(class358.field3038, var9, var10, var6, var7);
						}

					} else {
						class13 var36;
						if (class144.field1376 == var0) {
							var2.method299();
							var3 = var2.method299();
							var4 = (var3 >> 4 & 7) + class154.field1435;
							var5 = (var3 & 7) + class98.field993;
							var6 = var2.method278();
							var7 = var2.method282();
							var2.method307();
							var2.method305();
							var2.method299();
							var8 = var2.method327();
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								var36 = new class13();
								var36.field376 = var8;
								var36.field377 = var7;
								var36.method121(var6);
								if (Client.field143[class358.field3038][var4][var5] == null) {
									Client.field143[class358.field3038][var4][var5] = new class86();
								}

								Client.field143[class358.field3038][var4][var5].method567(var36);
								class540.method2589(var4, var5);
							}

						} else if (class144.field1381 == var0) {
							var3 = var2.method278();
							var4 = (var3 >> 4 & 7) + class154.field1435;
							var5 = (var3 & 7) + class98.field993;
							var6 = var2.method338();
							var7 = var6 >> 2;
							var8 = var6 & 3;
							var9 = Client.field188[var7];
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								class516.method2508(class358.field3038, var4, var5, var9, -1, var7, var8, 31, 0, -1);
							}

						} else {
							class86 var34;
							if (class144.field1380 == var0) {
								var3 = var2.method307();
								var4 = var2.method317();
								var5 = var2.method278();
								var6 = class154.field1435 + (var5 >> 4 & 7);
								var7 = class98.field993 + (var5 & 7);
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
									var34 = Client.field143[class358.field3038][var6][var7];
									if (var34 != null) {
										for (var36 = (class13)var34.method563(); null != var36; var36 = (class13)var34.method565()) {
											if ((var3 & 32767) == var36.field376 && var36.field377 == var4) {
												var36.method2269();
												break;
											}
										}

										if (var34.method563() == null) {
											Client.field143[class358.field3038][var6][var7] = null;
										}

										class540.method2589(var6, var7);
									}
								}

							} else {
								if (var0 == class144.field1377) {
									var3 = var2.method299();
									var4 = class154.field1435 + (var3 >> 4 & 7);
									var5 = (var3 & 7) + class98.field993;
									var6 = var2.method300();
									var7 = var6 >> 4 & 15;
									var8 = var6 & 7;
									var9 = var2.method278();
									var10 = var2.method307();
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
										var38 = var7 + 1;
										if (class82.field863.field1600[0] >= var4 - var38 && class82.field863.field1600[0] <= var38 + var4 && class82.field863.field1597[0] >= var5 - var38 && class82.field863.field1597[0] <= var38 + var5 && class176.field1701.method2517() != 0 && var8 > 0 && Client.field258 < 50) {
											Client.field259[Client.field258] = var10;
											Client.field260[Client.field258] = var8;
											Client.field215[Client.field258] = var9;
											Client.field47[Client.field258] = null;
											Client.field10[Client.field258] = var7 + (var4 << 16) + (var5 << 8);
											++Client.field258;
										}
									}
								}

								int var46;
								if (class144.field1374 == var0) {
									var3 = var2.method306();
									var4 = var2.method327();
									byte var32 = var2.method302();
									var6 = var2.method338();
									var7 = var2.method312();
									byte var35 = var2.method279();
									var9 = var2.method299() * 4;
									var10 = var2.method338();
									var38 = var2.method300() * 4;
									var40 = var2.method313();
									var13 = var2.method278();
									var14 = (var13 >> 4 & 7) + class154.field1435;
									var46 = (var13 & 7) + class98.field993;
									int var48 = var2.method307();
									var5 = var32 + var14;
									var8 = var35 + var46;
									if (var14 >= 0 && var46 >= 0 && var14 < 104 && var46 < 104 && var5 >= 0 && var8 >= 0 && var5 < 104 && var8 < 104 && var48 != 65535) {
										var14 = var14 * 128 + 64;
										var46 = var46 * 128 + 64;
										var5 = var5 * 128 + 64;
										var8 = 64 + var8 * 128;
										class443 var49 = new class443(var48, class358.field3038, var14, var46, class454.method2262(var14, var46, class358.field3038) - var9, Client.field306 + var3, var4 + Client.field306, var6, var10, var40, var7, var38);
										var49.method2219(var5, var8, class454.method2262(var5, var8, class358.field3038) - var38, var3 + Client.field306);
										Client.field130.method567(var49);
									}

								} else if (class144.field1370 == var0) {
									var3 = var2.method305();
									var4 = var2.method299();
									var5 = (var4 >> 4 & 7) + class154.field1435;
									var6 = (var4 & 7) + class98.field993;
									byte var33 = var2.method302();
									var8 = var2.method313();
									var9 = var2.method299();
									var10 = var2.method307();
									var11 = var2.method293();
									var40 = var2.method338() * 4;
									var13 = var2.method299();
									var14 = var2.method299() * 4;
									var46 = var2.method327();
									var38 = var11 + var5;
									var7 = var33 + var6;
									if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var38 >= 0 && var7 >= 0 && var38 < 104 && var7 < 104 && var3 != 65535) {
										var5 = 64 + var5 * 128;
										var6 = 64 + var6 * 128;
										var38 = 64 + var38 * 128;
										var7 = 64 + var7 * 128;
										class443 var47 = new class443(var3, class358.field3038, var5, var6, class454.method2262(var5, var6, class358.field3038) - var14, Client.field306 + var46, var10 + Client.field306, var9, var13, var8, var40);
										var47.method2219(var38, var7, class454.method2262(var38, var7, class358.field3038) - var40, var46 + Client.field306);
										Client.field130.method567(var47);
									}

								} else if (var0 == class144.field1373) {
									var3 = var2.method278();
									var4 = (var3 >> 4 & 7) + class154.field1435;
									var5 = (var3 & 7) + class98.field993;
									var6 = var2.method300();
									var7 = var2.method305();
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
										var34 = Client.field143[class358.field3038][var4][var5];
										if (null != var34) {
											for (var36 = (class13)var34.method563(); var36 != null; var36 = (class13)var34.method565()) {
												if ((var7 & 32767) == var36.field376) {
													var36.method121(var6);
													break;
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
	}
}
