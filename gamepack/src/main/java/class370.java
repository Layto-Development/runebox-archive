public class class370 {

	int field2954;

	int field2955;

	final int field2956;

	final int[] field2952;

	final int[] field2958;

	final int[][] field2953;

	final int[][] field2957;

	public class370(int var1, int var2) {
		this.field2957 = new int[var1][var2];
		this.field2953 = new int[var1][var2];
		int var3 = var1 * var2;
		int var4 = class50.method204(var3 / 4);
		this.field2958 = new int[var4];
		this.field2952 = new int[var4];
		this.field2956 = var4 - 1;
	}

	void method1915() {
		for (int var2 = 0; var2 < this.field2957.length; ++var2) {
			for (int var3 = 0; var3 < this.field2957[var2].length; ++var3) {
				this.field2957[var2][var3] = 0;
				this.field2953[var2][var3] = 99999999;
			}
		}
	}

	void method1905(int var1, int var2) {
		this.field2954 = var1;
		this.field2955 = var2;
	}

	int method1906() {
		return this.field2954;
	}

	int method1907() {
		return this.field2955;
	}

	int method1908() {
		return this.field2957.length;
	}

	int method1913() {
		return this.field2957[0].length;
	}

	int[][] method1914() {
		return this.field2957;
	}

	int[][] method1909() {
		return this.field2953;
	}

	int[] method1910() {
		return this.field2958;
	}

	int[] method1911() {
		return this.field2952;
	}

	int method1912() {
		return this.field2956;
	}
}
