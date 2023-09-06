public final class class253 extends class228 {
	public class253(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public class253(byte[] var1) {
		super(var1);
	}

	final void method1289(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class266.field2404;
		int var8 = class266.field2404 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class266.field2410) {
			var11 = class266.field2410 - var3;
			var5 -= var11;
			var3 = class266.field2410;
			var10 += var11 * var4;
			var7 += var11 * class266.field2404;
		}

		if (var3 + var5 > class266.field2408) {
			var5 -= var3 + var5 - class266.field2408;
		}

		if (var2 < class266.field2409) {
			var11 = class266.field2409 - var2;
			var4 -= var11;
			var2 = class266.field2409;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > class266.field2403) {
			var11 = var2 + var4 - class266.field2403;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method1310(class266.field2406, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	final void method1309(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class266.field2404;
		int var9 = class266.field2404 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class266.field2410) {
			var12 = class266.field2410 - var3;
			var5 -= var12;
			var3 = class266.field2410;
			var11 += var12 * var4;
			var8 += var12 * class266.field2404;
		}

		if (var3 + var5 > class266.field2408) {
			var5 -= var3 + var5 - class266.field2408;
		}

		if (var2 < class266.field2409) {
			var12 = class266.field2409 - var2;
			var4 -= var12;
			var2 = class266.field2409;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > class266.field2403) {
			var12 = var2 + var4 - class266.field2403;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method1312(class266.field2406, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
