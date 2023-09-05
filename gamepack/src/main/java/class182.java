import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "if")
public class class182 extends class155 {
	@ObfInfo(name = "ar", desc = "[I")
	static int[] field1647;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field1638;
	@ObfInfo(name = "an", desc = "Z")
	boolean field1644;
	@ObfInfo(name = "ac", desc = "I")
	int field1637;
	@ObfInfo(name = "ad", desc = "I")
	int field1643;
	@ObfInfo(name = "aq", desc = "I")
	int field1646;
	@ObfInfo(name = "az", desc = "[I")
	int[] field1639;
	@ObfInfo(name = "ap", desc = "[I")
	int[] field1640;
	@ObfInfo(name = "aa", desc = "[I")
	int[] field1641;
	@ObfInfo(name = "af", desc = "[I")
	int[] field1642;
	@ObfInfo(name = "al", desc = "[I")
	int[] field1645;

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	class182(class280 var1) {
		this.field1644 = false;
		this.field1637 = var1.method1541();
		this.field1638 = var1.method1492() == 1;
		int var2 = var1.method1492();
		if (var2 >= 1 && var2 > 4) {
		}

		this.field1639 = new int[var2];

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			this.field1639[var3] = var1.method1541();
		}

		if (var2 > 1) {
			this.field1640 = new int[var2 - 1];

			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field1640[var3] = var1.method1492();
			}
		}

		if (var2 > 1) {
			this.field1641 = new int[var2 - 1];

			for (var3 = 0; var3 < var2 - 1; ++var3) {
				this.field1641[var3] = var1.method1492();
			}
		}

		this.field1642 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field1642[var3] = var1.method1496();
		}

		this.field1643 = var1.method1492();
		this.field1646 = var1.method1492();
		this.field1645 = null;
	}

	@ObfInfo(name = "au", desc = "(DILnu;)Z")
	boolean method1028(double var1, int var3, class437 var4) {
		int var5;
		for (var5 = 0; var5 < this.field1639.length; ++var5) {
			if (var4.method2276(this.field1639[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field1645 = new int[var5];

		for (int var6 = 0; var6 < this.field1639.length; ++var6) {
			int var8 = this.field1639[var6];
			class398 var7;
			if (!class273.method1430(var4, var8)) {
				var7 = null;
			} else {
				var7 = class273.method1439();
			}

			var7.method2110();
			byte[] var10 = var7.field3107;
			int[] var11 = var7.field3110;
			int var12 = this.field1642[var6];
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
				var11[var13] = class276.method1460(var11[var13], var1);
			}

			if (var6 == 0) {
				var13 = 0;
			} else {
				var13 = this.field1640[var6 - 1];
			}

			if (var13 == 0) {
				if (var7.field3105 == var3) {
					for (var14 = 0; var14 < var5; ++var14) {
						this.field1645[var14] = var11[var10[var14] & 255];
					}
				} else if (var7.field3105 == 64 && var3 == 128) {
					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field1645[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field3105 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field1645[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

	@ObfInfo(name = "ae", desc = "()V")
	void method1026() {
		this.field1645 = null;
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	void method1027(int var1) {
		if (this.field1645 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field1643 == 1 || this.field1643 == 3) {
				if (field1647 == null || field1647.length < this.field1645.length) {
					field1647 = new int[this.field1645.length];
				}

				if (this.field1645.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field1645.length;
				var4 = var2 * var1 * this.field1646;
				var5 = var3 - 1;
				if (this.field1643 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field1647[var6] = this.field1645[var7];
				}

				var10 = this.field1645;
				this.field1645 = field1647;
				field1647 = var10;
			}

			if (this.field1643 == 2 || this.field1643 == 4) {
				if (field1647 == null || field1647.length < this.field1645.length) {
					field1647 = new int[this.field1645.length];
				}

				if (this.field1645.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field1645.length;
				var4 = var1 * this.field1646;
				var5 = var2 - 1;
				if (this.field1643 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						field1647[var8] = this.field1645[var9];
					}
				}

				var10 = this.field1645;
				this.field1645 = field1647;
				field1647 = var10;
			}

		}
	}
}
