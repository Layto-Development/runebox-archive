public final class class25 extends class266 {
	public byte[] field452;
	public int field448;
	public int field449;
	public int field450;
	public int field451;
	public int field453;
	public int field454;
	public int[] field455;

	class25() {
	}

	public void method202() {
		if (this.field450 != this.field449 || this.field451 != this.field454) {
			byte[] var1 = new byte[this.field449 * this.field454];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field451; ++var3) {
				for (int var4 = 0; var4 < this.field450; ++var4) {
					var1[var4 + this.field448 + (var3 + this.field453) * this.field449] = this.field452[var2++];
				}
			}

			this.field452 = var1;
			this.field450 = this.field449;
			this.field451 = this.field454;
			this.field448 = 0;
			this.field453 = 0;
		}
	}

	public void method203(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field455.length; ++var4) {
			int var5 = this.field455[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field455[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field455[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field455[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public void method207(int var1, int var2) {
		var1 += this.field448;
		var2 += this.field453;
		int var3 = var1 + var2 * class266.field2404;
		int var4 = 0;
		int var5 = this.field451;
		int var6 = this.field450;
		int var7 = class266.field2404 - var6;
		int var8 = 0;
		int var9;
		if (var2 < class266.field2410) {
			var9 = class266.field2410 - var2;
			var5 -= var9;
			var2 = class266.field2410;
			var4 += var9 * var6;
			var3 += var9 * class266.field2404;
		}

		if (var2 + var5 > class266.field2408) {
			var5 -= var2 + var5 - class266.field2408;
		}

		if (var1 < class266.field2409) {
			var9 = class266.field2409 - var1;
			var6 -= var9;
			var1 = class266.field2409;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > class266.field2403) {
			var9 = var1 + var6 - class266.field2403;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method204(class266.field2406, this.field452, this.field455, var4, var3, var6, var5, var7, var8);
		}
	}

	public void method206(int var1, int var2, int var3, int var4) {
		int var5 = this.field450;
		int var6 = this.field451;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field449;
		int var10 = this.field454;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field448 > 0) {
			var13 = ((this.field448 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.field448 << 16);
		}

		if (this.field453 > 0) {
			var13 = ((this.field453 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 += var13 * var12 - (this.field453 << 16);
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + var2 * class266.field2404;
		int var14 = class266.field2404 - var3;
		if (var2 + var4 > class266.field2408) {
			var4 -= var2 + var4 - class266.field2408;
		}

		int var15;
		if (var2 < class266.field2410) {
			var15 = class266.field2410 - var2;
			var4 -= var15;
			var13 += var15 * class266.field2404;
			var8 += var12 * var15;
		}

		if (var1 + var3 > class266.field2403) {
			var15 = var1 + var3 - class266.field2403;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < class266.field2409) {
			var15 = class266.field2409 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var11 * var15;
			var14 += var15;
		}

		method205(class266.field2406, this.field452, this.field455, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	static void method204(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method205(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}
}
