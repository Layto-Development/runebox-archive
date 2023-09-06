import java.util.Comparator;

public class class3 implements Comparator {
	static class215 field314;
	final boolean field313;

	public class3(boolean var1) {
		this.field313 = var1;
	}

	int method44(class71 var1, class71 var2) {
		return this.field313 ? var1.method508().method2213(var2.method508()) : var2.method508().method2213(var1.method508());
	}

	public int compare(Object var1, Object var2) {
		return this.method44((class71)var1, (class71)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
