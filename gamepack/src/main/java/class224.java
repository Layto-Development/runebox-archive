public class class224 extends class7 {

	final boolean field1985;

	public class224(boolean var1) {
		this.field1985 = var1;
	}

	int method1360(class150 var1, class150 var2) {
		if (var1.field1577 == Client.field898) {
			if (Client.field898 != var2.field1577) {
				return this.field1985 ? -1 : 1;
			}
		} else if (Client.field898 == var2.field1577) {
			return this.field1985 ? 1 : -1;
		}
		return this.method19(var1, var2);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1360((class150) var1, (class150) var2);
	}
}
