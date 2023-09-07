public class class259 implements class228 {

	static long field2166;

	static final class259 field2147;

	static final class259 field2148;

	static final class259 field2149;

	static final class259 field2150;

	static final class259 field2151;

	static final class259 field2152;

	static final class259 field2153;

	static final class259 field2154;

	static final class259 field2155;

	static final class259 field2156;

	static final class259 field2157;

	static final class259 field2158;

	static final class259 field2159;

	static final class259 field2160;

	static final class259 field2161;

	static final class259 field2163;

	static final class259 field2165;

	final int field2146;

	final int field2162;

	final int field2164;

	static {
		field2151 = new class259(0, 0, (String) null, -1, -1);
		field2147 = new class259(1, 1, (String) null, 0, 2);
		field2148 = new class259(2, 2, (String) null, 1, 2);
		field2149 = new class259(3, 3, (String) null, 2, 2);
		field2155 = new class259(4, 4, (String) null, 3, 1);
		field2165 = new class259(5, 5, (String) null, 4, 1);
		field2152 = new class259(6, 6, (String) null, 5, 1);
		field2153 = new class259(7, 7, (String) null, 6, 3);
		field2163 = new class259(8, 8, (String) null, 7, 3);
		field2157 = new class259(9, 9, (String) null, 8, 3);
		field2156 = new class259(10, 10, (String) null, 0, 7);
		field2154 = new class259(11, 11, (String) null, 1, 7);
		field2158 = new class259(12, 12, (String) null, 2, 7);
		field2150 = new class259(13, 13, (String) null, 3, 7);
		field2159 = new class259(14, 14, (String) null, 4, 7);
		field2160 = new class259(15, 15, (String) null, 5, 7);
		field2161 = new class259(16, 16, (String) null, 0, 5);
	}

	class259(int var1, int var2, String var3, int var4, int var5) {
		this.field2162 = var1;
		this.field2146 = var2;
		this.field2164 = var4;
	}

	@Override
	public int method1362() {
		return this.field2146;
	}

	int method1458() {
		return this.field2164;
	}

	static final void method1459(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class438[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var12 + var2 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field3436[var12 + var2];
					var10000[var13 + var3] &= -16777217;
				}
			}
		}
		class187 var20 = new class187(var0);
		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
						int var16 = var2 + class215.method1293(var14 & 7, var15 & 7, var7);
						int var17 = var3 + class215.method1295(var14 & 7, var15 & 7, var7);
						int var18 = (var14 & 7) + var2 + var8;
						int var19 = var3 + var9 + (var15 & 7);
						class502.method2422(var20, var1, var16, var17, var18, var19, var7);
					} else {
						class502.method2422(var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}
	}
}
