public class class185 {
	public static class173[] field1747;

	class185() throws Throwable {
	}

	public static boolean method1023(CharSequence var0) {
		return class418.method2148(var0, 10, true);
	}

	static int method1022() {
		return Client.field234 ? 2 : 1;
	}

	static int method1021(int var0, class167 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == 8000) {
			--class203.field1903;
			var4 = class139.field1344[class203.field1903];
			var5 = class139.field1333[var4];
			class396.method2072(class139.field1335[var4], new int[var5], 0, var5 - 1);
			return 1;
		} else if (var0 == 8001) {
			class203.field1903 -= 3;
			var4 = class139.field1344[class203.field1903];
			var5 = class139.field1344[1 + class203.field1903];
			int var6 = class139.field1344[2 + class203.field1903];
			int var7 = class139.field1333[var4];
			if (var7 <= 1) {
				return 1;
			} else {
				class422.method2166(class139.field1335[var4], var7, var5, var6);
				return 1;
			}
		} else {
			return 2;
		}
	}

	public static void method1024(class60 var0) {
		if (null != var0 && Client.field224 == var0.field784) {
			Client.field13[var0.field783] = true;
		}

	}
}
