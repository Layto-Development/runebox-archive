import java.io.IOException;

public class class338 {
	class338() throws Throwable {
	}

	static void method1869() {
		if (class451.field3950.method177()) {
			class451.field3950.method175();
		}

		if (class525.field4240 != null) {
			class525.field4240.field3236 = false;
		}

		class525.field4240 = null;
		Client.field68.method1574();
		if (null != class172.field1652) {
			try {
				class172.field1652.method1702();
			} catch (Exception var3) {
			}
		}

		class172.field1652 = null;
		class38.method249();
		class26.field457.method1227();
		class287.field2551.method1227();
		class188.field1755.method1227();
		class38.field502.method1227();
		class503.field4165.method1227();
		class96.field980.method1227();
		class395.field3319.method1227();
		class54.field605.method1227();
		class423.method2168();
		class415.field3487.method1754();

		for (int var1 = 0; var1 < 4; ++var1) {
			Client.field78[var1].method532();
		}

		class306.field2771 = null;
		class167.method924(0, 0);
		class296.method1689();
		Client.field275 = false;
		class79.method536();
		if (class233.field2104 != null) {
			class233.field2104.method1854();
		}

		class336.field2933.method1653();
		class61.method475();
		if (null != class136.field1326) {
			class136.field1326.method1685();
		}

		class162.method898();
		class297.field2739 = null;
		class297.field2740 = null;
		class436.field3865 = null;
		class281.method1599();
		class290.field2580 = null;
		Client.field300.clear();
		Client.field302 = 0;
		class336.field2933 = new class288();
		class136.field1326 = new class237(class466.field3999.field50, 216);

		try {
			class324.method1828("oldschool", class289.field2577, class467.field4006.field3965, 0, 22);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class290.field2580 = new class124(255, class297.field2739, class297.field2740, 500000);
		class172.field1652 = new class302();
		class466.field3999.method955();
		Client.field35 = class366.field3093;
		class104.method675(0);
	}

	static final void method1870() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (Client.field96 == 0) {
			var1 = class82.field863.field1555;
			var2 = class82.field863.field1526;
			if (class314.field2821 - var1 < -500 || class314.field2821 - var1 > 500 || class358.field3040 - var2 < -500 || class358.field3040 - var2 > 500) {
				class314.field2821 = var1;
				class358.field3040 = var2;
			}

			if (class314.field2821 != var1) {
				class314.field2821 += (var1 - class314.field2821) / 16;
			}

			if (class358.field3040 != var2) {
				class358.field3040 += (var2 - class358.field3040) / 16;
			}

			var3 = class314.field2821 >> 7;
			var4 = class358.field3040 >> 7;
			var5 = class454.method2262(class314.field2821, class358.field3040, class358.field3038);
			var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = class358.field3038;
						if (var9 < 3 && (class38.field513[1][var7][var8] & 2) == 2) {
							++var9;
						}

						int var10 = var5 - class38.field511[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}

			if (var7 < 32768) {
				var7 = 32768;
			}

			if (var7 > Client.field145) {
				Client.field145 += (var7 - Client.field145) / 24;
			} else if (var7 < Client.field145) {
				Client.field145 += (var7 - Client.field145) / 80;
			}

			class98.field988 = class454.method2262(class82.field863.field1555, class82.field863.field1526, class358.field3038) - Client.field97;
		} else if (Client.field96 == 1) {
			class15.method125();
			short var11 = -1;
			if (Client.field151.method2118(33)) {
				var11 = 0;
			} else if (Client.field151.method2118(49)) {
				var11 = 1024;
			}

			if (Client.field151.method2118(48)) {
				if (var11 == 0) {
					var11 = 1792;
				} else if (var11 == 1024) {
					var11 = 1280;
				} else {
					var11 = 1536;
				}
			} else if (Client.field151.method2118(50)) {
				if (var11 == 0) {
					var11 = 256;
				} else if (var11 == 1024) {
					var11 = 768;
				} else {
					var11 = 512;
				}
			}

			byte var12 = 0;
			if (Client.field151.method2118(35)) {
				var12 = -1;
			} else if (Client.field151.method2118(51)) {
				var12 = 1;
			}

			var3 = 0;
			if (var11 >= 0 || var12 != 0) {
				var3 = Client.field151.method2118(81) ? Client.field102 : Client.field101;
				var3 *= 16;
				Client.field99 = var11;
				Client.field100 = var12;
			}

			if (Client.field98 < var3) {
				Client.field98 += var3 / 8;
				if (Client.field98 > var3) {
					Client.field98 = var3;
				}
			} else if (Client.field98 > var3) {
				Client.field98 = Client.field98 * 9 / 10;
			}

			if (Client.field98 > 0) {
				var4 = Client.field98 / 16;
				if (Client.field99 >= 0) {
					var1 = Client.field99 - class175.field1694 & 2047;
					var5 = class133.field1291[var1];
					var6 = class133.field1289[var1];
					class314.field2821 += var5 * var4 / 65536;
					class358.field3040 += var6 * var4 / 65536;
				}

				if (Client.field100 != 0) {
					class98.field988 += Client.field100 * var4;
					if (class98.field988 > 0) {
						class98.field988 = 0;
					}
				}
			} else {
				Client.field99 = -1;
				Client.field100 = -1;
			}

			if (Client.field151.method2118(13)) {
				class154.method886();
			}
		}

		if (class184.field1735 == 4 && class30.field467) {
			var1 = class184.field1728 - Client.field159;
			Client.field93 = var1 * 2;
			Client.field159 = var1 != -1 && var1 != 1 ? (Client.field159 + class184.field1728) / 2 : class184.field1728;
			var2 = Client.field15 - class184.field1745;
			Client.field92 = var2 * 2;
			Client.field15 = var2 != -1 && var2 != 1 ? (class184.field1745 + Client.field15) / 2 : class184.field1745;
		} else {
			if (Client.field151.method2118(96)) {
				Client.field92 += (-24 - Client.field92) / 2;
			} else if (Client.field151.method2118(97)) {
				Client.field92 += (24 - Client.field92) / 2;
			} else {
				Client.field92 /= 2;
			}

			if (Client.field151.method2118(98)) {
				Client.field93 += (12 - Client.field93) / 2;
			} else if (Client.field151.method2118(99)) {
				Client.field93 += (-12 - Client.field93) / 2;
			} else {
				Client.field93 /= 2;
			}

			Client.field159 = class184.field1728;
			Client.field15 = class184.field1745;
		}

		Client.field181 = Client.field92 / 2 + Client.field181 & 2047;
		Client.field42 += Client.field93 / 2;
		if (Client.field42 < 128) {
			Client.field42 = 128;
		}

		if (Client.field42 > 383) {
			Client.field42 = 383;
		}

	}
}
