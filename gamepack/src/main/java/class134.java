public class class134 {

	static int field1479;

	class134() throws Throwable {
	}

	static void method863(int var0, int var1) {
		int var3 = class484.field3894.method2386(class55.field486);
		int var4;
		int var5;
		for (var4 = 0; var4 < Client.field1047; ++var4) {
			var5 = class484.field3894.method2386(Client.method518(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}
		var3 += 8;
		var4 = Client.field1047 * 15 + 22;
		var5 = var0 - var3 / 2;
		if (var5 + var3 > class86.field856) {
			var5 = class86.field856 - var3;
		}
		if (var5 < 0) {
			var5 = 0;
		}
		int var6 = var1;
		if (var1 + var4 > class271.field2226) {
			var6 = class271.field2226 - var4;
		}
		if (var6 < 0) {
			var6 = 0;
		}
		class538.field4239 = var5;
		class324.field2525 = var6;
		class350.field2639 = var3;
		class244.field2068 = Client.field1047 * 15 + 22;
	}
}
