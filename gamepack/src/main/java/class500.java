import java.util.Random;

public abstract class class500 extends class206 {

	public static class214[] field4001;

	static int field4002;

	static int field4003;

	static int field4013;

	static int field4014;

	static int field4015;

	static int field4016;

	static int field4017;

	static int field4018;

	static int field4019;

	static String[] field4011;

	static Random field4021;

	byte[] field4012;

	byte[][] field4020;

	int[] field4004;

	int[] field4006;

	int[] field4007;

	int[] field4008;

	int[] field4022;

	public int field4005;

	public int field4009;

	public int field4010;

	static {
		field4002 = -1;
		field4013 = -1;
		field4014 = -1;
		field4015 = -1;
		field4016 = 0;
		field4017 = 0;
		field4018 = 256;
		field4019 = 0;
		field4003 = 0;
		field4021 = new Random();
		field4011 = new String[100];
	}

	class500(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field4020 = new byte[256][];
		this.field4005 = 0;
		this.field4006 = var2;
		this.field4007 = var3;
		this.field4004 = var4;
		this.field4022 = var5;
		this.method2389(var1);
		this.field4020 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field4007[var10] < var8 && this.field4022[var10] != 0) {
				var8 = this.field4007[var10];
			}
			if (this.field4007[var10] + this.field4022[var10] > var9) {
				var9 = this.field4007[var10] + this.field4022[var10];
			}
		}
		this.field4009 = this.field4005 - var8;
		this.field4010 = var9 - this.field4005;
	}

	class500(byte[] var1) {
		this.field4020 = new byte[256][];
		this.field4005 = 0;
		this.method2389(var1);
	}

	abstract void method2383(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	abstract void method2403(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	void method2389(byte[] var1) {
		this.field4008 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field4008.length; ++var2) {
				this.field4008[var2] = var1[var2] & 255;
			}
			this.field4005 = var1[256] & 255;
		} else {
			var2 = 0;
			for (int var3 = 0; var3 < 256; ++var3) {
				this.field4008[var3] = var1[var2++] & 255;
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
			this.field4012 = new byte[65536];
			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field4012[(var13 << 8) + var8] = (byte) method2384(var11, var12, var4, this.field4008, var10, var13, var8);
						}
					}
				}
			}
			this.field4005 = var4[32] + var10[32];
		}
	}

	public int method2415(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}
		return this.field4008[class111.method674(var1) & 255];
	}

	public int method2386(String var1) {
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
										int var8 = class514.method2470(var7.substring(4));
										var4 += field4001[var8].field1939;
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
						var4 += this.field4008[(char) (class111.method674(var6) & 255)];
						if (this.field4012 != null && var3 != -1) {
							var4 += this.field4012[(var3 << 8) + var6];
						}
						var3 = var6;
					}
				}
			}
			return var4;
		}
	}

	public int method2387(String var1, int[] var2, String[] var3) {
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
							var4 += this.method2415('<');
							if (this.field4012 != null && var11 != -1) {
								var4 += this.field4012[(var11 << '\b') + 60];
							}
							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method2415('>');
							if (this.field4012 != null && var11 != -1) {
								var4 += this.field4012[(var11 << '\b') + 62];
							}
							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class514.method2470(var16.substring(4));
								var4 += field4001[var17].field1939;
								var11 = 0;
							} catch (Exception var18) {
							}
						}
						var15 = 0;
					}
					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method2415(var15);
							if (this.field4012 != null && var11 != -1) {
								var4 += this.field4012[(var11 << '\b') + var15];
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

	public int method2409(String var1, int var2) {
		int var3 = this.method2387(var1, new int[] { var2 }, field4011);
		int var4 = 0;
		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method2386(field4011[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}
		return var4;
	}

	public int method2388(String var1, int var2) {
		return this.method2387(var1, new int[] { var2 }, field4011);
	}

	public class166 method2390(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method2386(var3) / 2;
			var6 += this.method2386(var3.substring(0, var1));
			int var7 = var5 - this.field4009;
			int var8 = this.method2386(var3.substring(var1, var1 + var2));
			int var9 = this.field4009 + this.field4010;
			return new class166(var6, var7, var8, var9);
		} else {
			return new class166(var4, var5, 0, 0);
		}
	}

	public void method2414(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method2407(var4, var5);
			this.method2402(var1, var2, var3);
		}
	}

	public void method2391(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method2407(var4, 0);
			field4018 = var6;
			this.method2402(var1, var2, var3);
		}
	}

	public void method2392(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method2407(var4, -1);
			this.method2402(var1, var2 - this.method2386(var1), var3);
		}
	}

	public void method2393(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method2407(var4, var5);
			this.method2402(var1, var2 - this.method2386(var1) / 2, var3);
		}
	}

	public int method2385(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method2394(var1, var2, var3, var4, var5, var6, var7, 256, 1, var9, var10);
	}

	public int method2394(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}
			this.method2407(var6, var7);
			field4018 = var8;
			if (var11 == 0) {
				var11 = this.field4005;
			}
			int[] var12 = new int[] { var4 };
			if (var5 < this.field4009 + this.field4010 + var11 && var5 < var11 + var11) {
				var12 = null;
			}
			int var13 = this.method2387(var1, var12, field4011);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}
			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.field4009;
			} else if (var10 == 1) {
				var14 = var3 + this.field4009 + (var5 - this.field4009 - this.field4010 - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.field4010 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field4009 - this.field4010 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}
				var14 = var3 + this.field4009 + var15;
				var11 += var15;
			}
			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method2402(field4011[var15], var2, var14);
				} else if (var9 == 1) {
					this.method2402(field4011[var15], var2 + (var4 - this.method2386(field4011[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method2402(field4011[var15], var2 + var4 - this.method2386(field4011[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.method2402(field4011[var15], var2, var14);
				} else {
					this.method2401(field4011[var15], var4);
					this.method2402(field4011[var15], var2, var14);
					field4019 = 0;
				}
				var14 += var11;
			}
			return var13;
		}
	}

	public class59 method2395(class200 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method1211()) {
			this.method2407(var4, var5);
			var3 -= this.field4005;
			for (int var7 = 0; var7 < var1.method1212(); ++var7) {
				class201 var8 = var1.method1214(var7);
				char var9 = var8.field1887;
				if (var9 != '\n') {
					if (var1.method1217(var7)) {
						var9 = '*';
					}
					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}
						int var10 = var2 + var8.field1886;
						int var11 = var3 + var8.field1889;
						int var12 = this.field4004[var9];
						int var13 = this.field4022[var9];
						if (field4015 != -1) {
							this.method2383(this.field4020[var9], var10 + this.field4006[var9] + 1, var11 + this.field4007[var9] + 1, var12, var13, field4015);
						}
						this.method2383(this.field4020[var9], var10 + this.field4006[var9], var11 + this.field4007[var9], var12, var13, field4017);
					}
				}
			}
		}
		return var1.method1216();
	}

	public void method2408(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method2407(var4, 0);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method2398(var7, var1.length());
			}
			int[] var9 = new int[var1.length()];
			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int) (Math.sin((double) var10 / 2.0D + (double) var6 / 5.0D) * 5.0D);
			}
			this.method2382(var1, var2 - this.method2386(var1) / 2, var3, var8, (int[]) null, var9);
		}
	}

	public void method2396(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method2407(var4, 0);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method2398(var7, var1.length());
			}
			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];
			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int) (Math.sin((double) var11 / 5.0D + (double) var6 / 5.0D) * 5.0D);
				var10[var11] = (int) (Math.sin((double) var11 / 3.0D + (double) var6 / 5.0D) * 5.0D);
			}
			this.method2382(var1, var2 - this.method2386(var1) / 2, var3, var8, var9, var10);
		}
	}

	public void method2410(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.method2407(var4, 0);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method2398(var8, var1.length());
			}
			double var10 = 7.0D - (double) var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}
			int[] var12 = new int[var1.length()];
			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) var6 / 1.0D) * var10);
			}
			this.method2382(var1, var2 - this.method2386(var1) / 2, var3, var9, (int[]) null, var12);
		}
	}

	public void method2397(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method2407(var4, 0);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method2398(var6, var1.length());
			}
			this.method2382(var1, var2 - this.method2386(var1) / 2, var3, var7, (int[]) null, (int[]) null);
		}
	}

	public void method2411(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method2407(var4, 0);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method2398(var6, var1.length());
			}
			this.method2382(var1, var2, var3, var7, (int[]) null, (int[]) null);
		}
	}

	int[] method2398(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float) var1.length / (float) var2;
			for (int var5 = 0; var5 < var2; ++var5) {
				var3[var5] = var1[(int) ((float) var5 * var4)];
			}
			return var3;
		}
	}

	public void method2412(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method2407(16777215, 0);
			field4021.setSeed((long) var6);
			field4018 = 192 + (field4021.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;
			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field4021.nextInt() & 3) == 0) {
					++var8;
				}
			}
			this.method2382(var1, var2, var3, (int[]) null, var7, (int[]) null);
		}
	}

	void method2407(int var1, int var2) {
		field4002 = -1;
		field4013 = -1;
		field4014 = var2;
		field4015 = var2;
		field4016 = var1;
		field4017 = var1;
		field4018 = 256;
		field4019 = 0;
		field4003 = 0;
	}

	void method2400(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = class514.method2465(var3, 16, true);
				field4017 = var2;
			} else if (var1.equals("/col")) {
				field4017 = field4016;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = class514.method2465(var3, 16, true);
				field4002 = var2;
			} else if (var1.equals("str")) {
				field4002 = 8388608;
			} else if (var1.equals("/str")) {
				field4002 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = class514.method2465(var3, 16, true);
				field4013 = var2;
			} else if (var1.equals("u")) {
				field4013 = 0;
			} else if (var1.equals("/u")) {
				field4013 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = class514.method2465(var3, 16, true);
				field4015 = var2;
			} else if (var1.equals("shad")) {
				field4015 = 0;
			} else if (var1.equals("/shad")) {
				field4015 = field4014;
			} else if (var1.equals("br")) {
				this.method2407(field4016, field4014);
			}
		} catch (Exception var4) {
		}
	}

	void method2401(String var1, int var2) {
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
			field4019 = (var2 - this.method2386(var1) << 8) / var3;
		}
	}

	void method2402(String var1, int var2, int var3) {
		var3 -= this.field4005;
		int var4 = -1;
		int var5 = -1;
		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (class111.method674(var1.charAt(var6)) & 255);
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
										var9 = class514.method2470(var8.substring(4));
										class214 var13 = field4001[var9];
										var13.method1292(var2, var3 + this.field4005 - var13.field1944);
										var2 += var13.field1939;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method2400(var8);
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
						if (this.field4012 != null && var5 != -1) {
							var2 += this.field4012[(var5 << 8) + var7];
						}
						int var12 = this.field4004[var7];
						var9 = this.field4022[var7];
						if (var7 != ' ') {
							if (field4018 == 256) {
								if (field4015 != -1) {
									method2413(this.field4020[var7], var2 + this.field4006[var7] + 1, var3 + this.field4007[var7] + 1, var12, var9, field4015);
								}
								this.method2383(this.field4020[var7], var2 + this.field4006[var7], var3 + this.field4007[var7], var12, var9, field4017);
							} else {
								if (field4015 != -1) {
									method2405(this.field4020[var7], var2 + this.field4006[var7] + 1, var3 + this.field4007[var7] + 1, var12, var9, field4015, field4018);
								}
								this.method2403(this.field4020[var7], var2 + this.field4006[var7], var3 + this.field4007[var7], var12, var9, field4017, field4018);
							}
						} else if (field4019 > 0) {
							field4003 += field4019;
							var2 += field4003 >> 8;
							field4003 &= 255;
						}
						int var10 = this.field4008[var7];
						if (field4002 != -1) {
							method1247(var2, var3 + (int) ((double) this.field4005 * 0.7D), var10, field4002);
						}
						if (field4013 != -1) {
							method1247(var2, var3 + this.field4005 + 1, var10, field4013);
						}
						var2 += var10;
						var5 = var7;
					}
				}
			}
		}
	}

	void method2382(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.field4005;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;
		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char) (class111.method674(var1.charAt(var10)) & 255);
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
										var15 = class514.method2470(var12.substring(4));
										class214 var20 = field4001[var15];
										var20.method1292(var2 + var13, var3 + this.field4005 - var20.field1944 + var14);
										var2 += var20.field1939;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.method2400(var12);
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
						if (this.field4012 != null && var8 != -1) {
							var2 += this.field4012[(var8 << 8) + var11];
						}
						int var19 = this.field4004[var11];
						var13 = this.field4022[var11];
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
							var16 = field4017;
						}
						++var9;
						if (var11 != ' ') {
							if (field4018 == 256) {
								if (field4015 != -1) {
									method2413(this.field4020[var11], var2 + this.field4006[var11] + 1 + var14, var3 + this.field4007[var11] + 1 + var15, var19, var13, field4015);
								}
								this.method2383(this.field4020[var11], var2 + this.field4006[var11] + var14, var3 + this.field4007[var11] + var15, var19, var13, var16);
							} else {
								if (field4015 != -1) {
									method2405(this.field4020[var11], var2 + this.field4006[var11] + 1 + var14, var3 + this.field4007[var11] + 1 + var15, var19, var13, field4015, field4018);
								}
								this.method2403(this.field4020[var11], var2 + this.field4006[var11] + var14, var3 + this.field4007[var11] + var15, var19, var13, var16, field4018);
							}
						} else if (field4019 > 0) {
							field4003 += field4019;
							var2 += field4003 >> 8;
							field4003 &= 255;
						}
						int var17 = this.field4008[var11];
						if (field4002 != -1) {
							method1247(var2, var3 + (int) ((double) this.field4005 * 0.7D), var17, field4002);
						}
						if (field4013 != -1) {
							method1247(var2, var3 + this.field4005, var17, field4013);
						}
						var2 += var17;
						var8 = var11;
					}
				}
			}
		}
	}

	static int method2384(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

	public static String method2399(String var0) {
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

	static void method2413(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class206.field1904;
		int var7 = class206.field1904 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class206.field1910) {
			var10 = class206.field1910 - var2;
			var4 -= var10;
			var2 = class206.field1910;
			var9 = 0 + var10 * var3;
			var6 += var10 * class206.field1904;
		}
		if (var2 + var4 > class206.field1908) {
			var4 -= var2 + var4 - class206.field1908;
		}
		if (var1 < class206.field1909) {
			var10 = class206.field1909 - var1;
			var3 -= var10;
			var1 = class206.field1909;
			var9 += var10;
			var6 += var10;
			var8 = 0 + var10;
			var7 += var10;
		}
		if (var1 + var3 > class206.field1903) {
			var10 = var1 + var3 - class206.field1903;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}
		if (var3 > 0 && var4 > 0) {
			method2404(class206.field1906, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	static void method2404(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	static void method2405(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class206.field1904;
		int var8 = class206.field1904 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class206.field1910) {
			var11 = class206.field1910 - var2;
			var4 -= var11;
			var2 = class206.field1910;
			var10 = 0 + var11 * var3;
			var7 += var11 * class206.field1904;
		}
		if (var2 + var4 > class206.field1908) {
			var4 -= var2 + var4 - class206.field1908;
		}
		if (var1 < class206.field1909) {
			var11 = class206.field1909 - var1;
			var3 -= var11;
			var1 = class206.field1909;
			var10 += var11;
			var7 += var11;
			var9 = 0 + var11;
			var8 += var11;
		}
		if (var1 + var3 > class206.field1903) {
			var11 = var1 + var3 - class206.field1903;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}
		if (var3 > 0 && var4 > 0) {
			method2406(class206.field1906, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	static void method2406(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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
