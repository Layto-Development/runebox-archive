public final class class443 extends class480 {
	boolean field3875;
	class393 field3899;
	double field3885;
	double field3890;
	double field3891;
	double field3892;
	double field3893;
	double field3894;
	double field3895;
	double field3897;
	int field3873;
	int field3874;
	int field3876;
	int field3877;
	int field3878;
	int field3879;
	int field3880;
	int field3881;
	int field3882;
	int field3883;
	int field3884;
	int field3886;
	int field3887;
	int field3888;
	int field3889;
	int field3896;
	int field3898;
	int field3900;
	int field3901;

	class443(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field3875 = false;
		this.field3900 = 0;
		this.field3901 = 0;
		this.field3886 = var1;
		this.field3874 = var2;
		this.field3884 = var3;
		this.field3873 = var4;
		this.field3882 = var5;
		this.field3898 = var6;
		this.field3883 = var7;
		this.field3876 = var8;
		this.field3888 = var9;
		this.field3887 = var10;
		this.field3878 = var11;
		this.field3875 = false;
		int var12 = class63.method481(this.field3886).field3417;
		if (var12 != -1) {
			this.field3899 = class114.method702(var12);
		} else {
			this.field3899 = null;
		}

	}

	class443(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field3889 = var10;
	}

	final void method2219(int var1, int var2, int var3, int var4) {
		this.field3879 = var1;
		this.field3880 = var2;
		this.field3881 = var3;
		double var6;
		if (!this.field3875) {
			var6 = (double)(this.field3879 - this.field3884);
			double var8 = (double)(this.field3880 - this.field3873);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field3897 = (double)this.field3884 + (double)this.field3888 * var6 / var10;
			this.field3890 = (double)this.field3873 + (double)this.field3888 * var8 / var10;
			this.field3891 = (double)this.field3882;
		}

		var6 = (double)(this.field3883 + 1 - var4);
		this.field3892 = ((double)this.field3879 - this.field3897) / var6;
		this.field3893 = ((double)this.field3880 - this.field3890) / var6;
		this.field3894 = Math.sqrt(this.field3893 * this.field3893 + this.field3892 * this.field3892);
		if (!this.field3875) {
			this.field3895 = -this.field3894 * Math.tan((double)this.field3876 * 0.02454369D);
		}

		this.field3885 = ((double)this.field3881 - this.field3891 - this.field3895 * var6) * 2.0D / (var6 * var6);
	}

	final void method2220(int var1) {
		this.field3875 = true;
		this.field3897 += this.field3892 * (double)var1;
		this.field3890 += (double)var1 * this.field3893;
		this.field3891 += this.field3885 * 0.5D * (double)var1 * (double)var1 + (double)var1 * this.field3895;
		this.field3895 += this.field3885 * (double)var1;
		this.field3877 = (int)(Math.atan2(this.field3892, this.field3893) * 325.949D) + 1024 & 2047;
		this.field3896 = (int)(Math.atan2(this.field3895, this.field3894) * 325.949D) & 2047;
		if (this.field3899 != null) {
			if (!this.field3899.method2062()) {
				this.field3901 += var1;

				while (true) {
					do {
						do {
							if (this.field3901 <= this.field3899.field3307[this.field3900]) {
								return;
							}

							this.field3901 -= this.field3899.field3307[this.field3900];
							++this.field3900;
						} while(this.field3900 < this.field3899.field3296.length);

						this.field3900 -= this.field3899.field3300;
					} while(this.field3900 >= 0 && this.field3900 < this.field3899.field3296.length);

					this.field3900 = 0;
				}
			} else {
				this.field3900 += var1;
				int var3 = this.field3899.method2059();
				if (this.field3900 >= var3) {
					this.field3900 = var3 - this.field3899.field3300;
				}
			}
		}

	}

	protected final class250 method2393() {
		class409 var2 = class63.method481(this.field3886);
		class250 var3 = var2.method2106(this.field3900);
		if (null == var3) {
			return null;
		} else {
			var3.method1473(this.field3896);
			return var3;
		}
	}

	public static int method2222(int var0) {
		return class482.field4096[var0];
	}
}
