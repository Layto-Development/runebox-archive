import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;

@ObfInfo(name = "cu")
public class class151 implements Comparator {
	@ObfInfo(name = "ka", desc = "[Luk;")
	static class398[] field1468;
	@ObfInfo(name = "as", desc = "Lkl;")
	static class68 field1466;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 109226417)
	static int field1465;
	@ObfInfo(name = "au", desc = "Z")
	boolean field1467;

	@ObfInfo(name = "<init>", desc = "()V")
	class151() {
	}

	@ObfInfo(name = "au", desc = "(Loz;Loz;I)I", opaqueValue = "16711934")
	int method883(class158 var1, class158 var2) {
		if (var2.field1502 == var1.field1502) {
			return 0;
		} else {
			if (this.field1467) {
				if (var1.field1502 == Client.field27) {
					return -1;
				}

				if (var2.field1502 == Client.field27) {
					return 1;
				}
			}

			return var1.field1502 < var2.field1502 ? -1 : 1;
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method883((class158)var1, (class158)var2);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(name = "jc", desc = "(IIIIZI)V", opaqueValue = "-780349594")
	static final void method882(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = Client.field300;
		} else if (var6 >= 100) {
			var7 = Client.field186;
		} else {
			var7 = Client.field300 + var6 * (Client.field186 - Client.field300) / 100;
		}

		int var8 = 512 * var3 * var7 / (var2 * 334);
		int var9;
		int var10;
		short var17;
		if (var8 < Client.field306) {
			var17 = Client.field306;
			var7 = var2 * var17 * 334 / (var3 * 512);
			if (var7 > Client.field136) {
				var7 = Client.field136;
				var9 = var3 * var7 * 512 / (var17 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					class83.method536();
					class83.method542(var0, var1, var10, var3, -16777216);
					class83.method542(var0 + var2 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > Client.field307) {
			var17 = Client.field307;
			var7 = var17 * var2 * 334 / (var3 * 512);
			if (var7 < Client.field304) {
				var7 = Client.field304;
				var9 = var17 * var2 * 334 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					class83.method536();
					class83.method542(var0, var1, var2, var10, -16777216);
					class83.method542(var0, var3 + var1 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		Client.field312 = var7 * var3 / 334;
		if (var2 != Client.field243 || Client.field118 != var3) {
			int[] var18 = new int[9];

			for (var10 = 0; var10 < var18.length; ++var10) {
				int var11 = var10 * 32 + 128 + 15;
				int var12 = Client.method204(var11);
				int var13 = class276.field2236[var11];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = Client.field302 + var15 * (Client.field303 - Client.field302) / 100;
				int var14 = var16 * var12 / 256;
				var18[var10] = var14 * var13 >> 16;
			}

			class194.method1093(var18, 500, 800, var2 * 334 / var3, 334);
		}

		Client.field308 = var0;
		Client.field309 = var1;
		Client.field243 = var2;
		Client.field118 = var3;
	}
}
