public class class175 extends class150 {

	boolean field1753;

	boolean field1754;

	class175() {
	}

	int method1047(class175 var1) {
		if (super.field1577 == Client.field898 && var1.field1577 != Client.field898) {
			return -1;
		} else if (var1.field1577 == Client.field898 && Client.field898 != super.field1577) {
			return 1;
		} else if (super.field1577 != 0 && var1.field1577 == 0) {
			return -1;
		} else if (var1.field1577 != 0 && super.field1577 == 0) {
			return 1;
		} else if (this.field1753 && !var1.field1753) {
			return -1;
		} else if (!this.field1753 && var1.field1753) {
			return 1;
		} else if (this.field1754 && !var1.field1754) {
			return -1;
		} else if (!this.field1754 && var1.field1754) {
			return 1;
		} else {
			return super.field1577 != 0 ? super.field1576 - var1.field1576 : var1.field1576 - super.field1576;
		}
	}

	@Override
	public int method1199(class194 var1) {
		return this.method1047((class175) var1);
	}

	@Override
	public int compareTo(Object var1) {
		return this.method1047((class175) var1);
	}
}
