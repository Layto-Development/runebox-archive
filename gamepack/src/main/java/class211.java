import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "lq")
public class class211 {
	@ObfInfo(name = "af", desc = "[B")
	static final byte[] field1887;
	@ObfInfo(name = "au", desc = "Ltm;")
	class280 field1885;
	@ObfInfo(name = "ae", desc = "I")
	int field1881;
	@ObfInfo(name = "az", desc = "I")
	int field1888;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field1882;
	@ObfInfo(name = "at", desc = "[I")
	int[] field1883;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field1884;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field1886;
	@ObfInfo(name = "aa", desc = "J")
	long field1880;

	static {
		field1887 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class211() {
		this.field1885 = new class280((byte[])null);
	}

	@ObfInfo(name = "au", desc = "([B)V")
	void method1179(byte[] var1) {
		this.field1885.field2252 = var1;
		this.field1885.field2254 = 10;
		int var2 = this.field1885.method1541();
		this.field1881 = this.field1885.method1541();
		this.field1888 = 500000;
		this.field1886 = new int[var2];

		class280 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field2254 += var5) {
			int var4 = this.field1885.method1496();
			var5 = this.field1885.method1496();
			if (var4 == 1297379947) {
				this.field1886[var3] = this.field1885.field2254;
				++var3;
			}

			var10000 = this.field1885;
		}

		this.field1880 = 0L;
		this.field1883 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field1883[var3] = this.field1886[var3];
		}

		this.field1884 = new int[var2];
		this.field1882 = new int[var2];
	}

	@ObfInfo(name = "ae", desc = "()V")
	void method1166() {
		this.field1885.field2252 = null;
		this.field1886 = null;
		this.field1883 = null;
		this.field1884 = null;
		this.field1882 = null;
	}

	@ObfInfo(name = "ao", desc = "()Z")
	boolean method1180() {
		return this.field1885.field2252 != null;
	}

	@ObfInfo(name = "at", desc = "()I")
	int method1167() {
		return this.field1883.length;
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	void method1168(int var1) {
		this.field1885.field2254 = this.field1883[var1];
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	void method1169(int var1) {
		this.field1883[var1] = this.field1885.field2254;
	}

	@ObfInfo(name = "az", desc = "()V")
	void method1170() {
		this.field1885.field2254 = -1;
	}

	@ObfInfo(name = "ap", desc = "(I)V")
	void method1171(int var1) {
		int var2 = this.field1885.method1479();
		int[] var10000 = this.field1884;
		var10000[var1] += var2;
	}

	@ObfInfo(name = "aa", desc = "(I)I")
	int method1172(int var1) {
		int var2 = this.method1173(var1);
		return var2;
	}

	@ObfInfo(name = "af", desc = "(I)I")
	int method1173(int var1) {
		byte var2 = this.field1885.field2252[this.field1885.field2254];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field1882[var1] = var5;
			++this.field1885.field2254;
		} else {
			var5 = this.field1882[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method1174(var1, var5);
		} else {
			int var3 = this.field1885.method1479();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field1885.field2252[this.field1885.field2254] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field1885.field2254;
					this.field1882[var1] = var4;
					return this.method1174(var1, var4);
				}
			}

			class280 var10000 = this.field1885;
			var10000.field2254 += var3;
			return 0;
		}
	}

	@ObfInfo(name = "ad", desc = "(II)I")
	int method1174(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field1885.method1492();
			var4 = this.field1885.method1479();
			class280 var10000;
			if (var7 == 47) {
				var10000 = this.field1885;
				var10000.field2254 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field1885.method1548();
				var4 -= 3;
				int var6 = this.field1884[var1];
				this.field1880 += (long)var6 * (long)(this.field1888 - var5);
				this.field1888 = var5;
				var10000 = this.field1885;
				var10000.field2254 += var4;
				return 2;
			} else {
				var10000 = this.field1885;
				var10000.field2254 += var4;
				return 3;
			}
		} else {
			byte var3 = field1887[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field1885.method1492() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field1885.method1492() << 16;
			}

			return var4;
		}
	}

	@ObfInfo(name = "aq", desc = "(I)J")
	long method1178(int var1) {
		return this.field1880 + (long)var1 * (long)this.field1888;
	}

	@ObfInfo(name = "al", desc = "()I")
	int method1175() {
		int var1 = this.field1883.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field1883[var4] >= 0 && this.field1884[var4] < var3) {
				var2 = var4;
				var3 = this.field1884[var4];
			}
		}

		return var2;
	}

	@ObfInfo(name = "an", desc = "()Z")
	boolean method1176() {
		int var1 = this.field1883.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field1883[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfInfo(name = "ar", desc = "(J)V")
	void method1177(long var1) {
		this.field1880 = var1;
		int var3 = this.field1883.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field1884[var4] = 0;
			this.field1882[var4] = 0;
			this.field1885.field2254 = this.field1886[var4];
			this.method1171(var4);
			this.field1883[var4] = this.field1885.field2254;
		}

	}
}
