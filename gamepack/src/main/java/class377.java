public class class377 {

	static class372 field3061;

	boolean field3041;

	boolean field3043;

	boolean field3055;

	boolean field3056;

	class339 field3042;

	class339 field3062;

	class528[] field3044;

	float field3040;

	float field3045;

	float field3046;

	float field3047;

	float field3048;

	float field3049;

	float field3050;

	float field3051;

	float field3052;

	float field3053;

	float field3060;

	float field3063;

	float[] field3057;

	int field3054;

	int field3058;

	int field3059;

	class377() {
		this.field3056 = true;
		this.field3054 = 0;
	}

	int method1997(class187 var1, int var2, byte var3) {
		int var4 = var1.method1145();
		int var5 = var1.method1096();
		class149[] var6 = new class149[] { class149.field1567, class149.field1565, class149.field1566, class149.field1570, class149.field1568, class149.field1569, class149.field1564, class149.field1571, class149.field1572 };
		class149 var7 = (class149) class433.method2167(var6, var5);
		if (null == var7) {
			var7 = class149.field1572;
		}
		this.field3042 = class339.method1792(var1.method1096());
		this.field3062 = class339.method1792(var1.method1096());
		this.field3055 = var1.method1096() != 0;
		this.field3044 = new class528[var4];
		class528 var9 = null;
		for (int var10 = 0; var10 < var4; ++var10) {
			class528 var8 = new class528();
			var8.method2563(var1, var2);
			this.field3044[var10] = var8;
			if (null != var9) {
				var9.field4183 = var8;
			}
			var9 = var8;
		}
		return var4;
	}

	void method1998() {
		this.field3058 = this.field3044[0].field4177;
		this.field3059 = this.field3044[this.method2002() - 1].field4177;
		this.field3057 = new float[this.method2004() + 1];
		for (int var2 = this.method2000(); var2 <= this.method1996(); ++var2) {
			this.field3057[var2 - this.method2000()] = class467.method2290(this, (float) var2);
		}
		this.field3044 = null;
		this.field3060 = class467.method2290(this, (float) (this.method2000() - 1));
		this.field3051 = class467.method2290(this, (float) (this.method1996() + 1));
	}

	public float method1999(int var1) {
		if (var1 < this.method2000()) {
			return this.field3060;
		} else {
			return var1 > this.method1996() ? this.field3051 : this.field3057[var1 - this.method2000()];
		}
	}

	int method2000() {
		return this.field3058;
	}

	int method1996() {
		return this.field3059;
	}

	int method2004() {
		return this.method1996() - this.method2000();
	}

	int method2003(float var1) {
		if (this.field3054 < 0 || (float) this.field3044[this.field3054].field4177 > var1 || this.field3044[this.field3054].field4183 != null && (float) this.field3044[this.field3054].field4183.field4177 <= var1) {
			if (var1 >= (float) this.method2000() && var1 <= (float) this.method1996()) {
				int var3 = this.method2002();
				int var4 = this.field3054;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;
					do {
						int var7 = var6 + var5 >> 1;
						if (var1 < (float) this.field3044[var7].field4177) {
							if (var1 > (float) this.field3044[var7 - 1].field4177) {
								var4 = var7 - 1;
								break;
							}
							var6 = var7 - 1;
						} else {
							if (var1 <= (float) this.field3044[var7].field4177) {
								var4 = var7;
								break;
							}
							if (var1 < (float) this.field3044[var7 + 1].field4177) {
								var4 = var7;
								break;
							}
							var5 = var7 + 1;
						}
					} while (var5 <= var6);
				}
				if (this.field3054 != var4) {
					this.field3054 = var4;
					this.field3056 = true;
				}
				return this.field3054;
			} else {
				return -1;
			}
		} else {
			return this.field3054;
		}
	}

	class528 method2001(float var1) {
		int var3 = this.method2003(var1);
		return var3 >= 0 && var3 < this.field3044.length ? this.field3044[var3] : null;
	}

	int method2002() {
		return null == this.field3044 ? 0 : this.field3044.length;
	}
}
