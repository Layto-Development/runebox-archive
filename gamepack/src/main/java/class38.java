public final class class38 {
	static byte[][][] field513;
	static class342 field502;
	static int field501;
	static int field503;
	static int field510;
	static int field515;
	static int[] field505;
	static int[][][] field511;
	static short[][][] field504;
	static final int[] field506;
	static final int[] field507;
	static final int[] field508;
	static final int[] field509;
	static final int[] field512;
	static final int[] field514;

	static {
		field511 = new int[4][105][105];
		field513 = new byte[4][104][104];
		field503 = 99;
		field506 = new int[]{1, 2, 4, 8};
		field507 = new int[]{16, 32, 64, 128};
		field508 = new int[]{1, 0, -1, 0};
		field509 = new int[]{0, -1, 0, 1};
		field514 = new int[]{1, -1, -1, 1};
		field512 = new int[]{-1, -1, 1, 1};
		field510 = (int)(Math.random() * 17.0D) - 8;
		field515 = (int)(Math.random() * 33.0D) - 16;
	}

	class38() throws Throwable {
	}

	static final int method250(int var0, int var1, int var2, int var3) {
		return var2 * var0 - var3 * var1 >> 16;
	}

	static class334[] method252() {
		return new class334[]{class334.field2925, class334.field2927, class334.field2926};
	}

	public static class115 method253(class215 var0, int var1, int var2) {
		return !class85.method558(var0, var1, var2) ? null : class73.method517();
	}

	static final void method248(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class317 var8, class76[] var9) {
		class42 var10 = new class42(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method291();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.method325();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.method278();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					class235 var21 = class96.method638(var11, (byte)-48);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.field2121;
					int var28 = var21.field2106;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var2 + var23;
					int var30 = var3 + class534.method2573(var16 & 7, var15 & 7, var7, var21.field2121, var21.field2106, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((field513[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						class76 var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						class224.method1264(var1, var29, var30, var11, var7 + var20 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	public static void method251(class60 var0, int var1, int var2) {
		var0.field700.field3053[var1] = var2;
		var0.field700.method1959();
	}

	static final void method249() {
		class480.method2395();
		class32.field477.method1887();
		class529.method2558();
		class521.method2531();
		class375.field3146.method1887();
		class375.field3152.method1887();
		class210.field1935.method1887();
		class210.field1980.method1887();
		class210.field1937.method1887();
		class393.field3299.method1887();
		class393.field3290.method1887();
		class393.field3298.method1887();
		class409.field3413.method1887();
		class409.field3414.method1887();
		class82.field857.method1887();
		class243.field2216.method1887();
		class164.field1604.method2253();
		class430.field3535.method2253();
		class246.method1435();
		class190.field1759.method1887();
		class190.field1760.method1887();
		class63.field807.method1887();
		class525.method2541();
		class96.field959.method1887();
		class466.method2282();
		class426.method2179();
		Client.field199.method1887();
		Client.field89.method1887();
		class363.field3062.method1887();
		class72.method514();
		((class348)class133.field1293.field389).method1914();
		class167.field1619.method1887();
		Client.field294.method2099();
		class94.field932.method1227();
		class174.field1690.method1227();
		class154.field1451.method1227();
		class15.field383.method1227();
		class286.field2521.method1227();
		class465.field3998.method1227();
		class445.field3911.method1227();
		class337.field2945.method1227();
		class39.field516.method1227();
		class371.field3106.method1227();
		class79.field843.method1227();
		class522.field4234.method1227();
		class138.field1330.method1227();
	}
}
