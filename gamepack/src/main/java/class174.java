import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.BitSet;
import java.util.Random;

public class class174 extends class462 {
	static class342 field1690;
	int field1692;
	BitSet field1691;

	class174(int var1) {
		this.field1692 = var1;
		this.field1691 = new BitSet(128);
	}

	static final int method992(long var0, String var2) {
		Random var4 = new Random();
		class42 var5 = new class42(128);
		class42 var6 = new class42(128);
		int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
		var5.method267(10);

		int var8;
		for (var8 = 0; var8 < 4; ++var8) {
			var5.method333(var4.nextInt());
		}

		var5.method333(var7[0]);
		var5.method333(var7[1]);
		var5.method304(var0);
		var5.method304(0L);

		for (var8 = 0; var8 < 4; ++var8) {
			var5.method333(var4.nextInt());
		}

		var5.method311(class423.field3514, class423.field3515);
		var6.method267(10);

		for (var8 = 0; var8 < 3; ++var8) {
			var6.method333(var4.nextInt());
		}

		var6.method304(var4.nextLong());
		var6.method268(var4.nextLong());
		class5.method53(var6);
		var6.method304(var4.nextLong());
		var6.method311(class423.field3514, class423.field3515);
		var8 = class431.method2196(var2);
		if (var8 % 8 != 0) {
			var8 += 8 - var8 % 8;
		}

		class42 var9 = new class42(var8);
		var9.method270(var2);
		var9.field527 = var8;
		var9.method295(var7);
		class42 var10 = new class42(var9.field527 + var6.field527 + var5.field527 + 5);
		var10.method267(2);
		var10.method267(var5.field527);
		var10.method272(var5.field525, 0, var5.field527);
		var10.method267(var6.field527);
		var10.method272(var6.field525, 0, var6.field527);
		var10.method308(var9.field527);
		var10.method272(var9.field525, 0, var9.field527);
		byte[] var12 = var10.field525;
		String var11 = class533.method2569(var12, 0, var12.length);
		String var13 = var11;

		try {
			URL var14 = new URL(class230.method1326("services", false) + "m=accountappeal/login.ws");
			URLConnection var15 = var14.openConnection();
			var15.setDoInput(true);
			var15.setDoOutput(true);
			var15.setConnectTimeout(5000);
			OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
			String var18 = "data2=" + class175.method996(var13) + "&dest=";
			int var20 = "passwordchoice.ws".length();
			StringBuilder var21 = new StringBuilder(var20);

			for (int var22 = 0; var22 < var20; ++var22) {
				char var23 = "passwordchoice.ws".charAt(var22);
				if ((var23 < 'a' || var23 > 'z') && (var23 < 'A' || var23 > 'Z') && (var23 < '0' || var23 > '9') && var23 != '.' && var23 != '-' && var23 != '*' && var23 != '_') {
					if (var23 == ' ') {
						var21.append('+');
					} else {
						byte var24 = class435.method2206(var23);
						var21.append('%');
						int var25 = var24 >> 4 & 15;
						if (var25 >= 10) {
							var21.append((char)(var25 + 55));
						} else {
							var21.append((char)(var25 + 48));
						}

						var25 = var24 & 15;
						if (var25 >= 10) {
							var21.append((char)(var25 + 55));
						} else {
							var21.append((char)(var25 + 48));
						}
					}
				} else {
					var21.append(var23);
				}
			}

			String var19 = var21.toString();
			var16.write(var18 + var19);
			var16.flush();
			InputStream var27 = var15.getInputStream();
			var10 = new class42(new byte[1000]);

			do {
				int var28 = var27.read(var10.field525, var10.field527, 1000 - var10.field527);
				if (var28 == -1) {
					var16.close();
					var27.close();
					String var29 = new String(var10.field525);
					if (var29.startsWith("OFFLINE")) {
						return 4;
					} else if (var29.startsWith("WRONG")) {
						return 7;
					} else if (var29.startsWith("RELOAD")) {
						return 3;
					} else if (var29.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var10.method339(var7);

						while (var10.field527 > 0 && var10.field525[var10.field527 - 1] == 0) {
							--var10.field527;
						}

						var29 = new String(var10.field525, 0, var10.field527);
						if (class353.method1927(var29)) {
							class289.method1661(var29, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var10.field527 += var28;
			} while(var10.field527 < 1000);

			return 5;
		} catch (Throwable var26) {
			var26.printStackTrace();
			return 5;
		}
	}

	static void method993(String var0, String var1, String var2) {
		class116.field1101 = var0;
		class116.field1099 = var1;
		class116.field1100 = var2;
	}

	static final void method991(class163 var0, int var1) {
		if (var0.field1581 >= Client.field306) {
			class537.method2581(var0);
		} else {
			int var5;
			int var6;
			int var8;
			int var9;
			int var13;
			if (var0.field1582 >= Client.field306) {
				boolean var3 = Client.field306 == var0.field1582 || var0.field1570 == -1 || var0.field1587 != 0;
				if (!var3) {
					class393 var4 = class114.method702(var0.field1570);
					if (var4 != null && !var4.method2062()) {
						var3 = var0.field1572 + 1 > var4.field3307[var0.field1571];
					} else {
						var3 = true;
					}
				}

				if (var3) {
					var13 = var0.field1582 - var0.field1581;
					var5 = Client.field306 - var0.field1581;
					var6 = var0.field1529 * 64 + var0.field1577 * 128;
					int var7 = var0.field1529 * 64 + var0.field1579 * 128;
					var8 = var0.field1575 * 128 + var0.field1529 * 64;
					var9 = var0.field1529 * 64 + var0.field1545 * 128;
					var0.field1555 = ((var13 - var5) * var6 + var5 * var8) / var13;
					var0.field1526 = (var5 * var9 + var7 * (var13 - var5)) / var13;
				}

				var0.field1599 = 0;
				var0.field1566 = var0.field1583;
				var0.field1527 = var0.field1566;
			} else {
				var0.field1538 = var0.field1531;
				if (var0.field1573 == 0) {
					var0.field1599 = 0;
				} else {
					label297: {
						if (var0.field1570 != -1 && var0.field1587 == 0) {
							class393 var12 = class114.method702(var0.field1570);
							if (var0.field1589 > 0 && var12.field3309 == 0) {
								++var0.field1599;
								break label297;
							}

							if (var0.field1589 <= 0 && var12.field3310 == 0) {
								++var0.field1599;
								break label297;
							}
						}

						int var14 = var0.field1555;
						var13 = var0.field1526;
						var5 = 128 * var0.field1600[var0.field1573 - 1] + var0.field1529 * 64;
						var6 = var0.field1529 * 64 + 128 * var0.field1597[var0.field1573 - 1];
						if (var14 < var5) {
							if (var13 < var6) {
								var0.field1566 = 1280;
							} else if (var13 > var6) {
								var0.field1566 = 1792;
							} else {
								var0.field1566 = 1536;
							}
						} else if (var14 > var5) {
							if (var13 < var6) {
								var0.field1566 = 768;
							} else if (var13 > var6) {
								var0.field1566 = 256;
							} else {
								var0.field1566 = 512;
							}
						} else if (var13 < var6) {
							var0.field1566 = 1024;
						} else if (var13 > var6) {
							var0.field1566 = 0;
						}

						class394 var15 = var0.field1598[var0.field1573 - 1];
						if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
							var8 = var0.field1566 - var0.field1527 & 2047;
							if (var8 > 1024) {
								var8 -= 2048;
							}

							var9 = var0.field1535;
							if (var8 >= -256 && var8 <= 256) {
								var9 = var0.field1534;
							} else if (var8 >= 256 && var8 < 768) {
								var9 = var0.field1584;
							} else if (var8 >= -768 && var8 <= -256) {
								var9 = var0.field1536;
							}

							if (var9 == -1) {
								var9 = var0.field1534;
							}

							var0.field1538 = var9;
							int var10 = 4;
							boolean var11 = true;
							if (var0 instanceof class102) {
								var11 = ((class102)var0).field1018.field3143;
							}

							if (var11) {
								if (var0.field1566 != var0.field1527 && var0.field1560 == -1 && var0.field1594 != 0) {
									var10 = 2;
								}

								if (var0.field1573 > 2) {
									var10 = 6;
								}

								if (var0.field1573 > 3) {
									var10 = 8;
								}

								if (var0.field1599 > 0 && var0.field1573 > 1) {
									var10 = 8;
									--var0.field1599;
								}
							} else {
								if (var0.field1573 > 1) {
									var10 = 6;
								}

								if (var0.field1573 > 2) {
									var10 = 8;
								}

								if (var0.field1599 > 0 && var0.field1573 > 1) {
									var10 = 8;
									--var0.field1599;
								}
							}

							if (var15 == class394.field3314) {
								var10 <<= 1;
							} else if (var15 == class394.field3313) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var0.field1538 == var0.field1534 && var0.field1595 != -1) {
									var0.field1538 = var0.field1595;
								} else if (var0.field1535 == var0.field1538 && var0.field1539 != -1) {
									var0.field1538 = var0.field1539;
								} else if (var0.field1538 == var0.field1536 && var0.field1580 != -1) {
									var0.field1538 = var0.field1580;
								} else if (var0.field1584 == var0.field1538 && var0.field1541 != -1) {
									var0.field1538 = var0.field1541;
								}
							} else if (var10 <= 2) {
								if (var0.field1538 == var0.field1534 && var0.field1542 != -1) {
									var0.field1538 = var0.field1542;
								} else if (var0.field1538 == var0.field1535 && var0.field1543 != -1) {
									var0.field1538 = var0.field1543;
								} else if (var0.field1536 == var0.field1538 && var0.field1544 != -1) {
									var0.field1538 = var0.field1544;
								} else if (var0.field1584 == var0.field1538 && var0.field1574 != -1) {
									var0.field1538 = var0.field1574;
								}
							}

							if (var5 != var14 || var6 != var13) {
								if (var14 < var5) {
									var0.field1555 += var10;
									if (var0.field1555 > var5) {
										var0.field1555 = var5;
									}
								} else if (var14 > var5) {
									var0.field1555 -= var10;
									if (var0.field1555 < var5) {
										var0.field1555 = var5;
									}
								}

								if (var13 < var6) {
									var0.field1526 += var10;
									if (var0.field1526 > var6) {
										var0.field1526 = var6;
									}
								} else if (var13 > var6) {
									var0.field1526 -= var10;
									if (var0.field1526 < var6) {
										var0.field1526 = var6;
									}
								}
							}

							if (var5 == var0.field1555 && var0.field1526 == var6) {
								--var0.field1573;
								if (var0.field1589 > 0) {
									--var0.field1589;
								}
							}
						} else {
							var0.field1555 = var5;
							var0.field1526 = var6;
							--var0.field1573;
							if (var0.field1589 > 0) {
								--var0.field1589;
							}
						}
					}
				}
			}
		}

		if (var0.field1555 < 128 || var0.field1526 < 128 || var0.field1555 >= 13184 || var0.field1526 >= 13184) {
			var0.field1570 = -1;
			var0.field1581 = 0;
			var0.field1582 = 0;
			var0.method907();
			var0.field1555 = 128 * var0.field1600[0] + var0.field1529 * 64;
			var0.field1526 = var0.field1597[0] * 128 + var0.field1529 * 64;
			var0.method900();
		}

		if (var0 == class82.field863 && (var0.field1555 < 1536 || var0.field1526 < 1536 || var0.field1555 >= 11776 || var0.field1526 >= 11776)) {
			var0.field1570 = -1;
			var0.field1581 = 0;
			var0.field1582 = 0;
			var0.method907();
			var0.field1555 = 128 * var0.field1600[0] + var0.field1529 * 64;
			var0.field1526 = var0.field1597[0] * 128 + var0.field1529 * 64;
			var0.method900();
		}

		class395.method2071(var0);
		class51.method383(var0);
	}
}
