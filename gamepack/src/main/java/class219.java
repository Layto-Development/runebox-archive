public class class219 extends class268 {
	final boolean field2032;

	public class219(boolean var1) {
		this.field2032 = var1;
	}

	int method1253(class304 var1, class304 var2) {
		if (var2.field2770 != var1.field2770) {
			return this.field2032 ? var1.field2770 - var2.field2770 : var2.field2770 - var1.field2770;
		} else {
			return this.method1568(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method1253((class304)var1, (class304)var2);
	}

	static class60 method1254(class60 var0) {
		int var2 = class420.method2164(class447.method2235(var0));
		if (var2 == 0) {
			return null;
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				var0 = class366.method1967(var0.field661);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
