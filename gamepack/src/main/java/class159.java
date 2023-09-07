public class class159 extends class310 {

	public static class338 field1629;

	static class106 field1626;

	public char field1623;

	public char field1624;

	public int field1622;

	public int field1627;

	public int[] field1621;

	public int[] field1630;

	public String field1625;

	public String[] field1628;

	static {
		field1626 = new class106(64);
	}

	class159() {
		this.field1625 = class55.field629;
		this.field1627 = 0;
	}

	void method928(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method929(var1, var3);
		}
	}

	void method929(class187 var1, int var2) {
		if (var2 == 1) {
			this.field1623 = (char) var1.method1096();
		} else if (var2 == 2) {
			this.field1624 = (char) var1.method1096();
		} else if (var2 == 3) {
			this.field1625 = var1.method1104();
		} else if (var2 == 4) {
			this.field1622 = var1.method1100();
		} else {
			int var4;
			if (var2 == 5) {
				this.field1627 = var1.method1145();
				this.field1621 = new int[this.field1627];
				this.field1628 = new String[this.field1627];
				for (var4 = 0; var4 < this.field1627; ++var4) {
					this.field1621[var4] = var1.method1100();
					this.field1628[var4] = var1.method1104();
				}
			} else if (var2 == 6) {
				this.field1627 = var1.method1145();
				this.field1621 = new int[this.field1627];
				this.field1630 = new int[this.field1627];
				for (var4 = 0; var4 < this.field1627; ++var4) {
					this.field1621[var4] = var1.method1100();
					this.field1630[var4] = var1.method1100();
				}
			}
		}
	}

	public int method927() {
		return this.field1627;
	}

	public static class159 method930(int var0) {
		class159 var2 = (class159) field1626.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1629.method1762(8, var0);
			var2 = new class159();
			if (null != var3) {
				var2.method928(new class187(var3));
			}
			field1626.method647(var2, (long) var0);
			return var2;
		}
	}
}
