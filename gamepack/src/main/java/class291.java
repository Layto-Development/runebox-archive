public class class291 {

	static class258 field2334;

	class291() throws Throwable {
	}

	public static void method1574(class258 var0) {
		field2334 = var0;
	}

	public static int method1576(class187 var0, String var1) {
		int var3 = var0.field1832;
		byte[] var4 = class111.method671(var1);
		var0.method1140(var4.length);
		var0.field1832 += field2334.method1456(var4, 0, var4.length, var0.field1830, var0.field1832);
		return var0.field1832 - var3;
	}

	public static String method1577(class187 var0) {
		return method1575(var0, 32767);
	}

	static String method1575(class187 var0, int var1) {
		try {
			int var3 = var0.method1143();
			if (var3 > 32767) {
				var3 = 32767;
			}
			byte[] var4 = new byte[var3];
			var0.field1832 += field2334.method1457(var0.field1830, var0.field1832, var4, 0, var3);
			String var5 = class111.method673(var4, 0, var3);
			return var5;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
