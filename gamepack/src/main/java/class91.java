public class class91 extends class310 {

	public static class106 field1205;

	public static class338 field1204;

	static int[] field1202;

	class419 field1203;

	static {
		field1205 = new class106(64);
	}

	class91() {
	}

	void method604() {
	}

	void method605(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method608(var1, var3);
		}
	}

	void method608(class187 var1, int var2) {
		if (var2 == 249) {
			this.field1203 = class437.method2178(var1, this.field1203);
		}
	}

	public int method606(int var1, int var2) {
		return class437.method2177(this.field1203, var1, var2);
	}

	public String method607(int var1, String var2) {
		class419 var5 = this.field1203;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class47 var6 = (class47) var5.method2105((long) var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String) var6.field233;
			}
		}
		return var4;
	}

	public static class91 method609(int var0) {
		class91 var2 = (class91) field1205.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1204.method1762(34, var0);
			var2 = new class91();
			if (var3 != null) {
				var2.method605(new class187(var3));
			}
			var2.method604();
			field1205.method647(var2, (long) var0);
			return var2;
		}
	}
}
