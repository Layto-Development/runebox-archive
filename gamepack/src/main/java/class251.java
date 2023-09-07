public class class251 extends class310 {

	static class106 field2120;

	static class338 field2121;

	static int[] field2124;

	public int[][] field2122;

	public Object[][] field2123;

	static {
		field2120 = new class106(64);
	}

	class251() {
	}

	void method1438(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1439(var1, var3);
		}
	}

	void method1439(class187 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method1096();
			if (this.field2122 == null) {
				this.field2122 = new int[var4][];
			}
			for (int var5 = var1.method1096(); var5 != 255; var5 = var1.method1096()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.method1096()];
				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method1143();
				}
				this.field2122[var6] = var8;
				if (var7) {
					if (null == this.field2123) {
						this.field2123 = new Object[this.field2122.length][];
					}
					this.field2123[var6] = class128.method852(var1, var8);
				}
			}
		}
	}

	void method1440() {
	}

	public static class251 method1441(int var0) {
		class251 var2 = (class251) field2120.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2121.method1762(39, var0);
			var2 = new class251();
			if (var3 != null) {
				var2.method1438(new class187(var3));
			}
			var2.method1440();
			field2120.method647(var2, (long) var0);
			return var2;
		}
	}

	public static void method1442() {
		field2120.method645();
	}
}
