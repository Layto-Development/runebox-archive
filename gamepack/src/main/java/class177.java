public class class177 extends class7 {

	final boolean field1756;

	public class177(boolean var1) {
		this.field1756 = var1;
	}

	int method1049(class150 var1, class150 var2) {
		if (var2.field1578 != var1.field1578) {
			return this.field1756 ? var1.field1578 - var2.field1578 : var2.field1578 - var1.field1578;
		} else {
			return this.method19(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1049((class150) var1, (class150) var2);
	}
}
