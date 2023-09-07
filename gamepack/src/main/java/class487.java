public class class487 {

	class287[] field3906;

	int field3907;

	int field3908;

	class487(class187 var1) {
		this.field3906 = new class287[10];
		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method1096();
			if (var3 != 0) {
				--var1.field1832;
				this.field3906[var2] = new class287();
				this.field3906[var2].method1559(var1);
			}
		}
		this.field3907 = var1.method1145();
		this.field3908 = var1.method1145();
	}

	public class529 method2344() {
		byte[] var1 = this.method2347();
		return new class529(22050, var1, this.field3907 * 22050 / 1000, this.field3908 * 22050 / 1000);
	}

	public final int method2345() {
		int var1 = 9999999;
		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field3906[var2] != null && this.field3906[var2].field2317 / 20 < var1) {
				var1 = this.field3906[var2].field2317 / 20;
			}
		}
		if (this.field3907 < this.field3908 && this.field3907 / 20 < var1) {
			var1 = this.field3907 / 20;
		}
		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field3906[var2] != null) {
					class287 var10000 = this.field3906[var2];
					var10000.field2317 -= var1 * 20;
				}
			}
			if (this.field3907 < this.field3908) {
				this.field3907 -= var1 * 20;
				this.field3908 -= var1 * 20;
			}
			return var1;
		} else {
			return 0;
		}
	}

	final byte[] method2347() {
		int var1 = 0;
		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field3906[var2] != null && this.field3906[var2].field2309 + this.field3906[var2].field2317 > var1) {
				var1 = this.field3906[var2].field2309 + this.field3906[var2].field2317;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];
			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field3906[var4] != null) {
					int var5 = this.field3906[var4].field2309 * 22050 / 1000;
					int var6 = this.field3906[var4].field2317 * 22050 / 1000;
					int[] var7 = this.field3906[var4].method1558(var5, this.field3906[var4].field2309);
					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if ((var9 + 128 & -256) != 0) {
							var9 = var9 >> 31 ^ 127;
						}
						var3[var8 + var6] = (byte) var9;
					}
				}
			}
			return var3;
		}
	}

	public static class487 method2346(class338 var0, int var1, int var2) {
		byte[] var3 = var0.method1762(var1, var2);
		return var3 == null ? null : new class487(new class187(var3));
	}
}
