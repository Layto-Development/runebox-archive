import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "mt")
public class class201 {
	@ObfInfo(name = "am", desc = "Lle;")
	public static class7 field1826;
	@ObfInfo(name = "al", desc = "[S")
	public static short[] field1823;
	@ObfInfo(name = "an", desc = "[[S")
	public static short[][] field1830;
	@ObfInfo(name = "ax", desc = "Lqv;")
	static class339 field1827;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1525916171)
	static int field1828;
	@ObfInfo(name = "ar", desc = "[I")
	static final int[] field1825;
	@ObfInfo(name = "af", desc = "Z")
	boolean field1822;
	@ObfInfo(name = "aa", desc = "[Lho;")
	class146[] field1824;
	@ObfInfo(name = "ae", desc = "[I")
	int[] field1816;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field1817;
	@ObfInfo(name = "au", desc = "[I")
	int[] field1829;
	@ObfInfo(name = "az", desc = "J", longMultiplier = -4990962188091480033L)
	long field1819;
	@ObfInfo(name = "ap", desc = "J", longMultiplier = 8032241556888834061L)
	long field1821;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1253753061)
	public int field1815;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1305081315)
	public int field1818;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -34466909)
	public int field1820;

	static {
		field1825 = new int[]{class36.field495.field494, class36.field498.field494, class36.field492.field494, class36.field488.field494, class36.field501.field494, class36.field490.field494, class36.field497.field494};
		field1826 = new class7(260);
		field1827 = new class339(16, class337.field2676);
		field1828 = 0;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public class201() {
		this.field1820 = -1;
		this.field1818 = 0;
		this.field1822 = false;
	}

	@ObfInfo(name = "<init>", desc = "(Lmt;)V")
	class201(class201 var1) {
		this.field1820 = -1;
		this.field1818 = 0;
		this.field1822 = false;
		int[] var2 = Arrays.copyOf(var1.field1816, var1.field1816.length);
		int[] var3 = Arrays.copyOf(var1.field1829, var1.field1829.length);
		class146[] var4 = (class146[])(null != var1.field1824 ? (class146[])Arrays.copyOf(var1.field1824, var1.field1824.length) : null);
		int[] var5 = Arrays.copyOf(var1.field1817, var1.field1817.length);
		this.method1125(var3, var2, var4, false, var5, var1.field1818, var1.field1815, var1.field1820);
	}

	@ObfInfo(name = "au", desc = "([I[I[Lho;Z[IIIII)V")
	public void method1125(int[] var1, int[] var2, class146[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field1824 = var3;
		this.field1822 = var4;
		this.field1820 = var8;
		this.method1134(var1, var2, var5, var6, var7);
	}

	@ObfInfo(name = "ae", desc = "([I[I[IIII)V", opaqueValue = "1739177030")
	public void method1134(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method1126(var4, (byte)67);
		}

		if (null == var2) {
			var2 = this.method1126(var4, (byte)13);
		}

		this.field1829 = var1;
		this.field1816 = var2;
		this.field1817 = var3;
		this.field1818 = var4;
		this.field1815 = var5;
		this.method1130();
	}

	@ObfInfo(name = "ao", desc = "(IB)[I")
	int[] method1126(int var1, byte var2) {
		int[] var3 = new int[12];

		for (int var4 = 0; var4 < 7; ++var4) {
			if (var2 == -1) {
				throw new IllegalStateException();
			}

			for (int var5 = 0; var5 < class145.field1443; ++var5) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				class145 var6 = class145.method845(var5);
				if (null != var6) {
					if (var2 == -1) {
						throw new IllegalStateException();
					}

					if (!var6.field1450) {
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

						if (var4 + var10001 == var6.field1444) {
							if (var2 == -1) {
								throw new IllegalStateException();
							}

							var3[field1825[var4]] = var5 + 256;
							break;
						}
					}
				}
			}
		}

		return var3;
	}

	@ObfInfo(name = "at", desc = "(IZI)V", opaqueValue = "1556149962")
	public void method1127(int var1, boolean var2) {
		int var4 = this.field1816[field1825[var1]];
		if (var4 != 0) {
			var4 -= 256;

			class145 var5;
			do {
				if (!var2) {
					--var4;
					if (var4 < 0) {
						var4 = class145.field1443 - 1;
					}
				} else {
					++var4;
					if (var4 >= class145.field1443) {
						var4 = 0;
					}
				}

				var5 = class145.method845(var4);
			} while(null == var5 || var5.field1450 || (this.field1818 == 1 ? 7 : 0) + var1 != var5.field1444);

			this.field1816[field1825[var1]] = var4 + 256;
			this.method1130();
		}
	}

	@ObfInfo(name = "ac", desc = "(IZB)V", opaqueValue = "8")
	public void method1128(int var1, boolean var2) {
		int var4 = this.field1817[var1];
		boolean var5;
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = class142.field1430[var1].length - 1;
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
				if (var4 >= class142.field1430[var1].length) {
					var4 = 0;
				}

				if (var1 == 4 && var4 >= 8) {
					var5 = false;
				} else {
					var5 = true;
				}
			} while(!var5);
		}

		this.field1817[var1] = var4;
		this.method1130();
	}

	@ObfInfo(name = "ai", desc = "(II)V", opaqueValue = "-782377094")
	public void method1135(int var1) {
		if (var1 != this.field1818) {
			this.method1134((int[])null, (int[])null, this.field1817, var1, -1);
		}
	}

	@ObfInfo(name = "az", desc = "(Ltm;I)V", opaqueValue = "1716336078")
	public void method1129(class280 var1) {
		var1.method1481(this.field1818);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field1816[field1825[var3]];
			if (var4 == 0) {
				var1.method1481(-1);
			} else {
				var1.method1481(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.method1481(this.field1817[var3]);
		}

	}

	@ObfInfo(name = "ap", desc = "(B)V", opaqueValue = "2")
	void method1130() {
		long var2 = this.field1819;
		int var4 = this.field1816[5];
		int var5 = this.field1816[9];
		this.field1816[5] = var5;
		this.field1816[9] = var4;
		this.field1819 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field1819 <<= 4;
			if (this.field1816[var6] >= 256) {
				this.field1819 += (long)(this.field1816[var6] - 256);
			}
		}

		if (this.field1816[0] >= 256) {
			this.field1819 += (long)(this.field1816[0] - 256 >> 4);
		}

		if (this.field1816[1] >= 256) {
			this.field1819 += (long)(this.field1816[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field1819 <<= 3;
			this.field1819 += (long)this.field1817[var6];
		}

		this.field1819 <<= 1;
		this.field1819 += (long)this.field1818;
		this.field1816[5] = var4;
		this.field1816[9] = var5;
		if (var2 != 0L && var2 != this.field1819 || this.field1822) {
			field1826.method292(var2);
		}

	}

	@ObfInfo(name = "aa", desc = "(Lib;ILib;II)Ljr;", opaqueValue = "1266665034")
	public class384 method1136(class202 var1, int var2, class202 var3, int var4) {
		if (this.field1815 != -1) {
			return class395.method2109(this.field1815).method2097(var1, var2, var3, var4, (class451)null);
		} else {
			long var6 = this.field1819;
			int[] var8 = this.field1816;
			if (var1 != null && (var1.field1844 >= 0 || var1.field1849 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field1816[var9];
				}

				if (var1.field1844 >= 0) {
					var6 += (long)(var1.field1844 - this.field1816[5] << 40);
					var8[5] = var1.field1844;
				}

				if (var1.field1849 >= 0) {
					var6 += (long)(var1.field1849 - this.field1816[3] << 48);
					var8[3] = var1.field1849;
				}
			}

			class384 var19 = (class384)field1826.method294(var6);
			if (var19 == null) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512 && !class145.method845(var12 - 256).method838()) {
						var10 = true;
					}

					if (var12 >= 512 && !class270.method1424(var12 - 512).method1411(this.field1818)) {
						var10 = true;
					}
				}

				if (var10) {
					if (-1L != this.field1821) {
						var19 = (class384)field1826.method294(this.field1821);
					}

					if (var19 == null) {
						return null;
					}
				}

				if (null == var19) {
					class445[] var21 = new class445[12];
					var12 = 0;

					int var14;
					for (int var13 = 0; var13 < 12; ++var13) {
						var14 = var8[var13];
						if (var14 >= 256 && var14 < 512) {
							class445 var15 = class145.method845(var14 - 256).method839();
							if (null != var15) {
								var21[var12++] = var15;
							}
						}

						if (var14 >= 512) {
							class270 var23 = class270.method1424(var14 - 512);
							class445 var16 = var23.method1412(this.field1818);
							if (null != var16) {
								if (null != this.field1824) {
									class146 var17 = this.field1824[var13];
									if (null != var17) {
										int var18;
										if (var17.field1453 != null && var23.field2205 != null && var23.field2173.length == var17.field1453.length) {
											for (var18 = 0; var18 < var23.field2205.length; ++var18) {
												var16.method2340(var23.field2173[var18], var17.field1453[var18]);
											}
										}

										if (null != var17.field1454 && null != var23.field2199 && var17.field1454.length == var23.field2175.length) {
											for (var18 = 0; var18 < var23.field2199.length; ++var18) {
												var16.method2331(var23.field2175[var18], var17.field1454[var18]);
											}
										}
									}
								}

								var21[var12++] = var16;
							}
						}
					}

					class445 var22 = new class445(var21, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field1817[var14] < class142.field1430[var14].length) {
							var22.method2340(class22.field404[var14], class142.field1430[var14][this.field1817[var14]]);
						}

						if (this.field1817[var14] < field1830[var14].length) {
							var22.method2340(field1823[var14], field1830[var14][this.field1817[var14]]);
						}
					}

					var19 = var22.method2337(64, 850, -30, -50, -30);
					field1826.method293(var19, var6);
					this.field1821 = var6;
				}
			}

			class384 var20;
			if (null == var1 && null == var3) {
				var20 = var19.method2044(true);
			} else if (null != var1 && null != var3) {
				var20 = var1.method1142(var19, var2, var3, var4);
			} else if (null != var1) {
				var20 = var1.method1140(var19, var2);
			} else {
				var20 = var3.method1140(var19, var4);
			}

			return var20;
		}
	}

	@ObfInfo(name = "af", desc = "(I)Lic;", opaqueValue = "944418003")
	class445 method1131() {
		if (this.field1815 != -1) {
			return class395.method2109(this.field1815).method2098((class451)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field1816[var3];
				if (var4 >= 256 && var4 < 512 && !class145.method845(var4 - 256).method843()) {
					var2 = true;
				}

				if (var4 >= 512 && !class270.method1424(var4 - 512).method1413(this.field1818)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				class445[] var8 = new class445[12];
				var4 = 0;

				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = this.field1816[var5];
					class445 var7;
					if (var6 >= 256 && var6 < 512) {
						var7 = class145.method845(var6 - 256).method842();
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}

					if (var6 >= 512) {
						var7 = class270.method1424(var6 - 512).method1416(this.field1818);
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}
				}

				class445 var9 = new class445(var8, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field1817[var6] < class142.field1430[var6].length) {
						var9.method2340(class22.field404[var6], class142.field1430[var6][this.field1817[var6]]);
					}

					if (this.field1817[var6] < field1830[var6].length) {
						var9.method2340(field1823[var6], field1830[var6][this.field1817[var6]]);
					}
				}

				return var9;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(B)I")
	public int method1132() {
		long var2 = this.field1819;
		if (this.field1815 != -1) {
			var2 = -65536L | (long)this.field1815;
		}

		Integer var4 = (Integer)field1827.method1870(var2, (byte)-31);
		if (null == var4) {
			var4 = ++field1828 - 1;
			field1827.method1871(var2, var4);
			field1828 %= 65535;
		}

		return var4;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	void method1133() {
		this.method1134(this.field1829, this.field1816, this.field1817, this.field1818, this.field1815);
	}
}
