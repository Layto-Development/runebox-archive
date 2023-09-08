public class class477 {

	static char[] field3741;

	static char[] field3742;

	static char[] field3743;

	static class13 field3744;

	static int[] field3740;

	static {
		field3742 = new char[64];
		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3742[var0] = (char) (var0 + 65);
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field3742[var0] = (char) (var0 + 97 - 26);
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field3742[var0] = (char) (var0 + 48 - 52);
		}
		field3742[62] = '+';
		field3742[63] = '/';
		field3743 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field3743[var0] = (char) (var0 + 65);
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field3743[var0] = (char) (var0 + 97 - 26);
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field3743[var0] = (char) (var0 + 48 - 52);
		}
		field3743[62] = '*';
		field3743[63] = '-';
		field3741 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field3741[var0] = (char) (var0 + 65);
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field3741[var0] = (char) (var0 + 97 - 26);
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field3741[var0] = (char) (var0 + 48 - 52);
		}
		field3741[62] = '-';
		field3741[63] = '_';
		field3740 = new int[128];
		for (var0 = 0; var0 < field3740.length; ++var0) {
			field3740[var0] = -1;
		}
		for (var0 = 65; var0 <= 90; ++var0) {
			field3740[var0] = var0 - 65;
		}
		for (var0 = 97; var0 <= 122; ++var0) {
			field3740[var0] = var0 - 97 + 26;
		}
		for (var0 = 48; var0 <= 57; ++var0) {
			field3740[var0] = 52 + (var0 - 48);
		}
		int[] var2 = field3740;
		field3740[43] = 62;
		var2[42] = 62;
		int[] var1 = field3740;
		field3740[47] = 63;
		var1[45] = 63;
	}

	class477() throws Throwable {
	}

	public static String method2317(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();
		for (int var5 = 0; var5 < 0 + var2; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(field3742[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(field3742[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(field3742[(var7 & 15) << 2 | var8 >>> 6]).append(field3742[var8 & 63]);
				} else {
					var4.append(field3742[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(field3742[(var6 & 3) << 4]).append("==");
			}
		}
		return var4.toString();
	}
}
