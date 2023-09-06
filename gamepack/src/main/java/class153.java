public class class153 {
	int[] field1433;
	short[] field1434;

	public class153(class375 var1) {
		this.field1433 = new int[8];
		this.field1434 = new short[8];
		int var2 = 0;
		if (var1.method2003()) {
			var2 = var1.method2004().length;
			System.arraycopy(var1.method2004(), 0, this.field1433, 0, var2);
			System.arraycopy(var1.method2006(), 0, this.field1434, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field1433[var3] = -1;
			this.field1434[var3] = -1;
		}

	}

	public int[] method879() {
		return this.field1433;
	}

	public short[] method880() {
		return this.field1434;
	}

	public void method881(int var1, int var2, short var3) {
		this.field1433[var1] = var2;
		this.field1434[var1] = var3;
	}

	public void method882(int[] var1, short[] var2) {
		this.field1433 = var1;
		this.field1434 = var2;
	}
}
