import java.util.Comparator;

public class class105 implements Comparator {
	public static boolean[] field1038;
	static int field1039;

	class105() {
	}

	int method680(class351 var1, class351 var2) {
		return var1.field3007 - var2.field3007;
	}

	public int compare(Object var1, Object var2) {
		return this.method680((class351)var1, (class351)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static final void method677(int var0, int var1, boolean var2) {
		if (!var2 || class38.field501 != var0 || class384.field3237 != var1) {
			class38.field501 = var0;
			class384.field3237 = var1;
			class104.method675(25);
			class200.method1140(class433.field3551, true);
			int var4 = class296.field2735;
			int var5 = class164.field1606;
			class296.field2735 = (var0 - 6) * 8;
			class164.field1606 = (var1 - 6) * 8;
			int var6 = class296.field2735 - var4;
			int var7 = class164.field1606 - var5;
			var4 = class296.field2735;
			var5 = class164.field1606;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class102 var9 = Client.field63[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field1600;
						var10000[var10] -= var6;
						var10000 = var9.field1597;
						var10000[var10] -= var7;
					}

					var9.field1555 -= var6 * 128;
					var9.field1526 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				class287 var20 = Client.field176[var8];
				if (null != var20) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field1600;
						var10000[var10] -= var6;
						var10000 = var20.field1597;
						var10000[var10] -= var7;
					}

					var20.field1555 -= var6 * 128;
					var20.field1526 -= var7 * 128;
				}
			}

			byte var19 = 0;
			byte var21 = 104;
			byte var22 = 1;
			if (var6 < 0) {
				var19 = 103;
				var21 = -1;
				var22 = -1;
			}

			byte var11 = 0;
			byte var12 = 104;
			byte var13 = 1;
			if (var7 < 0) {
				var11 = 103;
				var12 = -1;
				var13 = -1;
			}

			int var15;
			for (int var14 = var19; var14 != var21; var14 += var22) {
				for (var15 = var11; var15 != var12; var15 += var13) {
					int var16 = var6 + var14;
					int var17 = var7 + var15;

					for (int var18 = 0; var18 < 4; ++var18) {
						if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
							Client.field143[var18][var14][var15] = Client.field143[var18][var16][var17];
						} else {
							Client.field143[var18][var14][var15] = null;
						}
					}
				}
			}

			for (class353 var23 = (class353)Client.field144.method563(); null != var23; var23 = (class353)Client.field144.method565()) {
				var23.field3021 -= var6;
				var23.field3027 -= var7;
				if (var23.field3021 < 0 || var23.field3027 < 0 || var23.field3021 >= 104 || var23.field3027 >= 104) {
					var23.method2269();
				}
			}

			if (Client.field254 != 0) {
				Client.field254 -= var6;
				Client.field177 -= var7;
			}

			Client.field258 = 0;
			Client.field264 = false;
			class375.field3180 -= var6 << 7;
			class196.field1796 -= var7 << 7;
			class314.field2821 -= var6 << 7;
			class358.field3040 -= var7 << 7;
			Client.field249 = -1;
			Client.field273.method559();
			Client.field130.method559();

			for (var15 = 0; var15 < 4; ++var15) {
				Client.field78[var15].method532();
			}

		}
	}

	static final void method678(int var0) {
		if (class292.method1669(var0)) {
			class517.method2520(class160.field1484[var0], -1);
		}
	}

	static void method679(int var0) {
		if (var0 != Client.field39) {
			Client.field39 = var0;
		}
	}
}
