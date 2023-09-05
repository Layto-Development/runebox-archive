import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dj")
public class class380 extends class510 {
	@ObfInfo(name = "az", desc = "Lib;")
	class202 field2920;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -75702939)
	int field2921;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -231241725)
	int field2922;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1501685719)
	int field2923;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 795738445)
	int field2924;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1260218321)
	int field2925;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 215686393)
	int field2926;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1287923743)
	int field2927;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -714646065)
	int field2928;

	@ObfInfo(name = "<init>", desc = "(IIIIIIIZLik;)V")
	class380(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class510 var9) {
		this.field2923 = var1;
		this.field2921 = var2;
		this.field2922 = var3;
		this.field2926 = var4;
		this.field2924 = var5;
		this.field2925 = var6;
		if (var7 != -1) {
			this.field2920 = class202.method1149(var7);
			this.field2927 = 0;
			this.field2928 = Client.field330 - 1;
			if (this.field2920.field1854 == 0 && null != var9 && var9 instanceof class380) {
				class380 var10 = (class380)var9;
				if (this.field2920 == var10.field2920) {
					this.field2927 = var10.field2927;
					this.field2928 = var10.field2928;
					return;
				}
			}

			if (var8 && this.field2920.field1843 != -1) {
				if (!this.field2920.method1148()) {
					this.field2927 = (int)(Math.random() * (double)this.field2920.field1839.length);
					this.field2928 -= (int)(Math.random() * (double)this.field2920.field1850[this.field2927]);
				} else {
					this.field2927 = (int)(Math.random() * (double)this.field2920.method1145());
				}
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;", opaqueValue = "-425402190")
	protected final class384 method2515() {
		int var3;
		if (null != this.field2920) {
			int var2 = Client.field330 - this.field2928;
			if (var2 > 100 && this.field2920.field1843 > 0) {
				var2 = 100;
			}

			if (this.field2920.method1148()) {
				var3 = this.field2920.method1145();
				this.field2927 += var2;
				var2 = 0;
				if (this.field2927 >= var3) {
					this.field2927 = var3 - this.field2920.field1843;
					if (this.field2927 < 0 || this.field2927 > var3) {
						this.field2920 = null;
					}
				}
			} else {
				label69: {
					do {
						do {
							if (var2 <= this.field2920.field1850[this.field2927]) {
								break label69;
							}

							var2 -= this.field2920.field1850[this.field2927];
							++this.field2927;
						} while(this.field2927 < this.field2920.field1839.length);

						this.field2927 -= this.field2920.field1843;
					} while(this.field2927 >= 0 && this.field2927 < this.field2920.field1839.length);

					this.field2920 = null;
				}
			}

			this.field2928 = Client.field330 - var2;
		}

		class292 var13 = class185.method1043(this.field2923, (byte)42);
		if (var13.field2365 != null) {
			var13 = var13.method1614();
		}

		if (null == var13) {
			return null;
		} else {
			int var4;
			if (this.field2922 != 1 && this.field2922 != 3) {
				var3 = var13.field2339;
				var4 = var13.field2324;
			} else {
				var3 = var13.field2324;
				var4 = var13.field2339;
			}

			int var5 = this.field2924 + (var3 >> 1);
			int var6 = (var3 + 1 >> 1) + this.field2924;
			int var7 = this.field2925 + (var4 >> 1);
			int var8 = this.field2925 + (var4 + 1 >> 1);
			int[][] var9 = class411.field3172[this.field2926];
			int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
			int var11 = (this.field2924 << 7) + (var3 << 6);
			int var12 = (this.field2925 << 7) + (var4 << 6);
			return var13.method1612(this.field2921, this.field2922, var9, var11, var10, var12, this.field2920, this.field2927);
		}
	}

	@ObfInfo(name = "ab", desc = "(ILdh;ZI)I", opaqueValue = "-173700764")
	static int method2029(int var0, class333 var1, boolean var2) {
		class131 var4 = var2 ? class241.field2007 : class95.field959;
		if (var0 == 1700) {
			class175.field1621[++class293.field2375 - 1] = var4.field1342;
			return 1;
		} else if (var0 == 1701) {
			if (var4.field1342 != -1) {
				class175.field1621[++class293.field2375 - 1] = var4.field1343;
			} else {
				class175.field1621[++class293.field2375 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			class175.field1621[++class293.field2375 - 1] = var4.field1333;
			return 1;
		} else if (var0 == 1707) {
			class175.field1621[++class293.field2375 - 1] = var4.method748() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class175.method1003(var4);
		} else {
			return var0 == 1709 ? class175.method1013(var4) : 2;
		}
	}
}
