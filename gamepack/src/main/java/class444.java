public class class444 implements class254 {

	int field3447;

	int field3448;

	int field3449;

	int field3450;

	int field3451;

	int field3452;

	int field3453;

	int field3454;

	int field3455;

	int field3456;

	class444() {
	}

	@Override
	public void method1451(class277 var1) {
		if (var1.field2261 > this.field3451) {
			var1.field2261 = this.field3451;
		}
		if (var1.field2255 < this.field3451) {
			var1.field2255 = this.field3451;
		}
		if (var1.field2263 > this.field3452) {
			var1.field2263 = this.field3452;
		}
		if (var1.field2257 < this.field3452) {
			var1.field2257 = this.field3452;
		}
	}

	@Override
	public boolean method1446(int var1, int var2, int var3) {
		if (var1 >= this.field3454 && var1 < this.field3454 + this.field3447) {
			return var2 >= (this.field3449 << 3) + (this.field3456 << 6) && var2 <= (this.field3456 << 6) + (this.field3449 << 3) + 7 && var3 >= (this.field3450 << 6) + (this.field3453 << 3) && var3 <= (this.field3450 << 6) + (this.field3453 << 3) + 7;
		} else {
			return false;
		}
	}

	@Override
	public boolean method1447(int var1, int var2) {
		return var1 >= (this.field3451 << 6) + (this.field3448 << 3) && var1 <= (this.field3448 << 3) + (this.field3451 << 6) + 7 && var2 >= (this.field3452 << 6) + (this.field3455 << 3) && var2 <= (this.field3455 << 3) + (this.field3452 << 6) + 7;
	}

	@Override
	public int[] method1449(int var1, int var2, int var3) {
		if (!this.method1446(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[] { var2 + (this.field3451 * 64 - this.field3456 * 64) + (this.field3448 * 8 - this.field3449 * 8), this.field3455 * 8 - this.field3453 * 8 + this.field3452 * 64 - this.field3450 * 64 + var3 };
			return var5;
		}
	}

	@Override
	public class402 method1450(int var1, int var2) {
		if (!this.method1447(var1, var2)) {
			return null;
		} else {
			int var4 = this.field3456 * 64 - this.field3451 * 64 + var1 + (this.field3449 * 8 - this.field3448 * 8);
			int var5 = this.field3453 * 8 - this.field3455 * 8 + var2 + (this.field3450 * 64 - this.field3452 * 64);
			return new class402(this.field3454, var4, var5);
		}
	}

	@Override
	public void method1448(class187 var1) {
		this.field3454 = var1.method1096();
		this.field3447 = var1.method1096();
		this.field3456 = var1.method1145();
		this.field3449 = var1.method1096();
		this.field3450 = var1.method1145();
		this.field3453 = var1.method1096();
		this.field3451 = var1.method1145();
		this.field3448 = var1.method1096();
		this.field3452 = var1.method1145();
		this.field3455 = var1.method1096();
		this.method2197();
	}

	void method2197() {
	}
}
