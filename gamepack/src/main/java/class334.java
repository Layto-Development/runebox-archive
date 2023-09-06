public class class334 implements class367 {
	static class25 field2929;
	static class419 field2930;
	static final class334 field2925;
	static final class334 field2926;
	static final class334 field2927;
	final int field2928;
	public final int field2924;

	static {
		field2927 = new class334(1, 0);
		field2925 = new class334(0, 1);
		field2926 = new class334(2, 2);
	}

	class334(int var1, int var2) {
		this.field2924 = var1;
		this.field2928 = var2;
	}

	public int method1970() {
		return this.field2928;
	}

	public static void method1847(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var7 == null || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method1847(var0, var1, var2, var6 - 1);
			method1847(var0, var1, var6 + 1, var3);
		}

	}
}
