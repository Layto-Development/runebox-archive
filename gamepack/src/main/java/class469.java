public class class469 extends class321 {

	class469() {
	}

	@Override
	protected boolean method1711(int var1, int var2, int var3, class438 var4) {
		return super.field2511 == var2 && var3 == super.field2510;
	}

	static int method2293(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			boolean var2 = true;
			return 31;
		} else {
			var1 = (var0 & 127) * 96 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return var1 + (var0 & 65408);
		}
	}

	public static class136 method2292(int var0) {
		class136 var2 = (class136) class136.field1489.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class136.field1490.method1762(16, var0);
			var2 = new class136();
			if (null != var3) {
				var2.method865(new class187(var3));
			}
			class136.field1489.method647(var2, (long) var0);
			return var2;
		}
	}
}
