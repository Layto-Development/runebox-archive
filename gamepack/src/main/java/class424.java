public class class424 {

	public static int field3281;

	public static long[] field3283;

	static boolean field3276;

	static boolean field3278;

	static int field3273;

	static int field3274;

	static int field3275;

	static int field3277;

	static int field3279;

	static int field3280;

	static int field3282;

	static {
		field3278 = false;
		field3274 = 0;
		field3277 = 0;
		field3276 = false;
		field3281 = 0;
		field3283 = new long[1000];
	}

	class424() throws Throwable {
	}

	public static long method2133(int var0) {
		return field3283[var0];
	}

	public static int method2127(int var0) {
		long var3 = field3283[var0];
		int var2 = (int) (var3 >>> 0 & 127L);
		return var2;
	}

	public static int method2126(int var0) {
		long var3 = field3283[var0];
		int var2 = (int) (var3 >>> 7 & 127L);
		return var2;
	}

	public static int method2131(long var0) {
		return (int) (var0 >>> 14 & 3L);
	}

	public static int method2132(long var0) {
		return (int) (var0 >>> 17 & 4294967295L);
	}

	public static long method2134(int var0, int var1, int var2, boolean var3, int var4) {
		long var6 = (long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long) var4 & 4294967295L) << 17;
		if (var3) {
			var6 |= 65536L;
		}
		return var6;
	}

	public static final void method2129(int var0, int var1) {
		field3274 = var0;
		field3277 = var1;
		field3278 = true;
		field3281 = 0;
		field3276 = false;
	}

	public static final void method2130() {
		field3278 = false;
		field3281 = 0;
	}

	static final boolean method2128() {
		return field3278;
	}

	static final void method2125() {
		if (!field3276) {
			int var1 = class372.field2983;
			int var2 = class372.field2984;
			int var3 = class372.field3017;
			int var4 = class372.field2985;
			boolean var5 = true;
			boolean var6 = true;
			int var7 = (field3274 - class238.method1389()) * 50 / class238.method1394();
			int var8 = (field3277 - class238.method1390()) * 50 / class238.method1394();
			int var9 = (field3274 - class238.method1389()) * 3500 / class238.method1394();
			int var10 = (field3277 - class238.method1390()) * 3500 / class238.method1394();
			int var11 = class309.method1670(var8, 50, var2, var1);
			int var12 = 50 * var2 - var1 * var8 >> 16;
			var8 = var11;
			var11 = class309.method1670(var10, 3500, var2, var1);
			int var13 = 3500 * var2 - var1 * var10 >> 16;
			var10 = var11;
			var11 = class309.method1671(var7, var12, var4, var3);
			int var14 = class309.method1672(var7, var12, var4, var3);
			var7 = var11;
			var11 = class309.method1671(var9, var13, var4, var3);
			int var15 = class309.method1672(var9, var13, var4, var3);
			field3273 = (var11 + var7) / 2;
			field3282 = (var8 + var10) / 2;
			field3279 = (var14 + var15) / 2;
			class534.field4209 = (var11 - var7) / 2;
			field3275 = (var10 - var8) / 2;
			class513.field4088 = (var15 - var14) / 2;
			field3280 = Math.abs(class534.field4209);
			class520.field4128 = Math.abs(field3275);
			class512.field4087 = Math.abs(class513.field4088);
		}
	}
}
