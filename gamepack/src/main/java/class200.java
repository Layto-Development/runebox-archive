public class class200 {

	static int field1885;

	class268 field1882;

	int field1883;

	int field1884;

	class200(class268 var1, int var2, int var3) {
		this.field1883 = 0;
		this.field1884 = 0;
		this.field1882 = var1;
		this.field1883 = var2;
		this.field1884 = var3;
	}

	public String method1210() {
		if (this.method1211()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method1212());
			for (int var3 = this.field1883; var3 < this.field1884; ++var3) {
				class201 var4 = this.field1882.method1489(var3);
				var2.append(var4.field1887);
			}
			return var2.toString();
		}
	}

	boolean method1217(int var1) {
		return this.field1882.method1492() == 2 || this.field1882.method1492() == 1 && (!this.field1882.field2207 || var1 != this.field1884 - 1);
	}

	public boolean method1211() {
		return this.field1883 == this.field1884;
	}

	public int method1212() {
		return this.field1884 - this.field1883;
	}

	boolean method1213(class201 var1) {
		if (this.field1882.field2209 == 2) {
			return true;
		} else if (this.field1882.field2209 == 0) {
			return false;
		} else {
			return this.field1882.method1471() != var1;
		}
	}

	int method1215() {
		if (this.method1211()) {
			return 0;
		} else {
			class201 var2 = this.field1882.method1489(this.field1884 - 1);
			if (var2.field1887 == '\n') {
				return 0;
			} else if (this.method1213(var2)) {
				return this.field1882.field2206.field4008[42];
			} else {
				int var3 = this.field1882.field2206.field4008[var2.field1887];
				if (var3 == 0) {
					return var2.field1887 == '\t' ? 3 * this.field1882.field2206.field4008[32] : this.field1882.field2206.field4008[32];
				} else {
					return var3;
				}
			}
		}
	}

	public class59 method1216() {
		if (this.method1211()) {
			return new class59(0, 0);
		} else {
			class201 var2 = this.field1882.method1489(this.field1884 - 1);
			return new class59(var2.field1886 + this.method1215(), var2.field1889);
		}
	}

	public class201 method1214(int var1) {
		return var1 >= 0 && var1 < this.method1212() ? this.field1882.method1489(this.field1883 + var1) : null;
	}
}
