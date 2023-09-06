import java.util.Random;

public class class279 {
	static int[] field2482;
	static int[] field2488;
	static int[] field2489;
	static int[] field2490;
	static int[] field2492;
	static int[] field2493;
	static int[] field2494;
	static int[] field2495;
	class31 field2483;
	class377 field2472;
	class377 field2473;
	class377 field2475;
	class377 field2476;
	class377 field2477;
	class377 field2479;
	class377 field2480;
	class377 field2484;
	class377 field2491;
	int field2478;
	int field2481;
	int field2485;
	int field2486;
	int[] field2471;
	int[] field2474;
	int[] field2487;

	static {
		field2488 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field2488[var1] = (var0.nextInt() & 2) - 1;
		}

		field2489 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field2489[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field2493 = new int[220500];
		field2490 = new int[5];
		field2492 = new int[5];
		field2495 = new int[5];
		field2494 = new int[5];
		field2482 = new int[5];
	}

	class279() {
		this.field2474 = new int[]{0, 0, 0, 0, 0};
		this.field2471 = new int[]{0, 0, 0, 0, 0};
		this.field2487 = new int[]{0, 0, 0, 0, 0};
		this.field2481 = 0;
		this.field2485 = 100;
		this.field2478 = 500;
		this.field2486 = 0;
	}

	final int[] method1596(int var1, int var2) {
		class422.method2167(field2493, 0, var1);
		if (var2 < 10) {
			return field2493;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field2480.method2013();
			this.field2491.method2013();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field2472 != null) {
				this.field2472.method2013();
				this.field2473.method2013();
				var5 = (int)((double)(this.field2472.field3190 - this.field2472.field3193) * 32.768D / var3);
				var6 = (int)((double)this.field2472.field3193 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field2479 != null) {
				this.field2479.method2013();
				this.field2475.method2013();
				var8 = (int)((double)(this.field2479.field3190 - this.field2479.field3193) * 32.768D / var3);
				var9 = (int)((double)this.field2479.field3193 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field2474[var11] != 0) {
					field2490[var11] = 0;
					field2492[var11] = (int)((double)this.field2487[var11] * var3);
					field2495[var11] = (this.field2474[var11] << 14) / 100;
					field2494[var11] = (int)((double)(this.field2480.field3190 - this.field2480.field3193) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field2471[var11]) / var3);
					field2482[var11] = (int)((double)this.field2480.field3193 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field2480.method2012(var1);
				var13 = this.field2491.method2012(var1);
				if (this.field2472 != null) {
					var14 = this.field2472.method2012(var1);
					var15 = this.field2473.method2012(var1);
					var12 += this.method1598(var7, var15, this.field2472.field3194) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field2479 != null) {
					var14 = this.field2479.method2012(var1);
					var15 = this.field2475.method2012(var1);
					var13 = var13 * ((this.method1598(var10, var15, this.field2479.field3194) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field2474[var14] != 0) {
						var15 = var11 + field2492[var14];
						if (var15 < var1) {
							var10000 = field2493;
							var10000[var15] += this.method1598(field2490[var14], var13 * field2495[var14] >> 15, this.field2480.field3194);
							var10000 = field2490;
							var10000[var14] += (var12 * field2494[var14] >> 16) + field2482[var14];
						}
					}
				}
			}

			int var16;
			if (this.field2476 != null) {
				this.field2476.method2013();
				this.field2477.method2013();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field2476.method2012(var1);
					var16 = this.field2477.method2012(var1);
					if (var20) {
						var12 = this.field2476.field3193 + ((this.field2476.field3190 - this.field2476.field3193) * var15 >> 8);
					} else {
						var12 = this.field2476.field3193 + ((this.field2476.field3190 - this.field2476.field3193) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field2493[var14] = 0;
					}
				}
			}

			if (this.field2481 > 0 && this.field2485 > 0) {
				var11 = (int)((double)this.field2481 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field2493;
					var10000[var12] += field2493[var12 - var11] * this.field2485 / 100;
				}
			}

			if (this.field2483.field471[0] > 0 || this.field2483.field471[1] > 0) {
				this.field2484.method2013();
				var11 = this.field2484.method2012(var1 + 1);
				var12 = this.field2483.method221(0, (float)var11 / 65536.0F);
				var13 = this.field2483.method221(1, (float)var11 / 65536.0F);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field2493[var14 + var12] * (long)class31.field474 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field2493[var14 + var12 - 1 - var17] * (long)class31.field468[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field2493[var14 - 1 - var17] * (long)class31.field468[1][var17] >> 16);
						}

						field2493[var14] = var16;
						var11 = this.field2484.method2012(var1 + 1);
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
							var17 = (int)((long)field2493[var14 + var12] * (long)class31.field474 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field2493[var14 + var12 - 1 - var18] * (long)class31.field468[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field2493[var14 - 1 - var18] * (long)class31.field468[1][var18] >> 16);
							}

							field2493[var14] = var17;
							var11 = this.field2484.method2012(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field2493[var14 + var12 - 1 - var18] * (long)class31.field468[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field2493[var14 - 1 - var18] * (long)class31.field468[1][var18] >> 16);
								}

								field2493[var14] = var17;
								this.field2484.method2012(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field2483.method221(0, (float)var11 / 65536.0F);
						var13 = this.field2483.method221(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field2493[var11] < -32768) {
					field2493[var11] = -32768;
				}

				if (field2493[var11] > 32767) {
					field2493[var11] = 32767;
				}
			}

			return field2493;
		}
	}

	final int method1598(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field2489[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field2488[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	final void method1597(class42 var1) {
		this.field2480 = new class377();
		this.field2480.method2014(var1);
		this.field2491 = new class377();
		this.field2491.method2014(var1);
		int var2 = var1.method278();
		if (var2 != 0) {
			--var1.field527;
			this.field2472 = new class377();
			this.field2472.method2014(var1);
			this.field2473 = new class377();
			this.field2473.method2014(var1);
		}

		var2 = var1.method278();
		if (var2 != 0) {
			--var1.field527;
			this.field2479 = new class377();
			this.field2479.method2014(var1);
			this.field2475 = new class377();
			this.field2475.method2014(var1);
		}

		var2 = var1.method278();
		if (var2 != 0) {
			--var1.field527;
			this.field2476 = new class377();
			this.field2476.method2014(var1);
			this.field2477 = new class377();
			this.field2477.method2014(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method325();
			if (var4 == 0) {
				break;
			}

			this.field2474[var3] = var4;
			this.field2471[var3] = var1.method289();
			this.field2487[var3] = var1.method325();
		}

		this.field2481 = var1.method325();
		this.field2485 = var1.method325();
		this.field2478 = var1.method327();
		this.field2486 = var1.method327();
		this.field2483 = new class31();
		this.field2484 = new class377();
		this.field2483.method217(var1, this.field2484);
	}
}
