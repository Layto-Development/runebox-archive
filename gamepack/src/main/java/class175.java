public class class175 extends class268 {
	static int field1694;
	final boolean field1693;

	public class175(boolean var1) {
		this.field1693 = var1;
	}

	int method994(class304 var1, class304 var2) {
		if (var1.field2769 == Client.field3 && var2.field2769 == Client.field3) {
			return this.field1693 ? var1.field2768 - var2.field2768 : var2.field2768 - var1.field2768;
		} else {
			return this.method1568(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method994((class304)var1, (class304)var2);
	}

	public static String method996(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
				if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = class435.method2206(var5);
					var3.append('%');
					int var7 = var6 >> 4 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}

					var7 = var6 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}
				}
			} else {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	static final void method995(int var0, int var1) {
		class419 var3 = var0 >= 0 ? Client.field248[var0] : class334.field2930;
		if (var3 != null && var1 >= 0 && var1 < var3.method2157()) {
			class395 var4 = (class395)var3.field3498.get(var1);
			if (var4.field3321 == -1) {
				String var5 = var4.field3320.method2214();
				class160 var6 = class85.method556(class129.field1205, Client.field68.field2426);
				var6.field1483.method267(3 + class431.method2196(var5));
				var6.field1483.method267(var0);
				var6.field1483.method308(var1);
				var6.field1483.method270(var5);
				Client.field68.method1570(var6);
			}
		}
	}
}
