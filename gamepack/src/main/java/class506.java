import java.util.Arrays;

public class class506 {

	public static class106 field4066;

	public static short[] field4063;

	public static short[][] field4070;

	static class185 field4067;

	static int field4068;

	static final int[] field4065;

	boolean field4062;

	class349[] field4064;

	int[] field4056;

	int[] field4057;

	int[] field4069;

	long field4059;

	long field4061;

	public int field4055;

	public int field4058;

	public int field4060;

	static {
		field4065 = new int[] { class33.field174.field173, class33.field177.field173, class33.field171.field173, class33.field167.field173, class33.field180.field173, class33.field169.field173, class33.field176.field173 };
		field4066 = new class106(260);
		field4067 = new class185(16, class499.field3998);
		field4068 = 0;
	}

	public class506() {
		this.field4060 = -1;
		this.field4058 = 0;
		this.field4062 = false;
	}

	class506(class506 var1) {
		this.field4060 = -1;
		this.field4058 = 0;
		this.field4062 = false;
		int[] var2 = Arrays.copyOf(var1.field4056, var1.field4056.length);
		int[] var3 = Arrays.copyOf(var1.field4069, var1.field4069.length);
		class349[] var4 = (class349[]) (null != var1.field4064 ? (class349[]) Arrays.copyOf(var1.field4064, var1.field4064.length) : null);
		int[] var5 = Arrays.copyOf(var1.field4057, var1.field4057.length);
		this.method2443(var3, var2, var4, false, var5, var1.field4058, var1.field4055, var1.field4060);
	}

	public void method2443(int[] var1, int[] var2, class349[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field4064 = var3;
		this.field4062 = var4;
		this.field4060 = var8;
		this.method2452(var1, var2, var5, var6, var7);
	}

	public void method2452(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method2444(var4, (byte) 67);
		}
		if (null == var2) {
			var2 = this.method2444(var4, (byte) 13);
		}
		this.field4069 = var1;
		this.field4056 = var2;
		this.field4057 = var3;
		this.field4058 = var4;
		this.field4055 = var5;
		this.method2448();
	}

	int[] method2444(int var1, byte var2) {
		int[] var3 = new int[12];
		for (int var4 = 0; var4 < 7; ++var4) {
			for (int var5 = 0; var5 < class170.field1685; ++var5) {
				class170 var6 = class170.method989(var5);
				if (null != var6 && !var6.field1692 && var4 + (var1 == 1 ? 7 : 0) == var6.field1686) {
					var3[field4065[var4]] = var5 + 256;
					break;
				}
			}
		}
		return var3;
	}

	public void method2445(int var1, boolean var2) {
		int var4 = this.field4056[field4065[var1]];
		if (var4 != 0) {
			var4 -= 256;
			class170 var5;
			do {
				if (!var2) {
					--var4;
					if (var4 < 0) {
						var4 = class170.field1685 - 1;
					}
				} else {
					++var4;
					if (var4 >= class170.field1685) {
						var4 = 0;
					}
				}
				var5 = class170.method989(var4);
			} while (null == var5 || var5.field1692 || (this.field4058 == 1 ? 7 : 0) + var1 != var5.field1686);
			this.field4056[field4065[var1]] = var4 + 256;
			this.method2448();
		}
	}

	public void method2446(int var1, boolean var2) {
		int var4 = this.field4057[var1];
		boolean var5;
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = class425.field3287[var1].length - 1;
				}
				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while (!var5);
		} else {
			do {
				++var4;
				if (var4 >= class425.field3287[var1].length) {
					var4 = 0;
				}
				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while (!var5);
		}
		this.field4057[var1] = var4;
		this.method2448();
	}

	public void method2453(int var1) {
		if (var1 != this.field4058) {
			this.method2452((int[]) null, (int[]) null, this.field4057, var1, -1);
		}
	}

	public void method2447(class187 var1) {
		var1.method1085(this.field4058);
		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field4056[field4065[var3]];
			if (var4 == 0) {
				var1.method1085(-1);
			} else {
				var1.method1085(var4 - 256);
			}
		}
		for (var3 = 0; var3 < 5; ++var3) {
			var1.method1085(this.field4057[var3]);
		}
	}

	void method2448() {
		long var2 = this.field4059;
		int var4 = this.field4056[5];
		int var5 = this.field4056[9];
		this.field4056[5] = var5;
		this.field4056[9] = var4;
		this.field4059 = 0L;
		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field4059 <<= 4;
			if (this.field4056[var6] >= 256) {
				this.field4059 += (long) (this.field4056[var6] - 256);
			}
		}
		if (this.field4056[0] >= 256) {
			this.field4059 += (long) (this.field4056[0] - 256 >> 4);
		}
		if (this.field4056[1] >= 256) {
			this.field4059 += (long) (this.field4056[1] - 256 >> 8);
		}
		for (var6 = 0; var6 < 5; ++var6) {
			this.field4059 <<= 3;
			this.field4059 += (long) this.field4057[var6];
		}
		this.field4059 <<= 1;
		this.field4059 += (long) this.field4058;
		this.field4056[5] = var4;
		this.field4056[9] = var5;
		if (var2 != 0L && var2 != this.field4059 || this.field4062) {
			field4066.method646(var2);
		}
	}

	public class113 method2454(class67 var1, int var2, class67 var3, int var4) {
		if (this.field4055 != -1) {
			return class314.method1695(this.field4055).method1683(var1, var2, var3, var4, (class22) null);
		} else {
			long var6 = this.field4059;
			int[] var8 = this.field4056;
			if (var1 != null && (var1.field706 >= 0 || var1.field711 >= 0)) {
				var8 = new int[12];
				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field4056[var9];
				}
				if (var1.field706 >= 0) {
					var6 += (long) (var1.field706 - this.field4056[5] << 40);
					var8[5] = var1.field706;
				}
				if (var1.field711 >= 0) {
					var6 += (long) (var1.field711 - this.field4056[3] << 48);
					var8[3] = var1.field711;
				}
			}
			class113 var19 = (class113) field4066.method648(var6);
			if (var19 == null) {
				boolean var10 = false;
				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512 && !class170.method989(var12 - 256).method982()) {
						var10 = true;
					}
					if (var12 >= 512 && !class426.method2155(var12 - 512).method2142(this.field4058)) {
						var10 = true;
					}
				}
				if (var10) {
					if (-1L != this.field4061) {
						var19 = (class113) field4066.method648(this.field4061);
					}
					if (var19 == null) {
						return null;
					}
				}
				if (null == var19) {
					class462[] var21 = new class462[12];
					var12 = 0;
					int var14;
					for (int var13 = 0; var13 < 12; ++var13) {
						var14 = var8[var13];
						if (var14 >= 256 && var14 < 512) {
							class462 var15 = class170.method989(var14 - 256).method983();
							if (null != var15) {
								var21[var12++] = var15;
							}
						}
						if (var14 >= 512) {
							class426 var23 = class426.method2155(var14 - 512);
							class462 var16 = var23.method2143(this.field4058);
							if (null != var16) {
								if (null != this.field4064) {
									class349 var17 = this.field4064[var13];
									if (null != var17) {
										int var18;
										if (var17.field2635 != null && var23.field3332 != null && var23.field3300.length == var17.field2635.length) {
											for (var18 = 0; var18 < var23.field3332.length; ++var18) {
												var16.method2258(var23.field3300[var18], var17.field2635[var18]);
											}
										}
										if (null != var17.field2636 && null != var23.field3326 && var17.field2636.length == var23.field3302.length) {
											for (var18 = 0; var18 < var23.field3326.length; ++var18) {
												var16.method2249(var23.field3302[var18], var17.field2636[var18]);
											}
										}
									}
								}
								var21[var12++] = var16;
							}
						}
					}
					class462 var22 = new class462(var21, var12);
					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field4057[var14] < class425.field3287[var14].length) {
							var22.method2258(class64.field686[var14], class425.field3287[var14][this.field4057[var14]]);
						}
						if (this.field4057[var14] < field4070[var14].length) {
							var22.method2258(field4063[var14], field4070[var14][this.field4057[var14]]);
						}
					}
					var19 = var22.method2255(64, 850, -30, -50, -30);
					field4066.method647(var19, var6);
					this.field4061 = var6;
				}
			}
			class113 var20;
			if (null == var1 && null == var3) {
				var20 = var19.method678(true);
			} else if (null != var1 && null != var3) {
				var20 = var1.method301(var19, var2, var3, var4);
			} else if (null != var1) {
				var20 = var1.method299(var19, var2);
			} else {
				var20 = var3.method299(var19, var4);
			}
			return var20;
		}
	}

	class462 method2449() {
		if (this.field4055 != -1) {
			return class314.method1695(this.field4055).method1684((class22) null);
		} else {
			boolean var2 = false;
			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field4056[var3];
				if (var4 >= 256 && var4 < 512 && !class170.method989(var4 - 256).method987()) {
					var2 = true;
				}
				if (var4 >= 512 && !class426.method2155(var4 - 512).method2144(this.field4058)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			} else {
				class462[] var8 = new class462[12];
				var4 = 0;
				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = this.field4056[var5];
					class462 var7;
					if (var6 >= 256 && var6 < 512) {
						var7 = class170.method989(var6 - 256).method986();
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}
					if (var6 >= 512) {
						var7 = class426.method2155(var6 - 512).method2147(this.field4058);
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}
				}
				class462 var9 = new class462(var8, var4);
				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field4057[var6] < class425.field3287[var6].length) {
						var9.method2258(class64.field686[var6], class425.field3287[var6][this.field4057[var6]]);
					}
					if (this.field4057[var6] < field4070[var6].length) {
						var9.method2258(field4063[var6], field4070[var6][this.field4057[var6]]);
					}
				}
				return var9;
			}
		}
	}

	public int method2450() {
		long var2 = this.field4059;
		if (this.field4055 != -1) {
			var2 = -65536L | (long) this.field4055;
		}
		Integer var4 = (Integer) field4067.method1077(var2, (byte) -31);
		if (null == var4) {
			var4 = ++field4068 - 1;
			field4067.method1078(var2, var4);
			field4068 %= 65535;
		}
		return var4;
	}

	void method2451() {
		this.method2452(this.field4069, this.field4056, this.field4057, this.field4058, this.field4055);
	}
}
