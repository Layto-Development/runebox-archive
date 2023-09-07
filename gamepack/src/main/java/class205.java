public class class205 implements class254 {

	int field1897;

	int field1898;

	int field1899;

	int field1900;

	int field1901;

	int field1902;

	class205() {
	}

	@Override
	public void method1451(class277 var1) {
		if (var1.field2261 > this.field1902) {
			var1.field2261 = this.field1902;
		}
		if (var1.field2255 < this.field1902) {
			var1.field2255 = this.field1902;
		}
		if (var1.field2263 > this.field1897) {
			var1.field2263 = this.field1897;
		}
		if (var1.field2257 < this.field1897) {
			var1.field2257 = this.field1897;
		}
	}

	@Override
	public boolean method1446(int var1, int var2, int var3) {
		if (var1 >= this.field1899 && var1 < this.field1899 + this.field1901) {
			return this.field1898 == var2 >> 6 && this.field1900 == var3 >> 6;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1447(int var1, int var2) {
		return var1 >> 6 == this.field1902 && var2 >> 6 == this.field1897;
	}

	@Override
	public int[] method1449(int var1, int var2, int var3) {
		if (!this.method1446(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[] { this.field1902 * 64 - this.field1898 * 64 + var2, var3 + (this.field1897 * 64 - this.field1900 * 64) };
			return var5;
		}
	}

	@Override
	public class402 method1450(int var1, int var2) {
		if (!this.method1447(var1, var2)) {
			return null;
		} else {
			int var4 = this.field1898 * 64 - this.field1902 * 64 + var1;
			int var5 = this.field1900 * 64 - this.field1897 * 64 + var2;
			return new class402(this.field1899, var4, var5);
		}
	}

	@Override
	public void method1448(class187 var1) {
		this.field1899 = var1.method1096();
		this.field1901 = var1.method1096();
		this.field1898 = var1.method1145();
		this.field1900 = var1.method1145();
		this.field1902 = var1.method1145();
		this.field1897 = var1.method1145();
		this.method1226();
	}

	void method1226() {
	}
}
