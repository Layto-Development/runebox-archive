import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "cw")
public class class42 {
	@ObfInfo(name = "ac", desc = "[[F")
	float[][] field555;
	@ObfInfo(name = "ae", desc = "I")
	int field554;
	@ObfInfo(name = "au", desc = "I")
	int field556;
	@ObfInfo(name = "at", desc = "[I")
	int[] field551;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field552;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field553;

	@ObfInfo(name = "<init>", desc = "()V")
	class42() {
		class226 var1 = class130.field1176;
		var1.method1216(24);
		this.field556 = var1.method1216(16);
		this.field554 = var1.method1216(24);
		this.field553 = new int[this.field554];
		boolean var2 = var1.method1217() != 0;
		int var3;
		int var4;
		int var6;
		if (var2) {
			var3 = 0;

			for (var4 = var1.method1216(5) + 1; var3 < this.field554; ++var4) {
				int var5 = var1.method1216(class497.method2487(this.field554 - var3));

				for (var6 = 0; var6 < var5; ++var6) {
					this.field553[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1217() != 0;

			for (var4 = 0; var4 < this.field554; ++var4) {
				if (var15 && var1.method1217() == 0) {
					this.field553[var4] = 0;
				} else {
					this.field553[var4] = var1.method1216(5) + 1;
				}
			}
		}

		this.method439();
		var3 = var1.method1216(4);
		if (var3 > 0) {
			float var16 = class130.method714(var1.method1216(32));
			float var17 = class130.method714(var1.method1216(32));
			var6 = var1.method1216(4) + 1;
			boolean var7 = var1.method1217() != 0;
			int var8;
			if (var3 == 1) {
				var8 = method442(this.field554, this.field556);
			} else {
				var8 = this.field554 * this.field556;
			}

			this.field551 = new int[var8];

			int var9;
			for (var9 = 0; var9 < var8; ++var9) {
				this.field551[var9] = var1.method1216(var6);
			}

			this.field555 = new float[this.field554][this.field556];
			float var10;
			int var11;
			int var12;
			if (var3 == 1) {
				for (var9 = 0; var9 < this.field554; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.field556; ++var12) {
						int var13 = var9 / var11 % var8;
						float var14 = (float)this.field551[var13] * var17 + var16 + var10;
						this.field555[var9][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 *= var8;
					}
				}
			} else {
				for (var9 = 0; var9 < this.field554; ++var9) {
					var10 = 0.0F;
					var11 = var9 * this.field556;

					for (var12 = 0; var12 < this.field556; ++var12) {
						float var18 = (float)this.field551[var11] * var17 + var16 + var10;
						this.field555[var9][var12] = var18;
						if (var7) {
							var10 = var18;
						}

						++var11;
					}
				}
			}
		}

	}

	@ObfInfo(name = "ae", desc = "()V")
	void method439() {
		int[] var1 = new int[this.field554];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.field554; ++var3) {
			var4 = this.field553[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				int var9;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var9 = var2[var8];
					if (var9 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.field552 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.field554; ++var3) {
			var4 = this.field553[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.field552[var6] == 0) {
							this.field552[var6] = var11;
						}

						var6 = this.field552[var6];
					} else {
						++var6;
					}

					if (var6 >= this.field552.length) {
						int[] var12 = new int[this.field552.length * 2];

						for (var10 = 0; var10 < this.field552.length; ++var10) {
							var12[var10] = this.field552[var10];
						}

						this.field552 = var12;
					}

					var8 >>>= 1;
				}

				this.field552[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	@ObfInfo(name = "ao", desc = "(Lce;)I")
	int method441(class226 var1) {
		int var2;
		for (var2 = 0; this.field552[var2] >= 0; var2 = var1.method1217() != 0 ? this.field552[var2] : var2 + 1) {
		}

		return ~this.field552[var2];
	}

	@ObfInfo(name = "at", desc = "(Lce;)[F")
	float[] method440(class226 var1) {
		return this.field555[this.method441(var1)];
	}

	@ObfInfo(name = "au", desc = "(II)I")
	static int method442(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class497.method2490(var2, var1) > var0; --var2) {
		}

		return var2;
	}
}
