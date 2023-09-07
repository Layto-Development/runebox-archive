public class class372 {

	public static boolean field2993;

	public static int field2990;

	public static int field2991;

	static boolean field2978;

	static boolean field2992;

	static boolean[][] field2986;

	static boolean[][][][] field3010;

	static class244[] field2998;

	static class244[][] field2994;

	static class430[] field2995;

	static class449 field2999;

	static int field2962;

	static int field2965;

	static int field2971;

	static int field2972;

	static int field2973;

	static int field2974;

	static int field2975;

	static int field2976;

	static int field2977;

	static int field2979;

	static int field2980;

	static int field2981;

	static int field2982;

	static int field2983;

	static int field2984;

	static int field2985;

	static int field2988;

	static int field2989;

	static int field2996;

	static int field2997;

	static int field3007;

	static int field3008;

	static int field3012;

	static int field3013;

	static int field3014;

	static int field3016;

	static int field3017;

	static int[] field3015;

	static final int[] field2970;

	static final int[] field3000;

	static final int[] field3001;

	static final int[] field3003;

	static final int[] field3004;

	static final int[] field3005;

	static final int[] field3006;

	class430[] field2968;

	class75[][][] field3002;

	int field2961;

	int field2963;

	int field2966;

	int field2967;

	int field2987;

	int[][] field3009;

	int[][] field3011;

	int[][][] field2964;

	int[][][] field2969;

	static {
		field2993 = true;
		field2980 = 0;
		field2972 = 0;
		field2995 = new class430[100];
		field2978 = false;
		field2988 = 0;
		field2997 = 0;
		field2989 = 0;
		field2990 = -1;
		field2991 = -1;
		field2992 = false;
		field2971 = 4;
		field3015 = new int[field2971];
		field2994 = new class244[field2971][500];
		field3014 = 0;
		field2998 = new class244[500];
		field2999 = new class449();
		field3000 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		field3001 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		field2970 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		field3003 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		field3004 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		field3005 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		field3006 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		field3010 = new boolean[8][32][51][51];
	}

	public class372(int var1, int var2, int var3, int[][][] var4) {
		this.field2966 = 0;
		this.field2967 = 0;
		this.field2968 = new class430[5000];
		this.field3011 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
		this.field3009 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
		this.field2961 = var1;
		this.field2987 = var2;
		this.field2963 = var3;
		this.field3002 = new class75[var1][var2][var3];
		this.field2969 = new int[var1][var2 + 1][var3 + 1];
		this.field2964 = var4;
		this.method1916();
	}

	public void method1916() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field2961; ++var1) {
			for (var2 = 0; var2 < this.field2987; ++var2) {
				for (int var3 = 0; var3 < this.field2963; ++var3) {
					this.field3002[var1][var2][var3] = null;
				}
			}
		}
		for (var1 = 0; var1 < field2971; ++var1) {
			for (var2 = 0; var2 < field3015[var1]; ++var2) {
				field2994[var1][var2] = null;
			}
			field3015[var1] = 0;
		}
		for (var1 = 0; var1 < this.field2967; ++var1) {
			this.field2968[var1] = null;
		}
		this.field2967 = 0;
		for (var1 = 0; var1 < field2995.length; ++var1) {
			field2995[var1] = null;
		}
	}

	public void method1917(int var1) {
		this.field2966 = var1;
		for (int var2 = 0; var2 < this.field2987; ++var2) {
			for (int var3 = 0; var3 < this.field2963; ++var3) {
				if (this.field3002[var1][var2][var3] == null) {
					this.field3002[var1][var2][var3] = new class75(var1, var2, var3);
				}
			}
		}
	}

	public void method1918(int var1, int var2) {
		class75 var3 = this.field3002[0][var1][var2];
		for (int var4 = 0; var4 < 3; ++var4) {
			class75 var5 = this.field3002[var4][var1][var2] = this.field3002[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.field759;
				for (int var6 = 0; var6 < var5.field747; ++var6) {
					class430 var7 = var5.field758[var6];
					long var9 = var7.field3368;
					boolean var8 = class424.method2131(var9) == 2;
					if (var8 && var7.field3362 == var1 && var7.field3364 == var2) {
						--var7.field3367;
					}
				}
			}
		}
		if (this.field3002[0][var1][var2] == null) {
			this.field3002[0][var1][var2] = new class75(0, var1, var2);
		}
		this.field3002[0][var1][var2].field762 = var3;
		this.field3002[3][var1][var2] = null;
	}

	public void method1970(int var1, int var2, int var3, int var4) {
		class75 var5 = this.field3002[var1][var2][var3];
		if (var5 != null) {
			this.field3002[var1][var2][var3].field754 = var4;
		}
	}

	public void method1955(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		class153 var21;
		int var22;
		if (var4 == 0) {
			var21 = new class153(var11, var12, var13, var14, -1, var19, false);
			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field3002[var22][var2][var3] == null) {
					this.field3002[var22][var2][var3] = new class75(var22, var2, var3);
				}
			}
			this.field3002[var1][var2][var3].field744 = var21;
		} else if (var4 != 1) {
			class137 var23 = new class137(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field3002[var22][var2][var3] == null) {
					this.field3002[var22][var2][var3] = new class75(var22, var2, var3);
				}
			}
			this.field3002[var1][var2][var3].field745 = var23;
		} else {
			var21 = new class153(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);
			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field3002[var22][var2][var3] == null) {
					this.field3002[var22][var2][var3] = new class75(var22, var2, var3);
				}
			}
			this.field3002[var1][var2][var3].field744 = var21;
		}
	}

	public void method1921(int var1, int var2, int var3, int var4, class189 var5, long var6, int var8) {
		if (var5 != null) {
			class460 var9 = new class460();
			var9.field3499 = var5;
			var9.field3500 = var2 * 128 + 64;
			var9.field3502 = var3 * 128 + 64;
			var9.field3497 = var4;
			var9.field3498 = var6;
			var9.field3501 = var8;
			if (this.field3002[var1][var2][var3] == null) {
				this.field3002[var1][var2][var3] = new class75(var1, var2, var3);
			}
			this.field3002[var1][var2][var3].field748 = var9;
		}
	}

	public void method1922(int var1, int var2, int var3, int var4, class189 var5, long var6, class189 var8, class189 var9) {
		class482 var10 = new class482();
		var10.field3785 = var5;
		var10.field3789 = var2 * 128 + 64;
		var10.field3786 = var3 * 128 + 64;
		var10.field3783 = var4;
		var10.field3788 = var6;
		var10.field3784 = var8;
		var10.field3787 = var9;
		int var11 = 0;
		class75 var12 = this.field3002[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field747; ++var13) {
				if ((var12.field758[var13].field3360 & 256) == 256 && var12.field758[var13].field3363 instanceof class113) {
					class113 var14 = (class113) var12.field758[var13].field3363;
					var14.method679();
					if (var14.field1834 > var11) {
						var11 = var14.field1834;
					}
				}
			}
		}
		var10.field3782 = var11;
		if (this.field3002[var1][var2][var3] == null) {
			this.field3002[var1][var2][var3] = new class75(var1, var2, var3);
		}
		this.field3002[var1][var2][var3].field741 = var10;
	}

	public void method1943(int var1, int var2, int var3, int var4, class189 var5, class189 var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			class19 var12 = new class19();
			var12.field100 = var9;
			var12.field102 = var11;
			var12.field94 = var2 * 128 + 64;
			var12.field95 = var3 * 128 + 64;
			var12.field97 = var4;
			var12.field101 = var5;
			var12.field99 = var6;
			var12.field96 = var7;
			var12.field98 = var8;
			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field3002[var13][var2][var3] == null) {
					this.field3002[var13][var2][var3] = new class75(var13, var2, var3);
				}
			}
			this.field3002[var1][var2][var3].field751 = var12;
		}
	}

	public void method1958(int var1, int var2, int var3, int var4, class189 var5, class189 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			class12 var14 = new class12();
			var14.field69 = var11;
			var14.field70 = var13;
			var14.field60 = var2 * 128 + 64;
			var14.field61 = var3 * 128 + 64;
			var14.field65 = var4;
			var14.field66 = var5;
			var14.field67 = var6;
			var14.field62 = var7;
			var14.field63 = var8;
			var14.field64 = var9;
			var14.field59 = var10;
			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field3002[var15][var2][var3] == null) {
					this.field3002[var15][var2][var3] = new class75(var15, var2, var3);
				}
			}
			this.field3002[var1][var2][var3].field750 = var14;
		}
	}

	public boolean method1923(int var1, int var2, int var3, int var4, int var5, int var6, class189 var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var13 = var3 * 128 + var6 * 64;
			return this.method1954(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	public boolean method1924(int var1, int var2, int var3, int var4, int var5, class189 var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var2 + var5;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}
				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}
				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}
				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.method1954(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method1925(int var1, int var2, int var3, int var4, int var5, class189 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method1954(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	boolean method1954(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class189 var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.field2987 || var16 >= this.field2963) {
					return false;
				}
				class75 var17 = this.field3002[var1][var15][var16];
				if (var17 != null && var17.field747 >= 5) {
					return false;
				}
			}
		}
		class430 var21 = new class430();
		var21.field3368 = var12;
		var21.field3360 = var14;
		var21.field3367 = var1;
		var21.field3358 = var6;
		var21.field3369 = var7;
		var21.field3357 = var8;
		var21.field3363 = var9;
		var21.field3356 = var10;
		var21.field3362 = var2;
		var21.field3364 = var3;
		var21.field3359 = var2 + var4 - 1;
		var21.field3365 = var3 + var5 - 1;
		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var22 = var3; var22 < var3 + var5; ++var22) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}
				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}
				if (var22 > var3) {
					var18 += 8;
				}
				if (var22 < var3 + var5 - 1) {
					var18 += 2;
				}
				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field3002[var19][var16][var22] == null) {
						this.field3002[var19][var16][var22] = new class75(var19, var16, var22);
					}
				}
				class75 var23 = this.field3002[var1][var16][var22];
				var23.field758[var23.field747] = var21;
				var23.field752[var23.field747] = var18;
				var23.field753 |= var18;
				++var23.field747;
			}
		}
		if (var11) {
			this.field2968[this.field2967++] = var21;
		}
		return true;
	}

	public void method1963() {
		for (int var1 = 0; var1 < this.field2967; ++var1) {
			class430 var2 = this.field2968[var1];
			this.method1928(var2);
			this.field2968[var1] = null;
		}
		this.field2967 = 0;
	}

	void method1928(class430 var1) {
		for (int var2 = var1.field3362; var2 <= var1.field3359; ++var2) {
			for (int var3 = var1.field3364; var3 <= var1.field3365; ++var3) {
				class75 var4 = this.field3002[var1.field3367][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.field747; ++var5) {
						if (var4.field758[var5] == var1) {
							--var4.field747;
							for (int var6 = var5; var6 < var4.field747; ++var6) {
								var4.field758[var6] = var4.field758[var6 + 1];
								var4.field752[var6] = var4.field752[var6 + 1];
							}
							var4.field758[var4.field747] = null;
							break;
						}
					}
					var4.field753 = 0;
					for (var5 = 0; var5 < var4.field747; ++var5) {
						var4.field753 |= var4.field752[var5];
					}
				}
			}
		}
	}

	public void method1926(int var1, int var2, int var3, int var4) {
		class75 var5 = this.field3002[var1][var2][var3];
		if (var5 != null) {
			class12 var6 = var5.field750;
			if (var6 != null) {
				var6.field64 = var6.field64 * var4 / 16;
				var6.field59 = var6.field59 * var4 / 16;
			}
		}
	}

	public void method1959(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 != null) {
			var4.field751 = null;
		}
	}

	public void method1927(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 != null) {
			var4.field750 = null;
		}
	}

	public void method1960(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field747; ++var5) {
				class430 var6 = var4.field758[var5];
				long var8 = var6.field3368;
				boolean var7 = class424.method2131(var8) == 2;
				if (var7 && var6.field3362 == var2 && var6.field3364 == var3) {
					this.method1928(var6);
					return;
				}
			}
		}
	}

	public void method1929(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 != null) {
			var4.field748 = null;
		}
	}

	public void method1930(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 != null) {
			var4.field741 = null;
		}
	}

	public class19 method1931(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		return var4 == null ? null : var4.field751;
	}

	public class12 method1932(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		return var4 == null ? null : var4.field750;
	}

	public class430 method1969(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field747; ++var5) {
				class430 var6 = var4.field758[var5];
				long var8 = var6.field3368;
				boolean var7 = class424.method2131(var8) == 2;
				if (var7 && var6.field3362 == var2 && var6.field3364 == var3) {
					return var6;
				}
			}
			return null;
		}
	}

	public class460 method1956(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		return var4 != null && var4.field748 != null ? var4.field748 : null;
	}

	public long method1952(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		return var4 != null && var4.field751 != null ? var4.field751.field100 : 0L;
	}

	public long method1957(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		return var4 != null && var4.field750 != null ? var4.field750.field69 : 0L;
	}

	public long method1933(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field747; ++var5) {
				class430 var6 = var4.field758[var5];
				long var8 = var6.field3368;
				boolean var7 = class424.method2131(var8) == 2;
				if (var7 && var6.field3362 == var2 && var6.field3364 == var3) {
					return var6.field3368;
				}
			}
			return 0L;
		}
	}

	public long method1966(int var1, int var2, int var3) {
		class75 var4 = this.field3002[var1][var2][var3];
		return var4 != null && var4.field748 != null ? var4.field748.field3498 : 0L;
	}

	public int method1934(int var1, int var2, int var3, long var4) {
		class75 var6 = this.field3002[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.field751 != null && var6.field751.field100 == var4) {
			return var6.field751.field102 & 255;
		} else if (var6.field750 != null && var6.field750.field69 == var4) {
			return var6.field750.field70 & 255;
		} else if (var6.field748 != null && var6.field748.field3498 == var4) {
			return var6.field748.field3501 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field747; ++var7) {
				if (var6.field758[var7].field3368 == var4) {
					return var6.field758[var7].field3360 & 255;
				}
			}
			return -1;
		}
	}

	public void method1935(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2961; ++var4) {
			for (int var5 = 0; var5 < this.field2987; ++var5) {
				for (int var6 = 0; var6 < this.field2963; ++var6) {
					class75 var7 = this.field3002[var4][var5][var6];
					if (var7 != null) {
						class19 var8 = var7.field751;
						class462 var10;
						if (var8 != null && var8.field101 instanceof class462) {
							class462 var9 = (class462) var8.field101;
							this.method1936(var9, var4, var5, var6, 1, 1);
							if (var8.field99 instanceof class462) {
								var10 = (class462) var8.field99;
								this.method1936(var10, var4, var5, var6, 1, 1);
								class462.method2254(var9, var10, 0, 0, 0, false);
								var8.field99 = var10.method2255(var10.field3544, var10.field3533, -50, -10, -50);
							}
							var8.field101 = var9.method2255(var9.field3544, var9.field3533, -50, -10, -50);
						}
						for (int var12 = 0; var12 < var7.field747; ++var12) {
							class430 var14 = var7.field758[var12];
							if (var14 != null && var14.field3363 instanceof class462) {
								class462 var11 = (class462) var14.field3363;
								this.method1936(var11, var4, var5, var6, var14.field3359 - var14.field3362 + 1, var14.field3365 - var14.field3364 + 1);
								var14.field3363 = var11.method2255(var11.field3544, var11.field3533, -50, -10, -50);
							}
						}
						class460 var13 = var7.field748;
						if (var13 != null && var13.field3499 instanceof class462) {
							var10 = (class462) var13.field3499;
							this.method1967(var10, var4, var5, var6);
							var13.field3499 = var10.method2255(var10.field3544, var10.field3533, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	void method1967(class462 var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;
		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.field2987) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.field2963 && (var9 >= var6 || var10 >= var8)) {
						class75 var11 = this.field3002[var2][var9][var10];
						if (var11 != null && var11.field748 != null && var11.field748.field3499 instanceof class462) {
							int var12 = this.method1937(var2, var9, var10, var2, var3, var4);
							class462 var13 = (class462) var11.field748.field3499;
							class462.method2254(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}
	}

	void method1936(class462 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;
		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.field2961) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.field2987) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.field2963 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								class75 var15 = this.field3002[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method1937(var12, var13, var14, var2, var3, var4);
									class19 var17 = var15.field751;
									if (var17 != null) {
										class462 var18;
										if (var17.field101 instanceof class462) {
											var18 = (class462) var17.field101;
											class462.method2254(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
										if (var17.field99 instanceof class462) {
											var18 = (class462) var17.field99;
											class462.method2254(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}
									for (int var23 = 0; var23 < var15.field747; ++var23) {
										class430 var19 = var15.field758[var23];
										if (var19 != null && var19.field3363 instanceof class462) {
											class462 var20 = (class462) var19.field3363;
											int var21 = var19.field3359 - var19.field3362 + 1;
											int var22 = var19.field3365 - var19.field3364 + 1;
											class462.method2254(var1, var20, (var19.field3362 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field3364 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}
				--var8;
				var7 = false;
			}
		}
	}

	int method1937(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method1938(var1, var2, var3) - this.method1938(var4, var5, var6);
	}

	int method1938(int var1, int var2, int var3) {
		return (this.field2964[var1][var2][var3] + this.field2964[var1][var2 + 1][var3] + this.field2964[var1][var2][var3 + 1] + this.field2964[var1][var2 + 1][var3 + 1]) / 4;
	}

	public void method1939(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		class75 var7 = this.field3002[var4][var5][var6];
		if (var7 != null) {
			class153 var8 = var7.field744;
			int var10;
			if (var8 != null) {
				int var18 = var8.field1592;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += 512;
					}
				}
			} else {
				class137 var9 = var7.field745;
				if (var9 != null) {
					var10 = var9.field1504;
					int var11 = var9.field1513;
					int var12 = var9.field1506;
					int var13 = var9.field1510;
					int[] var14 = this.field3011[var10];
					int[] var15 = this.field3009[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += 512;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}
							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}
							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}
							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}
							var2 += 512;
						}
					}
				}
			}
		}
	}

	public void method1941(int var1, int var2, int var3, boolean var4) {
		if (!method1942() || var4) {
			field2978 = true;
			field2992 = var4;
			field2988 = var1;
			field2997 = var2;
			field2989 = var3;
			field2990 = -1;
			field2991 = -1;
		}
	}

	public void method1962() {
		field2992 = true;
	}

	public void method1944(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.field2987 * 128) {
			var1 = this.field2987 * 128 - 1;
		}
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.field2963 * 128) {
			var3 = this.field2963 * 128 - 1;
		}
		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}
		++field2973;
		field2983 = class238.field2037[var4];
		field2984 = class238.field2035[var4];
		field3017 = class238.field2037[var5];
		field2985 = class238.field2035[var5];
		field2986 = field3010[(var4 - 128) / 32][var5 / 64];
		field2965 = var1;
		field2981 = var2;
		field2982 = var3;
		field3008 = var1 / 128;
		field2979 = var3 / 128;
		field2972 = var6;
		field3007 = field3008 - 25;
		if (field3007 < 0) {
			field3007 = 0;
		}
		field2976 = field2979 - 25;
		if (field2976 < 0) {
			field2976 = 0;
		}
		field2975 = field3008 + 25;
		if (field2975 > this.field2987) {
			field2975 = this.field2987;
		}
		field2977 = field2979 + 25;
		if (field2977 > this.field2963) {
			field2977 = this.field2963;
		}
		this.method1949();
		field2980 = 0;
		int var7;
		class75[][] var8;
		int var9;
		int var10;
		for (var7 = this.field2966; var7 < this.field2961; ++var7) {
			var8 = this.field3002[var7];
			for (var9 = field3007; var9 < field2975; ++var9) {
				for (var10 = field2976; var10 < field2977; ++var10) {
					class75 var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field754 > var6 || !field2986[var9 - field3008 + 25][var10 - field2979 + 25] && this.field2964[var7][var9][var10] - var2 < 2000) {
							var11.field755 = false;
							var11.field756 = false;
							var11.field749 = 0;
						} else {
							var11.field755 = true;
							var11.field756 = true;
							if (var11.field747 > 0) {
								var11.field740 = true;
							} else {
								var11.field740 = false;
							}
							++field2980;
						}
					}
				}
			}
		}
		int var12;
		int var13;
		int var14;
		class75 var15;
		int var16;
		for (var7 = this.field2966; var7 < this.field2961; ++var7) {
			var8 = this.field3002[var7];
			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field3008 + var9;
				var16 = field3008 - var9;
				if (var10 >= field3007 || var16 < field2975) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2979 + var12;
						var14 = field2979 - var12;
						if (var10 >= field3007) {
							if (var13 >= field2976) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field755) {
									this.method1945(var15, true);
								}
							}
							if (var14 < field2977) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field755) {
									this.method1945(var15, true);
								}
							}
						}
						if (var16 < field2975) {
							if (var13 >= field2976) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field755) {
									this.method1945(var15, true);
								}
							}
							if (var14 < field2977) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field755) {
									this.method1945(var15, true);
								}
							}
						}
						if (field2980 == 0) {
							field2978 = false;
							return;
						}
					}
				}
			}
		}
		for (var7 = this.field2966; var7 < this.field2961; ++var7) {
			var8 = this.field3002[var7];
			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field3008 + var9;
				var16 = field3008 - var9;
				if (var10 >= field3007 || var16 < field2975) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2979 + var12;
						var14 = field2979 - var12;
						if (var10 >= field3007) {
							if (var13 >= field2976) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field755) {
									this.method1945(var15, false);
								}
							}
							if (var14 < field2977) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field755) {
									this.method1945(var15, false);
								}
							}
						}
						if (var16 < field2975) {
							if (var13 >= field2976) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field755) {
									this.method1945(var15, false);
								}
							}
							if (var14 < field2977) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field755) {
									this.method1945(var15, false);
								}
							}
						}
						if (field2980 == 0) {
							field2978 = false;
							return;
						}
					}
				}
			}
		}
		field2978 = false;
	}

	void method1945(class75 var1, boolean var2) {
		field2999.method2222(var1);
		while (true) {
			class75 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			class75[][] var8;
			class75 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										class19 var10;
										class430 var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										class75 var33;
										while (true) {
											do {
												var3 = (class75) field2999.method2216();
												if (var3 == null) {
													return;
												}
											} while (!var3.field756);
											var4 = var3.field746;
											var5 = var3.field742;
											var6 = var3.field759;
											var7 = var3.field743;
											var8 = this.field3002[var6];
											if (!var3.field755) {
												break;
											}
											if (var2) {
												if (var6 > 0) {
													var9 = this.field3002[var6 - 1][var4][var5];
													if (var9 != null && var9.field756) {
														continue;
													}
												}
												if (var4 <= field3008 && var4 > field3007) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.field756 && (var9.field755 || (var3.field753 & 1) == 0)) {
														continue;
													}
												}
												if (var4 >= field3008 && var4 < field2975 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.field756 && (var9.field755 || (var3.field753 & 4) == 0)) {
														continue;
													}
												}
												if (var5 <= field2979 && var5 > field2976) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.field756 && (var9.field755 || (var3.field753 & 8) == 0)) {
														continue;
													}
												}
												if (var5 >= field2979 && var5 < field2977 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.field756 && (var9.field755 || (var3.field753 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}
											var3.field755 = false;
											if (var3.field762 != null) {
												var9 = var3.field762;
												if (var9.field744 != null) {
													if (!this.method1968(0, var4, var5)) {
														this.method1946(var9.field744, 0, field2983, field2984, field3017, field2985, var4, var5);
													}
												} else if (var9.field745 != null && !this.method1968(0, var4, var5)) {
													this.method1964(var9.field745, field2983, field2984, field3017, field2985, var4, var5);
												}
												var10 = var9.field751;
												if (var10 != null) {
													var10.field101.method1164(0, field2983, field2984, field3017, field2985, var10.field94 - field2965, var10.field97 - field2981, var10.field95 - field2982, var10.field100);
												}
												for (var11 = 0; var11 < var9.field747; ++var11) {
													var12 = var9.field758[var11];
													if (var12 != null) {
														var12.field3363.method1164(var12.field3356, field2983, field2984, field3017, field2985, var12.field3358 - field2965, var12.field3357 - field2981, var12.field3369 - field2982, var12.field3368);
													}
												}
											}
											var22 = false;
											if (var3.field744 != null) {
												if (!this.method1968(var7, var4, var5)) {
													var22 = true;
													if (var3.field744.field1588 != 12345678 || field2978 && var6 <= field2988) {
														this.method1946(var3.field744, var7, field2983, field2984, field3017, field2985, var4, var5);
													}
												}
											} else if (var3.field745 != null && !this.method1968(var7, var4, var5)) {
												var22 = true;
												this.method1964(var3.field745, field2983, field2984, field3017, field2985, var4, var5);
											}
											var21 = 0;
											var11 = 0;
											class19 var23 = var3.field751;
											class12 var13 = var3.field750;
											if (var23 != null || var13 != null) {
												if (field3008 == var4) {
													++var21;
												} else if (field3008 < var4) {
													var21 += 2;
												}
												if (field2979 == var5) {
													var21 += 3;
												} else if (field2979 > var5) {
													var21 += 6;
												}
												var11 = field3000[var21];
												var3.field761 = field2970[var21];
											}
											if (var23 != null) {
												if ((var23.field96 & field3001[var21]) != 0) {
													if (var23.field96 == 16) {
														var3.field749 = 3;
														var3.field757 = field3003[var21];
														var3.field760 = 3 - var3.field757;
													} else if (var23.field96 == 32) {
														var3.field749 = 6;
														var3.field757 = field3004[var21];
														var3.field760 = 6 - var3.field757;
													} else if (var23.field96 == 64) {
														var3.field749 = 12;
														var3.field757 = field3005[var21];
														var3.field760 = 12 - var3.field757;
													} else {
														var3.field749 = 9;
														var3.field757 = field3006[var21];
														var3.field760 = 9 - var3.field757;
													}
												} else {
													var3.field749 = 0;
												}
												if ((var23.field96 & var11) != 0 && !this.method1950(var7, var4, var5, var23.field96)) {
													var23.field101.method1164(0, field2983, field2984, field3017, field2985, var23.field94 - field2965, var23.field97 - field2981, var23.field95 - field2982, var23.field100);
												}
												if ((var23.field98 & var11) != 0 && !this.method1950(var7, var4, var5, var23.field98)) {
													var23.field99.method1164(0, field2983, field2984, field3017, field2985, var23.field94 - field2965, var23.field97 - field2981, var23.field95 - field2982, var23.field100);
												}
											}
											if (var13 != null && !this.method1951(var7, var4, var5, var13.field66.field1834)) {
												if ((var13.field62 & var11) != 0) {
													var13.field66.method1164(0, field2983, field2984, field3017, field2985, var13.field60 - field2965 + var13.field64, var13.field65 - field2981, var13.field61 - field2982 + var13.field59, var13.field69);
												} else if (var13.field62 == 256) {
													var14 = var13.field60 - field2965;
													var15 = var13.field65 - field2981;
													var16 = var13.field61 - field2982;
													var17 = var13.field63;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}
													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}
													if (var19 < var18) {
														var13.field66.method1164(0, field2983, field2984, field3017, field2985, var14 + var13.field64, var15, var16 + var13.field59, var13.field69);
													} else if (var13.field67 != null) {
														var13.field67.method1164(0, field2983, field2984, field3017, field2985, var14, var15, var16, var13.field69);
													}
												}
											}
											if (var22) {
												class460 var27 = var3.field748;
												if (var27 != null) {
													var27.field3499.method1164(0, field2983, field2984, field3017, field2985, var27.field3500 - field2965, var27.field3497 - field2981, var27.field3502 - field2982, var27.field3498);
												}
												class482 var31 = var3.field741;
												if (var31 != null && var31.field3782 == 0) {
													if (var31.field3784 != null) {
														var31.field3784.method1164(0, field2983, field2984, field3017, field2985, var31.field3789 - field2965, var31.field3783 - field2981, var31.field3786 - field2982, var31.field3788);
													}
													if (var31.field3787 != null) {
														var31.field3787.method1164(0, field2983, field2984, field3017, field2985, var31.field3789 - field2965, var31.field3783 - field2981, var31.field3786 - field2982, var31.field3788);
													}
													if (var31.field3785 != null) {
														var31.field3785.method1164(0, field2983, field2984, field3017, field2985, var31.field3789 - field2965, var31.field3783 - field2981, var31.field3786 - field2982, var31.field3788);
													}
												}
											}
											var14 = var3.field753;
											if (var14 != 0) {
												if (var4 < field3008 && (var14 & 4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.field756) {
														field2999.method2222(var33);
													}
												}
												if (var5 < field2979 && (var14 & 2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.field756) {
														field2999.method2222(var33);
													}
												}
												if (var4 > field3008 && (var14 & 1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.field756) {
														field2999.method2222(var33);
													}
												}
												if (var5 > field2979 && (var14 & 8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.field756) {
														field2999.method2222(var33);
													}
												}
											}
											break;
										}
										if (var3.field749 != 0) {
											var22 = true;
											for (var21 = 0; var21 < var3.field747; ++var21) {
												if (var3.field758[var21].field3361 != field2973 && (var3.field752[var21] & var3.field749) == var3.field757) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												var10 = var3.field751;
												if (!this.method1950(var7, var4, var5, var10.field96)) {
													var10.field101.method1164(0, field2983, field2984, field3017, field2985, var10.field94 - field2965, var10.field97 - field2981, var10.field95 - field2982, var10.field100);
												}
												var3.field749 = 0;
											}
										}
										if (!var3.field740) {
											break;
										}
										try {
											int var25 = var3.field747;
											var3.field740 = false;
											var21 = 0;
											label563: for (var11 = 0; var11 < var25; ++var11) {
												var12 = var3.field758[var11];
												if (var12.field3361 != field2973) {
													for (var26 = var12.field3362; var26 <= var12.field3359; ++var26) {
														for (var14 = var12.field3364; var14 <= var12.field3365; ++var14) {
															var33 = var8[var26][var14];
															if (var33.field755) {
																var3.field740 = true;
																continue label563;
															}
															if (var33.field749 != 0) {
																var16 = 0;
																if (var26 > var12.field3362) {
																	++var16;
																}
																if (var26 < var12.field3359) {
																	var16 += 4;
																}
																if (var14 > var12.field3364) {
																	var16 += 8;
																}
																if (var14 < var12.field3365) {
																	var16 += 2;
																}
																if ((var16 & var33.field749) == var3.field760) {
																	var3.field740 = true;
																	continue label563;
																}
															}
														}
													}
													field2995[var21++] = var12;
													var26 = field3008 - var12.field3362;
													var14 = var12.field3359 - field3008;
													if (var14 > var26) {
														var26 = var14;
													}
													var15 = field2979 - var12.field3364;
													var16 = var12.field3365 - field2979;
													if (var16 > var15) {
														var12.field3366 = var26 + var16;
													} else {
														var12.field3366 = var26 + var15;
													}
												}
											}
											while (var21 > 0) {
												var11 = -50;
												var24 = -1;
												for (var26 = 0; var26 < var21; ++var26) {
													class430 var34 = field2995[var26];
													if (var34.field3361 != field2973) {
														if (var34.field3366 > var11) {
															var11 = var34.field3366;
															var24 = var26;
														} else if (var34.field3366 == var11) {
															var15 = var34.field3358 - field2965;
															var16 = var34.field3369 - field2982;
															var17 = field2995[var24].field3358 - field2965;
															var18 = field2995[var24].field3369 - field2982;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var24 = var26;
															}
														}
													}
												}
												if (var24 == -1) {
													break;
												}
												class430 var35 = field2995[var24];
												var35.field3361 = field2973;
												if (!this.method1920(var7, var35.field3362, var35.field3359, var35.field3364, var35.field3365, var35.field3363.field1834)) {
													var35.field3363.method1164(var35.field3356, field2983, field2984, field3017, field2985, var35.field3358 - field2965, var35.field3357 - field2981, var35.field3369 - field2982, var35.field3368);
												}
												for (var14 = var35.field3362; var14 <= var35.field3359; ++var14) {
													for (var15 = var35.field3364; var15 <= var35.field3365; ++var15) {
														class75 var36 = var8[var14][var15];
														if (var36.field749 != 0) {
															field2999.method2222(var36);
														} else if ((var14 != var4 || var15 != var5) && var36.field756) {
															field2999.method2222(var36);
														}
													}
												}
											}
											if (!var3.field740) {
												break;
											}
										} catch (Exception var20) {
											var3.field740 = false;
											break;
										}
									}
								} while (!var3.field756);
							} while (var3.field749 != 0);
							if (var4 > field3008 || var4 <= field3007) {
								break;
							}
							var9 = var8[var4 - 1][var5];
						} while (var9 != null && var9.field756);
						if (var4 < field3008 || var4 >= field2975 - 1) {
							break;
						}
						var9 = var8[var4 + 1][var5];
					} while (var9 != null && var9.field756);
					if (var5 > field2979 || var5 <= field2976) {
						break;
					}
					var9 = var8[var4][var5 - 1];
				} while (var9 != null && var9.field756);
				if (var5 < field2979 || var5 >= field2977 - 1) {
					break;
				}
				var9 = var8[var4][var5 + 1];
			} while (var9 != null && var9.field756);
			var3.field756 = false;
			--field2980;
			class482 var29 = var3.field741;
			if (var29 != null && var29.field3782 != 0) {
				if (var29.field3784 != null) {
					var29.field3784.method1164(0, field2983, field2984, field3017, field2985, var29.field3789 - field2965, var29.field3783 - field2981 - var29.field3782, var29.field3786 - field2982, var29.field3788);
				}
				if (var29.field3787 != null) {
					var29.field3787.method1164(0, field2983, field2984, field3017, field2985, var29.field3789 - field2965, var29.field3783 - field2981 - var29.field3782, var29.field3786 - field2982, var29.field3788);
				}
				if (var29.field3785 != null) {
					var29.field3785.method1164(0, field2983, field2984, field3017, field2985, var29.field3789 - field2965, var29.field3783 - field2981 - var29.field3782, var29.field3786 - field2982, var29.field3788);
				}
			}
			if (var3.field761 != 0) {
				class12 var30 = var3.field750;
				if (var30 != null && !this.method1951(var7, var4, var5, var30.field66.field1834)) {
					if ((var30.field62 & var3.field761) != 0) {
						var30.field66.method1164(0, field2983, field2984, field3017, field2985, var30.field60 - field2965 + var30.field64, var30.field65 - field2981, var30.field61 - field2982 + var30.field59, var30.field69);
					} else if (var30.field62 == 256) {
						var11 = var30.field60 - field2965;
						var24 = var30.field65 - field2981;
						var26 = var30.field61 - field2982;
						var14 = var30.field63;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}
						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}
						if (var16 >= var15) {
							var30.field66.method1164(0, field2983, field2984, field3017, field2985, var11 + var30.field64, var24, var26 + var30.field59, var30.field69);
						} else if (var30.field67 != null) {
							var30.field67.method1164(0, field2983, field2984, field3017, field2985, var11, var24, var26, var30.field69);
						}
					}
				}
				class19 var28 = var3.field751;
				if (var28 != null) {
					if ((var28.field98 & var3.field761) != 0 && !this.method1950(var7, var4, var5, var28.field98)) {
						var28.field99.method1164(0, field2983, field2984, field3017, field2985, var28.field94 - field2965, var28.field97 - field2981, var28.field95 - field2982, var28.field100);
					}
					if ((var28.field96 & var3.field761) != 0 && !this.method1950(var7, var4, var5, var28.field96)) {
						var28.field101.method1164(0, field2983, field2984, field3017, field2985, var28.field94 - field2965, var28.field97 - field2981, var28.field95 - field2982, var28.field100);
					}
				}
			}
			class75 var32;
			if (var6 < this.field2961 - 1) {
				var32 = this.field3002[var6 + 1][var4][var5];
				if (var32 != null && var32.field756) {
					field2999.method2222(var32);
				}
			}
			if (var4 < field3008) {
				var32 = var8[var4 + 1][var5];
				if (var32 != null && var32.field756) {
					field2999.method2222(var32);
				}
			}
			if (var5 < field2979) {
				var32 = var8[var4][var5 + 1];
				if (var32 != null && var32.field756) {
					field2999.method2222(var32);
				}
			}
			if (var4 > field3008) {
				var32 = var8[var4 - 1][var5];
				if (var32 != null && var32.field756) {
					field2999.method2222(var32);
				}
			}
			if (var5 > field2979) {
				var32 = var8[var4][var5 - 1];
				if (var32 != null && var32.field756) {
					field2999.method2222(var32);
				}
			}
		}
	}

	void method1946(class153 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - field2965;
		int var11;
		int var12 = var11 = (var8 << 7) - field2982;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field2964[var2][var7][var8] - field2981;
		int var18 = this.field2964[var2][var7 + 1][var8] - field2981;
		int var19 = this.field2964[var2][var7 + 1][var8 + 1] - field2981;
		int var20 = this.field2964[var2][var7][var8 + 1] - field2981;
		int var21 = var12 * var5 + var10 * var6 >> 16;
		var12 = var12 * var6 - var10 * var5 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var12 * var3 >> 16;
		var12 = var17 * var3 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var11 * var5 + var14 * var6 >> 16;
			var11 = var11 * var6 - var14 * var5 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var11 * var3 >> 16;
			var11 = var18 * var3 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var16 * var5 + var13 * var6 >> 16;
				var16 = var16 * var6 - var13 * var5 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var16 * var3 >> 16;
				var16 = var19 * var3 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var15 * var3 >> 16;
					var15 = var20 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = class238.method1389() + var10 * class238.method1394() / var12;
						int var23 = class238.method1390() + var17 * class238.method1394() / var12;
						int var24 = class238.method1389() + var14 * class238.method1394() / var11;
						int var25 = class238.method1390() + var18 * class238.method1394() / var11;
						int var26 = class238.method1389() + var13 * class238.method1394() / var16;
						int var27 = class238.method1390() + var19 * class238.method1394() / var16;
						int var28 = class238.method1389() + var9 * class238.method1394() / var15;
						int var29 = class238.method1390() + var21 * class238.method1394() / var15;
						float var30 = class309.method1673(var12);
						float var31 = class309.method1673(var11);
						float var32 = class309.method1673(var16);
						float var33 = class309.method1673(var15);
						class238.field2039.field2275 = 0;
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							class238.field2039.field2272 = false;
							var34 = class238.method1395();
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
								class238.field2039.field2272 = true;
							}
							if (field2978 && method1948(field2997, field2989, var27, var29, var25, var26, var28, var24)) {
								field2990 = var7;
								field2991 = var8;
							}
							if (var1.field1594 == -1) {
								if (var1.field1588 != 12345678) {
									class238.method1403(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1588, var1.field1590, var1.field1587);
								}
							} else if (!field2993) {
								if (var1.field1591) {
									class238.method1402(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1588, var1.field1590, var1.field1587, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1594);
								} else {
									class238.method1402(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field1588, var1.field1590, var1.field1587, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1594);
								}
							} else {
								var35 = class238.field2039.field2270.method172(var1.field1594);
								class238.method1403(var27, var29, var25, var26, var28, var24, var32, var33, var31, method1947(var35, var1.field1588), method1947(var35, var1.field1590), method1947(var35, var1.field1587));
							}
						}
						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							class238.field2039.field2272 = false;
							var34 = class238.method1395();
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
								class238.field2039.field2272 = true;
							}
							if (field2978 && method1948(field2997, field2989, var23, var25, var29, var22, var24, var28)) {
								field2990 = var7;
								field2991 = var8;
							}
							if (var1.field1594 == -1) {
								if (var1.field1589 != 12345678) {
									class238.method1403(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field1589, var1.field1587, var1.field1590);
								}
							} else if (!field2993) {
								class238.method1402(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field1589, var1.field1587, var1.field1590, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1594);
							} else {
								var35 = class238.field2039.field2270.method172(var1.field1594);
								class238.method1403(var23, var25, var29, var22, var24, var28, var30, var31, var33, method1947(var35, var1.field1589), method1947(var35, var1.field1587), method1947(var35, var1.field1590));
							}
						}
					}
				}
			}
		}
	}

	void method1964(class137 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.field1512.length;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field1512[var9] - field2965;
			var11 = var1.field1494[var9] - field2981;
			var12 = var1.field1495[var9] - field2982;
			var13 = var12 * var4 + var10 * var5 >> 16;
			var12 = var12 * var5 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var11 * var3 - var12 * var2 >> 16;
			var12 = var11 * var2 + var12 * var3 >> 16;
			if (var12 < 50) {
				return;
			}
			if (var1.field1502 != null) {
				class137.field1511[var9] = var10;
				class137.field1508[var9] = var13;
				class137.field1500[var9] = var12;
			}
			class137.field1497[var9] = class238.method1389() + var10 * class238.method1394() / var12;
			class137.field1509[var9] = class238.method1390() + var13 * class238.method1394() / var12;
			class137.field1505[var9] = class309.method1673(var12);
		}
		class238.field2039.field2275 = 0;
		var8 = var1.field1499.length;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field1499[var9];
			var11 = var1.field1507[var9];
			var12 = var1.field1514[var9];
			var13 = class137.field1497[var10];
			int var14 = class137.field1497[var11];
			int var15 = class137.field1497[var12];
			int var16 = class137.field1509[var10];
			int var17 = class137.field1509[var11];
			int var18 = class137.field1509[var12];
			float var19 = class137.field1505[var10];
			float var20 = class137.field1505[var11];
			float var21 = class137.field1505[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				class238.field2039.field2272 = false;
				int var22 = class238.method1395();
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
					class238.field2039.field2272 = true;
				}
				if (field2978 && method1948(field2997, field2989, var16, var17, var18, var13, var14, var15)) {
					field2990 = var6;
					field2991 = var7;
				}
				if (var1.field1502 != null && var1.field1502[var9] != -1) {
					if (!field2993) {
						if (var1.field1503) {
							class238.method1402(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field1501[var9], var1.field1496[var9], var1.field1498[var9], class137.field1511[0], class137.field1511[1], class137.field1511[3], class137.field1508[0], class137.field1508[1], class137.field1508[3], class137.field1500[0], class137.field1500[1], class137.field1500[3], var1.field1502[var9]);
						} else {
							class238.method1402(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field1501[var9], var1.field1496[var9], var1.field1498[var9], class137.field1511[var10], class137.field1511[var11], class137.field1511[var12], class137.field1508[var10], class137.field1508[var11], class137.field1508[var12], class137.field1500[var10], class137.field1500[var11], class137.field1500[var12], var1.field1502[var9]);
						}
					} else {
						int var23 = class238.field2039.field2270.method172(var1.field1502[var9]);
						class238.method1403(var16, var17, var18, var13, var14, var15, var19, var20, var21, method1947(var23, var1.field1501[var9]), method1947(var23, var1.field1496[var9]), method1947(var23, var1.field1498[var9]));
					}
				} else if (var1.field1501[var9] != 12345678) {
					class238.method1403(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field1501[var9], var1.field1496[var9], var1.field1498[var9]);
				}
			}
		}
	}

	void method1949() {
		int var1 = field3015[field2972];
		class244[] var2 = field2994[field2972];
		field3014 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			class244 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field2069 == 1) {
				var5 = var4.field2081 - field3008 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field2067 - field2979 + 25;
					if (var6 < 0) {
						var6 = 0;
					}
					var7 = var4.field2072 - field2979 + 25;
					if (var7 > 50) {
						var7 = 50;
					}
					var13 = false;
					while (var6 <= var7) {
						if (field2986[var5][var6++]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						var9 = field2965 - var4.field2070;
						if (var9 > 32) {
							var4.field2076 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.field2076 = 2;
							var9 = -var9;
						}
						var4.field2079 = (var4.field2082 - field2982 << 8) / var9;
						var4.field2083 = (var4.field2078 - field2982 << 8) / var9;
						var4.field2073 = (var4.field2074 - field2981 << 8) / var9;
						var4.field2065 = (var4.field2075 - field2981 << 8) / var9;
						field2998[field3014++] = var4;
					}
				}
			} else if (var4.field2069 == 2) {
				var5 = var4.field2067 - field2979 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field2081 - field3008 + 25;
					if (var6 < 0) {
						var6 = 0;
					}
					var7 = var4.field2066 - field3008 + 25;
					if (var7 > 50) {
						var7 = 50;
					}
					var13 = false;
					while (var6 <= var7) {
						if (field2986[var6++][var5]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						var9 = field2982 - var4.field2082;
						if (var9 > 32) {
							var4.field2076 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.field2076 = 4;
							var9 = -var9;
						}
						var4.field2077 = (var4.field2070 - field2965 << 8) / var9;
						var4.field2080 = (var4.field2071 - field2965 << 8) / var9;
						var4.field2073 = (var4.field2074 - field2981 << 8) / var9;
						var4.field2065 = (var4.field2075 - field2981 << 8) / var9;
						field2998[field3014++] = var4;
					}
				}
			} else if (var4.field2069 == 4) {
				var5 = var4.field2074 - field2981;
				if (var5 > 128) {
					var6 = var4.field2067 - field2979 + 25;
					if (var6 < 0) {
						var6 = 0;
					}
					var7 = var4.field2072 - field2979 + 25;
					if (var7 > 50) {
						var7 = 50;
					}
					if (var6 <= var7) {
						int var8 = var4.field2081 - field3008 + 25;
						if (var8 < 0) {
							var8 = 0;
						}
						var9 = var4.field2066 - field3008 + 25;
						if (var9 > 50) {
							var9 = 50;
						}
						boolean var10 = false;
						label145: for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (field2986[var11][var12]) {
									var10 = true;
									break label145;
								}
							}
						}
						if (var10) {
							var4.field2076 = 5;
							var4.field2077 = (var4.field2070 - field2965 << 8) / var5;
							var4.field2080 = (var4.field2071 - field2965 << 8) / var5;
							var4.field2079 = (var4.field2082 - field2982 << 8) / var5;
							var4.field2083 = (var4.field2078 - field2982 << 8) / var5;
							field2998[field3014++] = var4;
						}
					}
				}
			}
		}
	}

	boolean method1968(int var1, int var2, int var3) {
		int var4 = this.field2969[var1][var2][var3];
		if (var4 == -field2973) {
			return false;
		} else if (var4 == field2973) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method1961(var5 + 1, this.field2964[var1][var2][var3], var6 + 1) && this.method1961(var5 + 128 - 1, this.field2964[var1][var2 + 1][var3], var6 + 1) && this.method1961(var5 + 128 - 1, this.field2964[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1961(var5 + 1, this.field2964[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2969[var1][var2][var3] = field2973;
				return true;
			} else {
				this.field2969[var1][var2][var3] = -field2973;
				return false;
			}
		}
	}

	boolean method1950(int var1, int var2, int var3, int var4) {
		if (!this.method1968(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.field2964[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > field2965) {
						if (!this.method1961(var5, var7, var6)) {
							return false;
						}
						if (!this.method1961(var5, var7, var6 + 128)) {
							return false;
						}
					}
					if (var1 > 0) {
						if (!this.method1961(var5, var8, var6)) {
							return false;
						}
						if (!this.method1961(var5, var8, var6 + 128)) {
							return false;
						}
					}
					if (!this.method1961(var5, var9, var6)) {
						return false;
					}
					if (!this.method1961(var5, var9, var6 + 128)) {
						return false;
					}
					return true;
				}
				if (var4 == 2) {
					if (var6 < field2982) {
						if (!this.method1961(var5, var7, var6 + 128)) {
							return false;
						}
						if (!this.method1961(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}
					if (var1 > 0) {
						if (!this.method1961(var5, var8, var6 + 128)) {
							return false;
						}
						if (!this.method1961(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}
					if (!this.method1961(var5, var9, var6 + 128)) {
						return false;
					}
					if (!this.method1961(var5 + 128, var9, var6 + 128)) {
						return false;
					}
					return true;
				}
				if (var4 == 4) {
					if (var5 < field2965) {
						if (!this.method1961(var5 + 128, var7, var6)) {
							return false;
						}
						if (!this.method1961(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}
					if (var1 > 0) {
						if (!this.method1961(var5 + 128, var8, var6)) {
							return false;
						}
						if (!this.method1961(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}
					if (!this.method1961(var5 + 128, var9, var6)) {
						return false;
					}
					if (!this.method1961(var5 + 128, var9, var6 + 128)) {
						return false;
					}
					return true;
				}
				if (var4 == 8) {
					if (var6 > field2982) {
						if (!this.method1961(var5, var7, var6)) {
							return false;
						}
						if (!this.method1961(var5 + 128, var7, var6)) {
							return false;
						}
					}
					if (var1 > 0) {
						if (!this.method1961(var5, var8, var6)) {
							return false;
						}
						if (!this.method1961(var5 + 128, var8, var6)) {
							return false;
						}
					}
					if (!this.method1961(var5, var9, var6)) {
						return false;
					}
					if (!this.method1961(var5 + 128, var9, var6)) {
						return false;
					}
					return true;
				}
			}
			if (!this.method1961(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method1961(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method1961(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method1961(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method1961(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	boolean method1951(int var1, int var2, int var3, int var4) {
		if (!this.method1968(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method1961(var5 + 1, this.field2964[var1][var2][var3] - var4, var6 + 1) && this.method1961(var5 + 128 - 1, this.field2964[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1961(var5 + 128 - 1, this.field2964[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1961(var5 + 1, this.field2964[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method1920(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.method1968(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method1961(var7 + 1, this.field2964[var1][var2][var4] - var6, var8 + 1) && this.method1961(var7 + 128 - 1, this.field2964[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1961(var7 + 128 - 1, this.field2964[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1961(var7 + 1, this.field2964[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2969[var1][var7][var8] == -field2973) {
						return false;
					}
				}
			}
			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.field2964[var1][var2][var4] - var6;
			if (!this.method1961(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method1961(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method1961(var7, var9, var11)) {
						return false;
					} else if (!this.method1961(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method1961(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < field3014; ++var4) {
			class244 var5 = field2998[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2076 == 1) {
				var6 = var5.field2070 - var1;
				if (var6 > 0) {
					var7 = var5.field2082 + (var5.field2079 * var6 >> 8);
					var8 = var5.field2078 + (var5.field2083 * var6 >> 8);
					var9 = var5.field2074 + (var5.field2073 * var6 >> 8);
					var10 = var5.field2075 + (var5.field2065 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2076 == 2) {
				var6 = var1 - var5.field2070;
				if (var6 > 0) {
					var7 = var5.field2082 + (var5.field2079 * var6 >> 8);
					var8 = var5.field2078 + (var5.field2083 * var6 >> 8);
					var9 = var5.field2074 + (var5.field2073 * var6 >> 8);
					var10 = var5.field2075 + (var5.field2065 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2076 == 3) {
				var6 = var5.field2082 - var3;
				if (var6 > 0) {
					var7 = var5.field2070 + (var5.field2077 * var6 >> 8);
					var8 = var5.field2071 + (var5.field2080 * var6 >> 8);
					var9 = var5.field2074 + (var5.field2073 * var6 >> 8);
					var10 = var5.field2075 + (var5.field2065 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2076 == 4) {
				var6 = var3 - var5.field2082;
				if (var6 > 0) {
					var7 = var5.field2070 + (var5.field2077 * var6 >> 8);
					var8 = var5.field2071 + (var5.field2080 * var6 >> 8);
					var9 = var5.field2074 + (var5.field2073 * var6 >> 8);
					var10 = var5.field2075 + (var5.field2065 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2076 == 5) {
				var6 = var2 - var5.field2074;
				if (var6 > 0) {
					var7 = var5.field2070 + (var5.field2077 * var6 >> 8);
					var8 = var5.field2071 + (var5.field2080 * var6 >> 8);
					var9 = var5.field2082 + (var5.field2079 * var6 >> 8);
					var10 = var5.field2078 + (var5.field2083 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void method1919(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		class244 var8 = new class244();
		var8.field2081 = var2 / 128;
		var8.field2066 = var3 / 128;
		var8.field2067 = var4 / 128;
		var8.field2072 = var5 / 128;
		var8.field2069 = var1;
		var8.field2070 = var2;
		var8.field2071 = var3;
		var8.field2082 = var4;
		var8.field2078 = var5;
		var8.field2074 = var6;
		var8.field2075 = var7;
		field2994[var0][field3015[var0]++] = var8;
	}

	public static void method1953(int[] var0, int var1, int var2, int var3, int var4) {
		field2962 = 0;
		field2996 = 0;
		field3016 = var3;
		field2974 = 334;
		field3012 = var3 / 2;
		field3013 = 167;
		boolean[][][][] var5 = new boolean[var0.length][32][53][53];
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) {
			for (var7 = 0; var7 < 2048; var7 += 64) {
				field2983 = class238.field2037[var6];
				field2984 = class238.field2035[var6];
				field3017 = class238.field2037[var7];
				field2985 = class238.field2035[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;
				for (int var10 = -26; var10 < 26; ++var10) {
					for (var11 = -26; var11 < 26; ++var11) {
						var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;
						for (int var15 = -500; var15 <= 800; var15 += 128) {
							if (method1940(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}
						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}
		for (var6 = 0; var6 < 8; ++var6) {
			for (var7 = 0; var7 < 32; ++var7) {
				for (var8 = -25; var8 < 25; ++var8) {
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;
						label76: for (var11 = -1; var11 <= 1; ++var11) {
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}
						field3010[var6][var7][var8 + 25][var9 + 25] = var16;
					}
				}
			}
		}
	}

	static boolean method1940(int var0, int var1, int var2) {
		int var3 = var2 * field3017 + var0 * field2985 >> 16;
		int var4 = var2 * field2985 - var0 * field3017 >> 16;
		int var5 = var1 * field2983 + var4 * field2984 >> 16;
		int var6 = var1 * field2984 - var4 * field2983 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = field3012 + var3 * 128 / var5;
			int var8 = field3013 + var6 * 128 / var5;
			return var7 >= field2962 && var7 <= field3016 && var8 >= field2996 && var8 <= field2974;
		} else {
			return false;
		}
	}

	public static boolean method1942() {
		return field2992 && field2990 != -1;
	}

	public static void method1965() {
		field2990 = -1;
		field2992 = false;
	}

	static final int method1947(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}
		return (var0 & 65408) + var1;
	}

	static boolean method1948(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
