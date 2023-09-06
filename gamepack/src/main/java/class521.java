public class class521 extends class268 {
	final boolean field4227;

	public class521(boolean var1) {
		this.field4227 = var1;
	}

	int method2529(class304 var1, class304 var2) {
		if (Client.field3 == var1.field2769 && var2.field2769 == Client.field3) {
			return this.field4227 ? var1.method508().method2213(var2.method508()) : var2.method508().method2213(var1.method508());
		} else {
			return this.method1568(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2529((class304)var1, (class304)var2);
	}

	public static void method2528(class537 var0) {
		class496.field4140 = var0;
	}

	public static void method2531() {
		class235.field2108.method1887();
		class235.field2135.method1887();
		class235.field2111.method1887();
		class235.field2129.method1887();
	}

	static final int method2530(class60 var0, int var1) {
		if (var0.field708 != null && var1 < var0.field708.length) {
			try {
				int[] var3 = var0.field708[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = Client.field147[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = Client.field295[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = Client.field298[var3[var5++]];
					}

					int var10;
					class60 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class366.method1967(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class67.method492(var12).field1942 || Client.field30)) {
							for (var13 = 0; var13 < var11.field770.length; ++var13) {
								if (var11.field770[var13] == var12 + 1) {
									var8 += var11.field771[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = class23.field443[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = class341.field2960[Client.field295[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = class23.field443[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = class82.field863.field2528;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class341.field2958[var10]) {
								var8 += Client.field295[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class366.method1967(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class67.method492(var12).field1942 || Client.field30)) {
							for (var13 = 0; var13 < var11.field770.length; ++var13) {
								if (var11.field770[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = Client.field120;
					}

					if (var7 == 12) {
						var8 = Client.field290;
					}

					if (var7 == 13) {
						var10 = class23.field443[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class516.method2516(var10);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = class296.field2735 + (class82.field863.field1555 >> 7);
					}

					if (var7 == 19) {
						var8 = class164.field1606 + (class82.field863.field1526 >> 7);
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
