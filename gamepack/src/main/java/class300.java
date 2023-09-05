import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Random;

@ObfInfo(name = "pk")
public abstract class class300 extends class83 {
	@ObfInfo(name = "ad", desc = "[Luk;")
	public static class398[] field2410;
	@ObfInfo(name = "al", desc = "I")
	static int field2411;
	@ObfInfo(name = "as", desc = "I")
	static int field2412;
	@ObfInfo(name = "an", desc = "I")
	static int field2422;
	@ObfInfo(name = "ar", desc = "I")
	static int field2423;
	@ObfInfo(name = "ab", desc = "I")
	static int field2424;
	@ObfInfo(name = "ag", desc = "I")
	static int field2425;
	@ObfInfo(name = "am", desc = "I")
	static int field2426;
	@ObfInfo(name = "ax", desc = "I")
	static int field2427;
	@ObfInfo(name = "ah", desc = "I")
	static int field2428;
	@ObfInfo(name = "aj", desc = "[Ljava/lang/String;")
	static String[] field2420;
	@ObfInfo(name = "ay", desc = "Ljava/util/Random;")
	static Random field2430;
	@ObfInfo(name = "aq", desc = "[B")
	byte[] field2421;
	@ObfInfo(name = "ae", desc = "[[B")
	byte[][] field2429;
	@ObfInfo(name = "at", desc = "[I")
	int[] field2413;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field2415;
	@ObfInfo(name = "az", desc = "[I")
	int[] field2416;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field2417;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field2431;
	@ObfInfo(name = "ap", desc = "I")
	public int field2414;
	@ObfInfo(name = "aa", desc = "I")
	public int field2418;
	@ObfInfo(name = "af", desc = "I")
	public int field2419;

	static {
		field2411 = -1;
		field2422 = -1;
		field2423 = -1;
		field2424 = -1;
		field2425 = 0;
		field2426 = 0;
		field2427 = 256;
		field2428 = 0;
		field2412 = 0;
		field2430 = new Random();
		field2420 = new String[100];
	}

	@ObfInfo(name = "<init>", desc = "([B[I[I[I[I[I[[B)V")
	class300(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field2429 = new byte[256][];
		this.field2414 = 0;
		this.field2415 = var2;
		this.field2416 = var3;
		this.field2413 = var4;
		this.field2431 = var5;
		this.method1649(var1);
		this.field2429 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field2416[var10] < var8 && this.field2431[var10] != 0) {
				var8 = this.field2416[var10];
			}

			if (this.field2416[var10] + this.field2431[var10] > var9) {
				var9 = this.field2416[var10] + this.field2431[var10];
			}
		}

		this.field2418 = this.field2414 - var8;
		this.field2419 = var9 - this.field2414;
	}

	@ObfInfo(name = "<init>", desc = "([B)V")
	class300(byte[] var1) {
		this.field2429 = new byte[256][];
		this.field2414 = 0;
		this.method1649(var1);
	}

	@ObfInfo(name = "au", desc = "([BIIIII)V")
	abstract void method1643(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfInfo(name = "ae", desc = "([BIIIIII)V")
	abstract void method1663(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfInfo(name = "aa", desc = "([B)V")
	void method1649(byte[] var1) {
		this.field2417 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field2417.length; ++var2) {
				this.field2417[var2] = var1[var2] & 255;
			}

			this.field2414 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.field2417[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256];
			int[] var4 = new int[256];

			int var5;
			for (var5 = 0; var5 < 256; ++var5) {
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) {
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) {
				var11[var6] = new byte[var10[var6]];
				byte var7 = 0;

				for (var8 = 0; var8 < var11[var6].length; ++var8) {
					var7 += var1[var2++];
					var11[var6][var8] = var7;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var10[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var12[var13].length; ++var9) {
					var14 += var1[var2++];
					var12[var13][var9] = var14;
				}
			}

			this.field2421 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field2421[(var13 << 8) + var8] = (byte)method1644(var11, var12, var4, this.field2417, var10, var13, var8);
						}
					}
				}
			}

			this.field2414 = var4[32] + var10[32];
		}

	}

	@ObfInfo(name = "ad", desc = "(C)I")
	public int method1675(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field2417[class244.method1270(var1) & 255];
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/String;)I")
	public int method1646(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = class455.method2372(var7.substring(4));
										var4 += field2410[var8].field3104;
										var3 = -1;
									} catch (Exception var9) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.field2417[(char)(class244.method1270(var6) & 255)];
						if (this.field2421 != null && var3 != -1) {
							var4 += this.field2421[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public int method1647(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.method1675('<');
							if (this.field2421 != null && var11 != -1) {
								var4 += this.field2421[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method1675('>');
							if (this.field2421 != null && var11 != -1) {
								var4 += this.field2421[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class455.method2372(var16.substring(4));
								var4 += field2410[var17].field3104;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method1675(var15);
							if (this.field2421 != null && var11 != -1) {
								var4 += this.field2421[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var19 = var6.toString();
			if (var19.length() > var5) {
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12;
		}
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/String;I)I")
	public int method1669(String var1, int var2) {
		int var3 = this.method1647(var1, new int[]{var2}, field2420);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method1646(field2420[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfInfo(name = "ar", desc = "(Ljava/lang/String;I)I")
	public int method1648(String var1, int var2) {
		return this.method1647(var1, new int[]{var2}, field2420);
	}

	@ObfInfo(name = "ag", desc = "(IILjava/lang/String;II)Lrb;")
	public class238 method1650(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method1646(var3) / 2;
			var6 += this.method1646(var3.substring(0, var1));
			int var7 = var5 - this.field2418;
			int var8 = this.method1646(var3.substring(var1, var1 + var2));
			int var9 = this.field2418 + this.field2419;
			return new class238(var6, var7, var8, var9);
		} else {
			return new class238(var4, var5, 0, 0);
		}
	}

	@ObfInfo(name = "am", desc = "(Ljava/lang/String;IIII)V")
	public void method1674(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1667(var4, var5);
			this.method1662(var1, var2, var3);
		}
	}

	@ObfInfo(name = "ax", desc = "(Ljava/lang/String;IIIII)V")
	public void method1651(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method1667(var4, var5);
			field2427 = var6;
			this.method1662(var1, var2, var3);
		}
	}

	@ObfInfo(name = "ah", desc = "(Ljava/lang/String;IIII)V")
	public void method1652(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1667(var4, var5);
			this.method1662(var1, var2 - this.method1646(var1), var3);
		}
	}

	@ObfInfo(name = "as", desc = "(Ljava/lang/String;IIII)V")
	public void method1653(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1667(var4, var5);
			this.method1662(var1, var2 - this.method1646(var1) / 2, var3);
		}
	}

	@ObfInfo(name = "ay", desc = "(Ljava/lang/String;IIIIIIIII)I")
	public int method1645(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method1654(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;IIIIIIIIII)I")
	public int method1654(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.method1667(var6, var7);
			field2427 = var8;
			if (var11 == 0) {
				var11 = this.field2414;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.field2418 + this.field2419 + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.method1647(var1, var12, field2420);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.field2418;
			} else if (var10 == 1) {
				var14 = var3 + this.field2418 + (var5 - this.field2418 - this.field2419 - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.field2419 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field2418 - this.field2419 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.field2418 + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method1662(field2420[var15], var2, var14);
				} else if (var9 == 1) {
					this.method1662(field2420[var15], var2 + (var4 - this.method1646(field2420[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method1662(field2420[var15], var2 + var4 - this.method1646(field2420[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.method1662(field2420[var15], var2, var14);
				} else {
					this.method1661(field2420[var15], var4);
					this.method1662(field2420[var15], var2, var14);
					field2428 = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfInfo(name = "av", desc = "(Lpl;IIIII)Lss;")
	public class165 method1655(class474 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method2430()) {
			this.method1667(var4, var5);
			var3 -= this.field2414;

			for (int var7 = 0; var7 < var1.method2431(); ++var7) {
				class457 var8 = var1.method2433(var7);
				if (var6 != -1 && var8.field3718 > var6) {
					return new class165(var8.field3715, var8.field3718);
				}

				char var9 = var8.field3716;
				if (var9 != '\n') {
					if (var1.method2436(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field3715;
						int var11 = var3 + var8.field3718;
						int var12 = this.field2413[var9];
						int var13 = this.field2431[var9];
						if (field2424 != -1) {
							this.method1643(this.field2429[var9], var10 + this.field2415[var9] + 1, var11 + this.field2416[var9] + 1, var12, var13, field2424);
						}

						this.method1643(this.field2429[var9], var10 + this.field2415[var9], var11 + this.field2416[var9], var12, var13, field2426);
					}
				}
			}
		}

		return var1.method2435();
	}

	@ObfInfo(name = "aw", desc = "(Ljava/lang/String;IIIII[I)V")
	public void method1668(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method1667(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method1658(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method1642(var1, var2 - this.method1646(var1) / 2, var3, var8, (int[])null, var9);
		}
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;IIIII[I)V")
	public void method1656(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method1667(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method1658(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method1642(var1, var2 - this.method1646(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfInfo(name = "bh", desc = "(Ljava/lang/String;IIIIII[I)V")
	public void method1670(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.method1667(var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method1658(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
			}

			this.method1642(var1, var2 - this.method1646(var1) / 2, var3, var9, (int[])null, var12);
		}
	}

	@ObfInfo(name = "bj", desc = "(Ljava/lang/String;IIII[I)V")
	public void method1657(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method1667(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method1658(var6, var1.length());
			}

			this.method1642(var1, var2 - this.method1646(var1) / 2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfInfo(name = "bk", desc = "(Ljava/lang/String;IIII[I)V")
	public void method1671(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method1667(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method1658(var6, var1.length());
			}

			this.method1642(var1, var2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfInfo(name = "bv", desc = "([II)[I")
	int[] method1658(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / (float)var2;

			for (int var5 = 0; var5 < var2; ++var5) {
				var3[var5] = var1[(int)((float)var5 * var4)];
			}

			return var3;
		}
	}

	@ObfInfo(name = "bt", desc = "(Ljava/lang/String;IIIII)V")
	public void method1672(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method1667(var4, var5);
			field2430.setSeed((long)var6);
			field2427 = 192 + (field2430.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field2430.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method1642(var1, var2, var3, (int[])null, var7, (int[])null);
		}
	}

	@ObfInfo(name = "bd", desc = "(II)V")
	void method1667(int var1, int var2) {
		field2411 = -1;
		field2422 = -1;
		field2423 = var2;
		field2424 = var2;
		field2425 = var1;
		field2426 = var1;
		field2427 = 256;
		field2428 = 0;
		field2412 = 0;
	}

	@ObfInfo(name = "by", desc = "(Ljava/lang/String;)V")
	void method1660(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = class455.method2367(var3, 16, true);
				field2426 = var2;
			} else if (var1.equals("/col")) {
				field2426 = field2425;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = class455.method2367(var3, 16, true);
				field2411 = var2;
			} else if (var1.equals("str")) {
				field2411 = 8388608;
			} else if (var1.equals("/str")) {
				field2411 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = class455.method2367(var3, 16, true);
				field2422 = var2;
			} else if (var1.equals("u")) {
				field2422 = 0;
			} else if (var1.equals("/u")) {
				field2422 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = class455.method2367(var3, 16, true);
				field2424 = var2;
			} else if (var1.equals("shad")) {
				field2424 = 0;
			} else if (var1.equals("/shad")) {
				field2424 = field2423;
			} else if (var1.equals("br")) {
				this.method1667(field2425, field2423);
			}
		} catch (Exception var4) {
		}

	}

	@ObfInfo(name = "bs", desc = "(Ljava/lang/String;I)V")
	void method1661(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				++var3;
			}
		}

		if (var3 > 0) {
			field2428 = (var2 - this.method1646(var1) << 8) / var3;
		}

	}

	@ObfInfo(name = "bm", desc = "(Ljava/lang/String;II)V")
	void method1662(String var1, int var2, int var3) {
		var3 -= this.field2414;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class244.method1270(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										var9 = class455.method2372(var8.substring(4));
										class398 var13 = field2410[var9];
										var13.method2115(var2, var3 + this.field2414 - var13.field3109);
										var2 += var13.field3104;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method1660(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.field2421 != null && var5 != -1) {
							var2 += this.field2421[(var5 << 8) + var7];
						}

						int var12 = this.field2413[var7];
						var9 = this.field2431[var7];
						if (var7 != ' ') {
							if (field2427 == 256) {
								if (field2424 != -1) {
									method1673(this.field2429[var7], var2 + this.field2415[var7] + 1, var3 + this.field2416[var7] + 1, var12, var9, field2424);
								}

								this.method1643(this.field2429[var7], var2 + this.field2415[var7], var3 + this.field2416[var7], var12, var9, field2426);
							} else {
								if (field2424 != -1) {
									method1665(this.field2429[var7], var2 + this.field2415[var7] + 1, var3 + this.field2416[var7] + 1, var12, var9, field2424, field2427);
								}

								this.method1663(this.field2429[var7], var2 + this.field2415[var7], var3 + this.field2416[var7], var12, var9, field2426, field2427);
							}
						} else if (field2428 > 0) {
							field2412 += field2428;
							var2 += field2412 >> 8;
							field2412 &= 255;
						}

						int var10 = this.field2417[var7];
						if (field2411 != -1) {
							method553(var2, var3 + (int)((double)this.field2414 * 0.7D), var10, field2411);
						}

						if (field2422 != -1) {
							method553(var2, var3 + this.field2414 + 1, var10, field2422);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	@ObfInfo(name = "bf", desc = "(Ljava/lang/String;II[I[I[I)V")
	void method1642(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.field2414;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(class244.method1270(var1.charAt(var10)) & 255);
				if (var11 == '<') {
					var7 = var10;
				} else {
					int var13;
					int var14;
					int var15;
					if (var11 == '>' && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = '<';
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										if (var5 != null) {
											var13 = var5[var9];
										} else {
											var13 = 0;
										}

										if (var6 != null) {
											var14 = var6[var9];
										} else {
											var14 = 0;
										}

										++var9;
										var15 = class455.method2372(var12.substring(4));
										class398 var20 = field2410[var15];
										var20.method2115(var2 + var13, var3 + this.field2414 - var20.field3109 + var14);
										var2 += var20.field3104;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.method1660(var12);
								}
								continue;
							}

							var11 = '>';
						}
					}

					if (var11 == 160) {
						var11 = ' ';
					}

					if (var7 == -1) {
						if (this.field2421 != null && var8 != -1) {
							var2 += this.field2421[(var8 << 8) + var11];
						}

						int var19 = this.field2413[var11];
						var13 = this.field2431[var11];
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var16;
						if (var4 != null) {
							var16 = var4[var9];
						} else {
							var16 = field2426;
						}

						++var9;
						if (var11 != ' ') {
							if (field2427 == 256) {
								if (field2424 != -1) {
									method1673(this.field2429[var11], var2 + this.field2415[var11] + 1 + var14, var3 + this.field2416[var11] + 1 + var15, var19, var13, field2424);
								}

								this.method1643(this.field2429[var11], var2 + this.field2415[var11] + var14, var3 + this.field2416[var11] + var15, var19, var13, var16);
							} else {
								if (field2424 != -1) {
									method1665(this.field2429[var11], var2 + this.field2415[var11] + 1 + var14, var3 + this.field2416[var11] + 1 + var15, var19, var13, field2424, field2427);
								}

								this.method1663(this.field2429[var11], var2 + this.field2415[var11] + var14, var3 + this.field2416[var11] + var15, var19, var13, var16, field2427);
							}
						} else if (field2428 > 0) {
							field2412 += field2428;
							var2 += field2412 >> 8;
							field2412 &= 255;
						}

						int var17 = this.field2417[var11];
						if (field2411 != -1) {
							method553(var2, var3 + (int)((double)this.field2414 * 0.7D), var17, field2411);
						}

						if (field2422 != -1) {
							method553(var2, var3 + this.field2414, var17, field2422);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}

	}

	@ObfInfo(name = "af", desc = "([[B[[B[I[I[III)I")
	static int method1644(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method1659(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; ++var7) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfInfo(name = "bq", desc = "([BIIIII)V")
	static void method1673(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class83.field870;
		int var7 = class83.field870 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class83.field876) {
			var10 = class83.field876 - var2;
			var4 -= var10;
			var2 = class83.field876;
			var9 += var10 * var3;
			var6 += var10 * class83.field870;
		}

		if (var2 + var4 > class83.field874) {
			var4 -= var2 + var4 - class83.field874;
		}

		if (var1 < class83.field875) {
			var10 = class83.field875 - var1;
			var3 -= var10;
			var1 = class83.field875;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var1 + var3 > class83.field869) {
			var10 = var1 + var3 - class83.field869;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method1664(class83.field872, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfInfo(name = "ba", desc = "([I[BIIIIIII)V")
	static void method1664(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(name = "bl", desc = "([BIIIIII)V")
	static void method1665(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class83.field870;
		int var8 = class83.field870 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class83.field876) {
			var11 = class83.field876 - var2;
			var4 -= var11;
			var2 = class83.field876;
			var10 += var11 * var3;
			var7 += var11 * class83.field870;
		}

		if (var2 + var4 > class83.field874) {
			var4 -= var2 + var4 - class83.field874;
		}

		if (var1 < class83.field875) {
			var11 = class83.field875 - var1;
			var3 -= var11;
			var1 = class83.field875;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var1 + var3 > class83.field869) {
			var11 = var1 + var3 - class83.field869;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method1666(class83.field872, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfInfo(name = "bp", desc = "([I[BIIIIIIII)V")
	static void method1666(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
