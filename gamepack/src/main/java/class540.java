public class class540 {
	class540() throws Throwable {
	}

	static class115 method2586(int var0, int var1, int var2) {
		class270 var4 = class87.field873;
		long var5 = (long)(var2 << 16 | var0 << 8 | var1);
		return (class115)var4.method1580(var5);
	}

	public static void method2587(class60 var0, int var1, int var2) {
		class363 var4 = var0.field700;
		boolean var5 = var4.field3054 != var2;
		var4.field3054 = var2;
		if (var5) {
			int var6;
			int var7;
			if (var4.field3054 == var1) {
				for (var6 = 0; var6 < class363.field3061.length; ++var6) {
					var7 = class363.field3061[var6];
					if (var4.field3052[var7] > 0 && var4.field3052[var7] < 512) {
						var4.field3052[var7] = var4.field3065[var7];
					}
				}
			} else {
				if (var4.field3052[0] < 512 || class163.method910(var4)) {
					var4.field3052[class100.field1007.field1003] = 1;
				}

				for (var6 = 0; var6 < 7; ++var6) {
					var7 = class363.field3061[var6];
					if (var4.field3052[var7] > 0 && var4.field3052[var7] < 512) {
						int[] var8 = var4.field3052;

						for (int var9 = 0; var9 < class404.field3386; ++var9) {
							class404 var10 = class419.method2161(var9);
							if (null != var10 && !var10.field3393 && var6 + (var2 == 1 ? 7 : 0) == var10.field3387) {
								var8[class363.field3061[var6]] = var9 + 256;
								break;
							}
						}
					}
				}
			}
		}

		var4.method1959();
	}

	static final void method2589(int var0, int var1) {
		class86 var3 = Client.field143[class358.field3038][var0][var1];
		if (null == var3) {
			class415.field3487.method1768(class358.field3038, var0, var1);
		} else {
			long var4 = -99999999L;
			class13 var6 = null;

			class13 var7;
			for (var7 = (class13)var3.method563(); var7 != null; var7 = (class13)var3.method565()) {
				class210 var8 = class67.method492(var7.field376);
				long var9 = (long)var8.field1950;
				if (var8.field1949 == 1) {
					var9 *= var7.field377 < Integer.MAX_VALUE ? (long)(var7.field377 + 1) : (long)var7.field377;
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (var6 == null) {
				class415.field3487.method1768(class358.field3038, var0, var1);
			} else {
				var3.method568(var6);
				class13 var12 = null;
				class13 var13 = null;

				for (var7 = (class13)var3.method563(); var7 != null; var7 = (class13)var3.method565()) {
					if (var7.field376 != var6.field376) {
						if (var12 == null) {
							var12 = var7;
						}

						if (var7.field376 != var12.field376 && null == var13) {
							var13 = var7;
						}
					}
				}

				long var10 = class182.method1013(var0, var1, 3, false, 0);
				class415.field3487.method1760(class358.field3038, var0, var1, class454.method2262(var0 * 128 + 64, 64 + var1 * 128, class358.field3038), var6, var10, var12, var13);
			}
		}
	}

	static final void method2588(class60[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class266.method1555(var2, var3, var4, var5);
		class133.method791();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			class60 var11 = var0[var10];
			if (null != var11 && (var11.field661 == var1 || var1 == -1412584499 && Client.field187 == var11)) {
				int var12;
				if (var8 == -1) {
					Client.field228[Client.field174] = var11.field645 + var6;
					Client.field229[Client.field174] = var7 + var11.field658;
					Client.field230[Client.field174] = var11.field659;
					Client.field231[Client.field174] = var11.field636;
					var12 = ++Client.field174 - 1;
				} else {
					var12 = var8;
				}

				var11.field783 = var12;
				var11.field784 = Client.field306;
				if (!var11.field724 || !class538.method2584(var11)) {
					if (var11.field670 > 0) {
						class63.method482(var11);
					}

					int var13 = var11.field645 + var6;
					int var14 = var11.field658 + var7;
					int var15 = var11.field665;
					int var16;
					int var17;
					if (var11 == Client.field187) {
						if (var1 != -1412584499 && !var11.field725) {
							class539.field4279 = var0;
							class128.field1175 = var6;
							class44.field537 = var7;
							continue;
						}

						if (Client.field198 && Client.field192) {
							var16 = class184.field1745;
							var17 = class184.field1728;
							var16 -= Client.field189;
							var17 -= Client.field262;
							if (var16 < Client.field193) {
								var16 = Client.field193;
							}

							if (var16 + var11.field659 > Client.field193 + Client.field206.field659) {
								var16 = Client.field206.field659 + Client.field193 - var11.field659;
							}

							if (var17 < Client.field194) {
								var17 = Client.field194;
							}

							if (var17 + var11.field636 > Client.field194 + Client.field206.field636) {
								var17 = Client.field194 + Client.field206.field636 - var11.field636;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field725) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.field646 == 9) {
						var20 = var13;
						var21 = var14;
						var22 = var11.field659 + var13;
						var23 = var14 + var11.field636;
						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						if (var23 < var14) {
							var21 = var23;
							var23 = var14;
						}

						++var22;
						++var23;
						var16 = var20 > var2 ? var20 : var2;
						var17 = var21 > var3 ? var21 : var3;
						var18 = var22 < var4 ? var22 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var20 = var13 + var11.field659;
						var21 = var14 + var11.field636;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}

					if (!var11.field724 || var16 < var18 && var17 < var19) {
						if (var11.field670 != 0) {
							if (var11.field670 == 1336) {
								if (class176.field1701.method2497()) {
									var14 += 15;
									class324.field2900.method1298("Fps:" + class172.field1657, var13 + var11.field659, var14, 16776960, -1);
									var14 += 15;
									Runtime var45 = Runtime.getRuntime();
									var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !Client.field7) {
										var22 = 16711680;
									}

									class324.field2900.method1298("Mem:" + var21 + "k", var11.field659 + var13, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field670 == 1337) {
								Client.field164 = var13;
								Client.field165 = var14;
								class93.method617(var13, var14, var11.field659, var11.field636);
								Client.field13[var11.field783] = true;
								class266.method1555(var2, var3, var4, var5);
								continue;
							}

							if (var11.field670 == 1338) {
								class290.method1665(var11, var13, var14, var12);
								class266.method1555(var2, var3, var4, var5);
								continue;
							}

							if (var11.field670 == 1339) {
								class533.method2567(var11, var13, var14, var12);
								class266.method1555(var2, var3, var4, var5);
								continue;
							}

							if (var11.field670 == 1400) {
								class306.field2771.method1136(var13, var14, var11.field659, var11.field636, Client.field306);
							}

							if (var11.field670 == 1401) {
								class306.field2771.method1126(var13, var14, var11.field659, var11.field636);
							}

							if (var11.field670 == 1402) {
								class196.field1790.method631(var13, Client.field306);
							}
						}

						if (var11.field646 == 0) {
							if (!var11.field724 && class538.method2584(var11) && class464.field3990 != var11) {
								continue;
							}

							if (!var11.field724) {
								if (var11.field677 > var11.field666 - var11.field636) {
									var11.field677 = var11.field666 - var11.field636;
								}

								if (var11.field677 < 0) {
									var11.field677 = 0;
								}
							}

							method2588(var0, var11.field644, var16, var17, var18, var19, var13 - var11.field663, var14 - var11.field677, var12);
							if (null != var11.field776) {
								method2588(var11.field776, var11.field644, var16, var17, var18, var19, var13 - var11.field663, var14 - var11.field677, var12);
							}

							class534 var29 = (class534)Client.field24.method1492((long)var11.field644);
							if (null != var29) {
								class493.method2411(var29.field4270, var16, var17, var18, var19, var13, var14, var12);
							}

							class266.method1555(var2, var3, var4, var5);
							class133.method791();
						} else if (var11.field646 == 11) {
							if (class538.method2584(var11) && var11 != class464.field3990) {
								continue;
							}

							if (var11.field776 != null) {
								method2588(var11.field776, var11.field644, var16, var17, var18, var19, var13 - var11.field663, var14 - var11.field677, var12);
							}

							class266.method1555(var2, var3, var4, var5);
							class133.method791();
						}

						if (Client.field234 || Client.field227[var12] || Client.field232 > 1) {
							if (var11.field646 == 0 && !var11.field724 && var11.field666 > var11.field636) {
								class36.method243(var13 + var11.field659, var14, var11.field677, var11.field636, var11.field666);
							}

							if (var11.field646 != 1) {
								if (var11.field646 == 3) {
									if (class240.method1378(var11)) {
										var20 = var11.field668;
										if (var11 == class464.field3990 && var11.field714 != 0) {
											var20 = var11.field714;
										}
									} else {
										var20 = var11.field667;
										if (class464.field3990 == var11 && var11.field671 != 0) {
											var20 = var11.field671;
										}
									}

									if (var11.field706) {
										switch(var11.field672.field3238) {
										case 1:
											class266.method1549(var13, var14, var11.field659, var11.field636, var11.field667, var11.field668);
											break;
										case 2:
											class266.method1562(var13, var14, var11.field659, var11.field636, var11.field667, var11.field668, 255 - (var11.field665 & 255), 255 - (var11.field674 & 255));
											break;
										default:
											if (var15 == 0) {
												class266.method1548(var13, var14, var11.field659, var11.field636, var20);
											} else {
												class266.method1547(var13, var14, var11.field659, var11.field636, var20, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										class266.method1551(var13, var14, var11.field659, var11.field636, var20);
									} else {
										class266.method1552(var13, var14, var11.field659, var11.field636, var20, 256 - (var15 & 255));
									}
								} else if (var11.field646 == 4) {
									class253 var37 = var11.method442();
									if (var37 == null) {
										if (class60.field643) {
											class185.method1024(var11);
										}
									} else {
										String var44 = var11.field704;
										if (class240.method1378(var11)) {
											var21 = var11.field668;
											if (var11 == class464.field3990 && var11.field714 != 0) {
												var21 = var11.field714;
											}

											if (var11.field632.length() > 0) {
												var44 = var11.field632;
											}
										} else {
											var21 = var11.field667;
											if (class464.field3990 == var11 && var11.field671 != 0) {
												var21 = var11.field671;
											}
										}

										if (var11.field724 && var11.field772 != -1) {
											class210 var46 = class67.method492(var11.field772);
											var44 = var46.field1954;
											if (null == var44) {
												var44 = class433.field3850;
											}

											if ((var46.field1949 == 1 || var11.field773 != 1) && var11.field773 != -1) {
												var44 = class394.method2064(16748608) + var44 + class278.field2470 + " " + 'x' + class152.method878(var11.field773);
											}
										}

										if (Client.field180 == var11) {
											var44 = class433.field3812;
											var21 = var11.field667;
										}

										if (!var11.field724) {
											var44 = class498.method2415(var44, var11);
										}

										var37.method1300(var44, var13, var14, var11.field659, var11.field636, var21, var11.field634 ? 0 : -1, class255.method1498(var11.field665), var11.field707, var11.field765, var11.field740);
									}
								} else {
									int var25;
									int var26;
									int var41;
									if (var11.field646 == 5) {
										class115 var35;
										if (!var11.field724) {
											var35 = var11.method463(class240.method1378(var11), class136.field1326);
											if (null != var35) {
												var35.method732(var13, var14);
											} else if (class60.field643) {
												class185.method1024(var11);
											}
										} else {
											if (var11.field772 != -1) {
												var35 = class239.method1364(var11.field772, var11.field773, var11.field682, var11.field683, var11.field703, false);
											} else {
												var35 = var11.method463(false, class136.field1326);
											}

											if (var35 == null) {
												if (class60.field643) {
													class185.method1024(var11);
												}
											} else {
												var21 = var35.field1081;
												var22 = var35.field1082;
												if (!var11.field681) {
													var23 = var11.field659 * 4096 / var21;
													if (var11.field680 != 0) {
														var35.method726(var11.field659 / 2 + var13, var11.field636 / 2 + var14, var11.field680, var23);
													} else if (var15 != 0) {
														var35.method720(var13, var14, var11.field659, var11.field636, 256 - (var15 & 255));
													} else if (var11.field659 == var21 && var22 == var11.field636) {
														var35.method732(var13, var14);
													} else {
														var35.method734(var13, var14, var11.field659, var11.field636);
													}
												} else {
													class266.method1561(var13, var14, var11.field659 + var13, var14 + var11.field636);
													var23 = (var11.field659 + (var21 - 1)) / var21;
													var41 = (var22 - 1 + var11.field636) / var22;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var41; ++var26) {
															if (var11.field680 != 0) {
																var35.method726(var21 * var25 + var13 + var21 / 2, var14 + var22 * var26 + var22 / 2, var11.field680, 4096);
															} else if (var15 != 0) {
																var35.method730(var21 * var25 + var13, var14 + var22 * var26, 256 - (var15 & 255));
															} else {
																var35.method732(var21 * var25 + var13, var14 + var22 * var26);
															}
														}
													}

													class266.method1555(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (var11.field646 == 6) {
											boolean var33 = class240.method1378(var11);
											if (var33) {
												var21 = var11.field764;
											} else {
												var21 = var11.field690;
											}

											class250 var36 = null;
											var23 = 0;
											if (var11.field772 != -1) {
												class210 var38 = class67.method492(var11.field772);
												if (null != var38) {
													var38 = var38.method1186(var11.field773);
													var36 = var38.method1185(1);
													if (null != var36) {
														var36.method1452();
														var23 = var36.field4080 / 2;
													} else {
														class185.method1024(var11);
													}
												}
											} else if (var11.field686 == 5) {
												if (var11.field687 == 0) {
													var36 = Client.field289.method1962((class393)null, -1, (class393)null, -1);
												} else {
													var36 = class82.field863.method2393();
												}
											} else if (var11.field686 == 7) {
												var36 = var11.field700.method1962((class393)null, -1, class114.method702(class82.field863.field1531), class82.field863.field1525);
											} else {
												class375 var39 = null;
												class447 var40 = null;
												if (var11.field686 == 6) {
													var26 = var11.field687;
													if (var26 >= 0 && var26 < Client.field63.length) {
														class102 var43 = Client.field63[var26];
														if (null != var43) {
															var39 = var43.field1018;
															var40 = var43.method665();
														}
													}
												}

												class393 var42 = null;
												var27 = -1;
												if (var21 != -1) {
													var42 = class114.method702(var21);
													var27 = var11.field774;
												}

												var36 = var11.method443(var42, var27, var33, class82.field863.field2523, var39, var40);
												if (var36 == null && class60.field643) {
													class185.method1024(var11);
												}
											}

											class133.method802(var11.field659 / 2 + var13, var11.field636 / 2 + var14);
											var41 = var11.field697 * class133.field1291[var11.field694] >> 16;
											var25 = class133.field1289[var11.field694] * var11.field697 >> 16;
											if (null != var36) {
												if (!var11.field724) {
													var36.method1458(0, var11.field712, 0, var11.field694, 0, var41, var25);
												} else {
													var36.method1452();
													if (var11.field717) {
														var36.method1466(0, var11.field712, var11.field759, var11.field694, var11.field692, var11.field766 + var41 + var23, var11.field766 + var25, var11.field697);
													} else {
														var36.method1458(0, var11.field712, var11.field759, var11.field694, var11.field692, var11.field766 + var41 + var23, var25 + var11.field766);
													}
												}
											}

											class133.method793();
										} else {
											class253 var31;
											if (var11.field646 == 8 && class138.field1329 == var11 && Client.field167 == Client.field166) {
												var20 = 0;
												var21 = 0;
												var31 = class324.field2900;
												String var34 = var11.field704;

												String var24;
												for (var34 = class498.method2415(var34, var11); var34.length() > 0; var21 += var31.field2066 + 1) {
													var25 = var34.indexOf(class278.field2469);
													if (var25 != -1) {
														var24 = var34.substring(0, var25);
														var34 = var34.substring(var25 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var26 = var31.method1292(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}

												var20 += 6;
												var21 += 7;
												var25 = var13 + var11.field659 - 5 - var20;
												var26 = var14 + var11.field636 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var20 + var25 > var4) {
													var25 = var4 - var20;
												}

												if (var21 + var26 > var5) {
													var26 = var5 - var21;
												}

												class266.method1548(var25, var26, var20, var21, 16777120);
												class266.method1551(var25, var26, var20, var21, 0);
												var34 = var11.field704;
												var27 = var26 + var31.field2066 + 2;

												for (var34 = class498.method2415(var34, var11); var34.length() > 0; var27 += var31.field2066 + 1) {
													int var28 = var34.indexOf(class278.field2469);
													if (var28 != -1) {
														var24 = var34.substring(0, var28);
														var34 = var34.substring(var28 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var31.method1320(var24, var25 + 3, var27, 0, -1);
												}
											}

											if (var11.field646 == 9) {
												if (var11.field676) {
													var20 = var13;
													var21 = var11.field636 + var14;
													var22 = var11.field659 + var13;
													var23 = var14;
												} else {
													var20 = var13;
													var21 = var14;
													var22 = var13 + var11.field659;
													var23 = var11.field636 + var14;
												}

												if (var11.field675 == 1) {
													class266.method1550(var20, var21, var22, var23, var11.field667);
												} else {
													class168.method930(var20, var21, var22, var23, var11.field667, var11.field675);
												}
											} else if (var11.field646 == 12) {
												class477 var30 = var11.method472();
												class62 var32 = var11.method458();
												if (null != var30 && null != var32 && var30.method2348()) {
													var31 = var11.method442();
													if (var31 != null) {
														Client.field217.method2590(var13, var14, var11.field659, var11.field636, var30.method2349(), var30.method2374(), var30.method2346(), var30.method2347(), var30.method2367());
														var23 = var11.field634 ? var11.field683 : -1;
														if (!var30.method2344() && var30.method2368().method1434()) {
															Client.field217.method2591(var32.field803, var23, var32.field801, var32.field802);
															Client.field217.method2592(var30.method2342(), var31, (byte)-101);
														} else {
															Client.field217.method2591(var11.field667, var23, var32.field801, var32.field802);
															Client.field217.method2592(var30.method2368(), var31, (byte)-117);
														}

														class266.method1555(var2, var3, var4, var5);
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
}
