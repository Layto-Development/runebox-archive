public class class169 {
	static class115 field1646;
	public int field1642;
	public int field1643;
	public int field1644;
	public int field1645;

	public class169(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public class169(int var1, int var2, int var3, int var4) {
		this.method931(var1, var2);
		this.method932(var3, var4);
	}

	public void method931(int var1, int var2) {
		this.field1645 = var1;
		this.field1643 = var2;
	}

	public void method932(int var1, int var2) {
		this.field1644 = var1;
		this.field1642 = var2;
	}

	public boolean method933(int var1, int var2, byte var3) {
		boolean var10000;
		if (var1 >= this.field1645 && var1 < this.field1644 + this.field1645) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			if (var2 >= this.field1643) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				if (var2 < this.field1643 + this.field1642) {
					var10000 = true;
					return var10000;
				}
			}
		}

		var10000 = false;
		return var10000;
	}

	public String toString() {
		return null;
	}

	public void method934(class169 var1, class169 var2) {
		this.method935(var1, var2);
		this.method936(var1, var2);
	}

	void method935(class169 var1, class169 var2) {
		var2.field1645 = this.field1645;
		var2.field1644 = this.field1644;
		if (this.field1645 < var1.field1645) {
			var2.field1644 = (var2.field1644 * 2133643001 - (var1.field1645 * 2133643001 - this.field1645 * 2133643001)) * -2074045623;
			var2.field1645 = var1.field1645;
		}

		if (var2.method937() > var1.method937()) {
			var2.field1644 -= var2.method937() - var1.method937();
		}

		if (var2.field1644 < 0) {
			var2.field1644 = 0;
		}

	}

	void method936(class169 var1, class169 var2) {
		var2.field1643 = this.field1643;
		var2.field1642 = this.field1642;
		if (this.field1643 < var1.field1643) {
			var2.field1642 = (var2.field1642 * -584535177 - (var1.field1643 * -584535177 - this.field1643 * -584535177)) * 377886279;
			var2.field1643 = var1.field1643;
		}

		if (var2.method939() > var1.method939()) {
			var2.field1642 -= var2.method939() - var1.method939();
		}

		if (var2.field1642 < 0) {
			var2.field1642 = 0;
		}

	}

	int method937() {
		return this.field1644 + this.field1645;
	}

	int method939() {
		return this.field1643 + this.field1642;
	}

	static final boolean method938(class60 var0) {
		int var2 = var0.field670;
		if (var2 == 205) {
			Client.field56 = 250;
			return true;
		} else {
			int var3;
			int var4;
			if (var2 >= 300 && var2 <= 313) {
				var3 = (var2 - 300) / 2;
				var4 = var2 & 1;
				Client.field289.method1953(var3, var4 == 1);
			}

			if (var2 >= 314 && var2 <= 323) {
				var3 = (var2 - 314) / 2;
				var4 = var2 & 1;
				Client.field289.method1954(var3, var4 == 1);
			}

			if (var2 == 324) {
				Client.field289.method1961(0);
			}

			if (var2 == 325) {
				Client.field289.method1961(1);
			}

			if (var2 == 326) {
				class160 var5 = class85.method556(class129.field1237, Client.field68.field2426);
				Client.field289.method1955(var5.field1483);
				Client.field68.method1570(var5);
				return true;
			} else {
				return false;
			}
		}
	}
}
