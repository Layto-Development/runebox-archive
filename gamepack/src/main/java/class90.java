import java.util.Arrays;

public class class90 {
	class55 field888;
	long field890;
	public long field889;

	public class90(class42 var1) {
		this.field889 = -1L;
		this.field888 = new class55();
		this.method608(var1);
	}

	void method608(class42 var1) {
		this.field890 = var1.method283();
		this.field889 = var1.method283();

		for (int var3 = var1.method278(); var3 != 0; var3 = var1.method278()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class214(this);
			} else if (var3 == 4) {
				var4 = new class450(this);
			} else if (var3 == 3) {
				var4 = new class489(this);
			} else if (var3 == 2) {
				var4 = new class421(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new class89(this);
			}

			((class40)var4).method258(var1);
			this.field888.method403((class462)var4);
		}

	}

	public void method609(class419 var1) {
		if (var1.field3987 == this.field890 && var1.field3503 == this.field889) {
			for (class40 var3 = (class40)this.field888.method409(); null != var3; var3 = (class40)this.field888.method405()) {
				var3.method259(var1);
			}

			++var1.field3503;
		} else {
			throw new RuntimeException("");
		}
	}

	static void method611(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var2 = (float)(1.0D + (double)(var0[0] * (var0[0] - 2.0F + var0[1])) + ((double)var0[1] - 2.0D) * (double)var0[1]);
			if (var2 + class525.field4241 > 0.0F) {
				if (class525.field4241 + var0[0] < 1.3333334F) {
					float var3 = var0[0] - 2.0F;
					float var4 = var0[0] - 1.0F;
					float var5 = (float)Math.sqrt((double)(var3 * var3 - var4 * 4.0F * var4));
					float var6 = 0.5F * (var5 + -var3);
					if (var0[1] + class525.field4241 > var6) {
						var0[1] = var6 - class525.field4241;
					} else {
						var6 = (-var3 - var5) * 0.5F;
						if (var0[1] < var6 + class525.field4241) {
							var0[1] = class525.field4241 + var6;
						}
					}
				} else {
					var0[0] = 1.3333334F - class525.field4241;
					var0[1] = 0.33333334F - class525.field4241;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	public static void method610(class60 var0, class363 var1, boolean var2) {
		var0.field686 = 7;
		var0.field700 = new class363(var1);
		if (!var2) {
			var0.field700.field3052 = Arrays.copyOf(var0.field700.field3065, var0.field700.field3065.length);
			var0.field700.method1959();
		}

	}
}
