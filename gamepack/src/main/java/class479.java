public class class479 extends class462 {
	static int[] field4079;
	boolean field4070;
	boolean field4076;
	int field4069;
	int field4075;
	int field4078;
	int[] field4071;
	int[] field4072;
	int[] field4073;
	int[] field4074;
	int[] field4077;

	class479(class42 var1) {
		this.field4076 = false;
		this.field4069 = var1.method327();
		this.field4070 = var1.method278() == 1;
		int var2 = var1.method278();
		if (var2 >= 1 && var2 > 4) {
		}

		this.field4071 = new int[var2];

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			this.field4071[var3] = var1.method327();
		}

		if (var2 > 1) {
			this.field4072 = new int[var2 - 1];

			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field4072[var3] = var1.method278();
			}
		}

		if (var2 > 1) {
			this.field4073 = new int[var2 - 1];

			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field4073[var3] = var1.method278();
			}
		}

		this.field4074 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field4074[var3] = var1.method282();
		}

		this.field4075 = var1.method278();
		this.field4078 = var1.method278();
		this.field4077 = null;
	}

	boolean method2391(double var1, int var3, class215 var4) {
		int var5;
		for (var5 = 0; var5 < this.field4071.length; ++var5) {
			if (var4.method1221(this.field4071[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field4077 = new int[var5];

		for (int var6 = 0; var6 < this.field4071.length; ++var6) {
			int var8 = this.field4071[var6];
			class25 var7;
			if (!class475.method2297(var4, var8)) {
				var7 = null;
			} else {
				var7 = class442.method2217();
			}

			var7.method202();
			byte[] var10 = var7.field452;
			int[] var11 = var7.field455;
			int var12 = this.field4074[var6];
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
				var11[var13] = class133.method798(var11[var13], var1);
			}

			if (var6 == 0) {
				var13 = 0;
			} else {
				var13 = this.field4072[var6 - 1];
			}

			if (var13 == 0) {
				if (var7.field450 == var3) {
					for (var14 = 0; var14 < var5; ++var14) {
						this.field4077[var14] = var11[var10[var14] & 255];
					}
				} else if (var7.field450 == 64 && var3 == 128) {
					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field4077[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field450 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field4077[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

	void method2389() {
		this.field4077 = null;
	}

	void method2390(int var1) {
		if (this.field4077 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field4075 == 1 || this.field4075 == 3) {
				if (field4079 == null || field4079.length < this.field4077.length) {
					field4079 = new int[this.field4077.length];
				}

				if (this.field4077.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field4077.length;
				var4 = var2 * var1 * this.field4078;
				var5 = var3 - 1;
				if (this.field4075 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field4079[var6] = this.field4077[var7];
				}

				var10 = this.field4077;
				this.field4077 = field4079;
				field4079 = var10;
			}

			if (this.field4075 == 2 || this.field4075 == 4) {
				if (field4079 == null || field4079.length < this.field4077.length) {
					field4079 = new int[this.field4077.length];
				}

				if (this.field4077.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field4077.length;
				var4 = var1 * this.field4078;
				var5 = var2 - 1;
				if (this.field4075 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						field4079[var8] = this.field4077[var9];
					}
				}

				var10 = this.field4077;
				this.field4077 = field4079;
				field4079 = var10;
			}

		}
	}
}
