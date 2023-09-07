public class class357 {

	static class13 field2837;

	static short[][][] field2836;

	class481[] field2834;

	int field2835;

	class357(class187 var1, int var2) {
		this.field2834 = new class481[var2];
		this.field2835 = var1.method1096();
		for (int var3 = 0; var3 < this.field2834.length; ++var3) {
			class481 var4 = new class481(this.field2835, var1, false);
			this.field2834[var3] = var4;
		}
		this.method1876();
	}

	void method1876() {
		class481[] var2 = this.field2834;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			class481 var4 = var2[var3];
			if (var4.field3769 >= 0) {
				var4.field3779 = this.field2834[var4.field3769];
			}
		}
	}

	public int method1871() {
		return this.field2834.length;
	}

	class481 method1872(int var1) {
		return var1 >= this.method1871() ? null : this.field2834[var1];
	}

	class481[] method1873() {
		return this.field2834;
	}

	void method1874(class421 var1, int var2) {
		this.method1875(var1, var2, (boolean[]) null, false);
	}

	void method1875(class421 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method2116();
		int var7 = 0;
		class481[] var8 = this.method1873();
		for (int var9 = 0; var9 < var8.length; ++var9) {
			class481 var10 = var8[var9];
			if (null == var3 || var4 == var3[var7]) {
				var1.method2118(var2, var10, var7, var6);
			}
			++var7;
		}
	}
}
