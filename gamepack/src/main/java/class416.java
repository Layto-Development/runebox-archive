public class class416 extends class50 {
	long field3490;

	public class416() {
		this.field3490 = System.nanoTime();
	}

	public void method378() {
		this.field3490 = System.nanoTime();
	}

	public int method379(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field3490 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		class353.method1925(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field3490 < var8); this.field3490 += 1000000L * (long)var1) {
			++var10;
		}

		if (this.field3490 < var8) {
			this.field3490 = var8;
		}

		return var10;
	}
}
