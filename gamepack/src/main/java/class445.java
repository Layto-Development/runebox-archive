public class class445 {

	static final byte[] field3464;

	class187 field3462;

	int field3458;

	int field3465;

	int[] field3459;

	int[] field3460;

	int[] field3461;

	int[] field3463;

	long field3457;

	static {
		field3464 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	}

	class445() {
		this.field3462 = new class187((byte[]) null);
	}

	void method2211(byte[] var1) {
		this.field3462.field1830 = var1;
		this.field3462.field1832 = 10;
		int var2 = this.field3462.method1145();
		this.field3458 = this.field3462.method1145();
		this.field3465 = 500000;
		this.field3463 = new int[var2];
		class187 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field1832 += var5) {
			int var4 = this.field3462.method1100();
			var5 = this.field3462.method1100();
			if (var4 == 1297379947) {
				this.field3463[var3] = this.field3462.field1832;
				++var3;
			}
			var10000 = this.field3462;
		}
		this.field3457 = 0L;
		this.field3460 = new int[var2];
		for (var3 = 0; var3 < var2; ++var3) {
			this.field3460[var3] = this.field3463[var3];
		}
		this.field3461 = new int[var2];
		this.field3459 = new int[var2];
	}

	void method2198() {
		this.field3462.field1830 = null;
		this.field3463 = null;
		this.field3460 = null;
		this.field3461 = null;
		this.field3459 = null;
	}

	boolean method2212() {
		return this.field3462.field1830 != null;
	}

	int method2199() {
		return this.field3460.length;
	}

	void method2200(int var1) {
		this.field3462.field1832 = this.field3460[var1];
	}

	void method2201(int var1) {
		this.field3460[var1] = this.field3462.field1832;
	}

	void method2202() {
		this.field3462.field1832 = -1;
	}

	void method2203(int var1) {
		int var2 = this.field3462.method1083();
		int[] var10000 = this.field3461;
		var10000[var1] += var2;
	}

	int method2204(int var1) {
		int var2 = this.method2205(var1);
		return var2;
	}

	int method2205(int var1) {
		byte var2 = this.field3462.field1830[this.field3462.field1832];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3459[var1] = var5;
			++this.field3462.field1832;
		} else {
			var5 = this.field3459[var1];
		}
		if (var5 != 240 && var5 != 247) {
			return this.method2206(var1, var5);
		} else {
			int var3 = this.field3462.method1083();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field3462.field1830[this.field3462.field1832] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field3462.field1832;
					this.field3459[var1] = var4;
					return this.method2206(var1, var4);
				}
			}
			class187 var10000 = this.field3462;
			var10000.field1832 += var3;
			return 0;
		}
	}

	int method2206(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field3462.method1096();
			var4 = this.field3462.method1083();
			class187 var10000;
			if (var7 == 47) {
				var10000 = this.field3462;
				var10000.field1832 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field3462.method1152();
				var4 -= 3;
				int var6 = this.field3461[var1];
				this.field3457 += (long) var6 * (long) (this.field3465 - var5);
				this.field3465 = var5;
				var10000 = this.field3462;
				var10000.field1832 += var4;
				return 2;
			} else {
				var10000 = this.field3462;
				var10000.field1832 += var4;
				return 3;
			}
		} else {
			byte var3 = field3464[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field3462.method1096() << 8;
			}
			if (var3 >= 2) {
				var4 |= this.field3462.method1096() << 16;
			}
			return var4;
		}
	}

	long method2210(int var1) {
		return this.field3457 + (long) var1 * (long) this.field3465;
	}

	int method2207() {
		int var1 = this.field3460.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field3460[var4] >= 0 && this.field3461[var4] < var3) {
				var2 = var4;
				var3 = this.field3461[var4];
			}
		}
		return var2;
	}

	boolean method2208() {
		int var1 = this.field3460.length;
		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field3460[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	void method2209(long var1) {
		this.field3457 = var1;
		int var3 = this.field3460.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3461[var4] = 0;
			this.field3459[var4] = 0;
			this.field3462.field1832 = this.field3463[var4];
			this.method2203(var4);
			this.field3460[var4] = this.field3462.field1832;
		}
	}
}
