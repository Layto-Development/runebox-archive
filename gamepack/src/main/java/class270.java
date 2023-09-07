public class class270 extends class77 {

	static int[] field2221;

	boolean field2212;

	boolean field2218;

	int field2211;

	int field2217;

	int field2220;

	int[] field2213;

	int[] field2214;

	int[] field2215;

	int[] field2216;

	int[] field2219;

	class270(class187 var1) {
		this.field2218 = false;
		this.field2211 = var1.method1145();
		this.field2212 = var1.method1096() == 1;
		int var2 = var1.method1096();
		if (var2 >= 1 && var2 > 4) {
		}
		this.field2213 = new int[var2];
		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			this.field2213[var3] = var1.method1145();
		}
		if (var2 > 1) {
			this.field2214 = new int[var2 - 1];
			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field2214[var3] = var1.method1096();
			}
		}
		if (var2 > 1) {
			this.field2215 = new int[var2 - 1];
			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field2215[var3] = var1.method1096();
			}
		}
		this.field2216 = new int[var2];
		for (var3 = 0; var3 < var2; ++var3) {
			this.field2216[var3] = var1.method1100();
		}
		this.field2217 = var1.method1096();
		this.field2220 = var1.method1096();
		this.field2219 = null;
	}

	boolean method1515(double var1, int var3, class338 var4) {
		int var5;
		for (var5 = 0; var5 < this.field2213.length; ++var5) {
			if (var4.method1771(this.field2213[var5]) == null) {
				return false;
			}
		}
		var5 = var3 * var3;
		this.field2219 = new int[var5];
		for (int var6 = 0; var6 < this.field2213.length; ++var6) {
			int var8 = this.field2213[var6];
			class214 var7;
			if (!class494.method2362(var4, var8)) {
				var7 = null;
			} else {
				var7 = class494.method2371();
			}
			var7.method1287();
			byte[] var10 = var7.field1942;
			int[] var11 = var7.field1945;
			int var12 = this.field2216[var6];
			if ((var12 & -16777216) == 16777216) {
			}
			if ((var12 & -16777216) == 33554432) {
			}
			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) {
				var13 = var12 & 16711935;
				var14 = var12 >> 8 & 255;
				for (var15 = 0; var15 < var11.length; ++var15) {
					var16 = var11[var15];
					if ((var16 & 65535) == var16 >> 8) {
						var16 &= 255;
						var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280;
					}
				}
			}
			for (var13 = 0; var13 < var11.length; ++var13) {
				var11[var13] = class238.method1404(var11[var13], var1);
			}
			if (var6 == 0) {
				var13 = 0;
			} else {
				var13 = this.field2214[var6 - 1];
			}
			if (var13 == 0) {
				if (var7.field1940 == var3) {
					for (var14 = 0; var14 < var5; ++var14) {
						this.field2219[var14] = var11[var10[var14] & 255];
					}
				} else if (var7.field1940 == 64 && var3 == 128) {
					var14 = 0;
					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field2219[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field1940 != 128 || var3 != 64) {
						throw new RuntimeException();
					}
					var14 = 0;
					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field2219[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}
			if (var13 == 1) {
			}
			if (var13 == 2) {
			}
			if (var13 == 3) {
			}
		}
		return true;
	}

	void method1513() {
		this.field2219 = null;
	}

	void method1514(int var1) {
		if (this.field2219 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field2217 == 1 || this.field2217 == 3) {
				if (field2221 == null || field2221.length < this.field2219.length) {
					field2221 = new int[this.field2219.length];
				}
				if (this.field2219.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}
				var3 = this.field2219.length;
				var4 = var2 * var1 * this.field2220;
				var5 = var3 - 1;
				if (this.field2217 == 1) {
					var4 = -var4;
				}
				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field2221[var6] = this.field2219[var7];
				}
				var10 = this.field2219;
				this.field2219 = field2221;
				field2221 = var10;
			}
			if (this.field2217 == 2 || this.field2217 == 4) {
				if (field2221 == null || field2221.length < this.field2219.length) {
					field2221 = new int[this.field2219.length];
				}
				if (this.field2219.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}
				var3 = this.field2219.length;
				var4 = var1 * this.field2220;
				var5 = var2 - 1;
				if (this.field2217 == 2) {
					var4 = -var4;
				}
				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						field2221[var8] = this.field2219[var9];
					}
				}
				var10 = this.field2219;
				this.field2219 = field2221;
				field2221 = var10;
			}
		}
	}
}
