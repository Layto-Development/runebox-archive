public class class136 extends class310 {

	public static class106 field1489;

	public static int field1488;

	static class338 field1490;

	static class338 field1491;

	static int field1492;

	public int field1487;

	static {
		field1489 = new class106(64);
	}

	class136() {
		this.field1487 = 0;
	}

	void method865(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method864(var1, var3);
		}
	}

	void method864(class187 var1, int var2) {
		if (var2 == 5) {
			this.field1487 = var1.method1145();
		}
	}

	public static void method866(class338 var0) {
		field1490 = var0;
		field1488 = field1490.method1788(16);
	}
}
