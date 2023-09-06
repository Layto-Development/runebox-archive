import java.util.Comparator;

final class class33 implements Comparator {
	int method226(class478 var1, class478 var2) {
		return var1.field4064.field4233 < var2.field4064.field4233 ? -1 : (var1.field4064.field4233 == var2.field4064.field4233 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method226((class478)var1, (class478)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
