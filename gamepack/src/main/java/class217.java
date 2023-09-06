public abstract class class217 {
	int field2027;
	int field2028;
	public final class29 field2025;
	public final class29 field2026;

	class217(class29 var1, class29 var2) {
		this.field2026 = var1;
		this.field2025 = var2;
	}

	abstract class197 method1250();

	abstract int method1245();

	abstract int method1251();

	public abstract int method1244();

	boolean method1243(int var1, int var2) {
		if (this.method1247(var1, var2)) {
			return true;
		} else {
			return this.method1248(var1, var2);
		}
	}

	boolean method1246() {
		return this.method1244() >= 0;
	}

	boolean method1247(int var1, int var2) {
		if (!this.method1246()) {
			return false;
		} else {
			class96 var4 = class158.method892(this.method1244());
			int var5 = this.method1251();
			int var6 = this.method1245();
			switch(var4.field981.field2091) {
			case 0:
				if (var1 <= this.field2027 - var5 || var1 > this.field2027) {
					return false;
				}
				break;
			case 1:
				if (var1 < this.field2027 || var1 >= var5 + this.field2027) {
					return false;
				}
				break;
			case 2:
				if (var1 < this.field2027 - var5 / 2 || var1 > var5 / 2 + this.field2027) {
					return false;
				}
			}

			switch(var4.field976.field2924) {
			case 0:
				if (var2 < this.field2028 - var6 / 2 || var2 > var6 / 2 + this.field2028) {
					return false;
				}
				break;
			case 1:
				if (var2 > this.field2028 - var6 && var2 <= this.field2028) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.field2028 || var2 >= this.field2028 + var6) {
					return false;
				}
			}

			return true;
		}
	}

	boolean method1248(int var1, int var2) {
		class197 var4 = this.method1250();
		if (null == var4) {
			return false;
		} else if (var1 >= this.field2027 - var4.field1800 / 2 && var1 <= var4.field1800 / 2 + this.field2027) {
			return var2 >= this.field2028 && var2 <= var4.field1798 + this.field2028;
		} else {
			return false;
		}
	}

	static final float method1249(int var0) {
		float var2 = 10075.0F - (float)var0;
		return (var2 * 1.0075567F - 75.56675F) / var2;
	}
}
