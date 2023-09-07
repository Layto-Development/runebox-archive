public class class202 extends class7 {

	static class214 field1891;

	final boolean field1890;

	public class202(boolean var1) {
		this.field1890 = var1;
	}

	int method1218(class150 var1, class150 var2) {
		if (var1.field1577 != 0 && var2.field1577 != 0) {
			return this.field1890 ? var1.method1195().method321(var2.method1195()) : var2.method1195().method321(var1.method1195());
		} else {
			return this.method19(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1218((class150) var1, (class150) var2);
	}
}
