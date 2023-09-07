public class class332 {

	byte[][][] field2547;

	int field2546;

	class332(int var1) {
		this.field2546 = var1;
	}

	void method1747(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.field2546 != 0 && null != this.field2547) {
			var8 = this.method1741(var8, var7);
			var7 = this.method1736(var7);
			class206.method1253(var1, var2, var5, var6, var3, var4, this.field2547[var7 - 1][var8], this.field2546, true);
		}
	}

	int method1741(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}
		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}
		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}
		return var1;
	}

	int method1736(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	void method1744() {
		if (this.field2547 == null) {
			this.field2547 = new byte[8][4][];
			this.method1737();
			this.method1743();
			this.method1738();
			this.method1745();
			this.method1740();
			this.method1746();
			this.method1742();
			this.method1739((byte) -68);
		}
	}

	void method1737() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		int var3 = 0;
		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[0][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[0][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[0][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[0][3] = var2;
	}

	void method1743() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		int var3 = 0;
		int var4;
		int var5;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[1][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var3 >= 0 && var3 < var2.length) {
					if (var5 >= var4 << 1) {
						var2[var3] = -1;
					}
					++var3;
				} else {
					++var3;
				}
			}
		}
		this.field2547[1][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[1][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[1][3] = var2;
	}

	void method1738() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		int var3 = 0;
		int var4;
		int var5;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[2][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[2][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[2][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[2][3] = var2;
	}

	void method1745() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		int var3 = 0;
		int var4;
		int var5;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[3][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[3][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[3][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[3][3] = var2;
	}

	void method1740() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		int var3 = 0;
		int var4;
		int var5;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[4][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[4][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[4][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var3 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}
				++var3;
			}
		}
		this.field2547[4][3] = var2;
	}

	void method1746() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		boolean var3 = false;
		var2 = new byte[this.field2546 * this.field2546];
		int var6 = 0;
		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[5][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var4 <= this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[5][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[5][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var4 >= this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[5][3] = var2;
	}

	void method1742() {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		boolean var3 = false;
		var2 = new byte[this.field2546 * this.field2546];
		int var6 = 0;
		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[6][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 <= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[6][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[6][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[6][3] = var2;
	}

	void method1739(byte var1) {
		byte[] var2 = new byte[this.field2546 * this.field2546];
		boolean var3 = false;
		var2 = new byte[this.field2546 * this.field2546];
		int var6 = 0;
		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[7][0] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2546; ++var5) {
				if (var5 >= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[7][1] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = this.field2546 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[7][2] = var2;
		var2 = new byte[this.field2546 * this.field2546];
		var6 = 0;
		for (var4 = 0; var4 < this.field2546; ++var4) {
			for (var5 = this.field2546 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field2546 / 2) {
					var2[var6] = -1;
				}
				++var6;
			}
		}
		this.field2547[7][3] = var2;
	}
}
