public class class333 extends class462 {
	public class60 field2923;
	public int field2920;
	public int field2921;
	public int field2922;

	public class333(int var1, int var2, int var3, class60 var4) {
		this.field2920 = var1;
		this.field2921 = var2;
		this.field2922 = var3;
		this.field2923 = var4;
	}

	public static String method1845(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class79.field841[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
