public class class241 extends class538 {
	int field2211;
	int field2212;
	// $FF: synthetic field
	final class464 this$0;

	class241(class464 var1) {
		this.this$0 = var1;
	}

	void method2583(class42 var1) {
		this.field2212 = var1.method282();
		this.field2211 = var1.method282();
	}

	void method2582(class379 var1) {
		var1.method2017(this.field2212, this.field2211);
	}

	static final void method1383(String var0, int var1) {
		class160 var3 = class85.method556(class129.field1250, Client.field68.field2426);
		var3.field1483.method267(class431.method2196(var0) + 1);
		var3.field1483.method267(var1);
		var3.field1483.method270(var0);
		Client.field68.method1570(var3);
	}

	static int method1382(int var0, class167 var1, boolean var2) {
		if (var0 == 5306) {
			class139.field1344[++class203.field1903 - 1] = class185.method1022();
			return 1;
		} else {
			int var4;
			if (var0 == 5307) {
				var4 = class139.field1344[--class203.field1903];
				if (var4 == 1 || var4 == 2) {
					class295.method1680(var4);
				}

				return 1;
			} else if (var0 == 5308) {
				class139.field1344[++class203.field1903 - 1] = class176.field1701.method2503();
				return 1;
			} else if (var0 != 5309) {
				if (var0 == 5310) {
					--class203.field1903;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = class139.field1344[--class203.field1903];
				if (var4 == 1 || var4 == 2) {
					class176.field1701.method2502(var4);
				}

				return 1;
			}
		}
	}

	static void method1381(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < class358.field3039; ++var5) {
			class210 var6 = class67.method492(var5);
			if ((!var1 || var6.field1982) && var6.field1945 == -1 && var6.field1954.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					class15.field384 = -1;
					class89.field887 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[2 * var3.length];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		class89.field887 = var3;
		class66.field808 = 0;
		class15.field384 = var4;
		String[] var9 = new String[class15.field384];

		for (int var10 = 0; var10 < class15.field384; ++var10) {
			var9[var10] = class67.method492(var3[var10]).field1954;
		}

		short[] var11 = class89.field887;
		class208.method1174(var9, var11, 0, var9.length - 1);
	}
}
