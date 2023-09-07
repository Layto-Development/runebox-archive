public class class101 extends class182 {

	static class214[] field1272;

	static String field1269;

	class144 field1271;

	class449 field1273;

	class62 field1270;

	class101(class62 var1) {
		this.field1273 = new class449();
		this.field1271 = new class144();
		this.field1270 = var1;
	}

	@Override
	protected class182 method1066() {
		class491 var1 = (class491) this.field1273.method2218();
		if (var1 == null) {
			return null;
		} else {
			return (class182) (var1.field3970 != null ? var1.field3970 : this.method1067());
		}
	}

	@Override
	protected class182 method1067() {
		class491 var1;
		do {
			var1 = (class491) this.field1273.method2220();
			if (var1 == null) {
				return null;
			}
		} while (null == var1.field3970);
		return var1.field3970;
	}

	@Override
	protected int method1064() {
		return 0;
	}

	@Override
	protected void method1069(int[] var1, int var2, int var3) {
		this.field1271.method1069(var1, var2, var3);
		for (class491 var6 = (class491) this.field1273.method2218(); null != var6; var6 = (class491) this.field1273.method2220()) {
			if (!this.field1270.method278(var6)) {
				int var4 = var2;
				int var5 = var3;
				do {
					if (var5 <= var6.field3981) {
						this.method632(var6, var1, var4, var5, var5 + var4);
						var6.field3981 -= var5;
						break;
					}
					this.method632(var6, var1, var4, var6.field3981, var4 + var5);
					var4 += var6.field3981;
					var5 -= var6.field3981;
				} while (!this.field1270.method268(var6, var1, var4, var5));
			}
		}
	}

	@Override
	protected void method1068(int var1) {
		this.field1271.method1068(var1);
		for (class491 var3 = (class491) this.field1273.method2218(); var3 != null; var3 = (class491) this.field1273.method2220()) {
			if (!this.field1270.method278(var3)) {
				int var2 = var1;
				do {
					if (var2 <= var3.field3981) {
						this.method634(var3, var2);
						var3.field3981 -= var2;
						break;
					}
					this.method634(var3, var3.field3981);
					var2 -= var3.field3981;
				} while (!this.field1270.method268(var3, (int[]) null, 0, var2));
			}
		}
	}

	void method632(class491 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.field1270.field649[var1.field3972] & 4) != 0 && var1.field3976 < 0) {
			int var7 = this.field1270.field676[var1.field3972] / class537.field4217;
			while (true) {
				int var8 = (var7 + 1048575 - var1.field3982) / var7;
				if (var8 > var4) {
					var1.field3982 += var7 * var4;
					break;
				}
				var1.field3970.method1069(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field3982 += var8 * var7 - 1048576;
				int var9 = class537.field4217 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}
				class32 var11 = var1.field3970;
				if (this.field1270.field651[var1.field3972] == 0) {
					var1.field3970 = class32.method112(var1.field3964, var11.method122(), var11.method116(), var11.method117());
				} else {
					var1.field3970 = class32.method112(var1.field3964, var11.method122(), 0, var11.method117());
					this.field1270.method261(var1, var1.field3963.field876[var1.field3967] < 0);
					var1.field3970.method145(var9, var11.method116());
				}
				if (var1.field3963.field876[var1.field3967] < 0) {
					var1.field3970.method113(-1);
				}
				var11.method120(var9);
				var11.method1069(var2, var3, var5 - var3);
				if (var11.method124()) {
					this.field1271.method893(var11);
				}
			}
		}
		var1.field3970.method1069(var2, var3, var4);
	}

	void method634(class491 var1, int var2) {
		if ((this.field1270.field649[var1.field3972] & 4) != 0 && var1.field3976 < 0) {
			int var4 = this.field1270.field676[var1.field3972] / class537.field4217;
			int var5 = (var4 + 1048575 - var1.field3982) / var4;
			var1.field3982 = var2 * var4 + var1.field3982 & 1048575;
			if (var5 <= var2) {
				if (this.field1270.field651[var1.field3972] == 0) {
					var1.field3970 = class32.method112(var1.field3964, var1.field3970.method122(), var1.field3970.method116(), var1.field3970.method117());
				} else {
					var1.field3970 = class32.method112(var1.field3964, var1.field3970.method122(), 0, var1.field3970.method117());
					this.field1270.method261(var1, var1.field3963.field876[var1.field3967] < 0);
				}
				if (var1.field3963.field876[var1.field3967] < 0) {
					var1.field3970.method113(-1);
				}
				var2 = var1.field3982 / var4;
			}
		}
		var1.field3970.method1068(var2);
	}
}
