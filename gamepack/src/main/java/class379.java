import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "od")
public class class379 {
	@ObfInfo(name = "ck", desc = "Ljava/lang/String;")
	static String field2919;
	@ObfInfo(name = "ae", desc = "Lrb;")
	class238 field2916;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -705777851)
	int field2918;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field2914;
	@ObfInfo(name = "at", desc = "[I")
	int[] field2915;
	@ObfInfo(name = "au", desc = "Ljava/util/HashMap;")
	final HashMap field2917;

	@ObfInfo(name = "<init>", desc = "()V")
	public class379() {
		this.field2917 = new HashMap();
		this.field2916 = new class238(0, 0);
		this.field2914 = new int[2048];
		this.field2915 = new int[2048];
		this.field2918 = 0;
		method2027();
	}

	@ObfInfo(name = "ae", desc = "(II)V", opaqueValue = "915989256")
	void method2025(int var1) {
		int var3 = var1 * 2 + 1;
		double[] var4 = class325.method1802(0.0D, (double)((float)var1 / 3.0F), var1);
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

		class150 var12 = new class150(var7, var3, var3);
		this.field2917.put(var1, var12);
	}

	@ObfInfo(name = "ao", desc = "(IB)Lui;", opaqueValue = "63")
	class150 method2021(int var1) {
		if (!this.field2917.containsKey(var1)) {
			this.method2025(var1);
		}

		return (class150)this.field2917.get(var1);
	}

	@ObfInfo(name = "at", desc = "(III)V", opaqueValue = "-1687747251")
	public final void method2022(int var1, int var2) {
		if (this.field2918 < this.field2914.length) {
			this.field2914[this.field2918] = var1;
			this.field2915[this.field2918] = var2;
			++this.field2918;
		}
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	public final void method2023() {
		this.field2918 = 0;
	}

	@ObfInfo(name = "ai", desc = "(IILui;FI)V", opaqueValue = "1868555019")
	public final void method2024(int var1, int var2, class150 var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		class150 var7 = this.method2021(var6);
		int var8 = var6 * 2 + 1;
		class238 var9 = new class238(0, 0, var3.field1464, var3.field1460);
		class238 var10 = new class238(0, 0);
		this.field2916.method1250(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field2918; ++var11) {
			var12 = this.field2914[var11];
			var13 = this.field2915[var11];
			int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
			int var15 = (int)((float)var3.field1460 - (float)(var13 - var2) * var4) - var6;
			this.field2916.method1249(var14, var15);
			this.field2916.method1252(var9, var10);
			this.method2026(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field1463.length; ++var11) {
			if (var3.field1463[var11] == 0) {
				var3.field1463[var11] = -16777216;
			} else {
				var12 = (var3.field1463[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field1463[var11] = -16777216;
				} else {
					if (var12 > class270.field2218.length) {
						var12 = class270.field2218.length;
					}

					var13 = class270.field2218[var12 - 1];
					var3.field1463[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	@ObfInfo(name = "az", desc = "(Lui;Lui;Lrb;I)V", opaqueValue = "-429146583")
	void method2026(class150 var1, class150 var2, class238 var3) {
		if (var3.field1986 != 0 && var3.field1984 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (var3.field1987 == 0) {
				var5 = var1.field1464 - var3.field1986;
			}

			if (var3.field1985 == 0) {
				var6 = var1.field1460 - var3.field1984;
			}

			int var7 = var6 * var1.field1464 + var5;
			int var8 = var2.field1464 * var3.field1985 + var3.field1987;

			for (int var9 = 0; var9 < var3.field1984; ++var9) {
				for (int var10 = 0; var10 < var3.field1986; ++var10) {
					int[] var10000 = var2.field1463;
					int var10001 = var8++;
					var10000[var10001] += var1.field1463[var7++];
				}

				var7 += var1.field1464 - var3.field1986;
				var8 += var2.field1464 - var3.field1986;
			}

		}
	}

	@ObfInfo(name = "au", desc = "(I)V")
	static void method2027() {
		class270.field2218 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class390.method2085((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			class270.field2218[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class270.field2218.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class390.method2085((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class270.field2218.length; ++var1) {
				class270.field2218[var1] = var5;
			}
		}

	}
}
