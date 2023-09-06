public class class463 implements class369 {
	static int field3989;

	static class167 method2271(int var0) {
		class167 var2 = (class167)class167.field1619.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class522.field4234.method1212(var0, 0);
			if (null == var3) {
				return null;
			} else {
				var2 = class151.method869(var3);
				class167.field1619.method1889(var2, (long)var0);
				return var2;
			}
		}
	}

	static class342 method2272(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class124 var6 = null;
		if (null != class297.field2739) {
			var6 = new class124(var0, class297.field2739, class436.field3865[var0], 1000000);
		}

		return new class342(var6, class290.field2580, class336.field2933, var0, var1, var2, var3, var4);
	}
}
