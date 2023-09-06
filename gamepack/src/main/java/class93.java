public class class93 implements class367 {
	static long field931;
	static final class93 field912;
	static final class93 field913;
	static final class93 field914;
	static final class93 field915;
	static final class93 field916;
	static final class93 field917;
	static final class93 field918;
	static final class93 field919;
	static final class93 field920;
	static final class93 field921;
	static final class93 field922;
	static final class93 field923;
	static final class93 field924;
	static final class93 field925;
	static final class93 field926;
	static final class93 field928;
	static final class93 field930;
	final int field911;
	final int field927;
	final int field929;

	static {
		field916 = new class93(0, 0, (String)null, -1, -1);
		field912 = new class93(1, 1, (String)null, 0, 2);
		field913 = new class93(2, 2, (String)null, 1, 2);
		field914 = new class93(3, 3, (String)null, 2, 2);
		field920 = new class93(4, 4, (String)null, 3, 1);
		field930 = new class93(5, 5, (String)null, 4, 1);
		field917 = new class93(6, 6, (String)null, 5, 1);
		field918 = new class93(7, 7, (String)null, 6, 3);
		field928 = new class93(8, 8, (String)null, 7, 3);
		field922 = new class93(9, 9, (String)null, 8, 3);
		field921 = new class93(10, 10, (String)null, 0, 7);
		field919 = new class93(11, 11, (String)null, 1, 7);
		field923 = new class93(12, 12, (String)null, 2, 7);
		field915 = new class93(13, 13, (String)null, 3, 7);
		field924 = new class93(14, 14, (String)null, 4, 7);
		field925 = new class93(15, 15, (String)null, 5, 7);
		field926 = new class93(16, 16, (String)null, 0, 5);
	}

	class93(int var1, int var2, String var3, int var4, int var5) {
		this.field927 = var1;
		this.field911 = var2;
		this.field929 = var4;
	}

	public int method1970() {
		return this.field911;
	}

	int method615() {
		return this.field929;
	}

	static final void method616(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class76[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var12 + var2 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field839[var12 + var2];
					var10000[var13 + var3] &= -16777217;
				}
			}
		}

		class42 var20 = new class42(var0);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
						int var16 = var2 + class122.method755(var14 & 7, var15 & 7, var7);
						int var17 = var3 + class335.method1850(var14 & 7, var15 & 7, var7);
						int var18 = (var14 & 7) + var2 + var8;
						int var19 = var3 + var9 + (var15 & 7);
						class24.method200(var20, var1, var16, var17, var18, var19, var7);
					} else {
						class24.method200(var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	static int method619(int var0, class167 var1, boolean var2) {
		class60 var4 = var2 ? class491.field4134 : class52.field599;
		if (var0 == 1500) {
			class139.field1344[++class203.field1903 - 1] = var4.field645;
			return 1;
		} else if (var0 == 1501) {
			class139.field1344[++class203.field1903 - 1] = var4.field658;
			return 1;
		} else if (var0 == 1502) {
			class139.field1344[++class203.field1903 - 1] = var4.field659;
			return 1;
		} else if (var0 == 1503) {
			class139.field1344[++class203.field1903 - 1] = var4.field636;
			return 1;
		} else if (var0 == 1504) {
			class139.field1344[++class203.field1903 - 1] = var4.field662 ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			class139.field1344[++class203.field1903 - 1] = var4.field661;
			return 1;
		} else {
			return 2;
		}
	}

	static final void method617(int var0, int var1, int var2, int var3) {
		++Client.field173;
		if (Client.field254 == class82.field863.field1555 >> 7 && Client.field177 == class82.field863.field1526 >> 7) {
			Client.field254 = 0;
		}

		class502.method2420();
		class534.method2572();
		class152.method876(true);
		class39.method257();
		class152.method876(false);

		int var7;
		for (class443 var5 = (class443)Client.field130.method563(); null != var5; var5 = (class443)Client.field130.method565()) {
			if (var5.field3874 == class358.field3038 && Client.field306 <= var5.field3883) {
				if (Client.field306 >= var5.field3898) {
					class102 var6;
					class287 var38;
					if (!var5.field3875 && var5.field3889 != 0) {
						if (var5.field3889 > 0) {
							var6 = Client.field63[var5.field3889 - 1];
							if (null != var6 && var6.field1555 >= 0 && var6.field1555 < 13312 && var6.field1526 >= 0 && var6.field1526 < 13312) {
								var5.field3884 = var6.field1555;
								var5.field3873 = var6.field1526;
								var5.method2219(var5.field3879, var5.field3880, var5.field3881, Client.field306);
							}
						} else {
							var7 = -var5.field3889 - 1;
							if (Client.field131 == var7) {
								var38 = class82.field863;
							} else {
								var38 = Client.field176[var7];
							}

							if (var38 != null && var38.field1555 >= 0 && var38.field1555 < 13312 && var38.field1526 >= 0 && var38.field1526 < 13312) {
								var5.field3884 = var38.field1555;
								var5.field3873 = var38.field1526;
								var5.method2219(var5.field3879, var5.field3880, var5.field3881, Client.field306);
							}
						}
					}

					if (var5.field3887 > 0) {
						var6 = Client.field63[var5.field3887 - 1];
						if (var6 != null && var6.field1555 >= 0 && var6.field1555 < 13312 && var6.field1526 >= 0 && var6.field1526 < 13312) {
							var5.method2219(var6.field1555, var6.field1526, class454.method2262(var6.field1555, var6.field1526, var5.field3874) - var5.field3878, Client.field306);
						}
					}

					if (var5.field3887 < 0) {
						var7 = -var5.field3887 - 1;
						if (var7 == Client.field131) {
							var38 = class82.field863;
						} else {
							var38 = Client.field176[var7];
						}

						if (null != var38 && var38.field1555 >= 0 && var38.field1555 < 13312 && var38.field1526 >= 0 && var38.field1526 < 13312) {
							var5.method2219(var38.field1555, var38.field1526, class454.method2262(var38.field1555, var38.field1526, var5.field3874) - var5.field3878, Client.field306);
						}
					}

					var5.method2220(Client.field82);
					class415.field3487.method1762(class358.field3038, (int)var5.field3897, (int)var5.field3890, (int)var5.field3891, 60, var5, var5.field3877, -1L, false);
				}
			} else {
				var5.method2269();
			}
		}

		class527.method2550();
		class35.method239(var0, var1, var2, var3, true);
		var0 = Client.field284;
		var1 = Client.field285;
		var2 = Client.field219;
		var3 = Client.field94;
		class266.method1555(var0, var1, var2 + var0, var1 + var3);
		class133.method791();
		class266.method1557();
		int var37 = Client.field42;
		if (Client.field145 / 256 > var37) {
			var37 = Client.field145 / 256;
		}

		if (Client.field271[4] && Client.field225[4] + 128 > var37) {
			var37 = Client.field225[4] + 128;
		}

		int var39 = Client.field181 & 2047;
		var7 = class314.field2821;
		int var8 = class98.field988;
		int var9 = class358.field3040;
		int var10 = class439.method2211(var37);
		int var12 = var3 - 334;
		if (var12 < 0) {
			var12 = 0;
		} else if (var12 > 100) {
			var12 = 100;
		}

		int var13 = Client.field278 + (Client.field279 - Client.field278) * var12 / 100;
		int var11 = var13 * var10 / 256;
		var12 = 2048 - var37 & 2047;
		var13 = 2048 - var39 & 2047;
		int var14 = 0;
		int var15 = 0;
		int var16 = var11;
		int var17;
		int var18;
		int var19;
		if (var12 != 0) {
			var17 = class133.field1291[var12];
			var18 = class133.field1289[var12];
			var19 = var18 * var15 - var17 * var11 >> 16;
			var16 = var18 * var11 + var17 * var15 >> 16;
			var15 = var19;
		}

		if (var13 != 0) {
			var17 = class133.field1291[var13];
			var18 = class133.field1289[var13];
			var19 = var17 * var16 + var14 * var18 >> 16;
			var16 = var18 * var16 - var14 * var17 >> 16;
			var14 = var19;
		}

		if (Client.field264) {
			class182.field1720 = var7 - var14;
			class451.field3944 = var8 - var15;
			class504.field4175 = var9 - var16;
			class293.field2725 = var37;
			class332.field2919 = var39;
		} else {
			class375.field3180 = var7 - var14;
			class463.field3989 = var8 - var15;
			class196.field1796 = var9 - var16;
			class452.field3956 = var37;
			class175.field1694 = var39;
		}

		if (Client.field96 == 1 && Client.field91 >= 2 && Client.field306 % 50 == 0 && (class82.field863.field1555 >> 7 != class314.field2821 >> 7 || class358.field3040 >> 7 != class82.field863.field1526 >> 7)) {
			var17 = class82.field863.field2543;
			var18 = (class314.field2821 >> 7) + class296.field2735;
			var19 = class164.field1606 + (class358.field3040 >> 7);
			class102.method673(var18, var19, var17, true);
		}

		int var21;
		if (!Client.field264) {
			if (class176.field1701.method2487()) {
				var12 = class358.field3038;
			} else {
				label554: {
					var13 = 3;
					if (class452.field3956 < 310) {
						label546: {
							if (Client.field96 == 1) {
								var14 = class314.field2821 >> 7;
								var15 = class358.field3040 >> 7;
							} else {
								var14 = class82.field863.field1555 >> 7;
								var15 = class82.field863.field1526 >> 7;
							}

							var16 = class375.field3180 >> 7;
							var17 = class196.field1796 >> 7;
							if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
								if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
									if ((class38.field513[class358.field3038][var16][var17] & 4) != 0) {
										var13 = class358.field3038;
									}

									if (var14 > var16) {
										var18 = var14 - var16;
									} else {
										var18 = var16 - var14;
									}

									if (var15 > var17) {
										var19 = var15 - var17;
									} else {
										var19 = var17 - var15;
									}

									int var20;
									if (var18 > var19) {
										var20 = var19 * 65536 / var18;
										var21 = 32768;

										while (true) {
											if (var16 == var14) {
												break label546;
											}

											if (var16 < var14) {
												++var16;
											} else if (var16 > var14) {
												--var16;
											}

											if ((class38.field513[class358.field3038][var16][var17] & 4) != 0) {
												var13 = class358.field3038;
											}

											var21 += var20;
											if (var21 >= 65536) {
												var21 -= 65536;
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}

												if ((class38.field513[class358.field3038][var16][var17] & 4) != 0) {
													var13 = class358.field3038;
												}
											}
										}
									} else {
										if (var19 > 0) {
											var20 = var18 * 65536 / var19;
											var21 = 32768;

											while (var15 != var17) {
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}

												if ((class38.field513[class358.field3038][var16][var17] & 4) != 0) {
													var13 = class358.field3038;
												}

												var21 += var20;
												if (var21 >= 65536) {
													var21 -= 65536;
													if (var16 < var14) {
														++var16;
													} else if (var16 > var14) {
														--var16;
													}

													if ((class38.field513[class358.field3038][var16][var17] & 4) != 0) {
														var13 = class358.field3038;
													}
												}
											}
										}
										break label546;
									}
								}

								var12 = class358.field3038;
								break label554;
							}

							var12 = class358.field3038;
							break label554;
						}
					}

					if (class82.field863.field1555 >= 0 && class82.field863.field1526 >= 0 && class82.field863.field1555 < 13312 && class82.field863.field1526 < 13312) {
						if ((class38.field513[class358.field3038][class82.field863.field1555 >> 7][class82.field863.field1526 >> 7] & 4) != 0) {
							var13 = class358.field3038;
						}

						var12 = var13;
					} else {
						var12 = class358.field3038;
					}
				}
			}

			var11 = var12;
		} else {
			var11 = class63.method483();
		}

		var12 = class375.field3180;
		var13 = class463.field3989;
		var14 = class196.field1796;
		var15 = class452.field3956;
		var16 = class175.field1694;

		for (var17 = 0; var17 < 5; ++var17) {
			if (Client.field271[var17]) {
				var18 = (int)(Math.random() * (double)(Client.field65[var17] * 2 + 1) - (double)Client.field65[var17] + Math.sin((double)Client.field135[var17] / 100.0D * (double)Client.field221[var17]) * (double)Client.field225[var17]);
				if (var17 == 0) {
					class375.field3180 += var18;
				}

				if (var17 == 1) {
					class463.field3989 += var18;
				}

				if (var17 == 2) {
					class196.field1796 += var18;
				}

				if (var17 == 3) {
					class175.field1694 = class175.field1694 + var18 & 2047;
				}

				if (var17 == 4) {
					class452.field3956 += var18;
					if (class452.field3956 < 128) {
						class452.field3956 = 128;
					}

					if (class452.field3956 > 383) {
						class452.field3956 = 383;
					}
				}
			}
		}

		var17 = class184.field1745;
		var18 = class184.field1728;
		if (class184.field1739 != 0) {
			var17 = class184.field1740;
			var18 = class184.field1741;
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
			class132.method778(var17 - var0, var18 - var1);
		} else {
			class481.method2397();
		}

		class77.method535();
		class266.method1548(var0, var1, var2, var3, 0);
		class77.method535();
		var19 = class133.method788();
		class133.method792(class466.field3999.field1667);
		class133.field1293.field390 = Client.field288;
		class415.field3487.method1782(class375.field3180, class463.field3989, class196.field1796, class452.field3956, class175.field1694, var11);
		class133.method792(false);
		if (Client.field67) {
			class266.method1558();
		}

		class133.field1293.field390 = var19;
		class77.method535();
		class415.field3487.method1801();
		Client.field108 = 0;
		boolean var40 = false;
		var21 = -1;
		int var22 = -1;
		int var23 = class481.field4085;
		int[] var24 = class481.field4086;

		int var25;
		for (var25 = 0; var25 < Client.field64 + var23; ++var25) {
			Object var26;
			if (var25 < var23) {
				var26 = Client.field176[var24[var25]];
				if (Client.field142 == var24[var25]) {
					var40 = true;
					var21 = var25;
					continue;
				}

				if (var26 == class82.field863) {
					var22 = var25;
					continue;
				}
			} else {
				var26 = Client.field63[Client.field2[var25 - var23]];
			}

			class337.method1866((class163)var26, var25, var0, var1, var2, var3, (byte)-53);
		}

		if (Client.field241 && var22 != -1) {
			class337.method1866(class82.field863, var22, var0, var1, var2, var3, (byte)1);
		}

		if (var40) {
			class337.method1866(Client.field176[Client.field142], var21, var0, var1, var2, var3, (byte)56);
		}

		for (var25 = 0; var25 < Client.field108; ++var25) {
			int var41 = Client.field110[var25];
			int var27 = Client.field111[var25];
			int var28 = Client.field287[var25];
			int var29 = Client.field62[var25];
			boolean var30 = true;

			while (var30) {
				var30 = false;

				for (int var31 = 0; var31 < var25; ++var31) {
					if (var27 + 2 > Client.field111[var31] - Client.field62[var31] && var27 - var29 < 2 + Client.field111[var31] && var41 - var28 < Client.field287[var31] + Client.field110[var31] && var41 + var28 > Client.field110[var31] - Client.field287[var31] && Client.field111[var31] - Client.field62[var31] < var27) {
						var27 = Client.field111[var31] - Client.field62[var31];
						var30 = true;
					}
				}
			}

			Client.field121 = Client.field110[var25];
			Client.field122 = Client.field111[var25] = var27;
			String var42 = Client.field118[var25];
			if (Client.field179 == 0) {
				int var32 = 16776960;
				if (Client.field114[var25] < 6) {
					var32 = Client.field235[Client.field114[var25]];
				}

				if (Client.field114[var25] == 6) {
					var32 = Client.field173 % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field114[var25] == 7) {
					var32 = Client.field173 % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field114[var25] == 8) {
					var32 = Client.field173 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var33;
				if (Client.field114[var25] == 9) {
					var33 = 150 - Client.field263[var25];
					if (var33 < 50) {
						var32 = 16711680 + var33 * 1280;
					} else if (var33 < 100) {
						var32 = 16776960 - 327680 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = 65280 + 5 * (var33 - 100);
					}
				}

				if (Client.field114[var25] == 10) {
					var33 = 150 - Client.field263[var25];
					if (var33 < 50) {
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) {
						var32 = 16711935 - 327680 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}

				if (Client.field114[var25] == 11) {
					var33 = 150 - Client.field263[var25];
					if (var33 < 50) {
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) {
						var32 = 65280 + (var33 - 50) * 327685;
					} else if (var33 < 150) {
						var32 = 16777215 - 327680 * (var33 - 100);
					}
				}

				int var34;
				if (Client.field114[var25] == 12 && Client.field12[var25] == null) {
					var33 = var42.length();
					Client.field12[var25] = new int[var33];

					for (var34 = 0; var34 < var33; ++var34) {
						int var35 = (int)(64.0F * ((float)var34 / (float)var33));
						int var36 = var35 << 10 | 896 | 64;
						Client.field12[var25][var34] = class255.field2358[var36];
					}
				}

				if (Client.field115[var25] == 0) {
					class488.field4114.method1303(var42, var0 + Client.field121, Client.field122 + var1, var32, 0, Client.field12[var25]);
				}

				if (Client.field115[var25] == 1) {
					class488.field4114.method1314(var42, Client.field121 + var0, Client.field122 + var1, var32, 0, Client.field173, Client.field12[var25]);
				}

				if (Client.field115[var25] == 2) {
					class488.field4114.method1302(var42, Client.field121 + var0, var1 + Client.field122, var32, 0, Client.field173, Client.field12[var25]);
				}

				if (Client.field115[var25] == 3) {
					class488.field4114.method1316(var42, var0 + Client.field121, Client.field122 + var1, var32, 0, Client.field173, 150 - Client.field263[var25], Client.field12[var25]);
				}

				if (Client.field115[var25] == 4) {
					var33 = (150 - Client.field263[var25]) * (class488.field4114.method1292(var42) + 100) / 150;
					class266.method1561(Client.field121 + var0 - 50, var1, Client.field121 + var0 + 50, var1 + var3);
					class488.field4114.method1317(var42, 50 + var0 + Client.field121 - var33, var1 + Client.field122, var32, 0, Client.field12[var25]);
					class266.method1555(var0, var1, var2 + var0, var1 + var3);
				}

				if (Client.field115[var25] == 5) {
					var33 = 150 - Client.field263[var25];
					var34 = 0;
					if (var33 < 25) {
						var34 = var33 - 25;
					} else if (var33 > 125) {
						var34 = var33 - 125;
					}

					class266.method1561(var0, Client.field122 + var1 - class488.field4114.field2066 - 1, var0 + var2, 5 + Client.field122 + var1);
					class488.field4114.method1303(var42, var0 + Client.field121, var1 + Client.field122 + var34, var32, 0, Client.field12[var25]);
					class266.method1555(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class488.field4114.method1299(var42, var0 + Client.field121, Client.field122 + var1, 16776960, 0);
			}
		}

		class281.method1600(var0, var1);
		((class348)class133.field1293.field389).method1910(Client.field82);
		class529.method2557(var0, var1, var2, var3);
		class375.field3180 = var12;
		class463.field3989 = var13;
		class196.field1796 = var14;
		class452.field3956 = var15;
		class175.field1694 = var16;
		if (Client.field16 && class336.field2933.method1655(true, false) == 0) {
			Client.field16 = false;
		}

		if (Client.field16) {
			class266.method1548(var0, var1, var2, var3, 0);
			class200.method1140(class433.field3551, false);
		}

	}
}
