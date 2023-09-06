public abstract class class192 {
	static int field1776;
	double field1772;
	int field1773;
	int field1774;
	int field1775;

	class192(int var1, int var2) {
		this.field1775 = 0;
		this.field1773 = 0;
		this.field1772 = 0.0D;
		this.field1774 = 0;
		this.field1775 = var1;
		this.field1773 = 0;
		this.field1774 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field1772 = class273.method1589(this.field1773, this.field1775, this.field1774);
	}

	public void method1048() {
		if (this.field1773 < this.field1775) {
			++this.field1773;
			this.field1772 = class273.method1589(this.field1773, this.field1775, this.field1774);
		}

	}

	double method1047() {
		return this.field1772;
	}
}
