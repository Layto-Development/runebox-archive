public class class22 extends class218 {
	static int field440;
	class80[] field441;

	class22(class215 var1, class215 var2, int var3, boolean var4) {
		class86 var5 = new class86();
		int var6 = var1.method1238(var3);
		this.field441 = new class80[var6];
		int[] var7 = var1.method1223(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method1212(var3, var7[var8]);
			class43 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (class43 var12 = (class43)var5.method563(); null != var12; var12 = (class43)var5.method565()) {
				if (var12.field529 == var11) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.method1220(0, var11);
				} else {
					var13 = var2.method1220(var11, 0);
				}

				var10 = new class43(var11, var13);
				var5.method567(var10);
			}

			this.field441[var7[var8]] = new class80(var9, var10);
		}

	}

	public boolean method190(int var1) {
		return this.field441[var1].field854;
	}

	public static int method188(int var0) {
		return class370.field3102[var0 & 16383];
	}

	public static void method189(int var0, int var1) {
		class82 var3 = class389.method2047(var0);
		int var4 = var3.field858;
		int var5 = var3.field859;
		int var6 = var3.field862;
		int var7 = class23.field442[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		class23.field443[var4] = class23.field443[var4] & ~var7 | var1 << var5 & var7;
	}

	static int method186(int var0, class167 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 100) {
			class203.field1903 -= 3;
			var4 = class139.field1344[class203.field1903];
			var5 = class139.field1344[class203.field1903 + 1];
			int var12 = class139.field1344[2 + class203.field1903];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				class60 var7 = class366.method1967(var4);
				if (null == var7.field776) {
					var7.field776 = new class60[var12 + 1];
				}

				if (var7.field776.length <= var12) {
					class60[] var8 = new class60[var12 + 1];

					for (int var9 = 0; var9 < var7.field776.length; ++var9) {
						var8[var9] = var7.field776[var9];
					}

					var7.field776 = var8;
				}

				if (var12 > 0 && var7.field776[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					class60 var13 = new class60();
					var13.field646 = var5;
					var13.field661 = var13.field644 = var7.field644;
					var13.field763 = var12;
					var13.field724 = true;
					if (var5 == 12) {
						var13.method457();
						var13.method472().method2341(new class535(var13));
						var13.method472().method2340(new class188(var13));
					}

					var7.field776[var12] = var13;
					if (var2) {
						class491.field4134 = var13;
					} else {
						class52.field599 = var13;
					}

					class185.method1024(var7);
					return 1;
				}
			}
		} else {
			class60 var10;
			if (var0 == 101) {
				var10 = var2 ? class491.field4134 : class52.field599;
				class60 var11 = class366.method1967(var10.field644);
				var11.field776[var10.field763] = null;
				class185.method1024(var11);
				return 1;
			} else if (var0 == 102) {
				var10 = class366.method1967(class139.field1344[--class203.field1903]);
				var10.field776 = null;
				class185.method1024(var10);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var10 = class366.method1967(class139.field1344[--class203.field1903]);
					if (null != var10) {
						class139.field1344[++class203.field1903 - 1] = 1;
						if (var2) {
							class491.field4134 = var10;
						} else {
							class52.field599 = var10;
						}
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class203.field1903 -= 2;
				var4 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class60 var6 = class203.method1149(var4, var5);
				if (null != var6 && var5 != -1) {
					class139.field1344[++class203.field1903 - 1] = 1;
					if (var2) {
						class491.field4134 = var6;
					} else {
						class52.field599 = var6;
					}
				} else {
					class139.field1344[++class203.field1903 - 1] = 0;
				}

				return 1;
			}
		}
	}

	static final void method187(boolean var0, class347 var1) {
		Client.field272 = 0;
		Client.field117 = 0;
		var1.method1905();
		int var3 = var1.method1903(8);
		int var4;
		if (var3 < Client.field64) {
			for (var4 = var3; var4 < Client.field64; ++var4) {
				Client.field29[++Client.field272 - 1] = Client.field2[var4];
			}
		}

		if (var3 > Client.field64) {
			throw new RuntimeException("");
		} else {
			Client.field64 = 0;

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = Client.field2[var4];
				class102 var6 = Client.field63[var5];
				int var7 = var1.method1903(1);
				if (var7 == 0) {
					Client.field2[++Client.field64 - 1] = var5;
					var6.field1590 = Client.field306;
				} else {
					int var8 = var1.method1903(2);
					if (var8 == 0) {
						Client.field2[++Client.field64 - 1] = var5;
						var6.field1590 = Client.field306;
						Client.field214[++Client.field117 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							Client.field2[++Client.field64 - 1] = var5;
							var6.field1590 = Client.field306;
							var9 = var1.method1903(3);
							var6.method657(var9, class394.field3317);
							var10 = var1.method1903(1);
							if (var10 == 1) {
								Client.field214[++Client.field117 - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.field2[++Client.field64 - 1] = var5;
							var6.field1590 = Client.field306;
							if (var1.method1903(1) == 1) {
								var9 = var1.method1903(3);
								var6.method657(var9, class394.field3314);
								var10 = var1.method1903(3);
								var6.method657(var10, class394.field3314);
							} else {
								var9 = var1.method1903(3);
								var6.method657(var9, class394.field3313);
							}

							var9 = var1.method1903(1);
							if (var9 == 1) {
								Client.field214[++Client.field117 - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field29[++Client.field272 - 1] = var5;
						}
					}
				}
			}

			class449.method2240(var0, var1);
			class489.method2407(var1);

			for (var3 = 0; var3 < Client.field272; ++var3) {
				var4 = Client.field29[var3];
				if (Client.field63[var4].field1590 != Client.field306) {
					Client.field63[var4].field1018 = null;
					Client.field63[var4] = null;
				}
			}

			if (var1.field527 != Client.field68.field2429) {
				throw new RuntimeException(var1.field527 + class278.field2467 + Client.field68.field2429);
			} else {
				for (var3 = 0; var3 < Client.field64; ++var3) {
					if (null == Client.field63[Client.field2[var3]]) {
						throw new RuntimeException(var3 + class278.field2467 + Client.field64);
					}
				}

			}
		}
	}

	static void method185() {
		Client.field152 = 0;
		Client.field116 = false;
	}
}
