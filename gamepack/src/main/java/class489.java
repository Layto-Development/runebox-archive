public final class class489 extends class189 {

	boolean field3922;

	class67 field3946;

	double field3932;

	double field3937;

	double field3938;

	double field3939;

	double field3940;

	double field3941;

	double field3942;

	double field3944;

	int field3920;

	int field3921;

	int field3923;

	int field3924;

	int field3925;

	int field3926;

	int field3927;

	int field3928;

	int field3929;

	int field3930;

	int field3931;

	int field3933;

	int field3934;

	int field3935;

	int field3936;

	int field3943;

	int field3945;

	int field3947;

	int field3948;

	class489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field3922 = false;
		this.field3947 = 0;
		this.field3948 = 0;
		this.field3933 = var1;
		this.field3921 = var2;
		this.field3931 = var3;
		this.field3920 = var4;
		this.field3929 = var5;
		this.field3945 = var6;
		this.field3930 = var7;
		this.field3923 = var8;
		this.field3935 = var9;
		this.field3934 = var10;
		this.field3925 = var11;
		this.field3922 = false;
		int var12 = class138.method872(this.field3933).field1522;
		if (var12 != -1) {
			this.field3946 = class67.method308(var12);
		} else {
			this.field3946 = null;
		}
	}

	class489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field3936 = var10;
	}

	final void method2352(int var1, int var2, int var3, int var4) {
		this.field3926 = var1;
		this.field3927 = var2;
		this.field3928 = var3;
		double var6;
		if (!this.field3922) {
			var6 = (double) (this.field3926 - this.field3931);
			double var8 = (double) (this.field3927 - this.field3920);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field3944 = (double) this.field3931 + (double) this.field3935 * var6 / var10;
			this.field3937 = (double) this.field3920 + (double) this.field3935 * var8 / var10;
			this.field3938 = (double) this.field3929;
		}
		var6 = (double) (this.field3930 + 1 - var4);
		this.field3939 = ((double) this.field3926 - this.field3944) / var6;
		this.field3940 = ((double) this.field3927 - this.field3937) / var6;
		this.field3941 = Math.sqrt(this.field3940 * this.field3940 + this.field3939 * this.field3939);
		if (!this.field3922) {
			this.field3942 = -this.field3941 * Math.tan((double) this.field3923 * 0.02454369D);
		}
		this.field3932 = ((double) this.field3928 - this.field3938 - this.field3942 * var6) * 2.0D / (var6 * var6);
	}

	final void method2353(int var1) {
		this.field3922 = true;
		this.field3944 += this.field3939 * (double) var1;
		this.field3937 += (double) var1 * this.field3940;
		this.field3938 += this.field3932 * 0.5D * (double) var1 * (double) var1 + (double) var1 * this.field3942;
		this.field3942 += this.field3932 * (double) var1;
		this.field3924 = (int) (Math.atan2(this.field3939, this.field3940) * 325.949D) + 1024 & 2047;
		this.field3943 = (int) (Math.atan2(this.field3942, this.field3941) * 325.949D) & 2047;
		if (this.field3946 != null) {
			if (!this.field3946.method307()) {
				this.field3948 += var1;
				while (true) {
					do {
						do {
							if (this.field3948 <= this.field3946.field712[this.field3947]) {
								return;
							}
							this.field3948 -= this.field3946.field712[this.field3947];
							++this.field3947;
						} while (this.field3947 < this.field3946.field701.length);
						this.field3947 -= this.field3946.field705;
					} while (this.field3947 >= 0 && this.field3947 < this.field3946.field701.length);
					this.field3947 = 0;
				}
			} else {
				this.field3947 += var1;
				int var3 = this.field3946.method304();
				if (this.field3947 >= var3) {
					this.field3947 = var3 - this.field3946.field705;
				}
			}
		}
	}

	@Override
	protected final class113 method1165() {
		class138 var2 = class138.method872(this.field3933);
		class113 var3 = var2.method868(this.field3947);
		if (null == var3) {
			return null;
		} else {
			var3.method700(this.field3943);
			return var3;
		}
	}
}
