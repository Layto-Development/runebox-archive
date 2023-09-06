public class class471 {
	static {
		int var0 = 0;
		int var1 = 0;
		class299[] var2 = class255.method1496();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class299 var4 = var2[var3];
			if (var4.field2745 > var0) {
				var0 = var4.field2745;
			}

			if (var4.field2744 > var1) {
				var1 = var4.field2744;
			}
		}

	}

	class471() throws Throwable {
	}

	public static int method2289(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
