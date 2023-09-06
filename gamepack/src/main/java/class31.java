public class class31 {
	static float field473;
	static float[][] field469;
	static int field474;
	static int[][] field468;
	int[] field471;
	int[] field472;
	int[][][] field470;
	int[][][] field475;

	static {
		field469 = new float[2][8];
		field468 = new int[2][8];
	}

	class31() {
		this.field471 = new int[2];
		this.field475 = new int[2][2][4];
		this.field470 = new int[2][2][4];
		this.field472 = new int[2];
	}

	float method218(int var1, int var2, float var3) {
		float var4 = (float)this.field470[var1][0][var2] + var3 * (float)(this.field470[var1][1][var2] - this.field470[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	float method219(int var1, int var2, float var3) {
		float var4 = (float)this.field475[var1][0][var2] + var3 * (float)(this.field475[var1][1][var2] - this.field475[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method220(var4);
	}

	int method221(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field472[0] + (float)(this.field472[1] - this.field472[0]) * var2;
			var3 *= 0.0030517578F;
			field473 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			field474 = (int)(field473 * 65536.0F);
		}

		if (this.field471[var1] == 0) {
			return 0;
		} else {
			var3 = this.method218(var1, 0, var2);
			field469[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method219(var1, 0, var2));
			field469[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field471[var1]; ++var4) {
				var3 = this.method218(var1, var4, var2);
				float var5 = var3 * -2.0F * (float)Math.cos((double)this.method219(var1, var4, var2));
				float var6 = var3 * var3;
				field469[var1][var4 * 2 + 1] = field469[var1][var4 * 2 - 1] * var6;
				field469[var1][var4 * 2] = field469[var1][var4 * 2 - 1] * var5 + field469[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field469[var1];
					var10000[var7] += field469[var1][var7 - 1] * var5 + field469[var1][var7 - 2] * var6;
				}

				var10000 = field469[var1];
				var10000[1] += field469[var1][0] * var5 + var6;
				var10000 = field469[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field471[0] * 2; ++var4) {
					var10000 = field469[0];
					var10000[var4] *= field473;
				}
			}

			for (var4 = 0; var4 < this.field471[var1] * 2; ++var4) {
				field468[var1][var4] = (int)(field469[var1][var4] * 65536.0F);
			}

			return this.field471[var1] * 2;
		}
	}

	final void method217(class42 var1, class377 var2) {
		int var3 = var1.method278();
		this.field471[0] = var3 >> 4;
		this.field471[1] = var3 & 15;
		if (var3 != 0) {
			this.field472[0] = var1.method327();
			this.field472[1] = var1.method327();
			int var4 = var1.method278();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field471[var5]; ++var6) {
					this.field475[var5][0][var6] = var1.method327();
					this.field470[var5][0][var6] = var1.method327();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field471[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field475[var5][1][var6] = var1.method327();
						this.field470[var5][1][var6] = var1.method327();
					} else {
						this.field475[var5][1][var6] = this.field475[var5][0][var6];
						this.field470[var5][1][var6] = this.field470[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field472[1] != this.field472[0]) {
				var2.method2015(var1);
			}
		} else {
			int[] var7 = this.field472;
			this.field472[1] = 0;
			var7[0] = 0;
		}

	}

	static float method220(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
