public class class518 extends class218 {
	static String field4224;

	static {
		new class344(64);
	}

	class518() throws Throwable {
	}

	public static boolean method2526(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	static void method2525(boolean var0) {
		if (var0) {
			class312.method1747();
		} else {
			for (int var2 = 0; var2 < class92.field903.size(); ++var2) {
				class104 var3 = (class104)class92.field903.get(var2);
				if (var3 == null) {
					class92.field903.remove(var2);
					--var2;
				} else if (var3.field1034) {
					if (var3.field1032.field431 > 0) {
						--var3.field1032.field431;
					}

					var3.field1032.method168();
					var3.field1032.method166();
					var3.field1032.method130(0);
					class92.field903.remove(var2);
					--var2;
				} else {
					var3.field1034 = true;
				}
			}
		}

	}
}
