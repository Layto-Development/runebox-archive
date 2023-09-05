import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ObfInfo(name = "bb")
public class class429 {
	@ObfInfo(name = "ai", desc = "Z")
	protected static boolean field3257;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -251294299)
	public static int field3242;
	@ObfInfo(name = "fx", desc = "Lnk;")
	static class505 field3253;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1214547985)
	static int field3245;
	@ObfInfo(name = "ap", desc = "Ljava/util/concurrent/ScheduledExecutorService;")
	static ScheduledExecutorService field3244;
	@ObfInfo(name = "ak", desc = "Z")
	boolean field3259;
	@ObfInfo(name = "ar", desc = "Lbw;")
	class449 field3248;
	@ObfInfo(name = "by", desc = "[Lbw;")
	class449[] field3261;
	@ObfInfo(name = "bs", desc = "[Lbw;")
	class449[] field3262;
	@ObfInfo(name = "bd", desc = "I", intMultiplier = 1549070857)
	int field3243;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 2010513145)
	int field3249;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1919941599)
	int field3251;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 406112827)
	int field3252;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 1514301463)
	int field3255;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 758582745)
	int field3256;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -993560077)
	int field3258;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1907297993)
	int field3260;
	@ObfInfo(name = "aw", desc = "J", longMultiplier = -4227404571919014607L)
	long field3246;
	@ObfInfo(name = "ag", desc = "J", longMultiplier = 4668505505533220207L)
	long field3250;
	@ObfInfo(name = "as", desc = "J", longMultiplier = -2235654764052402713L)
	long field3254;
	@ObfInfo(name = "an", desc = "[I")
	protected int[] field3247;

	@ObfInfo(name = "<init>", desc = "()V")
	protected class429() {
		this.field3249 = 32;
		this.field3250 = class43.method443();
		this.field3254 = 0L;
		this.field3255 = 0;
		this.field3256 = 0;
		this.field3258 = 0;
		this.field3246 = 0L;
		this.field3259 = true;
		this.field3243 = 0;
		this.field3261 = new class449[8];
		this.field3262 = new class449[8];
	}

	@ObfInfo(name = "as", desc = "(Lbw;I)V")
	public final synchronized void method2229(class449 var1) {
		this.field3248 = var1;
	}

	@ObfInfo(name = "ay", desc = "(B)V", opaqueValue = "1")
	public final synchronized void method2241() {
		if (this.field3247 != null) {
			long var2 = class43.method443();

			try {
				if (0L != this.field3254) {
					if (var2 < this.field3254) {
						return;
					}

					this.method2236(this.field3251);
					this.field3254 = 0L;
					this.field3259 = true;
				}

				int var4 = this.method2237();
				if (this.field3258 - var4 > this.field3255) {
					this.field3255 = this.field3258 - var4;
				}

				int var5 = this.field3260 + this.field3252;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field3251) {
					this.field3251 += 1024;
					if (this.field3251 > 16384) {
						this.field3251 = 16384;
					}

					this.method2238();
					this.method2236(this.field3251);
					var4 = 0;
					this.field3259 = true;
					if (var5 + 256 > this.field3251) {
						var5 = this.field3251 - 256;
						this.field3260 = var5 - this.field3252;
					}
				}

				while (var4 < var5) {
					this.method2234(this.field3247, 256);
					this.method2230();
					var4 += 256;
				}

				if (var2 > this.field3246) {
					if (!this.field3259) {
						if (this.field3255 == 0 && this.field3256 == 0) {
							this.method2238();
							this.field3254 = var2 + 2000L;
							return;
						}

						this.field3260 = Math.min(this.field3256, this.field3255);
						this.field3256 = this.field3255;
					} else {
						this.field3259 = false;
					}

					this.field3255 = 0;
					this.field3246 = var2 + 2000L;
				}

				this.field3258 = var4;
			} catch (Exception var7) {
				this.method2238();
				this.field3254 = var2 + 2000L;
			}

			try {
				if (var2 > 500000L + this.field3250) {
					var2 = this.field3250;
				}

				while (var2 > this.field3250 + 5000L) {
					this.method2233(256);
					this.field3250 += (long)(256000 / field3242);
				}
			} catch (Exception var6) {
				this.field3250 = var2;
			}

		}
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public final void method2231() {
		this.field3259 = true;
	}

	@ObfInfo(name = "av", desc = "(B)V")
	public final synchronized void method2240() {
		this.field3259 = true;

		try {
			this.method2239();
		} catch (Exception var3) {
			this.method2238();
			this.field3254 = class43.method443() + 2000L;
		}

	}

	@ObfInfo(name = "aw", desc = "(B)V", opaqueValue = "126")
	public final synchronized void method2232() {
		if (class34.field486 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (class34.field486.field2251[var3] == this) {
					class34.field486.field2251[var3] = null;
				}

				if (null != class34.field486.field2251[var3]) {
					var2 = false;
				}
			}

			if (var2) {
				field3244.shutdownNow();
				field3244 = null;
				class34.field486 = null;
			}
		}

		this.method2238();
		this.field3247 = null;
	}

	@ObfInfo(name = "ak", desc = "(IB)V", opaqueValue = "9")
	final void method2233(int var1) {
		this.field3243 -= var1;
		if (this.field3243 < 0) {
			this.field3243 = 0;
		}

		if (this.field3248 != null) {
			this.field3248.method2356(var1);
		}

	}

	@ObfInfo(name = "bh", desc = "([II)V")
	final void method2234(int[] var1, int var2) {
		int var3 = var2;
		if (field3257) {
			var3 = var2 << 1;
		}

		class80.method531(var1, 0, var3);
		this.field3243 -= var2;
		if (null != this.field3248 && this.field3243 <= 0) {
			this.field3243 += field3242 >> 4;
			method2244(this.field3248);
			this.method2235(this.field3248, this.field3248.method2353());
			int var4 = 0;
			int var5 = 255;

			int var6;
			class449 var10;
			label104:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						class449 var11 = this.field3261[var7];

						label98:
						while (true) {
							while (true) {
								if (null == var11) {
									break label98;
								}

								class218 var12 = var11.field3389;
								if (null != var12 && var12.field1933 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field3386;
								} else {
									var11.field3388 = true;
									int var13 = var11.method2352();
									var4 += var13;
									if (null != var12) {
										var12.field1933 += var13;
									}

									if (var4 >= this.field3249) {
										break label104;
									}

									class449 var14 = var11.method2354();
									if (null != var14) {
										for (int var15 = var11.field3387; var14 != null; var14 = var11.method2355()) {
											this.method2235(var14, var15 * var14.method2353() >> 8);
										}
									}

									class449 var18 = var11.field3386;
									var11.field3386 = null;
									if (var10 == null) {
										this.field3261[var7] = var18;
									} else {
										var10.field3386 = var18;
									}

									if (var18 == null) {
										this.field3262[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				class449 var16 = this.field3261[var6];
				class449[] var17 = this.field3261;
				this.field3262[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.field3386;
					var16.field3386 = null;
				}
			}
		}

		if (this.field3243 < 0) {
			this.field3243 = 0;
		}

		if (this.field3248 != null) {
			this.field3248.method2357(var1, 0, var2);
		}

		this.field3250 = class43.method443();
	}

	@ObfInfo(name = "bk", desc = "(Lbw;II)V", opaqueValue = "998759395")
	final void method2235(class449 var1, int var2) {
		int var4 = var2 >> 5;
		class449 var5 = this.field3262[var4];
		if (var5 == null) {
			this.field3261[var4] = var1;
		} else {
			var5.field3386 = var1;
		}

		this.field3262[var4] = var1;
		var1.field3387 = var2;
	}

	@ObfInfo(name = "au", desc = "(I)V")
	protected void method2242() throws Exception {
	}

	@ObfInfo(name = "ae", desc = "(IB)V")
	protected void method2236(int var1) throws Exception {
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	protected int method2237() throws Exception {
		return this.field3251;
	}

	@ObfInfo(name = "at", desc = "()V")
	protected void method2230() throws Exception {
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	protected void method2238() {
	}

	@ObfInfo(name = "ai", desc = "(B)V")
	protected void method2239() throws Exception {
	}

	@ObfInfo(name = "ax", desc = "(IZII)V")
	public static final void method2246(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			field3242 = var0;
			field3257 = var1;
			field3245 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "ah", desc = "(Lgh;III)Lbb;")
	public static final class429 method2245(class502 var0, int var1, int var2) {
		if (field3242 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				class429 var4 = class355.field2801.method2223();
				var4.field3247 = new int[256 * (field3257 ? 2 : 1)];
				var4.field3252 = var2;
				var4.method2242();
				var4.field3251 = 1024 + (var2 & -1024);
				if (var4.field3251 > 16384) {
					var4.field3251 = 16384;
				}

				var4.method2236(var4.field3251);
				if (field3245 > 0 && null == class34.field486) {
					class34.field486 = new class279();
					field3244 = Executors.newScheduledThreadPool(1);
					field3244.scheduleAtFixedRate(class34.field486, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class34.field486 != null) {
					if (null != class34.field486.field2251[var1]) {
						throw new IllegalArgumentException();
					}

					class34.field486.field2251[var1] = var4;
				}

				return var4;
			} catch (Throwable var5) {
				return new class429();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "bj", desc = "(Lbw;I)V")
	static final void method2244(class449 var0) {
		var0.field3388 = false;
		if (var0.field3389 != null) {
			var0.field3389.field1933 = 0;
		}

		for (class449 var2 = var0.method2354(); null != var2; var2 = var0.method2355()) {
			method2244(var2);
		}

	}

	@ObfInfo(name = "jp", desc = "(Ldr;IIIIIB)V")
	static final void method2243(class114 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
		if (null != var0) {
			if (var6 == -1) {
				throw new IllegalStateException();
			}

			if (var0.method634()) {
				if (var0 instanceof class412) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					class395 var7 = ((class412)var0).field3178;
					if (var7.field3084 != null) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						var7 = var7.method2099();
					}

					if (null == var7) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						return;
					}
				}

				int var76 = class183.field1652;
				int[] var8 = class183.field1653;
				boolean var10000;
				if (var1 < var76) {
					if (var6 == -1) {
						return;
					}

					var10000 = true;
				} else {
					var10000 = false;
				}

				boolean var9 = var10000;
				int var10 = -2;
				if (var0.field1102 != null) {
					label1019: {
						if (var9) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var0.field1054) {
								break label1019;
							}

							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (Client.field260 != 4) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (var0.field1053) {
									break label1019;
								}

								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (Client.field260 != 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (Client.field260 != 3) {
										if (Client.field260 != 1) {
											break label1019;
										}

										if (var6 == -1) {
											return;
										}

										if (!((class439)var0).method2298()) {
											break label1019;
										}
									}
								}
							}
						}

						Client.method145(var0, var0.field1091);
						if (Client.field145 > -1) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (Client.field132 < Client.field64) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.field311[Client.field132] = class319.field2584.method1646(var0.field1102) / 2;
								Client.field86[Client.field132] = class319.field2584.field2414;
								Client.field134[Client.field132] = Client.field145;
								Client.field135[Client.field132] = Client.field146 - var10;
								Client.field138[Client.field132] = var0.field1056;
								Client.field139[Client.field132] = var0.field1057;
								Client.field287[Client.field132] = var0.field1055;
								Client.field36[Client.field132] = var0.field1098;
								Client.field142[Client.field132] = var0.field1102;
								++Client.field132;
								var10 += 12;
							}
						}
					}
				}

				int var16;
				int var23;
				int var24;
				if (!var0.field1065.method2421()) {
					Client.method145(var0, 15 + var0.field1091);

					for (class401 var11 = (class401)var0.field1065.method2423(); null != var11; var11 = (class401)var0.field1065.method2419()) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						class209 var12 = var11.method2120(Client.field330);
						if (null != var12) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							class468 var13;
							class150 var14;
							class150 var15;
							int var17;
							label991: {
								var13 = var11.field3118;
								var14 = var13.method2406();
								var15 = var13.method2405();
								var17 = 0;
								if (null != var14) {
									if (var6 == -1) {
										return;
									}

									if (null != var15) {
										if (var13.field3785 * 2 < var15.field1464) {
											if (var6 == -1) {
												throw new IllegalStateException();
											}

											var17 = var13.field3785;
										}

										var16 = var15.field1464 - var17 * 2;
										break label991;
									}
								}

								var16 = var13.field3784;
							}

							int var18 = 255;
							boolean var19 = true;
							int var20 = Client.field330 - var12.field1871;
							int var21 = var12.field1868 * var16 / var13.field3784;
							int var22;
							int var91;
							if (var12.field1869 > var20) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								int var100;
								if (var13.field3780 == 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var100 = 0;
								} else {
									var100 = var13.field3780 * (var20 / var13.field3780);
								}

								var22 = var100;
								var23 = var16 * var12.field1867 / var13.field3784;
								var91 = (var21 - var23) * var22 / var12.field1869 + var23;
							} else {
								var91 = var21;
								var22 = var12.field1869 + var13.field3777 - var20;
								if (var13.field3781 >= 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var18 = (var22 << 8) / (var13.field3777 - var13.field3781);
								}
							}

							if (var12.field1868 > 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (var91 < 1) {
									var91 = 1;
								}
							}

							if (null != var14) {
								if (var6 == -1) {
									return;
								}

								if (var15 != null) {
									if (var6 == -1) {
										return;
									}

									if (var16 == var91) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var91 += var17 * 2;
									} else {
										var91 += var17;
									}

									label978: {
										var22 = var14.field1460;
										var10 += var22;
										var23 = var2 + Client.field145 - (var16 >> 1);
										var24 = var3 + Client.field146 - var10;
										var23 -= var17;
										if (var18 >= 0) {
											if (var6 == -1) {
												return;
											}

											if (var18 < 255) {
												if (var6 == -1) {
													throw new IllegalStateException();
												}

												var14.method875(var23, var24, var18);
												class83.method555(var23, var24, var23 + var91, var24 + var22);
												var15.method875(var23, var24, var18);
												break label978;
											}
										}

										var14.method877(var23, var24);
										class83.method555(var23, var24, var23 + var91, var22 + var24);
										var15.method877(var23, var24);
									}

									class83.method549(var2, var3, var2 + var4, var3 + var5);
									var10 += 2;
									continue;
								}
							}

							var10 += 5;
							if (Client.field145 > -1) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var22 = var2 + Client.field145 - (var16 >> 1);
								var23 = var3 + Client.field146 - var10;
								class83.method542(var22, var23, var91, 5, 65280);
								class83.method542(var91 + var22, var23, var16 - var91, 5, 16711680);
							}

							var10 += 2;
						} else if (var11.method2121()) {
							var11.method907();
						}
					}
				}

				if (var10 == -2) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					var10 += 7;
				}

				class439 var77;
				if (var9) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					if (Client.field330 == var0.field1067) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (Client.method224((class439)var0)) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							var77 = (class439)var0;
							if (var9) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.method145(var0, 15 + var0.field1091);
								class300 var79 = (class300)Client.field96.get(class517.field4142);
								var10 += 4;
								var79.method1653(var77.field3315.method1935(), Client.field145 + var2, var3 + Client.field146 - var10, 16777215, 0);
								var10 += 18;
							}
						}
					}
				}

				if (var9) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					var77 = (class439)var0;
					if (var77.field3318) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						return;
					}

					label944: {
						if (var77.field3300 == -1) {
							if (var6 == -1) {
								return;
							}

							if (var77.field3301 == -1) {
								break label944;
							}

							if (var6 == -1) {
								throw new IllegalStateException();
							}
						}

						Client.method145(var0, 15 + var0.field1091);
						if (Client.field145 > -1) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var77.field3300 != -1) {
								if (var6 == -1) {
									return;
								}

								var10 += 25;
								class11.field343[var77.field3300].method877(var2 + Client.field145 - 12, var3 + Client.field146 - var10);
							}

							if (var77.field3301 != -1) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var10 += 25;
								class49.field573[var77.field3301].method877(var2 + Client.field145 - 12, Client.field146 + var3 - var10);
							}
						}
					}

					if (var1 >= 0) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (Client.field105 == 10) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var8[var1] == Client.field68) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.method145(var0, var0.field1091 + 15);
								if (Client.field145 > -1) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var10 += class74.field799[1].field1460;
									class74.field799[1].method877(Client.field145 + var2 - 12, Client.field146 + var3 - var10);
								}
							}
						}
					}
				} else {
					class412 var78 = (class412)var0;
					int[] var80 = var78.method2175();
					short[] var83 = var78.method2182();
					if (null != var83) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (null != var80) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							for (int var85 = 0; var85 < var83.length; ++var85) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (var83[var85] >= 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (var80[var85] < 0) {
										if (var6 == -1) {
											return;
										}
									} else {
										long var87 = (long)var80[var85] << 8 | (long)var83[var85];
										class150 var89 = (class150)Client.field318.method1870(var87, (byte)48);
										if (var89 == null) {
											class150[] var90 = class273.method1438(field3253, var80[var85], 0);
											if (var90 != null) {
												if (var6 == -1) {
													throw new IllegalStateException();
												}

												if (var83[var85] < var90.length) {
													if (var6 == -1) {
														return;
													}

													var89 = var90[var83[var85]];
													Client.field318.method1871(var87, var89);
												}
											}
										}

										if (var89 != null) {
											Client.method145(var0, 15 + var0.field1091);
											if (Client.field145 > -1) {
												if (var6 == -1) {
													throw new IllegalStateException();
												}

												var89.method877(Client.field145 + var2 - (var89.field1464 >> 1), Client.field146 + (var3 - var89.field1460) - 4);
											}
										}
									}
								}
							}
						}
					}

					if (Client.field105 == 1) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (Client.field26[var1 - var76] == Client.field49) {
							if (var6 == -1) {
								return;
							}

							if (Client.field330 % 20 < 10) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.method145(var0, 15 + var0.field1091);
								if (Client.field145 > -1) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									class74.field799[0].method877(Client.field145 + var2 - 12, Client.field146 + var3 - 28);
								}
							}
						}
					}
				}

				for (int var81 = 0; var81 < 4; ++var81) {
					if (var6 == -1) {
						return;
					}

					int var82 = var0.field1062[var81];
					int var84 = var0.field1060[var81];
					class490 var86 = null;
					int var88 = 0;
					if (var84 >= 0) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (var82 <= Client.field330) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}
							continue;
						}

						var86 = class490.method2477(var0.field1060[var81]);
						var88 = var86.field3984;
						if (var86 != null) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (null != var86.field3988) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var86 = var86.method2470();
								if (null == var86) {
									if (var6 == -1) {
										return;
									}

									var0.field1062[var81] = -1;
									continue;
								}
							}
						}
					} else if (var82 < 0) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}
						continue;
					}

					var16 = var0.field1063[var81];
					class490 var93 = null;
					if (var16 >= 0) {
						var93 = class490.method2477(var16);
						if (var93 != null) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var93.field3988 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var93 = var93.method2470();
							}
						}
					}

					if (var82 - var88 > Client.field330) {
						if (var6 == -1) {
							return;
						}
					} else if (var86 == null) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						var0.field1062[var81] = -1;
					} else {
						Client.method145(var0, var0.field1091 / 2);
						if (Client.field145 > -1) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							boolean var92 = true;
							if (var81 == 1) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.field146 -= 20;
							}

							if (var81 == 2) {
								Client.field145 -= 15;
								Client.field146 -= 10;
							}

							if (var81 == 3) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.field145 += 15;
								Client.field146 -= 10;
							}

							class150 var96 = null;
							class150 var94 = null;
							class150 var95 = null;
							class150 var97 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class150 var31 = null;
							class150 var32 = null;
							class150 var33 = null;
							class150 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var96 = var86.method2471();
							int var44;
							if (var96 != null) {
								var23 = var96.field1464;
								var44 = var96.field1460;
								if (var44 > var43) {
									if (var6 == -1) {
										return;
									}

									var43 = var44;
								}

								var27 = var96.field1458;
							}

							var94 = var86.method2468();
							if (null != var94) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var24 = var94.field1464;
								var44 = var94.field1460;
								if (var44 > var43) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var43 = var44;
								}

								var28 = var94.field1458;
							}

							var95 = var86.method2472();
							if (var95 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var25 = var95.field1464;
								var44 = var95.field1460;
								if (var44 > var43) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var43 = var44;
								}

								var29 = var95.field1458;
							}

							var97 = var86.method2473();
							if (null != var97) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var26 = var97.field1464;
								var44 = var97.field1460;
								if (var44 > var43) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var43 = var44;
								}

								var30 = var97.field1458;
							}

							if (var93 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var31 = var93.method2471();
								if (null != var31) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var35 = var31.field1464;
									var44 = var31.field1460;
									if (var44 > var43) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var43 = var44;
									}

									var39 = var31.field1458;
								}

								var32 = var93.method2468();
								if (null != var32) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var36 = var32.field1464;
									var44 = var32.field1460;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.field1458;
								}

								var33 = var93.method2472();
								if (var33 != null) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var37 = var33.field1464;
									var44 = var33.field1460;
									if (var44 > var43) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var43 = var44;
									}

									var41 = var33.field1458;
								}

								var34 = var93.method2473();
								if (null != var34) {
									var38 = var34.field1464;
									var44 = var34.field1460;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.field1458;
								}
							}

							class258 var98 = var86.method2476();
							if (var98 == null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var98 = class209.field1870;
							}

							class258 var45;
							if (var93 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var45 = var93.method2476();
								if (var45 == null) {
									if (var6 == -1) {
										return;
									}

									var45 = class209.field1870;
								}
							} else {
								var45 = class209.field1870;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var86.method2474(var0.field1043[var81]);
							int var99 = var98.method1646(var46);
							if (null != var93) {
								if (var6 == -1) {
									return;
								}

								var47 = var93.method2474(var0.field1064[var81]);
								var49 = var45.method1646(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								label1055: {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (null == var95) {
										if (var6 == -1) {
											return;
										}

										if (var97 == null) {
											var50 = 1;
											break label1055;
										}

										if (var6 == -1) {
											throw new IllegalStateException();
										}
									}

									var50 = var99 / var24 + 1;
								}
							}

							if (null != var93 && var36 > 0) {
								label1057: {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (var33 == null) {
										if (var34 == null) {
											var51 = 1;
											break label1057;
										}

										if (var6 == -1) {
											throw new IllegalStateException();
										}
									}

									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var24 * var50;
								var52 += var57;
								var56 += (var57 - var99) / 2;
							} else {
								var52 += var99;
							}

							var57 = var52;
							if (var26 > 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var93 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var63 = var51 * var36;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var52 += var38;
								}
							}

							var63 = var0.field1062[var81] - Client.field330;
							int var64 = var86.field3982 - var86.field3982 * var63 / var86.field3984;
							int var65 = var63 * var86.field3976 / var86.field3984 + -var86.field3976;
							int var66 = var2 + Client.field145 - (var52 >> 1) + var64;
							int var67 = Client.field146 + var3 - 12 + var65;
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var86.field3986 + var67 + 15;
							int var71 = var70 - var98.field2418;
							int var72 = var70 + var98.field2419;
							if (var71 < var67) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var68 = var71;
							}

							if (var72 > var69) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var93 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var73 = var93.field3986 + var67 + 15;
								var74 = var73 - var45.field2418;
								var75 = var73 + var45.field2419;
								if (var74 < var68 && var6 == -1) {
									return;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var86.field3971 >= 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var74 = (var63 << 8) / (var86.field3984 - var86.field3971);
							}

							if (var74 >= 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (var74 < 255) {
									if (var96 != null) {
										if (var6 == -1) {
											return;
										}

										var96.method875(var66 + var53 - var27, var67, var74);
									}

									if (var95 != null) {
										if (var6 == -1) {
											return;
										}

										var95.method875(var66 + var54 - var29, var67, var74);
									}

									if (var94 != null) {
										for (var75 = 0; var75 < var50; ++var75) {
											if (var6 == -1) {
												throw new IllegalStateException();
											}

											var94.method875(var75 * var24 + (var55 + var66 - var28), var67, var74);
										}
									}

									if (null != var97) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var97.method875(var66 + var57 - var30, var67, var74);
									}

									var98.method1651(var46, var66 + var56, var70, var86.field3974, 0, var74);
									if (var93 == null) {
										continue;
									}

									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (null != var31) {
										var31.method875(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.method875(var59 + var66 - var41, var67, var74);
									}

									if (null != var32) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										for (var75 = 0; var75 < var51; ++var75) {
											if (var6 == -1) {
												throw new IllegalStateException();
											}

											var32.method875(var75 * var36 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (null != var34) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var34.method875(var66 + var61 - var42, var67, var74);
									}

									var45.method1651(var47, var62 + var66, var73, var93.field3974, 0, var74);
									continue;
								}
							}

							if (var96 != null) {
								var96.method877(var66 + var53 - var27, var67);
							}

							if (var95 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var95.method877(var66 + var54 - var29, var67);
							}

							if (null != var94) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								for (var75 = 0; var75 < var50; ++var75) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var94.method877(var24 * var75 + (var66 + var55 - var28), var67);
								}
							}

							if (var97 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var97.method877(var57 + var66 - var30, var67);
							}

							var98.method1674(var46, var66 + var56, var70, var86.field3974 | -16777216, 0);
							if (null != var93) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (null != var31) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var31.method877(var58 + var66 - var39, var67);
								}

								if (var33 != null) {
									var33.method877(var59 + var66 - var41, var67);
								}

								if (null != var32) {
									if (var6 == -1) {
										return;
									}

									for (var75 = 0; var75 < var51; ++var75) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var32.method877(var66 + var60 - var40 + var75 * var36, var67);
									}
								}

								if (null != var34) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var34.method877(var66 + var61 - var42, var67);
								}

								var45.method1674(var47, var66 + var62, var73, var93.field3974 | -16777216, 0);
							}
						}
					}
				}

				return;
			}

			if (var6 == -1) {
				return;
			}
		}

	}
}
