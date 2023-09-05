import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ov")
public class class323 {
	@ObfInfo(name = "ao", desc = "[C")
	static char[] field2606;
	@ObfInfo(name = "au", desc = "[C")
	static char[] field2607;
	@ObfInfo(name = "ae", desc = "[C")
	static char[] field2608;
	@ObfInfo(name = "fu", desc = "Lnk;")
	static class505 field2609;
	@ObfInfo(name = "at", desc = "[I")
	static int[] field2605;

	static {
		field2607 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field2607[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field2607[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field2607[var0] = (char)(var0 + 48 - 52);
		}

		field2607[62] = '+';
		field2607[63] = '/';
		field2608 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field2608[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field2608[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field2608[var0] = (char)(var0 + 48 - 52);
		}

		field2608[62] = '*';
		field2608[63] = '-';
		field2606 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field2606[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field2606[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field2606[var0] = (char)(var0 + 48 - 52);
		}

		field2606[62] = '-';
		field2606[63] = '_';
		field2605 = new int[128];

		for (var0 = 0; var0 < field2605.length; ++var0) {
			field2605[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field2605[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field2605[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field2605[var0] = 52 + (var0 - 48);
		}

		int[] var2 = field2605;
		field2605[43] = 62;
		var2[42] = 62;
		int[] var1 = field2605;
		field2605[47] = 63;
		var1[45] = 63;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class323() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "([BIII)Ljava/lang/String;")
	public static String method1788(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var1 + var2; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(field2607[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(field2607[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(field2607[(var7 & 15) << 2 | var8 >>> 6]).append(field2607[var8 & 63]);
				} else {
					var4.append(field2607[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(field2607[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}
}
