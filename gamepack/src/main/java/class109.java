public class class109 extends class356 {

	long field1293;

	public class109() {
		this.field1293 = System.nanoTime();
	}

	@Override
	public void method1868() {
		this.field1293 = System.nanoTime();
	}

	@Override
	public int method1869(int var1, int var2) {
		long var4 = 1000000L * (long) var2;
		long var6 = this.field1293 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}
		class39.method171(var6 / 1000000L);
		long var8 = System.nanoTime();
		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1293 < var8); this.field1293 += 1000000L * (long) var1) {
			++var10;
		}
		if (this.field1293 < var8) {
			this.field1293 = var8;
		}
		return var10;
	}
}
