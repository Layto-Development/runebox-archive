public class class82 extends class218 {
	public static class344 field857;
	static class215 field861;
	static class287 field863;
	static int field860;
	static final int[] field856;
	public int field858;
	public int field859;
	public int field862;

	static {
		field857 = new class344(64);
		field856 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field856[var1] = var0 - 1;
			var0 += var0;
		}

	}

	class82() {
	}

	void method547(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method548(var1, var3);
		}
	}

	void method548(class42 var1, int var2) {
		if (var2 == 1) {
			this.field858 = var1.method327();
			this.field859 = var1.method278();
			this.field862 = var1.method278();
		}

	}

	public static int method549(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 = (var3 << 5) - var3 + var0.charAt(var4);
		}

		return var3;
	}
}
