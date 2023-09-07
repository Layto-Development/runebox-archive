public class class170 extends class310 {

	public static class338 field1682;

	public static class338 field1683;

	public static int field1685;

	static class106 field1691;

	int[] field1687;

	int[] field1693;

	short[] field1684;

	short[] field1688;

	short[] field1689;

	short[] field1690;

	public boolean field1692;

	public int field1686;

	static {
		field1691 = new class106(64);
	}

	class170() {
		this.field1686 = -1;
		this.field1693 = new int[] { -1, -1, -1, -1, -1 };
		this.field1692 = false;
	}

	void method985(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method984(var1, var3);
		}
	}

	void method984(class187 var1, int var2) {
		if (var2 == 1) {
			this.field1686 = var1.method1096();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method1096();
				this.field1687 = new int[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field1687[var5] = var1.method1145();
				}
			} else if (var2 == 3) {
				this.field1692 = true;
			} else if (var2 == 40) {
				var4 = var1.method1096();
				this.field1688 = new short[var4];
				this.field1689 = new short[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field1688[var5] = (short) var1.method1145();
					this.field1689[var5] = (short) var1.method1145();
				}
			} else if (var2 == 41) {
				var4 = var1.method1096();
				this.field1690 = new short[var4];
				this.field1684 = new short[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field1690[var5] = (short) var1.method1145();
					this.field1684[var5] = (short) var1.method1145();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field1693[var2 - 60] = var1.method1145();
			}
		}
	}

	public boolean method982() {
		if (null == this.field1687) {
			return true;
		} else {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field1687.length; ++var3) {
				if (!field1683.method1764(this.field1687[var3], 0)) {
					var2 = false;
				}
			}
			return var2;
		}
	}

	public class462 method983() {
		if (this.field1687 == null) {
			return null;
		} else {
			class462[] var2 = new class462[this.field1687.length];
			for (int var3 = 0; var3 < this.field1687.length; ++var3) {
				var2[var3] = class462.method2259(field1683, this.field1687[var3], 0);
			}
			class462 var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new class462(var2, var2.length);
			}
			int var4;
			if (null != this.field1688) {
				for (var4 = 0; var4 < this.field1688.length; ++var4) {
					var5.method2258(this.field1688[var4], this.field1689[var4]);
				}
			}
			if (this.field1690 != null) {
				for (var4 = 0; var4 < this.field1690.length; ++var4) {
					var5.method2249(this.field1690[var4], this.field1684[var4]);
				}
			}
			return var5;
		}
	}

	public boolean method987() {
		boolean var2 = true;
		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.field1693[var3] != -1 && !field1683.method1764(this.field1693[var3], 0)) {
				var2 = false;
			}
		}
		return var2;
	}

	public class462 method986() {
		class462[] var2 = new class462[5];
		int var3 = 0;
		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field1693[var4] != -1) {
				var2[var3++] = class462.method2259(field1683, this.field1693[var4], 0);
			}
		}
		class462 var6 = new class462(var2, var3);
		int var5;
		if (this.field1688 != null) {
			for (var5 = 0; var5 < this.field1688.length; ++var5) {
				var6.method2258(this.field1688[var5], this.field1689[var5]);
			}
		}
		if (null != this.field1690) {
			for (var5 = 0; var5 < this.field1690.length; ++var5) {
				var6.method2249(this.field1690[var5], this.field1684[var5]);
			}
		}
		return var6;
	}

	public static class170 method989(int var0) {
		class170 var2 = (class170) field1691.method648((long) var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field1682.method1762(3, var0);
			var2 = new class170();
			if (var3 != null) {
				var2.method985(new class187(var3));
			}
			field1691.method647(var2, (long) var0);
			return var2;
		}
	}

	public static void method988() {
		field1691.method645();
	}
}
