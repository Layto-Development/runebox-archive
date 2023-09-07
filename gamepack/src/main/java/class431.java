public class class431 extends class310 {

	public static class106 field3372;

	static class338 field3376;

	static class82 field3378;

	static int field3375;

	static final int[] field3371;

	public int field3373;

	public int field3374;

	public int field3377;

	static {
		field3372 = new class106(64);
		field3371 = new int[32];
		int var0 = 2;
		for (int var1 = 0; var1 < 32; ++var1) {
			field3371[var1] = var0 - 1;
			var0 += var0;
		}
	}

	class431() {
	}

	void method2160(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method2161(var1, var3);
		}
	}

	void method2161(class187 var1, int var2) {
		if (var2 == 1) {
			this.field3373 = var1.method1145();
			this.field3374 = var1.method1096();
			this.field3377 = var1.method1096();
		}
	}

	public static void method2162(class338 var0) {
		field3376 = var0;
	}

	public static class431 method2163(int var0) {
		class431 var2 = (class431) field3372.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field3376.method1762(14, var0);
			var2 = new class431();
			if (var3 != null) {
				var2.method2160(new class187(var3));
			}
			field3372.method647(var2, (long) var0);
			return var2;
		}
	}
}
