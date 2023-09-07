final class class301 implements class140 {

	// $FF: synthetic field
	final class354 val$cc;

	class301(class354 var1) {
		this.val$cc = var1;
	}

	@Override
	public void method880() {
		if (null != this.val$cc && this.val$cc.method1842().field3195 != null) {
			class165 var2 = new class165();
			var2.method966(this.val$cc);
			var2.method967(this.val$cc.method1842().field3195);
			Client.method459().method2222(var2);
		}
	}

	static void method1599(class61 var0, class61 var1, class61 var2) {
		class174.field1718 = (class86.field856 - 765) / 2;
		class174.field1724 = class174.field1718 + 202;
		class154.field1598 = class174.field1724 + 180;
		boolean var4;
		boolean var5;
		int var10;
		boolean var16;
		int var18;
		int var25;
		int var26;
		int var28;
		int var31;
		int var32;
		int var33;
		int var36;
		if (class174.field1743) {
			if (class380.field3069 == null) {
				class380.field3069 = class494.method2358(class537.field4228, "sl_back", "");
			}
			if (null == class439.field3441) {
				class439.field3441 = class494.method2367(class537.field4228, "sl_flags", "");
			}
			if (null == class101.field1272) {
				class101.field1272 = class494.method2367(class537.field4228, "sl_arrows", "");
			}
			if (class281.field2286 == null) {
				class281.field2286 = class494.method2367(class537.field4228, "sl_stars", "");
			}
			if (class240.field2045 == null) {
				class240.field2045 = class494.method2365(class537.field4228, "leftarrow", "");
			}
			if (null == class413.field3214) {
				class413.field3214 = class494.method2365(class537.field4228, "rightarrow", "");
			}
			class206.method1236(class174.field1718, 23, 765, 480, 0);
			class206.method1237(class174.field1718, 0, 125, 23, 12425273, 9135624);
			class206.method1237(class174.field1718 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method2393(class55.field616, 62 + class174.field1718, 15, 0, -1);
			if (null != class281.field2286) {
				class281.field2286[1].method1292(140 + class174.field1718, 1);
				var1.method2414(class55.field344, 152 + class174.field1718, 10, 16777215, -1);
				class281.field2286[0].method1292(class174.field1718 + 140, 12);
				var1.method2414(class55.field402, class174.field1718 + 152, 21, 16777215, -1);
			}
			if (class101.field1272 != null) {
				var25 = class174.field1718 + 280;
				if (class192.field1843[0] == 0 && class192.field1842[0] == 0) {
					class101.field1272[2].method1292(var25, 4);
				} else {
					class101.field1272[0].method1292(var25, 4);
				}
				if (class192.field1843[0] == 0 && class192.field1842[0] == 1) {
					class101.field1272[3].method1292(var25 + 15, 4);
				} else {
					class101.field1272[1].method1292(var25 + 15, 4);
				}
				var0.method2414(class55.field619, var25 + 32, 17, 16777215, -1);
				var26 = class174.field1718 + 390;
				if (class192.field1843[0] == 1 && class192.field1842[0] == 0) {
					class101.field1272[2].method1292(var26, 4);
				} else {
					class101.field1272[0].method1292(var26, 4);
				}
				if (class192.field1843[0] == 1 && class192.field1842[0] == 1) {
					class101.field1272[3].method1292(var26 + 15, 4);
				} else {
					class101.field1272[1].method1292(var26 + 15, 4);
				}
				var0.method2414(class55.field620, var26 + 32, 17, 16777215, -1);
				var33 = 500 + class174.field1718;
				if (class192.field1843[0] == 2 && class192.field1842[0] == 0) {
					class101.field1272[2].method1292(var33, 4);
				} else {
					class101.field1272[0].method1292(var33, 4);
				}
				if (class192.field1843[0] == 2 && class192.field1842[0] == 1) {
					class101.field1272[3].method1292(var33 + 15, 4);
				} else {
					class101.field1272[1].method1292(var33 + 15, 4);
				}
				var0.method2414(class55.field621, var33 + 32, 17, 16777215, -1);
				var28 = 610 + class174.field1718;
				if (class192.field1843[0] == 3 && class192.field1842[0] == 0) {
					class101.field1272[2].method1292(var28, 4);
				} else {
					class101.field1272[0].method1292(var28, 4);
				}
				if (class192.field1843[0] == 3 && class192.field1842[0] == 1) {
					class101.field1272[3].method1292(var28 + 15, 4);
				} else {
					class101.field1272[1].method1292(var28 + 15, 4);
				}
				var0.method2414(class55.field622, var28 + 32, 17, 16777215, -1);
			}
			class206.method1236(708 + class174.field1718, 4, 50, 16, 0);
			var1.method2393(class55.field562, 25 + 708 + class174.field1718, 16, 16777215, -1);
			class174.field1744 = -1;
			if (class380.field3069 != null) {
				var4 = true;
				var5 = true;
				var33 = 7;
				var28 = 24;
				do {
					var31 = var28;
					var32 = var33;
					if (var28 * (var33 - 1) >= class192.field1845) {
						--var33;
					}
					if ((var28 - 1) * var33 >= class192.field1845) {
						--var28;
					}
					if (var33 * (var28 - 1) >= class192.field1845) {
						--var28;
					}
				} while (var31 != var28 || var32 != var33);
				var31 = (765 - 88 * var33) / (var33 + 1);
				if (var31 > 5) {
					var31 = 5;
				}
				var32 = (480 - 19 * var28) / (var28 + 1);
				if (var32 > 5) {
					var32 = 5;
				}
				var10 = (765 - var33 * 88 - (var33 - 1) * var31) / 2;
				int var37 = (480 - var28 * 19 - (var28 - 1) * var32) / 2;
				var36 = (class192.field1845 + var28 - 1) / var28;
				class174.field1750 = var36 - var33;
				if (class240.field2045 != null && class174.field1745 > 0) {
					class240.field2045.method1292(8, class271.field2226 / 2 - class240.field2045.field1941 / 2);
				}
				if (null != class413.field3214 && class174.field1745 < class174.field1750) {
					class413.field3214.method1292(class86.field856 - class413.field3214.field1940 - 8, class271.field2226 / 2 - class413.field3214.field1941 / 2);
				}
				int var38 = var37 + 23;
				int var14 = class174.field1718 + var10;
				int var40 = 0;
				var16 = false;
				int var41 = class174.field1745;
				for (var18 = var28 * var41; var18 < class192.field1845 && var41 - class174.field1745 < var33; ++var18) {
					class192 var42 = class253.field2125[var18];
					boolean var20 = true;
					String var21 = Integer.toString(var42.field1846);
					if (var42.field1846 == -1) {
						var21 = class55.field623;
						var20 = false;
					} else if (var42.field1846 > 1980) {
						var21 = class55.field518;
						var20 = false;
					}
					class220 var22 = null;
					int var23 = 0;
					if (var42.method1180()) {
						var22 = var42.method1173() ? class220.field1958 : class220.field1968;
					} else if (var42.method1174()) {
						var22 = var42.method1173() ? class220.field1967 : class220.field1960;
					} else if (var42.method1177()) {
						var23 = 16711680;
						var22 = var42.method1173() ? class220.field1957 : class220.field1952;
					} else if (var42.method1178()) {
						var22 = var42.method1173() ? class220.field1956 : class220.field1961;
					} else if (var42.method1183()) {
						var22 = var42.method1173() ? class220.field1955 : class220.field1959;
					} else if (var42.method1182()) {
						var22 = var42.method1173() ? class220.field1963 : class220.field1962;
					} else if (var42.method1179()) {
						var22 = var42.method1173() ? class220.field1965 : class220.field1964;
					}
					if (var22 == null || var22.field1966 >= class380.field3069.length) {
						var22 = var42.method1173() ? class220.field1953 : class220.field1954;
					}
					if (class422.field3270 >= var14 && class422.field3253 >= var38 && class422.field3270 < var14 + 88 && class422.field3253 < var38 + 19 && var20) {
						class174.field1744 = var18;
						class380.field3069[var22.field1966].method364(var14, var38, 128, 16777215);
						var16 = true;
					} else {
						class380.field3069[var22.field1966].method360(var14, var38);
					}
					if (class439.field3441 != null) {
						class439.field3441[(var42.method1173() ? 8 : 0) + var42.field1849].method1292(var14 + 29, var38);
					}
					var0.method2393(Integer.toString(var42.field1844), var14 + 15, 5 + var38 + 9, var23, -1);
					var1.method2393(var21, var14 + 60, 5 + 9 + var38, 268435455, -1);
					var38 += 19 + var32;
					++var40;
					if (var40 >= var28) {
						var38 = var37 + 23;
						var14 += 88 + var31;
						var40 = 0;
						++var41;
					}
				}
				if (var16) {
					var18 = var1.method2386(class253.field2125[class174.field1744].field1848) + 6;
					int var43 = var1.field4005 + 8;
					int var44 = class422.field3253 + 25;
					if (var43 + var44 > 480) {
						var44 = class422.field3253 - 25 - var43;
					}
					class206.method1236(class422.field3270 - var18 / 2, var44, var18, var43, 16777120);
					class206.method1239(class422.field3270 - var18 / 2, var44, var18, var43, 0);
					var1.method2393(class253.field2125[class174.field1744].field1848, class422.field3270, var44 + var1.field4005 + 4, 0, -1);
				}
			}
		} else {
			class174.field1722.method360(class174.field1718, 0);
			class166.field1680.method360(class174.field1718 + 382, 0);
			class365.field2924.method1292(382 + class174.field1718 - class365.field2924.field1940 / 2, 18);
			if (Client.field982 == 0 || Client.field982 == 5) {
				var4 = true;
				var0.method2393(class55.field509, class174.field1724 + 180, 225, 16777215, -1);
				var5 = true;
				class206.method1239(180 + class174.field1724 - 152, 233, 304, 34, 9179409);
				class206.method1239(180 + class174.field1724 - 151, 234, 302, 32, 0);
				class206.method1236(180 + class174.field1724 - 150, 235, class174.field1725 * 3, 30, 9179409);
				class206.method1236(180 + class174.field1724 - 150 + class174.field1725 * 3, 235, 300 - class174.field1725 * 3, 30, 0);
				var0.method2393(class174.field1726, 180 + class174.field1724, 256, 16777215, -1);
			}
			String var6;
			String var7;
			String var8;
			String var9;
			short var24;
			if (Client.field982 == 20) {
				class174.field1720.method1292(180 + class174.field1724 - class174.field1720.field1940 / 2, 271 - class174.field1720.field1941 / 2);
				var24 = 201;
				var0.method2393(class174.field1733, 180 + class174.field1724, 201, 16776960, 0);
				var25 = var24 + 15;
				var0.method2393(class174.field1731, 180 + class174.field1724, 216, 16776960, 0);
				var25 += 15;
				var0.method2393(class174.field1732, 180 + class174.field1724, 231, 16776960, 0);
				var25 += 15;
				var25 += 7;
				if (class174.field1729 != 4 && class174.field1729 != 10) {
					var0.method2414(class55.field555, 180 + class174.field1724 - 110, 253, 16777215, 0);
					var5 = true;
					for (var6 = class174.method1037(); var0.method2386(var6) > 200; var6 = var6.substring(0, var6.length() - 1)) {
					}
					var0.method2414(class500.method2399(var6), class174.field1724 + 180 - 70, 253, 16777215, 0);
					var25 += 15;
					var8 = class174.field1735;
					var7 = class514.method2478('*', var8.length());
					for (var9 = var7; var0.method2386(var9) > 200; var9 = var9.substring(1)) {
					}
					var0.method2414(class55.field556 + var9, 180 + class174.field1724 - 108, 268, 16777215, 0);
					var25 += 15;
				}
			}
			boolean var27;
			boolean var29;
			if (Client.field982 == 10 || Client.field982 == 11 || Client.field982 == 50) {
				class174.field1720.method1292(class174.field1724, 171);
				if (class174.field1729 == 0) {
					var24 = 251;
					var0.method2393(class55.field600, 180 + class174.field1724, 251, 16776960, 0);
					var25 = var24 + 30;
					var26 = class174.field1724 + 180 - 80;
					var27 = true;
					class501.field4024.method1292(var26 - 73, 271);
					var0.method2385(class55.field559, var26 - 73, 271, 144, 40, 16777215, 0, 1, 1, 0);
					var26 = 80 + class174.field1724 + 180;
					class501.field4024.method1292(var26 - 73, 271);
					var0.method2385(class55.field560, var26 - 73, 271, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (class174.field1729 == 1) {
					var0.method2393(class174.field1751, class174.field1724 + 180, 201, 16776960, 0);
					var24 = 236;
					var0.method2393(class174.field1733, 180 + class174.field1724, 236, 16777215, 0);
					var25 = var24 + 15;
					var0.method2393(class174.field1731, 180 + class174.field1724, 251, 16777215, 0);
					var25 += 15;
					var0.method2393(class174.field1732, class174.field1724 + 180, 266, 16777215, 0);
					var25 += 15;
					var26 = class174.field1724 + 180 - 80;
					var27 = true;
					class501.field4024.method1292(var26 - 73, 301);
					var0.method2393(class55.field325, var26, 326, 16777215, 0);
					var26 = 80 + 180 + class174.field1724;
					class501.field4024.method1292(var26 - 73, 301);
					var0.method2393(class55.field562, var26, 326, 16777215, 0);
				} else {
					class214 var11;
					boolean var13;
					if (class174.field1729 == 2) {
						var24 = 201;
						var0.method2393(class174.field1733, class154.field1598, 201, 16776960, 0);
						var25 = var24 + 15;
						var0.method2393(class174.field1731, class154.field1598, 216, 16776960, 0);
						var25 += 15;
						var0.method2393(class174.field1732, class154.field1598, 231, 16776960, 0);
						var25 += 15;
						var25 += 7;
						var0.method2414(class55.field555, class154.field1598 - 110, 253, 16777215, 0);
						var5 = true;
						for (var6 = class174.method1037(); var0.method2386(var6) > 200; var6 = var6.substring(1)) {
						}
						var0.method2414(class500.method2399(var6) + (class174.field1740 == 0 & Client.field1201 % 40 < 20 ? class74.method314(16776960) + class74.field735 : ""), class154.field1598 - 70, 253, 16777215, 0);
						var25 += 15;
						var8 = class174.field1735;
						var7 = class514.method2478('*', var8.length());
						for (var9 = var7; var0.method2386(var9) > 200; var9 = var9.substring(1)) {
						}
						var0.method2414(class55.field556 + var9 + (class174.field1740 == 1 & Client.field1201 % 40 < 20 ? class74.method314(16776960) + class74.field735 : ""), class154.field1598 - 108, 268, 16777215, 0);
						var25 += 15;
						var24 = 277;
						var10 = -117 + class154.field1598;
						boolean var12 = Client.field952;
						var13 = class174.field1723;
						var11 = var12 ? (var13 ? class141.field1540 : class202.field1891) : (var13 ? class329.field2537 : class174.field1717);
						var11.method1292(var10, 277);
						var10 += var11.field1940 + 5;
						var1.method2414(class55.field563, var10, 290, 16776960, 0);
						var10 = 24 + class154.field1598;
						var16 = class83.field841.method1004();
						boolean var17 = class174.field1746;
						class214 var15 = var16 ? (var17 ? class141.field1540 : class202.field1891) : (var17 ? class329.field2537 : class174.field1717);
						var15.method1292(var10, 277);
						var10 += var15.field1940 + 5;
						var1.method2414(class55.field517, var10, 290, 16776960, 0);
						var25 = var24 + 15;
						var18 = class154.field1598 - 80;
						boolean var19 = true;
						class501.field4024.method1292(var18 - 73, 301);
						var0.method2393(class55.field516, var18, 326, 16777215, 0);
						var18 = 80 + class154.field1598;
						class501.field4024.method1292(var18 - 73, 301);
						var0.method2393(class55.field562, var18, 326, 16777215, 0);
						var4 = true;
						switch(class174.field1728) {
							case 2:
								class306.field2369 = class55.field576;
								break;
							default:
								class306.field2369 = class55.field527;
						}
						class298.field2345 = new class166(class154.field1598, 357, var1.method2386(class306.field2369), 11);
						class163.field1650 = new class166(class154.field1598, 357, var1.method2386(class55.field575), 11);
						var1.method2393(class306.field2369, class154.field1598, 357, 16777215, 0);
					} else if (class174.field1729 == 3) {
						var24 = 201;
						var0.method2393(class55.field570, 180 + class174.field1724, 201, 16776960, 0);
						var25 = var24 + 20;
						var1.method2393(class55.field382, class174.field1724 + 180, 221, 16776960, 0);
						var25 += 20;
						var1.method2393(class55.field567, 180 + class174.field1724, 241, 16776960, 0);
						var25 += 15;
						var26 = class174.field1724 + 180;
						var27 = true;
						class501.field4024.method1292(var26 - 73, 256);
						var2.method2393(class55.field568, var26, 281, 16777215, 0);
						var26 = class174.field1724 + 180;
						var27 = true;
						class501.field4024.method1292(var26 - 73, 306);
						var2.method2393(class55.field569, var26, 331, 16777215, 0);
					} else if (class174.field1729 == 4) {
						var0.method2393(class55.field545, 180 + class174.field1724, 201, 16776960, 0);
						var24 = 236;
						var0.method2393(class174.field1733, 180 + class174.field1724, 236, 16777215, 0);
						var25 = var24 + 15;
						var0.method2393(class174.field1731, 180 + class174.field1724, 251, 16777215, 0);
						var25 += 15;
						var0.method2393(class174.field1732, class174.field1724 + 180, 266, 16777215, 0);
						var25 += 15;
						var6 = class55.field557;
						var8 = class60.field648;
						var7 = class514.method2478('*', var8.length());
						var0.method2414(var6 + var7 + (Client.field1201 % 40 < 20 ? class74.method314(16776960) + class74.field735 : ""), class174.field1724 + 180 - 108, 281, 16777215, 0);
						var25 -= 8;
						var0.method2414(class55.field328, class174.field1724 + 180 - 9, 273, 16776960, 0);
						var25 += 15;
						var0.method2414(class55.field445, 180 + class174.field1724 - 9, 288, 16776960, 0);
						var32 = class174.field1724 + 180 - 9 + var0.method2386(class55.field445) + 15;
						var10 = 288 - var0.field4005;
						if (class174.field1739) {
							var11 = class202.field1891;
						} else {
							var11 = class174.field1717;
						}
						var11.method1292(var32, var10);
						var25 += 15;
						var36 = class174.field1724 + 180 - 80;
						var13 = true;
						class501.field4024.method1292(var36 - 73, 301);
						var0.method2393(class55.field325, var36, 326, 16777215, 0);
						var36 = 80 + 180 + class174.field1724;
						class501.field4024.method1292(var36 - 73, 301);
						var0.method2393(class55.field562, var36, 326, 16777215, 0);
						var1.method2393(class55.field527, class174.field1724 + 180, 357, 16777215, 0);
					} else if (class174.field1729 == 5) {
						var0.method2393(class55.field519, 180 + class174.field1724, 201, 16776960, 0);
						var24 = 221;
						var2.method2393(class174.field1733, class174.field1724 + 180, 221, 16776960, 0);
						var25 = var24 + 15;
						var2.method2393(class174.field1731, class174.field1724 + 180, 236, 16776960, 0);
						var25 += 15;
						var2.method2393(class174.field1732, 180 + class174.field1724, 251, 16776960, 0);
						var25 += 15;
						var25 += 14;
						var0.method2414(class55.field441, class174.field1724 + 180 - 145, 280, 16777215, 0);
						var5 = true;
						for (var6 = class174.method1037(); var0.method2386(var6) > 174; var6 = var6.substring(1)) {
						}
						var0.method2414(class500.method2399(var6) + (Client.field1201 % 40 < 20 ? class74.method314(16776960) + class74.field735 : ""), 180 + class174.field1724 - 34, 280, 16777215, 0);
						var25 += 15;
						var28 = 180 + class174.field1724 - 80;
						boolean var30 = true;
						class501.field4024.method1292(var28 - 73, 301);
						var0.method2393(class55.field572, var28, 326, 16777215, 0);
						var28 = 80 + 180 + class174.field1724;
						class501.field4024.method1292(var28 - 73, 301);
						var0.method2393(class55.field612, var28, 326, 16777215, 0);
						var30 = true;
						var1.method2393(class55.field575, class154.field1598, 356, 268435455, 0);
					} else if (class174.field1729 == 6) {
						var24 = 201;
						var0.method2393(class174.field1733, 180 + class174.field1724, 201, 16776960, 0);
						var25 = var24 + 15;
						var0.method2393(class174.field1731, class174.field1724 + 180, 216, 16776960, 0);
						var25 += 15;
						var0.method2393(class174.field1732, 180 + class174.field1724, 231, 16776960, 0);
						var25 += 15;
						var26 = 180 + class174.field1724;
						var27 = true;
						class501.field4024.method1292(var26 - 73, 301);
						var0.method2393(class55.field612, var26, 326, 16777215, 0);
					} else if (class174.field1729 == 7) {
						if (class393.field3125 && !Client.field1133) {
							var24 = 201;
							var0.method2393(class174.field1733, class154.field1598, 201, 16776960, 0);
							var25 = var24 + 15;
							var0.method2393(class174.field1731, class154.field1598, 216, 16776960, 0);
							var25 += 15;
							var0.method2393(class174.field1732, class154.field1598, 231, 16776960, 0);
							var26 = class154.field1598 - 150;
							var25 += 10;
							for (var33 = 0; var33 < 8; ++var33) {
								class501.field4024.method1291(var26, 241, 30, 40);
								var29 = class174.field1734 == var33 & Client.field1201 % 40 < 20;
								var0.method2414((class174.field1737[var33] == null ? "" : class174.field1737[var33]) + (var29 ? class74.method314(16776960) + class74.field735 : ""), var26 + 10, 268, 16777215, 0);
								if (var33 != 1 && var33 != 3) {
									var26 += 35;
								} else {
									var26 += 50;
									var0.method2414(class500.method2399("/"), var26 - 13, 268, 16777215, 0);
								}
							}
							var33 = class154.field1598 - 80;
							var29 = true;
							class501.field4024.method1292(var33 - 73, 301);
							var0.method2393("Submit", var33, 326, 16777215, 0);
							var33 = class154.field1598 + 80;
							class501.field4024.method1292(var33 - 73, 301);
							var0.method2393(class55.field562, var33, 326, 16777215, 0);
						} else {
							var24 = 216;
							var0.method2393(class55.field597, 180 + class174.field1724, 216, 16776960, 0);
							var25 = var24 + 15;
							var2.method2393(class55.field602, class174.field1724 + 180, 231, 16776960, 0);
							var25 += 15;
							var2.method2393(class55.field603, class174.field1724 + 180, 246, 16776960, 0);
							var25 += 15;
							var26 = class174.field1724 + 180 - 80;
							var27 = true;
							class501.field4024.method1292(var26 - 73, 301);
							var0.method2393(class55.field604, var26, 326, 16777215, 0);
							var26 = 180 + class174.field1724 + 80;
							class501.field4024.method1292(var26 - 73, 301);
							var0.method2393(class55.field612, var26, 326, 16777215, 0);
						}
					} else if (class174.field1729 == 8) {
						var24 = 216;
						var0.method2393(class55.field458, 180 + class174.field1724, 216, 16776960, 0);
						var25 = var24 + 15;
						var2.method2393(class55.field500, 180 + class174.field1724, 231, 16776960, 0);
						var25 += 15;
						var2.method2393(class55.field469, class174.field1724 + 180, 246, 16776960, 0);
						var25 += 15;
						var26 = 180 + class174.field1724 - 80;
						var27 = true;
						class501.field4024.method1292(var26 - 73, 301);
						var0.method2393(class55.field573, var26, 326, 16777215, 0);
						var26 = 80 + class174.field1724 + 180;
						class501.field4024.method1292(var26 - 73, 301);
						var0.method2393(class55.field612, var26, 326, 16777215, 0);
					} else if (class174.field1729 == 9) {
						var24 = 221;
						var0.method2393(class174.field1733, class174.field1724 + 180, 221, 16776960, 0);
						var25 = var24 + 25;
						var0.method2393(class174.field1731, 180 + class174.field1724, 246, 16776960, 0);
						var25 += 25;
						var0.method2393(class174.field1732, 180 + class174.field1724, 271, 16776960, 0);
						var26 = 180 + class174.field1724;
						var27 = true;
						class501.field4024.method1292(var26 - 73, 291);
						var0.method2393(class55.field568, var26, 316, 16777215, 0);
					} else {
						short var35;
						if (class174.field1729 == 10) {
							var25 = class174.field1724 + 180;
							var35 = 209;
							var0.method2393(class55.field600, class174.field1724 + 180, 209, 16776960, 0);
							var26 = var35 + 20;
							class174.field1721.method1292(var25 - 109, 229);
							if (class174.field1736.isEmpty()) {
								class53.field241.method1292(var25 - 48, 247);
							} else {
								class53.field241.method1292(var25 - 48, 234);
								var0.method2393(class174.field1736, var25, 282, 16776960, 0);
							}
						} else if (class174.field1729 == 12) {
							var25 = class154.field1598;
							var35 = 216;
							var2.method2393(class55.field608, var25, 216, 16777215, 0);
							var26 = var35 + 17;
							var2.method2393(class55.field609, var25, 233, 16777215, 0);
							var26 += 17;
							var2.method2393(class55.field610, var25, 250, 16777215, 0);
							var26 += 17;
							var2.method2393(class55.field611, var25, 267, 16777215, 0);
							var25 = class154.field1598 - 80;
							var5 = true;
							class501.field4024.method1292(var25 - 73, 291);
							var0.method2393(class55.field430, var25, 316, 16777215, 0);
							var25 = class154.field1598 + 80;
							class501.field4024.method1292(var25 - 73, 291);
							var0.method2393(class55.field615, var25, 316, 16777215, 0);
						} else if (class174.field1729 == 13) {
							var24 = 231;
							var2.method2393(class55.field375, 180 + class174.field1724, 231, 16777215, 0);
							var25 = var24 + 20;
							var2.method2393(class55.field613, 180 + class174.field1724, 251, 16777215, 0);
							var26 = class174.field1724 + 180;
							var4 = true;
							class501.field4024.method1292(var26 - 73, 291);
							var0.method2393(class55.field612, var26, 316, 16777215, 0);
						} else if (class174.field1729 == 14) {
							var24 = 201;
							String var39 = "";
							var6 = "";
							var7 = "";
							switch(class174.field1727) {
								case 0:
									var39 = class55.field424;
									var6 = class55.field364;
									var7 = class55.field376;
									break;
								case 1:
									var39 = class55.field413;
									var6 = class55.field414;
									var7 = class55.field415;
									break;
								case 2:
									var39 = class55.field409;
									var6 = class55.field417;
									var7 = class55.field451;
									break;
								default:
									class498.method2381(false);
							}
							var0.method2393(var39, 180 + class174.field1724, 201, 16776960, 0);
							var25 = var24 + 20;
							var0.method2393(var6, class174.field1724 + 180, 221, 16776960, 0);
							var25 += 20;
							var0.method2393(var7, 180 + class174.field1724, 241, 16776960, 0);
							var31 = class174.field1724 + 180;
							boolean var34 = true;
							class501.field4024.method1292(var31 - 73, 256);
							if (class174.field1727 == 1) {
								var0.method2393(class55.field358, var31, 281, 16777215, 0);
							} else {
								var0.method2393(class55.field435, var31, 281, 16777215, 0);
							}
							var31 = class174.field1724 + 180;
							var34 = true;
							class501.field4024.method1292(var31 - 73, 306);
							var0.method2393(class55.field612, var31, 331, 16777215, 0);
						} else if (class174.field1729 == 24) {
							var24 = 221;
							var0.method2393(class174.field1733, class174.field1724 + 180, 221, 16777215, 0);
							var25 = var24 + 15;
							var0.method2393(class174.field1731, 180 + class174.field1724, 236, 16777215, 0);
							var25 += 15;
							var0.method2393(class174.field1732, class174.field1724 + 180, 251, 16777215, 0);
							var25 += 15;
							var26 = class174.field1724 + 180;
							var27 = true;
							class501.field4024.method1292(var26 - 73, 281);
							var0.method2393(class55.field323, var26, 306, 16777215, 0);
						} else if (class174.field1729 == 32) {
							var24 = 216;
							var0.method2393(class55.field597, 180 + class174.field1724, 216, 16776960, 0);
							var25 = var24 + 15;
							var2.method2393(class55.field602, 180 + class174.field1724, 231, 16776960, 0);
							var25 += 15;
							var2.method2393(class55.field603, 180 + class174.field1724, 246, 16776960, 0);
							var25 += 15;
							var26 = class174.field1724 + 180 - 80;
							var27 = true;
							class501.field4024.method1292(var26 - 73, 301);
							var0.method2393(class55.field604, var26, 326, 16777215, 0);
							var26 = 180 + class174.field1724 + 80;
							class501.field4024.method1292(var26 - 73, 301);
							var0.method2393(class55.field612, var26, 326, 16777215, 0);
						} else if (class174.field1729 == 33) {
							var24 = 201;
							var0.method2393(class174.field1733, 180 + class174.field1724, 201, 16776960, 0);
							var25 = var24 + 20;
							var1.method2393(class174.field1731, class174.field1724 + 180, 221, 16776960, 0);
							var25 += 20;
							var1.method2393(class174.field1732, class174.field1724 + 180, 241, 16776960, 0);
							var25 += 15;
							var26 = class174.field1724 + 180;
							var27 = true;
							class501.field4024.method1292(var26 - 73, 256);
							var2.method2393(class55.field627, var26, 281, 16777215, 0);
							var26 = class174.field1724 + 180;
							var27 = true;
							class501.field4024.method1292(var26 - 73, 306);
							var2.method2393(class55.field612, var26, 331, 16777215, 0);
						}
					}
				}
			}
			if (Client.field982 >= 10) {
				int[] var45 = new int[4];
				class206.method1232(var45);
				class206.method1243(class174.field1718, 0, 765 + class174.field1718, class271.field2226);
				class225.field1989.method1058(class174.field1718 - 22, Client.field1201);
				class225.field1989.method1058(22 + 765 + class174.field1718 - 128, Client.field1201);
				class206.method1252(var45);
			}
			class8.field28[class83.field841.method1020() ? 1 : 0].method1292(765 + class174.field1718 - 40, 463);
			if (Client.field982 > 5 && class267.field2194 == class162.field1645) {
				if (class29.field143 != null) {
					var25 = class174.field1718 + 5;
					var5 = true;
					var27 = true;
					var29 = true;
					class29.field143.method1292(var25, 463);
					var0.method2393(class55.field498 + " " + Client.field898, 50 + var25, 478, 16777215, 0);
					if (null != class532.field4205) {
						var1.method2393(class55.field468, 50 + var25, 492, 16777215, 0);
					} else {
						var1.method2393(class55.field626, 50 + var25, 492, 16777215, 0);
					}
				} else {
					class29.field143 = class494.method2365(class537.field4228, "sl_button", "");
				}
			}
		}
	}
}
