import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jt")
public class class399 extends class180 {
	@ObfInfo(name = "af", desc = "I", intMultiplier = 166856245)
	static int field3111;
	@ObfInfo(name = "au", desc = "[Lia;")
	class16[] field3112;

	@ObfInfo(name = "<init>", desc = "(Lnu;Lnu;IZ)V")
	class399(class437 var1, class437 var2, int var3, boolean var4) {
		class113 var5 = new class113();
		int var6 = var1.method2293(var3);
		this.field3112 = new class16[var6];
		int[] var7 = var1.method2278(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method2267(var3, var7[var8]);
			class188 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (class188 var12 = (class188)var5.method627(); null != var12; var12 = (class188)var5.method629()) {
				if (var12.field1709 == var11) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.method2275(0, var11);
				} else {
					var13 = var2.method2275(var11, 0);
				}

				var10 = new class188(var11, var13);
				var5.method631(var10);
			}

			this.field3112[var7[var8]] = new class16(var9, var10);
		}

	}

	@ObfInfo(name = "ae", desc = "(II)Z")
	public boolean method2117(int var1) {
		return this.field3112[var1].field363;
	}

	@ObfInfo(name = "au", desc = "(Lnu;Lnu;IZB)Ljt;")
	public static class399 method2118(class437 var0, class437 var1, int var2, boolean var3) {
		boolean var5 = true;
		int[] var6 = var0.method2278(var2);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var0.method2275(var2, var6[var7]);
			if (null == var8) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10;
				if (var3) {
					var10 = var1.method2275(0, var9);
				} else {
					var10 = var1.method2275(var9, 0);
				}

				if (null == var10) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new class399(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(III)V", opaqueValue = "-456788034")
	public static void method2116(int var0, int var1) {
		class126 var3 = class126.method701(var0);
		int var4 = var3.field1159;
		int var5 = var3.field1160;
		int var6 = var3.field1163;
		int var7 = class44.field558[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		class44.field559[var4] = class44.field559[var4] & ~var7 | var1 << var5 & var7;
	}
}
