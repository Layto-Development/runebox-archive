public class class207 extends class218 {
	public static class215 field1922;
	public static class344 field1917;
	static class115[] field1912;
	public boolean field1913;
	public int field1910;
	public int field1911;
	public int field1914;
	public int field1915;
	public int field1916;
	public int field1918;
	public int field1919;
	public int field1920;
	public int field1921;

	static {
		field1917 = new class344(64);
	}

	public class207() {
		this.field1911 = 0;
		this.field1910 = -1;
		this.field1913 = true;
		this.field1914 = -1;
	}

	public void method1156() {
		if (this.field1914 != -1) {
			this.method1158(this.field1914);
			this.field1919 = this.field1915;
			this.field1918 = this.field1916;
			this.field1920 = this.field1921;
		}

		this.method1158(this.field1911);
	}

	public void method1157(class42 var1, int var2) {
		while (true) {
			int var4 = var1.method278();
			if (var4 == 0) {
				return;
			}

			this.method1155(var1, var4, var2);
		}
	}

	void method1155(class42 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field1911 = var1.method334();
		} else if (var2 == 2) {
			this.field1910 = var1.method278();
		} else if (var2 == 5) {
			this.field1913 = false;
		} else if (var2 == 7) {
			this.field1914 = var1.method334();
		} else if (var2 == 8) {
		}

	}

	void method1158(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var11 + var9);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var11 == var7) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}

		var13 /= 6.0D;
		this.field1915 = (int)(var13 * 256.0D);
		this.field1916 = (int)(var15 * 256.0D);
		this.field1921 = (int)(var17 * 256.0D);
		if (this.field1916 < 0) {
			this.field1916 = 0;
		} else if (this.field1916 > 255) {
			this.field1916 = 255;
		}

		if (this.field1921 < 0) {
			this.field1921 = 0;
		} else if (this.field1921 > 255) {
			this.field1921 = 255;
		}

	}
}
