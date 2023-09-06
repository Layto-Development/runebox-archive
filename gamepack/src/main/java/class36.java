public class class36 {
	class36() throws Throwable {
	}

	public static int[] method242(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var2 = new int[var0.length];

			for (int var3 = 0; var3 < var0.length; ++var3) {
				if (var0[var3] < 0 || var0[var3] > class147.field1388.length) {
					return null;
				}

				var2[var3] = class147.field1388[var0[var3]];
			}

			return var2;
		} else {
			return null;
		}
	}

	static final void method244() {
		if (Client.field249 != class358.field3038) {
			Client.field249 = class358.field3038;
			class112.method696(class358.field3038);
		}

	}

	static final void method243(int var0, int var1, int var2, int var3, int var4) {
		class35.field500[0].method207(var0, var1);
		class35.field500[1].method207(var0, var1 + var3 - 16);
		class266.method1548(var0, var1 + 16, 16, var3 - 32, Client.field84);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
		class266.method1548(var0, var1 + 16 + var7, 16, var6, Client.field195);
		class266.method1554(var0, var7 + var1 + 16, var6, Client.field274);
		class266.method1554(var0 + 1, var1 + 16 + var7, var6, Client.field274);
		class266.method1559(var0, var1 + 16 + var7, 16, Client.field274);
		class266.method1559(var0, var1 + 17 + var7, 16, Client.field274);
		class266.method1554(var0 + 15, var1 + 16 + var7, var6, Client.field86);
		class266.method1554(var0 + 14, var7 + var1 + 17, var6 - 1, Client.field86);
		class266.method1559(var0, var6 + var1 + 15 + var7, 16, Client.field86);
		class266.method1559(var0 + 1, var7 + var1 + 14 + var6, 15, Client.field86);
	}
}
