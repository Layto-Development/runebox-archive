public class class403 implements class213 {
	public final class532 field3382;

	public class403(class424 var1) {
		this(new class339(var1));
	}

	class403(class339 var1) {
		this.field3382 = var1;
	}

	public int method2084(int var1) {
		return this.field3382.method2566(var1);
	}

	static float method2085(class415 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3;
			if (var0.field3472 == var1) {
				var3 = 0.0F;
			} else if (var1 == var0.field3473) {
				var3 = 1.0F;
			} else {
				var3 = (var1 - var0.field3472) / (var0.field3473 - var0.field3472);
			}

			float var4;
			if (var0.field3469) {
				var4 = var3;
			} else {
				class525.field4243[3] = var0.field3471;
				class525.field4243[2] = var0.field3476;
				class525.field4243[1] = var0.field3475;
				class525.field4243[0] = var0.field3474 - var3;
				class525.field4244[0] = 0.0F;
				class525.field4244[1] = 0.0F;
				class525.field4244[2] = 0.0F;
				class525.field4244[3] = 0.0F;
				class525.field4244[4] = 0.0F;
				int var5 = class417.method2145(class525.field4243, 3, 0.0F, true, 1.0F, true, class525.field4244);
				if (var5 == 1) {
					var4 = class525.field4244[0];
				} else {
					var4 = 0.0F;
				}
			}

			return var4 * (var0.field3478 + var4 * (var4 * var0.field3466 + var0.field3479)) + var0.field3489;
		}
	}
}
