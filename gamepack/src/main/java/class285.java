public class class285 extends class7 {

	final boolean field2298;

	public class285(boolean var1) {
		this.field2298 = var1;
	}

	int method1556(class150 var1, class150 var2) {
		if (var1.field1577 != 0 && var2.field1577 != 0) {
			return this.field2298 ? var1.field1576 - var2.field1576 : var2.field1576 - var1.field1576;
		} else {
			return this.method19(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1556((class150) var1, (class150) var2);
	}
}
