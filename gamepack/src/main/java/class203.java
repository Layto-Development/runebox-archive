import java.util.LinkedList;
import java.util.List;

public class class203 {
	static class25[] field1907;
	static int field1903;
	class215 field1904;
	class215 field1906;
	class254 field1905;

	public class203(class215 var1, class215 var2) {
		new class254(256);
		this.field1905 = new class254(256);
		this.field1906 = var1;
		this.field1904 = var2;
	}

	class352 method1143(int var1, int var2, int[] var3) {
		long var5 = this.method1147(var1, var2, false);
		class81 var7 = (class81)this.field1905.method1492(var5);
		if (null != var7) {
			return var7.method541();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			class84 var8 = class84.method552(this.field1906, var1, var2);
			if (null == var8) {
				return null;
			} else {
				class352 var9 = var8.method550();
				this.field1905.method1495(new class81(var9), var5);
				if (var3 != null) {
					var3[0] -= var9.field3010.length;
				}

				return var9;
			}
		}
	}

	class81 method1142(int var1, int var2) {
		long var4 = this.method1147(var1, var2, true);
		class81 var6 = (class81)this.field1905.method1492(var4);
		if (var6 != null) {
			return var6;
		} else {
			class374 var7 = class374.method1993(this.field1904, var1, var2);
			if (var7 == null) {
				return new class81();
			} else {
				class81 var8 = new class81(var7);
				this.field1905.method1495(var8, var4);
				return var8;
			}
		}
	}

	class352 method1144(int var1, int[] var2) {
		if (this.field1906.method1224() == 1) {
			return this.method1143(0, var1, var2);
		} else if (this.field1906.method1238(var1) == 1) {
			return this.method1143(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public class81 method1145(int var1) {
		if (this.field1904.method1224() == 1) {
			return this.method1142(0, var1);
		} else if (this.field1904.method1238(var1) == 1) {
			return this.method1142(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public class352 method1146(int var1) {
		return this.method1144(var1, (int[])null);
	}

	long method1147(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? (long)var5 ^ 4294967296L : (long)var5;
	}

	static void method1150(int var0) {
		class281 var2 = (class281)class281.field2506.method1492((long)var0);
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.field2505.length; ++var3) {
				var2.field2505[var3] = -1;
				var2.field2504[var3] = 0;
			}

		}
	}

	public static class60 method1149(int var0, int var1) {
		class60 var3 = class366.method1967(var0);
		if (var1 == -1) {
			return var3;
		} else {
			return var3 != null && var3.field776 != null && var1 < var3.field776.length ? var3.field776[var1] : null;
		}
	}

	static int method1148(int var0, class167 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		class448 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					field1903 -= 3;
					var4 = class139.field1344[field1903];
					var21 = class139.field1344[1 + field1903];
					var6 = class139.field1344[field1903 + 2];
					var23 = class456.method2266(var21);
					var8 = class447.method2236(var21);
					int var25 = class394.method2067(var21);
					class300 var26 = class40.method260(var4);
					class101 var27 = class40.method261(var23);
					int[] var28 = var27.field1014[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}

						var13 = var25;
						var14 = var25 + 1;
					}

					Object[] var15 = var26.method1695(var8);
					if (null == var15 && null != var27.field1015) {
						var15 = var27.field1015[var8];
					}

					int var16;
					int var17;
					if (null == var15) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							class140 var29 = class393.method2063(var17);
							if (var29 == class140.field1347) {
								class139.field1331[++class429.field3529 - 1] = "";
							} else {
								class139.field1344[++field1903 - 1] = class34.method238(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var17 + var28.length * var6;
								class140 var19 = class393.method2063(var28[var17]);
								if (var19 == class140.field1347) {
									class139.field1331[++class429.field3529 - 1] = (String)var15[var18];
								} else {
									class139.field1344[++field1903 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					field1903 -= 2;
					var4 = class139.field1344[field1903];
					var21 = class139.field1344[1 + field1903];
					var6 = 0;
					var23 = class456.method2266(var21);
					var8 = class447.method2236(var21);
					class300 var24 = class40.method260(var4);
					class101 var10 = class40.method261(var23);
					int[] var11 = var10.field1014[var8];
					Object[] var12 = var24.method1695(var8);
					if (null == var12 && null != var10.field1015) {
						var12 = var10.field1015[var8];
					}

					if (null != var12) {
						var6 = var12.length / var11.length;
					}

					class139.field1344[++field1903 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = class139.field1344[--field1903];
						class300 var22 = class40.method260(var4);
						class139.field1344[++field1903 - 1] = var22.field2751;
						return 1;
					} else if (var0 == 7506) {
						var4 = class139.field1344[--field1903];
						var21 = -1;
						if (null != class285.field2518 && var4 >= 0 && var4 < class285.field2518.size()) {
							var21 = (Integer)class285.field2518.get(var4);
						}

						class139.field1344[++field1903 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = class139.field1344[--field1903];
						var5 = class394.method2065(var4);
						var6 = class139.field1344[--field1903];
						var7 = class120.method749(var6);
						if (var7 == null) {
							throw new RuntimeException();
						} else if (class456.method2266(var6) != Client.field297) {
							throw new RuntimeException();
						} else if (null == class285.field2518 && class285.field2518.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = class394.method2067(var6);
							List var9 = var7.method2238(var5, var8);
							class285.field2518 = new LinkedList(class285.field2518);
							if (var9 != null) {
								class285.field2518.retainAll(var9);
							} else {
								class285.field2518.clear();
							}

							class475.field4034 = class285.field2518.iterator();
							if (var0 == 7507) {
								class139.field1344[++field1903 - 1] = class285.field2518.size();
							}

							return 1;
						}
					}
				} else {
					--field1903;
					var4 = class139.field1344[field1903];
					class448 var20 = class220.method1259(var4);
					if (var20 == null) {
						throw new RuntimeException();
					} else {
						class285.field2518 = var20.method2238(0, 0);
						var6 = 0;
						if (class285.field2518 != null) {
							Client.field297 = var4;
							class475.field4034 = class285.field2518.iterator();
							var6 = class285.field2518.size();
						}

						if (var0 == 7504) {
							class139.field1344[++field1903 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (class475.field4034 != null && class475.field4034.hasNext()) {
					class139.field1344[++field1903 - 1] = (Integer)class475.field4034.next();
				} else {
					class139.field1344[++field1903 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = class139.field1344[--field1903];
			var5 = class394.method2065(var4);
			var6 = class139.field1344[--field1903];
			var7 = class120.method749(var6);
			if (null == var7) {
				throw new RuntimeException();
			} else {
				var8 = class394.method2067(var6);
				class285.field2518 = var7.method2238(var5, var8);
				if (null != class285.field2518) {
					Client.field297 = class456.method2266(var6);
					class475.field4034 = class285.field2518.iterator();
					if (var0 == 7500) {
						class139.field1344[++field1903 - 1] = class285.field2518.size();
					}
				} else {
					Client.field297 = -1;
					class475.field4034 = null;
					if (var0 == 7500) {
						class139.field1344[++field1903 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
