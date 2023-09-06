public final class class287 extends class163 {
	static class342 field2551;
	boolean field2540;
	boolean field2542;
	boolean field2548;
	class250 field2535;
	class271 field2530;
	class271 field2545;
	class271 field2546;
	class363 field2523;
	class440 field2539;
	int field2522;
	int field2524;
	int field2525;
	int field2527;
	int field2528;
	int field2529;
	int field2531;
	int field2532;
	int field2533;
	int field2534;
	int field2536;
	int field2537;
	int field2538;
	int field2541;
	int field2543;
	int field2544;
	int field2547;
	int field2549;
	int field2550;
	String[] field2526;

	class287() {
		this.field2524 = -1;
		this.field2525 = -1;
		this.field2526 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field2526[var1] = "";
		}

		this.field2528 = 0;
		this.field2536 = 0;
		this.field2531 = 0;
		this.field2541 = 0;
		this.field2540 = false;
		this.field2549 = 0;
		this.field2542 = false;
		this.field2545 = class271.field2444;
		this.field2546 = class271.field2444;
		this.field2530 = class271.field2444;
		this.field2548 = false;
	}

	final void method1631(class42 var1) {
		var1.field527 = 0;
		int var3 = var1.method278();
		boolean var4 = true;
		this.field2524 = var1.method279();
		this.field2525 = var1.method279();
		int var5 = -1;
		this.field2549 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method278();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method278();
				var6[var7] = var9 + (var8 << 8);
				if (var7 == 0 && var6[0] == 65535) {
					var5 = var1.method327();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = class67.method492(var6[var7] - 512).field1979;
					if (var10 != 0) {
						this.field2549 = var10;
					}
				}
			}
		}

		int[] var28 = null;
		if (Client.field185 >= 213) {
			var28 = new int[12];

			for (var8 = 0; var8 < 12; ++var8) {
				var9 = var1.method278();
				if (var9 == 0) {
					var28[var8] = 0;
				} else {
					var10 = var1.method278();
					var28[var8] = var10 + (var9 << 8);
				}
			}
		}

		int[] var29 = new int[5];

		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.method278();
			if (var10 < 0 || var10 >= class131.field1279[var9].length) {
				var10 = 0;
			}

			var29[var9] = var10;
		}

		super.field1531 = var1.method327();
		if (super.field1531 == 65535) {
			super.field1531 = -1;
		}

		super.field1532 = var1.method327();
		if (super.field1532 == 65535) {
			super.field1532 = -1;
		}

		super.field1593 = super.field1532;
		super.field1534 = var1.method327();
		if (super.field1534 == 65535) {
			super.field1534 = -1;
		}

		super.field1535 = var1.method327();
		if (super.field1535 == 65535) {
			super.field1535 = -1;
		}

		super.field1536 = var1.method327();
		if (super.field1536 == 65535) {
			super.field1536 = -1;
		}

		super.field1584 = var1.method327();
		if (super.field1584 == 65535) {
			super.field1584 = -1;
		}

		super.field1595 = var1.method327();
		if (super.field1595 == 65535) {
			super.field1595 = -1;
		}

		this.field2539 = new class440(var1.method286(), class168.field1640);
		this.method1633();
		this.method1636();
		this.method1645();
		if (this == class82.field863) {
			class280.field2496 = this.field2539.method2214();
		}

		this.field2528 = var1.method278();
		this.field2536 = var1.method327();
		this.field2542 = var1.method278() == 1;
		if (Client.field28 == 0 && Client.field91 >= 2) {
			this.field2542 = false;
		}

		class30[] var30 = null;
		boolean var31 = false;
		int var11 = var1.method327();
		var31 = (var11 >> 15 & 1) == 1;
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var30 = new class30[12];

			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					int var17 = var6[var12] - 512;
					int var18 = var1.method278();
					boolean var19 = (var18 & 1) != 0;
					boolean var20 = (var18 & 2) != 0;
					class30 var21 = new class30(var17);
					int var22;
					int[] var23;
					boolean var24;
					int var25;
					short var26;
					if (var19) {
						var22 = var1.method278();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = null != var21.field465 && var23.length == var21.field465.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.method327();
								if (var24) {
									var21.field465[var23[var25]] = var26;
								}
							}
						}
					}

					if (var20) {
						var22 = var1.method278();
						var23 = new int[]{var22 & 15, var22 >> 4 & 15};
						var24 = var21.field466 != null && var21.field466.length == var23.length;

						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short)var1.method327();
								if (var24) {
									var21.field466[var23[var25]] = var26;
								}
							}
						}
					}

					var30[var12] = var21;
				}
			}
		}

		for (var12 = 0; var12 < 3; ++var12) {
			this.field2526[var12] = var1.method286();
		}

		int var27 = var1.method278();
		if (this.field2523 == null) {
			this.field2523 = new class363();
		}

		this.field2523.method1951(var28, var6, var30, var31, var29, var3, var5, var27);
	}

	boolean method1632() {
		if (class271.field2444 == this.field2545) {
			this.method1634();
		}

		return this.field2545 == class271.field2443;
	}

	void method1633() {
		this.field2545 = class271.field2444;
	}

	void method1634() {
		this.field2545 = class316.field2827.method1172(this.field2539) ? class271.field2443 : class271.field2442;
	}

	boolean method1635() {
		if (class271.field2444 == this.field2546) {
			this.method1639();
		}

		return class271.field2443 == this.field2546;
	}

	void method1636() {
		this.field2546 = class271.field2444;
	}

	void method1639() {
		this.field2546 = null != class141.field1358 && class141.field1358.method1719(this.field2539) ? class271.field2443 : class271.field2442;
	}

	void method1638() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (Client.field247[var2] != null && Client.field247[var2].method2025(this.field2539.method2214()) != -1 && var2 != 2) {
				this.field2530 = class271.field2443;
				return;
			}
		}

		this.field2530 = class271.field2442;
	}

	void method1645() {
		this.field2530 = class271.field2444;
	}

	boolean method1642() {
		if (this.field2530 == class271.field2444) {
			this.method1638();
		}

		return this.field2530 == class271.field2443;
	}

	int method1637() {
		return null != this.field2523 && this.field2523.field3051 != -1 ? class150.method861(this.field2523.field3051).field3150 : 1;
	}

	protected final class250 method2393() {
		if (null == this.field2523) {
			return null;
		} else {
			class393 var2 = super.field1570 != -1 && super.field1587 == 0 ? class114.method702(super.field1570) : null;
			class393 var3 = super.field1538 != -1 && !this.field2540 && (super.field1531 != super.field1538 || var2 == null) ? class114.method702(super.field1538) : null;
			class250 var4 = this.field2523.method1962(var2, super.field1571, var3, super.field1525);
			if (null == var4) {
				return null;
			} else {
				var4.method1452();
				super.field1585 = var4.field4080;
				int var5 = var4.field2271;
				if (!this.field2540) {
					var4 = this.method904(var4);
				}

				if (!this.field2540 && this.field2535 != null) {
					if (Client.field306 >= this.field2541) {
						this.field2535 = null;
					}

					if (Client.field306 >= this.field2531 && Client.field306 < this.field2541) {
						class250 var6 = this.field2535;
						var6.method1453(this.field2532 - super.field1555, this.field2533 - this.field2529, this.field2534 - super.field1526);
						if (super.field1566 == 512) {
							var6.method1462();
							var6.method1462();
							var6.method1462();
						} else if (super.field1566 == 1024) {
							var6.method1462();
							var6.method1462();
						} else if (super.field1566 == 1536) {
							var6.method1462();
						}

						class250[] var7 = new class250[]{var4, var6};
						var4 = new class250(var7, 2);
						if (super.field1566 == 512) {
							var6.method1462();
						} else if (super.field1566 == 1024) {
							var6.method1462();
							var6.method1462();
						} else if (super.field1566 == 1536) {
							var6.method1462();
							var6.method1462();
							var6.method1462();
						}

						var6.method1453(super.field1555 - this.field2532, this.field2529 - this.field2533, super.field1526 - this.field2534);
					}
				}

				var4.field2272 = true;
				if (super.field1578 != 0 && Client.field306 >= super.field1586 && Client.field306 < super.field1528) {
					var4.field2327 = super.field1588;
					var4.field2297 = super.field1546;
					var4.field2295 = super.field1540;
					var4.field2333 = super.field1578;
					var4.field2334 = (short)var5;
				} else {
					var4.field2333 = 0;
				}

				return var4;
			}
		}
	}

	final void method1644(int var1, int var2, class394 var3) {
		if (super.field1570 != -1 && class114.method702(super.field1570).field3310 == 1) {
			super.field1570 = -1;
		}

		this.method908();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.field1600[0] >= 0 && super.field1600[0] < 104 && super.field1597[0] >= 0 && super.field1597[0] < 104) {
				if (class394.field3314 == var3) {
					class287 var5 = this;
					class394 var6 = class394.field3314;
					int var7 = super.field1600[0];
					int var8 = super.field1597[0];
					int var9 = this.method1637();
					if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
						int var11 = this.method1637();
						class502 var12 = class316.method1752(var1, var2);
						class76 var13 = Client.field78[this.field2543];
						int[] var14 = Client.field304;
						int[] var15 = Client.field305;
						int var10 = class239.method1365(var7, var8, var11, var12, var13, true, var14, var15, class185.field1747[0]);
						int var16 = var10;
						if (var10 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; ++var17) {
								var5.method1643(Client.field304[var17], Client.field305[var17], var6);
							}
						}
					}
				}

				this.method1643(var1, var2, var3);
			} else {
				this.method1641(var1, var2);
			}
		} else {
			this.method1641(var1, var2);
		}

	}

	void method1641(int var1, int var2) {
		super.field1573 = 0;
		super.field1589 = 0;
		super.field1599 = 0;
		super.field1600[0] = var1;
		super.field1597[0] = var2;
		int var4 = this.method1637();
		super.field1555 = 128 * super.field1600[0] + var4 * 64;
		super.field1526 = 128 * super.field1597[0] + var4 * 64;
	}

	final void method1643(int var1, int var2, class394 var3) {
		if (super.field1573 < 9) {
			++super.field1573;
		}

		for (int var5 = super.field1573; var5 > 0; --var5) {
			super.field1600[var5] = super.field1600[var5 - 1];
			super.field1597[var5] = super.field1597[var5 - 1];
			super.field1598[var5] = super.field1598[var5 - 1];
		}

		super.field1600[0] = var1;
		super.field1597[0] = var2;
		super.field1598[0] = var3;
	}

	final boolean method899() {
		return null != this.field2523;
	}

	static int method1646(int var0, class167 var1, boolean var2) {
		class60 var4 = class366.method1967(class139.field1344[--class203.field1903]);
		if (var0 == 2800) {
			class139.field1344[++class203.field1903 - 1] = class190.method1044(class447.method2235(var4));
			return 1;
		} else if (var0 != 2801) {
			if (var0 == 2802) {
				if (null == var4.field648) {
					class139.field1331[++class429.field3529 - 1] = "";
				} else {
					class139.field1331[++class429.field3529 - 1] = var4.field648;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = class139.field1344[--class203.field1903];
			--var5;
			if (var4.field722 != null && var5 < var4.field722.length && null != var4.field722[var5]) {
				class139.field1331[++class429.field3529 - 1] = var4.field722[var5];
			} else {
				class139.field1331[++class429.field3529 - 1] = "";
			}

			return 1;
		}
	}

	static final void method1630() {
		class160 var1 = class85.method556(class129.field1243, Client.field68.field2426);
		var1.field1483.method267(0);
		Client.field68.method1570(var1);
	}
}
