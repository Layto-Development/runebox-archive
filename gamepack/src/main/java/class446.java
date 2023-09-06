public final class class446 {
	static int field3916;
	int field3913;
	int field3914;
	int field3915;
	int field3917;
	int field3918;
	int field3919;
	int field3920;
	int field3921;
	int field3922;
	int field3923;
	int field3924;
	int field3925;
	int field3926;
	int field3927;
	int field3928;
	int field3929;
	int field3930;
	int field3931;

	class446() {
	}

	static void method2234(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var8 = var0;
			class12 var9 = class225.field2044[var7];
			class225.field2044[var7] = class225.field2044[var1];
			class225.field2044[var1] = var9;

			for (int var10 = var0; var10 < var1; ++var10) {
				if (class177.method1004(class225.field2044[var10], var9, var2, var3, var4, var5) <= 0) {
					class12 var11 = class225.field2044[var10];
					class225.field2044[var10] = class225.field2044[var8];
					class225.field2044[var8++] = var11;
				}
			}

			class225.field2044[var1] = class225.field2044[var8];
			class225.field2044[var8] = var9;
			method2234(var0, var8 - 1, var2, var3, var4, var5);
			method2234(var8 + 1, var1, var2, var3, var4, var5);
		}

	}

	static boolean method2233(class287 var0) {
		if (Client.field6 == 0) {
			return false;
		} else {
			boolean var2;
			if (class82.field863 == var0) {
				var2 = (Client.field6 & 8) != 0;
				return var2;
			} else {
				var2 = class73.method516();
				if (!var2) {
					boolean var3 = (Client.field6 & 1) != 0;
					var2 = var3 && var0.method1632();
				}

				return var2 || class296.method1690() && var0.method1635();
			}
		}
	}
}
