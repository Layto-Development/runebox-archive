import java.util.ArrayList;
import java.util.BitSet;

public class class157 extends class462 {
	byte[] field1460;
	byte[] field1461;
	byte[] field1463;
	class401[] field1462;
	class81[] field1458;
	int field1464;
	int[] field1457;
	ArrayList field1465;
	short[] field1459;

	class157(byte[] var1) {
		this.field1465 = new ArrayList(8);
		this.field1458 = new class81[128];
		this.field1459 = new short[128];
		this.field1460 = new byte[128];
		this.field1461 = new byte[128];
		this.field1462 = new class401[128];
		this.field1463 = new byte[128];
		this.field1457 = new int[128];
		class42 var2 = new class42(var1);

		int var3;
		for (var3 = 0; var2.field525[var2.field527 + var3] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.method279();
		}

		++var2.field527;
		++var3;
		var5 = var2.field527;
		var2.field527 += var3;

		int var6;
		for (var6 = 0; var2.field525[var6 + var2.field527] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.method279();
		}

		++var2.field527;
		++var6;
		var8 = var2.field527;
		var2.field527 += var6;

		int var9;
		for (var9 = 0; var2.field525[var9 + var2.field527] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.method279();
		}

		++var2.field527;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.method278();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}

					var13 = var15;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		class401[] var37 = new class401[var12];

		class401 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new class401();
			int var16 = var2.method278();
			if (var16 > 0) {
				var38.field3365 = new byte[var16 * 2];
			}

			var16 = var2.method278();
			if (var16 > 0) {
				var38.field3370 = new byte[var16 * 2 + 2];
				var38.field3370[1] = 64;
			}
		}

		var14 = var2.method278();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.method278();
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.field525[var17 + var2.field527] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.method279();
		}

		++var2.field527;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method278();
			this.field1459[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method278();
			var48 = this.field1459;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.method265();
			}

			var48 = this.field1459;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field1457[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field1457[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.field525[var5++] - 1;
				}

				this.field1463[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field1457[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.field525[var8++] + 16 << 2;
				}

				this.field1461[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		class401 var42 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field1457[var26] != 0) {
				if (var20 == 0) {
					var42 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field1462[var26] = var42;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field1457[var27] > 0) {
					var26 = var2.method278() + 1;
				}
			}

			this.field1460[var27] = (byte)var26;
			--var20;
		}

		this.field1464 = var2.method278() + 1;

		class401 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field3365) {
				for (var29 = 1; var29 < var28.field3365.length; var29 += 2) {
					var28.field3365[var29] = var2.method279();
				}
			}

			if (null != var28.field3370) {
				for (var29 = 3; var29 < var28.field3370.length - 2; var29 += 2) {
					var28.field3370[var29] = var2.method279();
				}
			}
		}

		if (null != var39) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.method279();
			}
		}

		if (var40 != null) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.method279();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field3370) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3370.length; var29 += 2) {
					var19 = var19 + 1 + var2.method278();
					var28.field3370[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3365 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field3365.length; var29 += 2) {
					var19 = var19 + 1 + var2.method278();
					var28.field3365[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (null != var39) {
			var19 = var2.method278();
			var39[0] = (byte)var19;

			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.method278();
				var39[var27] = (byte)var19;
			}

			var47 = var39[0];
			byte var43 = var39[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field1460[var29] = (byte)(this.field1460[var29] * var43 + 32 >> 6);
			}

			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = (var30 - var47) * var43 + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class24.method195(var32, var30 - var47);
					this.field1460[var33] = (byte)(var34 * this.field1460[var33] + 32 >> 6);
					var32 += var31 - var43;
				}

				var47 = var30;
				var43 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field1460[var45] = (byte)(32 + var43 * this.field1460[var45] >> 6);
			}

			var38 = null;
		}

		if (var40 != null) {
			var19 = var2.method278();
			var40[0] = (byte)var19;

			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.method278();
				var40[var27] = (byte)var19;
			}

			var47 = var40[0];
			int var44 = var40[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = var44 + (this.field1461[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field1461[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				var46 = var40[var29 + 1] << 1;
				var32 = (var30 - var47) * var44 + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class24.method195(var32, var30 - var47);
					int var35 = var34 + (this.field1461[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field1461[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = (this.field1461[var45] & 255) + var44;
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field1461[var45] = (byte)var46;
			}

			Object var41 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3363 = var2.method278();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3365 != null) {
				var28.field3362 = var2.method278();
			}

			if (null != var28.field3370) {
				var28.field3364 = var2.method278();
			}

			if (var28.field3363 > 0) {
				var28.field3361 = var2.method278();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3367 = var2.method278();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3367 > 0) {
				var28.field3366 = var2.method278();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field3366 > 0) {
				var28.field3368 = var2.method278();
			}
		}

	}

	boolean method889(class203 var1, BitSet var2) {
		boolean var4 = true;
		int var5 = 0;
		class81 var6 = new class81();

		int var8;
		for (int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
			var8 = var2.nextClearBit(var7);

			for (int var9 = var7; var9 < var8; ++var9) {
				if (var2.get(var9)) {
					int var10 = this.field1457[var9];
					if (var10 != 0) {
						if (var10 != var5) {
							var5 = var10--;
							if ((var10 & 1) == 0) {
								var6 = new class81(var1.method1146(var10 >> 2));
							} else {
								var6 = var1.method1145(var10 >> 2);
							}

							if (var6.method539((byte)6)) {
								var4 = false;
							} else {
								this.field1465.add(this.field1465.size(), var6);
							}
						}

						if (!var6.method539((byte)-51)) {
							this.field1458[var9] = var6;
							this.field1457[var9] = 0;
						}
					}
				}
			}
		}

		return var4;
	}

	void method890() {
		this.field1457 = null;
	}
}
