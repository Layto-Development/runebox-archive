public class class72 {
	static int field819;

	class72() throws Throwable {
	}

	static final void method513(byte[] var0, int var1, int var2, int var3, int var4, class76[] var5) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					if (var8 + var1 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
						int[] var10000 = var5[var7].field839[var8 + var1];
						var10000[var2 + var9] &= -16777217;
					}
				}
			}
		}

		class42 var13 = new class42(var0);

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (int var10 = 0; var10 < 64; ++var10) {
					int var11 = var1 + var9;
					int var12 = var2 + var10;
					class24.method200(var13, var8, var11, var12, var3 + var11, var12 + var4, 0);
				}
			}
		}

	}

	public static void method514() {
		class60.field750.method1887();
		class60.field639.method1887();
		class60.field640.method1887();
		class60.field633.method1887();
	}
}
