import java.util.concurrent.Callable;

public class class452 implements Callable {
	static class348 field3955;
	static int field3956;
	static int field3957;
	final class109 field3951;
	final class415 field3954;
	// $FF: synthetic field
	final class429 this$0;
	final class93 field3952;
	final int field3953;

	class452(class429 var1, class415 var2, class109 var3, class93 var4, int var5) {
		this.this$0 = var1;
		this.field3954 = var2;
		this.field3951 = var3;
		this.field3952 = var4;
		this.field3953 = var5;
	}

	public Object call() {
		this.field3954.method2137();
		class415[][] var1;
		if (class109.field1055 == this.field3951) {
			var1 = this.this$0.field3526;
		} else {
			var1 = this.this$0.field3532;
		}

		var1[this.field3953][this.field3952.method615()] = this.field3954;
		return null;
	}

	static final void method2252(class317 var0, class76[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((class38.field513[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if ((class38.field513[1][var4][var5] & 2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							var1[var6].method527(var4, var5);
						}
					}
				}
			}
		}

		class38.field510 += (int)(Math.random() * 5.0D) - 2;
		if (class38.field510 < -8) {
			class38.field510 = -8;
		}

		if (class38.field510 > 8) {
			class38.field510 = 8;
		}

		class38.field515 += (int)(Math.random() * 5.0D) - 2;
		if (class38.field515 < -16) {
			class38.field515 = -16;
		}

		if (class38.field515 > 16) {
			class38.field515 = 16;
		}

		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		for (var3 = 0; var3 < 4; ++var3) {
			byte[][] var48 = class394.field3316[var3];
			boolean var49 = true;
			boolean var50 = true;
			boolean var7 = true;
			boolean var8 = true;
			boolean var9 = true;
			var10 = (int)Math.sqrt(5100.0D);
			var11 = var10 * 768 >> 8;

			int var20;
			int var21;
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var14 = class38.field511[var3][var13 + 1][var12] - class38.field511[var3][var13 - 1][var12];
					var15 = class38.field511[var3][var13][var12 + 1] - class38.field511[var3][var13][var12 - 1];
					var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
					var21 = (var48[var13][var12] >> 1) + (var48[var13][var12 + 1] >> 3) + (var48[var13 - 1][var12] >> 2) + (var48[var13 + 1][var12] >> 3) + (var48[var13][var12 - 1] >> 2);
					class539.field4278[var13][var12] = var20 - var21;
				}
			}

			for (var12 = 0; var12 < 104; ++var12) {
				class155.field1455[var12] = 0;
				class255.field2361[var12] = 0;
				class38.field505[var12] = 0;
				class224.field2041[var12] = 0;
				class139.field1340[var12] = 0;
			}

			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						long var54 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var54;
						var18 = class38.field504[var3][var14][var13] & var17;
						if (var18 > 0) {
							var20 = var18 - 1;
							class32 var59 = (class32)class32.field477.method1890((long)var20);
							class32 var57;
							if (var59 != null) {
								var57 = var59;
							} else {
								byte[] var22 = class32.field476.method1212(1, var20);
								var59 = new class32();
								if (null != var22) {
									var59.method223(new class42(var22), var20);
								}

								var59.method222();
								class32.field477.method1889(var59, (long)var20);
								var57 = var59;
							}

							var10000 = class155.field1455;
							var10000[var13] += var57.field482;
							var10000 = class255.field2361;
							var10000[var13] += var57.field480;
							var10000 = class38.field505;
							var10000[var13] += var57.field479;
							var10000 = class224.field2041;
							var10000[var13] += var57.field481;
							var10002 = class139.field1340[var13]++;
						}
					}

					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						long var55 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var18 = (int)var55;
						var19 = class38.field504[var3][var15][var13] & var18;
						if (var19 > 0) {
							var21 = var19 - 1;
							class32 var60 = (class32)class32.field477.method1890((long)var21);
							class32 var58;
							if (null != var60) {
								var58 = var60;
							} else {
								byte[] var23 = class32.field476.method1212(1, var21);
								var60 = new class32();
								if (null != var23) {
									var60.method223(new class42(var23), var21);
								}

								var60.method222();
								class32.field477.method1889(var60, (long)var21);
								var58 = var60;
							}

							var10000 = class155.field1455;
							var10000[var13] -= var58.field482;
							var10000 = class255.field2361;
							var10000[var13] -= var58.field480;
							var10000 = class38.field505;
							var10000[var13] -= var58.field479;
							var10000 = class224.field2041;
							var10000[var13] -= var58.field481;
							var10002 = class139.field1340[var13]--;
						}
					}
				}

				if (var12 >= 1 && var12 < 103) {
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;
					var17 = 0;

					for (var18 = -5; var18 < 109; ++var18) {
						var19 = var18 + 5;
						if (var19 >= 0 && var19 < 104) {
							var13 += class155.field1455[var19];
							var14 += class255.field2361[var19];
							var15 += class38.field505[var19];
							var16 += class224.field2041[var19];
							var17 += class139.field1340[var19];
						}

						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class155.field1455[var20];
							var14 -= class255.field2361[var20];
							var15 -= class38.field505[var20];
							var16 -= class224.field2041[var20];
							var17 -= class139.field1340[var20];
						}

						if (var18 >= 1 && var18 < 103 && (!Client.field7 || (class38.field513[0][var12][var18] & 2) != 0 || (class38.field513[var3][var12][var18] & 16) == 0)) {
							if (var3 < class38.field503) {
								class38.field503 = var3;
							}

							long var61 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var62 = (int)var61;
							int var24 = class38.field504[var3][var12][var18] & var62;
							int var25 = class54.field604[var3][var12][var18] & var62;
							if (var24 > 0 || var25 > 0) {
								int var26 = class38.field511[var3][var12][var18];
								int var27 = class38.field511[var3][var12 + 1][var18];
								int var28 = class38.field511[var3][var12 + 1][var18 + 1];
								int var29 = class38.field511[var3][var12][var18 + 1];
								int var30 = class539.field4278[var12][var18];
								int var31 = class539.field4278[var12 + 1][var18];
								int var32 = class539.field4278[var12 + 1][var18 + 1];
								int var33 = class539.field4278[var12][var18 + 1];
								int var34 = -1;
								int var35 = -1;
								int var36;
								int var37;
								int var38;
								if (var24 > 0) {
									var36 = var13 * 256 / var16;
									var37 = var14 / var17;
									var38 = var15 / var17;
									var34 = class188.method1037(var36, var37, var38);
									var36 = var36 + class38.field510 & 255;
									var38 += class38.field515;
									if (var38 < 0) {
										var38 = 0;
									} else if (var38 > 255) {
										var38 = 255;
									}

									var35 = class188.method1037(var36, var37, var38);
								}

								class207 var39;
								if (var3 > 0) {
									boolean var63 = true;
									if (var24 == 0 && class439.field3868[var3][var12][var18] != 0) {
										var63 = false;
									}

									if (var25 > 0) {
										var38 = var25 - 1;
										var39 = (class207)class207.field1917.method1890((long)var38);
										class207 var64;
										if (null != var39) {
											var64 = var39;
										} else {
											byte[] var40 = class207.field1922.method1212(4, var38);
											var39 = new class207();
											if (var40 != null) {
												var39.method1157(new class42(var40), var38);
											}

											var39.method1156();
											class207.field1917.method1889(var39, (long)var38);
											var64 = var39;
										}

										if (!var64.field1913) {
											var63 = false;
										}
									}

									if (var63 && var27 == var26 && var28 == var26 && var26 == var29) {
										var10000 = class244.field2223[var3][var12];
										var10000[var18] |= 2340;
									}
								}

								var36 = 0;
								if (var35 != -1) {
									var36 = class133.field1288[class261.method1516(var35, 96)];
								}

								if (var25 == 0) {
									var0.method1793(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, class261.method1516(var34, var30), class261.method1516(var34, var31), class261.method1516(var34, var32), class261.method1516(var34, var33), 0, 0, 0, 0, var36, 0);
								} else {
									var37 = 1 + class439.field3868[var3][var12][var18];
									byte var65 = class417.field3491[var3][var12][var18];
									int var66 = var25 - 1;
									class207 var41 = (class207)class207.field1917.method1890((long)var66);
									if (null != var41) {
										var39 = var41;
									} else {
										byte[] var42 = class207.field1922.method1212(4, var66);
										var41 = new class207();
										if (var42 != null) {
											var41.method1157(new class42(var42), var66);
										}

										var41.method1156();
										class207.field1917.method1889(var41, (long)var66);
										var39 = var41;
									}

									int var67 = var39.field1910;
									int var43;
									int var44;
									int var45;
									int var46;
									if (var67 >= 0) {
										var44 = class133.field1293.field389.method1945(var67);
										var43 = -1;
									} else if (var39.field1911 == 16711935) {
										var43 = -2;
										var67 = -1;
										var44 = -2;
									} else {
										var43 = class188.method1037(var39.field1915, var39.field1916, var39.field1921);
										var45 = class38.field510 + var39.field1915 & 255;
										var46 = var39.field1921 + class38.field515;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = class188.method1037(var45, var39.field1916, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = class133.field1288[Client.method39(var44, 96)];
									}

									if (var39.field1914 != -1) {
										var46 = class38.field510 + var39.field1919 & 255;
										int var47 = class38.field515 + var39.field1920;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = class188.method1037(var46, var39.field1918, var47);
										var45 = class133.field1288[Client.method39(var44, 96)];
									}

									var0.method1793(var3, var12, var18, var37, var65, var67, var26, var27, var28, var29, class261.method1516(var34, var30), class261.method1516(var34, var31), class261.method1516(var34, var32), class261.method1516(var34, var33), Client.method39(var43, var30), Client.method39(var43, var31), Client.method39(var43, var32), Client.method39(var43, var33), var36, var45);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method1808(var3, var13, var12, class277.method1592(var3, var13, var12));
				}
			}

			class38.field504[var3] = (short[][])null;
			class54.field604[var3] = (short[][])null;
			class439.field3868[var3] = (byte[][])null;
			class417.field3491[var3] = (byte[][])null;
			class394.field3316[var3] = (byte[][])null;
		}

		var0.method1773(-50, -10, -50);

		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if ((class38.field513[1][var3][var4] & 2) == 2) {
					var0.method1756(var3, var4);
				}
			}
		}

		var3 = 1;
		var4 = 2;
		var5 = 4;

		for (var6 = 0; var6 < 4; ++var6) {
			if (var6 > 0) {
				var3 <<= 3;
				var4 <<= 3;
				var5 <<= 3;
			}

			for (int var51 = 0; var51 <= var6; ++var51) {
				for (int var52 = 0; var52 <= 104; ++var52) {
					for (int var53 = 0; var53 <= 104; ++var53) {
						short var56;
						if ((class244.field2223[var51][var53][var52] & var3) != 0) {
							var10 = var52;
							var11 = var52;
							var12 = var51;

							for (var13 = var51; var10 > 0 && (class244.field2223[var51][var53][var10 - 1] & var3) != 0; --var10) {
							}

							while (var11 < 104 && (class244.field2223[var51][var53][var11 + 1] & var3) != 0) {
								++var11;
							}

							label367:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class244.field2223[var12 - 1][var53][var14] & var3) == 0) {
										break label367;
									}
								}

								--var12;
							}

							label356:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class244.field2223[var13 + 1][var53][var14] & var3) == 0) {
										break label356;
									}
								}

								++var13;
							}

							var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
							if (var14 >= 8) {
								var56 = 240;
								var16 = class38.field511[var13][var53][var10] - var56;
								var17 = class38.field511[var12][var53][var10];
								class317.method1757(var6, 1, var53 * 128, var53 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class244.field2223[var18][var53];
										var10000[var19] &= ~var3;
									}
								}
							}
						}

						if ((class244.field2223[var51][var53][var52] & var4) != 0) {
							var10 = var53;
							var11 = var53;
							var12 = var51;

							for (var13 = var51; var10 > 0 && (class244.field2223[var51][var10 - 1][var52] & var4) != 0; --var10) {
							}

							while (var11 < 104 && (class244.field2223[var51][var11 + 1][var52] & var4) != 0) {
								++var11;
							}

							label420:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class244.field2223[var12 - 1][var14][var52] & var4) == 0) {
										break label420;
									}
								}

								--var12;
							}

							label409:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class244.field2223[var13 + 1][var14][var52] & var4) == 0) {
										break label409;
									}
								}

								++var13;
							}

							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var56 = 240;
								var16 = class38.field511[var13][var10][var52] - var56;
								var17 = class38.field511[var12][var10][var52];
								class317.method1757(var6, 2, var10 * 128, 128 + var11 * 128, var52 * 128, var52 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class244.field2223[var18][var19];
										var10000[var52] &= ~var4;
									}
								}
							}
						}

						if ((class244.field2223[var51][var53][var52] & var5) != 0) {
							var10 = var53;
							var11 = var53;
							var12 = var52;

							for (var13 = var52; var12 > 0 && (class244.field2223[var51][var53][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < 104 && (class244.field2223[var51][var53][var13 + 1] & var5) != 0) {
								++var13;
							}

							label473:
							while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class244.field2223[var51][var10 - 1][var14] & var5) == 0) {
										break label473;
									}
								}

								--var10;
							}

							label462:
							while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class244.field2223[var51][var11 + 1][var14] & var5) == 0) {
										break label462;
									}
								}

								++var11;
							}

							if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
								var14 = class38.field511[var51][var10][var12];
								class317.method1757(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class244.field2223[var51][var15];
										var10000[var16] &= ~var5;
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
