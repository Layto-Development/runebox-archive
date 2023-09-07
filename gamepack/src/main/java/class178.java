public class class178 {

	class214[] field1766;

	int field1757;

	int field1759;

	int field1760;

	int field1765;

	int field1771;

	int field1772;

	int[] field1758;

	int[] field1761;

	int[] field1762;

	int[] field1763;

	int[] field1764;

	int[] field1767;

	int[] field1768;

	int[] field1769;

	int[] field1770;

	class178(class214[] var1) {
		this.field1758 = new int[256];
		this.field1759 = 0;
		this.field1765 = 0;
		this.field1760 = 0;
		this.field1757 = 0;
		this.field1771 = 0;
		this.field1772 = 0;
		this.field1766 = var1;
		this.method1050();
	}

	void method1050() {
		this.field1761 = new int[256];
		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1761[var2] = var2 * 262144;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1761[var2 + 64] = var2 * 1024 + 16711680;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1761[var2 + 128] = 16776960 + var2 * 4;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1761[var2 + 192] = 16777215;
		}
		this.field1762 = new int[256];
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1762[var2] = var2 * 1024;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1762[var2 + 64] = 65280 + var2 * 4;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1762[var2 + 128] = var2 * 262144 + 65535;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1762[var2 + 192] = 16777215;
		}
		this.field1763 = new int[256];
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1763[var2] = var2 * 4;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1763[var2 + 64] = var2 * 262144 + 255;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1763[var2 + 128] = var2 * 1024 + 16711935;
		}
		for (var2 = 0; var2 < 64; ++var2) {
			this.field1763[var2 + 192] = 16777215;
		}
		this.field1770 = new int[256];
		this.field1757 = 0;
		this.field1768 = new int[32768];
		this.field1769 = new int[32768];
		this.method1057((class214) null);
		this.field1764 = new int[32768];
		this.field1767 = new int[32768];
	}

	void method1051() {
		this.field1761 = null;
		this.field1762 = null;
		this.field1763 = null;
		this.field1770 = null;
		this.field1768 = null;
		this.field1769 = null;
		this.field1764 = null;
		this.field1767 = null;
		this.field1757 = 0;
		this.field1771 = 0;
	}

	void method1058(int var1, int var2) {
		if (this.field1764 == null) {
			this.method1050();
		}
		if (this.field1772 == 0) {
			this.field1772 = var2;
		}
		int var4 = var2 - this.field1772;
		if (var4 >= 256) {
			var4 = 0;
		}
		this.field1772 = var2;
		if (var4 > 0) {
			this.method1052(var4);
		}
		this.method1054(var1);
	}

	final void method1052(int var1) {
		this.field1757 += var1 * 128;
		int var3;
		if (this.field1757 > this.field1768.length) {
			this.field1757 -= this.field1768.length;
			var3 = (int) (Math.random() * 12.0D);
			this.method1057(this.field1766[var3]);
		}
		var3 = 0;
		int var4 = var1 * 128;
		int var5 = (256 - var1) * 128;
		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = this.field1764[var4 + var3] - this.field1768[this.field1757 + var3 & this.field1768.length - 1] * var1 / 6;
			if (var7 < 0) {
				var7 = 0;
			}
			this.field1764[var3++] = var7;
		}
		boolean var16 = true;
		boolean var17 = true;
		int var8;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;
			for (int var10 = 0; var10 < 128; ++var10) {
				int var11 = (int) (Math.random() * 100.0D);
				if (var11 < 50 && var10 > 10 && var10 < 118) {
					this.field1764[var10 + var9] = 255;
				} else {
					this.field1764[var10 + var9] = 0;
				}
			}
		}
		if (this.field1765 > 0) {
			this.field1765 -= var1 * 4;
		}
		if (this.field1760 > 0) {
			this.field1760 -= var1 * 4;
		}
		if (this.field1765 == 0 && this.field1760 == 0) {
			var8 = (int) (Math.random() * (double) (2000 / var1));
			if (var8 == 0) {
				this.field1765 = 1024;
			}
			if (var8 == 1) {
				this.field1760 = 1024;
			}
		}
		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field1758[var8] = this.field1758[var1 + var8];
		}
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field1758[var8] = (int) (Math.sin((double) this.field1759 / 14.0D) * 16.0D + Math.sin((double) this.field1759 / 15.0D) * 14.0D + Math.sin((double) this.field1759 / 16.0D) * 12.0D);
			++this.field1759;
		}
		this.field1771 += var1;
		var8 = ((Client.field1201 & 1) + var1) / 2;
		if (var8 > 0) {
			boolean var18 = true;
			boolean var19 = true;
			boolean var20 = true;
			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field1771 * 100; ++var12) {
				var13 = (int) (Math.random() * (double) 124) + 2;
				var14 = (int) (Math.random() * (double) 128) + 128;
				this.field1764[(var14 << 7) + var13] = 192;
			}
			this.field1771 = 0;
			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;
				for (var15 = -var8; var15 < 128; ++var15) {
					if (var8 + var15 < 128) {
						var13 += this.field1764[var8 + var15 + var14];
					}
					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field1764[var14 + var15 - (var8 + 1)];
					}
					if (var15 >= 0) {
						this.field1767[var15 + var14] = var13 / (var8 * 2 + 1);
					}
				}
			}
			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;
				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field1767[var15 + var12 + var8 * 128];
					}
					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field1767[var12 + var15 - (var8 + 1) * 128];
					}
					if (var14 >= 0) {
						this.field1764[var12 + var15] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}
	}

	final int method1053(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return (var3 * (var2 & 65280) + var5 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + (var1 & 16711935) * var5 & -16711936) >> 8;
	}

	final void method1054(int var1) {
		int var3 = this.field1770.length;
		if (this.field1765 > 0) {
			this.method1055(this.field1765, this.field1762);
		} else if (this.field1760 > 0) {
			this.method1055(this.field1760, this.field1763);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field1770[var4] = this.field1761[var4];
			}
		}
		this.method1056(var1);
	}

	final void method1055(int var1, int[] var2) {
		int var4 = this.field1770.length;
		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field1770[var5] = this.method1053(this.field1761[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field1770[var5] = var2[var5];
			} else {
				this.field1770[var5] = this.method1053(var2[var5], this.field1761[var5], 256 - var1);
			}
		}
	}

	final void method1056(int var1) {
		int var3 = 0;
		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = (256 - var4) * this.field1758[var4] / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}
			if (var6 + 128 >= class389.field3103.field2563) {
				var8 = class389.field3103.field2563 - var6;
			}
			int var9 = var6 + (var4 + 8) * class389.field3103.field2563;
			var3 += var7;
			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field1764[var3++];
				int var12 = var9 % class206.field1904;
				if (var11 != 0 && var12 >= class206.field1909 && var12 < class206.field1903) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field1770[var11];
					int var15 = class389.field3103.field2564[var9];
					class389.field3103.field2564[var9++] = -16777216 | (var14 * (var15 & 16711935) + var13 * (var11 & 16711935) & -16711936) + ((var15 & 65280) * var14 + (var11 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var9;
				}
			}
			var3 += 128 - var8;
		}
	}

	final void method1057(class214 var1) {
		int var3;
		for (var3 = 0; var3 < this.field1768.length; ++var3) {
			this.field1768[var3] = 0;
		}
		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int) (Math.random() * 128.0D * 256.0D);
			this.field1768[var4] = (int) (Math.random() * 256.0D);
		}
		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field1769[var6] = (this.field1768[var6 + 1] + this.field1768[var6 - 1] + this.field1768[var6 - 128] + this.field1768[var6 + 128]) / 4;
				}
			}
			int[] var9 = this.field1768;
			this.field1768 = this.field1769;
			this.field1769 = var9;
		}
		if (var1 != null) {
			var3 = 0;
			for (var4 = 0; var4 < var1.field1941; ++var4) {
				for (var5 = 0; var5 < var1.field1940; ++var5) {
					if (var1.field1942[var3++] != 0) {
						var6 = var5 + 16 + var1.field1938;
						int var7 = var4 + 16 + var1.field1943;
						int var8 = var6 + (var7 << 7);
						this.field1768[var8] = 0;
					}
				}
			}
		}
	}
}
