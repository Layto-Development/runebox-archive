import java.util.Random;

public abstract class class228 extends class266 {
	public static class25[] field2062;
	static int field2063;
	static int field2064;
	static int field2074;
	static int field2075;
	static int field2076;
	static int field2077;
	static int field2078;
	static int field2079;
	static int field2080;
	static String[] field2072;
	static Random field2082;
	byte[] field2073;
	byte[][] field2081;
	int[] field2065;
	int[] field2067;
	int[] field2068;
	int[] field2069;
	int[] field2083;
	public int field2066;
	public int field2070;
	public int field2071;

	static {
		field2063 = -1;
		field2074 = -1;
		field2075 = -1;
		field2076 = -1;
		field2077 = 0;
		field2078 = 0;
		field2079 = 256;
		field2080 = 0;
		field2064 = 0;
		field2082 = new Random();
		field2072 = new String[100];
	}

	class228(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field2081 = new byte[256][];
		this.field2066 = 0;
		this.field2067 = var2;
		this.field2068 = var3;
		this.field2065 = var4;
		this.field2083 = var5;
		this.method1295(var1);
		this.field2081 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field2068[var10] < var8 && this.field2083[var10] != 0) {
				var8 = this.field2068[var10];
			}

			if (this.field2068[var10] + this.field2083[var10] > var9) {
				var9 = this.field2068[var10] + this.field2083[var10];
			}
		}

		this.field2070 = this.field2066 - var8;
		this.field2071 = var9 - this.field2066;
	}

	class228(byte[] var1) {
		this.field2081 = new byte[256][];
		this.field2066 = 0;
		this.method1295(var1);
	}

	abstract void method1289(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	abstract void method1309(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	void method1295(byte[] var1) {
		this.field2069 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field2069.length; ++var2) {
				this.field2069[var2] = var1[var2] & 255;
			}

			this.field2066 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.field2069[var3] = var1[var2++] & 255;
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

			this.field2073 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field2073[(var13 << 8) + var8] = (byte)method1290(var11, var12, var4, this.field2069, var10, var13, var8);
						}
					}
				}
			}

			this.field2066 = var4[32] + var10[32];
		}

	}

	public int method1321(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field2069[class435.method2206(var1) & 255];
	}

	public int method1292(String var1) {
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
										int var8 = class177.method1005(var7.substring(4));
										var4 += field2062[var8].field449;
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
						var4 += this.field2069[(char)(class435.method2206(var6) & 255)];
						if (this.field2073 != null && var3 != -1) {
							var4 += this.field2073[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public int method1293(String var1, int[] var2, String[] var3) {
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
							var4 += this.method1321('<');
							if (this.field2073 != null && var11 != -1) {
								var4 += this.field2073[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method1321('>');
							if (this.field2073 != null && var11 != -1) {
								var4 += this.field2073[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class177.method1005(var16.substring(4));
								var4 += field2062[var17].field449;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method1321(var15);
							if (this.field2073 != null && var11 != -1) {
								var4 += this.field2073[(var11 << '\b') + var15];
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

	public int method1315(String var1, int var2) {
		int var3 = this.method1293(var1, new int[]{var2}, field2072);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method1292(field2072[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	public int method1294(String var1, int var2) {
		return this.method1293(var1, new int[]{var2}, field2072);
	}

	public class169 method1296(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method1292(var3) / 2;
			var6 += this.method1292(var3.substring(0, var1));
			int var7 = var5 - this.field2070;
			int var8 = this.method1292(var3.substring(var1, var1 + var2));
			int var9 = this.field2070 + this.field2071;
			return new class169(var6, var7, var8, var9);
		} else {
			return new class169(var4, var5, 0, 0);
		}
	}

	public void method1320(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1313(var4, var5);
			this.method1308(var1, var2, var3);
		}
	}

	public void method1297(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method1313(var4, var5);
			field2079 = var6;
			this.method1308(var1, var2, var3);
		}
	}

	public void method1298(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1313(var4, var5);
			this.method1308(var1, var2 - this.method1292(var1), var3);
		}
	}

	public void method1299(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method1313(var4, var5);
			this.method1308(var1, var2 - this.method1292(var1) / 2, var3);
		}
	}

	public int method1291(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method1300(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	public int method1300(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.method1313(var6, var7);
			field2079 = var8;
			if (var11 == 0) {
				var11 = this.field2066;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.field2070 + this.field2071 + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.method1293(var1, var12, field2072);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.field2070;
			} else if (var10 == 1) {
				var14 = var3 + this.field2070 + (var5 - this.field2070 - this.field2071 - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.field2071 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field2070 - this.field2071 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.field2070 + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method1308(field2072[var15], var2, var14);
				} else if (var9 == 1) {
					this.method1308(field2072[var15], var2 + (var4 - this.method1292(field2072[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method1308(field2072[var15], var2 + var4 - this.method1292(field2072[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.method1308(field2072[var15], var2, var14);
				} else {
					this.method1307(field2072[var15], var4);
					this.method1308(field2072[var15], var2, var14);
					field2080 = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	public class180 method1301(class506 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method2433()) {
			this.method1313(var4, var5);
			var3 -= this.field2066;

			for (int var7 = 0; var7 < var1.method2434(); ++var7) {
				class472 var8 = var1.method2436(var7);
				if (var6 != -1 && var8.field4027 > var6) {
					return new class180(var8.field4024, var8.field4027);
				}

				char var9 = var8.field4025;
				if (var9 != '\n') {
					if (var1.method2439(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field4024;
						int var11 = var3 + var8.field4027;
						int var12 = this.field2065[var9];
						int var13 = this.field2083[var9];
						if (field2076 != -1) {
							this.method1289(this.field2081[var9], var10 + this.field2067[var9] + 1, var11 + this.field2068[var9] + 1, var12, var13, field2076);
						}

						this.method1289(this.field2081[var9], var10 + this.field2067[var9], var11 + this.field2068[var9], var12, var13, field2078);
					}
				}
			}
		}

		return var1.method2438();
	}

	public void method1314(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method1313(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method1304(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method1288(var1, var2 - this.method1292(var1) / 2, var3, var8, (int[])null, var9);
		}
	}

	public void method1302(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method1313(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method1304(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method1288(var1, var2 - this.method1292(var1) / 2, var3, var8, var9, var10);
		}
	}

	public void method1316(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.method1313(var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method1304(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
			}

			this.method1288(var1, var2 - this.method1292(var1) / 2, var3, var9, (int[])null, var12);
		}
	}

	public void method1303(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method1313(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method1304(var6, var1.length());
			}

			this.method1288(var1, var2 - this.method1292(var1) / 2, var3, var7, (int[])null, (int[])null);
		}
	}

	public void method1317(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method1313(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method1304(var6, var1.length());
			}

			this.method1288(var1, var2, var3, var7, (int[])null, (int[])null);
		}
	}

	int[] method1304(int[] var1, int var2) {
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

	public void method1318(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method1313(var4, var5);
			field2082.setSeed((long)var6);
			field2079 = 192 + (field2082.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field2082.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method1288(var1, var2, var3, (int[])null, var7, (int[])null);
		}
	}

	void method1313(int var1, int var2) {
		field2063 = -1;
		field2074 = -1;
		field2075 = var2;
		field2076 = var2;
		field2077 = var1;
		field2078 = var1;
		field2079 = 256;
		field2080 = 0;
		field2064 = 0;
	}

	void method1306(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = class492.method2408(var3, 16, true);
				field2078 = var2;
			} else if (var1.equals("/col")) {
				field2078 = field2077;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = class492.method2408(var3, 16, true);
				field2063 = var2;
			} else if (var1.equals("str")) {
				field2063 = 8388608;
			} else if (var1.equals("/str")) {
				field2063 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = class492.method2408(var3, 16, true);
				field2074 = var2;
			} else if (var1.equals("u")) {
				field2074 = 0;
			} else if (var1.equals("/u")) {
				field2074 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = class492.method2408(var3, 16, true);
				field2076 = var2;
			} else if (var1.equals("shad")) {
				field2076 = 0;
			} else if (var1.equals("/shad")) {
				field2076 = field2075;
			} else if (var1.equals("br")) {
				this.method1313(field2077, field2075);
			}
		} catch (Exception var4) {
		}

	}

	void method1307(String var1, int var2) {
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
			field2080 = (var2 - this.method1292(var1) << 8) / var3;
		}

	}

	void method1308(String var1, int var2, int var3) {
		var3 -= this.field2066;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class435.method2206(var1.charAt(var6)) & 255);
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
										var9 = class177.method1005(var8.substring(4));
										class25 var13 = field2062[var9];
										var13.method207(var2, var3 + this.field2066 - var13.field454);
										var2 += var13.field449;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method1306(var8);
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
						if (this.field2073 != null && var5 != -1) {
							var2 += this.field2073[(var5 << 8) + var7];
						}

						int var12 = this.field2065[var7];
						var9 = this.field2083[var7];
						if (var7 != ' ') {
							if (field2079 == 256) {
								if (field2076 != -1) {
									method1319(this.field2081[var7], var2 + this.field2067[var7] + 1, var3 + this.field2068[var7] + 1, var12, var9, field2076);
								}

								this.method1289(this.field2081[var7], var2 + this.field2067[var7], var3 + this.field2068[var7], var12, var9, field2078);
							} else {
								if (field2076 != -1) {
									method1311(this.field2081[var7], var2 + this.field2067[var7] + 1, var3 + this.field2068[var7] + 1, var12, var9, field2076, field2079);
								}

								this.method1309(this.field2081[var7], var2 + this.field2067[var7], var3 + this.field2068[var7], var12, var9, field2078, field2079);
							}
						} else if (field2080 > 0) {
							field2064 += field2080;
							var2 += field2064 >> 8;
							field2064 &= 255;
						}

						int var10 = this.field2069[var7];
						if (field2063 != -1) {
							method1559(var2, var3 + (int)((double)this.field2066 * 0.7D), var10, field2063);
						}

						if (field2074 != -1) {
							method1559(var2, var3 + this.field2066 + 1, var10, field2074);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	void method1288(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.field2066;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(class435.method2206(var1.charAt(var10)) & 255);
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
										var15 = class177.method1005(var12.substring(4));
										class25 var20 = field2062[var15];
										var20.method207(var2 + var13, var3 + this.field2066 - var20.field454 + var14);
										var2 += var20.field449;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.method1306(var12);
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
						if (this.field2073 != null && var8 != -1) {
							var2 += this.field2073[(var8 << 8) + var11];
						}

						int var19 = this.field2065[var11];
						var13 = this.field2083[var11];
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
							var16 = field2078;
						}

						++var9;
						if (var11 != ' ') {
							if (field2079 == 256) {
								if (field2076 != -1) {
									method1319(this.field2081[var11], var2 + this.field2067[var11] + 1 + var14, var3 + this.field2068[var11] + 1 + var15, var19, var13, field2076);
								}

								this.method1289(this.field2081[var11], var2 + this.field2067[var11] + var14, var3 + this.field2068[var11] + var15, var19, var13, var16);
							} else {
								if (field2076 != -1) {
									method1311(this.field2081[var11], var2 + this.field2067[var11] + 1 + var14, var3 + this.field2068[var11] + 1 + var15, var19, var13, field2076, field2079);
								}

								this.method1309(this.field2081[var11], var2 + this.field2067[var11] + var14, var3 + this.field2068[var11] + var15, var19, var13, var16, field2079);
							}
						} else if (field2080 > 0) {
							field2064 += field2080;
							var2 += field2064 >> 8;
							field2064 &= 255;
						}

						int var17 = this.field2069[var11];
						if (field2063 != -1) {
							method1559(var2, var3 + (int)((double)this.field2066 * 0.7D), var17, field2063);
						}

						if (field2074 != -1) {
							method1559(var2, var3 + this.field2066, var17, field2074);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}

	}

	static int method1290(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

	public static String method1305(String var0) {
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

	static void method1319(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class266.field2404;
		int var7 = class266.field2404 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class266.field2410) {
			var10 = class266.field2410 - var2;
			var4 -= var10;
			var2 = class266.field2410;
			var9 += var10 * var3;
			var6 += var10 * class266.field2404;
		}

		if (var2 + var4 > class266.field2408) {
			var4 -= var2 + var4 - class266.field2408;
		}

		if (var1 < class266.field2409) {
			var10 = class266.field2409 - var1;
			var3 -= var10;
			var1 = class266.field2409;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var1 + var3 > class266.field2403) {
			var10 = var1 + var3 - class266.field2403;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method1310(class266.field2406, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	static void method1310(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	static void method1311(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class266.field2404;
		int var8 = class266.field2404 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class266.field2410) {
			var11 = class266.field2410 - var2;
			var4 -= var11;
			var2 = class266.field2410;
			var10 += var11 * var3;
			var7 += var11 * class266.field2404;
		}

		if (var2 + var4 > class266.field2408) {
			var4 -= var2 + var4 - class266.field2408;
		}

		if (var1 < class266.field2409) {
			var11 = class266.field2409 - var1;
			var3 -= var11;
			var1 = class266.field2409;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var1 + var3 > class266.field2403) {
			var11 = var1 + var3 - class266.field2403;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method1312(class266.field2406, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	static void method1312(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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
