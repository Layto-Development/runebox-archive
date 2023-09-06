public class class300 extends class218 {
	static class215 field2749;
	static class344 field2748;
	int[][] field2750;
	Object[][] field2752;
	public int field2751;

	static {
		field2748 = new class344(64);
	}

	class300() {
		this.field2751 = -1;
	}

	void method1696(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method1693(var1, var3);
		}
	}

	public Object[] method1695(int var1) {
		return null == this.field2752 ? null : this.field2752[var1];
	}

	void method1693(class42 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method278();
			if (null == this.field2752) {
				this.field2752 = new Object[var4][];
				this.field2750 = new int[var4][];
			}

			for (int var5 = var1.method278(); var5 != 255; var5 = var1.method278()) {
				int var6 = var1.method278();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method325();
				}

				this.field2752[var5] = class451.method2251(var1, var7);
				this.field2750[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field2751 = var1.method294();
		}

	}

	void method1694() {
	}
}
