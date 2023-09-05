import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "pi")
public final class class258 extends class300 {
	@ObfInfo(name = "<init>", desc = "([B[I[I[I[I[I[[B)V")
	public class258(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfInfo(name = "<init>", desc = "([B)V")
	public class258(byte[] var1) {
		super(var1);
	}

	@ObfInfo(name = "au", desc = "([BIIIII)V")
	final void method1643(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * class83.field870;
		int var8 = class83.field870 - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < class83.field876) {
			var11 = class83.field876 - var3;
			var5 -= var11;
			var3 = class83.field876;
			var10 += var11 * var4;
			var7 += var11 * class83.field870;
		}

		if (var3 + var5 > class83.field874) {
			var5 -= var3 + var5 - class83.field874;
		}

		if (var2 < class83.field875) {
			var11 = class83.field875 - var2;
			var4 -= var11;
			var2 = class83.field875;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > class83.field869) {
			var11 = var2 + var4 - class83.field869;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			method1664(class83.field872, var1, var6, var10, var7, var4, var5, var8, var9);
		}
	}

	@ObfInfo(name = "ae", desc = "([BIIIIII)V")
	final void method1663(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * class83.field870;
		int var9 = class83.field870 - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < class83.field876) {
			var12 = class83.field876 - var3;
			var5 -= var12;
			var3 = class83.field876;
			var11 += var12 * var4;
			var8 += var12 * class83.field870;
		}

		if (var3 + var5 > class83.field874) {
			var5 -= var3 + var5 - class83.field874;
		}

		if (var2 < class83.field875) {
			var12 = class83.field875 - var2;
			var4 -= var12;
			var2 = class83.field875;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > class83.field869) {
			var12 = var2 + var4 - class83.field869;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			method1666(class83.field872, var1, var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
}
