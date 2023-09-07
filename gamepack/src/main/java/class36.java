public final class class36 {

	class36() throws Throwable {
	}

	public static int method159(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;
		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}
		return var3;
	}

	public static int method160(byte[] var0, int var1, CharSequence var2) {
		int var4 = var2.length();
		int var5 = var1;
		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var2.charAt(var6);
			if (var7 <= 127) {
				var0[var5++] = (byte) var7;
			} else if (var7 <= 2047) {
				var0[var5++] = (byte) (192 | var7 >> 6);
				var0[var5++] = (byte) (128 | var7 & '?');
			} else {
				var0[var5++] = (byte) (224 | var7 >> '\f');
				var0[var5++] = (byte) (128 | var7 >> 6 & 63);
				var0[var5++] = (byte) (128 | var7 & '?');
			}
		}
		return var5 - var1;
	}
}
