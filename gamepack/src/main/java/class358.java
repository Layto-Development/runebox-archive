public class class358 extends class462 {
	public static int field3039;
	static int field3038;
	static int field3040;
	class190 field3036;
	class55 field3037;

	class358(class190 var1) {
		this.field3037 = new class55();
		this.field3036 = var1;
	}

	void method1939(int var1, int var2, int var3, int var4) {
		class177 var6 = null;
		int var7 = 0;

		for (class177 var8 = (class177)this.field3037.method409(); var8 != null; var8 = (class177)this.field3037.method405()) {
			++var7;
			if (var8.field1706 == var1) {
				var8.method1002(var1, var2, var3, var4);
				return;
			}

			if (var8.field1706 <= var1) {
				var6 = var8;
			}
		}

		if (null == var6) {
			if (var7 < 4) {
				this.field3037.method412(new class177(var1, var2, var3, var4));
			}

		} else {
			class55.method410(new class177(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field3037.method409().method2269();
			}

		}
	}

	class177 method1940(int var1) {
		class177 var3 = (class177)this.field3037.method409();
		if (null != var3 && var3.field1706 <= var1) {
			for (class177 var4 = (class177)this.field3037.method405(); null != var4 && var4.field1706 <= var1; var4 = (class177)this.field3037.method405()) {
				var3.method2269();
				var3 = var4;
			}

			if (var3.field1706 + var3.field1704 + this.field3036.field1762 > var1) {
				return var3;
			} else {
				var3.method2269();
				return null;
			}
		} else {
			return null;
		}
	}

	boolean method1941() {
		return this.field3037.method407();
	}

	static final void method1942(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = class454.method2262(var0, var1, field3038) - var2;
			var0 -= class375.field3180;
			var4 -= class463.field3989;
			var1 -= class196.field1796;
			int var5 = class133.field1291[class452.field3956];
			int var6 = class133.field1289[class452.field3956];
			int var7 = class133.field1291[class175.field1694];
			int var8 = class133.field1289[class175.field1694];
			int var9 = var0 * var8 + var1 * var7 >> 16;
			var1 = var1 * var8 - var7 * var0 >> 16;
			var0 = var9;
			var9 = var6 * var4 - var5 * var1 >> 16;
			var1 = var1 * var6 + var4 * var5 >> 16;
			if (var1 >= 50) {
				Client.field121 = var0 * Client.field288 / var1 + Client.field219 / 2;
				Client.field122 = Client.field288 * var9 / var1 + Client.field94 / 2;
			} else {
				Client.field121 = -1;
				Client.field122 = -1;
			}

		} else {
			Client.field121 = -1;
			Client.field122 = -1;
		}
	}
}
