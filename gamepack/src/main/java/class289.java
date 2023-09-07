public class class289 extends class310 {

	static class106 field2328;

	static class338 field2329;

	int[][] field2330;

	Object[][] field2332;

	public int field2331;

	static {
		field2328 = new class106(64);
	}

	class289() {
		this.field2331 = -1;
	}

	void method1568(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1565(var1, var3);
		}
	}

	public Object[] method1567(int var1) {
		return null == this.field2332 ? null : this.field2332[var1];
	}

	void method1565(class187 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method1096();
			if (null == this.field2332) {
				this.field2332 = new Object[var4][];
				this.field2330 = new int[var4][];
			}
			for (int var5 = var1.method1096(); var5 != 255; var5 = var1.method1096()) {
				int var6 = var1.method1096();
				int[] var7 = new int[var6];
				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method1143();
				}
				this.field2332[var5] = class128.method852(var1, var7);
				this.field2330[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field2331 = var1.method1112();
		}
	}

	void method1566() {
	}

	public static void method1571(class338 var0) {
		field2329 = var0;
	}

	public static class289 method1570(int var0) {
		class289 var2 = (class289) field2328.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2329.method1762(38, var0);
			var2 = new class289();
			if (null != var3) {
				var2.method1568(new class187(var3));
			}
			var2.method1566();
			field2328.method647(var2, (long) var0);
			return var2;
		}
	}

	public static void method1569() {
		field2328.method645();
	}
}
