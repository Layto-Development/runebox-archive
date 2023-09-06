public class class541 {
	boolean field4289;
	int field4281;
	int field4282;
	int field4283;
	int field4284;
	int field4285;
	int field4286;
	int field4287;
	int field4288;
	int field4290;
	int field4291;
	int field4292;
	int field4293;

	public class541() {
		this.field4282 = 0;
		this.field4288 = 0;
	}

	public void method2590(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field4293 = var1;
		this.field4281 = var2;
		this.field4283 = var3;
		this.field4284 = var4;
		this.field4285 = var5;
		this.field4286 = var6;
		this.field4282 = var7;
		this.field4288 = var8;
		this.field4289 = var9;
	}

	public void method2591(int var1, int var2, int var3, int var4) {
		this.field4290 = var1;
		this.field4291 = var2;
		this.field4292 = var3;
		this.field4287 = var4;
	}

	public void method2592(class246 var1, class253 var2, byte var3) {
		if (var2 == null) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}
		} else {
			int var4 = var2.field2066;
			int var5 = Math.min(this.field4284, (int)((float)var4 * 0.9F));
			int var6 = var1.method1419(this.field4283);
			int var7 = var1.method1420(this.field4284);
			int var8 = this.field4293 - this.field4285 + var6;
			int var9 = this.field4281 - this.field4286 + var7 + var4;
			class266.method1555(this.field4293, this.field4281, this.field4293 + this.field4283, this.field4284 + this.field4281);
			int var10 = this.field4288;
			int var11 = this.field4282;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			class506 var22 = var1.method1406(0, var10);
			class506 var13 = var1.method1406(var10, var11);
			class506 var14 = var1.method1406(var11, var1.method1400());
			class506 var15 = var1.method1406(0, this.field4282);
			int var17;
			int var19;
			if (!var13.method2433()) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				int var16 = var2.field2070 + var2.field2071;

				for (var17 = 0; var17 < var13.method2434(); ++var17) {
					if (var3 >= -1) {
						throw new IllegalStateException();
					}

					class472 var18 = var13.method2436(var17);
					var19 = var8 + var18.field4024;
					int var20 = var2.method1321(var18.field4025);
					int var21 = var9 + var18.field4027 - var4;
					class266.method1548(var19, var21, var20, var16, this.field4287);
				}
			}

			if (!var22.method2433()) {
				if (var3 >= -1) {
					return;
				}

				var2.method1301(var22, var8, var9, this.field4290, this.field4291, -1);
			}

			if (!var13.method2433()) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				var2.method1301(var13, var8, var9, this.field4292, this.field4291, -1);
			}

			if (!var14.method2433()) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				var2.method1301(var14, var8, var9, this.field4290, this.field4291, -1);
			}

			if (this.field4289) {
				class180 var23 = var15.method2438();
				var17 = var8 + (Integer)var23.field1712;
				int var24 = var9 + (Integer)var23.field1711;
				var19 = var24 - var5;
				class266.method1550(var17, var24, var17, var19, this.field4290);
				if (this.field4291 != -1) {
					if (var3 >= -1) {
						return;
					}

					class266.method1550(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field4291);
				}
			}

		}
	}
}
