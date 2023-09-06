import java.awt.datatransfer.Clipboard;
import java.util.Comparator;

final class class355 implements Comparator {
	int method1936(class478 var1, class478 var2) {
		return var1.field4064.field4231 < var2.field4064.field4231 ? -1 : (var1.field4064.field4231 == var2.field4064.field4231 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method1936((class478)var1, (class478)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static void method1937() {
		class493.field4136 = new class55();
	}

	public static Clipboard method1938() {
		return class466.field3999.method946();
	}
}
