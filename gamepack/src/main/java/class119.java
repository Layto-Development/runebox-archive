import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bz")
public class class119 {
	@ObfInfo(name = "ao", desc = "I")
	int field1124;
	@ObfInfo(name = "ae", desc = "I")
	int field1125;
	@ObfInfo(name = "at", desc = "I")
	int field1126;
	@ObfInfo(name = "au", desc = "I")
	int field1127;
	@ObfInfo(name = "ac", desc = "I")
	int field1128;
	@ObfInfo(name = "ai", desc = "I")
	int field1129;
	@ObfInfo(name = "az", desc = "[I")
	int[] field1130;

	@ObfInfo(name = "<init>", desc = "()V")
	class119() {
		class226 var1 = class130.field1176;
		this.field1127 = var1.method1216(16);
		this.field1125 = var1.method1216(24);
		this.field1124 = var1.method1216(24);
		this.field1126 = var1.method1216(24) + 1;
		this.field1128 = var1.method1216(6) + 1;
		this.field1129 = var1.method1216(8);
		int[] var2 = new int[this.field1128];

		int var3;
		for (var3 = 0; var3 < this.field1128; ++var3) {
			int var4 = 0;
			int var5 = var1.method1216(3);
			boolean var6 = var1.method1217() != 0;
			if (var6) {
				var4 = var1.method1216(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field1130 = new int[this.field1128 * 8];

		for (var3 = 0; var3 < this.field1128 * 8; ++var3) {
			this.field1130[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1216(8) : -1;
		}

	}

	@ObfInfo(name = "au", desc = "([FIZLce;)V")
	void method684(float[] var1, int var2, boolean var3, class226 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = class130.field1179[this.field1129].field556;
			int var6 = this.field1124 - this.field1125;
			int var7 = var6 / this.field1126;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = class130.field1179[this.field1129].method441(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.field1128;
							}

							var11 /= this.field1128;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field1130[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.field1125 + var10 * this.field1126;
							class42 var15 = class130.field1179[var13];
							int var16;
							if (this.field1127 == 0) {
								var16 = this.field1126 / var15.field556;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method440(var4);

									for (int var19 = 0; var19 < var15.field556; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.field1126) {
									float[] var17 = var15.method440(var4);

									for (int var18 = 0; var18 < var15.field556; ++var18) {
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
