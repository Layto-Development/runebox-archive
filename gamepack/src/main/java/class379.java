public class class379 {
	boolean field3202;
	boolean field3222;
	class526 field3225;
	int field3206;
	int[] field3215;
	int[] field3216;
	long field3203;
	long[] field3201;
	long[] field3213;
	public boolean field3207;
	public boolean[] field3218;
	public byte field3209;
	public byte field3210;
	public byte field3211;
	public byte field3221;
	public byte[] field3214;
	public int field3204;
	public int field3205;
	public int field3212;
	public int field3219;
	public int field3220;
	public int[] field3217;
	public String field3208;
	public String[] field3223;
	public String[] field3224;

	public class379(class42 var1) {
		this.field3220 = 0;
		this.field3208 = null;
		this.field3206 = 0;
		this.field3219 = -1;
		this.field3204 = -1;
		this.method2032(var1);
	}

	void method2018(int var1) {
		if (this.field3202) {
			if (null != this.field3201) {
				System.arraycopy(this.field3201, 0, this.field3201 = new long[var1], 0, this.field3212);
			} else {
				this.field3201 = new long[var1];
			}
		}

		if (this.field3222) {
			if (null != this.field3223) {
				System.arraycopy(this.field3223, 0, this.field3223 = new String[var1], 0, this.field3212);
			} else {
				this.field3223 = new String[var1];
			}
		}

		if (null != this.field3214) {
			System.arraycopy(this.field3214, 0, this.field3214 = new byte[var1], 0, this.field3212);
		} else {
			this.field3214 = new byte[var1];
		}

		if (null != this.field3216) {
			System.arraycopy(this.field3216, 0, this.field3216 = new int[var1], 0, this.field3212);
		} else {
			this.field3216 = new int[var1];
		}

		if (this.field3217 != null) {
			System.arraycopy(this.field3217, 0, this.field3217 = new int[var1], 0, this.field3212);
		} else {
			this.field3217 = new int[var1];
		}

		if (null != this.field3218) {
			System.arraycopy(this.field3218, 0, this.field3218 = new boolean[var1], 0, this.field3212);
		} else {
			this.field3218 = new boolean[var1];
		}

	}

	void method2019(int var1) {
		if (this.field3202) {
			if (null != this.field3213) {
				System.arraycopy(this.field3213, 0, this.field3213 = new long[var1], 0, this.field3205);
			} else {
				this.field3213 = new long[var1];
			}
		}

		if (this.field3222) {
			if (null != this.field3224) {
				System.arraycopy(this.field3224, 0, this.field3224 = new String[var1], 0, this.field3205);
			} else {
				this.field3224 = new String[var1];
			}
		}

	}

	public int method2025(String var1) {
		if (null != var1 && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field3212; ++var3) {
				if (this.field3223[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	public int method2027(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field3216[var1] & var5) >>> var2;
	}

	public Integer method2020(int var1) {
		if (null == this.field3225) {
			return null;
		} else {
			class462 var3 = this.field3225.method2543((long)var1);
			return null != var3 && var3 instanceof class380 ? new Integer(((class380)var3).field3226) : null;
		}
	}

	public int[] method2021() {
		if (null == this.field3215) {
			String[] var2 = new String[this.field3212];
			this.field3215 = new int[this.field3212];

			for (int var3 = 0; var3 < this.field3212; this.field3215[var3] = var3++) {
				var2[var3] = this.field3223[var3];
				if (null != var2[var3]) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			int[] var4 = this.field3215;
			class334.method1847(var2, var4, 0, var2.length - 1);
		}

		return this.field3215;
	}

	void method2033(long var1, String var3, int var4) {
		if (null != var3 && var3.length() == 0) {
			var3 = null;
		}

		if (this.field3202 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.field3222 != (null != var3)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field3201 == null || this.field3212 >= this.field3201.length) || null != var3 && (this.field3223 == null || this.field3212 >= this.field3223.length)) {
				this.method2018(this.field3212 + 5);
			}

			if (this.field3201 != null) {
				this.field3201[this.field3212] = var1;
			}

			if (this.field3223 != null) {
				this.field3223[this.field3212] = var3;
			}

			if (this.field3219 == -1) {
				this.field3219 = this.field3212;
				this.field3214[this.field3212] = 126;
			} else {
				this.field3214[this.field3212] = 0;
			}

			this.field3216[this.field3212] = 0;
			this.field3217[this.field3212] = var4;
			this.field3218[this.field3212] = false;
			++this.field3212;
			this.field3215 = null;
		}
	}

	void method2022(int var1) {
		if (var1 >= 0 && var1 < this.field3212) {
			--this.field3212;
			this.field3215 = null;
			if (this.field3212 == 0) {
				this.field3201 = null;
				this.field3223 = null;
				this.field3214 = null;
				this.field3216 = null;
				this.field3217 = null;
				this.field3218 = null;
				this.field3219 = -1;
				this.field3204 = -1;
			} else {
				System.arraycopy(this.field3214, var1 + 1, this.field3214, var1, this.field3212 - var1);
				System.arraycopy(this.field3216, var1 + 1, this.field3216, var1, this.field3212 - var1);
				System.arraycopy(this.field3217, var1 + 1, this.field3217, var1, this.field3212 - var1);
				System.arraycopy(this.field3218, var1 + 1, this.field3218, var1, this.field3212 - var1);
				if (this.field3201 != null) {
					System.arraycopy(this.field3201, var1 + 1, this.field3201, var1, this.field3212 - var1);
				}

				if (this.field3223 != null) {
					System.arraycopy(this.field3223, var1 + 1, this.field3223, var1, this.field3212 - var1);
				}

				this.method2036();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method2036() {
		if (this.field3212 == 0) {
			this.field3219 = -1;
			this.field3204 = -1;
		} else {
			this.field3219 = -1;
			this.field3204 = -1;
			int var2 = 0;
			byte var3 = this.field3214[0];

			for (int var4 = 1; var4 < this.field3212; ++var4) {
				if (this.field3214[var4] > var3) {
					if (var3 == 125) {
						this.field3204 = var2;
					}

					var2 = var4;
					var3 = this.field3214[var4];
				} else if (this.field3204 == -1 && this.field3214[var4] == 125) {
					this.field3204 = var4;
				}
			}

			this.field3219 = var2;
			if (this.field3219 != -1) {
				this.field3214[this.field3219] = 126;
			}

		}
	}

	void method2023(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field3202 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field3222) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field3213 == null || this.field3205 >= this.field3213.length) || null != var3 && (null == this.field3224 || this.field3205 >= this.field3224.length)) {
				this.method2019(this.field3205 + 5);
			}

			if (null != this.field3213) {
				this.field3213[this.field3205] = var1;
			}

			if (this.field3224 != null) {
				this.field3224[this.field3205] = var3;
			}

			++this.field3205;
		}
	}

	void method2024(int var1) {
		--this.field3205;
		if (this.field3205 == 0) {
			this.field3213 = null;
			this.field3224 = null;
		} else {
			if (null != this.field3213) {
				System.arraycopy(this.field3213, var1 + 1, this.field3213, var1, this.field3205 - var1);
			}

			if (this.field3224 != null) {
				System.arraycopy(this.field3224, var1 + 1, this.field3224, var1, this.field3205 - var1);
			}
		}

	}

	int method2034(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.field3219 || this.field3204 != -1 && this.field3214[this.field3204] >= 125) {
				if (this.field3214[var1] == var2) {
					return -1;
				} else {
					this.field3214[var1] = var2;
					this.method2036();
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	boolean method2026(int var1) {
		if (var1 != this.field3219 && this.field3214[var1] != 126) {
			this.field3214[this.field3219] = 125;
			this.field3204 = this.field3219;
			this.field3214[var1] = 126;
			this.field3219 = var1;
			return true;
		} else {
			return false;
		}
	}

	int method2035(int var1, boolean var2) {
		if (this.field3218[var1] == var2) {
			return -1;
		} else {
			this.field3218[var1] = var2;
			return var1;
		}
	}

	int method2028(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field3216[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field3216[var1] = var9 | var2;
			return var1;
		}
	}

	boolean method2017(int var1, int var2) {
		if (null != this.field3225) {
			class462 var4 = this.field3225.method2543((long)var1);
			if (null != var4) {
				if (var4 instanceof class380) {
					class380 var5 = (class380)var4;
					if (var5.field3226 == var2) {
						return false;
					}

					var5.field3226 = var2;
					return true;
				}

				var4.method2269();
			}
		} else {
			this.field3225 = new class526(4);
		}

		this.field3225.method2547(new class380(var2), (long)var1);
		return true;
	}

	boolean method2029(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (null != this.field3225) {
			class462 var9 = this.field3225.method2543((long)var1);
			if (null != var9) {
				if (var9 instanceof class380) {
					class380 var10 = (class380)var9;
					if (var2 == (var10.field3226 & var8)) {
						return false;
					}

					var10.field3226 &= ~var8;
					var10.field3226 |= var2;
					return true;
				}

				var9.method2269();
			}
		} else {
			this.field3225 = new class526(4);
		}

		this.field3225.method2547(new class380(var2), (long)var1);
		return true;
	}

	boolean method2030(int var1, long var2) {
		if (null != this.field3225) {
			class462 var4 = this.field3225.method2543((long)var1);
			if (var4 != null) {
				if (var4 instanceof class211) {
					class211 var5 = (class211)var4;
					if (var5.field1987 == var2) {
						return false;
					}

					var5.field1987 = var2;
					return true;
				}

				var4.method2269();
			}
		} else {
			this.field3225 = new class526(4);
		}

		this.field3225.method2547(new class211(var2), (long)var1);
		return true;
	}

	boolean method2031(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (null != this.field3225) {
			class462 var4 = this.field3225.method2543((long)var1);
			if (null != var4) {
				if (var4 instanceof class509) {
					class509 var5 = (class509)var4;
					if (var5.field4186 instanceof String) {
						if (var2.equals(var5.field4186)) {
							return false;
						}

						var5.method2269();
						this.field3225.method2547(new class509(var2), var5.field3987);
						return true;
					}
				}

				var4.method2269();
			}
		} else {
			this.field3225 = new class526(4);
		}

		this.field3225.method2547(new class509(var2), (long)var1);
		return true;
	}

	void method2032(class42 var1) {
		int var3 = var1.method278();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method278();
			if ((var4 & 1) != 0) {
				this.field3202 = true;
			}

			if ((var4 & 2) != 0) {
				this.field3222 = true;
			}

			if (!this.field3202) {
				this.field3201 = null;
				this.field3213 = null;
			}

			if (!this.field3222) {
				this.field3223 = null;
				this.field3224 = null;
			}

			this.field3220 = var1.method282();
			this.field3206 = var1.method282();
			if (var3 <= 3 && this.field3206 != 0) {
				this.field3206 += 16912800;
			}

			this.field3212 = var1.method327();
			this.field3205 = var1.method278();
			this.field3208 = var1.method286();
			if (var3 >= 4) {
				var1.method282();
			}

			this.field3207 = var1.method278() == 1;
			this.field3221 = var1.method279();
			this.field3209 = var1.method279();
			this.field3210 = var1.method279();
			this.field3211 = var1.method279();
			int var5;
			if (this.field3212 > 0) {
				if (this.field3202 && (this.field3201 == null || this.field3201.length < this.field3212)) {
					this.field3201 = new long[this.field3212];
				}

				if (this.field3222 && (this.field3223 == null || this.field3223.length < this.field3212)) {
					this.field3223 = new String[this.field3212];
				}

				if (this.field3214 == null || this.field3214.length < this.field3212) {
					this.field3214 = new byte[this.field3212];
				}

				if (null == this.field3216 || this.field3216.length < this.field3212) {
					this.field3216 = new int[this.field3212];
				}

				if (this.field3217 == null || this.field3217.length < this.field3212) {
					this.field3217 = new int[this.field3212];
				}

				if (null == this.field3218 || this.field3218.length < this.field3212) {
					this.field3218 = new boolean[this.field3212];
				}

				for (var5 = 0; var5 < this.field3212; ++var5) {
					if (this.field3202) {
						this.field3201[var5] = var1.method283();
					}

					if (this.field3222) {
						this.field3223[var5] = var1.method337();
					}

					this.field3214[var5] = var1.method279();
					if (var3 >= 2) {
						this.field3216[var5] = var1.method282();
					}

					if (var3 >= 5) {
						this.field3217[var5] = var1.method327();
					} else {
						this.field3217[var5] = 0;
					}

					if (var3 >= 6) {
						this.field3218[var5] = var1.method278() == 1;
					} else {
						this.field3218[var5] = false;
					}
				}

				this.method2036();
			}

			if (this.field3205 > 0) {
				if (this.field3202 && (this.field3213 == null || this.field3213.length < this.field3205)) {
					this.field3213 = new long[this.field3205];
				}

				if (this.field3222 && (null == this.field3224 || this.field3224.length < this.field3205)) {
					this.field3224 = new String[this.field3205];
				}

				for (var5 = 0; var5 < this.field3205; ++var5) {
					if (this.field3202) {
						this.field3213[var5] = var1.method283();
					}

					if (this.field3222) {
						this.field3224[var5] = var1.method337();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.method327();
				if (var5 > 0) {
					this.field3225 = new class526(var5 < 16 ? class476.method2304(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.method282();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method282();
							this.field3225.method2547(new class380(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.method283();
							this.field3225.method2547(new class211(var11), (long)var7);
						} else if (var8 == 2) {
							String var12 = var1.method286();
							this.field3225.method2547(new class509(var12), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
