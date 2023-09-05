import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "cd")
public class class319 {
	@ObfInfo(name = "fd", desc = "Lqi;")
	static class112 field2582;
	@ObfInfo(name = "jt", desc = "Lpi;")
	static class258 field2584;
	@ObfInfo(name = "js", desc = "[I")
	static int[] field2585;
	@ObfInfo(name = "ae", desc = "Z")
	boolean field2580;
	@ObfInfo(name = "ac", desc = "[Z")
	boolean[] field2583;
	@ObfInfo(name = "au", desc = "Lbo;")
	class444 field2586;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field2581;
	@ObfInfo(name = "at", desc = "[I")
	int[] field2587;

	@ObfInfo(name = "<init>", desc = "(Lbo;Z[I[I[Z)V")
	class319(class444 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field2586 = var1;
		this.field2580 = var2;
		this.field2581 = var3;
		this.field2587 = var4;
		this.field2583 = var5;
	}

	@ObfInfo(name = "au", desc = "([FIB)V", opaqueValue = "2")
	void method1775(float[] var1, int var2) {
		int var4 = this.field2586.field3333.length;
		class444 var10000 = this.field2586;
		int var5 = class444.field3332[this.field2586.field3331 - 1];
		boolean[] var6 = this.field2583;
		this.field2583[1] = true;
		var6[0] = true;

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var7 = 2; var7 < var4; ++var7) {
			var8 = this.field2586.method2320(this.field2581, var7);
			var9 = this.field2586.method2317(this.field2581, var7);
			var10 = this.field2586.method2318(this.field2581[var8], this.field2587[var8], this.field2581[var9], this.field2587[var9], this.field2581[var7]);
			var11 = this.field2587[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (var11 != 0) {
				boolean[] var15 = this.field2583;
				this.field2583[var9] = true;
				var15[var8] = true;
				this.field2583[var7] = true;
				if (var11 >= var14) {
					this.field2587[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
				} else {
					this.field2587[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
				}
			} else {
				this.field2583[var7] = false;
				this.field2587[var7] = var10;
			}
		}

		this.method1777(0, var4 - 1);
		var7 = 0;
		var8 = this.field2586.field3331 * this.field2587[0];

		for (var9 = 1; var9 < var4; ++var9) {
			if (this.field2583[var9]) {
				var10 = this.field2581[var9];
				var11 = this.field2587[var9] * this.field2586.field3331;
				this.field2586.method2316(var7, var8, var10, var11, var1, var2);
				if (var10 >= var2) {
					return;
				}

				var7 = var10;
				var8 = var11;
			}
		}

		var10000 = this.field2586;
		float var17 = class444.field3334[var8];

		for (var10 = var7; var10 < var2; ++var10) {
			var1[var10] *= var17;
		}

	}

	@ObfInfo(name = "ae", desc = "(B)Z")
	boolean method1776() {
		return this.field2580;
	}

	@ObfInfo(name = "ao", desc = "(III)V", opaqueValue = "1606772810")
	void method1777(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.field2581[var1];
			int var6 = this.field2587[var1];
			boolean var7 = this.field2583[var1];

			for (int var8 = var1 + 1; var8 <= var2; ++var8) {
				int var9 = this.field2581[var8];
				if (var9 < var5) {
					this.field2581[var4] = var9;
					this.field2587[var4] = this.field2587[var8];
					this.field2583[var4] = this.field2583[var8];
					++var4;
					this.field2581[var8] = this.field2581[var4];
					this.field2587[var8] = this.field2587[var4];
					this.field2583[var8] = this.field2583[var4];
				}
			}

			this.field2581[var4] = var5;
			this.field2587[var4] = var6;
			this.field2583[var4] = var7;
			this.method1777(var1, var4 - 1);
			this.method1777(var4 + 1, var2);
		}
	}
}
