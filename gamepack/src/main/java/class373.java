public final class class373 extends class54 {

	static int field3018;

	static int field3025;

	class18 field3021;

	class22 field3023;

	class22 field3024;

	class314 field3019;

	int field3020;

	String field3022;

	static {
		field3018 = 1;
		field3025 = 1;
	}

	class373() {
		this.field3022 = "";
		this.field3020 = 31;
	}

	void method1971(String var1) {
		this.field3022 = null == var1 ? "" : var1;
	}

	void method1972(int var1) {
		this.field3020 = var1;
	}

	boolean method1973(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field3020 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	final String method1974() {
		if (!this.field3022.isEmpty()) {
			return this.field3022;
		} else {
			class314 var2 = this.field3019;
			if (var2.field2467 != null) {
				var2 = var2.method1685();
				if (null == var2) {
					var2 = this.field3019;
				}
			}
			return var2.field2439;
		}
	}

	final void method1975(int var1, class343 var2) {
		int var4 = super.field317[0];
		int var5 = super.field314[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}
		if (var1 == 1) {
			++var5;
		}
		if (var1 == 2) {
			++var4;
			++var5;
		}
		if (var1 == 3) {
			--var4;
		}
		if (var1 == 4) {
			++var4;
		}
		if (var1 == 5) {
			--var4;
			--var5;
		}
		if (var1 == 6) {
			--var5;
		}
		if (var1 == 7) {
			++var4;
			--var5;
		}
		if (super.field287 != -1 && class67.method308(super.field287).field715 == 1) {
			super.field287 = -1;
		}
		if (super.field290 < 9) {
			++super.field290;
		}
		for (int var6 = super.field290; var6 > 0; --var6) {
			super.field317[var6] = super.field317[var6 - 1];
			super.field314[var6] = super.field314[var6 - 1];
			super.field315[var6] = super.field315[var6 - 1];
		}
		super.field317[0] = var4;
		super.field314[0] = var5;
		super.field315[0] = var2;
	}

	final void method1976(int var1, int var2, boolean var3) {
		if (super.field287 != -1 && class67.method308(super.field287).field715 == 1) {
			super.field287 = -1;
		}
		if (!var3) {
			int var5 = var1 - super.field317[0];
			int var6 = var2 - super.field314[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field290 < 9) {
					++super.field290;
				}
				for (int var7 = super.field290; var7 > 0; --var7) {
					super.field317[var7] = super.field317[var7 - 1];
					super.field314[var7] = super.field314[var7 - 1];
					super.field315[var7] = super.field315[var7 - 1];
				}
				super.field317[0] = var1;
				super.field314[0] = var2;
				super.field315[0] = class343.field2607;
				return;
			}
		}
		super.field290 = 0;
		super.field306 = 0;
		super.field316 = 0;
		super.field317[0] = var1;
		super.field314[0] = var2;
		super.field272 = super.field246 * 64 + 128 * super.field317[0];
		super.field243 = super.field314[0] * 128 + super.field246 * 64;
	}

	@Override
	protected final class113 method1165() {
		if (this.field3019 == null) {
			return null;
		} else {
			class67 var2 = super.field287 != -1 && super.field304 == 0 ? class67.method308(super.field287) : null;
			class67 var3 = super.field255 != -1 && (super.field248 != super.field255 || var2 == null) ? class67.method308(super.field255) : null;
			class113 var4 = null;
			if (this.field3023 != null && this.field3023.field115) {
				var4 = class431.field3378.field806.method2454(var2, super.field288, var3, super.field242);
			} else {
				var4 = this.field3019.method1683(var2, super.field288, var3, super.field242, this.field3023);
			}
			if (null == var4) {
				return null;
			} else {
				var4.method679();
				super.field302 = var4.field1834;
				int var5 = var4.field1327;
				var4 = this.method222(var4);
				if (this.field3019.field2440 == 1) {
					var4.field1328 = true;
				}
				if (super.field295 != 0 && Client.field1201 >= super.field303 && Client.field1201 < super.field245) {
					var4.field1383 = super.field305;
					var4.field1353 = super.field263;
					var4.field1351 = super.field257;
					var4.field1389 = super.field295;
					var4.field1390 = (short) var5;
				} else {
					var4.field1389 = 0;
				}
				return var4;
			}
		}
	}

	@Override
	final boolean method217() {
		return null != this.field3019;
	}

	int[] method1977() {
		return null != this.field3021 ? this.field3021.method56() : this.field3019.method1688();
	}

	short[] method1984() {
		return this.field3021 != null ? this.field3021.method57() : this.field3019.method1690();
	}

	void method1987(int var1, int var2, short var3) {
		if (this.field3021 == null) {
			this.field3021 = new class18(this.field3019);
		}
		this.field3021.method58(var1, var2, var3);
	}

	void method1978(int[] var1, short[] var2) {
		if (null == this.field3021) {
			this.field3021 = new class18(this.field3019);
		}
		this.field3021.method59(var1, var2);
	}

	void method1979() {
		this.field3021 = null;
	}

	void method1985(class22 var1) {
		this.field3024 = var1;
	}

	class22 method1981() {
		return this.field3024;
	}

	void method1982(class22 var1) {
		this.field3023 = var1;
	}

	void method1980() {
		this.field3024 = null;
	}

	void method1983() {
		this.field3023 = null;
	}

	static void method1986(class165 var0, int var1, int var2) {
		Object[] var4 = var0.field1667;
		class436 var5;
		if (class183.method1071(var0.field1671)) {
			class204.field1894 = (class142) var4[0];
			class319 var6 = class319.method1706(class204.field1894.field1544);
			var5 = class436.method2176(var0.field1671, var6.field2488, var6.field2502);
		} else {
			int var7 = (Integer) var4[0];
			var5 = class436.method2173(var7);
		}
		if (var5 != null) {
			class221.method1329(var0, var5, var1, var2);
		}
	}
}
