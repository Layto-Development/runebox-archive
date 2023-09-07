public class class464 implements class254 {

	int field3551;

	int field3552;

	int field3553;

	int field3554;

	int field3555;

	int field3556;

	int field3557;

	int field3558;

	int field3559;

	int field3560;

	int field3561;

	int field3562;

	int field3563;

	int field3564;

	class464() {
	}

	@Override
	public void method1451(class277 var1) {
		if (var1.field2261 > this.field3555) {
			var1.field2261 = this.field3555;
		}
		if (var1.field2255 < this.field3555) {
			var1.field2255 = this.field3555;
		}
		if (var1.field2263 > this.field3563) {
			var1.field2263 = this.field3563;
		}
		if (var1.field2257 < this.field3563) {
			var1.field2257 = this.field3563;
		}
	}

	@Override
	public boolean method1446(int var1, int var2, int var3) {
		if (var1 >= this.field3551 && var1 < this.field3553 + this.field3551) {
			return var2 >= (this.field3557 << 6) + (this.field3552 << 3) && var2 <= (this.field3559 << 3) + (this.field3557 << 6) + 7 && var3 >= (this.field3558 << 3) + (this.field3561 << 6) && var3 <= (this.field3561 << 6) + (this.field3560 << 3) + 7;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1447(int var1, int var2) {
		return var1 >= (this.field3556 << 3) + (this.field3555 << 6) && var1 <= 7 + (this.field3555 << 6) + (this.field3554 << 3) && var2 >= (this.field3562 << 3) + (this.field3563 << 6) && var2 <= (this.field3563 << 6) + (this.field3564 << 3) + 7;
	}

	@Override
	public int[] method1449(int var1, int var2, int var3) {
		if (!this.method1446(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[] { this.field3556 * 8 - this.field3552 * 8 + this.field3555 * 64 - this.field3557 * 64 + var2, var3 + (this.field3563 * 64 - this.field3561 * 64) + (this.field3562 * 8 - this.field3558 * 8) };
			return var5;
		}
	}

	@Override
	public class402 method1450(int var1, int var2) {
		if (!this.method1447(var1, var2)) {
			return null;
		} else {
			int var4 = this.field3557 * 64 - this.field3555 * 64 + var1 + (this.field3552 * 8 - this.field3556 * 8);
			int var5 = this.field3561 * 64 - this.field3563 * 64 + var2 + (this.field3558 * 8 - this.field3562 * 8);
			return new class402(this.field3551, var4, var5);
		}
	}

	@Override
	public void method1448(class187 var1) {
		this.field3551 = var1.method1096();
		this.field3553 = var1.method1096();
		this.field3557 = var1.method1145();
		this.field3552 = var1.method1096();
		this.field3559 = var1.method1096();
		this.field3561 = var1.method1145();
		this.field3558 = var1.method1096();
		this.field3560 = var1.method1096();
		this.field3555 = var1.method1145();
		this.field3556 = var1.method1096();
		this.field3554 = var1.method1096();
		this.field3563 = var1.method1145();
		this.field3562 = var1.method1096();
		this.field3564 = var1.method1096();
		this.method2287();
	}

	void method2287() {
	}
}
