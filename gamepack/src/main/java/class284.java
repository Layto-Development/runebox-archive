public class class284 {
	byte[][][] field2514;
	int field2513;

	class284(int var1) {
		this.field2513 = var1;
	}

	void method1623(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.field2513 != 0 && null != this.field2514) {
			var8 = this.method1617(var8, var7);
			var7 = this.method1612(var7);
			class266.method1565(var1, var2, var5, var6, var3, var4, this.field2514[var7 - 1][var8], this.field2513, true);
		}
	}

	int method1617(int var1, int var2) {
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

	int method1612(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	void method1620() {
		if (this.field2514 == null) {
			this.field2514 = new byte[8][4][];
			this.method1613();
			this.method1619();
			this.method1614();
			this.method1621();
			this.method1616();
			this.method1622();
			this.method1618();
			this.method1615((byte)-68);
		}
	}

	void method1613() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[0][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[0][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[0][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[0][3] = var2;
	}

	void method1619() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[1][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
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

		this.field2514[1][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[1][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[1][3] = var2;
	}

	void method1614() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[2][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[2][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[2][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[2][3] = var2;
	}

	void method1621() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[3][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[3][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[3][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[3][3] = var2;
	}

	void method1616() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[4][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[4][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[4][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var3 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2514[4][3] = var2;
	}

	void method1622() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		boolean var3 = false;
		var2 = new byte[this.field2513 * this.field2513];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[5][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var4 <= this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[5][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[5][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var4 >= this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[5][3] = var2;
	}

	void method1618() {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		boolean var3 = false;
		var2 = new byte[this.field2513 * this.field2513];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4 - this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[6][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 <= var4 - this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[6][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[6][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[6][3] = var2;
	}

	void method1615(byte var1) {
		byte[] var2 = new byte[this.field2513 * this.field2513];
		boolean var3 = false;
		var2 = new byte[this.field2513 * this.field2513];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2513; ++var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var5 >= var4 - this.field2513 / 2) {
					if (var1 >= -1) {
						return;
					}

					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[7][0] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2513; ++var5) {
				if (var1 >= -1) {
					throw new IllegalStateException();
				}

				if (var5 >= var4 - this.field2513 / 2) {
					if (var1 >= -1) {
						throw new IllegalStateException();
					}

					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[7][1] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = this.field2513 - 1; var4 >= 0; --var4) {
			if (var1 >= -1) {
				throw new IllegalStateException();
			}

			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var1 >= -1) {
					return;
				}

				if (var5 >= var4 - this.field2513 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[7][2] = var2;
		var2 = new byte[this.field2513 * this.field2513];
		var6 = 0;

		for (var4 = 0; var4 < this.field2513; ++var4) {
			if (var1 >= -1) {
				throw new IllegalStateException();
			}

			for (var5 = this.field2513 - 1; var5 >= 0; --var5) {
				if (var1 >= -1) {
					throw new IllegalStateException();
				}

				if (var5 >= var4 - this.field2513 / 2) {
					if (var1 >= -1) {
						throw new IllegalStateException();
					}

					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2514[7][3] = var2;
	}

	static void method1624(String var0, String var1, String var2) {
		class337.method1864(7);
		class174.method993(var0, var1, var2);
	}
}
