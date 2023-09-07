public class class362 extends class310 {

	public static boolean field2917;

	public static class106 field2897;

	public static class338 field2869;

	public static class338 field2871;

	static class106 field2870;

	static class106 field2873;

	static class106 field2891;

	static class462[] field2896;

	boolean field2874;

	boolean field2898;

	boolean field2907;

	class419 field2918;

	int field2867;

	int field2880;

	int field2884;

	int field2888;

	int field2893;

	int field2903;

	int field2904;

	int field2905;

	int field2910;

	int field2911;

	int field2916;

	int[] field2876;

	int[] field2877;

	short[] field2879;

	short[] field2881;

	short[] field2882;

	short[] field2890;

	public boolean field2872;

	public boolean field2886;

	public boolean field2894;

	public boolean field2899;

	public boolean field2900;

	public int field2868;

	public int field2875;

	public int field2883;

	public int field2885;

	public int field2889;

	public int field2892;

	public int field2895;

	public int field2901;

	public int field2902;

	public int field2908;

	public int field2912;

	public int field2913;

	public int field2914;

	public int field2915;

	public int[] field2906;

	public int[] field2909;

	public String field2878;

	public String[] field2887;

	static {
		field2917 = false;
		field2870 = new class106(4096);
		field2897 = new class106(500);
		field2873 = new class106(30);
		field2891 = new class106(30);
		field2896 = new class462[4];
	}

	class362() {
		this.field2878 = class55.field629;
		this.field2883 = 1;
		this.field2868 = 1;
		this.field2885 = 2;
		this.field2886 = true;
		this.field2892 = -1;
		this.field2888 = -1;
		this.field2874 = false;
		this.field2894 = false;
		this.field2895 = -1;
		this.field2889 = 16;
		this.field2893 = 0;
		this.field2867 = 0;
		this.field2887 = new String[5];
		this.field2902 = -1;
		this.field2901 = -1;
		this.field2898 = false;
		this.field2899 = true;
		this.field2884 = 128;
		this.field2880 = 128;
		this.field2916 = 128;
		this.field2903 = 0;
		this.field2904 = 0;
		this.field2905 = 0;
		this.field2872 = false;
		this.field2907 = false;
		this.field2908 = -1;
		this.field2910 = -1;
		this.field2911 = -1;
		this.field2912 = -1;
		this.field2913 = 0;
		this.field2914 = 0;
		this.field2915 = 0;
		this.field2900 = true;
	}

	void method1886() {
		if (this.field2892 == -1) {
			this.field2892 = 0;
			if (this.field2876 != null && (null == this.field2877 || this.field2877[0] == 10)) {
				this.field2892 = 1;
			}
			for (int var2 = 0; var2 < 5; ++var2) {
				if (null != this.field2887[var2]) {
					this.field2892 = 1;
				}
			}
		}
		if (this.field2908 == -1) {
			this.field2908 = this.field2885 != 0 ? 1 : 0;
		}
	}

	void method1896(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method1887(var1, var3);
		}
	}

	void method1887(class187 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method1096();
			if (var4 > 0) {
				if (null != this.field2876 && !field2917) {
					var1.field1832 += var4 * 3;
				} else {
					this.field2877 = new int[var4];
					this.field2876 = new int[var4];
					for (var5 = 0; var5 < var4; ++var5) {
						this.field2876[var5] = var1.method1145();
						this.field2877[var5] = var1.method1096();
					}
				}
			}
		} else if (var2 == 2) {
			this.field2878 = var1.method1104();
		} else if (var2 == 5) {
			var4 = var1.method1096();
			if (var4 > 0) {
				if (null != this.field2876 && !field2917) {
					var1.field1832 += var4 * 2;
				} else {
					this.field2877 = null;
					this.field2876 = new int[var4];
					for (var5 = 0; var5 < var4; ++var5) {
						this.field2876[var5] = var1.method1145();
					}
				}
			}
		} else if (var2 == 14) {
			this.field2883 = var1.method1096();
		} else if (var2 == 15) {
			this.field2868 = var1.method1096();
		} else if (var2 == 17) {
			this.field2885 = 0;
			this.field2886 = false;
		} else if (var2 == 18) {
			this.field2886 = false;
		} else if (var2 == 19) {
			this.field2892 = var1.method1096();
		} else if (var2 == 21) {
			this.field2888 = 0;
		} else if (var2 == 22) {
			this.field2874 = true;
		} else if (var2 == 23) {
			this.field2894 = true;
		} else if (var2 == 24) {
			this.field2895 = var1.method1145();
			if (this.field2895 == 65535) {
				this.field2895 = -1;
			}
		} else if (var2 == 27) {
			this.field2885 = 1;
		} else if (var2 == 28) {
			this.field2889 = var1.method1096();
		} else if (var2 == 29) {
			this.field2893 = var1.method1097();
		} else if (var2 == 39) {
			this.field2867 = var1.method1097() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.field2887[var2 - 30] = var1.method1104();
			if (this.field2887[var2 - 30].equalsIgnoreCase(class55.field571)) {
				this.field2887[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method1096();
			this.field2879 = new short[var4];
			this.field2890 = new short[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field2879[var5] = (short) var1.method1145();
				this.field2890[var5] = (short) var1.method1145();
			}
		} else if (var2 == 41) {
			var4 = var1.method1096();
			this.field2881 = new short[var4];
			this.field2882 = new short[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				this.field2881[var5] = (short) var1.method1145();
				this.field2882[var5] = (short) var1.method1145();
			}
		} else if (var2 == 61) {
			var1.method1145();
		} else if (var2 == 62) {
			this.field2898 = true;
		} else if (var2 == 64) {
			this.field2899 = false;
		} else if (var2 == 65) {
			this.field2884 = var1.method1145();
		} else if (var2 == 66) {
			this.field2880 = var1.method1145();
		} else if (var2 == 67) {
			this.field2916 = var1.method1145();
		} else if (var2 == 68) {
			this.field2901 = var1.method1145();
		} else if (var2 == 69) {
			var1.method1096();
		} else if (var2 == 70) {
			this.field2903 = var1.method1098();
		} else if (var2 == 71) {
			this.field2904 = var1.method1098();
		} else if (var2 == 72) {
			this.field2905 = var1.method1098();
		} else if (var2 == 73) {
			this.field2872 = true;
		} else if (var2 == 74) {
			this.field2907 = true;
		} else if (var2 == 75) {
			this.field2908 = var1.method1096();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.field2912 = var1.method1145();
				this.field2913 = var1.method1096();
			} else if (var2 == 79) {
				this.field2914 = var1.method1145();
				this.field2915 = var1.method1145();
				this.field2913 = var1.method1096();
				var4 = var1.method1096();
				this.field2906 = new int[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field2906[var5] = var1.method1145();
				}
			} else if (var2 == 81) {
				this.field2888 = var1.method1096() * 256;
			} else if (var2 == 82) {
				this.field2902 = var1.method1145();
			} else if (var2 == 89) {
				this.field2900 = false;
			} else if (var2 == 249) {
				this.field2918 = class437.method2178(var1, this.field2918);
			}
		} else {
			this.field2910 = var1.method1145();
			if (this.field2910 == 65535) {
				this.field2910 = -1;
			}
			this.field2911 = var1.method1145();
			if (this.field2911 == 65535) {
				this.field2911 = -1;
			}
			var4 = -1;
			if (var2 == 92) {
				var4 = var1.method1145();
				if (var4 == 65535) {
					var4 = -1;
				}
			}
			var5 = var1.method1096();
			this.field2909 = new int[var5 + 2];
			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2909[var6] = var1.method1145();
				if (this.field2909[var6] == 65535) {
					this.field2909[var6] = -1;
				}
			}
			this.field2909[var5 + 1] = var4;
		}
	}

	public final boolean method1888(int var1) {
		if (null != this.field2877) {
			for (int var5 = 0; var5 < this.field2877.length; ++var5) {
				if (this.field2877[var5] == var1) {
					return field2869.method1764(this.field2876[var5] & 65535, 0);
				}
			}
			return true;
		} else if (this.field2876 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.field2876.length; ++var4) {
				var3 &= field2869.method1764(this.field2876[var4] & 65535, 0);
			}
			return var3;
		}
	}

	public final boolean method1889() {
		if (this.field2876 == null) {
			return true;
		} else {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field2876.length; ++var3) {
				var2 &= field2869.method1764(this.field2876[var3] & 65535, 0);
			}
			return var2;
		}
	}

	public final class189 method1890(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (null == this.field2877) {
			var8 = (long) (var2 + (this.field2875 << 10));
		} else {
			var8 = (long) (var2 + (var1 << 3) + (this.field2875 << 10));
		}
		Object var10 = (class189) field2873.method648(var8);
		if (null == var10) {
			class462 var11 = this.method1897(var1, var2);
			if (var11 == null) {
				return null;
			}
			if (!this.field2874) {
				var10 = var11.method2255(this.field2893 + 64, this.field2867 + 768, -50, -10, -50);
			} else {
				var11.field3544 = (short) (this.field2893 + 64);
				var11.field3533 = (short) (768 + this.field2867);
				var11.method2251();
				var10 = var11;
			}
			field2873.method647((class310) var10, var8);
		}
		if (this.field2874) {
			var10 = ((class462) var10).method2240();
		}
		if (this.field2888 >= 0) {
			if (var10 instanceof class113) {
				var10 = ((class113) var10).method677(var3, var4, var5, var6, true, this.field2888);
			} else if (var10 instanceof class462) {
				var10 = ((class462) var10).method2241(var3, var4, var5, var6, true, this.field2888);
			}
		}
		return (class189) var10;
	}

	public final class113 method1892(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var8;
		if (this.field2877 == null) {
			var8 = (long) (var2 + (this.field2875 << 10));
		} else {
			var8 = (long) (var2 + (this.field2875 << 10) + (var1 << 3));
		}
		class113 var10 = (class113) field2891.method648(var8);
		if (null == var10) {
			class462 var11 = this.method1897(var1, var2);
			if (var11 == null) {
				return null;
			}
			var10 = var11.method2255(this.field2893 + 64, 768 + this.field2867, -50, -10, -50);
			field2891.method647(var10, var8);
		}
		if (this.field2888 >= 0) {
			var10 = var10.method677(var3, var4, var5, var6, true, this.field2888);
		}
		return var10;
	}

	public final class113 method1891(int var1, int var2, int[][] var3, int var4, int var5, int var6, class67 var7, int var8) {
		long var10;
		if (this.field2877 == null) {
			var10 = (long) ((this.field2875 << 10) + var2);
		} else {
			var10 = (long) ((this.field2875 << 10) + (var1 << 3) + var2);
		}
		class113 var12 = (class113) field2891.method648(var10);
		if (null == var12) {
			class462 var13 = this.method1897(var1, var2);
			if (var13 == null) {
				return null;
			}
			var12 = var13.method2255(this.field2893 + 64, 768 + this.field2867, -50, -10, -50);
			field2891.method647(var12, var10);
		}
		if (var7 == null && this.field2888 == -1) {
			return var12;
		} else {
			if (var7 != null) {
				var12 = var7.method298(var12, var8, var2);
			} else {
				var12 = var12.method678(true);
			}
			if (this.field2888 >= 0) {
				var12 = var12.method677(var3, var4, var5, var6, false, this.field2888);
			}
			return var12;
		}
	}

	final class462 method1897(int var1, int var2) {
		class462 var4 = null;
		boolean var5;
		int var6;
		int var8;
		if (this.field2877 == null) {
			if (var1 != 10) {
				return null;
			}
			if (this.field2876 == null) {
				return null;
			}
			var5 = this.field2898;
			if (var1 == 2 && var2 > 3) {
				var5 = !var5;
			}
			var6 = this.field2876.length;
			for (int var7 = 0; var7 < var6; ++var7) {
				var8 = this.field2876[var7];
				if (var5) {
					var8 += 65536;
				}
				var4 = (class462) field2897.method648((long) var8);
				if (var4 == null) {
					var4 = class462.method2259(field2869, var8 & 65535, 0);
					if (null == var4) {
						return null;
					}
					if (var5) {
						var4.method2248();
					}
					field2897.method647(var4, (long) var8);
				}
				if (var6 > 1) {
					field2896[var7] = var4;
				}
			}
			if (var6 > 1) {
				var4 = new class462(field2896, var6);
			}
		} else {
			int var9 = -1;
			for (var6 = 0; var6 < this.field2877.length; ++var6) {
				if (this.field2877[var6] == var1) {
					var9 = var6;
					break;
				}
			}
			if (var9 == -1) {
				return null;
			}
			var6 = this.field2876[var9];
			boolean var10 = this.field2898 ^ var2 > 3;
			if (var10) {
				var6 += 65536;
			}
			var4 = (class462) field2897.method648((long) var6);
			if (var4 == null) {
				var4 = class462.method2259(field2869, var6 & 65535, 0);
				if (null == var4) {
					return null;
				}
				if (var10) {
					var4.method2248();
				}
				field2897.method647(var4, (long) var6);
			}
		}
		if (this.field2884 == 128 && this.field2880 == 128 && this.field2916 == 128) {
			var5 = false;
		} else {
			var5 = true;
		}
		boolean var11;
		if (this.field2903 == 0 && this.field2904 == 0 && this.field2905 == 0) {
			var11 = false;
		} else {
			var11 = true;
		}
		class462 var12 = new class462(var4, var2 == 0 && !var5 && !var11, this.field2879 == null, null == this.field2881, true);
		if (var1 == 4 && var2 > 3) {
			var12.method2246(256);
			var12.method2247(45, 0, -45);
		}
		var2 &= 3;
		if (var2 == 1) {
			var12.method2243();
		} else if (var2 == 2) {
			var12.method2244();
		} else if (var2 == 3) {
			var12.method2245();
		}
		if (null != this.field2879) {
			for (var8 = 0; var8 < this.field2879.length; ++var8) {
				var12.method2258(this.field2879[var8], this.field2890[var8]);
			}
		}
		if (this.field2881 != null) {
			for (var8 = 0; var8 < this.field2881.length; ++var8) {
				var12.method2249(this.field2881[var8], this.field2882[var8]);
			}
		}
		if (var5) {
			var12.method2250(this.field2884, this.field2880, this.field2916);
		}
		if (var11) {
			var12.method2247(this.field2903, this.field2904, this.field2905);
		}
		return var12;
	}

	public final class362 method1893() {
		int var2 = -1;
		if (this.field2910 != -1) {
			var2 = class410.method2082(this.field2910);
		} else if (this.field2911 != -1) {
			var2 = class410.field3198[this.field2911];
		}
		int var3;
		if (var2 >= 0 && var2 < this.field2909.length - 1) {
			var3 = this.field2909[var2];
		} else {
			var3 = this.field2909[this.field2909.length - 1];
		}
		return var3 != -1 ? class319.method1705(var3, (byte) 25) : null;
	}

	public int method1894(int var1, int var2) {
		return class437.method2177(this.field2918, var1, var2);
	}

	public String method1895(int var1, String var2) {
		class419 var5 = this.field2918;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class47 var6 = (class47) var5.method2105((long) var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = (String) var6.field233;
			}
		}
		return var4;
	}

	public boolean method1898() {
		if (this.field2909 == null) {
			return this.field2912 != -1 || this.field2906 != null;
		} else {
			for (int var2 = 0; var2 < this.field2909.length; ++var2) {
				if (this.field2909[var2] != -1) {
					class362 var3 = class319.method1705(this.field2909[var2], (byte) -30);
					if (var3.field2912 != -1 || var3.field2906 != null) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
