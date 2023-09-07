public class class394 extends class7 {

	final boolean field3128;

	public class394(boolean var1) {
		this.field3128 = var1;
	}

	int method2034(class150 var1, class150 var2) {
		if (Client.field898 == var1.field1577 && var2.field1577 == Client.field898) {
			return this.field3128 ? var1.method1195().method321(var2.method1195()) : var2.method1195().method321(var1.method1195());
		} else {
			return this.method19(var1, var2);
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2034((class150) var1, (class150) var2);
	}

	public static void method2035() {
		class362.field2870.method645();
		class362.field2897.method645();
		class362.field2873.method645();
		class362.field2891.method645();
	}
}
