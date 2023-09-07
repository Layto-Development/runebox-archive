public class class488 implements class228 {

	public static final class488 field3910;

	public static final class488 field3911;

	static class96 field3917;

	static String field3918;

	static final class488 field3912;

	static final class488 field3913;

	static final class488 field3914;

	boolean field3916;

	boolean field3919;

	int field3909;

	String field3915;

	static {
		field3911 = new class488(0, "POST", true, true);
		field3910 = new class488(1, "GET", true, false);
		field3914 = new class488(2, "PUT", false, true);
		field3912 = new class488(3, "PATCH", false, true);
		field3913 = new class488(4, "DELETE", false, true);
	}

	class488(int var1, String var2, boolean var3, boolean var4) {
		this.field3909 = var1;
		this.field3915 = var2;
		this.field3919 = var3;
		this.field3916 = var4;
	}

	boolean method2350() {
		return this.field3919;
	}

	public String method2348() {
		return this.field3915;
	}

	boolean method2349() {
		return this.field3916;
	}

	@Override
	public int method1362() {
		return this.field3909;
	}

	static final void method2351(class354[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class354 var10 = var0[var9];
			if (null != var10 && var1 == var10.field2705 && (var10.method1829() || Client.method528(var10) != 0 || var10 == Client.field1101)) {
				if (var10.field2768) {
					if (Client.method505(var10)) {
						continue;
					}
				} else if (var10.field2690 == 0 && class400.field3169 != var10 && Client.method505(var10)) {
					continue;
				}
				if (var10.field2690 == 11) {
					if (var10.method1850(class28.field142)) {
						if (var10.method1852()) {
							Client.method532(var10);
							Client.method471(var10.field2820, var10, true);
						}
						if (var10.field2753 != null) {
							class165 var11 = new class165();
							var11.field1664 = var10;
							var11.field1667 = var10.field2753;
							Client.field1113.method2222(var11);
						}
					}
				} else if (var10.field2690 == 12 && var10.method1844()) {
					Client.method532(var10);
				}
				int var27 = var10.field2689 + var6;
				int var12 = var7 + var10.field2702;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var10.field2690 == 9) {
					var17 = var27;
					var18 = var12;
					var19 = var27 + var10.field2703;
					int var20 = var10.field2680 + var12;
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
					var17 = var27 + var10.field2703;
					var18 = var10.field2680 + var12;
					var13 = var27 > var2 ? var27 : var2;
					var14 = var12 > var3 ? var12 : var3;
					var15 = var17 < var4 ? var17 : var4;
					var16 = var18 < var5 ? var18 : var5;
				}
				if (Client.field1082 == var10) {
					Client.field1134 = true;
					Client.field936 = var27;
					Client.field1008 = var12;
				}
				boolean var28 = false;
				if (var10.field2760) {
					switch(Client.field912) {
						case 0:
							var28 = true;
						case 1:
						default:
							break;
						case 2:
							if (var10.field2688 >>> 16 == Client.field1073) {
								var28 = true;
							}
							break;
						case 3:
							if (Client.field1073 == var10.field2688) {
								var28 = true;
							}
					}
				}
				if (var28 || !var10.field2768 || var13 < var15 && var14 < var16) {
					if (var10.field2768) {
						class165 var29;
						if (var10.field2830) {
							if (class422.field3270 >= var13 && class422.field3253 >= var14 && class422.field3270 < var15 && class422.field3253 < var16) {
								for (var29 = (class165) Client.field1113.method2218(); var29 != null; var29 = (class165) Client.field1113.method2220()) {
									if (var29.field1675) {
										var29.method318();
										var29.field1664.field2708 = false;
									}
								}
								Client.method603();
								if (class52.field237 == 0) {
									Client.field1082 = null;
									Client.field1101 = null;
								}
								if (!Client.field1011) {
									Client.method572();
								}
							}
						} else if (var10.field2831 && class422.field3270 >= var13 && class422.field3253 >= var14 && class422.field3270 < var15 && class422.field3253 < var16) {
							for (var29 = (class165) Client.field1113.method2218(); null != var29; var29 = (class165) Client.field1113.method2220()) {
								if (var29.field1675 && var29.field1664.field2713 == var29.field1667) {
									var29.method318();
								}
							}
						}
					}
					var18 = class422.field3270;
					var19 = class422.field3253;
					if (class422.field3264 != 0) {
						var18 = class422.field3265;
						var19 = class422.field3266;
					}
					boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
					if (var10.field2714 == 1337) {
						if (!Client.field911 && !Client.field1011 && var30) {
							Client.method502(var18, var19, var13, var14);
						}
					} else if (var10.field2714 == 1338) {
						Client.method576(var10, var27, var12);
					} else {
						if (var10.field2714 == 1400) {
							class26.field125.method1660(class422.field3270, class422.field3253, var30, var27, var12, var10.field2703, var10.field2680);
						}
						if (!Client.field1011 && var30) {
							if (var10.field2714 == 1400) {
								class26.field125.method1653(var27, var12, var10.field2703, var10.field2680, var18, var19);
							} else {
								Client.method509(var10);
							}
						}
						boolean var22;
						int var24;
						if (var28) {
							for (int var21 = 0; var21 < var10.field2737.length; ++var21) {
								var22 = false;
								boolean var23 = false;
								if (null != var10.field2737[var21]) {
									for (var24 = 0; var24 < var10.field2737[var21].length; ++var24) {
										boolean var25 = false;
										if (null != var10.field2829) {
											var25 = Client.field1046.method2323(var10.field2737[var21][var24]);
										}
										if (Client.method585(var10.field2737[var21][var24]) || var25) {
											var22 = true;
											if (var10.field2829 != null && var10.field2829[var21] > Client.field1201) {
												break;
											}
											byte var26 = var10.field2833[var21][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !Client.field1046.method2323(86) && !Client.field1046.method2323(82) && !Client.field1046.method2323(81)) && ((var26 & 2) == 0 || Client.field1046.method2323(86)) && ((var26 & 1) == 0 || Client.field1046.method2323(82)) && ((var26 & 4) == 0 || Client.field1046.method2323(81))) {
												var23 = true;
												break;
											}
										}
									}
								}
								if (var23) {
									if (var21 < 10) {
										Client.method461(var21 + 1, var10.field2688, var10.field2807, var10.field2816, "");
									} else if (var21 == 10) {
										class207.method1256();
										Client.method566(var10.field2688, var10.field2807, class313.method1677(Client.method528(var10)), var10.field2816);
										Client.field1081 = Client.method558(var10);
										if (null == Client.field1081) {
											Client.field1081 = class55.field629;
										}
										Client.field1092 = var10.field2692 + class74.method314(16777215);
									}
									var24 = var10.field2763[var21];
									if (var10.field2829 == null) {
										var10.field2829 = new int[var10.field2737.length];
									}
									if (var10.field2764 == null) {
										var10.field2764 = new int[var10.field2737.length];
									}
									if (var24 != 0) {
										if (var10.field2829[var21] == 0) {
											var10.field2829[var21] = var10.field2764[var21] + var24 + Client.field1201;
										} else {
											var10.field2829[var21] = Client.field1201 + var24;
										}
									} else {
										var10.field2829[var21] = Integer.MAX_VALUE;
									}
								}
								if (!var22 && null != var10.field2829) {
									var10.field2829[var21] = 0;
								}
							}
						}
						if (var10.field2768) {
							if (class422.field3270 >= var13 && class422.field3253 >= var14 && class422.field3270 < var15 && class422.field3253 < var16) {
								var30 = true;
							} else {
								var30 = false;
							}
							boolean var31 = false;
							if ((class422.field3260 == 1 || !class349.field2637 && class422.field3260 == 4) && var30) {
								var31 = true;
							}
							var22 = false;
							if ((class422.field3264 == 1 || !class349.field2637 && class422.field3264 == 4) && class422.field3265 >= var13 && class422.field3266 >= var14 && class422.field3265 < var15 && class422.field3266 < var16) {
								var22 = true;
							}
							if (var22) {
								Client.method535(var10, class422.field3265 - var27, class422.field3266 - var12);
							}
							if (var10.method1830()) {
								if (var22) {
									Client.field1152.method2222(new class24(0, class422.field3270 - var27, class422.field3253 - var12, var10));
								}
								if (var31) {
									Client.field1152.method2222(new class24(1, class422.field3270 - var27, class422.field3253 - var12, var10));
								}
							}
							if (var10.field2714 == 1400) {
								class26.field125.method1614(var18, var19, var30 & var31, var30 & var22);
							}
							if (null != Client.field1082 && Client.field1082 != var10 && var30 && class313.method1678(Client.method528(var10))) {
								Client.field1086 = var10;
							}
							if (Client.field1101 == var10) {
								Client.field1087 = true;
								Client.field1088 = var27;
								Client.field1089 = var12;
							}
							if (var10.field2771) {
								class165 var32;
								if (var30 && Client.field1111 != 0 && var10.field2713 != null) {
									var32 = new class165();
									var32.field1675 = true;
									var32.field1664 = var10;
									var32.field1668 = Client.field1111;
									var32.field1667 = var10.field2713;
									Client.field1113.method2222(var32);
								}
								if (Client.field1082 != null || Client.field1011) {
									var22 = false;
									var31 = false;
									var30 = false;
								}
								if (!var10.field2822 && var22) {
									var10.field2822 = true;
									if (var10.field2740 != null) {
										var32 = new class165();
										var32.field1675 = true;
										var32.field1664 = var10;
										var32.field1665 = class422.field3265 - var27;
										var32.field1668 = class422.field3266 - var12;
										var32.field1667 = var10.field2740;
										Client.field1113.method2222(var32);
									}
								}
								if (var10.field2822 && var31 && var10.field2686 != null) {
									var32 = new class165();
									var32.field1675 = true;
									var32.field1664 = var10;
									var32.field1665 = class422.field3270 - var27;
									var32.field1668 = class422.field3253 - var12;
									var32.field1667 = var10.field2686;
									Client.field1113.method2222(var32);
								}
								if (var10.field2822 && !var31) {
									var10.field2822 = false;
									if (var10.field2773 != null) {
										var32 = new class165();
										var32.field1675 = true;
										var32.field1664 = var10;
										var32.field1665 = class422.field3270 - var27;
										var32.field1668 = class422.field3253 - var12;
										var32.field1667 = var10.field2773;
										Client.field1115.method2222(var32);
									}
								}
								if (var31 && null != var10.field2776) {
									var32 = new class165();
									var32.field1675 = true;
									var32.field1664 = var10;
									var32.field1665 = class422.field3270 - var27;
									var32.field1668 = class422.field3253 - var12;
									var32.field1667 = var10.field2776;
									Client.field1113.method2222(var32);
								}
								if (!var10.field2708 && var30) {
									var10.field2708 = true;
									if (null != var10.field2777) {
										var32 = new class165();
										var32.field1675 = true;
										var32.field1664 = var10;
										var32.field1665 = class422.field3270 - var27;
										var32.field1668 = class422.field3253 - var12;
										var32.field1667 = var10.field2777;
										Client.field1113.method2222(var32);
									}
								}
								if (var10.field2708 && var30 && null != var10.field2778) {
									var32 = new class165();
									var32.field1675 = true;
									var32.field1664 = var10;
									var32.field1665 = class422.field3270 - var27;
									var32.field1668 = class422.field3253 - var12;
									var32.field1667 = var10.field2778;
									Client.field1113.method2222(var32);
								}
								if (var10.field2708 && !var30) {
									var10.field2708 = false;
									if (null != var10.field2749) {
										var32 = new class165();
										var32.field1675 = true;
										var32.field1664 = var10;
										var32.field1665 = class422.field3270 - var27;
										var32.field1668 = class422.field3253 - var12;
										var32.field1667 = var10.field2749;
										Client.field1115.method2222(var32);
									}
								}
								if (var10.field2681 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2681;
									Client.field1099.method2222(var32);
								}
								int var35;
								class165 var37;
								int var38;
								if (var10.field2755 != null && Client.field1096 > var10.field2824) {
									if (var10.field2785 != null && Client.field1096 - var10.field2824 <= 32) {
										label642: for (var38 = var10.field2824; var38 < Client.field1096; ++var38) {
											var24 = Client.field1095[var38 & 31];
											for (var35 = 0; var35 < var10.field2785.length; ++var35) {
												if (var10.field2785[var35] == var24) {
													var37 = new class165();
													var37.field1664 = var10;
													var37.field1667 = var10.field2755;
													Client.field1113.method2222(var37);
													break label642;
												}
											}
										}
									} else {
										var32 = new class165();
										var32.field1664 = var10;
										var32.field1667 = var10.field2755;
										Client.field1113.method2222(var32);
									}
									var10.field2824 = Client.field1096;
								}
								if (null != var10.field2786 && Client.field1098 > var10.field2825) {
									if (null != var10.field2717 && Client.field1098 - var10.field2825 <= 32) {
										label618: for (var38 = var10.field2825; var38 < Client.field1098; ++var38) {
											var24 = Client.field1097[var38 & 31];
											for (var35 = 0; var35 < var10.field2717.length; ++var35) {
												if (var24 == var10.field2717[var35]) {
													var37 = new class165();
													var37.field1664 = var10;
													var37.field1667 = var10.field2786;
													Client.field1113.method2222(var37);
													break label618;
												}
											}
										}
									} else {
										var32 = new class165();
										var32.field1664 = var10;
										var32.field1667 = var10.field2786;
										Client.field1113.method2222(var32);
									}
									var10.field2825 = Client.field1098;
								}
								if (null != var10.field2788 && Client.field1100 > var10.field2826) {
									if (null != var10.field2789 && Client.field1100 - var10.field2826 <= 32) {
										label594: for (var38 = var10.field2826; var38 < Client.field1100; ++var38) {
											var24 = Client.field1022[var38 & 31];
											for (var35 = 0; var35 < var10.field2789.length; ++var35) {
												if (var24 == var10.field2789[var35]) {
													var37 = new class165();
													var37.field1664 = var10;
													var37.field1667 = var10.field2788;
													Client.field1113.method2222(var37);
													break label594;
												}
											}
										}
									} else {
										var32 = new class165();
										var32.field1664 = var10;
										var32.field1667 = var10.field2788;
										Client.field1113.method2222(var32);
									}
									var10.field2826 = Client.field1100;
								}
								if (Client.field1103 > var10.field2757 && null != var10.field2679) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2679;
									Client.field1113.method2222(var32);
								}
								if (Client.field1104 > var10.field2757 && var10.field2745 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2745;
									Client.field1113.method2222(var32);
								}
								if (Client.field1105 > var10.field2757 && var10.field2799 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2799;
									Client.field1113.method2222(var32);
								}
								if (Client.field1106 > var10.field2757 && var10.field2800 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2800;
									Client.field1113.method2222(var32);
								}
								if (Client.field1107 > var10.field2757 && var10.field2801 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2801;
									Client.field1113.method2222(var32);
								}
								if (Client.field1108 > var10.field2757 && var10.field2806 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2806;
									Client.field1113.method2222(var32);
								}
								if (Client.field969 > var10.field2757 && var10.field2821 != null) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2821;
									Client.field1113.method2222(var32);
								}
								if (Client.field950 > var10.field2757 && null != var10.field2802) {
									var32 = new class165();
									var32.field1664 = var10;
									var32.field1667 = var10.field2802;
									Client.field1113.method2222(var32);
								}
								var10.field2757 = Client.field900;
								if (var10.field2795 != null) {
									for (var38 = 0; var38 < Client.field1138; ++var38) {
										class165 var36 = new class165();
										var36.field1664 = var10;
										var36.field1666 = Client.field1140[var38];
										var36.field1672 = Client.field1139[var38];
										var36.field1667 = var10.field2795;
										Client.field1113.method2222(var36);
									}
								}
								class165 var39;
								int[] var40;
								if (null != var10.field2805) {
									var40 = Client.field1046.method2321();
									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class165();
										var39.field1664 = var10;
										var39.field1666 = var40[var24];
										var39.field1667 = var10.field2805;
										Client.field1113.method2222(var39);
									}
								}
								if (var10.field2762 != null) {
									var40 = Client.field1046.method2322();
									for (var24 = 0; var24 < var40.length; ++var24) {
										var39 = new class165();
										var39.field1664 = var10;
										var39.field1666 = var40[var24];
										var39.field1667 = var10.field2762;
										Client.field1113.method2222(var39);
									}
								}
							}
						}
						if (!var10.field2768) {
							if (null != Client.field1082 || Client.field1011) {
								continue;
							}
							if ((var10.field2812 >= 0 || var10.field2715 != 0) && class422.field3270 >= var13 && class422.field3253 >= var14 && class422.field3270 < var15 && class422.field3253 < var16) {
								if (var10.field2812 >= 0) {
									class400.field3169 = var0[var10.field2812];
								} else {
									class400.field3169 = var10;
								}
							}
							if (var10.field2690 == 8 && class422.field3270 >= var13 && class422.field3253 >= var14 && class422.field3270 < var15 && class422.field3253 < var16) {
								class454.field3476 = var10;
							}
							if (var10.field2710 > var10.field2680) {
								Client.method586(var10, var10.field2703 + var27, var12, var10.field2680, var10.field2710, class422.field3270, class422.field3253);
							}
						}
						if (var10.field2690 == 0) {
							method2351(var0, var10.field2688, var13, var14, var15, var16, var27 - var10.field2707, var12 - var10.field2721);
							if (var10.field2820 != null) {
								method2351(var10.field2820, var10.field2688, var13, var14, var15, var16, var27 - var10.field2707, var12 - var10.field2721);
							}
							class208 var33 = (class208) Client.field919.method2582((long) var10.field2688);
							if (null != var33) {
								if (var33.field1913 == 0 && class422.field3270 >= var13 && class422.field3253 >= var14 && class422.field3270 < var15 && class422.field3253 < var16 && !Client.field1011) {
									for (class165 var34 = (class165) Client.field1113.method2218(); var34 != null; var34 = (class165) Client.field1113.method2220()) {
										if (var34.field1675) {
											var34.method318();
											var34.field1664.field2708 = false;
										}
									}
									if (class52.field237 == 0) {
										Client.field1082 = null;
										Client.field1101 = null;
									}
									if (!Client.field1011) {
										Client.method572();
									}
								}
								Client.method472(var33.field1915, var13, var14, var15, var16, var27, var12);
							}
						}
					}
				}
			}
		}
	}
}
