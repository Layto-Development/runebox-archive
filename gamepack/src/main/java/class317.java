public class class317 {
	public static boolean field2861;
	public static int field2858;
	public static int field2859;
	static boolean field2846;
	static boolean field2860;
	static boolean[][] field2854;
	static boolean[][][][] field2878;
	static class446[] field2866;
	static class446[][] field2862;
	static class491[] field2863;
	static class86 field2867;
	static int field2830;
	static int field2833;
	static int field2839;
	static int field2840;
	static int field2841;
	static int field2842;
	static int field2843;
	static int field2844;
	static int field2845;
	static int field2847;
	static int field2848;
	static int field2849;
	static int field2850;
	static int field2851;
	static int field2852;
	static int field2853;
	static int field2856;
	static int field2857;
	static int field2864;
	static int field2865;
	static int field2875;
	static int field2876;
	static int field2880;
	static int field2881;
	static int field2882;
	static int field2884;
	static int field2885;
	static int[] field2883;
	static final int[] field2838;
	static final int[] field2868;
	static final int[] field2869;
	static final int[] field2871;
	static final int[] field2872;
	static final int[] field2873;
	static final int[] field2874;
	class249[][][] field2870;
	class491[] field2836;
	int field2829;
	int field2831;
	int field2834;
	int field2835;
	int field2855;
	int[][] field2877;
	int[][] field2879;
	int[][][] field2832;
	int[][][] field2837;

	static {
		field2861 = true;
		field2848 = 0;
		field2840 = 0;
		field2863 = new class491[100];
		field2846 = false;
		field2856 = 0;
		field2865 = 0;
		field2857 = 0;
		field2858 = -1;
		field2859 = -1;
		field2860 = false;
		field2839 = 4;
		field2883 = new int[field2839];
		field2862 = new class446[field2839][500];
		field2882 = 0;
		field2866 = new class446[500];
		field2867 = new class86();
		field2868 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2869 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2838 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2871 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2872 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2873 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2874 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		field2878 = new boolean[8][32][51][51];
	}

	public class317(int var1, int var2, int var3, int[][][] var4) {
		this.field2834 = 0;
		this.field2835 = 0;
		this.field2836 = new class491[5000];
		this.field2879 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.field2877 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2829 = var1;
		this.field2855 = var2;
		this.field2831 = var3;
		this.field2870 = new class249[var1][var2][var3];
		this.field2837 = new int[var1][var2 + 1][var3 + 1];
		this.field2832 = var4;
		this.method1754();
	}

	public void method1754() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field2829; ++var1) {
			for (var2 = 0; var2 < this.field2855; ++var2) {
				for (int var3 = 0; var3 < this.field2831; ++var3) {
					this.field2870[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < field2839; ++var1) {
			for (var2 = 0; var2 < field2883[var1]; ++var2) {
				field2862[var1][var2] = null;
			}

			field2883[var1] = 0;
		}

		for (var1 = 0; var1 < this.field2835; ++var1) {
			this.field2836[var1] = null;
		}

		this.field2835 = 0;

		for (var1 = 0; var1 < field2863.length; ++var1) {
			field2863[var1] = null;
		}

	}

	public void method1755(int var1) {
		this.field2834 = var1;

		for (int var2 = 0; var2 < this.field2855; ++var2) {
			for (int var3 = 0; var3 < this.field2831; ++var3) {
				if (this.field2870[var1][var2][var3] == null) {
					this.field2870[var1][var2][var3] = new class249(var1, var2, var3);
				}
			}
		}

	}

	public void method1756(int var1, int var2) {
		class249 var3 = this.field2870[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			class249 var5 = this.field2870[var4][var1][var2] = this.field2870[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.field2259;

				for (int var6 = 0; var6 < var5.field2247; ++var6) {
					class491 var7 = var5.field2258[var6];
					long var9 = var7.field4132;
					boolean var8 = class5.method52(var9) == 2;
					if (var8 && var7.field4126 == var1 && var7.field4128 == var2) {
						--var7.field4131;
					}
				}
			}
		}

		if (this.field2870[0][var1][var2] == null) {
			this.field2870[0][var1][var2] = new class249(0, var1, var2);
		}

		this.field2870[0][var1][var2].field2262 = var3;
		this.field2870[3][var1][var2] = null;
	}

	public void method1808(int var1, int var2, int var3, int var4) {
		class249 var5 = this.field2870[var1][var2][var3];
		if (var5 != null) {
			this.field2870[var1][var2][var3].field2254 = var4;
		}
	}

	public void method1793(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		class52 var21;
		int var22;
		if (var4 == 0) {
			var21 = new class52(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2870[var22][var2][var3] == null) {
					this.field2870[var22][var2][var3] = new class249(var22, var2, var3);
				}
			}

			this.field2870[var1][var2][var3].field2244 = var21;
		} else if (var4 != 1) {
			class238 var23 = new class238(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2870[var22][var2][var3] == null) {
					this.field2870[var22][var2][var3] = new class249(var22, var2, var3);
				}
			}

			this.field2870[var1][var2][var3].field2245 = var23;
		} else {
			var21 = new class52(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2870[var22][var2][var3] == null) {
					this.field2870[var22][var2][var3] = new class249(var22, var2, var3);
				}
			}

			this.field2870[var1][var2][var3].field2244 = var21;
		}
	}

	public void method1759(int var1, int var2, int var3, int var4, class480 var5, long var6, int var8) {
		if (var5 != null) {
			class400 var9 = new class400();
			var9.field3357 = var5;
			var9.field3358 = var2 * 128 + 64;
			var9.field3360 = var3 * 128 + 64;
			var9.field3355 = var4;
			var9.field3356 = var6;
			var9.field3359 = var8;
			if (this.field2870[var1][var2][var3] == null) {
				this.field2870[var1][var2][var3] = new class249(var1, var2, var3);
			}

			this.field2870[var1][var2][var3].field2248 = var9;
		}
	}

	public void method1760(int var1, int var2, int var3, int var4, class480 var5, long var6, class480 var8, class480 var9) {
		class469 var10 = new class469();
		var10.field4018 = var5;
		var10.field4022 = var2 * 128 + 64;
		var10.field4019 = var3 * 128 + 64;
		var10.field4016 = var4;
		var10.field4021 = var6;
		var10.field4017 = var8;
		var10.field4020 = var9;
		int var11 = 0;
		class249 var12 = this.field2870[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field2247; ++var13) {
				if ((var12.field2258[var13].field4124 & 256) == 256 && var12.field2258[var13].field4127 instanceof class250) {
					class250 var14 = (class250)var12.field2258[var13].field4127;
					var14.method1452();
					if (var14.field4080 > var11) {
						var11 = var14.field4080;
					}
				}
			}
		}

		var10.field4015 = var11;
		if (this.field2870[var1][var2][var3] == null) {
			this.field2870[var1][var2][var3] = new class249(var1, var2, var3);
		}

		this.field2870[var1][var2][var3].field2241 = var10;
	}

	public void method1781(int var1, int var2, int var3, int var4, class480 var5, class480 var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			class267 var12 = new class267();
			var12.field2417 = var9;
			var12.field2419 = var11;
			var12.field2411 = var2 * 128 + 64;
			var12.field2412 = var3 * 128 + 64;
			var12.field2414 = var4;
			var12.field2418 = var5;
			var12.field2416 = var6;
			var12.field2413 = var7;
			var12.field2415 = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field2870[var13][var2][var3] == null) {
					this.field2870[var13][var2][var3] = new class249(var13, var2, var3);
				}
			}

			this.field2870[var1][var2][var3].field2251 = var12;
		}
	}

	public void method1796(int var1, int var2, int var3, int var4, class480 var5, class480 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			class436 var14 = new class436();
			var14.field3866 = var11;
			var14.field3867 = var13;
			var14.field3857 = var2 * 128 + 64;
			var14.field3858 = var3 * 128 + 64;
			var14.field3862 = var4;
			var14.field3863 = var5;
			var14.field3864 = var6;
			var14.field3859 = var7;
			var14.field3860 = var8;
			var14.field3861 = var9;
			var14.field3856 = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field2870[var15][var2][var3] == null) {
					this.field2870[var15][var2][var3] = new class249(var15, var2, var3);
				}
			}

			this.field2870[var1][var2][var3].field2250 = var14;
		}
	}

	public boolean method1761(int var1, int var2, int var3, int var4, int var5, int var6, class480 var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var13 = var3 * 128 + var6 * 64;
			return this.method1792(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	public boolean method1762(int var1, int var2, int var3, int var4, int var5, class480 var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var2 + var5;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.method1792(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method1763(int var1, int var2, int var3, int var4, int var5, class480 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method1792(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	boolean method1792(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class480 var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.field2855 || var16 >= this.field2831) {
					return false;
				}

				class249 var17 = this.field2870[var1][var15][var16];
				if (var17 != null && var17.field2247 >= 5) {
					return false;
				}
			}
		}

		class491 var21 = new class491();
		var21.field4132 = var12;
		var21.field4124 = var14;
		var21.field4131 = var1;
		var21.field4122 = var6;
		var21.field4133 = var7;
		var21.field4121 = var8;
		var21.field4127 = var9;
		var21.field4120 = var10;
		var21.field4126 = var2;
		var21.field4128 = var3;
		var21.field4123 = var2 + var4 - 1;
		var21.field4129 = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var22 = var3; var22 < var3 + var5; ++var22) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var22 > var3) {
					var18 += 8;
				}

				if (var22 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field2870[var19][var16][var22] == null) {
						this.field2870[var19][var16][var22] = new class249(var19, var16, var22);
					}
				}

				class249 var23 = this.field2870[var1][var16][var22];
				var23.field2258[var23.field2247] = var21;
				var23.field2252[var23.field2247] = var18;
				var23.field2253 |= var18;
				++var23.field2247;
			}
		}

		if (var11) {
			this.field2836[this.field2835++] = var21;
		}

		return true;
	}

	public void method1801() {
		for (int var1 = 0; var1 < this.field2835; ++var1) {
			class491 var2 = this.field2836[var1];
			this.method1766(var2);
			this.field2836[var1] = null;
		}

		this.field2835 = 0;
	}

	void method1766(class491 var1) {
		for (int var2 = var1.field4126; var2 <= var1.field4123; ++var2) {
			for (int var3 = var1.field4128; var3 <= var1.field4129; ++var3) {
				class249 var4 = this.field2870[var1.field4131][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.field2247; ++var5) {
						if (var4.field2258[var5] == var1) {
							--var4.field2247;

							for (int var6 = var5; var6 < var4.field2247; ++var6) {
								var4.field2258[var6] = var4.field2258[var6 + 1];
								var4.field2252[var6] = var4.field2252[var6 + 1];
							}

							var4.field2258[var4.field2247] = null;
							break;
						}
					}

					var4.field2253 = 0;

					for (var5 = 0; var5 < var4.field2247; ++var5) {
						var4.field2253 |= var4.field2252[var5];
					}
				}
			}
		}

	}

	public void method1764(int var1, int var2, int var3, int var4) {
		class249 var5 = this.field2870[var1][var2][var3];
		if (var5 != null) {
			class436 var6 = var5.field2250;
			if (var6 != null) {
				var6.field3861 = var6.field3861 * var4 / 16;
				var6.field3856 = var6.field3856 * var4 / 16;
			}
		}
	}

	public void method1797(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 != null) {
			var4.field2251 = null;
		}
	}

	public void method1765(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 != null) {
			var4.field2250 = null;
		}
	}

	public void method1798(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field2247; ++var5) {
				class491 var6 = var4.field2258[var5];
				long var8 = var6.field4132;
				boolean var7 = class5.method52(var8) == 2;
				if (var7 && var6.field4126 == var2 && var6.field4128 == var3) {
					this.method1766(var6);
					return;
				}
			}

		}
	}

	public void method1767(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 != null) {
			var4.field2248 = null;
		}
	}

	public void method1768(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 != null) {
			var4.field2241 = null;
		}
	}

	public class267 method1769(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		return var4 == null ? null : var4.field2251;
	}

	public class436 method1770(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		return var4 == null ? null : var4.field2250;
	}

	public class491 method1807(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field2247; ++var5) {
				class491 var6 = var4.field2258[var5];
				long var8 = var6.field4132;
				boolean var7 = class5.method52(var8) == 2;
				if (var7 && var6.field4126 == var2 && var6.field4128 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public class400 method1794(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		return var4 != null && var4.field2248 != null ? var4.field2248 : null;
	}

	public long method1790(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		return var4 != null && var4.field2251 != null ? var4.field2251.field2417 : 0L;
	}

	public long method1795(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		return var4 != null && var4.field2250 != null ? var4.field2250.field3866 : 0L;
	}

	public long method1771(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field2247; ++var5) {
				class491 var6 = var4.field2258[var5];
				long var8 = var6.field4132;
				boolean var7 = class5.method52(var8) == 2;
				if (var7 && var6.field4126 == var2 && var6.field4128 == var3) {
					return var6.field4132;
				}
			}

			return 0L;
		}
	}

	public long method1804(int var1, int var2, int var3) {
		class249 var4 = this.field2870[var1][var2][var3];
		return var4 != null && var4.field2248 != null ? var4.field2248.field3356 : 0L;
	}

	public int method1772(int var1, int var2, int var3, long var4) {
		class249 var6 = this.field2870[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.field2251 != null && var6.field2251.field2417 == var4) {
			return var6.field2251.field2419 & 255;
		} else if (var6.field2250 != null && var6.field2250.field3866 == var4) {
			return var6.field2250.field3867 & 255;
		} else if (var6.field2248 != null && var6.field2248.field3356 == var4) {
			return var6.field2248.field3359 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field2247; ++var7) {
				if (var6.field2258[var7].field4132 == var4) {
					return var6.field2258[var7].field4124 & 255;
				}
			}

			return -1;
		}
	}

	public void method1773(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2829; ++var4) {
			for (int var5 = 0; var5 < this.field2855; ++var5) {
				for (int var6 = 0; var6 < this.field2831; ++var6) {
					class249 var7 = this.field2870[var4][var5][var6];
					if (var7 != null) {
						class267 var8 = var7.field2251;
						class48 var10;
						if (var8 != null && var8.field2418 instanceof class48) {
							class48 var9 = (class48)var8.field2418;
							this.method1774(var9, var4, var5, var6, 1, 1);
							if (var8.field2416 instanceof class48) {
								var10 = (class48)var8.field2416;
								this.method1774(var10, var4, var5, var6, 1, 1);
								class48.method368(var9, var10, 0, 0, 0, false);
								var8.field2416 = var10.method369(var10.field587, var10.field576, var1, var2, var3);
							}

							var8.field2418 = var9.method369(var9.field587, var9.field576, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.field2247; ++var12) {
							class491 var14 = var7.field2258[var12];
							if (var14 != null && var14.field4127 instanceof class48) {
								class48 var11 = (class48)var14.field4127;
								this.method1774(var11, var4, var5, var6, var14.field4123 - var14.field4126 + 1, var14.field4129 - var14.field4128 + 1);
								var14.field4127 = var11.method369(var11.field587, var11.field576, var1, var2, var3);
							}
						}

						class400 var13 = var7.field2248;
						if (var13 != null && var13.field3357 instanceof class48) {
							var10 = (class48)var13.field3357;
							this.method1805(var10, var4, var5, var6);
							var13.field3357 = var10.method369(var10.field587, var10.field576, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	void method1805(class48 var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.field2855) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.field2831 && (var9 >= var6 || var10 >= var8)) {
						class249 var11 = this.field2870[var2][var9][var10];
						if (var11 != null && var11.field2248 != null && var11.field2248.field3357 instanceof class48) {
							int var12 = this.method1775(var2, var9, var10, var2, var3, var4);
							class48 var13 = (class48)var11.field2248.field3357;
							class48.method368(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	void method1774(class48 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.field2829) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.field2855) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.field2831 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								class249 var15 = this.field2870[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method1775(var12, var13, var14, var2, var3, var4);
									class267 var17 = var15.field2251;
									if (var17 != null) {
										class48 var18;
										if (var17.field2418 instanceof class48) {
											var18 = (class48)var17.field2418;
											class48.method368(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.field2416 instanceof class48) {
											var18 = (class48)var17.field2416;
											class48.method368(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.field2247; ++var23) {
										class491 var19 = var15.field2258[var23];
										if (var19 != null && var19.field4127 instanceof class48) {
											class48 var20 = (class48)var19.field4127;
											int var21 = var19.field4123 - var19.field4126 + 1;
											int var22 = var19.field4129 - var19.field4128 + 1;
											class48.method368(var1, var20, (var19.field4126 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field4128 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	int method1775(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method1776(var1, var2, var3) - this.method1776(var4, var5, var6);
	}

	int method1776(int var1, int var2, int var3) {
		return (this.field2832[var1][var2][var3] + this.field2832[var1][var2 + 1][var3] + this.field2832[var1][var2][var3 + 1] + this.field2832[var1][var2 + 1][var3 + 1]) / 4;
	}

	public void method1777(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		class249 var7 = this.field2870[var4][var5][var6];
		if (var7 != null) {
			class52 var8 = var7.field2244;
			int var10;
			if (var8 != null) {
				int var18 = var8.field598;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				class238 var9 = var7.field2245;
				if (var9 != null) {
					var10 = var9.field2195;
					int var11 = var9.field2204;
					int var12 = var9.field2197;
					int var13 = var9.field2201;
					int[] var14 = this.field2879[var10];
					int[] var15 = this.field2877[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	public void method1779(int var1, int var2, int var3, boolean var4) {
		if (!method1780() || var4) {
			field2846 = true;
			field2860 = var4;
			field2856 = var1;
			field2865 = var2;
			field2857 = var3;
			field2858 = -1;
			field2859 = -1;
		}
	}

	public void method1800() {
		field2860 = true;
	}

	public void method1782(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.field2855 * 128) {
			var1 = this.field2855 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.field2831 * 128) {
			var3 = this.field2831 * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		++field2841;
		field2851 = class133.field1291[var4];
		field2852 = class133.field1289[var4];
		field2885 = class133.field1291[var5];
		field2853 = class133.field1289[var5];
		field2854 = field2878[(var4 - 128) / 32][var5 / 64];
		field2833 = var1;
		field2849 = var2;
		field2850 = var3;
		field2876 = var1 / 128;
		field2847 = var3 / 128;
		field2840 = var6;
		field2875 = field2876 - 25;
		if (field2875 < 0) {
			field2875 = 0;
		}

		field2844 = field2847 - 25;
		if (field2844 < 0) {
			field2844 = 0;
		}

		field2843 = field2876 + 25;
		if (field2843 > this.field2855) {
			field2843 = this.field2855;
		}

		field2845 = field2847 + 25;
		if (field2845 > this.field2831) {
			field2845 = this.field2831;
		}

		this.method1787();
		field2848 = 0;

		int var7;
		class249[][] var8;
		int var9;
		int var10;
		for (var7 = this.field2834; var7 < this.field2829; ++var7) {
			var8 = this.field2870[var7];

			for (var9 = field2875; var9 < field2843; ++var9) {
				for (var10 = field2844; var10 < field2845; ++var10) {
					class249 var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field2254 > var6 || !field2854[var9 - field2876 + 25][var10 - field2847 + 25] && this.field2832[var7][var9][var10] - var2 < 2000) {
							var11.field2255 = false;
							var11.field2256 = false;
							var11.field2249 = 0;
						} else {
							var11.field2255 = true;
							var11.field2256 = true;
							if (var11.field2247 > 0) {
								var11.field2240 = true;
							} else {
								var11.field2240 = false;
							}

							++field2848;
						}
					}
				}
			}
		}

		int var12;
		int var13;
		int var14;
		class249 var15;
		int var16;
		for (var7 = this.field2834; var7 < this.field2829; ++var7) {
			var8 = this.field2870[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field2876 + var9;
				var16 = field2876 - var9;
				if (var10 >= field2875 || var16 < field2843) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2847 + var12;
						var14 = field2847 - var12;
						if (var10 >= field2875) {
							if (var13 >= field2844) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, true);
								}
							}

							if (var14 < field2845) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, true);
								}
							}
						}

						if (var16 < field2843) {
							if (var13 >= field2844) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, true);
								}
							}

							if (var14 < field2845) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, true);
								}
							}
						}

						if (field2848 == 0) {
							field2846 = false;
							return;
						}
					}
				}
			}
		}

		for (var7 = this.field2834; var7 < this.field2829; ++var7) {
			var8 = this.field2870[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field2876 + var9;
				var16 = field2876 - var9;
				if (var10 >= field2875 || var16 < field2843) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2847 + var12;
						var14 = field2847 - var12;
						if (var10 >= field2875) {
							if (var13 >= field2844) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, false);
								}
							}

							if (var14 < field2845) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, false);
								}
							}
						}

						if (var16 < field2843) {
							if (var13 >= field2844) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, false);
								}
							}

							if (var14 < field2845) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field2255) {
									this.method1783(var15, false);
								}
							}
						}

						if (field2848 == 0) {
							field2846 = false;
							return;
						}
					}
				}
			}
		}

		field2846 = false;
	}

	void method1783(class249 var1, boolean var2) {
		field2867.method567(var1);

		while (true) {
			class249 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			class249[][] var8;
			class249 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										class267 var10;
										class491 var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										class249 var33;
										while (true) {
											do {
												var3 = (class249)field2867.method561();
												if (var3 == null) {
													return;
												}
											} while(!var3.field2256);

											var4 = var3.field2246;
											var5 = var3.field2242;
											var6 = var3.field2259;
											var7 = var3.field2243;
											var8 = this.field2870[var6];
											if (!var3.field2255) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.field2870[var6 - 1][var4][var5];
													if (var9 != null && var9.field2256) {
														continue;
													}
												}

												if (var4 <= field2876 && var4 > field2875) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.field2256 && (var9.field2255 || (var3.field2253 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= field2876 && var4 < field2843 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.field2256 && (var9.field2255 || (var3.field2253 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= field2847 && var5 > field2844) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.field2256 && (var9.field2255 || (var3.field2253 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= field2847 && var5 < field2845 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.field2256 && (var9.field2255 || (var3.field2253 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.field2255 = false;
											if (var3.field2262 != null) {
												var9 = var3.field2262;
												if (var9.field2244 != null) {
													if (!this.method1806(0, var4, var5)) {
														this.method1784(var9.field2244, 0, field2851, field2852, field2885, field2853, var4, var5);
													}
												} else if (var9.field2245 != null && !this.method1806(0, var4, var5)) {
													this.method1802(var9.field2245, field2851, field2852, field2885, field2853, var4, var5);
												}

												var10 = var9.field2251;
												if (var10 != null) {
													var10.field2418.method2392(0, field2851, field2852, field2885, field2853, var10.field2411 - field2833, var10.field2414 - field2849, var10.field2412 - field2850, var10.field2417);
												}

												for (var11 = 0; var11 < var9.field2247; ++var11) {
													var12 = var9.field2258[var11];
													if (var12 != null) {
														var12.field4127.method2392(var12.field4120, field2851, field2852, field2885, field2853, var12.field4122 - field2833, var12.field4121 - field2849, var12.field4133 - field2850, var12.field4132);
													}
												}
											}

											var22 = false;
											if (var3.field2244 != null) {
												if (!this.method1806(var7, var4, var5)) {
													var22 = true;
													if (var3.field2244.field594 != 12345678 || field2846 && var6 <= field2856) {
														this.method1784(var3.field2244, var7, field2851, field2852, field2885, field2853, var4, var5);
													}
												}
											} else if (var3.field2245 != null && !this.method1806(var7, var4, var5)) {
												var22 = true;
												this.method1802(var3.field2245, field2851, field2852, field2885, field2853, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											class267 var23 = var3.field2251;
											class436 var13 = var3.field2250;
											if (var23 != null || var13 != null) {
												if (field2876 == var4) {
													++var21;
												} else if (field2876 < var4) {
													var21 += 2;
												}

												if (field2847 == var5) {
													var21 += 3;
												} else if (field2847 > var5) {
													var21 += 6;
												}

												var11 = field2868[var21];
												var3.field2261 = field2838[var21];
											}

											if (var23 != null) {
												if ((var23.field2413 & field2869[var21]) != 0) {
													if (var23.field2413 == 16) {
														var3.field2249 = 3;
														var3.field2257 = field2871[var21];
														var3.field2260 = 3 - var3.field2257;
													} else if (var23.field2413 == 32) {
														var3.field2249 = 6;
														var3.field2257 = field2872[var21];
														var3.field2260 = 6 - var3.field2257;
													} else if (var23.field2413 == 64) {
														var3.field2249 = 12;
														var3.field2257 = field2873[var21];
														var3.field2260 = 12 - var3.field2257;
													} else {
														var3.field2249 = 9;
														var3.field2257 = field2874[var21];
														var3.field2260 = 9 - var3.field2257;
													}
												} else {
													var3.field2249 = 0;
												}

												if ((var23.field2413 & var11) != 0 && !this.method1788(var7, var4, var5, var23.field2413)) {
													var23.field2418.method2392(0, field2851, field2852, field2885, field2853, var23.field2411 - field2833, var23.field2414 - field2849, var23.field2412 - field2850, var23.field2417);
												}

												if ((var23.field2415 & var11) != 0 && !this.method1788(var7, var4, var5, var23.field2415)) {
													var23.field2416.method2392(0, field2851, field2852, field2885, field2853, var23.field2411 - field2833, var23.field2414 - field2849, var23.field2412 - field2850, var23.field2417);
												}
											}

											if (var13 != null && !this.method1789(var7, var4, var5, var13.field3863.field4080)) {
												if ((var13.field3859 & var11) != 0) {
													var13.field3863.method2392(0, field2851, field2852, field2885, field2853, var13.field3857 - field2833 + var13.field3861, var13.field3862 - field2849, var13.field3858 - field2850 + var13.field3856, var13.field3866);
												} else if (var13.field3859 == 256) {
													var14 = var13.field3857 - field2833;
													var15 = var13.field3862 - field2849;
													var16 = var13.field3858 - field2850;
													var17 = var13.field3860;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.field3863.method2392(0, field2851, field2852, field2885, field2853, var14 + var13.field3861, var15, var16 + var13.field3856, var13.field3866);
													} else if (var13.field3864 != null) {
														var13.field3864.method2392(0, field2851, field2852, field2885, field2853, var14, var15, var16, var13.field3866);
													}
												}
											}

											if (var22) {
												class400 var27 = var3.field2248;
												if (var27 != null) {
													var27.field3357.method2392(0, field2851, field2852, field2885, field2853, var27.field3358 - field2833, var27.field3355 - field2849, var27.field3360 - field2850, var27.field3356);
												}

												class469 var31 = var3.field2241;
												if (var31 != null && var31.field4015 == 0) {
													if (var31.field4017 != null) {
														var31.field4017.method2392(0, field2851, field2852, field2885, field2853, var31.field4022 - field2833, var31.field4016 - field2849, var31.field4019 - field2850, var31.field4021);
													}

													if (var31.field4020 != null) {
														var31.field4020.method2392(0, field2851, field2852, field2885, field2853, var31.field4022 - field2833, var31.field4016 - field2849, var31.field4019 - field2850, var31.field4021);
													}

													if (var31.field4018 != null) {
														var31.field4018.method2392(0, field2851, field2852, field2885, field2853, var31.field4022 - field2833, var31.field4016 - field2849, var31.field4019 - field2850, var31.field4021);
													}
												}
											}

											var14 = var3.field2253;
											if (var14 != 0) {
												if (var4 < field2876 && (var14 & 4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.field2256) {
														field2867.method567(var33);
													}
												}

												if (var5 < field2847 && (var14 & 2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.field2256) {
														field2867.method567(var33);
													}
												}

												if (var4 > field2876 && (var14 & 1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.field2256) {
														field2867.method567(var33);
													}
												}

												if (var5 > field2847 && (var14 & 8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.field2256) {
														field2867.method567(var33);
													}
												}
											}
											break;
										}

										if (var3.field2249 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.field2247; ++var21) {
												if (var3.field2258[var21].field4125 != field2841 && (var3.field2252[var21] & var3.field2249) == var3.field2257) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = var3.field2251;
												if (!this.method1788(var7, var4, var5, var10.field2413)) {
													var10.field2418.method2392(0, field2851, field2852, field2885, field2853, var10.field2411 - field2833, var10.field2414 - field2849, var10.field2412 - field2850, var10.field2417);
												}

												var3.field2249 = 0;
											}
										}

										if (!var3.field2240) {
											break;
										}

										try {
											int var25 = var3.field2247;
											var3.field2240 = false;
											var21 = 0;

											label563:
											for (var11 = 0; var11 < var25; ++var11) {
												var12 = var3.field2258[var11];
												if (var12.field4125 != field2841) {
													for (var26 = var12.field4126; var26 <= var12.field4123; ++var26) {
														for (var14 = var12.field4128; var14 <= var12.field4129; ++var14) {
															var33 = var8[var26][var14];
															if (var33.field2255) {
																var3.field2240 = true;
																continue label563;
															}

															if (var33.field2249 != 0) {
																var16 = 0;
																if (var26 > var12.field4126) {
																	++var16;
																}

																if (var26 < var12.field4123) {
																	var16 += 4;
																}

																if (var14 > var12.field4128) {
																	var16 += 8;
																}

																if (var14 < var12.field4129) {
																	var16 += 2;
																}

																if ((var16 & var33.field2249) == var3.field2260) {
																	var3.field2240 = true;
																	continue label563;
																}
															}
														}
													}

													field2863[var21++] = var12;
													var26 = field2876 - var12.field4126;
													var14 = var12.field4123 - field2876;
													if (var14 > var26) {
														var26 = var14;
													}

													var15 = field2847 - var12.field4128;
													var16 = var12.field4129 - field2847;
													if (var16 > var15) {
														var12.field4130 = var26 + var16;
													} else {
														var12.field4130 = var26 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var24 = -1;

												for (var26 = 0; var26 < var21; ++var26) {
													class491 var34 = field2863[var26];
													if (var34.field4125 != field2841) {
														if (var34.field4130 > var11) {
															var11 = var34.field4130;
															var24 = var26;
														} else if (var34.field4130 == var11) {
															var15 = var34.field4122 - field2833;
															var16 = var34.field4133 - field2850;
															var17 = field2863[var24].field4122 - field2833;
															var18 = field2863[var24].field4133 - field2850;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												class491 var35 = field2863[var24];
												var35.field4125 = field2841;
												if (!this.method1758(var7, var35.field4126, var35.field4123, var35.field4128, var35.field4129, var35.field4127.field4080)) {
													var35.field4127.method2392(var35.field4120, field2851, field2852, field2885, field2853, var35.field4122 - field2833, var35.field4121 - field2849, var35.field4133 - field2850, var35.field4132);
												}

												for (var14 = var35.field4126; var14 <= var35.field4123; ++var14) {
													for (var15 = var35.field4128; var15 <= var35.field4129; ++var15) {
														class249 var36 = var8[var14][var15];
														if (var36.field2249 != 0) {
															field2867.method567(var36);
														} else if ((var14 != var4 || var15 != var5) && var36.field2256) {
															field2867.method567(var36);
														}
													}
												}
											}

											if (!var3.field2240) {
												break;
											}
										} catch (Exception var20) {
											var3.field2240 = false;
											break;
										}
									}
								} while(!var3.field2256);
							} while(var3.field2249 != 0);

							if (var4 > field2876 || var4 <= field2875) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while(var9 != null && var9.field2256);

						if (var4 < field2876 || var4 >= field2843 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while(var9 != null && var9.field2256);

					if (var5 > field2847 || var5 <= field2844) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while(var9 != null && var9.field2256);

				if (var5 < field2847 || var5 >= field2845 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while(var9 != null && var9.field2256);

			var3.field2256 = false;
			--field2848;
			class469 var29 = var3.field2241;
			if (var29 != null && var29.field4015 != 0) {
				if (var29.field4017 != null) {
					var29.field4017.method2392(0, field2851, field2852, field2885, field2853, var29.field4022 - field2833, var29.field4016 - field2849 - var29.field4015, var29.field4019 - field2850, var29.field4021);
				}

				if (var29.field4020 != null) {
					var29.field4020.method2392(0, field2851, field2852, field2885, field2853, var29.field4022 - field2833, var29.field4016 - field2849 - var29.field4015, var29.field4019 - field2850, var29.field4021);
				}

				if (var29.field4018 != null) {
					var29.field4018.method2392(0, field2851, field2852, field2885, field2853, var29.field4022 - field2833, var29.field4016 - field2849 - var29.field4015, var29.field4019 - field2850, var29.field4021);
				}
			}

			if (var3.field2261 != 0) {
				class436 var30 = var3.field2250;
				if (var30 != null && !this.method1789(var7, var4, var5, var30.field3863.field4080)) {
					if ((var30.field3859 & var3.field2261) != 0) {
						var30.field3863.method2392(0, field2851, field2852, field2885, field2853, var30.field3857 - field2833 + var30.field3861, var30.field3862 - field2849, var30.field3858 - field2850 + var30.field3856, var30.field3866);
					} else if (var30.field3859 == 256) {
						var11 = var30.field3857 - field2833;
						var24 = var30.field3862 - field2849;
						var26 = var30.field3858 - field2850;
						var14 = var30.field3860;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}

						if (var16 >= var15) {
							var30.field3863.method2392(0, field2851, field2852, field2885, field2853, var11 + var30.field3861, var24, var26 + var30.field3856, var30.field3866);
						} else if (var30.field3864 != null) {
							var30.field3864.method2392(0, field2851, field2852, field2885, field2853, var11, var24, var26, var30.field3866);
						}
					}
				}

				class267 var28 = var3.field2251;
				if (var28 != null) {
					if ((var28.field2415 & var3.field2261) != 0 && !this.method1788(var7, var4, var5, var28.field2415)) {
						var28.field2416.method2392(0, field2851, field2852, field2885, field2853, var28.field2411 - field2833, var28.field2414 - field2849, var28.field2412 - field2850, var28.field2417);
					}

					if ((var28.field2413 & var3.field2261) != 0 && !this.method1788(var7, var4, var5, var28.field2413)) {
						var28.field2418.method2392(0, field2851, field2852, field2885, field2853, var28.field2411 - field2833, var28.field2414 - field2849, var28.field2412 - field2850, var28.field2417);
					}
				}
			}

			class249 var32;
			if (var6 < this.field2829 - 1) {
				var32 = this.field2870[var6 + 1][var4][var5];
				if (var32 != null && var32.field2256) {
					field2867.method567(var32);
				}
			}

			if (var4 < field2876) {
				var32 = var8[var4 + 1][var5];
				if (var32 != null && var32.field2256) {
					field2867.method567(var32);
				}
			}

			if (var5 < field2847) {
				var32 = var8[var4][var5 + 1];
				if (var32 != null && var32.field2256) {
					field2867.method567(var32);
				}
			}

			if (var4 > field2876) {
				var32 = var8[var4 - 1][var5];
				if (var32 != null && var32.field2256) {
					field2867.method567(var32);
				}
			}

			if (var5 > field2847) {
				var32 = var8[var4][var5 - 1];
				if (var32 != null && var32.field2256) {
					field2867.method567(var32);
				}
			}
		}
	}

	void method1784(class52 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - field2833;
		int var11;
		int var12 = var11 = (var8 << 7) - field2850;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field2832[var2][var7][var8] - field2849;
		int var18 = this.field2832[var2][var7 + 1][var8] - field2849;
		int var19 = this.field2832[var2][var7 + 1][var8 + 1] - field2849;
		int var20 = this.field2832[var2][var7][var8 + 1] - field2849;
		int var21 = var12 * var5 + var10 * var6 >> 16;
		var12 = var12 * var6 - var10 * var5 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var12 * var3 >> 16;
		var12 = var17 * var3 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var11 * var5 + var14 * var6 >> 16;
			var11 = var11 * var6 - var14 * var5 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var11 * var3 >> 16;
			var11 = var18 * var3 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var16 * var5 + var13 * var6 >> 16;
				var16 = var16 * var6 - var13 * var5 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var16 * var3 >> 16;
				var16 = var19 * var3 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var15 * var3 >> 16;
					var15 = var20 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = class133.method783() + var10 * class133.method788() / var12;
						int var23 = class133.method784() + var17 * class133.method788() / var12;
						int var24 = class133.method783() + var14 * class133.method788() / var11;
						int var25 = class133.method784() + var18 * class133.method788() / var11;
						int var26 = class133.method783() + var13 * class133.method788() / var16;
						int var27 = class133.method784() + var19 * class133.method788() / var16;
						int var28 = class133.method783() + var9 * class133.method788() / var15;
						int var29 = class133.method784() + var21 * class133.method788() / var15;
						float var30 = class217.method1249(var12);
						float var31 = class217.method1249(var11);
						float var32 = class217.method1249(var16);
						float var33 = class217.method1249(var15);
						class133.field1293.field394 = 0;
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							class133.field1293.field391 = false;
							var34 = class133.method789();
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
								class133.field1293.field391 = true;
							}

							if (field2846 && method1786(field2865, field2857, var27, var29, var25, var26, var28, var24)) {
								field2858 = var7;
								field2859 = var8;
							}

							if (var1.field600 == -1) {
								if (var1.field594 != 12345678) {
									class133.method797(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field594, var1.field596, var1.field593);
								}
							} else if (!field2861) {
								if (var1.field597) {
									class133.method796(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field594, var1.field596, var1.field593, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field600);
								} else {
									class133.method796(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field594, var1.field596, var1.field593, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field600);
								}
							} else {
								var35 = class133.field1293.field389.method1945(var1.field600);
								class133.method797(var27, var29, var25, var26, var28, var24, var32, var33, var31, method1785(var35, var1.field594), method1785(var35, var1.field596), method1785(var35, var1.field593));
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							class133.field1293.field391 = false;
							var34 = class133.method789();
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
								class133.field1293.field391 = true;
							}

							if (field2846 && method1786(field2865, field2857, var23, var25, var29, var22, var24, var28)) {
								field2858 = var7;
								field2859 = var8;
							}

							if (var1.field600 == -1) {
								if (var1.field595 != 12345678) {
									class133.method797(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field595, var1.field593, var1.field596);
								}
							} else if (!field2861) {
								class133.method796(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field595, var1.field593, var1.field596, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field600);
							} else {
								var35 = class133.field1293.field389.method1945(var1.field600);
								class133.method797(var23, var25, var29, var22, var24, var28, var30, var31, var33, method1785(var35, var1.field595), method1785(var35, var1.field593), method1785(var35, var1.field596));
							}
						}

					}
				}
			}
		}
	}

	void method1802(class238 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.field2203.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2203[var9] - field2833;
			var11 = var1.field2185[var9] - field2849;
			var12 = var1.field2186[var9] - field2850;
			var13 = var12 * var4 + var10 * var5 >> 16;
			var12 = var12 * var5 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var11 * var3 - var12 * var2 >> 16;
			var12 = var11 * var2 + var12 * var3 >> 16;
			if (var12 < 50) {
				return;
			}

			if (var1.field2193 != null) {
				class238.field2202[var9] = var10;
				class238.field2199[var9] = var13;
				class238.field2191[var9] = var12;
			}

			class238.field2188[var9] = class133.method783() + var10 * class133.method788() / var12;
			class238.field2200[var9] = class133.method784() + var13 * class133.method788() / var12;
			class238.field2196[var9] = class217.method1249(var12);
		}

		class133.field1293.field394 = 0;
		var8 = var1.field2190.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2190[var9];
			var11 = var1.field2198[var9];
			var12 = var1.field2205[var9];
			var13 = class238.field2188[var10];
			int var14 = class238.field2188[var11];
			int var15 = class238.field2188[var12];
			int var16 = class238.field2200[var10];
			int var17 = class238.field2200[var11];
			int var18 = class238.field2200[var12];
			float var19 = class238.field2196[var10];
			float var20 = class238.field2196[var11];
			float var21 = class238.field2196[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				class133.field1293.field391 = false;
				int var22 = class133.method789();
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
					class133.field1293.field391 = true;
				}

				if (field2846 && method1786(field2865, field2857, var16, var17, var18, var13, var14, var15)) {
					field2858 = var6;
					field2859 = var7;
				}

				if (var1.field2193 != null && var1.field2193[var9] != -1) {
					if (!field2861) {
						if (var1.field2194) {
							class133.method796(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2192[var9], var1.field2187[var9], var1.field2189[var9], class238.field2202[0], class238.field2202[1], class238.field2202[3], class238.field2199[0], class238.field2199[1], class238.field2199[3], class238.field2191[0], class238.field2191[1], class238.field2191[3], var1.field2193[var9]);
						} else {
							class133.method796(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2192[var9], var1.field2187[var9], var1.field2189[var9], class238.field2202[var10], class238.field2202[var11], class238.field2202[var12], class238.field2199[var10], class238.field2199[var11], class238.field2199[var12], class238.field2191[var10], class238.field2191[var11], class238.field2191[var12], var1.field2193[var9]);
						}
					} else {
						int var23 = class133.field1293.field389.method1945(var1.field2193[var9]);
						class133.method797(var16, var17, var18, var13, var14, var15, var19, var20, var21, method1785(var23, var1.field2192[var9]), method1785(var23, var1.field2187[var9]), method1785(var23, var1.field2189[var9]));
					}
				} else if (var1.field2192[var9] != 12345678) {
					class133.method797(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field2192[var9], var1.field2187[var9], var1.field2189[var9]);
				}
			}
		}

	}

	void method1787() {
		int var1 = field2883[field2840];
		class446[] var2 = field2862[field2840];
		field2882 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			class446 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field3917 == 1) {
				var5 = var4.field3929 - field2876 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field3915 - field2847 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field3920 - field2847 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field2854[var5][var6++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field2833 - var4.field3918;
						if (var9 > 32) {
							var4.field3924 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field3924 = 2;
							var9 = -var9;
						}

						var4.field3927 = (var4.field3930 - field2850 << 8) / var9;
						var4.field3931 = (var4.field3926 - field2850 << 8) / var9;
						var4.field3921 = (var4.field3922 - field2849 << 8) / var9;
						var4.field3913 = (var4.field3923 - field2849 << 8) / var9;
						field2866[field2882++] = var4;
					}
				}
			} else if (var4.field3917 == 2) {
				var5 = var4.field3915 - field2847 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field3929 - field2876 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field3914 - field2876 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field2854[var6++][var5]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field2850 - var4.field3930;
						if (var9 > 32) {
							var4.field3924 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field3924 = 4;
							var9 = -var9;
						}

						var4.field3925 = (var4.field3918 - field2833 << 8) / var9;
						var4.field3928 = (var4.field3919 - field2833 << 8) / var9;
						var4.field3921 = (var4.field3922 - field2849 << 8) / var9;
						var4.field3913 = (var4.field3923 - field2849 << 8) / var9;
						field2866[field2882++] = var4;
					}
				}
			} else if (var4.field3917 == 4) {
				var5 = var4.field3922 - field2849;
				if (var5 > 128) {
					var6 = var4.field3915 - field2847 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field3920 - field2847 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var8 = var4.field3929 - field2876 + 25;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.field3914 - field2876 + 25;
						if (var9 > 50) {
							var9 = 50;
						}

						boolean var10 = false;

						label145:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (field2854[var11][var12]) {
									var10 = true;
									break label145;
								}
							}
						}

						if (var10) {
							var4.field3924 = 5;
							var4.field3925 = (var4.field3918 - field2833 << 8) / var5;
							var4.field3928 = (var4.field3919 - field2833 << 8) / var5;
							var4.field3927 = (var4.field3930 - field2850 << 8) / var5;
							var4.field3931 = (var4.field3926 - field2850 << 8) / var5;
							field2866[field2882++] = var4;
						}
					}
				}
			}
		}

	}

	boolean method1806(int var1, int var2, int var3) {
		int var4 = this.field2837[var1][var2][var3];
		if (var4 == -field2841) {
			return false;
		} else if (var4 == field2841) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method1799(var5 + 1, this.field2832[var1][var2][var3], var6 + 1) && this.method1799(var5 + 128 - 1, this.field2832[var1][var2 + 1][var3], var6 + 1) && this.method1799(var5 + 128 - 1, this.field2832[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1799(var5 + 1, this.field2832[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2837[var1][var2][var3] = field2841;
				return true;
			} else {
				this.field2837[var1][var2][var3] = -field2841;
				return false;
			}
		}
	}

	boolean method1788(int var1, int var2, int var3, int var4) {
		if (!this.method1806(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.field2832[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > field2833) {
						if (!this.method1799(var5, var7, var6)) {
							return false;
						}

						if (!this.method1799(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method1799(var5, var8, var6)) {
							return false;
						}

						if (!this.method1799(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method1799(var5, var9, var6)) {
						return false;
					}

					if (!this.method1799(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < field2850) {
						if (!this.method1799(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method1799(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method1799(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method1799(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method1799(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method1799(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < field2833) {
						if (!this.method1799(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method1799(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method1799(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method1799(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method1799(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method1799(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > field2850) {
						if (!this.method1799(var5, var7, var6)) {
							return false;
						}

						if (!this.method1799(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method1799(var5, var8, var6)) {
							return false;
						}

						if (!this.method1799(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method1799(var5, var9, var6)) {
						return false;
					}

					if (!this.method1799(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method1799(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method1799(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method1799(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method1799(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method1799(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	boolean method1789(int var1, int var2, int var3, int var4) {
		if (!this.method1806(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method1799(var5 + 1, this.field2832[var1][var2][var3] - var4, var6 + 1) && this.method1799(var5 + 128 - 1, this.field2832[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1799(var5 + 128 - 1, this.field2832[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1799(var5 + 1, this.field2832[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method1758(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.method1806(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method1799(var7 + 1, this.field2832[var1][var2][var4] - var6, var8 + 1) && this.method1799(var7 + 128 - 1, this.field2832[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1799(var7 + 128 - 1, this.field2832[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1799(var7 + 1, this.field2832[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2837[var1][var7][var8] == -field2841) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.field2832[var1][var2][var4] - var6;
			if (!this.method1799(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method1799(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method1799(var7, var9, var11)) {
						return false;
					} else if (!this.method1799(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method1799(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < field2882; ++var4) {
			class446 var5 = field2866[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field3924 == 1) {
				var6 = var5.field3918 - var1;
				if (var6 > 0) {
					var7 = var5.field3930 + (var5.field3927 * var6 >> 8);
					var8 = var5.field3926 + (var5.field3931 * var6 >> 8);
					var9 = var5.field3922 + (var5.field3921 * var6 >> 8);
					var10 = var5.field3923 + (var5.field3913 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3924 == 2) {
				var6 = var1 - var5.field3918;
				if (var6 > 0) {
					var7 = var5.field3930 + (var5.field3927 * var6 >> 8);
					var8 = var5.field3926 + (var5.field3931 * var6 >> 8);
					var9 = var5.field3922 + (var5.field3921 * var6 >> 8);
					var10 = var5.field3923 + (var5.field3913 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3924 == 3) {
				var6 = var5.field3930 - var3;
				if (var6 > 0) {
					var7 = var5.field3918 + (var5.field3925 * var6 >> 8);
					var8 = var5.field3919 + (var5.field3928 * var6 >> 8);
					var9 = var5.field3922 + (var5.field3921 * var6 >> 8);
					var10 = var5.field3923 + (var5.field3913 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3924 == 4) {
				var6 = var3 - var5.field3930;
				if (var6 > 0) {
					var7 = var5.field3918 + (var5.field3925 * var6 >> 8);
					var8 = var5.field3919 + (var5.field3928 * var6 >> 8);
					var9 = var5.field3922 + (var5.field3921 * var6 >> 8);
					var10 = var5.field3923 + (var5.field3913 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3924 == 5) {
				var6 = var2 - var5.field3922;
				if (var6 > 0) {
					var7 = var5.field3918 + (var5.field3925 * var6 >> 8);
					var8 = var5.field3919 + (var5.field3928 * var6 >> 8);
					var9 = var5.field3930 + (var5.field3927 * var6 >> 8);
					var10 = var5.field3926 + (var5.field3931 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public static void method1757(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		class446 var8 = new class446();
		var8.field3929 = var2 / 128;
		var8.field3914 = var3 / 128;
		var8.field3915 = var4 / 128;
		var8.field3920 = var5 / 128;
		var8.field3917 = var1;
		var8.field3918 = var2;
		var8.field3919 = var3;
		var8.field3930 = var4;
		var8.field3926 = var5;
		var8.field3922 = var6;
		var8.field3923 = var7;
		field2862[var0][field2883[var0]++] = var8;
	}

	public static void method1791(int[] var0, int var1, int var2, int var3, int var4) {
		field2830 = 0;
		field2864 = 0;
		field2884 = var3;
		field2842 = var4;
		field2880 = var3 / 2;
		field2881 = var4 / 2;
		boolean[][][][] var5 = new boolean[var0.length][32][53][53];

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) {
			for (var7 = 0; var7 < 2048; var7 += 64) {
				field2851 = class133.field1291[var6];
				field2852 = class133.field1289[var6];
				field2885 = class133.field1291[var7];
				field2853 = class133.field1289[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (int var10 = -26; var10 < 26; ++var10) {
					for (var11 = -26; var11 < 26; ++var11) {
						var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128) {
							if (method1778(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) {
			for (var7 = 0; var7 < 32; ++var7) {
				for (var8 = -25; var8 < 25; ++var8) {
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;

						label76:
						for (var11 = -1; var11 <= 1; ++var11) {
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}

						field2878[var6][var7][var8 + 25][var9 + 25] = var16;
					}
				}
			}
		}

	}

	static boolean method1778(int var0, int var1, int var2) {
		int var3 = var2 * field2885 + var0 * field2853 >> 16;
		int var4 = var2 * field2853 - var0 * field2885 >> 16;
		int var5 = var1 * field2851 + var4 * field2852 >> 16;
		int var6 = var1 * field2852 - var4 * field2851 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = field2880 + var3 * 128 / var5;
			int var8 = field2881 + var6 * 128 / var5;
			return var7 >= field2830 && var7 <= field2884 && var8 >= field2864 && var8 <= field2842;
		} else {
			return false;
		}
	}

	public static boolean method1780() {
		return field2860 && field2858 != -1;
	}

	public static void method1803() {
		field2858 = -1;
		field2860 = false;
	}

	static final int method1785(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static boolean method1786(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
