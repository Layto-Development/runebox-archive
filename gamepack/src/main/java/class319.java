public class class319 extends class310 {

	public static class106 field2483;

	public static class319[] field2481;

	public static class338 field2493;

	public static int field2482;

	static class13 field2504;

	static int field2503;

	byte[] field2501;

	int field2480;

	int field2486;

	int field2495;

	int field2496;

	int field2498;

	int[] field2497;

	int[] field2499;

	public boolean field2490;

	public boolean field2491;

	public class141 field2500;

	public class164 field2505;

	public int field2485;

	public int field2489;

	public int field2494;

	public int field2502;

	public String field2484;

	public String field2487;

	public String[] field2492;

	public final int field2488;

	static {
		field2483 = new class106(256);
	}

	public class319(int var1) {
		this.field2485 = -1;
		this.field2486 = -1;
		this.field2489 = 0;
		this.field2490 = true;
		this.field2491 = false;
		this.field2492 = new String[5];
		this.field2480 = Integer.MAX_VALUE;
		this.field2496 = Integer.MAX_VALUE;
		this.field2495 = Integer.MIN_VALUE;
		this.field2498 = Integer.MIN_VALUE;
		this.field2505 = class164.field1663;
		this.field2500 = class141.field1536;
		this.field2502 = -1;
		this.field2488 = var1;
	}

	public void method1699(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1700(var1, var3);
		}
	}

	void method1700(class187 var1, int var2) {
		if (var2 == 1) {
			this.field2485 = var1.method1144();
		} else if (var2 == 2) {
			this.field2486 = var1.method1144();
		} else if (var2 == 3) {
			this.field2487 = var1.method1104();
		} else if (var2 == 4) {
			this.field2494 = var1.method1152();
		} else if (var2 == 5) {
			var1.method1152();
		} else if (var2 == 6) {
			this.field2489 = var1.method1096();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method1096();
				if ((var4 & 1) == 0) {
					this.field2490 = false;
				}
				if ((var4 & 2) == 2) {
					this.field2491 = true;
				}
			} else if (var2 == 8) {
				var1.method1096();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field2492[var2 - 10] = var1.method1104();
			} else if (var2 == 15) {
				var4 = var1.method1096();
				this.field2499 = new int[var4 * 2];
				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field2499[var5] = var1.method1098();
				}
				var1.method1100();
				var5 = var1.method1096();
				this.field2497 = new int[var5];
				int var6;
				for (var6 = 0; var6 < this.field2497.length; ++var6) {
					this.field2497[var6] = var1.method1100();
				}
				this.field2501 = new byte[var4];
				for (var6 = 0; var6 < var4; ++var6) {
					this.field2501[var6] = var1.method1097();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field2484 = var1.method1104();
				} else if (var2 == 18) {
					var1.method1144();
				} else if (var2 == 19) {
					this.field2502 = var1.method1145();
				} else if (var2 == 21) {
					var1.method1100();
				} else if (var2 == 22) {
					var1.method1100();
				} else if (var2 == 23) {
					var1.method1096();
					var1.method1096();
					var1.method1096();
				} else if (var2 == 24) {
					var1.method1098();
					var1.method1098();
				} else if (var2 == 25) {
					var1.method1144();
				} else if (var2 == 28) {
					var1.method1096();
				} else if (var2 == 29) {
					this.field2505 = (class164) class433.method2167(class164.method964(), var1.method1096());
				} else if (var2 == 30) {
					this.field2500 = (class141) class433.method2167(class141.method882(), var1.method1096());
				}
			}
		}
	}

	public void method1701() {
		if (null != this.field2499) {
			for (int var2 = 0; var2 < this.field2499.length; var2 += 2) {
				if (this.field2499[var2] < this.field2480) {
					this.field2480 = this.field2499[var2];
				} else if (this.field2499[var2] > this.field2495) {
					this.field2495 = this.field2499[var2];
				}
				if (this.field2499[var2 + 1] < this.field2496) {
					this.field2496 = this.field2499[var2 + 1];
				} else if (this.field2499[var2 + 1] > this.field2498) {
					this.field2498 = this.field2499[var2 + 1];
				}
			}
		}
	}

	public class84 method1702(boolean var1) {
		int var3 = this.field2485;
		return this.method1703(var3);
	}

	class84 method1703(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class84 var3 = (class84) field2483.method648((long) var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = class502.method2418(field2493, var1, 0);
				if (null != var3) {
					field2483.method647(var3, (long) var1);
				}
				return var3;
			}
		}
	}

	public int method1704() {
		return this.field2488;
	}

	public static class319 method1706(int var0) {
		return var0 >= 0 && var0 < field2481.length && field2481[var0] != null ? field2481[var0] : new class319(var0);
	}

	public static class362 method1705(int var0, byte var1) {
		class362 var2 = (class362) class362.field2870.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class362.field2871.method1762(6, var0);
			var2 = new class362();
			var2.field2875 = var0;
			if (var3 != null) {
				var2.method1896(new class187(var3));
			}
			var2.method1886();
			if (var2.field2907) {
				var2.field2885 = 0;
				var2.field2886 = false;
			}
			class362.field2870.method647(var2, (long) var0);
			return var2;
		}
	}
}
