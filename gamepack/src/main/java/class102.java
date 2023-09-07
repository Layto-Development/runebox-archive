public class class102 extends class7 {

	final boolean field1274;

	public class102(boolean var1) {
		this.field1274 = var1;
	}

	int method636(class150 var1, class150 var2) {
		if (var1.field1577 != var2.field1577) {
			return this.field1274 ? var1.field1577 - var2.field1577 : var2.field1577 - var1.field1577;
		} else {
			return this.method19(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method636((class150) var1, (class150) var2);
	}
}
