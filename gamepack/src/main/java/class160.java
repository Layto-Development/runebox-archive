import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.BitSet;

@ObfInfo(name = "ll")
public class class160 extends class155 {
	@ObfInfo(name = "ac", desc = "[B")
	byte[] field1511;
	@ObfInfo(name = "ai", desc = "[B")
	byte[] field1512;
	@ObfInfo(name = "ap", desc = "[B")
	byte[] field1514;
	@ObfInfo(name = "az", desc = "[Llj;")
	class21[] field1513;
	@ObfInfo(name = "ao", desc = "[Lcf;")
	class428[] field1509;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1531042121)
	int field1515;
	@ObfInfo(name = "af", desc = "[I")
	int[] field1508;
	@ObfInfo(name = "aa", desc = "Ljava/util/ArrayList;")
	ArrayList field1516;
	@ObfInfo(name = "at", desc = "[S")
	short[] field1510;

	@ObfInfo(name = "<init>", desc = "([B)V")
	class160(byte[] var1) {
		this.field1516 = new ArrayList(8);
		this.field1509 = new class428[128];
		this.field1510 = new short[128];
		this.field1511 = new byte[128];
		this.field1512 = new byte[128];
		this.field1513 = new class21[128];
		this.field1514 = new byte[128];
		this.field1508 = new int[128];
		class280 var2 = new class280(var1);

		int var3;
		for (var3 = 0; var2.field2252[var2.field2254 + var3] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.method1493();
		}

		++var2.field2254;
		++var3;
		var5 = var2.field2254;
		var2.field2254 += var3;

		int var6;
		for (var6 = 0; var2.field2252[var6 + var2.field2254] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.method1493();
		}

		++var2.field2254;
		++var6;
		var8 = var2.field2254;
		var2.field2254 += var6;

		int var9;
		for (var9 = 0; var2.field2252[var9 + var2.field2254] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.method1493();
		}

		++var2.field2254;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.method1492();
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

		class21[] var37 = new class21[var12];

		class21 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new class21();
			int var16 = var2.method1492();
			if (var16 > 0) {
				var38.field393 = new byte[var16 * 2];
			}

			var16 = var2.method1492();
			if (var16 > 0) {
				var38.field398 = new byte[var16 * 2 + 2];
				var38.field398[1] = 64;
			}
		}

		var14 = var2.method1492();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.method1492();
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.field2252[var17 + var2.field2254] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.method1493();
		}

		++var2.field2254;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method1492();
			this.field1510[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method1492();
			var48 = this.field1510;
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

				var22 = var2.method1479();
			}

			var48 = this.field1510;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field1508[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field1508[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.field2252[var5++] - 1;
				}

				this.field1514[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field1508[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.field2252[var8++] + 16 << 2;
				}

				this.field1512[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		class21 var42 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field1508[var26] != 0) {
				if (var20 == 0) {
					var42 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field1513[var26] = var42;
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

				if (this.field1508[var27] > 0) {
					var26 = var2.method1492() + 1;
				}
			}

			this.field1511[var27] = (byte)var26;
			--var20;
		}

		this.field1515 = var2.method1492() + 1;

		class21 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field393) {
				for (var29 = 1; var29 < var28.field393.length; var29 += 2) {
					var28.field393[var29] = var2.method1493();
				}
			}

			if (null != var28.field398) {
				for (var29 = 3; var29 < var28.field398.length - 2; var29 += 2) {
					var28.field398[var29] = var2.method1493();
				}
			}
		}

		if (null != var39) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.method1493();
			}
		}

		if (var40 != null) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.method1493();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field398) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field398.length; var29 += 2) {
					var19 = var19 + 1 + var2.method1492();
					var28.field398[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field393 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field393.length; var29 += 2) {
					var19 = var19 + 1 + var2.method1492();
					var28.field393[var29] = (byte)var19;
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
			var19 = var2.method1492();
			var39[0] = (byte)var19;

			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.method1492();
				var39[var27] = (byte)var19;
			}

			var47 = var39[0];
			byte var43 = var39[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field1511[var29] = (byte)(this.field1511[var29] * var43 + 32 >> 6);
			}

			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = (var30 - var47) * var43 + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class497.method2488(var32, var30 - var47);
					this.field1511[var33] = (byte)(var34 * this.field1511[var33] + 32 >> 6);
					var32 += var31 - var43;
				}

				var47 = var30;
				var43 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field1511[var45] = (byte)(32 + var43 * this.field1511[var45] >> 6);
			}

			var38 = null;
		}

		if (var40 != null) {
			var19 = var2.method1492();
			var40[0] = (byte)var19;

			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.method1492();
				var40[var27] = (byte)var19;
			}

			var47 = var40[0];
			int var44 = var40[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = var44 + (this.field1512[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field1512[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				var46 = var40[var29 + 1] << 1;
				var32 = (var30 - var47) * var44 + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class497.method2488(var32, var30 - var47);
					int var35 = var34 + (this.field1512[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field1512[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = (this.field1512[var45] & 255) + var44;
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field1512[var45] = (byte)var46;
			}

			Object var41 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field391 = var2.method1492();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field393 != null) {
				var28.field390 = var2.method1492();
			}

			if (null != var28.field398) {
				var28.field392 = var2.method1492();
			}

			if (var28.field391 > 0) {
				var28.field389 = var2.method1492();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field395 = var2.method1492();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field395 > 0) {
				var28.field394 = var2.method1492();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field394 > 0) {
				var28.field396 = var2.method1492();
			}
		}

	}

	@ObfInfo(name = "au", desc = "(Lbi;Ljava/util/BitSet;I)Z", opaqueValue = "-16379845")
	boolean method922(class293 var1, BitSet var2) {
		boolean var4 = true;
		int var5 = 0;
		class428 var6 = new class428();

		int var8;
		for (int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
			var8 = var2.nextClearBit(var7);

			for (int var9 = var7; var9 < var8; ++var9) {
				if (var2.get(var9)) {
					int var10 = this.field1508[var9];
					if (var10 != 0) {
						if (var10 != var5) {
							var5 = var10--;
							if ((var10 & 1) == 0) {
								var6 = new class428(var1.method1624(var10 >> 2));
							} else {
								var6 = var1.method1623(var10 >> 2);
							}

							if (var6.method2226((byte)6)) {
								var4 = false;
							} else {
								this.field1516.add(this.field1516.size(), var6);
							}
						}

						if (!var6.method2226((byte)-51)) {
							this.field1509[var9] = var6;
							this.field1508[var9] = 0;
						}
					}
				}
			}
		}

		return var4;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	void method923() {
		this.field1508 = null;
	}
}
