import java.util.List;

public class class285 extends class218 {
	public static class215 field2519;
	static class135 field2520;
	static class25 field2515;
	static class344 field2516;
	static List field2518;
	public boolean field2517;

	static {
		field2516 = new class344(64);
	}

	class285() {
		this.field2517 = false;
	}

	void method1626(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method1625(var1, var3);
		}
	}

	void method1625(class42 var1, int var2) {
		if (var2 == 2) {
			this.field2517 = true;
		}

	}

	static class12 method1627() {
		return class12.field365 < class12.field369 ? class225.field2044[++class12.field365 - 1] : null;
	}
}
