import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ee")
public class class183 {
	@ObfInfo(name = "ao", desc = "[B")
	static byte[] field1659;
	@ObfInfo(name = "ar", desc = "Ltm;")
	static class280 field1649;
	@ObfInfo(name = "ac", desc = "[Ltm;")
	static class280[] field1660;
	@ObfInfo(name = "sg", desc = "Lfi;")
	static class291 field1662;
	@ObfInfo(name = "at", desc = "[Lin;")
	static class386[] field1650;
	@ObfInfo(name = "uq", desc = "I", intMultiplier = 780299077)
	static int field1648;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 2110833449)
	static int field1652;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1198904791)
	static int field1654;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 310707883)
	static int field1658;
	@ObfInfo(name = "an", desc = "[I")
	static int[] field1651;
	@ObfInfo(name = "az", desc = "[I")
	static int[] field1653;
	@ObfInfo(name = "af", desc = "[I")
	static int[] field1655;
	@ObfInfo(name = "ad", desc = "[I")
	static int[] field1656;
	@ObfInfo(name = "aq", desc = "[I")
	static int[] field1657;
	@ObfInfo(name = "aa", desc = "[I")
	static int[] field1661;

	static {
		field1659 = new byte[2048];
		field1650 = new class386[2048];
		field1660 = new class280[2048];
		field1652 = 0;
		field1653 = new int[2048];
		field1654 = 0;
		field1661 = new int[2048];
		field1655 = new int[2048];
		field1656 = new int[2048];
		field1657 = new int[2048];
		field1658 = 0;
		field1651 = new int[2048];
		field1649 = new class280(new byte[5000]);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class183() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Lto;I)V")
	static final void method1031(class259 var0) {
		var0.method1361();
		int var2 = Client.field155;
		class439 var3 = class126.field1164 = Client.field200[var2] = new class439();
		var3.field3298 = var2;
		int var4 = var0.method1359(30);
		byte var5 = (byte)(var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field1106[0] = var6 - class265.field2147;
		var3.field1061 = (var3.field1106[0] << 7) + (var3.method2303() << 6);
		var3.field1103[0] = var7 - class508.field4092;
		var3.field1032 = (var3.field1103[0] << 7) + (var3.method2303() << 6);
		class401.field3120 = var3.field3319 = var5;
		if (field1660[var2] != null) {
			var3.method2297(field1660[var2]);
		}

		field1652 = 0;
		field1653[++field1652 - 1] = var2;
		field1659[var2] = 0;
		field1654 = 0;

		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var8 != var2) {
				int var9 = var0.method1359(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				field1655[var8] = var12 + (var10 << 28) + (var11 << 14);
				field1656[var8] = 0;
				field1657[var8] = -1;
				field1661[++field1654 - 1] = var8;
				field1659[var8] = 0;
			}
		}

		var0.method1362();
	}

	@ObfInfo(name = "ae", desc = "(Lto;II)V")
	static final void method1032(class259 var0, int var1) {
		int var3 = var0.field2254;
		field1658 = 0;
		int var4 = 0;
		var0.method1361();

		byte[] var10000;
		int var5;
		int var6;
		int var7;
		for (var5 = 0; var5 < field1652; ++var5) {
			var6 = field1653[var5];
			if ((field1659[var6] & 1) == 0) {
				if (var4 > 0) {
					--var4;
					var10000 = field1659;
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var7 = var0.method1359(1);
					if (var7 == 0) {
						var4 = class403.method2127(var0);
						var10000 = field1659;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						method1034(var0, var6);
					}
				}
			}
		}

		var0.method1362();
		if (var4 != 0) {
			throw new RuntimeException();
		} else {
			var0.method1361();

			for (var5 = 0; var5 < field1652; ++var5) {
				var6 = field1653[var5];
				if ((field1659[var6] & 1) != 0) {
					if (var4 > 0) {
						--var4;
						var10000 = field1659;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var7 = var0.method1359(1);
						if (var7 == 0) {
							var4 = class403.method2127(var0);
							var10000 = field1659;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							method1034(var0, var6);
						}
					}
				}
			}

			var0.method1362();
			if (var4 != 0) {
				throw new RuntimeException();
			} else {
				var0.method1361();

				for (var5 = 0; var5 < field1654; ++var5) {
					var6 = field1661[var5];
					if ((field1659[var6] & 1) != 0) {
						if (var4 > 0) {
							--var4;
							var10000 = field1659;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var7 = var0.method1359(1);
							if (var7 == 0) {
								var4 = class403.method2127(var0);
								var10000 = field1659;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (method1033(var0, var6)) {
								var10000 = field1659;
								var10000[var6] = (byte)(var10000[var6] | 2);
							}
						}
					}
				}

				var0.method1362();
				if (var4 != 0) {
					throw new RuntimeException();
				} else {
					var0.method1361();

					for (var5 = 0; var5 < field1654; ++var5) {
						var6 = field1661[var5];
						if ((field1659[var6] & 1) == 0) {
							if (var4 > 0) {
								--var4;
								var10000 = field1659;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var7 = var0.method1359(1);
								if (var7 == 0) {
									var4 = class403.method2127(var0);
									var10000 = field1659;
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (method1033(var0, var6)) {
									var10000 = field1659;
									var10000[var6] = (byte)(var10000[var6] | 2);
								}
							}
						}
					}

					var0.method1362();
					if (var4 != 0) {
						throw new RuntimeException();
					} else {
						field1652 = 0;
						field1654 = 0;

						for (var5 = 1; var5 < 2048; ++var5) {
							var10000 = field1659;
							var10000[var5] = (byte)(var10000[var5] >> 1);
							class439 var8 = Client.field200[var5];
							if (var8 != null) {
								field1653[++field1652 - 1] = var5;
							} else {
								field1661[++field1654 - 1] = var5;
							}
						}

						method1030(var0);
						if (var1 != var0.field2254 - var3) {
							throw new RuntimeException(var0.field2254 - var3 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfInfo(name = "at", desc = "(Lto;II)V")
	static void method1034(class259 var0, int var1) {
		boolean var3 = var0.method1359(1) == 1;
		if (var3) {
			field1651[++field1658 - 1] = var1;
		}

		int var4 = var0.method1359(2);
		class439 var5 = Client.field200[var1];
		if (var4 == 0) {
			if (var3) {
				var5.field3324 = false;
			} else if (Client.field155 == var1) {
				throw new RuntimeException();
			} else {
				field1655[var1] = (class265.field2147 + var5.field1106[0] >> 13 << 14) + (var5.field3319 << 28) + (class508.field4092 + var5.field1103[0] >> 13);
				if (var5.field1068 != -1) {
					field1656[var1] = var5.field1068;
				} else {
					field1656[var1] = var5.field1072;
				}

				field1657[var1] = var5.field1066;
				Client.field200[var1] = null;
				if (var0.method1359(1) != 0) {
					method1033(var0, var1);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var0.method1359(3);
				var7 = var5.field1106[0];
				var8 = var5.field1103[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (var1 != Client.field155 || var5.field1061 >= 1536 && var5.field1032 >= 1536 && var5.field1061 < 11776 && var5.field1032 < 11776) {
					if (var3) {
						var5.field3324 = true;
						var5.field3320 = var7;
						var5.field3326 = var8;
					} else {
						var5.field3324 = false;
						var5.method2310(var7, var8, field1650[var1]);
					}
				} else {
					var5.method2307(var7, var8);
					var5.field3324 = false;
				}

			} else if (var4 == 2) {
				var6 = var0.method1359(4);
				var7 = var5.field1106[0];
				var8 = var5.field1103[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (Client.field155 != var1 || var5.field1061 >= 1536 && var5.field1032 >= 1536 && var5.field1061 < 11776 && var5.field1032 < 11776) {
					if (var3) {
						var5.field3324 = true;
						var5.field3320 = var7;
						var5.field3326 = var8;
					} else {
						var5.field3324 = false;
						var5.method2310(var7, var8, field1650[var1]);
					}
				} else {
					var5.method2307(var7, var8);
					var5.field3324 = false;
				}

			} else {
				var6 = var0.method1359(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method1359(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var5.field1106[0] + var9;
					var12 = var5.field1103[0] + var10;
					if (var1 != Client.field155 || var5.field1061 >= 1536 && var5.field1032 >= 1536 && var5.field1061 < 11776 && var5.field1032 < 11776) {
						if (var3) {
							var5.field3324 = true;
							var5.field3320 = var11;
							var5.field3326 = var12;
						} else {
							var5.field3324 = false;
							var5.method2310(var11, var12, field1650[var1]);
						}
					} else {
						var5.method2307(var11, var12);
						var5.field3324 = false;
					}

					var5.field3319 = (byte)(var8 + var5.field3319 & 3);
					if (Client.field155 == var1) {
						class401.field3120 = var5.field3319;
					}

				} else {
					var7 = var0.method1359(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (var9 + class265.field2147 + var5.field1106[0] & 16383) - class265.field2147;
					var12 = (var10 + var5.field1103[0] + class508.field4092 & 16383) - class508.field4092;
					if (Client.field155 != var1 || var5.field1061 >= 1536 && var5.field1032 >= 1536 && var5.field1061 < 11776 && var5.field1032 < 11776) {
						if (var3) {
							var5.field3324 = true;
							var5.field3320 = var11;
							var5.field3326 = var12;
						} else {
							var5.field3324 = false;
							var5.method2310(var11, var12, field1650[var1]);
						}
					} else {
						var5.method2307(var11, var12);
						var5.field3324 = false;
					}

					var5.field3319 = (byte)(var5.field3319 + var8 & 3);
					if (Client.field155 == var1) {
						class401.field3120 = var5.field3319;
					}

				}
			}
		}
	}

	@ObfInfo(name = "ac", desc = "(Lto;IB)Z")
	static boolean method1033(class259 var0, int var1) {
		int var3 = var0.method1359(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var0.method1359(1) != 0) {
				method1033(var0, var1);
			}

			var4 = var0.method1359(13);
			var5 = var0.method1359(13);
			boolean var12 = var0.method1359(1) == 1;
			if (var12) {
				field1651[++field1658 - 1] = var1;
			}

			if (Client.field200[var1] != null) {
				throw new RuntimeException();
			} else {
				class439 var13 = Client.field200[var1] = new class439();
				var13.field3298 = var1;
				if (null != field1660[var1]) {
					var13.method2297(field1660[var1]);
				}

				var13.field1072 = field1656[var1];
				var13.field1066 = field1657[var1];
				var8 = field1655[var1];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var13.field1104[0] = field1650[var1];
				var13.field3319 = (byte)var9;
				var13.method2307((var10 << 13) + var4 - class265.field2147, var5 + (var11 << 13) - class508.field4092);
				var13.field3324 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method1359(2);
			var5 = field1655[var1];
			field1655[var1] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var0.method1359(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = field1655[var1];
				var8 = (var7 >> 28) + var5 & 3;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				if (var6 == 0) {
					--var9;
					--var10;
				}

				if (var6 == 1) {
					--var10;
				}

				if (var6 == 2) {
					++var9;
					--var10;
				}

				if (var6 == 3) {
					--var9;
				}

				if (var6 == 4) {
					++var9;
				}

				if (var6 == 5) {
					--var9;
					++var10;
				}

				if (var6 == 6) {
					++var10;
				}

				if (var6 == 7) {
					++var9;
					++var10;
				}

				field1655[var1] = (var8 << 28) + (var9 << 14) + var10;
				return false;
			} else {
				var4 = var0.method1359(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = field1655[var1];
				var9 = var5 + (var8 >> 28) & 3;
				var10 = (var8 >> 14) + var6 & 255;
				var11 = var8 + var7 & 255;
				field1655[var1] = var11 + (var9 << 28) + (var10 << 14);
				return false;
			}
		}
	}

	@ObfInfo(name = "ai", desc = "(Lto;B)V")
	static final void method1030(class259 var0) {
		for (int var2 = 0; var2 < field1658; ++var2) {
			int var3 = field1651[var2];
			class439 var4 = Client.field200[var3];
			int var5 = var0.method1492();
			if ((var5 & 1) != 0) {
				var5 += var0.method1492() << 8;
			}

			if ((var5 & 32768) != 0) {
				var5 += var0.method1492() << 16;
			}

			method1029(var0, var3, var4, var5);
		}

	}

	@ObfInfo(name = "az", desc = "(Lto;ILdf;II)V")
	static final void method1029(class259 var0, int var1, class439 var2, int var3) {
		byte var5 = class386.field3024.field3027;
		int var6;
		if ((var3 & 8) != 0) {
			var6 = var0.method1492();
			byte[] var7 = new byte[var6];
			class280 var8 = new class280(var7);
			var0.method1546(var7, 0, var6);
			field1660[var1] = var8;
			var2.method2297(var8);
		}

		int var9;
		int var10;
		int var17;
		int var19;
		if ((var3 & 65536) != 0) {
			var6 = var0.method1492();

			for (var17 = 0; var17 < var6; ++var17) {
				var19 = var0.method1513();
				var9 = var0.method1521();
				var10 = var0.method1496();
				var2.method637(var19, var9, var10 >> 16, var10 & 65535);
			}
		}

		if ((var3 & 64) != 0) {
			var2.field1068 = var0.method1521();
			if (var2.field1079 == 0) {
				var2.field1072 = var2.field1068;
				var2.method643();
			}
		}

		if ((var3 & 16) != 0) {
			var2.field1066 = var0.method1521();
			var2.field1066 += var0.method1513() << 16;
			var6 = 16777215;
			if (var2.field1066 == var6) {
				var2.field1066 = -1;
			}
		}

		int var11;
		int var12;
		if ((var3 & 4096) != 0) {
			var6 = var0.method1521();
			var17 = var6 >> 8;
			var19 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
			class314 var22 = (class314)class216.method1198(class314.method1733(), var0.method1513());
			boolean var25 = var0.method1492() == 1;
			var11 = var0.method1552();
			var12 = var0.field2254;
			if (null != var2.field3315 && null != var2.field3299) {
				boolean var13 = false;
				if (var22.field2545 && class331.field2633.method312(var2.field3315)) {
					var13 = true;
				}

				if (!var13 && Client.field152 == 0 && !var2.field3318) {
					field1649.field2254 = 0;
					var0.method1546(field1649.field2252, 0, var11);
					field1649.field2254 = 0;
					String var14 = class300.method1659(class455.method2369(class217.method1202(field1649)));
					var2.field1102 = var14.trim();
					var2.field1056 = var6 >> 8;
					var2.field1057 = var6 & 255;
					var2.field1055 = 150;
					byte[] var15 = null;
					int var16;
					if (var19 > 0 && var19 <= 8) {
						var15 = new byte[var19];

						for (var16 = 0; var16 < var19; ++var16) {
							var15[var16] = var0.method1516();
						}
					}

					var2.field1098 = class452.method2361(var15);
					var2.field1053 = var25;
					var2.field1054 = class126.field1164 != var2 && var22.field2545 && !Client.field55.isEmpty() && var14.toLowerCase().indexOf(Client.field55) == -1;
					if (var22.field2561) {
						var16 = var25 ? 91 : 1;
					} else {
						var16 = var25 ? 90 : 2;
					}

					if (var22.field2560 != -1) {
						class159.method914(var16, class90.method580(var22.field2560) + var2.field3315.method1935(), var14);
					} else {
						class159.method914(var16, var2.field3315.method1935(), var14);
					}
				}
			}

			var0.field2254 = var19 + var11 + var12;
		}

		int var29;
		if ((var3 & 32) != 0) {
			var6 = var0.method1520();
			class314 var20 = (class314)class216.method1198(class314.method1733(), var0.method1552());
			boolean var21 = var0.method1552() == 1;
			var9 = var0.method1492();
			var10 = var0.field2254;
			if (var2.field3315 != null && var2.field3299 != null) {
				boolean var26 = false;
				if (var20.field2545 && class331.field2633.method312(var2.field3315)) {
					var26 = true;
				}

				if (!var26 && Client.field152 == 0 && !var2.field3318) {
					field1649.field2254 = 0;
					var0.method1546(field1649.field2252, 0, var9);
					field1649.field2254 = 0;
					String var28 = class300.method1659(class455.method2369(class217.method1202(field1649)));
					var2.field1102 = var28.trim();
					var2.field1056 = var6 >> 8;
					var2.field1057 = var6 & 255;
					var2.field1055 = 150;
					var2.field1098 = null;
					var2.field1053 = var21;
					var2.field1054 = class126.field1164 != var2 && var20.field2545 && !Client.field55.isEmpty() && var28.toLowerCase().indexOf(Client.field55) == -1;
					if (var20.field2561) {
						var29 = var21 ? 91 : 1;
					} else {
						var29 = var21 ? 90 : 2;
					}

					if (var20.field2560 != -1) {
						class159.method914(var29, class90.method580(var20.field2560) + var2.field3315.method1935(), var28);
					} else {
						class159.method914(var29, var2.field3315.method1935(), var28);
					}
				}
			}

			var0.field2254 = var9 + var10;
		}

		if ((var3 & 4) != 0) {
			var6 = var0.method1492();
			if (var6 > 0) {
				for (var17 = 0; var17 < var6; ++var17) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var19 = var0.method1539();
					if (var19 == 32767) {
						var19 = var0.method1539();
						var10 = var0.method1539();
						var9 = var0.method1539();
						var11 = var0.method1539();
					} else if (var19 != 32766) {
						var10 = var0.method1539();
					} else {
						var19 = -1;
					}

					var12 = var0.method1539();
					var2.method640(var19, var10, var9, var11, Client.field330, var12);
				}
			}

			var17 = var0.method1492();
			if (var17 > 0) {
				for (var19 = 0; var19 < var17; ++var19) {
					var9 = var0.method1539();
					var10 = var0.method1539();
					if (var10 != 32767) {
						var11 = var0.method1539();
						var12 = var0.method1513();
						var29 = var10 > 0 ? var0.method1492() : var12;
						var2.method636(var9, Client.field330, var10, var11, var12, var29);
					} else {
						var2.method641(var9);
					}
				}
			}
		}

		if ((var3 & 512) != 0) {
			var2.field1083 = var0.method1516();
			var2.field1085 = var0.method1507();
			var2.field1081 = var0.method1493();
			var2.field1051 = var0.method1493();
			var2.field1087 = var0.method1520() + Client.field330;
			var2.field1088 = var0.method1520() + Client.field330;
			var2.field1089 = var0.method1521();
			if (var2.field3324) {
				var2.field1083 += var2.field3320;
				var2.field1085 += var2.field3326;
				var2.field1081 += var2.field3320;
				var2.field1051 += var2.field3326;
				var2.field1079 = 0;
			} else {
				var2.field1083 += var2.field1106[0];
				var2.field1085 += var2.field1103[0];
				var2.field1081 += var2.field1106[0];
				var2.field1051 += var2.field1103[0];
				var2.field1079 = 1;
			}

			var2.field1095 = 0;
		}

		if ((var3 & 2048) != 0) {
			class386[] var18 = field1650;
			class386[] var27 = new class386[]{class386.field3024, class386.field3025, class386.field3026, class386.field3029};
			var18[var1] = (class386)class216.method1198(var27, var0.method1493());
		}

		if ((var3 & 128) != 0) {
			var2.field1102 = var0.method1500();
			if (var2.field1102.charAt(0) == '~') {
				var2.field1102 = var2.field1102.substring(1);
				class159.method914(2, var2.field3315.method1935(), var2.field1102);
			} else if (class126.field1164 == var2) {
				class159.method914(2, var2.field3315.method1935(), var2.field1102);
			}

			var2.field1053 = false;
			var2.field1056 = 0;
			var2.field1057 = 0;
			var2.field1055 = 150;
		}

		if ((var3 & 16384) != 0) {
			var2.field1092 = Client.field330 + var0.method1519();
			var2.field1034 = Client.field330 + var0.method1519();
			var2.field1094 = var0.method1516();
			var2.field1052 = var0.method1515();
			var2.field1046 = var0.method1507();
			var2.field1084 = (byte)var0.method1552();
		}

		if ((var3 & 8192) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var2.field3302[var6] = var0.method1500();
			}
		}

		if ((var3 & 1024) != 0) {
			var5 = var0.method1493();
		}

		if ((var3 & 2) != 0) {
			var6 = var0.method1541();
			if (var6 == 65535) {
				var6 = -1;
			}

			var17 = var0.method1513();
			Client.method282(var2, var6, var17);
		}

		if (var2.field3324) {
			if (var5 == 127) {
				var2.method2307(var2.field3320, var2.field3326);
			} else {
				class386 var23;
				if (class386.field3024.field3027 != var5) {
					class386[] var24 = new class386[]{class386.field3024, class386.field3025, class386.field3026, class386.field3029};
					var23 = (class386)class216.method1198(var24, var5);
				} else {
					var23 = field1650[var1];
				}

				var2.method2310(var2.field3320, var2.field3326, var23);
			}
		}

	}
}
