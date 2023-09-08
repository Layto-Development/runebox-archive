public final class class37 {

	static class540 field185;

	static {
		field185 = new class540();
	}

	class37() throws Throwable {
	}

	public static int method166(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (field185) {
			field185.field4249 = var2;
			field185.field4275 = 9;
			field185.field4261 = var0;
			field185.field4250 = 0;
			field185.field4254 = var1;
			field185.field4259 = 0;
			field185.field4258 = 0;
			field185.field4251 = 0;
			field185.field4253 = 0;
			method163(field185);
			var1 -= field185.field4254;
			field185.field4249 = null;
			field185.field4261 = null;
			return var1;
		}
	}

	static void method162(class540 var0) {
		byte var2 = var0.field4257;
		int var3 = var0.field4244;
		int var4 = var0.field4265;
		int var5 = var0.field4263;
		int[] var6 = class117.field1427;
		int var7 = var0.field4262;
		byte[] var8 = var0.field4261;
		int var9 = var0.field4250;
		int var10 = var0.field4254;
		int var12 = var0.field4280 + 1;
		label61: while (true) {
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
				var2 = (byte) var5;
				var7 = var6[var7];
				byte var1 = (byte) var7;
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
						var1 = (byte) var7;
						var7 >>= 8;
						++var4;
						if (var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte) var7;
								var7 >>= 8;
								++var4;
								if (var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte) var7;
										var7 >>= 8;
										++var4;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte) var7;
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
		int var13 = var0.field4253;
		var0.field4253 += var10 - var10;
		if (var0.field4253 < var13) {
		}
		var0.field4257 = var2;
		var0.field4244 = var3;
		var0.field4265 = var4;
		var0.field4263 = var5;
		class117.field1427 = var6;
		var0.field4262 = var7;
		var0.field4261 = var8;
		var0.field4250 = var9;
		var0.field4254 = var10;
	}

	static void method163(class540 var0) {
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
		boolean var22 = false;
		Object var23 = null;
		Object var24 = null;
		Object var25 = null;
		var0.field4260 = -1562387581;
		if (class117.field1427 == null) {
			class117.field1427 = new int[var0.field4260 * 731544800];
		}
		boolean var26 = true;
		while (true) {
			while (var26) {
				byte var1 = method168(var0);
				if (var1 == 23) {
					return;
				}
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method168(var0);
				var1 = method164(var0);
				if (var1 != 0) {
				}
				var0.field4276 = 0;
				var1 = method168(var0);
				var0.field4276 = var0.field4276 << 8 | var1 & 255;
				var1 = method168(var0);
				var0.field4276 = var0.field4276 << 8 | var1 & 255;
				var1 = method168(var0);
				var0.field4276 = var0.field4276 << 8 | var1 & 255;
				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method164(var0);
					if (var1 == 1) {
						var0.field4269[var35] = true;
					} else {
						var0.field4269[var35] = false;
					}
				}
				for (var35 = 0; var35 < 256; ++var35) {
					var0.field4248[var35] = false;
				}
				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field4269[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method164(var0);
							if (var1 == 1) {
								var0.field4248[var35 * 16 + var36] = true;
							}
						}
					}
				}
				method165(var0);
				int var38 = var0.field4267 + 2;
				int var39 = method161(3, var0);
				int var40 = method161(15, var0);
				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;
					while (true) {
						var1 = method164(var0);
						if (var1 == 0) {
							var0.field4274[var35] = (byte) var36;
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
					var29 = var0.field4274[var35];
					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}
					var27[0] = var28;
					var0.field4273[var35] = var28;
				}
				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var50 = method161(5, var0);
					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method164(var0);
							if (var1 == 0) {
								var0.field4255[var37][var35] = (byte) var50;
								break;
							}
							var1 = method164(var0);
							if (var1 == 0) {
								++var50;
							} else {
								--var50;
							}
						}
					}
				}
				for (var37 = 0; var37 < var39; ++var37) {
					byte var2 = 32;
					byte var3 = 0;
					for (var35 = 0; var35 < var38; ++var35) {
						if (var0.field4255[var37][var35] > var3) {
							var3 = var0.field4255[var37][var35];
						}
						if (var0.field4255[var37][var35] < var2) {
							var2 = var0.field4255[var37][var35];
						}
					}
					method167(var0.field4268[var37], var0.field4277[var37], var0.field4278[var37], var0.field4255[var37], var2, var3, var38);
					var0.field4279[var37] = var2;
				}
				int var41 = var0.field4267 + 1;
				byte var42 = -1;
				var12 = false;
				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field4264[var35] = 0;
				}
				int var61 = 4095;
				int var59;
				int var60;
				for (var59 = 15; var59 >= 0; --var59) {
					for (var60 = 15; var60 >= 0; --var60) {
						var0.field4266[var61] = (byte) (var59 * 16 + var60);
						--var61;
					}
					var0.field4256[var59] = var61 + 1;
				}
				int var47 = 0;
				int var43 = var42 + 1;
				byte var44 = 50;
				byte var54 = var0.field4273[0];
				int var55 = var0.field4279[var54];
				int[] var56 = var0.field4268[var54];
				int[] var58 = var0.field4278[var54];
				int[] var57 = var0.field4277[var54];
				int var45 = var44 - 1;
				int var51 = var55;
				int var52;
				byte var53;
				for (var52 = method161(var55, var0); var52 > var56[var51]; var52 = var52 << 1 | var53) {
					++var51;
					var53 = method164(var0);
				}
				int var46 = var58[var52 - var57[var51]];
				while (true) {
					int[] var10000;
					int var10002;
					while (var46 != var41) {
						if (var46 != 0 && var46 != 1) {
							int var33 = var46 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field4256[0];
								for (var1 = var0.field4266[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field4266[var34] = var0.field4266[var34 - 1];
									var0.field4266[var34 - 1] = var0.field4266[var34 - 2];
									var0.field4266[var34 - 2] = var0.field4266[var34 - 3];
									var0.field4266[var34 - 3] = var0.field4266[var34 - 4];
								}
								while (var33 > 0) {
									var0.field4266[var30 + var33] = var0.field4266[var30 + var33 - 1];
									--var33;
								}
								var0.field4266[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field4256[var31] + var32;
								for (var1 = var0.field4266[var30]; var30 > var0.field4256[var31]; --var30) {
									var0.field4266[var30] = var0.field4266[var30 - 1];
								}
								for (var10002 = var0.field4256[var31]++; var31 > 0; --var31) {
									var10002 = var0.field4256[var31]--;
									var0.field4266[var0.field4256[var31]] = var0.field4266[var0.field4256[var31 - 1] + 16 - 1];
								}
								var10002 = var0.field4256[0]--;
								var0.field4266[var0.field4256[0]] = var1;
								if (var0.field4256[0] == 0) {
									var61 = 4095;
									for (var59 = 15; var59 >= 0; --var59) {
										for (var60 = 15; var60 >= 0; --var60) {
											var0.field4266[var61] = var0.field4266[var0.field4256[var59] + var60];
											--var61;
										}
										var0.field4256[var59] = var61 + 1;
									}
								}
							}
							var10002 = var0.field4264[var0.field4270[var1 & 255] & 255]++;
							class117.field1427[var47] = var0.field4270[var1 & 255] & 255;
							++var47;
							if (var45 == 0) {
								++var43;
								var45 = 50;
								var54 = var0.field4273[var43];
								var55 = var0.field4279[var54];
								var56 = var0.field4268[var54];
								var58 = var0.field4278[var54];
								var57 = var0.field4277[var54];
							}
							--var45;
							var51 = var55;
							for (var52 = method161(var55, var0); var52 > var56[var51]; var52 = var52 << 1 | var53) {
								++var51;
								var53 = method164(var0);
							}
							var46 = var58[var52 - var57[var51]];
						} else {
							int var48 = -1;
							int var49 = 1;
							do {
								if (var46 == 0) {
									var48 += var49;
								} else if (var46 == 1) {
									var48 += var49 * 2;
								}
								var49 *= 2;
								if (var45 == 0) {
									++var43;
									var45 = 50;
									var54 = var0.field4273[var43];
									var55 = var0.field4279[var54];
									var56 = var0.field4268[var54];
									var58 = var0.field4278[var54];
									var57 = var0.field4277[var54];
								}
								--var45;
								var51 = var55;
								for (var52 = method161(var55, var0); var52 > var56[var51]; var52 = var52 << 1 | var53) {
									++var51;
									var53 = method164(var0);
								}
								var46 = var58[var52 - var57[var51]];
							} while (var46 == 0 || var46 == 1);
							++var48;
							var1 = var0.field4270[var0.field4266[var0.field4256[0]] & 255];
							var10000 = var0.field4264;
							for (var10000[var1 & 255] += var48; var48 > 0; --var48) {
								class117.field1427[var47] = var1 & 255;
								++var47;
							}
						}
					}
					var0.field4244 = 0;
					var0.field4257 = 0;
					var0.field4272[0] = 0;
					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field4272[var35] = var0.field4264[var35 - 1];
					}
					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field4272;
						var10000[var35] += var0.field4272[var35 - 1];
					}
					for (var35 = 0; var35 < var47; ++var35) {
						var1 = (byte) (class117.field1427[var35] & 255);
						var10000 = class117.field1427;
						int var10001 = var0.field4272[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field4272[var1 & 255]++;
					}
					var0.field4262 = class117.field1427[var0.field4276] >> 8;
					var0.field4265 = 0;
					var0.field4262 = class117.field1427[var0.field4262];
					var0.field4263 = (byte) (var0.field4262 & 255);
					var0.field4262 >>= 8;
					++var0.field4265;
					var0.field4280 = var47;
					method162(var0);
					if (var0.field4265 == var0.field4280 + 1 && var0.field4244 == 0) {
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

	static byte method168(class540 var0) {
		return (byte) method161(8, var0);
	}

	static byte method164(class540 var0) {
		return (byte) method161(1, var0);
	}

	static int method161(int var0, class540 var1) {
		while (var1.field4259 < var0) {
			var1.field4258 = var1.field4258 << 8 | var1.field4249[var1.field4275] & 255;
			var1.field4259 += 8;
			++var1.field4275;
			++var1.field4251;
			if (var1.field4251 == 0) {
			}
		}
		int var2 = var1.field4258 >> var1.field4259 - var0 & (1 << var0) - 1;
		var1.field4259 -= var0;
		return var2;
	}

	static void method165(class540 var0) {
		var0.field4267 = 0;
		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field4248[var1]) {
				var0.field4270[var0.field4267] = (byte) var1;
				++var0.field4267;
			}
		}
	}

	static void method167(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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
