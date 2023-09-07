public class class484 {

	static class406 field3892;

	static class61 field3894;

	static int[] field3895;

	boolean field3890;

	boolean[] field3893;

	class232 field3896;

	int[] field3891;

	int[] field3897;

	class484(class232 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field3896 = var1;
		this.field3890 = var2;
		this.field3891 = var3;
		this.field3897 = var4;
		this.field3893 = var5;
	}

	void method2338(float[] var1, int var2) {
		int var4 = this.field3896.field2013.length;
		class232 var10000 = this.field3896;
		int var5 = class232.field2012[this.field3896.field2011 - 1];
		boolean[] var6 = this.field3893;
		this.field3893[1] = true;
		var6[0] = true;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var7 = 2; var7 < var4; ++var7) {
			var8 = this.field3896.method1369(this.field3891, var7);
			var9 = this.field3896.method1366(this.field3891, var7);
			var10 = this.field3896.method1367(this.field3891[var8], this.field3897[var8], this.field3891[var9], this.field3897[var9], this.field3891[var7]);
			var11 = this.field3897[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (var11 != 0) {
				boolean[] var15 = this.field3893;
				this.field3893[var9] = true;
				var15[var8] = true;
				this.field3893[var7] = true;
				if (var11 >= var14) {
					this.field3897[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
				} else {
					this.field3897[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
				}
			} else {
				this.field3893[var7] = false;
				this.field3897[var7] = var10;
			}
		}
		this.method2340(0, var4 - 1);
		var7 = 0;
		var8 = this.field3896.field2011 * this.field3897[0];
		for (var9 = 1; var9 < var4; ++var9) {
			if (this.field3893[var9]) {
				var10 = this.field3891[var9];
				var11 = this.field3897[var9] * this.field3896.field2011;
				this.field3896.method1365(var7, var8, var10, var11, var1, var2);
				if (var10 >= var2) {
					return;
				}
				var7 = var10;
				var8 = var11;
			}
		}
		var10000 = this.field3896;
		float var17 = class232.field2014[var8];
		for (var10 = var7; var10 < var2; ++var10) {
			var1[var10] *= var17;
		}
	}

	boolean method2339() {
		return this.field3890;
	}

	void method2340(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.field3891[var1];
			int var6 = this.field3897[var1];
			boolean var7 = this.field3893[var1];
			for (int var8 = var1 + 1; var8 <= var2; ++var8) {
				int var9 = this.field3891[var8];
				if (var9 < var5) {
					this.field3891[var4] = var9;
					this.field3897[var4] = this.field3897[var8];
					this.field3893[var4] = this.field3893[var8];
					++var4;
					this.field3891[var8] = this.field3891[var4];
					this.field3897[var8] = this.field3897[var4];
					this.field3893[var8] = this.field3893[var4];
				}
			}
			this.field3891[var4] = var5;
			this.field3897[var4] = var6;
			this.field3893[var4] = var7;
			this.method2340(var1, var4 - 1);
			this.method2340(var4 + 1, var2);
		}
	}
}
