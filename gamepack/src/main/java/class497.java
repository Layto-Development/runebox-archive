import java.util.Comparator;

public class class497 implements Comparator {

	static class338 field3994;

	final boolean field3993;

	public class497(boolean var1) {
		this.field3993 = var1;
	}

	int method2377(class194 var1, class194 var2) {
		return this.field3993 ? var1.method1195().method321(var2.method1195()) : var2.method1195().method321(var1.method1195());
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method2377((class194) var1, (class194) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
