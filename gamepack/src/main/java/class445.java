import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ic")
public class class445 extends class510 {
	@ObfInfo(name = "bb", desc = "I")
	static int field3358;
	@ObfInfo(name = "br", desc = "[I")
	static int[] field3341;
	@ObfInfo(name = "bu", desc = "[I")
	static int[] field3360;
	@ObfInfo(name = "be", desc = "[I")
	static int[] field3364;
	@ObfInfo(name = "bo", desc = "[I")
	static int[] field3378;
	@ObfInfo(name = "bm", desc = "Z")
	boolean field3371;
	@ObfInfo(name = "am", desc = "B")
	byte field3355;
	@ObfInfo(name = "ar", desc = "[B")
	byte[] field3340;
	@ObfInfo(name = "al", desc = "[B")
	byte[] field3350;
	@ObfInfo(name = "an", desc = "[B")
	byte[] field3351;
	@ObfInfo(name = "ah", desc = "[B")
	byte[] field3369;
	@ObfInfo(name = "aq", desc = "[B")
	byte[] field3372;
	@ObfInfo(name = "bt", desc = "[Lja;")
	class139[] field3352;
	@ObfInfo(name = "bd", desc = "[Lja;")
	class139[] field3368;
	@ObfInfo(name = "bv", desc = "[Liq;")
	class335[] field3366;
	@ObfInfo(name = "at", desc = "I")
	int field3342;
	@ObfInfo(name = "ba", desc = "I")
	int field3349;
	@ObfInfo(name = "ax", desc = "I")
	int field3356;
	@ObfInfo(name = "bq", desc = "I")
	int field3373;
	@ObfInfo(name = "ap", desc = "I")
	int field3374;
	@ObfInfo(name = "bl", desc = "I")
	int field3375;
	@ObfInfo(name = "bp", desc = "I")
	int field3376;
	@ObfInfo(name = "bf", desc = "I")
	int field3379;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field3343;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field3344;
	@ObfInfo(name = "az", desc = "[I")
	int[] field3345;
	@ObfInfo(name = "aa", desc = "[I")
	int[] field3346;
	@ObfInfo(name = "af", desc = "[I")
	int[] field3347;
	@ObfInfo(name = "ad", desc = "[I")
	int[] field3348;
	@ObfInfo(name = "av", desc = "[I")
	int[] field3367;
	@ObfInfo(name = "aw", desc = "[I")
	int[] field3380;
	@ObfInfo(name = "bj", desc = "[[I")
	int[][] field3361;
	@ObfInfo(name = "ak", desc = "[[I")
	int[][] field3362;
	@ObfInfo(name = "bh", desc = "[[I")
	int[][] field3363;
	@ObfInfo(name = "bk", desc = "[[I")
	int[][] field3365;
	@ObfInfo(name = "ab", desc = "[S")
	short[] field3353;
	@ObfInfo(name = "ag", desc = "[S")
	short[] field3354;
	@ObfInfo(name = "as", desc = "[S")
	short[] field3357;
	@ObfInfo(name = "ay", desc = "[S")
	short[] field3359;
	@ObfInfo(name = "aj", desc = "[S")
	short[] field3377;
	@ObfInfo(name = "bs", desc = "S")
	public short field3370;
	@ObfInfo(name = "by", desc = "S")
	public short field3381;

	static {
		field3360 = new int[10000];
		field3378 = new int[10000];
		field3358 = 0;
		field3341 = class276.field2236;
		field3364 = class276.field2234;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class445() {
		this.field3342 = 0;
		this.field3374 = 0;
		this.field3355 = 0;
		this.field3371 = false;
	}

	@ObfInfo(name = "<init>", desc = "([B)V")
	class445(byte[] var1) {
		this.field3342 = 0;
		this.field3374 = 0;
		this.field3355 = 0;
		this.field3371 = false;
		class280 var2 = new class280(10);
		var2.method1522(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method2343(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method2339(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method2345(var1);
		} else {
			this.method2344(var1);
		}

	}

	@ObfInfo(name = "<init>", desc = "([Lic;I)V")
	public class445(class445[] var1, int var2) {
		this.field3342 = 0;
		this.field3374 = 0;
		this.field3355 = 0;
		this.field3371 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field3342 = 0;
		this.field3374 = 0;
		this.field3356 = 0;
		this.field3355 = -1;

		int var10;
		class445 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field3342 += var11.field3342;
				this.field3374 += var11.field3374;
				this.field3356 += var11.field3356;
				if (var11.field3350 != null) {
					var4 = true;
				} else {
					if (this.field3355 == -1) {
						this.field3355 = var11.field3355;
					}

					if (this.field3355 != var11.field3355) {
						var4 = true;
					}
				}

				var3 |= var11.field3372 != null;
				var5 |= var11.field3351 != null;
				var6 |= var11.field3380 != null;
				var7 |= var11.field3354 != null;
				var8 |= var11.field3340 != null;
				var9 |= var11.field3361 != null;
			}
		}

		this.field3343 = new int[this.field3342];
		this.field3344 = new int[this.field3342];
		this.field3345 = new int[this.field3342];
		this.field3367 = new int[this.field3342];
		this.field3346 = new int[this.field3374];
		this.field3347 = new int[this.field3374];
		this.field3348 = new int[this.field3374];
		if (var3) {
			this.field3372 = new byte[this.field3374];
		}

		if (var4) {
			this.field3350 = new byte[this.field3374];
		}

		if (var5) {
			this.field3351 = new byte[this.field3374];
		}

		if (var6) {
			this.field3380 = new int[this.field3374];
		}

		if (var7) {
			this.field3354 = new short[this.field3374];
		}

		if (var8) {
			this.field3340 = new byte[this.field3374];
		}

		if (var9) {
			this.field3361 = new int[this.field3342][];
			this.field3365 = new int[this.field3342][];
		}

		this.field3353 = new short[this.field3374];
		if (this.field3356 > 0) {
			this.field3369 = new byte[this.field3356];
			this.field3357 = new short[this.field3356];
			this.field3359 = new short[this.field3356];
			this.field3377 = new short[this.field3356];
		}

		this.field3342 = 0;
		this.field3374 = 0;
		this.field3356 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field3374; ++var12) {
					if (var3 && var11.field3372 != null) {
						this.field3372[this.field3374] = var11.field3372[var12];
					}

					if (var4) {
						if (var11.field3350 != null) {
							this.field3350[this.field3374] = var11.field3350[var12];
						} else {
							this.field3350[this.field3374] = var11.field3355;
						}
					}

					if (var5 && var11.field3351 != null) {
						this.field3351[this.field3374] = var11.field3351[var12];
					}

					if (var6 && var11.field3380 != null) {
						this.field3380[this.field3374] = var11.field3380[var12];
					}

					if (var7) {
						if (var11.field3354 != null) {
							this.field3354[this.field3374] = var11.field3354[var12];
						} else {
							this.field3354[this.field3374] = -1;
						}
					}

					if (var8) {
						if (var11.field3340 != null && var11.field3340[var12] != -1) {
							this.field3340[this.field3374] = (byte)(var11.field3340[var12] + this.field3356);
						} else {
							this.field3340[this.field3374] = -1;
						}
					}

					this.field3353[this.field3374] = var11.field3353[var12];
					this.field3346[this.field3374] = this.method2321(var11, var11.field3346[var12]);
					this.field3347[this.field3374] = this.method2321(var11, var11.field3347[var12]);
					this.field3348[this.field3374] = this.method2321(var11, var11.field3348[var12]);
					++this.field3374;
				}

				for (var12 = 0; var12 < var11.field3356; ++var12) {
					byte var13 = this.field3369[this.field3356] = var11.field3369[var12];
					if (var13 == 0) {
						this.field3357[this.field3356] = (short)this.method2321(var11, var11.field3357[var12]);
						this.field3359[this.field3356] = (short)this.method2321(var11, var11.field3359[var12]);
						this.field3377[this.field3356] = (short)this.method2321(var11, var11.field3377[var12]);
					}

					++this.field3356;
				}
			}
		}

	}

	@ObfInfo(name = "<init>", desc = "(Lic;ZZZZ)V")
	public class445(class445 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field3342 = 0;
		this.field3374 = 0;
		this.field3355 = 0;
		this.field3371 = false;
		this.field3342 = var1.field3342;
		this.field3374 = var1.field3374;
		this.field3356 = var1.field3356;
		int var6;
		if (var2) {
			this.field3343 = var1.field3343;
			this.field3344 = var1.field3344;
			this.field3345 = var1.field3345;
		} else {
			this.field3343 = new int[this.field3342];
			this.field3344 = new int[this.field3342];
			this.field3345 = new int[this.field3342];

			for (var6 = 0; var6 < this.field3342; ++var6) {
				this.field3343[var6] = var1.field3343[var6];
				this.field3344[var6] = var1.field3344[var6];
				this.field3345[var6] = var1.field3345[var6];
			}
		}

		if (var3) {
			this.field3353 = var1.field3353;
		} else {
			this.field3353 = new short[this.field3374];

			for (var6 = 0; var6 < this.field3374; ++var6) {
				this.field3353[var6] = var1.field3353[var6];
			}
		}

		if (!var4 && var1.field3354 != null) {
			this.field3354 = new short[this.field3374];

			for (var6 = 0; var6 < this.field3374; ++var6) {
				this.field3354[var6] = var1.field3354[var6];
			}
		} else {
			this.field3354 = var1.field3354;
		}

		if (var5) {
			this.field3351 = var1.field3351;
		} else {
			this.field3351 = new byte[this.field3374];
			if (var1.field3351 == null) {
				for (var6 = 0; var6 < this.field3374; ++var6) {
					this.field3351[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field3374; ++var6) {
					this.field3351[var6] = var1.field3351[var6];
				}
			}
		}

		this.field3346 = var1.field3346;
		this.field3347 = var1.field3347;
		this.field3348 = var1.field3348;
		this.field3372 = var1.field3372;
		this.field3350 = var1.field3350;
		this.field3340 = var1.field3340;
		this.field3355 = var1.field3355;
		this.field3369 = var1.field3369;
		this.field3357 = var1.field3357;
		this.field3359 = var1.field3359;
		this.field3377 = var1.field3377;
		this.field3367 = var1.field3367;
		this.field3380 = var1.field3380;
		this.field3362 = var1.field3362;
		this.field3363 = var1.field3363;
		this.field3352 = var1.field3352;
		this.field3366 = var1.field3366;
		this.field3368 = var1.field3368;
		this.field3361 = var1.field3361;
		this.field3365 = var1.field3365;
		this.field3381 = var1.field3381;
		this.field3370 = var1.field3370;
	}

	@ObfInfo(name = "ao", desc = "([B)V")
	void method2343(byte[] var1) {
		class280 var2 = new class280(var1);
		class280 var3 = new class280(var1);
		class280 var4 = new class280(var1);
		class280 var5 = new class280(var1);
		class280 var6 = new class280(var1);
		class280 var7 = new class280(var1);
		class280 var8 = new class280(var1);
		var2.field2254 = var1.length - 26;
		int var9 = var2.method1541();
		int var10 = var2.method1541();
		int var11 = var2.method1492();
		int var12 = var2.method1492();
		int var13 = var2.method1492();
		int var14 = var2.method1492();
		int var15 = var2.method1492();
		int var16 = var2.method1492();
		int var17 = var2.method1492();
		int var18 = var2.method1492();
		int var19 = var2.method1541();
		int var20 = var2.method1541();
		int var21 = var2.method1541();
		int var22 = var2.method1541();
		int var23 = var2.method1541();
		int var24 = var2.method1541();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field3369 = new byte[var11];
			var2.field2254 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field3369[var28] = var2.method1493();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field3342 = var9;
		this.field3374 = var10;
		this.field3356 = var11;
		this.field3343 = new int[var9];
		this.field3344 = new int[var9];
		this.field3345 = new int[var9];
		this.field3346 = new int[var10];
		this.field3347 = new int[var10];
		this.field3348 = new int[var10];
		if (var17 == 1) {
			this.field3367 = new int[var9];
		}

		if (var12 == 1) {
			this.field3372 = new byte[var10];
		}

		if (var13 == 255) {
			this.field3350 = new byte[var10];
		} else {
			this.field3355 = (byte)var13;
		}

		if (var14 == 1) {
			this.field3351 = new byte[var10];
		}

		if (var15 == 1) {
			this.field3380 = new int[var10];
		}

		if (var16 == 1) {
			this.field3354 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field3340 = new byte[var10];
		}

		if (var18 == 1) {
			this.field3361 = new int[var9][];
			this.field3365 = new int[var9][];
		}

		this.field3353 = new short[var10];
		if (var11 > 0) {
			this.field3357 = new short[var11];
			this.field3359 = new short[var11];
			this.field3377 = new short[var11];
		}

		var2.field2254 = var11;
		var3.field2254 = var40;
		var4.field2254 = var41;
		var5.field2254 = var42;
		var6.field2254 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method1492();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method1503();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method1503();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method1503();
			}

			this.field3343[var53] = var50 + var55;
			this.field3344[var53] = var51 + var56;
			this.field3345[var53] = var52 + var57;
			var50 = this.field3343[var53];
			var51 = this.field3344[var53];
			var52 = this.field3345[var53];
			if (var17 == 1) {
				this.field3367[var53] = var6.method1492();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method1492();
				this.field3361[var53] = new int[var54];
				this.field3365[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field3361[var53][var55] = var6.method1492();
					this.field3365[var53][var55] = var6.method1492();
				}
			}
		}

		var2.field2254 = var39;
		var3.field2254 = var30;
		var4.field2254 = var32;
		var5.field2254 = var35;
		var6.field2254 = var33;
		var7.field2254 = var37;
		var8.field2254 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field3353[var53] = (short)var2.method1541();
			if (var12 == 1) {
				this.field3372[var53] = var3.method1493();
			}

			if (var13 == 255) {
				this.field3350[var53] = var4.method1493();
			}

			if (var14 == 1) {
				this.field3351[var53] = var5.method1493();
			}

			if (var15 == 1) {
				this.field3380[var53] = var6.method1492();
			}

			if (var16 == 1) {
				this.field3354[var53] = (short)(var7.method1541() - 1);
			}

			if (this.field3340 != null && this.field3354[var53] != -1) {
				this.field3340[var53] = (byte)(var8.method1492() - 1);
			}
		}

		var2.field2254 = var36;
		var3.field2254 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method1492();
			if (var58 == 1) {
				var53 = var2.method1503() + var56;
				var54 = var2.method1503() + var53;
				var55 = var2.method1503() + var54;
				var56 = var55;
				this.field3346[var57] = var53;
				this.field3347[var57] = var54;
				this.field3348[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method1503() + var56;
				var56 = var55;
				this.field3346[var57] = var53;
				this.field3347[var57] = var54;
				this.field3348[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method1503() + var56;
				var56 = var55;
				this.field3346[var57] = var53;
				this.field3347[var57] = var54;
				this.field3348[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method1503() + var56;
				var56 = var55;
				this.field3346[var57] = var53;
				this.field3347[var57] = var59;
				this.field3348[var57] = var55;
			}
		}

		var2.field2254 = var43;
		var3.field2254 = var44;
		var4.field2254 = var45;
		var5.field2254 = var46;
		var6.field2254 = var47;
		var7.field2254 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field3369[var57] & 255;
			if (var58 == 0) {
				this.field3357[var57] = (short)var2.method1541();
				this.field3359[var57] = (short)var2.method1541();
				this.field3377[var57] = (short)var2.method1541();
			}
		}

		var2.field2254 = var28;
		var57 = var2.method1492();
		if (var57 != 0) {
			new class178();
			var2.method1541();
			var2.method1541();
			var2.method1541();
			var2.method1496();
		}

	}

	@ObfInfo(name = "at", desc = "([B)V")
	void method2339(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class280 var4 = new class280(var1);
		class280 var5 = new class280(var1);
		class280 var6 = new class280(var1);
		class280 var7 = new class280(var1);
		class280 var8 = new class280(var1);
		var4.field2254 = var1.length - 23;
		int var9 = var4.method1541();
		int var10 = var4.method1541();
		int var11 = var4.method1492();
		int var12 = var4.method1492();
		int var13 = var4.method1492();
		int var14 = var4.method1492();
		int var15 = var4.method1492();
		int var16 = var4.method1492();
		int var17 = var4.method1492();
		int var18 = var4.method1541();
		int var19 = var4.method1541();
		int var20 = var4.method1541();
		int var21 = var4.method1541();
		int var22 = var4.method1541();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field3342 = var9;
		this.field3374 = var10;
		this.field3356 = var11;
		this.field3343 = new int[var9];
		this.field3344 = new int[var9];
		this.field3345 = new int[var9];
		this.field3346 = new int[var10];
		this.field3347 = new int[var10];
		this.field3348 = new int[var10];
		if (var11 > 0) {
			this.field3369 = new byte[var11];
			this.field3357 = new short[var11];
			this.field3359 = new short[var11];
			this.field3377 = new short[var11];
		}

		if (var16 == 1) {
			this.field3367 = new int[var9];
		}

		if (var12 == 1) {
			this.field3372 = new byte[var10];
			this.field3340 = new byte[var10];
			this.field3354 = new short[var10];
		}

		if (var13 == 255) {
			this.field3350 = new byte[var10];
		} else {
			this.field3355 = (byte)var13;
		}

		if (var14 == 1) {
			this.field3351 = new byte[var10];
		}

		if (var15 == 1) {
			this.field3380 = new int[var10];
		}

		if (var17 == 1) {
			this.field3361 = new int[var9][];
			this.field3365 = new int[var9][];
		}

		this.field3353 = new short[var10];
		var4.field2254 = var23;
		var5.field2254 = var34;
		var6.field2254 = var35;
		var7.field2254 = var47;
		var8.field2254 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method1492();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method1503();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method1503();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method1503();
			}

			this.field3343[var40] = var37 + var42;
			this.field3344[var40] = var38 + var43;
			this.field3345[var40] = var39 + var44;
			var37 = this.field3343[var40];
			var38 = this.field3344[var40];
			var39 = this.field3345[var40];
			if (var16 == 1) {
				this.field3367[var40] = var8.method1492();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method1492();
				this.field3361[var40] = new int[var41];
				this.field3365[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field3361[var40][var42] = var8.method1492();
					this.field3365[var40][var42] = var8.method1492();
				}
			}
		}

		var4.field2254 = var32;
		var5.field2254 = var28;
		var6.field2254 = var26;
		var7.field2254 = var30;
		var8.field2254 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field3353[var40] = (short)var4.method1541();
			if (var12 == 1) {
				var41 = var5.method1492();
				if ((var41 & 1) == 1) {
					this.field3372[var40] = 1;
					var2 = true;
				} else {
					this.field3372[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field3340[var40] = (byte)(var41 >> 2);
					this.field3354[var40] = this.field3353[var40];
					this.field3353[var40] = 127;
					if (this.field3354[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field3340[var40] = -1;
					this.field3354[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field3350[var40] = var6.method1493();
			}

			if (var14 == 1) {
				this.field3351[var40] = var7.method1493();
			}

			if (var15 == 1) {
				this.field3380[var40] = var8.method1492();
			}
		}

		var4.field2254 = var31;
		var5.field2254 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method1492();
			if (var45 == 1) {
				var40 = var4.method1503() + var43;
				var41 = var4.method1503() + var40;
				var42 = var4.method1503() + var41;
				var43 = var42;
				this.field3346[var44] = var40;
				this.field3347[var44] = var41;
				this.field3348[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method1503() + var43;
				var43 = var42;
				this.field3346[var44] = var40;
				this.field3347[var44] = var41;
				this.field3348[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method1503() + var43;
				var43 = var42;
				this.field3346[var44] = var40;
				this.field3347[var44] = var41;
				this.field3348[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method1503() + var43;
				var43 = var42;
				this.field3346[var44] = var40;
				this.field3347[var44] = var46;
				this.field3348[var44] = var42;
			}
		}

		var4.field2254 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field3369[var44] = 0;
			this.field3357[var44] = (short)var4.method1541();
			this.field3359[var44] = (short)var4.method1541();
			this.field3377[var44] = (short)var4.method1541();
		}

		if (this.field3340 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field3340[var45] & 255;
				if (var46 != 255) {
					if ((this.field3357[var46] & '\uffff') == this.field3346[var45] && (this.field3359[var46] & '\uffff') == this.field3347[var45] && (this.field3377[var46] & '\uffff') == this.field3348[var45]) {
						this.field3340[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field3340 = null;
			}
		}

		if (!var3) {
			this.field3354 = null;
		}

		if (!var2) {
			this.field3372 = null;
		}

	}

	@ObfInfo(name = "az", desc = "([B)V")
	void method2345(byte[] var1) {
		class280 var2 = new class280(var1);
		class280 var3 = new class280(var1);
		class280 var4 = new class280(var1);
		class280 var5 = new class280(var1);
		class280 var6 = new class280(var1);
		class280 var7 = new class280(var1);
		class280 var8 = new class280(var1);
		var2.field2254 = var1.length - 23;
		int var9 = var2.method1541();
		int var10 = var2.method1541();
		int var11 = var2.method1492();
		int var12 = var2.method1492();
		int var13 = var2.method1492();
		int var14 = var2.method1492();
		int var15 = var2.method1492();
		int var16 = var2.method1492();
		int var17 = var2.method1492();
		int var18 = var2.method1541();
		int var19 = var2.method1541();
		int var20 = var2.method1541();
		int var21 = var2.method1541();
		int var22 = var2.method1541();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field3369 = new byte[var11];
			var2.field2254 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field3369[var26] = var2.method1493();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field3342 = var9;
		this.field3374 = var10;
		this.field3356 = var11;
		this.field3343 = new int[var9];
		this.field3344 = new int[var9];
		this.field3345 = new int[var9];
		this.field3346 = new int[var10];
		this.field3347 = new int[var10];
		this.field3348 = new int[var10];
		if (var17 == 1) {
			this.field3367 = new int[var9];
		}

		if (var12 == 1) {
			this.field3372 = new byte[var10];
		}

		if (var13 == 255) {
			this.field3350 = new byte[var10];
		} else {
			this.field3355 = (byte)var13;
		}

		if (var14 == 1) {
			this.field3351 = new byte[var10];
		}

		if (var15 == 1) {
			this.field3380 = new int[var10];
		}

		if (var16 == 1) {
			this.field3354 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field3340 = new byte[var10];
		}

		this.field3353 = new short[var10];
		if (var11 > 0) {
			this.field3357 = new short[var11];
			this.field3359 = new short[var11];
			this.field3377 = new short[var11];
		}

		var2.field2254 = var11;
		var3.field2254 = var38;
		var4.field2254 = var39;
		var5.field2254 = var40;
		var6.field2254 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method1492();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method1503();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method1503();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method1503();
			}

			this.field3343[var51] = var48 + var53;
			this.field3344[var51] = var49 + var54;
			this.field3345[var51] = var50 + var55;
			var48 = this.field3343[var51];
			var49 = this.field3344[var51];
			var50 = this.field3345[var51];
			if (var17 == 1) {
				this.field3367[var51] = var6.method1492();
			}
		}

		var2.field2254 = var37;
		var3.field2254 = var28;
		var4.field2254 = var30;
		var5.field2254 = var33;
		var6.field2254 = var31;
		var7.field2254 = var35;
		var8.field2254 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field3353[var51] = (short)var2.method1541();
			if (var12 == 1) {
				this.field3372[var51] = var3.method1493();
			}

			if (var13 == 255) {
				this.field3350[var51] = var4.method1493();
			}

			if (var14 == 1) {
				this.field3351[var51] = var5.method1493();
			}

			if (var15 == 1) {
				this.field3380[var51] = var6.method1492();
			}

			if (var16 == 1) {
				this.field3354[var51] = (short)(var7.method1541() - 1);
			}

			if (this.field3340 != null && this.field3354[var51] != -1) {
				this.field3340[var51] = (byte)(var8.method1492() - 1);
			}
		}

		var2.field2254 = var34;
		var3.field2254 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method1492();
			if (var56 == 1) {
				var51 = var2.method1503() + var54;
				var52 = var2.method1503() + var51;
				var53 = var2.method1503() + var52;
				var54 = var53;
				this.field3346[var55] = var51;
				this.field3347[var55] = var52;
				this.field3348[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method1503() + var54;
				var54 = var53;
				this.field3346[var55] = var51;
				this.field3347[var55] = var52;
				this.field3348[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method1503() + var54;
				var54 = var53;
				this.field3346[var55] = var51;
				this.field3347[var55] = var52;
				this.field3348[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method1503() + var54;
				var54 = var53;
				this.field3346[var55] = var51;
				this.field3347[var55] = var57;
				this.field3348[var55] = var53;
			}
		}

		var2.field2254 = var41;
		var3.field2254 = var42;
		var4.field2254 = var43;
		var5.field2254 = var44;
		var6.field2254 = var45;
		var7.field2254 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field3369[var55] & 255;
			if (var56 == 0) {
				this.field3357[var55] = (short)var2.method1541();
				this.field3359[var55] = (short)var2.method1541();
				this.field3377[var55] = (short)var2.method1541();
			}
		}

		var2.field2254 = var26;
		var55 = var2.method1492();
		if (var55 != 0) {
			new class178();
			var2.method1541();
			var2.method1541();
			var2.method1541();
			var2.method1496();
		}

	}

	@ObfInfo(name = "ap", desc = "([B)V")
	void method2344(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class280 var4 = new class280(var1);
		class280 var5 = new class280(var1);
		class280 var6 = new class280(var1);
		class280 var7 = new class280(var1);
		class280 var8 = new class280(var1);
		var4.field2254 = var1.length - 18;
		int var9 = var4.method1541();
		int var10 = var4.method1541();
		int var11 = var4.method1492();
		int var12 = var4.method1492();
		int var13 = var4.method1492();
		int var14 = var4.method1492();
		int var15 = var4.method1492();
		int var16 = var4.method1492();
		int var17 = var4.method1541();
		int var18 = var4.method1541();
		int var19 = var4.method1541();
		int var20 = var4.method1541();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field3342 = var9;
		this.field3374 = var10;
		this.field3356 = var11;
		this.field3343 = new int[var9];
		this.field3344 = new int[var9];
		this.field3345 = new int[var9];
		this.field3346 = new int[var10];
		this.field3347 = new int[var10];
		this.field3348 = new int[var10];
		if (var11 > 0) {
			this.field3369 = new byte[var11];
			this.field3357 = new short[var11];
			this.field3359 = new short[var11];
			this.field3377 = new short[var11];
		}

		if (var16 == 1) {
			this.field3367 = new int[var9];
		}

		if (var12 == 1) {
			this.field3372 = new byte[var10];
			this.field3340 = new byte[var10];
			this.field3354 = new short[var10];
		}

		if (var13 == 255) {
			this.field3350 = new byte[var10];
		} else {
			this.field3355 = (byte)var13;
		}

		if (var14 == 1) {
			this.field3351 = new byte[var10];
		}

		if (var15 == 1) {
			this.field3380 = new int[var10];
		}

		this.field3353 = new short[var10];
		var4.field2254 = var21;
		var5.field2254 = var32;
		var6.field2254 = var33;
		var7.field2254 = var45;
		var8.field2254 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method1492();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method1503();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method1503();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method1503();
			}

			this.field3343[var38] = var35 + var40;
			this.field3344[var38] = var36 + var41;
			this.field3345[var38] = var37 + var42;
			var35 = this.field3343[var38];
			var36 = this.field3344[var38];
			var37 = this.field3345[var38];
			if (var16 == 1) {
				this.field3367[var38] = var8.method1492();
			}
		}

		var4.field2254 = var30;
		var5.field2254 = var26;
		var6.field2254 = var24;
		var7.field2254 = var28;
		var8.field2254 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field3353[var38] = (short)var4.method1541();
			if (var12 == 1) {
				var39 = var5.method1492();
				if ((var39 & 1) == 1) {
					this.field3372[var38] = 1;
					var2 = true;
				} else {
					this.field3372[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field3340[var38] = (byte)(var39 >> 2);
					this.field3354[var38] = this.field3353[var38];
					this.field3353[var38] = 127;
					if (this.field3354[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field3340[var38] = -1;
					this.field3354[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field3350[var38] = var6.method1493();
			}

			if (var14 == 1) {
				this.field3351[var38] = var7.method1493();
			}

			if (var15 == 1) {
				this.field3380[var38] = var8.method1492();
			}
		}

		var4.field2254 = var29;
		var5.field2254 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method1492();
			if (var43 == 1) {
				var38 = var4.method1503() + var41;
				var39 = var4.method1503() + var38;
				var40 = var4.method1503() + var39;
				var41 = var40;
				this.field3346[var42] = var38;
				this.field3347[var42] = var39;
				this.field3348[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method1503() + var41;
				var41 = var40;
				this.field3346[var42] = var38;
				this.field3347[var42] = var39;
				this.field3348[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method1503() + var41;
				var41 = var40;
				this.field3346[var42] = var38;
				this.field3347[var42] = var39;
				this.field3348[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method1503() + var41;
				var41 = var40;
				this.field3346[var42] = var38;
				this.field3347[var42] = var44;
				this.field3348[var42] = var40;
			}
		}

		var4.field2254 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field3369[var42] = 0;
			this.field3357[var42] = (short)var4.method1541();
			this.field3359[var42] = (short)var4.method1541();
			this.field3377[var42] = (short)var4.method1541();
		}

		if (this.field3340 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field3340[var43] & 255;
				if (var44 != 255) {
					if ((this.field3357[var44] & '\uffff') == this.field3346[var43] && (this.field3359[var44] & '\uffff') == this.field3347[var43] && (this.field3377[var44] & '\uffff') == this.field3348[var43]) {
						this.field3340[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field3340 = null;
			}
		}

		if (!var3) {
			this.field3354 = null;
		}

		if (!var2) {
			this.field3372 = null;
		}

	}

	@ObfInfo(name = "aa", desc = "(Lic;I)I")
	final int method2321(class445 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field3343[var2];
		int var5 = var1.field3344[var2];
		int var6 = var1.field3345[var2];

		for (int var7 = 0; var7 < this.field3342; ++var7) {
			if (var4 == this.field3343[var7] && var5 == this.field3344[var7] && var6 == this.field3345[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field3343[this.field3342] = var4;
			this.field3344[this.field3342] = var5;
			this.field3345[this.field3342] = var6;
			if (var1.field3367 != null) {
				this.field3367[this.field3342] = var1.field3367[var2];
			}

			if (var1.field3361 != null) {
				this.field3361[this.field3342] = var1.field3361[var2];
				this.field3365[this.field3342] = var1.field3365[var2];
			}

			var3 = this.field3342++;
		}

		return var3;
	}

	@ObfInfo(name = "af", desc = "()Lic;")
	public class445 method2322() {
		class445 var1 = new class445();
		if (this.field3372 != null) {
			var1.field3372 = new byte[this.field3374];

			for (int var2 = 0; var2 < this.field3374; ++var2) {
				var1.field3372[var2] = this.field3372[var2];
			}
		}

		var1.field3342 = this.field3342;
		var1.field3374 = this.field3374;
		var1.field3356 = this.field3356;
		var1.field3343 = this.field3343;
		var1.field3344 = this.field3344;
		var1.field3345 = this.field3345;
		var1.field3346 = this.field3346;
		var1.field3347 = this.field3347;
		var1.field3348 = this.field3348;
		var1.field3350 = this.field3350;
		var1.field3351 = this.field3351;
		var1.field3340 = this.field3340;
		var1.field3353 = this.field3353;
		var1.field3354 = this.field3354;
		var1.field3355 = this.field3355;
		var1.field3369 = this.field3369;
		var1.field3357 = this.field3357;
		var1.field3359 = this.field3359;
		var1.field3377 = this.field3377;
		var1.field3367 = this.field3367;
		var1.field3380 = this.field3380;
		var1.field3362 = this.field3362;
		var1.field3363 = this.field3363;
		var1.field3352 = this.field3352;
		var1.field3366 = this.field3366;
		var1.field3381 = this.field3381;
		var1.field3370 = this.field3370;
		return var1;
	}

	@ObfInfo(name = "ad", desc = "([[IIIIZI)Lic;")
	public class445 method2323(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method2335();
		int var7 = var2 + this.field3373;
		int var8 = var2 + this.field3349;
		int var9 = var4 + this.field3376;
		int var10 = var4 + this.field3375;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class445 var11;
				if (var5) {
					var11 = new class445();
					var11.field3342 = this.field3342;
					var11.field3374 = this.field3374;
					var11.field3356 = this.field3356;
					var11.field3343 = this.field3343;
					var11.field3345 = this.field3345;
					var11.field3346 = this.field3346;
					var11.field3347 = this.field3347;
					var11.field3348 = this.field3348;
					var11.field3372 = this.field3372;
					var11.field3350 = this.field3350;
					var11.field3351 = this.field3351;
					var11.field3340 = this.field3340;
					var11.field3353 = this.field3353;
					var11.field3354 = this.field3354;
					var11.field3355 = this.field3355;
					var11.field3369 = this.field3369;
					var11.field3357 = this.field3357;
					var11.field3359 = this.field3359;
					var11.field3377 = this.field3377;
					var11.field3367 = this.field3367;
					var11.field3380 = this.field3380;
					var11.field3362 = this.field3362;
					var11.field3363 = this.field3363;
					var11.field3381 = this.field3381;
					var11.field3370 = this.field3370;
					var11.field3344 = new int[var11.field3342];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field3342; ++var12) {
						var13 = this.field3343[var12] + var2;
						var14 = this.field3345[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field3344[var12] = this.field3344[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field3342; ++var12) {
						var13 = (-this.field3344[var12] << 16) / super.field4095;
						if (var13 < var6) {
							var14 = this.field3343[var12] + var2;
							var15 = this.field3345[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field3344[var12] = this.field3344[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method2334();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfInfo(name = "aq", desc = "()V")
	void method2324() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field3367 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field3342; ++var3) {
				var4 = this.field3367[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field3362 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field3362[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field3342; this.field3362[var4][var1[var4]++] = var3++) {
				var4 = this.field3367[var3];
			}

			this.field3367 = null;
		}

		if (this.field3380 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field3374; ++var3) {
				var4 = this.field3380[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field3363 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field3363[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field3374; this.field3363[var4][var1[var4]++] = var3++) {
				var4 = this.field3380[var3];
			}

			this.field3380 = null;
		}

	}

	@ObfInfo(name = "al", desc = "()V")
	public void method2325() {
		for (int var1 = 0; var1 < this.field3342; ++var1) {
			int var2 = this.field3343[var1];
			this.field3343[var1] = this.field3345[var1];
			this.field3345[var1] = -var2;
		}

		this.method2334();
	}

	@ObfInfo(name = "an", desc = "()V")
	public void method2326() {
		for (int var1 = 0; var1 < this.field3342; ++var1) {
			this.field3343[var1] = -this.field3343[var1];
			this.field3345[var1] = -this.field3345[var1];
		}

		this.method2334();
	}

	@ObfInfo(name = "ar", desc = "()V")
	public void method2327() {
		for (int var1 = 0; var1 < this.field3342; ++var1) {
			int var2 = this.field3345[var1];
			this.field3345[var1] = this.field3343[var1];
			this.field3343[var1] = -var2;
		}

		this.method2334();
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	public void method2328(int var1) {
		int var2 = field3341[var1];
		int var3 = field3364[var1];

		for (int var4 = 0; var4 < this.field3342; ++var4) {
			int var5 = this.field3345[var4] * var2 + this.field3343[var4] * var3 >> 16;
			this.field3345[var4] = this.field3345[var4] * var3 - this.field3343[var4] * var2 >> 16;
			this.field3343[var4] = var5;
		}

		this.method2334();
	}

	@ObfInfo(name = "ag", desc = "(III)V")
	public void method2329(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3342; ++var4) {
			int[] var10000 = this.field3343;
			var10000[var4] += var1;
			var10000 = this.field3344;
			var10000[var4] += var2;
			var10000 = this.field3345;
			var10000[var4] += var3;
		}

		this.method2334();
	}

	@ObfInfo(name = "am", desc = "(SS)V")
	public void method2340(short var1, short var2) {
		for (int var3 = 0; var3 < this.field3374; ++var3) {
			if (this.field3353[var3] == var1) {
				this.field3353[var3] = var2;
			}
		}

	}

	@ObfInfo(name = "ax", desc = "(SS)V")
	public void method2331(short var1, short var2) {
		if (this.field3354 != null) {
			for (int var3 = 0; var3 < this.field3374; ++var3) {
				if (this.field3354[var3] == var1) {
					this.field3354[var3] = var2;
				}
			}

		}
	}

	@ObfInfo(name = "ah", desc = "()V")
	public void method2330() {
		int var1;
		for (var1 = 0; var1 < this.field3342; ++var1) {
			this.field3345[var1] = -this.field3345[var1];
		}

		for (var1 = 0; var1 < this.field3374; ++var1) {
			int var2 = this.field3346[var1];
			this.field3346[var1] = this.field3348[var1];
			this.field3348[var1] = var2;
		}

		this.method2334();
	}

	@ObfInfo(name = "as", desc = "(III)V")
	public void method2332(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3342; ++var4) {
			this.field3343[var4] = this.field3343[var4] * var1 / 128;
			this.field3344[var4] = this.field3344[var4] * var2 / 128;
			this.field3345[var4] = this.field3345[var4] * var3 / 128;
		}

		this.method2334();
	}

	@ObfInfo(name = "ay", desc = "()V")
	public void method2333() {
		if (this.field3352 == null) {
			this.field3352 = new class139[this.field3342];

			int var1;
			for (var1 = 0; var1 < this.field3342; ++var1) {
				this.field3352[var1] = new class139();
			}

			for (var1 = 0; var1 < this.field3374; ++var1) {
				int var2 = this.field3346[var1];
				int var3 = this.field3347[var1];
				int var4 = this.field3348[var1];
				int var5 = this.field3343[var3] - this.field3343[var2];
				int var6 = this.field3344[var3] - this.field3344[var2];
				int var7 = this.field3345[var3] - this.field3345[var2];
				int var8 = this.field3343[var4] - this.field3343[var2];
				int var9 = this.field3344[var4] - this.field3344[var2];
				int var10 = this.field3345[var4] - this.field3345[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field3372 == null) {
					var15 = 0;
				} else {
					var15 = this.field3372[var1];
				}

				if (var15 == 0) {
					class139 var16 = this.field3352[var2];
					var16.field1416 += var11;
					var16.field1415 += var12;
					var16.field1417 += var13;
					++var16.field1418;
					var16 = this.field3352[var3];
					var16.field1416 += var11;
					var16.field1415 += var12;
					var16.field1417 += var13;
					++var16.field1418;
					var16 = this.field3352[var4];
					var16.field1416 += var11;
					var16.field1415 += var12;
					var16.field1417 += var13;
					++var16.field1418;
				} else if (var15 == 1) {
					if (this.field3366 == null) {
						this.field3366 = new class335[this.field3374];
					}

					class335 var17 = this.field3366[var1] = new class335();
					var17.field2659 = var11;
					var17.field2658 = var12;
					var17.field2660 = var13;
				}
			}

		}
	}

	@ObfInfo(name = "aj", desc = "()V")
	void method2334() {
		this.field3352 = null;
		this.field3368 = null;
		this.field3366 = null;
		this.field3371 = false;
	}

	@ObfInfo(name = "av", desc = "()V")
	void method2335() {
		if (!this.field3371) {
			super.field4095 = 0;
			this.field3379 = 0;
			this.field3373 = 999999;
			this.field3349 = -999999;
			this.field3375 = -99999;
			this.field3376 = 99999;

			for (int var1 = 0; var1 < this.field3342; ++var1) {
				int var2 = this.field3343[var1];
				int var3 = this.field3344[var1];
				int var4 = this.field3345[var1];
				if (var2 < this.field3373) {
					this.field3373 = var2;
				}

				if (var2 > this.field3349) {
					this.field3349 = var2;
				}

				if (var4 < this.field3376) {
					this.field3376 = var4;
				}

				if (var4 > this.field3375) {
					this.field3375 = var4;
				}

				if (-var3 > super.field4095) {
					super.field4095 = -var3;
				}

				if (var3 > this.field3379) {
					this.field3379 = var3;
				}
			}

			this.field3371 = true;
		}
	}

	@ObfInfo(name = "ak", desc = "(IIIII)Ljr;")
	public final class384 method2337(int var1, int var2, int var3, int var4, int var5) {
		this.method2333();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class384 var8 = new class384();
		var8.field2961 = new int[this.field3374];
		var8.field2962 = new int[this.field3374];
		var8.field2963 = new int[this.field3374];
		if (this.field3356 > 0 && this.field3340 != null) {
			int[] var9 = new int[this.field3356];

			int var10;
			for (var10 = 0; var10 < this.field3374; ++var10) {
				if (this.field3340[var10] != -1) {
					++var9[this.field3340[var10] & 255];
				}
			}

			var8.field2969 = 0;

			for (var10 = 0; var10 < this.field3356; ++var10) {
				if (var9[var10] > 0 && this.field3369[var10] == 0) {
					++var8.field2969;
				}
			}

			var8.field2970 = new int[var8.field2969];
			var8.field2971 = new int[var8.field2969];
			var8.field2964 = new int[var8.field2969];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field3356; ++var11) {
				if (var9[var11] > 0 && this.field3369[var11] == 0) {
					var8.field2970[var10] = this.field3357[var11] & '\uffff';
					var8.field2971[var10] = this.field3359[var11] & '\uffff';
					var8.field2964[var10] = this.field3377[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field2966 = new byte[this.field3374];

			for (var11 = 0; var11 < this.field3374; ++var11) {
				if (this.field3340[var11] != -1) {
					var8.field2966[var11] = (byte)var9[this.field3340[var11] & 255];
				} else {
					var8.field2966[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field3374; ++var16) {
			byte var17;
			if (this.field3372 == null) {
				var17 = 0;
			} else {
				var17 = this.field3372[var16];
			}

			byte var18;
			if (this.field3351 == null) {
				var18 = 0;
			} else {
				var18 = this.field3351[var16];
			}

			short var12;
			if (this.field3354 == null) {
				var12 = -1;
			} else {
				var12 = this.field3354[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			class139 var13;
			int var14;
			class335 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field3366[var16];
						var14 = var1 + (var3 * var19.field2659 + var4 * var19.field2658 + var5 * var19.field2660) / (var7 + var7 / 2);
						var8.field2961[var16] = method2342(this.field3353[var16] & '\uffff', var14);
						var8.field2963[var16] = -1;
					} else if (var17 == 3) {
						var8.field2961[var16] = 128;
						var8.field2963[var16] = -1;
					} else {
						var8.field2963[var16] = -2;
					}
				} else {
					int var15 = this.field3353[var16] & '\uffff';
					if (this.field3368 != null && this.field3368[this.field3346[var16]] != null) {
						var13 = this.field3368[this.field3346[var16]];
					} else {
						var13 = this.field3352[this.field3346[var16]];
					}

					var14 = var1 + (var3 * var13.field1416 + var4 * var13.field1415 + var5 * var13.field1417) / (var7 * var13.field1418);
					var8.field2961[var16] = method2342(var15, var14);
					if (this.field3368 != null && this.field3368[this.field3347[var16]] != null) {
						var13 = this.field3368[this.field3347[var16]];
					} else {
						var13 = this.field3352[this.field3347[var16]];
					}

					var14 = var1 + (var3 * var13.field1416 + var4 * var13.field1415 + var5 * var13.field1417) / (var7 * var13.field1418);
					var8.field2962[var16] = method2342(var15, var14);
					if (this.field3368 != null && this.field3368[this.field3348[var16]] != null) {
						var13 = this.field3368[this.field3348[var16]];
					} else {
						var13 = this.field3352[this.field3348[var16]];
					}

					var14 = var1 + (var3 * var13.field1416 + var4 * var13.field1415 + var5 * var13.field1417) / (var7 * var13.field1418);
					var8.field2963[var16] = method2342(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field3366[var16];
					var14 = var1 + (var3 * var19.field2659 + var4 * var19.field2658 + var5 * var19.field2660) / (var7 + var7 / 2);
					var8.field2961[var16] = method2338(var14);
					var8.field2963[var16] = -1;
				} else {
					var8.field2963[var16] = -2;
				}
			} else {
				if (this.field3368 != null && this.field3368[this.field3346[var16]] != null) {
					var13 = this.field3368[this.field3346[var16]];
				} else {
					var13 = this.field3352[this.field3346[var16]];
				}

				var14 = var1 + (var3 * var13.field1416 + var4 * var13.field1415 + var5 * var13.field1417) / (var7 * var13.field1418);
				var8.field2961[var16] = method2338(var14);
				if (this.field3368 != null && this.field3368[this.field3347[var16]] != null) {
					var13 = this.field3368[this.field3347[var16]];
				} else {
					var13 = this.field3352[this.field3347[var16]];
				}

				var14 = var1 + (var3 * var13.field1416 + var4 * var13.field1415 + var5 * var13.field1417) / (var7 * var13.field1418);
				var8.field2962[var16] = method2338(var14);
				if (this.field3368 != null && this.field3368[this.field3348[var16]] != null) {
					var13 = this.field3368[this.field3348[var16]];
				} else {
					var13 = this.field3352[this.field3348[var16]];
				}

				var14 = var1 + (var3 * var13.field1416 + var4 * var13.field1415 + var5 * var13.field1417) / (var7 * var13.field1418);
				var8.field2963[var16] = method2338(var14);
			}
		}

		this.method2324();
		var8.field3009 = this.field3342;
		var8.field2955 = this.field3343;
		var8.field2956 = this.field3344;
		var8.field2960 = this.field3345;
		var8.field2957 = this.field3374;
		var8.field2972 = this.field3346;
		var8.field2959 = this.field3347;
		var8.field3017 = this.field3348;
		var8.field3016 = this.field3350;
		var8.field2965 = this.field3351;
		var8.field2968 = this.field3355;
		var8.field2973 = this.field3362;
		var8.field2974 = this.field3363;
		var8.field2967 = this.field3354;
		var8.field2975 = this.field3361;
		var8.field2999 = this.field3365;
		return var8;
	}

	@ObfInfo(name = "au", desc = "(Lnu;II)Lic;")
	public static class445 method2341(class437 var0, int var1, int var2) {
		byte[] var3 = var0.method2267(var1, var2);
		return var3 == null ? null : new class445(var3);
	}

	@ObfInfo(name = "aw", desc = "(Lic;Lic;IIIZ)V")
	static void method2336(class445 var0, class445 var1, int var2, int var3, int var4, boolean var5) {
		var0.method2335();
		var0.method2333();
		var1.method2335();
		var1.method2333();
		++field3358;
		int var6 = 0;
		int[] var7 = var1.field3343;
		int var8 = var1.field3342;

		int var9;
		for (var9 = 0; var9 < var0.field3342; ++var9) {
			class139 var10 = var0.field3352[var9];
			if (var10.field1418 != 0) {
				int var11 = var0.field3344[var9] - var3;
				if (var11 <= var1.field3379) {
					int var12 = var0.field3343[var9] - var2;
					if (var12 >= var1.field3373 && var12 <= var1.field3349) {
						int var13 = var0.field3345[var9] - var4;
						if (var13 >= var1.field3376 && var13 <= var1.field3375) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class139 var15 = var1.field3352[var14];
								if (var12 == var7[var14] && var13 == var1.field3345[var14] && var11 == var1.field3344[var14] && var15.field1418 != 0) {
									if (var0.field3368 == null) {
										var0.field3368 = new class139[var0.field3342];
									}

									if (var1.field3368 == null) {
										var1.field3368 = new class139[var8];
									}

									class139 var16 = var0.field3368[var9];
									if (var16 == null) {
										var16 = var0.field3368[var9] = new class139(var10);
									}

									class139 var17 = var1.field3368[var14];
									if (var17 == null) {
										var17 = var1.field3368[var14] = new class139(var15);
									}

									var16.field1416 += var15.field1416;
									var16.field1415 += var15.field1415;
									var16.field1417 += var15.field1417;
									var16.field1418 += var15.field1418;
									var17.field1416 += var10.field1416;
									var17.field1415 += var10.field1415;
									var17.field1417 += var10.field1417;
									var17.field1418 += var10.field1418;
									++var6;
									field3360[var9] = field3358;
									field3378[var14] = field3358;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field3374; ++var9) {
				if (field3360[var0.field3346[var9]] == field3358 && field3360[var0.field3347[var9]] == field3358 && field3360[var0.field3348[var9]] == field3358) {
					if (var0.field3372 == null) {
						var0.field3372 = new byte[var0.field3374];
					}

					var0.field3372[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field3374; ++var9) {
				if (field3378[var1.field3346[var9]] == field3358 && field3378[var1.field3347[var9]] == field3358 && field3378[var1.field3348[var9]] == field3358) {
					if (var1.field3372 == null) {
						var1.field3372 = new byte[var1.field3374];
					}

					var1.field3372[var9] = 2;
				}
			}

		}
	}

	@ObfInfo(name = "bh", desc = "(II)I")
	static final int method2342(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(name = "bj", desc = "(I)I")
	static final int method2338(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
