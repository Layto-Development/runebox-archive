import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fi")
public class class291 {
	@ObfInfo(name = "ae", desc = "Z")
	boolean field2299;
	@ObfInfo(name = "ao", desc = "Z")
	boolean field2319;
	@ObfInfo(name = "ak", desc = "Lsf;")
	class525 field2322;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1229768005)
	int field2303;
	@ObfInfo(name = "ab", desc = "[I")
	int[] field2312;
	@ObfInfo(name = "ag", desc = "[I")
	int[] field2313;
	@ObfInfo(name = "at", desc = "J", longMultiplier = 6365319892590491043L)
	long field2300;
	@ObfInfo(name = "an", desc = "[J")
	long[] field2298;
	@ObfInfo(name = "aj", desc = "[J")
	long[] field2310;
	@ObfInfo(name = "ap", desc = "Z")
	public boolean field2304;
	@ObfInfo(name = "ax", desc = "[Z")
	public boolean[] field2315;
	@ObfInfo(name = "af", desc = "B")
	public byte field2306;
	@ObfInfo(name = "ad", desc = "B")
	public byte field2307;
	@ObfInfo(name = "aq", desc = "B")
	public byte field2308;
	@ObfInfo(name = "aa", desc = "B")
	public byte field2318;
	@ObfInfo(name = "ar", desc = "[B")
	public byte[] field2311;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -897595547)
	public int field2301;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -1311075045)
	public int field2302;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1116424963)
	public int field2309;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1570343699)
	public int field2316;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 345317997)
	public int field2317;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field2314;
	@ObfInfo(name = "ai", desc = "Ljava/lang/String;")
	public String field2305;
	@ObfInfo(name = "av", desc = "[Ljava/lang/String;")
	public String[] field2320;
	@ObfInfo(name = "aw", desc = "[Ljava/lang/String;")
	public String[] field2321;

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	public class291(class280 var1) {
		this.field2317 = 0;
		this.field2305 = null;
		this.field2303 = 0;
		this.field2316 = -1;
		this.field2301 = -1;
		this.method1602(var1);
	}

	@ObfInfo(name = "au", desc = "(II)V", opaqueValue = "835629433")
	void method1588(int var1) {
		if (this.field2299) {
			if (null != this.field2298) {
				System.arraycopy(this.field2298, 0, this.field2298 = new long[var1], 0, this.field2309);
			} else {
				this.field2298 = new long[var1];
			}
		}

		if (this.field2319) {
			if (null != this.field2320) {
				System.arraycopy(this.field2320, 0, this.field2320 = new String[var1], 0, this.field2309);
			} else {
				this.field2320 = new String[var1];
			}
		}

		if (null != this.field2311) {
			System.arraycopy(this.field2311, 0, this.field2311 = new byte[var1], 0, this.field2309);
		} else {
			this.field2311 = new byte[var1];
		}

		if (null != this.field2313) {
			System.arraycopy(this.field2313, 0, this.field2313 = new int[var1], 0, this.field2309);
		} else {
			this.field2313 = new int[var1];
		}

		if (this.field2314 != null) {
			System.arraycopy(this.field2314, 0, this.field2314 = new int[var1], 0, this.field2309);
		} else {
			this.field2314 = new int[var1];
		}

		if (null != this.field2315) {
			System.arraycopy(this.field2315, 0, this.field2315 = new boolean[var1], 0, this.field2309);
		} else {
			this.field2315 = new boolean[var1];
		}

	}

	@ObfInfo(name = "ae", desc = "(IB)V", opaqueValue = "15")
	void method1589(int var1) {
		if (this.field2299) {
			if (null != this.field2310) {
				System.arraycopy(this.field2310, 0, this.field2310 = new long[var1], 0, this.field2302);
			} else {
				this.field2310 = new long[var1];
			}
		}

		if (this.field2319) {
			if (null != this.field2321) {
				System.arraycopy(this.field2321, 0, this.field2321 = new String[var1], 0, this.field2302);
			} else {
				this.field2321 = new String[var1];
			}
		}

	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;I)I", opaqueValue = "720192251")
	public int method1595(String var1) {
		if (null != var1 && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field2309; ++var3) {
				if (this.field2320[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfInfo(name = "at", desc = "(IIII)I")
	public int method1597(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field2313[var1] & var5) >>> var2;
	}

	@ObfInfo(name = "ac", desc = "(II)Ljava/lang/Integer;", opaqueValue = "1038796157")
	public Integer method1590(int var1) {
		if (null == this.field2322) {
			return null;
		} else {
			class155 var3 = this.field2322.method2558((long)var1);
			return null != var3 && var3 instanceof class149 ? new Integer(((class149)var3).field1457) : null;
		}
	}

	@ObfInfo(name = "ai", desc = "(I)[I", opaqueValue = "-396310664")
	public int[] method1591() {
		if (null == this.field2312) {
			String[] var2 = new String[this.field2309];
			this.field2312 = new int[this.field2309];

			for (int var3 = 0; var3 < this.field2309; this.field2312[var3] = var3++) {
				var2[var3] = this.field2320[var3];
				if (null != var2[var3]) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			int[] var4 = this.field2312;
			class330.method1807(var2, var4, 0, var2.length - 1);
		}

		return this.field2312;
	}

	@ObfInfo(name = "az", desc = "(JLjava/lang/String;IB)V", opaqueValue = "7")
	void method1603(long var1, String var3, int var4) {
		if (null != var3 && var3.length() == 0) {
			var3 = null;
		}

		if (this.field2299 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.field2319 != (null != var3)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field2298 == null || this.field2309 >= this.field2298.length) || null != var3 && (this.field2320 == null || this.field2309 >= this.field2320.length)) {
				this.method1588(this.field2309 + 5);
			}

			if (this.field2298 != null) {
				this.field2298[this.field2309] = var1;
			}

			if (this.field2320 != null) {
				this.field2320[this.field2309] = var3;
			}

			if (this.field2316 == -1) {
				this.field2316 = this.field2309;
				this.field2311[this.field2309] = 126;
			} else {
				this.field2311[this.field2309] = 0;
			}

			this.field2313[this.field2309] = 0;
			this.field2314[this.field2309] = var4;
			this.field2315[this.field2309] = false;
			++this.field2309;
			this.field2312 = null;
		}
	}

	@ObfInfo(name = "ap", desc = "(IB)V", opaqueValue = "-1")
	void method1592(int var1) {
		if (var1 >= 0 && var1 < this.field2309) {
			--this.field2309;
			this.field2312 = null;
			if (this.field2309 == 0) {
				this.field2298 = null;
				this.field2320 = null;
				this.field2311 = null;
				this.field2313 = null;
				this.field2314 = null;
				this.field2315 = null;
				this.field2316 = -1;
				this.field2301 = -1;
			} else {
				System.arraycopy(this.field2311, var1 + 1, this.field2311, var1, this.field2309 - var1);
				System.arraycopy(this.field2313, var1 + 1, this.field2313, var1, this.field2309 - var1);
				System.arraycopy(this.field2314, var1 + 1, this.field2314, var1, this.field2309 - var1);
				System.arraycopy(this.field2315, var1 + 1, this.field2315, var1, this.field2309 - var1);
				if (this.field2298 != null) {
					System.arraycopy(this.field2298, var1 + 1, this.field2298, var1, this.field2309 - var1);
				}

				if (this.field2320 != null) {
					System.arraycopy(this.field2320, var1 + 1, this.field2320, var1, this.field2309 - var1);
				}

				this.method1606();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "aa", desc = "(I)V", opaqueValue = "1152334560")
	void method1606() {
		if (this.field2309 == 0) {
			this.field2316 = -1;
			this.field2301 = -1;
		} else {
			this.field2316 = -1;
			this.field2301 = -1;
			int var2 = 0;
			byte var3 = this.field2311[0];

			for (int var4 = 1; var4 < this.field2309; ++var4) {
				if (this.field2311[var4] > var3) {
					if (var3 == 125) {
						this.field2301 = var2;
					}

					var2 = var4;
					var3 = this.field2311[var4];
				} else if (this.field2301 == -1 && this.field2311[var4] == 125) {
					this.field2301 = var4;
				}
			}

			this.field2316 = var2;
			if (this.field2316 != -1) {
				this.field2311[this.field2316] = 126;
			}

		}
	}

	@ObfInfo(name = "af", desc = "(JLjava/lang/String;I)V", opaqueValue = "1480101677")
	void method1593(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field2299 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field2319) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field2310 == null || this.field2302 >= this.field2310.length) || null != var3 && (null == this.field2321 || this.field2302 >= this.field2321.length)) {
				this.method1589(this.field2302 + 5);
			}

			if (null != this.field2310) {
				this.field2310[this.field2302] = var1;
			}

			if (this.field2321 != null) {
				this.field2321[this.field2302] = var3;
			}

			++this.field2302;
		}
	}

	@ObfInfo(name = "ad", desc = "(II)V", opaqueValue = "509826850")
	void method1594(int var1) {
		--this.field2302;
		if (this.field2302 == 0) {
			this.field2310 = null;
			this.field2321 = null;
		} else {
			if (null != this.field2310) {
				System.arraycopy(this.field2310, var1 + 1, this.field2310, var1, this.field2302 - var1);
			}

			if (this.field2321 != null) {
				System.arraycopy(this.field2321, var1 + 1, this.field2321, var1, this.field2302 - var1);
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(IBB)I", opaqueValue = "1")
	int method1604(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.field2316 || this.field2301 != -1 && this.field2311[this.field2301] >= 125) {
				if (this.field2311[var1] == var2) {
					return -1;
				} else {
					this.field2311[var1] = var2;
					this.method1606();
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	@ObfInfo(name = "al", desc = "(II)Z", opaqueValue = "1468638319")
	boolean method1596(int var1) {
		if (var1 != this.field2316 && this.field2311[var1] != 126) {
			this.field2311[this.field2316] = 125;
			this.field2301 = this.field2316;
			this.field2311[var1] = 126;
			this.field2316 = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "an", desc = "(IZI)I", opaqueValue = "728034272")
	int method1605(int var1, boolean var2) {
		if (this.field2315[var1] == var2) {
			return -1;
		} else {
			this.field2315[var1] = var2;
			return var1;
		}
	}

	@ObfInfo(name = "ar", desc = "(IIIII)I", opaqueValue = "478496279")
	int method1598(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field2313[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field2313[var1] = var9 | var2;
			return var1;
		}
	}

	@ObfInfo(name = "ab", desc = "(III)Z", opaqueValue = "1386960565")
	boolean method1587(int var1, int var2) {
		if (null != this.field2322) {
			class155 var4 = this.field2322.method2558((long)var1);
			if (null != var4) {
				if (var4 instanceof class149) {
					class149 var5 = (class149)var4;
					if (var5.field1457 == var2) {
						return false;
					}

					var5.field1457 = var2;
					return true;
				}

				var4.method907();
			}
		} else {
			this.field2322 = new class525(4);
		}

		this.field2322.method2562(new class149(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "ag", desc = "(IIIIB)Z", opaqueValue = "0")
	boolean method1599(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (null != this.field2322) {
			class155 var9 = this.field2322.method2558((long)var1);
			if (null != var9) {
				if (var9 instanceof class149) {
					class149 var10 = (class149)var9;
					if (var2 == (var10.field1457 & var8)) {
						return false;
					}

					var10.field1457 &= ~var8;
					var10.field1457 |= var2;
					return true;
				}

				var9.method907();
			}
		} else {
			this.field2322 = new class525(4);
		}

		this.field2322.method2562(new class149(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "am", desc = "(IJ)Z")
	boolean method1600(int var1, long var2) {
		if (null != this.field2322) {
			class155 var4 = this.field2322.method2558((long)var1);
			if (var4 != null) {
				if (var4 instanceof class15) {
					class15 var5 = (class15)var4;
					if (var5.field352 == var2) {
						return false;
					}

					var5.field352 = var2;
					return true;
				}

				var4.method907();
			}
		} else {
			this.field2322 = new class525(4);
		}

		this.field2322.method2562(new class15(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "ax", desc = "(ILjava/lang/String;I)Z", opaqueValue = "-1409513695")
	boolean method1601(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (null != this.field2322) {
			class155 var4 = this.field2322.method2558((long)var1);
			if (null != var4) {
				if (var4 instanceof class45) {
					class45 var5 = (class45)var4;
					if (var5.field562 instanceof String) {
						if (var2.equals(var5.field562)) {
							return false;
						}

						var5.method907();
						this.field2322.method2562(new class45(var2), var5.field1483);
						return true;
					}
				}

				var4.method907();
			}
		} else {
			this.field2322 = new class525(4);
		}

		this.field2322.method2562(new class45(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "ah", desc = "(Ltm;I)V", opaqueValue = "-2067433980")
	void method1602(class280 var1) {
		int var3 = var1.method1492();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method1492();
			if ((var4 & 1) != 0) {
				this.field2299 = true;
			}

			if ((var4 & 2) != 0) {
				this.field2319 = true;
			}

			if (!this.field2299) {
				this.field2298 = null;
				this.field2310 = null;
			}

			if (!this.field2319) {
				this.field2320 = null;
				this.field2321 = null;
			}

			this.field2317 = var1.method1496();
			this.field2303 = var1.method1496();
			if (var3 <= 3 && this.field2303 != 0) {
				this.field2303 += 16912800;
			}

			this.field2309 = var1.method1541();
			this.field2302 = var1.method1492();
			this.field2305 = var1.method1500();
			if (var3 >= 4) {
				var1.method1496();
			}

			this.field2304 = var1.method1492() == 1;
			this.field2318 = var1.method1493();
			this.field2306 = var1.method1493();
			this.field2307 = var1.method1493();
			this.field2308 = var1.method1493();
			int var5;
			if (this.field2309 > 0) {
				if (this.field2299 && (this.field2298 == null || this.field2298.length < this.field2309)) {
					this.field2298 = new long[this.field2309];
				}

				if (this.field2319 && (this.field2320 == null || this.field2320.length < this.field2309)) {
					this.field2320 = new String[this.field2309];
				}

				if (this.field2311 == null || this.field2311.length < this.field2309) {
					this.field2311 = new byte[this.field2309];
				}

				if (null == this.field2313 || this.field2313.length < this.field2309) {
					this.field2313 = new int[this.field2309];
				}

				if (this.field2314 == null || this.field2314.length < this.field2309) {
					this.field2314 = new int[this.field2309];
				}

				if (null == this.field2315 || this.field2315.length < this.field2309) {
					this.field2315 = new boolean[this.field2309];
				}

				for (var5 = 0; var5 < this.field2309; ++var5) {
					if (this.field2299) {
						this.field2298[var5] = var1.method1497();
					}

					if (this.field2319) {
						this.field2320[var5] = var1.method1551();
					}

					this.field2311[var5] = var1.method1493();
					if (var3 >= 2) {
						this.field2313[var5] = var1.method1496();
					}

					if (var3 >= 5) {
						this.field2314[var5] = var1.method1541();
					} else {
						this.field2314[var5] = 0;
					}

					if (var3 >= 6) {
						this.field2315[var5] = var1.method1492() == 1;
					} else {
						this.field2315[var5] = false;
					}
				}

				this.method1606();
			}

			if (this.field2302 > 0) {
				if (this.field2299 && (this.field2310 == null || this.field2310.length < this.field2302)) {
					this.field2310 = new long[this.field2302];
				}

				if (this.field2319 && (null == this.field2321 || this.field2321.length < this.field2302)) {
					this.field2321 = new String[this.field2302];
				}

				for (var5 = 0; var5 < this.field2302; ++var5) {
					if (this.field2299) {
						this.field2310[var5] = var1.method1497();
					}

					if (this.field2319) {
						this.field2321[var5] = var1.method1551();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.method1541();
				if (var5 > 0) {
					this.field2322 = new class525(var5 < 16 ? class497.method2492(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.method1496();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method1496();
							this.field2322.method2562(new class149(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.method1497();
							this.field2322.method2562(new class15(var11), (long)var7);
						} else if (var8 == 2) {
							String var12 = var1.method1500();
							this.field2322.method2562(new class45(var12), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
