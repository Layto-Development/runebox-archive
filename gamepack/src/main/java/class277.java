import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "mh")
public class class277 extends class449 {
	@ObfInfo(name = "da", desc = "[Luk;")
	static class398[] field2245;
	@ObfInfo(name = "cq", desc = "Ljava/lang/String;")
	static String field2242;
	@ObfInfo(name = "ae", desc = "Low;")
	class113 field2246;
	@ObfInfo(name = "au", desc = "Llf;")
	class137 field2243;
	@ObfInfo(name = "ao", desc = "Lbl;")
	class363 field2244;

	@ObfInfo(name = "<init>", desc = "(Llf;)V")
	class277(class137 var1) {
		this.field2246 = new class113();
		this.field2244 = new class363();
		this.field2243 = var1;
	}

	@ObfInfo(name = "ai", desc = "()Lbw;")
	protected class449 method2354() {
		class378 var1 = (class378)this.field2246.method627();
		if (var1 == null) {
			return null;
		} else {
			return (class449)(var1.field2901 != null ? var1.field2901 : this.method2355());
		}
	}

	@ObfInfo(name = "az", desc = "()Lbw;")
	protected class449 method2355() {
		class378 var1;
		do {
			var1 = (class378)this.field2246.method629();
			if (var1 == null) {
				return null;
			}
		} while(null == var1.field2901);

		return var1.field2901;
	}

	@ObfInfo(name = "ap", desc = "()I")
	protected int method2352() {
		return 0;
	}

	@ObfInfo(name = "aa", desc = "([III)V")
	protected void method2357(int[] var1, int var2, int var3) {
		this.field2244.method2357(var1, var2, var3);

		for (class378 var6 = (class378)this.field2246.method627(); null != var6; var6 = (class378)this.field2246.method629()) {
			if (!this.field2243.method813(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2912) {
						this.method1470(var6, var1, var4, var5, var5 + var4);
						var6.field2912 -= var5;
						break;
					}

					this.method1470(var6, var1, var4, var6.field2912, var4 + var5);
					var4 += var6.field2912;
					var5 -= var6.field2912;
				} while(!this.field2243.method803(var6, var1, var4, var5));
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(I)V")
	protected void method2356(int var1) {
		this.field2244.method2356(var1);

		for (class378 var3 = (class378)this.field2246.method627(); var3 != null; var3 = (class378)this.field2246.method629()) {
			if (!this.field2243.method813(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2912) {
						this.method1472(var3, var2);
						var3.field2912 -= var2;
						break;
					}

					this.method1472(var3, var3.field2912);
					var2 -= var3.field2912;
				} while(!this.field2243.method803(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfInfo(name = "au", desc = "(Lmg;[IIIII)V", opaqueValue = "-542366854")
	void method1470(class378 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.field2243.field1383[var1.field2903] & 4) != 0 && var1.field2907 < 0) {
			int var7 = this.field2243.field1410[var1.field2903] / class429.field3242;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field2913) / var7;
				if (var8 > var4) {
					var1.field2913 += var7 * var4;
					break;
				}

				var1.field2901.method2357(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field2913 += var8 * var7 - 1048576;
				int var9 = class429.field3242 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				class28 var11 = var1.field2901;
				if (this.field2243.field1385[var1.field2903] == 0) {
					var1.field2901 = class28.method369(var1.field2895, var11.method379(), var11.method373(), var11.method374());
				} else {
					var1.field2901 = class28.method369(var1.field2895, var11.method379(), 0, var11.method374());
					this.field2243.method796(var1, var1.field2894.field1510[var1.field2898] < 0);
					var1.field2901.method402(var9, var11.method373());
				}

				if (var1.field2894.field1510[var1.field2898] < 0) {
					var1.field2901.method370(-1);
				}

				var11.method377(var9);
				var11.method2357(var2, var3, var5 - var3);
				if (var11.method381()) {
					this.field2244.method1990(var11);
				}
			}
		}

		var1.field2901.method2357(var2, var3, var4);
	}

	@ObfInfo(name = "ae", desc = "(Lmg;II)V", opaqueValue = "-962516856")
	void method1472(class378 var1, int var2) {
		if ((this.field2243.field1383[var1.field2903] & 4) != 0 && var1.field2907 < 0) {
			int var4 = this.field2243.field1410[var1.field2903] / class429.field3242;
			int var5 = (var4 + 1048575 - var1.field2913) / var4;
			var1.field2913 = var2 * var4 + var1.field2913 & 1048575;
			if (var5 <= var2) {
				if (this.field2243.field1385[var1.field2903] == 0) {
					var1.field2901 = class28.method369(var1.field2895, var1.field2901.method379(), var1.field2901.method373(), var1.field2901.method374());
				} else {
					var1.field2901 = class28.method369(var1.field2895, var1.field2901.method379(), 0, var1.field2901.method374());
					this.field2243.method796(var1, var1.field2894.field1510[var1.field2898] < 0);
				}

				if (var1.field2894.field1510[var1.field2898] < 0) {
					var1.field2901.method370(-1);
				}

				var2 = var1.field2913 / var4;
			}
		}

		var1.field2901.method2356(var2);
	}
}
