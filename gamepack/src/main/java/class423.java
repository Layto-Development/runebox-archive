import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tt")
public final class class423 {
	@ObfInfo(name = "ap", desc = "Lte;")
	static class307 field3233;

	static {
		field3233 = new class307();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class423() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "([BI[BII)I")
	public static int method2216(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(field3233) {
			field3233.field2484 = var2;
			field3233.field2510 = var4;
			field3233.field2496 = var0;
			field3233.field2485 = 0;
			field3233.field2489 = var1;
			field3233.field2494 = 0;
			field3233.field2493 = 0;
			field3233.field2486 = 0;
			field3233.field2488 = 0;
			method2213(field3233);
			var1 -= field3233.field2489;
			field3233.field2484 = null;
			field3233.field2496 = null;
			return var1;
		}
	}

	@ObfInfo(name = "ae", desc = "(Lte;)V")
	static void method2212(class307 var0) {
		byte var2 = var0.field2492;
		int var3 = var0.field2479;
		int var4 = var0.field2500;
		int var5 = var0.field2498;
		int[] var6 = class120.field1135;
		int var7 = var0.field2497;
		byte[] var8 = var0.field2496;
		int var9 = var0.field2485;
		int var10 = var0.field2489;
		int var12 = var0.field2515 + 1;

		label61:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label61;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label61;
						}

						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}

					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						++var4;
						if (var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								++var4;
								if (var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										++var4;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										++var4;
									}
								}
							}
						}
						continue label61;
					}

					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.field2488;
		var0.field2488 += var10 - var10;
		if (var0.field2488 < var13) {
		}

		var0.field2492 = var2;
		var0.field2479 = var3;
		var0.field2500 = var4;
		var0.field2498 = var5;
		class120.field1135 = var6;
		var0.field2497 = var7;
		var0.field2496 = var8;
		var0.field2485 = var9;
		var0.field2489 = var10;
	}

	@ObfInfo(name = "ao", desc = "(Lte;)V")
	static void method2213(class307 var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.field2495 = -1562387581;
		if (class120.field1135 == null) {
			class120.field1135 = new int[var0.field2495 * 731544800];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method2218(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2218(var0);
				var1 = method2214(var0);
				if (var1 != 0) {
				}

				var0.field2511 = 0;
				var1 = method2218(var0);
				var0.field2511 = var0.field2511 << 8 | var1 & 255;
				var1 = method2218(var0);
				var0.field2511 = var0.field2511 << 8 | var1 & 255;
				var1 = method2218(var0);
				var0.field2511 = var0.field2511 << 8 | var1 & 255;

				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method2214(var0);
					if (var1 == 1) {
						var0.field2504[var35] = true;
					} else {
						var0.field2504[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; ++var35) {
					var0.field2483[var35] = false;
				}

				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field2504[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method2214(var0);
							if (var1 == 1) {
								var0.field2483[var35 * 16 + var36] = true;
							}
						}
					}
				}

				method2215(var0);
				int var38 = var0.field2502 + 2;
				int var39 = method2211(3, var0);
				int var40 = method2211(15, var0);

				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;

					while (true) {
						var1 = method2214(var0);
						if (var1 == 0) {
							var0.field2509[var35] = (byte)var36;
							break;
						}

						++var36;
					}
				}

				byte[] var27 = new byte[6];

				byte var29;
				for (var29 = 0; var29 < var39; var27[var29] = var29++) {
				}

				for (var35 = 0; var35 < var40; ++var35) {
					var29 = var0.field2509[var35];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field2508[var35] = var28;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var49 = method2211(5, var0);

					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method2214(var0);
							if (var1 == 0) {
								var0.field2490[var37][var35] = (byte)var49;
								break;
							}

							var1 = method2214(var0);
							if (var1 == 0) {
								++var49;
							} else {
								--var49;
							}
						}
					}
				}

				for (var37 = 0; var37 < var39; ++var37) {
					byte var2 = 32;
					byte var3 = 0;

					for (var35 = 0; var35 < var38; ++var35) {
						if (var0.field2490[var37][var35] > var3) {
							var3 = var0.field2490[var37][var35];
						}

						if (var0.field2490[var37][var35] < var2) {
							var2 = var0.field2490[var37][var35];
						}
					}

					method2217(var0.field2503[var37], var0.field2512[var37], var0.field2513[var37], var0.field2490[var37], var2, var3, var38);
					var0.field2514[var37] = var2;
				}

				int var41 = var0.field2502 + 1;
				int var42 = -1;
				byte var43 = 0;

				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field2499[var35] = 0;
				}

				int var56 = 4095;

				int var54;
				int var55;
				for (var54 = 15; var54 >= 0; --var54) {
					for (var55 = 15; var55 >= 0; --var55) {
						var0.field2501[var56] = (byte)(var54 * 16 + var55);
						--var56;
					}

					var0.field2491[var54] = var56 + 1;
				}

				int var46 = 0;
				byte var53;
				if (var43 == 0) {
					++var42;
					var43 = 50;
					var53 = var0.field2508[var42];
					var22 = var0.field2514[var53];
					var23 = var0.field2503[var53];
					var25 = var0.field2513[var53];
					var24 = var0.field2512[var53];
				}

				int var44 = var43 - 1;
				int var50 = var22;

				int var51;
				byte var52;
				for (var51 = method2211(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
					++var50;
					var52 = method2214(var0);
				}

				int var45 = var25[var51 - var24[var50]];

				while (true) {
					int[] var10000;
					int var10002;
					while (var45 != var41) {
						if (var45 != 0 && var45 != 1) {
							int var33 = var45 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field2491[0];

								for (var1 = var0.field2501[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field2501[var34] = var0.field2501[var34 - 1];
									var0.field2501[var34 - 1] = var0.field2501[var34 - 2];
									var0.field2501[var34 - 2] = var0.field2501[var34 - 3];
									var0.field2501[var34 - 3] = var0.field2501[var34 - 4];
								}

								while (var33 > 0) {
									var0.field2501[var30 + var33] = var0.field2501[var30 + var33 - 1];
									--var33;
								}

								var0.field2501[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field2491[var31] + var32;

								for (var1 = var0.field2501[var30]; var30 > var0.field2491[var31]; --var30) {
									var0.field2501[var30] = var0.field2501[var30 - 1];
								}

								for (var10002 = var0.field2491[var31]++; var31 > 0; --var31) {
									var10002 = var0.field2491[var31]--;
									var0.field2501[var0.field2491[var31]] = var0.field2501[var0.field2491[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field2491[0]--;
								var0.field2501[var0.field2491[0]] = var1;
								if (var0.field2491[0] == 0) {
									var56 = 4095;

									for (var54 = 15; var54 >= 0; --var54) {
										for (var55 = 15; var55 >= 0; --var55) {
											var0.field2501[var56] = var0.field2501[var0.field2491[var54] + var55];
											--var56;
										}

										var0.field2491[var54] = var56 + 1;
									}
								}
							}

							var10002 = var0.field2499[var0.field2505[var1 & 255] & 255]++;
							class120.field1135[var46] = var0.field2505[var1 & 255] & 255;
							++var46;
							if (var44 == 0) {
								++var42;
								var44 = 50;
								var53 = var0.field2508[var42];
								var22 = var0.field2514[var53];
								var23 = var0.field2503[var53];
								var25 = var0.field2513[var53];
								var24 = var0.field2512[var53];
							}

							--var44;
							var50 = var22;

							for (var51 = method2211(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
								++var50;
								var52 = method2214(var0);
							}

							var45 = var25[var51 - var24[var50]];
						} else {
							int var47 = -1;
							int var48 = 1;

							do {
								if (var45 == 0) {
									var47 += var48;
								} else if (var45 == 1) {
									var47 += var48 * 2;
								}

								var48 *= 2;
								if (var44 == 0) {
									++var42;
									var44 = 50;
									var53 = var0.field2508[var42];
									var22 = var0.field2514[var53];
									var23 = var0.field2503[var53];
									var25 = var0.field2513[var53];
									var24 = var0.field2512[var53];
								}

								--var44;
								var50 = var22;

								for (var51 = method2211(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
									++var50;
									var52 = method2214(var0);
								}

								var45 = var25[var51 - var24[var50]];
							} while(var45 == 0 || var45 == 1);

							++var47;
							var1 = var0.field2505[var0.field2501[var0.field2491[0]] & 255];
							var10000 = var0.field2499;

							for (var10000[var1 & 255] += var47; var47 > 0; --var47) {
								class120.field1135[var46] = var1 & 255;
								++var46;
							}
						}
					}

					var0.field2479 = 0;
					var0.field2492 = 0;
					var0.field2507[0] = 0;

					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field2507[var35] = var0.field2499[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field2507;
						var10000[var35] += var0.field2507[var35 - 1];
					}

					for (var35 = 0; var35 < var46; ++var35) {
						var1 = (byte)(class120.field1135[var35] & 255);
						var10000 = class120.field1135;
						int var10001 = var0.field2507[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field2507[var1 & 255]++;
					}

					var0.field2497 = class120.field1135[var0.field2511] >> 8;
					var0.field2500 = 0;
					var0.field2497 = class120.field1135[var0.field2497];
					var0.field2498 = (byte)(var0.field2497 & 255);
					var0.field2497 >>= 8;
					++var0.field2500;
					var0.field2515 = var46;
					method2212(var0);
					if (var0.field2500 == var0.field2515 + 1 && var0.field2479 == 0) {
						var26 = true;
						break;
					}

					var26 = false;
					break;
				}
			}

			return;
		}
	}

	@ObfInfo(name = "at", desc = "(Lte;)B")
	static byte method2218(class307 var0) {
		return (byte)method2211(8, var0);
	}

	@ObfInfo(name = "ac", desc = "(Lte;)B")
	static byte method2214(class307 var0) {
		return (byte)method2211(1, var0);
	}

	@ObfInfo(name = "ai", desc = "(ILte;)I")
	static int method2211(int var0, class307 var1) {
		while (var1.field2494 < var0) {
			var1.field2493 = var1.field2493 << 8 | var1.field2484[var1.field2510] & 255;
			var1.field2494 += 8;
			++var1.field2510;
			++var1.field2486;
			if (var1.field2486 == 0) {
			}
		}

		int var2 = var1.field2493 >> var1.field2494 - var0 & (1 << var0) - 1;
		var1.field2494 -= var0;
		return var2;
	}

	@ObfInfo(name = "az", desc = "(Lte;)V")
	static void method2215(class307 var0) {
		var0.field2502 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field2483[var1]) {
				var0.field2505[var0.field2502] = (byte)var1;
				++var0.field2502;
			}
		}

	}

	@ObfInfo(name = "ap", desc = "([I[I[I[BIII)V")
	static void method2217(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}
}
