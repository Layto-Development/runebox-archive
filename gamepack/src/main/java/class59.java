public class class59 implements class405 {
	int field618;
	int field619;
	int field620;
	int field621;
	int field622;
	int field623;
	int field624;
	int field625;
	int field626;
	int field627;
	int field628;
	int field629;
	int field630;
	int field631;

	class59() {
	}

	public void method2098(class8 var1) {
		if (var1.field341 > this.field622) {
			var1.field341 = this.field622;
		}

		if (var1.field335 < this.field622) {
			var1.field335 = this.field622;
		}

		if (var1.field343 > this.field630) {
			var1.field343 = this.field630;
		}

		if (var1.field337 < this.field630) {
			var1.field337 = this.field630;
		}

	}

	public boolean method2093(int var1, int var2, int var3) {
		if (var1 >= this.field618 && var1 < this.field620 + this.field618) {
			return var2 >= (this.field624 << 6) + (this.field619 << 3) && var2 <= (this.field626 << 3) + (this.field624 << 6) + 7 && var3 >= (this.field625 << 3) + (this.field628 << 6) && var3 <= (this.field628 << 6) + (this.field627 << 3) + 7;
		} else {
			return false;
		}
	}

	public boolean method2094(int var1, int var2) {
		return var1 >= (this.field623 << 3) + (this.field622 << 6) && var1 <= 7 + (this.field622 << 6) + (this.field621 << 3) && var2 >= (this.field629 << 3) + (this.field630 << 6) && var2 <= (this.field630 << 6) + (this.field631 << 3) + 7;
	}

	public int[] method2096(int var1, int var2, int var3) {
		if (!this.method2093(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field623 * 8 - this.field619 * 8 + this.field622 * 64 - this.field624 * 64 + var2, var3 + (this.field630 * 64 - this.field628 * 64) + (this.field629 * 8 - this.field625 * 8)};
			return var5;
		}
	}

	public class29 method2097(int var1, int var2) {
		if (!this.method2094(var1, var2)) {
			return null;
		} else {
			int var4 = this.field624 * 64 - this.field622 * 64 + var1 + (this.field619 * 8 - this.field623 * 8);
			int var5 = this.field628 * 64 - this.field630 * 64 + var2 + (this.field625 * 8 - this.field629 * 8);
			return new class29(this.field618, var4, var5);
		}
	}

	public void method2095(class42 var1) {
		this.field618 = var1.method278();
		this.field620 = var1.method278();
		this.field624 = var1.method327();
		this.field619 = var1.method278();
		this.field626 = var1.method278();
		this.field628 = var1.method327();
		this.field625 = var1.method278();
		this.field627 = var1.method278();
		this.field622 = var1.method327();
		this.field623 = var1.method278();
		this.field621 = var1.method278();
		this.field630 = var1.method327();
		this.field629 = var1.method278();
		this.field631 = var1.method278();
		this.method434();
	}

	void method434() {
	}

	public static class144[] method430() {
		return new class144[]{class144.field1377, class144.field1370, class144.field1372, class144.field1373, class144.field1381, class144.field1375, class144.field1371, class144.field1378, class144.field1376, class144.field1379, class144.field1380, class144.field1374};
	}
}
