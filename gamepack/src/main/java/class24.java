import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class24 {
	ExecutorService field446;
	Future field447;

	class24() {
		this.field446 = Executors.newSingleThreadExecutor();
		this.field447 = this.field446.submit(new class324());
	}

	void method197() {
		this.field446.shutdown();
		this.field446 = null;
	}

	boolean method192() {
		return this.field447.isDone();
	}

	SecureRandom method193() {
		try {
			return (SecureRandom)this.field447.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}

	public static void method199(class215 var0) {
		class32.field476 = var0;
	}

	public static int method195(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var0 + var3) / var1 - var3;
	}

	static final void method200(class42 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (class289.method1662(var1, var2, var3)) {
			class38.field513[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.method327();
				if (var8 == 0) {
					if (var1 == 0) {
						int[] var15 = class38.field511[0][var2];
						int var12 = var4 + 932731;
						int var13 = var5 + 556238;
						int var14 = class371.method1977(var12 + 45365, var13 + 91923, 4) - 128 + (class371.method1977(var12 + 10294, var13 + 37821, 2) - 128 >> 1) + (class371.method1977(var12, var13, 1) - 128 >> 2);
						var14 = (int)((double)var14 * 0.3D) + 35;
						if (var14 < 10) {
							var14 = 10;
						} else if (var14 > 60) {
							var14 = 60;
						}

						var15[var3] = -var14 * 8;
					} else {
						class38.field511[var1][var2][var3] = class38.field511[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.method278();
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						class38.field511[0][var2][var3] = -var9 * 8;
					} else {
						class38.field511[var1][var2][var3] = class38.field511[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					class54.field604[var1][var2][var3] = (short)var0.method280();
					class439.field3868[var1][var2][var3] = (byte)((var8 - 2) / 4);
					class417.field3491[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					class38.field513[var1][var2][var3] = (byte)(var8 - 49);
				} else {
					class38.field504[var1][var2][var3] = (short)(var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.method327();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.method278();
					break;
				}

				if (var8 <= 49) {
					var0.method280();
				}
			}
		}

	}

	static int method198(int var0, class167 var1, boolean var2) {
		int var4 = -1;
		class60 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class139.field1344[--class203.field1903];
			var5 = class366.method1967(var4);
		} else {
			var5 = var2 ? class491.field4134 : class52.field599;
		}

		if (var0 == 1000) {
			class203.field1903 -= 4;
			var5.field653 = class139.field1344[class203.field1903];
			var5.field654 = class139.field1344[1 + class203.field1903];
			var5.field649 = class139.field1344[2 + class203.field1903];
			var5.field650 = class139.field1344[3 + class203.field1903];
			class185.method1024(var5);
			class466.field3999.method22(var5);
			if (var4 != -1 && var5.field646 == 0) {
				class116.method738(class160.field1484[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1001) {
			class203.field1903 -= 4;
			var5.field655 = class139.field1344[class203.field1903];
			var5.field656 = class139.field1344[class203.field1903 + 1];
			var5.field651 = class139.field1344[2 + class203.field1903];
			var5.field652 = class139.field1344[class203.field1903 + 3];
			class185.method1024(var5);
			class466.field3999.method22(var5);
			if (var4 != -1 && var5.field646 == 0) {
				class116.method738(class160.field1484[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var6 = class139.field1344[--class203.field1903] == 1;
			if (var5.field662 != var6) {
				var5.field662 = var6;
				class185.method1024(var5);
			}

			return 1;
		} else if (var0 == 1005) {
			var5.field786 = class139.field1344[--class203.field1903] == 1;
			return 1;
		} else if (var0 == 1006) {
			var5.field787 = class139.field1344[--class203.field1903] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	static int method201(int var0, class167 var1, boolean var2) {
		class60 var4 = var2 ? class491.field4134 : class52.field599;
		if (var0 == 1800) {
			class139.field1344[++class203.field1903 - 1] = class190.method1044(class447.method2235(var4));
			return 1;
		} else if (var0 != 1801) {
			if (var0 == 1802) {
				if (var4.field648 == null) {
					class139.field1331[++class429.field3529 - 1] = "";
				} else {
					class139.field1331[++class429.field3529 - 1] = var4.field648;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = class139.field1344[--class203.field1903];
			--var5;
			if (null != var4.field722 && var5 < var4.field722.length && null != var4.field722[var5]) {
				class139.field1331[++class429.field3529 - 1] = var4.field722[var5];
			} else {
				class139.field1331[++class429.field3529 - 1] = "";
			}

			return 1;
		}
	}

	static final void method196(class163 var0, int var1) {
		class358.method1942(var0.field1555, var0.field1526, var1);
	}

	static void method194(boolean var0) {
		Client.field150 = var0;
	}
}
