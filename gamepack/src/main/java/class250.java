import java.util.Arrays;
import java.util.HashMap;

public class class250 extends class480 {
	static boolean field2322;
	static boolean[] field2298;
	static boolean[] field2299;
	static byte[] field2264;
	static byte[] field2328;
	static char[] field2308;
	static char[][] field2309;
	static class250 field2263;
	static class250 field2302;
	static class264 field2265;
	static class264 field2266;
	static class264 field2267;
	static float[] field2306;
	static float[] field2320;
	static int field2319;
	static int field2321;
	static int field2332;
	static int[] field2268;
	static int[] field2290;
	static int[] field2300;
	static int[] field2301;
	static int[] field2303;
	static int[] field2304;
	static int[] field2305;
	static int[] field2310;
	static int[] field2311;
	static int[] field2312;
	static int[] field2314;
	static int[] field2315;
	static int[] field2316;
	static int[] field2317;
	static int[] field2324;
	static int[] field2325;
	static int[] field2326;
	static int[][] field2307;
	static final float field2329;
	byte[] field2279;
	byte[] field2280;
	byte[] field2330;
	int field2291;
	int field2292;
	int field2293;
	int field2294;
	int field2318;
	int[] field2269;
	int[] field2270;
	int[] field2273;
	int[] field2274;
	int[] field2275;
	int[] field2276;
	int[] field2277;
	int[] field2278;
	int[] field2284;
	int[] field2285;
	int[] field2286;
	int[] field2331;
	int[][] field2287;
	int[][] field2288;
	int[][] field2289;
	int[][] field2313;
	HashMap field2296;
	short[] field2281;
	public boolean field2272;
	public byte field2282;
	public byte field2295;
	public byte field2297;
	public byte field2327;
	public byte field2333;
	public int field2271;
	public int field2283;
	public int field2323;
	public short field2334;

	static {
		field2302 = new class250();
		field2328 = new byte[1];
		field2263 = new class250();
		field2264 = new byte[1];
		field2265 = new class264();
		field2266 = new class264();
		field2267 = new class264();
		field2298 = new boolean[6500];
		field2299 = new boolean[6500];
		field2300 = new int[6500];
		field2301 = new int[6500];
		field2306 = new float[6500];
		field2303 = new int[6500];
		field2304 = new int[6500];
		field2305 = new int[6500];
		field2311 = new int[6500];
		field2308 = new char[6000];
		field2309 = new char[6000][512];
		field2310 = new int[12];
		field2307 = new int[12][2000];
		field2312 = new int[2000];
		field2268 = new int[2000];
		field2314 = new int[12];
		field2315 = new int[10];
		field2316 = new int[10];
		field2317 = new int[10];
		field2320 = new float[10];
		field2322 = true;
		field2324 = class133.field1291;
		field2325 = class133.field1289;
		field2326 = class133.field1288;
		field2290 = class133.field1290;
		field2329 = class217.method1249(50);
	}

	class250() {
		this.field2323 = 0;
		this.field2271 = 0;
		this.field2282 = 0;
		this.field2283 = 0;
		this.field2272 = false;
		this.field2296 = new HashMap();
	}

	public class250(class250[] var1, int var2) {
		this.field2323 = 0;
		this.field2271 = 0;
		this.field2282 = 0;
		this.field2283 = 0;
		this.field2272 = false;
		this.field2296 = new HashMap();
		this.field2323 = 0;
		this.field2271 = 0;
		this.field2283 = 0;
		this.field2282 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			class250 var4 = var1[var3];
			if (var4 != null) {
				this.field2323 += var4.field2323;
				this.field2271 += var4.field2271;
				this.field2283 += var4.field2283;
				if (this.field2282 == -1) {
					this.field2282 = var4.field2282;
				}
			}
		}

		this.method1448(this.field2323, this.field2271, this.field2283);
		this.field2323 = 0;
		this.field2271 = 0;
		this.field2283 = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method1475(var1[var3]);
		}

	}

	public class250(int var1, int var2, int var3, byte var4) {
		this.field2323 = 0;
		this.field2271 = 0;
		this.field2282 = 0;
		this.field2283 = 0;
		this.field2272 = false;
		this.field2296 = new HashMap();
		this.method1448(var1, var2, var3);
		this.field2282 = var4;
		this.field2323 = 0;
		this.field2271 = 0;
		this.field2283 = 0;
	}

	void method1448(int var1, int var2, int var3) {
		this.field2269 = new int[var1];
		this.field2270 = new int[var1];
		this.field2274 = new int[var1];
		this.field2286 = new int[var2];
		this.field2273 = new int[var2];
		this.field2331 = new int[var2];
		this.field2275 = new int[var2];
		this.field2276 = new int[var2];
		this.field2277 = new int[var2];
		if (var3 > 0) {
			this.field2284 = new int[var3];
			this.field2285 = new int[var3];
			this.field2278 = new int[var3];
		}

	}

	void method1480(class250 var1) {
		int var2 = this.field2286.length;
		if (this.field2330 == null && (var1.field2330 != null || this.field2282 != var1.field2282)) {
			this.field2330 = new byte[var2];
			Arrays.fill(this.field2330, this.field2282);
		}

		if (this.field2279 == null && var1.field2279 != null) {
			this.field2279 = new byte[var2];
			Arrays.fill(this.field2279, (byte)0);
		}

		if (this.field2281 == null && var1.field2281 != null) {
			this.field2281 = new short[var2];
			Arrays.fill(this.field2281, (short)-1);
		}

		if (this.field2280 == null && var1.field2280 != null) {
			this.field2280 = new byte[var2];
			Arrays.fill(this.field2280, (byte)-1);
		}

	}

	public void method1475(class250 var1) {
		if (var1 != null) {
			this.method1480(var1);

			int var2;
			for (var2 = 0; var2 < var1.field2271; ++var2) {
				this.field2286[this.field2271] = var1.field2286[var2] + this.field2323;
				this.field2273[this.field2271] = var1.field2273[var2] + this.field2323;
				this.field2331[this.field2271] = var1.field2331[var2] + this.field2323;
				this.field2275[this.field2271] = var1.field2275[var2];
				this.field2276[this.field2271] = var1.field2276[var2];
				this.field2277[this.field2271] = var1.field2277[var2];
				if (this.field2330 != null) {
					this.field2330[this.field2271] = var1.field2330 != null ? var1.field2330[var2] : var1.field2282;
				}

				if (this.field2279 != null && var1.field2279 != null) {
					this.field2279[this.field2271] = var1.field2279[var2];
				}

				if (this.field2281 != null) {
					this.field2281[this.field2271] = var1.field2281 != null ? var1.field2281[var2] : -1;
				}

				if (this.field2280 != null) {
					if (var1.field2280 != null && var1.field2280[var2] != -1) {
						this.field2280[this.field2271] = (byte)(var1.field2280[var2] + this.field2283);
					} else {
						this.field2280[this.field2271] = -1;
					}
				}

				++this.field2271;
			}

			for (var2 = 0; var2 < var1.field2283; ++var2) {
				this.field2284[this.field2283] = var1.field2284[var2] + this.field2323;
				this.field2285[this.field2283] = var1.field2285[var2] + this.field2323;
				this.field2278[this.field2283] = var1.field2278[var2] + this.field2323;
				++this.field2283;
			}

			for (var2 = 0; var2 < var1.field2323; ++var2) {
				this.field2269[this.field2323] = var1.field2269[var2];
				this.field2270[this.field2323] = var1.field2270[var2];
				this.field2274[this.field2323] = var1.field2274[var2];
				++this.field2323;
			}

		}
	}

	public class250 method1450(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method1452();
		int var7 = var2 - this.field2293;
		int var8 = var2 + this.field2293;
		int var9 = var4 - this.field2293;
		int var10 = var4 + this.field2293;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class250 var11;
				if (var5) {
					var11 = new class250();
					var11.field2323 = this.field2323;
					var11.field2271 = this.field2271;
					var11.field2283 = this.field2283;
					var11.field2269 = this.field2269;
					var11.field2274 = this.field2274;
					var11.field2286 = this.field2286;
					var11.field2273 = this.field2273;
					var11.field2331 = this.field2331;
					var11.field2275 = this.field2275;
					var11.field2276 = this.field2276;
					var11.field2277 = this.field2277;
					var11.field2330 = this.field2330;
					var11.field2279 = this.field2279;
					var11.field2280 = this.field2280;
					var11.field2281 = this.field2281;
					var11.field2282 = this.field2282;
					var11.field2284 = this.field2284;
					var11.field2285 = this.field2285;
					var11.field2278 = this.field2278;
					var11.field2287 = this.field2287;
					var11.field2288 = this.field2288;
					var11.field2272 = this.field2272;
					var11.field2270 = new int[var11.field2323];
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
					for (var12 = 0; var12 < var11.field2323; ++var12) {
						var13 = this.field2269[var12] + var2;
						var14 = this.field2274[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2270[var12] = this.field2270[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2323; ++var12) {
						var13 = (-this.field2270[var12] << 16) / super.field4080;
						if (var13 < var6) {
							var14 = this.field2269[var12] + var2;
							var15 = this.field2274[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2270[var12] = this.field2270[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method1455();
				return var11;
			}
		} else {
			return this;
		}
	}

	public class250 method1451(boolean var1) {
		if (!var1 && field2328.length < this.field2271) {
			field2328 = new byte[this.field2271 + 100];
		}

		return this.method1474(var1, field2302, field2328);
	}

	public class250 method1478(boolean var1) {
		if (!var1 && field2264.length < this.field2271) {
			field2264 = new byte[this.field2271 + 100];
		}

		return this.method1474(var1, field2263, field2264);
	}

	class250 method1474(boolean var1, class250 var2, byte[] var3) {
		var2.field2323 = this.field2323;
		var2.field2271 = this.field2271;
		var2.field2283 = this.field2283;
		if (var2.field2269 == null || var2.field2269.length < this.field2323) {
			var2.field2269 = new int[this.field2323 + 100];
			var2.field2270 = new int[this.field2323 + 100];
			var2.field2274 = new int[this.field2323 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.field2323; ++var4) {
			var2.field2269[var4] = this.field2269[var4];
			var2.field2270[var4] = this.field2270[var4];
			var2.field2274[var4] = this.field2274[var4];
		}

		if (var1) {
			var2.field2279 = this.field2279;
		} else {
			var2.field2279 = var3;
			if (this.field2279 == null) {
				for (var4 = 0; var4 < this.field2271; ++var4) {
					var2.field2279[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field2271; ++var4) {
					var2.field2279[var4] = this.field2279[var4];
				}
			}
		}

		var2.field2286 = this.field2286;
		var2.field2273 = this.field2273;
		var2.field2331 = this.field2331;
		var2.field2275 = this.field2275;
		var2.field2276 = this.field2276;
		var2.field2277 = this.field2277;
		var2.field2330 = this.field2330;
		var2.field2280 = this.field2280;
		var2.field2281 = this.field2281;
		var2.field2282 = this.field2282;
		var2.field2284 = this.field2284;
		var2.field2285 = this.field2285;
		var2.field2278 = this.field2278;
		var2.field2287 = this.field2287;
		var2.field2288 = this.field2288;
		var2.field2289 = this.field2289;
		var2.field2313 = this.field2313;
		var2.field2272 = this.field2272;
		var2.method1455();
		var2.field2333 = 0;
		return var2;
	}

	void method1482(int var1) {
		if (!this.field2296.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2325[var1];
			int var9 = field2324[var1];

			for (int var10 = 0; var10 < this.field2323; ++var10) {
				int var12 = this.field2269[var10];
				int var13 = this.field2274[var10];
				int var11 = var12 * var8 + var13 * var9 >> 16;
				int var15 = this.field2270[var10];
				int var17 = this.field2269[var10];
				int var18 = this.field2274[var10];
				int var16 = var18 * var8 - var9 * var17 >> 16;
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var15 < var3) {
					var3 = var15;
				}

				if (var15 > var6) {
					var6 = var15;
				}

				if (var16 < var4) {
					var4 = var16;
				}

				if (var16 > var7) {
					var7 = var16;
				}
			}

			class408 var20 = new class408((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var21 = true;
			if (var20.field3407 < 32) {
				var20.field3407 = 32;
			}

			if (var20.field3409 < 32) {
				var20.field3409 = 32;
			}

			if (this.field2272) {
				boolean var22 = true;
				var20.field3407 += 8;
				var20.field3409 += 8;
			}

			this.field2296.put(var1, var20);
		}
	}

	public void method1452() {
		if (this.field2291 != 1) {
			this.field2291 = 1;
			super.field4080 = 0;
			this.field2292 = 0;
			this.field2293 = 0;

			for (int var1 = 0; var1 < this.field2323; ++var1) {
				int var2 = this.field2269[var1];
				int var3 = this.field2270[var1];
				int var4 = this.field2274[var1];
				if (-var3 > super.field4080) {
					super.field4080 = -var3;
				}

				if (var3 > this.field2292) {
					this.field2292 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.field2293) {
					this.field2293 = var5;
				}
			}

			this.field2293 = (int)(Math.sqrt((double)this.field2293) + 0.99D);
			this.field2318 = (int)(Math.sqrt((double)(this.field2293 * this.field2293 + super.field4080 * super.field4080)) + 0.99D);
			this.field2294 = this.field2318 + (int)(Math.sqrt((double)(this.field2293 * this.field2293 + this.field2292 * this.field2292)) + 0.99D);
		}
	}

	void method1481() {
		if (this.field2291 != 2) {
			this.field2291 = 2;
			this.field2293 = 0;

			for (int var1 = 0; var1 < this.field2323; ++var1) {
				int var2 = this.field2269[var1];
				int var3 = this.field2270[var1];
				int var4 = this.field2274[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.field2293) {
					this.field2293 = var5;
				}
			}

			this.field2293 = (int)(Math.sqrt((double)this.field2293) + 0.99D);
			this.field2318 = this.field2293;
			this.field2294 = this.field2293 + this.field2293;
		}
	}

	public int method1454() {
		this.method1452();
		return this.field2293;
	}

	public void method1455() {
		this.field2291 = 0;
		this.field2296.clear();
	}

	public void method1477(class22 var1, int var2) {
		if (this.field2287 != null) {
			if (var2 != -1) {
				class80 var3 = var1.field441[var2];
				class43 var4 = var3.field845;
				field2319 = 0;
				field2332 = 0;
				field2321 = 0;

				for (int var5 = 0; var5 < var3.field848; ++var5) {
					int var6 = var3.field847[var5];
					this.method1461(var4.field531[var6], var4.field532[var6], var3.field851[var5], var3.field852[var5], var3.field853[var5]);
				}

				this.method1455();
			}
		}
	}

	public void method1456(class429 var1, int var2) {
		class43 var3 = var1.field3527;
		class54 var4 = var3.method342();
		if (var4 != null) {
			var3.method342().method395(var1, var2);
			this.method1483(var3.method342(), var1.method2182());
		}

		if (var1.method2183()) {
			this.method1457(var1, var2);
		}

		this.method1455();
	}

	void method1457(class429 var1, int var2) {
		class43 var3 = var1.field3527;

		for (int var4 = 0; var4 < var3.field530; ++var4) {
			int var5 = var3.field531[var4];
			if (var5 == 5 && var1.field3532 != null && var1.field3532[var4] != null && var1.field3532[var4][0] != null && this.field2288 != null && this.field2279 != null) {
				class415 var6 = var1.field3532[var4][0];
				int[] var7 = var3.field532[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.field2288.length) {
						int[] var11 = this.field2288[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.field2279[var13] & 255) + var6.method2138(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.field2279[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	void method1483(class54 var1, int var2) {
		this.method1476(var1, var2);
	}

	public void method1469(class22 var1, int var2, class22 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				class80 var6 = var1.field441[var2];
				class80 var7 = var3.field441[var4];
				class43 var8 = var6.field845;
				field2319 = 0;
				field2332 = 0;
				field2321 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field848; ++var11) {
					for (var12 = var6.field847[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.field531[var12] == 0) {
						this.method1461(var8.field531[var12], var8.field532[var12], var6.field851[var11], var6.field852[var11], var6.field853[var11]);
					}
				}

				field2319 = 0;
				field2332 = 0;
				field2321 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.field848; ++var11) {
					for (var12 = var7.field847[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.field531[var12] == 0) {
						this.method1461(var8.field531[var12], var8.field532[var12], var7.field851[var11], var7.field852[var11], var7.field853[var11]);
					}
				}

				this.method1455();
			} else {
				this.method1477(var1, var2);
			}
		}
	}

	public void method1459(class43 var1, class429 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class54 var7 = var1.method342();
		if (var7 != null) {
			var7.method396(var2, var3, var4, var5);
			if (var6) {
				this.method1483(var7, var2.method2182());
			}
		}

		if (!var5 && var2.method2183()) {
			this.method1457(var2, var3);
		}

	}

	public void method1460(class22 var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.method1477(var1, var2);
		} else {
			class80 var5 = var1.field441[var2];
			class43 var6 = var5.field845;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			field2319 = 0;
			field2332 = 0;
			field2321 = 0;

			for (int var9 = 0; var9 < var5.field848; ++var9) {
				int var10;
				for (var10 = var5.field847[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.field531[var10] == 0) {
						this.method1461(var6.field531[var10], var6.field532[var10], var5.field851[var9], var5.field852[var9], var5.field853[var9]);
					}
				} else if (var10 != var8 || var6.field531[var10] == 0) {
					this.method1461(var6.field531[var10], var6.field532[var10], var5.field851[var9], var5.field852[var9], var5.field853[var9]);
				}
			}

		}
	}

	void method1461(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field2319 = 0;
			field2332 = 0;
			field2321 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.field2287.length) {
					int[] var19 = this.field2287[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						field2319 += this.field2269[var12];
						field2332 += this.field2270[var12];
						field2321 += this.field2274[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				field2319 = field2319 / var7 + var3;
				field2332 = field2332 / var7 + var4;
				field2321 = field2321 / var7 + var5;
			} else {
				field2319 = var3;
				field2332 = var4;
				field2321 = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2287.length) {
						var9 = this.field2287[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2269;
							var10000[var11] += var3;
							var10000 = this.field2270;
							var10000[var11] += var4;
							var10000 = this.field2274;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2287.length) {
						var9 = this.field2287[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2269;
							var10000[var11] -= field2319;
							var10000 = this.field2270;
							var10000[var11] -= field2332;
							var10000 = this.field2274;
							var10000[var11] -= field2321;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2324[var14];
								var16 = field2325[var14];
								var17 = this.field2270[var11] * var15 + this.field2269[var11] * var16 >> 16;
								this.field2270[var11] = this.field2270[var11] * var16 - this.field2269[var11] * var15 >> 16;
								this.field2269[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2324[var12];
								var16 = field2325[var12];
								var17 = this.field2270[var11] * var16 - this.field2274[var11] * var15 >> 16;
								this.field2274[var11] = this.field2270[var11] * var15 + this.field2274[var11] * var16 >> 16;
								this.field2270[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2324[var13];
								var16 = field2325[var13];
								var17 = this.field2274[var11] * var15 + this.field2269[var11] * var16 >> 16;
								this.field2274[var11] = this.field2274[var11] * var16 - this.field2269[var11] * var15 >> 16;
								this.field2269[var11] = var17;
							}

							var10000 = this.field2269;
							var10000[var11] += field2319;
							var10000 = this.field2270;
							var10000[var11] += field2332;
							var10000 = this.field2274;
							var10000[var11] += field2321;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2287.length) {
						var9 = this.field2287[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field2269;
							var10000[var11] -= field2319;
							var10000 = this.field2270;
							var10000[var11] -= field2332;
							var10000 = this.field2274;
							var10000[var11] -= field2321;
							this.field2269[var11] = this.field2269[var11] * var3 / 128;
							this.field2270[var11] = this.field2270[var11] * var4 / 128;
							this.field2274[var11] = this.field2274[var11] * var5 / 128;
							var10000 = this.field2269;
							var10000[var11] += field2319;
							var10000 = this.field2270;
							var10000[var11] += field2332;
							var10000 = this.field2274;
							var10000[var11] += field2321;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.field2288 != null && this.field2279 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field2288.length) {
							var9 = this.field2288[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.field2279[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.field2279[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	public void method1462() {
		for (int var1 = 0; var1 < this.field2323; ++var1) {
			int var2 = this.field2269[var1];
			this.field2269[var1] = this.field2274[var1];
			this.field2274[var1] = -var2;
		}

		this.method1455();
	}

	public void method1463() {
		for (int var1 = 0; var1 < this.field2323; ++var1) {
			this.field2269[var1] = -this.field2269[var1];
			this.field2274[var1] = -this.field2274[var1];
		}

		this.method1455();
	}

	public void method1464() {
		for (int var1 = 0; var1 < this.field2323; ++var1) {
			int var2 = this.field2274[var1];
			this.field2274[var1] = this.field2269[var1];
			this.field2269[var1] = -var2;
		}

		this.method1455();
	}

	public void method1473(int var1) {
		int var2 = field2324[var1];
		int var3 = field2325[var1];

		for (int var4 = 0; var4 < this.field2323; ++var4) {
			int var5 = this.field2270[var4] * var3 - this.field2274[var4] * var2 >> 16;
			this.field2274[var4] = this.field2270[var4] * var2 + this.field2274[var4] * var3 >> 16;
			this.field2270[var4] = var5;
		}

		this.method1455();
	}

	public void method1453(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2323; ++var4) {
			int[] var10000 = this.field2269;
			var10000[var4] += var1;
			var10000 = this.field2270;
			var10000[var4] += var2;
			var10000 = this.field2274;
			var10000[var4] += var3;
		}

		this.method1455();
	}

	public void method1465(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2323; ++var4) {
			this.field2269[var4] = this.field2269[var4] * var1 / 128;
			this.field2270[var4] = this.field2270[var4] * var2 / 128;
			this.field2274[var4] = this.field2274[var4] * var3 / 128;
		}

		this.method1455();
	}

	public final void method1458(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.field2291 != 2 && this.field2291 != 1) {
			this.method1481();
		}

		int var8 = class133.method783();
		int var9 = class133.method784();
		int var10 = field2324[var1];
		int var11 = field2325[var1];
		int var12 = field2324[var2];
		int var13 = field2325[var2];
		int var14 = field2324[var3];
		int var15 = field2325[var3];
		int var16 = field2324[var4];
		int var17 = field2325[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < this.field2323; ++var19) {
			int var20 = this.field2269[var19];
			int var21 = this.field2270[var19];
			int var22 = this.field2274[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2303[var19] = var22 - var18;
			field2300[var19] = var8 + var20 * class133.method788() / var22;
			field2301[var19] = var9 + var23 * class133.method788() / var22;
			field2306[var19] = class217.method1249(var22);
			if (this.field2283 > 0) {
				field2304[var19] = var20;
				field2305[var19] = var23;
				field2311[var19] = var22;
			}
		}

		try {
			this.method1468(false, false, false, 0L);
		} catch (Exception var24) {
		}

	}

	public final void method1466(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.field2291 != 2 && this.field2291 != 1) {
			this.method1481();
		}

		int var9 = class133.method783();
		int var10 = class133.method784();
		int var11 = field2324[var1];
		int var12 = field2325[var1];
		int var13 = field2324[var2];
		int var14 = field2325[var2];
		int var15 = field2324[var3];
		int var16 = field2325[var3];
		int var17 = field2324[var4];
		int var18 = field2325[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.field2323; ++var20) {
			int var21 = this.field2269[var20];
			int var22 = this.field2270[var20];
			int var23 = this.field2274[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2303[var20] = var23 - var19;
			field2300[var20] = var9 + var21 * class133.method788() / var8;
			field2301[var20] = var10 + var24 * class133.method788() / var8;
			field2306[var20] = class217.method1249(var8);
			if (this.field2283 > 0) {
				field2304[var20] = var21;
				field2305[var20] = var24;
				field2311[var20] = var23;
			}
		}

		try {
			this.method1468(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	void method2392(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.field2291 != 1) {
			this.method1452();
		}

		this.method1482(var1);
		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = this.field2293 * var3 >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var6 * var5 >> 16;
			int var16 = (var15 - this.field2293) * class133.method788();
			if (var16 / var14 < class133.method782()) {
				int var17 = (var15 + this.field2293) * class133.method788();
				if (var17 / var14 > class133.method785()) {
					int var18 = var7 * var3 - var11 * var2 >> 16;
					int var19 = this.field2293 * var2 >> 16;
					int var20 = var19 + (this.field2292 * var3 >> 16);
					int var21 = (var18 + var20) * class133.method788();
					if (var21 / var14 > class133.method787()) {
						int var22 = var19 + (super.field4080 * var3 >> 16);
						int var23 = (var18 - var22) * class133.method788();
						if (var23 / var14 < class133.method786()) {
							int var24 = var13 + (super.field4080 * var2 >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.field2283 > 0;
							int var28 = class277.field2453;
							int var30 = class277.field2456;
							boolean var32 = class475.method2300();
							boolean var34 = 0L != var9;
							boolean var35;
							if (var34) {
								var35 = (int)(var9 >>> 16 & 1L) == 1;
								var34 = !var35;
							}

							var35 = false;
							int var38;
							int var40;
							int var41;
							int var42;
							int var43;
							int var44;
							int var51;
							int var52;
							if (var34 && var32) {
								boolean var36 = false;
								if (field2322) {
									boolean var37;
									if (!class475.method2300()) {
										var37 = false;
									} else {
										class533.method2568();
										class408 var39 = (class408)this.field2296.get(var1);
										var40 = var6 + var39.field3410;
										var41 = var39.field3405 + var7;
										var42 = var39.field3406 + var8;
										var43 = var39.field3407;
										var44 = var39.field3408;
										int var45 = var39.field3409;
										int var46 = class277.field2452 - var40;
										int var47 = class277.field2461 - var41;
										int var48 = class277.field2458 - var42;
										if (Math.abs(var46) > var43 + class277.field2459) {
											var37 = false;
										} else if (Math.abs(var47) > class56.field611 + var44) {
											var37 = false;
										} else if (Math.abs(var48) > var45 + class289.field2578) {
											var37 = false;
										} else if (Math.abs(class277.field2454 * var48 - var47 * class22.field440) > class289.field2578 * var44 + var45 * class56.field611) {
											var37 = false;
										} else if (Math.abs(var46 * class22.field440 - var48 * class72.field819) > var43 * class289.field2578 + var45 * class277.field2459) {
											var37 = false;
										} else if (Math.abs(var47 * class72.field819 - var46 * class277.field2454) > class56.field611 * var43 + var44 * class277.field2459) {
											var37 = false;
										} else {
											var37 = true;
										}
									}

									var36 = var37;
								} else {
									var52 = var12 - var13;
									if (var52 <= 50) {
										var52 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var52;
									} else {
										var17 /= var14;
										var16 /= var52;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var52;
									} else {
										var21 /= var14;
										var23 /= var52;
									}

									var38 = var28 - class133.method783();
									var51 = var30 - class133.method784();
									if (var38 > var16 && var38 < var17 && var51 > var23 && var51 < var21) {
										var36 = true;
									}
								}

								if (var36) {
									if (this.field2272) {
										class277.field2462[++class277.field2460 - 1] = var9;
									} else {
										var35 = true;
									}
								}
							}

							int var50 = class133.method783();
							var52 = class133.method784();
							var38 = 0;
							var51 = 0;
							if (var1 != 0) {
								var38 = field2324[var1];
								var51 = field2325[var1];
							}

							for (var40 = 0; var40 < this.field2323; ++var40) {
								var41 = this.field2269[var40];
								var42 = this.field2270[var40];
								var43 = this.field2274[var40];
								if (var1 != 0) {
									var44 = var43 * var38 + var41 * var51 >> 16;
									var43 = var43 * var51 - var41 * var38 >> 16;
									var41 = var44;
								}

								var41 += var6;
								var42 += var7;
								var43 += var8;
								var44 = var43 * var4 + var41 * var5 >> 16;
								var43 = var43 * var5 - var41 * var4 >> 16;
								var41 = var44;
								var44 = var42 * var3 - var43 * var2 >> 16;
								var43 = var42 * var2 + var43 * var3 >> 16;
								field2303[var40] = var43 - var12;
								if (var43 >= 50) {
									field2300[var40] = var50 + var41 * class133.method788() / var43;
									field2301[var40] = var52 + var44 * class133.method788() / var43;
									field2306[var40] = class217.method1249(var43);
								} else {
									field2300[var40] = -5000;
									var25 = true;
								}

								if (var27) {
									field2304[var40] = var41;
									field2305[var40] = var44;
									field2311[var40] = var43;
								}
							}

							try {
								this.method1468(var25, var35, this.field2272, var9);
							} catch (Exception var49) {
							}

						}
					}
				}
			}
		}
	}

	final void method1468(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.field2294 < 6000) {
			int var6;
			for (var6 = 0; var6 < this.field2294; ++var6) {
				field2308[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.field2271; ++var7) {
				if (this.field2277[var7] != -2) {
					var8 = this.field2286[var7];
					var9 = this.field2273[var7];
					var10 = this.field2331[var7];
					var11 = field2300[var8];
					var12 = field2300[var9];
					var13 = field2300[var10];
					int var17;
					int var33;
					if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
						var33 = field2304[var8];
						var15 = field2304[var9];
						var16 = field2304[var10];
						var17 = field2305[var8];
						var18 = field2305[var9];
						int var19 = field2305[var10];
						int var20 = field2311[var8];
						int var21 = field2311[var9];
						int var22 = field2311[var10];
						var33 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var19;
						int var24 = var20 * var16 - var33 * var22;
						int var25 = var33 * var19 - var17 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2299[var7] = true;
							int var26 = (field2303[var8] + field2303[var9] + field2303[var10]) / 3 + this.field2318;
							field2309[var26][field2308[var26]++] = var7;
						}
					} else {
						if (var2) {
							var15 = field2301[var8];
							var16 = field2301[var9];
							var17 = field2301[var10];
							var18 = class277.field2456 + var6;
							boolean var14;
							if (var18 < var15 && var18 < var16 && var18 < var17) {
								var14 = false;
							} else {
								var18 = class277.field2456 - var6;
								if (var18 > var15 && var18 > var16 && var18 > var17) {
									var14 = false;
								} else {
									var18 = var6 + class277.field2453;
									if (var18 < var11 && var18 < var12 && var18 < var13) {
										var14 = false;
									} else {
										var18 = class277.field2453 - var6;
										if (var18 > var11 && var18 > var12 && var18 > var13) {
											var14 = false;
										} else {
											var14 = true;
										}
									}
								}
							}

							if (var14) {
								class277.field2462[++class277.field2460 - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (field2301[var10] - field2301[var9]) - (field2301[var8] - field2301[var9]) * (var13 - var12) > 0) {
							field2299[var7] = false;
							var33 = class133.method789();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var33 && var12 <= var33 && var13 <= var33) {
								field2298[var7] = false;
							} else {
								field2298[var7] = true;
							}

							var15 = (field2303[var8] + field2303[var9] + field2303[var10]) / 3 + this.field2318;
							field2309[var15][field2308[var15]++] = var7;
						}
					}
				}
			}

			int var27;
			char var28;
			char[] var29;
			if (this.field2330 == null) {
				for (var27 = this.field2294 - 1; var27 >= 0; --var27) {
					var28 = field2308[var27];
					if (var28 > 0) {
						var29 = field2309[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							this.method1449(var29[var10]);
						}
					}
				}

			} else {
				for (var27 = 0; var27 < 12; ++var27) {
					field2310[var27] = 0;
					field2314[var27] = 0;
				}

				for (var27 = this.field2294 - 1; var27 >= 0; --var27) {
					var28 = field2308[var27];
					if (var28 > 0) {
						var29 = field2309[var27];

						for (var10 = 0; var10 < var28; ++var10) {
							char var30 = var29[var10];
							byte var31 = this.field2330[var30];
							var13 = field2310[var31]++;
							field2307[var31][var13] = var30;
							if (var31 < 10) {
								int[] var36 = field2314;
								var36[var31] += var27;
							} else if (var31 == 10) {
								field2312[var13] = var27;
							} else {
								field2268[var13] = var27;
							}
						}
					}
				}

				var27 = 0;
				if (field2310[1] > 0 || field2310[2] > 0) {
					var27 = (field2314[1] + field2314[2]) / (field2310[1] + field2310[2]);
				}

				var8 = 0;
				if (field2310[3] > 0 || field2310[4] > 0) {
					var8 = (field2314[3] + field2314[4]) / (field2310[3] + field2310[4]);
				}

				var9 = 0;
				if (field2310[6] > 0 || field2310[8] > 0) {
					var9 = (field2314[6] + field2314[8]) / (field2310[6] + field2310[8]);
				}

				var11 = 0;
				var12 = field2310[10];
				int[] var32 = field2307[10];
				int[] var34 = field2312;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2310[11];
					var32 = field2307[11];
					var34 = field2268;
				}

				if (var11 < var12) {
					var10 = var34[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var27) {
						this.method1449(var32[var11++]);
						if (var11 == var12 && var32 != field2307[11]) {
							var11 = 0;
							var12 = field2310[11];
							var32 = field2307[11];
							var34 = field2268;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.method1449(var32[var11++]);
						if (var11 == var12 && var32 != field2307[11]) {
							var11 = 0;
							var12 = field2310[11];
							var32 = field2307[11];
							var34 = field2268;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.method1449(var32[var11++]);
						if (var11 == var12 && var32 != field2307[11]) {
							var11 = 0;
							var12 = field2310[11];
							var32 = field2307[11];
							var34 = field2268;
						}

						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2310[var15];
					int[] var35 = field2307[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.method1449(var35[var18]);
					}
				}

				while (var10 != -1000) {
					this.method1449(var32[var11++]);
					if (var11 == var12 && var32 != field2307[11]) {
						var11 = 0;
						var32 = field2307[11];
						var12 = field2310[11];
						var34 = field2268;
					}

					if (var11 < var12) {
						var10 = var34[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	final void method1449(int var1) {
		if (field2299[var1]) {
			this.method1471(var1);
		} else {
			int var2 = this.field2286[var1];
			int var3 = this.field2273[var1];
			int var4 = this.field2331[var1];
			class133.field1293.field391 = field2298[var1];
			if (this.field2279 == null) {
				class133.field1293.field394 = 0;
			} else {
				class133.field1293.field394 = (this.field2279[var1] == -1 ? 253 : this.field2279[var1]) & 255;
			}

			this.method1479(var1, field2301[var2], field2301[var3], field2301[var4], field2300[var2], field2300[var3], field2300[var4], field2306[var2], field2306[var3], field2306[var4], this.field2275[var1], this.field2276[var1], this.field2277[var1]);
		}
	}

	boolean method1470(int var1) {
		return this.field2333 > 0 && var1 < this.field2334;
	}

	final void method1479(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.field2281 != null && this.field2281[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.field2280 != null && this.field2280[var1] != -1) {
				int var17 = this.field2280[var1] & 255;
				var18 = this.field2284[var17];
				var15 = this.field2285[var17];
				var16 = this.field2278[var17];
			} else {
				var18 = this.field2286[var1];
				var15 = this.field2273[var1];
				var16 = this.field2331[var1];
			}

			if (this.field2277[var1] == -1) {
				class133.method795(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2304[var18], field2304[var15], field2304[var16], field2305[var18], field2305[var15], field2305[var16], field2311[var18], field2311[var15], field2311[var16], this.field2281[var1]);
			} else {
				class133.method795(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2304[var18], field2304[var15], field2304[var16], field2305[var18], field2305[var15], field2305[var16], field2311[var18], field2311[var15], field2311[var16], this.field2281[var1]);
			}
		} else {
			boolean var14 = this.method1470(var1);
			if (this.field2277[var1] == -1 && var14) {
				class133.method803(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2326[this.field2275[var1]], this.field2327, this.field2297, this.field2295, this.field2333);
			} else if (this.field2277[var1] == -1) {
				class133.method804(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2326[this.field2275[var1]]);
			} else if (var14) {
				class133.method801(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field2327, this.field2297, this.field2295, this.field2333);
			} else {
				class133.method797(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	final void method1471(int var1) {
		int var2 = class133.method783();
		int var3 = class133.method784();
		int var4 = 0;
		int var5 = this.field2286[var1];
		int var6 = this.field2273[var1];
		int var7 = this.field2331[var1];
		int var8 = field2311[var5];
		int var9 = field2311[var6];
		int var10 = field2311[var7];
		if (this.field2279 == null) {
			class133.field1293.field394 = 0;
		} else {
			class133.field1293.field394 = this.field2279[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2315[var4] = field2300[var5];
			field2316[var4] = field2301[var5];
			field2320[var4] = field2306[var7];
			field2317[var4++] = this.field2275[var1];
		} else {
			var11 = field2304[var5];
			var12 = field2305[var5];
			var13 = this.field2275[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * field2290[var10 - var8];
				field2315[var4] = var2 + (var11 + ((field2304[var7] - var11) * var14 >> 16)) * class133.method788() / 50;
				field2316[var4] = var3 + (var12 + ((field2305[var7] - var12) * var14 >> 16)) * class133.method788() / 50;
				field2320[var4] = field2329;
				field2317[var4++] = var13 + ((this.field2277[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * field2290[var9 - var8];
				field2315[var4] = var2 + (var11 + ((field2304[var6] - var11) * var14 >> 16)) * class133.method788() / 50;
				field2316[var4] = var3 + (var12 + ((field2305[var6] - var12) * var14 >> 16)) * class133.method788() / 50;
				field2320[var4] = field2329;
				field2317[var4++] = var13 + ((this.field2276[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2315[var4] = field2300[var6];
			field2316[var4] = field2301[var6];
			field2320[var4] = field2306[var7];
			field2317[var4++] = this.field2276[var1];
		} else {
			var11 = field2304[var6];
			var12 = field2305[var6];
			var13 = this.field2276[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * field2290[var8 - var9];
				field2315[var4] = var2 + (var11 + ((field2304[var5] - var11) * var14 >> 16)) * class133.method788() / 50;
				field2316[var4] = var3 + (var12 + ((field2305[var5] - var12) * var14 >> 16)) * class133.method788() / 50;
				field2320[var4] = field2329;
				field2317[var4++] = var13 + ((this.field2275[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * field2290[var10 - var9];
				field2315[var4] = var2 + (var11 + ((field2304[var7] - var11) * var14 >> 16)) * class133.method788() / 50;
				field2316[var4] = var3 + (var12 + ((field2305[var7] - var12) * var14 >> 16)) * class133.method788() / 50;
				field2317[var4++] = var13 + ((this.field2277[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2315[var4] = field2300[var7];
			field2316[var4] = field2301[var7];
			field2320[var4] = field2306[var7];
			field2317[var4++] = this.field2277[var1];
		} else {
			var11 = field2304[var7];
			var12 = field2305[var7];
			var13 = this.field2277[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * field2290[var9 - var10];
				field2315[var4] = var2 + (var11 + ((field2304[var6] - var11) * var14 >> 16)) * class133.method788() / 50;
				field2316[var4] = var3 + (var12 + ((field2305[var6] - var12) * var14 >> 16)) * class133.method788() / 50;
				field2320[var4] = field2329;
				field2317[var4++] = var13 + ((this.field2276[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * field2290[var8 - var10];
				field2315[var4] = var2 + (var11 + ((field2304[var5] - var11) * var14 >> 16)) * class133.method788() / 50;
				field2316[var4] = var3 + (var12 + ((field2305[var5] - var12) * var14 >> 16)) * class133.method788() / 50;
				field2320[var4] = field2329;
				field2317[var4++] = var13 + ((this.field2275[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2315[0];
		var12 = field2315[1];
		var13 = field2315[2];
		var14 = field2316[0];
		int var15 = field2316[1];
		int var16 = field2316[2];
		float var17 = field2320[0];
		float var18 = field2320[1];
		float var19 = field2320[2];
		class133.field1293.field391 = false;
		int var20 = class133.method789();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				class133.field1293.field391 = true;
			}

			this.method1479(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2317[0], field2317[1], field2317[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2315[3] < 0 || field2315[3] > var20) {
				class133.field1293.field391 = true;
			}

			int var22;
			if (this.field2281 != null && this.field2281[var1] != -1) {
				int var23;
				int var25;
				if (this.field2280 != null && this.field2280[var1] != -1) {
					int var24 = this.field2280[var1] & 255;
					var25 = this.field2284[var24];
					var22 = this.field2285[var24];
					var23 = this.field2278[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.field2281[var1];
				if (this.field2277[var1] == -1) {
					class133.method795(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field2275[var1], this.field2275[var1], this.field2275[var1], field2304[var25], field2304[var22], field2304[var23], field2305[var25], field2305[var22], field2305[var23], field2311[var25], field2311[var22], field2311[var23], var26);
					class133.method795(var14, var16, field2316[3], var11, var13, field2315[3], var17, var19, field2320[3], this.field2275[var1], this.field2275[var1], this.field2275[var1], field2304[var25], field2304[var22], field2304[var23], field2305[var25], field2305[var22], field2305[var23], field2311[var25], field2311[var22], field2311[var23], var26);
				} else {
					class133.method795(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2317[0], field2317[1], field2317[2], field2304[var25], field2304[var22], field2304[var23], field2305[var25], field2305[var22], field2305[var23], field2311[var25], field2311[var22], field2311[var23], var26);
					class133.method795(var14, var16, field2316[3], var11, var13, field2315[3], var17, var19, field2320[3], field2317[0], field2317[2], field2317[3], field2304[var25], field2304[var22], field2304[var23], field2305[var25], field2305[var22], field2305[var23], field2311[var25], field2311[var22], field2311[var23], var26);
				}
			} else {
				boolean var21 = this.method1470(var1);
				if (this.field2277[var1] == -1 && var21) {
					var22 = field2326[this.field2275[var1]];
					class133.method803(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field2327, this.field2297, this.field2295, this.field2333);
					class133.method803(var14, var16, field2316[3], var11, var13, field2315[3], var17, var19, field2320[3], var22, this.field2327, this.field2297, this.field2295, this.field2333);
				} else if (this.field2277[var1] == -1) {
					var22 = field2326[this.field2275[var1]];
					class133.method804(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					class133.method804(var14, var16, field2316[3], var11, var13, field2315[3], var17, var19, field2320[3], var22);
				} else if (var21) {
					class133.method801(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2317[0], field2317[1], field2317[2], this.field2327, this.field2295, this.field2297, this.field2333);
					class133.method801(var14, var16, field2316[3], var11, var13, field2315[3], 0.0F, 0.0F, 0.0F, field2317[0], field2317[2], field2317[3], this.field2327, this.field2295, this.field2297, this.field2333);
				} else {
					class133.method797(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2317[0], field2317[1], field2317[2]);
					class133.method797(var14, var16, field2316[3], var11, var13, field2315[3], var17, var19, field2320[3], field2317[0], field2317[2], field2317[3]);
				}
			}
		}

	}

	void method1472(int var1, class264 var2) {
		float var3 = (float)this.field2269[var1];
		float var4 = (float)(-this.field2270[var1]);
		float var5 = (float)(-this.field2274[var1]);
		float var6 = 1.0F;
		this.field2269[var1] = (int)(var2.field2388[0] * var3 + var2.field2388[4] * var4 + var2.field2388[8] * var5 + var2.field2388[12] * var6);
		this.field2270[var1] = -((int)(var2.field2388[1] * var3 + var2.field2388[5] * var4 + var2.field2388[9] * var5 + var2.field2388[13] * var6));
		this.field2274[var1] = -((int)(var2.field2388[2] * var3 + var2.field2388[6] * var4 + var2.field2388[10] * var5 + var2.field2388[14] * var6));
	}

	void method1476(class54 var1, int var2) {
		if (this.field2289 != null) {
			for (int var3 = 0; var3 < this.field2323; ++var3) {
				int[] var4 = this.field2289[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2313[var3];
					field2265.method1524();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class34 var8 = var1.method393(var7);
						if (var8 != null) {
							field2266.method1525((float)var5[var6] / 255.0F);
							field2267.method1530(var8.method228(var2));
							field2267.method1533(field2266);
							field2265.method1527(field2267);
						}
					}

					this.method1472(var3, field2265);
				}
			}

		}
	}
}
