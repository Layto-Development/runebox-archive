public class class541 extends class310 {

	public static class106 field4288;

	public static class338 field4293;

	static class84[] field4283;

	public boolean field4284;

	public int field4281;

	public int field4282;

	public int field4285;

	public int field4286;

	public int field4287;

	public int field4289;

	public int field4290;

	public int field4291;

	public int field4292;

	static {
		field4288 = new class106(64);
	}

	public class541() {
		this.field4282 = 0;
		this.field4281 = -1;
		this.field4284 = true;
		this.field4285 = -1;
	}

	public void method2606() {
		if (this.field4285 != -1) {
			this.method2608(this.field4285);
			this.field4290 = this.field4286;
			this.field4289 = this.field4287;
			this.field4291 = this.field4292;
		}
		this.method2608(this.field4282);
	}

	public void method2607(class187 var1, int var2) {
		while (true) {
			int var4 = var1.method1096();
			if (var4 == 0) {
				return;
			}
			this.method2605(var1, var4, var2);
		}
	}

	void method2605(class187 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field4282 = var1.method1152();
		} else if (var2 == 2) {
			this.field4281 = var1.method1096();
		} else if (var2 == 5) {
			this.field4284 = false;
		} else if (var2 == 7) {
			this.field4285 = var1.method1152();
		} else if (var2 == 8) {
		}
	}

	void method2608(int var1) {
		double var3 = (double) (var1 >> 16 & 255) / 256.0D;
		double var5 = (double) (var1 >> 8 & 255) / 256.0D;
		double var7 = (double) (var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}
		if (var7 < var9) {
			var9 = var7;
		}
		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}
		if (var7 > var11) {
			var11 = var7;
		}
		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var11 + var9);
			}
			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}
			if (var11 == var3) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var11 == var7) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}
		var13 /= 6.0D;
		this.field4286 = (int) (var13 * 256.0D);
		this.field4287 = (int) (var15 * 256.0D);
		this.field4292 = (int) (var17 * 256.0D);
		if (this.field4287 < 0) {
			this.field4287 = 0;
		} else if (this.field4287 > 255) {
			this.field4287 = 255;
		}
		if (this.field4292 < 0) {
			this.field4292 = 0;
		} else if (this.field4292 > 255) {
			this.field4292 = 255;
		}
	}

	public static void method2610(class338 var0) {
		field4293 = var0;
	}

	public static void method2609() {
		field4288.method645();
	}
}
