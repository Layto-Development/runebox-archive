public class class462 extends class189 {

	static int field3521;

	static int[] field3504;

	static int[] field3523;

	static int[] field3527;

	static int[] field3541;

	boolean field3534;

	byte field3518;

	byte[] field3503;

	byte[] field3513;

	byte[] field3514;

	byte[] field3532;

	byte[] field3535;

	class233[] field3529;

	class92[] field3515;

	class92[] field3531;

	int field3505;

	int field3512;

	int field3519;

	int field3536;

	int field3537;

	int field3538;

	int field3539;

	int field3542;

	int[] field3506;

	int[] field3507;

	int[] field3508;

	int[] field3509;

	int[] field3510;

	int[] field3511;

	int[] field3530;

	int[] field3543;

	int[][] field3524;

	int[][] field3525;

	int[][] field3526;

	int[][] field3528;

	short[] field3516;

	short[] field3517;

	short[] field3520;

	short[] field3522;

	short[] field3540;

	public short field3533;

	public short field3544;

	static {
		field3523 = new int[10000];
		field3541 = new int[10000];
		field3521 = 0;
		field3504 = class238.field2037;
		field3527 = class238.field2035;
	}

	class462() {
		this.field3505 = 0;
		this.field3537 = 0;
		this.field3518 = 0;
		this.field3534 = false;
	}

	class462(byte[] var1) {
		this.field3505 = 0;
		this.field3537 = 0;
		this.field3518 = 0;
		this.field3534 = false;
		class187 var2 = new class187(10);
		var2.method1126(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method2261(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method2257(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method2263(var1);
		} else {
			this.method2262(var1);
		}
	}

	public class462(class462[] var1, int var2) {
		this.field3505 = 0;
		this.field3537 = 0;
		this.field3518 = 0;
		this.field3534 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field3505 = 0;
		this.field3537 = 0;
		this.field3519 = 0;
		this.field3518 = -1;
		int var10;
		class462 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field3505 += var11.field3505;
				this.field3537 += var11.field3537;
				this.field3519 += var11.field3519;
				if (var11.field3513 != null) {
					var4 = true;
				} else {
					if (this.field3518 == -1) {
						this.field3518 = var11.field3518;
					}
					if (this.field3518 != var11.field3518) {
						var4 = true;
					}
				}
				var3 |= var11.field3535 != null;
				var5 |= var11.field3514 != null;
				var6 |= var11.field3543 != null;
				var7 |= var11.field3517 != null;
				var8 |= var11.field3503 != null;
				var9 |= var11.field3524 != null;
			}
		}
		this.field3506 = new int[this.field3505];
		this.field3507 = new int[this.field3505];
		this.field3508 = new int[this.field3505];
		this.field3530 = new int[this.field3505];
		this.field3509 = new int[this.field3537];
		this.field3510 = new int[this.field3537];
		this.field3511 = new int[this.field3537];
		if (var3) {
			this.field3535 = new byte[this.field3537];
		}
		if (var4) {
			this.field3513 = new byte[this.field3537];
		}
		if (var5) {
			this.field3514 = new byte[this.field3537];
		}
		if (var6) {
			this.field3543 = new int[this.field3537];
		}
		if (var7) {
			this.field3517 = new short[this.field3537];
		}
		if (var8) {
			this.field3503 = new byte[this.field3537];
		}
		if (var9) {
			this.field3524 = new int[this.field3505][];
			this.field3528 = new int[this.field3505][];
		}
		this.field3516 = new short[this.field3537];
		if (this.field3519 > 0) {
			this.field3532 = new byte[this.field3519];
			this.field3520 = new short[this.field3519];
			this.field3522 = new short[this.field3519];
			this.field3540 = new short[this.field3519];
		}
		this.field3505 = 0;
		this.field3537 = 0;
		this.field3519 = 0;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field3537; ++var12) {
					if (var3 && var11.field3535 != null) {
						this.field3535[this.field3537] = var11.field3535[var12];
					}
					if (var4) {
						if (var11.field3513 != null) {
							this.field3513[this.field3537] = var11.field3513[var12];
						} else {
							this.field3513[this.field3537] = var11.field3518;
						}
					}
					if (var5 && var11.field3514 != null) {
						this.field3514[this.field3537] = var11.field3514[var12];
					}
					if (var6 && var11.field3543 != null) {
						this.field3543[this.field3537] = var11.field3543[var12];
					}
					if (var7) {
						if (var11.field3517 != null) {
							this.field3517[this.field3537] = var11.field3517[var12];
						} else {
							this.field3517[this.field3537] = -1;
						}
					}
					if (var8) {
						if (var11.field3503 != null && var11.field3503[var12] != -1) {
							this.field3503[this.field3537] = (byte) (var11.field3503[var12] + this.field3519);
						} else {
							this.field3503[this.field3537] = -1;
						}
					}
					this.field3516[this.field3537] = var11.field3516[var12];
					this.field3509[this.field3537] = this.method2239(var11, var11.field3509[var12]);
					this.field3510[this.field3537] = this.method2239(var11, var11.field3510[var12]);
					this.field3511[this.field3537] = this.method2239(var11, var11.field3511[var12]);
					++this.field3537;
				}
				for (var12 = 0; var12 < var11.field3519; ++var12) {
					byte var13 = this.field3532[this.field3519] = var11.field3532[var12];
					if (var13 == 0) {
						this.field3520[this.field3519] = (short) this.method2239(var11, var11.field3520[var12]);
						this.field3522[this.field3519] = (short) this.method2239(var11, var11.field3522[var12]);
						this.field3540[this.field3519] = (short) this.method2239(var11, var11.field3540[var12]);
					}
					++this.field3519;
				}
			}
		}
	}

	public class462(class462 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field3505 = 0;
		this.field3537 = 0;
		this.field3518 = 0;
		this.field3534 = false;
		this.field3505 = var1.field3505;
		this.field3537 = var1.field3537;
		this.field3519 = var1.field3519;
		int var6;
		if (var2) {
			this.field3506 = var1.field3506;
			this.field3507 = var1.field3507;
			this.field3508 = var1.field3508;
		} else {
			this.field3506 = new int[this.field3505];
			this.field3507 = new int[this.field3505];
			this.field3508 = new int[this.field3505];
			for (var6 = 0; var6 < this.field3505; ++var6) {
				this.field3506[var6] = var1.field3506[var6];
				this.field3507[var6] = var1.field3507[var6];
				this.field3508[var6] = var1.field3508[var6];
			}
		}
		if (var3) {
			this.field3516 = var1.field3516;
		} else {
			this.field3516 = new short[this.field3537];
			for (var6 = 0; var6 < this.field3537; ++var6) {
				this.field3516[var6] = var1.field3516[var6];
			}
		}
		if (!var4 && var1.field3517 != null) {
			this.field3517 = new short[this.field3537];
			for (var6 = 0; var6 < this.field3537; ++var6) {
				this.field3517[var6] = var1.field3517[var6];
			}
		} else {
			this.field3517 = var1.field3517;
		}
		this.field3514 = var1.field3514;
		this.field3509 = var1.field3509;
		this.field3510 = var1.field3510;
		this.field3511 = var1.field3511;
		this.field3535 = var1.field3535;
		this.field3513 = var1.field3513;
		this.field3503 = var1.field3503;
		this.field3518 = var1.field3518;
		this.field3532 = var1.field3532;
		this.field3520 = var1.field3520;
		this.field3522 = var1.field3522;
		this.field3540 = var1.field3540;
		this.field3530 = var1.field3530;
		this.field3543 = var1.field3543;
		this.field3525 = var1.field3525;
		this.field3526 = var1.field3526;
		this.field3515 = var1.field3515;
		this.field3529 = var1.field3529;
		this.field3531 = var1.field3531;
		this.field3524 = var1.field3524;
		this.field3528 = var1.field3528;
		this.field3544 = var1.field3544;
		this.field3533 = var1.field3533;
	}

	void method2261(byte[] var1) {
		class187 var2 = new class187(var1);
		class187 var3 = new class187(var1);
		class187 var4 = new class187(var1);
		class187 var5 = new class187(var1);
		class187 var6 = new class187(var1);
		class187 var7 = new class187(var1);
		class187 var8 = new class187(var1);
		var2.field1832 = var1.length - 26;
		int var9 = var2.method1145();
		int var10 = var2.method1145();
		int var11 = var2.method1096();
		int var12 = var2.method1096();
		int var13 = var2.method1096();
		int var14 = var2.method1096();
		int var15 = var2.method1096();
		int var16 = var2.method1096();
		int var17 = var2.method1096();
		int var18 = var2.method1096();
		int var19 = var2.method1145();
		int var20 = var2.method1145();
		int var21 = var2.method1145();
		int var22 = var2.method1145();
		int var23 = var2.method1145();
		int var24 = var2.method1145();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field3532 = new byte[var11];
			var2.field1832 = 0;
			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field3532[var28] = var2.method1097();
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
		this.field3505 = var9;
		this.field3537 = var10;
		this.field3519 = var11;
		this.field3506 = new int[var9];
		this.field3507 = new int[var9];
		this.field3508 = new int[var9];
		this.field3509 = new int[var10];
		this.field3510 = new int[var10];
		this.field3511 = new int[var10];
		if (var17 == 1) {
			this.field3530 = new int[var9];
		}
		if (var12 == 1) {
			this.field3535 = new byte[var10];
		}
		if (var13 == 255) {
			this.field3513 = new byte[var10];
		} else {
			this.field3518 = (byte) var13;
		}
		if (var14 == 1) {
			this.field3514 = new byte[var10];
		}
		if (var15 == 1) {
			this.field3543 = new int[var10];
		}
		if (var16 == 1) {
			this.field3517 = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.field3503 = new byte[var10];
		}
		if (var18 == 1) {
			this.field3524 = new int[var9][];
			this.field3528 = new int[var9][];
		}
		this.field3516 = new short[var10];
		if (var11 > 0) {
			this.field3520 = new short[var11];
			this.field3522 = new short[var11];
			this.field3540 = new short[var11];
		}
		var2.field1832 = var11;
		var3.field1832 = var40;
		var4.field1832 = var41;
		var5.field1832 = var42;
		var6.field1832 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;
		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method1096();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method1107();
			}
			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method1107();
			}
			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method1107();
			}
			this.field3506[var53] = var50 + var55;
			this.field3507[var53] = var51 + var56;
			this.field3508[var53] = var52 + var57;
			var50 = this.field3506[var53];
			var51 = this.field3507[var53];
			var52 = this.field3508[var53];
			if (var17 == 1) {
				this.field3530[var53] = var6.method1096();
			}
		}
		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method1096();
				this.field3524[var53] = new int[var54];
				this.field3528[var53] = new int[var54];
				for (var55 = 0; var55 < var54; ++var55) {
					this.field3524[var53][var55] = var6.method1096();
					this.field3528[var53][var55] = var6.method1096();
				}
			}
		}
		var2.field1832 = var39;
		var3.field1832 = var30;
		var4.field1832 = var32;
		var5.field1832 = var35;
		var6.field1832 = var33;
		var7.field1832 = var37;
		var8.field1832 = var38;
		for (var53 = 0; var53 < var10; ++var53) {
			this.field3516[var53] = (short) var2.method1145();
			if (var12 == 1) {
				this.field3535[var53] = var3.method1097();
			}
			if (var13 == 255) {
				this.field3513[var53] = var4.method1097();
			}
			if (var14 == 1) {
				this.field3514[var53] = var5.method1097();
			}
			if (var15 == 1) {
				this.field3543[var53] = var6.method1096();
			}
			if (var16 == 1) {
				this.field3517[var53] = (short) (var7.method1145() - 1);
			}
			if (this.field3503 != null && this.field3517[var53] != -1) {
				this.field3503[var53] = (byte) (var8.method1096() - 1);
			}
		}
		var2.field1832 = var36;
		var3.field1832 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;
		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method1096();
			if (var58 == 1) {
				var53 = var2.method1107() + var56;
				var54 = var2.method1107() + var53;
				var55 = var2.method1107() + var54;
				var56 = var55;
				this.field3509[var57] = var53;
				this.field3510[var57] = var54;
				this.field3511[var57] = var55;
			}
			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method1107() + var56;
				var56 = var55;
				this.field3509[var57] = var53;
				this.field3510[var57] = var54;
				this.field3511[var57] = var55;
			}
			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method1107() + var56;
				var56 = var55;
				this.field3509[var57] = var53;
				this.field3510[var57] = var54;
				this.field3511[var57] = var55;
			}
			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method1107() + var56;
				var56 = var55;
				this.field3509[var57] = var53;
				this.field3510[var57] = var59;
				this.field3511[var57] = var55;
			}
		}
		var2.field1832 = var43;
		var3.field1832 = var44;
		var4.field1832 = var45;
		var5.field1832 = var46;
		var6.field1832 = var47;
		var7.field1832 = var48;
		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field3532[var57] & 255;
			if (var58 == 0) {
				this.field3520[var57] = (short) var2.method1145();
				this.field3522[var57] = (short) var2.method1145();
				this.field3540[var57] = (short) var2.method1145();
			}
		}
		var2.field1832 = var28;
		var57 = var2.method1096();
		if (var57 != 0) {
			new class446();
			var2.method1145();
			var2.method1145();
			var2.method1145();
			var2.method1100();
		}
	}

	void method2257(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class187 var4 = new class187(var1);
		class187 var5 = new class187(var1);
		class187 var6 = new class187(var1);
		class187 var7 = new class187(var1);
		class187 var8 = new class187(var1);
		var4.field1832 = var1.length - 23;
		int var9 = var4.method1145();
		int var10 = var4.method1145();
		int var11 = var4.method1096();
		int var12 = var4.method1096();
		int var13 = var4.method1096();
		int var14 = var4.method1096();
		int var15 = var4.method1096();
		int var16 = var4.method1096();
		int var17 = var4.method1096();
		int var18 = var4.method1145();
		int var19 = var4.method1145();
		int var20 = var4.method1145();
		int var21 = var4.method1145();
		int var22 = var4.method1145();
		boolean var23 = false;
		boolean var24 = false;
		int var47 = 0 + var9;
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
		this.field3505 = var9;
		this.field3537 = var10;
		this.field3519 = var11;
		this.field3506 = new int[var9];
		this.field3507 = new int[var9];
		this.field3508 = new int[var9];
		this.field3509 = new int[var10];
		this.field3510 = new int[var10];
		this.field3511 = new int[var10];
		if (var11 > 0) {
			this.field3532 = new byte[var11];
			this.field3520 = new short[var11];
			this.field3522 = new short[var11];
			this.field3540 = new short[var11];
		}
		if (var16 == 1) {
			this.field3530 = new int[var9];
		}
		if (var12 == 1) {
			this.field3535 = new byte[var10];
			this.field3503 = new byte[var10];
			this.field3517 = new short[var10];
		}
		if (var13 == 255) {
			this.field3513 = new byte[var10];
		} else {
			this.field3518 = (byte) var13;
		}
		if (var14 == 1) {
			this.field3514 = new byte[var10];
		}
		if (var15 == 1) {
			this.field3543 = new int[var10];
		}
		if (var17 == 1) {
			this.field3524 = new int[var9][];
			this.field3528 = new int[var9][];
		}
		this.field3516 = new short[var10];
		var4.field1832 = 0;
		var5.field1832 = var34;
		var6.field1832 = var35;
		var7.field1832 = var47;
		var8.field1832 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;
		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method1096();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method1107();
			}
			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method1107();
			}
			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method1107();
			}
			this.field3506[var40] = var37 + var42;
			this.field3507[var40] = var38 + var43;
			this.field3508[var40] = var39 + var44;
			var37 = this.field3506[var40];
			var38 = this.field3507[var40];
			var39 = this.field3508[var40];
			if (var16 == 1) {
				this.field3530[var40] = var8.method1096();
			}
		}
		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method1096();
				this.field3524[var40] = new int[var41];
				this.field3528[var40] = new int[var41];
				for (var42 = 0; var42 < var41; ++var42) {
					this.field3524[var40][var42] = var8.method1096();
					this.field3528[var40][var42] = var8.method1096();
				}
			}
		}
		var4.field1832 = var32;
		var5.field1832 = var28;
		var6.field1832 = var26;
		var7.field1832 = var30;
		var8.field1832 = var27;
		for (var40 = 0; var40 < var10; ++var40) {
			this.field3516[var40] = (short) var4.method1145();
			if (var12 == 1) {
				var41 = var5.method1096();
				if ((var41 & 1) == 1) {
					this.field3535[var40] = 1;
					var2 = true;
				} else {
					this.field3535[var40] = 0;
				}
				if ((var41 & 2) == 2) {
					this.field3503[var40] = (byte) (var41 >> 2);
					this.field3517[var40] = this.field3516[var40];
					this.field3516[var40] = 127;
					if (this.field3517[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field3503[var40] = -1;
					this.field3517[var40] = -1;
				}
			}
			if (var13 == 255) {
				this.field3513[var40] = var6.method1097();
			}
			if (var14 == 1) {
				this.field3514[var40] = var7.method1097();
			}
			if (var15 == 1) {
				this.field3543[var40] = var8.method1096();
			}
		}
		var4.field1832 = var31;
		var5.field1832 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;
		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method1096();
			if (var45 == 1) {
				var40 = var4.method1107() + var43;
				var41 = var4.method1107() + var40;
				var42 = var4.method1107() + var41;
				var43 = var42;
				this.field3509[var44] = var40;
				this.field3510[var44] = var41;
				this.field3511[var44] = var42;
			}
			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method1107() + var43;
				var43 = var42;
				this.field3509[var44] = var40;
				this.field3510[var44] = var41;
				this.field3511[var44] = var42;
			}
			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method1107() + var43;
				var43 = var42;
				this.field3509[var44] = var40;
				this.field3510[var44] = var41;
				this.field3511[var44] = var42;
			}
			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method1107() + var43;
				var43 = var42;
				this.field3509[var44] = var40;
				this.field3510[var44] = var46;
				this.field3511[var44] = var42;
			}
		}
		var4.field1832 = var33;
		for (var44 = 0; var44 < var11; ++var44) {
			this.field3532[var44] = 0;
			this.field3520[var44] = (short) var4.method1145();
			this.field3522[var44] = (short) var4.method1145();
			this.field3540[var44] = (short) var4.method1145();
		}
		if (this.field3503 != null) {
			boolean var48 = false;
			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field3503[var45] & 255;
				if (var46 != 255) {
					if ((this.field3520[var46] & '\uffff') == this.field3509[var45] && (this.field3522[var46] & '\uffff') == this.field3510[var45] && (this.field3540[var46] & '\uffff') == this.field3511[var45]) {
						this.field3503[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}
			if (!var48) {
				this.field3503 = null;
			}
		}
		if (!var3) {
			this.field3517 = null;
		}
		if (!var2) {
			this.field3535 = null;
		}
	}

	void method2263(byte[] var1) {
		class187 var2 = new class187(var1);
		class187 var3 = new class187(var1);
		class187 var4 = new class187(var1);
		class187 var5 = new class187(var1);
		class187 var6 = new class187(var1);
		class187 var7 = new class187(var1);
		class187 var8 = new class187(var1);
		var2.field1832 = var1.length - 23;
		int var9 = var2.method1145();
		int var10 = var2.method1145();
		int var11 = var2.method1096();
		int var12 = var2.method1096();
		int var13 = var2.method1096();
		int var14 = var2.method1096();
		int var15 = var2.method1096();
		int var16 = var2.method1096();
		int var17 = var2.method1096();
		int var18 = var2.method1145();
		int var19 = var2.method1145();
		int var20 = var2.method1145();
		int var21 = var2.method1145();
		int var22 = var2.method1145();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field3532 = new byte[var11];
			var2.field1832 = 0;
			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field3532[var26] = var2.method1097();
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
		this.field3505 = var9;
		this.field3537 = var10;
		this.field3519 = var11;
		this.field3506 = new int[var9];
		this.field3507 = new int[var9];
		this.field3508 = new int[var9];
		this.field3509 = new int[var10];
		this.field3510 = new int[var10];
		this.field3511 = new int[var10];
		if (var17 == 1) {
			this.field3530 = new int[var9];
		}
		if (var12 == 1) {
			this.field3535 = new byte[var10];
		}
		if (var13 == 255) {
			this.field3513 = new byte[var10];
		} else {
			this.field3518 = (byte) var13;
		}
		if (var14 == 1) {
			this.field3514 = new byte[var10];
		}
		if (var15 == 1) {
			this.field3543 = new int[var10];
		}
		if (var16 == 1) {
			this.field3517 = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.field3503 = new byte[var10];
		}
		this.field3516 = new short[var10];
		if (var11 > 0) {
			this.field3520 = new short[var11];
			this.field3522 = new short[var11];
			this.field3540 = new short[var11];
		}
		var2.field1832 = var11;
		var3.field1832 = var38;
		var4.field1832 = var39;
		var5.field1832 = var40;
		var6.field1832 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;
		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method1096();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method1107();
			}
			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method1107();
			}
			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method1107();
			}
			this.field3506[var51] = var48 + var53;
			this.field3507[var51] = var49 + var54;
			this.field3508[var51] = var50 + var55;
			var48 = this.field3506[var51];
			var49 = this.field3507[var51];
			var50 = this.field3508[var51];
			if (var17 == 1) {
				this.field3530[var51] = var6.method1096();
			}
		}
		var2.field1832 = var37;
		var3.field1832 = var28;
		var4.field1832 = var30;
		var5.field1832 = var33;
		var6.field1832 = var31;
		var7.field1832 = var35;
		var8.field1832 = var36;
		for (var51 = 0; var51 < var10; ++var51) {
			this.field3516[var51] = (short) var2.method1145();
			if (var12 == 1) {
				this.field3535[var51] = var3.method1097();
			}
			if (var13 == 255) {
				this.field3513[var51] = var4.method1097();
			}
			if (var14 == 1) {
				this.field3514[var51] = var5.method1097();
			}
			if (var15 == 1) {
				this.field3543[var51] = var6.method1096();
			}
			if (var16 == 1) {
				this.field3517[var51] = (short) (var7.method1145() - 1);
			}
			if (this.field3503 != null && this.field3517[var51] != -1) {
				this.field3503[var51] = (byte) (var8.method1096() - 1);
			}
		}
		var2.field1832 = var34;
		var3.field1832 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;
		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method1096();
			if (var56 == 1) {
				var51 = var2.method1107() + var54;
				var52 = var2.method1107() + var51;
				var53 = var2.method1107() + var52;
				var54 = var53;
				this.field3509[var55] = var51;
				this.field3510[var55] = var52;
				this.field3511[var55] = var53;
			}
			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method1107() + var54;
				var54 = var53;
				this.field3509[var55] = var51;
				this.field3510[var55] = var52;
				this.field3511[var55] = var53;
			}
			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method1107() + var54;
				var54 = var53;
				this.field3509[var55] = var51;
				this.field3510[var55] = var52;
				this.field3511[var55] = var53;
			}
			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method1107() + var54;
				var54 = var53;
				this.field3509[var55] = var51;
				this.field3510[var55] = var57;
				this.field3511[var55] = var53;
			}
		}
		var2.field1832 = var41;
		var3.field1832 = var42;
		var4.field1832 = var43;
		var5.field1832 = var44;
		var6.field1832 = var45;
		var7.field1832 = var46;
		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field3532[var55] & 255;
			if (var56 == 0) {
				this.field3520[var55] = (short) var2.method1145();
				this.field3522[var55] = (short) var2.method1145();
				this.field3540[var55] = (short) var2.method1145();
			}
		}
		var2.field1832 = var26;
		var55 = var2.method1096();
		if (var55 != 0) {
			new class446();
			var2.method1145();
			var2.method1145();
			var2.method1145();
			var2.method1100();
		}
	}

	void method2262(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class187 var4 = new class187(var1);
		class187 var5 = new class187(var1);
		class187 var6 = new class187(var1);
		class187 var7 = new class187(var1);
		class187 var8 = new class187(var1);
		var4.field1832 = var1.length - 18;
		int var9 = var4.method1145();
		int var10 = var4.method1145();
		int var11 = var4.method1096();
		int var12 = var4.method1096();
		int var13 = var4.method1096();
		int var14 = var4.method1096();
		int var15 = var4.method1096();
		int var16 = var4.method1096();
		int var17 = var4.method1145();
		int var18 = var4.method1145();
		int var19 = var4.method1145();
		int var20 = var4.method1145();
		boolean var21 = false;
		boolean var22 = false;
		int var45 = 0 + var9;
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
		this.field3505 = var9;
		this.field3537 = var10;
		this.field3519 = var11;
		this.field3506 = new int[var9];
		this.field3507 = new int[var9];
		this.field3508 = new int[var9];
		this.field3509 = new int[var10];
		this.field3510 = new int[var10];
		this.field3511 = new int[var10];
		if (var11 > 0) {
			this.field3532 = new byte[var11];
			this.field3520 = new short[var11];
			this.field3522 = new short[var11];
			this.field3540 = new short[var11];
		}
		if (var16 == 1) {
			this.field3530 = new int[var9];
		}
		if (var12 == 1) {
			this.field3535 = new byte[var10];
			this.field3503 = new byte[var10];
			this.field3517 = new short[var10];
		}
		if (var13 == 255) {
			this.field3513 = new byte[var10];
		} else {
			this.field3518 = (byte) var13;
		}
		if (var14 == 1) {
			this.field3514 = new byte[var10];
		}
		if (var15 == 1) {
			this.field3543 = new int[var10];
		}
		this.field3516 = new short[var10];
		var4.field1832 = 0;
		var5.field1832 = var32;
		var6.field1832 = var33;
		var7.field1832 = var45;
		var8.field1832 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;
		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method1096();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method1107();
			}
			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method1107();
			}
			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method1107();
			}
			this.field3506[var38] = var35 + var40;
			this.field3507[var38] = var36 + var41;
			this.field3508[var38] = var37 + var42;
			var35 = this.field3506[var38];
			var36 = this.field3507[var38];
			var37 = this.field3508[var38];
			if (var16 == 1) {
				this.field3530[var38] = var8.method1096();
			}
		}
		var4.field1832 = var30;
		var5.field1832 = var26;
		var6.field1832 = var24;
		var7.field1832 = var28;
		var8.field1832 = var25;
		for (var38 = 0; var38 < var10; ++var38) {
			this.field3516[var38] = (short) var4.method1145();
			if (var12 == 1) {
				var39 = var5.method1096();
				if ((var39 & 1) == 1) {
					this.field3535[var38] = 1;
					var2 = true;
				} else {
					this.field3535[var38] = 0;
				}
				if ((var39 & 2) == 2) {
					this.field3503[var38] = (byte) (var39 >> 2);
					this.field3517[var38] = this.field3516[var38];
					this.field3516[var38] = 127;
					if (this.field3517[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field3503[var38] = -1;
					this.field3517[var38] = -1;
				}
			}
			if (var13 == 255) {
				this.field3513[var38] = var6.method1097();
			}
			if (var14 == 1) {
				this.field3514[var38] = var7.method1097();
			}
			if (var15 == 1) {
				this.field3543[var38] = var8.method1096();
			}
		}
		var4.field1832 = var29;
		var5.field1832 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;
		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method1096();
			if (var43 == 1) {
				var38 = var4.method1107() + var41;
				var39 = var4.method1107() + var38;
				var40 = var4.method1107() + var39;
				var41 = var40;
				this.field3509[var42] = var38;
				this.field3510[var42] = var39;
				this.field3511[var42] = var40;
			}
			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method1107() + var41;
				var41 = var40;
				this.field3509[var42] = var38;
				this.field3510[var42] = var39;
				this.field3511[var42] = var40;
			}
			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method1107() + var41;
				var41 = var40;
				this.field3509[var42] = var38;
				this.field3510[var42] = var39;
				this.field3511[var42] = var40;
			}
			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method1107() + var41;
				var41 = var40;
				this.field3509[var42] = var38;
				this.field3510[var42] = var44;
				this.field3511[var42] = var40;
			}
		}
		var4.field1832 = var31;
		for (var42 = 0; var42 < var11; ++var42) {
			this.field3532[var42] = 0;
			this.field3520[var42] = (short) var4.method1145();
			this.field3522[var42] = (short) var4.method1145();
			this.field3540[var42] = (short) var4.method1145();
		}
		if (this.field3503 != null) {
			boolean var46 = false;
			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field3503[var43] & 255;
				if (var44 != 255) {
					if ((this.field3520[var44] & '\uffff') == this.field3509[var43] && (this.field3522[var44] & '\uffff') == this.field3510[var43] && (this.field3540[var44] & '\uffff') == this.field3511[var43]) {
						this.field3503[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}
			if (!var46) {
				this.field3503 = null;
			}
		}
		if (!var3) {
			this.field3517 = null;
		}
		if (!var2) {
			this.field3535 = null;
		}
	}

	final int method2239(class462 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field3506[var2];
		int var5 = var1.field3507[var2];
		int var6 = var1.field3508[var2];
		for (int var7 = 0; var7 < this.field3505; ++var7) {
			if (var4 == this.field3506[var7] && var5 == this.field3507[var7] && var6 == this.field3508[var7]) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.field3506[this.field3505] = var4;
			this.field3507[this.field3505] = var5;
			this.field3508[this.field3505] = var6;
			if (var1.field3530 != null) {
				this.field3530[this.field3505] = var1.field3530[var2];
			}
			if (var1.field3524 != null) {
				this.field3524[this.field3505] = var1.field3524[var2];
				this.field3528[this.field3505] = var1.field3528[var2];
			}
			var3 = this.field3505++;
		}
		return var3;
	}

	public class462 method2240() {
		class462 var1 = new class462();
		if (this.field3535 != null) {
			var1.field3535 = new byte[this.field3537];
			for (int var2 = 0; var2 < this.field3537; ++var2) {
				var1.field3535[var2] = this.field3535[var2];
			}
		}
		var1.field3505 = this.field3505;
		var1.field3537 = this.field3537;
		var1.field3519 = this.field3519;
		var1.field3506 = this.field3506;
		var1.field3507 = this.field3507;
		var1.field3508 = this.field3508;
		var1.field3509 = this.field3509;
		var1.field3510 = this.field3510;
		var1.field3511 = this.field3511;
		var1.field3513 = this.field3513;
		var1.field3514 = this.field3514;
		var1.field3503 = this.field3503;
		var1.field3516 = this.field3516;
		var1.field3517 = this.field3517;
		var1.field3518 = this.field3518;
		var1.field3532 = this.field3532;
		var1.field3520 = this.field3520;
		var1.field3522 = this.field3522;
		var1.field3540 = this.field3540;
		var1.field3530 = this.field3530;
		var1.field3543 = this.field3543;
		var1.field3525 = this.field3525;
		var1.field3526 = this.field3526;
		var1.field3515 = this.field3515;
		var1.field3529 = this.field3529;
		var1.field3544 = this.field3544;
		var1.field3533 = this.field3533;
		return var1;
	}

	public class462 method2241(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method2253();
		int var7 = var2 + this.field3536;
		int var8 = var2 + this.field3512;
		int var9 = var4 + this.field3539;
		int var10 = var4 + this.field3538;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class462 var11 = new class462();
				var11.field3505 = this.field3505;
				var11.field3537 = this.field3537;
				var11.field3519 = this.field3519;
				var11.field3506 = this.field3506;
				var11.field3508 = this.field3508;
				var11.field3509 = this.field3509;
				var11.field3510 = this.field3510;
				var11.field3511 = this.field3511;
				var11.field3535 = this.field3535;
				var11.field3513 = this.field3513;
				var11.field3514 = this.field3514;
				var11.field3503 = this.field3503;
				var11.field3516 = this.field3516;
				var11.field3517 = this.field3517;
				var11.field3518 = this.field3518;
				var11.field3532 = this.field3532;
				var11.field3520 = this.field3520;
				var11.field3522 = this.field3522;
				var11.field3540 = this.field3540;
				var11.field3530 = this.field3530;
				var11.field3543 = this.field3543;
				var11.field3525 = this.field3525;
				var11.field3526 = this.field3526;
				var11.field3544 = this.field3544;
				var11.field3533 = this.field3533;
				var11.field3507 = new int[var11.field3505];
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
					for (var12 = 0; var12 < var11.field3505; ++var12) {
						var13 = this.field3506[var12] + var2;
						var14 = this.field3508[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field3507[var12] = this.field3507[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field3505; ++var12) {
						var13 = (-this.field3507[var12] << 16) / super.field1834;
						if (var13 < var6) {
							var14 = this.field3506[var12] + var2;
							var15 = this.field3508[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field3507[var12] = this.field3507[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}
				var11.method2252();
				return var11;
			}
		} else {
			return this;
		}
	}

	void method2242() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field3530 != null) {
			var1 = new int[256];
			var2 = 0;
			for (var3 = 0; var3 < this.field3505; ++var3) {
				var4 = this.field3530[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.field3525 = new int[var2 + 1][];
			for (var3 = 0; var3 <= var2; ++var3) {
				this.field3525[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}
			for (var3 = 0; var3 < this.field3505; this.field3525[var4][var1[var4]++] = var3++) {
				var4 = this.field3530[var3];
			}
			this.field3530 = null;
		}
		if (this.field3543 != null) {
			var1 = new int[256];
			var2 = 0;
			for (var3 = 0; var3 < this.field3537; ++var3) {
				var4 = this.field3543[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.field3526 = new int[var2 + 1][];
			for (var3 = 0; var3 <= var2; ++var3) {
				this.field3526[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}
			for (var3 = 0; var3 < this.field3537; this.field3526[var4][var1[var4]++] = var3++) {
				var4 = this.field3543[var3];
			}
			this.field3543 = null;
		}
	}

	public void method2243() {
		for (int var1 = 0; var1 < this.field3505; ++var1) {
			int var2 = this.field3506[var1];
			this.field3506[var1] = this.field3508[var1];
			this.field3508[var1] = -var2;
		}
		this.method2252();
	}

	public void method2244() {
		for (int var1 = 0; var1 < this.field3505; ++var1) {
			this.field3506[var1] = -this.field3506[var1];
			this.field3508[var1] = -this.field3508[var1];
		}
		this.method2252();
	}

	public void method2245() {
		for (int var1 = 0; var1 < this.field3505; ++var1) {
			int var2 = this.field3508[var1];
			this.field3508[var1] = this.field3506[var1];
			this.field3506[var1] = -var2;
		}
		this.method2252();
	}

	public void method2246(int var1) {
		int var2 = field3504[256];
		int var3 = field3527[256];
		for (int var4 = 0; var4 < this.field3505; ++var4) {
			int var5 = this.field3508[var4] * var2 + this.field3506[var4] * var3 >> 16;
			this.field3508[var4] = this.field3508[var4] * var3 - this.field3506[var4] * var2 >> 16;
			this.field3506[var4] = var5;
		}
		this.method2252();
	}

	public void method2247(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3505; ++var4) {
			int[] var10000 = this.field3506;
			var10000[var4] += var1;
			var10000 = this.field3507;
			var10000[var4] += var2;
			var10000 = this.field3508;
			var10000[var4] += var3;
		}
		this.method2252();
	}

	public void method2258(short var1, short var2) {
		for (int var3 = 0; var3 < this.field3537; ++var3) {
			if (this.field3516[var3] == var1) {
				this.field3516[var3] = var2;
			}
		}
	}

	public void method2249(short var1, short var2) {
		if (this.field3517 != null) {
			for (int var3 = 0; var3 < this.field3537; ++var3) {
				if (this.field3517[var3] == var1) {
					this.field3517[var3] = var2;
				}
			}
		}
	}

	public void method2248() {
		int var1;
		for (var1 = 0; var1 < this.field3505; ++var1) {
			this.field3508[var1] = -this.field3508[var1];
		}
		for (var1 = 0; var1 < this.field3537; ++var1) {
			int var2 = this.field3509[var1];
			this.field3509[var1] = this.field3511[var1];
			this.field3511[var1] = var2;
		}
		this.method2252();
	}

	public void method2250(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field3505; ++var4) {
			this.field3506[var4] = this.field3506[var4] * var1 / 128;
			this.field3507[var4] = this.field3507[var4] * var2 / 128;
			this.field3508[var4] = this.field3508[var4] * var3 / 128;
		}
		this.method2252();
	}

	public void method2251() {
		if (this.field3515 == null) {
			this.field3515 = new class92[this.field3505];
			int var1;
			for (var1 = 0; var1 < this.field3505; ++var1) {
				this.field3515[var1] = new class92();
			}
			for (var1 = 0; var1 < this.field3537; ++var1) {
				int var2 = this.field3509[var1];
				int var3 = this.field3510[var1];
				int var4 = this.field3511[var1];
				int var5 = this.field3506[var3] - this.field3506[var2];
				int var6 = this.field3507[var3] - this.field3507[var2];
				int var7 = this.field3508[var3] - this.field3508[var2];
				int var8 = this.field3506[var4] - this.field3506[var2];
				int var9 = this.field3507[var4] - this.field3507[var2];
				int var10 = this.field3508[var4] - this.field3508[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;
				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}
				int var14 = (int) Math.sqrt((double) (var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}
				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field3535 == null) {
					var15 = 0;
				} else {
					var15 = this.field3535[var1];
				}
				if (var15 == 0) {
					class92 var16 = this.field3515[var2];
					var16.field1207 += var11;
					var16.field1206 += var12;
					var16.field1208 += var13;
					++var16.field1209;
					var16 = this.field3515[var3];
					var16.field1207 += var11;
					var16.field1206 += var12;
					var16.field1208 += var13;
					++var16.field1209;
					var16 = this.field3515[var4];
					var16.field1207 += var11;
					var16.field1206 += var12;
					var16.field1208 += var13;
					++var16.field1209;
				} else if (var15 == 1) {
					if (this.field3529 == null) {
						this.field3529 = new class233[this.field3537];
					}
					class233 var17 = this.field3529[var1] = new class233();
					var17.field2021 = var11;
					var17.field2020 = var12;
					var17.field2022 = var13;
				}
			}
		}
	}

	void method2252() {
		this.field3515 = null;
		this.field3531 = null;
		this.field3529 = null;
		this.field3534 = false;
	}

	void method2253() {
		if (!this.field3534) {
			super.field1834 = 0;
			this.field3542 = 0;
			this.field3536 = 999999;
			this.field3512 = -999999;
			this.field3538 = -99999;
			this.field3539 = 99999;
			for (int var1 = 0; var1 < this.field3505; ++var1) {
				int var2 = this.field3506[var1];
				int var3 = this.field3507[var1];
				int var4 = this.field3508[var1];
				if (var2 < this.field3536) {
					this.field3536 = var2;
				}
				if (var2 > this.field3512) {
					this.field3512 = var2;
				}
				if (var4 < this.field3539) {
					this.field3539 = var4;
				}
				if (var4 > this.field3538) {
					this.field3538 = var4;
				}
				if (-var3 > super.field1834) {
					super.field1834 = -var3;
				}
				if (var3 > this.field3542) {
					this.field3542 = var3;
				}
			}
			this.field3534 = true;
		}
	}

	public final class113 method2255(int var1, int var2, int var3, int var4, int var5) {
		this.method2251();
		int var6 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class113 var8 = new class113();
		var8.field1331 = new int[this.field3537];
		var8.field1332 = new int[this.field3537];
		var8.field1333 = new int[this.field3537];
		if (this.field3519 > 0 && this.field3503 != null) {
			int[] var9 = new int[this.field3519];
			int var10;
			for (var10 = 0; var10 < this.field3537; ++var10) {
				if (this.field3503[var10] != -1) {
					++var9[this.field3503[var10] & 255];
				}
			}
			var8.field1339 = 0;
			for (var10 = 0; var10 < this.field3519; ++var10) {
				if (var9[var10] > 0 && this.field3532[var10] == 0) {
					++var8.field1339;
				}
			}
			var8.field1340 = new int[var8.field1339];
			var8.field1341 = new int[var8.field1339];
			var8.field1334 = new int[var8.field1339];
			var10 = 0;
			int var11;
			for (var11 = 0; var11 < this.field3519; ++var11) {
				if (var9[var11] > 0 && this.field3532[var11] == 0) {
					var8.field1340[var10] = this.field3520[var11] & '\uffff';
					var8.field1341[var10] = this.field3522[var11] & '\uffff';
					var8.field1334[var10] = this.field3540[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}
			var8.field1336 = new byte[this.field3537];
			for (var11 = 0; var11 < this.field3537; ++var11) {
				if (this.field3503[var11] != -1) {
					var8.field1336[var11] = (byte) var9[this.field3503[var11] & 255];
				} else {
					var8.field1336[var11] = -1;
				}
			}
		}
		for (int var16 = 0; var16 < this.field3537; ++var16) {
			byte var17;
			if (this.field3535 == null) {
				var17 = 0;
			} else {
				var17 = this.field3535[var16];
			}
			byte var18;
			if (this.field3514 == null) {
				var18 = 0;
			} else {
				var18 = this.field3514[var16];
			}
			short var12;
			if (this.field3517 == null) {
				var12 = -1;
			} else {
				var12 = this.field3517[var16];
			}
			if (var18 == -2) {
				var17 = 3;
			}
			if (var18 == -1) {
				var17 = 2;
			}
			class92 var13;
			int var14;
			class233 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field3529[var16];
						var14 = var1 + (var3 * var19.field2021 + var4 * var19.field2020 + var5 * var19.field2022) / (var7 + var7 / 2);
						var8.field1331[var16] = method2260(this.field3516[var16] & '\uffff', var14);
						var8.field1333[var16] = -1;
					} else if (var17 == 3) {
						var8.field1331[var16] = 128;
						var8.field1333[var16] = -1;
					} else {
						var8.field1333[var16] = -2;
					}
				} else {
					int var15 = this.field3516[var16] & '\uffff';
					if (this.field3531 != null && this.field3531[this.field3509[var16]] != null) {
						var13 = this.field3531[this.field3509[var16]];
					} else {
						var13 = this.field3515[this.field3509[var16]];
					}
					var14 = var1 + (var3 * var13.field1207 + var4 * var13.field1206 + var5 * var13.field1208) / (var7 * var13.field1209);
					var8.field1331[var16] = method2260(var15, var14);
					if (this.field3531 != null && this.field3531[this.field3510[var16]] != null) {
						var13 = this.field3531[this.field3510[var16]];
					} else {
						var13 = this.field3515[this.field3510[var16]];
					}
					var14 = var1 + (var3 * var13.field1207 + var4 * var13.field1206 + var5 * var13.field1208) / (var7 * var13.field1209);
					var8.field1332[var16] = method2260(var15, var14);
					if (this.field3531 != null && this.field3531[this.field3511[var16]] != null) {
						var13 = this.field3531[this.field3511[var16]];
					} else {
						var13 = this.field3515[this.field3511[var16]];
					}
					var14 = var1 + (var3 * var13.field1207 + var4 * var13.field1206 + var5 * var13.field1208) / (var7 * var13.field1209);
					var8.field1333[var16] = method2260(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field3529[var16];
					var14 = var1 + (var3 * var19.field2021 + var4 * var19.field2020 + var5 * var19.field2022) / (var7 + var7 / 2);
					var8.field1331[var16] = method2256(var14);
					var8.field1333[var16] = -1;
				} else {
					var8.field1333[var16] = -2;
				}
			} else {
				if (this.field3531 != null && this.field3531[this.field3509[var16]] != null) {
					var13 = this.field3531[this.field3509[var16]];
				} else {
					var13 = this.field3515[this.field3509[var16]];
				}
				var14 = var1 + (var3 * var13.field1207 + var4 * var13.field1206 + var5 * var13.field1208) / (var7 * var13.field1209);
				var8.field1331[var16] = method2256(var14);
				if (this.field3531 != null && this.field3531[this.field3510[var16]] != null) {
					var13 = this.field3531[this.field3510[var16]];
				} else {
					var13 = this.field3515[this.field3510[var16]];
				}
				var14 = var1 + (var3 * var13.field1207 + var4 * var13.field1206 + var5 * var13.field1208) / (var7 * var13.field1209);
				var8.field1332[var16] = method2256(var14);
				if (this.field3531 != null && this.field3531[this.field3511[var16]] != null) {
					var13 = this.field3531[this.field3511[var16]];
				} else {
					var13 = this.field3515[this.field3511[var16]];
				}
				var14 = var1 + (var3 * var13.field1207 + var4 * var13.field1206 + var5 * var13.field1208) / (var7 * var13.field1209);
				var8.field1333[var16] = method2256(var14);
			}
		}
		this.method2242();
		var8.field1379 = this.field3505;
		var8.field1325 = this.field3506;
		var8.field1326 = this.field3507;
		var8.field1330 = this.field3508;
		var8.field1327 = this.field3537;
		var8.field1342 = this.field3509;
		var8.field1329 = this.field3510;
		var8.field1387 = this.field3511;
		var8.field1386 = this.field3513;
		var8.field1335 = this.field3514;
		var8.field1338 = this.field3518;
		var8.field1343 = this.field3525;
		var8.field1344 = this.field3526;
		var8.field1337 = this.field3517;
		var8.field1345 = this.field3524;
		var8.field1369 = this.field3528;
		return var8;
	}

	public static class462 method2259(class338 var0, int var1, int var2) {
		byte[] var3 = var0.method1762(var1, 0);
		return var3 == null ? null : new class462(var3);
	}

	static void method2254(class462 var0, class462 var1, int var2, int var3, int var4, boolean var5) {
		var0.method2253();
		var0.method2251();
		var1.method2253();
		var1.method2251();
		++field3521;
		int var6 = 0;
		int[] var7 = var1.field3506;
		int var8 = var1.field3505;
		int var9;
		for (var9 = 0; var9 < var0.field3505; ++var9) {
			class92 var10 = var0.field3515[var9];
			if (var10.field1209 != 0) {
				int var11 = var0.field3507[var9] - var3;
				if (var11 <= var1.field3542) {
					int var12 = var0.field3506[var9] - var2;
					if (var12 >= var1.field3536 && var12 <= var1.field3512) {
						int var13 = var0.field3508[var9] - var4;
						if (var13 >= var1.field3539 && var13 <= var1.field3538) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class92 var15 = var1.field3515[var14];
								if (var12 == var7[var14] && var13 == var1.field3508[var14] && var11 == var1.field3507[var14] && var15.field1209 != 0) {
									if (var0.field3531 == null) {
										var0.field3531 = new class92[var0.field3505];
									}
									if (var1.field3531 == null) {
										var1.field3531 = new class92[var8];
									}
									class92 var16 = var0.field3531[var9];
									if (var16 == null) {
										var16 = var0.field3531[var9] = new class92(var10);
									}
									class92 var17 = var1.field3531[var14];
									if (var17 == null) {
										var17 = var1.field3531[var14] = new class92(var15);
									}
									var16.field1207 += var15.field1207;
									var16.field1206 += var15.field1206;
									var16.field1208 += var15.field1208;
									var16.field1209 += var15.field1209;
									var17.field1207 += var10.field1207;
									var17.field1206 += var10.field1206;
									var17.field1208 += var10.field1208;
									var17.field1209 += var10.field1209;
									++var6;
									field3523[var9] = field3521;
									field3541[var14] = field3521;
								}
							}
						}
					}
				}
			}
		}
		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field3537; ++var9) {
				if (field3523[var0.field3509[var9]] == field3521 && field3523[var0.field3510[var9]] == field3521 && field3523[var0.field3511[var9]] == field3521) {
					if (var0.field3535 == null) {
						var0.field3535 = new byte[var0.field3537];
					}
					var0.field3535[var9] = 2;
				}
			}
			for (var9 = 0; var9 < var1.field3537; ++var9) {
				if (field3541[var1.field3509[var9]] == field3521 && field3541[var1.field3510[var9]] == field3521 && field3541[var1.field3511[var9]] == field3521) {
					if (var1.field3535 == null) {
						var1.field3535 = new byte[var1.field3537];
					}
					var1.field3535[var9] = 2;
				}
			}
		}
	}

	static final int method2260(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}
		return (var0 & 65408) + var1;
	}

	static final int method2256(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}
		return var0;
	}
}
