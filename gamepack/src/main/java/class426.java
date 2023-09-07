public class class426 extends class310 {

	public static boolean field3293;

	public static class106 field3294;

	public static class106 field3296;

	public static class106 field3339;

	public static class338 field3292;

	static int[] field3345;

	class419 field3340;

	int field3297;

	int field3298;

	int field3306;

	int field3316;

	int field3317;

	int field3318;

	int field3319;

	int field3320;

	int field3321;

	int field3322;

	int field3323;

	int field3324;

	int field3325;

	int field3327;

	int field3328;

	int field3333;

	int field3334;

	int field3335;

	int field3342;

	int field3343;

	int[] field3329;

	int[] field3330;

	public boolean field3301;

	public boolean field3341;

	public int field3289;

	public int field3290;

	public int field3291;

	public int field3295;

	public int field3299;

	public int field3303;

	public int field3304;

	public int field3305;

	public int field3307;

	public int field3308;

	public int field3309;

	public int field3310;

	public int field3311;

	public int field3312;

	public int field3331;

	public int field3336;

	public int field3337;

	public int field3338;

	public int field3344;

	public String field3313;

	public String[] field3314;

	public String[] field3315;

	public short[] field3300;

	public short[] field3302;

	public short[] field3326;

	public short[] field3332;

	static {
		field3294 = new class106(64);
		field3339 = new class106(50);
		field3296 = new class106(200);
	}

	class426() {
		this.field3313 = class55.field629;
		this.field3312 = 2000;
		this.field3289 = 0;
		this.field3305 = 0;
		this.field3291 = 0;
		this.field3290 = 0;
		this.field3307 = 0;
		this.field3308 = 0;
		this.field3309 = 1;
		this.field3310 = -1;
		this.field3295 = -1;
		this.field3311 = -1;
		this.field3301 = false;
		this.field3314 = new String[] { null, null, class55.field482, null, null };
		this.field3315 = new String[] { null, null, null, null, class55.field491 };
		this.field3316 = -2;
		this.field3343 = -1;
		this.field3318 = -1;
		this.field3319 = 0;
		this.field3320 = -1;
		this.field3321 = -1;
		this.field3322 = 0;
		this.field3342 = -1;
		this.field3324 = -1;
		this.field3323 = -1;
		this.field3327 = -1;
		this.field3306 = -1;
		this.field3328 = -1;
		this.field3331 = -1;
		this.field3304 = -1;
		this.field3333 = 128;
		this.field3334 = 128;
		this.field3335 = 128;
		this.field3336 = 0;
		this.field3337 = 0;
		this.field3338 = 0;
		this.field3299 = 0;
		this.field3341 = false;
		this.field3317 = -1;
		this.field3325 = -1;
		this.field3303 = -1;
		this.field3344 = -1;
	}

	void method2151() {
		if (this.field3308 == 1) {
			this.field3299 = 0;
		}
	}

	void method2139(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method2135(var1, var3);
		}
	}

	void method2135(class187 var1, int var2) {
		if (var2 == 1) {
			this.field3298 = var1.method1145();
		} else if (var2 == 2) {
			this.field3313 = var1.method1104();
		} else if (var2 == 4) {
			this.field3312 = var1.method1145();
		} else if (var2 == 5) {
			this.field3289 = var1.method1145();
		} else if (var2 == 6) {
			this.field3305 = var1.method1145();
		} else if (var2 == 7) {
			this.field3290 = var1.method1145();
			if (this.field3290 > 32767) {
				this.field3290 -= 65536;
			}
		} else if (var2 == 8) {
			this.field3307 = var1.method1145();
			if (this.field3307 > 32767) {
				this.field3307 -= 65536;
			}
		} else if (var2 == 9) {
			var1.method1104();
		} else if (var2 == 11) {
			this.field3308 = 1;
		} else if (var2 == 12) {
			this.field3309 = var1.method1100();
		} else if (var2 == 13) {
			this.field3310 = var1.method1096();
		} else if (var2 == 14) {
			this.field3295 = var1.method1096();
		} else if (var2 == 16) {
			this.field3301 = true;
		} else if (var2 == 23) {
			this.field3343 = var1.method1145();
			this.field3319 = var1.method1096();
		} else if (var2 == 24) {
			this.field3318 = var1.method1145();
		} else if (var2 == 25) {
			this.field3320 = var1.method1145();
			this.field3322 = var1.method1096();
		} else if (var2 == 26) {
			this.field3321 = var1.method1145();
		} else if (var2 == 27) {
			this.field3311 = var1.method1096();
		} else if (var2 >= 30 && var2 < 35) {
			this.field3314[var2 - 30] = var1.method1104();
			if (this.field3314[var2 - 30].equalsIgnoreCase(class55.field571)) {
				this.field3314[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.field3315[var2 - 35] = var1.method1104();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method1096();
				this.field3332 = new short[var4];
				this.field3300 = new short[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field3332[var5] = (short) var1.method1145();
					this.field3300[var5] = (short) var1.method1145();
				}
			} else if (var2 == 41) {
				var4 = var1.method1096();
				this.field3326 = new short[var4];
				this.field3302 = new short[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field3326[var5] = (short) var1.method1145();
					this.field3302[var5] = (short) var1.method1145();
				}
			} else if (var2 == 42) {
				this.field3316 = var1.method1097();
			} else if (var2 == 65) {
				this.field3341 = true;
			} else if (var2 == 75) {
				this.field3299 = var1.method1098();
			} else if (var2 == 78) {
				this.field3342 = var1.method1145();
			} else if (var2 == 79) {
				this.field3324 = var1.method1145();
			} else if (var2 == 90) {
				this.field3323 = var1.method1145();
			} else if (var2 == 91) {
				this.field3306 = var1.method1145();
			} else if (var2 == 92) {
				this.field3327 = var1.method1145();
			} else if (var2 == 93) {
				this.field3328 = var1.method1145();
			} else if (var2 == 94) {
				var1.method1145();
			} else if (var2 == 95) {
				this.field3291 = var1.method1145();
			} else if (var2 == 97) {
				this.field3331 = var1.method1145();
			} else if (var2 == 98) {
				this.field3304 = var1.method1145();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.field3329 == null) {
					this.field3329 = new int[10];
					this.field3330 = new int[10];
				}
				this.field3329[var2 - 100] = var1.method1145();
				this.field3330[var2 - 100] = var1.method1145();
			} else if (var2 == 110) {
				this.field3333 = var1.method1145();
			} else if (var2 == 111) {
				this.field3334 = var1.method1145();
			} else if (var2 == 112) {
				this.field3335 = var1.method1145();
			} else if (var2 == 113) {
				this.field3336 = var1.method1097();
			} else if (var2 == 114) {
				this.field3337 = var1.method1097() * 5;
			} else if (var2 == 115) {
				this.field3338 = var1.method1096();
			} else if (var2 == 139) {
				this.field3317 = var1.method1145();
			} else if (var2 == 140) {
				this.field3325 = var1.method1145();
			} else if (var2 == 148) {
				this.field3303 = var1.method1145();
			} else if (var2 == 149) {
				this.field3344 = var1.method1145();
			} else if (var2 == 249) {
				this.field3340 = class437.method2178(var1, this.field3340);
			}
		}
	}

	void method2136(class426 var1, class426 var2) {
		this.field3298 = var1.field3298;
		this.field3312 = var1.field3312;
		this.field3289 = var1.field3289;
		this.field3305 = var1.field3305;
		this.field3291 = var1.field3291;
		this.field3290 = var1.field3290;
		this.field3307 = var1.field3307;
		this.field3332 = var1.field3332;
		this.field3300 = var1.field3300;
		this.field3326 = var1.field3326;
		this.field3302 = var1.field3302;
		this.field3313 = var2.field3313;
		this.field3301 = var2.field3301;
		this.field3309 = var2.field3309;
		this.field3308 = 1;
	}

	void method2150(class426 var1, class426 var2) {
		this.field3298 = var1.field3298;
		this.field3312 = var1.field3312;
		this.field3289 = var1.field3289;
		this.field3305 = var1.field3305;
		this.field3291 = var1.field3291;
		this.field3290 = var1.field3290;
		this.field3307 = var1.field3307;
		this.field3332 = var2.field3332;
		this.field3300 = var2.field3300;
		this.field3326 = var2.field3326;
		this.field3302 = var2.field3302;
		this.field3313 = var2.field3313;
		this.field3301 = var2.field3301;
		this.field3308 = var2.field3308;
		this.field3310 = var2.field3310;
		this.field3295 = var2.field3295;
		this.field3311 = var2.field3311;
		this.field3343 = var2.field3343;
		this.field3318 = var2.field3318;
		this.field3342 = var2.field3342;
		this.field3320 = var2.field3320;
		this.field3321 = var2.field3321;
		this.field3324 = var2.field3324;
		this.field3323 = var2.field3323;
		this.field3327 = var2.field3327;
		this.field3306 = var2.field3306;
		this.field3328 = var2.field3328;
		this.field3338 = var2.field3338;
		this.field3314 = var2.field3314;
		this.field3299 = var2.field3299;
		this.field3315 = new String[5];
		if (null != var2.field3315) {
			for (int var4 = 0; var4 < 4; ++var4) {
				this.field3315[var4] = var2.field3315[var4];
			}
		}
		this.field3315[4] = class55.field357;
		this.field3309 = 0;
	}

	void method2138(class426 var1, class426 var2) {
		this.field3298 = var1.field3298;
		this.field3312 = var1.field3312;
		this.field3289 = var1.field3289;
		this.field3305 = var1.field3305;
		this.field3291 = var1.field3291;
		this.field3290 = var1.field3290;
		this.field3307 = var1.field3307;
		this.field3332 = var1.field3332;
		this.field3300 = var1.field3300;
		this.field3326 = var1.field3326;
		this.field3302 = var1.field3302;
		this.field3308 = var1.field3308;
		this.field3313 = var2.field3313;
		this.field3309 = 0;
		this.field3301 = false;
		this.field3341 = false;
	}

	public final class462 method2145(int var1) {
		int var4;
		if (null != this.field3329 && var1 > 1) {
			int var3 = -1;
			for (var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field3330[var4] && this.field3330[var4] != 0) {
					var3 = this.field3329[var4];
				}
			}
			if (var3 != -1) {
				return method2155(var3).method2145(1);
			}
		}
		class462 var5 = class462.method2259(field3292, this.field3298, 0);
		if (null == var5) {
			return null;
		} else {
			if (this.field3333 != 128 || this.field3334 != 128 || this.field3335 != 128) {
				var5.method2250(this.field3333, this.field3334, this.field3335);
			}
			if (this.field3332 != null) {
				for (var4 = 0; var4 < this.field3332.length; ++var4) {
					var5.method2258(this.field3332[var4], this.field3300[var4]);
				}
			}
			if (null != this.field3326) {
				for (var4 = 0; var4 < this.field3326.length; ++var4) {
					var5.method2249(this.field3326[var4], this.field3302[var4]);
				}
			}
			return var5;
		}
	}

	public final class113 method2140(int var1) {
		if (null != this.field3329 && var1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field3330[var4] && this.field3330[var4] != 0) {
					var3 = this.field3329[var4];
				}
			}
			if (var3 != -1) {
				return method2155(var3).method2140(1);
			}
		}
		class113 var6 = (class113) field3339.method648((long) this.field3297);
		if (var6 != null) {
			return var6;
		} else {
			class462 var7 = class462.method2259(field3292, this.field3298, 0);
			if (var7 == null) {
				return null;
			} else {
				if (this.field3333 != 128 || this.field3334 != 128 || this.field3335 != 128) {
					var7.method2250(this.field3333, this.field3334, this.field3335);
				}
				int var5;
				if (null != this.field3332) {
					for (var5 = 0; var5 < this.field3332.length; ++var5) {
						var7.method2258(this.field3332[var5], this.field3300[var5]);
					}
				}
				if (null != this.field3326) {
					for (var5 = 0; var5 < this.field3326.length; ++var5) {
						var7.method2249(this.field3326[var5], this.field3302[var5]);
					}
				}
				var6 = var7.method2255(this.field3336 + 64, this.field3337 + 768, -50, -10, -50);
				var6.field1328 = true;
				field3339.method647(var6, (long) this.field3297);
				return var6;
			}
		}
	}

	public class426 method2141(int var1) {
		if (null != this.field3329 && var1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field3330[var4] && this.field3330[var4] != 0) {
					var3 = this.field3329[var4];
				}
			}
			if (var3 != -1) {
				return method2155(var3);
			}
		}
		return this;
	}

	public final boolean method2142(int var1) {
		int var3 = this.field3343;
		int var4 = this.field3318;
		int var5 = this.field3342;
		if (var1 == 1) {
			var3 = this.field3320;
			var4 = this.field3321;
			var5 = this.field3324;
		}
		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!field3292.method1764(var3, 0)) {
				var6 = false;
			}
			if (var4 != -1 && !field3292.method1764(var4, 0)) {
				var6 = false;
			}
			if (var5 != -1 && !field3292.method1764(var5, 0)) {
				var6 = false;
			}
			return var6;
		}
	}

	public final class462 method2143(int var1) {
		int var3 = this.field3343;
		int var4 = this.field3318;
		int var5 = this.field3342;
		if (var1 == 1) {
			var3 = this.field3320;
			var4 = this.field3321;
			var5 = this.field3324;
		}
		if (var3 == -1) {
			return null;
		} else {
			class462 var6 = class462.method2259(field3292, var3, 0);
			if (var4 != -1) {
				class462 var7 = class462.method2259(field3292, var4, 0);
				if (var5 != -1) {
					class462 var8 = class462.method2259(field3292, var5, 0);
					class462[] var9 = new class462[] { var6, var7, var8 };
					var6 = new class462(var9, 3);
				} else {
					class462[] var11 = new class462[] { var6, var7 };
					var6 = new class462(var11, 2);
				}
			}
			if (var1 == 0 && this.field3319 != 0) {
				var6.method2247(0, this.field3319, 0);
			}
			if (var1 == 1 && this.field3322 != 0) {
				var6.method2247(0, this.field3322, 0);
			}
			int var10;
			if (this.field3332 != null) {
				for (var10 = 0; var10 < this.field3332.length; ++var10) {
					var6.method2258(this.field3332[var10], this.field3300[var10]);
				}
			}
			if (this.field3326 != null) {
				for (var10 = 0; var10 < this.field3326.length; ++var10) {
					var6.method2249(this.field3326[var10], this.field3302[var10]);
				}
			}
			return var6;
		}
	}

	public final boolean method2144(int var1) {
		int var3 = this.field3323;
		int var4 = this.field3327;
		if (var1 == 1) {
			var3 = this.field3306;
			var4 = this.field3328;
		}
		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!field3292.method1764(var3, 0)) {
				var5 = false;
			}
			if (var4 != -1 && !field3292.method1764(var4, 0)) {
				var5 = false;
			}
			return var5;
		}
	}

	public final class462 method2147(int var1) {
		int var3 = this.field3323;
		int var4 = this.field3327;
		if (var1 == 1) {
			var3 = this.field3306;
			var4 = this.field3328;
		}
		if (var3 == -1) {
			return null;
		} else {
			class462 var5 = class462.method2259(field3292, var3, 0);
			if (var4 != -1) {
				class462 var6 = class462.method2259(field3292, var4, 0);
				class462[] var7 = new class462[] { var5, var6 };
				var5 = new class462(var7, 2);
			}
			int var8;
			if (this.field3332 != null) {
				for (var8 = 0; var8 < this.field3332.length; ++var8) {
					var5.method2258(this.field3332[var8], this.field3300[var8]);
				}
			}
			if (null != this.field3326) {
				for (var8 = 0; var8 < this.field3326.length; ++var8) {
					var5.method2249(this.field3326[var8], this.field3302[var8]);
				}
			}
			return var5;
		}
	}

	public int method2146(int var1, int var2) {
		return class437.method2177(this.field3340, var1, var2);
	}

	public String method2137(int var1, String var2) {
		class419 var5 = this.field3340;
		String var4;
		if (null == var5) {
			var4 = var2;
		} else {
			class47 var6 = (class47) var5.method2105((long) var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = (String) var6.field233;
			}
		}
		return var4;
	}

	public int method2148() {
		if (this.field3316 != -1 && null != this.field3315) {
			if (this.field3316 >= 0) {
				return this.field3315[this.field3316] != null ? this.field3316 : -1;
			} else {
				return class55.field491.equalsIgnoreCase(this.field3315[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	boolean method2152() {
		return this.field3300 != null;
	}

	boolean method2149() {
		return this.field3302 != null;
	}

	public static class426 method2155(int var0) {
		class426 var2 = (class426) field3294.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class111.field1316.method1762(10, var0);
			var2 = new class426();
			var2.field3297 = var0;
			if (null != var3) {
				var2.method2139(new class187(var3));
			}
			var2.method2151();
			if (var2.field3304 != -1) {
				var2.method2136(method2155(var2.field3304), method2155(var2.field3331));
			}
			if (var2.field3325 != -1) {
				var2.method2150(method2155(var2.field3325), method2155(var2.field3317));
			}
			if (var2.field3344 != -1) {
				var2.method2138(method2155(var2.field3344), method2155(var2.field3303));
			}
			if (!field3293 && var2.field3301) {
				if (var2.field3304 == -1 && var2.field3325 == -1 && var2.field3344 == -1) {
					var2.field3313 = var2.field3313 + class55.field548;
				}
				var2.field3341 = false;
				int var4;
				for (var4 = 0; var4 < var2.field3314.length; ++var4) {
					var2.field3314[var4] = null;
				}
				for (var4 = 0; var4 < var2.field3315.length; ++var4) {
					if (var4 != 4) {
						var2.field3315[var4] = null;
					}
				}
				var2.field3316 = -2;
				var2.field3338 = 0;
				if (null != var2.field3340) {
					boolean var7 = false;
					for (class77 var5 = var2.field3340.method2107(); var5 != null; var5 = var2.field3340.method2108()) {
						class408 var6 = class408.method2081((int) var5.field785);
						if (var6.field3184) {
							var5.method318();
						} else {
							var7 = true;
						}
					}
					if (!var7) {
						var2.field3340 = null;
					}
				}
			}
			field3294.method647(var2, (long) var0);
			return var2;
		}
	}

	public static final class84 method2153(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}
		long var7 = ((long) var4 << 40) + ((long) var2 << 38) + ((long) var1 << 16) + (long) var0 + ((long) var3 << 42);
		class84 var9;
		if (!var5) {
			var9 = (class84) field3296.method648(var7);
			if (var9 != null) {
				return var9;
			}
		}
		class426 var10 = method2155(var0);
		if (var1 > 1 && null != var10.field3329) {
			int var11 = -1;
			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field3330[var12] && var10.field3330[var12] != 0) {
					var11 = var10.field3329[var12];
				}
			}
			if (var11 != -1) {
				var10 = method2155(var11);
			}
		}
		class113 var23 = var10.method2140(1);
		if (var23 == null) {
			return null;
		} else {
			class84 var24 = null;
			if (var10.field3304 != -1) {
				var24 = method2153(var10.field3331, 10, 1, 0, 0, true);
				if (null == var24) {
					return null;
				}
			} else if (var10.field3325 != -1) {
				var24 = method2153(var10.field3317, var1, var2, var3, 0, false);
				if (var24 == null) {
					return null;
				}
			} else if (var10.field3344 != -1) {
				var24 = method2153(var10.field3303, var1, 0, 0, 0, false);
				if (null == var24) {
					return null;
				}
			}
			int[] var13 = class206.field1906;
			int var14 = class206.field1904;
			int var15 = class206.field1905;
			float[] var16 = class206.field1907;
			int[] var17 = new int[4];
			class206.method1232(var17);
			var9 = new class84(36, 32);
			class238.method1396(var9.field847, 36, 32, (float[]) null);
			class206.method1233();
			class238.method1397();
			class238.method1408(16, 16);
			class238.field2039.field2269 = false;
			if (var10.field3344 != -1) {
				var24.method380(0, 0);
			}
			int var18 = var10.field3312;
			if (var5) {
				var18 = (int) ((double) var18 * 1.5D);
			} else if (var2 == 2) {
				var18 = (int) ((double) var18 * 1.04D);
			}
			int var19 = class238.field2037[var10.field3289] * var18 >> 16;
			int var20 = class238.field2035[var10.field3289] * var18 >> 16;
			var23.method679();
			var23.method685(0, var10.field3305, var10.field3291, var10.field3289, var10.field3290, var19 + var23.field1834 / 2 + var10.field3307, var10.field3307 + var20);
			if (var10.field3325 != -1) {
				var24.method380(0, 0);
			}
			if (var2 >= 1) {
				var9.method358(1);
			}
			if (var2 >= 2) {
				var9.method358(16777215);
			}
			if (var3 != 0) {
				var9.method359(var3);
			}
			class238.method1396(var9.field847, 36, 32, (float[]) null);
			if (var10.field3304 != -1) {
				var24.method380(0, 0);
			}
			if (var4 == 1 || var4 == 2 && var10.field3308 == 1) {
				class61 var21 = class154.field1597;
				String var22;
				if (var1 < 100000) {
					var22 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var22 = "<col=ffffff>" + var1 / 1000 + class55.field497 + "</col>";
				} else {
					var22 = "<col=00ff80>" + var1 / 1000000 + class55.field495 + "</col>";
				}
				var21.method2414(var22, 0, 9, 16776960, 1);
			}
			if (!var5) {
				field3296.method647(var9, var7);
			}
			class238.method1396(var13, var14, var15, var16);
			class206.method1252(var17);
			class238.method1397();
			class238.field2039.field2269 = true;
			return var9;
		}
	}

	public static void method2154() {
		field3296.method645();
	}
}
