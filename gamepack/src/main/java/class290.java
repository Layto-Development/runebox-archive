public class class290 implements class367 {
	static class124 field2580;
	static final class290 field2582;
	final int field2579;
	public final int field2581;

	static {
		field2582 = new class290(0, 0);
	}

	class290(int var1, int var2) {
		this.field2581 = var1;
		this.field2579 = var2;
	}

	public int method1970() {
		return this.field2579;
	}

	static int method1666(int var0, class167 var1, boolean var2) {
		return 2;
	}

	static final void method1665(class60 var0, int var1, int var2, int var3) {
		class77.method535();
		class420 var5 = var0.method444(false);
		if (var5 != null) {
			class266.method1555(var1, var2, var1 + var5.field3506, var2 + var5.field3505);
			if (Client.field256 != 2 && Client.field256 != 5) {
				int var6 = Client.field181 & 2047;
				int var7 = class82.field863.field1555 / 32 + 48;
				int var8 = 464 - class82.field863.field1526 / 32;
				class268.field2420.method725(var1, var2, var5.field3506, var5.field3505, var7, var8, var6, 256, var5.field3508, var5.field3507);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < Client.field250; ++var9) {
					var10 = Client.field251[var9] * 4 + 2 - class82.field863.field1555 / 32;
					var11 = 2 + 4 * Client.field252[var9] - class82.field863.field1526 / 32;
					class257.method1509(var1, var2, var10, var11, Client.field261[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						class86 var17 = Client.field143[class358.field3038][var9][var10];
						if (var17 != null) {
							var12 = 2 + var9 * 4 - class82.field863.field1555 / 32;
							var13 = 2 + var10 * 4 - class82.field863.field1526 / 32;
							class257.method1509(var1, var2, var12, var13, class207.field1912[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < Client.field64; ++var9) {
					class102 var15 = Client.field63[Client.field2[var9]];
					if (var15 != null && var15.method899()) {
						class375 var18 = var15.field1018;
						if (null != var18 && null != var18.field3177) {
							var18 = var18.method2001();
						}

						if (null != var18 && var18.field3172 && var18.field3183) {
							var12 = var15.field1555 / 32 - class82.field863.field1555 / 32;
							var13 = var15.field1526 / 32 - class82.field863.field1526 / 32;
							class257.method1509(var1, var2, var12, var13, class207.field1912[1], var5);
						}
					}
				}

				var9 = class481.field4085;
				int[] var16 = class481.field4086;

				for (var11 = 0; var11 < var9; ++var11) {
					class287 var19 = Client.field176[var16[var11]];
					if (var19 != null && var19.method899() && !var19.field2542 && var19 != class82.field863) {
						var13 = var19.field1555 / 32 - class82.field863.field1555 / 32;
						int var14 = var19.field1526 / 32 - class82.field863.field1526 / 32;
						if (var19.method1632()) {
							class257.method1509(var1, var2, var13, var14, class207.field1912[3], var5);
						} else if (class82.field863.field2549 != 0 && var19.field2549 != 0 && var19.field2549 == class82.field863.field2549) {
							class257.method1509(var1, var2, var13, var14, class207.field1912[4], var5);
						} else if (var19.method1635()) {
							class257.method1509(var1, var2, var13, var14, class207.field1912[5], var5);
						} else if (var19.method1642()) {
							class257.method1509(var1, var2, var13, var14, class207.field1912[6], var5);
						} else {
							class257.method1509(var1, var2, var13, var14, class207.field1912[2], var5);
						}
					}
				}

				if (Client.field81 != 0 && Client.field306 % 20 < 10) {
					if (Client.field81 == 1 && Client.field25 >= 0 && Client.field25 < Client.field63.length) {
						class102 var20 = Client.field63[Client.field25];
						if (null != var20) {
							var12 = var20.field1555 / 32 - class82.field863.field1555 / 32;
							var13 = var20.field1526 / 32 - class82.field863.field1526 / 32;
							class46.method348(var1, var2, var12, var13, class445.field3912[1], var5);
						}
					}

					if (Client.field81 == 2) {
						var11 = Client.field27 * 4 - class296.field2735 * 4 + 2 - class82.field863.field1555 / 32;
						var12 = 2 + (Client.field170 * 4 - class164.field1606 * 4) - class82.field863.field1526 / 32;
						class46.method348(var1, var2, var11, var12, class445.field3912[1], var5);
					}

					if (Client.field81 == 10 && Client.field44 >= 0 && Client.field44 < Client.field176.length) {
						class287 var21 = Client.field176[Client.field44];
						if (null != var21) {
							var12 = var21.field1555 / 32 - class82.field863.field1555 / 32;
							var13 = var21.field1526 / 32 - class82.field863.field1526 / 32;
							class46.method348(var1, var2, var12, var13, class445.field3912[1], var5);
						}
					}
				}

				if (Client.field254 != 0) {
					var11 = Client.field254 * 4 + 2 - class82.field863.field1555 / 32;
					var12 = Client.field177 * 4 + 2 - class82.field863.field1526 / 32;
					class257.method1509(var1, var2, var11, var12, class445.field3912[0], var5);
				}

				if (!class82.field863.field2542) {
					class266.method1548(var1 + var5.field3506 / 2 - 1, var2 + var5.field3505 / 2 - 1, 3, 3, 16777215);
				}
			} else {
				class266.method1556(var1, var2, 0, var5.field3508, var5.field3507);
			}

			Client.field226[var3] = true;
		}
	}
}
