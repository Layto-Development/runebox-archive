import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fs")
public class class214 implements class425 {
	@ObfInfo(name = "wu", desc = "J", longMultiplier = 7705364222102297647L)
	static long field1925;
	@ObfInfo(name = "ae", desc = "Lfs;")
	static final class214 field1906;
	@ObfInfo(name = "ao", desc = "Lfs;")
	static final class214 field1907;
	@ObfInfo(name = "at", desc = "Lfs;")
	static final class214 field1908;
	@ObfInfo(name = "an", desc = "Lfs;")
	static final class214 field1909;
	@ObfInfo(name = "au", desc = "Lfs;")
	static final class214 field1910;
	@ObfInfo(name = "az", desc = "Lfs;")
	static final class214 field1911;
	@ObfInfo(name = "ap", desc = "Lfs;")
	static final class214 field1912;
	@ObfInfo(name = "aq", desc = "Lfs;")
	static final class214 field1913;
	@ObfInfo(name = "ac", desc = "Lfs;")
	static final class214 field1914;
	@ObfInfo(name = "ad", desc = "Lfs;")
	static final class214 field1915;
	@ObfInfo(name = "af", desc = "Lfs;")
	static final class214 field1916;
	@ObfInfo(name = "al", desc = "Lfs;")
	static final class214 field1917;
	@ObfInfo(name = "ar", desc = "Lfs;")
	static final class214 field1918;
	@ObfInfo(name = "ab", desc = "Lfs;")
	static final class214 field1919;
	@ObfInfo(name = "ag", desc = "Lfs;")
	static final class214 field1920;
	@ObfInfo(name = "aa", desc = "Lfs;")
	static final class214 field1922;
	@ObfInfo(name = "ai", desc = "Lfs;")
	static final class214 field1924;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -1043805279)
	final int field1905;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 803648421)
	final int field1921;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1848773117)
	final int field1923;

	static {
		field1910 = new class214(0, 0, (String)null, -1, -1);
		field1906 = new class214(1, 1, (String)null, 0, 2);
		field1907 = new class214(2, 2, (String)null, 1, 2);
		field1908 = new class214(3, 3, (String)null, 2, 2);
		field1914 = new class214(4, 4, (String)null, 3, 1);
		field1924 = new class214(5, 5, (String)null, 4, 1);
		field1911 = new class214(6, 6, (String)null, 5, 1);
		field1912 = new class214(7, 7, (String)null, 6, 3);
		field1922 = new class214(8, 8, (String)null, 7, 3);
		field1916 = new class214(9, 9, (String)null, 8, 3);
		field1915 = new class214(10, 10, (String)null, 0, 7);
		field1913 = new class214(11, 11, (String)null, 1, 7);
		field1917 = new class214(12, 12, (String)null, 2, 7);
		field1909 = new class214(13, 13, (String)null, 3, 7);
		field1918 = new class214(14, 14, (String)null, 4, 7);
		field1919 = new class214(15, 15, (String)null, 5, 7);
		field1920 = new class214(16, 16, (String)null, 0, 5);
	}

	@ObfInfo(name = "<init>", desc = "(IILjava/lang/String;II)V")
	class214(int var1, int var2, String var3, int var4, int var5) {
		this.field1921 = var1;
		this.field1905 = var2;
		this.field1923 = var4;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field1905;
	}

	@ObfInfo(name = "au", desc = "(I)I")
	int method1192() {
		return this.field1923;
	}

	@ObfInfo(name = "ac", desc = "([BIIIIIIIII[Lis;I)V", opaqueValue = "388906105")
	static final void method1193(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class77[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var12 + var2 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field830[var12 + var2];
					var10000[var13 + var3] &= -16777217;
				}
			}
		}

		class280 var20 = new class280(var0);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
						int var16 = var2 + class93.method584(var14 & 7, var15 & 7, var7);
						int var17 = var3 + class93.method586(var14 & 7, var15 & 7, var7);
						int var18 = (var14 & 7) + var2 + var8;
						int var19 = var3 + var9 + (var15 & 7);
						class411.method2154(var20, var1, var16, var17, var18, var19, var7);
					} else {
						class411.method2154(var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}
}
