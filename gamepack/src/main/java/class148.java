public class class148 implements class367 {
	public static final class148 field1390;
	public static final class148 field1391;
	static class132 field1397;
	static String field1398;
	static final class148 field1392;
	static final class148 field1393;
	static final class148 field1394;
	boolean field1396;
	boolean field1399;
	int field1389;
	String field1395;

	static {
		field1391 = new class148(0, "POST", true, true);
		field1390 = new class148(1, "GET", true, false);
		field1394 = new class148(2, "PUT", false, true);
		field1392 = new class148(3, "PATCH", false, true);
		field1393 = new class148(4, "DELETE", false, true);
	}

	class148(int var1, String var2, boolean var3, boolean var4) {
		this.field1389 = var1;
		this.field1395 = var2;
		this.field1399 = var3;
		this.field1396 = var4;
	}

	boolean method857() {
		return this.field1399;
	}

	public String method855() {
		return this.field1395;
	}

	boolean method856() {
		return this.field1396;
	}

	public int method1970() {
		return this.field1389;
	}

	static final void method858(class60[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class60 var10 = var0[var9];
			if (null != var10 && var1 == var10.field661 && (var10.method446() || class447.method2235(var10) != 0 || var10 == Client.field206)) {
				if (var10.field724) {
					if (class538.method2584(var10)) {
						continue;
					}
				} else if (var10.field646 == 0 && class464.field3990 != var10 && class538.method2584(var10)) {
					continue;
				}

				if (var10.field646 == 11) {
					if (var10.method467(class136.field1326)) {
						if (var10.method469()) {
							class185.method1024(var10);
							class116.method738(var10.field776, var10, true);
						}

						if (var10.field709 != null) {
							class309 var11 = new class309();
							var11.field2791 = var10;
							var11.field2794 = var10.field709;
							Client.field218.method567(var11);
						}
					}
				} else if (var10.field646 == 12 && var10.method461()) {
					class185.method1024(var10);
				}

				int var27 = var10.field645 + var6;
				int var12 = var7 + var10.field658;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var10.field646 == 9) {
					var17 = var27;
					var18 = var12;
					var19 = var27 + var10.field659;
					int var20 = var10.field636 + var12;
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
					var17 = var27 + var10.field659;
					var18 = var10.field636 + var12;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}

				if (Client.field187 == var10) {
					Client.field239 = true;
					Client.field41 = var27;
					Client.field113 = var12;
				}

				boolean var28 = false;
				if (var10.field716) {
					switch(Client.field17) {
					case 0:
						var28 = true;
					case 1:
					default:
						break;
					case 2:
						if (var10.field644 >>> 16 == Client.field178) {
							var28 = true;
						}
						break;
					case 3:
						if (Client.field178 == var10.field644) {
							var28 = true;
						}
					}
				}

				if (var28 || !var10.field724 || var13 < var15 && var14 < var16) {
					if (var10.field724) {
						class309 var29;
						if (var10.field786) {
							if (class184.field1745 >= var13 && class184.field1728 >= var14 && class184.field1745 < var15 && class184.field1728 < var16) {
								for (var29 = (class309)Client.field218.method563(); var29 != null; var29 = (class309)Client.field218.method565()) {
									if (var29.field2802) {
										var29.method2269();
										var29.field2791.field664 = false;
									}
								}

								class486.method2402();
								if (class40.field519 == 0) {
									Client.field187 = null;
									Client.field206 = null;
								}

								if (!Client.field116) {
									class449.method2239();
								}
							}
						} else if (var10.field787 && class184.field1745 >= var13 && class184.field1728 >= var14 && class184.field1745 < var15 && class184.field1728 < var16) {
							for (var29 = (class309)Client.field218.method563(); null != var29; var29 = (class309)Client.field218.method565()) {
								if (var29.field2802 && var29.field2791.field669 == var29.field2794) {
									var29.method2269();
								}
							}
						}
					}

					var18 = class184.field1745;
					var19 = class184.field1728;
					if (class184.field1739 != 0) {
						var18 = class184.field1740;
						var19 = class184.field1741;
					}

					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (var10.field670 == 1337) {
						if (!Client.field16 && !Client.field116 && var30) {
							class128.method771(var18, var19, var13, var14);
						}
					} else if (var10.field670 == 1338) {
						class435.method2207(var10, var27, var12);
					} else {
						if (var10.field670 == 1400) {
							class306.field2771.method1128(class184.field1745, class184.field1728, var30, var27, var12, var10.field659, var10.field636);
						}

						if (!Client.field116 && var30) {
							if (var10.field670 == 1400) {
								class306.field2771.method1121(var27, var12, var10.field659, var10.field636, var18, var19);
							} else {
								class395.method2069(var10);
							}
						}

						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field693.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && null != var10.field693[var21]) {
									for (var24 = 0; var24 < var10.field693[var21].length; ++var24) {
										boolean var25 = false;
										if (null != var10.field785) {
											var25 = Client.field151.method2118(var10.field693[var21][var24]);
										}

										if (class506.method2440(var10.field693[var21][var24]) || var25) {
											var22 = true;
											if (var10.field785 != null && var10.field785[var21] > Client.field306) {
												break;
											}

											byte var26 = var10.field789[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !Client.field151.method2118(86) && !Client.field151.method2118(82) && !Client.field151.method2118(81)) && ((var26 & 2) == 0 || Client.field151.method2118(86)) && ((var26 & 1) == 0 || Client.field151.method2118(82)) && ((var26 & 4) == 0 || Client.field151.method2118(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var21 < 10) {
										class164.method912(var21 + 1, var10.field644, var10.field763, var10.field772, "");
									} else if (var21 == 10) {
										class67.method494();
										class53.method391(var10.field644, var10.field763, class190.method1044(class447.method2235(var10)), var10.field772);
										Client.field186 = class58.method426(var10);
										if (null == Client.field186) {
											Client.field186 = class433.field3850;
										}

										Client.field197 = var10.field648 + class394.method2064(16777215);
									}

									var24 = var10.field719[var21];
									if (var10.field785 == null) {
										var10.field785 = new int[var10.field693.length];
									}

									if (var10.field720 == null) {
										var10.field720 = new int[var10.field693.length];
									}

									if (var24 != 0) {
										if (var10.field785[var21] == 0) {
											var10.field785[var21] = var10.field720[var21] + var24 + Client.field306;
										} else {
											var10.field785[var21] = Client.field306 + var24;
										}
									} else {
										var10.field785[var21] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && null != var10.field785) {
									var10.field785[var21] = 0;
								}
							}
						}

						if (var10.field724) {
							if (class184.field1745 >= var13 && class184.field1728 >= var14 && class184.field1745 < var15 && class184.field1728 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}

							boolean var31 = false;
							if ((class184.field1735 == 1 || !class30.field467 && class184.field1735 == 4) && var30) {
								var31 = true;
							}

							var22 = false;
							if ((class184.field1739 == 1 || !class30.field467 && class184.field1739 == 4) && class184.field1740 >= var13 && class184.field1741 >= var14 && class184.field1740 < var15 && class184.field1741 < var16) {
								var22 = true;
							}

							if (var22) {
								class54.method400(var10, class184.field1740 - var27, class184.field1741 - var12);
							}

							if (var10.method447()) {
								if (var22) {
									Client.field257.method567(new class333(0, class184.field1745 - var27, class184.field1728 - var12, var10));
								}

								if (var31) {
									Client.field257.method567(new class333(1, class184.field1745 - var27, class184.field1728 - var12, var10));
								}
							}

							if (var10.field670 == 1400) {
								class306.field2771.method1082(var18, var19, var30 & var31, var30 & var22);
							}

							if (null != Client.field187 && Client.field187 != var10 && var30 && class37.method245(class447.method2235(var10))) {
								Client.field191 = var10;
							}

							if (Client.field206 == var10) {
								Client.field192 = true;
								Client.field193 = var27;
								Client.field194 = var12;
							}

							if (var10.field727) {
								class309 var32;
								if (var30 && Client.field216 != 0 && var10.field669 != null) {
									var32 = new class309();
									var32.field2802 = true;
									var32.field2791 = var10;
									var32.field2795 = Client.field216;
									var32.field2794 = var10.field669;
									Client.field218.method567(var32);
								}

								if (Client.field187 != null || Client.field116) {
									var22 = false;
									var31 = false;
									var30 = false;
								}

								if (!var10.field778 && var22) {
									var10.field778 = true;
									if (var10.field696 != null) {
										var32 = new class309();
										var32.field2802 = true;
										var32.field2791 = var10;
										var32.field2792 = class184.field1740 - var27;
										var32.field2795 = class184.field1741 - var12;
										var32.field2794 = var10.field696;
										Client.field218.method567(var32);
									}
								}

								if (var10.field778 && var31 && var10.field642 != null) {
									var32 = new class309();
									var32.field2802 = true;
									var32.field2791 = var10;
									var32.field2792 = class184.field1745 - var27;
									var32.field2795 = class184.field1728 - var12;
									var32.field2794 = var10.field642;
									Client.field218.method567(var32);
								}

								if (var10.field778 && !var31) {
									var10.field778 = false;
									if (var10.field729 != null) {
										var32 = new class309();
										var32.field2802 = true;
										var32.field2791 = var10;
										var32.field2792 = class184.field1745 - var27;
										var32.field2795 = class184.field1728 - var12;
										var32.field2794 = var10.field729;
										Client.field220.method567(var32);
									}
								}

								if (var31 && null != var10.field732) {
									var32 = new class309();
									var32.field2802 = true;
									var32.field2791 = var10;
									var32.field2792 = class184.field1745 - var27;
									var32.field2795 = class184.field1728 - var12;
									var32.field2794 = var10.field732;
									Client.field218.method567(var32);
								}

								if (!var10.field664 && var30) {
									var10.field664 = true;
									if (null != var10.field733) {
										var32 = new class309();
										var32.field2802 = true;
										var32.field2791 = var10;
										var32.field2792 = class184.field1745 - var27;
										var32.field2795 = class184.field1728 - var12;
										var32.field2794 = var10.field733;
										Client.field218.method567(var32);
									}
								}

								if (var10.field664 && var30 && null != var10.field734) {
									var32 = new class309();
									var32.field2802 = true;
									var32.field2791 = var10;
									var32.field2792 = class184.field1745 - var27;
									var32.field2795 = class184.field1728 - var12;
									var32.field2794 = var10.field734;
									Client.field218.method567(var32);
								}

								if (var10.field664 && !var30) {
									var10.field664 = false;
									if (null != var10.field705) {
										var32 = new class309();
										var32.field2802 = true;
										var32.field2791 = var10;
										var32.field2792 = class184.field1745 - var27;
										var32.field2795 = class184.field1728 - var12;
										var32.field2794 = var10.field705;
										Client.field220.method567(var32);
									}
								}

								if (var10.field637 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field637;
									Client.field204.method567(var32);
								}

								int var35;
								class309 var37;
								int var38;
								if (var10.field711 != null && Client.field201 > var10.field780) {
									if (var10.field741 != null && Client.field201 - var10.field780 <= 32) {
										label643:
										for (var38 = var10.field780; var38 < Client.field201; ++var38) {
											var24 = Client.field200[var38 & 31];

											for (var35 = 0; var35 < var10.field741.length; ++var35) {
												if (var10.field741[var35] == var24) {
													var37 = new class309();
													var37.field2791 = var10;
													var37.field2794 = var10.field711;
													Client.field218.method567(var37);
													break label643;
												}
											}
										}
									} else {
										var32 = new class309();
										var32.field2791 = var10;
										var32.field2794 = var10.field711;
										Client.field218.method567(var32);
									}

									var10.field780 = Client.field201;
								}

								if (null != var10.field742 && Client.field203 > var10.field781) {
									if (null != var10.field673 && Client.field203 - var10.field781 <= 32) {
										label619:
										for (var38 = var10.field781; var38 < Client.field203; ++var38) {
											var24 = Client.field202[var38 & 31];

											for (var35 = 0; var35 < var10.field673.length; ++var35) {
												if (var24 == var10.field673[var35]) {
													var37 = new class309();
													var37.field2791 = var10;
													var37.field2794 = var10.field742;
													Client.field218.method567(var37);
													break label619;
												}
											}
										}
									} else {
										var32 = new class309();
										var32.field2791 = var10;
										var32.field2794 = var10.field742;
										Client.field218.method567(var32);
									}

									var10.field781 = Client.field203;
								}

								if (null != var10.field744 && Client.field205 > var10.field782) {
									if (null != var10.field745 && Client.field205 - var10.field782 <= 32) {
										label595:
										for (var38 = var10.field782; var38 < Client.field205; ++var38) {
											var24 = Client.field127[var38 & 31];

											for (var35 = 0; var35 < var10.field745.length; ++var35) {
												if (var24 == var10.field745[var35]) {
													var37 = new class309();
													var37.field2791 = var10;
													var37.field2794 = var10.field744;
													Client.field218.method567(var37);
													break label595;
												}
											}
										}
									} else {
										var32 = new class309();
										var32.field2791 = var10;
										var32.field2794 = var10.field744;
										Client.field218.method567(var32);
									}

									var10.field782 = Client.field205;
								}

								if (Client.field208 > var10.field713 && null != var10.field635) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field635;
									Client.field218.method567(var32);
								}

								if (Client.field209 > var10.field713 && var10.field701 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field701;
									Client.field218.method567(var32);
								}

								if (Client.field210 > var10.field713 && var10.field755 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field755;
									Client.field218.method567(var32);
								}

								if (Client.field211 > var10.field713 && var10.field756 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field756;
									Client.field218.method567(var32);
								}

								if (Client.field212 > var10.field713 && var10.field757 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field757;
									Client.field218.method567(var32);
								}

								if (Client.field213 > var10.field713 && var10.field762 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field762;
									Client.field218.method567(var32);
								}

								if (Client.field74 > var10.field713 && var10.field777 != null) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field777;
									Client.field218.method567(var32);
								}

								if (Client.field55 > var10.field713 && null != var10.field758) {
									var32 = new class309();
									var32.field2791 = var10;
									var32.field2794 = var10.field758;
									Client.field218.method567(var32);
								}

								var10.field713 = Client.field5;
								if (var10.field751 != null) {
									for (var38 = 0; var38 < Client.field243; ++var38) {
										class309 var36 = new class309();
										var36.field2791 = var10;
										var36.field2793 = Client.field245[var38];
										var36.field2799 = Client.field244[var38];
										var36.field2794 = var10.field751;
										Client.field218.method567(var36);
									}
								}

								class309 var39;
								int[] var40;
								if (null != var10.field761) {
									var40 = Client.field151.method2116();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class309();
										var39.field2791 = var10;
										var39.field2793 = var40[var24];
										var39.field2794 = var10.field761;
										Client.field218.method567(var39);
									}
								}

								if (var10.field718 != null) {
									var40 = Client.field151.method2117();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class309();
										var39.field2791 = var10;
										var39.field2793 = var40[var24];
										var39.field2794 = var10.field718;
										Client.field218.method567(var39);
									}
								}
							}
						}

						if (!var10.field724) {
							if (null != Client.field187 || Client.field116) {
								continue;
							}

							if ((var10.field768 >= 0 || var10.field671 != 0) && class184.field1745 >= var13 && class184.field1728 >= var14 && class184.field1745 < var15 && class184.field1728 < var16) {
								if (var10.field768 >= 0) {
									class464.field3990 = var0[var10.field768];
								} else {
									class464.field3990 = var10;
								}
							}

							if (var10.field646 == 8 && class184.field1745 >= var13 && class184.field1728 >= var14 && class184.field1745 < var15 && class184.field1728 < var16) {
								class138.field1329 = var10;
							}

							if (var10.field666 > var10.field636) {
								class232.method1336(var10, var10.field659 + var27, var12, var10.field636, var10.field666, class184.field1745, class184.field1728);
							}
						}

						if (var10.field646 == 0) {
							method858(var0, var10.field644, var13, var14, var15, var16, var27 - var10.field663, var12 - var10.field677);
							if (var10.field776 != null) {
								method858(var10.field776, var10.field644, var13, var14, var15, var16, var27 - var10.field663, var12 - var10.field677);
							}

							class534 var33 = (class534)Client.field24.method1492((long)var10.field644);
							if (null != var33) {
								if (var33.field4268 == 0 && class184.field1745 >= var13 && class184.field1728 >= var14 && class184.field1745 < var15 && class184.field1728 < var16 && !Client.field116) {
									for (class309 var34 = (class309)Client.field218.method563(); var34 != null; var34 = (class309)Client.field218.method565()) {
										if (var34.field2802) {
											var34.method2269();
											var34.field2791.field664 = false;
										}
									}

									if (class40.field519 == 0) {
										Client.field187 = null;
										Client.field206 = null;
									}

									if (!Client.field116) {
										class449.method2239();
									}
								}

								class95.method623(var33.field4270, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}

	}

	static void method859() {
		class176.field1701.method2514(Client.field8);
	}
}
