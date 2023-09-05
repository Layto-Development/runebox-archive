import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "df")
public final class class439 extends class114 {
	@ObfInfo(name = "fy", desc = "Lnk;")
	static class505 field3327;
	@ObfInfo(name = "as", desc = "Z")
	boolean field3316;
	@ObfInfo(name = "aj", desc = "Z")
	boolean field3318;
	@ObfInfo(name = "bk", desc = "Z")
	boolean field3324;
	@ObfInfo(name = "ae", desc = "Lmt;")
	class201 field3299;
	@ObfInfo(name = "au", desc = "Luc;")
	class353 field3315;
	@ObfInfo(name = "ab", desc = "Ljr;")
	class384 field3311;
	@ObfInfo(name = "bj", desc = "Lqp;")
	class486 field3306;
	@ObfInfo(name = "ak", desc = "Lqp;")
	class486 field3321;
	@ObfInfo(name = "bh", desc = "Lqp;")
	class486 field3322;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1857589841)
	int field3298;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 321608603)
	int field3300;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1489130693)
	int field3301;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -508076645)
	int field3303;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 424288465)
	int field3304;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1063419341)
	int field3305;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1376743455)
	int field3307;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1242529467)
	int field3308;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1140943337)
	int field3309;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 595673657)
	int field3310;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1660001619)
	int field3312;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -104687849)
	int field3313;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1122170757)
	int field3314;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1488834411)
	int field3317;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -593127175)
	int field3319;
	@ObfInfo(name = "bv", desc = "I", intMultiplier = -742725475)
	int field3320;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -574807483)
	int field3323;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 1345089973)
	int field3325;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = -1653662435)
	int field3326;
	@ObfInfo(name = "ai", desc = "[Ljava/lang/String;")
	String[] field3302;

	@ObfInfo(name = "<init>", desc = "()V")
	class439() {
		this.field3300 = -1;
		this.field3301 = -1;
		this.field3302 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field3302[var1] = "";
		}

		this.field3304 = 0;
		this.field3312 = 0;
		this.field3307 = 0;
		this.field3317 = 0;
		this.field3316 = false;
		this.field3325 = 0;
		this.field3318 = false;
		this.field3321 = class486.field3958;
		this.field3322 = class486.field3958;
		this.field3306 = class486.field3958;
		this.field3324 = false;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V", opaqueValue = "1924672164")
	final void method2297(class280 var1) {
		var1.field2254 = 0;
		int var3 = var1.method1492();
		boolean var4 = true;
		this.field3300 = var1.method1493();
		this.field3301 = var1.method1493();
		int var5 = -1;
		this.field3325 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method1492();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method1492();
				var6[var7] = var9 + (var8 << 8);
				if (var7 == 0 && var6[0] == 65535) {
					var5 = var1.method1541();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = class270.method1424(var6[var7] - 512).field2211;
					if (var10 != 0) {
						this.field3325 = var10;
					}
				}
			}
		}

		int[] var28 = null;
		if (Client.field209 >= 213) {
			var28 = new int[12];

			for (var8 = 0; var8 < 12; ++var8) {
				var9 = var1.method1492();
				if (var9 == 0) {
					var28[var8] = 0;
				} else {
					var10 = var1.method1492();
					var28[var8] = var10 + (var9 << 8);
				}
			}
		}

		int[] var29 = new int[5];

		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.method1492();
			if (var10 < 0 || var10 >= class142.field1430[var9].length) {
				var10 = 0;
			}

			var29[var9] = var10;
		}

		super.field1037 = var1.method1541();
		if (super.field1037 == 65535) {
			super.field1037 = -1;
		}

		super.field1038 = var1.method1541();
		if (super.field1038 == 65535) {
			super.field1038 = -1;
		}

		super.field1099 = super.field1038;
		super.field1040 = var1.method1541();
		if (super.field1040 == 65535) {
			super.field1040 = -1;
		}

		super.field1041 = var1.method1541();
		if (super.field1041 == 65535) {
			super.field1041 = -1;
		}

		super.field1042 = var1.method1541();
		if (super.field1042 == 65535) {
			super.field1042 = -1;
		}

		super.field1090 = var1.method1541();
		if (super.field1090 == 65535) {
			super.field1090 = -1;
		}

		super.field1101 = var1.method1541();
		if (super.field1101 == 65535) {
			super.field1101 = -1;
		}

		this.field3315 = new class353(var1.method1500(), class67.field769);
		this.method2299();
		this.method2302();
		this.method2311();
		if (this == class126.field1164) {
			class348.field2754 = this.field3315.method1935();
		}

		this.field3304 = var1.method1492();
		this.field3312 = var1.method1541();
		this.field3318 = var1.method1492() == 1;
		if (Client.field52 == 0 && Client.field115 >= 2) {
			this.field3318 = false;
		}

		class146[] var30 = null;
		boolean var31 = false;
		int var11 = var1.method1541();
		var31 = (var11 >> 15 & 1) == 1;
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var30 = new class146[12];

			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					int var17 = var6[var12] - 512;
					int var18 = var1.method1492();
					boolean var19 = (var18 & 1) != 0;
					boolean var20 = (var18 & 2) != 0;
					class146 var21 = new class146(var17);
					int var22;
					int[] var23;
					boolean var24;
					int var25;
					short var26;
					if (var19) {
						var22 = var1.method1492();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = null != var21.field1453 && var23.length == var21.field1453.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.method1541();
								if (var24) {
									var21.field1453[var23[var25]] = var26;
								}
							}
						}
					}

					if (var20) {
						var22 = var1.method1492();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = var21.field1454 != null && var21.field1454.length == var23.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.method1541();
								if (var24) {
									var21.field1454[var23[var25]] = var26;
								}
							}
						}
					}

					var30[var12] = var21;
				}
			}
		}

		for (var12 = 0; var12 < 3; ++var12) {
			this.field3302[var12] = var1.method1500();
		}

		int var27 = var1.method1492();
		if (this.field3299 == null) {
			this.field3299 = new class201();
		}

		this.field3299.method1125(var28, var6, var30, var31, var29, var3, var5, var27);
	}

	@ObfInfo(name = "ao", desc = "(I)Z", opaqueValue = "174523876")
	boolean method2298() {
		if (class486.field3958 == this.field3321) {
			this.method2300();
		}

		return this.field3321 == class486.field3957;
	}

	@ObfInfo(name = "at", desc = "(I)V")
	void method2299() {
		this.field3321 = class486.field3958;
	}

	@ObfInfo(name = "az", desc = "(I)V", opaqueValue = "-1885104280")
	void method2300() {
		this.field3321 = class331.field2633.method320(this.field3315) ? class486.field3957 : class486.field3956;
	}

	@ObfInfo(name = "ap", desc = "(I)Z", opaqueValue = "-673061780")
	boolean method2301() {
		if (class486.field3958 == this.field3322) {
			this.method2305();
		}

		return class486.field3957 == this.field3322;
	}

	@ObfInfo(name = "aa", desc = "(I)V")
	void method2302() {
		this.field3322 = class486.field3958;
	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "481268550")
	void method2305() {
		this.field3322 = null != class54.field716 && class54.field716.method900(this.field3315) ? class486.field3957 : class486.field3956;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaqueValue = "22110243")
	void method2304() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (Client.field271[var2] != null && Client.field271[var2].method1595(this.field3315.method1935()) != -1 && var2 != 2) {
				this.field3306 = class486.field3957;
				return;
			}
		}

		this.field3306 = class486.field3956;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	void method2311() {
		this.field3306 = class486.field3958;
	}

	@ObfInfo(name = "al", desc = "(I)Z", opaqueValue = "-467405701")
	boolean method2308() {
		if (this.field3306 == class486.field3958) {
			this.method2304();
		}

		return this.field3306 == class486.field3957;
	}

	@ObfInfo(name = "an", desc = "(I)I", opaqueValue = "1461387412")
	int method2303() {
		return null != this.field3299 && this.field3299.field1815 != -1 ? class395.method2109(this.field3299.field1815).field3057 : 1;
	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;", opaqueValue = "-425402190")
	protected final class384 method2515() {
		if (null == this.field3299) {
			return null;
		} else {
			class202 var2 = super.field1076 != -1 && super.field1093 == 0 ? class202.method1149(super.field1076) : null;
			class202 var3 = super.field1044 != -1 && !this.field3316 && (super.field1037 != super.field1044 || var2 == null) ? class202.method1149(super.field1044) : null;
			class384 var4 = this.field3299.method1136(var2, super.field1077, var3, super.field1031);
			if (null == var4) {
				return null;
			} else {
				var4.method2045();
				super.field1091 = var4.field4095;
				int var5 = var4.field2957;
				if (!this.field3316) {
					var4 = this.method639(var4);
				}

				if (!this.field3316 && this.field3311 != null) {
					if (Client.field330 >= this.field3317) {
						this.field3311 = null;
					}

					if (Client.field330 >= this.field3307 && Client.field330 < this.field3317) {
						class384 var6 = this.field3311;
						var6.method2046(this.field3308 - super.field1061, this.field3309 - this.field3305, this.field3310 - super.field1032);
						if (super.field1072 == 512) {
							var6.method2055();
							var6.method2055();
							var6.method2055();
						} else if (super.field1072 == 1024) {
							var6.method2055();
							var6.method2055();
						} else if (super.field1072 == 1536) {
							var6.method2055();
						}

						class384[] var7 = new class384[]{var4, var6};
						var4 = new class384(var7, 2);
						if (super.field1072 == 512) {
							var6.method2055();
						} else if (super.field1072 == 1024) {
							var6.method2055();
							var6.method2055();
						} else if (super.field1072 == 1536) {
							var6.method2055();
							var6.method2055();
							var6.method2055();
						}

						var6.method2046(super.field1061 - this.field3308, this.field3305 - this.field3309, super.field1032 - this.field3310);
					}
				}

				var4.field2958 = true;
				if (super.field1084 != 0 && Client.field330 >= super.field1092 && Client.field330 < super.field1034) {
					var4.field3013 = super.field1094;
					var4.field2983 = super.field1052;
					var4.field2981 = super.field1046;
					var4.field3019 = super.field1084;
					var4.field3020 = (short)var5;
				} else {
					var4.field3019 = 0;
				}

				return var4;
			}
		}
	}

	@ObfInfo(name = "ar", desc = "(IILin;I)V", opaqueValue = "-1206182432")
	final void method2310(int var1, int var2, class386 var3) {
		if (super.field1076 != -1 && class202.method1149(super.field1076).field1853 == 1) {
			super.field1076 = -1;
		}

		this.method643();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.field1106[0] >= 0 && super.field1106[0] < 104 && super.field1103[0] >= 0 && super.field1103[0] < 104) {
				if (class386.field3026 == var3) {
					class439 var5 = this;
					class386 var6 = class386.field3026;
					int var7 = super.field1106[0];
					int var8 = super.field1103[0];
					int var9 = this.method2303();
					if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
						int var11 = this.method2303();
						class342 var12 = Client.method241(var1, var2);
						class77 var13 = Client.field102[this.field3319];
						int[] var14 = Client.field328;
						int[] var15 = Client.field329;
						int var10 = class469.method2409(var7, var8, var11, var12, var13, true, var14, var15, class469.field3786[0]);
						int var16 = var10;
						if (var10 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; ++var17) {
								var5.method2309(Client.field328[var17], Client.field329[var17], var6);
							}
						}
					}
				}

				this.method2309(var1, var2, var3);
			} else {
				this.method2307(var1, var2);
			}
		} else {
			this.method2307(var1, var2);
		}

	}

	@ObfInfo(name = "ab", desc = "(III)V")
	void method2307(int var1, int var2) {
		super.field1079 = 0;
		super.field1095 = 0;
		super.field1105 = 0;
		super.field1106[0] = var1;
		super.field1103[0] = var2;
		int var4 = this.method2303();
		super.field1061 = 128 * super.field1106[0] + var4 * 64;
		super.field1032 = 128 * super.field1103[0] + var4 * 64;
	}

	@ObfInfo(name = "ag", desc = "(IILin;I)V", opaqueValue = "-2005319024")
	final void method2309(int var1, int var2, class386 var3) {
		if (super.field1079 < 9) {
			++super.field1079;
		}

		for (int var5 = super.field1079; var5 > 0; --var5) {
			super.field1106[var5] = super.field1106[var5 - 1];
			super.field1103[var5] = super.field1103[var5 - 1];
			super.field1104[var5] = super.field1104[var5 - 1];
		}

		super.field1106[0] = var1;
		super.field1103[0] = var2;
		super.field1104[0] = var3;
	}

	@ObfInfo(name = "am", desc = "(I)Z", opaqueValue = "381940201")
	final boolean method634() {
		return null != this.field3299;
	}
}
