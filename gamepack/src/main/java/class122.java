public class class122 extends class310 {

	public static class106 field1440;

	public static class338 field1439;

	int field1441;

	public int field1442;

	public int field1443;

	public int field1444;

	public int field1445;

	static {
		field1440 = new class106(64);
	}

	public class122() {
		this.field1441 = 0;
	}

	public void method840() {
		this.method843(this.field1441);
	}

	public void method841(class187 var1, int var2) {
		while (true) {
			int var4 = var1.method1096();
			if (var4 == 0) {
				return;
			}
			this.method842(var1, var4, var2);
		}
	}

	void method842(class187 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field1441 = var1.method1152();
		}
	}

	void method843(int var1) {
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
				var15 = (var11 - var9) / (var9 + var11);
			}
			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}
			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var11 == var7) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}
		var13 /= 6.0D;
		this.field1443 = (int) (var15 * 256.0D);
		this.field1442 = (int) (var17 * 256.0D);
		if (this.field1443 < 0) {
			this.field1443 = 0;
		} else if (this.field1443 > 255) {
			this.field1443 = 255;
		}
		if (this.field1442 < 0) {
			this.field1442 = 0;
		} else if (this.field1442 > 255) {
			this.field1442 = 255;
		}
		if (var17 > 0.5D) {
			this.field1444 = (int) ((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field1444 = (int) (var15 * var17 * 512.0D);
		}
		if (this.field1444 < 1) {
			this.field1444 = 1;
		}
		this.field1445 = (int) (var13 * (double) this.field1444);
	}

	public static void method844(class338 var0) {
		field1439 = var0;
	}
}
