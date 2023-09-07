import java.util.Comparator;

final class class386 implements Comparator {

	int method2012(class342 var1, class342 var2) {
		return var1.field2601 < var2.field2601 ? -1 : var2.field2601 == var1.field2601 ? 0 : 1;
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2012((class342) var1, (class342) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
