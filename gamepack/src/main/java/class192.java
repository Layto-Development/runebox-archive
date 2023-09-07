import java.net.URL;

public class class192 {

	static int field1841;

	static int field1845;

	static int[] field1842;

	static int[] field1843;

	int field1840;

	int field1844;

	int field1846;

	int field1849;

	int field1850;

	String field1847;

	String field1848;

	String field1851;

	static {
		field1845 = 0;
		field1841 = 0;
		field1842 = new int[] { 1, 1, 1, 1 };
		field1843 = new int[] { 0, 1, 2, 3 };
	}

	class192() {
	}

	boolean method1173() {
		return (class351.field2666.method1362() & this.field1840) != 0;
	}

	boolean method1174() {
		return (class351.field2656.method1362() & this.field1840) != 0;
	}

	boolean method1175() {
		return (class351.field2641.method1362() & this.field1840) != 0;
	}

	boolean method1183() {
		return (class351.field2650.method1362() & this.field1840) != 0;
	}

	boolean method1181() {
		return (class351.field2654.method1362() & this.field1840) != 0;
	}

	boolean method1177() {
		return (class351.field2669.method1362() & this.field1840) != 0;
	}

	boolean method1180() {
		return (class351.field2665.method1362() & this.field1840) != 0;
	}

	boolean method1178() {
		return (class351.field2670.method1362() & this.field1840) != 0;
	}

	boolean method1182() {
		return (class351.field2648.method1362() & this.field1840) != 0;
	}

	boolean method1179() {
		return (class351.field2667.method1362() & this.field1840) != 0;
	}

	static boolean method1187() {
		try {
			if (class532.field4205 == null) {
				class532.field4205 = class28.field142.method1806(new URL(class176.field1755));
			} else if (class532.field4205.method283()) {
				byte[] var1 = class532.field4205.method285();
				class187 var2 = new class187(var1);
				var2.method1100();
				field1845 = var2.method1145();
				class253.field2125 = new class192[field1845];
				class192 var4;
				for (int var3 = 0; var3 < field1845; var4.field1850 = var3++) {
					var4 = class253.field2125[var3] = new class192();
					var4.field1844 = var2.method1145();
					var4.field1840 = var2.method1100();
					var4.field1847 = var2.method1104();
					var4.field1848 = var2.method1104();
					var4.field1849 = var2.method1096();
					var4.field1846 = var2.method1098();
				}
				method1185(class253.field2125, 0, class253.field2125.length - 1, field1843, field1842);
				class532.field4205 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			class532.field4205 = null;
		}
		return false;
	}

	static void method1190(int var0, int var1) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;
		for (int var6 = 0; var6 < 4; ++var6) {
			if (var0 != field1843[var6]) {
				var3[var5] = field1843[var6];
				var4[var5] = field1842[var6];
				++var5;
			}
		}
		field1843 = var3;
		field1842 = var4;
		method1185(class253.field2125, 0, class253.field2125.length - 1, field1843, field1842);
	}

	static void method1185(class192[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var1 + var2) / 2;
			class192 var9 = var0[var8];
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
							var12 = var0[var7].field1850;
							var13 = var9.field1850;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field1846;
							var13 = var9.field1846;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}
							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var7].method1173() ? 1 : 0;
							var13 = var9.method1173() ? 1 : 0;
						} else {
							var12 = var0[var7].field1844;
							var13 = var9.field1844;
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
				} while (var10);
				var10 = true;
				do {
					++var6;
					for (var11 = 0; var11 < 4; ++var11) {
						if (var3[var11] == 2) {
							var12 = var0[var6].field1850;
							var13 = var9.field1850;
						} else if (var3[var11] == 1) {
							var12 = var0[var6].field1846;
							var13 = var9.field1846;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}
							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method1173() ? 1 : 0;
							var13 = var9.method1173() ? 1 : 0;
						} else {
							var12 = var0[var6].field1844;
							var13 = var9.field1844;
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
				} while (var10);
				if (var6 < var7) {
					class192 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}
			method1185(var0, var1, var7, var3, var4);
			method1185(var0, var7 + 1, var2, var3, var4);
		}
	}

	static void method1189(int var0, boolean var1, int var2, boolean var3) {
		if (null != class253.field2125) {
			method1192(0, class253.field2125.length - 1, var0, var1, var2, var3);
		}
	}

	static void method1192(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var8 = var0;
			class192 var9 = class253.field2125[var7];
			class253.field2125[var7] = class253.field2125[var1];
			class253.field2125[var1] = var9;
			for (int var10 = var0; var10 < var1; ++var10) {
				if (method1186(class253.field2125[var10], var9, var2, var3, var4, var5) <= 0) {
					class192 var11 = class253.field2125[var10];
					class253.field2125[var10] = class253.field2125[var8];
					class253.field2125[var8++] = var11;
				}
			}
			class253.field2125[var1] = class253.field2125[var8];
			class253.field2125[var8] = var9;
			method1192(var0, var8 - 1, var2, var3, var4, var5);
			method1192(var8 + 1, var1, var2, var3, var4, var5);
		}
	}

	static int method1186(class192 var0, class192 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = method1188(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = method1188(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	static int method1188(class192 var0, class192 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field1846;
			int var6 = var1.field1846;
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
			return var0.field1849 - var1.field1849;
		} else if (var2 == 3) {
			if (var0.field1848.equals("-")) {
				if (var1.field1848.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field1848.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field1848.compareTo(var1.field1848);
			}
		} else if (var2 == 4) {
			return var0.method1181() ? (var1.method1181() ? 0 : 1) : (var1.method1181() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1175() ? (var1.method1175() ? 0 : 1) : (var1.method1175() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method1183() ? (var1.method1183() ? 0 : 1) : (var1.method1183() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method1173() ? (var1.method1173() ? 0 : 1) : (var1.method1173() ? -1 : 0);
		} else {
			return var0.field1844 - var1.field1844;
		}
	}

	static class192 method1184() {
		field1841 = 0;
		return method1191();
	}

	static class192 method1191() {
		return field1841 < field1845 ? class253.field2125[++field1841 - 1] : null;
	}

	static final void method1176(class255 var0) {
		class515 var2 = Client.field963.field1604;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class255.field2133 == var0) {
			var3 = var2.method1135();
			var4 = var2.method1136();
			var5 = var2.method1096();
			var6 = (var5 >> 4 & 7) + class46.field215;
			var7 = class528.field4184 + (var5 & 7);
			var8 = var2.method1124();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				class449 var41 = Client.field1038[class121.field1436][var6][var7];
				if (var41 != null) {
					for (class103 var37 = (class103) var41.method2218(); var37 != null; var37 = (class103) var41.method2220()) {
						if ((var8 & 32767) == var37.field1275 && var37.field1276 == var4) {
							var37.field1276 = var3;
							break;
						}
					}
					Client.method500(var6, var7);
				}
			}
		} else {
			int var9;
			int var10;
			byte var11;
			int var13;
			int var14;
			if (class255.field2136 == var0) {
				var3 = var2.method1117();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = Client.field1083[var4];
				var7 = var2.method1156();
				var8 = class46.field215 + (var7 >> 4 & 7);
				var9 = (var7 & 7) + class528.field4184;
				var10 = var2.method1125();
				var11 = var2.method1111();
				byte var12 = var2.method1119();
				var13 = var2.method1123();
				var14 = var2.method1123();
				byte var15 = var2.method1120();
				byte var16 = var2.method1097();
				int var17 = var2.method1125();
				class82 var18;
				if (Client.field1026 == var10) {
					var18 = class431.field3378;
				} else {
					var18 = Client.field1071[var10];
				}
				if (var18 != null) {
					class362 var19 = class319.method1705(var14, (byte) -34);
					int var20;
					int var21;
					if (var5 != 1 && var5 != 3) {
						var20 = var19.field2883;
						var21 = var19.field2868;
					} else {
						var20 = var19.field2868;
						var21 = var19.field2883;
					}
					int var22 = var8 + (var20 >> 1);
					int var23 = var8 + (var20 + 1 >> 1);
					int var24 = var9 + (var21 >> 1);
					int var25 = (var21 + 1 >> 1) + var9;
					int[][] var26 = class502.field4035[class121.field1436];
					int var27 = var26[var23][var25] + var26[var22][var25] + var26[var23][var24] + var26[var22][var24] >> 2;
					int var28 = (var8 << 7) + (var20 << 6);
					int var29 = (var21 << 6) + (var9 << 7);
					class113 var30 = var19.method1892(var4, var5, var26, var28, var27, var29);
					if (var30 != null) {
						Client.method479(class121.field1436, var8, var9, var6, -1, 0, 0, 31, var13 + 1, var17 + 1);
						var18.field814 = Client.field1201 + var13;
						var18.field824 = var17 + Client.field1201;
						var18.field818 = var30;
						var18.field815 = var8 * 128 + var20 * 64;
						var18.field817 = var9 * 128 + var21 * 64;
						var18.field816 = var27;
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
						var18.field830 = var8 + var15;
						var18.field821 = var11 + var8;
						var18.field820 = var12 + var9;
						var18.field810 = var16 + var9;
					}
				}
			}
			if (var0 == class255.field2129) {
				var3 = var2.method1156();
				var4 = (var3 >> 4 & 7) + class46.field215;
				var5 = class528.field4184 + (var3 & 7);
				var6 = var2.method1145();
				var7 = var2.method1156();
				var8 = var2.method1124();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var4 = 64 + var4 * 128;
					var5 = 64 + var5 * 128;
					class435 var39 = new class435(var8, class121.field1436, var4, var5, Client.method450(var4, var5, class121.field1436) - var7, var6, Client.field1201);
					Client.field1168.method2222(var39);
				}
			} else {
				int var38;
				if (class255.field2137 == var0) {
					var3 = var2.method1117();
					var4 = var2.method1156();
					var5 = var4 >> 2;
					var6 = var4 & 3;
					var7 = Client.field1083[var5];
					var8 = var2.method1125();
					var9 = var2.method1118();
					var10 = class46.field215 + (var9 >> 4 & 7);
					var38 = class528.field4184 + (var9 & 7);
					if (var10 >= 0 && var38 >= 0 && var10 < 104 && var38 < 104) {
						Client.method479(class121.field1436, var10, var38, var7, var8, var5, var6, var3, 0, -1);
					}
				} else {
					int var40;
					if (class255.field2130 == var0) {
						var3 = var2.method1156();
						var4 = var3 >> 2;
						var5 = var3 & 3;
						var6 = Client.field1083[var4];
						var7 = var2.method1123();
						var8 = var2.method1156();
						var9 = (var8 >> 4 & 7) + class46.field215;
						var10 = (var8 & 7) + class528.field4184;
						if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
							if (var6 == 0) {
								class19 var42 = class377.field3061.method1931(class121.field1436, var9, var10);
								if (var42 != null) {
									var40 = class424.method2132(var42.field100);
									if (var4 == 2) {
										var42.field101 = new class57(var40, 2, var5 + 4, class121.field1436, var9, var10, var7, false, var42.field101);
										var42.field99 = new class57(var40, 2, var5 + 1 & 3, class121.field1436, var9, var10, var7, false, var42.field99);
									} else {
										var42.field101 = new class57(var40, var4, var5, class121.field1436, var9, var10, var7, false, var42.field101);
									}
									return;
								}
							}
							if (var6 == 1) {
								class12 var43 = class377.field3061.method1932(class121.field1436, var9, var10);
								if (null != var43) {
									var40 = class424.method2132(var43.field69);
									if (var4 != 4 && var4 != 5) {
										if (var4 == 6) {
											var43.field66 = new class57(var40, 4, var5 + 4, class121.field1436, var9, var10, var7, false, var43.field66);
										} else if (var4 == 7) {
											var43.field66 = new class57(var40, 4, (var5 + 2 & 3) + 4, class121.field1436, var9, var10, var7, false, var43.field66);
										} else if (var4 == 8) {
											var43.field66 = new class57(var40, 4, var5 + 4, class121.field1436, var9, var10, var7, false, var43.field66);
											var43.field67 = new class57(var40, 4, 4 + (var5 + 2 & 3), class121.field1436, var9, var10, var7, false, var43.field67);
										}
									} else {
										var43.field66 = new class57(var40, 4, var5, class121.field1436, var9, var10, var7, false, var43.field66);
									}
									return;
								}
							}
							if (var6 == 2) {
								class430 var44 = class377.field3061.method1969(class121.field1436, var9, var10);
								if (var4 == 11) {
									var4 = 10;
								}
								if (null != var44) {
									var44.field3363 = new class57(class424.method2132(var44.field3368), var4, var5, class121.field1436, var9, var10, var7, false, var44.field3363);
									return;
								}
							}
							if (var6 == 3) {
								class460 var45 = class377.field3061.method1956(class121.field1436, var9, var10);
								if (var45 != null) {
									var45.field3499 = new class57(class424.method2132(var45.field3498), 22, var5, class121.field1436, var9, var10, var7, false, var45.field3499);
									return;
								}
							}
							Client.method596(class121.field1436, var9, var10, var6, var7);
						}
					} else {
						class103 var36;
						if (class255.field2134 == var0) {
							var2.method1117();
							var3 = var2.method1117();
							var4 = (var3 >> 4 & 7) + class46.field215;
							var5 = (var3 & 7) + class528.field4184;
							var6 = var2.method1096();
							var7 = var2.method1100();
							var2.method1125();
							var2.method1123();
							var2.method1117();
							var8 = var2.method1145();
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								var36 = new class103();
								var36.field1275 = var8;
								var36.field1276 = var7;
								var36.method638(var6);
								if (Client.field1038[class121.field1436][var4][var5] == null) {
									Client.field1038[class121.field1436][var4][var5] = new class449();
								}
								Client.field1038[class121.field1436][var4][var5].method2222(var36);
								Client.method500(var4, var5);
							}
						} else if (class255.field2139 == var0) {
							var3 = var2.method1096();
							var4 = (var3 >> 4 & 7) + class46.field215;
							var5 = (var3 & 7) + class528.field4184;
							var6 = var2.method1156();
							var7 = var6 >> 2;
							var8 = var6 & 3;
							var9 = Client.field1083[var7];
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								Client.method479(class121.field1436, var4, var5, var9, -1, var7, var8, 31, 0, -1);
							}
						} else {
							class449 var34;
							if (class255.field2138 == var0) {
								var3 = var2.method1125();
								var4 = var2.method1135();
								var5 = var2.method1096();
								var6 = class46.field215 + (var5 >> 4 & 7);
								var7 = class528.field4184 + (var5 & 7);
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
									var34 = Client.field1038[class121.field1436][var6][var7];
									if (var34 != null) {
										for (var36 = (class103) var34.method2218(); null != var36; var36 = (class103) var34.method2220()) {
											if ((var3 & 32767) == var36.field1275 && var36.field1276 == var4) {
												var36.method318();
												break;
											}
										}
										if (var34.method2218() == null) {
											Client.field1038[class121.field1436][var6][var7] = null;
										}
										Client.method500(var6, var7);
									}
								}
							} else {
								if (var0 == class255.field2135) {
									var3 = var2.method1117();
									var4 = class46.field215 + (var3 >> 4 & 7);
									var5 = (var3 & 7) + class528.field4184;
									var6 = var2.method1118();
									var7 = var6 >> 4 & 15;
									var8 = var6 & 7;
									var9 = var2.method1096();
									var10 = var2.method1125();
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
										var38 = var7 + 1;
										if (class431.field3378.field317[0] >= var4 - var38 && class431.field3378.field317[0] <= var38 + var4 && class431.field3378.field314[0] >= var5 - var38 && class431.field3378.field314[0] <= var38 + var5 && class83.field841.method1027() != 0 && var8 > 0 && Client.field1153 < 50) {
											Client.field1154[Client.field1153] = var10;
											Client.field1155[Client.field1153] = var8;
											Client.field1110[Client.field1153] = var9;
											Client.field942[Client.field1153] = null;
											Client.field905[Client.field1153] = var7 + (var4 << 16) + (var5 << 8);
											++Client.field1153;
										}
									}
								}
								int var46;
								if (class255.field2132 == var0) {
									var3 = var2.method1124();
									var4 = var2.method1145();
									byte var32 = var2.method1120();
									var6 = var2.method1156();
									var7 = var2.method1130();
									byte var35 = var2.method1097();
									var9 = var2.method1117() * 4;
									var10 = var2.method1156();
									var38 = var2.method1118() * 4;
									var40 = var2.method1131();
									var13 = var2.method1096();
									var14 = (var13 >> 4 & 7) + class46.field215;
									var46 = (var13 & 7) + class528.field4184;
									int var48 = var2.method1125();
									var5 = var32 + var14;
									var8 = var35 + var46;
									if (var14 >= 0 && var46 >= 0 && var14 < 104 && var46 < 104 && var5 >= 0 && var8 >= 0 && var5 < 104 && var8 < 104 && var48 != 65535) {
										var14 = var14 * 128 + 64;
										var46 = var46 * 128 + 64;
										var5 = var5 * 128 + 64;
										var8 = 64 + var8 * 128;
										class489 var49 = new class489(var48, class121.field1436, var14, var46, Client.method450(var14, var46, class121.field1436) - var9, Client.field1201 + var3, var4 + Client.field1201, var6, var10, var40, var7, var38);
										var49.method2352(var5, var8, Client.method450(var5, var8, class121.field1436) - var38, var3 + Client.field1201);
										Client.field1025.method2222(var49);
									}
								} else if (class255.field2128 == var0) {
									var3 = var2.method1123();
									var4 = var2.method1117();
									var5 = (var4 >> 4 & 7) + class46.field215;
									var6 = (var4 & 7) + class528.field4184;
									byte var33 = var2.method1120();
									var8 = var2.method1131();
									var9 = var2.method1117();
									var10 = var2.method1125();
									var11 = var2.method1111();
									var40 = var2.method1156() * 4;
									var13 = var2.method1117();
									var14 = var2.method1117() * 4;
									var46 = var2.method1145();
									var38 = var11 + var5;
									var7 = var33 + var6;
									if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var38 >= 0 && var7 >= 0 && var38 < 104 && var7 < 104 && var3 != 65535) {
										var5 = 64 + var5 * 128;
										var6 = 64 + var6 * 128;
										var38 = 64 + var38 * 128;
										var7 = 64 + var7 * 128;
										class489 var47 = new class489(var3, class121.field1436, var5, var6, Client.method450(var5, var6, class121.field1436) - var14, Client.field1201 + var46, var10 + Client.field1201, var9, var13, var8, var40);
										var47.method2352(var38, var7, Client.method450(var38, var7, class121.field1436) - var40, var46 + Client.field1201);
										Client.field1025.method2222(var47);
									}
								} else if (var0 == class255.field2131) {
									var3 = var2.method1096();
									var4 = (var3 >> 4 & 7) + class46.field215;
									var5 = (var3 & 7) + class528.field4184;
									var6 = var2.method1118();
									var7 = var2.method1123();
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
										var34 = Client.field1038[class121.field1436][var4][var5];
										if (null != var34) {
											for (var36 = (class103) var34.method2218(); var36 != null; var36 = (class103) var34.method2220()) {
												if ((var7 & 32767) == var36.field1275) {
													var36.method638(var6);
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
