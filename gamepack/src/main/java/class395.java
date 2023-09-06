public class class395 {
	static class168 field3318;
	static class342 field3319;
	public byte field3321;
	public class440 field3320;
	public int field3322;

	class395() {
	}

	static final int method2070(int var0, int var1, int var2, int var3) {
		return var1 * var2 + var0 * var3 >> 16;
	}

	static int method2068(int var0) {
		class445 var2 = (class445)class41.field521.method2543((long)var0);
		if (null == var2) {
			return -1;
		} else {
			return var2.field2030 == class41.field522.field2509 ? -1 : ((class445)var2.field2030).field3907;
		}
	}

	static final void method2071(class163 var0) {
		int var3;
		int var4;
		int var5;
		int var7;
		if (var0.field1560 != -1) {
			Object var2 = null;
			var3 = 65536;
			if (var0.field1560 < var3) {
				var2 = Client.field63[var0.field1560];
			} else {
				var2 = Client.field176[var0.field1560 - var3];
			}

			if (var2 != null) {
				var4 = var0.field1555 - ((class163)var2).field1555;
				var5 = var0.field1526 - ((class163)var2).field1526;
				if (var4 != 0 || var5 != 0) {
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047;
					var0.field1566 = var7;
				}
			} else if (var0.field1530) {
				var0.field1560 = -1;
				var0.field1530 = false;
			}
		}

		int var8;
		if (var0.field1573 == 0 || var0.field1599 > 0) {
			var8 = -1;
			if (var0.field1563 != -1 && var0.field1564 != -1) {
				var3 = 64 + (var0.field1563 * 128 - class296.field2735 * 128);
				var4 = var0.field1564 * 128 - class164.field1606 * 128 + 64;
				var5 = var0.field1555 - var3;
				int var6 = var0.field1526 - var4;
				if (var5 != 0 || var6 != 0) {
					var7 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167D) & 2047;
					var8 = var7;
				}
			} else if (var0.field1562 != -1) {
				var8 = var0.field1562;
			}

			if (var8 != -1) {
				var0.field1566 = var8;
				if (var0.field1565) {
					var0.field1527 = var0.field1566;
				}
			}

			var0.method908();
		}

		var8 = var0.field1566 - var0.field1527 & 2047;
		if (var8 != 0) {
			boolean var9 = true;
			boolean var10 = true;
			++var0.field1567;
			var5 = var8 > 1024 ? -1 : 1;
			var0.field1527 += var0.field1594 * var5;
			boolean var11 = true;
			if (var8 < var0.field1594 || var8 > 2048 - var0.field1594) {
				var0.field1527 = var0.field1566;
				var11 = false;
			}

			if (var0.field1594 > 0 && var0.field1538 == var0.field1531 && (var0.field1567 > 25 || var11)) {
				if (var5 == -1 && var0.field1532 != -1) {
					var0.field1538 = var0.field1532;
				} else if (var5 == 1 && var0.field1593 != -1) {
					var0.field1538 = var0.field1593;
				} else {
					var0.field1538 = var0.field1534;
				}
			}

			var0.field1527 &= 2047;
		} else {
			if (var0.field1530) {
				var0.field1560 = -1;
				var0.field1530 = false;
			}

			var0.field1567 = 0;
		}

	}

	static final void method2069(class60 var0) {
		String var2;
		int var3;
		int var4;
		if (var0.field647 == 1) {
			var2 = var0.field695;
			var3 = var0.field644;
			var4 = var0.field772;
			class69.method504(var2, "", 24, 0, 0, var3, var4, false);
		}

		int var5;
		String var12;
		if (var0.field647 == 2 && !Client.field95) {
			var2 = class58.method426(var0);
			if (var2 != null) {
				var12 = class394.method2064(65280) + var0.field752;
				var4 = var0.field644;
				var5 = var0.field772;
				class69.method504(var2, var12, 25, 0, -1, var4, var5, false);
			}
		}

		if (var0.field647 == 3) {
			class465.method2277(class433.field3785, "", 26, 0, 0, var0.field644);
		}

		if (var0.field647 == 4) {
			class465.method2277(var0.field695, "", 28, 0, 0, var0.field644);
		}

		if (var0.field647 == 5) {
			class465.method2277(var0.field695, "", 29, 0, 0, var0.field644);
		}

		if (var0.field647 == 6 && Client.field180 == null) {
			class465.method2277(var0.field695, "", 30, 0, -1, var0.field644);
		}

		if (var0.field724) {
			int var6;
			int var7;
			int var8;
			String var13;
			String var15;
			if (Client.field95) {
				var3 = class447.method2235(var0);
				boolean var10 = (var3 >> 21 & 1) != 0;
				if (var10 && (class306.field2773 & 32) == 32) {
					var13 = Client.field186;
					var15 = Client.field197 + " " + class278.field2468 + " " + var0.field648;
					var6 = var0.field763;
					var7 = var0.field644;
					var8 = var0.field772;
					class69.method504(var13, var15, 58, 0, var6, var7, var8, false);
				}
			} else {
				for (int var11 = 9; var11 >= 5; --var11) {
					var5 = class447.method2235(var0);
					boolean var14 = (var5 >> var11 + 1 & 1) != 0;
					if (!var14 && null == var0.field747) {
						var12 = null;
					} else if (null != var0.field722 && var0.field722.length > var11 && null != var0.field722[var11] && var0.field722[var11].trim().length() != 0) {
						var12 = var0.field722[var11];
					} else {
						var12 = null;
					}

					if (null != var12) {
						var15 = var0.field648;
						var6 = var11 + 1;
						var7 = var0.field763;
						var8 = var0.field644;
						int var9 = var0.field772;
						class69.method504(var12, var15, 1007, var6, var7, var8, var9, false);
					}
				}

				var2 = class58.method426(var0);
				if (var2 != null) {
					var12 = var0.field648;
					var4 = var0.field763;
					var5 = var0.field644;
					var6 = var0.field772;
					class69.method504(var2, var12, 25, 0, var4, var5, var6, false);
				}

				for (var3 = 4; var3 >= 0; --var3) {
					var6 = class447.method2235(var0);
					boolean var17 = (var6 >> var3 + 1 & 1) != 0;
					if (!var17 && var0.field747 == null) {
						var13 = null;
					} else if (null != var0.field722 && var0.field722.length > var3 && null != var0.field722[var3] && var0.field722[var3].trim().length() != 0) {
						var13 = var0.field722[var3];
					} else {
						var13 = null;
					}

					if (var13 != null) {
						class69.method504(var13, var0.field648, 57, var3 + 1, var0.field763, var0.field644, var0.field772, var0.field788);
					}
				}

				var4 = class447.method2235(var0);
				boolean var16 = (var4 & 1) != 0;
				if (var16) {
					class465.method2277(class433.field3546, "", 30, 0, var0.field763, var0.field644);
				}
			}
		}

	}
}
