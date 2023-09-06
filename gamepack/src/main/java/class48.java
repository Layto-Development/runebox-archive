public class class48 extends class480 {
	static int field564;
	static int[] field547;
	static int[] field566;
	static int[] field570;
	static int[] field584;
	boolean field577;
	byte field561;
	byte[] field546;
	byte[] field556;
	byte[] field557;
	byte[] field575;
	byte[] field578;
	class332[] field558;
	class332[] field574;
	class383[] field572;
	int field548;
	int field555;
	int field562;
	int field579;
	int field580;
	int field581;
	int field582;
	int field585;
	int[] field549;
	int[] field550;
	int[] field551;
	int[] field552;
	int[] field553;
	int[] field554;
	int[] field573;
	int[] field586;
	int[][] field567;
	int[][] field568;
	int[][] field569;
	int[][] field571;
	short[] field559;
	short[] field560;
	short[] field563;
	short[] field565;
	short[] field583;
	public short field576;
	public short field587;

	static {
		field566 = new int[10000];
		field584 = new int[10000];
		field564 = 0;
		field547 = class133.field1291;
		field570 = class133.field1289;
	}

	class48() {
		this.field548 = 0;
		this.field580 = 0;
		this.field561 = 0;
		this.field577 = false;
	}

	class48(byte[] var1) {
		this.field548 = 0;
		this.field580 = 0;
		this.field561 = 0;
		this.field577 = false;
		class42 var2 = new class42(10);
		var2.method308(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method375(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method371(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method377(var1);
		} else {
			this.method376(var1);
		}

	}

	public class48(class48[] var1, int var2) {
		this.field548 = 0;
		this.field580 = 0;
		this.field561 = 0;
		this.field577 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field548 = 0;
		this.field580 = 0;
		this.field562 = 0;
		this.field561 = -1;

		int var10;
		class48 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field548 += var11.field548;
				this.field580 += var11.field580;
				this.field562 += var11.field562;
				if (var11.field556 != null) {
					var4 = true;
				} else {
					if (this.field561 == -1) {
						this.field561 = var11.field561;
					}

					if (this.field561 != var11.field561) {
						var4 = true;
					}
				}

				var3 |= var11.field578 != null;
				var5 |= var11.field557 != null;
				var6 |= var11.field586 != null;
				var7 |= var11.field560 != null;
				var8 |= var11.field546 != null;
				var9 |= var11.field567 != null;
			}
		}

		this.field549 = new int[this.field548];
		this.field550 = new int[this.field548];
		this.field551 = new int[this.field548];
		this.field573 = new int[this.field548];
		this.field552 = new int[this.field580];
		this.field553 = new int[this.field580];
		this.field554 = new int[this.field580];
		if (var3) {
			this.field578 = new byte[this.field580];
		}

		if (var4) {
			this.field556 = new byte[this.field580];
		}

		if (var5) {
			this.field557 = new byte[this.field580];
		}

		if (var6) {
			this.field586 = new int[this.field580];
		}

		if (var7) {
			this.field560 = new short[this.field580];
		}

		if (var8) {
			this.field546 = new byte[this.field580];
		}

		if (var9) {
			this.field567 = new int[this.field548][];
			this.field571 = new int[this.field548][];
		}

		this.field559 = new short[this.field580];
		if (this.field562 > 0) {
			this.field575 = new byte[this.field562];
			this.field563 = new short[this.field562];
			this.field565 = new short[this.field562];
			this.field583 = new short[this.field562];
		}

		this.field548 = 0;
		this.field580 = 0;
		this.field562 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field580; ++var12) {
					if (var3 && var11.field578 != null) {
						this.field578[this.field580] = var11.field578[var12];
					}

					if (var4) {
						if (var11.field556 != null) {
							this.field556[this.field580] = var11.field556[var12];
						} else {
							this.field556[this.field580] = var11.field561;
						}
					}

					if (var5 && var11.field557 != null) {
						this.field557[this.field580] = var11.field557[var12];
					}

					if (var6 && var11.field586 != null) {
						this.field586[this.field580] = var11.field586[var12];
					}

					if (var7) {
						if (var11.field560 != null) {
							this.field560[this.field580] = var11.field560[var12];
						} else {
							this.field560[this.field580] = -1;
						}
					}

					if (var8) {
						if (var11.field546 != null && var11.field546[var12] != -1) {
							this.field546[this.field580] = (byte)(var11.field546[var12] + this.field562);
						} else {
							this.field546[this.field580] = -1;
						}
					}

					this.field559[this.field580] = var11.field559[var12];
					this.field552[this.field580] = this.method353(var11, var11.field552[var12]);
					this.field553[this.field580] = this.method353(var11, var11.field553[var12]);
					this.field554[this.field580] = this.method353(var11, var11.field554[var12]);
					++this.field580;
				}

				for (var12 = 0; var12 < var11.field562; ++var12) {
					byte var13 = this.field575[this.field562] = var11.field575[var12];
					if (var13 == 0) {
						this.field563[this.field562] = (short)this.method353(var11, var11.field563[var12]);
						this.field565[this.field562] = (short)this.method353(var11, var11.field565[var12]);
						this.field583[this.field562] = (short)this.method353(var11, var11.field583[var12]);
					}

					++this.field562;
				}
			}
		}

	}

	public class48(class48 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field548 = 0;
		this.field580 = 0;
		this.field561 = 0;
		this.field577 = false;
		this.field548 = var1.field548;
		this.field580 = var1.field580;
		this.field562 = var1.field562;
		int var6;
		if (var2) {
			this.field549 = var1.field549;
			this.field550 = var1.field550;
			this.field551 = var1.field551;
		} else {
			this.field549 = new int[this.field548];
			this.field550 = new int[this.field548];
			this.field551 = new int[this.field548];

			for (var6 = 0; var6 < this.field548; ++var6) {
				this.field549[var6] = var1.field549[var6];
				this.field550[var6] = var1.field550[var6];
				this.field551[var6] = var1.field551[var6];
			}
		}

		if (var3) {
			this.field559 = var1.field559;
		} else {
			this.field559 = new short[this.field580];

			for (var6 = 0; var6 < this.field580; ++var6) {
				this.field559[var6] = var1.field559[var6];
			}
		}

		if (!var4 && var1.field560 != null) {
			this.field560 = new short[this.field580];

			for (var6 = 0; var6 < this.field580; ++var6) {
				this.field560[var6] = var1.field560[var6];
			}
		} else {
			this.field560 = var1.field560;
		}

		if (var5) {
			this.field557 = var1.field557;
		} else {
			this.field557 = new byte[this.field580];
			if (var1.field557 == null) {
				for (var6 = 0; var6 < this.field580; ++var6) {
					this.field557[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field580; ++var6) {
					this.field557[var6] = var1.field557[var6];
				}
			}
		}

		this.field552 = var1.field552;
		this.field553 = var1.field553;
		this.field554 = var1.field554;
		this.field578 = var1.field578;
		this.field556 = var1.field556;
		this.field546 = var1.field546;
		this.field561 = var1.field561;
		this.field575 = var1.field575;
		this.field563 = var1.field563;
		this.field565 = var1.field565;
		this.field583 = var1.field583;
		this.field573 = var1.field573;
		this.field586 = var1.field586;
		this.field568 = var1.field568;
		this.field569 = var1.field569;
		this.field558 = var1.field558;
		this.field572 = var1.field572;
		this.field574 = var1.field574;
		this.field567 = var1.field567;
		this.field571 = var1.field571;
		this.field587 = var1.field587;
		this.field576 = var1.field576;
	}

	void method375(byte[] var1) {
		class42 var2 = new class42(var1);
		class42 var3 = new class42(var1);
		class42 var4 = new class42(var1);
		class42 var5 = new class42(var1);
		class42 var6 = new class42(var1);
		class42 var7 = new class42(var1);
		class42 var8 = new class42(var1);
		var2.field527 = var1.length - 26;
		int var9 = var2.method327();
		int var10 = var2.method327();
		int var11 = var2.method278();
		int var12 = var2.method278();
		int var13 = var2.method278();
		int var14 = var2.method278();
		int var15 = var2.method278();
		int var16 = var2.method278();
		int var17 = var2.method278();
		int var18 = var2.method278();
		int var19 = var2.method327();
		int var20 = var2.method327();
		int var21 = var2.method327();
		int var22 = var2.method327();
		int var23 = var2.method327();
		int var24 = var2.method327();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field575 = new byte[var11];
			var2.field527 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field575[var28] = var2.method279();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field548 = var9;
		this.field580 = var10;
		this.field562 = var11;
		this.field549 = new int[var9];
		this.field550 = new int[var9];
		this.field551 = new int[var9];
		this.field552 = new int[var10];
		this.field553 = new int[var10];
		this.field554 = new int[var10];
		if (var17 == 1) {
			this.field573 = new int[var9];
		}

		if (var12 == 1) {
			this.field578 = new byte[var10];
		}

		if (var13 == 255) {
			this.field556 = new byte[var10];
		} else {
			this.field561 = (byte)var13;
		}

		if (var14 == 1) {
			this.field557 = new byte[var10];
		}

		if (var15 == 1) {
			this.field586 = new int[var10];
		}

		if (var16 == 1) {
			this.field560 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field546 = new byte[var10];
		}

		if (var18 == 1) {
			this.field567 = new int[var9][];
			this.field571 = new int[var9][];
		}

		this.field559 = new short[var10];
		if (var11 > 0) {
			this.field563 = new short[var11];
			this.field565 = new short[var11];
			this.field583 = new short[var11];
		}

		var2.field527 = var11;
		var3.field527 = var40;
		var4.field527 = var41;
		var5.field527 = var42;
		var6.field527 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method278();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method289();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method289();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method289();
			}

			this.field549[var53] = var50 + var55;
			this.field550[var53] = var51 + var56;
			this.field551[var53] = var52 + var57;
			var50 = this.field549[var53];
			var51 = this.field550[var53];
			var52 = this.field551[var53];
			if (var17 == 1) {
				this.field573[var53] = var6.method278();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method278();
				this.field567[var53] = new int[var54];
				this.field571[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field567[var53][var55] = var6.method278();
					this.field571[var53][var55] = var6.method278();
				}
			}
		}

		var2.field527 = var39;
		var3.field527 = var30;
		var4.field527 = var32;
		var5.field527 = var35;
		var6.field527 = var33;
		var7.field527 = var37;
		var8.field527 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field559[var53] = (short)var2.method327();
			if (var12 == 1) {
				this.field578[var53] = var3.method279();
			}

			if (var13 == 255) {
				this.field556[var53] = var4.method279();
			}

			if (var14 == 1) {
				this.field557[var53] = var5.method279();
			}

			if (var15 == 1) {
				this.field586[var53] = var6.method278();
			}

			if (var16 == 1) {
				this.field560[var53] = (short)(var7.method327() - 1);
			}

			if (this.field546 != null && this.field560[var53] != -1) {
				this.field546[var53] = (byte)(var8.method278() - 1);
			}
		}

		var2.field527 = var36;
		var3.field527 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method278();
			if (var58 == 1) {
				var53 = var2.method289() + var56;
				var54 = var2.method289() + var53;
				var55 = var2.method289() + var54;
				var56 = var55;
				this.field552[var57] = var53;
				this.field553[var57] = var54;
				this.field554[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method289() + var56;
				var56 = var55;
				this.field552[var57] = var53;
				this.field553[var57] = var54;
				this.field554[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method289() + var56;
				var56 = var55;
				this.field552[var57] = var53;
				this.field553[var57] = var54;
				this.field554[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method289() + var56;
				var56 = var55;
				this.field552[var57] = var53;
				this.field553[var57] = var59;
				this.field554[var57] = var55;
			}
		}

		var2.field527 = var43;
		var3.field527 = var44;
		var4.field527 = var45;
		var5.field527 = var46;
		var6.field527 = var47;
		var7.field527 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field575[var57] & 255;
			if (var58 == 0) {
				this.field563[var57] = (short)var2.method327();
				this.field565[var57] = (short)var2.method327();
				this.field583[var57] = (short)var2.method327();
			}
		}

		var2.field527 = var28;
		var57 = var2.method278();
		if (var57 != 0) {
			new class417();
			var2.method327();
			var2.method327();
			var2.method327();
			var2.method282();
		}

	}

	void method371(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class42 var4 = new class42(var1);
		class42 var5 = new class42(var1);
		class42 var6 = new class42(var1);
		class42 var7 = new class42(var1);
		class42 var8 = new class42(var1);
		var4.field527 = var1.length - 23;
		int var9 = var4.method327();
		int var10 = var4.method327();
		int var11 = var4.method278();
		int var12 = var4.method278();
		int var13 = var4.method278();
		int var14 = var4.method278();
		int var15 = var4.method278();
		int var16 = var4.method278();
		int var17 = var4.method278();
		int var18 = var4.method327();
		int var19 = var4.method327();
		int var20 = var4.method327();
		int var21 = var4.method327();
		int var22 = var4.method327();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field548 = var9;
		this.field580 = var10;
		this.field562 = var11;
		this.field549 = new int[var9];
		this.field550 = new int[var9];
		this.field551 = new int[var9];
		this.field552 = new int[var10];
		this.field553 = new int[var10];
		this.field554 = new int[var10];
		if (var11 > 0) {
			this.field575 = new byte[var11];
			this.field563 = new short[var11];
			this.field565 = new short[var11];
			this.field583 = new short[var11];
		}

		if (var16 == 1) {
			this.field573 = new int[var9];
		}

		if (var12 == 1) {
			this.field578 = new byte[var10];
			this.field546 = new byte[var10];
			this.field560 = new short[var10];
		}

		if (var13 == 255) {
			this.field556 = new byte[var10];
		} else {
			this.field561 = (byte)var13;
		}

		if (var14 == 1) {
			this.field557 = new byte[var10];
		}

		if (var15 == 1) {
			this.field586 = new int[var10];
		}

		if (var17 == 1) {
			this.field567 = new int[var9][];
			this.field571 = new int[var9][];
		}

		this.field559 = new short[var10];
		var4.field527 = var23;
		var5.field527 = var34;
		var6.field527 = var35;
		var7.field527 = var47;
		var8.field527 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method278();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method289();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method289();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method289();
			}

			this.field549[var40] = var37 + var42;
			this.field550[var40] = var38 + var43;
			this.field551[var40] = var39 + var44;
			var37 = this.field549[var40];
			var38 = this.field550[var40];
			var39 = this.field551[var40];
			if (var16 == 1) {
				this.field573[var40] = var8.method278();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method278();
				this.field567[var40] = new int[var41];
				this.field571[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field567[var40][var42] = var8.method278();
					this.field571[var40][var42] = var8.method278();
				}
			}
		}

		var4.field527 = var32;
		var5.field527 = var28;
		var6.field527 = var26;
		var7.field527 = var30;
		var8.field527 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field559[var40] = (short)var4.method327();
			if (var12 == 1) {
				var41 = var5.method278();
				if ((var41 & 1) == 1) {
					this.field578[var40] = 1;
					var2 = true;
				} else {
					this.field578[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field546[var40] = (byte)(var41 >> 2);
					this.field560[var40] = this.field559[var40];
					this.field559[var40] = 127;
					if (this.field560[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field546[var40] = -1;
					this.field560[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field556[var40] = var6.method279();
			}

			if (var14 == 1) {
				this.field557[var40] = var7.method279();
			}

			if (var15 == 1) {
				this.field586[var40] = var8.method278();
			}
		}

		var4.field527 = var31;
		var5.field527 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method278();
			if (var45 == 1) {
				var40 = var4.method289() + var43;
				var41 = var4.method289() + var40;
				var42 = var4.method289() + var41;
				var43 = var42;
				this.field552[var44] = var40;
				this.field553[var44] = var41;
				this.field554[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method289() + var43;
				var43 = var42;
				this.field552[var44] = var40;
				this.field553[var44] = var41;
				this.field554[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method289() + var43;
				var43 = var42;
				this.field552[var44] = var40;
				this.field553[var44] = var41;
				this.field554[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method289() + var43;
				var43 = var42;
				this.field552[var44] = var40;
				this.field553[var44] = var46;
				this.field554[var44] = var42;
			}
		}

		var4.field527 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field575[var44] = 0;
			this.field563[var44] = (short)var4.method327();
			this.field565[var44] = (short)var4.method327();
			this.field583[var44] = (short)var4.method327();
		}

		if (this.field546 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field546[var45] & 255;
				if (var46 != 255) {
					if ((this.field563[var46] & '\uffff') == this.field552[var45] && (this.field565[var46] & '\uffff') == this.field553[var45] && (this.field583[var46] & '\uffff') == this.field554[var45]) {
						this.field546[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field546 = null;
			}
		}

		if (!var3) {
			this.field560 = null;
		}

		if (!var2) {
			this.field578 = null;
		}

	}

	void method377(byte[] var1) {
		class42 var2 = new class42(var1);
		class42 var3 = new class42(var1);
		class42 var4 = new class42(var1);
		class42 var5 = new class42(var1);
		class42 var6 = new class42(var1);
		class42 var7 = new class42(var1);
		class42 var8 = new class42(var1);
		var2.field527 = var1.length - 23;
		int var9 = var2.method327();
		int var10 = var2.method327();
		int var11 = var2.method278();
		int var12 = var2.method278();
		int var13 = var2.method278();
		int var14 = var2.method278();
		int var15 = var2.method278();
		int var16 = var2.method278();
		int var17 = var2.method278();
		int var18 = var2.method327();
		int var19 = var2.method327();
		int var20 = var2.method327();
		int var21 = var2.method327();
		int var22 = var2.method327();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field575 = new byte[var11];
			var2.field527 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field575[var26] = var2.method279();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field548 = var9;
		this.field580 = var10;
		this.field562 = var11;
		this.field549 = new int[var9];
		this.field550 = new int[var9];
		this.field551 = new int[var9];
		this.field552 = new int[var10];
		this.field553 = new int[var10];
		this.field554 = new int[var10];
		if (var17 == 1) {
			this.field573 = new int[var9];
		}

		if (var12 == 1) {
			this.field578 = new byte[var10];
		}

		if (var13 == 255) {
			this.field556 = new byte[var10];
		} else {
			this.field561 = (byte)var13;
		}

		if (var14 == 1) {
			this.field557 = new byte[var10];
		}

		if (var15 == 1) {
			this.field586 = new int[var10];
		}

		if (var16 == 1) {
			this.field560 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field546 = new byte[var10];
		}

		this.field559 = new short[var10];
		if (var11 > 0) {
			this.field563 = new short[var11];
			this.field565 = new short[var11];
			this.field583 = new short[var11];
		}

		var2.field527 = var11;
		var3.field527 = var38;
		var4.field527 = var39;
		var5.field527 = var40;
		var6.field527 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method278();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method289();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method289();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method289();
			}

			this.field549[var51] = var48 + var53;
			this.field550[var51] = var49 + var54;
			this.field551[var51] = var50 + var55;
			var48 = this.field549[var51];
			var49 = this.field550[var51];
			var50 = this.field551[var51];
			if (var17 == 1) {
				this.field573[var51] = var6.method278();
			}
		}

		var2.field527 = var37;
		var3.field527 = var28;
		var4.field527 = var30;
		var5.field527 = var33;
		var6.field527 = var31;
		var7.field527 = var35;
		var8.field527 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field559[var51] = (short)var2.method327();
			if (var12 == 1) {
				this.field578[var51] = var3.method279();
			}

			if (var13 == 255) {
				this.field556[var51] = var4.method279();
			}

			if (var14 == 1) {
				this.field557[var51] = var5.method279();
			}

			if (var15 == 1) {
				this.field586[var51] = var6.method278();
			}

			if (var16 == 1) {
				this.field560[var51] = (short)(var7.method327() - 1);
			}

			if (this.field546 != null && this.field560[var51] != -1) {
				this.field546[var51] = (byte)(var8.method278() - 1);
			}
		}

		var2.field527 = var34;
		var3.field527 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method278();
			if (var56 == 1) {
				var51 = var2.method289() + var54;
				var52 = var2.method289() + var51;
				var53 = var2.method289() + var52;
				var54 = var53;
				this.field552[var55] = var51;
				this.field553[var55] = var52;
				this.field554[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method289() + var54;
				var54 = var53;
				this.field552[var55] = var51;
				this.field553[var55] = var52;
				this.field554[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method289() + var54;
				var54 = var53;
				this.field552[var55] = var51;
				this.field553[var55] = var52;
				this.field554[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method289() + var54;
				var54 = var53;
				this.field552[var55] = var51;
				this.field553[var55] = var57;
				this.field554[var55] = var53;
			}
		}

		var2.field527 = var41;
		var3.field527 = var42;
		var4.field527 = var43;
		var5.field527 = var44;
		var6.field527 = var45;
		var7.field527 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field575[var55] & 255;
			if (var56 == 0) {
				this.field563[var55] = (short)var2.method327();
				this.field565[var55] = (short)var2.method327();
				this.field583[var55] = (short)var2.method327();
			}
		}

		var2.field527 = var26;
		var55 = var2.method278();
		if (var55 != 0) {
			new class417();
			var2.method327();
			var2.method327();
			var2.method327();
			var2.method282();
		}

	}

	void method376(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class42 var4 = new class42(var1);
		class42 var5 = new class42(var1);
		class42 var6 = new class42(var1);
		class42 var7 = new class42(var1);
		class42 var8 = new class42(var1);
		var4.field527 = var1.length - 18;
		int var9 = var4.method327();
		int var10 = var4.method327();
		int var11 = var4.method278();
		int var12 = var4.method278();
		int var13 = var4.method278();
		int var14 = var4.method278();
		int var15 = var4.method278();
		int var16 = var4.method278();
		int var17 = var4.method327();
		int var18 = var4.method327();
		int var19 = var4.method327();
		int var20 = var4.method327();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field548 = var9;
		this.field580 = var10;
		this.field562 = var11;
		this.field549 = new int[var9];
		this.field550 = new int[var9];
		this.field551 = new int[var9];
		this.field552 = new int[var10];
		this.field553 = new int[var10];
		this.field554 = new int[var10];
		if (var11 > 0) {
			this.field575 = new byte[var11];
			this.field563 = new short[var11];
			this.field565 = new short[var11];
			this.field583 = new short[var11];
		}

		if (var16 == 1) {
			this.field573 = new int[var9];
		}

		if (var12 == 1) {
			this.field578 = new byte[var10];
			this.field546 = new byte[var10];
			this.field560 = new short[var10];
		}

		if (var13 == 255) {
			this.field556 = new byte[var10];
		} else {
			this.field561 = (byte)var13;
		}

		if (var14 == 1) {
			this.field557 = new byte[var10];
		}

		if (var15 == 1) {
			this.field586 = new int[var10];
		}

		this.field559 = new short[var10];
		var4.field527 = var21;
		var5.field527 = var32;
		var6.field527 = var33;
		var7.field527 = var45;
		var8.field527 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method278();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method289();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method289();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method289();
			}

			this.field549[var38] = var35 + var40;
			this.field550[var38] = var36 + var41;
			this.field551[var38] = var37 + var42;
			var35 = this.field549[var38];
			var36 = this.field550[var38];
			var37 = this.field551[var38];
			if (var16 == 1) {
				this.field573[var38] = var8.method278();
			}
		}

		var4.field527 = var30;
		var5.field527 = var26;
		var6.field527 = var24;
		var7.field527 = var28;
		var8.field527 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field559[var38] = (short)var4.method327();
			if (var12 == 1) {
				var39 = var5.method278();
				if ((var39 & 1) == 1) {
					this.field578[var38] = 1;
					var2 = true;
				} else {
					this.field578[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field546[var38] = (byte)(var39 >> 2);
					this.field560[var38] = this.field559[var38];
					this.field559[var38] = 127;
					if (this.field560[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field546[var38] = -1;
					this.field560[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field556[var38] = var6.method279();
			}

			if (var14 == 1) {
				this.field557[var38] = var7.method279();
			}

			if (var15 == 1) {
				this.field586[var38] = var8.method278();
			}
		}

		var4.field527 = var29;
		var5.field527 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method278();
			if (var43 == 1) {
				var38 = var4.method289() + var41;
				var39 = var4.method289() + var38;
				var40 = var4.method289() + var39;
				var41 = var40;
				this.field552[var42] = var38;
				this.field553[var42] = var39;
				this.field554[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method289() + var41;
				var41 = var40;
				this.field552[var42] = var38;
				this.field553[var42] = var39;
				this.field554[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method289() + var41;
				var41 = var40;
				this.field552[var42] = var38;
				this.field553[var42] = var39;
				this.field554[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method289() + var41;
				var41 = var40;
				this.field552[var42] = var38;
				this.field553[var42] = var44;
				this.field554[var42] = var40;
			}
		}

		var4.field527 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field575[var42] = 0;
			this.field563[var42] = (short)var4.method327();
			this.field565[var42] = (short)var4.method327();
			this.field583[var42] = (short)var4.method327();
		}

		if (this.field546 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field546[var43] & 255;
				if (var44 != 255) {
					if ((this.field563[var44] & '\uffff') == this.field552[var43] && (this.field565[var44] & '\uffff') == this.field553[var43] && (this.field583[var44] & '\uffff') == this.field554[var43]) {
						this.field546[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field546 = null;
			}
		}

		if (!var3) {
			this.field560 = null;
		}

		if (!var2) {
			this.field578 = null;
		}

	}

	final int method353(class48 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field549[var2];
		int var5 = var1.field550[var2];
		int var6 = var1.field551[var2];

		for (int var7 = 0; var7 < this.field548; ++var7) {
			if (var4 == this.field549[var7] && var5 == this.field550[var7] && var6 == this.field551[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field549[this.field548] = var4;
			this.field550[this.field548] = var5;
			this.field551[this.field548] = var6;
			if (var1.field573 != null) {
				this.field573[this.field548] = var1.field573[var2];
			}

			if (var1.field567 != null) {
				this.field567[this.field548] = var1.field567[var2];
				this.field571[this.field548] = var1.field571[var2];
			}

			var3 = this.field548++;
		}

		return var3;
	}

	public class48 method354() {
		class48 var1 = new class48();
		if (this.field578 != null) {
			var1.field578 = new byte[this.field580];

			for (int var2 = 0; var2 < this.field580; ++var2) {
				var1.field578[var2] = this.field578[var2];
			}
		}

		var1.field548 = this.field548;
		var1.field580 = this.field580;
		var1.field562 = this.field562;
		var1.field549 = this.field549;
		var1.field550 = this.field550;
		var1.field551 = this.field551;
		var1.field552 = this.field552;
		var1.field553 = this.field553;
		var1.field554 = this.field554;
		var1.field556 = this.field556;
		var1.field557 = this.field557;
		var1.field546 = this.field546;
		var1.field559 = this.field559;
		var1.field560 = this.field560;
		var1.field561 = this.field561;
		var1.field575 = this.field575;
		var1.field563 = this.field563;
		var1.field565 = this.field565;
		var1.field583 = this.field583;
		var1.field573 = this.field573;
		var1.field586 = this.field586;
		var1.field568 = this.field568;
		var1.field569 = this.field569;
		var1.field558 = this.field558;
		var1.field572 = this.field572;
		var1.field587 = this.field587;
		var1.field576 = this.field576;
		return var1;
	}

	public class48 method355(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method367();
		int var7 = var2 + this.field579;
		int var8 = var2 + this.field555;
		int var9 = var4 + this.field582;
		int var10 = var4 + this.field581;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class48 var11;
				if (var5) {
					var11 = new class48();
					var11.field548 = this.field548;
					var11.field580 = this.field580;
					var11.field562 = this.field562;
					var11.field549 = this.field549;
					var11.field551 = this.field551;
					var11.field552 = this.field552;
					var11.field553 = this.field553;
					var11.field554 = this.field554;
					var11.field578 = this.field578;
					var11.field556 = this.field556;
					var11.field557 = this.field557;
					var11.field546 = this.field546;
					var11.field559 = this.field559;
					var11.field560 = this.field560;
					var11.field561 = this.field561;
					var11.field575 = this.field575;
					var11.field563 = this.field563;
					var11.field565 = this.field565;
					var11.field583 = this.field583;
					var11.field573 = this.field573;
					var11.field586 = this.field586;
					var11.field568 = this.field568;
					var11.field569 = this.field569;
					var11.field587 = this.field587;
					var11.field576 = this.field576;
					var11.field550 = new int[var11.field548];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field548; ++var12) {
						var13 = this.field549[var12] + var2;
						var14 = this.field551[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field550[var12] = this.field550[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field548; ++var12) {
						var13 = (-this.field550[var12] << 16) / super.field4080;
						if (var13 < var6) {
							var14 = this.field549[var12] + var2;
							var15 = this.field551[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field550[var12] = this.field550[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method366();
				return var11;
			}
		} else {
			return this;
		}
	}

	void method356() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field573 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field548; ++var3) {
				var4 = this.field573[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field568 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field568[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field548; this.field568[var4][var1[var4]++] = var3++) {
				var4 = this.field573[var3];
			}

			this.field573 = null;
		}

		if (this.field586 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field580; ++var3) {
				var4 = this.field586[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field569 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field569[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field580; this.field569[var4][var1[var4]++] = var3++) {
				var4 = this.field586[var3];
			}

			this.field586 = null;
		}

	}

	public void method357() {
		for (int var1 = 0; var1 < this.field548; ++var1) {
			int var2 = this.field549[var1];
			this.field549[var1] = this.field551[var1];
			this.field551[var1] = -var2;
		}

		this.method366();
	}

	public void method358() {
		for (int var1 = 0; var1 < this.field548; ++var1) {
			this.field549[var1] = -this.field549[var1];
			this.field551[var1] = -this.field551[var1];
		}

		this.method366();
	}

	public void method359() {
		for (int var1 = 0; var1 < this.field548; ++var1) {
			int var2 = this.field551[var1];
			this.field551[var1] = this.field549[var1];
			this.field549[var1] = -var2;
		}

		this.method366();
	}

	public void method360(int var1) {
		int var2 = field547[var1];
		int var3 = field570[var1];

		for (int var4 = 0; var4 < this.field548; ++var4) {
			int var5 = this.field551[var4] * var2 + this.field549[var4] * var3 >> 16;
			this.field551[var4] = this.field551[var4] * var3 - this.field549[var4] * var2 >> 16;
			this.field549[var4] = var5;
		}

		this.method366();
	}

	public void method361(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field548; ++var4) {
			int[] var10000 = this.field549;
			var10000[var4] += var1;
			var10000 = this.field550;
			var10000[var4] += var2;
			var10000 = this.field551;
			var10000[var4] += var3;
		}

		this.method366();
	}

	public void method372(short var1, short var2) {
		for (int var3 = 0; var3 < this.field580; ++var3) {
			if (this.field559[var3] == var1) {
				this.field559[var3] = var2;
			}
		}

	}

	public void method363(short var1, short var2) {
		if (this.field560 != null) {
			for (int var3 = 0; var3 < this.field580; ++var3) {
				if (this.field560[var3] == var1) {
					this.field560[var3] = var2;
				}
			}

		}
	}

	public void method362() {
		int var1;
		for (var1 = 0; var1 < this.field548; ++var1) {
			this.field551[var1] = -this.field551[var1];
		}

		for (var1 = 0; var1 < this.field580; ++var1) {
			int var2 = this.field552[var1];
			this.field552[var1] = this.field554[var1];
			this.field554[var1] = var2;
		}

		this.method366();
	}

	public void method364(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field548; ++var4) {
			this.field549[var4] = this.field549[var4] * var1 / 128;
			this.field550[var4] = this.field550[var4] * var2 / 128;
			this.field551[var4] = this.field551[var4] * var3 / 128;
		}

		this.method366();
	}

	public void method365() {
		if (this.field558 == null) {
			this.field558 = new class332[this.field548];

			int var1;
			for (var1 = 0; var1 < this.field548; ++var1) {
				this.field558[var1] = new class332();
			}

			for (var1 = 0; var1 < this.field580; ++var1) {
				int var2 = this.field552[var1];
				int var3 = this.field553[var1];
				int var4 = this.field554[var1];
				int var5 = this.field549[var3] - this.field549[var2];
				int var6 = this.field550[var3] - this.field550[var2];
				int var7 = this.field551[var3] - this.field551[var2];
				int var8 = this.field549[var4] - this.field549[var2];
				int var9 = this.field550[var4] - this.field550[var2];
				int var10 = this.field551[var4] - this.field551[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field578 == null) {
					var15 = 0;
				} else {
					var15 = this.field578[var1];
				}

				if (var15 == 0) {
					class332 var16 = this.field558[var2];
					var16.field2916 += var11;
					var16.field2915 += var12;
					var16.field2917 += var13;
					++var16.field2918;
					var16 = this.field558[var3];
					var16.field2916 += var11;
					var16.field2915 += var12;
					var16.field2917 += var13;
					++var16.field2918;
					var16 = this.field558[var4];
					var16.field2916 += var11;
					var16.field2915 += var12;
					var16.field2917 += var13;
					++var16.field2918;
				} else if (var15 == 1) {
					if (this.field572 == null) {
						this.field572 = new class383[this.field580];
					}

					class383 var17 = this.field572[var1] = new class383();
					var17.field3229 = var11;
					var17.field3228 = var12;
					var17.field3230 = var13;
				}
			}

		}
	}

	void method366() {
		this.field558 = null;
		this.field574 = null;
		this.field572 = null;
		this.field577 = false;
	}

	void method367() {
		if (!this.field577) {
			super.field4080 = 0;
			this.field585 = 0;
			this.field579 = 999999;
			this.field555 = -999999;
			this.field581 = -99999;
			this.field582 = 99999;

			for (int var1 = 0; var1 < this.field548; ++var1) {
				int var2 = this.field549[var1];
				int var3 = this.field550[var1];
				int var4 = this.field551[var1];
				if (var2 < this.field579) {
					this.field579 = var2;
				}

				if (var2 > this.field555) {
					this.field555 = var2;
				}

				if (var4 < this.field582) {
					this.field582 = var4;
				}

				if (var4 > this.field581) {
					this.field581 = var4;
				}

				if (-var3 > super.field4080) {
					super.field4080 = -var3;
				}

				if (var3 > this.field585) {
					this.field585 = var3;
				}
			}

			this.field577 = true;
		}
	}

	public final class250 method369(int var1, int var2, int var3, int var4, int var5) {
		this.method365();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class250 var8 = new class250();
		var8.field2275 = new int[this.field580];
		var8.field2276 = new int[this.field580];
		var8.field2277 = new int[this.field580];
		if (this.field562 > 0 && this.field546 != null) {
			int[] var9 = new int[this.field562];

			int var10;
			for (var10 = 0; var10 < this.field580; ++var10) {
				if (this.field546[var10] != -1) {
					++var9[this.field546[var10] & 255];
				}
			}

			var8.field2283 = 0;

			for (var10 = 0; var10 < this.field562; ++var10) {
				if (var9[var10] > 0 && this.field575[var10] == 0) {
					++var8.field2283;
				}
			}

			var8.field2284 = new int[var8.field2283];
			var8.field2285 = new int[var8.field2283];
			var8.field2278 = new int[var8.field2283];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field562; ++var11) {
				if (var9[var11] > 0 && this.field575[var11] == 0) {
					var8.field2284[var10] = this.field563[var11] & '\uffff';
					var8.field2285[var10] = this.field565[var11] & '\uffff';
					var8.field2278[var10] = this.field583[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field2280 = new byte[this.field580];

			for (var11 = 0; var11 < this.field580; ++var11) {
				if (this.field546[var11] != -1) {
					var8.field2280[var11] = (byte)var9[this.field546[var11] & 255];
				} else {
					var8.field2280[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field580; ++var16) {
			byte var17;
			if (this.field578 == null) {
				var17 = 0;
			} else {
				var17 = this.field578[var16];
			}

			byte var18;
			if (this.field557 == null) {
				var18 = 0;
			} else {
				var18 = this.field557[var16];
			}

			short var12;
			if (this.field560 == null) {
				var12 = -1;
			} else {
				var12 = this.field560[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			class332 var13;
			int var14;
			class383 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field572[var16];
						var14 = var1 + (var3 * var19.field3229 + var4 * var19.field3228 + var5 * var19.field3230) / (var7 + var7 / 2);
						var8.field2275[var16] = method374(this.field559[var16] & '\uffff', var14);
						var8.field2277[var16] = -1;
					} else if (var17 == 3) {
						var8.field2275[var16] = 128;
						var8.field2277[var16] = -1;
					} else {
						var8.field2277[var16] = -2;
					}
				} else {
					int var15 = this.field559[var16] & '\uffff';
					if (this.field574 != null && this.field574[this.field552[var16]] != null) {
						var13 = this.field574[this.field552[var16]];
					} else {
						var13 = this.field558[this.field552[var16]];
					}

					var14 = var1 + (var3 * var13.field2916 + var4 * var13.field2915 + var5 * var13.field2917) / (var7 * var13.field2918);
					var8.field2275[var16] = method374(var15, var14);
					if (this.field574 != null && this.field574[this.field553[var16]] != null) {
						var13 = this.field574[this.field553[var16]];
					} else {
						var13 = this.field558[this.field553[var16]];
					}

					var14 = var1 + (var3 * var13.field2916 + var4 * var13.field2915 + var5 * var13.field2917) / (var7 * var13.field2918);
					var8.field2276[var16] = method374(var15, var14);
					if (this.field574 != null && this.field574[this.field554[var16]] != null) {
						var13 = this.field574[this.field554[var16]];
					} else {
						var13 = this.field558[this.field554[var16]];
					}

					var14 = var1 + (var3 * var13.field2916 + var4 * var13.field2915 + var5 * var13.field2917) / (var7 * var13.field2918);
					var8.field2277[var16] = method374(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field572[var16];
					var14 = var1 + (var3 * var19.field3229 + var4 * var19.field3228 + var5 * var19.field3230) / (var7 + var7 / 2);
					var8.field2275[var16] = method370(var14);
					var8.field2277[var16] = -1;
				} else {
					var8.field2277[var16] = -2;
				}
			} else {
				if (this.field574 != null && this.field574[this.field552[var16]] != null) {
					var13 = this.field574[this.field552[var16]];
				} else {
					var13 = this.field558[this.field552[var16]];
				}

				var14 = var1 + (var3 * var13.field2916 + var4 * var13.field2915 + var5 * var13.field2917) / (var7 * var13.field2918);
				var8.field2275[var16] = method370(var14);
				if (this.field574 != null && this.field574[this.field553[var16]] != null) {
					var13 = this.field574[this.field553[var16]];
				} else {
					var13 = this.field558[this.field553[var16]];
				}

				var14 = var1 + (var3 * var13.field2916 + var4 * var13.field2915 + var5 * var13.field2917) / (var7 * var13.field2918);
				var8.field2276[var16] = method370(var14);
				if (this.field574 != null && this.field574[this.field554[var16]] != null) {
					var13 = this.field574[this.field554[var16]];
				} else {
					var13 = this.field558[this.field554[var16]];
				}

				var14 = var1 + (var3 * var13.field2916 + var4 * var13.field2915 + var5 * var13.field2917) / (var7 * var13.field2918);
				var8.field2277[var16] = method370(var14);
			}
		}

		this.method356();
		var8.field2323 = this.field548;
		var8.field2269 = this.field549;
		var8.field2270 = this.field550;
		var8.field2274 = this.field551;
		var8.field2271 = this.field580;
		var8.field2286 = this.field552;
		var8.field2273 = this.field553;
		var8.field2331 = this.field554;
		var8.field2330 = this.field556;
		var8.field2279 = this.field557;
		var8.field2282 = this.field561;
		var8.field2287 = this.field568;
		var8.field2288 = this.field569;
		var8.field2281 = this.field560;
		var8.field2289 = this.field567;
		var8.field2313 = this.field571;
		return var8;
	}

	public static class48 method373(class215 var0, int var1, int var2) {
		byte[] var3 = var0.method1212(var1, var2);
		return var3 == null ? null : new class48(var3);
	}

	static void method368(class48 var0, class48 var1, int var2, int var3, int var4, boolean var5) {
		var0.method367();
		var0.method365();
		var1.method367();
		var1.method365();
		++field564;
		int var6 = 0;
		int[] var7 = var1.field549;
		int var8 = var1.field548;

		int var9;
		for (var9 = 0; var9 < var0.field548; ++var9) {
			class332 var10 = var0.field558[var9];
			if (var10.field2918 != 0) {
				int var11 = var0.field550[var9] - var3;
				if (var11 <= var1.field585) {
					int var12 = var0.field549[var9] - var2;
					if (var12 >= var1.field579 && var12 <= var1.field555) {
						int var13 = var0.field551[var9] - var4;
						if (var13 >= var1.field582 && var13 <= var1.field581) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class332 var15 = var1.field558[var14];
								if (var12 == var7[var14] && var13 == var1.field551[var14] && var11 == var1.field550[var14] && var15.field2918 != 0) {
									if (var0.field574 == null) {
										var0.field574 = new class332[var0.field548];
									}

									if (var1.field574 == null) {
										var1.field574 = new class332[var8];
									}

									class332 var16 = var0.field574[var9];
									if (var16 == null) {
										var16 = var0.field574[var9] = new class332(var10);
									}

									class332 var17 = var1.field574[var14];
									if (var17 == null) {
										var17 = var1.field574[var14] = new class332(var15);
									}

									var16.field2916 += var15.field2916;
									var16.field2915 += var15.field2915;
									var16.field2917 += var15.field2917;
									var16.field2918 += var15.field2918;
									var17.field2916 += var10.field2916;
									var17.field2915 += var10.field2915;
									var17.field2917 += var10.field2917;
									var17.field2918 += var10.field2918;
									++var6;
									field566[var9] = field564;
									field584[var14] = field564;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field580; ++var9) {
				if (field566[var0.field552[var9]] == field564 && field566[var0.field553[var9]] == field564 && field566[var0.field554[var9]] == field564) {
					if (var0.field578 == null) {
						var0.field578 = new byte[var0.field580];
					}

					var0.field578[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field580; ++var9) {
				if (field584[var1.field552[var9]] == field564 && field584[var1.field553[var9]] == field564 && field584[var1.field554[var9]] == field564) {
					if (var1.field578 == null) {
						var1.field578 = new byte[var1.field580];
					}

					var1.field578[var9] = 2;
				}
			}

		}
	}

	static final int method374(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static final int method370(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
