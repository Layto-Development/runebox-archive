public class class37 {
	class37() throws Throwable {
	}

	public static boolean method245(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	static String method247() {
		String var1;
		if (class176.field1701.method2491()) {
			String var3 = class116.field1110;
			String var2 = class295.method1679('*', var3.length());
			var1 = var2;
		} else {
			var1 = class116.field1110;
		}

		return var1;
	}

	static int method246(int var0, class167 var1, boolean var2) {
		int var4;
		if (var0 == 3500) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field151.method2118(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field151.method2115(var4) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field151.method2113(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
