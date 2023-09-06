import java.util.Comparator;

final class class171 implements Comparator {
	int method941(class478 var1, class478 var2) {
		return var1.field4066 < var2.field4066 ? -1 : (var1.field4066 == var2.field4066 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method941((class478)var1, (class478)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
