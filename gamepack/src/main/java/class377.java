public class class377 {
	int field3190;
	int field3193;
	int field3194;
	int field3195;
	int field3196;
	int field3197;
	int field3198;
	int field3199;
	int field3200;
	int[] field3191;
	int[] field3192;

	class377() {
		this.field3195 = 2;
		this.field3191 = new int[2];
		this.field3192 = new int[2];
		this.field3191[0] = 0;
		this.field3191[1] = 65535;
		this.field3192[0] = 0;
		this.field3192[1] = 65535;
	}

	final void method2014(class42 var1) {
		this.field3194 = var1.method278();
		this.field3193 = var1.method282();
		this.field3190 = var1.method282();
		this.method2015(var1);
	}

	final void method2015(class42 var1) {
		this.field3195 = var1.method278();
		this.field3191 = new int[this.field3195];
		this.field3192 = new int[this.field3195];

		for (int var2 = 0; var2 < this.field3195; ++var2) {
			this.field3191[var2] = var1.method327();
			this.field3192[var2] = var1.method327();
		}

	}

	final void method2013() {
		this.field3197 = 0;
		this.field3199 = 0;
		this.field3198 = 0;
		this.field3196 = 0;
		this.field3200 = 0;
	}

	final int method2012(int var1) {
		if (this.field3200 >= this.field3197) {
			this.field3196 = this.field3192[this.field3199++] << 15;
			if (this.field3199 >= this.field3195) {
				this.field3199 = this.field3195 - 1;
			}

			this.field3197 = (int)((double)this.field3191[this.field3199] / 65536.0D * (double)var1);
			if (this.field3197 > this.field3200) {
				this.field3198 = ((this.field3192[this.field3199] << 15) - this.field3196) / (this.field3197 - this.field3200);
			}
		}

		this.field3196 += this.field3198;
		++this.field3200;
		return this.field3196 - this.field3198 >> 15;
	}
}
