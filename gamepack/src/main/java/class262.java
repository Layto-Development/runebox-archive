import java.util.Comparator;

public class class262 implements Comparator {

	static int field2168;

	final boolean field2169;

	public class262(boolean var1) {
		this.field2169 = var1;
	}

	int method1461(class150 var1, class150 var2) {
		return this.field2169 ? var1.field1576 - var2.field1576 : var2.field1576 - var1.field1576;
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1461((class150) var1, (class150) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
