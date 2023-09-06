public class class517 extends class538 {
	static class115[] field4223;
	static int[] field4221;
	String field4222;
	// $FF: synthetic field
	final class464 this$0;

	class517(class464 var1) {
		this.this$0 = var1;
	}

	void method2583(class42 var1) {
		this.field4222 = var1.method286();
		var1.method282();
	}

	void method2582(class379 var1) {
		var1.field3208 = this.field4222;
	}

	public static void method2524(class215 var0, class215 var1) {
		class190.field1758 = var0;
		class519.field4225 = var1;
	}

	static void method2523(int var0, int var1, int var2, class235 var3, int var4) {
		class154 var6 = new class154();
		var6.field1436 = var0;
		var6.field1437 = var1 * 128;
		var6.field1449 = var2 * 128;
		int var7 = var3.field2121;
		int var8 = var3.field2106;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.field2106;
			var8 = var3.field2121;
		}

		var6.field1439 = 128 * (var7 + var1);
		var6.field1440 = (var2 + var8) * 128;
		var6.field1442 = var3.field2150;
		var6.field1441 = var3.field2151 * 128;
		var6.field1446 = var3.field2152;
		var6.field1444 = var3.field2153;
		var6.field1445 = var3.field2144;
		if (null != var3.field2147) {
			var6.field1448 = var3;
			var6.method883();
		}

		class154.field1438.method567(var6);
		if (null != var6.field1445) {
			var6.field1452 = var6.field1446 + (int)(Math.random() * (double)(var6.field1444 - var6.field1446));
		}

	}

	static final void method2520(class60[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class60 var4 = var0[var3];
			if (null != var4 && var1 == var4.field661 && (!var4.field724 || !class538.method2584(var4))) {
				int var6;
				if (var4.field646 == 0) {
					if (!var4.field724 && class538.method2584(var4) && class464.field3990 != var4) {
						continue;
					}

					method2520(var0, var4.field644);
					if (var4.field776 != null) {
						method2520(var4.field776, var4.field644);
					}

					class534 var5 = (class534)Client.field24.method1492((long)var4.field644);
					if (null != var5) {
						var6 = var5.field4270;
						if (class292.method1669(var6)) {
							method2520(class160.field1484[var6], -1);
						}
					}
				}

				if (var4.field646 == 6) {
					if (var4.field690 != -1 || var4.field764 != -1) {
						boolean var9 = class240.method1378(var4);
						if (var9) {
							var6 = var4.field764;
						} else {
							var6 = var4.field690;
						}

						if (var6 != -1) {
							class393 var7 = class114.method702(var6);
							if (!var7.method2062()) {
								for (var4.field775 += Client.field82; var4.field775 > var7.field3307[var4.field774]; class185.method1024(var4)) {
									var4.field775 -= var7.field3307[var4.field774];
									++var4.field774;
									if (var4.field774 >= var7.field3296.length) {
										var4.field774 -= var7.field3300;
										if (var4.field774 < 0 || var4.field774 >= var7.field3296.length) {
											var4.field774 = 0;
										}
									}
								}
							} else {
								var4.field774 += Client.field82;
								int var8 = var7.method2059();
								if (var4.field774 >= var8) {
									var4.field774 -= var7.field3300;
									if (var4.field774 < 0 || var4.field774 >= var8) {
										var4.field774 = 0;
									}
								}

								class185.method1024(var4);
							}
						}
					}

					if (var4.field735 != 0 && !var4.field724) {
						int var10 = var4.field735 >> 16;
						var6 = var4.field735 << 16 >> 16;
						var10 *= Client.field82;
						var6 *= Client.field82;
						var4.field694 = var4.field694 + var10 & 2047;
						var4.field712 = var6 + var4.field712 & 2047;
						class185.method1024(var4);
					}
				}
			}
		}

	}
}
