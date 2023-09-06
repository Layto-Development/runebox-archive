import java.util.HashMap;

public class class110 {
	static String field1061;
	class169 field1058;
	int field1060;
	int[] field1056;
	int[] field1057;
	final HashMap field1059;

	public class110() {
		this.field1059 = new HashMap();
		this.field1058 = new class169(0, 0);
		this.field1056 = new int[2048];
		this.field1057 = new int[2048];
		this.field1060 = 0;
		class146.method853();
	}

	void method691(int var1) {
		int var3 = var1 * 2 + 1;
		double[] var4 = class50.method381(0.0D, (double)((float)var1 / 3.0F), var1);
		double var5 = var4[var1] * var4[var1];
		int[] var7 = new int[var3 * var3];
		boolean var8 = false;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = 0; var10 < var3; ++var10) {
				int var11 = var7[var10 + var9 * var3] = (int)(256.0D * (var4[var9] * var4[var10] / var5));
				if (!var8 && var11 > 0) {
					var8 = true;
				}
			}
		}

		class115 var12 = new class115(var7, var3, var3);
		this.field1059.put(var1, var12);
	}

	class115 method687(int var1) {
		if (!this.field1059.containsKey(var1)) {
			this.method691(var1);
		}

		return (class115)this.field1059.get(var1);
	}

	public final void method688(int var1, int var2) {
		if (this.field1060 < this.field1056.length) {
			this.field1056[this.field1060] = var1;
			this.field1057[this.field1060] = var2;
			++this.field1060;
		}
	}

	public final void method689() {
		this.field1060 = 0;
	}

	public final void method690(int var1, int var2, class115 var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		class115 var7 = this.method687(var6);
		int var8 = var6 * 2 + 1;
		class169 var9 = new class169(0, 0, var3.field1084, var3.field1080);
		class169 var10 = new class169(0, 0);
		this.field1058.method932(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field1060; ++var11) {
			var12 = this.field1056[var11];
			var13 = this.field1057[var11];
			int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
			int var15 = (int)((float)var3.field1080 - (float)(var13 - var2) * var4) - var6;
			this.field1058.method931(var14, var15);
			this.field1058.method934(var9, var10);
			this.method692(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field1083.length; ++var11) {
			if (var3.field1083[var11] == 0) {
				var3.field1083[var11] = -16777216;
			} else {
				var12 = (var3.field1083[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field1083[var11] = -16777216;
				} else {
					if (var12 > class210.field1986.length) {
						var12 = class210.field1986.length;
					}

					var13 = class210.field1986[var12 - 1];
					var3.field1083[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	void method692(class115 var1, class115 var2, class169 var3) {
		if (var3.field1644 != 0 && var3.field1642 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (var3.field1645 == 0) {
				var5 = var1.field1084 - var3.field1644;
			}

			if (var3.field1643 == 0) {
				var6 = var1.field1080 - var3.field1642;
			}

			int var7 = var6 * var1.field1084 + var5;
			int var8 = var2.field1084 * var3.field1643 + var3.field1645;

			for (int var9 = 0; var9 < var3.field1642; ++var9) {
				for (int var10 = 0; var10 < var3.field1644; ++var10) {
					int[] var10000 = var2.field1083;
					int var10001 = var8++;
					var10000[var10001] += var1.field1083[var7++];
				}

				var7 += var1.field1084 - var3.field1644;
				var8 += var2.field1084 - var3.field1644;
			}

		}
	}

	static void method693(class60 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field659;
		int var6 = var0.field636;
		if (var0.field651 == 0) {
			var0.field659 = var0.field655;
		} else if (var0.field651 == 1) {
			var0.field659 = var1 - var0.field655;
		} else if (var0.field651 == 2) {
			var0.field659 = var1 * var0.field655 >> 14;
		}

		if (var0.field652 == 0) {
			var0.field636 = var0.field656;
		} else if (var0.field652 == 1) {
			var0.field636 = var2 - var0.field656;
		} else if (var0.field652 == 2) {
			var0.field636 = var2 * var0.field656 >> 14;
		}

		if (var0.field651 == 4) {
			var0.field659 = var0.field760 * var0.field636 / var0.field660;
		}

		if (var0.field652 == 4) {
			var0.field636 = var0.field659 * var0.field660 / var0.field760;
		}

		if (var0.field670 == 1337) {
			Client.field296 = var0;
		}

		if (var0.field646 == 12) {
			var0.method472().method2310(var0.field659, var0.field636);
		}

		if (var3 && var0.field638 != null && (var5 != var0.field659 || var6 != var0.field636)) {
			class309 var7 = new class309();
			var7.field2791 = var0;
			var7.field2794 = var0.field638;
			Client.field218.method567(var7);
		}

	}
}
