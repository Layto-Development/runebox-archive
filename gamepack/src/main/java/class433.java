import java.util.HashMap;

public class class433 {

	static int field3405;

	static {
		new HashMap();
	}

	class433() throws Throwable {
	}

	public static class228 method2167(class228[] var0, int var1) {
		class228[] var3 = var0;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			class228 var5 = var3[var4];
			if (var1 == var5.method1362()) {
				return var5;
			}
		}
		return null;
	}

	static int method2166(int var0, class436 var1, boolean var2, byte var3) {
		if (var0 == 3300) {
			class221.field1982[++class439.field3437 - 1] = Client.field1201;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				class439.field3437 -= 2;
				var4 = class221.field1982[class439.field3437];
				var5 = class221.field1982[class439.field3437 + 1];
				class221.field1982[++class439.field3437 - 1] = class53.method213(var4, var5);
				return 1;
			} else if (var0 == 3302) {
				class439.field3437 -= 2;
				var4 = class221.field1982[class439.field3437];
				var5 = class221.field1982[1 + class439.field3437];
				class221.field1982[++class439.field3437 - 1] = class53.method212(var4, var5);
				return 1;
			} else if (var0 == 3303) {
				class439.field3437 -= 2;
				var4 = class221.field1982[class439.field3437];
				var5 = class221.field1982[class439.field3437 + 1];
				class221.field1982[++class439.field3437 - 1] = class53.method214(var4, var5);
				return 1;
			} else if (var0 == 3304) {
				var4 = class221.field1982[--class439.field3437];
				class221.field1982[++class439.field3437 - 1] = class207.method1257(var4).field1911;
				return 1;
			} else if (var0 == 3305) {
				var4 = class221.field1982[--class439.field3437];
				class221.field1982[++class439.field3437 - 1] = Client.field1042[var4];
				return 1;
			} else if (var0 == 3306) {
				var4 = class221.field1982[--class439.field3437];
				class221.field1982[++class439.field3437 - 1] = Client.field1190[var4];
				return 1;
			} else if (var0 == 3307) {
				var4 = class221.field1982[--class439.field3437];
				class221.field1982[++class439.field3437 - 1] = Client.field1193[var4];
				return 1;
			} else {
				int var6;
				if (var0 == 3308) {
					var4 = class121.field1436;
					var5 = class346.field2624 + (class431.field3378.field272 >> 7);
					var6 = (class431.field3378.field243 >> 7) + class211.field1922;
					class221.field1982[++class439.field3437 - 1] = var6 + (var4 << 28) + (var5 << 14);
					return 1;
				} else if (var0 == 3309) {
					var4 = class221.field1982[--class439.field3437];
					class221.field1982[++class439.field3437 - 1] = var4 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var4 = class221.field1982[--class439.field3437];
					class221.field1982[++class439.field3437 - 1] = var4 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var4 = class221.field1982[--class439.field3437];
					class221.field1982[++class439.field3437 - 1] = var4 & 16383;
					return 1;
				} else if (var0 == 3312) {
					class221.field1982[++class439.field3437 - 1] = Client.field925 ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					class439.field3437 -= 2;
					var4 = class221.field1982[class439.field3437] + 32768;
					var5 = class221.field1982[class439.field3437 + 1];
					class221.field1982[++class439.field3437 - 1] = class53.method213(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					class439.field3437 -= 2;
					var4 = class221.field1982[class439.field3437] + 32768;
					var5 = class221.field1982[1 + class439.field3437];
					class221.field1982[++class439.field3437 - 1] = class53.method212(var4, var5);
					return 1;
				} else if (var0 == 3315) {
					class439.field3437 -= 2;
					var4 = class221.field1982[class439.field3437] + 32768;
					var5 = class221.field1982[1 + class439.field3437];
					class221.field1982[++class439.field3437 - 1] = class53.method214(var4, var5);
					return 1;
				} else if (var0 == 3316) {
					if (Client.field986 >= 2) {
						class221.field1982[++class439.field3437 - 1] = Client.field986;
					} else {
						class221.field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 == 3317) {
					class221.field1982[++class439.field3437 - 1] = Client.field918;
					return 1;
				} else if (var0 == 3318) {
					class221.field1982[++class439.field3437 - 1] = Client.field898;
					return 1;
				} else if (var0 == 3321) {
					class221.field1982[++class439.field3437 - 1] = Client.field1015 / 100;
					return 1;
				} else if (var0 == 3322) {
					class221.field1982[++class439.field3437 - 1] = Client.field1185;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field1194) {
						class221.field1982[++class439.field3437 - 1] = 1;
					} else {
						class221.field1982[++class439.field3437 - 1] = 0;
					}
					return 1;
				} else if (var0 == 3324) {
					class221.field1982[++class439.field3437 - 1] = Client.field899;
					return 1;
				} else if (var0 == 3325) {
					class439.field3437 -= 4;
					var4 = class221.field1982[class439.field3437];
					var5 = class221.field1982[class439.field3437 + 1];
					var6 = class221.field1982[2 + class439.field3437];
					int var7 = class221.field1982[3 + class439.field3437];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					class221.field1982[++class439.field3437 - 1] = var4;
					return 1;
				} else if (var0 == 3326) {
					class221.field1982[++class439.field3437 - 1] = Client.field914;
					return 1;
				} else if (var0 == 3327) {
					class221.field1982[++class439.field3437 - 1] = Client.field915;
					return 1;
				} else if (var0 == 3331) {
					class221.field1982[++class439.field3437 - 1] = Client.field1015;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
