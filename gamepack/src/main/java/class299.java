import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "oo")
public final class class299 {
	@ObfInfo(name = "au", desc = "[C")
	public static final char[] field2407;
	@ObfInfo(name = "fk", desc = "Lnk;")
	static class505 field2409;
	@ObfInfo(name = "ae", desc = "[J")
	static long[] field2408;

	static {
		field2407 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field2408 = new long[12];

		for (int var0 = 0; var0 < field2408.length; ++var0) {
			field2408[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class299() throws Throwable {
	}

	@ObfInfo(name = "ae", desc = "(J)Ljava/lang/String;")
	public static String method1640(long var0) {
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
					var8 = field2407[(int)(var6 - var0 * 37L)];
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

	@ObfInfo(name = "ao", desc = "(Ljava/lang/CharSequence;I)Ljava/lang/String;")
	public static String method1641(CharSequence var0) {
		String var2 = method1640(class441.method2312(var0));
		if (var2 == null) {
			var2 = "";
		}

		return var2;
	}
}
