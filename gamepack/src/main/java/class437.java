public class class437 {

	static int[] field3431;

	class437() throws Throwable {
	}

	static final class419 method2178(class187 var0, class419 var1) {
		int var3 = var0.method1096();
		int var4;
		if (null == var1) {
			var4 = class50.method204(var3);
			var1 = new class419(var4);
		}
		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method1096() == 1;
			int var6 = var0.method1152();
			Object var7;
			if (var5) {
				var7 = new class47(var0.method1104());
			} else {
				var7 = new class239(var0.method1100());
			}
			var1.method2109((class77) var7, (long) var6);
		}
		return var1;
	}

	static int method2177(class419 var0, int var1, int var2) {
		if (null == var0) {
			return var2;
		} else {
			class239 var4 = (class239) var0.method2105((long) var1);
			return var4 == null ? var2 : var4.field2043;
		}
	}
}
