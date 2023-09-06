import java.util.Comparator;

public class class204 implements Comparator {
	final boolean field1908;

	public class204(boolean var1) {
		this.field1908 = var1;
	}

	int method1151(class71 var1, class71 var2) {
		return this.field1908 ? var1.method512(var2) : var2.method512(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method1151((class71)var1, (class71)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
