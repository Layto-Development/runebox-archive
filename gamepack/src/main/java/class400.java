public final class class400 {
	public static class311 field3354;
	int field3355;
	int field3358;
	int field3359;
	int field3360;
	public class480 field3357;
	public long field3356;

	class400() {
	}

	public static int method2080(byte[] var0, int var1, CharSequence var2) {
		int var4 = var2.length();
		int var5 = var1;

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var2.charAt(var6);
			if (var7 <= 127) {
				var0[var5++] = (byte)var7;
			} else if (var7 <= 2047) {
				var0[var5++] = (byte)(192 | var7 >> 6);
				var0[var5++] = (byte)(128 | var7 & '?');
			} else {
				var0[var5++] = (byte)(224 | var7 >> '\f');
				var0[var5++] = (byte)(128 | var7 >> 6 & 63);
				var0[var5++] = (byte)(128 | var7 & '?');
			}
		}

		return var5 - var1;
	}
}
