public class class39 extends class538 {
	static class342 field516;
	byte field517;
	int field518;
	// $FF: synthetic field
	final class464 this$0;

	class39(class464 var1) {
		this.this$0 = var1;
		this.field518 = -1;
	}

	void method2583(class42 var1) {
		this.field518 = var1.method327();
		this.field517 = var1.method279();
	}

	void method2582(class379 var1) {
		var1.method2034(this.field518, this.field517);
	}

	static void method254(class309 var0, class167 var1, int var2, int var3) {
		Object[] var5 = var0.field2794;
		class203.field1903 = 0;
		class429.field3529 = 0;
		int var6 = -1;
		int[] var7 = var1.field1620;
		int[] var8 = var1.field1621;
		byte var9 = -1;
		class139.field1336 = 0;
		class139.field1345 = false;
		boolean var10 = false;
		int var11 = 0;
		boolean var23 = false;

		label860: {
			label861: {
				try {
					int var14;
					try {
						var23 = true;
						class23.field444 = new int[var1.field1623];
						int var12 = 0;
						class139.field1332 = new String[var1.field1627];
						int var28 = 0;

						int var15;
						String var38;
						for (var14 = 1; var14 < var5.length; ++var14) {
							if (var5[var14] instanceof Integer) {
								var15 = (Integer)var5[var14];
								if (var15 == -2147483647) {
									var15 = var0.field2792;
								}

								if (var15 == -2147483646) {
									var15 = var0.field2795;
								}

								if (var15 == -2147483645) {
									var15 = var0.field2791 != null ? var0.field2791.field644 : -1;
								}

								if (var15 == -2147483644) {
									var15 = var0.field2796;
								}

								if (var15 == -2147483643) {
									var15 = var0.field2791 != null ? -1714711969 * var0.field2791.field763 * 1628260767 : -1;
								}

								if (var15 == -2147483642) {
									var15 = var0.field2797 != null ? var0.field2797.field644 : -1;
								}

								if (var15 == -2147483641) {
									var15 = null != var0.field2797 ? -1714711969 * var0.field2797.field763 * 1628260767 : -1;
								}

								if (var15 == -2147483640) {
									var15 = var0.field2793;
								}

								if (var15 == -2147483639) {
									var15 = var0.field2799;
								}

								class23.field444[var12++] = var15;
							} else if (var5[var14] instanceof String) {
								var38 = (String)var5[var14];
								if (var38.equals("event_opbase")) {
									var38 = var0.field2800;
								}

								class139.field1332[var28++] = var38;
							}
						}

						class139.field1342 = var0.field2801;

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
								if (var1.field1621[var6] == 1) {
									var37 = true;
								} else {
									var37 = false;
								}

								var15 = class269.method1577(var26, var1, var37);
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
								class139.field1344[++class203.field1903 - 1] = var8[var6];
							} else if (var26 == 1) {
								var14 = var8[var6];
								class139.field1344[++class203.field1903 - 1] = class23.field443[var14];
							} else if (var26 == 2) {
								var14 = var8[var6];
								class23.field443[var14] = class139.field1344[--class203.field1903];
								class359.method1944(var14);
							} else if (var26 == 3) {
								class139.field1331[++class429.field3529 - 1] = var1.field1622[var6];
							} else if (var26 == 6) {
								var6 += var8[var6];
							} else if (var26 == 7) {
								class203.field1903 -= 2;
								if (class139.field1344[class203.field1903] != class139.field1344[1 + class203.field1903]) {
									var6 += var8[var6];
								}
							} else if (var26 == 8) {
								class203.field1903 -= 2;
								if (class139.field1344[class203.field1903] == class139.field1344[class203.field1903 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 9) {
								class203.field1903 -= 2;
								if (class139.field1344[class203.field1903] < class139.field1344[class203.field1903 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 10) {
								class203.field1903 -= 2;
								if (class139.field1344[class203.field1903] > class139.field1344[class203.field1903 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 21) {
								if (class139.field1336 == 0) {
									var23 = false;
									break label861;
								}

								class161 var36 = class139.field1334[--class139.field1336];
								var1 = var36.field1487;
								var7 = var1.field1620;
								var8 = var1.field1621;
								var6 = var36.field1490;
								class23.field444 = var36.field1488;
								class139.field1332 = var36.field1489;
							} else if (var26 == 25) {
								var14 = var8[var6];
								class139.field1344[++class203.field1903 - 1] = class516.method2516(var14);
							} else if (var26 == 27) {
								var14 = var8[var6];
								class22.method189(var14, class139.field1344[--class203.field1903]);
							} else if (var26 == 31) {
								class203.field1903 -= 2;
								if (class139.field1344[class203.field1903] <= class139.field1344[class203.field1903 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 32) {
								class203.field1903 -= 2;
								if (class139.field1344[class203.field1903] >= class139.field1344[class203.field1903 + 1]) {
									var6 += var8[var6];
								}
							} else if (var26 == 33) {
								class139.field1344[++class203.field1903 - 1] = class23.field444[var8[var6]];
							} else if (var26 == 34) {
								class23.field444[var8[var6]] = class139.field1344[--class203.field1903];
							} else if (var26 == 35) {
								class139.field1331[++class429.field3529 - 1] = class139.field1332[var8[var6]];
							} else if (var26 == 36) {
								class139.field1332[var8[var6]] = class139.field1331[--class429.field3529];
							} else if (var26 == 37) {
								var14 = var8[var6];
								class429.field3529 -= var14;
								var38 = class368.method1972(class139.field1331, class429.field3529, var14);
								class139.field1331[++class429.field3529 - 1] = var38;
							} else if (var26 == 38) {
								--class203.field1903;
							} else if (var26 == 39) {
								--class429.field3529;
							} else {
								int var18;
								if (var26 != 40) {
									if (var26 == 42) {
										class139.field1344[++class203.field1903 - 1] = class451.field3950.method171(var8[var6]);
									} else if (var26 == 43) {
										class451.field3950.method182(var8[var6], class139.field1344[--class203.field1903]);
									} else if (var26 == 44) {
										var14 = var8[var6] >> 16;
										var15 = var8[var6] & 65535;
										int var29 = class139.field1344[--class203.field1903];
										if (var29 < 0 || var29 > 5000) {
											throw new RuntimeException();
										}

										class139.field1333[var14] = var29;
										byte var32 = -1;
										if (var15 == 105) {
											var32 = 0;
										}

										for (var18 = 0; var18 < var29; ++var18) {
											class139.field1335[var14][var18] = var32;
										}
									} else if (var26 == 45) {
										var14 = var8[var6];
										var15 = class139.field1344[--class203.field1903];
										if (var15 < 0 || var15 >= class139.field1333[var14]) {
											throw new RuntimeException();
										}

										class139.field1344[++class203.field1903 - 1] = class139.field1335[var14][var15];
									} else if (var26 == 46) {
										var14 = var8[var6];
										class203.field1903 -= 2;
										var15 = class139.field1344[class203.field1903];
										if (var15 < 0 || var15 >= class139.field1333[var14]) {
											throw new RuntimeException();
										}

										class139.field1335[var14][var15] = class139.field1344[1 + class203.field1903];
									} else {
										String var30;
										if (var26 == 47) {
											var30 = class451.field3950.method173(var8[var6]);
											if (var30 == null) {
												var30 = class433.field3850;
											}

											class139.field1331[++class429.field3529 - 1] = var30;
										} else if (var26 == 48) {
											class451.field3950.method178(var8[var6], class139.field1331[--class429.field3529]);
										} else if (var26 == 49) {
											var30 = class451.field3950.method172(var8[var6]);
											class139.field1331[++class429.field3529 - 1] = var30;
										} else if (var26 == 50) {
											class451.field3950.method179(var8[var6], class139.field1331[--class429.field3529]);
										} else if (var26 == 60) {
											class526 var33 = var1.field1628[var8[var6]];
											class380 var41 = (class380)var33.method2543((long)class139.field1344[--class203.field1903]);
											if (var41 != null) {
												var6 += var41.field3226;
											}
										} else {
											Integer var34;
											if (var26 == 74) {
												var34 = class255.field2360.method2020(var8[var6]);
												if (var34 == null) {
													class139.field1344[++class203.field1903 - 1] = -1;
												} else {
													class139.field1344[++class203.field1903 - 1] = var34;
												}
											} else {
												if (var26 != 76) {
													throw new IllegalStateException();
												}

												var34 = class196.field1795.method2084(var8[var6]);
												if (var34 == null) {
													class139.field1344[++class203.field1903 - 1] = -1;
												} else {
													class139.field1344[++class203.field1903 - 1] = var34;
												}
											}
										}
									}
								} else {
									var14 = var8[var6];
									class167 var40 = class463.method2271(var14);
									int[] var16 = new int[var40.field1623];
									String[] var17 = new String[var40.field1627];

									for (var18 = 0; var18 < var40.field1625; ++var18) {
										var16[var18] = class139.field1344[class203.field1903 - var40.field1625 + var18];
									}

									for (var18 = 0; var18 < var40.field1626; ++var18) {
										var17[var18] = class139.field1331[class429.field3529 - var40.field1626 + var18];
									}

									class203.field1903 -= var40.field1625;
									class429.field3529 -= var40.field1626;
									class161 var35 = new class161();
									var35.field1487 = var1;
									var35.field1490 = var6;
									var35.field1488 = class23.field444;
									var35.field1489 = class139.field1332;
									class139.field1334[++class139.field1336 - 1] = var35;
									var1 = var40;
									var7 = var40.field1620;
									var8 = var40.field1621;
									var6 = -1;
									class23.field444 = var16;
									class139.field1332 = var17;
								}
							}
						}
					} catch (Exception var24) {
						var10 = true;
						StringBuilder var13 = new StringBuilder(30);
						var13.append("").append(var1.field3987).append(" ");

						for (var14 = class139.field1336 - 1; var14 >= 0; --var14) {
							var13.append("").append(class139.field1334[var14].field1487.field3987).append(" ");
						}

						var13.append("").append(var9);
						class41.method263(var13.toString(), var24);
						var23 = false;
						break label860;
					}
				} finally {
					if (var23) {
						while (class139.field1341.size() > 0) {
							class434 var20 = (class434)class139.field1341.remove(0);
							class164.method912(var20.method2203(), var20.method2204(), var20.method2202(), var20.method2200(), "");
						}

						if (class139.field1345) {
							class139.field1345 = false;
							class476.method2302();
						}

						if (!var10 && var3 > 0 && var11 >= var3) {
							class41.method263("Warning: Script " + var1.field1624 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (class139.field1341.size() > 0) {
					class434 var31 = (class434)class139.field1341.remove(0);
					class164.method912(var31.method2203(), var31.method2204(), var31.method2202(), var31.method2200(), "");
				}

				if (class139.field1345) {
					class139.field1345 = false;
					class476.method2302();
				}

				if (!var10 && var3 > 0 && var11 >= var3) {
					class41.method263("Warning: Script " + var1.field1624 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (class139.field1341.size() > 0) {
				class434 var39 = (class434)class139.field1341.remove(0);
				class164.method912(var39.method2203(), var39.method2204(), var39.method2202(), var39.method2200(), "");
			}

			if (class139.field1345) {
				class139.field1345 = false;
				class476.method2302();
			}

			if (!var10 && var3 > 0 && var11 >= var3) {
				class41.method263("Warning: Script " + var1.field1624 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (class139.field1341.size() > 0) {
			class434 var27 = (class434)class139.field1341.remove(0);
			class164.method912(var27.method2203(), var27.method2204(), var27.method2202(), var27.method2200(), "");
		}

		if (class139.field1345) {
			class139.field1345 = false;
			class476.method2302();
		}

		if (!var10 && var3 > 0 && var11 >= var3) {
			class41.method263("Warning: Script " + var1.field1624 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
		}

	}

	static void method257() {
		int var1 = class481.field4085;
		int[] var2 = class481.field4086;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.field142 && Client.field131 != var2[var3]) {
				class366.method1968(Client.field176[var2[var3]], true);
			}
		}

	}
}
