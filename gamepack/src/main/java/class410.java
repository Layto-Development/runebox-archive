import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

final class class410 implements Comparator {
	int method2110(class478 var1, class478 var2) {
		return var1.field4068 < var2.field4068 ? -1 : (var2.field4068 == var1.field4068 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method2110((class478)var1, (class478)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static class167 method2112(int var0, int var1, int var2) {
		int var4 = (var1 << 8) + var0;
		class167 var6 = class292.method1672(var4, var0);
		if (null != var6) {
			return var6;
		} else {
			int var7 = (-3 - var2 << 8) + var0;
			var6 = class292.method1672(var7, var0);
			if (null != var6) {
				return var6;
			} else {
				int var8 = var0 + -512;
				var6 = class292.method1672(var8, var0);
				return null != var6 ? var6 : null;
			}
		}
	}

	static void method2111(class172 var0, class253 var1, class253 var2) {
		int var6;
		int var28;
		int var29;
		boolean var33;
		boolean var50;
		if (class116.field1111) {
			class411 var27 = class212.method1209();

			while (true) {
				if (!var27.method2119()) {
					if (class184.field1739 != 1 && (class30.field467 || class184.field1739 != 4)) {
						break;
					}

					int var5 = class116.field1086 + 280;
					if (class184.field1740 >= var5 && class184.field1740 <= var5 + 14 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(0, 0);
						break;
					}

					if (class184.field1740 >= var5 + 15 && class184.field1740 <= var5 + 80 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(0, 1);
						break;
					}

					var6 = class116.field1086 + 390;
					if (class184.field1740 >= var6 && class184.field1740 <= var6 + 14 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(1, 0);
						break;
					}

					if (class184.field1740 >= var6 + 15 && class184.field1740 <= var6 + 80 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(1, 1);
						break;
					}

					var28 = class116.field1086 + 500;
					if (class184.field1740 >= var28 && class184.field1740 <= var28 + 14 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(2, 0);
						break;
					}

					if (class184.field1740 >= var28 + 15 && class184.field1740 <= var28 + 80 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(2, 1);
						break;
					}

					var29 = 610 + class116.field1086;
					if (class184.field1740 >= var29 && class184.field1740 <= var29 + 14 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(3, 0);
						break;
					}

					if (class184.field1740 >= var29 + 15 && class184.field1740 <= var29 + 80 && class184.field1741 >= 4 && class184.field1741 <= 18) {
						class529.method2555(3, 1);
						break;
					}

					if (class184.field1740 >= 708 + class116.field1086 && class184.field1741 >= 4 && class184.field1740 <= 50 + 708 + class116.field1086 && class184.field1741 <= 20) {
						class418.method2154();
						break;
					}

					if (class116.field1112 != -1) {
						class12 var31 = class225.field2044[class116.field1112];
						if (var31.method109()) {
							var31.field375 = "beta";
						}

						var50 = false;
						if (var31.field364 != Client.field4) {
							boolean var49 = (Client.field4 & class162.field1507.method1970()) != 0;
							var33 = var31.method109();
							if (var49 && !var33 || !var49 && var33) {
								var50 = true;
							}
						}

						class292.method1671(var31);
						class418.method2154();
						if (var50) {
							class338.method1869();
						}
					} else {
						if (class116.field1113 > 0 && null != class122.field1135 && class184.field1740 >= 0 && class184.field1740 <= class122.field1135.field450 && class184.field1741 >= class5.field322 / 2 - 50 && class184.field1741 <= class5.field322 / 2 + 50) {
							--class116.field1113;
						}

						if (class116.field1113 < class116.field1118 && null != class43.field534 && class184.field1740 >= class237.field2181 - class43.field534.field450 - 5 && class184.field1740 <= class237.field2181 && class184.field1741 >= class5.field322 / 2 - 50 && class184.field1741 <= class5.field322 / 2 + 50) {
							++class116.field1113;
						}
					}
					break;
				}

				if (var27.field3441 == 13) {
					class418.method2154();
					break;
				}

				if (var27.field3441 == 96) {
					if (class116.field1113 > 0 && null != class122.field1135) {
						--class116.field1113;
					}
				} else if (var27.field3441 == 97 && class116.field1113 < class116.field1118 && null != class43.field534) {
					++class116.field1113;
				}
			}

		} else {
			if ((class184.field1739 == 1 || !class30.field467 && class184.field1739 == 4) && class184.field1740 >= class116.field1086 + 765 - 50 && class184.field1741 >= 453) {
				class176.field1701.method2507(!class176.field1701.method2509());
				if (!class176.field1701.method2509()) {
					ArrayList var4 = new ArrayList();
					var4.add(new class104(class465.field3998, "scape main", "", 255, false));
					class81.method545(var4, 0, 0, 0, 100, false);
				} else {
					class167.method924(0, 0);
				}

				class296.method1689();
			}

			if (Client.field87 != 5) {
				if (-1L == class116.field1106) {
					class116.field1106 = class172.method977() + 1000L;
				}

				long var26 = class172.method977();
				if (class121.method753() && -1L == class116.field1116) {
					class116.field1116 = var26;
					if (class116.field1116 > class116.field1106) {
						class116.field1106 = class116.field1116;
					}
				}

				if (Client.field87 == 10 || Client.field87 == 11) {
					if (class395.field3318 == class168.field1636) {
						if (class184.field1739 == 1 || !class30.field467 && class184.field1739 == 4) {
							var6 = 5 + class116.field1086;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (class184.field1740 >= var6 && class184.field1740 <= var8 + var6 && class184.field1741 >= var7 && class184.field1741 <= var9 + var7) {
								if (class98.method647()) {
									class116.field1111 = true;
									class116.field1113 = 0;
									class116.field1118 = 0;
								}

								return;
							}
						}

						if (class467.field4008 != null) {
							class81.method543();
						}
					}

					var6 = class184.field1739;
					var28 = class184.field1740;
					var29 = class184.field1741;
					if (var6 == 0) {
						var28 = class184.field1745;
						var29 = class184.field1728;
					}

					if (!class30.field467 && var6 == 4) {
						var6 = 1;
					}

					class411 var30 = class212.method1209();
					int var34;
					short var35;
					if (class116.field1097 == 0) {
						var50 = false;

						while (var30.method2119()) {
							if (var30.field3441 == 84) {
								var50 = true;
							}
						}

						var34 = class315.field2826 - 80;
						var35 = 291;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
							class289.method1661(class230.method1326("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var34 = 80 + class315.field2826;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20 || var50) {
							if ((Client.field4 & class162.field1516.method1970()) != 0) {
								class116.field1119 = "";
								class116.field1101 = class433.field3773;
								class116.field1099 = class433.field3764;
								class116.field1100 = class433.field3765;
								class337.method1864(1);
								class235.method1356();
							} else if ((Client.field4 & class162.field1501.method1970()) != 0) {
								if ((Client.field4 & class162.field1522.method1970()) != 0) {
									class116.field1101 = class433.field3760;
									class116.field1099 = class433.field3761;
									class116.field1100 = class433.field3762;
								} else {
									class116.field1101 = class433.field3754;
									class116.field1099 = class433.field3755;
									class116.field1100 = class433.field3556;
								}

								class116.field1119 = class433.field3569;
								class337.method1864(1);
								class235.method1356();
							} else if ((Client.field4 & class162.field1522.method1970()) != 0) {
								class116.field1101 = class433.field3845;
								class116.field1099 = class433.field3779;
								class116.field1100 = class433.field3839;
								class116.field1119 = class433.field3569;
								class337.method1864(1);
								class235.method1356();
							} else {
								class143.method847(false);
							}
						}
					} else {
						int var10;
						short var11;
						if (class116.field1097 == 1) {
							while (true) {
								if (!var30.method2119()) {
									var10 = class315.field2826 - 80;
									var11 = 321;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class143.method847(false);
									}

									var10 = class315.field2826 + 80;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class337.method1864(0);
									}
									break;
								}

								if (var30.field3441 == 84) {
									class143.method847(false);
								} else if (var30.field3441 == 13) {
									class337.method1864(0);
								}
							}
						} else {
							int var15;
							int var16;
							short var32;
							boolean var36;
							if (class116.field1097 == 2) {
								var32 = 201;
								var10 = var32 + 52;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									class116.field1108 = 0;
								}

								var10 += 15;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									class116.field1108 = 1;
								}

								var10 += 15;
								var32 = 361;
								if (class434.field3851 != null) {
									var34 = class434.field3851.field1644 / 2;
									if (var6 == 1 && var28 >= class434.field3851.field1645 - var34 && var28 <= var34 + class434.field3851.field1645 && var29 >= var32 - 15 && var29 < var32) {
										switch(class116.field1096) {
										case 1:
											class289.method1661(class433.field3734, true, false);
											return;
										case 2:
											class289.method1661("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var34 = class315.field2826 - 80;
								var35 = 321;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
									class116.field1110 = class116.field1110.trim();
									if (class116.field1110.length() == 0) {
										class174.method993(class433.field3661, class433.field3576, class433.field3663);
										return;
									}

									if (class116.field1103.length() == 0) {
										class174.method993(class433.field3664, class433.field3665, class433.field3589);
										return;
									}

									class174.method993(class433.field3767, class433.field3768, class433.field3753);
									class353.method1926(false);
									class104.method675(20);
									return;
								}

								var34 = 80 + 180 + class116.field1092;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
									class337.method1864(0);
									class116.field1110 = "";
									class116.field1103 = "";
									class242.field2213 = 0;
									class110.field1061 = "";
									class116.field1107 = true;
								}

								var34 = -117 + class315.field2826;
								var35 = 277;
								class116.field1091 = var28 >= var34 && var28 < class458.field3972 + var34 && var29 >= var35 && var29 < var35 + class71.field818;
								if (var6 == 1 && class116.field1091) {
									Client.field57 = !Client.field57;
									if (!Client.field57 && class176.field1701.method2500() != null) {
										class176.field1701.method2499((String)null);
									}
								}

								var34 = 24 + class315.field2826;
								var35 = 277;
								class116.field1114 = var28 >= var34 && var28 < var34 + class458.field3972 && var29 >= var35 && var29 < class71.field818 + var35;
								if (var6 == 1 && class116.field1114) {
									class176.field1701.method2510(!class176.field1701.method2491());
									if (!class176.field1701.method2491()) {
										class116.field1110 = "";
										class176.field1701.method2499((String)null);
										class235.method1356();
									}
								}

								while (true) {
									Transferable var46;
									do {
										while (true) {
											label1169:
											do {
												while (true) {
													while (var30.method2119()) {
														if (var30.field3441 != 13) {
															if (class116.field1108 != 0) {
																continue label1169;
															}

															class74.method521(var30.field3428);
															if (var30.field3441 == 85 && class116.field1110.length() > 0) {
																class116.field1110 = class116.field1110.substring(0, class116.field1110.length() - 1);
															}

															if (var30.field3441 == 84 || var30.field3441 == 80) {
																class116.field1108 = 1;
															}

															if (class248.method1443(var30.field3428) && class116.field1110.length() < 320) {
																class116.field1110 = class116.field1110 + var30.field3428;
															}
														} else {
															class337.method1864(0);
															class116.field1110 = "";
															class116.field1103 = "";
															class242.field2213 = 0;
															class110.field1061 = "";
															class116.field1107 = true;
														}
													}

													return;
												}
											} while(class116.field1108 != 1);

											if (var30.field3441 == 85 && class116.field1103.length() > 0) {
												class116.field1103 = class116.field1103.substring(0, class116.field1103.length() - 1);
											} else if (var30.field3441 == 84 || var30.field3441 == 80) {
												class116.field1108 = 0;
												if (var30.field3441 == 84) {
													class116.field1110 = class116.field1110.trim();
													if (class116.field1110.length() == 0) {
														class174.method993(class433.field3661, class433.field3576, class433.field3663);
														return;
													}

													if (class116.field1103.length() == 0) {
														class174.method993(class433.field3664, class433.field3665, class433.field3589);
														return;
													}

													class174.method993(class433.field3767, class433.field3768, class433.field3753);
													class353.method1926(false);
													class104.method675(20);
													return;
												}
											}

											if ((var30.method2118(82) || var30.method2118(87)) && var30.field3441 == 67) {
												Clipboard var45 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var46 = var45.getContents(class466.field3999);
												var15 = 20 - class116.field1103.length();
												break;
											}

											char var43 = var30.field3428;
											if (var43 >= ' ' && var43 < 127 || var43 > 127 && var43 < 160 || var43 > 160 && var43 <= 255) {
												var36 = true;
											} else {
												label1408: {
													if (var43 != 0) {
														char[] var44 = class389.field3272;

														for (var16 = 0; var16 < var44.length; ++var16) {
															char var17 = var44[var16];
															if (var17 == var43) {
																var36 = true;
																break label1408;
															}
														}
													}

													var36 = false;
												}
											}

											if (var36 && class248.method1443(var30.field3428) && class116.field1103.length() < 20) {
												class116.field1103 = class116.field1103 + var30.field3428;
											}
										}
									} while(var15 <= 0);

									try {
										String var48 = (String)var46.getTransferData(DataFlavor.stringFlavor);
										int var47 = Math.min(var15, var48.length());

										for (int var18 = 0; var18 < var47; ++var18) {
											char var20 = var48.charAt(var18);
											boolean var19;
											if ((var20 < ' ' || var20 >= 127) && (var20 <= 127 || var20 >= 160) && (var20 <= 160 || var20 > 255)) {
												label1388: {
													if (var20 != 0) {
														char[] var21 = class389.field3272;

														for (int var22 = 0; var22 < var21.length; ++var22) {
															char var23 = var21[var22];
															if (var23 == var20) {
																var19 = true;
																break label1388;
															}
														}
													}

													var19 = false;
												}
											} else {
												var19 = true;
											}

											if (!var19 || !class248.method1443(var48.charAt(var18))) {
												class337.method1864(3);
												return;
											}
										}

										class116.field1103 = class116.field1103 + var48.substring(0, var47);
									} catch (UnsupportedFlavorException var24) {
									} catch (IOException var25) {
									}
								}
							} else {
								class169 var12;
								if (class116.field1097 == 3) {
									var10 = class116.field1092 + 180;
									var11 = 241;
									var12 = var1.method1296(25, class433.field3788.length() - 34, class433.field3788, var10, var11);
									if (var6 == 1 && var12.method933(var28, var29, (byte)-32)) {
										class289.method1661(class433.field3849, true, false);
									}

									var10 = 180 + class116.field1092;
									var11 = 276;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class143.method846(false);
									}

									var10 = 180 + class116.field1092;
									var11 = 326;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class289.method1661(class433.field3734, true, false);
										return;
									}
								} else {
									int var13;
									if (class116.field1097 == 4) {
										var10 = 180 + class116.field1092 - 80;
										var11 = 321;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											class110.field1061.trim();
											if (class110.field1061.length() != 6) {
												class174.method993(class433.field3697, class433.field3581, class433.field3660);
												return;
											}

											class242.field2213 = Integer.parseInt(class110.field1061);
											class110.field1061 = "";
											class353.method1926(true);
											class174.method993(class433.field3767, class433.field3768, class433.field3753);
											class104.method675(20);
											return;
										}

										if (var6 == 1 && var28 >= class116.field1092 + 180 - 9 && var28 <= 130 + 180 + class116.field1092 && var29 >= 263 && var29 <= 296) {
											class116.field1107 = !class116.field1107;
										}

										if (var6 == 1 && var28 >= 180 + class116.field1092 - 34 && var28 <= 34 + 180 + class116.field1092 && var29 >= 351 && var29 <= 363) {
											class289.method1661(class433.field3734, true, false);
										}

										var10 = 180 + class116.field1092 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											class337.method1864(0);
											class116.field1110 = "";
											class116.field1103 = "";
											class242.field2213 = 0;
											class110.field1061 = "";
										}

										while (var30.method2119()) {
											var33 = false;

											for (var13 = 0; var13 < class116.field1115.length(); ++var13) {
												if (var30.field3428 == class116.field1115.charAt(var13)) {
													var33 = true;
													break;
												}
											}

											if (var30.field3441 == 13) {
												class337.method1864(0);
												class116.field1110 = "";
												class116.field1103 = "";
												class242.field2213 = 0;
												class110.field1061 = "";
											} else {
												if (var30.field3441 == 85 && class110.field1061.length() > 0) {
													class110.field1061 = class110.field1061.substring(0, class110.field1061.length() - 1);
												}

												if (var30.field3441 == 84) {
													class110.field1061.trim();
													if (class110.field1061.length() != 6) {
														class174.method993(class433.field3697, class433.field3581, class433.field3660);
														return;
													}

													class242.field2213 = Integer.parseInt(class110.field1061);
													class110.field1061 = "";
													class353.method1926(true);
													class174.method993(class433.field3767, class433.field3768, class433.field3753);
													class104.method675(20);
													return;
												}

												if (var33 && class110.field1061.length() < 6) {
													class110.field1061 = class110.field1061 + var30.field3428;
												}
											}
										}
									} else {
										int var14;
										if (class116.field1097 == 5) {
											var10 = 180 + class116.field1092 - 80;
											var11 = 321;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												class251.method1484();
												return;
											}

											var10 = 80 + 180 + class116.field1092;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												class143.method847(true);
											}

											var35 = 361;
											if (null != class150.field1402) {
												var13 = class150.field1402.field1644 / 2;
												if (var6 == 1 && var28 >= class150.field1402.field1645 - var13 && var28 <= class150.field1402.field1645 + var13 && var29 >= var35 - 15 && var29 < var35) {
													class289.method1661(class230.method1326("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var30.method2119()) {
												var36 = false;

												for (var14 = 0; var14 < class116.field1109.length(); ++var14) {
													if (var30.field3428 == class116.field1109.charAt(var14)) {
														var36 = true;
														break;
													}
												}

												if (var30.field3441 == 13) {
													class143.method847(true);
												} else {
													if (var30.field3441 == 85 && class116.field1110.length() > 0) {
														class116.field1110 = class116.field1110.substring(0, class116.field1110.length() - 1);
													}

													if (var30.field3441 == 84) {
														class251.method1484();
														return;
													}

													if (var36 && class116.field1110.length() < 320) {
														class116.field1110 = class116.field1110 + var30.field3428;
													}
												}
											}
										} else if (class116.field1097 != 6) {
											if (class116.field1097 == 7) {
												if (class292.field2722 && !Client.field238) {
													var10 = class315.field2826 - 150;
													var34 = var10 + 240 + 25 + 40;
													var35 = 231;
													var13 = var35 + 40;
													if (var6 == 1 && var28 >= var10 && var28 <= var34 && var29 >= var35 && var29 <= var13) {
														var15 = var10;
														var16 = 0;

														while (true) {
															if (var16 >= 8) {
																var14 = 0;
																break;
															}

															if (var28 <= var15 + 30) {
																var14 = var16;
																break;
															}

															var15 += 30;
															var15 += var16 != 1 && var16 != 3 ? 5 : 20;
															++var16;
														}

														class116.field1102 = var14;
													}

													var14 = 180 + class116.field1092 - 80;
													short var38 = 321;
													boolean var42;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var38 - 20 && var29 <= var38 + 20) {
														var42 = class73.method518();
														if (var42) {
															class104.method675(50);
															return;
														}
													}

													var14 = class116.field1092 + 180 + 80;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var38 - 20 && var29 <= var38 + 20) {
														class116.field1105 = new String[8];
														class143.method847(true);
													}

													while (var30.method2119()) {
														if (var30.field3441 == 101) {
															class116.field1105[class116.field1102] = null;
														}

														if (var30.field3441 == 85) {
															if (class116.field1105[class116.field1102] == null && class116.field1102 > 0) {
																--class116.field1102;
															}

															class116.field1105[class116.field1102] = null;
														}

														if (var30.field3428 >= '0' && var30.field3428 <= '9') {
															class116.field1105[class116.field1102] = "" + var30.field3428;
															if (class116.field1102 < 7) {
																++class116.field1102;
															}
														}

														if (var30.field3441 == 84) {
															var42 = class73.method518();
															if (var42) {
																class104.method675(50);
															}

															return;
														}
													}
												} else {
													var10 = 180 + class116.field1092 - 80;
													var11 = 321;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
														class289.method1661(class230.method1326("secure", true) + "m=dob/set_dob.ws", true, false);
														class174.method993(class433.field3798, class433.field3799, class433.field3683);
														class337.method1864(6);
														return;
													}

													var10 = 80 + class116.field1092 + 180;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
														class143.method847(true);
													}
												}
											} else if (class116.field1097 == 8) {
												var10 = 180 + class116.field1092 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class289.method1661("https://www.jagex.com/terms/privacy", true, false);
													class174.method993(class433.field3798, class433.field3799, class433.field3683);
													class337.method1864(6);
													return;
												}

												var10 = class116.field1092 + 180 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class143.method847(true);
												}
											} else if (class116.field1097 == 9) {
												var10 = 180 + class116.field1092;
												var11 = 311;
												if (var30.field3441 == 84 || var30.field3441 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class143.method846(false);
												}
											} else if (class116.field1097 == 10) {
												var10 = 180 + class116.field1092;
												var11 = 209;
												if (var30.field3441 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= var11 && var29 <= var11 + 68) {
													class174.method993(class433.field3767, class433.field3768, class433.field3753);
													Client.field48 = class75.field828;
													class353.method1926(false);
													class104.method675(20);
												}
											} else if (class116.field1097 == 12) {
												var10 = class315.field2826;
												var11 = 233;
												var12 = var2.method1296(0, 30, class433.field3830, var10, var11);
												class169 var37 = var2.method1296(32, 32, class433.field3830, var10, var11);
												class169 var39 = var2.method1296(70, 34, class433.field3830, var10, var11);
												var34 = var11 + 17;
												class169 var40 = var2.method1296(0, 34, class433.field3831, var10, var34);
												if (var6 == 1) {
													if (var12.method933(var28, var29, (byte)-43)) {
														class289.method1661("https://www.jagex.com/terms", true, false);
													} else if (var37.method933(var28, var29, (byte)-50)) {
														class289.method1661("https://www.jagex.com/terms/privacy", true, false);
													} else if (var39.method933(var28, var29, (byte)-15) || var40.method933(var28, var29, (byte)-15)) {
														class289.method1661("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var10 = class315.field2826 - 80;
												var11 = 311;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class148.method859();
													class143.method846(true);
												}

												var10 = class315.field2826 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class116.field1097 = 13;
												}
											} else if (class116.field1097 == 13) {
												var10 = class315.field2826;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class143.method846(true);
												}
											} else if (class116.field1097 == 14) {
												String var41 = "";
												switch(class116.field1095) {
												case 0:
													var41 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var41 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var41 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													class143.method847(false);
												}

												var34 = class116.field1092 + 180;
												var35 = 276;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
													class289.method1661(var41, true, false);
													class174.method993(class433.field3798, class433.field3799, class433.field3683);
													class337.method1864(6);
													return;
												}

												var34 = 180 + class116.field1092;
												var35 = 326;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
													class143.method847(false);
												}
											} else if (class116.field1097 == 24) {
												var10 = class116.field1092 + 180;
												var11 = 301;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class143.method846(false);
												}
											} else if (class116.field1097 == 32) {
												var10 = class116.field1092 + 180 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class289.method1661(class230.method1326("secure", true) + "m=dob/set_dob.ws", true, false);
													class174.method993(class433.field3798, class433.field3799, class433.field3683);
													class337.method1864(6);
													return;
												}

												var10 = 80 + 180 + class116.field1092;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class143.method847(true);
												}
											} else if (class116.field1097 == 33) {
												var10 = class116.field1092 + 180;
												var11 = 276;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class289.method1661(class433.field3849, true, false);
												}

												var10 = class116.field1092 + 180;
												var11 = 326;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class143.method847(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var30.method2119()) {
														var32 = 321;
														if (var6 == 1 && var29 >= var32 - 20 && var29 <= var32 + 20) {
															class143.method847(true);
														}

														return;
													}
												} while(var30.field3441 != 84 && var30.field3441 != 13);

												class143.method847(true);
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
