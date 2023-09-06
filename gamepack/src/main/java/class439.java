public class class439 {
	static byte[][][] field3868;

	class439() throws Throwable {
	}

	public static class25 method2208(class215 var0, String var1, String var2) {
		if (!var0.method1234(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method1237(var1);
			int var5 = var0.method1229(var4, var2);
			class25 var6;
			if (!class85.method558(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = class442.method2217();
			}

			return var6;
		}
	}

	public static boolean method2209(int var0) {
		if (class92.field904.isEmpty()) {
			return false;
		} else {
			class104 var2 = (class104)class92.field904.get(0);
			return var2 != null && var0 == var2.field1026;
		}
	}

	static int method2211(int var0) {
		return var0 * 3 + 600;
	}

	static Object method2210(class140 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field1348) {
			case 1:
				return class139.field1344[--class203.field1903];
			case 2:
				return class139.field1331[--class429.field3529];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
