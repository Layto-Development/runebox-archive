public class class313 {
	class313() throws Throwable {
	}

	public static String method1750(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var7 = var0[var1 + var6] & 255;
			if (var7 != 0) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = class389.field3272[var7 - 128];
					if (var8 == 0) {
						var8 = '?';
					}

					var7 = var8;
				}

				var4[var5++] = (char)var7;
			}
		}

		return new String(var4, 0, var5);
	}
}
