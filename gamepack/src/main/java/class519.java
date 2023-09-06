import java.util.Comparator;

class class519 implements Comparator {
	static class215 field4225;
	// $FF: synthetic field
	final class407 this$0;

	class519(class407 var1) {
		this.this$0 = var1;
	}

	int method2527(class142 var1, class142 var2) {
		if (var1.field1365 > var2.field1365) {
			return 1;
		} else {
			return var1.field1365 < var2.field1365 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2527((class142)var1, (class142)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
