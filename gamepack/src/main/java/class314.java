public class class314 extends class310 {

	public static class106 field2436;

	public static class106 field2442;

	public static class338 field2434;

	public static class338 field2435;

	static int field2470;

	class419 field2453;

	int field2456;

	int field2464;

	int field2465;

	int field2468;

	int field2471;

	int field2472;

	int[] field2441;

	int[] field2457;

	int[] field2476;

	short[] field2459;

	short[] field2474;

	short[] field2479;

	public boolean field2433;

	public boolean field2462;

	public boolean field2466;

	public boolean field2473;

	public boolean field2475;

	public int field2438;

	public int field2440;

	public int field2443;

	public int field2444;

	public int field2445;

	public int field2446;

	public int field2447;

	public int field2448;

	public int field2449;

	public int field2450;

	public int field2451;

	public int field2452;

	public int field2455;

	public int field2460;

	public int field2461;

	public int field2463;

	public int field2469;

	public int field2477;

	public int field2478;

	public int[] field2467;

	public String field2439;

	public String[] field2437;

	public short[] field2454;

	public short[] field2458;

	static {
		field2436 = new class106(64);
		field2442 = new class106(50);
	}

	class314() {
		this.field2439 = class55.field629;
		this.field2440 = 1;
		this.field2443 = -1;
		this.field2444 = -1;
		this.field2445 = -1;
		this.field2460 = -1;
		this.field2447 = -1;
		this.field2448 = -1;
		this.field2449 = -1;
		this.field2450 = -1;
		this.field2451 = -1;
		this.field2452 = -1;
		this.field2477 = -1;
		this.field2446 = -1;
		this.field2455 = -1;
		this.field2461 = -1;
		this.field2478 = -1;
		this.field2437 = new String[5];
		this.field2462 = true;
		this.field2463 = -1;
		this.field2464 = 128;
		this.field2456 = 128;
		this.field2466 = false;
		this.field2465 = 0;
		this.field2468 = 0;
		this.field2469 = 32;
		this.field2471 = -1;
		this.field2472 = -1;
		this.field2473 = true;
		this.field2433 = true;
		this.field2475 = false;
		this.field2476 = null;
		this.field2474 = null;
	}

	void method1680() {
	}

	void method1681(class187 var1, byte var2) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1682(var1, var3);
		}
	}

	void method1682(class187 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method1096();
			this.field2457 = new int[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field2457[var5] = var1.method1145();
			}
		} else if (var2 == 2) {
			this.field2439 = var1.method1104();
		} else if (var2 == 12) {
			this.field2440 = var1.method1096();
		} else if (var2 == 13) {
			this.field2443 = var1.method1145();
		} else if (var2 == 14) {
			this.field2460 = var1.method1145();
		} else if (var2 == 15) {
			this.field2444 = var1.method1145();
		} else if (var2 == 16) {
			this.field2445 = var1.method1145();
		} else if (var2 == 17) {
			this.field2460 = var1.method1145();
			this.field2447 = var1.method1145();
			this.field2448 = var1.method1145();
			this.field2449 = var1.method1145();
		} else if (var2 == 18) {
			var1.method1145();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2437[var2 - 30] = var1.method1104();
			if (this.field2437[var2 - 30].equalsIgnoreCase(class55.field571)) {
				this.field2437[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method1096();
			this.field2479 = new short[var4];
			this.field2458 = new short[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field2479[var5] = (short) var1.method1145();
				this.field2458[var5] = (short) var1.method1145();
			}
		} else if (var2 == 41) {
			var4 = var1.method1096();
			this.field2459 = new short[var4];
			this.field2454 = new short[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field2459[var5] = (short) var1.method1145();
				this.field2454[var5] = (short) var1.method1145();
			}
		} else if (var2 == 60) {
			var4 = var1.method1096();
			this.field2441 = new int[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field2441[var5] = var1.method1145();
			}
		} else if (var2 == 93) {
			this.field2462 = false;
		} else if (var2 == 95) {
			this.field2463 = var1.method1145();
		} else if (var2 == 97) {
			this.field2464 = var1.method1145();
		} else if (var2 == 98) {
			this.field2456 = var1.method1145();
		} else if (var2 == 99) {
			this.field2466 = true;
		} else if (var2 == 100) {
			this.field2465 = var1.method1097();
		} else if (var2 == 101) {
			this.field2468 = var1.method1097() * 5;
		} else {
			int var6;
			if (var2 == 102) {
				var4 = var1.method1096();
				var5 = 0;
				for (var6 = var4; var6 != 0; var6 >>= 1) {
					++var5;
				}
				this.field2476 = new int[var5];
				this.field2474 = new short[var5];
				for (int var7 = 0; var7 < var5; ++var7) {
					if ((var4 & 1 << var7) == 0) {
						this.field2476[var7] = -1;
						this.field2474[var7] = -1;
					} else {
						this.field2476[var7] = var1.method1144();
						this.field2474[var7] = (short) var1.method1108();
					}
				}
			} else if (var2 == 103) {
				this.field2469 = var1.method1145();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.field2473 = false;
				} else if (var2 == 109) {
					this.field2433 = false;
				} else if (var2 == 111) {
					this.field2475 = true;
				} else if (var2 == 114) {
					this.field2450 = var1.method1145();
				} else if (var2 == 115) {
					this.field2450 = var1.method1145();
					this.field2451 = var1.method1145();
					this.field2452 = var1.method1145();
					this.field2477 = var1.method1145();
				} else if (var2 == 116) {
					this.field2446 = var1.method1145();
				} else if (var2 == 117) {
					this.field2446 = var1.method1145();
					this.field2455 = var1.method1145();
					this.field2461 = var1.method1145();
					this.field2478 = var1.method1145();
				} else if (var2 == 249) {
					this.field2453 = class437.method2178(var1, this.field2453);
				}
			} else {
				this.field2471 = var1.method1145();
				if (this.field2471 == 65535) {
					this.field2471 = -1;
				}
				this.field2472 = var1.method1145();
				if (this.field2472 == 65535) {
					this.field2472 = -1;
				}
				var4 = -1;
				if (var2 == 118) {
					var4 = var1.method1145();
					if (var4 == 65535) {
						var4 = -1;
					}
				}
				var5 = var1.method1096();
				this.field2467 = new int[var5 + 2];
				for (var6 = 0; var6 <= var5; ++var6) {
					this.field2467[var6] = var1.method1145();
					if (this.field2467[var6] == 65535) {
						this.field2467[var6] = -1;
					}
				}
				this.field2467[var5 + 1] = var4;
			}
		}
	}

	public final class113 method1683(class67 var1, int var2, class67 var3, int var4, class22 var5) {
		if (null != this.field2467) {
			class314 var12 = this.method1685();
			return null == var12 ? null : var12.method1683(var1, var2, var3, var4, var5);
		} else {
			long var7 = (long) this.field2438;
			if (var5 != null) {
				var7 |= var5.field113 << 16;
			}
			class113 var9 = (class113) field2442.method648(var7);
			if (var9 == null) {
				class462 var10 = this.method1693(this.field2457, var5);
				if (null == var10) {
					return null;
				}
				var9 = var10.method2255(this.field2465 + 64, this.field2468 + 850, -30, -50, -30);
				field2442.method647(var9, var7);
			}
			class113 var11;
			if (var1 != null && var3 != null) {
				var11 = var1.method301(var9, var2, var3, var4);
			} else if (null != var1) {
				var11 = var1.method299(var9, var2);
			} else if (var3 != null) {
				var11 = var3.method299(var9, var4);
			} else {
				var11 = var9.method678(true);
			}
			if (this.field2464 != 128 || this.field2456 != 128) {
				var11.method692(this.field2464, this.field2456, this.field2464);
			}
			return var11;
		}
	}

	public final class462 method1684(class22 var1) {
		if (null != this.field2467) {
			class314 var3 = this.method1685();
			return null == var3 ? null : var3.method1684(var1);
		} else {
			return this.method1693(this.field2441, var1);
		}
	}

	class462 method1693(int[] var1, class22 var2) {
		int[] var4 = var1;
		if (var2 != null && null != var2.field111) {
			var4 = var2.field111;
		}
		if (var4 == null) {
			return null;
		} else {
			boolean var5 = false;
			for (int var6 = 0; var6 < var4.length; ++var6) {
				if (var4[var6] != -1 && !field2435.method1764(var4[var6], 0)) {
					var5 = true;
				}
			}
			if (var5) {
				return null;
			} else {
				class462[] var10 = new class462[var4.length];
				for (int var7 = 0; var7 < var4.length; ++var7) {
					var10[var7] = class462.method2259(field2435, var4[var7], 0);
				}
				class462 var11;
				if (var10.length == 1) {
					var11 = var10[0];
					if (var11 == null) {
						var11 = new class462(var10, var10.length);
					}
				} else {
					var11 = new class462(var10, var10.length);
				}
				short[] var8;
				int var9;
				if (this.field2479 != null) {
					var8 = this.field2458;
					if (var2 != null && null != var2.field112) {
						var8 = var2.field112;
					}
					for (var9 = 0; var9 < this.field2479.length; ++var9) {
						var11.method2258(this.field2479[var9], var8[var9]);
					}
				}
				if (this.field2459 != null) {
					var8 = this.field2454;
					if (var2 != null && null != var2.field114) {
						var8 = var2.field114;
					}
					for (var9 = 0; var9 < this.field2459.length; ++var9) {
						var11.method2249(this.field2459[var9], var8[var9]);
					}
				}
				return var11;
			}
		}
	}

	public final class314 method1685() {
		int var2 = -1;
		if (this.field2471 != -1) {
			var2 = class410.method2082(this.field2471);
		} else if (this.field2472 != -1) {
			var2 = class410.field3198[this.field2472];
		}
		int var3;
		if (var2 >= 0 && var2 < this.field2467.length - 1) {
			var3 = this.field2467[var2];
		} else {
			var3 = this.field2467[this.field2467.length - 1];
		}
		return var3 != -1 ? method1695(var3) : null;
	}

	public boolean method1689() {
		if (null == this.field2467) {
			return true;
		} else {
			int var2 = -1;
			if (this.field2471 != -1) {
				var2 = class410.method2082(this.field2471);
			} else if (this.field2472 != -1) {
				var2 = class410.field3198[this.field2472];
			}
			if (var2 >= 0 && var2 < this.field2467.length) {
				return this.field2467[var2] != -1;
			} else {
				return this.field2467[this.field2467.length - 1] != -1;
			}
		}
	}

	public int method1694(int var1, int var2) {
		class419 var5 = this.field2453;
		int var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class239 var6 = (class239) var5.method2105((long) var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = var6.field2043;
			}
		}
		return var4;
	}

	public String method1692(int var1, String var2) {
		class419 var5 = this.field2453;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class47 var6 = (class47) var5.method2105((long) var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String) var6.field233;
			}
		}
		return var4;
	}

	public boolean method1687() {
		return this.field2476 != null && this.field2474 != null;
	}

	public int[] method1688() {
		return this.field2476;
	}

	public int method1686(int var1) {
		return this.field2476 != null && var1 < this.field2476.length ? this.field2476[var1] : -1;
	}

	public short[] method1690() {
		return this.field2474;
	}

	public short method1691(int var1) {
		return null != this.field2474 && var1 < this.field2474.length ? this.field2474[var1] : -1;
	}

	public static class314 method1695(int var0) {
		class314 var2 = (class314) field2436.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2434.method1762(9, var0);
			var2 = new class314();
			var2.field2438 = var0;
			if (null != var3) {
				var2.method1681(new class187(var3), (byte) 61);
			}
			var2.method1680();
			field2436.method647(var2, (long) var0);
			return var2;
		}
	}
}
