public class class374 extends class462 {
	static boolean field3142;
	static boolean[] field3124;
	static class263[] field3122;
	static class318[] field3120;
	static class326 field3117;
	static class345[] field3121;
	static class511[] field3123;
	static float[] field3127;
	static float[] field3133;
	static float[] field3135;
	static float[] field3136;
	static float[] field3137;
	static float[] field3141;
	static int field3118;
	static int field3119;
	static int[] field3113;
	static int[] field3125;
	static int[] field3138;
	boolean field3116;
	boolean field3131;
	byte[] field3140;
	byte[][] field3130;
	float[] field3132;
	float[] field3134;
	int field3111;
	int field3112;
	int field3114;
	int field3115;
	int field3126;
	int field3128;
	int field3129;
	int field3139;

	static {
		field3117 = new class326();
		field3142 = false;
	}

	class374(byte[] var1) {
		this.method1989(var1);
	}

	void method1989(byte[] var1) {
		class42 var2 = new class42(var1);
		this.field3139 = var2.method282();
		this.field3112 = var2.method282();
		this.field3114 = var2.method282();
		this.field3115 = var2.method282();
		if (this.field3115 < 0) {
			this.field3115 = ~this.field3115;
			this.field3116 = true;
		}

		int var3 = var2.method282();
		this.field3130 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method278();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method288(var7, 0, var5);
			this.field3130[var4] = var7;
		}

	}

	float[] method1991(int var1) {
		class326 var2 = new class326();
		var2.method1831(this.field3130[var1], 0);
		this.field3134 = new float[field3119];
		var2.method1830();
		int var3 = var2.method1829(class501.method2419(field3125.length - 1));
		boolean var4 = field3124[var3];
		int var5 = var4 ? field3119 : field3118;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1830() != 0;
			var7 = var2.method1830() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field3118 >> 2);
			var10 = (var5 >> 2) + (field3118 >> 2);
			var11 = field3118 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field3118 >> 2);
			var13 = var5 - (var5 >> 2) + (field3118 >> 2);
			var14 = field3118 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		class511 var15 = field3123[field3125[var3]];
		int var16 = var15.field4187;
		int var17 = var15.field4189[var16];
		class488 var18 = field3121[var17].method1894(var2);
		boolean var19 = !var18.method2405();

		int var20;
		for (var20 = 0; var20 < var15.field4188; ++var20) {
			class263 var21 = field3122[var15.field4190[var20]];
			float[] var22 = this.field3134;
			var21.method1519(var22, var5 >> 1, var19, var2);
		}

		if (var18.method2405()) {
			var16 = var15.field4187;
			int var10000 = var15.field4189[var16];
			var18.method2404(this.field3134, var5 >> 1);
		}

		int var43;
		int var46;
		if (!var18.method2405()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field3134[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var43 = var5 >> 2;
			var46 = var5 >> 3;
			float[] var23 = this.field3134;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var48 = var4 ? field3135 : field3141;
			float[] var25 = var4 ? field3136 : field3133;
			float[] var26 = var4 ? field3137 : field3127;
			int[] var27 = var4 ? field3113 : field3138;

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

			var28 = class501.method2419(var5 - 1);

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
				var57 = this.field3134;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var49 = var12; var49 < var13; ++var49) {
				var30 = (float)Math.sin(((double)(var49 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field3134;
				var57[var49] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field3128 > 0) {
			var43 = this.field3128 + var5 >> 2;
			var44 = new float[var43];
			int var47;
			if (!this.field3131) {
				for (var46 = 0; var46 < this.field3129; ++var46) {
					var47 = (this.field3128 >> 1) + var46;
					var44[var46] += this.field3132[var47];
				}
			}

			if (var18.method2405()) {
				for (var46 = var9; var46 < var5 >> 1; ++var46) {
					var47 = var44.length - (var5 >> 1) + var46;
					var44[var47] += this.field3134[var46];
				}
			}
		}

		float[] var45 = this.field3132;
		this.field3132 = this.field3134;
		this.field3134 = var45;
		this.field3128 = var5;
		this.field3129 = var13 - (var5 >> 1);
		this.field3131 = !var18.method2405();
		return var44;
	}

	class352 method1994(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field3140 == null) {
				this.field3128 = 0;
				this.field3132 = new float[field3119];
				this.field3140 = new byte[this.field3112];
				this.field3111 = 0;
				this.field3126 = 0;
			}

			for (; this.field3126 < this.field3130.length; ++this.field3126) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1991(this.field3126);
				if (var2 != null) {
					int var3 = this.field3111;
					int var4 = var2.length;
					if (var4 > this.field3112 - var3) {
						var4 = this.field3112 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field3140[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field3111;
					}

					this.field3111 = var3;
				}
			}

			this.field3132 = null;
			byte[] var7 = this.field3140;
			this.field3140 = null;
			return new class352(this.field3139, var7, this.field3114, this.field3115, this.field3116);
		}
	}

	static float method1995(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	static void method1990(byte[] var0) {
		class326 var1 = field3117;
		var1.method1831(var0, 0);
		field3118 = 1 << var1.method1829(4);
		field3119 = 1 << var1.method1829(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field3119 : field3118;
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
			int var11 = class501.method2419(var6 - 1);

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
				field3135 = var7;
				field3136 = var20;
				field3137 = var21;
				field3113 = var22;
			} else {
				field3141 = var7;
				field3133 = var20;
				field3127 = var21;
				field3138 = var22;
			}
		}

		var2 = var1.method1829(8) + 1;
		field3120 = new class318[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field3120[var3] = new class318();
		}

		var3 = var1.method1829(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1829(16);
		}

		var3 = var1.method1829(6) + 1;
		field3121 = new class345[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field3121[var4] = new class345();
		}

		var4 = var1.method1829(6) + 1;
		field3122 = new class263[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field3122[var5] = new class263();
		}

		var5 = var1.method1829(6) + 1;
		field3123 = new class511[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field3123[var6] = new class511();
		}

		var6 = var1.method1829(6) + 1;
		field3124 = new boolean[var6];
		field3125 = new int[var6];

		for (int var19 = 0; var19 < var6; ++var19) {
			field3124[var19] = var1.method1830() != 0;
			var1.method1829(16);
			var1.method1829(16);
			field3125[var19] = var1.method1829(8);
		}

	}

	static boolean method1992(class215 var0) {
		if (!field3142) {
			byte[] var1 = var0.method1212(0, 0);
			if (var1 == null) {
				return false;
			}

			method1990(var1);
			field3142 = true;
		}

		return true;
	}

	static class374 method1993(class215 var0, int var1, int var2) {
		if (!method1992(var0)) {
			var0.method1214(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method1212(var1, var2);
			return var3 == null ? null : new class374(var3);
		}
	}
}
