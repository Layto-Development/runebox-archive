public class class488 {
	static class253 field4114;
	static class431 field4112;
	static int[] field4115;
	boolean field4110;
	boolean[] field4113;
	class345 field4116;
	int[] field4111;
	int[] field4117;

	class488(class345 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field4116 = var1;
		this.field4110 = var2;
		this.field4111 = var3;
		this.field4117 = var4;
		this.field4113 = var5;
	}

	void method2404(float[] var1, int var2) {
		int var4 = this.field4116.field2982.length;
		class345 var10000 = this.field4116;
		int var5 = class345.field2981[this.field4116.field2980 - 1];
		boolean[] var6 = this.field4113;
		this.field4113[1] = true;
		var6[0] = true;

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var7 = 2; var7 < var4; ++var7) {
			var8 = this.field4116.method1895(this.field4111, var7);
			var9 = this.field4116.method1892(this.field4111, var7);
			var10 = this.field4116.method1893(this.field4111[var8], this.field4117[var8], this.field4111[var9], this.field4117[var9], this.field4111[var7]);
			var11 = this.field4117[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (var11 != 0) {
				boolean[] var15 = this.field4113;
				this.field4113[var9] = true;
				var15[var8] = true;
				this.field4113[var7] = true;
				if (var11 >= var14) {
					this.field4117[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
				} else {
					this.field4117[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
				}
			} else {
				this.field4113[var7] = false;
				this.field4117[var7] = var10;
			}
		}

		this.method2406(0, var4 - 1);
		var7 = 0;
		var8 = this.field4116.field2980 * this.field4117[0];

		for (var9 = 1; var9 < var4; ++var9) {
			if (this.field4113[var9]) {
				var10 = this.field4111[var9];
				var11 = this.field4117[var9] * this.field4116.field2980;
				this.field4116.method1891(var7, var8, var10, var11, var1, var2);
				if (var10 >= var2) {
					return;
				}

				var7 = var10;
				var8 = var11;
			}
		}

		var10000 = this.field4116;
		float var17 = class345.field2983[var8];

		for (var10 = var7; var10 < var2; ++var10) {
			var1[var10] *= var17;
		}

	}

	boolean method2405() {
		return this.field4110;
	}

	void method2406(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.field4111[var1];
			int var6 = this.field4117[var1];
			boolean var7 = this.field4113[var1];

			for (int var8 = var1 + 1; var8 <= var2; ++var8) {
				int var9 = this.field4111[var8];
				if (var9 < var5) {
					this.field4111[var4] = var9;
					this.field4117[var4] = this.field4117[var8];
					this.field4113[var4] = this.field4113[var8];
					++var4;
					this.field4111[var8] = this.field4111[var4];
					this.field4117[var8] = this.field4117[var4];
					this.field4113[var8] = this.field4113[var4];
				}
			}

			this.field4111[var4] = var5;
			this.field4117[var4] = var6;
			this.field4113[var4] = var7;
			this.method2406(var1, var4 - 1);
			this.method2406(var4 + 1, var2);
		}
	}

	static int method2403(char var0, class168 var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = 1 + (var0 << 4);
		}

		if (var0 == 241 && var1 == class168.field1633) {
			var3 = 1762;
		}

		return var3;
	}
}
