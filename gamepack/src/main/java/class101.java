public class class101 extends class218 {
	static class215 field1013;
	static class344 field1012;
	static int[] field1016;
	public int[][] field1014;
	public Object[][] field1015;

	static {
		field1012 = new class344(64);
	}

	class101() {
	}

	void method650(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method651(var1, var3);
		}
	}

	void method651(class42 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method278();
			if (this.field1014 == null) {
				this.field1014 = new int[var4][];
			}

			for (int var5 = var1.method278(); var5 != 255; var5 = var1.method278()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.method278()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method325();
				}

				this.field1014[var6] = var8;
				if (var7) {
					if (null == this.field1015) {
						this.field1015 = new Object[this.field1014.length][];
					}

					this.field1015[var6] = class451.method2251(var1, var8);
				}
			}
		}

	}

	void method652() {
	}
}
