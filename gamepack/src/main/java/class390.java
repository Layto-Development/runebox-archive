import java.util.Arrays;

public class class390 {

	class292 field3106;

	long field3108;

	public long field3107;

	public class390(class187 var1) {
		this.field3107 = -1L;
		this.field3106 = new class292();
		this.method2024(var1);
	}

	void method2024(class187 var1) {
		this.field3108 = var1.method1101();
		this.field3107 = var1.method1101();
		for (int var3 = var1.method1096(); var3 != 0; var3 = var1.method1096()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class527(this);
			} else if (var3 == 4) {
				var4 = new class302(this);
			} else if (var3 == 3) {
				var4 = new class306(this);
			} else if (var3 == 2) {
				var4 = new class70(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}
				var4 = new class379(this);
			}
			((class52) var4).method207(var1);
			this.field3106.method1579((class77) var4);
		}
	}

	public void method2025(class345 var1) {
		if (var1.field785 == this.field3108 && var1.field2619 == this.field3107) {
			for (class52 var3 = (class52) this.field3106.method1585(); null != var3; var3 = (class52) this.field3106.method1581()) {
				var3.method208(var1);
			}
			++var1.field2619;
		} else {
			throw new RuntimeException("");
		}
	}

	static void method2027(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}
		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}
		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var2 = (float) (1.0D + (double) (var0[0] * (var0[0] - 2.0F + var0[1])) + ((double) var0[1] - 2.0D) * (double) var0[1]);
			if (var2 + class467.field3702 > 0.0F) {
				if (class467.field3702 + var0[0] < 1.3333334F) {
					float var3 = var0[0] - 2.0F;
					float var4 = var0[0] - 1.0F;
					float var5 = (float) Math.sqrt((double) (var3 * var3 - var4 * 4.0F * var4));
					float var6 = 0.5F * (var5 + -var3);
					if (var0[1] + class467.field3702 > var6) {
						var0[1] = var6 - class467.field3702;
					} else {
						var6 = (-var3 - var5) * 0.5F;
						if (var0[1] < var6 + class467.field3702) {
							var0[1] = class467.field3702 + var6;
						}
					}
				} else {
					var0[0] = 1.3333334F - class467.field3702;
					var0[1] = 0.33333334F - class467.field3702;
				}
			}
		}
		var0[1] = 1.0F - var0[1];
	}

	public static void method2026(class354 var0, class506 var1, boolean var2) {
		var0.field2730 = 7;
		var0.field2744 = new class506(var1);
		if (!var2) {
			var0.field2744.field4056 = Arrays.copyOf(var0.field2744.field4069, var0.field2744.field4069.length);
			var0.field2744.method2451();
		}
	}
}
