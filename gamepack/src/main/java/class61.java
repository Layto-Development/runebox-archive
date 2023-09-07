public final class class61 extends class500 {

	public class61(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public class61(byte[] var1) {
		super(var1);
	}

	@Override
	final void method2383(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class206.field1904;
		int var8 = class206.field1904 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class206.field1910) {
			var11 = class206.field1910 - var3;
			var5 -= var11;
			var3 = class206.field1910;
			var10 = 0 + var11 * var4;
			var7 += var11 * class206.field1904;
		}
		if (var3 + var5 > class206.field1908) {
			var5 -= var3 + var5 - class206.field1908;
		}
		if (var2 < class206.field1909) {
			var11 = class206.field1909 - var2;
			var4 -= var11;
			var2 = class206.field1909;
			var10 += var11;
			var7 += var11;
			var9 = 0 + var11;
			var8 += var11;
		}
		if (var2 + var4 > class206.field1903) {
			var11 = var2 + var4 - class206.field1903;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}
		if (var4 > 0 && var5 > 0) {
			method2404(class206.field1906, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	@Override
	final void method2403(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class206.field1904;
		int var9 = class206.field1904 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class206.field1910) {
			var12 = class206.field1910 - var3;
			var5 -= var12;
			var3 = class206.field1910;
			var11 = 0 + var12 * var4;
			var8 += var12 * class206.field1904;
		}
		if (var3 + var5 > class206.field1908) {
			var5 -= var3 + var5 - class206.field1908;
		}
		if (var2 < class206.field1909) {
			var12 = class206.field1909 - var2;
			var4 -= var12;
			var2 = class206.field1909;
			var11 += var12;
			var8 += var12;
			var10 = 0 + var12;
			var9 += var12;
		}
		if (var2 + var4 > class206.field1903) {
			var12 = var2 + var4 - class206.field1903;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}
		if (var4 > 0 && var5 > 0) {
			method2406(class206.field1906, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
