public final class class102 extends class163 {
	static int field1017;
	static int field1024;
	class153 field1020;
	class375 field1018;
	class447 field1022;
	class447 field1023;
	int field1019;
	String field1021;

	static {
		field1017 = 1;
		field1024 = 1;
	}

	class102() {
		this.field1021 = "";
		this.field1019 = 31;
	}

	void method653(String var1) {
		this.field1021 = null == var1 ? "" : var1;
	}

	void method654(int var1) {
		this.field1019 = var1;
	}

	boolean method655(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1019 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	final String method656() {
		if (!this.field1021.isEmpty()) {
			return this.field1021;
		} else {
			class375 var2 = this.field1018;
			if (var2.field3177 != null) {
				var2 = var2.method2001();
				if (null == var2) {
					var2 = this.field1018;
				}
			}

			return var2.field3149;
		}
	}

	final void method657(int var1, class394 var2) {
		int var4 = super.field1600[0];
		int var5 = super.field1597[0];
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

		if (super.field1570 != -1 && class114.method702(super.field1570).field3310 == 1) {
			super.field1570 = -1;
		}

		if (super.field1573 < 9) {
			++super.field1573;
		}

		for (int var6 = super.field1573; var6 > 0; --var6) {
			super.field1600[var6] = super.field1600[var6 - 1];
			super.field1597[var6] = super.field1597[var6 - 1];
			super.field1598[var6] = super.field1598[var6 - 1];
		}

		super.field1600[0] = var4;
		super.field1597[0] = var5;
		super.field1598[0] = var2;
	}

	final void method658(int var1, int var2, boolean var3) {
		if (super.field1570 != -1 && class114.method702(super.field1570).field3310 == 1) {
			super.field1570 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field1600[0];
			int var6 = var2 - super.field1597[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field1573 < 9) {
					++super.field1573;
				}

				for (int var7 = super.field1573; var7 > 0; --var7) {
					super.field1600[var7] = super.field1600[var7 - 1];
					super.field1597[var7] = super.field1597[var7 - 1];
					super.field1598[var7] = super.field1598[var7 - 1];
				}

				super.field1600[0] = var1;
				super.field1597[0] = var2;
				super.field1598[0] = class394.field3317;
				return;
			}
		}

		super.field1573 = 0;
		super.field1589 = 0;
		super.field1599 = 0;
		super.field1600[0] = var1;
		super.field1597[0] = var2;
		super.field1555 = super.field1529 * 64 + 128 * super.field1600[0];
		super.field1526 = super.field1597[0] * 128 + super.field1529 * 64;
	}

	protected final class250 method2393() {
		if (this.field1018 == null) {
			return null;
		} else {
			class393 var2 = super.field1570 != -1 && super.field1587 == 0 ? class114.method702(super.field1570) : null;
			class393 var3 = super.field1538 != -1 && (super.field1531 != super.field1538 || var2 == null) ? class114.method702(super.field1538) : null;
			class250 var4 = null;
			if (this.field1022 != null && this.field1022.field3936) {
				var4 = class82.field863.field2523.method1962(var2, super.field1571, var3, super.field1525);
			} else {
				var4 = this.field1018.method1999(var2, super.field1571, var3, super.field1525, this.field1022);
			}

			if (null == var4) {
				return null;
			} else {
				var4.method1452();
				super.field1585 = var4.field4080;
				int var5 = var4.field2271;
				var4 = this.method904(var4);
				if (this.field1018.field3150 == 1) {
					var4.field2272 = true;
				}

				if (super.field1578 != 0 && Client.field306 >= super.field1586 && Client.field306 < super.field1528) {
					var4.field2327 = super.field1588;
					var4.field2297 = super.field1546;
					var4.field2295 = super.field1540;
					var4.field2333 = super.field1578;
					var4.field2334 = (short)var5;
				} else {
					var4.field2333 = 0;
				}

				return var4;
			}
		}
	}

	final boolean method899() {
		return null != this.field1018;
	}

	int[] method661() {
		return null != this.field1020 ? this.field1020.method879() : this.field1018.method2004();
	}

	short[] method668() {
		return this.field1020 != null ? this.field1020.method880() : this.field1018.method2006();
	}

	void method671(int var1, int var2, short var3) {
		if (this.field1020 == null) {
			this.field1020 = new class153(this.field1018);
		}

		this.field1020.method881(var1, var2, var3);
	}

	void method662(int[] var1, short[] var2) {
		if (null == this.field1020) {
			this.field1020 = new class153(this.field1018);
		}

		this.field1020.method882(var1, var2);
	}

	void method663() {
		this.field1020 = null;
	}

	void method669(class447 var1) {
		this.field1023 = var1;
	}

	class447 method665() {
		return this.field1023;
	}

	void method666(class447 var1) {
		this.field1022 = var1;
	}

	void method664() {
		this.field1023 = null;
	}

	void method667() {
		this.field1022 = null;
	}

	public static int method672(int var0, int var1) {
		int var3;
		for (var3 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var3 *= var0;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var3;
		} else {
			return var3;
		}
	}

	static void method670(class309 var0, int var1, int var2) {
		Object[] var4 = var0.field2794;
		class167 var5;
		if (class232.method1335(var0.field2798)) {
			class35.field498 = (class113)var4[0];
			class96 var6 = class158.method892(class35.field498.field1067);
			var5 = class410.method2112(var0.field2798, var6.field964, var6.field978);
		} else {
			int var7 = (Integer)var4[0];
			var5 = class463.method2271(var7);
		}

		if (var5 != null) {
			class39.method254(var0, var5, var1, var2);
		}

	}

	public static void method673(int var0, int var1, int var2, boolean var3) {
		class160 var5 = class85.method556(class129.field1203, Client.field68.field2426);
		var5.field1483.method340(var2);
		var5.field1483.method308(var1);
		var5.field1483.method316(var3 ? Client.field103 : 0);
		var5.field1483.method330(var0);
		Client.field68.method1570(var5);
	}
}
