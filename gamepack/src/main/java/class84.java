public class class84 {
	class279[] field864;
	int field865;
	int field866;

	class84(class42 var1) {
		this.field864 = new class279[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method278();
			if (var3 != 0) {
				--var1.field527;
				this.field864[var2] = new class279();
				this.field864[var2].method1597(var1);
			}
		}

		this.field865 = var1.method327();
		this.field866 = var1.method327();
	}

	public class352 method550() {
		byte[] var1 = this.method553();
		return new class352(22050, var1, this.field865 * 22050 / 1000, this.field866 * 22050 / 1000);
	}

	public final int method551() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field864[var2] != null && this.field864[var2].field2486 / 20 < var1) {
				var1 = this.field864[var2].field2486 / 20;
			}
		}

		if (this.field865 < this.field866 && this.field865 / 20 < var1) {
			var1 = this.field865 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field864[var2] != null) {
					class279 var10000 = this.field864[var2];
					var10000.field2486 -= var1 * 20;
				}
			}

			if (this.field865 < this.field866) {
				this.field865 -= var1 * 20;
				this.field866 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	final byte[] method553() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field864[var2] != null && this.field864[var2].field2478 + this.field864[var2].field2486 > var1) {
				var1 = this.field864[var2].field2478 + this.field864[var2].field2486;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field864[var4] != null) {
					int var5 = this.field864[var4].field2478 * 22050 / 1000;
					int var6 = this.field864[var4].field2486 * 22050 / 1000;
					int[] var7 = this.field864[var4].method1596(var5, this.field864[var4].field2478);

					for (int var8 = 0; var8 < var5; ++var8) {
						int var9 = var3[var8 + var6] + (var7[var8] >> 8);
						if ((var9 + 128 & -256) != 0) {
							var9 = var9 >> 31 ^ 127;
						}

						var3[var8 + var6] = (byte)var9;
					}
				}
			}

			return var3;
		}
	}

	public static class84 method552(class215 var0, int var1, int var2) {
		byte[] var3 = var0.method1212(var1, var2);
		return var3 == null ? null : new class84(new class42(var3));
	}
}
