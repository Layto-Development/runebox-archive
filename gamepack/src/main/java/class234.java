public abstract class class234 {

	int field2025;

	int field2026;

	public final class402 field2023;

	public final class402 field2024;

	class234(class402 var1, class402 var2) {
		this.field2024 = var1;
		this.field2023 = var2;
	}

	abstract class245 method1376();

	abstract int method1372();

	abstract int method1377();

	public abstract int method1371();

	boolean method1370(int var1, int var2) {
		if (this.method1374(var1, var2)) {
			return true;
		} else {
			return this.method1375(var1, var2);
		}
	}

	boolean method1373() {
		return this.method1371() >= 0;
	}

	boolean method1374(int var1, int var2) {
		if (!this.method1373()) {
			return false;
		} else {
			class319 var4 = class319.method1706(this.method1371());
			int var5 = this.method1377();
			int var6 = this.method1372();
			switch(var4.field2505.field1661) {
				case 0:
					if (var1 <= this.field2025 - var5 || var1 > this.field2025) {
						return false;
					}
					break;
				case 1:
					if (var1 < this.field2025 || var1 >= var5 + this.field2025) {
						return false;
					}
					break;
				case 2:
					if (var1 < this.field2025 - var5 / 2 || var1 > var5 / 2 + this.field2025) {
						return false;
					}
			}
			switch(var4.field2500.field1535) {
				case 0:
					if (var2 < this.field2026 - var6 / 2 || var2 > var6 / 2 + this.field2026) {
						return false;
					}
					break;
				case 1:
					if (var2 > this.field2026 - var6 && var2 <= this.field2026) {
						break;
					}
					return false;
				case 2:
					if (var2 < this.field2026 || var2 >= this.field2026 + var6) {
						return false;
					}
			}
			return true;
		}
	}

	boolean method1375(int var1, int var2) {
		class245 var4 = this.method1376();
		if (null == var4) {
			return false;
		} else if (var1 >= this.field2025 - var4.field2087 / 2 && var1 <= var4.field2087 / 2 + this.field2025) {
			return var2 >= this.field2026 && var2 <= var4.field2085 + this.field2026;
		} else {
			return false;
		}
	}
}
