public class class465 {
	static char[] field3995;
	static char[] field3996;
	static char[] field3997;
	static class342 field3998;
	static int[] field3994;

	static {
		field3996 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3996[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3996[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3996[var0] = (char)(var0 + 48 - 52);
		}

		field3996[62] = '+';
		field3996[63] = '/';
		field3997 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3997[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3997[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3997[var0] = (char)(var0 + 48 - 52);
		}

		field3997[62] = '*';
		field3997[63] = '-';
		field3995 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3995[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3995[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3995[var0] = (char)(var0 + 48 - 52);
		}

		field3995[62] = '-';
		field3995[63] = '_';
		field3994 = new int[128];

		for (var0 = 0; var0 < field3994.length; ++var0) {
			field3994[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3994[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3994[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3994[var0] = 52 + (var0 - 48);
		}

		int[] var2 = field3994;
		field3994[43] = 62;
		var2[42] = 62;
		int[] var1 = field3994;
		field3994[47] = 63;
		var1[45] = 63;
	}

	class465() throws Throwable {
	}

	public static String method2279(CharSequence var0) {
		String var2 = class333.method1845(class128.method770(var0));
		if (var2 == null) {
			var2 = "";
		}

		return var2;
	}

	public static final void method2277(String var0, String var1, int var2, int var3, int var4, int var5) {
		class69.method504(var0, var1, var2, var3, var4, var5, -1, false);
	}

	static final void method2276(int var0, int var1) {
		if (class292.method1669(var0)) {
			class411.method2121(class160.field1484[var0], var1);
		}
	}

	static final void method2278(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class176.field1701.method2495(var0);
	}
}
