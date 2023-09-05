import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "nu")
public abstract class class437 {
	@ObfInfo(name = "bt", desc = "Lus;")
	static class221 field3297;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = -587326437)
	static int field3296;
	@ObfInfo(name = "bs", desc = "Z")
	boolean field3281;
	@ObfInfo(name = "by", desc = "Z")
	boolean field3294;
	@ObfInfo(name = "ay", desc = "Luz;")
	class274 field3283;
	@ObfInfo(name = "bj", desc = "[Luz;")
	class274[] field3292;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -1963160975)
	int field3287;
	@ObfInfo(name = "aj", desc = "[I")
	int[] field3284;
	@ObfInfo(name = "av", desc = "[I")
	int[] field3285;
	@ObfInfo(name = "aw", desc = "[I")
	int[] field3286;
	@ObfInfo(name = "as", desc = "[I")
	int[] field3290;
	@ObfInfo(name = "ah", desc = "[I")
	int[] field3295;
	@ObfInfo(name = "ak", desc = "[[I")
	int[][] field3282;
	@ObfInfo(name = "bh", desc = "[[I")
	int[][] field3288;
	@ObfInfo(name = "bk", desc = "[Ljava/lang/Object;")
	Object[] field3289;
	@ObfInfo(name = "bv", desc = "[[Ljava/lang/Object;")
	Object[][] field3291;
	@ObfInfo(name = "bd", desc = "I", intMultiplier = -214196507)
	public int field3293;

	static {
		field3297 = new class221();
		field3296 = 0;
	}

	@ObfInfo(name = "<init>", desc = "(ZZ)V")
	class437(boolean var1, boolean var2) {
		this.field3294 = var1;
		this.field3281 = var2;
	}

	@ObfInfo(name = "be", desc = "([BI)V", opaqueValue = "-1090488140")
	void method2290(byte[] var1) {
		int var4 = var1.length;
		int var6 = -1;

		int var7;
		for (var7 = 0; var7 < var4; ++var7) {
			var6 = var6 >>> 8 ^ class280.field2253[(var6 ^ var1[var7]) & 255];
		}

		var6 = ~var6;
		this.field3293 = var6;
		class280 var5 = new class280(method2295(var1));
		var6 = var5.method1492();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.method1496();
			}

			var7 = var5.method1492();
			if (var6 >= 7) {
				this.field3287 = var5.method1506();
			} else {
				this.field3287 = var5.method1541();
			}

			int var8 = 0;
			int var9 = -1;
			this.field3295 = new int[this.field3287];
			int var10;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field3287; ++var10) {
					this.field3295[var10] = var8 += var5.method1506();
					if (this.field3295[var10] > var9) {
						var9 = this.field3295[var10];
					}
				}
			} else {
				for (var10 = 0; var10 < this.field3287; ++var10) {
					this.field3295[var10] = var8 += var5.method1541();
					if (this.field3295[var10] > var9) {
						var9 = this.field3295[var10];
					}
				}
			}

			this.field3284 = new int[var9 + 1];
			this.field3285 = new int[var9 + 1];
			this.field3286 = new int[var9 + 1];
			this.field3282 = new int[var9 + 1][];
			this.field3289 = new Object[var9 + 1];
			this.field3291 = new Object[var9 + 1][];
			if (var7 != 0) {
				this.field3290 = new int[var9 + 1];

				for (var10 = 0; var10 < this.field3287; ++var10) {
					this.field3290[this.field3295[var10]] = var5.method1496();
				}

				this.field3283 = new class274(this.field3290);
			}

			for (var10 = 0; var10 < this.field3287; ++var10) {
				this.field3284[this.field3295[var10]] = var5.method1496();
			}

			for (var10 = 0; var10 < this.field3287; ++var10) {
				this.field3285[this.field3295[var10]] = var5.method1496();
			}

			for (var10 = 0; var10 < this.field3287; ++var10) {
				this.field3286[this.field3295[var10]] = var5.method1541();
			}

			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field3287; ++var10) {
					var11 = this.field3295[var10];
					var12 = this.field3286[var11];
					var8 = 0;
					var13 = -1;
					this.field3282[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field3282[var11][var14] = var8 += var5.method1506();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field3291[var11] = new Object[var13 + 1];
				}
			} else {
				for (var10 = 0; var10 < this.field3287; ++var10) {
					var11 = this.field3295[var10];
					var12 = this.field3286[var11];
					var8 = 0;
					var13 = -1;
					this.field3282[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field3282[var11][var14] = var8 += var5.method1541();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field3291[var11] = new Object[var13 + 1];
				}
			}

			if (var7 != 0) {
				this.field3288 = new int[var9 + 1][];
				this.field3292 = new class274[var9 + 1];

				for (var10 = 0; var10 < this.field3287; ++var10) {
					var11 = this.field3295[var10];
					var12 = this.field3286[var11];
					this.field3288[var11] = new int[this.field3291[var11].length];

					for (var13 = 0; var13 < var12; ++var13) {
						this.field3288[var11][this.field3282[var11][var13]] = var5.method1496();
					}

					this.field3292[var11] = new class274(this.field3288[var11]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "ao", desc = "(II)V")
	void method2285(int var1) {
	}

	@ObfInfo(name = "bi", desc = "(IIB)[B")
	public byte[] method2267(int var1, int var2) {
		return this.method2268(var1, var2, (int[])null);
	}

	@ObfInfo(name = "bz", desc = "(II[II)[B", opaqueValue = "1754901963")
	public byte[] method2268(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field3291.length && null != this.field3291[var1] && var2 >= 0 && var2 < this.field3291[var1].length) {
			if (null == this.field3291[var1][var2]) {
				boolean var5 = this.method2283(var1, var3);
				if (!var5) {
					this.method2277(var1);
					var5 = this.method2283(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = class315.method1736(this.field3291[var1][var2], false);
			if (this.field3281) {
				this.field3291[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "bx", desc = "(IIB)Z", opaqueValue = "1")
	public boolean method2269(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field3291.length && this.field3291[var1] != null && var2 >= 0 && var2 < this.field3291[var1].length) {
			if (this.field3291[var1][var2] != null) {
				return true;
			} else if (null != this.field3289[var1]) {
				return true;
			} else {
				this.method2277(var1);
				return null != this.field3289[var1];
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "bn", desc = "(II)Z", opaqueValue = "-1957473763")
	public boolean method2270(int var1) {
		if (this.field3291.length == 1) {
			return this.method2269(0, var1);
		} else if (this.field3291[var1].length == 1) {
			return this.method2269(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "bw", desc = "(II)Z", opaqueValue = "1252310814")
	public boolean method2271(int var1) {
		if (this.field3289[var1] != null) {
			return true;
		} else {
			this.method2277(var1);
			return null != this.field3289[var1];
		}
	}

	@ObfInfo(name = "bc", desc = "(I)Z", opaqueValue = "130057878")
	public boolean method2272() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field3295.length; ++var3) {
			int var4 = this.field3295[var3];
			if (this.field3289[var4] == null) {
				this.method2277(var4);
				if (this.field3289[var4] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	@ObfInfo(name = "af", desc = "(II)I", opaqueValue = "-1845624060")
	int method2273(int var1) {
		return null != this.field3289[var1] ? 100 : 0;
	}

	@ObfInfo(name = "bg", desc = "(II)[B")
	public byte[] method2274(int var1) {
		if (this.field3291.length == 1) {
			return this.method2267(0, var1);
		} else if (this.field3291[var1].length == 1) {
			return this.method2267(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "cw", desc = "(III)[B", opaqueValue = "-1153042989")
	public byte[] method2275(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field3291.length && this.field3291[var1] != null && var2 >= 0 && var2 < this.field3291[var1].length) {
			if (null == this.field3291[var1][var2]) {
				boolean var4 = this.method2283(var1, (int[])null);
				if (!var4) {
					this.method2277(var1);
					var4 = this.method2283(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class315.method1736(this.field3291[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "cf", desc = "(II)[B", opaqueValue = "-1576063147")
	public byte[] method2276(int var1) {
		if (this.field3291.length == 1) {
			return this.method2275(0, var1);
		} else if (this.field3291[var1].length == 1) {
			return this.method2275(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "at", desc = "(II)V")
	void method2277(int var1) {
	}

	@ObfInfo(name = "cm", desc = "(II)[I", opaqueValue = "1536385400")
	public int[] method2278(int var1) {
		return var1 >= 0 && var1 < this.field3282.length ? this.field3282[var1] : null;
	}

	@ObfInfo(name = "cn", desc = "(IB)I", opaqueValue = "19")
	public int method2293(int var1) {
		return null != this.field3291 && var1 < this.field3291.length && this.field3291[var1] != null ? this.field3291[var1].length : 0;
	}

	@ObfInfo(name = "cs", desc = "(B)I")
	public int method2279() {
		return this.field3291.length;
	}

	@ObfInfo(name = "cx", desc = "(I)V", opaqueValue = "72026164")
	public void method2280() {
		for (int var2 = 0; var2 < this.field3289.length; ++var2) {
			this.field3289[var2] = null;
		}

	}

	@ObfInfo(name = "cr", desc = "(IB)V", opaqueValue = "1")
	public void method2281(int var1) {
		for (int var3 = 0; var3 < this.field3291[var1].length; ++var3) {
			this.field3291[var1][var3] = null;
		}

	}

	@ObfInfo(name = "cd", desc = "(B)V", opaqueValue = "0")
	public void method2282() {
		for (int var2 = 0; var2 < this.field3291.length; ++var2) {
			if (this.field3291[var2] != null) {
				for (int var3 = 0; var3 < this.field3291[var2].length; ++var3) {
					this.field3291[var2][var3] = null;
				}
			}
		}

	}

	@ObfInfo(name = "ce", desc = "(I[IB)Z", opaqueValue = "-1")
	boolean method2283(int var1, int[] var2) {
		if (this.field3289[var1] == null) {
			return false;
		} else {
			int var4 = this.field3286[var1];
			int[] var5 = this.field3282[var1];
			Object[] var6 = this.field3291[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; ++var8) {
				if (null == var6[var5[var8]]) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var22;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var22 = class315.method1736(this.field3289[var1], false);
				} else {
					var22 = class315.method1736(this.field3289[var1], true);
					class280 var9 = new class280(var22);
					var9.method1543(var2, 5, var9.field2252.length);
				}

				byte[] var23 = method2295(var22);
				if (this.field3294) {
					this.field3289[var1] = null;
				}

				int var11;
				if (var4 > 1) {
					int var10 = var23.length;
					--var10;
					var11 = var23[var10] & 255;
					var10 -= var11 * var4 * 4;
					class280 var12 = new class280(var23);
					int[] var13 = new int[var4];
					var12.field2254 = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method1496();
							var13[var16] += var15;
						}
					}

					byte[][] var26 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var26[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.field2254 = var10;
					var15 = 0;

					int var18;
					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method1496();
							System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field3281) {
							var18 = var5[var16];
							byte[] var20 = var26[var16];
							Object var19;
							if (var20 == null) {
								var19 = null;
							} else if (var20.length > 136) {
								class46 var21 = new class46();
								var21.method1734(var20);
								var19 = var21;
							} else {
								var19 = var20;
							}

							var6[var18] = var19;
						} else {
							var6[var5[var16]] = var26[var16];
						}
					}
				} else if (!this.field3281) {
					var11 = var5[0];
					Object var24;
					if (var23 == null) {
						var24 = null;
					} else if (var23.length > 136) {
						class46 var25 = new class46();
						var25.method1734(var23);
						var24 = var25;
					} else {
						var24 = var23;
					}

					var6[var11] = var24;
				} else {
					var6[var5[0]] = var23;
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "cq", desc = "(Ljava/lang/String;I)I")
	public int method2292(String var1) {
		var1 = var1.toLowerCase();
		return this.field3283.method1440(class455.method2375(var1));
	}

	@ObfInfo(name = "cp", desc = "(ILjava/lang/String;I)I")
	public int method2284(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field3292[var1].method1440(class455.method2375(var2));
	}

	@ObfInfo(name = "cv", desc = "(Ljava/lang/String;Ljava/lang/String;I)Z", opaqueValue = "1843786240")
	public boolean method2289(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field3283.method1440(class455.method2375(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field3292[var4].method1440(class455.method2375(var2));
			return var5 >= 0;
		}
	}

	@ObfInfo(name = "co", desc = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method2286(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field3283.method1440(class455.method2375(var1));
		int var5 = this.field3292[var4].method1440(class455.method2375(var2));
		return this.method2267(var4, var5);
	}

	@ObfInfo(name = "cl", desc = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method2287(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field3283.method1440(class455.method2375(var1));
		int var5 = this.field3292[var4].method1440(class455.method2375(var2));
		return this.method2269(var4, var5);
	}

	@ObfInfo(name = "cu", desc = "(Ljava/lang/String;B)Z")
	public boolean method2288(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field3283.method1440(class455.method2375(var1));
		return this.method2271(var3);
	}

	@ObfInfo(name = "ch", desc = "(Ljava/lang/String;I)V", opaqueValue = "-1773670792")
	public void method2291(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field3283.method1440(class455.method2375(var1));
		if (var3 >= 0) {
			this.method2285(var3);
		}
	}

	@ObfInfo(name = "ci", desc = "(Ljava/lang/String;I)I")
	public int method2294(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field3283.method1440(class455.method2375(var1));
		return this.method2273(var3);
	}

	@ObfInfo(name = "ca", desc = "([BI)[B")
	static final byte[] method2295(byte[] var0) {
		class280 var2 = new class280(var0);
		int var3 = var2.method1492();
		int var4 = var2.method1496();
		if (var4 >= 0 && (field3296 == 0 || var4 <= field3296)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.method1502(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.method1496();
				if (var5 < 0 || field3296 != 0 && var5 > field3296) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						class423.method2216(var6, var5, var0, var4, 9);
					} else {
						field3297.method1206(var2, var6);
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
