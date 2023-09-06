public abstract class class40 extends class462 {
	static int field519;

	class40() {
	}

	abstract void method258(class42 var1);

	abstract void method259(class419 var1);

	public static class101 method261(int var0) {
		class101 var2 = (class101)class101.field1012.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class101.field1013.method1212(39, var0);
			var2 = new class101();
			if (var3 != null) {
				var2.method650(new class42(var3));
			}

			var2.method652();
			class101.field1012.method1889(var2, (long)var0);
			return var2;
		}
	}

	public static class300 method260(int var0) {
		class300 var2 = (class300)class300.field2748.method1890((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class300.field2749.method1212(38, var0);
			var2 = new class300();
			if (null != var3) {
				var2.method1696(new class42(var3));
			}

			var2.method1694();
			class300.field2748.method1889(var2, (long)var0);
			return var2;
		}
	}
}
