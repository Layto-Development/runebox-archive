import java.util.ArrayList;
import java.util.Iterator;

public class class81 extends class462 {
	class164 field855;

	public class81() {
		this.field855 = null;
	}

	class81(class374 var1) {
		if (var1 != null) {
			this.field855 = new class164(var1, (class352)null);
		}
	}

	public class81(class352 var1) {
		this.field855 = new class164((class374)null, var1);
	}

	public boolean method539(byte var1) {
		boolean var10000;
		if (null == this.field855) {
			if (var1 == -1) {
				throw new IllegalStateException();
			}

			var10000 = true;
		} else {
			var10000 = false;
		}

		return var10000;
	}

	public class352 method544() {
		if (null != this.field855 && this.field855.field1603.tryLock()) {
			class352 var2;
			try {
				var2 = this.method537();
			} finally {
				this.field855.field1603.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	public class352 method541() {
		if (this.field855 != null) {
			this.field855.field1603.lock();

			class352 var2;
			try {
				var2 = this.method537();
			} finally {
				this.field855.field1603.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	class352 method537() {
		if (this.field855.field1602 == null) {
			this.field855.field1602 = this.field855.field1607.method1994((int[])null);
			this.field855.field1607 = null;
		}

		return this.field855.field1602;
	}

	public static void method545(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class92.field910.clear();
			class92.field905.clear();
			class518.method2525(var5);
			class295.method1678(var0, var5);
			if (!class92.field910.isEmpty()) {
				class295.method1677(var1, var2, var3, var4);
				class92.field905.add(new class233((class232)null));
				class92.field905.add(new class46((class232)null, class92.field898, class92.field899, class92.field902));
				ArrayList var7 = new ArrayList();
				var7.add(new class216(new class200((class232)null, 0, true, class92.field900)));
				if (!class92.field903.isEmpty()) {
					ArrayList var8 = new ArrayList();
					var8.add(new class495(new class181((class232)null, var7), class92.field909));
					ArrayList var10 = new ArrayList();
					Iterator var11 = class92.field903.iterator();

					while (var11.hasNext()) {
						class104 var12 = (class104)var11.next();
						var10.add(var12);
					}

					var8.add(new class495(new class16(new class99((class232)null, var10), 0, false, class92.field908), class92.field907));
					class92.field905.add(new class181((class232)null, var8));
				} else {
					class92.field905.add(new class495((class232)null, class92.field909));
					class92.field905.add(new class181((class232)null, var7));
				}

			}
		}
	}

	static final void method540(class347 var0, int var1, class287 var2, int var3) {
		byte var5 = class394.field3312.field3315;
		int var6;
		if ((var3 & 8) != 0) {
			var6 = var0.method278();
			byte[] var7 = new byte[var6];
			class42 var8 = new class42(var7);
			var0.method332(var7, 0, var6);
			class481.field4093[var1] = var8;
			var2.method1631(var8);
		}

		int var9;
		int var10;
		int var17;
		int var19;
		if ((var3 & 65536) != 0) {
			var6 = var0.method278();

			for (var17 = 0; var17 < var6; ++var17) {
				var19 = var0.method299();
				var9 = var0.method307();
				var10 = var0.method282();
				var2.method902(var19, var9, var10 >> 16, var10 & 65535);
			}
		}

		if ((var3 & 64) != 0) {
			var2.field1562 = var0.method307();
			if (var2.field1573 == 0) {
				var2.field1566 = var2.field1562;
				var2.method908();
			}
		}

		if ((var3 & 16) != 0) {
			var2.field1560 = var0.method307();
			var2.field1560 += var0.method299() << 16;
			var6 = 16777215;
			if (var2.field1560 == var6) {
				var2.field1560 = -1;
			}
		}

		int var11;
		int var12;
		if ((var3 & 4096) != 0) {
			var6 = var0.method307();
			var17 = var6 >> 8;
			var19 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
			class397 var22 = (class397)class451.method2249(class18.method154(), var0.method299());
			boolean var25 = var0.method278() == 1;
			var11 = var0.method338();
			var12 = var0.field527;
			if (null != var2.field2539 && null != var2.field2523) {
				boolean var13 = false;
				if (var22.field3332 && class316.field2827.method1164(var2.field2539)) {
					var13 = true;
				}

				if (!var13 && Client.field128 == 0 && !var2.field2542) {
					class481.field4082.field527 = 0;
					var0.method332(class481.field4082.field525, 0, var11);
					class481.field4082.field527 = 0;
					String var14 = class228.method1305(class12.method117(class53.method388(class481.field4082)));
					var2.field1596 = var14.trim();
					var2.field1550 = var6 >> 8;
					var2.field1551 = var6 & 255;
					var2.field1549 = 150;
					byte[] var15 = null;
					int var16;
					if (var19 > 0 && var19 <= 8) {
						var15 = new byte[var19];

						for (var16 = 0; var16 < var19; ++var16) {
							var15[var16] = var0.method302();
						}
					}

					var2.field1592 = class36.method242(var15);
					var2.field1547 = var25;
					var2.field1548 = class82.field863 != var2 && var22.field3332 && !Client.field31.isEmpty() && var14.toLowerCase().indexOf(Client.field31) == -1;
					if (var22.field3348) {
						var16 = var25 ? 91 : 1;
					} else {
						var16 = var25 ? 90 : 2;
					}

					if (var22.field3347 != -1) {
						class184.method1019(var16, class249.method1447(var22.field3347) + var2.field2539.method2214(), var14);
					} else {
						class184.method1019(var16, var2.field2539.method2214(), var14);
					}
				}
			}

			var0.field527 = var19 + var11 + var12;
		}

		int var29;
		if ((var3 & 32) != 0) {
			var6 = var0.method306();
			class397 var20 = (class397)class451.method2249(class18.method154(), var0.method338());
			boolean var21 = var0.method338() == 1;
			var9 = var0.method278();
			var10 = var0.field527;
			if (var2.field2539 != null && var2.field2523 != null) {
				boolean var26 = false;
				if (var20.field3332 && class316.field2827.method1164(var2.field2539)) {
					var26 = true;
				}

				if (!var26 && Client.field128 == 0 && !var2.field2542) {
					class481.field4082.field527 = 0;
					var0.method332(class481.field4082.field525, 0, var9);
					class481.field4082.field527 = 0;
					String var28 = class228.method1305(class12.method117(class53.method388(class481.field4082)));
					var2.field1596 = var28.trim();
					var2.field1550 = var6 >> 8;
					var2.field1551 = var6 & 255;
					var2.field1549 = 150;
					var2.field1592 = null;
					var2.field1547 = var21;
					var2.field1548 = class82.field863 != var2 && var20.field3332 && !Client.field31.isEmpty() && var28.toLowerCase().indexOf(Client.field31) == -1;
					if (var20.field3348) {
						var29 = var21 ? 91 : 1;
					} else {
						var29 = var21 ? 90 : 2;
					}

					if (var20.field3347 != -1) {
						class184.method1019(var29, class249.method1447(var20.field3347) + var2.field2539.method2214(), var28);
					} else {
						class184.method1019(var29, var2.field2539.method2214(), var28);
					}
				}
			}

			var0.field527 = var9 + var10;
		}

		if ((var3 & 4) != 0) {
			var6 = var0.method278();
			if (var6 > 0) {
				for (var17 = 0; var17 < var6; ++var17) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var19 = var0.method325();
					if (var19 == 32767) {
						var19 = var0.method325();
						var10 = var0.method325();
						var9 = var0.method325();
						var11 = var0.method325();
					} else if (var19 != 32766) {
						var10 = var0.method325();
					} else {
						var19 = -1;
					}

					var12 = var0.method325();
					var2.method905(var19, var10, var9, var11, Client.field306, var12);
				}
			}

			var17 = var0.method278();
			if (var17 > 0) {
				for (var19 = 0; var19 < var17; ++var19) {
					var9 = var0.method325();
					var10 = var0.method325();
					if (var10 != 32767) {
						var11 = var0.method325();
						var12 = var0.method299();
						var29 = var10 > 0 ? var0.method278() : var12;
						var2.method901(var9, Client.field306, var10, var11, var12, var29);
					} else {
						var2.method906(var9);
					}
				}
			}
		}

		if ((var3 & 512) != 0) {
			var2.field1577 = var0.method302();
			var2.field1579 = var0.method293();
			var2.field1575 = var0.method279();
			var2.field1545 = var0.method279();
			var2.field1581 = var0.method306() + Client.field306;
			var2.field1582 = var0.method306() + Client.field306;
			var2.field1583 = var0.method307();
			if (var2.field2548) {
				var2.field1577 += var2.field2544;
				var2.field1579 += var2.field2550;
				var2.field1575 += var2.field2544;
				var2.field1545 += var2.field2550;
				var2.field1573 = 0;
			} else {
				var2.field1577 += var2.field1600[0];
				var2.field1579 += var2.field1597[0];
				var2.field1575 += var2.field1600[0];
				var2.field1545 += var2.field1597[0];
				var2.field1573 = 1;
			}

			var2.field1589 = 0;
		}

		if ((var3 & 2048) != 0) {
			class394[] var18 = class481.field4083;
			class394[] var27 = new class394[]{class394.field3312, class394.field3313, class394.field3314, class394.field3317};
			var18[var1] = (class394)class451.method2249(var27, var0.method279());
		}

		if ((var3 & 128) != 0) {
			var2.field1596 = var0.method286();
			if (var2.field1596.charAt(0) == '~') {
				var2.field1596 = var2.field1596.substring(1);
				class184.method1019(2, var2.field2539.method2214(), var2.field1596);
			} else if (class82.field863 == var2) {
				class184.method1019(2, var2.field2539.method2214(), var2.field1596);
			}

			var2.field1547 = false;
			var2.field1550 = 0;
			var2.field1551 = 0;
			var2.field1549 = 150;
		}

		if ((var3 & 16384) != 0) {
			var2.field1586 = Client.field306 + var0.method305();
			var2.field1528 = Client.field306 + var0.method305();
			var2.field1588 = var0.method302();
			var2.field1546 = var0.method301();
			var2.field1540 = var0.method293();
			var2.field1578 = (byte)var0.method338();
		}

		if ((var3 & 8192) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var2.field2526[var6] = var0.method286();
			}
		}

		if ((var3 & 1024) != 0) {
			var5 = var0.method279();
		}

		if ((var3 & 2) != 0) {
			var6 = var0.method327();
			if (var6 == 65535) {
				var6 = -1;
			}

			var17 = var0.method299();
			class392.method2050(var2, var6, var17);
		}

		if (var2.field2548) {
			if (var5 == 127) {
				var2.method1641(var2.field2544, var2.field2550);
			} else {
				class394 var23;
				if (class394.field3312.field3315 != var5) {
					class394[] var24 = new class394[]{class394.field3312, class394.field3313, class394.field3314, class394.field3317};
					var23 = (class394)class451.method2249(var24, var5);
				} else {
					var23 = class481.field4083[var1];
				}

				var2.method1644(var2.field2544, var2.field2550, var23);
			}
		}

	}

	static final byte[] method538(byte[] var0) {
		class42 var2 = new class42(var0);
		int var3 = var2.method278();
		int var4 = var2.method282();
		if (var4 >= 0 && (class215.field2022 == 0 || var4 <= class215.field2022)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.method288(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.method282();
				if (var5 < 0 || class215.field2022 != 0 && var5 > class215.field2022) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						class328.method1840(var6, var5, var0, var4, 9);
					} else {
						class215.field2023.method2037(var2, var6);
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	static void method543() {
		if (class98.method647()) {
			class116.field1111 = true;
			class116.field1113 = 0;
			class116.field1118 = 0;
		}

	}

	static int method546(int var0, class167 var1, boolean var2) {
		return 2;
	}

	static final boolean method542(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = Client.field196[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}
}
