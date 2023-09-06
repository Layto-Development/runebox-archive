public class class95 {
	class25[] field949;
	int field940;
	int field942;
	int field943;
	int field948;
	int field954;
	int field955;
	int[] field941;
	int[] field944;
	int[] field945;
	int[] field946;
	int[] field947;
	int[] field950;
	int[] field951;
	int[] field952;
	int[] field953;

	class95(class25[] var1) {
		this.field941 = new int[256];
		this.field942 = 0;
		this.field948 = 0;
		this.field943 = 0;
		this.field940 = 0;
		this.field954 = 0;
		this.field955 = 0;
		this.field949 = var1;
		this.method622();
	}

	void method622() {
		this.field944 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field944[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field944[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field944[var2 + 128] = 16776960 + var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field944[var2 + 192] = 16777215;
		}

		this.field945 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field945[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field945[var2 + 64] = 65280 + var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field945[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field945[var2 + 192] = 16777215;
		}

		this.field946 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field946[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field946[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field946[var2 + 128] = var2 * 1024 + 16711935;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field946[var2 + 192] = 16777215;
		}

		this.field953 = new int[256];
		this.field940 = 0;
		this.field951 = new int[32768];
		this.field952 = new int[32768];
		this.method630((class25)null);
		this.field947 = new int[32768];
		this.field950 = new int[32768];
	}

	void method624() {
		this.field944 = null;
		this.field945 = null;
		this.field946 = null;
		this.field953 = null;
		this.field951 = null;
		this.field952 = null;
		this.field947 = null;
		this.field950 = null;
		this.field940 = 0;
		this.field954 = 0;
	}

	void method631(int var1, int var2) {
		if (this.field947 == null) {
			this.method622();
		}

		if (this.field955 == 0) {
			this.field955 = var2;
		}

		int var4 = var2 - this.field955;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field955 = var2;
		if (var4 > 0) {
			this.method625(var4);
		}

		this.method627(var1);
	}

	final void method625(int var1) {
		this.field940 += var1 * 128;
		int var3;
		if (this.field940 > this.field951.length) {
			this.field940 -= this.field951.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method630(this.field949[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = (256 - var1) * 128;

		int var7;
		for (int var6 = 0; var6 < var5; ++var6) {
			var7 = this.field947[var4 + var3] - this.field951[this.field940 + var3 & this.field951.length - 1] * var1 / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field947[var3++] = var7;
		}

		byte var16 = 10;
		var7 = 128 - var16;

		int var8;
		int var11;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;

			for (int var10 = 0; var10 < 128; ++var10) {
				var11 = (int)(Math.random() * 100.0D);
				if (var11 < 50 && var10 > var16 && var10 < var7) {
					this.field947[var10 + var9] = 255;
				} else {
					this.field947[var10 + var9] = 0;
				}
			}
		}

		if (this.field948 > 0) {
			this.field948 -= var1 * 4;
		}

		if (this.field943 > 0) {
			this.field943 -= var1 * 4;
		}

		if (this.field948 == 0 && this.field943 == 0) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field948 = 1024;
			}

			if (var8 == 1) {
				this.field943 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field941[var8] = this.field941[var1 + var8];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field941[var8] = (int)(Math.sin((double)this.field942 / 14.0D) * 16.0D + Math.sin((double)this.field942 / 15.0D) * 14.0D + Math.sin((double)this.field942 / 16.0D) * 12.0D);
			++this.field942;
		}

		this.field954 += var1;
		var8 = ((Client.field306 & 1) + var1) / 2;
		if (var8 > 0) {
			short var17 = 128;
			byte var18 = 2;
			var11 = 128 - var18 - var18;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field954 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)var11) + var18;
				var14 = (int)(Math.random() * (double)var17) + var17;
				this.field947[(var14 << 7) + var13] = 192;
			}

			this.field954 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var8 + var15 < 128) {
						var13 += this.field947[var8 + var15 + var14];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field947[var14 + var15 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field950[var15 + var14] = var13 / (var8 * 2 + 1);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field950[var15 + var12 + var8 * 128];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field950[var12 + var15 - (var8 + 1) * 128];
					}

					if (var14 >= 0) {
						this.field947[var12 + var15] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	final int method626(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return (var3 * (var2 & 65280) + var5 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
	}

	final void method627(int var1) {
		int var3 = this.field953.length;
		if (this.field948 > 0) {
			this.method628(this.field948, this.field945);
		} else if (this.field943 > 0) {
			this.method628(this.field943, this.field946);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field953[var4] = this.field944[var4];
			}
		}

		this.method629(var1);
	}

	final void method628(int var1, int[] var2) {
		int var4 = this.field953.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field953[var5] = this.method626(this.field944[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field953[var5] = var2[var5];
			} else {
				this.field953[var5] = this.method626(var2[var5], this.field944[var5], 256 - var1);
			}
		}

	}

	final void method629(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = (256 - var4) * this.field941[var4] / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= class94.field937.field880) {
				var8 = class94.field937.field880 - var6;
			}

			int var9 = var6 + (var4 + 8) * class94.field937.field880;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field947[var3++];
				int var12 = var9 % class266.field2404;
				if (var11 != 0 && var12 >= class266.field2409 && var12 < class266.field2403) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field953[var11];
					int var15 = class94.field937.field881[var9];
					class94.field937.field881[var9++] = -16777216 | (var14 * (var15 & 16711935) + var13 * (var11 & 16711935) & -16711936) + ((var15 & 65280) * var14 + (var11 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	final void method630(class25 var1) {
		int var3;
		for (var3 = 0; var3 < this.field951.length; ++var3) {
			this.field951[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field951[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field952[var6] = (this.field951[var6 + 1] + this.field951[var6 - 1] + this.field951[var6 - 128] + this.field951[var6 + 128]) / 4;
				}
			}

			int[] var9 = this.field951;
			this.field951 = this.field952;
			this.field952 = var9;
		}

		if (var1 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field451; ++var4) {
				for (var5 = 0; var5 < var1.field450; ++var5) {
					if (var1.field452[var3++] != 0) {
						var6 = var5 + 16 + var1.field448;
						int var7 = var4 + 16 + var1.field453;
						int var8 = var6 + (var7 << 7);
						this.field951[var8] = 0;
					}
				}
			}
		}

	}

	static final void method623(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class292.method1669(var0)) {
			class148.method858(class160.field1484[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
