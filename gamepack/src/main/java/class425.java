import java.util.ArrayList;

public class class425 extends class218 {
	static class215 field3521;
	static class344 field3519;
	static int field3522;
	boolean field3517;
	char field3518;
	public int field3516;
	public String field3520;

	static {
		field3519 = new class344(64);
	}

	class425() {
		this.field3517 = true;
	}

	void method2172() {
	}

	void method2173(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method2174(var1, var3);
		}
	}

	void method2174(class42 var1, int var2) {
		if (var2 == 1) {
			this.field3518 = class277.method1591(var1.method279());
		} else if (var2 == 2) {
			this.field3516 = var1.method282();
		} else if (var2 == 4) {
			this.field3517 = false;
		} else if (var2 == 5) {
			this.field3520 = var1.method286();
		}

	}

	public boolean method2175() {
		return this.field3518 == 's';
	}

	static void method2176() {
		int var30;
		if (Client.field35 == class366.field3093) {
			class415.field3487 = new class317(4, 104, 104, class38.field511);

			for (var30 = 0; var30 < 4; ++var30) {
				Client.field78[var30] = new class76(104, 104);
			}

			class268.field2420 = new class115(512, 512);
			class116.field1094 = class433.field3554;
			class116.field1093 = 5;
			Client.field35 = class366.field3084;
		} else if (class366.field3084 == Client.field35) {
			class116.field1094 = class433.field3555;
			class116.field1093 = 10;
			Client.field35 = class366.field3092;
		} else if (class366.field3092 == Client.field35) {
			class94.field932 = class463.method2272(0, false, true, true, false);
			class174.field1690 = class463.method2272(1, false, true, true, false);
			class26.field457 = class463.method2272(2, true, false, true, false);
			class154.field1451 = class463.method2272(3, false, true, true, false);
			class15.field383 = class463.method2272(4, false, true, true, false);
			class286.field2521 = class463.method2272(5, true, true, true, false);
			class465.field3998 = class463.method2272(6, true, true, true, false);
			class445.field3911 = class463.method2272(7, false, true, true, false);
			class337.field2945 = class463.method2272(8, false, true, true, false);
			class39.field516 = class463.method2272(9, false, true, true, false);
			class371.field3106 = class463.method2272(10, false, true, true, false);
			class79.field843 = class463.method2272(11, false, true, true, false);
			class522.field4234 = class463.method2272(12, false, true, true, false);
			class287.field2551 = class463.method2272(13, true, false, true, false);
			class188.field1755 = class463.method2272(14, false, true, true, false);
			class38.field502 = class463.method2272(15, false, true, true, false);
			class503.field4165 = class463.method2272(17, true, true, true, false);
			class96.field980 = class463.method2272(18, false, true, true, false);
			class395.field3319 = class463.method2272(19, false, true, true, false);
			class54.field605 = class463.method2272(20, false, true, true, false);
			class138.field1330 = class463.method2272(21, false, true, true, true);
			class116.field1094 = class433.field3580;
			class116.field1093 = 20;
			Client.field35 = class366.field3086;
		} else if (class366.field3086 == Client.field35) {
			byte var50 = 0;
			var30 = var50 + class94.field932.method1874() * 4 / 100;
			var30 += class174.field1690.method1874() * 4 / 100;
			var30 += class26.field457.method1874() * 2 / 100;
			var30 += class154.field1451.method1874() * 2 / 100;
			var30 += class15.field383.method1874() * 6 / 100;
			var30 += class286.field2521.method1874() * 4 / 100;
			var30 += class465.field3998.method1874() * 2 / 100;
			var30 += class445.field3911.method1874() * 55 / 100;
			var30 += class337.field2945.method1874() * 2 / 100;
			var30 += class39.field516.method1874() * 2 / 100;
			var30 += class371.field3106.method1874() * 2 / 100;
			var30 += class79.field843.method1874() * 2 / 100;
			var30 += class522.field4234.method1874() * 2 / 100;
			var30 += class287.field2551.method1874() * 2 / 100;
			var30 += class188.field1755.method1874() * 2 / 100;
			var30 += class38.field502.method1874() * 2 / 100;
			var30 += class395.field3319.method1874() / 100;
			var30 += class96.field980.method1874() / 100;
			var30 += class54.field605.method1874() / 100;
			var30 += class138.field1330.method1874() / 100;
			var30 += class503.field4165.method1880() && class503.field4165.method1217() ? 1 : 0;
			if (var30 != 100) {
				if (var30 != 0) {
					class116.field1094 = class433.field3557 + var30 + "%";
				}

				class116.field1093 = 30;
			} else {
				class255.method1501(class94.field932, "Animations");
				class255.method1501(class174.field1690, "Skeletons");
				class255.method1501(class15.field383, "Sound FX");
				class255.method1501(class286.field2521, "Maps");
				class255.method1501(class465.field3998, "Music Tracks");
				class255.method1501(class445.field3911, "Models");
				class255.method1501(class337.field2945, "Sprites");
				class255.method1501(class79.field843, "Music Jingles");
				class255.method1501(class188.field1755, "Music Samples");
				class255.method1501(class38.field502, "Music Patches");
				class255.method1501(class395.field3319, "World Map");
				class255.method1501(class96.field980, "World Map Geography");
				class255.method1501(class54.field605, "World Map Ground");
				class484.field4098 = new class308();
				class484.field4098.method1740(class503.field4165);
				class116.field1094 = class433.field3558;
				class116.field1093 = 30;
				Client.field35 = class366.field3087;
			}
		} else {
			int var3;
			class342 var33;
			class342 var35;
			if (class366.field3087 == Client.field35) {
				class378.method2016(22050, !Client.field7, 2);
				ArrayList var48 = new ArrayList(3);
				class233.field2104 = class13.method123(class172.field1652, 0, 2048);
				class539.field4277 = new class388();
				class388 var32 = new class388();
				var32.method2045(class539.field4277);

				for (var3 = 0; var3 < 3; ++var3) {
					class18 var39 = new class18();
					var39.method153(9, 128);
					var32.method2045(var39);
					var48.add(var39);
				}

				class233.field2104.method1851(var32);
				var33 = class38.field502;
				var35 = class188.field1755;
				class342 var41 = class15.field383;
				class92.field898 = var33;
				class92.field899 = var35;
				class92.field902 = var41;
				class92.field901 = var48;
				class231.field2098 = new class475(22050, class337.field2934);
				class116.field1094 = class433.field3559;
				class116.field1093 = 35;
				Client.field35 = class366.field3091;
				class160.field1485 = new class155(class337.field2945, class287.field2551);
			} else {
				int var2;
				if (Client.field35 == class366.field3091) {
					class182[] var47 = new class182[]{class182.field1721, class182.field1715, class182.field1714, class182.field1719, class182.field1717, class182.field1716};
					var2 = var47.length;
					class155 var34 = class160.field1485;
					class182[] var38 = new class182[]{class182.field1721, class182.field1715, class182.field1714, class182.field1719, class182.field1717, class182.field1716};
					Client.field72 = var34.method887(var38);
					if (Client.field72.size() < var2) {
						class116.field1094 = class433.field3752 + Client.field72.size() * 100 / var2 + "%";
						class116.field1093 = 40;
					} else {
						class177.field1705 = (class253)Client.field72.get(class182.field1717);
						class324.field2900 = (class253)Client.field72.get(class182.field1716);
						class488.field4114 = (class253)Client.field72.get(class182.field1719);
						class454.field3963 = Client.field148.method1152();
						class116.field1094 = class433.field3561;
						class116.field1093 = 40;
						Client.field35 = class366.field3089;
					}
				} else {
					int var4;
					class342 var6;
					class342 var31;
					if (Client.field35 == class366.field3089) {
						var31 = class371.field3106;
						var33 = class337.field2945;
						var4 = 0;
						String[] var37 = class116.field1098;

						int var40;
						String var42;
						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var31.method1232(var42, "")) {
								++var4;
							}
						}

						var37 = class116.field1117;

						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var33.method1232(var42, "")) {
								++var4;
							}
						}

						var37 = class116.field1120;

						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var33.method1237(var42) != -1 && var33.method1232(var42, "")) {
								++var4;
							}
						}

						var6 = class337.field2945;
						int var43 = class116.field1098.length + class116.field1117.length;
						String[] var44 = class116.field1120;

						for (int var45 = 0; var45 < var44.length; ++var45) {
							String var49 = var44[var45];
							if (var6.method1237(var49) != -1) {
								++var43;
							}
						}

						if (var4 < var43) {
							class116.field1094 = class433.field3562 + var4 * 100 / var43 + "%";
							class116.field1093 = 50;
						} else {
							class116.field1094 = class433.field3563;
							class116.field1093 = 50;
							class104.method675(5);
							Client.field35 = class366.field3090;
						}
					} else if (class366.field3090 == Client.field35) {
						if (!class26.field457.method1217()) {
							class116.field1094 = class433.field3564 + class26.field457.method1882() + "%";
							class116.field1093 = 60;
						} else if (!class138.field1330.method1217()) {
							class116.field1094 = class433.field3564 + (80 + class522.field4234.method1882() / 6) + "%";
							class116.field1093 = 60;
						} else {
							class44.method346(class26.field457);
							class24.method199(class26.field457);
							class342 var46 = class26.field457;
							var31 = class445.field3911;
							class404.field3383 = var46;
							class404.field3384 = var31;
							class404.field3386 = class404.field3383.method1238(3);
							var33 = class26.field457;
							var35 = class445.field3911;
							boolean var36 = Client.field7;
							class235.field2109 = var33;
							class235.field2107 = var35;
							class235.field2155 = var36;
							var6 = class26.field457;
							class342 var7 = class445.field3911;
							class375.field3144 = var6;
							class375.field3145 = var7;
							class342 var8 = class26.field457;
							class63.field806 = var8;
							class342 var9 = class26.field457;
							class342 var10 = class445.field3911;
							boolean var11 = Client.field30;
							class253 var12 = class177.field1705;
							class389.field3271 = var9;
							class210.field1933 = var10;
							class210.field1934 = var11;
							class358.field3039 = class389.field3271.method1238(10);
							class315.field2825 = var12;
							class54.method401(class26.field457, class94.field932, class174.field1690);
							class342 var13 = class26.field457;
							class342 var14 = class445.field3911;
							class409.field3425 = var13;
							class409.field3412 = var14;
							class291.method1667(class26.field457);
							class209.method1176(class26.field457);
							class342 var15 = class154.field1451;
							class342 var16 = class445.field3911;
							class342 var17 = class337.field2945;
							class342 var18 = class287.field2551;
							int var19 = 0;
							if (null != var15) {
								class475.field4032 = var15;
								class164.field1605 = var16;
								class168.field1631 = var17;
								class214.field2006 = var18;
								var19 = class475.field4032.method1224();
							}

							class160.field1484 = new class60[var19][];
							class105.field1038 = new boolean[var19];
							class292.method1668(class26.field457);
							class342 var51 = class26.field457;
							class114.field1076 = var51;
							class342 var20 = class26.field457;
							class285.field2519 = var20;
							class342 var21 = class26.field457;
							class196.method1071(class26.field457);
							class260.method1510(class26.field457);
							class417.method2144(class26.field457);
							class164.field1604 = new class453(class498.field4148, 54, class395.field3318, class26.field457);
							class430.field3535 = new class453(class498.field4148, 47, class395.field3318, class26.field457);
							class451.field3950 = new class20();
							class342 var22 = class26.field457;
							class342 var23 = class337.field2945;
							class342 var24 = class287.field2551;
							class151.field1428 = var22;
							class151.field1411 = var23;
							class151.field1413 = var24;
							class517.method2524(class26.field457, class337.field2945);
							class342 var25 = class26.field457;
							class342 var26 = class337.field2945;
							class96.field969 = var26;
							if (var25.method1217()) {
								class96.field958 = var25.method1238(35);
								class96.field957 = new class96[class96.field958];

								for (int var27 = 0; var27 < class96.field958; ++var27) {
									byte[] var28 = var25.method1212(35, var27);
									class96.field957[var27] = new class96(var27);
									if (var28 != null) {
										class96.field957[var27].method632(new class42(var28));
										class96.field957[var27].method634();
									}
								}
							}

							class116.field1094 = class433.field3757;
							class116.field1093 = 60;
							Client.field35 = class366.field3083;
						}
					} else if (Client.field35 == class366.field3083) {
						var30 = 0;
						if (Client.field83 == null) {
							Client.field83 = class38.method253(class337.field2945, class484.field4098.field2790, 0);
						} else {
							++var30;
						}

						if (class527.field4251 == null) {
							class527.field4251 = class38.method253(class337.field2945, class484.field4098.field2780, 0);
						} else {
							++var30;
						}

						if (null == class316.field2828) {
							class316.field2828 = class15.method124(class337.field2945, class484.field4098.field2783, 0);
						} else {
							++var30;
						}

						if (class189.field1757 == null) {
							class189.field1757 = class97.method644(class337.field2945, class484.field4098.field2782, 0);
						} else {
							++var30;
						}

						if (null == class140.field1346) {
							class140.field1346 = class97.method644(class337.field2945, class484.field4098.field2788, 0);
						} else {
							++var30;
						}

						if (class398.field3353 == null) {
							class398.field3353 = class97.method644(class337.field2945, class484.field4098.field2779, 0);
						} else {
							++var30;
						}

						if (class445.field3912 == null) {
							class445.field3912 = class97.method644(class337.field2945, class484.field4098.field2785, 0);
						} else {
							++var30;
						}

						if (null == class517.field4223) {
							class517.field4223 = class97.method644(class337.field2945, class484.field4098.field2786, 0);
						} else {
							++var30;
						}

						if (null == class207.field1912) {
							class207.field1912 = class97.method644(class337.field2945, class484.field4098.field2787, 0);
						} else {
							++var30;
						}

						if (class35.field500 == null) {
							class35.field500 = class15.method124(class337.field2945, class484.field4098.field2784, 0);
						} else {
							++var30;
						}

						if (null == class265.field2402) {
							class265.field2402 = class15.method124(class337.field2945, class484.field4098.field2789, 0);
						} else {
							++var30;
						}

						if (var30 < 11) {
							class116.field1094 = class433.field3566 + var30 * 100 / 12 + "%";
							class116.field1093 = 70;
						} else {
							class228.field2062 = class265.field2402;
							class527.field4251.method707();
							var2 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var4 = (int)(Math.random() * 21.0D) - 10;
							int var5 = (int)(Math.random() * 41.0D) - 20;
							class316.field2828[0].method203(var5 + var2, var3 + var5, var5 + var4);
							class116.field1094 = class433.field3567;
							class116.field1093 = 70;
							Client.field35 = class366.field3097;
						}
					} else if (Client.field35 == class366.field3097) {
						if (!class39.field516.method1217()) {
							class116.field1094 = class433.field3568 + "0%";
							class116.field1093 = 90;
						} else {
							class452.field3955 = new class348(class39.field516, class337.field2945, 20, class176.field1701.method2511(), Client.field7 ? 64 : 128);
							class133.method780(class452.field3955);
							class133.method781(class176.field1701.method2511());
							Client.field35 = class366.field3098;
						}
					} else if (class366.field3098 == Client.field35) {
						var30 = class452.field3955.method1908();
						if (var30 < 100) {
							class116.field1094 = class433.field3568 + var30 + "%";
							class116.field1093 = 90;
						} else {
							class116.field1094 = class433.field3846;
							class116.field1093 = 90;
							Client.field35 = class366.field3095;
						}
					} else if (Client.field35 == class366.field3095) {
						class525.field4240 = new class384();
						class172.field1652.method1700(class525.field4240, 10);
						class116.field1094 = class433.field3674;
						class116.field1093 = 92;
						Client.field35 = class366.field3094;
					} else if (class366.field3094 == Client.field35) {
						if (!class371.field3106.method1232("huffman", "")) {
							class116.field1094 = class433.field3593 + 0 + "%";
							class116.field1093 = 94;
						} else {
							class537 var29 = new class537(class371.field3106.method1231("huffman", ""));
							class521.method2528(var29);
							class116.field1094 = class433.field3572;
							class116.field1093 = 94;
							Client.field35 = class366.field3088;
						}
					} else if (class366.field3088 == Client.field35) {
						if (!class154.field1451.method1217()) {
							class116.field1094 = class433.field3573 + class154.field1451.method1882() * 4 / 5 + "%";
							class116.field1093 = 96;
						} else if (!class522.field4234.method1217()) {
							class116.field1094 = class433.field3573 + (80 + class522.field4234.method1882() / 6) + "%";
							class116.field1093 = 96;
						} else if (!class287.field2551.method1217()) {
							class116.field1094 = class433.field3573 + (96 + class287.field2551.method1882() / 50) + "%";
							class116.field1093 = 96;
						} else {
							class116.field1094 = class433.field3574;
							class116.field1093 = 98;
							if (class522.field4234.method1234("version.dat", "")) {
								class42 var1 = new class42(class522.field4234.method1231("version.dat", ""));
								var1.method327();
							}

							Client.field35 = class366.field3096;
						}
					} else if (Client.field35 == class366.field3096) {
						class116.field1093 = 100;
						if (class395.field3319.method1224() > 0 && !class395.field3319.method1233(class499.field4155.field4154)) {
							class116.field1094 = class433.field3575 + class395.field3319.method1239(class499.field4155.field4154) / 10 + "%";
						} else {
							if (null == class306.field2771) {
								class306.field2771 = new class199();
								class306.field2771.method1079(class395.field3319, class96.field980, class54.field605, class488.field4114, Client.field72, class316.field2828);
							}

							class116.field1094 = class433.field3675;
							Client.field35 = class366.field3085;
						}
					} else {
						if (class366.field3085 == Client.field35) {
							class104.method675(10);
						}

					}
				}
			}
		}
	}
}
