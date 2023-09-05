import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Random;

@ObfInfo(name = "cq")
public class class75 {
	@ObfInfo(name = "ak", desc = "[I")
	static int[] field811;
	@ObfInfo(name = "ax", desc = "[I")
	static int[] field817;
	@ObfInfo(name = "ah", desc = "[I")
	static int[] field818;
	@ObfInfo(name = "ay", desc = "[I")
	static int[] field819;
	@ObfInfo(name = "aj", desc = "[I")
	static int[] field821;
	@ObfInfo(name = "am", desc = "[I")
	static int[] field822;
	@ObfInfo(name = "aw", desc = "[I")
	static int[] field823;
	@ObfInfo(name = "av", desc = "[I")
	static int[] field824;
	@ObfInfo(name = "an", desc = "Lcr;")
	class122 field812;
	@ObfInfo(name = "ao", desc = "Lbr;")
	class485 field801;
	@ObfInfo(name = "at", desc = "Lbr;")
	class485 field802;
	@ObfInfo(name = "ai", desc = "Lbr;")
	class485 field804;
	@ObfInfo(name = "az", desc = "Lbr;")
	class485 field805;
	@ObfInfo(name = "ap", desc = "Lbr;")
	class485 field806;
	@ObfInfo(name = "ac", desc = "Lbr;")
	class485 field808;
	@ObfInfo(name = "au", desc = "Lbr;")
	class485 field809;
	@ObfInfo(name = "ar", desc = "Lbr;")
	class485 field813;
	@ObfInfo(name = "ae", desc = "Lbr;")
	class485 field820;
	@ObfInfo(name = "ab", desc = "I")
	int field807;
	@ObfInfo(name = "aq", desc = "I")
	int field810;
	@ObfInfo(name = "al", desc = "I")
	int field814;
	@ObfInfo(name = "ag", desc = "I")
	int field815;
	@ObfInfo(name = "af", desc = "[I")
	int[] field800;
	@ObfInfo(name = "aa", desc = "[I")
	int[] field803;
	@ObfInfo(name = "ad", desc = "[I")
	int[] field816;

	static {
		field817 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field817[var1] = (var0.nextInt() & 2) - 1;
		}

		field818 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field818[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field822 = new int[220500];
		field819 = new int[5];
		field821 = new int[5];
		field824 = new int[5];
		field823 = new int[5];
		field811 = new int[5];
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class75() {
		this.field803 = new int[]{0, 0, 0, 0, 0};
		this.field800 = new int[]{0, 0, 0, 0, 0};
		this.field816 = new int[]{0, 0, 0, 0, 0};
		this.field810 = 0;
		this.field814 = 100;
		this.field807 = 500;
		this.field815 = 0;
	}

	@ObfInfo(name = "au", desc = "(II)[I")
	final int[] method513(int var1, int var2) {
		class80.method531(field822, 0, var1);
		if (var2 < 10) {
			return field822;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field809.method2455();
			this.field820.method2455();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field801 != null) {
				this.field801.method2455();
				this.field802.method2455();
				var5 = (int)((double)(this.field801.field3945 - this.field801.field3948) * 32.768D / var3);
				var6 = (int)((double)this.field801.field3948 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field808 != null) {
				this.field808.method2455();
				this.field804.method2455();
				var8 = (int)((double)(this.field808.field3945 - this.field808.field3948) * 32.768D / var3);
				var9 = (int)((double)this.field808.field3948 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field803[var11] != 0) {
					field819[var11] = 0;
					field821[var11] = (int)((double)this.field816[var11] * var3);
					field824[var11] = (this.field803[var11] << 14) / 100;
					field823[var11] = (int)((double)(this.field809.field3945 - this.field809.field3948) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field800[var11]) / var3);
					field811[var11] = (int)((double)this.field809.field3948 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field809.method2454(var1);
				var13 = this.field820.method2454(var1);
				if (this.field801 != null) {
					var14 = this.field801.method2454(var1);
					var15 = this.field802.method2454(var1);
					var12 += this.method515(var7, var15, this.field801.field3949) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field808 != null) {
					var14 = this.field808.method2454(var1);
					var15 = this.field804.method2454(var1);
					var13 = var13 * ((this.method515(var10, var15, this.field808.field3949) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field803[var14] != 0) {
						var15 = var11 + field821[var14];
						if (var15 < var1) {
							var10000 = field822;
							var10000[var15] += this.method515(field819[var14], var13 * field824[var14] >> 15, this.field809.field3949);
							var10000 = field819;
							var10000[var14] += (var12 * field823[var14] >> 16) + field811[var14];
						}
					}
				}
			}

			int var16;
			if (this.field805 != null) {
				this.field805.method2455();
				this.field806.method2455();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field805.method2454(var1);
					var16 = this.field806.method2454(var1);
					if (var20) {
						var12 = this.field805.field3948 + ((this.field805.field3945 - this.field805.field3948) * var15 >> 8);
					} else {
						var12 = this.field805.field3948 + ((this.field805.field3945 - this.field805.field3948) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field822[var14] = 0;
					}
				}
			}

			if (this.field810 > 0 && this.field814 > 0) {
				var11 = (int)((double)this.field810 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field822;
					var10000[var12] += field822[var12 - var11] * this.field814 / 100;
				}
			}

			if (this.field812.field1147[0] > 0 || this.field812.field1147[1] > 0) {
				this.field813.method2455();
				var11 = this.field813.method2454(var1 + 1);
				var12 = this.field812.method694(0, (float)var11 / 65536.0F);
				var13 = this.field812.method694(1, (float)var11 / 65536.0F);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field822[var14 + var12] * (long)class122.field1150 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field822[var14 + var12 - 1 - var17] * (long)class122.field1144[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field822[var14 - 1 - var17] * (long)class122.field1144[1][var17] >> 16);
						}

						field822[var14] = var16;
						var11 = this.field813.method2454(var1 + 1);
						++var14;
					}

					boolean var21 = true;
					var15 = 128;

					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)field822[var14 + var12] * (long)class122.field1150 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field822[var14 + var12 - 1 - var18] * (long)class122.field1144[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field822[var14 - 1 - var18] * (long)class122.field1144[1][var18] >> 16);
							}

							field822[var14] = var17;
							var11 = this.field813.method2454(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field822[var14 + var12 - 1 - var18] * (long)class122.field1144[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field822[var14 - 1 - var18] * (long)class122.field1144[1][var18] >> 16);
								}

								field822[var14] = var17;
								this.field813.method2454(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field812.method694(0, (float)var11 / 65536.0F);
						var13 = this.field812.method694(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field822[var11] < -32768) {
					field822[var11] = -32768;
				}

				if (field822[var11] > 32767) {
					field822[var11] = 32767;
				}
			}

			return field822;
		}
	}

	@ObfInfo(name = "ae", desc = "(III)I")
	final int method515(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field818[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field817[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;)V")
	final void method514(class280 var1) {
		this.field809 = new class485();
		this.field809.method2456(var1);
		this.field820 = new class485();
		this.field820.method2456(var1);
		int var2 = var1.method1492();
		if (var2 != 0) {
			--var1.field2254;
			this.field801 = new class485();
			this.field801.method2456(var1);
			this.field802 = new class485();
			this.field802.method2456(var1);
		}

		var2 = var1.method1492();
		if (var2 != 0) {
			--var1.field2254;
			this.field808 = new class485();
			this.field808.method2456(var1);
			this.field804 = new class485();
			this.field804.method2456(var1);
		}

		var2 = var1.method1492();
		if (var2 != 0) {
			--var1.field2254;
			this.field805 = new class485();
			this.field805.method2456(var1);
			this.field806 = new class485();
			this.field806.method2456(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method1539();
			if (var4 == 0) {
				break;
			}

			this.field803[var3] = var4;
			this.field800[var3] = var1.method1503();
			this.field816[var3] = var1.method1539();
		}

		this.field810 = var1.method1539();
		this.field814 = var1.method1539();
		this.field807 = var1.method1541();
		this.field815 = var1.method1541();
		this.field812 = new class122();
		this.field813 = new class485();
		this.field812.method690(var1, this.field813);
	}
}
