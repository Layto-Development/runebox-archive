import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class class537 {

	protected static boolean field4232;

	public static int field4217;

	static class13 field4228;

	static int field4220;

	static ScheduledExecutorService field4219;

	boolean field4234;

	class182 field4223;

	class182[] field4236;

	class182[] field4237;

	int field4218;

	int field4224;

	int field4226;

	int field4227;

	int field4230;

	int field4231;

	int field4233;

	int field4235;

	long field4221;

	long field4225;

	long field4229;

	protected int[] field4222;

	protected class537() {
		this.field4224 = 32;
		this.field4225 = class48.method197();
		this.field4229 = 0L;
		this.field4230 = 0;
		this.field4231 = 0;
		this.field4233 = 0;
		this.field4221 = 0L;
		this.field4234 = true;
		this.field4218 = 0;
		this.field4236 = new class182[8];
		this.field4237 = new class182[8];
	}

	public final synchronized void method2586(class182 var1) {
		this.field4223 = var1;
	}

	public final synchronized void method2598() {
		if (this.field4222 != null) {
			long var2 = class48.method197();
			try {
				if (0L != this.field4229) {
					if (var2 < this.field4229) {
						return;
					}
					this.method2593(this.field4226);
					this.field4229 = 0L;
					this.field4234 = true;
				}
				int var4 = this.method2594();
				if (this.field4233 - var4 > this.field4230) {
					this.field4230 = this.field4233 - var4;
				}
				int var5 = this.field4235 + this.field4227;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}
				if (var5 + 256 > this.field4226) {
					this.field4226 += 1024;
					if (this.field4226 > 16384) {
						this.field4226 = 16384;
					}
					this.method2595();
					this.method2593(this.field4226);
					var4 = 0;
					this.field4234 = true;
					if (var5 + 256 > this.field4226) {
						var5 = this.field4226 - 256;
						this.field4235 = var5 - this.field4227;
					}
				}
				while (var4 < var5) {
					this.method2591(this.field4222, 256);
					this.method2587();
					var4 += 256;
				}
				if (var2 > this.field4221) {
					if (!this.field4234) {
						if (this.field4230 == 0 && this.field4231 == 0) {
							this.method2595();
							this.field4229 = var2 + 2000L;
							return;
						}
						this.field4235 = Math.min(this.field4231, this.field4230);
						this.field4231 = this.field4230;
					} else {
						this.field4234 = false;
					}
					this.field4230 = 0;
					this.field4221 = var2 + 2000L;
				}
				this.field4233 = var4;
			} catch (Exception var7) {
				this.method2595();
				this.field4229 = var2 + 2000L;
			}
			try {
				if (var2 > 500000L + this.field4225) {
					var2 = this.field4225;
				}
				while (var2 > this.field4225 + 5000L) {
					this.method2590(256);
					this.field4225 += (long) (256000 / field4217);
				}
			} catch (Exception var6) {
				this.field4225 = var2;
			}
		}
	}

	public final void method2588() {
		this.field4234 = true;
	}

	public final synchronized void method2597() {
		this.field4234 = true;
		try {
			this.method2596();
		} catch (Exception var3) {
			this.method2595();
			this.field4229 = class48.method197() + 2000L;
		}
	}

	public final synchronized void method2589() {
		if (class26.field128 != null) {
			boolean var2 = true;
			for (int var3 = 0; var3 < 2; ++var3) {
				if (class26.field128.field2925[var3] == this) {
					class26.field128.field2925[var3] = null;
				}
				if (null != class26.field128.field2925[var3]) {
					var2 = false;
				}
			}
			if (var2) {
				field4219.shutdownNow();
				field4219 = null;
				class26.field128 = null;
			}
		}
		this.method2595();
		this.field4222 = null;
	}

	final void method2590(int var1) {
		this.field4218 -= 256;
		if (this.field4218 < 0) {
			this.field4218 = 0;
		}
		if (this.field4223 != null) {
			this.field4223.method1068(256);
		}
	}

	final void method2591(int[] var1, int var2) {
		short var3 = 256;
		if (field4232) {
			var3 = 512;
		}
		class355.method1867(var1, 0, var3);
		this.field4218 -= 256;
		if (null != this.field4223 && this.field4218 <= 0) {
			this.field4218 += field4217 >> 4;
			method2601(this.field4223);
			this.method2592(this.field4223, this.field4223.method1065());
			int var4 = 0;
			int var5 = 255;
			int var6;
			class182 var10;
			label104: for (var6 = 7; var5 != 0; --var6) {
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
						class182 var11 = this.field4236[var7];
						label98: while (true) {
							while (true) {
								if (null == var11) {
									break label98;
								}
								class423 var12 = var11.field1786;
								if (null != var12 && var12.field3272 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field1783;
								} else {
									var11.field1785 = true;
									int var13 = var11.method1064();
									var4 += var13;
									if (null != var12) {
										var12.field3272 += var13;
									}
									if (var4 >= this.field4224) {
										break label104;
									}
									class182 var14 = var11.method1066();
									if (null != var14) {
										for (int var15 = var11.field1784; var14 != null; var14 = var11.method1067()) {
											this.method2592(var14, var15 * var14.method1065() >> 8);
										}
									}
									class182 var18 = var11.field1783;
									var11.field1783 = null;
									if (var10 == null) {
										this.field4236[var7] = var18;
									} else {
										var10.field1783 = var18;
									}
									if (var18 == null) {
										this.field4237[var7] = var10;
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
				class182 var16 = this.field4236[var6];
				class182[] var17 = this.field4236;
				this.field4237[var6] = null;
				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.field1783;
					var16.field1783 = null;
				}
			}
		}
		if (this.field4218 < 0) {
			this.field4218 = 0;
		}
		if (this.field4223 != null) {
			this.field4223.method1069(var1, 0, 256);
		}
		this.field4225 = class48.method197();
	}

	final void method2592(class182 var1, int var2) {
		int var4 = var2 >> 5;
		class182 var5 = this.field4237[var4];
		if (var5 == null) {
			this.field4236[var4] = var1;
		} else {
			var5.field1783 = var1;
		}
		this.field4237[var4] = var1;
		var1.field1784 = var2;
	}

	protected void method2599() throws Exception {
	}

	protected void method2593(int var1) throws Exception {
	}

	protected int method2594() throws Exception {
		return this.field4226;
	}

	protected void method2587() throws Exception {
	}

	protected void method2595() {
	}

	protected void method2596() throws Exception {
	}

	public static final void method2603(int var0, boolean var1, int var2) {
		field4217 = 22050;
		field4232 = var1;
		field4220 = 2;
	}

	public static final class537 method2602(class420 var0, int var1, int var2) {
		if (field4217 == 0) {
			throw new IllegalStateException();
		} else {
			try {
				class537 var4 = class460.field3496.method1752();
				var4.field4222 = new int[256 * (field4232 ? 2 : 1)];
				var4.field4227 = 2048;
				var4.method2599();
				var4.field4226 = 3072;
				if (var4.field4226 > 16384) {
					var4.field4226 = 16384;
				}
				var4.method2593(var4.field4226);
				if (field4220 > 0 && null == class26.field128) {
					class26.field128 = new class365();
					field4219 = Executors.newScheduledThreadPool(1);
					field4219.scheduleAtFixedRate(class26.field128, 0L, 10L, TimeUnit.MILLISECONDS);
				}
				if (class26.field128 != null) {
					if (null != class26.field128.field2925[0]) {
						throw new IllegalArgumentException();
					}
					class26.field128.field2925[0] = var4;
				}
				return var4;
			} catch (Throwable var5) {
				return new class537();
			}
		}
	}

	static final void method2601(class182 var0) {
		var0.field1785 = false;
		if (var0.field1786 != null) {
			var0.field1786.field3272 = 0;
		}
		for (class182 var2 = var0.method1066(); null != var2; var2 = var0.method1067()) {
			method2601(var2);
		}
	}

	static final void method2600(class54 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
		if (null != var0 && var0.method217()) {
			if (var0 instanceof class373) {
				class314 var7 = ((class373) var0).field3019;
				if (var7.field2467 != null) {
					var7 = var7.method1685();
				}
				if (null == var7) {
					return;
				}
			}
			int var76 = class274.field2240;
			int[] var8 = class274.field2241;
			boolean var9 = var1 < var76;
			int var10 = -2;
			if (var0.field313 != null && (!var9 || !var0.field265 && (Client.field1131 == 4 || !var0.field264 && (Client.field1131 == 0 || Client.field1131 == 3 || Client.field1131 == 1 && ((class82) var0).method330())))) {
				Client.method464(var0, var0.field302);
				if (Client.field1016 > -1 && Client.field1003 < Client.field935) {
					Client.field1182[Client.field1003] = class484.field3894.method2386(var0.field313) / 2;
					Client.field957[Client.field1003] = class484.field3894.field4005;
					Client.field1005[Client.field1003] = Client.field1016;
					Client.field1006[Client.field1003] = Client.field1017 - -2;
					Client.field1009[Client.field1003] = var0.field267;
					Client.field1010[Client.field1003] = var0.field268;
					Client.field1158[Client.field1003] = var0.field266;
					Client.field907[Client.field1003] = var0.field309;
					Client.field1013[Client.field1003] = var0.field313;
					++Client.field1003;
					var10 += 12;
				}
			}
			int var16;
			int var23;
			int var24;
			if (!var0.field276.method1583()) {
				Client.method464(var0, 15 + var0.field302);
				for (class121 var11 = (class121) var0.field276.method1585(); null != var11; var11 = (class121) var0.field276.method1581()) {
					class123 var12 = var11.method838(Client.field1201);
					if (null == var12) {
						if (var11.method839()) {
							var11.method318();
						}
					} else {
						class199 var13 = var11.field1434;
						class84 var14 = var13.method1207();
						class84 var15 = var13.method1206();
						int var17 = 0;
						if (null != var14 && null != var15) {
							if (var13.field1881 * 2 < var15.field848) {
								var17 = var13.field1881;
							}
							var16 = var15.field848 - var17 * 2;
						} else {
							var16 = var13.field1880;
						}
						int var18 = 255;
						boolean var19 = true;
						int var20 = Client.field1201 - var12.field1450;
						int var21 = var12.field1447 * var16 / var13.field1880;
						int var22;
						int var91;
						if (var12.field1448 > var20) {
							var22 = var13.field1876 == 0 ? 0 : var13.field1876 * (var20 / var13.field1876);
							var23 = var16 * var12.field1446 / var13.field1880;
							var91 = (var21 - var23) * var22 / var12.field1448 + var23;
						} else {
							var91 = var21;
							var22 = var12.field1448 + var13.field1873 - var20;
							if (var13.field1877 >= 0) {
								var18 = (var22 << 8) / (var13.field1873 - var13.field1877);
							}
						}
						if (var12.field1447 > 0 && var91 < 1) {
							var91 = 1;
						}
						if (null != var14 && var15 != null) {
							if (var16 == var91) {
								var91 += var17 * 2;
							} else {
								var91 += var17;
							}
							var22 = var14.field844;
							var10 += var22;
							var23 = var2 + Client.field1016 - (var16 >> 1);
							var24 = var3 + Client.field1017 - var10;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var14.method378(var23, var24, var18);
								class206.method1249(var23, var24, var23 + var91, var24 + var22);
								var15.method378(var23, var24, var18);
							} else {
								var14.method380(var23, var24);
								class206.method1249(var23, var24, var23 + var91, var22 + var24);
								var15.method380(var23, var24);
							}
							class206.method1243(var2, var3, var2 + var4, var3 + var5);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.field1016 > -1) {
								var22 = var2 + Client.field1016 - (var16 >> 1);
								var23 = var3 + Client.field1017 - var10;
								class206.method1236(var22, var23, var91, 5, 65280);
								class206.method1236(var91 + var22, var23, var16 - var91, 5, 16711680);
							}
							var10 += 2;
						}
					}
				}
			}
			if (var10 == -2) {
				var10 += 7;
			}
			class82 var77;
			if (var9 && Client.field1201 == var0.field278 && Client.method543((class82) var0)) {
				var77 = (class82) var0;
				if (var9) {
					Client.method464(var0, 15 + var0.field302);
					class500 var78 = (class500) Client.field967.get(class152.field1581);
					var10 += 4;
					var78.method2393(var77.field822.method322(), Client.field1016 + var2, var3 + Client.field1017 - var10, 16777215, 0);
					var10 += 18;
				}
			}
			if (var9) {
				var77 = (class82) var0;
				if (var77.field825) {
					return;
				}
				if (var77.field807 != -1 || var77.field808 != -1) {
					Client.method464(var0, 15 + var0.field302);
					if (Client.field1016 > -1) {
						if (var77.field807 != -1) {
							var10 += 25;
							class536.field4216[var77.field807].method380(var2 + Client.field1016 - 12, var3 + Client.field1017 - var10);
						}
						if (var77.field808 != -1) {
							var10 += 25;
							class272.field2228[var77.field808].method380(var2 + Client.field1016 - 12, Client.field1017 + var3 - var10);
						}
					}
				}
				if (var1 >= 0 && Client.field976 == 10 && var8[var1] == Client.field939) {
					Client.method464(var0, var0.field302 + 15);
					if (Client.field1016 > -1) {
						var10 += class434.field3409[1].field844;
						class434.field3409[1].method380(Client.field1016 + var2 - 12, Client.field1017 + var3 - var10);
					}
				}
			} else {
				class373 var79 = (class373) var0;
				int[] var80 = var79.method1977();
				short[] var83 = var79.method1984();
				if (null != var83 && null != var80) {
					for (int var85 = 0; var85 < var83.length; ++var85) {
						if (var83[var85] >= 0 && var80[var85] >= 0) {
							long var87 = (long) var80[var85] << 8 | (long) var83[var85];
							class84 var89 = (class84) Client.field1189.method1077(var87, (byte) 48);
							if (var89 == null) {
								class84[] var90 = class494.method2370(field4228, var80[var85], 0);
								if (var90 != null && var83[var85] < var90.length) {
									var89 = var90[var83[var85]];
									Client.field1189.method1078(var87, var89);
								}
							}
							if (var89 != null) {
								Client.method464(var0, 15 + var0.field302);
								if (Client.field1016 > -1) {
									var89.method380(Client.field1016 + var2 - (var89.field848 >> 1), Client.field1017 + (var3 - var89.field844) - 4);
								}
							}
						}
					}
				}
				if (Client.field976 == 1 && Client.field897[var1 - var76] == Client.field920 && Client.field1201 % 20 < 10) {
					Client.method464(var0, 15 + var0.field302);
					if (Client.field1016 > -1) {
						class434.field3409[0].method380(Client.field1016 + var2 - 12, Client.field1017 + var3 - 28);
					}
				}
			}
			for (int var81 = 0; var81 < 4; ++var81) {
				int var82 = var0.field273[var81];
				int var84 = var0.field271[var81];
				class110 var86 = null;
				int var88 = 0;
				if (var84 >= 0) {
					if (var82 <= Client.field1201) {
						continue;
					}
					var86 = class110.method667(var0.field271[var81]);
					var88 = var86.field1308;
					if (var86 != null && null != var86.field1312) {
						var86 = var86.method660();
						if (null == var86) {
							var0.field273[var81] = -1;
							continue;
						}
					}
				} else if (var82 < 0) {
					continue;
				}
				var16 = var0.field274[var81];
				class110 var93 = null;
				if (var16 >= 0) {
					var93 = class110.method667(var16);
					if (var93 != null && var93.field1312 != null) {
						var93 = var93.method660();
					}
				}
				if (var82 - var88 <= Client.field1201) {
					if (var86 == null) {
						var0.field273[var81] = -1;
					} else {
						Client.method464(var0, var0.field302 / 2);
						if (Client.field1016 > -1) {
							boolean var92 = true;
							if (var81 == 1) {
								Client.field1017 -= 20;
							}
							if (var81 == 2) {
								Client.field1016 -= 15;
								Client.field1017 -= 10;
							}
							if (var81 == 3) {
								Client.field1016 += 15;
								Client.field1017 -= 10;
							}
							class84 var96 = null;
							class84 var94 = null;
							class84 var95 = null;
							class84 var97 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class84 var31 = null;
							class84 var32 = null;
							class84 var33 = null;
							class84 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var96 = var86.method661();
							int var44;
							if (var96 != null) {
								var23 = var96.field848;
								var44 = var96.field844;
								if (var44 > 0) {
									var43 = var44;
								}
								var27 = var96.field842;
							}
							var94 = var86.method658();
							if (null != var94) {
								var24 = var94.field848;
								var44 = var94.field844;
								if (var44 > var43) {
									var43 = var44;
								}
								var28 = var94.field842;
							}
							var95 = var86.method662();
							if (var95 != null) {
								var25 = var95.field848;
								var44 = var95.field844;
								if (var44 > var43) {
									var43 = var44;
								}
								var29 = var95.field842;
							}
							var97 = var86.method663();
							if (null != var97) {
								var26 = var97.field848;
								var44 = var97.field844;
								if (var44 > var43) {
									var43 = var44;
								}
								var30 = var97.field842;
							}
							if (var93 != null) {
								var31 = var93.method661();
								if (null != var31) {
									var35 = var31.field848;
									var44 = var31.field844;
									if (var44 > var43) {
										var43 = var44;
									}
									var39 = var31.field842;
								}
								var32 = var93.method658();
								if (null != var32) {
									var36 = var32.field848;
									var44 = var32.field844;
									if (var44 > var43) {
										var43 = var44;
									}
									var40 = var32.field842;
								}
								var33 = var93.method662();
								if (var33 != null) {
									var37 = var33.field848;
									var44 = var33.field844;
									if (var44 > var43) {
										var43 = var44;
									}
									var41 = var33.field842;
								}
								var34 = var93.method663();
								if (null != var34) {
									var38 = var34.field848;
									var44 = var34.field844;
									if (var44 > var43) {
										var43 = var44;
									}
									var42 = var34.field842;
								}
							}
							class61 var98 = var86.method666();
							if (var98 == null) {
								var98 = class123.field1449;
							}
							class61 var45;
							if (var93 != null) {
								var45 = var93.method666();
								if (var45 == null) {
									var45 = class123.field1449;
								}
							} else {
								var45 = class123.field1449;
							}
							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var86.method664(var0.field254[var81]);
							int var99 = var98.method2386(var46);
							if (null != var93) {
								var47 = var93.method664(var0.field275[var81]);
								var49 = var45.method2386(var47);
							}
							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (null == var95 && var97 == null) {
									var50 = 1;
								} else {
									var50 = var99 / var24 + 1;
								}
							}
							if (null != var93 && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}
							int var52 = 0;
							boolean var53 = false;
							if (var23 > 0) {
								var52 = 0 + var23;
							}
							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
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
									var52 += var35;
								}
								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}
								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var51 * var36;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}
								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}
							var63 = var0.field273[var81] - Client.field1201;
							int var64 = var86.field1306 - var86.field1306 * var63 / var86.field1308;
							int var65 = var63 * var86.field1300 / var86.field1308 + -var86.field1300;
							int var66 = var2 + Client.field1016 - (var52 >> 1) + var64;
							int var67 = Client.field1017 + var3 - 12 + var65;
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var86.field1310 + var67 + 15;
							int var71 = var70 - var98.field4009;
							int var72 = var70 + var98.field4010;
							if (var71 < var67) {
								var68 = var71;
							}
							if (var72 > var69) {
								var69 = var72;
							}
							int var73 = 0;
							int var74;
							int var75;
							if (var93 != null) {
								var73 = var93.field1310 + var67 + 15;
								var74 = var73 - var45.field4009;
								var75 = var73 + var45.field4010;
								if (var74 < var68) {
									;
								}
								if (var75 > var69) {
									;
								}
							}
							var74 = 255;
							if (var86.field1295 >= 0) {
								var74 = (var63 << 8) / (var86.field1308 - var86.field1295);
							}
							if (var74 >= 0 && var74 < 255) {
								if (var96 != null) {
									var96.method378(var66 + 0 - var27, var67, var74);
								}
								if (var95 != null) {
									var95.method378(var66 + var54 - var29, var67, var74);
								}
								if (var94 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var94.method378(var75 * var24 + (var55 + var66 - var28), var67, var74);
									}
								}
								if (null != var97) {
									var97.method378(var66 + var57 - var30, var67, var74);
								}
								var98.method2391(var46, var66 + var56, var70, var86.field1298, 0, var74);
								if (var93 != null) {
									if (null != var31) {
										var31.method378(var58 + var66 - var39, var67, var74);
									}
									if (var33 != null) {
										var33.method378(var59 + var66 - var41, var67, var74);
									}
									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method378(var75 * var36 + (var60 + var66 - var40), var67, var74);
										}
									}
									if (null != var34) {
										var34.method378(var66 + var61 - var42, var67, var74);
									}
									var45.method2391(var47, var62 + var66, var73, var93.field1298, 0, var74);
								}
							} else {
								if (var96 != null) {
									var96.method380(var66 + 0 - var27, var67);
								}
								if (var95 != null) {
									var95.method380(var66 + var54 - var29, var67);
								}
								if (null != var94) {
									for (var75 = 0; var75 < var50; ++var75) {
										var94.method380(var24 * var75 + (var66 + var55 - var28), var67);
									}
								}
								if (var97 != null) {
									var97.method380(var57 + var66 - var30, var67);
								}
								var98.method2414(var46, var66 + var56, var70, var86.field1298 | -16777216, 0);
								if (null != var93) {
									if (null != var31) {
										var31.method380(var58 + var66 - var39, var67);
									}
									if (var33 != null) {
										var33.method380(var59 + var66 - var41, var67);
									}
									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method380(var66 + var60 - var40 + var75 * var36, var67);
										}
									}
									if (null != var34) {
										var34.method380(var66 + var61 - var42, var67);
									}
									var45.method2414(var47, var66 + var62, var73, var93.field1298 | -16777216, 0);
								}
							}
						}
					}
				}
			}
		}
	}
}
