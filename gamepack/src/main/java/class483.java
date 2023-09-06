public class class483 {
	static int[] field4097;

	class483() throws Throwable {
	}

	static void method2399(int var0, String var1, String var2, String var3) {
		class121 var5 = (class121)class41.field520.get(var0);
		if (var5 == null) {
			var5 = new class121();
			class41.field520.put(var0, var5);
		}

		class445 var6 = var5.method751(var0, var1, var2, var3);
		class41.field521.method2547(var6, (long)var6.field3907);
		class41.field522.method1601(var6);
		Client.field208 = Client.field5;
	}

	static final void method2400(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class452.field3956 < var0) {
			class452.field3956 += class96.field979 * (var0 - class452.field3956) / 1000 + class47.field544;
			if (class452.field3956 > var0) {
				class452.field3956 = var0;
			}
		} else if (class452.field3956 > var0) {
			class452.field3956 -= class47.field544 + (class452.field3956 - var0) * class96.field979 / 1000;
			if (class452.field3956 < var0) {
				class452.field3956 = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - class175.field1694;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			class175.field1694 += var3 * class96.field979 / 1000 + class47.field544;
			class175.field1694 &= 2047;
		} else if (var3 < 0) {
			class175.field1694 -= -var3 * class96.field979 / 1000 + class47.field544;
			class175.field1694 &= 2047;
		}

		int var4 = var1 - class175.field1694;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			class175.field1694 = var1;
		}

	}
}
