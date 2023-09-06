public class class534 extends class462 {
	boolean field4269;
	int field4268;
	int field4270;

	class534() {
		this.field4269 = false;
	}

	public static int method2573(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	static int method2571(int var0, class167 var1, boolean var2) {
		class60 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
		} else {
			var4 = var2 ? class491.field4134 : class52.field599;
		}

		class185.method1024(var4);
		int var5;
		int var6;
		if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
			if (var0 == 1201) {
				var4.field686 = 2;
				var4.field687 = class139.field1344[--class203.field1903];
				return 1;
			} else if (var0 == 1202) {
				var4.field686 = 3;
				var4.field687 = class82.field863.field2523.method1958();
				return 1;
			} else if (var0 == 1207) {
				boolean var8 = class139.field1344[--class203.field1903] == 1;
				class90.method610(var4, class82.field863.field2523, var8);
				return 1;
			} else if (var0 == 1208) {
				var5 = class139.field1344[--class203.field1903];
				if (var4.field700 == null) {
					throw new RuntimeException("");
				} else {
					class141.method842(var4, var5);
					return 1;
				}
			} else if (var0 == 1209) {
				class203.field1903 -= 2;
				var5 = class139.field1344[class203.field1903];
				var6 = class139.field1344[class203.field1903 + 1];
				if (null == var4.field700) {
					throw new RuntimeException("");
				} else {
					class38.method251(var4, var5, var6);
					return 1;
				}
			} else if (var0 == 1210) {
				var5 = class139.field1344[--class203.field1903];
				if (var4.field700 == null) {
					throw new RuntimeException("");
				} else {
					class540.method2587(var4, class82.field863.field2523.field3054, var5);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class203.field1903 -= 2;
			var5 = class139.field1344[class203.field1903];
			var6 = class139.field1344[class203.field1903 + 1];
			var4.field772 = var5;
			var4.field773 = var6;
			class210 var7 = class67.method492(var5);
			var4.field694 = var7.field1930;
			var4.field712 = var7.field1946;
			var4.field759 = var7.field1932;
			var4.field692 = var7.field1931;
			var4.field766 = var7.field1948;
			var4.field697 = var7.field1953;
			if (var0 == 1205) {
				var4.field703 = 0;
			} else if (var0 == 1212 | var7.field1949 == 1) {
				var4.field703 = 1;
			} else {
				var4.field703 = 2;
			}

			if (var4.field698 > 0) {
				var4.field697 = var4.field697 * 32 / var4.field698;
			} else if (var4.field655 > 0) {
				var4.field697 = var4.field697 * 32 / var4.field655;
			}

			return 1;
		}
	}

	static void method2572() {
		if (Client.field142 >= 0 && null != Client.field176[Client.field142]) {
			class366.method1968(Client.field176[Client.field142], false);
		}

	}

	static int method2570(int var0, class167 var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = class139.field1344[--class203.field1903] == 1;
			class24.method194(var4);
			return 1;
		} else {
			return 2;
		}
	}
}
