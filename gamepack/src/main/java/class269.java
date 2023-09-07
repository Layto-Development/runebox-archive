import java.util.Comparator;

public class class269 implements Comparator {

	final boolean field2210;

	public class269(boolean var1) {
		this.field2210 = var1;
	}

	int method1512(class194 var1, class194 var2) {
		return this.field2210 ? var1.method1199(var2) : var2.method1199(var1);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1512((class194) var1, (class194) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
