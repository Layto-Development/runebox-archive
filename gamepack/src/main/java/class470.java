import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.Font;

@ObfInfo(name = "ca")
public final class class470 extends class155 {
	@ObfInfo(name = "au", desc = "Low;")
	static class113 field3790;
	@ObfInfo(name = "fg", desc = "Lnk;")
	static class505 field3803;
	@ObfInfo(name = "jd", desc = "I", intMultiplier = -502599913)
	static int field3787;
	@ObfInfo(name = "bj", desc = "Ljava/awt/Font;")
	static Font field3802;
	@ObfInfo(name = "an", desc = "Lbn;")
	class28 field3795;
	@ObfInfo(name = "aa", desc = "Lbn;")
	class28 field3799;
	@ObfInfo(name = "ar", desc = "Lhv;")
	class292 field3800;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 213423769)
	int field3788;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1140450119)
	int field3789;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1579031469)
	int field3791;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -587827913)
	int field3792;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1981734327)
	int field3793;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 775499377)
	int field3794;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -448105717)
	int field3796;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 96078857)
	int field3798;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1180213293)
	int field3801;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 2064097821)
	int field3804;
	@ObfInfo(name = "aq", desc = "[I")
	int[] field3797;

	static {
		field3790 = new class113();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class470() {
	}

	@ObfInfo(name = "ae", desc = "(I)V", opaqueValue = "1671616582")
	void method2412() {
		int var2 = this.field3794;
		class292 var3 = this.field3800.method1614();
		if (var3 != null) {
			this.field3794 = var3.field2368;
			this.field3793 = var3.field2369 * 128;
			this.field3798 = var3.field2370;
			this.field3796 = var3.field2371;
			this.field3797 = var3.field2362;
		} else {
			this.field3794 = -1;
			this.field3793 = 0;
			this.field3798 = 0;
			this.field3796 = 0;
			this.field3797 = null;
		}

		if (var2 != this.field3794 && this.field3799 != null) {
			class164.field1556.method1980(this.field3799);
			this.field3799 = null;
		}

	}

	@ObfInfo(name = "au", desc = "(B)V")
	static void method2415() {
		for (class470 var1 = (class470)field3790.method627(); var1 != null; var1 = (class470)field3790.method629()) {
			if (null != var1.field3799) {
				class164.field1556.method1980(var1.field3799);
				var1.field3799 = null;
			}

			if (var1.field3795 != null) {
				class164.field1556.method1980(var1.field3795);
				var1.field3795 = null;
			}
		}

		field3790.method623();
	}

	@ObfInfo(name = "ao", desc = "(IIILhv;II)V")
	static void method2414(int var0, int var1, int var2, class292 var3, int var4) {
		class470 var6 = new class470();
		var6.field3788 = var0;
		var6.field3789 = var1 * 128;
		var6.field3801 = var2 * 128;
		int var7 = var3.field2339;
		int var8 = var3.field2324;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2324;
			var8 = var3.field2339;
		}

		var6.field3791 = 128 * (var7 + var1);
		var6.field3792 = (var2 + var8) * 128;
		var6.field3794 = var3.field2368;
		var6.field3793 = var3.field2369 * 128;
		var6.field3798 = var3.field2370;
		var6.field3796 = var3.field2371;
		var6.field3797 = var3.field2362;
		if (null != var3.field2365) {
			var6.field3800 = var3;
			var6.method2412();
		}

		field3790.method631(var6);
		if (null != var6.field3797) {
			var6.field3804 = var6.field3798 + (int)(Math.random() * (double)(var6.field3796 - var6.field3798));
		}

	}

	@ObfInfo(name = "at", desc = "(IIIIB)V")
	static void method2413(int var0, int var1, int var2, int var3) {
		for (class470 var5 = (class470)field3790.method627(); var5 != null; var5 = (class470)field3790.method629()) {
			if (var5.field3794 != -1 || var5.field3797 != null) {
				int var6 = 0;
				if (var1 > var5.field3791) {
					var6 += var1 - var5.field3791;
				} else if (var1 < var5.field3789) {
					var6 += var5.field3789 - var1;
				}

				if (var2 > var5.field3792) {
					var6 += var2 - var5.field3792;
				} else if (var2 < var5.field3801) {
					var6 += var5.field3801 - var2;
				}

				if (var6 - 64 <= var5.field3793 && class281.field2262.method1772() != 0 && var0 == var5.field3788) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var5.field3793 - var6) * class281.field2262.method1772() / var5.field3793;
					if (var5.field3799 == null) {
						if (var5.field3794 >= 0) {
							class538 var8 = class538.method2590(class310.field2523, var5.field3794, 0);
							if (var8 != null) {
								class62 var9 = var8.method2588().method486(class105.field1016);
								class28 var10 = class28.method404(var9, 100, var7);
								var10.method370(-1);
								class164.field1556.method1990(var10);
								var5.field3799 = var10;
							}
						}
					} else {
						var5.field3799.method371(var7);
					}

					if (var5.field3795 == null) {
						if (null != var5.field3797 && (var5.field3804 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var5.field3797.length);
							class538 var13 = class538.method2590(class310.field2523, var5.field3797[var12], 0);
							if (null != var13) {
								class62 var14 = var13.method2588().method486(class105.field1016);
								class28 var11 = class28.method404(var14, 100, var7);
								var11.method370(0);
								class164.field1556.method1990(var11);
								var5.field3795 = var11;
								var5.field3804 = var5.field3798 + (int)(Math.random() * (double)(var5.field3796 - var5.field3798));
							}
						}
					} else {
						var5.field3795.method371(var7);
						if (!var5.field3795.method908()) {
							var5.field3795 = null;
						}
					}
				} else {
					if (null != var5.field3799) {
						class164.field1556.method1980(var5.field3799);
						var5.field3799 = null;
					}

					if (var5.field3795 != null) {
						class164.field1556.method1980(var5.field3795);
						var5.field3795 = null;
					}
				}
			}
		}

	}
}
