import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "cr")
public class class122 {
	@ObfInfo(name = "ap", desc = "F")
	static float field1149;
	@ObfInfo(name = "ai", desc = "[[F")
	static float[][] field1145;
	@ObfInfo(name = "aa", desc = "I")
	static int field1150;
	@ObfInfo(name = "az", desc = "[[I")
	static int[][] field1144;
	@ObfInfo(name = "au", desc = "[I")
	int[] field1147;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field1148;
	@ObfInfo(name = "at", desc = "[[[I")
	int[][][] field1146;
	@ObfInfo(name = "ao", desc = "[[[I")
	int[][][] field1151;

	static {
		field1145 = new float[2][8];
		field1144 = new int[2][8];
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class122() {
		this.field1147 = new int[2];
		this.field1151 = new int[2][2][4];
		this.field1146 = new int[2][2][4];
		this.field1148 = new int[2];
	}

	@ObfInfo(name = "au", desc = "(IIF)F")
	float method691(int var1, int var2, float var3) {
		float var4 = (float)this.field1146[var1][0][var2] + var3 * (float)(this.field1146[var1][1][var2] - this.field1146[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfInfo(name = "ao", desc = "(IIF)F")
	float method692(int var1, int var2, float var3) {
		float var4 = (float)this.field1151[var1][0][var2] + var3 * (float)(this.field1151[var1][1][var2] - this.field1151[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method693(var4);
	}

	@ObfInfo(name = "at", desc = "(IF)I")
	int method694(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field1148[0] + (float)(this.field1148[1] - this.field1148[0]) * var2;
			var3 *= 0.0030517578F;
			field1149 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			field1150 = (int)(field1149 * 65536.0F);
		}

		if (this.field1147[var1] == 0) {
			return 0;
		} else {
			var3 = this.method691(var1, 0, var2);
			field1145[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method692(var1, 0, var2));
			field1145[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field1147[var1]; ++var4) {
				var3 = this.method691(var1, var4, var2);
				float var5 = var3 * -2.0F * (float)Math.cos((double)this.method692(var1, var4, var2));
				float var6 = var3 * var3;
				field1145[var1][var4 * 2 + 1] = field1145[var1][var4 * 2 - 1] * var6;
				field1145[var1][var4 * 2] = field1145[var1][var4 * 2 - 1] * var5 + field1145[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field1145[var1];
					var10000[var7] += field1145[var1][var7 - 1] * var5 + field1145[var1][var7 - 2] * var6;
				}

				var10000 = field1145[var1];
				var10000[1] += field1145[var1][0] * var5 + var6;
				var10000 = field1145[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field1147[0] * 2; ++var4) {
					var10000 = field1145[0];
					var10000[var4] *= field1149;
				}
			}

			for (var4 = 0; var4 < this.field1147[var1] * 2; ++var4) {
				field1144[var1][var4] = (int)(field1145[var1][var4] * 65536.0F);
			}

			return this.field1147[var1] * 2;
		}
	}

	@ObfInfo(name = "ac", desc = "(Ltm;Lbr;)V")
	final void method690(class280 var1, class485 var2) {
		int var3 = var1.method1492();
		this.field1147[0] = var3 >> 4;
		this.field1147[1] = var3 & 15;
		if (var3 != 0) {
			this.field1148[0] = var1.method1541();
			this.field1148[1] = var1.method1541();
			int var4 = var1.method1492();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field1147[var5]; ++var6) {
					this.field1151[var5][0][var6] = var1.method1541();
					this.field1146[var5][0][var6] = var1.method1541();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field1147[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field1151[var5][1][var6] = var1.method1541();
						this.field1146[var5][1][var6] = var1.method1541();
					} else {
						this.field1151[var5][1][var6] = this.field1151[var5][0][var6];
						this.field1146[var5][1][var6] = this.field1146[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field1148[1] != this.field1148[0]) {
				var2.method2457(var1);
			}
		} else {
			int[] var7 = this.field1148;
			this.field1148[1] = 0;
			var7[0] = 0;
		}

	}

	@ObfInfo(name = "ae", desc = "(F)F")
	static float method693(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
