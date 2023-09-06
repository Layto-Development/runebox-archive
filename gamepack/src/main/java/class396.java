public class class396 extends class234 {
	int field3323;
	int field3324;
	int field3325;
	int field3326;
	int field3327;
	int field3328;

	public class396(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field3327 = 0;
		this.field3324 = 0;
		this.field3325 = 0;
		this.field3326 = 0;
		this.field3323 = 0;
		this.field3328 = 0;
		this.field3327 = var1;
		this.field3324 = var2;
		this.field3325 = var3;
		this.field3326 = var4;
		this.field3323 = var5;
		this.field3328 = var6;
	}

	public int method1340() {
		double var2 = this.method1047();
		return (int)Math.round((double)(this.field3326 - this.field3327) * var2 + (double)this.field3327);
	}

	public int method1341() {
		double var2 = this.method1047();
		return (int)Math.round(var2 * (double)(this.field3323 - this.field3324) + (double)this.field3324);
	}

	public int method1342() {
		double var2 = this.method1047();
		return (int)Math.round((double)this.field3325 + (double)(this.field3328 - this.field3325) * var2);
	}

	public static void method2072(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			int var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;
			int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var7) {
					int var11 = var0[var10];
					var0[var10] = var0[var6];
					var0[var6] = var11;
					int var12 = var1[var10];
					var1[var10] = var1[var6];
					var1[var6++] = var12;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method2072(var0, var1, var2, var6 - 1);
			method2072(var0, var1, var6 + 1, var3);
		}

	}
}
