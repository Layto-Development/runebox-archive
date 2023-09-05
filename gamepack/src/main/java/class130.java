import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "cm")
public class class130 extends class155 {
	@ObfInfo(name = "ab", desc = "Z")
	static boolean field1201;
	@ObfInfo(name = "an", desc = "[Z")
	static boolean[] field1183;
	@ObfInfo(name = "aq", desc = "[Lbz;")
	static class119[] field1181;
	@ObfInfo(name = "az", desc = "Lce;")
	static class226 field1176;
	@ObfInfo(name = "al", desc = "[Lbc;")
	static class229[] field1182;
	@ObfInfo(name = "af", desc = "[Lcw;")
	static class42[] field1179;
	@ObfInfo(name = "ad", desc = "[Lbo;")
	static class444[] field1180;
	@ObfInfo(name = "av", desc = "[F")
	static float[] field1186;
	@ObfInfo(name = "aj", desc = "[F")
	static float[] field1192;
	@ObfInfo(name = "aw", desc = "[F")
	static float[] field1194;
	@ObfInfo(name = "ak", desc = "[F")
	static float[] field1195;
	@ObfInfo(name = "bh", desc = "[F")
	static float[] field1196;
	@ObfInfo(name = "ay", desc = "[F")
	static float[] field1200;
	@ObfInfo(name = "ap", desc = "I")
	static int field1177;
	@ObfInfo(name = "aa", desc = "I")
	static int field1178;
	@ObfInfo(name = "bk", desc = "[I")
	static int[] field1172;
	@ObfInfo(name = "ar", desc = "[I")
	static int[] field1184;
	@ObfInfo(name = "bj", desc = "[I")
	static int[] field1197;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field1175;
	@ObfInfo(name = "ah", desc = "Z")
	boolean field1190;
	@ObfInfo(name = "bv", desc = "[B")
	byte[] field1199;
	@ObfInfo(name = "au", desc = "[[B")
	byte[][] field1189;
	@ObfInfo(name = "ag", desc = "[F")
	float[] field1191;
	@ObfInfo(name = "as", desc = "[F")
	float[] field1193;
	@ObfInfo(name = "bt", desc = "I")
	int field1170;
	@ObfInfo(name = "ao", desc = "I")
	int field1171;
	@ObfInfo(name = "at", desc = "I")
	int field1173;
	@ObfInfo(name = "ac", desc = "I")
	int field1174;
	@ObfInfo(name = "bd", desc = "I")
	int field1185;
	@ObfInfo(name = "am", desc = "I")
	int field1187;
	@ObfInfo(name = "ax", desc = "I")
	int field1188;
	@ObfInfo(name = "ae", desc = "I")
	int field1198;

	static {
		field1176 = new class226();
		field1201 = false;
	}

	@ObfInfo(name = "<init>", desc = "([B)V")
	class130(byte[] var1) {
		this.method708(var1);
	}

	@ObfInfo(name = "ae", desc = "([B)V")
	void method708(byte[] var1) {
		class280 var2 = new class280(var1);
		this.field1198 = var2.method1496();
		this.field1171 = var2.method1496();
		this.field1173 = var2.method1496();
		this.field1174 = var2.method1496();
		if (this.field1174 < 0) {
			this.field1174 = ~this.field1174;
			this.field1175 = true;
		}

		int var3 = var2.method1496();
		this.field1189 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method1492();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method1502(var7, 0, var5);
			this.field1189[var4] = var7;
		}

	}

	@ObfInfo(name = "at", desc = "(I)[F")
	float[] method710(int var1) {
		class226 var2 = new class226();
		var2.method1218(this.field1189[var1], 0);
		this.field1193 = new float[field1178];
		var2.method1217();
		int var3 = var2.method1216(class497.method2487(field1184.length - 1));
		boolean var4 = field1183[var3];
		int var5 = var4 ? field1178 : field1177;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1217() != 0;
			var7 = var2.method1217() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field1177 >> 2);
			var10 = (var5 >> 2) + (field1177 >> 2);
			var11 = field1177 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field1177 >> 2);
			var13 = var5 - (var5 >> 2) + (field1177 >> 2);
			var14 = field1177 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		class229 var15 = field1182[field1184[var3]];
		int var16 = var15.field1957;
		int var17 = var15.field1959[var16];
		class319 var18 = field1180[var17].method2319(var2);
		boolean var19 = !var18.method1776();

		int var20;
		for (var20 = 0; var20 < var15.field1958; ++var20) {
			class119 var21 = field1181[var15.field1960[var20]];
			float[] var22 = this.field1193;
			var21.method684(var22, var5 >> 1, var19, var2);
		}

		if (var18.method1776()) {
			var16 = var15.field1957;
			int var10000 = var15.field1959[var16];
			var18.method1775(this.field1193, var5 >> 1);
		}

		int var43;
		int var46;
		if (!var18.method1776()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1193[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var46 = var5 >> 3;
			float[] var23 = this.field1193;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var48 = var4 ? field1194 : field1200;
			float[] var25 = var4 ? field1195 : field1192;
			float[] var26 = var4 ? field1196 : field1186;
			int[] var27 = var4 ? field1172 : field1197;

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

			var28 = class497.method2487(var5 - 1);

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
				var30 = (float)Math.sin(((double)(var49 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field1193;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1193;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1187 > 0) {
			var43 = this.field1187 + var5 >> 2;
			var44 = new float[var43];
			int var47;
			if (!this.field1190) {
				for (var46 = 0; var46 < this.field1188; ++var46) {
					var47 = (this.field1187 >> 1) + var46;
					var44[var46] += this.field1191[var47];
				}
			}

			if (var18.method1776()) {
				for (var46 = var9; var46 < var5 >> 1; ++var46) {
					var47 = var44.length - (var5 >> 1) + var46;
					var44[var47] += this.field1193[var46];
				}
			}
		}

		float[] var45 = this.field1191;
		this.field1191 = this.field1193;
		this.field1193 = var45;
		this.field1187 = var5;
		this.field1188 = var13 - (var5 >> 1);
		this.field1190 = !var18.method1776();
		return var44;
	}

	@ObfInfo(name = "az", desc = "([I)Lbu;")
	class62 method713(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field1199 == null) {
				this.field1187 = 0;
				this.field1191 = new float[field1178];
				this.field1199 = new byte[this.field1171];
				this.field1170 = 0;
				this.field1185 = 0;
			}

			for (; this.field1185 < this.field1189.length; ++this.field1185) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method710(this.field1185);
				if (var2 != null) {
					int var3 = this.field1170;
					int var4 = var2.length;
					if (var4 > this.field1171 - var3) {
						var4 = this.field1171 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field1199[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field1170;
					}

					this.field1170 = var3;
				}
			}

			this.field1191 = null;
			byte[] var7 = this.field1199;
			this.field1199 = null;
			return new class62(this.field1198, var7, this.field1173, this.field1174, this.field1175);
		}
	}

	@ObfInfo(name = "au", desc = "(I)F")
	static float method714(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfInfo(name = "ao", desc = "([B)V")
	static void method709(byte[] var0) {
		class226 var1 = field1176;
		var1.method1218(var0, 0);
		field1177 = 1 << var1.method1216(4);
		field1178 = 1 << var1.method1216(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field1178 : field1177;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var7 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var7[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var7[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var20 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var21 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var22 = new int[var6];
			int var11 = class497.method2487(var6 - 1);

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
				field1194 = var7;
				field1195 = var20;
				field1196 = var21;
				field1172 = var22;
			} else {
				field1200 = var7;
				field1192 = var20;
				field1186 = var21;
				field1197 = var22;
			}
		}

		var2 = var1.method1216(8) + 1;
		field1179 = new class42[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field1179[var3] = new class42();
		}

		var3 = var1.method1216(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1216(16);
		}

		var3 = var1.method1216(6) + 1;
		field1180 = new class444[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field1180[var4] = new class444();
		}

		var4 = var1.method1216(6) + 1;
		field1181 = new class119[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field1181[var5] = new class119();
		}

		var5 = var1.method1216(6) + 1;
		field1182 = new class229[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field1182[var6] = new class229();
		}

		var6 = var1.method1216(6) + 1;
		field1183 = new boolean[var6];
		field1184 = new int[var6];

		for (int var19 = 0; var19 < var6; ++var19) {
			field1183[var19] = var1.method1217() != 0;
			var1.method1216(16);
			var1.method1216(16);
			field1184[var19] = var1.method1216(8);
		}

	}

	@ObfInfo(name = "ac", desc = "(Lnu;)Z")
	static boolean method711(class437 var0) {
		if (!field1201) {
			byte[] var1 = var0.method2267(0, 0);
			if (var1 == null) {
				return false;
			}

			method709(var1);
			field1201 = true;
		}

		return true;
	}

	@ObfInfo(name = "ai", desc = "(Lnu;II)Lcm;")
	static class130 method712(class437 var0, int var1, int var2) {
		if (!method711(var0)) {
			var0.method2269(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method2267(var1, var2);
			return var3 == null ? null : new class130(var3);
		}
	}
}
