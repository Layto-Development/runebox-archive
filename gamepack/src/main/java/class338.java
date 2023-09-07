public abstract class class338 {

	static class115 field2585;

	static int field2584;

	boolean field2569;

	boolean field2582;

	class509 field2571;

	class509[] field2580;

	int field2575;

	int[] field2572;

	int[] field2573;

	int[] field2574;

	int[] field2578;

	int[] field2583;

	int[][] field2570;

	int[][] field2576;

	Object[] field2577;

	Object[][] field2579;

	public int field2581;

	static {
		field2585 = new class115();
		field2584 = 0;
	}

	class338(boolean var1, boolean var2) {
		this.field2582 = var1;
		this.field2569 = var2;
	}

	void method1785(byte[] var1) {
		int var4 = var1.length;
		int var6 = -1;
		int var7;
		for (var7 = 0; var7 < var4; ++var7) {
			var6 = var6 >>> 8 ^ class187.field1831[(var6 ^ var1[var7]) & 255];
		}
		var6 = ~var6;
		this.field2581 = var6;
		class187 var5 = new class187(method1790(var1));
		var6 = var5.method1096();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.method1100();
			}
			var7 = var5.method1096();
			if (var6 >= 7) {
				this.field2575 = var5.method1110();
			} else {
				this.field2575 = var5.method1145();
			}
			int var8 = 0;
			int var9 = -1;
			this.field2583 = new int[this.field2575];
			int var10;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field2575; ++var10) {
					this.field2583[var10] = var8 += var5.method1110();
					if (this.field2583[var10] > var9) {
						var9 = this.field2583[var10];
					}
				}
			} else {
				for (var10 = 0; var10 < this.field2575; ++var10) {
					this.field2583[var10] = var8 += var5.method1145();
					if (this.field2583[var10] > var9) {
						var9 = this.field2583[var10];
					}
				}
			}
			this.field2572 = new int[var9 + 1];
			this.field2573 = new int[var9 + 1];
			this.field2574 = new int[var9 + 1];
			this.field2570 = new int[var9 + 1][];
			this.field2577 = new Object[var9 + 1];
			this.field2579 = new Object[var9 + 1][];
			if (var7 != 0) {
				this.field2578 = new int[var9 + 1];
				for (var10 = 0; var10 < this.field2575; ++var10) {
					this.field2578[this.field2583[var10]] = var5.method1100();
				}
				this.field2571 = new class509(this.field2578);
			}
			for (var10 = 0; var10 < this.field2575; ++var10) {
				this.field2572[this.field2583[var10]] = var5.method1100();
			}
			for (var10 = 0; var10 < this.field2575; ++var10) {
				this.field2573[this.field2583[var10]] = var5.method1100();
			}
			for (var10 = 0; var10 < this.field2575; ++var10) {
				this.field2574[this.field2583[var10]] = var5.method1145();
			}
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field2575; ++var10) {
					var11 = this.field2583[var10];
					var12 = this.field2574[var11];
					var8 = 0;
					var13 = -1;
					this.field2570[var11] = new int[var12];
					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field2570[var11][var14] = var8 += var5.method1110();
						if (var15 > var13) {
							var13 = var15;
						}
					}
					this.field2579[var11] = new Object[var13 + 1];
				}
			} else {
				for (var10 = 0; var10 < this.field2575; ++var10) {
					var11 = this.field2583[var10];
					var12 = this.field2574[var11];
					var8 = 0;
					var13 = -1;
					this.field2570[var11] = new int[var12];
					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field2570[var11][var14] = var8 += var5.method1145();
						if (var15 > var13) {
							var13 = var15;
						}
					}
					this.field2579[var11] = new Object[var13 + 1];
				}
			}
			if (var7 != 0) {
				this.field2576 = new int[var9 + 1][];
				this.field2580 = new class509[var9 + 1];
				for (var10 = 0; var10 < this.field2575; ++var10) {
					var11 = this.field2583[var10];
					var12 = this.field2574[var11];
					this.field2576[var11] = new int[this.field2579[var11].length];
					for (var13 = 0; var13 < var12; ++var13) {
						this.field2576[var11][this.field2570[var11][var13]] = var5.method1100();
					}
					this.field2580[var11] = new class509(this.field2576[var11]);
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	void method1780(int var1) {
	}

	public byte[] method1762(int var1, int var2) {
		return this.method1763(var1, var2, (int[]) null);
	}

	public byte[] method1763(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field2579.length && null != this.field2579[var1] && var2 >= 0 && var2 < this.field2579[var1].length) {
			if (null == this.field2579[var1][var2]) {
				boolean var5 = this.method1778(var1, var3);
				if (!var5) {
					this.method1772(var1);
					var5 = this.method1778(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}
			byte[] var6 = class99.method626(this.field2579[var1][var2], false);
			if (this.field2569) {
				this.field2579[var1][var2] = null;
			}
			return var6;
		} else {
			return null;
		}
	}

	public boolean method1764(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field2579.length && this.field2579[var1] != null && var2 >= 0 && var2 < this.field2579[var1].length) {
			if (this.field2579[var1][var2] != null) {
				return true;
			} else if (null != this.field2577[var1]) {
				return true;
			} else {
				this.method1772(var1);
				return null != this.field2577[var1];
			}
		} else {
			return false;
		}
	}

	public boolean method1765(int var1) {
		if (this.field2579.length == 1) {
			return this.method1764(0, var1);
		} else if (this.field2579[var1].length == 1) {
			return this.method1764(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method1766(int var1) {
		if (this.field2577[var1] != null) {
			return true;
		} else {
			this.method1772(var1);
			return null != this.field2577[var1];
		}
	}

	public boolean method1767() {
		boolean var2 = true;
		for (int var3 = 0; var3 < this.field2583.length; ++var3) {
			int var4 = this.field2583[var3];
			if (this.field2577[var4] == null) {
				this.method1772(var4);
				if (this.field2577[var4] == null) {
					var2 = false;
				}
			}
		}
		return var2;
	}

	int method1768(int var1) {
		return null != this.field2577[var1] ? 100 : 0;
	}

	public byte[] method1769(int var1) {
		if (this.field2579.length == 1) {
			return this.method1762(0, var1);
		} else if (this.field2579[var1].length == 1) {
			return this.method1762(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public byte[] method1770(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field2579.length && this.field2579[var1] != null && var2 >= 0 && var2 < this.field2579[var1].length) {
			if (null == this.field2579[var1][var2]) {
				boolean var4 = this.method1778(var1, (int[]) null);
				if (!var4) {
					this.method1772(var1);
					var4 = this.method1778(var1, (int[]) null);
					if (!var4) {
						return null;
					}
				}
			}
			byte[] var5 = class99.method626(this.field2579[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	public byte[] method1771(int var1) {
		if (this.field2579.length == 1) {
			return this.method1770(0, var1);
		} else if (this.field2579[var1].length == 1) {
			return this.method1770(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	void method1772(int var1) {
	}

	public int[] method1773(int var1) {
		return var1 >= 0 && var1 < this.field2570.length ? this.field2570[var1] : null;
	}

	public int method1788(int var1) {
		return null != this.field2579 && var1 < this.field2579.length && this.field2579[var1] != null ? this.field2579[var1].length : 0;
	}

	public int method1774() {
		return this.field2579.length;
	}

	public void method1775() {
		for (int var2 = 0; var2 < this.field2577.length; ++var2) {
			this.field2577[var2] = null;
		}
	}

	public void method1776(int var1) {
		for (int var3 = 0; var3 < this.field2579[var1].length; ++var3) {
			this.field2579[var1][var3] = null;
		}
	}

	public void method1777() {
		for (int var2 = 0; var2 < this.field2579.length; ++var2) {
			if (this.field2579[var2] != null) {
				for (int var3 = 0; var3 < this.field2579[var2].length; ++var3) {
					this.field2579[var2][var3] = null;
				}
			}
		}
	}

	boolean method1778(int var1, int[] var2) {
		if (this.field2577[var1] == null) {
			return false;
		} else {
			int var4 = this.field2574[var1];
			int[] var5 = this.field2570[var1];
			Object[] var6 = this.field2579[var1];
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
					var22 = class99.method626(this.field2577[var1], false);
				} else {
					var22 = class99.method626(this.field2577[var1], true);
					class187 var9 = new class187(var22);
					var9.method1147(var2, 5, var9.field1830.length);
				}
				byte[] var23 = method1790(var22);
				if (this.field2582) {
					this.field2577[var1] = null;
				}
				int var11;
				if (var4 > 1) {
					int var10 = var23.length;
					--var10;
					var11 = var23[var10] & 255;
					var10 -= var11 * var4 * 4;
					class187 var12 = new class187(var23);
					int[] var13 = new int[var4];
					var12.field1832 = var10;
					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;
						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method1100();
							var13[var16] += var15;
						}
					}
					byte[][] var26 = new byte[var4][];
					for (var15 = 0; var15 < var4; ++var15) {
						var26[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}
					var12.field1832 = var10;
					var15 = 0;
					int var18;
					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;
						for (var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method1100();
							System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}
					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field2569) {
							var18 = var5[var16];
							byte[] var20 = var26[var16];
							Object var19;
							if (var20 == null) {
								var19 = null;
							} else if (var20.length > 136) {
								class382 var21 = new class382();
								var21.method624(var20);
								var19 = var21;
							} else {
								var19 = var20;
							}
							var6[var18] = var19;
						} else {
							var6[var5[var16]] = var26[var16];
						}
					}
				} else if (!this.field2569) {
					var11 = var5[0];
					Object var24;
					if (var23 == null) {
						var24 = null;
					} else if (var23.length > 136) {
						class382 var25 = new class382();
						var25.method624(var23);
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

	public int method1787(String var1) {
		var1 = var1.toLowerCase();
		return this.field2571.method2457(class514.method2473(var1));
	}

	public int method1779(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field2580[var1].method2457(class514.method2473(var2));
	}

	public boolean method1784(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field2571.method2457(class514.method2473(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field2580[var4].method2457(class514.method2473(var2));
			return var5 >= 0;
		}
	}

	public byte[] method1781(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field2571.method2457(class514.method2473(var1));
		int var5 = this.field2580[var4].method2457(class514.method2473(var2));
		return this.method1762(var4, var5);
	}

	public boolean method1782(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field2571.method2457(class514.method2473(var1));
		int var5 = this.field2580[var4].method2457(class514.method2473(var2));
		return this.method1764(var4, var5);
	}

	public boolean method1783(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field2571.method2457(class514.method2473(var1));
		return this.method1766(var3);
	}

	public void method1786(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field2571.method2457(class514.method2473(var1));
		if (var3 >= 0) {
			this.method1780(var3);
		}
	}

	public int method1789(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field2571.method2457(class514.method2473(var1));
		return this.method1768(var3);
	}

	static final byte[] method1790(byte[] var0) {
		class187 var2 = new class187(var0);
		int var3 = var2.method1096();
		int var4 = var2.method1100();
		if (var4 >= 0 && (field2584 == 0 || var4 <= field2584)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.method1106(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.method1100();
				if (var5 < 0 || field2584 != 0 && var5 > field2584) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						class37.method166(var6, var5, var0, var4, 9);
					} else {
						field2585.method792(var2, var6);
					}
					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
