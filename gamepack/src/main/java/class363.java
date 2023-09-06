import java.util.Arrays;

public class class363 {
	public static class344 field3062;
	public static short[] field3059;
	public static short[][] field3066;
	static class407 field3063;
	static int field3064;
	static final int[] field3061;
	boolean field3058;
	class30[] field3060;
	int[] field3052;
	int[] field3053;
	int[] field3065;
	long field3055;
	long field3057;
	public int field3051;
	public int field3054;
	public int field3056;

	static {
		field3061 = new int[]{class100.field1004.field1003, class100.field1007.field1003, class100.field1001.field1003, class100.field997.field1003, class100.field1010.field1003, class100.field999.field1003, class100.field1006.field1003};
		field3062 = new class344(260);
		field3063 = new class407(16, class14.field379);
		field3064 = 0;
	}

	public class363() {
		this.field3056 = -1;
		this.field3054 = 0;
		this.field3058 = false;
	}

	class363(class363 var1) {
		this.field3056 = -1;
		this.field3054 = 0;
		this.field3058 = false;
		int[] var2 = Arrays.copyOf(var1.field3052, var1.field3052.length);
		int[] var3 = Arrays.copyOf(var1.field3065, var1.field3065.length);
		class30[] var4 = (class30[])(null != var1.field3060 ? (class30[])Arrays.copyOf(var1.field3060, var1.field3060.length) : null);
		int[] var5 = Arrays.copyOf(var1.field3053, var1.field3053.length);
		this.method1951(var3, var2, var4, false, var5, var1.field3054, var1.field3051, var1.field3056);
	}

	public void method1951(int[] var1, int[] var2, class30[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3060 = var3;
		this.field3058 = var4;
		this.field3056 = var8;
		this.method1960(var1, var2, var5, var6, var7);
	}

	public void method1960(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method1952(var4, (byte)67);
		}

		if (null == var2) {
			var2 = this.method1952(var4, (byte)13);
		}

		this.field3065 = var1;
		this.field3052 = var2;
		this.field3053 = var3;
		this.field3054 = var4;
		this.field3051 = var5;
		this.method1956();
	}

	int[] method1952(int var1, byte var2) {
		int[] var3 = new int[12];

		for (int var4 = 0; var4 < 7; ++var4) {
			if (var2 == -1) {
				throw new IllegalStateException();
			}

			for (int var5 = 0; var5 < class404.field3386; ++var5) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				class404 var6 = class419.method2161(var5);
				if (null != var6) {
					if (var2 == -1) {
						throw new IllegalStateException();
					}

					if (!var6.field3393) {
						if (var2 == -1) {
							throw new IllegalStateException();
						}

						byte var10001;
						if (var1 == 1) {
							if (var2 == -1) {
								throw new IllegalStateException();
							}

							var10001 = 7;
						} else {
							var10001 = 0;
						}

						if (var4 + var10001 == var6.field3387) {
							if (var2 == -1) {
								throw new IllegalStateException();
							}

							var3[field3061[var4]] = var5 + 256;
							break;
						}
					}
				}
			}
		}

		return var3;
	}

	public void method1953(int var1, boolean var2) {
		int var4 = this.field3052[field3061[var1]];
		if (var4 != 0) {
			var4 -= 256;

			class404 var5;
			do {
				if (!var2) {
					--var4;
					if (var4 < 0) {
						var4 = class404.field3386 - 1;
					}
				} else {
					++var4;
					if (var4 >= class404.field3386) {
						var4 = 0;
					}
				}

				var5 = class419.method2161(var4);
			} while(null == var5 || var5.field3393 || (this.field3054 == 1 ? 7 : 0) + var1 != var5.field3387);

			this.field3052[field3061[var1]] = var4 + 256;
			this.method1956();
		}
	}

	public void method1954(int var1, boolean var2) {
		int var4 = this.field3053[var1];
		boolean var5;
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = class131.field1279[var1].length - 1;
				}

				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while(!var5);
		} else {
			do {
				++var4;
				if (var4 >= class131.field1279[var1].length) {
					var4 = 0;
				}

				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while(!var5);
		}

		this.field3053[var1] = var4;
		this.method1956();
	}

	public void method1961(int var1) {
		if (var1 != this.field3054) {
			this.method1960((int[])null, (int[])null, this.field3053, var1, -1);
		}
	}

	public void method1955(class42 var1) {
		var1.method267(this.field3054);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field3052[field3061[var3]];
			if (var4 == 0) {
				var1.method267(-1);
			} else {
				var1.method267(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.method267(this.field3053[var3]);
		}

	}

	void method1956() {
		long var2 = this.field3055;
		int var4 = this.field3052[5];
		int var5 = this.field3052[9];
		this.field3052[5] = var5;
		this.field3052[9] = var4;
		this.field3055 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field3055 <<= 4;
			if (this.field3052[var6] >= 256) {
				this.field3055 += (long)(this.field3052[var6] - 256);
			}
		}

		if (this.field3052[0] >= 256) {
			this.field3055 += (long)(this.field3052[0] - 256 >> 4);
		}

		if (this.field3052[1] >= 256) {
			this.field3055 += (long)(this.field3052[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field3055 <<= 3;
			this.field3055 += (long)this.field3053[var6];
		}

		this.field3055 <<= 1;
		this.field3055 += (long)this.field3054;
		this.field3052[5] = var4;
		this.field3052[9] = var5;
		if (var2 != 0L && var2 != this.field3055 || this.field3058) {
			field3062.method1888(var2);
		}

	}

	public class250 method1962(class393 var1, int var2, class393 var3, int var4) {
		if (this.field3051 != -1) {
			return class150.method861(this.field3051).method1999(var1, var2, var3, var4, (class447)null);
		} else {
			long var6 = this.field3055;
			int[] var8 = this.field3052;
			if (var1 != null && (var1.field3301 >= 0 || var1.field3306 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field3052[var9];
				}

				if (var1.field3301 >= 0) {
					var6 += (long)(var1.field3301 - this.field3052[5] << 40);
					var8[5] = var1.field3301;
				}

				if (var1.field3306 >= 0) {
					var6 += (long)(var1.field3306 - this.field3052[3] << 48);
					var8[3] = var1.field3306;
				}
			}

			class250 var19 = (class250)field3062.method1890(var6);
			if (var19 == null) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512 && !class419.method2161(var12 - 256).method2086()) {
						var10 = true;
					}

					if (var12 >= 512 && !class67.method492(var12 - 512).method1187(this.field3054)) {
						var10 = true;
					}
				}

				if (var10) {
					if (-1L != this.field3057) {
						var19 = (class250)field3062.method1890(this.field3057);
					}

					if (var19 == null) {
						return null;
					}
				}

				if (null == var19) {
					class48[] var21 = new class48[12];
					var12 = 0;

					int var14;
					for (int var13 = 0; var13 < 12; ++var13) {
						var14 = var8[var13];
						if (var14 >= 256 && var14 < 512) {
							class48 var15 = class419.method2161(var14 - 256).method2087();
							if (null != var15) {
								var21[var12++] = var15;
							}
						}

						if (var14 >= 512) {
							class210 var23 = class67.method492(var14 - 512);
							class48 var16 = var23.method1188(this.field3054);
							if (null != var16) {
								if (null != this.field3060) {
									class30 var17 = this.field3060[var13];
									if (null != var17) {
										int var18;
										if (var17.field465 != null && var23.field1973 != null && var23.field1941.length == var17.field465.length) {
											for (var18 = 0; var18 < var23.field1973.length; ++var18) {
												var16.method372(var23.field1941[var18], var17.field465[var18]);
											}
										}

										if (null != var17.field466 && null != var23.field1967 && var17.field466.length == var23.field1943.length) {
											for (var18 = 0; var18 < var23.field1967.length; ++var18) {
												var16.method363(var23.field1943[var18], var17.field466[var18]);
											}
										}
									}
								}

								var21[var12++] = var16;
							}
						}
					}

					class48 var22 = new class48(var21, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field3053[var14] < class131.field1279[var14].length) {
							var22.method372(class349.field3005[var14], class131.field1279[var14][this.field3053[var14]]);
						}

						if (this.field3053[var14] < field3066[var14].length) {
							var22.method372(field3059[var14], field3066[var14][this.field3053[var14]]);
						}
					}

					var19 = var22.method369(64, 850, -30, -50, -30);
					field3062.method1889(var19, var6);
					this.field3057 = var6;
				}
			}

			class250 var20;
			if (null == var1 && null == var3) {
				var20 = var19.method1451(true);
			} else if (null != var1 && null != var3) {
				var20 = var1.method2056(var19, var2, var3, var4);
			} else if (null != var1) {
				var20 = var1.method2054(var19, var2);
			} else {
				var20 = var3.method2054(var19, var4);
			}

			return var20;
		}
	}

	class48 method1957() {
		if (this.field3051 != -1) {
			return class150.method861(this.field3051).method2000((class447)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field3052[var3];
				if (var4 >= 256 && var4 < 512 && !class419.method2161(var4 - 256).method2091()) {
					var2 = true;
				}

				if (var4 >= 512 && !class67.method492(var4 - 512).method1189(this.field3054)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				class48[] var8 = new class48[12];
				var4 = 0;

				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = this.field3052[var5];
					class48 var7;
					if (var6 >= 256 && var6 < 512) {
						var7 = class419.method2161(var6 - 256).method2090();
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}

					if (var6 >= 512) {
						var7 = class67.method492(var6 - 512).method1192(this.field3054);
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}
				}

				class48 var9 = new class48(var8, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field3053[var6] < class131.field1279[var6].length) {
						var9.method372(class349.field3005[var6], class131.field1279[var6][this.field3053[var6]]);
					}

					if (this.field3053[var6] < field3066[var6].length) {
						var9.method372(field3059[var6], field3066[var6][this.field3053[var6]]);
					}
				}

				return var9;
			}
		}
	}

	public int method1958() {
		long var2 = this.field3055;
		if (this.field3051 != -1) {
			var2 = -65536L | (long)this.field3051;
		}

		Integer var4 = (Integer)field3063.method2101(var2, (byte)-31);
		if (null == var4) {
			var4 = ++field3064 - 1;
			field3063.method2102(var2, var4);
			field3064 %= 65535;
		}

		return var4;
	}

	void method1959() {
		this.method1960(this.field3065, this.field3052, this.field3053, this.field3054, this.field3051);
	}

	static char method1963(char var0, class168 var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != class168.field1633) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != class168.field1633) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}
}
