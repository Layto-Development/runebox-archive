public final class class328 {
	static class202 field2906;

	static {
		field2906 = new class202();
	}

	class328() throws Throwable {
	}

	public static int method1840(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(field2906) {
			field2906.field1871 = var2;
			field2906.field1897 = var4;
			field2906.field1883 = var0;
			field2906.field1872 = 0;
			field2906.field1876 = var1;
			field2906.field1881 = 0;
			field2906.field1880 = 0;
			field2906.field1873 = 0;
			field2906.field1875 = 0;
			method1837(field2906);
			var1 -= field2906.field1876;
			field2906.field1871 = null;
			field2906.field1883 = null;
			return var1;
		}
	}

	static void method1836(class202 var0) {
		byte var2 = var0.field1879;
		int var3 = var0.field1866;
		int var4 = var0.field1887;
		int var5 = var0.field1885;
		int[] var6 = class74.field826;
		int var7 = var0.field1884;
		byte[] var8 = var0.field1883;
		int var9 = var0.field1872;
		int var10 = var0.field1876;
		int var12 = var0.field1902 + 1;

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

		int var13 = var0.field1875;
		var0.field1875 += var10 - var10;
		if (var0.field1875 < var13) {
		}

		var0.field1879 = var2;
		var0.field1866 = var3;
		var0.field1887 = var4;
		var0.field1885 = var5;
		class74.field826 = var6;
		var0.field1884 = var7;
		var0.field1883 = var8;
		var0.field1872 = var9;
		var0.field1876 = var10;
	}

	static void method1837(class202 var0) {
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
		var0.field1882 = -1562387581;
		if (class74.field826 == null) {
			class74.field826 = new int[var0.field1882 * 731544800];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method1842(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1842(var0);
				var1 = method1838(var0);
				if (var1 != 0) {
				}

				var0.field1898 = 0;
				var1 = method1842(var0);
				var0.field1898 = var0.field1898 << 8 | var1 & 255;
				var1 = method1842(var0);
				var0.field1898 = var0.field1898 << 8 | var1 & 255;
				var1 = method1842(var0);
				var0.field1898 = var0.field1898 << 8 | var1 & 255;

				int var35;
				for (var35 = 0; var35 < 16; ++var35) {
					var1 = method1838(var0);
					if (var1 == 1) {
						var0.field1891[var35] = true;
					} else {
						var0.field1891[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; ++var35) {
					var0.field1870[var35] = false;
				}

				int var36;
				for (var35 = 0; var35 < 16; ++var35) {
					if (var0.field1891[var35]) {
						for (var36 = 0; var36 < 16; ++var36) {
							var1 = method1838(var0);
							if (var1 == 1) {
								var0.field1870[var35 * 16 + var36] = true;
							}
						}
					}
				}

				method1839(var0);
				int var38 = var0.field1889 + 2;
				int var39 = method1835(3, var0);
				int var40 = method1835(15, var0);

				for (var35 = 0; var35 < var40; ++var35) {
					var36 = 0;

					while (true) {
						var1 = method1838(var0);
						if (var1 == 0) {
							var0.field1896[var35] = (byte)var36;
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
					var29 = var0.field1896[var35];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field1895[var35] = var28;
				}

				int var37;
				for (var37 = 0; var37 < var39; ++var37) {
					int var49 = method1835(5, var0);

					for (var35 = 0; var35 < var38; ++var35) {
						while (true) {
							var1 = method1838(var0);
							if (var1 == 0) {
								var0.field1877[var37][var35] = (byte)var49;
								break;
							}

							var1 = method1838(var0);
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
						if (var0.field1877[var37][var35] > var3) {
							var3 = var0.field1877[var37][var35];
						}

						if (var0.field1877[var37][var35] < var2) {
							var2 = var0.field1877[var37][var35];
						}
					}

					method1841(var0.field1890[var37], var0.field1899[var37], var0.field1900[var37], var0.field1877[var37], var2, var3, var38);
					var0.field1901[var37] = var2;
				}

				int var41 = var0.field1889 + 1;
				int var42 = -1;
				byte var43 = 0;

				for (var35 = 0; var35 <= 255; ++var35) {
					var0.field1886[var35] = 0;
				}

				int var56 = 4095;

				int var54;
				int var55;
				for (var54 = 15; var54 >= 0; --var54) {
					for (var55 = 15; var55 >= 0; --var55) {
						var0.field1888[var56] = (byte)(var54 * 16 + var55);
						--var56;
					}

					var0.field1878[var54] = var56 + 1;
				}

				int var46 = 0;
				byte var53;
				if (var43 == 0) {
					++var42;
					var43 = 50;
					var53 = var0.field1895[var42];
					var22 = var0.field1901[var53];
					var23 = var0.field1890[var53];
					var25 = var0.field1900[var53];
					var24 = var0.field1899[var53];
				}

				int var44 = var43 - 1;
				int var50 = var22;

				int var51;
				byte var52;
				for (var51 = method1835(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
					++var50;
					var52 = method1838(var0);
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
								var30 = var0.field1878[0];

								for (var1 = var0.field1888[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field1888[var34] = var0.field1888[var34 - 1];
									var0.field1888[var34 - 1] = var0.field1888[var34 - 2];
									var0.field1888[var34 - 2] = var0.field1888[var34 - 3];
									var0.field1888[var34 - 3] = var0.field1888[var34 - 4];
								}

								while (var33 > 0) {
									var0.field1888[var30 + var33] = var0.field1888[var30 + var33 - 1];
									--var33;
								}

								var0.field1888[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field1878[var31] + var32;

								for (var1 = var0.field1888[var30]; var30 > var0.field1878[var31]; --var30) {
									var0.field1888[var30] = var0.field1888[var30 - 1];
								}

								for (var10002 = var0.field1878[var31]++; var31 > 0; --var31) {
									var10002 = var0.field1878[var31]--;
									var0.field1888[var0.field1878[var31]] = var0.field1888[var0.field1878[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field1878[0]--;
								var0.field1888[var0.field1878[0]] = var1;
								if (var0.field1878[0] == 0) {
									var56 = 4095;

									for (var54 = 15; var54 >= 0; --var54) {
										for (var55 = 15; var55 >= 0; --var55) {
											var0.field1888[var56] = var0.field1888[var0.field1878[var54] + var55];
											--var56;
										}

										var0.field1878[var54] = var56 + 1;
									}
								}
							}

							var10002 = var0.field1886[var0.field1892[var1 & 255] & 255]++;
							class74.field826[var46] = var0.field1892[var1 & 255] & 255;
							++var46;
							if (var44 == 0) {
								++var42;
								var44 = 50;
								var53 = var0.field1895[var42];
								var22 = var0.field1901[var53];
								var23 = var0.field1890[var53];
								var25 = var0.field1900[var53];
								var24 = var0.field1899[var53];
							}

							--var44;
							var50 = var22;

							for (var51 = method1835(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
								++var50;
								var52 = method1838(var0);
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
									var53 = var0.field1895[var42];
									var22 = var0.field1901[var53];
									var23 = var0.field1890[var53];
									var25 = var0.field1900[var53];
									var24 = var0.field1899[var53];
								}

								--var44;
								var50 = var22;

								for (var51 = method1835(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
									++var50;
									var52 = method1838(var0);
								}

								var45 = var25[var51 - var24[var50]];
							} while(var45 == 0 || var45 == 1);

							++var47;
							var1 = var0.field1892[var0.field1888[var0.field1878[0]] & 255];
							var10000 = var0.field1886;

							for (var10000[var1 & 255] += var47; var47 > 0; --var47) {
								class74.field826[var46] = var1 & 255;
								++var46;
							}
						}
					}

					var0.field1866 = 0;
					var0.field1879 = 0;
					var0.field1894[0] = 0;

					for (var35 = 1; var35 <= 256; ++var35) {
						var0.field1894[var35] = var0.field1886[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; ++var35) {
						var10000 = var0.field1894;
						var10000[var35] += var0.field1894[var35 - 1];
					}

					for (var35 = 0; var35 < var46; ++var35) {
						var1 = (byte)(class74.field826[var35] & 255);
						var10000 = class74.field826;
						int var10001 = var0.field1894[var1 & 255];
						var10000[var10001] |= var35 << 8;
						var10002 = var0.field1894[var1 & 255]++;
					}

					var0.field1884 = class74.field826[var0.field1898] >> 8;
					var0.field1887 = 0;
					var0.field1884 = class74.field826[var0.field1884];
					var0.field1885 = (byte)(var0.field1884 & 255);
					var0.field1884 >>= 8;
					++var0.field1887;
					var0.field1902 = var46;
					method1836(var0);
					if (var0.field1887 == var0.field1902 + 1 && var0.field1866 == 0) {
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

	static byte method1842(class202 var0) {
		return (byte)method1835(8, var0);
	}

	static byte method1838(class202 var0) {
		return (byte)method1835(1, var0);
	}

	static int method1835(int var0, class202 var1) {
		while (var1.field1881 < var0) {
			var1.field1880 = var1.field1880 << 8 | var1.field1871[var1.field1897] & 255;
			var1.field1881 += 8;
			++var1.field1897;
			++var1.field1873;
			if (var1.field1873 == 0) {
			}
		}

		int var2 = var1.field1880 >> var1.field1881 - var0 & (1 << var0) - 1;
		var1.field1881 -= var0;
		return var2;
	}

	static void method1839(class202 var0) {
		var0.field1889 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field1870[var1]) {
				var0.field1892[var0.field1889] = (byte)var1;
				++var0.field1889;
			}
		}

	}

	static void method1841(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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
