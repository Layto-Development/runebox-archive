public class class85 {

	int field849;

	int field850;

	int field851;

	int field852;

	int field853;

	int field854;

	int[] field855;

	class85() {
		class129 var1 = class97.field1231;
		this.field852 = var1.method856(16);
		this.field850 = var1.method856(24);
		this.field849 = var1.method856(24);
		this.field851 = var1.method856(24) + 1;
		this.field853 = var1.method856(6) + 1;
		this.field854 = var1.method856(8);
		int[] var2 = new int[this.field853];
		int var3;
		for (var3 = 0; var3 < this.field853; ++var3) {
			int var4 = 0;
			int var5 = var1.method856(3);
			boolean var6 = var1.method857() != 0;
			if (var6) {
				var4 = var1.method856(5);
			}
			var2[var3] = var4 << 3 | var5;
		}
		this.field855 = new int[this.field853 * 8];
		for (var3 = 0; var3 < this.field853 * 8; ++var3) {
			this.field855[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method856(8) : -1;
		}
	}

	void method385(float[] var1, int var2, boolean var3, class129 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}
		if (!var3) {
			var5 = class97.field1234[this.field854].field2186;
			int var6 = this.field849 - this.field850;
			int var7 = var6 / this.field851;
			int[] var8 = new int[var7];
			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;
				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = class97.field1234[this.field854].method1466(var4);
						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.field853;
							}
							var11 /= this.field853;
						}
					}
					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.field855[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.field850 + var10 * this.field851;
							class266 var15 = class97.field1234[var13];
							int var16;
							if (this.field852 == 0) {
								var16 = this.field851 / var15.field2186;
								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method1465(var4);
									for (int var19 = 0; var19 < var15.field2186; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;
								while (var16 < this.field851) {
									float[] var17 = var15.method1465(var4);
									for (int var18 = 0; var18 < var15.field2186; ++var18) {
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
