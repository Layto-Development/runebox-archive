import java.util.Random;

public class class287 {

	static int[] field2313;

	static int[] field2319;

	static int[] field2320;

	static int[] field2321;

	static int[] field2323;

	static int[] field2324;

	static int[] field2325;

	static int[] field2326;

	class305 field2314;

	class333 field2303;

	class333 field2304;

	class333 field2306;

	class333 field2307;

	class333 field2308;

	class333 field2310;

	class333 field2311;

	class333 field2315;

	class333 field2322;

	int field2309;

	int field2312;

	int field2316;

	int field2317;

	int[] field2302;

	int[] field2305;

	int[] field2318;

	static {
		field2319 = new int[32768];
		Random var0 = new Random(0L);
		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field2319[var1] = (var0.nextInt() & 2) - 1;
		}
		field2320 = new int[32768];
		for (var1 = 0; var1 < 32768; ++var1) {
			field2320[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		field2324 = new int[220500];
		field2321 = new int[5];
		field2323 = new int[5];
		field2326 = new int[5];
		field2325 = new int[5];
		field2313 = new int[5];
	}

	class287() {
		this.field2305 = new int[] { 0, 0, 0, 0, 0 };
		this.field2302 = new int[] { 0, 0, 0, 0, 0 };
		this.field2318 = new int[] { 0, 0, 0, 0, 0 };
		this.field2312 = 0;
		this.field2316 = 100;
		this.field2309 = 500;
		this.field2317 = 0;
	}

	final int[] method1558(int var1, int var2) {
		class355.method1867(field2324, 0, var1);
		if (var2 < 10) {
			return field2324;
		} else {
			double var3 = (double) var1 / ((double) var2 + 0.0D);
			this.field2311.method1749();
			this.field2322.method1749();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field2303 != null) {
				this.field2303.method1749();
				this.field2304.method1749();
				var5 = (int) ((double) (this.field2303.field2548 - this.field2303.field2551) * 32.768D / var3);
				var6 = (int) ((double) this.field2303.field2551 * 32.768D / var3);
			}
			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field2310 != null) {
				this.field2310.method1749();
				this.field2306.method1749();
				var8 = (int) ((double) (this.field2310.field2548 - this.field2310.field2551) * 32.768D / var3);
				var9 = (int) ((double) this.field2310.field2551 * 32.768D / var3);
			}
			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field2305[var11] != 0) {
					field2321[var11] = 0;
					field2323[var11] = (int) ((double) this.field2318[var11] * var3);
					field2326[var11] = (this.field2305[var11] << 14) / 100;
					field2325[var11] = (int) ((double) (this.field2311.field2548 - this.field2311.field2551) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2302[var11]) / var3);
					field2313[var11] = (int) ((double) this.field2311.field2551 * 32.768D / var3);
				}
			}
			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field2311.method1748(var1);
				var13 = this.field2322.method1748(var1);
				if (this.field2303 != null) {
					var14 = this.field2303.method1748(var1);
					var15 = this.field2304.method1748(var1);
					var12 += this.method1560(var7, var15, this.field2303.field2552) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}
				if (this.field2310 != null) {
					var14 = this.field2310.method1748(var1);
					var15 = this.field2306.method1748(var1);
					var13 = var13 * ((this.method1560(var10, var15, this.field2310.field2552) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}
				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field2305[var14] != 0) {
						var15 = var11 + field2323[var14];
						if (var15 < var1) {
							var10000 = field2324;
							var10000[var15] += this.method1560(field2321[var14], var13 * field2326[var14] >> 15, this.field2311.field2552);
							var10000 = field2321;
							var10000[var14] += (var12 * field2325[var14] >> 16) + field2313[var14];
						}
					}
				}
			}
			int var16;
			if (this.field2307 != null) {
				this.field2307.method1749();
				this.field2308.method1749();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;
				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field2307.method1748(var1);
					var16 = this.field2308.method1748(var1);
					if (var20) {
						var12 = this.field2307.field2551 + ((this.field2307.field2548 - this.field2307.field2551) * var15 >> 8);
					} else {
						var12 = this.field2307.field2551 + ((this.field2307.field2548 - this.field2307.field2551) * var16 >> 8);
					}
					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}
					if (var20) {
						field2324[var14] = 0;
					}
				}
			}
			if (this.field2312 > 0 && this.field2316 > 0) {
				var11 = (int) ((double) this.field2312 * var3);
				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field2324;
					var10000[var12] += field2324[var12 - var11] * this.field2316 / 100;
				}
			}
			if (this.field2314.field2363[0] > 0 || this.field2314.field2363[1] > 0) {
				this.field2315.method1749();
				var11 = this.field2315.method1748(var1 + 1);
				var12 = this.field2314.method1610(0, (float) var11 / 65536.0F);
				var13 = this.field2314.method1610(1, (float) var11 / 65536.0F);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}
					int var17;
					while (var14 < var15) {
						var16 = (int) ((long) field2324[var14 + var12] * (long) class305.field2366 >> 16);
						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int) ((long) field2324[var14 + var12 - 1 - var17] * (long) class305.field2360[0][var17] >> 16);
						}
						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int) ((long) field2324[var14 - 1 - var17] * (long) class305.field2360[1][var17] >> 16);
						}
						field2324[var14] = var16;
						var11 = this.field2315.method1748(var1 + 1);
						++var14;
					}
					boolean var21 = true;
					var15 = 128;
					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}
						int var18;
						while (var14 < var15) {
							var17 = (int) ((long) field2324[var14 + var12] * (long) class305.field2366 >> 16);
							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int) ((long) field2324[var14 + var12 - 1 - var18] * (long) class305.field2360[0][var18] >> 16);
							}
							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int) ((long) field2324[var14 - 1 - var18] * (long) class305.field2360[1][var18] >> 16);
							}
							field2324[var14] = var17;
							var11 = this.field2315.method1748(var1 + 1);
							++var14;
						}
						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;
								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int) ((long) field2324[var14 + var12 - 1 - var18] * (long) class305.field2360[0][var18] >> 16);
								}
								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int) ((long) field2324[var14 - 1 - var18] * (long) class305.field2360[1][var18] >> 16);
								}
								field2324[var14] = var17;
								this.field2315.method1748(var1 + 1);
								++var14;
							}
							break;
						}
						var12 = this.field2314.method1610(0, (float) var11 / 65536.0F);
						var13 = this.field2314.method1610(1, (float) var11 / 65536.0F);
						var15 += 128;
					}
				}
			}
			for (var11 = 0; var11 < var1; ++var11) {
				if (field2324[var11] < -32768) {
					field2324[var11] = -32768;
				}
				if (field2324[var11] > 32767) {
					field2324[var11] = 32767;
				}
			}
			return field2324;
		}
	}

	final int method1560(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field2320[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field2319[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	final void method1559(class187 var1) {
		this.field2311 = new class333();
		this.field2311.method1750(var1);
		this.field2322 = new class333();
		this.field2322.method1750(var1);
		int var2 = var1.method1096();
		if (var2 != 0) {
			--var1.field1832;
			this.field2303 = new class333();
			this.field2303.method1750(var1);
			this.field2304 = new class333();
			this.field2304.method1750(var1);
		}
		var2 = var1.method1096();
		if (var2 != 0) {
			--var1.field1832;
			this.field2310 = new class333();
			this.field2310.method1750(var1);
			this.field2306 = new class333();
			this.field2306.method1750(var1);
		}
		var2 = var1.method1096();
		if (var2 != 0) {
			--var1.field1832;
			this.field2307 = new class333();
			this.field2307.method1750(var1);
			this.field2308 = new class333();
			this.field2308.method1750(var1);
		}
		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method1143();
			if (var4 == 0) {
				break;
			}
			this.field2305[var3] = var4;
			this.field2302[var3] = var1.method1107();
			this.field2318[var3] = var1.method1143();
		}
		this.field2312 = var1.method1143();
		this.field2316 = var1.method1143();
		this.field2309 = var1.method1145();
		this.field2317 = var1.method1145();
		this.field2314 = new class305();
		this.field2315 = new class333();
		this.field2314.method1606(var1, this.field2315);
	}
}
