public class class489 extends class40 {
	static String field4119;
	int field4118;
	// $FF: synthetic field
	final class90 this$0;

	class489(class90 var1) {
		this.this$0 = var1;
		this.field4118 = -1;
	}

	void method258(class42 var1) {
		this.field4118 = var1.method327();
		var1.method278();
		if (var1.method278() != 255) {
			--var1.field527;
			var1.method283();
		}

	}

	void method259(class419 var1) {
		var1.method2156(this.field4118);
	}

	static final void method2407(class347 var0) {
		for (int var2 = 0; var2 < Client.field117; ++var2) {
			int var3 = Client.field214[var2];
			class102 var4 = Client.field63[var3];
			int var5 = var0.method278();
			int var6;
			if ((var5 & 8) != 0) {
				var6 = var0.method278();
				var5 += var6 << 8;
			}

			if ((var5 & 2048) != 0) {
				var6 = var0.method278();
				var5 += var6 << 16;
			}

			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			if ((var5 & 128) != 0) {
				var6 = var0.method338();
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var0.method325();
						if (var8 == 32767) {
							var8 = var0.method325();
							var10 = var0.method325();
							var9 = var0.method325();
							var11 = var0.method325();
						} else if (var8 != 32766) {
							var10 = var0.method325();
						} else {
							var8 = -1;
						}

						var12 = var0.method325();
						var4.method905(var8, var10, var9, var11, Client.field306, var12);
					}
				}

				var7 = var0.method300();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var0.method325();
						var10 = var0.method325();
						if (var10 != 32767) {
							var11 = var0.method325();
							var12 = var0.method338();
							int var13 = var10 > 0 ? var0.method338() : var12;
							var4.method901(var9, Client.field306, var10, var11, var12, var13);
						} else {
							var4.method906(var9);
						}
					}
				}
			}

			int[] var14;
			short[] var15;
			short[] var16;
			long var17;
			boolean var18;
			if ((var5 & 512) != 0) {
				var6 = var0.method278();
				if ((var6 & 1) == 1) {
					var4.method664();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method299();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method307();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (null != var4.field1018.field3168) {
							var9 = var4.field1018.field3168.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.method306();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (null != var4.field1018.field3164) {
							var10 = var4.field1018.field3164.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var0.method306();
						}
					}

					var18 = false;
					if ((var6 & 16) != 0) {
						var18 = var0.method300() == 1;
					}

					var17 = (long)(++class102.field1024 - 1);
					var4.method669(new class447(var17, var14, var15, var16, var18));
				}
			}

			if ((var5 & 32) != 0) {
				var6 = var0.method306();
				var7 = var0.method327();
				var4.field1565 = var0.method338() == 1;
				if (Client.field185 >= 212) {
					var4.field1563 = var6;
					var4.field1564 = var7;
				} else {
					var8 = var4.field1555 - 64 * (var6 - class296.field2735 - class296.field2735);
					var9 = var4.field1526 - (var7 - class164.field1606 - class164.field1606) * 64;
					if (var8 != 0 || var9 != 0) {
						var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047;
						var4.field1562 = var11;
					}
				}
			}

			if ((var5 & 64) != 0) {
				var6 = var0.method327();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var0.method300();
				if (var4.field1570 == var6 && var6 != -1) {
					var8 = class114.method702(var6).field3311;
					if (var8 == 1) {
						var4.field1571 = 0;
						var4.field1572 = 0;
						var4.field1587 = var7;
						var4.field1552 = 0;
					}

					if (var8 == 2) {
						var4.field1552 = 0;
					}
				} else if (var6 == -1 || var4.field1570 == -1 || class114.method702(var6).field3304 >= class114.method702(var4.field1570).field3304) {
					var4.field1570 = var6;
					var4.field1571 = 0;
					var4.field1572 = 0;
					var4.field1587 = var7;
					var4.field1552 = 0;
					var4.field1589 = var4.field1573;
				}
			}

			if ((var5 & 131072) != 0) {
				var6 = var0.method338();

				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var0.method300();
					var9 = var0.method307();
					var10 = var0.method323();
					var4.method902(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 4) != 0) {
				var4.field1018 = class150.method861(var0.method327());
				class469.method2287(var4);
				var4.method663();
			}

			if ((var5 & 16) != 0) {
				var4.field1560 = var0.method305();
				var4.field1560 += var0.method300() << 16;
				var6 = 16777215;
				if (var6 == var4.field1560) {
					var4.field1560 = -1;
				}
			}

			if ((var5 & 4096) != 0) {
				var4.field1577 = var0.method302();
				var4.field1579 = var0.method302();
				var4.field1575 = var0.method301();
				var4.field1545 = var0.method293();
				var4.field1581 = var0.method305() + Client.field306;
				var4.field1582 = var0.method327() + Client.field306;
				var4.field1583 = var0.method307();
				var4.field1573 = 1;
				var4.field1589 = 0;
				var4.field1577 += var4.field1600[0];
				var4.field1579 += var4.field1597[0];
				var4.field1575 += var4.field1600[0];
				var4.field1545 += var4.field1597[0];
			}

			if ((var5 & 65536) != 0) {
				var6 = var0.method318();
				var4.field1532 = (var6 & 1) != 0 ? var0.method307() : 1686120851 * var4.field1018.field3154 * -1670226789;
				var4.field1593 = (var6 & 2) != 0 ? var0.method306() : 821598169 * var4.field1018.field3155 * -1405323159;
				var4.field1534 = (var6 & 4) != 0 ? var0.method305() : var4.field1018.field3170;
				var4.field1535 = (var6 & 8) != 0 ? var0.method307() : 129510829 * var4.field1018.field3157 * 1271381541;
				var4.field1536 = (var6 & 16) != 0 ? var0.method306() : -1909691015 * var4.field1018.field3158 * 799501513;
				var4.field1584 = (var6 & 32) != 0 ? var0.method306() : var4.field1018.field3159;
				var4.field1595 = (var6 & 64) != 0 ? var0.method307() : -1380991387 * var4.field1018.field3160 * -725499027;
				var4.field1539 = (var6 & 128) != 0 ? var0.method307() : var4.field1018.field3161;
				var4.field1580 = (var6 & 256) != 0 ? var0.method305() : var4.field1018.field3162;
				var4.field1541 = (var6 & 512) != 0 ? var0.method307() : var4.field1018.field3187;
				var4.field1542 = (var6 & 1024) != 0 ? var0.method305() : var4.field1018.field3156;
				var4.field1543 = (var6 & 2048) != 0 ? var0.method307() : -2089336141 * var4.field1018.field3165 * -1708442501;
				var4.field1544 = (var6 & 4096) != 0 ? var0.method305() : 2098030227 * var4.field1018.field3171 * -1815894117;
				var4.field1574 = (var6 & 8192) != 0 ? var0.method306() : var4.field1018.field3188;
				var4.field1531 = (var6 & 16384) != 0 ? var0.method305() : var4.field1018.field3153;
			}

			if ((var5 & 262144) != 0) {
				var6 = var0.method278();
				var14 = new int[8];
				var15 = new short[8];

				for (var9 = 0; var9 < 8; ++var9) {
					if ((var6 & 1 << var9) != 0) {
						var14[var9] = var0.method326();
						var15[var9] = (short)var0.method290();
					} else {
						var14[var9] = -1;
						var15[var9] = -1;
					}
				}

				var4.method662(var14, var15);
			}

			if ((var5 & 32768) != 0) {
				var4.method653(var0.method286());
			}

			if ((var5 & 2) != 0) {
				var0.method327();
				var0.method282();
			}

			if ((var5 & 1) != 0) {
				var4.field1596 = var0.method286();
				var4.field1549 = 100;
			}

			if ((var5 & 8192) != 0) {
				var4.field1586 = Client.field306 + var0.method327();
				var4.field1528 = Client.field306 + var0.method327();
				var4.field1588 = var0.method301();
				var4.field1546 = var0.method301();
				var4.field1540 = var0.method301();
				var4.field1578 = (byte)var0.method278();
			}

			if ((var5 & 256) != 0) {
				var6 = var0.method299();
				if ((var6 & 1) == 1) {
					var4.method667();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method299();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method306();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.field1018.field3168 != null) {
							var9 = var4.field1018.field3168.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.method306();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.field1018.field3164 != null) {
							var10 = var4.field1018.field3164.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var0.method305();
						}
					}

					var18 = false;
					if ((var6 & 16) != 0) {
						var18 = var0.method300() == 1;
					}

					var17 = (long)(++class102.field1017 - 1);
					var4.method666(new class447(var17, var14, var15, var16, var18));
				}
			}

			if ((var5 & 16384) != 0) {
				var4.method654(var0.method299());
			}

			if ((var5 & 1024) != 0) {
				var4.field1601 = var0.method282();
			}
		}

	}
}
