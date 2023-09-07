public class class274 {

	static byte[] field2247;

	static class187 field2237;

	static class187[] field2248;

	static class343[] field2238;

	static class518 field2250;

	static int field2236;

	static int field2240;

	static int field2242;

	static int field2246;

	static int[] field2239;

	static int[] field2241;

	static int[] field2243;

	static int[] field2244;

	static int[] field2245;

	static int[] field2249;

	static {
		field2247 = new byte[2048];
		field2238 = new class343[2048];
		field2248 = new class187[2048];
		field2240 = 0;
		field2241 = new int[2048];
		field2242 = 0;
		field2249 = new int[2048];
		field2243 = new int[2048];
		field2244 = new int[2048];
		field2245 = new int[2048];
		field2246 = 0;
		field2239 = new int[2048];
		field2237 = new class187(new byte[5000]);
	}

	class274() throws Throwable {
	}

	static final void method1522(class515 var0) {
		var0.method2490();
		int var2 = Client.field1026;
		class82 var3 = class431.field3378 = Client.field1071[var2] = new class82();
		var3.field805 = var2;
		int var4 = var0.method2488(30);
		byte var5 = (byte) (var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field317[0] = var6 - class346.field2624;
		var3.field272 = (var3.field317[0] << 7) + (var3.method335() << 6);
		var3.field314[0] = var7 - class211.field1922;
		var3.field243 = (var3.field314[0] << 7) + (var3.method335() << 6);
		class121.field1436 = var3.field826 = var5;
		if (field2248[var2] != null) {
			var3.method329(field2248[var2]);
		}
		field2240 = 0;
		field2241[++field2240 - 1] = var2;
		field2247[var2] = 0;
		field2242 = 0;
		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var8 != var2) {
				int var9 = var0.method2488(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				field2243[var8] = var12 + (var10 << 28) + (var11 << 14);
				field2244[var8] = 0;
				field2245[var8] = -1;
				field2249[++field2242 - 1] = var8;
				field2247[var8] = 0;
			}
		}
		var0.method2491();
	}

	static final void method1523(class515 var0, int var1) {
		int var3 = var0.field1832;
		field2246 = 0;
		int var4 = 0;
		var0.method2490();
		byte[] var10000;
		int var5;
		int var6;
		int var7;
		for (var5 = 0; var5 < field2240; ++var5) {
			var6 = field2241[var5];
			if ((field2247[var6] & 1) == 0) {
				if (var4 > 0) {
					--var4;
					var10000 = field2247;
					var10000[var6] = (byte) (var10000[var6] | 2);
				} else {
					var7 = var0.method2488(1);
					if (var7 == 0) {
						var4 = class416.method2093(var0);
						var10000 = field2247;
						var10000[var6] = (byte) (var10000[var6] | 2);
					} else {
						method1525(var0, var6);
					}
				}
			}
		}
		var0.method2491();
		if (var4 != 0) {
			throw new RuntimeException();
		} else {
			var0.method2490();
			for (var5 = 0; var5 < field2240; ++var5) {
				var6 = field2241[var5];
				if ((field2247[var6] & 1) != 0) {
					if (var4 > 0) {
						--var4;
						var10000 = field2247;
						var10000[var6] = (byte) (var10000[var6] | 2);
					} else {
						var7 = var0.method2488(1);
						if (var7 == 0) {
							var4 = class416.method2093(var0);
							var10000 = field2247;
							var10000[var6] = (byte) (var10000[var6] | 2);
						} else {
							method1525(var0, var6);
						}
					}
				}
			}
			var0.method2491();
			if (var4 != 0) {
				throw new RuntimeException();
			} else {
				var0.method2490();
				for (var5 = 0; var5 < field2242; ++var5) {
					var6 = field2249[var5];
					if ((field2247[var6] & 1) != 0) {
						if (var4 > 0) {
							--var4;
							var10000 = field2247;
							var10000[var6] = (byte) (var10000[var6] | 2);
						} else {
							var7 = var0.method2488(1);
							if (var7 == 0) {
								var4 = class416.method2093(var0);
								var10000 = field2247;
								var10000[var6] = (byte) (var10000[var6] | 2);
							} else if (method1524(var0, var6)) {
								var10000 = field2247;
								var10000[var6] = (byte) (var10000[var6] | 2);
							}
						}
					}
				}
				var0.method2491();
				if (var4 != 0) {
					throw new RuntimeException();
				} else {
					var0.method2490();
					for (var5 = 0; var5 < field2242; ++var5) {
						var6 = field2249[var5];
						if ((field2247[var6] & 1) == 0) {
							if (var4 > 0) {
								--var4;
								var10000 = field2247;
								var10000[var6] = (byte) (var10000[var6] | 2);
							} else {
								var7 = var0.method2488(1);
								if (var7 == 0) {
									var4 = class416.method2093(var0);
									var10000 = field2247;
									var10000[var6] = (byte) (var10000[var6] | 2);
								} else if (method1524(var0, var6)) {
									var10000 = field2247;
									var10000[var6] = (byte) (var10000[var6] | 2);
								}
							}
						}
					}
					var0.method2491();
					if (var4 != 0) {
						throw new RuntimeException();
					} else {
						field2240 = 0;
						field2242 = 0;
						for (var5 = 1; var5 < 2048; ++var5) {
							var10000 = field2247;
							var10000[var5] = (byte) (var10000[var5] >> 1);
							class82 var8 = Client.field1071[var5];
							if (var8 != null) {
								field2241[++field2240 - 1] = var5;
							} else {
								field2249[++field2242 - 1] = var5;
							}
						}
						method1521(var0);
						if (var1 != var0.field1832 - var3) {
							throw new RuntimeException(var0.field1832 - var3 + " " + var1);
						}
					}
				}
			}
		}
	}

	static void method1525(class515 var0, int var1) {
		boolean var3 = var0.method2488(1) == 1;
		if (var3) {
			field2239[++field2246 - 1] = var1;
		}
		int var4 = var0.method2488(2);
		class82 var5 = Client.field1071[var1];
		if (var4 == 0) {
			if (var3) {
				var5.field831 = false;
			} else if (Client.field1026 == var1) {
				throw new RuntimeException();
			} else {
				field2243[var1] = (class346.field2624 + var5.field317[0] >> 13 << 14) + (var5.field826 << 28) + (class211.field1922 + var5.field314[0] >> 13);
				if (var5.field279 != -1) {
					field2244[var1] = var5.field279;
				} else {
					field2244[var1] = var5.field283;
				}
				field2245[var1] = var5.field277;
				Client.field1071[var1] = null;
				if (var0.method2488(1) != 0) {
					method1524(var0, var1);
				}
			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var0.method2488(3);
				var7 = var5.field317[0];
				var8 = var5.field314[0];
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
				if (var1 != Client.field1026 || var5.field272 >= 1536 && var5.field243 >= 1536 && var5.field272 < 11776 && var5.field243 < 11776) {
					if (var3) {
						var5.field831 = true;
						var5.field827 = var7;
						var5.field833 = var8;
					} else {
						var5.field831 = false;
						var5.method342(var7, var8, field2238[var1]);
					}
				} else {
					var5.method339(var7, var8);
					var5.field831 = false;
				}
			} else if (var4 == 2) {
				var6 = var0.method2488(4);
				var7 = var5.field317[0];
				var8 = var5.field314[0];
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
				if (Client.field1026 != var1 || var5.field272 >= 1536 && var5.field243 >= 1536 && var5.field272 < 11776 && var5.field243 < 11776) {
					if (var3) {
						var5.field831 = true;
						var5.field827 = var7;
						var5.field833 = var8;
					} else {
						var5.field831 = false;
						var5.method342(var7, var8, field2238[var1]);
					}
				} else {
					var5.method339(var7, var8);
					var5.field831 = false;
				}
			} else {
				var6 = var0.method2488(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method2488(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}
					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}
					var11 = var5.field317[0] + var9;
					var12 = var5.field314[0] + var10;
					if (var1 != Client.field1026 || var5.field272 >= 1536 && var5.field243 >= 1536 && var5.field272 < 11776 && var5.field243 < 11776) {
						if (var3) {
							var5.field831 = true;
							var5.field827 = var11;
							var5.field833 = var12;
						} else {
							var5.field831 = false;
							var5.method342(var11, var12, field2238[var1]);
						}
					} else {
						var5.method339(var11, var12);
						var5.field831 = false;
					}
					var5.field826 = (byte) (var8 + var5.field826 & 3);
					if (Client.field1026 == var1) {
						class121.field1436 = var5.field826;
					}
				} else {
					var7 = var0.method2488(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (var9 + class346.field2624 + var5.field317[0] & 16383) - class346.field2624;
					var12 = (var10 + var5.field314[0] + class211.field1922 & 16383) - class211.field1922;
					if (Client.field1026 != var1 || var5.field272 >= 1536 && var5.field243 >= 1536 && var5.field272 < 11776 && var5.field243 < 11776) {
						if (var3) {
							var5.field831 = true;
							var5.field827 = var11;
							var5.field833 = var12;
						} else {
							var5.field831 = false;
							var5.method342(var11, var12, field2238[var1]);
						}
					} else {
						var5.method339(var11, var12);
						var5.field831 = false;
					}
					var5.field826 = (byte) (var5.field826 + var8 & 3);
					if (Client.field1026 == var1) {
						class121.field1436 = var5.field826;
					}
				}
			}
		}
	}

	static boolean method1524(class515 var0, int var1) {
		int var3 = var0.method2488(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var0.method2488(1) != 0) {
				method1524(var0, var1);
			}
			var4 = var0.method2488(13);
			var5 = var0.method2488(13);
			boolean var12 = var0.method2488(1) == 1;
			if (var12) {
				field2239[++field2246 - 1] = var1;
			}
			if (Client.field1071[var1] != null) {
				throw new RuntimeException();
			} else {
				class82 var13 = Client.field1071[var1] = new class82();
				var13.field805 = var1;
				if (null != field2248[var1]) {
					var13.method329(field2248[var1]);
				}
				var13.field283 = field2244[var1];
				var13.field277 = field2245[var1];
				var8 = field2243[var1];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var13.field315[0] = field2238[var1];
				var13.field826 = (byte) var9;
				var13.method339((var10 << 13) + var4 - class346.field2624, var5 + (var11 << 13) - class211.field1922);
				var13.field831 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var0.method2488(2);
			var5 = field2243[var1];
			field2243[var1] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var0.method2488(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = field2243[var1];
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
				field2243[var1] = (var8 << 28) + (var9 << 14) + var10;
				return false;
			} else {
				var4 = var0.method2488(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = field2243[var1];
				var9 = var5 + (var8 >> 28) & 3;
				var10 = (var8 >> 14) + var6 & 255;
				var11 = var8 + var7 & 255;
				field2243[var1] = var11 + (var9 << 28) + (var10 << 14);
				return false;
			}
		}
	}

	static final void method1521(class515 var0) {
		for (int var2 = 0; var2 < field2246; ++var2) {
			int var3 = field2239[var2];
			class82 var4 = Client.field1071[var3];
			int var5 = var0.method1096();
			if ((var5 & 1) != 0) {
				var5 += var0.method1096() << 8;
			}
			if ((var5 & 32768) != 0) {
				var5 += var0.method1096() << 16;
			}
			method1520(var0, var3, var4, var5);
		}
	}

	static final void method1520(class515 var0, int var1, class82 var2, int var3) {
		byte var5 = class343.field2602.field2605;
		int var6;
		if ((var3 & 8) != 0) {
			var6 = var0.method1096();
			byte[] var7 = new byte[var6];
			class187 var8 = new class187(var7);
			var0.method1150(var7, 0, var6);
			field2248[var1] = var8;
			var2.method329(var8);
		}
		int var9;
		int var10;
		int var17;
		int var19;
		if ((var3 & 65536) != 0) {
			var6 = var0.method1096();
			for (var17 = 0; var17 < var6; ++var17) {
				var19 = var0.method1117();
				var9 = var0.method1125();
				var10 = var0.method1100();
				var2.method220(var19, var9, var10 >> 16, var10 & 65535);
			}
		}
		if ((var3 & 64) != 0) {
			var2.field279 = var0.method1125();
			if (var2.field290 == 0) {
				var2.field283 = var2.field279;
				var2.method226();
			}
		}
		if ((var3 & 16) != 0) {
			var2.field277 = var0.method1125();
			var2.field277 += var0.method1117() << 16;
			var6 = 16777215;
			if (var2.field277 == 16777215) {
				var2.field277 = -1;
			}
		}
		int var11;
		int var12;
		if ((var3 & 4096) != 0) {
			var6 = var0.method1125();
			var17 = var6 >> 8;
			var19 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
			class76 var22 = (class76) class433.method2167(class76.method317(), var0.method1117());
			boolean var25 = var0.method1096() == 1;
			var11 = var0.method1156();
			var12 = var0.field1832;
			if (null != var2.field822 && null != var2.field806) {
				boolean var13 = false;
				if (var22.field766 && class147.field1555.method944(var2.field822)) {
					var13 = true;
				}
				if (!var13 && Client.field1023 == 0 && !var2.field825) {
					field2237.field1832 = 0;
					var0.method1150(field2237.field1830, 0, var11);
					field2237.field1832 = 0;
					String var14 = class500.method2399(class514.method2467(class291.method1577(field2237)));
					var2.field313 = var14.trim();
					var2.field267 = var6 >> 8;
					var2.field268 = var6 & 255;
					var2.field266 = 150;
					byte[] var15 = null;
					int var16;
					if (var19 > 0 && var19 <= 8) {
						var15 = new byte[var19];
						for (var16 = 0; var16 < var19; ++var16) {
							var15[var16] = var0.method1120();
						}
					}
					var2.field309 = class223.method1359(var15);
					var2.field264 = var25;
					var2.field265 = class431.field3378 != var2 && var22.field766 && !Client.field926.isEmpty() && var14.toLowerCase().indexOf(Client.field926) == -1;
					if (var22.field782) {
						var16 = var25 ? 91 : 1;
					} else {
						var16 = var25 ? 90 : 2;
					}
					if (var22.field781 != -1) {
						class156.method918(var16, class75.method315(var22.field781) + var2.field822.method322(), var14);
					} else {
						class156.method918(var16, var2.field822.method322(), var14);
					}
				}
			}
			var0.field1832 = var19 + var11 + var12;
		}
		int var29;
		if ((var3 & 32) != 0) {
			var6 = var0.method1124();
			class76 var20 = (class76) class433.method2167(class76.method317(), var0.method1156());
			boolean var21 = var0.method1156() == 1;
			var9 = var0.method1096();
			var10 = var0.field1832;
			if (var2.field822 != null && var2.field806 != null) {
				boolean var26 = false;
				if (var20.field766 && class147.field1555.method944(var2.field822)) {
					var26 = true;
				}
				if (!var26 && Client.field1023 == 0 && !var2.field825) {
					field2237.field1832 = 0;
					var0.method1150(field2237.field1830, 0, var9);
					field2237.field1832 = 0;
					String var28 = class500.method2399(class514.method2467(class291.method1577(field2237)));
					var2.field313 = var28.trim();
					var2.field267 = var6 >> 8;
					var2.field268 = var6 & 255;
					var2.field266 = 150;
					var2.field309 = null;
					var2.field264 = var21;
					var2.field265 = class431.field3378 != var2 && var20.field766 && !Client.field926.isEmpty() && var28.toLowerCase().indexOf(Client.field926) == -1;
					if (var20.field782) {
						var29 = var21 ? 91 : 1;
					} else {
						var29 = var21 ? 90 : 2;
					}
					if (var20.field781 != -1) {
						class156.method918(var29, class75.method315(var20.field781) + var2.field822.method322(), var28);
					} else {
						class156.method918(var29, var2.field822.method322(), var28);
					}
				}
			}
			var0.field1832 = var9 + var10;
		}
		if ((var3 & 4) != 0) {
			var6 = var0.method1096();
			if (var6 > 0) {
				for (var17 = 0; var17 < var6; ++var17) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var19 = var0.method1143();
					if (var19 == 32767) {
						var19 = var0.method1143();
						var10 = var0.method1143();
						var9 = var0.method1143();
						var11 = var0.method1143();
					} else if (var19 != 32766) {
						var10 = var0.method1143();
					} else {
						var19 = -1;
					}
					var12 = var0.method1143();
					var2.method223(var19, var10, var9, var11, Client.field1201, var12);
				}
			}
			var17 = var0.method1096();
			if (var17 > 0) {
				for (var19 = 0; var19 < var17; ++var19) {
					var9 = var0.method1143();
					var10 = var0.method1143();
					if (var10 != 32767) {
						var11 = var0.method1143();
						var12 = var0.method1117();
						var29 = var10 > 0 ? var0.method1096() : var12;
						var2.method219(var9, Client.field1201, var10, var11, var12, var29);
					} else {
						var2.method224(var9);
					}
				}
			}
		}
		if ((var3 & 512) != 0) {
			var2.field294 = var0.method1120();
			var2.field296 = var0.method1111();
			var2.field292 = var0.method1097();
			var2.field262 = var0.method1097();
			var2.field298 = var0.method1124() + Client.field1201;
			var2.field299 = var0.method1124() + Client.field1201;
			var2.field300 = var0.method1125();
			if (var2.field831) {
				var2.field294 += var2.field827;
				var2.field296 += var2.field833;
				var2.field292 += var2.field827;
				var2.field262 += var2.field833;
				var2.field290 = 0;
			} else {
				var2.field294 += var2.field317[0];
				var2.field296 += var2.field314[0];
				var2.field292 += var2.field317[0];
				var2.field262 += var2.field314[0];
				var2.field290 = 1;
			}
			var2.field306 = 0;
		}
		if ((var3 & 2048) != 0) {
			class343[] var18 = field2238;
			class343[] var27 = new class343[] { class343.field2602, class343.field2603, class343.field2604, class343.field2607 };
			var18[var1] = (class343) class433.method2167(var27, var0.method1097());
		}
		if ((var3 & 128) != 0) {
			var2.field313 = var0.method1104();
			if (var2.field313.charAt(0) == '~') {
				var2.field313 = var2.field313.substring(1);
				class156.method918(2, var2.field822.method322(), var2.field313);
			} else if (class431.field3378 == var2) {
				class156.method918(2, var2.field822.method322(), var2.field313);
			}
			var2.field264 = false;
			var2.field267 = 0;
			var2.field268 = 0;
			var2.field266 = 150;
		}
		if ((var3 & 16384) != 0) {
			var2.field303 = Client.field1201 + var0.method1123();
			var2.field245 = Client.field1201 + var0.method1123();
			var2.field305 = var0.method1120();
			var2.field263 = var0.method1119();
			var2.field257 = var0.method1111();
			var2.field295 = (byte) var0.method1156();
		}
		if ((var3 & 8192) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var2.field809[var6] = var0.method1104();
			}
		}
		if ((var3 & 1024) != 0) {
			var5 = var0.method1097();
		}
		if ((var3 & 2) != 0) {
			var6 = var0.method1145();
			if (var6 == 65535) {
				var6 = -1;
			}
			var17 = var0.method1117();
			Client.method601(var2, var6, var17);
		}
		if (var2.field831) {
			if (var5 == 127) {
				var2.method339(var2.field827, var2.field833);
			} else {
				class343 var23;
				if (class343.field2602.field2605 != var5) {
					class343[] var24 = new class343[] { class343.field2602, class343.field2603, class343.field2604, class343.field2607 };
					var23 = (class343) class433.method2167(var24, var5);
				} else {
					var23 = field2238[var1];
				}
				var2.method342(var2.field827, var2.field833, var23);
			}
		}
	}
}
