import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bp")
public class class538 {
	@ObfInfo(name = "ae", desc = "[Lcq;")
	class75[] field4273;
	@ObfInfo(name = "ao", desc = "I")
	int field4274;
	@ObfInfo(name = "at", desc = "I")
	int field4275;

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	class538(class280 var1) {
		this.field4273 = new class75[10];

		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.method1492();
			if (var3 != 0) {
				--var1.field2254;
				this.field4273[var2] = new class75();
				this.field4273[var2].method514(var1);
			}
		}

		this.field4274 = var1.method1541();
		this.field4275 = var1.method1541();
	}

	@ObfInfo(name = "ae", desc = "()Lbu;")
	public class62 method2588() {
		byte[] var1 = this.method2591();
		return new class62(22050, var1, this.field4274 * 22050 / 1000, this.field4275 * 22050 / 1000);
	}

	@ObfInfo(name = "ao", desc = "()I")
	public final int method2589() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field4273[var2] != null && this.field4273[var2].field815 / 20 < var1) {
				var1 = this.field4273[var2].field815 / 20;
			}
		}

		if (this.field4274 < this.field4275 && this.field4274 / 20 < var1) {
			var1 = this.field4274 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.field4273[var2] != null) {
					class75 var10000 = this.field4273[var2];
					var10000.field815 -= var1 * 20;
				}
			}

			if (this.field4274 < this.field4275) {
				this.field4274 -= var1 * 20;
				this.field4275 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfInfo(name = "at", desc = "()[B")
	final byte[] method2591() {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.field4273[var2] != null && this.field4273[var2].field807 + this.field4273[var2].field815 > var1) {
				var1 = this.field4273[var2].field807 + this.field4273[var2].field815;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000;
			byte[] var3 = new byte[var2];

			for (int var4 = 0; var4 < 10; ++var4) {
				if (this.field4273[var4] != null) {
					int var5 = this.field4273[var4].field807 * 22050 / 1000;
					int var6 = this.field4273[var4].field815 * 22050 / 1000;
					int[] var7 = this.field4273[var4].method513(var5, this.field4273[var4].field807);

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

	@ObfInfo(name = "au", desc = "(Lnu;II)Lbp;")
	public static class538 method2590(class437 var0, int var1, int var2) {
		byte[] var3 = var0.method2267(var1, var2);
		return var3 == null ? null : new class538(new class280(var3));
	}
}
