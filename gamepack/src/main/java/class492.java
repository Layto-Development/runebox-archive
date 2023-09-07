import java.util.Comparator;

final class class492 implements Comparator {

	int method2356(class342 var1, class342 var2) {
		return var1.field2597.field4098 < var2.field2597.field4098 ? -1 : var1.field2597.field4098 == var2.field2597.field4098 ? 0 : 1;
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2356((class342) var1, (class342) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
