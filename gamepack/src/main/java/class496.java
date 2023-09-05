import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "eh")
final class class496 implements class284 {
	// $FF: synthetic field
	@ObfInfo(name = "val$cc", desc = "Lmi;")
	final class131 val$cc;

	@ObfInfo(name = "<init>", desc = "(Lmi;)V")
	class496(class131 var1) {
		this.val$cc = var1;
	}

	@ObfInfo(name = "au", desc = "(B)V", opaqueValue = "17")
	public void method1569() {
		if (null != this.val$cc && this.val$cc.method738().field3270 != null) {
			class20 var2 = new class20();
			var2.method332(this.val$cc);
			var2.method333(this.val$cc.method738().field3270);
			Client.method140().method631(var2);
		}

	}

	@ObfInfo(name = "ar", desc = "(Lpi;Lpi;Lpi;B)V", opaqueValue = "0")
	static void method2486(class258 var0, class258 var1, class258 var2) {
		class162.field1520 = (class537.field4270 - 765) / 2;
		class162.field1526 = class162.field1520 + 202;
		class254.field2110 = class162.field1526 + 180;
		byte var4;
		int var5;
		int var10;
		boolean var16;
		int var18;
		int var25;
		int var28;
		int var32;
		int var33;
		int var34;
		int var37;
		if (class162.field1545) {
			if (class109.field1021 == null) {
				class109.field1021 = class273.method1426(class429.field3253, "sl_back", "");
			}

			if (null == class293.field2379) {
				class293.field2379 = class273.method1435(class429.field3253, "sl_flags", "");
			}

			if (null == class277.field2245) {
				class277.field2245 = class273.method1435(class429.field3253, "sl_arrows", "");
			}

			if (class256.field2111 == null) {
				class256.field2111 = class273.method1435(class429.field3253, "sl_stars", "");
			}

			if (class447.field3385 == null) {
				class447.field3385 = class273.method1433(class429.field3253, "leftarrow", "");
			}

			if (null == class188.field1714) {
				class188.field1714 = class273.method1433(class429.field3253, "rightarrow", "");
			}

			class83.method542(class162.field1520, 23, 765, 480, 0);
			class83.method543(class162.field1520, 0, 125, 23, 12425273, 9135624);
			class83.method543(class162.field1520 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method1653(class453.field3694, 62 + class162.field1520, 15, 0, -1);
			if (null != class256.field2111) {
				class256.field2111[1].method2115(140 + class162.field1520, 1);
				var1.method1674(class453.field3422, 152 + class162.field1520, 10, 16777215, -1);
				class256.field2111[0].method2115(class162.field1520 + 140, 12);
				var1.method1674(class453.field3480, class162.field1520 + 152, 21, 16777215, -1);
			}

			if (class277.field2245 != null) {
				var25 = class162.field1520 + 280;
				if (class516.field4131[0] == 0 && class516.field4130[0] == 0) {
					class277.field2245[2].method2115(var25, 4);
				} else {
					class277.field2245[0].method2115(var25, 4);
				}

				if (class516.field4131[0] == 0 && class516.field4130[0] == 1) {
					class277.field2245[3].method2115(var25 + 15, 4);
				} else {
					class277.field2245[1].method2115(var25 + 15, 4);
				}

				var0.method1674(class453.field3697, var25 + 32, 17, 16777215, -1);
				var5 = class162.field1520 + 390;
				if (class516.field4131[0] == 1 && class516.field4130[0] == 0) {
					class277.field2245[2].method2115(var5, 4);
				} else {
					class277.field2245[0].method2115(var5, 4);
				}

				if (class516.field4131[0] == 1 && class516.field4130[0] == 1) {
					class277.field2245[3].method2115(var5 + 15, 4);
				} else {
					class277.field2245[1].method2115(var5 + 15, 4);
				}

				var0.method1674(class453.field3698, var5 + 32, 17, 16777215, -1);
				var34 = 500 + class162.field1520;
				if (class516.field4131[0] == 2 && class516.field4130[0] == 0) {
					class277.field2245[2].method2115(var34, 4);
				} else {
					class277.field2245[0].method2115(var34, 4);
				}

				if (class516.field4131[0] == 2 && class516.field4130[0] == 1) {
					class277.field2245[3].method2115(var34 + 15, 4);
				} else {
					class277.field2245[1].method2115(var34 + 15, 4);
				}

				var0.method1674(class453.field3699, var34 + 32, 17, 16777215, -1);
				var28 = 610 + class162.field1520;
				if (class516.field4131[0] == 3 && class516.field4130[0] == 0) {
					class277.field2245[2].method2115(var28, 4);
				} else {
					class277.field2245[0].method2115(var28, 4);
				}

				if (class516.field4131[0] == 3 && class516.field4130[0] == 1) {
					class277.field2245[3].method2115(var28 + 15, 4);
				} else {
					class277.field2245[1].method2115(var28 + 15, 4);
				}

				var0.method1674(class453.field3700, var28 + 32, 17, 16777215, -1);
			}

			class83.method542(708 + class162.field1520, 4, 50, 16, 0);
			var1.method1653(class453.field3640, 25 + 708 + class162.field1520, 16, 16777215, -1);
			class162.field1546 = -1;
			if (class109.field1021 != null) {
				var4 = 88;
				byte var45 = 19;
				var34 = 765 / (var4 + 1) - 1;
				var28 = 480 / (var45 + 1);

				do {
					var32 = var28;
					var33 = var34;
					if (var28 * (var34 - 1) >= class516.field4133) {
						--var34;
					}

					if ((var28 - 1) * var34 >= class516.field4133) {
						--var28;
					}

					if (var34 * (var28 - 1) >= class516.field4133) {
						--var28;
					}
				} while(var32 != var28 || var33 != var34);

				var32 = (765 - var4 * var34) / (var34 + 1);
				if (var32 > 5) {
					var32 = 5;
				}

				var33 = (480 - var45 * var28) / (var28 + 1);
				if (var33 > 5) {
					var33 = 5;
				}

				var10 = (765 - var34 * var4 - (var34 - 1) * var32) / 2;
				int var38 = (480 - var28 * var45 - (var28 - 1) * var33) / 2;
				var37 = (class516.field4133 + var28 - 1) / var28;
				class162.field1552 = var37 - var34;
				if (class447.field3385 != null && class162.field1547 > 0) {
					class447.field3385.method2115(8, class396.field3101 / 2 - class447.field3385.field3106 / 2);
				}

				if (null != class188.field1714 && class162.field1547 < class162.field1552) {
					class188.field1714.method2115(class537.field4270 - class188.field1714.field3105 - 8, class396.field3101 / 2 - class188.field1714.field3106 / 2);
				}

				int var40 = var38 + 23;
				int var14 = class162.field1520 + var10;
				int var43 = 0;
				var16 = false;
				int var44 = class162.field1547;

				for (var18 = var28 * var44; var18 < class516.field4133 && var44 - class162.field1547 < var34; ++var18) {
					class516 var46 = class69.field774[var18];
					boolean var20 = true;
					String var21 = Integer.toString(var46.field4134);
					if (var46.field4134 == -1) {
						var21 = class453.field3701;
						var20 = false;
					} else if (var46.field4134 > 1980) {
						var21 = class453.field3596;
						var20 = false;
					}

					class40 var22 = null;
					int var23 = 0;
					if (var46.method2525()) {
						var22 = var46.method2518() ? class40.field515 : class40.field525;
					} else if (var46.method2519()) {
						var22 = var46.method2518() ? class40.field524 : class40.field517;
					} else if (var46.method2522()) {
						var23 = 16711680;
						var22 = var46.method2518() ? class40.field514 : class40.field509;
					} else if (var46.method2523()) {
						var22 = var46.method2518() ? class40.field513 : class40.field518;
					} else if (var46.method2528()) {
						var22 = var46.method2518() ? class40.field512 : class40.field516;
					} else if (var46.method2527()) {
						var22 = var46.method2518() ? class40.field520 : class40.field519;
					} else if (var46.method2524()) {
						var22 = var46.method2518() ? class40.field522 : class40.field521;
					}

					if (var22 == null || var22.field523 >= class109.field1021.length) {
						var22 = var46.method2518() ? class40.field510 : class40.field511;
					}

					if (class166.field1580 >= var14 && class166.field1563 >= var40 && class166.field1580 < var14 + var4 && class166.field1563 < var40 + var45 && var20) {
						class162.field1546 = var18;
						class109.field1021[var22.field523].method861(var14, var40, 128, 16777215);
						var16 = true;
					} else {
						class109.field1021[var22.field523].method857(var14, var40);
					}

					if (class293.field2379 != null) {
						class293.field2379[(var46.method2518() ? 8 : 0) + var46.field4137].method2115(var14 + 29, var40);
					}

					var0.method1653(Integer.toString(var46.field4132), var14 + 15, 5 + var40 + var45 / 2, var23, -1);
					var1.method1653(var21, var14 + 60, 5 + var45 / 2 + var40, 268435455, -1);
					var40 += var45 + var33;
					++var43;
					if (var43 >= var28) {
						var40 = var38 + 23;
						var14 += var4 + var32;
						var43 = 0;
						++var44;
					}
				}

				if (var16) {
					var18 = var1.method1646(class69.field774[class162.field1546].field4136) + 6;
					int var47 = var1.field2414 + 8;
					int var48 = class166.field1563 + 25;
					if (var47 + var48 > 480) {
						var48 = class166.field1563 - 25 - var47;
					}

					class83.method542(class166.field1580 - var18 / 2, var48, var18, var47, 16777120);
					class83.method545(class166.field1580 - var18 / 2, var48, var18, var47, 0);
					var1.method1653(class69.field774[class162.field1546].field4136, class166.field1580, var48 + var1.field2414 + 4, 0, -1);
				}
			}

		} else {
			class162.field1524.method857(class162.field1520, 0);
			class238.field1988.method857(class162.field1520 + 382, 0);
			class279.field2250.method2115(382 + class162.field1520 - class279.field2250.field3105 / 2, 18);
			if (Client.field111 == 0 || Client.field111 == 5) {
				var4 = 20;
				var0.method1653(class453.field3587, class162.field1526 + 180, 245 - var4, 16777215, -1);
				var5 = 253 - var4;
				class83.method545(180 + class162.field1526 - 152, var5, 304, 34, 9179409);
				class83.method545(180 + class162.field1526 - 151, var5 + 1, 302, 32, 0);
				class83.method542(180 + class162.field1526 - 150, var5 + 2, class162.field1527 * 3, 30, 9179409);
				class83.method542(180 + class162.field1526 - 150 + class162.field1527 * 3, var5 + 2, 300 - class162.field1527 * 3, 30, 0);
				var0.method1653(class162.field1528, 180 + class162.field1526, 276 - var4, 16777215, -1);
			}

			String var6;
			String var7;
			String var8;
			String var9;
			short var24;
			short var26;
			if (Client.field111 == 20) {
				class162.field1522.method2115(180 + class162.field1526 - class162.field1522.field3105 / 2, 271 - class162.field1522.field3106 / 2);
				var24 = 201;
				var0.method1653(class162.field1535, 180 + class162.field1526, var24, 16776960, 0);
				var25 = var24 + 15;
				var0.method1653(class162.field1533, 180 + class162.field1526, var25, 16776960, 0);
				var25 += 15;
				var0.method1653(class162.field1534, 180 + class162.field1526, var25, 16776960, 0);
				var25 += 15;
				var25 += 7;
				if (class162.field1531 != 4 && class162.field1531 != 10) {
					var0.method1674(class453.field3633, 180 + class162.field1526 - 110, var25, 16777215, 0);
					var26 = 200;

					for (var6 = class162.method931(); var0.method1646(var6) > var26; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.method1674(class300.method1659(var6), class162.field1526 + 180 - 70, var25, 16777215, 0);
					var25 += 15;
					var8 = class162.field1537;
					var7 = class455.method2380('*', var8.length());

					for (var9 = var7; var0.method1646(var9) > var26; var9 = var9.substring(1)) {
					}

					var0.method1674(class453.field3634 + var9, 180 + class162.field1526 - 108, var25, 16777215, 0);
					var25 += 15;
				}
			}

			if (Client.field111 == 10 || Client.field111 == 11 || Client.field111 == 50) {
				class162.field1522.method2115(class162.field1526, 171);
				short var27;
				if (class162.field1531 == 0) {
					var24 = 251;
					var0.method1653(class453.field3678, 180 + class162.field1526, var24, 16776960, 0);
					var25 = var24 + 30;
					var5 = class162.field1526 + 180 - 80;
					var27 = 291;
					class51.field586.method2115(var5 - 73, var27 - 20);
					var0.method1645(class453.field3637, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 80 + class162.field1526 + 180;
					class51.field586.method2115(var5 - 73, var27 - 20);
					var0.method1645(class453.field3638, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (class162.field1531 == 1) {
					var0.method1653(class162.field1553, class162.field1526 + 180, 201, 16776960, 0);
					var24 = 236;
					var0.method1653(class162.field1535, 180 + class162.field1526, var24, 16777215, 0);
					var25 = var24 + 15;
					var0.method1653(class162.field1533, 180 + class162.field1526, var25, 16777215, 0);
					var25 += 15;
					var0.method1653(class162.field1534, class162.field1526 + 180, var25, 16777215, 0);
					var25 += 15;
					var5 = class162.field1526 + 180 - 80;
					var27 = 321;
					class51.field586.method2115(var5 - 73, var27 - 20);
					var0.method1653(class453.field3403, var5, var27 + 5, 16777215, 0);
					var5 = 80 + 180 + class162.field1526;
					class51.field586.method2115(var5 - 73, var27 - 20);
					var0.method1653(class453.field3640, var5, var27 + 5, 16777215, 0);
				} else {
					class398 var11;
					if (class162.field1531 == 2) {
						var24 = 201;
						var0.method1653(class162.field1535, class254.field2110, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method1653(class162.field1533, class254.field2110, var25, 16776960, 0);
						var25 += 15;
						var0.method1653(class162.field1534, class254.field2110, var25, 16776960, 0);
						var25 += 15;
						var25 += 7;
						var0.method1674(class453.field3633, class254.field2110 - 110, var25, 16777215, 0);
						var26 = 200;

						for (var6 = class162.method931(); var0.method1646(var6) > var26; var6 = var6.substring(1)) {
						}

						var0.method1674(class300.method1659(var6) + (class162.field1542 == 0 & Client.field330 % 40 < 20 ? class479.method2443(16776960) + class479.field3822 : ""), class254.field2110 - 70, var25, 16777215, 0);
						var25 += 15;
						var8 = class162.field1537;
						var7 = class455.method2380('*', var8.length());

						for (var9 = var7; var0.method1646(var9) > var26; var9 = var9.substring(1)) {
						}

						var0.method1674(class453.field3634 + var9 + (class162.field1542 == 1 & Client.field330 % 40 < 20 ? class479.method2443(16776960) + class479.field3822 : ""), class254.field2110 - 108, var25, 16777215, 0);
						var25 += 15;
						var24 = 277;
						var10 = -117 + class254.field2110;
						boolean var12 = Client.field81;
						boolean var13 = class162.field1525;
						var11 = var12 ? (var13 ? class263.field2125 : class107.field1020) : (var13 ? class79.field833 : class162.field1519);
						var11.method2115(var10, var24);
						var10 += var11.field3105 + 5;
						var1.method1674(class453.field3641, var10, var24 + 13, 16776960, 0);
						var10 = 24 + class254.field2110;
						var16 = class281.field2262.method1749();
						boolean var17 = class162.field1548;
						class398 var15 = var16 ? (var17 ? class263.field2125 : class107.field1020) : (var17 ? class79.field833 : class162.field1519);
						var15.method2115(var10, var24);
						var10 += var15.field3105 + 5;
						var1.method1674(class453.field3595, var10, var24 + 13, 16776960, 0);
						var25 = var24 + 15;
						var18 = class254.field2110 - 80;
						short var19 = 321;
						class51.field586.method2115(var18 - 73, var19 - 20);
						var0.method1653(class453.field3594, var18, var19 + 5, 16777215, 0);
						var18 = 80 + class254.field2110;
						class51.field586.method2115(var18 - 73, var19 - 20);
						var0.method1653(class453.field3640, var18, var19 + 5, 16777215, 0);
						var24 = 357;
						switch(class162.field1530) {
						case 2:
							class111.field1027 = class453.field3654;
							break;
						default:
							class111.field1027 = class453.field3605;
						}

						class522.field4185 = new class238(class254.field2110, var24, var1.method1646(class111.field1027), 11);
						class534.field4252 = new class238(class254.field2110, var24, var1.method1646(class453.field3653), 11);
						var1.method1653(class111.field1027, class254.field2110, var24, 16777215, 0);
					} else if (class162.field1531 == 3) {
						var24 = 201;
						var0.method1653(class453.field3648, 180 + class162.field1526, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method1653(class453.field3460, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 20;
						var1.method1653(class453.field3645, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 15;
						var5 = class162.field1526 + 180;
						var27 = 276;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var2.method1653(class453.field3646, var5, var27 + 5, 16777215, 0);
						var5 = class162.field1526 + 180;
						var27 = 326;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var2.method1653(class453.field3647, var5, var27 + 5, 16777215, 0);
					} else if (class162.field1531 == 4) {
						var0.method1653(class453.field3623, 180 + class162.field1526, 201, 16776960, 0);
						var24 = 236;
						var0.method1653(class162.field1535, 180 + class162.field1526, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method1653(class162.field1533, 180 + class162.field1526, var25, 16777215, 0);
						var25 += 15;
						var0.method1653(class162.field1534, class162.field1526 + 180, var25, 16777215, 0);
						var25 += 15;
						var6 = class453.field3635;
						var8 = class379.field2919;
						var7 = class455.method2380('*', var8.length());
						var0.method1674(var6 + var7 + (Client.field330 % 40 < 20 ? class479.method2443(16776960) + class479.field3822 : ""), class162.field1526 + 180 - 108, var25, 16777215, 0);
						var25 -= 8;
						var0.method1674(class453.field3406, class162.field1526 + 180 - 9, var25, 16776960, 0);
						var25 += 15;
						var0.method1674(class453.field3523, 180 + class162.field1526 - 9, var25, 16776960, 0);
						var33 = class162.field1526 + 180 - 9 + var0.method1646(class453.field3523) + 15;
						var10 = var25 - var0.field2414;
						if (class162.field1541) {
							var11 = class107.field1020;
						} else {
							var11 = class162.field1519;
						}

						var11.method2115(var33, var10);
						var25 += 15;
						var37 = class162.field1526 + 180 - 80;
						short var39 = 321;
						class51.field586.method2115(var37 - 73, var39 - 20);
						var0.method1653(class453.field3403, var37, var39 + 5, 16777215, 0);
						var37 = 80 + 180 + class162.field1526;
						class51.field586.method2115(var37 - 73, var39 - 20);
						var0.method1653(class453.field3640, var37, var39 + 5, 16777215, 0);
						var1.method1653(class453.field3605, class162.field1526 + 180, var39 + 36, 16777215, 0);
					} else if (class162.field1531 == 5) {
						var0.method1653(class453.field3597, 180 + class162.field1526, 201, 16776960, 0);
						var24 = 221;
						var2.method1653(class162.field1535, class162.field1526 + 180, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1653(class162.field1533, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 15;
						var2.method1653(class162.field1534, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 15;
						var25 += 14;
						var0.method1674(class453.field3519, class162.field1526 + 180 - 145, var25, 16777215, 0);
						var26 = 174;

						for (var6 = class162.method931(); var0.method1646(var6) > var26; var6 = var6.substring(1)) {
						}

						var0.method1674(class300.method1659(var6) + (Client.field330 % 40 < 20 ? class479.method2443(16776960) + class479.field3822 : ""), 180 + class162.field1526 - 34, var25, 16777215, 0);
						var25 += 15;
						var28 = 180 + class162.field1526 - 80;
						short var30 = 321;
						class51.field586.method2115(var28 - 73, var30 - 20);
						var0.method1653(class453.field3650, var28, var30 + 5, 16777215, 0);
						var28 = 80 + 180 + class162.field1526;
						class51.field586.method2115(var28 - 73, var30 - 20);
						var0.method1653(class453.field3690, var28, var30 + 5, 16777215, 0);
						var30 = 356;
						var1.method1653(class453.field3653, class254.field2110, var30, 268435455, 0);
					} else if (class162.field1531 == 6) {
						var24 = 201;
						var0.method1653(class162.field1535, 180 + class162.field1526, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method1653(class162.field1533, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 15;
						var0.method1653(class162.field1534, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + class162.field1526;
						var27 = 321;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3690, var5, var27 + 5, 16777215, 0);
					} else if (class162.field1531 == 7) {
						if (class515.field4125 && !Client.field262) {
							var24 = 201;
							var0.method1653(class162.field1535, class254.field2110, var24, 16776960, 0);
							var25 = var24 + 15;
							var0.method1653(class162.field1533, class254.field2110, var25, 16776960, 0);
							var25 += 15;
							var0.method1653(class162.field1534, class254.field2110, var25, 16776960, 0);
							var5 = class254.field2110 - 150;
							var25 += 10;

							for (var34 = 0; var34 < 8; ++var34) {
								class51.field586.method2114(var5, var25, 30, 40);
								boolean var29 = class162.field1536 == var34 & Client.field330 % 40 < 20;
								var0.method1674((class162.field1539[var34] == null ? "" : class162.field1539[var34]) + (var29 ? class479.method2443(16776960) + class479.field3822 : ""), var5 + 10, var25 + 27, 16777215, 0);
								if (var34 != 1 && var34 != 3) {
									var5 += 35;
								} else {
									var5 += 50;
									var0.method1674(class300.method1659("/"), var5 - 13, var25 + 27, 16777215, 0);
								}
							}

							var34 = class254.field2110 - 80;
							short var31 = 321;
							class51.field586.method2115(var34 - 73, var31 - 20);
							var0.method1653("Submit", var34, var31 + 5, 16777215, 0);
							var34 = class254.field2110 + 80;
							class51.field586.method2115(var34 - 73, var31 - 20);
							var0.method1653(class453.field3640, var34, var31 + 5, 16777215, 0);
						} else {
							var24 = 216;
							var0.method1653(class453.field3675, 180 + class162.field1526, var24, 16776960, 0);
							var25 = var24 + 15;
							var2.method1653(class453.field3680, class162.field1526 + 180, var25, 16776960, 0);
							var25 += 15;
							var2.method1653(class453.field3681, class162.field1526 + 180, var25, 16776960, 0);
							var25 += 15;
							var5 = class162.field1526 + 180 - 80;
							var27 = 321;
							class51.field586.method2115(var5 - 73, var27 - 20);
							var0.method1653(class453.field3682, var5, var27 + 5, 16777215, 0);
							var5 = 180 + class162.field1526 + 80;
							class51.field586.method2115(var5 - 73, var27 - 20);
							var0.method1653(class453.field3690, var5, var27 + 5, 16777215, 0);
						}
					} else if (class162.field1531 == 8) {
						var24 = 216;
						var0.method1653(class453.field3536, 180 + class162.field1526, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1653(class453.field3578, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 15;
						var2.method1653(class453.field3547, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + class162.field1526 - 80;
						var27 = 321;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3651, var5, var27 + 5, 16777215, 0);
						var5 = 80 + class162.field1526 + 180;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3690, var5, var27 + 5, 16777215, 0);
					} else if (class162.field1531 == 9) {
						var24 = 221;
						var0.method1653(class162.field1535, class162.field1526 + 180, var24, 16776960, 0);
						var25 = var24 + 25;
						var0.method1653(class162.field1533, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 25;
						var0.method1653(class162.field1534, 180 + class162.field1526, var25, 16776960, 0);
						var5 = 180 + class162.field1526;
						var27 = 311;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3646, var5, var27 + 5, 16777215, 0);
					} else if (class162.field1531 == 10) {
						var25 = class162.field1526 + 180;
						var26 = 209;
						var0.method1653(class453.field3678, class162.field1526 + 180, var26, 16776960, 0);
						var5 = var26 + 20;
						class162.field1523.method2115(var25 - 109, var5);
						if (class162.field1538.isEmpty()) {
							class23.field408.method2115(var25 - 48, var5 + 18);
						} else {
							class23.field408.method2115(var25 - 48, var5 + 5);
							var0.method1653(class162.field1538, var25, var5 + 68 - 15, 16776960, 0);
						}
					} else if (class162.field1531 == 12) {
						var25 = class254.field2110;
						var26 = 216;
						var2.method1653(class453.field3686, var25, var26, 16777215, 0);
						var5 = var26 + 17;
						var2.method1653(class453.field3687, var25, var5, 16777215, 0);
						var5 += 17;
						var2.method1653(class453.field3688, var25, var5, 16777215, 0);
						var5 += 17;
						var2.method1653(class453.field3689, var25, var5, 16777215, 0);
						var25 = class254.field2110 - 80;
						var26 = 311;
						class51.field586.method2115(var25 - 73, var26 - 20);
						var0.method1653(class453.field3508, var25, var26 + 5, 16777215, 0);
						var25 = class254.field2110 + 80;
						class51.field586.method2115(var25 - 73, var26 - 20);
						var0.method1653(class453.field3693, var25, var26 + 5, 16777215, 0);
					} else if (class162.field1531 == 13) {
						var24 = 231;
						var2.method1653(class453.field3453, 180 + class162.field1526, var24, 16777215, 0);
						var25 = var24 + 20;
						var2.method1653(class453.field3691, 180 + class162.field1526, var25, 16777215, 0);
						var5 = class162.field1526 + 180;
						var24 = 311;
						class51.field586.method2115(var5 - 73, var24 - 20);
						var0.method1653(class453.field3690, var5, var24 + 5, 16777215, 0);
					} else if (class162.field1531 == 14) {
						var24 = 201;
						String var41 = "";
						var6 = "";
						var7 = "";
						switch(class162.field1529) {
						case 0:
							var41 = class453.field3502;
							var6 = class453.field3442;
							var7 = class453.field3454;
							break;
						case 1:
							var41 = class453.field3491;
							var6 = class453.field3492;
							var7 = class453.field3493;
							break;
						case 2:
							var41 = class453.field3487;
							var6 = class453.field3495;
							var7 = class453.field3529;
							break;
						default:
							class85.method564(false);
						}

						var0.method1653(var41, 180 + class162.field1526, var24, 16776960, 0);
						var25 = var24 + 20;
						var0.method1653(var6, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 20;
						var0.method1653(var7, 180 + class162.field1526, var25, 16776960, 0);
						var32 = class162.field1526 + 180;
						short var35 = 276;
						class51.field586.method2115(var32 - 73, var35 - 20);
						if (class162.field1529 == 1) {
							var0.method1653(class453.field3436, var32, var35 + 5, 16777215, 0);
						} else {
							var0.method1653(class453.field3513, var32, var35 + 5, 16777215, 0);
						}

						var32 = class162.field1526 + 180;
						var35 = 326;
						class51.field586.method2115(var32 - 73, var35 - 20);
						var0.method1653(class453.field3690, var32, var35 + 5, 16777215, 0);
					} else if (class162.field1531 == 24) {
						var24 = 221;
						var0.method1653(class162.field1535, class162.field1526 + 180, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method1653(class162.field1533, 180 + class162.field1526, var25, 16777215, 0);
						var25 += 15;
						var0.method1653(class162.field1534, class162.field1526 + 180, var25, 16777215, 0);
						var25 += 15;
						var5 = class162.field1526 + 180;
						var27 = 301;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3401, var5, var27 + 5, 16777215, 0);
					} else if (class162.field1531 == 32) {
						var24 = 216;
						var0.method1653(class453.field3675, 180 + class162.field1526, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1653(class453.field3680, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 15;
						var2.method1653(class453.field3681, 180 + class162.field1526, var25, 16776960, 0);
						var25 += 15;
						var5 = class162.field1526 + 180 - 80;
						var27 = 321;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3682, var5, var27 + 5, 16777215, 0);
						var5 = 180 + class162.field1526 + 80;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var0.method1653(class453.field3690, var5, var27 + 5, 16777215, 0);
					} else if (class162.field1531 == 33) {
						var24 = 201;
						var0.method1653(class162.field1535, 180 + class162.field1526, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method1653(class162.field1533, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 20;
						var1.method1653(class162.field1534, class162.field1526 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = class162.field1526 + 180;
						var27 = 276;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var2.method1653(class453.field3705, var5, var27 + 5, 16777215, 0);
						var5 = class162.field1526 + 180;
						var27 = 326;
						class51.field586.method2115(var5 - 73, var27 - 20);
						var2.method1653(class453.field3690, var5, var27 + 5, 16777215, 0);
					}
				}
			}

			if (Client.field111 >= 10) {
				int[] var49 = new int[4];
				class83.method538(var49);
				class83.method549(class162.field1520, 0, 765 + class162.field1520, class396.field3101);
				class365.field2837.method1381(class162.field1520 - 22, Client.field330);
				class365.field2837.method1381(22 + 765 + class162.field1520 - 128, Client.field330);
				class83.method558(var49);
			}

			class161.field1518[class281.field2262.method1765() ? 1 : 0].method2115(765 + class162.field1520 - 40, 463);
			if (Client.field111 > 5 && class67.field765 == class524.field4196) {
				if (class26.field421 != null) {
					var25 = class162.field1520 + 5;
					var26 = 463;
					byte var42 = 100;
					byte var36 = 35;
					class26.field421.method2115(var25, var26);
					var0.method1653(class453.field3576 + " " + Client.field27, var42 / 2 + var25, var36 / 2 + var26 - 2, 16777215, 0);
					if (null != class383.field2948) {
						var1.method1653(class453.field3546, var42 / 2 + var25, var26 + var36 / 2 + 12, 16777215, 0);
					} else {
						var1.method1653(class453.field3704, var42 / 2 + var25, 12 + var36 / 2 + var26, 16777215, 0);
					}
				} else {
					class26.field421 = class273.method1433(class429.field3253, "sl_button", "");
				}
			}

		}
	}
}
