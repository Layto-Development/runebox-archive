public class class255 {
	public static int[] field2358;
	static class379 field2360;
	static int[] field2359;
	static int[] field2361;

	static {
		field2359 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field2359[var0] = method1497(var0);
		}

		method1499();
	}

	class255() throws Throwable {
	}

	static final int method1497(int var0) {
		double var2 = (double)(var0 >> 10 & 31) / 31.0D;
		double var4 = (double)(var0 >> 5 & 31) / 31.0D;
		double var6 = (double)(var0 & 31) / 31.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		int var18 = (int)(var12 * 256.0D / 6.0D);
		var18 &= 255;
		double var19 = var14 * 256.0D;
		if (var19 < 0.0D) {
			var19 = 0.0D;
		} else if (var19 > 255.0D) {
			var19 = 255.0D;
		}

		if (var16 > 0.7D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.75D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.85D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.95D) {
			var19 /= 2.0D;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.995D) {
			var16 = 0.995D;
		}

		int var21 = (int)((double)(var18 / 4 * 8) + var19 / 32.0D);
		return (int)(var16 * 128.0D) + (var21 << 7);
	}

	static class299[] method1496() {
		return new class299[]{class299.field2746, class299.field2747};
	}

	static void method1499() {
		if (field2358 == null) {
			field2358 = new int[65536];
			double var1 = 0.949999988079071D;

			for (int var3 = 0; var3 < 65536; ++var3) {
				double var4 = 0.0078125D + (double)(var3 >> 10 & 63) / 64.0D;
				double var6 = 0.0625D + (double)(var3 >> 7 & 7) / 8.0D;
				double var8 = (double)(var3 & 127) / 128.0D;
				double var10 = var8;
				double var12 = var8;
				double var14 = var8;
				if (0.0D != var6) {
					double var16;
					if (var8 < 0.5D) {
						var16 = var8 * (var6 + 1.0D);
					} else {
						var16 = var6 + var8 - var6 * var8;
					}

					double var18 = var8 * 2.0D - var16;
					double var20 = var4 + 0.3333333333333333D;
					if (var20 > 1.0D) {
						--var20;
					}

					double var24 = var4 - 0.3333333333333333D;
					if (var24 < 0.0D) {
						++var24;
					}

					if (var20 * 6.0D < 1.0D) {
						var10 = var20 * 6.0D * (var16 - var18) + var18;
					} else if (var20 * 2.0D < 1.0D) {
						var10 = var16;
					} else if (var20 * 3.0D < 2.0D) {
						var10 = var18 + (var16 - var18) * (0.6666666666666666D - var20) * 6.0D;
					} else {
						var10 = var18;
					}

					if (var4 * 6.0D < 1.0D) {
						var12 = var18 + (var16 - var18) * 6.0D * var4;
					} else if (var4 * 2.0D < 1.0D) {
						var12 = var16;
					} else if (var4 * 3.0D < 2.0D) {
						var12 = 6.0D * (var16 - var18) * (0.6666666666666666D - var4) + var18;
					} else {
						var12 = var18;
					}

					if (var24 * 6.0D < 1.0D) {
						var14 = 6.0D * (var16 - var18) * var24 + var18;
					} else if (var24 * 2.0D < 1.0D) {
						var14 = var16;
					} else if (var24 * 3.0D < 2.0D) {
						var14 = var18 + (0.6666666666666666D - var24) * (var16 - var18) * 6.0D;
					} else {
						var14 = var18;
					}
				}

				var10 = Math.pow(var10, var1);
				var12 = Math.pow(var12, var1);
				var14 = Math.pow(var14, var1);
				int var26 = (int)(var10 * 256.0D);
				int var17 = (int)(var12 * 256.0D);
				int var27 = (int)(var14 * 256.0D);
				int var19 = (var26 << 16) + (var17 << 8) + var27;
				field2358[var3] = var19 & 16777215;
			}

		}
	}

	public static int method1498(int var0) {
		return 255 - (var0 & 255);
	}

	static void method1501(class342 var0, String var1) {
		class398 var3 = new class398(var0, var1);
		Client.field300.add(var3);
		Client.field302 += var3.field3351;
	}

	static int method1500(int var0, class167 var1, boolean var2) {
		String var12;
		if (var0 == 3100) {
			var12 = class139.field1331[--class429.field3529];
			class184.method1019(0, "", var12);
			return 1;
		} else if (var0 == 3101) {
			class203.field1903 -= 2;
			class392.method2050(class82.field863, class139.field1344[class203.field1903], class139.field1344[class203.field1903 + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!class139.field1339) {
				class139.field1345 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == 3104) {
				var12 = class139.field1331[--class429.field3529];
				var11 = 0;
				if (class185.method1023(var12)) {
					var11 = class177.method1005(var12);
				}

				class160 var15 = class85.method556(class129.field1270, Client.field68.field2426);
				var15.field1483.method333(var11);
				Client.field68.method1570(var15);
				return 1;
			} else {
				class160 var9;
				if (var0 == 3105) {
					var12 = class139.field1331[--class429.field3529];
					var9 = class85.method556(class129.field1178, Client.field68.field2426);
					var9.field1483.method267(var12.length() + 1);
					var9.field1483.method270(var12);
					Client.field68.method1570(var9);
					return 1;
				} else if (var0 == 3106) {
					var12 = class139.field1331[--class429.field3529];
					var9 = class85.method556(class129.field1274, Client.field68.field2426);
					var9.field1483.method267(var12.length() + 1);
					var9.field1483.method270(var12);
					Client.field68.method1570(var9);
					return 1;
				} else {
					int var4;
					String var5;
					if (var0 == 3107) {
						var4 = class139.field1344[--class203.field1903];
						var5 = class139.field1331[--class429.field3529];
						class57.method424(var4, var5);
						return 1;
					} else if (var0 == 3108) {
						class203.field1903 -= 3;
						var4 = class139.field1344[class203.field1903];
						var11 = class139.field1344[1 + class203.field1903];
						int var14 = class139.field1344[2 + class203.field1903];
						class60 var16 = class366.method1967(var14);
						class54.method400(var16, var4, var11);
						return 1;
					} else if (var0 == 3109) {
						class203.field1903 -= 2;
						var4 = class139.field1344[class203.field1903];
						var11 = class139.field1344[1 + class203.field1903];
						class60 var13 = var2 ? class491.field4134 : class52.field599;
						class54.method400(var13, var4, var11);
						return 1;
					} else if (var0 == 3110) {
						class30.field467 = class139.field1344[--class203.field1903] == 1;
						return 1;
					} else if (var0 == 3111) {
						class139.field1344[++class203.field1903 - 1] = class176.field1701.method2487() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						class176.field1701.method2486(class139.field1344[--class203.field1903] == 1);
						return 1;
					} else if (var0 == 3113) {
						var12 = class139.field1331[--class429.field3529];
						boolean var10 = class139.field1344[--class203.field1903] == 1;
						class289.method1661(var12, var10, false);
						return 1;
					} else if (var0 == 3115) {
						var4 = class139.field1344[--class203.field1903];
						var9 = class85.method556(class129.field1267, Client.field68.field2426);
						var9.field1483.method308(var4);
						Client.field68.method1570(var9);
						return 1;
					} else if (var0 == 3116) {
						var4 = class139.field1344[--class203.field1903];
						class429.field3529 -= 2;
						var5 = class139.field1331[class429.field3529];
						String var6 = class139.field1331[class429.field3529 + 1];
						if (var5.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class160 var7 = class85.method556(class129.field1198, Client.field68.field2426);
							var7.field1483.method308(1 + class431.method2196(var5) + class431.method2196(var6));
							var7.field1483.method270(var6);
							var7.field1483.method267(var4);
							var7.field1483.method270(var5);
							Client.field68.method1570(var7);
							return 1;
						}
					} else if (var0 == 3117) {
						--class203.field1903;
						return 1;
					} else if (var0 == 3118) {
						Client.field163 = class139.field1344[--class203.field1903] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.field241 = class139.field1344[--class203.field1903] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (class139.field1344[--class203.field1903] == 1) {
							Client.field6 |= 1;
						} else {
							Client.field6 &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (class139.field1344[--class203.field1903] == 1) {
							Client.field6 |= 2;
						} else {
							Client.field6 &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (class139.field1344[--class203.field1903] == 1) {
							Client.field6 |= 4;
						} else {
							Client.field6 &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (class139.field1344[--class203.field1903] == 1) {
							Client.field6 |= 8;
						} else {
							Client.field6 &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.field6 = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.field292 = class139.field1344[--class203.field1903] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.field129 = class139.field1344[--class203.field1903] == 1;
						return 1;
					} else if (var0 == 3127) {
						class57.method423(class139.field1344[--class203.field1903] == 1);
						return 1;
					} else if (var0 == 3128) {
						class139.field1344[++class203.field1903 - 1] = class289.method1660() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class203.field1903 -= 2;
						Client.field101 = class139.field1344[class203.field1903];
						Client.field102 = class139.field1344[class203.field1903 + 1];
						return 1;
					} else if (var0 == 3130) {
						class203.field1903 -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class203.field1903;
						return 1;
					} else if (var0 == 3132) {
						class139.field1344[++class203.field1903 - 1] = class237.field2181;
						class139.field1344[++class203.field1903 - 1] = class5.field322;
						return 1;
					} else if (var0 == 3133) {
						--class203.field1903;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						class203.field1903 -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field17 = 3;
						Client.field178 = class139.field1344[--class203.field1903];
						return 1;
					} else if (var0 == 3137) {
						Client.field17 = 2;
						Client.field178 = class139.field1344[--class203.field1903];
						return 1;
					} else if (var0 == 3138) {
						Client.field17 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field17 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field17 = 3;
						Client.field178 = var2 ? class491.field4134.field644 : class52.field599.field644;
						return 1;
					} else {
						boolean var8;
						if (var0 == 3141) {
							var8 = class139.field1344[--class203.field1903] == 1;
							class176.field1701.method2510(var8);
							return 1;
						} else if (var0 == 3142) {
							class139.field1344[++class203.field1903 - 1] = class176.field1701.method2491() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var8 = class139.field1344[--class203.field1903] == 1;
							Client.field57 = var8;
							if (!var8) {
								class176.field1701.method2499("");
							}

							return 1;
						} else if (var0 == 3144) {
							class139.field1344[++class203.field1903 - 1] = Client.field57 ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var8 = class139.field1344[--class203.field1903] == 1;
							class176.field1701.method2507(!var8);
							return 1;
						} else if (var0 == 3147) {
							class139.field1344[++class203.field1903 - 1] = class176.field1701.method2509() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							class139.field1344[++class203.field1903 - 1] = class116.field1093;
							return 1;
						} else if (var0 == 3154) {
							class139.field1344[++class203.field1903 - 1] = class208.method1173();
							return 1;
						} else if (var0 == 3155) {
							--class429.field3529;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class203.field1903 -= 2;
							return 1;
						} else if (var0 == 3158) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class203.field1903;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class203.field1903;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class429.field3529;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class203.field1903;
							class139.field1331[++class429.field3529 - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class203.field1903;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class203.field1903 -= 2;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class203.field1903 -= 2;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class203.field1903 -= 2;
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							class139.field1331[++class429.field3529 - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class203.field1903;
							return 1;
						} else if (var0 == 3173) {
							--class203.field1903;
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class203.field1903;
							return 1;
						} else if (var0 == 3175) {
							class139.field1344[++class203.field1903 - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class429.field3529;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class429.field3529;
							return 1;
						} else if (var0 == 3181) {
							class4.method50(class139.field1344[--class203.field1903]);
							return 1;
						} else if (var0 == 3182) {
							class139.field1344[++class203.field1903 - 1] = class397.method2073();
							return 1;
						} else if (var0 == 3189) {
							var4 = class139.field1344[--class203.field1903];
							class182.method1011(var4);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	static int method1504() {
		return class116.field1097;
	}

	static int method1503(int var0, class167 var1, boolean var2) {
		int var4;
		if (var0 == 5504) {
			class203.field1903 -= 2;
			var4 = class139.field1344[class203.field1903];
			int var5 = class139.field1344[class203.field1903 + 1];
			if (!Client.field264) {
				Client.field42 = var4;
				Client.field181 = var5;
			}

			return 1;
		} else if (var0 == 5505) {
			class139.field1344[++class203.field1903 - 1] = Client.field42;
			return 1;
		} else if (var0 == 5506) {
			class139.field1344[++class203.field1903 - 1] = Client.field181;
			return 1;
		} else if (var0 == 5530) {
			var4 = class139.field1344[--class203.field1903];
			if (var4 < 0) {
				var4 = 0;
			}

			Client.field97 = var4;
			return 1;
		} else if (var0 == 5531) {
			class139.field1344[++class203.field1903 - 1] = Client.field97;
			return 1;
		} else {
			return 2;
		}
	}

	static void method1502(int var0, int var1) {
		class160 var3 = class85.method556(class129.field1232, Client.field68.field2426);
		var3.field1483.method287(var0);
		var3.field1483.method336(var1);
		Client.field68.method1570(var3);
	}
}
