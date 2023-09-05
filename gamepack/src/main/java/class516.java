import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.net.URL;

@ObfInfo(name = "ch")
public class class516 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = 2009368915)
	static int field4129;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -962516855)
	static int field4133;
	@ObfInfo(name = "ap", desc = "[I")
	static int[] field4130;
	@ObfInfo(name = "aa", desc = "[I")
	static int[] field4131;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -734076159)
	int field4128;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -5014477)
	int field4132;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -272827429)
	int field4134;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1366935941)
	int field4137;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1816726787)
	int field4138;
	@ObfInfo(name = "an", desc = "Ljava/lang/String;")
	String field4135;
	@ObfInfo(name = "ar", desc = "Ljava/lang/String;")
	String field4136;
	@ObfInfo(name = "am", desc = "Ljava/lang/String;")
	String field4139;

	static {
		field4133 = 0;
		field4129 = 0;
		field4130 = new int[]{1, 1, 1, 1};
		field4131 = new int[]{0, 1, 2, 3};
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class516() {
	}

	@ObfInfo(name = "af", desc = "(B)Z", opaqueValue = "0")
	boolean method2518() {
		return (class82.field861.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "ad", desc = "(I)Z")
	boolean method2519() {
		return (class82.field851.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "aq", desc = "(I)Z", opaqueValue = "-1471748283")
	boolean method2520() {
		return (class82.field836.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "al", desc = "(B)Z", opaqueValue = "13")
	boolean method2528() {
		return (class82.field845.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "an", desc = "(I)Z")
	boolean method2526() {
		return (class82.field849.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "ar", desc = "(I)Z", opaqueValue = "-365493301")
	boolean method2522() {
		return (class82.field864.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "ab", desc = "(I)Z", opaqueValue = "879753429")
	boolean method2525() {
		return (class82.field860.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "ag", desc = "(B)Z", opaqueValue = "7")
	boolean method2523() {
		return (class82.field865.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "am", desc = "(B)Z", opaqueValue = "2")
	boolean method2527() {
		return (class82.field843.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "ax", desc = "(B)Z", opaqueValue = "8")
	boolean method2524() {
		return (class82.field862.method2222() & this.field4128) != 0;
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	static boolean method2532() {
		try {
			if (class383.field2948 == null) {
				class383.field2948 = class248.field2079.method1384(new URL(class290.field2297));
			} else if (class383.field2948.method334()) {
				byte[] var1 = class383.field2948.method336();
				class280 var2 = new class280(var1);
				var2.method1496();
				field4133 = var2.method1541();
				class69.field774 = new class516[field4133];

				class516 var4;
				for (int var3 = 0; var3 < field4133; var4.field4138 = var3++) {
					var4 = class69.field774[var3] = new class516();
					var4.field4132 = var2.method1541();
					var4.field4128 = var2.method1496();
					var4.field4135 = var2.method1500();
					var4.field4136 = var2.method1500();
					var4.field4137 = var2.method1492();
					var4.field4134 = var2.method1494();
				}

				method2530(class69.field774, 0, class69.field774.length - 1, field4131, field4130);
				class383.field2948 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			class383.field2948 = null;
		}

		return false;
	}

	@ObfInfo(name = "ae", desc = "(III)V")
	static void method2535(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; ++var6) {
			if (var0 != field4131[var6]) {
				var3[var5] = field4131[var6];
				var4[var5] = field4130[var6];
				++var5;
			}
		}

		field4131 = var3;
		field4130 = var4;
		method2530(class69.field774, 0, class69.field774.length - 1, field4131, field4130);
	}

	@ObfInfo(name = "ao", desc = "([Lch;II[I[II)V")
	static void method2530(class516[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var1 + var2) / 2;
			class516 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var7].field4138;
							var13 = var9.field4138;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field4134;
							var13 = var9.field4134;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var7].method2518() ? 1 : 0;
							var13 = var9.method2518() ? 1 : 0;
						} else {
							var12 = var0[var7].field4132;
							var13 = var9.field4132;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var6].field4138;
							var13 = var9.field4138;
						} else if (var3[var11] == 1) {
							var12 = var0[var6].field4134;
							var13 = var9.field4134;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method2518() ? 1 : 0;
							var13 = var9.method2518() ? 1 : 0;
						} else {
							var12 = var0[var6].field4132;
							var13 = var9.field4132;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					class516 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method2530(var0, var1, var7, var3, var4);
			method2530(var0, var7 + 1, var2, var3, var4);
		}

	}

	@ObfInfo(name = "at", desc = "(IZIZI)V")
	static void method2534(int var0, boolean var1, int var2, boolean var3) {
		if (null != class69.field774) {
			method2537(0, class69.field774.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfInfo(name = "ac", desc = "(IIIZIZI)V")
	static void method2537(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var8 = var0;
			class516 var9 = class69.field774[var7];
			class69.field774[var7] = class69.field774[var1];
			class69.field774[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (method2531(class69.field774[var10], var9, var2, var3, var4, var5) <= 0) {
					class516 var11 = class69.field774[var10];
					class69.field774[var10] = class69.field774[var8];
					class69.field774[var8++] = var11;
				}
			}

			class69.field774[var1] = class69.field774[var8];
			class69.field774[var8] = var9;
			method2537(var0, var8 - 1, var2, var3, var4, var5);
			method2537(var8 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfInfo(name = "ai", desc = "(Lch;Lch;IZIZI)I")
	static int method2531(class516 var0, class516 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = method2533(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = method2533(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	@ObfInfo(name = "az", desc = "(Lch;Lch;IZI)I")
	static int method2533(class516 var0, class516 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field4134;
			int var6 = var1.field4134;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field4137 - var1.field4137;
		} else if (var2 == 3) {
			if (var0.field4136.equals("-")) {
				if (var1.field4136.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field4136.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field4136.compareTo(var1.field4136);
			}
		} else if (var2 == 4) {
			return var0.method2526() ? (var1.method2526() ? 0 : 1) : (var1.method2526() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method2520() ? (var1.method2520() ? 0 : 1) : (var1.method2520() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method2528() ? (var1.method2528() ? 0 : 1) : (var1.method2528() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method2518() ? (var1.method2518() ? 0 : 1) : (var1.method2518() ? -1 : 0);
		} else {
			return var0.field4132 - var1.field4132;
		}
	}

	@ObfInfo(name = "ap", desc = "(S)Lch;")
	static class516 method2529() {
		field4129 = 0;
		return method2536();
	}

	@ObfInfo(name = "aa", desc = "(I)Lch;")
	static class516 method2536() {
		return field4129 < field4133 ? class69.field774[++field4129 - 1] : null;
	}

	@ObfInfo(name = "kq", desc = "(Lls;I)V", opaqueValue = "-1757049877")
	static final void method2521(class63 var0) {
		class259 var2 = Client.field92.field2666;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class63.field747 == var0) {
			var3 = var2.method1531();
			var4 = var2.method1532();
			var5 = var2.method1492();
			var6 = (var5 >> 4 & 7) + class470.field3787;
			var7 = class157.field1495 + (var5 & 7);
			var8 = var2.method1520();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				class113 var41 = Client.field167[class401.field3120][var6][var7];
				if (var41 != null) {
					for (class432 var37 = (class432)var41.method627(); var37 != null; var37 = (class432)var41.method629()) {
						if ((var8 & 32767) == var37.field3272 && var37.field3273 == var4) {
							var37.field3273 = var3;
							break;
						}
					}

					Client.method181(var6, var7);
				}
			}

		} else {
			int var9;
			int var10;
			byte var11;
			int var13;
			int var14;
			if (class63.field750 == var0) {
				var3 = var2.method1513();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = Client.field212[var4];
				var7 = var2.method1552();
				var8 = class470.field3787 + (var7 >> 4 & 7);
				var9 = (var7 & 7) + class157.field1495;
				var10 = var2.method1521();
				var11 = var2.method1507();
				byte var12 = var2.method1515();
				var13 = var2.method1519();
				var14 = var2.method1519();
				byte var15 = var2.method1516();
				byte var16 = var2.method1493();
				int var17 = var2.method1521();
				class439 var18;
				if (Client.field155 == var10) {
					var18 = class126.field1164;
				} else {
					var18 = Client.field200[var10];
				}

				if (var18 != null) {
					class292 var19 = class185.method1043(var14, (byte)-34);
					int var20;
					int var21;
					if (var5 != 1 && var5 != 3) {
						var20 = var19.field2339;
						var21 = var19.field2324;
					} else {
						var20 = var19.field2324;
						var21 = var19.field2339;
					}

					int var22 = var8 + (var20 >> 1);
					int var23 = var8 + (var20 + 1 >> 1);
					int var24 = var9 + (var21 >> 1);
					int var25 = (var21 + 1 >> 1) + var9;
					int[][] var26 = class411.field3172[class401.field3120];
					int var27 = var26[var23][var25] + var26[var22][var25] + var26[var23][var24] + var26[var22][var24] >> 2;
					int var28 = (var8 << 7) + (var20 << 6);
					int var29 = (var21 << 6) + (var9 << 7);
					class384 var30 = var19.method1613(var4, var5, var26, var28, var27, var29);
					if (var30 != null) {
						Client.method160(class401.field3120, var8, var9, var6, -1, 0, 0, 31, var13 + 1, var17 + 1);
						var18.field3307 = Client.field330 + var13;
						var18.field3317 = var17 + Client.field330;
						var18.field3311 = var30;
						var18.field3308 = var8 * 128 + var20 * 64;
						var18.field3310 = var9 * 128 + var21 * 64;
						var18.field3309 = var27;
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

						var18.field3323 = var8 + var15;
						var18.field3314 = var11 + var8;
						var18.field3313 = var12 + var9;
						var18.field3303 = var16 + var9;
					}
				}
			}

			if (var0 == class63.field743) {
				var3 = var2.method1552();
				var4 = (var3 >> 4 & 7) + class470.field3787;
				var5 = class157.field1495 + (var3 & 7);
				var6 = var2.method1541();
				var7 = var2.method1552();
				var8 = var2.method1520();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var4 = 64 + var4 * 128;
					var5 = 64 + var5 * 128;
					class18 var39 = new class18(var8, class401.field3120, var4, var5, Client.method131(var4, var5, class401.field3120) - var7, var6, Client.field330);
					Client.field297.method631(var39);
				}

			} else {
				int var38;
				if (class63.field751 == var0) {
					var3 = var2.method1513();
					var4 = var2.method1552();
					var5 = var4 >> 2;
					var6 = var4 & 3;
					var7 = Client.field212[var5];
					var8 = var2.method1521();
					var9 = var2.method1514();
					var10 = class470.field3787 + (var9 >> 4 & 7);
					var38 = class157.field1495 + (var9 & 7);
					if (var10 >= 0 && var38 >= 0 && var10 < 104 && var38 < 104) {
						Client.method160(class401.field3120, var10, var38, var7, var8, var5, var6, var3, 0, -1);
					}

				} else {
					int var40;
					if (class63.field744 == var0) {
						var3 = var2.method1552();
						var4 = var3 >> 2;
						var5 = var3 & 3;
						var6 = Client.field212[var4];
						var7 = var2.method1519();
						var8 = var2.method1552();
						var9 = (var8 >> 4 & 7) + class470.field3787;
						var10 = (var8 & 7) + class157.field1495;
						if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
							if (var6 == 0) {
								class266 var42 = class27.field448.method1071(class401.field3120, var9, var10);
								if (var42 != null) {
									var40 = class487.method2465(var42.field2154);
									if (var4 == 2) {
										var42.field2155 = new class380(var40, 2, var5 + 4, class401.field3120, var9, var10, var7, false, var42.field2155);
										var42.field2153 = new class380(var40, 2, var5 + 1 & 3, class401.field3120, var9, var10, var7, false, var42.field2153);
									} else {
										var42.field2155 = new class380(var40, var4, var5, class401.field3120, var9, var10, var7, false, var42.field2155);
									}

									return;
								}
							}

							if (var6 == 1) {
								class104 var43 = class27.field448.method1072(class401.field3120, var9, var10);
								if (null != var43) {
									var40 = class487.method2465(var43.field1010);
									if (var4 != 4 && var4 != 5) {
										if (var4 == 6) {
											var43.field1007 = new class380(var40, 4, var5 + 4, class401.field3120, var9, var10, var7, false, var43.field1007);
										} else if (var4 == 7) {
											var43.field1007 = new class380(var40, 4, (var5 + 2 & 3) + 4, class401.field3120, var9, var10, var7, false, var43.field1007);
										} else if (var4 == 8) {
											var43.field1007 = new class380(var40, 4, var5 + 4, class401.field3120, var9, var10, var7, false, var43.field1007);
											var43.field1008 = new class380(var40, 4, 4 + (var5 + 2 & 3), class401.field3120, var9, var10, var7, false, var43.field1008);
										}
									} else {
										var43.field1007 = new class380(var40, 4, var5, class401.field3120, var9, var10, var7, false, var43.field1007);
									}

									return;
								}
							}

							if (var6 == 2) {
								class241 var44 = class27.field448.method1109(class401.field3120, var9, var10);
								if (var4 == 11) {
									var4 = 10;
								}

								if (null != var44) {
									var44.field2000 = new class380(class487.method2465(var44.field2005), var4, var5, class401.field3120, var9, var10, var7, false, var44.field2000);
									return;
								}
							}

							if (var6 == 3) {
								class355 var45 = class27.field448.method1096(class401.field3120, var9, var10);
								if (var45 != null) {
									var45.field2804 = new class380(class487.method2465(var45.field2803), 22, var5, class401.field3120, var9, var10, var7, false, var45.field2804);
									return;
								}
							}

							Client.method277(class401.field3120, var9, var10, var6, var7);
						}

					} else {
						class432 var36;
						if (class63.field748 == var0) {
							var2.method1513();
							var3 = var2.method1513();
							var4 = (var3 >> 4 & 7) + class470.field3787;
							var5 = (var3 & 7) + class157.field1495;
							var6 = var2.method1492();
							var7 = var2.method1496();
							var2.method1521();
							var2.method1519();
							var2.method1513();
							var8 = var2.method1541();
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								var36 = new class432();
								var36.field3272 = var8;
								var36.field3273 = var7;
								var36.method2251(var6);
								if (Client.field167[class401.field3120][var4][var5] == null) {
									Client.field167[class401.field3120][var4][var5] = new class113();
								}

								Client.field167[class401.field3120][var4][var5].method631(var36);
								Client.method181(var4, var5);
							}

						} else if (class63.field753 == var0) {
							var3 = var2.method1492();
							var4 = (var3 >> 4 & 7) + class470.field3787;
							var5 = (var3 & 7) + class157.field1495;
							var6 = var2.method1552();
							var7 = var6 >> 2;
							var8 = var6 & 3;
							var9 = Client.field212[var7];
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								Client.method160(class401.field3120, var4, var5, var9, -1, var7, var8, 31, 0, -1);
							}

						} else {
							class113 var34;
							if (class63.field752 == var0) {
								var3 = var2.method1521();
								var4 = var2.method1531();
								var5 = var2.method1492();
								var6 = class470.field3787 + (var5 >> 4 & 7);
								var7 = class157.field1495 + (var5 & 7);
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
									var34 = Client.field167[class401.field3120][var6][var7];
									if (var34 != null) {
										for (var36 = (class432)var34.method627(); null != var36; var36 = (class432)var34.method629()) {
											if ((var3 & 32767) == var36.field3272 && var36.field3273 == var4) {
												var36.method907();
												break;
											}
										}

										if (var34.method627() == null) {
											Client.field167[class401.field3120][var6][var7] = null;
										}

										Client.method181(var6, var7);
									}
								}

							} else {
								if (var0 == class63.field749) {
									var3 = var2.method1513();
									var4 = class470.field3787 + (var3 >> 4 & 7);
									var5 = (var3 & 7) + class157.field1495;
									var6 = var2.method1514();
									var7 = var6 >> 4 & 15;
									var8 = var6 & 7;
									var9 = var2.method1492();
									var10 = var2.method1521();
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
										var38 = var7 + 1;
										if (class126.field1164.field1106[0] >= var4 - var38 && class126.field1164.field1106[0] <= var38 + var4 && class126.field1164.field1103[0] >= var5 - var38 && class126.field1164.field1103[0] <= var38 + var5 && class281.field2262.method1772() != 0 && var8 > 0 && Client.field282 < 50) {
											Client.field283[Client.field282] = var10;
											Client.field284[Client.field282] = var8;
											Client.field239[Client.field282] = var9;
											Client.field71[Client.field282] = null;
											Client.field34[Client.field282] = var7 + (var4 << 16) + (var5 << 8);
											++Client.field282;
										}
									}
								}

								int var46;
								if (class63.field746 == var0) {
									var3 = var2.method1520();
									var4 = var2.method1541();
									byte var32 = var2.method1516();
									var6 = var2.method1552();
									var7 = var2.method1526();
									byte var35 = var2.method1493();
									var9 = var2.method1513() * 4;
									var10 = var2.method1552();
									var38 = var2.method1514() * 4;
									var40 = var2.method1527();
									var13 = var2.method1492();
									var14 = (var13 >> 4 & 7) + class470.field3787;
									var46 = (var13 & 7) + class157.field1495;
									int var48 = var2.method1521();
									var5 = var32 + var14;
									var8 = var35 + var46;
									if (var14 >= 0 && var46 >= 0 && var14 < 104 && var46 < 104 && var5 >= 0 && var8 >= 0 && var5 < 104 && var8 < 104 && var48 != 65535) {
										var14 = var14 * 128 + 64;
										var46 = var46 * 128 + 64;
										var5 = var5 * 128 + 64;
										var8 = 64 + var8 * 128;
										class351 var49 = new class351(var48, class401.field3120, var14, var46, Client.method131(var14, var46, class401.field3120) - var9, Client.field330 + var3, var4 + Client.field330, var6, var10, var40, var7, var38);
										var49.method1929(var5, var8, Client.method131(var5, var8, class401.field3120) - var38, var3 + Client.field330);
										Client.field154.method631(var49);
									}

								} else if (class63.field742 == var0) {
									var3 = var2.method1519();
									var4 = var2.method1513();
									var5 = (var4 >> 4 & 7) + class470.field3787;
									var6 = (var4 & 7) + class157.field1495;
									byte var33 = var2.method1516();
									var8 = var2.method1527();
									var9 = var2.method1513();
									var10 = var2.method1521();
									var11 = var2.method1507();
									var40 = var2.method1552() * 4;
									var13 = var2.method1513();
									var14 = var2.method1513() * 4;
									var46 = var2.method1541();
									var38 = var11 + var5;
									var7 = var33 + var6;
									if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var38 >= 0 && var7 >= 0 && var38 < 104 && var7 < 104 && var3 != 65535) {
										var5 = 64 + var5 * 128;
										var6 = 64 + var6 * 128;
										var38 = 64 + var38 * 128;
										var7 = 64 + var7 * 128;
										class351 var47 = new class351(var3, class401.field3120, var5, var6, Client.method131(var5, var6, class401.field3120) - var14, Client.field330 + var46, var10 + Client.field330, var9, var13, var8, var40);
										var47.method1929(var38, var7, Client.method131(var38, var7, class401.field3120) - var40, var46 + Client.field330);
										Client.field154.method631(var47);
									}

								} else if (var0 == class63.field745) {
									var3 = var2.method1492();
									var4 = (var3 >> 4 & 7) + class470.field3787;
									var5 = (var3 & 7) + class157.field1495;
									var6 = var2.method1514();
									var7 = var2.method1519();
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
										var34 = Client.field167[class401.field3120][var4][var5];
										if (null != var34) {
											for (var36 = (class432)var34.method627(); var36 != null; var36 = (class432)var34.method629()) {
												if ((var7 & 32767) == var36.field3272) {
													var36.method2251(var6);
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
