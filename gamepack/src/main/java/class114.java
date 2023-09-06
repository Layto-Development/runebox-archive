public class class114 extends class218 {
	public static class215 field1076;
	static class344 field1073;
	public char field1070;
	public char field1071;
	public int field1069;
	public int field1074;
	public int[] field1068;
	public int[] field1077;
	public String field1072;
	public String[] field1075;

	static {
		field1073 = new class344(64);
	}

	class114() {
		this.field1072 = class433.field3850;
		this.field1074 = 0;
	}

	void method700(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method701(var1, var3);
		}
	}

	void method701(class42 var1, int var2) {
		if (var2 == 1) {
			this.field1070 = (char)var1.method278();
		} else if (var2 == 2) {
			this.field1071 = (char)var1.method278();
		} else if (var2 == 3) {
			this.field1072 = var1.method286();
		} else if (var2 == 4) {
			this.field1069 = var1.method282();
		} else {
			int var4;
			if (var2 == 5) {
				this.field1074 = var1.method327();
				this.field1068 = new int[this.field1074];
				this.field1075 = new String[this.field1074];

				for (var4 = 0; var4 < this.field1074; ++var4) {
					this.field1068[var4] = var1.method282();
					this.field1075[var4] = var1.method286();
				}
			} else if (var2 == 6) {
				this.field1074 = var1.method327();
				this.field1068 = new int[this.field1074];
				this.field1077 = new int[this.field1074];

				for (var4 = 0; var4 < this.field1074; ++var4) {
					this.field1068[var4] = var1.method282();
					this.field1077[var4] = var1.method282();
				}
			}
		}

	}

	public int method699() {
		return this.field1074;
	}

	public static class393 method702(int var0) {
		class393 var2 = (class393)class393.field3299.method1890((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class3.field314.method1212(12, var0);
			var2 = new class393();
			if (var3 != null) {
				var2.method2051(new class42(var3));
			}

			var2.method2061();
			class393.field3299.method1889(var2, (long)var0);
			return var2;
		}
	}
}
