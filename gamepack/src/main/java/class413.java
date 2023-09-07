public class class413 extends class77 {

	static class214 field3214;

	class357 field3213;

	int field3209;

	int field3210;

	int[] field3211;

	int[][] field3212;

	public class413(int var1, byte[] var2) {
		this.field3209 = var1;
		class187 var3 = new class187(var2);
		this.field3210 = var3.method1096();
		this.field3211 = new int[this.field3210];
		this.field3212 = new int[this.field3210][];
		int var4;
		for (var4 = 0; var4 < this.field3210; ++var4) {
			this.field3211[var4] = var3.method1096();
		}
		for (var4 = 0; var4 < this.field3210; ++var4) {
			this.field3212[var4] = new int[var3.method1096()];
		}
		for (var4 = 0; var4 < this.field3210; ++var4) {
			for (int var5 = 0; var5 < this.field3212[var4].length; ++var5) {
				this.field3212[var4][var5] = var3.method1096();
			}
		}
		if (var3.field1832 < var3.field1830.length) {
			var4 = var3.method1145();
			if (var4 > 0) {
				this.field3213 = new class357(var3, var4);
			}
		}
	}

	public int method2088() {
		return this.field3210;
	}

	public class357 method2087() {
		return this.field3213;
	}
}
