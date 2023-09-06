public class class10 {
	static final byte[] field357;
	class42 field355;
	int field351;
	int field358;
	int[] field352;
	int[] field353;
	int[] field354;
	int[] field356;
	long field350;

	static {
		field357 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	class10() {
		this.field355 = new class42((byte[])null);
	}

	void method104(byte[] var1) {
		this.field355.field525 = var1;
		this.field355.field527 = 10;
		int var2 = this.field355.method327();
		this.field351 = this.field355.method327();
		this.field358 = 500000;
		this.field356 = new int[var2];

		class42 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field527 += var5) {
			int var4 = this.field355.method282();
			var5 = this.field355.method282();
			if (var4 == 1297379947) {
				this.field356[var3] = this.field355.field527;
				++var3;
			}

			var10000 = this.field355;
		}

		this.field350 = 0L;
		this.field353 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field353[var3] = this.field356[var3];
		}

		this.field354 = new int[var2];
		this.field352 = new int[var2];
	}

	void method91() {
		this.field355.field525 = null;
		this.field356 = null;
		this.field353 = null;
		this.field354 = null;
		this.field352 = null;
	}

	boolean method105() {
		return this.field355.field525 != null;
	}

	int method92() {
		return this.field353.length;
	}

	void method93(int var1) {
		this.field355.field527 = this.field353[var1];
	}

	void method94(int var1) {
		this.field353[var1] = this.field355.field527;
	}

	void method95() {
		this.field355.field527 = -1;
	}

	void method96(int var1) {
		int var2 = this.field355.method265();
		int[] var10000 = this.field354;
		var10000[var1] += var2;
	}

	int method97(int var1) {
		int var2 = this.method98(var1);
		return var2;
	}

	int method98(int var1) {
		byte var2 = this.field355.field525[this.field355.field527];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field352[var1] = var5;
			++this.field355.field527;
		} else {
			var5 = this.field352[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method99(var1, var5);
		} else {
			int var3 = this.field355.method265();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field355.field525[this.field355.field527] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field355.field527;
					this.field352[var1] = var4;
					return this.method99(var1, var4);
				}
			}

			class42 var10000 = this.field355;
			var10000.field527 += var3;
			return 0;
		}
	}

	int method99(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field355.method278();
			var4 = this.field355.method265();
			class42 var10000;
			if (var7 == 47) {
				var10000 = this.field355;
				var10000.field527 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field355.method334();
				var4 -= 3;
				int var6 = this.field354[var1];
				this.field350 += (long)var6 * (long)(this.field358 - var5);
				this.field358 = var5;
				var10000 = this.field355;
				var10000.field527 += var4;
				return 2;
			} else {
				var10000 = this.field355;
				var10000.field527 += var4;
				return 3;
			}
		} else {
			byte var3 = field357[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field355.method278() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field355.method278() << 16;
			}

			return var4;
		}
	}

	long method103(int var1) {
		return this.field350 + (long)var1 * (long)this.field358;
	}

	int method100() {
		int var1 = this.field353.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field353[var4] >= 0 && this.field354[var4] < var3) {
				var2 = var4;
				var3 = this.field354[var4];
			}
		}

		return var2;
	}

	boolean method101() {
		int var1 = this.field353.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field353[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	void method102(long var1) {
		this.field350 = var1;
		int var3 = this.field353.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field354[var4] = 0;
			this.field352[var4] = 0;
			this.field355.field527 = this.field356[var4];
			this.method96(var4);
			this.field353[var4] = this.field355.field527;
		}

	}
}
