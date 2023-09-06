public class class461 {
	static int field3985;

	class461() throws Throwable {
	}

	static void method2268(int var0, int var1) {
		int var3 = class488.field4114.method1292(class433.field3707);

		int var4;
		int var5;
		for (var4 = 0; var4 < Client.field152; ++var4) {
			var5 = class488.field4114.method1292(class1.method5(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = Client.field152 * 15 + 22;
		var5 = var0 - var3 / 2;
		if (var5 + var3 > class237.field2181) {
			var5 = class237.field2181 - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var1;
		if (var1 + var4 > class5.field322) {
			var6 = class5.field322 - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class391.field3274 = var5;
		class321.field2896 = var6;
		class105.field1039 = var3;
		class446.field3916 = Client.field152 * 15 + 22;
	}
}
