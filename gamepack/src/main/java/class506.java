public class class506 {
	static int field4180;
	class246 field4177;
	int field4178;
	int field4179;

	class506(class246 var1, int var2, int var3) {
		this.field4178 = 0;
		this.field4179 = 0;
		this.field4177 = var1;
		this.field4178 = var2;
		this.field4179 = var3;
	}

	public String method2432() {
		if (this.method2433()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method2434());

			for (int var3 = this.field4178; var3 < this.field4179; ++var3) {
				class472 var4 = this.field4177.method1415(var3);
				var2.append(var4.field4025);
			}

			return var2.toString();
		}
	}

	boolean method2439(int var1) {
		return this.field4177.method1418() == 2 || this.field4177.method1418() == 1 && (!this.field4177.field2232 || var1 != this.field4179 - 1);
	}

	public boolean method2433() {
		return this.field4178 == this.field4179;
	}

	public int method2434() {
		return this.field4179 - this.field4178;
	}

	boolean method2435(class472 var1) {
		if (this.field4177.field2234 == 2) {
			return true;
		} else if (this.field4177.field2234 == 0) {
			return false;
		} else {
			return this.field4177.method1397() != var1;
		}
	}

	int method2437() {
		if (this.method2433()) {
			return 0;
		} else {
			class472 var2 = this.field4177.method1415(this.field4179 - 1);
			if (var2.field4025 == '\n') {
				return 0;
			} else if (this.method2435(var2)) {
				return this.field4177.field2231.field2069[42];
			} else {
				int var3 = this.field4177.field2231.field2069[var2.field4025];
				if (var3 == 0) {
					return var2.field4025 == '\t' ? 3 * this.field4177.field2231.field2069[32] : this.field4177.field2231.field2069[32];
				} else {
					return var3;
				}
			}
		}
	}

	public class180 method2438() {
		if (this.method2433()) {
			return new class180(0, 0);
		} else {
			class472 var2 = this.field4177.method1415(this.field4179 - 1);
			return new class180(var2.field4024 + this.method2437(), var2.field4027);
		}
	}

	public class472 method2436(int var1) {
		return var1 >= 0 && var1 < this.method2434() ? this.field4177.method1415(this.field4178 + var1) : null;
	}

	static boolean method2440(int var0) {
		for (int var2 = 0; var2 < Client.field243; ++var2) {
			if (Client.field245[var2] == var0) {
				return true;
			}
		}

		return false;
	}
}
