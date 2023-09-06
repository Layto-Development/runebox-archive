final class class188 implements class65 {
	public static String field1754;
	static class342 field1755;
	// $FF: synthetic field
	final class60 val$cc;

	class188(class60 var1) {
		this.val$cc = var1;
	}

	public void method486() {
		if (this.val$cc != null && this.val$cc.method459().field1042 != null) {
			class309 var2 = new class309();
			var2.method1742(this.val$cc);
			var2.method1743(this.val$cc.method459().field1042);
			class289.method1659().method567(var2);
		}

	}

	static final int method1037(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var4;
	}
}
