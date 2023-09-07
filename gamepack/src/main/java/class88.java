import java.util.ArrayList;
import java.util.BitSet;

public class class88 extends class77 {

	byte[] field877;

	byte[] field878;

	byte[] field880;

	class124[] field875;

	class360[] field879;

	int field881;

	int[] field874;

	ArrayList field882;

	short[] field876;

	class88(byte[] var1) {
		this.field882 = new ArrayList(8);
		this.field875 = new class124[128];
		this.field876 = new short[128];
		this.field877 = new byte[128];
		this.field878 = new byte[128];
		this.field879 = new class360[128];
		this.field880 = new byte[128];
		this.field874 = new int[128];
		class187 var2 = new class187(var1);
		int var3;
		for (var3 = 0; var2.field1830[var2.field1832 + var3] != 0; ++var3) {
		}
		byte[] var4 = new byte[var3];
		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.method1097();
		}
		++var2.field1832;
		++var3;
		var5 = var2.field1832;
		var2.field1832 += var3;
		int var6;
		for (var6 = 0; var2.field1830[var6 + var2.field1832] != 0; ++var6) {
		}
		byte[] var7 = new byte[var6];
		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.method1097();
		}
		++var2.field1832;
		++var6;
		var8 = var2.field1832;
		var2.field1832 += var6;
		int var9;
		for (var9 = 0; var2.field1830[var9 + var2.field1832] != 0; ++var9) {
		}
		byte[] var10 = new byte[var9];
		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.method1097();
		}
		++var2.field1832;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;
			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.method1096();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}
					var13 = var15;
				}
				var36[var14] = (byte) var13;
			}
		} else {
			var12 = var9;
		}
		class360[] var37 = new class360[var12];
		class360 var38;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var38 = var37[var14] = new class360();
			int var16 = var2.method1096();
			if (var16 > 0) {
				var38.field2861 = new byte[var16 * 2];
			}
			var16 = var2.method1096();
			if (var16 > 0) {
				var38.field2866 = new byte[var16 * 2 + 2];
				var38.field2866[1] = 64;
			}
		}
		var14 = var2.method1096();
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.method1096();
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;
		int var17;
		for (var17 = 0; var2.field1830[var17 + var2.field1832] != 0; ++var17) {
		}
		byte[] var18 = new byte[var17];
		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.method1097();
		}
		++var2.field1832;
		++var17;
		var19 = 0;
		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method1096();
			this.field876[var20] = (short) var19;
		}
		var19 = 0;
		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.method1096();
			var48 = this.field876;
			var48[var20] = (short) (var48[var20] + (var19 << 8));
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
				var22 = var2.method1083();
			}
			var48 = this.field876;
			var48[var23] = (short) (var48[var23] + ((var22 - 1 & 2) << 14));
			this.field874[var23] = var22;
			--var20;
		}
		var20 = 0;
		var21 = 0;
		var23 = 0;
		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field874[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}
					var23 = var2.field1830[var5++] - 1;
				}
				this.field880[var24] = (byte) var23;
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		var24 = 0;
		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field874[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}
					var24 = var2.field1830[var8++] + 16 << 2;
				}
				this.field878[var25] = (byte) var24;
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		class360 var42 = null;
		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field874[var26] != 0) {
				if (var20 == 0) {
					var42 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}
				this.field879[var26] = var42;
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
				if (this.field874[var27] > 0) {
					var26 = var2.method1096() + 1;
				}
			}
			this.field877[var27] = (byte) var26;
			--var20;
		}
		this.field881 = var2.method1096() + 1;
		class360 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field2861) {
				for (var29 = 1; var29 < var28.field2861.length; var29 += 2) {
					var28.field2861[var29] = var2.method1097();
				}
			}
			if (null != var28.field2866) {
				for (var29 = 3; var29 < var28.field2866.length - 2; var29 += 2) {
					var28.field2866[var29] = var2.method1097();
				}
			}
		}
		if (null != var39) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.method1097();
			}
		}
		if (var40 != null) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.method1097();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (null != var28.field2866) {
				var19 = 0;
				for (var29 = 2; var29 < var28.field2866.length; var29 += 2) {
					var19 = var19 + 1 + var2.method1096();
					var28.field2866[var29] = (byte) var19;
				}
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2861 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var28.field2861.length; var29 += 2) {
					var19 = var19 + 1 + var2.method1096();
					var28.field2861[var29] = (byte) var19;
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
			var19 = var2.method1096();
			var39[0] = (byte) var19;
			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.method1096();
				var39[var27] = (byte) var19;
			}
			var47 = var39[0];
			byte var43 = var39[1];
			for (var29 = 0; var29 < var47; ++var29) {
				this.field877[var29] = (byte) (this.field877[var29] * var43 + 32 >> 6);
			}
			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = (var30 - var47) * var43 + (var30 - var47) / 2;
				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class50.method200(var32, var30 - var47);
					this.field877[var33] = (byte) (var34 * this.field877[var33] + 32 >> 6);
					var32 += var31 - var43;
				}
				var47 = var30;
				var43 = var31;
			}
			for (var45 = var47; var45 < 128; ++var45) {
				this.field877[var45] = (byte) (32 + var43 * this.field877[var45] >> 6);
			}
			var38 = null;
		}
		if (var40 != null) {
			var19 = var2.method1096();
			var40[0] = (byte) var19;
			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.method1096();
				var40[var27] = (byte) var19;
			}
			var47 = var40[0];
			int var44 = var40[1] << 1;
			for (var29 = 0; var29 < var47; ++var29) {
				var45 = var44 + (this.field878[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}
				if (var45 > 128) {
					var45 = 128;
				}
				this.field878[var29] = (byte) var45;
			}
			int var46;
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				var46 = var40[var29 + 1] << 1;
				var32 = (var30 - var47) * var44 + (var30 - var47) / 2;
				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class50.method200(var32, var30 - var47);
					int var35 = var34 + (this.field878[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}
					if (var35 > 128) {
						var35 = 128;
					}
					this.field878[var33] = (byte) var35;
					var32 += var46 - var44;
				}
				var47 = var30;
				var44 = var46;
			}
			for (var45 = var47; var45 < 128; ++var45) {
				var46 = (this.field878[var45] & 255) + var44;
				if (var46 < 0) {
					var46 = 0;
				}
				if (var46 > 128) {
					var46 = 128;
				}
				this.field878[var45] = (byte) var46;
			}
			Object var41 = null;
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field2859 = var2.method1096();
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2861 != null) {
				var28.field2858 = var2.method1096();
			}
			if (null != var28.field2866) {
				var28.field2860 = var2.method1096();
			}
			if (var28.field2859 > 0) {
				var28.field2857 = var2.method1096();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field2863 = var2.method1096();
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2863 > 0) {
				var28.field2862 = var2.method1096();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var37[var27];
			if (var28.field2862 > 0) {
				var28.field2864 = var2.method1096();
			}
		}
	}

	boolean method398(class439 var1, BitSet var2) {
		boolean var4 = true;
		int var5 = 0;
		class124 var6 = new class124();
		int var8;
		for (int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
			var8 = var2.nextClearBit(var7);
			for (int var9 = var7; var9 < var8; ++var9) {
				if (var2.get(var9)) {
					int var10 = this.field874[var9];
					if (var10 != 0) {
						if (var10 != var5) {
							var5 = var10--;
							if ((var10 & 1) == 0) {
								var6 = new class124(var1.method2194(var10 >> 2));
							} else {
								var6 = var1.method2193(var10 >> 2);
							}
							if (var6.method847((byte) 6)) {
								var4 = false;
							} else {
								this.field882.add(this.field882.size(), var6);
							}
						}
						if (!var6.method847((byte) -51)) {
							this.field875[var9] = var6;
							this.field874[var9] = 0;
						}
					}
				}
			}
		}
		return var4;
	}

	void method399() {
		this.field874 = null;
	}
}
