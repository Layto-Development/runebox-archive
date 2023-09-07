public class class305 {

	static float field2365;

	static float[][] field2361;

	static int field2366;

	static int[][] field2360;

	int[] field2363;

	int[] field2364;

	int[][][] field2362;

	int[][][] field2367;

	static {
		field2361 = new float[2][8];
		field2360 = new int[2][8];
	}

	class305() {
		this.field2363 = new int[2];
		this.field2367 = new int[2][2][4];
		this.field2362 = new int[2][2][4];
		this.field2364 = new int[2];
	}

	float method1607(int var1, int var2, float var3) {
		float var4 = (float) this.field2362[var1][0][var2] + var3 * (float) (this.field2362[var1][1][var2] - this.field2362[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
	}

	float method1608(int var1, int var2, float var3) {
		float var4 = (float) this.field2367[var1][0][var2] + var3 * (float) (this.field2367[var1][1][var2] - this.field2367[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method1609(var4);
	}

	int method1610(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float) this.field2364[0] + (float) (this.field2364[1] - this.field2364[0]) * var2;
			var3 *= 0.0030517578F;
			field2365 = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
			field2366 = (int) (field2365 * 65536.0F);
		}
		if (this.field2363[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1607(var1, 0, var2);
			field2361[var1][0] = var3 * -2.0F * (float) Math.cos((double) this.method1608(var1, 0, var2));
			field2361[var1][1] = var3 * var3;
			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field2363[var1]; ++var4) {
				var3 = this.method1607(var1, var4, var2);
				float var5 = var3 * -2.0F * (float) Math.cos((double) this.method1608(var1, var4, var2));
				float var6 = var3 * var3;
				field2361[var1][var4 * 2 + 1] = field2361[var1][var4 * 2 - 1] * var6;
				field2361[var1][var4 * 2] = field2361[var1][var4 * 2 - 1] * var5 + field2361[var1][var4 * 2 - 2] * var6;
				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field2361[var1];
					var10000[var7] += field2361[var1][var7 - 1] * var5 + field2361[var1][var7 - 2] * var6;
				}
				var10000 = field2361[var1];
				var10000[1] += field2361[var1][0] * var5 + var6;
				var10000 = field2361[var1];
				var10000[0] += var5;
			}
			if (var1 == 0) {
				for (var4 = 0; var4 < this.field2363[0] * 2; ++var4) {
					var10000 = field2361[0];
					var10000[var4] *= field2365;
				}
			}
			for (var4 = 0; var4 < this.field2363[var1] * 2; ++var4) {
				field2360[var1][var4] = (int) (field2361[var1][var4] * 65536.0F);
			}
			return this.field2363[var1] * 2;
		}
	}

	final void method1606(class187 var1, class333 var2) {
		int var3 = var1.method1096();
		this.field2363[0] = var3 >> 4;
		this.field2363[1] = var3 & 15;
		if (var3 != 0) {
			this.field2364[0] = var1.method1145();
			this.field2364[1] = var1.method1145();
			int var4 = var1.method1096();
			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field2363[var5]; ++var6) {
					this.field2367[var5][0][var6] = var1.method1145();
					this.field2362[var5][0][var6] = var1.method1145();
				}
			}
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field2363[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field2367[var5][1][var6] = var1.method1145();
						this.field2362[var5][1][var6] = var1.method1145();
					} else {
						this.field2367[var5][1][var6] = this.field2367[var5][0][var6];
						this.field2362[var5][1][var6] = this.field2362[var5][0][var6];
					}
				}
			}
			if (var4 != 0 || this.field2364[1] != this.field2364[0]) {
				var2.method1751(var1);
			}
		} else {
			int[] var7 = this.field2364;
			this.field2364[1] = 0;
			var7[0] = 0;
		}
	}

	static float method1609(float var0) {
		float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
