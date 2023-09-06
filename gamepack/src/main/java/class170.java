import java.util.regex.Pattern;

@class490
public final class class170 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	class170() throws Throwable {
	}

	static final void method940(int var0, int var1) {
		if (Client.field248[var0] != null) {
			if (var1 >= 0 && var1 < Client.field248[var0].method2157()) {
				class395 var3 = (class395)Client.field248[var0].field3498.get(var1);
				if (var3.field3321 == -1) {
					class160 var4 = class85.method556(class129.field1196, Client.field68.field2426);
					var4.field1483.method267(3 + class431.method2196(var3.field3320.method2214()));
					var4.field1483.method267(var0);
					var4.field1483.method308(var1);
					var4.field1483.method270(var3.field3320.method2214());
					Client.field68.method1570(var4);
				}
			}
		}
	}
}
