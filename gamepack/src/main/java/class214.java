public final class class214 extends class206 {

	public byte[] field1942;

	public int field1938;

	public int field1939;

	public int field1940;

	public int field1941;

	public int field1943;

	public int field1944;

	public int[] field1945;

	class214() {
	}

	public void method1287() {
		if (this.field1940 != this.field1939 || this.field1941 != this.field1944) {
			byte[] var1 = new byte[this.field1939 * this.field1944];
			int var2 = 0;
			for (int var3 = 0; var3 < this.field1941; ++var3) {
				for (int var4 = 0; var4 < this.field1940; ++var4) {
					var1[var4 + this.field1938 + (var3 + this.field1943) * this.field1939] = this.field1942[var2++];
				}
			}
			this.field1942 = var1;
			this.field1940 = this.field1939;
			this.field1941 = this.field1944;
			this.field1938 = 0;
			this.field1943 = 0;
		}
	}

	public void method1288(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1945.length; ++var4) {
			int var5 = this.field1945[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			int var6 = this.field1945[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.field1945[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			this.field1945[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	public void method1292(int var1, int var2) {
		var1 += this.field1938;
		var2 += this.field1943;
		int var3 = var1 + var2 * class206.field1904;
		int var4 = 0;
		int var5 = this.field1941;
		int var6 = this.field1940;
		int var7 = class206.field1904 - var6;
		int var8 = 0;
		int var9;
		if (var2 < class206.field1910) {
			var9 = class206.field1910 - var2;
			var5 -= var9;
			var2 = class206.field1910;
			var4 = 0 + var9 * var6;
			var3 += var9 * class206.field1904;
		}
		if (var2 + var5 > class206.field1908) {
			var5 -= var2 + var5 - class206.field1908;
		}
		if (var1 < class206.field1909) {
			var9 = class206.field1909 - var1;
			var6 -= var9;
			var1 = class206.field1909;
			var4 += var9;
			var3 += var9;
			var8 = 0 + var9;
			var7 += var9;
		}
		if (var1 + var6 > class206.field1903) {
			var9 = var1 + var6 - class206.field1903;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}
		if (var6 > 0 && var5 > 0) {
			method1289(class206.field1906, this.field1942, this.field1945, var4, var3, var6, var5, var7, var8);
		}
	}

	public void method1291(int var1, int var2, int var3, int var4) {
		int var5 = this.field1940;
		int var6 = this.field1941;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field1939;
		int var10 = this.field1944;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field1938 > 0) {
			var13 = ((this.field1938 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 = 0 + (var13 * var11 - (this.field1938 << 16));
		}
		if (this.field1943 > 0) {
			var13 = ((this.field1943 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 = 0 + (var13 * var12 - (this.field1943 << 16));
		}
		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}
		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}
		var13 = var1 + var2 * class206.field1904;
		int var14 = class206.field1904 - var3;
		if (var2 + var4 > class206.field1908) {
			var4 -= var2 + var4 - class206.field1908;
		}
		int var15;
		if (var2 < class206.field1910) {
			var15 = class206.field1910 - var2;
			var4 -= var15;
			var13 += var15 * class206.field1904;
			var8 += var12 * var15;
		}
		if (var1 + var3 > class206.field1903) {
			var15 = var1 + var3 - class206.field1903;
			var3 -= var15;
			var14 += var15;
		}
		if (var1 < class206.field1909) {
			var15 = class206.field1909 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var11 * var15;
			var14 += var15;
		}
		method1290(class206.field1906, this.field1942, this.field1945, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	static void method1289(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	static void method1290(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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
