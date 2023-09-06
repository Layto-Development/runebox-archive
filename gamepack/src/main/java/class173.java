public class class173 {
	int field1685;
	int field1686;
	final int field1687;
	final int[] field1683;
	final int[] field1689;
	final int[][] field1684;
	final int[][] field1688;

	public class173(int var1, int var2) {
		this.field1688 = new int[var1][var2];
		this.field1684 = new int[var1][var2];
		int var3 = var1 * var2;
		int var4 = class476.method2304(var3 / 4);
		this.field1689 = new int[var4];
		this.field1683 = new int[var4];
		this.field1687 = var4 - 1;
	}

	void method989() {
		for (int var2 = 0; var2 < this.field1688.length; ++var2) {
			for (int var3 = 0; var3 < this.field1688[var2].length; ++var3) {
				this.field1688[var2][var3] = 0;
				this.field1684[var2][var3] = 99999999;
			}
		}

	}

	void method979(int var1, int var2) {
		this.field1685 = var1;
		this.field1686 = var2;
	}

	int method980() {
		return this.field1685;
	}

	int method981() {
		return this.field1686;
	}

	int method982() {
		return this.field1688.length;
	}

	int method987() {
		return this.field1688[0].length;
	}

	int[][] method988() {
		return this.field1688;
	}

	int[][] method983() {
		return this.field1684;
	}

	int[] method984() {
		return this.field1689;
	}

	int[] method985() {
		return this.field1683;
	}

	int method986() {
		return this.field1687;
	}

	public static int method990(class42 var0, String var1) {
		int var3 = var0.field527;
		byte[] var4 = class348.method1915(var1);
		var0.method322(var4.length);
		var0.field527 += class496.field4140.method2579(var4, 0, var4.length, var0.field525, var0.field527);
		return var0.field527 - var3;
	}
}
