import java.util.Comparator;

public class class466 implements Comparator {
	static Client field3999;
	static class25 field4000;

	class466() {
	}

	int method2280(class61 var1, class61 var2) {
		return var1.method474() - var2.method474();
	}

	public int compare(Object var1, Object var2) {
		return this.method2280((class61)var1, (class61)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static class25[] method2281(class215 var0, String var1, String var2) {
		if (!var0.method1234(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method1237(var1);
			int var5 = var0.method1229(var4, var2);
			return class15.method124(var0, var4, var5);
		}
	}

	public static void method2282() {
		class101.field1012.method1887();
	}
}
