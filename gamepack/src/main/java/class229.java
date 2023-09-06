public class class229 {
	protected static boolean field2086;
	static final class229 field2084;
	static final class229 field2085;
	static final class229 field2087;
	static final class229 field2088;

	static {
		field2085 = new class229();
		field2088 = new class229();
		field2084 = new class229();
		field2087 = new class229();
	}

	class229() {
	}

	static final void method1322() {
		class251.method1485(false);
		Client.field73 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < class51.field592.length; ++var2) {
			if (class488.field4115[var2] != -1 && class51.field592[var2] == null) {
				class51.field592[var2] = class286.field2521.method1212(class488.field4115[var2], 0);
				if (null == class51.field592[var2]) {
					var1 = false;
					++Client.field73;
				}
			}

			if (class30.field464[var2] != -1 && class364.field3074[var2] == null) {
				class364.field3074[var2] = class286.field2521.method1213(class30.field464[var2], 0, class280.field2501[var2]);
				if (null == class364.field3074[var2]) {
					var1 = false;
					++Client.field73;
				}
			}
		}

		if (!var1) {
			Client.field77 = 1;
		} else {
			Client.field75 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < class51.field592.length; ++var2) {
				byte[] var3 = class364.field3074[var2];
				if (var3 != null) {
					var4 = (class520.field4226[var2] >> 8) * 64 - class296.field2735;
					var5 = 64 * (class520.field4226[var2] & 255) - class164.field1606;
					if (Client.field79) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= class6.method56(var3, var4, var5);
				}
			}

			if (!var1) {
				Client.field77 = 2;
			} else {
				if (Client.field77 != 0) {
					class200.method1140(class433.field3551 + class278.field2469 + class278.field2463 + 100 + "%" + class278.field2465, true);
				}

				class77.method535();
				class415.field3487.method1754();

				for (var2 = 0; var2 < 4; ++var2) {
					Client.field78[var2].method532();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							class38.field513[var2][var16][var4] = 0;
						}
					}
				}

				class77.method535();
				class168.method929();
				var2 = class51.field592.length;
				class79.method536();
				class251.method1485(true);
				int var18;
				if (!Client.field79) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (class520.field4226[var16] >> 8) - class296.field2735;
						var5 = 64 * (class520.field4226[var16] & 255) - class164.field1606;
						var6 = class51.field592[var16];
						if (null != var6) {
							class77.method535();
							class72.method513(var6, var4, var5, class38.field501 * 8 - 48, class384.field3237 * 8 - 48, Client.field78);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (class520.field4226[var16] >> 8) * 64 - class296.field2735;
						var5 = (class520.field4226[var16] & 255) * 64 - class164.field1606;
						var6 = class51.field592[var16];
						if (null == var6 && class384.field3237 < 800) {
							class77.method535();
							class112.method697(var4, var5, 64, 64);
						}
					}

					class251.method1485(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = class364.field3074[var16];
						if (var17 != null) {
							var5 = (class520.field4226[var16] >> 8) * 64 - class296.field2735;
							var18 = (class520.field4226[var16] & 255) * 64 - class164.field1606;
							class77.method535();
							class136.method828(var17, var5, var18, class415.field3487, Client.field78);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (Client.field79) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						class77.method535();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = Client.field80[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = (var10 / 8 << 8) + var11 / 8;

									for (int var13 = 0; var13 < class520.field4226.length; ++var13) {
										if (var12 == class520.field4226[var13] && class51.field592[var13] != null) {
											int var14 = 8 * (var10 - var4);
											int var15 = 8 * (var11 - var5);
											class93.method616(class51.field592[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, Client.field78);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									class66.method488(var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = Client.field80[0][var16][var4];
							if (var5 == -1) {
								class112.method697(var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					class251.method1485(true);

					for (var16 = 0; var16 < 4; ++var16) {
						class77.method535();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = Client.field80[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < class520.field4226.length; ++var12) {
										if (var11 == class520.field4226[var12] && class364.field3074[var12] != null) {
											class38.method248(class364.field3074[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, 8 * (var10 & 7), var8, class415.field3487, Client.field78);
											break;
										}
									}
								}
							}
						}
					}
				}

				class251.method1485(true);
				class77.method535();
				class452.method2252(class415.field3487, Client.field78);
				class251.method1485(true);
				var16 = class38.field503;
				if (var16 > class358.field3038) {
					var16 = class358.field3038;
				}

				if (var16 < class358.field3038 - 1) {
					var16 = class358.field3038 - 1;
				}

				if (Client.field7) {
					class415.field3487.method1755(class38.field503);
				} else {
					class415.field3487.method1755(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						class540.method2589(var4, var5);
					}
				}

				class77.method535();
				class137.method829();
				class235.field2135.method1887();
				class160 var20;
				if (class466.field3999.method967()) {
					var20 = class85.method556(class129.field1201, Client.field68.field2426);
					var20.field1483.method333(1057001181);
					Client.field68.method1570(var20);
				}

				if (!Client.field79) {
					var4 = (class38.field501 - 6) / 8;
					var5 = (6 + class38.field501) / 8;
					var18 = (class384.field3237 - 6) / 8;
					var7 = (class384.field3237 + 6) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								class286.field2521.method1236("m" + var8 + "_" + var9);
								class286.field2521.method1236("l" + var8 + "_" + var9);
							}
						}
					}
				}

				class104.method675(30);
				class77.method535();
				class154.method884();
				var20 = class85.method556(class129.field1222, Client.field68.field2426);
				Client.field68.method1570(var20);
				class269.method1575();
			}
		}
	}
}
