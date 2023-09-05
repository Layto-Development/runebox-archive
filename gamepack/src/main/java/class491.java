import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uo")
public class class491 {
	@ObfInfo(name = "af", desc = "Z")
	boolean field4000;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1603682849)
	int field3992;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1434571801)
	int field3993;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1899372153)
	int field3994;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 608291053)
	int field3995;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 790840067)
	int field3996;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1702824015)
	int field3997;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -729046229)
	int field3998;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -730791395)
	int field3999;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 2137169805)
	int field4001;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -120854339)
	int field4002;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1579750397)
	int field4003;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 2076180179)
	int field4004;

	@ObfInfo(name = "<init>", desc = "()V")
	public class491() {
		this.field3993 = 0;
		this.field3999 = 0;
	}

	@ObfInfo(name = "au", desc = "(IIIIIIIIZB)V")
	public void method2479(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field4004 = var1;
		this.field3992 = var2;
		this.field3994 = var3;
		this.field3995 = var4;
		this.field3996 = var5;
		this.field3997 = var6;
		this.field3993 = var7;
		this.field3999 = var8;
		this.field4000 = var9;
	}

	@ObfInfo(name = "ae", desc = "(IIIII)V")
	public void method2480(int var1, int var2, int var3, int var4) {
		this.field4001 = var1;
		this.field4002 = var2;
		this.field4003 = var3;
		this.field3998 = var4;
	}

	@ObfInfo(name = "ao", desc = "(Lpj;Lpi;B)V")
	public void method2481(class338 var1, class258 var2, byte var3) {
		if (var2 == null) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}
		} else {
			int var4 = var2.field2414;
			int var5 = Math.min(this.field3995, (int)((float)var4 * 0.9F));
			int var6 = var1.method1849(this.field3994);
			int var7 = var1.method1850(this.field3995);
			int var8 = this.field4004 - this.field3996 + var6;
			int var9 = this.field3992 - this.field3997 + var7 + var4;
			class83.method549(this.field4004, this.field3992, this.field4004 + this.field3994, this.field3995 + this.field3992);
			int var10 = this.field3999;
			int var11 = this.field3993;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			class474 var22 = var1.method1836(0, var10);
			class474 var13 = var1.method1836(var10, var11);
			class474 var14 = var1.method1836(var11, var1.method1830());
			class474 var15 = var1.method1836(0, this.field3993);
			int var17;
			int var19;
			if (!var13.method2430()) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				int var16 = var2.field2418 + var2.field2419;

				for (var17 = 0; var17 < var13.method2431(); ++var17) {
					if (var3 >= -1) {
						throw new IllegalStateException();
					}

					class457 var18 = var13.method2433(var17);
					var19 = var8 + var18.field3715;
					int var20 = var2.method1675(var18.field3716);
					int var21 = var9 + var18.field3718 - var4;
					class83.method542(var19, var21, var20, var16, this.field3998);
				}
			}

			if (!var22.method2430()) {
				if (var3 >= -1) {
					return;
				}

				var2.method1655(var22, var8, var9, this.field4001, this.field4002, -1);
			}

			if (!var13.method2430()) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				var2.method1655(var13, var8, var9, this.field4003, this.field4002, -1);
			}

			if (!var14.method2430()) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				var2.method1655(var14, var8, var9, this.field4001, this.field4002, -1);
			}

			if (this.field4000) {
				class165 var23 = var15.method2435();
				var17 = var8 + (Integer)var23.field1562;
				int var24 = var9 + (Integer)var23.field1561;
				var19 = var24 - var5;
				class83.method544(var17, var24, var17, var19, this.field4001);
				if (this.field4002 != -1) {
					if (var3 >= -1) {
						return;
					}

					class83.method544(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field4002);
				}
			}

		}
	}
}
