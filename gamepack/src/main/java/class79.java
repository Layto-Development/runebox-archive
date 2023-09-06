public final class class79 {
	public static final char[] field841;
	static class342 field843;
	static long[] field842;

	static {
		field841 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field842 = new long[12];

		for (int var0 = 0; var0 < field842.length; ++var0) {
			field842[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	class79() throws Throwable {
	}

	static void method536() {
		for (class154 var1 = (class154)class154.field1438.method563(); var1 != null; var1 = (class154)class154.field1438.method565()) {
			if (null != var1.field1447) {
				class539.field4277.method2040(var1.field1447);
				var1.field1447 = null;
			}

			if (var1.field1443 != null) {
				class539.field4277.method2040(var1.field1443);
				var1.field1443 = null;
			}
		}

		class154.field1438.method559();
	}
}
