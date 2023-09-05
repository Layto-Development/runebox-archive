import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "ib")
public class class202 extends class180 {
	@ObfInfo(name = "aa", desc = "Lle;")
	public static class7 field1833;
	@ObfInfo(name = "af", desc = "Lle;")
	public static class7 field1841;
	@ObfInfo(name = "ap", desc = "Lle;")
	public static class7 field1842;
	@ObfInfo(name = "au", desc = "Z")
	static boolean field1831;
	@ObfInfo(name = "as", desc = "[Z")
	boolean[] field1836;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -2133181577)
	int field1837;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1905371671)
	int field1838;
	@ObfInfo(name = "ab", desc = "[I")
	int[] field1840;
	@ObfInfo(name = "ah", desc = "[I")
	int[] field1845;
	@ObfInfo(name = "ay", desc = "Z")
	public boolean field1846;
	@ObfInfo(name = "bh", desc = "Z")
	public boolean field1851;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -2102587695)
	public int field1832;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 124948705)
	public int field1835;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -544230683)
	public int field1843;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1817971347)
	public int field1844;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1577193721)
	public int field1847;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1203670721)
	public int field1849;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = -857247231)
	public int field1852;
	@ObfInfo(name = "bk", desc = "I", intMultiplier = -92873933)
	public int field1853;
	@ObfInfo(name = "bv", desc = "I", intMultiplier = 117564031)
	public int field1854;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field1834;
	@ObfInfo(name = "ar", desc = "[I")
	public int[] field1839;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field1850;
	@ObfInfo(name = "aq", desc = "Ljava/util/Map;")
	public Map field1848;

	static {
		field1831 = false;
		field1842 = new class7(64);
		field1833 = new class7(100);
		field1841 = new class7(100);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class202() {
		this.field1835 = -1;
		this.field1837 = 0;
		this.field1838 = 0;
		this.field1843 = -1;
		this.field1846 = false;
		this.field1847 = 5;
		this.field1844 = -1;
		this.field1849 = -1;
		this.field1832 = 99;
		this.field1851 = false;
		this.field1852 = -1;
		this.field1853 = -1;
		this.field1854 = 2;
	}

	@ObfInfo(name = "ao", desc = "(Ltm;I)V", opaqueValue = "814951374")
	void method1137(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method1138(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;II)V", opaqueValue = "-998572107")
	void method1138(class280 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method1541();
			this.field1850 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1850[var5] = var1.method1541();
			}

			this.field1839 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1839[var5] = var1.method1541();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1839[var5] += var1.method1541() << 16;
			}
		} else if (var2 == 2) {
			this.field1843 = var1.method1541();
		} else if (var2 == 3) {
			var4 = var1.method1492();
			this.field1845 = new int[var4 + 1];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1845[var5] = var1.method1492();
			}

			this.field1845[var4] = 9999999;
		} else if (var2 == 4) {
			this.field1846 = true;
		} else if (var2 == 5) {
			this.field1847 = var1.method1492();
		} else if (var2 == 6) {
			this.field1844 = var1.method1541();
		} else if (var2 == 7) {
			this.field1849 = var1.method1541();
		} else if (var2 == 8) {
			this.field1832 = var1.method1492();
			this.field1851 = true;
		} else if (var2 == 9) {
			this.field1852 = var1.method1492();
		} else if (var2 == 10) {
			this.field1853 = var1.method1492();
		} else if (var2 == 11) {
			this.field1854 = var1.method1492();
		} else if (var2 == 12) {
			var4 = var1.method1492();
			this.field1840 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1840[var5] = var1.method1541();
			}

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1840[var5] += var1.method1541() << 16;
			}
		} else if (var2 == 13) {
			var4 = var1.method1492();
			this.field1834 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1834[var5] = var1.method1548();
			}
		} else if (var2 == 14) {
			this.field1835 = var1.method1496();
		} else if (var2 == 15) {
			var4 = var1.method1541();
			this.field1848 = new HashMap();

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method1541();
				int var7 = var1.method1548();
				this.field1848.put(var6, var7);
			}
		} else if (var2 == 16) {
			this.field1837 = var1.method1541();
			this.field1838 = var1.method1541();
		} else if (var2 == 17) {
			this.field1836 = new boolean[256];

			for (var4 = 0; var4 < this.field1836.length; ++var4) {
				this.field1836[var4] = false;
			}

			var4 = var1.method1492();

			for (var5 = 0; var5 < var4; ++var5) {
				this.field1836[var1.method1492()] = true;
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(I)V", opaqueValue = "968421208")
	void method1147() {
		if (this.field1852 == -1) {
			if (this.field1845 == null && null == this.field1836) {
				this.field1852 = 0;
			} else {
				this.field1852 = 2;
			}
		}

		if (this.field1853 == -1) {
			if (null == this.field1845 && this.field1836 == null) {
				this.field1853 = 0;
			} else {
				this.field1853 = 2;
			}
		}

	}

	@ObfInfo(name = "ai", desc = "(Ljr;II)Ljr;", opaqueValue = "-2024092599")
	public class384 method1140(class384 var1, int var2) {
		class384 var5;
		if (!this.method1148()) {
			var2 = this.field1839[var2];
			class399 var6 = method1152(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.method2044(true);
			} else {
				var5 = var1.method2044(!var6.method2117(var2));
				var5.method2070(var6, var2);
				return var5;
			}
		} else {
			class89 var4 = method1150(this.field1835);
			if (null == var4) {
				return var1.method2044(true);
			} else {
				var5 = var1.method2044(!var4.method575());
				var5.method2049(var4, var2);
				return var5;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(Ljr;IIB)Ljr;", opaqueValue = "5")
	class384 method1139(class384 var1, int var2, int var3) {
		class384 var6;
		if (!this.method1148()) {
			var2 = this.field1839[var2];
			class399 var7 = method1152(var2 >> 16);
			var2 &= 65535;
			if (null == var7) {
				return var1.method2044(true);
			} else {
				var6 = var1.method2044(!var7.method2117(var2));
				var3 &= 3;
				if (var3 == 1) {
					var6.method2057();
				} else if (var3 == 2) {
					var6.method2056();
				} else if (var3 == 3) {
					var6.method2055();
				}

				var6.method2070(var7, var2);
				if (var3 == 1) {
					var6.method2055();
				} else if (var3 == 2) {
					var6.method2056();
				} else if (var3 == 3) {
					var6.method2057();
				}

				return var6;
			}
		} else {
			class89 var5 = method1150(this.field1835);
			if (null == var5) {
				return var1.method2044(true);
			} else {
				var6 = var1.method2044(!var5.method575());
				var3 &= 3;
				if (var3 == 1) {
					var6.method2057();
				} else if (var3 == 2) {
					var6.method2056();
				} else if (var3 == 3) {
					var6.method2055();
				}

				var6.method2049(var5, var2);
				if (var3 == 1) {
					var6.method2055();
				} else if (var3 == 2) {
					var6.method2056();
				} else if (var3 == 3) {
					var6.method2057();
				}

				return var6;
			}
		}
	}

	@ObfInfo(name = "ap", desc = "(Ljr;II)Ljr;", opaqueValue = "1004485961")
	class384 method1141(class384 var1, int var2) {
		class384 var5;
		if (!this.method1148()) {
			var2 = this.field1839[var2];
			class399 var6 = method1152(var2 >> 16);
			var2 &= 65535;
			if (null == var6) {
				return var1.method2071(true);
			} else {
				var5 = var1.method2071(!var6.method2117(var2));
				var5.method2070(var6, var2);
				return var5;
			}
		} else {
			class89 var4 = method1150(this.field1835);
			if (var4 == null) {
				return var1.method2071(true);
			} else {
				var5 = var1.method2071(!var4.method575());
				var5.method2049(var4, var2);
				return var5;
			}
		}
	}

	@ObfInfo(name = "aa", desc = "(Ljr;ILib;II)Ljr;", opaqueValue = "-587997563")
	public class384 method1142(class384 var1, int var2, class202 var3, int var4) {
		if (field1831 && !this.method1148() && !var3.method1148()) {
			return this.method1143(var1, var2, var3, var4);
		} else {
			class384 var6 = var1.method2044(false);
			boolean var7 = false;
			class399 var8 = null;
			class188 var9 = null;
			class89 var10;
			if (this.method1148()) {
				var10 = this.method1146();
				if (var10 == null) {
					return var6;
				}

				if (var3.method1148() && null == this.field1836) {
					var6.method2049(var10, var2);
					return var6;
				}

				var9 = var10.field890;
				var6.method2052(var9, var10, var2, this.field1836, false, !var3.method1148());
			} else {
				var2 = this.field1839[var2];
				var8 = method1152(var2 >> 16);
				var2 &= 65535;
				if (null == var8) {
					return var3.method1140(var1, var4);
				}

				if (!var3.method1148() && (null == this.field1845 || var4 == -1)) {
					var6.method2070(var8, var2);
					return var6;
				}

				if (null == this.field1845 || var4 == -1) {
					var6.method2070(var8, var2);
					return var6;
				}

				var7 = var3.method1148();
				if (!var7) {
					var6.method2053(var8, var2, this.field1845, false);
				}
			}

			if (var3.method1148()) {
				var10 = var3.method1146();
				if (var10 == null) {
					return var6;
				}

				if (null == var9) {
					var9 = var10.field890;
				}

				var6.method2052(var9, var10, var4, this.field1836, true, true);
			} else {
				var4 = var3.field1839[var4];
				class399 var11 = method1152(var4 >> 16);
				var4 &= 65535;
				if (var11 == null) {
					return this.method1140(var1, var2);
				}

				var6.method2053(var11, var4, this.field1845, true);
			}

			if (var7 && var8 != null) {
				var6.method2053(var8, var2, this.field1845, false);
			}

			var6.method2048();
			return var6;
		}
	}

	@ObfInfo(name = "af", desc = "(Ljr;ILib;II)Ljr;", opaqueValue = "-1623061966")
	class384 method1143(class384 var1, int var2, class202 var3, int var4) {
		var2 = this.field1839[var2];
		class399 var6 = method1152(var2 >> 16);
		var2 &= 65535;
		if (null == var6) {
			return var3.method1140(var1, var4);
		} else {
			var4 = var3.field1839[var4];
			class399 var7 = method1152(var4 >> 16);
			var4 &= 65535;
			class384 var8;
			if (var7 == null) {
				var8 = var1.method2044(!var6.method2117(var2));
				var8.method2070(var6, var2);
				return var8;
			} else {
				var8 = var1.method2044(!var6.method2117(var2) & !var7.method2117(var4));
				var8.method2062(var6, var2, var7, var4, this.field1845);
				return var8;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(Ljr;II)Ljr;", opaqueValue = "-1580674405")
	public class384 method1144(class384 var1, int var2) {
		if (!this.method1148()) {
			int var4 = this.field1839[var2];
			class399 var5 = method1152(var4 >> 16);
			var4 &= 65535;
			if (null == var5) {
				return var1.method2044(true);
			} else {
				class399 var6 = null;
				int var7 = 0;
				if (this.field1840 != null && var2 < this.field1840.length) {
					var7 = this.field1840[var2];
					var6 = method1152(var7 >> 16);
					var7 &= 65535;
				}

				class384 var8;
				if (null != var6 && var7 != 65535) {
					var8 = var1.method2044(!var5.method2117(var4) & !var6.method2117(var7));
					var8.method2070(var5, var4);
					var8.method2070(var6, var7);
					return var8;
				} else {
					var8 = var1.method2044(!var5.method2117(var4));
					var8.method2070(var5, var4);
					return var8;
				}
			}
		} else {
			return this.method1140(var1, var2);
		}
	}

	@ObfInfo(name = "aq", desc = "(I)Z", opaqueValue = "1540707317")
	public boolean method1148() {
		return this.field1835 >= 0;
	}

	@ObfInfo(name = "al", desc = "(I)I")
	public int method1145() {
		return this.field1838 - this.field1837;
	}

	@ObfInfo(name = "ab", desc = "(I)Lfv;", opaqueValue = "-1688405209")
	class89 method1146() {
		return this.method1148() ? method1150(this.field1835) : null;
	}

	@ObfInfo(name = "au", desc = "(Lnu;Lnu;Lnu;I)V")
	public static void method1151(class437 var0, class437 var1, class437 var2) {
		class251.field2088 = var0;
		class29.field470 = var1;
		class165.field1560 = var2;
	}

	@ObfInfo(name = "ae", desc = "(II)Lib;")
	public static class202 method1149(int var0) {
		class202 var2 = (class202)field1842.method294((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class251.field2088.method2267(12, var0);
			var2 = new class202();
			if (var3 != null) {
				var2.method1137(new class280(var3));
			}

			var2.method1147();
			field1842.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "an", desc = "(II)Ljt;")
	static class399 method1152(int var0) {
		class399 var2 = (class399)field1833.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = class399.method2118(class29.field470, class165.field1560, var0, false);
			if (var2 != null) {
				field1833.method293(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfInfo(name = "ag", desc = "(II)Lfv;")
	static class89 method1150(int var0) {
		return class318.method1771(var0, (byte)6) != 0 ? null : class19.method330(var0);
	}
}
