final class class535 implements class65 {
	// $FF: synthetic field
	final class60 val$cc;

	class535(class60 var1) {
		this.val$cc = var1;
	}

	public void method486() {
		if (null != this.val$cc && this.val$cc.method459().field1045 != null) {
			class309 var2 = new class309();
			var2.method1742(this.val$cc);
			var2.method1743(this.val$cc.method459().field1045);
			class289.method1659().method567(var2);
		}

	}

	static void method2574(class253 var0, class253 var1, class253 var2) {
		class116.field1086 = (class237.field2181 - 765) / 2;
		class116.field1092 = class116.field1086 + 202;
		class315.field2826 = class116.field1092 + 180;
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
		if (class116.field1111) {
			if (class487.field4107 == null) {
				class487.field4107 = class4.method49(class337.field2945, "sl_back", "");
			}

			if (null == class203.field1907) {
				class203.field1907 = class466.method2281(class337.field2945, "sl_flags", "");
			}

			if (null == class354.field3032) {
				class354.field3032 = class466.method2281(class337.field2945, "sl_arrows", "");
			}

			if (class324.field2899 == null) {
				class324.field2899 = class466.method2281(class337.field2945, "sl_stars", "");
			}

			if (class122.field1135 == null) {
				class122.field1135 = class439.method2208(class337.field2945, "leftarrow", "");
			}

			if (null == class43.field534) {
				class43.field534 = class439.method2208(class337.field2945, "rightarrow", "");
			}

			class266.method1548(class116.field1086, 23, 765, 480, 0);
			class266.method1549(class116.field1086, 0, 125, 23, 12425273, 9135624);
			class266.method1549(class116.field1086 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method1299(class433.field3837, 62 + class116.field1086, 15, 0, -1);
			if (null != class324.field2899) {
				class324.field2899[1].method207(140 + class116.field1086, 1);
				var1.method1320(class433.field3565, 152 + class116.field1086, 10, 16777215, -1);
				class324.field2899[0].method207(class116.field1086 + 140, 12);
				var1.method1320(class433.field3623, class116.field1086 + 152, 21, 16777215, -1);
			}

			if (class354.field3032 != null) {
				var25 = class116.field1086 + 280;
				if (class12.field367[0] == 0 && class12.field366[0] == 0) {
					class354.field3032[2].method207(var25, 4);
				} else {
					class354.field3032[0].method207(var25, 4);
				}

				if (class12.field367[0] == 0 && class12.field366[0] == 1) {
					class354.field3032[3].method207(var25 + 15, 4);
				} else {
					class354.field3032[1].method207(var25 + 15, 4);
				}

				var0.method1320(class433.field3840, var25 + 32, 17, 16777215, -1);
				var5 = class116.field1086 + 390;
				if (class12.field367[0] == 1 && class12.field366[0] == 0) {
					class354.field3032[2].method207(var5, 4);
				} else {
					class354.field3032[0].method207(var5, 4);
				}

				if (class12.field367[0] == 1 && class12.field366[0] == 1) {
					class354.field3032[3].method207(var5 + 15, 4);
				} else {
					class354.field3032[1].method207(var5 + 15, 4);
				}

				var0.method1320(class433.field3841, var5 + 32, 17, 16777215, -1);
				var34 = 500 + class116.field1086;
				if (class12.field367[0] == 2 && class12.field366[0] == 0) {
					class354.field3032[2].method207(var34, 4);
				} else {
					class354.field3032[0].method207(var34, 4);
				}

				if (class12.field367[0] == 2 && class12.field366[0] == 1) {
					class354.field3032[3].method207(var34 + 15, 4);
				} else {
					class354.field3032[1].method207(var34 + 15, 4);
				}

				var0.method1320(class433.field3842, var34 + 32, 17, 16777215, -1);
				var28 = 610 + class116.field1086;
				if (class12.field367[0] == 3 && class12.field366[0] == 0) {
					class354.field3032[2].method207(var28, 4);
				} else {
					class354.field3032[0].method207(var28, 4);
				}

				if (class12.field367[0] == 3 && class12.field366[0] == 1) {
					class354.field3032[3].method207(var28 + 15, 4);
				} else {
					class354.field3032[1].method207(var28 + 15, 4);
				}

				var0.method1320(class433.field3843, var28 + 32, 17, 16777215, -1);
			}

			class266.method1548(708 + class116.field1086, 4, 50, 16, 0);
			var1.method1299(class433.field3783, 25 + 708 + class116.field1086, 16, 16777215, -1);
			class116.field1112 = -1;
			if (class487.field4107 != null) {
				var4 = 88;
				byte var45 = 19;
				var34 = 765 / (var4 + 1) - 1;
				var28 = 480 / (var45 + 1);

				do {
					var32 = var28;
					var33 = var34;
					if (var28 * (var34 - 1) >= class12.field369) {
						--var34;
					}

					if ((var28 - 1) * var34 >= class12.field369) {
						--var28;
					}

					if (var34 * (var28 - 1) >= class12.field369) {
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
				var37 = (class12.field369 + var28 - 1) / var28;
				class116.field1118 = var37 - var34;
				if (class122.field1135 != null && class116.field1113 > 0) {
					class122.field1135.method207(8, class5.field322 / 2 - class122.field1135.field451 / 2);
				}

				if (null != class43.field534 && class116.field1113 < class116.field1118) {
					class43.field534.method207(class237.field2181 - class43.field534.field450 - 8, class5.field322 / 2 - class43.field534.field451 / 2);
				}

				int var40 = var38 + 23;
				int var14 = class116.field1086 + var10;
				int var43 = 0;
				var16 = false;
				int var44 = class116.field1113;

				for (var18 = var28 * var44; var18 < class12.field369 && var44 - class116.field1113 < var34; ++var18) {
					class12 var46 = class225.field2044[var18];
					boolean var20 = true;
					String var21 = Integer.toString(var46.field370);
					if (var46.field370 == -1) {
						var21 = class433.field3844;
						var20 = false;
					} else if (var46.field370 > 1980) {
						var21 = class433.field3739;
						var20 = false;
					}

					class251 var22 = null;
					int var23 = 0;
					if (var46.method115()) {
						var22 = var46.method108() ? class251.field2341 : class251.field2351;
					} else if (var46.method109()) {
						var22 = var46.method108() ? class251.field2350 : class251.field2343;
					} else if (var46.method112()) {
						var23 = 16711680;
						var22 = var46.method108() ? class251.field2340 : class251.field2335;
					} else if (var46.method113()) {
						var22 = var46.method108() ? class251.field2339 : class251.field2344;
					} else if (var46.method119()) {
						var22 = var46.method108() ? class251.field2338 : class251.field2342;
					} else if (var46.method118()) {
						var22 = var46.method108() ? class251.field2346 : class251.field2345;
					} else if (var46.method114()) {
						var22 = var46.method108() ? class251.field2348 : class251.field2347;
					}

					if (var22 == null || var22.field2349 >= class487.field4107.length) {
						var22 = var46.method108() ? class251.field2336 : class251.field2337;
					}

					if (class184.field1745 >= var14 && class184.field1728 >= var40 && class184.field1745 < var14 + var4 && class184.field1728 < var40 + var45 && var20) {
						class116.field1112 = var18;
						class487.field4107[var22.field2349].method716(var14, var40, 128, 16777215);
						var16 = true;
					} else {
						class487.field4107[var22.field2349].method712(var14, var40);
					}

					if (class203.field1907 != null) {
						class203.field1907[(var46.method108() ? 8 : 0) + var46.field373].method207(var14 + 29, var40);
					}

					var0.method1299(Integer.toString(var46.field368), var14 + 15, 5 + var40 + var45 / 2, var23, -1);
					var1.method1299(var21, var14 + 60, 5 + var45 / 2 + var40, 268435455, -1);
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
					var18 = var1.method1292(class225.field2044[class116.field1112].field372) + 6;
					int var47 = var1.field2066 + 8;
					int var48 = class184.field1728 + 25;
					if (var47 + var48 > 480) {
						var48 = class184.field1728 - 25 - var47;
					}

					class266.method1548(class184.field1745 - var18 / 2, var48, var18, var47, 16777120);
					class266.method1551(class184.field1745 - var18 / 2, var48, var18, var47, 0);
					var1.method1299(class225.field2044[class116.field1112].field372, class184.field1745, var48 + var1.field2066 + 4, 0, -1);
				}
			}

		} else {
			class116.field1090.method712(class116.field1086, 0);
			class169.field1646.method712(class116.field1086 + 382, 0);
			class474.field4030.method207(382 + class116.field1086 - class474.field4030.field450 / 2, 18);
			if (Client.field87 == 0 || Client.field87 == 5) {
				var4 = 20;
				var0.method1299(class433.field3730, class116.field1092 + 180, 245 - var4, 16777215, -1);
				var5 = 253 - var4;
				class266.method1551(180 + class116.field1092 - 152, var5, 304, 34, 9179409);
				class266.method1551(180 + class116.field1092 - 151, var5 + 1, 302, 32, 0);
				class266.method1548(180 + class116.field1092 - 150, var5 + 2, class116.field1093 * 3, 30, 9179409);
				class266.method1548(180 + class116.field1092 - 150 + class116.field1093 * 3, var5 + 2, 300 - class116.field1093 * 3, 30, 0);
				var0.method1299(class116.field1094, 180 + class116.field1092, 276 - var4, 16777215, -1);
			}

			String var6;
			String var7;
			String var8;
			String var9;
			short var24;
			short var26;
			if (Client.field87 == 20) {
				class116.field1088.method207(180 + class116.field1092 - class116.field1088.field450 / 2, 271 - class116.field1088.field451 / 2);
				var24 = 201;
				var0.method1299(class116.field1101, 180 + class116.field1092, var24, 16776960, 0);
				var25 = var24 + 15;
				var0.method1299(class116.field1099, 180 + class116.field1092, var25, 16776960, 0);
				var25 += 15;
				var0.method1299(class116.field1100, 180 + class116.field1092, var25, 16776960, 0);
				var25 += 15;
				var25 += 7;
				if (class116.field1097 != 4 && class116.field1097 != 10) {
					var0.method1320(class433.field3776, 180 + class116.field1092 - 110, var25, 16777215, 0);
					var26 = 200;

					for (var6 = class37.method247(); var0.method1292(var6) > var26; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.method1320(class228.method1305(var6), class116.field1092 + 180 - 70, var25, 16777215, 0);
					var25 += 15;
					var8 = class116.field1103;
					var7 = class295.method1679('*', var8.length());

					for (var9 = var7; var0.method1292(var9) > var26; var9 = var9.substring(1)) {
					}

					var0.method1320(class433.field3777 + var9, 180 + class116.field1092 - 108, var25, 16777215, 0);
					var25 += 15;
				}
			}

			if (Client.field87 == 10 || Client.field87 == 11 || Client.field87 == 50) {
				class116.field1088.method207(class116.field1092, 171);
				short var27;
				if (class116.field1097 == 0) {
					var24 = 251;
					var0.method1299(class433.field3821, 180 + class116.field1092, var24, 16776960, 0);
					var25 = var24 + 30;
					var5 = class116.field1092 + 180 - 80;
					var27 = 291;
					class466.field4000.method207(var5 - 73, var27 - 20);
					var0.method1291(class433.field3780, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 80 + class116.field1092 + 180;
					class466.field4000.method207(var5 - 73, var27 - 20);
					var0.method1291(class433.field3781, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (class116.field1097 == 1) {
					var0.method1299(class116.field1119, class116.field1092 + 180, 201, 16776960, 0);
					var24 = 236;
					var0.method1299(class116.field1101, 180 + class116.field1092, var24, 16777215, 0);
					var25 = var24 + 15;
					var0.method1299(class116.field1099, 180 + class116.field1092, var25, 16777215, 0);
					var25 += 15;
					var0.method1299(class116.field1100, class116.field1092 + 180, var25, 16777215, 0);
					var25 += 15;
					var5 = class116.field1092 + 180 - 80;
					var27 = 321;
					class466.field4000.method207(var5 - 73, var27 - 20);
					var0.method1299(class433.field3546, var5, var27 + 5, 16777215, 0);
					var5 = 80 + 180 + class116.field1092;
					class466.field4000.method207(var5 - 73, var27 - 20);
					var0.method1299(class433.field3783, var5, var27 + 5, 16777215, 0);
				} else {
					class25 var11;
					if (class116.field1097 == 2) {
						var24 = 201;
						var0.method1299(class116.field1101, class315.field2826, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method1299(class116.field1099, class315.field2826, var25, 16776960, 0);
						var25 += 15;
						var0.method1299(class116.field1100, class315.field2826, var25, 16776960, 0);
						var25 += 15;
						var25 += 7;
						var0.method1320(class433.field3776, class315.field2826 - 110, var25, 16777215, 0);
						var26 = 200;

						for (var6 = class37.method247(); var0.method1292(var6) > var26; var6 = var6.substring(1)) {
						}

						var0.method1320(class228.method1305(var6) + (class116.field1108 == 0 & Client.field306 % 40 < 20 ? class394.method2064(16776960) + class278.field2466 : ""), class315.field2826 - 70, var25, 16777215, 0);
						var25 += 15;
						var8 = class116.field1103;
						var7 = class295.method1679('*', var8.length());

						for (var9 = var7; var0.method1292(var9) > var26; var9 = var9.substring(1)) {
						}

						var0.method1320(class433.field3777 + var9 + (class116.field1108 == 1 & Client.field306 % 40 < 20 ? class394.method2064(16776960) + class278.field2466 : ""), class315.field2826 - 108, var25, 16777215, 0);
						var25 += 15;
						var24 = 277;
						var10 = -117 + class315.field2826;
						boolean var12 = Client.field57;
						boolean var13 = class116.field1091;
						var11 = var12 ? (var13 ? class334.field2929 : class73.field821) : (var13 ? class341.field2959 : class116.field1085);
						var11.method207(var10, var24);
						var10 += var11.field450 + 5;
						var1.method1320(class433.field3784, var10, var24 + 13, 16776960, 0);
						var10 = 24 + class315.field2826;
						var16 = class176.field1701.method2491();
						boolean var17 = class116.field1114;
						class25 var15 = var16 ? (var17 ? class334.field2929 : class73.field821) : (var17 ? class341.field2959 : class116.field1085);
						var15.method207(var10, var24);
						var10 += var15.field450 + 5;
						var1.method1320(class433.field3738, var10, var24 + 13, 16776960, 0);
						var25 = var24 + 15;
						var18 = class315.field2826 - 80;
						short var19 = 321;
						class466.field4000.method207(var18 - 73, var19 - 20);
						var0.method1299(class433.field3737, var18, var19 + 5, 16777215, 0);
						var18 = 80 + class315.field2826;
						class466.field4000.method207(var18 - 73, var19 - 20);
						var0.method1299(class433.field3783, var18, var19 + 5, 16777215, 0);
						var24 = 357;
						switch(class116.field1096) {
						case 2:
							class489.field4119 = class433.field3797;
							break;
						default:
							class489.field4119 = class433.field3748;
						}

						class434.field3851 = new class169(class315.field2826, var24, var1.method1292(class489.field4119), 11);
						class150.field1402 = new class169(class315.field2826, var24, var1.method1292(class433.field3796), 11);
						var1.method1299(class489.field4119, class315.field2826, var24, 16777215, 0);
					} else if (class116.field1097 == 3) {
						var24 = 201;
						var0.method1299(class433.field3791, 180 + class116.field1092, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method1299(class433.field3603, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 20;
						var1.method1299(class433.field3788, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 15;
						var5 = class116.field1092 + 180;
						var27 = 276;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var2.method1299(class433.field3789, var5, var27 + 5, 16777215, 0);
						var5 = class116.field1092 + 180;
						var27 = 326;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var2.method1299(class433.field3790, var5, var27 + 5, 16777215, 0);
					} else if (class116.field1097 == 4) {
						var0.method1299(class433.field3766, 180 + class116.field1092, 201, 16776960, 0);
						var24 = 236;
						var0.method1299(class116.field1101, 180 + class116.field1092, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method1299(class116.field1099, 180 + class116.field1092, var25, 16777215, 0);
						var25 += 15;
						var0.method1299(class116.field1100, class116.field1092 + 180, var25, 16777215, 0);
						var25 += 15;
						var6 = class433.field3778;
						var8 = class110.field1061;
						var7 = class295.method1679('*', var8.length());
						var0.method1320(var6 + var7 + (Client.field306 % 40 < 20 ? class394.method2064(16776960) + class278.field2466 : ""), class116.field1092 + 180 - 108, var25, 16777215, 0);
						var25 -= 8;
						var0.method1320(class433.field3549, class116.field1092 + 180 - 9, var25, 16776960, 0);
						var25 += 15;
						var0.method1320(class433.field3666, 180 + class116.field1092 - 9, var25, 16776960, 0);
						var33 = class116.field1092 + 180 - 9 + var0.method1292(class433.field3666) + 15;
						var10 = var25 - var0.field2066;
						if (class116.field1107) {
							var11 = class73.field821;
						} else {
							var11 = class116.field1085;
						}

						var11.method207(var33, var10);
						var25 += 15;
						var37 = class116.field1092 + 180 - 80;
						short var39 = 321;
						class466.field4000.method207(var37 - 73, var39 - 20);
						var0.method1299(class433.field3546, var37, var39 + 5, 16777215, 0);
						var37 = 80 + 180 + class116.field1092;
						class466.field4000.method207(var37 - 73, var39 - 20);
						var0.method1299(class433.field3783, var37, var39 + 5, 16777215, 0);
						var1.method1299(class433.field3748, class116.field1092 + 180, var39 + 36, 16777215, 0);
					} else if (class116.field1097 == 5) {
						var0.method1299(class433.field3740, 180 + class116.field1092, 201, 16776960, 0);
						var24 = 221;
						var2.method1299(class116.field1101, class116.field1092 + 180, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1299(class116.field1099, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 15;
						var2.method1299(class116.field1100, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 15;
						var25 += 14;
						var0.method1320(class433.field3662, class116.field1092 + 180 - 145, var25, 16777215, 0);
						var26 = 174;

						for (var6 = class37.method247(); var0.method1292(var6) > var26; var6 = var6.substring(1)) {
						}

						var0.method1320(class228.method1305(var6) + (Client.field306 % 40 < 20 ? class394.method2064(16776960) + class278.field2466 : ""), 180 + class116.field1092 - 34, var25, 16777215, 0);
						var25 += 15;
						var28 = 180 + class116.field1092 - 80;
						short var30 = 321;
						class466.field4000.method207(var28 - 73, var30 - 20);
						var0.method1299(class433.field3793, var28, var30 + 5, 16777215, 0);
						var28 = 80 + 180 + class116.field1092;
						class466.field4000.method207(var28 - 73, var30 - 20);
						var0.method1299(class433.field3833, var28, var30 + 5, 16777215, 0);
						var30 = 356;
						var1.method1299(class433.field3796, class315.field2826, var30, 268435455, 0);
					} else if (class116.field1097 == 6) {
						var24 = 201;
						var0.method1299(class116.field1101, 180 + class116.field1092, var24, 16776960, 0);
						var25 = var24 + 15;
						var0.method1299(class116.field1099, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 15;
						var0.method1299(class116.field1100, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + class116.field1092;
						var27 = 321;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3833, var5, var27 + 5, 16777215, 0);
					} else if (class116.field1097 == 7) {
						if (class292.field2722 && !Client.field238) {
							var24 = 201;
							var0.method1299(class116.field1101, class315.field2826, var24, 16776960, 0);
							var25 = var24 + 15;
							var0.method1299(class116.field1099, class315.field2826, var25, 16776960, 0);
							var25 += 15;
							var0.method1299(class116.field1100, class315.field2826, var25, 16776960, 0);
							var5 = class315.field2826 - 150;
							var25 += 10;

							for (var34 = 0; var34 < 8; ++var34) {
								class466.field4000.method206(var5, var25, 30, 40);
								boolean var29 = class116.field1102 == var34 & Client.field306 % 40 < 20;
								var0.method1320((class116.field1105[var34] == null ? "" : class116.field1105[var34]) + (var29 ? class394.method2064(16776960) + class278.field2466 : ""), var5 + 10, var25 + 27, 16777215, 0);
								if (var34 != 1 && var34 != 3) {
									var5 += 35;
								} else {
									var5 += 50;
									var0.method1320(class228.method1305("/"), var5 - 13, var25 + 27, 16777215, 0);
								}
							}

							var34 = class315.field2826 - 80;
							short var31 = 321;
							class466.field4000.method207(var34 - 73, var31 - 20);
							var0.method1299("Submit", var34, var31 + 5, 16777215, 0);
							var34 = class315.field2826 + 80;
							class466.field4000.method207(var34 - 73, var31 - 20);
							var0.method1299(class433.field3783, var34, var31 + 5, 16777215, 0);
						} else {
							var24 = 216;
							var0.method1299(class433.field3818, 180 + class116.field1092, var24, 16776960, 0);
							var25 = var24 + 15;
							var2.method1299(class433.field3823, class116.field1092 + 180, var25, 16776960, 0);
							var25 += 15;
							var2.method1299(class433.field3824, class116.field1092 + 180, var25, 16776960, 0);
							var25 += 15;
							var5 = class116.field1092 + 180 - 80;
							var27 = 321;
							class466.field4000.method207(var5 - 73, var27 - 20);
							var0.method1299(class433.field3825, var5, var27 + 5, 16777215, 0);
							var5 = 180 + class116.field1092 + 80;
							class466.field4000.method207(var5 - 73, var27 - 20);
							var0.method1299(class433.field3833, var5, var27 + 5, 16777215, 0);
						}
					} else if (class116.field1097 == 8) {
						var24 = 216;
						var0.method1299(class433.field3679, 180 + class116.field1092, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1299(class433.field3721, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 15;
						var2.method1299(class433.field3690, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = 180 + class116.field1092 - 80;
						var27 = 321;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3794, var5, var27 + 5, 16777215, 0);
						var5 = 80 + class116.field1092 + 180;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3833, var5, var27 + 5, 16777215, 0);
					} else if (class116.field1097 == 9) {
						var24 = 221;
						var0.method1299(class116.field1101, class116.field1092 + 180, var24, 16776960, 0);
						var25 = var24 + 25;
						var0.method1299(class116.field1099, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 25;
						var0.method1299(class116.field1100, 180 + class116.field1092, var25, 16776960, 0);
						var5 = 180 + class116.field1092;
						var27 = 311;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3789, var5, var27 + 5, 16777215, 0);
					} else if (class116.field1097 == 10) {
						var25 = class116.field1092 + 180;
						var26 = 209;
						var0.method1299(class433.field3821, class116.field1092 + 180, var26, 16776960, 0);
						var5 = var26 + 20;
						class116.field1089.method207(var25 - 109, var5);
						if (class116.field1104.isEmpty()) {
							class281.field2507.method207(var25 - 48, var5 + 18);
						} else {
							class281.field2507.method207(var25 - 48, var5 + 5);
							var0.method1299(class116.field1104, var25, var5 + 68 - 15, 16776960, 0);
						}
					} else if (class116.field1097 == 12) {
						var25 = class315.field2826;
						var26 = 216;
						var2.method1299(class433.field3829, var25, var26, 16777215, 0);
						var5 = var26 + 17;
						var2.method1299(class433.field3830, var25, var5, 16777215, 0);
						var5 += 17;
						var2.method1299(class433.field3831, var25, var5, 16777215, 0);
						var5 += 17;
						var2.method1299(class433.field3832, var25, var5, 16777215, 0);
						var25 = class315.field2826 - 80;
						var26 = 311;
						class466.field4000.method207(var25 - 73, var26 - 20);
						var0.method1299(class433.field3651, var25, var26 + 5, 16777215, 0);
						var25 = class315.field2826 + 80;
						class466.field4000.method207(var25 - 73, var26 - 20);
						var0.method1299(class433.field3836, var25, var26 + 5, 16777215, 0);
					} else if (class116.field1097 == 13) {
						var24 = 231;
						var2.method1299(class433.field3596, 180 + class116.field1092, var24, 16777215, 0);
						var25 = var24 + 20;
						var2.method1299(class433.field3834, 180 + class116.field1092, var25, 16777215, 0);
						var5 = class116.field1092 + 180;
						var24 = 311;
						class466.field4000.method207(var5 - 73, var24 - 20);
						var0.method1299(class433.field3833, var5, var24 + 5, 16777215, 0);
					} else if (class116.field1097 == 14) {
						var24 = 201;
						String var41 = "";
						var6 = "";
						var7 = "";
						switch(class116.field1095) {
						case 0:
							var41 = class433.field3645;
							var6 = class433.field3585;
							var7 = class433.field3597;
							break;
						case 1:
							var41 = class433.field3634;
							var6 = class433.field3635;
							var7 = class433.field3636;
							break;
						case 2:
							var41 = class433.field3630;
							var6 = class433.field3638;
							var7 = class433.field3672;
							break;
						default:
							class143.method847(false);
						}

						var0.method1299(var41, 180 + class116.field1092, var24, 16776960, 0);
						var25 = var24 + 20;
						var0.method1299(var6, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 20;
						var0.method1299(var7, 180 + class116.field1092, var25, 16776960, 0);
						var32 = class116.field1092 + 180;
						short var35 = 276;
						class466.field4000.method207(var32 - 73, var35 - 20);
						if (class116.field1095 == 1) {
							var0.method1299(class433.field3579, var32, var35 + 5, 16777215, 0);
						} else {
							var0.method1299(class433.field3656, var32, var35 + 5, 16777215, 0);
						}

						var32 = class116.field1092 + 180;
						var35 = 326;
						class466.field4000.method207(var32 - 73, var35 - 20);
						var0.method1299(class433.field3833, var32, var35 + 5, 16777215, 0);
					} else if (class116.field1097 == 24) {
						var24 = 221;
						var0.method1299(class116.field1101, class116.field1092 + 180, var24, 16777215, 0);
						var25 = var24 + 15;
						var0.method1299(class116.field1099, 180 + class116.field1092, var25, 16777215, 0);
						var25 += 15;
						var0.method1299(class116.field1100, class116.field1092 + 180, var25, 16777215, 0);
						var25 += 15;
						var5 = class116.field1092 + 180;
						var27 = 301;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3544, var5, var27 + 5, 16777215, 0);
					} else if (class116.field1097 == 32) {
						var24 = 216;
						var0.method1299(class433.field3818, 180 + class116.field1092, var24, 16776960, 0);
						var25 = var24 + 15;
						var2.method1299(class433.field3823, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 15;
						var2.method1299(class433.field3824, 180 + class116.field1092, var25, 16776960, 0);
						var25 += 15;
						var5 = class116.field1092 + 180 - 80;
						var27 = 321;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3825, var5, var27 + 5, 16777215, 0);
						var5 = 180 + class116.field1092 + 80;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var0.method1299(class433.field3833, var5, var27 + 5, 16777215, 0);
					} else if (class116.field1097 == 33) {
						var24 = 201;
						var0.method1299(class116.field1101, 180 + class116.field1092, var24, 16776960, 0);
						var25 = var24 + 20;
						var1.method1299(class116.field1099, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 20;
						var1.method1299(class116.field1100, class116.field1092 + 180, var25, 16776960, 0);
						var25 += 15;
						var5 = class116.field1092 + 180;
						var27 = 276;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var2.method1299(class433.field3848, var5, var27 + 5, 16777215, 0);
						var5 = class116.field1092 + 180;
						var27 = 326;
						class466.field4000.method207(var5 - 73, var27 - 20);
						var2.method1299(class433.field3833, var5, var27 + 5, 16777215, 0);
					}
				}
			}

			if (Client.field87 >= 10) {
				int[] var49 = new int[4];
				class266.method1544(var49);
				class266.method1555(class116.field1086, 0, 765 + class116.field1086, class5.field322);
				class196.field1790.method631(class116.field1086 - 22, Client.field306);
				class196.field1790.method631(22 + 765 + class116.field1086 - 128, Client.field306);
				class266.method1564(var49);
			}

			class149.field1401[class176.field1701.method2509() ? 1 : 0].method207(765 + class116.field1086 - 40, 463);
			if (Client.field87 > 5 && class168.field1636 == class395.field3318) {
				if (class285.field2515 != null) {
					var25 = class116.field1086 + 5;
					var26 = 463;
					byte var42 = 100;
					byte var36 = 35;
					class285.field2515.method207(var25, var26);
					var0.method1299(class433.field3719 + " " + Client.field3, var42 / 2 + var25, var36 / 2 + var26 - 2, 16777215, 0);
					if (null != class467.field4008) {
						var1.method1299(class433.field3689, var42 / 2 + var25, var26 + var36 / 2 + 12, 16777215, 0);
					} else {
						var1.method1299(class433.field3847, var42 / 2 + var25, 12 + var36 / 2 + var26, 16777215, 0);
					}
				} else {
					class285.field2515 = class439.method2208(class337.field2945, "sl_button", "");
				}
			}

		}
	}

	static void method2575() {
		Client.field68.method1576();
		Client.field68.field2427.field527 = 0;
		Client.field68.field2423 = null;
		Client.field68.field2428 = null;
		Client.field68.field2434 = null;
		Client.field68.field2435 = null;
		Client.field68.field2429 = 0;
		Client.field68.field2433 = 0;
		Client.field23 = 0;
		class22.method185();
		Client.field256 = 0;
		Client.field254 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			Client.field176[var1] = null;
		}

		class82.field863 = null;

		for (var1 = 0; var1 < Client.field63.length; ++var1) {
			class102 var2 = Client.field63[var1];
			if (var2 != null) {
				var2.field1560 = -1;
				var2.field1530 = false;
			}
		}

		class528.method2551();
		class104.method675(30);

		for (var1 = 0; var1 < 100; ++var1) {
			Client.field13[var1] = true;
		}

		class445.method2232();
	}
}
