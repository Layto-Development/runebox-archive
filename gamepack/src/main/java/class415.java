public class class415 {
	static class317 field3487;
	boolean field3467;
	boolean field3469;
	boolean field3481;
	boolean field3482;
	class224 field3468;
	class224 field3488;
	class98[] field3470;
	float field3466;
	float field3471;
	float field3472;
	float field3473;
	float field3474;
	float field3475;
	float field3476;
	float field3477;
	float field3478;
	float field3479;
	float field3486;
	float field3489;
	float[] field3483;
	int field3480;
	int field3484;
	int field3485;

	class415() {
		this.field3482 = true;
		this.field3480 = 0;
	}

	int method2136(class42 var1, int var2, byte var3) {
		int var4 = var1.method327();
		int var5 = var1.method278();
		class158[] var6 = new class158[]{class158.field1469, class158.field1467, class158.field1468, class158.field1472, class158.field1470, class158.field1471, class158.field1466, class158.field1473, class158.field1474};
		class158 var7 = (class158)class451.method2249(var6, var5);
		if (null == var7) {
			var7 = class158.field1474;
		}

		this.field3468 = class398.method2077(var1.method278());
		this.field3488 = class398.method2077(var1.method278());
		boolean var10001;
		if (var1.method278() != 0) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			var10001 = true;
		} else {
			var10001 = false;
		}

		this.field3481 = var10001;
		this.field3470 = new class98[var4];
		class98 var9 = null;

		for (int var10 = 0; var10 < var4; ++var10) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			class98 var8 = new class98();
			var8.method645(var1, var2);
			this.field3470[var10] = var8;
			if (null != var9) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				var9.field992 = var8;
			}

			var9 = var8;
		}

		return var4;
	}

	void method2137() {
		this.field3484 = this.field3470[0].field986;
		this.field3485 = this.field3470[this.method2141() - 1].field986;
		this.field3483 = new float[this.method2143() + 1];

		for (int var2 = this.method2139(); var2 <= this.method2135(); ++var2) {
			this.field3483[var2 - this.method2139()] = class43.method341(this, (float)var2);
		}

		this.field3470 = null;
		this.field3486 = class43.method341(this, (float)(this.method2139() - 1));
		this.field3477 = class43.method341(this, (float)(this.method2135() + 1));
	}

	public float method2138(int var1) {
		if (var1 < this.method2139()) {
			return this.field3486;
		} else {
			return var1 > this.method2135() ? this.field3477 : this.field3483[var1 - this.method2139()];
		}
	}

	int method2139() {
		return this.field3484;
	}

	int method2135() {
		return this.field3485;
	}

	int method2143() {
		return this.method2135() - this.method2139();
	}

	int method2142(float var1) {
		if (this.field3480 < 0 || (float)this.field3470[this.field3480].field986 > var1 || this.field3470[this.field3480].field992 != null && (float)this.field3470[this.field3480].field992.field986 <= var1) {
			if (var1 >= (float)this.method2139() && var1 <= (float)this.method2135()) {
				int var3 = this.method2141();
				int var4 = this.field3480;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;

					do {
						int var7 = var6 + var5 >> 1;
						if (var1 < (float)this.field3470[var7].field986) {
							if (var1 > (float)this.field3470[var7 - 1].field986) {
								var4 = var7 - 1;
								break;
							}

							var6 = var7 - 1;
						} else {
							if (var1 <= (float)this.field3470[var7].field986) {
								var4 = var7;
								break;
							}

							if (var1 < (float)this.field3470[var7 + 1].field986) {
								var4 = var7;
								break;
							}

							var5 = var7 + 1;
						}
					} while(var5 <= var6);
				}

				if (this.field3480 != var4) {
					this.field3480 = var4;
					this.field3482 = true;
				}

				return this.field3480;
			} else {
				return -1;
			}
		} else {
			return this.field3480;
		}
	}

	class98 method2140(float var1) {
		int var3 = this.method2142(var1);
		return var3 >= 0 && var3 < this.field3470.length ? this.field3470[var3] : null;
	}

	int method2141() {
		return null == this.field3470 ? 0 : this.field3470.length;
	}
}
