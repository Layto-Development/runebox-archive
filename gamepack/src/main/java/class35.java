import java.util.Comparator;

public class class35 implements Comparator {
	static class113 field498;
	static class25[] field500;
	static int field497;
	boolean field499;

	class35() {
	}

	int method240(class478 var1, class478 var2) {
		if (var2.field4068 == var1.field4068) {
			return 0;
		} else {
			if (this.field499) {
				if (var1.field4068 == Client.field3) {
					return -1;
				}

				if (var2.field4068 == Client.field3) {
					return 1;
				}
			}

			return var1.field4068 < var2.field4068 ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method240((class478)var1, (class478)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static boolean method241(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	static final void method239(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = Client.field276;
		} else if (var6 >= 100) {
			var7 = Client.field162;
		} else {
			var7 = Client.field276 + var6 * (Client.field162 - Client.field276) / 100;
		}

		int var8 = 512 * var3 * var7 / (var2 * 334);
		int var9;
		int var10;
		short var17;
		if (var8 < Client.field282) {
			var17 = Client.field282;
			var7 = var2 * var17 * 334 / (var3 * 512);
			if (var7 > Client.field112) {
				var7 = Client.field112;
				var9 = var3 * var7 * 512 / (var17 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					class266.method1542();
					class266.method1548(var0, var1, var10, var3, -16777216);
					class266.method1548(var0 + var2 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > Client.field283) {
			var17 = Client.field283;
			var7 = var17 * var2 * 334 / (var3 * 512);
			if (var7 < Client.field280) {
				var7 = Client.field280;
				var9 = var17 * var2 * 334 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					class266.method1542();
					class266.method1548(var0, var1, var2, var10, -16777216);
					class266.method1548(var0, var3 + var1 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		Client.field288 = var7 * var3 / 334;
		if (var2 != Client.field219 || Client.field94 != var3) {
			int[] var18 = new int[9];

			for (var10 = 0; var10 < var18.length; ++var10) {
				int var11 = var10 * 32 + 128 + 15;
				int var12 = class439.method2211(var11);
				int var13 = class133.field1291[var11];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = Client.field278 + var15 * (Client.field279 - Client.field278) / 100;
				int var14 = var16 * var12 / 256;
				var18[var10] = var14 * var13 >> 16;
			}

			class317.method1791(var18, 500, 800, var2 * 334 / var3, 334);
		}

		Client.field284 = var0;
		Client.field285 = var1;
		Client.field219 = var2;
		Client.field94 = var3;
	}
}
