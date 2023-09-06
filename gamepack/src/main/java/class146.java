public class class146 implements Runnable {
	public static class86 field1383;
	public static final class86 field1385;
	static boolean field1387;
	static int field1384;
	static Object field1386;

	static {
		field1385 = new class86();
		field1383 = new class86();
		field1384 = 0;
		field1387 = false;
		field1386 = new Object();
	}

	class146() {
	}

	public void run() {
		try {
			while (true) {
				class329 var1;
				synchronized(field1385) {
					var1 = (class329)field1385.method563();
				}

				if (var1 != null) {
					if (var1.field2908 == 0) {
						var1.field2909.method761((int)var1.field3987, var1.field2907, var1.field2907.length);
						synchronized(field1385) {
							var1.method2269();
						}
					} else if (var1.field2908 == 1) {
						var1.field2907 = var1.field2909.method760((int)var1.field3987);
						synchronized(field1385) {
							field1383.method567(var1);
						}
					}

					synchronized(field1386) {
						if ((field1387 || field1384 <= 1) && field1385.method566()) {
							field1384 = 0;
							field1386.notifyAll();
							return;
						}

						field1384 = 600;
					}
				} else {
					class353.method1925(100L);
					synchronized(field1386) {
						if ((field1387 || field1384 <= 1) && field1385.method566()) {
							field1384 = 0;
							field1386.notifyAll();
							return;
						}

						--field1384;
					}
				}
			}
		} catch (Exception var13) {
			class41.method263((String)null, var13);
		}
	}

	static void method853() {
		class210.field1986 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class398.method2075((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			class210.field1986[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class210.field1986.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class398.method2075((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class210.field1986.length; ++var1) {
				class210.field1986[var1] = var5;
			}
		}

	}

	public static final boolean method851(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	static int method852(int var0, class167 var1, boolean var2) {
		if (var0 == 5000) {
			class139.field1344[++class203.field1903 - 1] = Client.field236;
			return 1;
		} else if (var0 == 5001) {
			class203.field1903 -= 3;
			Client.field236 = class139.field1344[class203.field1903];
			class224.field2043 = class492.method2409(class139.field1344[class203.field1903 + 1]);
			if (null == class224.field2043) {
				class224.field2043 = class459.field3975;
			}

			Client.field237 = class139.field1344[class203.field1903 + 2];
			class160 var14 = class85.method556(class129.field1256, Client.field68.field2426);
			var14.field1483.method267(Client.field236);
			var14.field1483.method267(class224.field2043.field3974);
			var14.field1483.method267(Client.field237);
			Client.field68.method1570(var14);
			return 1;
		} else {
			String var4;
			class160 var7;
			int var9;
			int var11;
			if (var0 == 5002) {
				var4 = class139.field1331[--class429.field3529];
				class203.field1903 -= 2;
				var9 = class139.field1344[class203.field1903];
				var11 = class139.field1344[class203.field1903 + 1];
				var7 = class85.method556(class129.field1260, Client.field68.field2426);
				var7.field1483.method267(class431.method2196(var4) + 2);
				var7.field1483.method270(var4);
				var7.field1483.method267(var9 - 1);
				var7.field1483.method267(var11);
				Client.field68.method1570(var7);
				return 1;
			} else {
				class445 var6;
				int var8;
				if (var0 == 5003) {
					class203.field1903 -= 2;
					var8 = class139.field1344[class203.field1903];
					var9 = class139.field1344[1 + class203.field1903];
					var6 = class178.method1006(var8, var9);
					if (null != var6) {
						class139.field1344[++class203.field1903 - 1] = var6.field3907;
						class139.field1344[++class203.field1903 - 1] = var6.field3903;
						class139.field1331[++class429.field3529 - 1] = null != var6.field3905 ? var6.field3905 : "";
						class139.field1331[++class429.field3529 - 1] = var6.field3909 != null ? var6.field3909 : "";
						class139.field1331[++class429.field3529 - 1] = var6.field3910 != null ? var6.field3910 : "";
						class139.field1344[++class203.field1903 - 1] = var6.method2229() ? 1 : (var6.method2227() ? 2 : 0);
					} else {
						class139.field1344[++class203.field1903 - 1] = -1;
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1331[++class429.field3529 - 1] = "";
						class139.field1331[++class429.field3529 - 1] = "";
						class139.field1331[++class429.field3529 - 1] = "";
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else {
					class445 var5;
					if (var0 == 5004) {
						var8 = class139.field1344[--class203.field1903];
						var5 = class47.method350(var8);
						if (var5 != null) {
							class139.field1344[++class203.field1903 - 1] = var5.field3904;
							class139.field1344[++class203.field1903 - 1] = var5.field3903;
							class139.field1331[++class429.field3529 - 1] = null != var5.field3905 ? var5.field3905 : "";
							class139.field1331[++class429.field3529 - 1] = null != var5.field3909 ? var5.field3909 : "";
							class139.field1331[++class429.field3529 - 1] = null != var5.field3910 ? var5.field3910 : "";
							class139.field1344[++class203.field1903 - 1] = var5.method2229() ? 1 : (var5.method2227() ? 2 : 0);
						} else {
							class139.field1344[++class203.field1903 - 1] = -1;
							class139.field1344[++class203.field1903 - 1] = 0;
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1344[++class203.field1903 - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (null == class224.field2043) {
							class139.field1344[++class203.field1903 - 1] = -1;
						} else {
							class139.field1344[++class203.field1903 - 1] = class224.field2043.field3974;
						}

						return 1;
					} else {
						class160 var12;
						if (var0 == 5008) {
							var4 = class139.field1331[--class429.field3529];
							var9 = class139.field1344[--class203.field1903];
							var12 = class163.method911(var9, var4, class395.field3318, -1);
							Client.field68.method1570(var12);
							return 1;
						} else if (var0 == 5009) {
							class429.field3529 -= 2;
							var4 = class139.field1331[class429.field3529];
							String var10 = class139.field1331[class429.field3529 + 1];
							var12 = class85.method556(class129.field1261, Client.field68.field2426);
							var12.field1483.method308(0);
							int var13 = var12.field1483.field527;
							var12.field1483.method270(var4);
							class173.method990(var12.field1483, var10);
							var12.field1483.method275(var12.field1483.field527 - var13);
							Client.field68.method1570(var12);
							return 1;
						} else if (var0 == 5010) {
							var4 = class139.field1331[--class429.field3529];
							class203.field1903 -= 2;
							var9 = class139.field1344[class203.field1903];
							var11 = class139.field1344[class203.field1903 + 1];
							var7 = class163.method911(var9, var4, class395.field3318, var11);
							Client.field68.method1570(var7);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								class139.field1344[++class203.field1903 - 1] = Client.field237;
								return 1;
							} else if (var0 == 5017) {
								var8 = class139.field1344[--class203.field1903];
								class139.field1344[++class203.field1903 - 1] = class230.method1325(var8);
								return 1;
							} else if (var0 == 5018) {
								var8 = class139.field1344[--class203.field1903];
								class139.field1344[++class203.field1903 - 1] = class129.method772(var8);
								return 1;
							} else if (var0 == 5019) {
								var8 = class139.field1344[--class203.field1903];
								class139.field1344[++class203.field1903 - 1] = class395.method2068(var8);
								return 1;
							} else if (var0 == 5020) {
								var4 = class139.field1331[--class429.field3529];
								class122.method756(var4);
								return 1;
							} else if (var0 == 5021) {
								Client.field31 = class139.field1331[--class429.field3529].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								class139.field1331[++class429.field3529 - 1] = Client.field31;
								return 1;
							} else if (var0 == 5023) {
								var4 = class139.field1331[--class429.field3529];
								System.out.println(var4);
								return 1;
							} else if (var0 == 5030) {
								class203.field1903 -= 2;
								var8 = class139.field1344[class203.field1903];
								var9 = class139.field1344[class203.field1903 + 1];
								var6 = class178.method1006(var8, var9);
								if (var6 != null) {
									class139.field1344[++class203.field1903 - 1] = var6.field3907;
									class139.field1344[++class203.field1903 - 1] = var6.field3903;
									class139.field1331[++class429.field3529 - 1] = var6.field3905 != null ? var6.field3905 : "";
									class139.field1331[++class429.field3529 - 1] = var6.field3909 != null ? var6.field3909 : "";
									class139.field1331[++class429.field3529 - 1] = null != var6.field3910 ? var6.field3910 : "";
									class139.field1344[++class203.field1903 - 1] = var6.method2229() ? 1 : (var6.method2227() ? 2 : 0);
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1344[++class203.field1903 - 1] = 0;
								} else {
									class139.field1344[++class203.field1903 - 1] = -1;
									class139.field1344[++class203.field1903 - 1] = 0;
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1344[++class203.field1903 - 1] = 0;
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1344[++class203.field1903 - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var8 = class139.field1344[--class203.field1903];
								var5 = class47.method350(var8);
								if (var5 != null) {
									class139.field1344[++class203.field1903 - 1] = var5.field3904;
									class139.field1344[++class203.field1903 - 1] = var5.field3903;
									class139.field1331[++class429.field3529 - 1] = null != var5.field3905 ? var5.field3905 : "";
									class139.field1331[++class429.field3529 - 1] = var5.field3909 != null ? var5.field3909 : "";
									class139.field1331[++class429.field3529 - 1] = null != var5.field3910 ? var5.field3910 : "";
									class139.field1344[++class203.field1903 - 1] = var5.method2229() ? 1 : (var5.method2227() ? 2 : 0);
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1344[++class203.field1903 - 1] = 0;
								} else {
									class139.field1344[++class203.field1903 - 1] = -1;
									class139.field1344[++class203.field1903 - 1] = 0;
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1344[++class203.field1903 - 1] = 0;
									class139.field1331[++class429.field3529 - 1] = "";
									class139.field1344[++class203.field1903 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (null != class82.field863 && null != class82.field863.field2539) {
								var4 = class82.field863.field2539.method2214();
							} else {
								var4 = "";
							}

							class139.field1331[++class429.field3529 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}
}
