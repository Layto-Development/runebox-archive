public class class408 extends class310 {

	static class106 field3186;

	static class338 field3188;

	static int field3189;

	boolean field3184;

	char field3185;

	public int field3183;

	public String field3187;

	static {
		field3186 = new class106(64);
	}

	class408() {
		this.field3184 = true;
	}

	void method2075() {
	}

	void method2076(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method2077(var1, var3);
		}
	}

	void method2077(class187 var1, int var2) {
		if (var2 == 1) {
			this.field3185 = class111.method669(var1.method1097());
		} else if (var2 == 2) {
			this.field3183 = var1.method1100();
		} else if (var2 == 4) {
			this.field3184 = false;
		} else if (var2 == 5) {
			this.field3187 = var1.method1104();
		}
	}

	public boolean method2078() {
		return this.field3185 == 's';
	}

	public static void method2080(class338 var0) {
		field3188 = var0;
	}

	public static class408 method2081(int var0) {
		class408 var2 = (class408) field3186.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field3188.method1762(11, var0);
			var2 = new class408();
			if (var3 != null) {
				var2.method2076(new class187(var3));
			}
			var2.method2075();
			field3186.method647(var2, (long) var0);
			return var2;
		}
	}

	public static void method2079() {
		field3186.method645();
	}
}
