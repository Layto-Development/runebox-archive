public class class260 {

	class260() throws Throwable {
	}

	static int method1460(int var0, int var1, int var2) {
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
		int var4 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
		return var4;
	}
}
