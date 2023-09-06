public class class235 extends class218 {
	public static boolean field2155;
	public static class215 field2107;
	public static class215 field2109;
	public static class344 field2135;
	static class344 field2108;
	static class344 field2111;
	static class344 field2129;
	static class48[] field2134;
	boolean field2112;
	boolean field2136;
	boolean field2145;
	class526 field2156;
	int field2105;
	int field2118;
	int field2122;
	int field2126;
	int field2131;
	int field2141;
	int field2142;
	int field2143;
	int field2148;
	int field2149;
	int field2154;
	int[] field2114;
	int[] field2115;
	short[] field2117;
	short[] field2119;
	short[] field2120;
	short[] field2128;
	public boolean field2110;
	public boolean field2124;
	public boolean field2132;
	public boolean field2137;
	public boolean field2138;
	public int field2106;
	public int field2113;
	public int field2121;
	public int field2123;
	public int field2127;
	public int field2130;
	public int field2133;
	public int field2139;
	public int field2140;
	public int field2146;
	public int field2150;
	public int field2151;
	public int field2152;
	public int field2153;
	public int[] field2144;
	public int[] field2147;
	public String field2116;
	public String[] field2125;

	static {
		field2155 = false;
		field2108 = new class344(4096);
		field2135 = new class344(500);
		field2111 = new class344(30);
		field2129 = new class344(30);
		field2134 = new class48[4];
	}

	class235() {
		this.field2116 = class433.field3850;
		this.field2121 = 1;
		this.field2106 = 1;
		this.field2123 = 2;
		this.field2124 = true;
		this.field2130 = -1;
		this.field2126 = -1;
		this.field2112 = false;
		this.field2132 = false;
		this.field2133 = -1;
		this.field2127 = 16;
		this.field2131 = 0;
		this.field2105 = 0;
		this.field2125 = new String[5];
		this.field2140 = -1;
		this.field2139 = -1;
		this.field2136 = false;
		this.field2137 = true;
		this.field2122 = 128;
		this.field2118 = 128;
		this.field2154 = 128;
		this.field2141 = 0;
		this.field2142 = 0;
		this.field2143 = 0;
		this.field2110 = false;
		this.field2145 = false;
		this.field2146 = -1;
		this.field2148 = -1;
		this.field2149 = -1;
		this.field2150 = -1;
		this.field2151 = 0;
		this.field2152 = 0;
		this.field2153 = 0;
		this.field2138 = true;
	}

	void method1343() {
		if (this.field2130 == -1) {
			this.field2130 = 0;
			if (this.field2114 != null && (null == this.field2115 || this.field2115[0] == 10)) {
				this.field2130 = 1;
			}

			for (int var2 = 0; var2 < 5; ++var2) {
				if (null != this.field2125[var2]) {
					this.field2130 = 1;
				}
			}
		}

		if (this.field2146 == -1) {
			this.field2146 = this.field2123 != 0 ? 1 : 0;
		}

	}

	void method1353(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method1344(var1, var3);
		}
	}

	void method1344(class42 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method278();
			if (var4 > 0) {
				if (null != this.field2114 && !field2155) {
					var1.field527 += var4 * 3;
				} else {
					this.field2115 = new int[var4];
					this.field2114 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2114[var5] = var1.method327();
						this.field2115[var5] = var1.method278();
					}
				}
			}
		} else if (var2 == 2) {
			this.field2116 = var1.method286();
		} else if (var2 == 5) {
			var4 = var1.method278();
			if (var4 > 0) {
				if (null != this.field2114 && !field2155) {
					var1.field527 += var4 * 2;
				} else {
					this.field2115 = null;
					this.field2114 = new int[var4];

					for (var5 = 0; var5 < var4; ++var5) {
						this.field2114[var5] = var1.method327();
					}
				}
			}
		} else if (var2 == 14) {
			this.field2121 = var1.method278();
		} else if (var2 == 15) {
			this.field2106 = var1.method278();
		} else if (var2 == 17) {
			this.field2123 = 0;
			this.field2124 = false;
		} else if (var2 == 18) {
			this.field2124 = false;
		} else if (var2 == 19) {
			this.field2130 = var1.method278();
		} else if (var2 == 21) {
			this.field2126 = 0;
		} else if (var2 == 22) {
			this.field2112 = true;
		} else if (var2 == 23) {
			this.field2132 = true;
		} else if (var2 == 24) {
			this.field2133 = var1.method327();
			if (this.field2133 == 65535) {
				this.field2133 = -1;
			}
		} else if (var2 == 27) {
			this.field2123 = 1;
		} else if (var2 == 28) {
			this.field2127 = var1.method278();
		} else if (var2 == 29) {
			this.field2131 = var1.method279();
		} else if (var2 == 39) {
			this.field2105 = var1.method279() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.field2125[var2 - 30] = var1.method286();
			if (this.field2125[var2 - 30].equalsIgnoreCase(class433.field3792)) {
				this.field2125[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method278();
			this.field2117 = new short[var4];
			this.field2128 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2117[var5] = (short)var1.method327();
				this.field2128[var5] = (short)var1.method327();
			}
		} else if (var2 == 41) {
			var4 = var1.method278();
			this.field2119 = new short[var4];
			this.field2120 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2119[var5] = (short)var1.method327();
				this.field2120[var5] = (short)var1.method327();
			}
		} else if (var2 == 61) {
			var1.method327();
		} else if (var2 == 62) {
			this.field2136 = true;
		} else if (var2 == 64) {
			this.field2137 = false;
		} else if (var2 == 65) {
			this.field2122 = var1.method327();
		} else if (var2 == 66) {
			this.field2118 = var1.method327();
		} else if (var2 == 67) {
			this.field2154 = var1.method327();
		} else if (var2 == 68) {
			this.field2139 = var1.method327();
		} else if (var2 == 69) {
			var1.method278();
		} else if (var2 == 70) {
			this.field2141 = var1.method280();
		} else if (var2 == 71) {
			this.field2142 = var1.method280();
		} else if (var2 == 72) {
			this.field2143 = var1.method280();
		} else if (var2 == 73) {
			this.field2110 = true;
		} else if (var2 == 74) {
			this.field2145 = true;
		} else if (var2 == 75) {
			this.field2146 = var1.method278();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.field2150 = var1.method327();
				this.field2151 = var1.method278();
			} else if (var2 == 79) {
				this.field2152 = var1.method327();
				this.field2153 = var1.method327();
				this.field2151 = var1.method278();
				var4 = var1.method278();
				this.field2144 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2144[var5] = var1.method327();
				}
			} else if (var2 == 81) {
				this.field2126 = var1.method278() * 256;
			} else if (var2 == 82) {
				this.field2140 = var1.method327();
			} else if (var2 == 89) {
				this.field2138 = false;
			} else if (var2 == 249) {
				this.field2156 = class475.method2299(var1, this.field2156);
			}
		} else {
			this.field2148 = var1.method327();
			if (this.field2148 == 65535) {
				this.field2148 = -1;
			}

			this.field2149 = var1.method327();
			if (this.field2149 == 65535) {
				this.field2149 = -1;
			}

			var4 = -1;
			if (var2 == 92) {
				var4 = var1.method327();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			var5 = var1.method278();
			this.field2147 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2147[var6] = var1.method327();
				if (this.field2147[var6] == 65535) {
					this.field2147[var6] = -1;
				}
			}

			this.field2147[var5 + 1] = var4;
		}

	}

	public final boolean method1345(int var1) {
		if (null != this.field2115) {
			for (int var5 = 0; var5 < this.field2115.length; ++var5) {
				if (this.field2115[var5] == var1) {
					return field2107.method1214(this.field2114[var5] & 65535, 0);
				}
			}

			return true;
		} else if (this.field2114 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;

			for (int var4 = 0; var4 < this.field2114.length; ++var4) {
				var3 &= field2107.method1214(this.field2114[var4] & 65535, 0);
			}

			return var3;
		}
	}

	public final boolean method1346() {
		if (this.field2114 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2114.length; ++var3) {
				var2 &= field2107.method1214(this.field2114[var3] & 65535, 0);
			}

			return var2;
		}
	}

	public final class480 method1347(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (null == this.field2115) {
			var8 = (long)(var2 + (this.field2113 << 10));
		} else {
			var8 = (long)(var2 + (var1 << 3) + (this.field2113 << 10));
		}

		Object var10 = (class480)field2111.method1890(var8);
		if (null == var10) {
			class48 var11 = this.method1354(var1, var2);
			if (var11 == null) {
				return null;
			}

			if (!this.field2112) {
				var10 = var11.method369(this.field2131 + 64, this.field2105 + 768, -50, -10, -50);
			} else {
				var11.field587 = (short)(this.field2131 + 64);
				var11.field576 = (short)(768 + this.field2105);
				var11.method365();
				var10 = var11;
			}

			field2111.method1889((class218)var10, var8);
		}

		if (this.field2112) {
			var10 = ((class48)var10).method354();
		}

		if (this.field2126 >= 0) {
			if (var10 instanceof class250) {
				var10 = ((class250)var10).method1450(var3, var4, var5, var6, true, this.field2126);
			} else if (var10 instanceof class48) {
				var10 = ((class48)var10).method355(var3, var4, var5, var6, true, this.field2126);
			}
		}

		return (class480)var10;
	}

	public final class250 method1349(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (this.field2115 == null) {
			var8 = (long)(var2 + (this.field2113 << 10));
		} else {
			var8 = (long)(var2 + (this.field2113 << 10) + (var1 << 3));
		}

		class250 var10 = (class250)field2129.method1890(var8);
		if (null == var10) {
			class48 var11 = this.method1354(var1, var2);
			if (var11 == null) {
				return null;
			}

			var10 = var11.method369(this.field2131 + 64, 768 + this.field2105, -50, -10, -50);
			field2129.method1889(var10, var8);
		}

		if (this.field2126 >= 0) {
			var10 = var10.method1450(var3, var4, var5, var6, true, this.field2126);
		}

		return var10;
	}

	public final class250 method1348(int var1, int var2, int[][] var3, int var4, int var5, int var6, class393 var7, int var8) {
		long var10;
		if (this.field2115 == null) {
			var10 = (long)((this.field2113 << 10) + var2);
		} else {
			var10 = (long)((this.field2113 << 10) + (var1 << 3) + var2);
		}

		class250 var12 = (class250)field2129.method1890(var10);
		if (null == var12) {
			class48 var13 = this.method1354(var1, var2);
			if (var13 == null) {
				return null;
			}

			var12 = var13.method369(this.field2131 + 64, 768 + this.field2105, -50, -10, -50);
			field2129.method1889(var12, var10);
		}

		if (var7 == null && this.field2126 == -1) {
			return var12;
		} else {
			if (var7 != null) {
				var12 = var7.method2053(var12, var8, var2);
			} else {
				var12 = var12.method1451(true);
			}

			if (this.field2126 >= 0) {
				var12 = var12.method1450(var3, var4, var5, var6, false, this.field2126);
			}

			return var12;
		}
	}

	final class48 method1354(int var1, int var2) {
		class48 var4 = null;
		boolean var5;
		int var6;
		int var8;
		if (this.field2115 == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.field2114 == null) {
				return null;
			}

			var5 = this.field2136;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}

			var6 = this.field2114.length;

			for (int var7 = 0; var7 < var6; ++var7) {
				var8 = this.field2114[var7];
				if (var5) {
					var8 += 65536;
				}

				var4 = (class48)field2135.method1890((long)var8);
				if (var4 == null) {
					var4 = class48.method373(field2107, var8 & 65535, 0);
					if (null == var4) {
						return null;
					}

					if (var5) {
						var4.method362();
					}

					field2135.method1889(var4, (long)var8);
				}

				if (var6 > 1) {
					field2134[var7] = var4;
				}
			}

			if (var6 > 1) {
				var4 = new class48(field2134, var6);
			}
		} else {
			int var9 = -1;

			for (var6 = 0; var6 < this.field2115.length; ++var6) {
				if (this.field2115[var6] == var1) {
					var9 = var6;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var6 = this.field2114[var9];
			boolean var10 = this.field2136 ^ var2 > 3;
			if (var10) {
				var6 += 65536;
			}

			var4 = (class48)field2135.method1890((long)var6);
			if (var4 == null) {
				var4 = class48.method373(field2107, var6 & 65535, 0);
				if (null == var4) {
					return null;
				}

				if (var10) {
					var4.method362();
				}

				field2135.method1889(var4, (long)var6);
			}
		}

		if (this.field2122 == 128 && this.field2118 == 128 && this.field2154 == 128) {
			var5 = false;
		} else {
			var5 = true;
		}

		boolean var11;
		if (this.field2141 == 0 && this.field2142 == 0 && this.field2143 == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		class48 var12 = new class48(var4, var2 == 0 && !var5 && !var11, this.field2117 == null, null == this.field2119, true);
		if (var1 == 4 && var2 > 3) {
			var12.method360(256);
			var12.method361(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var12.method357();
		} else if (var2 == 2) {
			var12.method358();
		} else if (var2 == 3) {
			var12.method359();
		}

		if (null != this.field2117) {
			for (var8 = 0; var8 < this.field2117.length; ++var8) {
				var12.method372(this.field2117[var8], this.field2128[var8]);
			}
		}

		if (this.field2119 != null) {
			for (var8 = 0; var8 < this.field2119.length; ++var8) {
				var12.method363(this.field2119[var8], this.field2120[var8]);
			}
		}

		if (var5) {
			var12.method364(this.field2122, this.field2118, this.field2154);
		}

		if (var11) {
			var12.method361(this.field2141, this.field2142, this.field2143);
		}

		return var12;
	}

	public final class235 method1350() {
		int var2 = -1;
		if (this.field2148 != -1) {
			var2 = class516.method2516(this.field2148);
		} else if (this.field2149 != -1) {
			var2 = class23.field443[this.field2149];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2147.length - 1) {
			var3 = this.field2147[var2];
		} else {
			var3 = this.field2147[this.field2147.length - 1];
		}

		return var3 != -1 ? class96.method638(var3, (byte)25) : null;
	}

	public int method1351(int var1, int var2) {
		return class57.method420(this.field2156, var1, var2);
	}

	public String method1352(int var1, String var2) {
		class526 var5 = this.field2156;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class509 var6 = (class509)var5.method2543((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4186;
			}
		}

		return var4;
	}

	public boolean method1355() {
		if (this.field2147 == null) {
			return this.field2150 != -1 || this.field2144 != null;
		} else {
			for (int var2 = 0; var2 < this.field2147.length; ++var2) {
				if (this.field2147[var2] != -1) {
					class235 var3 = class96.method638(this.field2147[var2], (byte)-30);
					if (var3.field2150 != -1 || var3.field2144 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	static void method1356() {
		if (Client.field57 && class116.field1110 != null && class116.field1110.length() > 0) {
			class116.field1108 = 1;
		} else {
			class116.field1108 = 0;
		}

	}
}
