public class class160 implements class254 {

	int field1631;

	int field1632;

	int field1633;

	int field1634;

	int field1635;

	int field1636;

	int field1637;

	int field1638;

	int field1639;

	int field1640;

	class160() {
	}

	@Override
	public void method1451(class277 var1) {
		if (var1.field2261 > this.field1638) {
			var1.field2261 = this.field1638;
		}
		if (var1.field2255 < this.field1639) {
			var1.field2255 = this.field1639;
		}
		if (var1.field2263 > this.field1632) {
			var1.field2263 = this.field1632;
		}
		if (var1.field2257 < this.field1631) {
			var1.field2257 = this.field1631;
		}
	}

	@Override
	public boolean method1446(int var1, int var2, int var3) {
		if (var1 >= this.field1637 && var1 < this.field1637 + this.field1640) {
			return var2 >> 6 >= this.field1633 && var2 >> 6 <= this.field1635 && var3 >> 6 >= this.field1634 && var3 >> 6 <= this.field1636;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1447(int var1, int var2) {
		return var1 >> 6 >= this.field1638 && var1 >> 6 <= this.field1639 && var2 >> 6 >= this.field1632 && var2 >> 6 <= this.field1631;
	}

	@Override
	public int[] method1449(int var1, int var2, int var3) {
		if (!this.method1446(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[] { this.field1638 * 64 - this.field1633 * 64 + var2, this.field1632 * 64 - this.field1634 * 64 + var3 };
			return var5;
		}
	}

	@Override
	public class402 method1450(int var1, int var2) {
		if (!this.method1447(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field1633 * 64 - this.field1638 * 64);
			int var5 = var2 + (this.field1634 * 64 - this.field1632 * 64);
			return new class402(this.field1637, var4, var5);
		}
	}

	@Override
	public void method1448(class187 var1) {
		this.field1637 = var1.method1096();
		this.field1640 = var1.method1096();
		this.field1633 = var1.method1145();
		this.field1634 = var1.method1145();
		this.field1635 = var1.method1145();
		this.field1636 = var1.method1145();
		this.field1638 = var1.method1145();
		this.field1632 = var1.method1145();
		this.field1639 = var1.method1145();
		this.field1631 = var1.method1145();
		this.method936();
	}

	void method936() {
	}

	static final void method938() {
		Client.field1106 = Client.field900;
		class130.field1474 = true;
	}
}
