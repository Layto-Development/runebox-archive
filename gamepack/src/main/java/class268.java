import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ku")
public class class268 {
	@ObfInfo(name = "ae", desc = "[[[B")
	byte[][][] field2161;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1580674405)
	int field2160;

	@ObfInfo(name = "<init>", desc = "(I)V")
	class268(int var1) {
		this.field2160 = var1;
	}

	@ObfInfo(name = "au", desc = "(IIIIIIIIS)V", opaqueValue = "8215")
	void method1403(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.field2160 != 0 && null != this.field2161) {
			var8 = this.method1397(var8, var7);
			var7 = this.method1392(var7);
			class83.method559(var1, var2, var5, var6, var3, var4, this.field2161[var7 - 1][var8], this.field2160, true);
		}
	}

	@ObfInfo(name = "ae", desc = "(IIB)I", opaqueValue = "1")
	int method1397(int var1, int var2) {
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

	@ObfInfo(name = "ao", desc = "(II)I", opaqueValue = "-757286890")
	int method1392(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	@ObfInfo(name = "at", desc = "(I)V", opaqueValue = "650027695")
	void method1400() {
		if (this.field2161 == null) {
			this.field2161 = new byte[8][4][];
			this.method1393();
			this.method1399();
			this.method1394();
			this.method1401();
			this.method1396();
			this.method1402();
			this.method1398();
			this.method1395((byte)-68);
		}
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaqueValue = "2061815829")
	void method1393() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[0][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[0][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[0][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[0][3] = var2;
	}

	@ObfInfo(name = "ai", desc = "(I)V", opaqueValue = "65279")
	void method1399() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[1][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
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

		this.field2161[1][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[1][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[1][3] = var2;
	}

	@ObfInfo(name = "az", desc = "(B)V", opaqueValue = "1")
	void method1394() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[2][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[2][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[2][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[2][3] = var2;
	}

	@ObfInfo(name = "ap", desc = "(I)V", opaqueValue = "-1088178192")
	void method1401() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[3][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[3][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[3][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[3][3] = var2;
	}

	@ObfInfo(name = "aa", desc = "(I)V", opaqueValue = "-1735156337")
	void method1396() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[4][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[4][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[4][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var3 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2161[4][3] = var2;
	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "-1612445373")
	void method1402() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		boolean var3 = false;
		var2 = new byte[this.field2160 * this.field2160];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[5][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var4 <= this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[5][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[5][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var4 >= this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[5][3] = var2;
	}

	@ObfInfo(name = "ad", desc = "(S)V", opaqueValue = "181")
	void method1398() {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		boolean var3 = false;
		var2 = new byte[this.field2160 * this.field2160];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4 - this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[6][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 <= var4 - this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[6][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[6][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[6][3] = var2;
	}

	@ObfInfo(name = "aq", desc = "(B)V")
	void method1395(byte var1) {
		byte[] var2 = new byte[this.field2160 * this.field2160];
		boolean var3 = false;
		var2 = new byte[this.field2160 * this.field2160];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2160; ++var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var5 >= var4 - this.field2160 / 2) {
					if (var1 >= -1) {
						return;
					}

					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[7][0] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2160; ++var5) {
				if (var1 >= -1) {
					throw new IllegalStateException();
				}

				if (var5 >= var4 - this.field2160 / 2) {
					if (var1 >= -1) {
						throw new IllegalStateException();
					}

					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[7][1] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = this.field2160 - 1; var4 >= 0; --var4) {
			if (var1 >= -1) {
				throw new IllegalStateException();
			}

			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var1 >= -1) {
					return;
				}

				if (var5 >= var4 - this.field2160 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[7][2] = var2;
		var2 = new byte[this.field2160 * this.field2160];
		var6 = 0;

		for (var4 = 0; var4 < this.field2160; ++var4) {
			if (var1 >= -1) {
				throw new IllegalStateException();
			}

			for (var5 = this.field2160 - 1; var5 >= 0; --var5) {
				if (var1 >= -1) {
					throw new IllegalStateException();
				}

				if (var5 >= var4 - this.field2160 / 2) {
					if (var1 >= -1) {
						throw new IllegalStateException();
					}

					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2161[7][3] = var2;
	}
}
