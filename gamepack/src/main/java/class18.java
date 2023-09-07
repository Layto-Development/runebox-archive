public class class18 {

	int[] field92;

	short[] field93;

	public class18(class314 var1) {
		this.field92 = new int[8];
		this.field93 = new short[8];
		int var2 = 0;
		if (var1.method1687()) {
			var2 = var1.method1688().length;
			System.arraycopy(var1.method1688(), 0, this.field92, 0, var2);
			System.arraycopy(var1.method1690(), 0, this.field93, 0, var2);
		}
		for (int var3 = var2; var3 < 8; ++var3) {
			this.field92[var3] = -1;
			this.field93[var3] = -1;
		}
	}

	public int[] method56() {
		return this.field92;
	}

	public short[] method57() {
		return this.field93;
	}

	public void method58(int var1, int var2, short var3) {
		this.field92[var1] = var2;
		this.field93[var1] = var3;
	}

	public void method59(int[] var1, short[] var2) {
		this.field92 = var1;
		this.field93 = var2;
	}
}
