public abstract class class163 extends class480 {
	boolean field1530;
	boolean field1533;
	boolean field1547;
	boolean field1548;
	boolean field1565;
	byte field1540;
	byte field1546;
	byte field1553;
	byte field1578;
	byte field1588;
	class394[] field1598;
	class526 field1591;
	class55 field1559;
	int field1525;
	int field1526;
	int field1527;
	int field1528;
	int field1529;
	int field1531;
	int field1532;
	int field1534;
	int field1535;
	int field1536;
	int field1538;
	int field1539;
	int field1541;
	int field1542;
	int field1543;
	int field1544;
	int field1545;
	int field1549;
	int field1550;
	int field1551;
	int field1552;
	int field1555;
	int field1560;
	int field1561;
	int field1562;
	int field1563;
	int field1564;
	int field1566;
	int field1567;
	int field1568;
	int field1569;
	int field1570;
	int field1571;
	int field1572;
	int field1573;
	int field1574;
	int field1575;
	int field1576;
	int field1577;
	int field1579;
	int field1580;
	int field1581;
	int field1582;
	int field1583;
	int field1584;
	int field1585;
	int field1586;
	int field1587;
	int field1589;
	int field1590;
	int field1593;
	int field1594;
	int field1595;
	int field1599;
	int field1601;
	int[] field1537;
	int[] field1554;
	int[] field1556;
	int[] field1557;
	int[] field1558;
	int[] field1592;
	int[] field1597;
	int[] field1600;
	String field1596;

	class163() {
		this.field1533 = false;
		this.field1529 = 1;
		this.field1531 = -1;
		this.field1532 = -1;
		this.field1593 = -1;
		this.field1534 = -1;
		this.field1535 = -1;
		this.field1536 = -1;
		this.field1584 = -1;
		this.field1595 = -1;
		this.field1539 = -1;
		this.field1580 = -1;
		this.field1541 = -1;
		this.field1542 = -1;
		this.field1543 = -1;
		this.field1544 = -1;
		this.field1574 = -1;
		this.field1596 = null;
		this.field1548 = false;
		this.field1549 = 100;
		this.field1550 = 0;
		this.field1551 = 0;
		this.field1592 = null;
		this.field1553 = 0;
		this.field1554 = new int[4];
		this.field1537 = new int[4];
		this.field1556 = new int[4];
		this.field1557 = new int[4];
		this.field1558 = new int[4];
		this.field1559 = new class55();
		this.field1560 = -1;
		this.field1530 = false;
		this.field1562 = -1;
		this.field1563 = -1;
		this.field1564 = -1;
		this.field1538 = -1;
		this.field1525 = 0;
		this.field1568 = 0;
		this.field1569 = 0;
		this.field1570 = -1;
		this.field1571 = 0;
		this.field1572 = 0;
		this.field1587 = 0;
		this.field1552 = 0;
		this.field1591 = new class526(4);
		this.field1576 = 0;
		this.field1590 = 0;
		this.field1585 = 200;
		this.field1586 = -1;
		this.field1528 = -1;
		this.field1567 = 0;
		this.field1594 = 32;
		this.field1573 = 0;
		this.field1600 = new int[10];
		this.field1597 = new int[10];
		this.field1598 = new class394[10];
		this.field1599 = 0;
		this.field1589 = 0;
		this.field1601 = -1;
	}

	final void method900() {
		this.field1573 = 0;
		this.field1589 = 0;
	}

	boolean method899() {
		return false;
	}

	final void method905(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = true;
		boolean var9 = true;

		int var10;
		for (var10 = 0; var10 < 4; ++var10) {
			if (this.field1556[var10] > var5) {
				var8 = false;
			} else {
				var9 = false;
			}
		}

		var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (var1 >= 0) {
			class151 var13 = class499.method2417(var1);
			var11 = var13.field1418;
			var12 = var13.field1425;
		}

		int var15;
		if (var9) {
			if (var11 == -1) {
				return;
			}

			var10 = 0;
			var15 = 0;
			if (var11 == 0) {
				var15 = this.field1556[0];
			} else if (var11 == 1) {
				var15 = this.field1537[0];
			}

			for (int var14 = 1; var14 < 4; ++var14) {
				if (var11 == 0) {
					if (this.field1556[var14] < var15) {
						var10 = var14;
						var15 = this.field1556[var14];
					}
				} else if (var11 == 1 && this.field1537[var14] < var15) {
					var10 = var14;
					var15 = this.field1537[var14];
				}
			}

			if (var11 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var8) {
				this.field1553 = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var16 = this.field1553;
				this.field1553 = (byte)((this.field1553 + 1) % 4);
				if (this.field1556[var16] <= var5) {
					var10 = var16;
					break;
				}
			}
		}

		if (var10 >= 0) {
			this.field1554[var10] = var1;
			this.field1537[var10] = var2;
			this.field1557[var10] = var3;
			this.field1558[var10] = var4;
			this.field1556[var10] = var6 + var5 + var12;
		}
	}

	final void method901(int var1, int var2, int var3, int var4, int var5, int var6) {
		class190 var9 = (class190)class190.field1759.method1890((long)var1);
		class190 var8;
		if (null != var9) {
			var8 = var9;
		} else {
			byte[] var10 = class190.field1758.method1212(33, var1);
			var9 = new class190();
			var9.field1761 = var1;
			if (null != var10) {
				var9.method1043(new class42(var10));
			}

			class190.field1759.method1889(var9, (long)var1);
			var8 = var9;
		}

		var9 = var8;
		class358 var15 = null;
		class358 var11 = null;
		int var12 = var8.field1763;
		int var13 = 0;

		class358 var14;
		for (var14 = (class358)this.field1559.method409(); null != var14; var14 = (class358)this.field1559.method405()) {
			++var13;
			if (var9.field1761 == var14.field3036.field1761) {
				var14.method1939(var2 + var4, var5, var6, var3);
				return;
			}

			if (var14.field3036.field1764 <= var9.field1764) {
				var15 = var14;
			}

			if (var14.field3036.field1763 > var12) {
				var11 = var14;
				var12 = var14.field3036.field1763;
			}
		}

		if (var11 != null || var13 < 4) {
			var14 = new class358(var9);
			if (var15 == null) {
				this.field1559.method412(var14);
			} else {
				class55.method410(var14, var15);
			}

			var14.method1939(var2 + var4, var5, var6, var3);
			if (var13 >= 4) {
				var11.method2269();
			}

		}
	}

	final void method906(int var1) {
		class190 var4 = (class190)class190.field1759.method1890((long)var1);
		class190 var3;
		if (null != var4) {
			var3 = var4;
		} else {
			byte[] var5 = class190.field1758.method1212(33, var1);
			var4 = new class190();
			var4.field1761 = var1;
			if (null != var5) {
				var4.method1043(new class42(var5));
			}

			class190.field1759.method1889(var4, (long)var1);
			var3 = var4;
		}

		var4 = var3;

		for (class358 var6 = (class358)this.field1559.method409(); var6 != null; var6 = (class358)this.field1559.method405()) {
			if (var6.field3036 == var4) {
				var6.method2269();
				return;
			}
		}

	}

	void method902(int var1, int var2, int var3, int var4) {
		int var6 = var4 + Client.field306;
		class508 var7 = (class508)this.field1591.method2543((long)var1);
		if (null != var7) {
			var7.method2269();
			--this.field1576;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var8 = 0;
			if (var4 > 0) {
				var8 = -1;
			}

			this.field1591.method2547(new class508(var2, var3, var6, var8), (long)var1);
			++this.field1576;
		}
	}

	class526 method903() {
		return this.field1591;
	}

	void method907() {
		class301 var2 = new class301(this.field1591);

		for (class508 var3 = (class508)var2.method1698(); null != var3; var3 = (class508)var2.next()) {
			var3.method2269();
		}

		this.field1576 = 0;
	}

	class250 method904(class250 var1) {
		if (this.field1576 == 0) {
			return var1;
		} else {
			class301 var3 = new class301(this.field1591);
			int var4 = var1.field2323;
			int var5 = var1.field2271;
			int var6 = var1.field2283;
			byte var7 = var1.field2282;

			for (class508 var8 = (class508)var3.method1698(); var8 != null; var8 = (class508)var3.next()) {
				if (var8.field4182 != -1) {
					class250 var9 = class63.method481(var8.field4185).method2107();
					if (null != var9) {
						var4 += var9.field2323;
						var5 += var9.field2271;
						var6 += var9.field2283;
					}
				}
			}

			class250 var11 = new class250(var4, var5, var6, var7);
			var11.method1475(var1);

			for (class508 var12 = (class508)var3.method1698(); var12 != null; var12 = (class508)var3.next()) {
				if (var12.field4182 != -1) {
					class250 var10 = class63.method481(var12.field4185).method2106(var12.field4182);
					if (var10 != null) {
						var10.method1453(0, -var12.field4183, 0);
						var11.method1475(var10);
					}
				}
			}

			return var11;
		}
	}

	void method908() {
		this.field1565 = false;
		this.field1562 = -1;
		this.field1563 = -1;
		this.field1564 = -1;
	}

	public static class160 method911(int var0, String var1, class168 var2, int var3) {
		class160 var5 = class85.method556(class129.field1213, Client.field68.field2426);
		var5.field1483.method267(0);
		int var6 = var5.field1483.field527;
		var5.field1483.method267(var0);
		String var7 = var1.toLowerCase();
		int var8 = 0;
		byte[] var9 = null;
		if (var7.startsWith(class433.field3640)) {
			var8 = 0;
			var1 = var1.substring(class433.field3640.length());
		} else if (var7.startsWith(class433.field3731)) {
			var8 = 1;
			var1 = var1.substring(class433.field3731.length());
		} else if (var7.startsWith(class433.field3642)) {
			var8 = 2;
			var1 = var1.substring(class433.field3642.length());
		} else if (var7.startsWith(class433.field3733)) {
			var8 = 3;
			var1 = var1.substring(class433.field3733.length());
		} else if (var7.startsWith(class433.field3612)) {
			var8 = 4;
			var1 = var1.substring(class433.field3612.length());
		} else if (var7.startsWith(class433.field3735)) {
			var8 = 5;
			var1 = var1.substring(class433.field3735.length());
		} else if (var7.startsWith(class433.field3736)) {
			var8 = 6;
			var1 = var1.substring(class433.field3736.length());
		} else if (var7.startsWith(class433.field3547)) {
			var8 = 7;
			var1 = var1.substring(class433.field3547.length());
		} else if (var7.startsWith(class433.field3582)) {
			var8 = 8;
			var1 = var1.substring(class433.field3582.length());
		} else if (var7.startsWith(class433.field3604)) {
			var8 = 9;
			var1 = var1.substring(class433.field3604.length());
		} else if (var7.startsWith(class433.field3648)) {
			var8 = 10;
			var1 = var1.substring(class433.field3648.length());
		} else if (var7.startsWith(class433.field3741)) {
			var8 = 11;
			var1 = var1.substring(class433.field3741.length());
		} else if (var7.startsWith(class433.field3658)) {
			var8 = 12;
			var1 = var1.substring(class433.field3658.length());
		} else if (var7.startsWith(class433.field3743)) {
			var9 = class139.method833(var7);
			if (null != var9) {
				var8 = var9.length + 12;
				var1 = var1.substring(class433.field3743.length() + var9.length + 1);
			}
		}

		var7 = var1.toLowerCase();
		byte var10 = 0;
		if (var7.startsWith(class433.field3744)) {
			var10 = 1;
			var1 = var1.substring(class433.field3744.length());
		} else if (var7.startsWith(class433.field3745)) {
			var10 = 2;
			var1 = var1.substring(class433.field3745.length());
		} else if (var7.startsWith(class433.field3594)) {
			var10 = 3;
			var1 = var1.substring(class433.field3594.length());
		} else if (var7.startsWith(class433.field3747)) {
			var10 = 4;
			var1 = var1.substring(class433.field3747.length());
		} else if (var7.startsWith(class433.field3631)) {
			var10 = 5;
			var1 = var1.substring(class433.field3631.length());
		}

		var5.field1483.method267(var8);
		var5.field1483.method267(var10);
		if (null != var9 && Client.field185 >= 214) {
			for (int var11 = 0; var11 < var9.length; ++var11) {
				var5.field1483.method267(var9[var11]);
			}
		}

		class173.method990(var5.field1483, var1);
		if (var0 == class183.field1726.method1970()) {
			var5.field1483.method267(var3);
		}

		var5.field1483.method276(var5.field1483.field527 - var6);
		return var5;
	}

	static final void method909(class347 var0) {
		var0.method1905();
		int var2 = Client.field131;
		class287 var3 = class82.field863 = Client.field176[var2] = new class287();
		var3.field2522 = var2;
		int var4 = var0.method1903(30);
		byte var5 = (byte)(var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field1600[0] = var6 - class296.field2735;
		var3.field1555 = (var3.field1600[0] << 7) + (var3.method1637() << 6);
		var3.field1597[0] = var7 - class164.field1606;
		var3.field1526 = (var3.field1597[0] << 7) + (var3.method1637() << 6);
		class358.field3038 = var3.field2543 = var5;
		if (class481.field4093[var2] != null) {
			var3.method1631(class481.field4093[var2]);
		}

		class481.field4085 = 0;
		class481.field4086[++class481.field4085 - 1] = var2;
		class481.field4092[var2] = 0;
		class481.field4087 = 0;

		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var8 != var2) {
				int var9 = var0.method1903(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				class481.field4088[var8] = var12 + (var10 << 28) + (var11 << 14);
				class481.field4089[var8] = 0;
				class481.field4090[var8] = -1;
				class481.field4094[++class481.field4087 - 1] = var8;
				class481.field4092[var8] = 0;
			}
		}

		var0.method1906();
	}

	static boolean method910(class363 var0) {
		if (var0.field3052[0] < 512) {
			return false;
		} else {
			class210 var2 = class67.method492(var0.field3052[0] - 512);
			return class100.field1007.field1003 != var2.field1936 && var2.field1952 != class100.field1007.field1003;
		}
	}
}
