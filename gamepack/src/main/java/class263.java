public class class263 {
	int field2380;
	int field2381;
	int field2382;
	int field2383;
	int field2384;
	int field2385;
	int[] field2386;

	class263() {
		class326 var1 = class374.field3117;
		this.field2383 = var1.method1829(16);
		this.field2381 = var1.method1829(24);
		this.field2380 = var1.method1829(24);
		this.field2382 = var1.method1829(24) + 1;
		this.field2384 = var1.method1829(6) + 1;
		this.field2385 = var1.method1829(8);
		int[] var2 = new int[this.field2384];

		int var3;
		for (var3 = 0; var3 < this.field2384; ++var3) {
			int var4 = 0;
			int var5 = var1.method1829(3);
			boolean var6 = var1.method1830() != 0;
			if (var6) {
				var4 = var1.method1829(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field2386 = new int[this.field2384 * 8];

		for (var3 = 0; var3 < this.field2384 * 8; ++var3) {
			this.field2386[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1829(8) : -1;
		}

	}

	void method1519(float[] var1, int var2, boolean var3, class326 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = class374.field3120[this.field2385].field2891;
			int var6 = this.field2380 - this.field2381;
			int var7 = var6 / this.field2382;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = class374.field3120[this.field2385].method1811(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.field2384;
							}

							var11 /= this.field2384;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field2386[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.field2381 + var10 * this.field2382;
							class318 var15 = class374.field3120[var13];
							int var16;
							if (this.field2383 == 0) {
								var16 = this.field2382 / var15.field2891;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method1810(var4);

									for (int var19 = 0; var19 < var15.field2891; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.field2382) {
									float[] var17 = var15.method1810(var4);

									for (int var18 = 0; var18 < var15.field2891; ++var18) {
										var1[var14 + var16] += var17[var18];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var7) {
							break;
						}
					}
				}
			}

		}
	}
}
