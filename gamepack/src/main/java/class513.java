public class class513 extends class310 {

	static int field4088;

	class466[] field4089;

	class513(class338 var1, class338 var2, int var3, boolean var4) {
		class449 var5 = new class449();
		int var6 = var1.method1788(var3);
		this.field4089 = new class466[var6];
		int[] var7 = var1.method1773(var3);
		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method1762(var3, var7[var8]);
			class413 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
			for (class413 var12 = (class413) var5.method2218(); null != var12; var12 = (class413) var5.method2220()) {
				if (var12.field3209 == var11) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13 = var2.method1770(var11, 0);
				var10 = new class413(var11, var13);
				var5.method2222(var10);
			}
			this.field4089[var7[var8]] = new class466(var9, var10);
		}
	}

	public boolean method2463(int var1) {
		return this.field4089[var1].field3700;
	}

	public static class513 method2464(class338 var0, class338 var1, int var2, boolean var3) {
		boolean var5 = true;
		int[] var6 = var0.method1773(var2);
		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var0.method1770(var2, var6[var7]);
			if (null == var8) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10 = var1.method1770(var9, 0);
				if (null == var10) {
					var5 = false;
				}
			}
		}
		if (!var5) {
			return null;
		} else {
			try {
				return new class513(var0, var1, var2, false);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	public static void method2462(int var0, int var1) {
		class431 var3 = class431.method2163(var0);
		int var4 = var3.field3373;
		int var5 = var3.field3374;
		int var6 = var3.field3377;
		int var7 = class410.field3197[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}
		var7 <<= var5;
		class410.field3198[var4] = class410.field3198[var4] & ~var7 | var1 << var5 & var7;
	}
}
