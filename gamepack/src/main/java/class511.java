public class class511 extends class7 {

	static int field4085;

	final boolean field4084;

	public class511(boolean var1) {
		this.field4084 = var1;
	}

	int method2459(class150 var1, class150 var2) {
		if (var1.field1577 == Client.field898 && var2.field1577 == Client.field898) {
			return this.field4084 ? var1.field1576 - var2.field1576 : var2.field1576 - var1.field1576;
		} else {
			return this.method19(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2459((class150) var1, (class150) var2);
	}
}
