public class class97 extends class77 {

	static boolean field1256;

	static boolean[] field1238;

	static class129 field1231;

	static class232[] field1235;

	static class266[] field1234;

	static class344[] field1237;

	static class85[] field1236;

	static float[] field1241;

	static float[] field1247;

	static float[] field1249;

	static float[] field1250;

	static float[] field1251;

	static float[] field1255;

	static int field1232;

	static int field1233;

	static int[] field1227;

	static int[] field1239;

	static int[] field1252;

	boolean field1230;

	boolean field1245;

	byte[] field1254;

	byte[][] field1244;

	float[] field1246;

	float[] field1248;

	int field1225;

	int field1226;

	int field1228;

	int field1229;

	int field1240;

	int field1242;

	int field1243;

	int field1253;

	static {
		field1231 = new class129();
		field1256 = false;
	}

	class97(byte[] var1) {
		this.method612(var1);
	}

	void method612(byte[] var1) {
		class187 var2 = new class187(var1);
		this.field1253 = var2.method1100();
		this.field1226 = var2.method1100();
		this.field1228 = var2.method1100();
		this.field1229 = var2.method1100();
		if (this.field1229 < 0) {
			this.field1229 = ~this.field1229;
			this.field1230 = true;
		}
		int var3 = var2.method1100();
		this.field1244 = new byte[var3][];
		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;
			int var6;
			do {
				var6 = var2.method1096();
				var5 += var6;
			} while (var6 >= 255);
			byte[] var7 = new byte[var5];
			var2.method1106(var7, 0, var5);
			this.field1244[var4] = var7;
		}
	}

	float[] method614(int var1) {
		class129 var2 = new class129();
		var2.method858(this.field1244[var1], 0);
		this.field1248 = new float[field1233];
		var2.method857();
		int var3 = var2.method856(class50.method199(field1239.length - 1));
		boolean var4 = field1238[var3];
		int var5 = var4 ? field1233 : field1232;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method857() != 0;
			var7 = var2.method857() != 0;
		}
		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field1232 >> 2);
			var10 = (var5 >> 2) + (field1232 >> 2);
			var11 = field1232 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}
		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field1232 >> 2);
			var13 = var5 - (var5 >> 2) + (field1232 >> 2);
			var14 = field1232 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}
		class344 var15 = field1237[field1239[var3]];
		int var16 = var15.field2608;
		int var17 = var15.field2610[var16];
		class484 var18 = field1235[var17].method1368(var2);
		boolean var19 = !var18.method2339();
		int var20;
		for (var20 = 0; var20 < var15.field2609; ++var20) {
			class85 var21 = field1236[var15.field2611[var20]];
			float[] var22 = this.field1248;
			var21.method385(var22, var5 >> 1, var19, var2);
		}
		if (var18.method2339()) {
			var16 = var15.field2608;
			int var10000 = var15.field2610[var16];
			var18.method2338(this.field1248, var5 >> 1);
		}
		int var43;
		int var46;
		if (!var18.method2339()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1248[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var46 = var5 >> 3;
			float[] var23 = this.field1248;
			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}
			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}
			float[] var48 = var4 ? field1249 : field1255;
			float[] var25 = var4 ? field1250 : field1247;
			float[] var26 = var4 ? field1251 : field1241;
			int[] var27 = var4 ? field1227 : field1252;
			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var43; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var48[var28 * 2];
				var32 = var48[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}
			float var33;
			float var34;
			for (var28 = 0; var28 < var46; ++var28) {
				var29 = var23[var20 + 3 + var28 * 4];
				var30 = var23[var20 + 1 + var28 * 4];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + 3 + var28 * 4] = var29 + var31;
				var23[var20 + 1 + var28 * 4] = var30 + var32;
				var33 = var48[var20 - 4 - var28 * 4];
				var34 = var48[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}
			var28 = class50.method199(var5 - 1);
			int var49;
			int var50;
			int var51;
			int var52;
			for (var49 = 0; var49 < var28 - 3; ++var49) {
				var50 = var5 >> var49 + 2;
				var51 = 8 << var49;
				for (var52 = 0; var52 < 2 << var49; ++var52) {
					int var53 = var5 - var50 * 2 * var52;
					int var54 = var5 - var50 * (var52 * 2 + 1);
					for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var53 - 1 - var36];
						float var38 = var23[var53 - 3 - var36];
						float var39 = var23[var54 - 1 - var36];
						float var40 = var23[var54 - 3 - var36];
						var23[var53 - 1 - var36] = var37 + var39;
						var23[var53 - 3 - var36] = var38 + var40;
						float var41 = var48[var35 * var51];
						float var42 = var48[var35 * var51 + 1];
						var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}
			for (var49 = 1; var49 < var46 - 1; ++var49) {
				var50 = var27[var49];
				if (var49 < var50) {
					var51 = var49 * 8;
					var52 = var50 * 8;
					var33 = var23[var51 + 1];
					var23[var51 + 1] = var23[var52 + 1];
					var23[var52 + 1] = var33;
					var33 = var23[var51 + 3];
					var23[var51 + 3] = var23[var52 + 3];
					var23[var52 + 3] = var33;
					var33 = var23[var51 + 5];
					var23[var51 + 5] = var23[var52 + 5];
					var23[var52 + 5] = var33;
					var33 = var23[var51 + 7];
					var23[var51 + 7] = var23[var52 + 7];
					var23[var52 + 7] = var33;
				}
			}
			for (var49 = 0; var49 < var20; ++var49) {
				var23[var49] = var23[var49 * 2 + 1];
			}
			for (var49 = 0; var49 < var46; ++var49) {
				var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
				var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
				var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
				var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
			}
			for (var49 = 0; var49 < var46; ++var49) {
				var30 = var26[var49 * 2];
				var31 = var26[var49 * 2 + 1];
				var32 = var23[var20 + var49 * 2];
				var33 = var23[var20 + var49 * 2 + 1];
				var34 = var23[var5 - 2 - var49 * 2];
				float var55 = var23[var5 - 1 - var49 * 2];
				float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
				var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
				var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
				var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
				var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
				var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
			}
			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var49 * 2 + var20] * var25[var49 * 2] + var23[var49 * 2 + 1 + var20] * var25[var49 * 2 + 1];
				var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var23[var49 * 2 + 1 + var20] * var25[var49 * 2];
			}
			for (var49 = 0; var49 < var43; ++var49) {
				var23[var5 - var43 + var49] = -var23[var49];
			}
			for (var49 = 0; var49 < var43; ++var49) {
				var23[var49] = var23[var43 + var49];
			}
			for (var49 = 0; var49 < var43; ++var49) {
				var23[var43 + var49] = -var23[var43 - var49 - 1];
			}
			for (var49 = 0; var49 < var43; ++var49) {
				var23[var20 + var49] = var23[var5 - var49 - 1];
			}
			float[] var57;
			for (var49 = var9; var49 < var10; ++var49) {
				var30 = (float) Math.sin(((double) (var49 - var9) + 0.5D) / (double) var11 * 0.5D * 3.141592653589793D);
				var57 = this.field1248;
				var57[var49] *= (float) Math.sin(1.5707963267948966D * (double) var30 * (double) var30);
			}
			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float) Math.sin(((double) (var49 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1248;
				var57[var49] *= (float) Math.sin(1.5707963267948966D * (double) var30 * (double) var30);
			}
		}
		float[] var44 = null;
		if (this.field1242 > 0) {
			var43 = this.field1242 + var5 >> 2;
			var44 = new float[var43];
			int var47;
			if (!this.field1245) {
				for (var46 = 0; var46 < this.field1243; ++var46) {
					var47 = (this.field1242 >> 1) + var46;
					var44[var46] += this.field1246[var47];
				}
			}
			if (var18.method2339()) {
				for (var46 = var9; var46 < var5 >> 1; ++var46) {
					var47 = var44.length - (var5 >> 1) + var46;
					var44[var47] += this.field1248[var46];
				}
			}
		}
		float[] var45 = this.field1246;
		this.field1246 = this.field1248;
		this.field1248 = var45;
		this.field1242 = var5;
		this.field1243 = var13 - (var5 >> 1);
		this.field1245 = !var18.method2339();
		return var44;
	}

	class529 method617(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field1254 == null) {
				this.field1242 = 0;
				this.field1246 = new float[field1233];
				this.field1254 = new byte[this.field1226];
				this.field1225 = 0;
				this.field1240 = 0;
			}
			for (; this.field1240 < this.field1244.length; ++this.field1240) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}
				float[] var2 = this.method614(this.field1240);
				if (var2 != null) {
					int var3 = this.field1225;
					int var4 = var2.length;
					if (var4 > this.field1226 - var3) {
						var4 = this.field1226 - var3;
					}
					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int) (128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}
						this.field1254[var3++] = (byte) (var6 - 128);
					}
					if (var1 != null) {
						var1[0] -= var3 - this.field1225;
					}
					this.field1225 = var3;
				}
			}
			this.field1246 = null;
			byte[] var7 = this.field1254;
			this.field1254 = null;
			return new class529(this.field1253, var7, this.field1228, this.field1229, this.field1230);
		}
	}

	static float method618(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}
		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	static void method613(byte[] var0) {
		class129 var1 = field1231;
		var1.method858(var0, 0);
		field1232 = 1 << var1.method856(4);
		field1233 = 1 << var1.method856(4);
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field1233 : field1232;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var7 = new float[var4];
			for (int var8 = 0; var8 < var5; ++var8) {
				var7[var8 * 2] = (float) Math.cos((double) (var8 * 4) * 3.141592653589793D / (double) var3);
				var7[var8 * 2 + 1] = -((float) Math.sin((double) (var8 * 4) * 3.141592653589793D / (double) var3));
			}
			float[] var20 = new float[var4];
			for (int var9 = 0; var9 < var5; ++var9) {
				var20[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
				var20[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
			}
			float[] var21 = new float[var5];
			for (int var10 = 0; var10 < var6; ++var10) {
				var21[var10 * 2] = (float) Math.cos((double) (var10 * 4 + 2) * 3.141592653589793D / (double) var3);
				var21[var10 * 2 + 1] = -((float) Math.sin((double) (var10 * 4 + 2) * 3.141592653589793D / (double) var3));
			}
			int[] var22 = new int[var6];
			int var11 = class50.method199(var6 - 1);
			for (int var12 = 0; var12 < var6; ++var12) {
				int var16 = var12;
				int var17 = var11;
				int var18;
				for (var18 = 0; var17 > 0; --var17) {
					var18 = var18 << 1 | var16 & 1;
					var16 >>>= 1;
				}
				var22[var12] = var18;
			}
			if (var2 != 0) {
				field1249 = var7;
				field1250 = var20;
				field1251 = var21;
				field1227 = var22;
			} else {
				field1255 = var7;
				field1247 = var20;
				field1241 = var21;
				field1252 = var22;
			}
		}
		var2 = var1.method856(8) + 1;
		field1234 = new class266[var2];
		for (var3 = 0; var3 < var2; ++var3) {
			field1234[var3] = new class266();
		}
		var3 = var1.method856(6) + 1;
		for (var4 = 0; var4 < var3; ++var4) {
			var1.method856(16);
		}
		var3 = var1.method856(6) + 1;
		field1235 = new class232[var3];
		for (var4 = 0; var4 < var3; ++var4) {
			field1235[var4] = new class232();
		}
		var4 = var1.method856(6) + 1;
		field1236 = new class85[var4];
		for (var5 = 0; var5 < var4; ++var5) {
			field1236[var5] = new class85();
		}
		var5 = var1.method856(6) + 1;
		field1237 = new class344[var5];
		for (var6 = 0; var6 < var5; ++var6) {
			field1237[var6] = new class344();
		}
		var6 = var1.method856(6) + 1;
		field1238 = new boolean[var6];
		field1239 = new int[var6];
		for (int var19 = 0; var19 < var6; ++var19) {
			field1238[var19] = var1.method857() != 0;
			var1.method856(16);
			var1.method856(16);
			field1239[var19] = var1.method856(8);
		}
	}

	static boolean method615(class338 var0) {
		if (!field1256) {
			byte[] var1 = var0.method1762(0, 0);
			if (var1 == null) {
				return false;
			}
			method613(var1);
			field1256 = true;
		}
		return true;
	}

	static class97 method616(class338 var0, int var1, int var2) {
		if (!method615(var0)) {
			var0.method1764(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method1762(var1, var2);
			return var3 == null ? null : new class97(var3);
		}
	}
}
