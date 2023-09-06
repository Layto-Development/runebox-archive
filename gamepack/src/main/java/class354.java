public class class354 extends class372 {
	static class25[] field3032;
	static String field3029;
	class18 field3030;
	class388 field3031;
	class86 field3033;

	class354(class18 var1) {
		this.field3033 = new class86();
		this.field3031 = new class388();
		this.field3030 = var1;
	}

	protected class372 method1980() {
		class386 var1 = (class386)this.field3033.method563();
		if (var1 == null) {
			return null;
		} else {
			return (class372)(var1.field3251 != null ? var1.field3251 : this.method1981());
		}
	}

	protected class372 method1981() {
		class386 var1;
		do {
			var1 = (class386)this.field3033.method565();
			if (var1 == null) {
				return null;
			}
		} while(null == var1.field3251);

		return var1.field3251;
	}

	protected int method1978() {
		return 0;
	}

	protected void method1983(int[] var1, int var2, int var3) {
		this.field3031.method1983(var1, var2, var3);

		for (class386 var6 = (class386)this.field3033.method563(); null != var6; var6 = (class386)this.field3033.method565()) {
			if (!this.field3030.method167(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3262) {
						this.method1931(var6, var1, var4, var5, var5 + var4);
						var6.field3262 -= var5;
						break;
					}

					this.method1931(var6, var1, var4, var6.field3262, var4 + var5);
					var4 += var6.field3262;
					var5 -= var6.field3262;
				} while(!this.field3030.method157(var6, var1, var4, var5));
			}
		}

	}

	protected void method1982(int var1) {
		this.field3031.method1982(var1);

		for (class386 var3 = (class386)this.field3033.method563(); var3 != null; var3 = (class386)this.field3033.method565()) {
			if (!this.field3030.method167(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3262) {
						this.method1933(var3, var2);
						var3.field3262 -= var2;
						break;
					}

					this.method1933(var3, var3.field3262);
					var2 -= var3.field3262;
				} while(!this.field3030.method157(var3, (int[])null, 0, var2));
			}
		}

	}

	void method1931(class386 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.field3030.field401[var1.field3253] & 4) != 0 && var1.field3257 < 0) {
			int var7 = this.field3030.field428[var1.field3253] / class337.field2934;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field3263) / var7;
				if (var8 > var4) {
					var1.field3263 += var7 * var4;
					break;
				}

				var1.field3251.method1983(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field3263 += var8 * var7 - 1048576;
				int var9 = class337.field2934 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				class515 var11 = var1.field3251;
				if (this.field3030.field403[var1.field3253] == 0) {
					var1.field3251 = class515.method2446(var1.field3245, var11.method2456(), var11.method2450(), var11.method2451());
				} else {
					var1.field3251 = class515.method2446(var1.field3245, var11.method2456(), 0, var11.method2451());
					this.field3030.method149(var1, var1.field3244.field1459[var1.field3248] < 0);
					var1.field3251.method2475(var9, var11.method2450());
				}

				if (var1.field3244.field1459[var1.field3248] < 0) {
					var1.field3251.method2447(-1);
				}

				var11.method2454(var9);
				var11.method1983(var2, var3, var5 - var3);
				if (var11.method2458()) {
					this.field3031.method2045(var11);
				}
			}
		}

		var1.field3251.method1983(var2, var3, var4);
	}

	void method1933(class386 var1, int var2) {
		if ((this.field3030.field401[var1.field3253] & 4) != 0 && var1.field3257 < 0) {
			int var4 = this.field3030.field428[var1.field3253] / class337.field2934;
			int var5 = (var4 + 1048575 - var1.field3263) / var4;
			var1.field3263 = var2 * var4 + var1.field3263 & 1048575;
			if (var5 <= var2) {
				if (this.field3030.field403[var1.field3253] == 0) {
					var1.field3251 = class515.method2446(var1.field3245, var1.field3251.method2456(), var1.field3251.method2450(), var1.field3251.method2451());
				} else {
					var1.field3251 = class515.method2446(var1.field3245, var1.field3251.method2456(), 0, var1.field3251.method2451());
					this.field3030.method149(var1, var1.field3244.field1459[var1.field3248] < 0);
				}

				if (var1.field3244.field1459[var1.field3248] < 0) {
					var1.field3251.method2447(-1);
				}

				var2 = var1.field3263 / var4;
			}
		}

		var1.field3251.method1982(var2);
	}

	public static int method1935() {
		return ++class184.field1730 - 1;
	}
}
