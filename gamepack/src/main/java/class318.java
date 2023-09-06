public class class318 {
	float[][] field2890;
	int field2889;
	int field2891;
	int[] field2886;
	int[] field2887;
	int[] field2888;

	class318() {
		class326 var1 = class374.field3117;
		var1.method1829(24);
		this.field2891 = var1.method1829(16);
		this.field2889 = var1.method1829(24);
		this.field2888 = new int[this.field2889];
		boolean var2 = var1.method1830() != 0;
		int var3;
		int var4;
		int var6;
		if (var2) {
			var3 = 0;

			for (var4 = var1.method1829(5) + 1; var3 < this.field2889; ++var4) {
				int var5 = var1.method1829(class501.method2419(this.field2889 - var3));

				for (var6 = 0; var6 < var5; ++var6) {
					this.field2888[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1830() != 0;

			for (var4 = 0; var4 < this.field2889; ++var4) {
				if (var15 && var1.method1830() == 0) {
					this.field2888[var4] = 0;
				} else {
					this.field2888[var4] = var1.method1829(5) + 1;
				}
			}
		}

		this.method1809();
		var3 = var1.method1829(4);
		if (var3 > 0) {
			float var16 = class374.method1995(var1.method1829(32));
			float var17 = class374.method1995(var1.method1829(32));
			var6 = var1.method1829(4) + 1;
			boolean var7 = var1.method1830() != 0;
			int var8;
			if (var3 == 1) {
				var8 = method1812(this.field2889, this.field2891);
			} else {
				var8 = this.field2889 * this.field2891;
			}

			this.field2886 = new int[var8];

			int var9;
			for (var9 = 0; var9 < var8; ++var9) {
				this.field2886[var9] = var1.method1829(var6);
			}

			this.field2890 = new float[this.field2889][this.field2891];
			float var10;
			int var11;
			int var12;
			if (var3 == 1) {
				for (var9 = 0; var9 < this.field2889; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.field2891; ++var12) {
						int var13 = var9 / var11 % var8;
						float var14 = (float)this.field2886[var13] * var17 + var16 + var10;
						this.field2890[var9][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 *= var8;
					}
				}
			} else {
				for (var9 = 0; var9 < this.field2889; ++var9) {
					var10 = 0.0F;
					var11 = var9 * this.field2891;

					for (var12 = 0; var12 < this.field2891; ++var12) {
						float var18 = (float)this.field2886[var11] * var17 + var16 + var10;
						this.field2890[var9][var12] = var18;
						if (var7) {
							var10 = var18;
						}

						++var11;
					}
				}
			}
		}

	}

	void method1809() {
		int[] var1 = new int[this.field2889];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.field2889; ++var3) {
			var4 = this.field2888[var3];
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

		this.field2887 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.field2889; ++var3) {
			var4 = this.field2888[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.field2887[var6] == 0) {
							this.field2887[var6] = var11;
						}

						var6 = this.field2887[var6];
					} else {
						++var6;
					}

					if (var6 >= this.field2887.length) {
						int[] var12 = new int[this.field2887.length * 2];

						for (var10 = 0; var10 < this.field2887.length; ++var10) {
							var12[var10] = this.field2887[var10];
						}

						this.field2887 = var12;
					}

					var8 >>>= 1;
				}

				this.field2887[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	int method1811(class326 var1) {
		int var2;
		for (var2 = 0; this.field2887[var2] >= 0; var2 = var1.method1830() != 0 ? this.field2887[var2] : var2 + 1) {
		}

		return ~this.field2887[var2];
	}

	float[] method1810(class326 var1) {
		return this.field2890[this.method1811(var1)];
	}

	static int method1812(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class102.method672(var2, var1) > var0; --var2) {
		}

		return var2;
	}
}
