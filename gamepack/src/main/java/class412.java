import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dx")
public final class class412 extends class114 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1282067951)
	static int field3177;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -643167983)
	static int field3184;
	@ObfInfo(name = "ac", desc = "Ltw;")
	class30 field3180;
	@ObfInfo(name = "au", desc = "Lhw;")
	class395 field3178;
	@ObfInfo(name = "ai", desc = "Lhq;")
	class451 field3182;
	@ObfInfo(name = "ap", desc = "Lhq;")
	class451 field3183;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -111138695)
	int field3179;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field3181;

	static {
		field3177 = 1;
		field3184 = 1;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class412() {
		this.field3181 = "";
		this.field3179 = 31;
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;I)V", opaqueValue = "-1395098279")
	void method2168(String var1) {
		this.field3181 = null == var1 ? "" : var1;
	}

	@ObfInfo(name = "ao", desc = "(II)V")
	void method2169(int var1) {
		this.field3179 = var1;
	}

	@ObfInfo(name = "at", desc = "(II)Z", opaqueValue = "-1138310481")
	boolean method2170(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field3179 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "az", desc = "(I)Ljava/lang/String;", opaqueValue = "1873768040")
	final String method2171() {
		if (!this.field3181.isEmpty()) {
			return this.field3181;
		} else {
			class395 var2 = this.field3178;
			if (var2.field3084 != null) {
				var2 = var2.method2099();
				if (null == var2) {
					var2 = this.field3178;
				}
			}

			return var2.field3056;
		}
	}

	@ObfInfo(name = "ap", desc = "(ILin;I)V", opaqueValue = "1251650837")
	final void method2172(int var1, class386 var2) {
		int var4 = super.field1106[0];
		int var5 = super.field1103[0];
		if (var1 == 0) {
			--var4;
			++var5;
		}

		if (var1 == 1) {
			++var5;
		}

		if (var1 == 2) {
			++var4;
			++var5;
		}

		if (var1 == 3) {
			--var4;
		}

		if (var1 == 4) {
			++var4;
		}

		if (var1 == 5) {
			--var4;
			--var5;
		}

		if (var1 == 6) {
			--var5;
		}

		if (var1 == 7) {
			++var4;
			--var5;
		}

		if (super.field1076 != -1 && class202.method1149(super.field1076).field1853 == 1) {
			super.field1076 = -1;
		}

		if (super.field1079 < 9) {
			++super.field1079;
		}

		for (int var6 = super.field1079; var6 > 0; --var6) {
			super.field1106[var6] = super.field1106[var6 - 1];
			super.field1103[var6] = super.field1103[var6 - 1];
			super.field1104[var6] = super.field1104[var6 - 1];
		}

		super.field1106[0] = var4;
		super.field1103[0] = var5;
		super.field1104[0] = var2;
	}

	@ObfInfo(name = "aa", desc = "(IIZI)V", opaqueValue = "-2052904938")
	final void method2173(int var1, int var2, boolean var3) {
		if (super.field1076 != -1 && class202.method1149(super.field1076).field1853 == 1) {
			super.field1076 = -1;
		}

		if (!var3) {
			int var5 = var1 - super.field1106[0];
			int var6 = var2 - super.field1103[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (super.field1079 < 9) {
					++super.field1079;
				}

				for (int var7 = super.field1079; var7 > 0; --var7) {
					super.field1106[var7] = super.field1106[var7 - 1];
					super.field1103[var7] = super.field1103[var7 - 1];
					super.field1104[var7] = super.field1104[var7 - 1];
				}

				super.field1106[0] = var1;
				super.field1103[0] = var2;
				super.field1104[0] = class386.field3029;
				return;
			}
		}

		super.field1079 = 0;
		super.field1095 = 0;
		super.field1105 = 0;
		super.field1106[0] = var1;
		super.field1103[0] = var2;
		super.field1061 = super.field1035 * 64 + 128 * super.field1106[0];
		super.field1032 = super.field1103[0] * 128 + super.field1035 * 64;
	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;", opaqueValue = "-425402190")
	protected final class384 method2515() {
		if (this.field3178 == null) {
			return null;
		} else {
			class202 var2 = super.field1076 != -1 && super.field1093 == 0 ? class202.method1149(super.field1076) : null;
			class202 var3 = super.field1044 != -1 && (super.field1037 != super.field1044 || var2 == null) ? class202.method1149(super.field1044) : null;
			class384 var4 = null;
			if (this.field3182 != null && this.field3182.field3394) {
				var4 = class126.field1164.field3299.method1136(var2, super.field1077, var3, super.field1031);
			} else {
				var4 = this.field3178.method2097(var2, super.field1077, var3, super.field1031, this.field3182);
			}

			if (null == var4) {
				return null;
			} else {
				var4.method2045();
				super.field1091 = var4.field4095;
				int var5 = var4.field2957;
				var4 = this.method639(var4);
				if (this.field3178.field3057 == 1) {
					var4.field2958 = true;
				}

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

	@ObfInfo(name = "am", desc = "(I)Z", opaqueValue = "381940201")
	final boolean method634() {
		return null != this.field3178;
	}

	@ObfInfo(name = "af", desc = "(I)[I", opaqueValue = "1630971503")
	int[] method2175() {
		return null != this.field3180 ? this.field3180.method414() : this.field3178.method2102();
	}

	@ObfInfo(name = "ad", desc = "(S)[S", opaqueValue = "201")
	short[] method2182() {
		return this.field3180 != null ? this.field3180.method415() : this.field3178.method2104();
	}

	@ObfInfo(name = "aq", desc = "(IISI)V", opaqueValue = "-1331637163")
	void method2185(int var1, int var2, short var3) {
		if (this.field3180 == null) {
			this.field3180 = new class30(this.field3178);
		}

		this.field3180.method416(var1, var2, var3);
	}

	@ObfInfo(name = "al", desc = "([I[SI)V", opaqueValue = "-943406318")
	void method2176(int[] var1, short[] var2) {
		if (null == this.field3180) {
			this.field3180 = new class30(this.field3178);
		}

		this.field3180.method417(var1, var2);
	}

	@ObfInfo(name = "an", desc = "(I)V")
	void method2177() {
		this.field3180 = null;
	}

	@ObfInfo(name = "ar", desc = "(Lhq;I)V")
	void method2183(class451 var1) {
		this.field3183 = var1;
	}

	@ObfInfo(name = "ab", desc = "(I)Lhq;")
	class451 method2179() {
		return this.field3183;
	}

	@ObfInfo(name = "ag", desc = "(Lhq;B)V")
	void method2180(class451 var1) {
		this.field3182 = var1;
	}

	@ObfInfo(name = "ax", desc = "(I)V")
	void method2178() {
		this.field3183 = null;
	}

	@ObfInfo(name = "ah", desc = "(B)V")
	void method2181() {
		this.field3182 = null;
	}

	@ObfInfo(name = "ae", desc = "(Ldy;IIB)V", opaqueValue = "-1")
	static void method2184(class20 var0, int var1, int var2) {
		Object[] var4 = var0.field380;
		class333 var5;
		if (class344.method1882(var0.field384)) {
			class151.field1466 = (class68)var4[0];
			class185 var6 = class185.method1044(class151.field1466.field773);
			var5 = class333.method1819(var0.field384, var6.field1674, var6.field1688);
		} else {
			int var7 = (Integer)var4[0];
			var5 = class333.method1816(var7);
		}

		if (var5 != null) {
			class175.method991(var0, var5, var1, var2);
		}

	}
}
