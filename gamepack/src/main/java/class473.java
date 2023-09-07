import java.util.Comparator;

final class class473 implements Comparator {

	int method2301(class342 var1, class342 var2) {
		return var1.field2599 < var2.field2599 ? -1 : var1.field2599 == var2.field2599 ? 0 : 1;
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2301((class342) var1, (class342) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
