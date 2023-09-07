import java.util.HashMap;

public class class60 {

	static String field648;

	class166 field645;

	int field647;

	int[] field643;

	int[] field644;

	final HashMap field646;

	public class60() {
		this.field646 = new HashMap();
		this.field645 = new class166(0, 0);
		this.field643 = new int[2048];
		this.field644 = new int[2048];
		this.field647 = 0;
		method239();
	}

	void method237(int var1) {
		int var3 = var1 * 2 + 1;
		double[] var4 = class356.method1870(0.0D, (double) ((float) var1 / 3.0F), var1);
		double var5 = var4[var1] * var4[var1];
		int[] var7 = new int[var3 * var3];
		boolean var8 = false;
		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = 0; var10 < var3; ++var10) {
				int var11 = var7[var10 + var9 * var3] = (int) (256.0D * (var4[var9] * var4[var10] / var5));
				if (!var8 && var11 > 0) {
					var8 = true;
				}
			}
		}
		class84 var12 = new class84(var7, var3, var3);
		this.field646.put(var1, var12);
	}

	class84 method233(int var1) {
		if (!this.field646.containsKey(var1)) {
			this.method237(var1);
		}
		return (class84) this.field646.get(var1);
	}

	public final void method234(int var1, int var2) {
		if (this.field647 < this.field643.length) {
			this.field643[this.field647] = var1;
			this.field644[this.field647] = var2;
			++this.field647;
		}
	}

	public final void method235() {
		this.field647 = 0;
	}

	public final void method236(int var1, int var2, class84 var3, float var4) {
		int var6 = (int) (var4 * 18.0F);
		class84 var7 = this.method233(var6);
		int var8 = var6 * 2 + 1;
		class166 var9 = new class166(0, 0, var3.field848, var3.field844);
		class166 var10 = new class166(0, 0);
		this.field645.method969(var8, var8);
		System.nanoTime();
		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field647; ++var11) {
			var12 = this.field643[var11];
			var13 = this.field644[var11];
			int var14 = (int) (var4 * (float) (var12 - var1)) - var6;
			int var15 = (int) ((float) var3.field844 - (float) (var13 - var2) * var4) - var6;
			this.field645.method968(var14, var15);
			this.field645.method971(var9, var10);
			this.method238(var7, var3, var10);
		}
		System.nanoTime();
		System.nanoTime();
		for (var11 = 0; var11 < var3.field847.length; ++var11) {
			if (var3.field847[var11] == 0) {
				var3.field847[var11] = -16777216;
			} else {
				var12 = (var3.field847[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field847[var11] = -16777216;
				} else {
					if (var12 > class426.field3345.length) {
						var12 = class426.field3345.length;
					}
					var13 = class426.field3345[var12 - 1];
					var3.field847[var11] = -16777216 | var13;
				}
			}
		}
		System.nanoTime();
	}

	void method238(class84 var1, class84 var2, class166 var3) {
		if (var3.field1678 != 0 && var3.field1676 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (var3.field1679 == 0) {
				var5 = var1.field848 - var3.field1678;
			}
			if (var3.field1677 == 0) {
				var6 = var1.field844 - var3.field1676;
			}
			int var7 = var6 * var1.field848 + var5;
			int var8 = var2.field848 * var3.field1677 + var3.field1679;
			for (int var9 = 0; var9 < var3.field1676; ++var9) {
				for (int var10 = 0; var10 < var3.field1678; ++var10) {
					int[] var10000 = var2.field847;
					int var10001 = var8++;
					var10000[var10001] += var1.field847[var7++];
				}
				var7 += var1.field848 - var3.field1678;
				var8 += var2.field848 - var3.field1678;
			}
		}
	}

	static void method239() {
		class426.field3345 = new int[2000];
		int var1 = 0;
		int var2 = 240;
		boolean var3;
		int var4;
		for (var3 = true; var1 < 16; var2 -= 12) {
			var4 = class534.method2580((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
			class426.field3345[var1] = var4;
			++var1;
		}
		var2 = 48;
		for (var3 = true; var1 < class426.field3345.length; var2 -= 8) {
			var4 = var1 * 2;
			for (int var5 = class534.method2580((double) ((float) var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class426.field3345.length; ++var1) {
				class426.field3345[var1] = var5;
			}
		}
	}
}
