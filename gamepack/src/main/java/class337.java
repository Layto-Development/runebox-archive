import java.util.concurrent.ScheduledExecutorService;

public class class337 {
	protected static boolean field2949;
	public static int field2934;
	static class342 field2945;
	static int field2937;
	static ScheduledExecutorService field2936;
	boolean field2951;
	class372 field2940;
	class372[] field2953;
	class372[] field2954;
	int field2935;
	int field2941;
	int field2943;
	int field2944;
	int field2947;
	int field2948;
	int field2950;
	int field2952;
	long field2938;
	long field2942;
	long field2946;
	protected int[] field2939;

	protected class337() {
		this.field2941 = 32;
		this.field2942 = class172.method977();
		this.field2946 = 0L;
		this.field2947 = 0;
		this.field2948 = 0;
		this.field2950 = 0;
		this.field2938 = 0L;
		this.field2951 = true;
		this.field2935 = 0;
		this.field2953 = new class372[8];
		this.field2954 = new class372[8];
	}

	public final synchronized void method1851(class372 var1) {
		this.field2940 = var1;
	}

	public final synchronized void method1863() {
		if (this.field2939 != null) {
			long var2 = class172.method977();

			try {
				if (0L != this.field2946) {
					if (var2 < this.field2946) {
						return;
					}

					this.method1858(this.field2943);
					this.field2946 = 0L;
					this.field2951 = true;
				}

				int var4 = this.method1859();
				if (this.field2950 - var4 > this.field2947) {
					this.field2947 = this.field2950 - var4;
				}

				int var5 = this.field2952 + this.field2944;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field2943) {
					this.field2943 += 1024;
					if (this.field2943 > 16384) {
						this.field2943 = 16384;
					}

					this.method1860();
					this.method1858(this.field2943);
					var4 = 0;
					this.field2951 = true;
					if (var5 + 256 > this.field2943) {
						var5 = this.field2943 - 256;
						this.field2952 = var5 - this.field2944;
					}
				}

				while (var4 < var5) {
					this.method1856(this.field2939, 256);
					this.method1852();
					var4 += 256;
				}

				if (var2 > this.field2938) {
					if (!this.field2951) {
						if (this.field2947 == 0 && this.field2948 == 0) {
							this.method1860();
							this.field2946 = var2 + 2000L;
							return;
						}

						this.field2952 = Math.min(this.field2948, this.field2947);
						this.field2948 = this.field2947;
					} else {
						this.field2951 = false;
					}

					this.field2947 = 0;
					this.field2938 = var2 + 2000L;
				}

				this.field2950 = var4;
			} catch (Exception var7) {
				this.method1860();
				this.field2946 = var2 + 2000L;
			}

			try {
				if (var2 > 500000L + this.field2942) {
					var2 = this.field2942;
				}

				while (var2 > this.field2942 + 5000L) {
					this.method1855(256);
					this.field2942 += (long)(256000 / field2934);
				}
			} catch (Exception var6) {
				this.field2942 = var2;
			}

		}
	}

	public final void method1853() {
		this.field2951 = true;
	}

	public final synchronized void method1862() {
		this.field2951 = true;

		try {
			this.method1861();
		} catch (Exception var3) {
			this.method1860();
			this.field2946 = class172.method977() + 2000L;
		}

	}

	public final synchronized void method1854() {
		if (class306.field2774 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (class306.field2774.field4031[var3] == this) {
					class306.field2774.field4031[var3] = null;
				}

				if (null != class306.field2774.field4031[var3]) {
					var2 = false;
				}
			}

			if (var2) {
				field2936.shutdownNow();
				field2936 = null;
				class306.field2774 = null;
			}
		}

		this.method1860();
		this.field2939 = null;
	}

	final void method1855(int var1) {
		this.field2935 -= var1;
		if (this.field2935 < 0) {
			this.field2935 = 0;
		}

		if (this.field2940 != null) {
			this.field2940.method1982(var1);
		}

	}

	final void method1856(int[] var1, int var2) {
		int var3 = var2;
		if (field2949) {
			var3 = var2 << 1;
		}

		class422.method2167(var1, 0, var3);
		this.field2935 -= var2;
		if (null != this.field2940 && this.field2935 <= 0) {
			this.field2935 += field2934 >> 4;
			class504.method2429(this.field2940);
			this.method1857(this.field2940, this.field2940.method1979());
			int var4 = 0;
			int var5 = 255;

			int var6;
			class372 var10;
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
						class372 var11 = this.field2953[var7];

						label98:
						while (true) {
							while (true) {
								if (null == var11) {
									break label98;
								}

								class428 var12 = var11.field3110;
								if (null != var12 && var12.field3524 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field3107;
								} else {
									var11.field3109 = true;
									int var13 = var11.method1978();
									var4 += var13;
									if (null != var12) {
										var12.field3524 += var13;
									}

									if (var4 >= this.field2941) {
										break label104;
									}

									class372 var14 = var11.method1980();
									if (null != var14) {
										for (int var15 = var11.field3108; var14 != null; var14 = var11.method1981()) {
											this.method1857(var14, var15 * var14.method1979() >> 8);
										}
									}

									class372 var18 = var11.field3107;
									var11.field3107 = null;
									if (var10 == null) {
										this.field2953[var7] = var18;
									} else {
										var10.field3107 = var18;
									}

									if (var18 == null) {
										this.field2954[var7] = var10;
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
				class372 var16 = this.field2953[var6];
				class372[] var17 = this.field2953;
				this.field2954[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.field3107;
					var16.field3107 = null;
				}
			}
		}

		if (this.field2935 < 0) {
			this.field2935 = 0;
		}

		if (this.field2940 != null) {
			this.field2940.method1983(var1, 0, var2);
		}

		this.field2942 = class172.method977();
	}

	final void method1857(class372 var1, int var2) {
		int var4 = var2 >> 5;
		class372 var5 = this.field2954[var4];
		if (var5 == null) {
			this.field2953[var4] = var1;
		} else {
			var5.field3107 = var1;
		}

		this.field2954[var4] = var1;
		var1.field3108 = var2;
	}

	protected void method1865() throws Exception {
	}

	protected void method1858(int var1) throws Exception {
	}

	protected int method1859() throws Exception {
		return this.field2943;
	}

	protected void method1852() throws Exception {
	}

	protected void method1860() {
	}

	protected void method1861() throws Exception {
	}

	public static int method1868(int var0) {
		long var3 = class277.field2462[var0];
		int var2 = (int)(var3 >>> 7 & 127L);
		return var2;
	}

	static void method1864(int var0) {
		if (var0 != class116.field1097) {
			class116.field1097 = var0;
		}
	}

	static final void method1866(class163 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
		if (null != var0) {
			if (var6 == -1) {
				throw new IllegalStateException();
			}

			if (var0.method899()) {
				if (var0 instanceof class102) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					class375 var7 = ((class102)var0).field1018;
					if (var7.field3177 != null) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						var7 = var7.method2001();
					}

					if (null == var7) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						return;
					}
				}

				int var76 = class481.field4085;
				int[] var8 = class481.field4086;
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
				if (var0.field1596 != null) {
					label1019: {
						if (var9) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var0.field1548) {
								break label1019;
							}

							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (Client.field236 != 4) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (var0.field1547) {
									break label1019;
								}

								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (Client.field236 != 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (Client.field236 != 3) {
										if (Client.field236 != 1) {
											break label1019;
										}

										if (var6 == -1) {
											return;
										}

										if (!((class287)var0).method1632()) {
											break label1019;
										}
									}
								}
							}
						}

						class24.method196(var0, var0.field1585);
						if (Client.field121 > -1) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (Client.field108 < Client.field40) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.field287[Client.field108] = class488.field4114.method1292(var0.field1596) / 2;
								Client.field62[Client.field108] = class488.field4114.field2066;
								Client.field110[Client.field108] = Client.field121;
								Client.field111[Client.field108] = Client.field122 - var10;
								Client.field114[Client.field108] = var0.field1550;
								Client.field115[Client.field108] = var0.field1551;
								Client.field263[Client.field108] = var0.field1549;
								Client.field12[Client.field108] = var0.field1592;
								Client.field118[Client.field108] = var0.field1596;
								++Client.field108;
								var10 += 12;
							}
						}
					}
				}

				int var16;
				int var23;
				int var24;
				if (!var0.field1559.method407()) {
					class24.method196(var0, 15 + var0.field1585);

					for (class358 var11 = (class358)var0.field1559.method409(); null != var11; var11 = (class358)var0.field1559.method405()) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						class177 var12 = var11.method1940(Client.field306);
						if (null != var12) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							class190 var13;
							class115 var14;
							class115 var15;
							int var17;
							label991: {
								var13 = var11.field3036;
								var14 = var13.method1042();
								var15 = var13.method1041();
								var17 = 0;
								if (null != var14) {
									if (var6 == -1) {
										return;
									}

									if (null != var15) {
										if (var13.field1770 * 2 < var15.field1084) {
											if (var6 == -1) {
												throw new IllegalStateException();
											}

											var17 = var13.field1770;
										}

										var16 = var15.field1084 - var17 * 2;
										break label991;
									}
								}

								var16 = var13.field1769;
							}

							int var18 = 255;
							boolean var19 = true;
							int var20 = Client.field306 - var12.field1706;
							int var21 = var12.field1703 * var16 / var13.field1769;
							int var22;
							int var91;
							if (var12.field1704 > var20) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								int var100;
								if (var13.field1765 == 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var100 = 0;
								} else {
									var100 = var13.field1765 * (var20 / var13.field1765);
								}

								var22 = var100;
								var23 = var16 * var12.field1702 / var13.field1769;
								var91 = (var21 - var23) * var22 / var12.field1704 + var23;
							} else {
								var91 = var21;
								var22 = var12.field1704 + var13.field1762 - var20;
								if (var13.field1766 >= 0) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var18 = (var22 << 8) / (var13.field1762 - var13.field1766);
								}
							}

							if (var12.field1703 > 0) {
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
										var22 = var14.field1080;
										var10 += var22;
										var23 = var2 + Client.field121 - (var16 >> 1);
										var24 = var3 + Client.field122 - var10;
										var23 -= var17;
										if (var18 >= 0) {
											if (var6 == -1) {
												return;
											}

											if (var18 < 255) {
												if (var6 == -1) {
													throw new IllegalStateException();
												}

												var14.method730(var23, var24, var18);
												class266.method1561(var23, var24, var23 + var91, var24 + var22);
												var15.method730(var23, var24, var18);
												break label978;
											}
										}

										var14.method732(var23, var24);
										class266.method1561(var23, var24, var23 + var91, var22 + var24);
										var15.method732(var23, var24);
									}

									class266.method1555(var2, var3, var2 + var4, var3 + var5);
									var10 += 2;
									continue;
								}
							}

							var10 += 5;
							if (Client.field121 > -1) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var22 = var2 + Client.field121 - (var16 >> 1);
								var23 = var3 + Client.field122 - var10;
								class266.method1548(var22, var23, var91, 5, 65280);
								class266.method1548(var91 + var22, var23, var16 - var91, 5, 16711680);
							}

							var10 += 2;
						} else if (var11.method1941()) {
							var11.method2269();
						}
					}
				}

				if (var10 == -2) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					var10 += 7;
				}

				class287 var77;
				if (var9) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					if (Client.field306 == var0.field1561) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (class446.method2233((class287)var0)) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							var77 = (class287)var0;
							if (var9) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								class24.method196(var0, 15 + var0.field1585);
								class228 var79 = (class228)Client.field72.get(class182.field1716);
								var10 += 4;
								var79.method1299(var77.field2539.method2214(), Client.field121 + var2, var3 + Client.field122 - var10, 16777215, 0);
								var10 += 18;
							}
						}
					}
				}

				if (var9) {
					if (var6 == -1) {
						throw new IllegalStateException();
					}

					var77 = (class287)var0;
					if (var77.field2542) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						return;
					}

					label944: {
						if (var77.field2524 == -1) {
							if (var6 == -1) {
								return;
							}

							if (var77.field2525 == -1) {
								break label944;
							}

							if (var6 == -1) {
								throw new IllegalStateException();
							}
						}

						class24.method196(var0, 15 + var0.field1585);
						if (Client.field121 > -1) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var77.field2524 != -1) {
								if (var6 == -1) {
									return;
								}

								var10 += 25;
								class189.field1757[var77.field2524].method732(var2 + Client.field121 - 12, var3 + Client.field122 - var10);
							}

							if (var77.field2525 != -1) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var10 += 25;
								class140.field1346[var77.field2525].method732(var2 + Client.field121 - 12, Client.field122 + var3 - var10);
							}
						}
					}

					if (var1 >= 0) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (Client.field81 == 10) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var8[var1] == Client.field44) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								class24.method196(var0, var0.field1585 + 15);
								if (Client.field121 > -1) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var10 += class398.field3353[1].field1080;
									class398.field3353[1].method732(Client.field121 + var2 - 12, Client.field122 + var3 - var10);
								}
							}
						}
					}
				} else {
					class102 var78 = (class102)var0;
					int[] var80 = var78.method661();
					short[] var83 = var78.method668();
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
										class115 var89 = (class115)Client.field294.method2101(var87, (byte)48);
										if (var89 == null) {
											class115[] var90 = class97.method644(field2945, var80[var85], 0);
											if (var90 != null) {
												if (var6 == -1) {
													throw new IllegalStateException();
												}

												if (var83[var85] < var90.length) {
													if (var6 == -1) {
														return;
													}

													var89 = var90[var83[var85]];
													Client.field294.method2102(var87, var89);
												}
											}
										}

										if (var89 != null) {
											class24.method196(var0, 15 + var0.field1585);
											if (Client.field121 > -1) {
												if (var6 == -1) {
													throw new IllegalStateException();
												}

												var89.method732(Client.field121 + var2 - (var89.field1084 >> 1), Client.field122 + (var3 - var89.field1080) - 4);
											}
										}
									}
								}
							}
						}
					}

					if (Client.field81 == 1) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (Client.field2[var1 - var76] == Client.field25) {
							if (var6 == -1) {
								return;
							}

							if (Client.field306 % 20 < 10) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								class24.method196(var0, 15 + var0.field1585);
								if (Client.field121 > -1) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									class398.field3353[0].method732(Client.field121 + var2 - 12, Client.field122 + var3 - 28);
								}
							}
						}
					}
				}

				for (int var81 = 0; var81 < 4; ++var81) {
					if (var6 == -1) {
						return;
					}

					int var82 = var0.field1556[var81];
					int var84 = var0.field1554[var81];
					class151 var86 = null;
					int var88 = 0;
					if (var84 >= 0) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						if (var82 <= Client.field306) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}
							continue;
						}

						var86 = class499.method2417(var0.field1554[var81]);
						var88 = var86.field1425;
						if (var86 != null) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (null != var86.field1429) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var86 = var86.method865();
								if (null == var86) {
									if (var6 == -1) {
										return;
									}

									var0.field1556[var81] = -1;
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

					var16 = var0.field1557[var81];
					class151 var93 = null;
					if (var16 >= 0) {
						var93 = class499.method2417(var16);
						if (var93 != null) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							if (var93.field1429 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var93 = var93.method865();
							}
						}
					}

					if (var82 - var88 > Client.field306) {
						if (var6 == -1) {
							return;
						}
					} else if (var86 == null) {
						if (var6 == -1) {
							throw new IllegalStateException();
						}

						var0.field1556[var81] = -1;
					} else {
						class24.method196(var0, var0.field1585 / 2);
						if (Client.field121 > -1) {
							if (var6 == -1) {
								throw new IllegalStateException();
							}

							boolean var92 = true;
							if (var81 == 1) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.field122 -= 20;
							}

							if (var81 == 2) {
								Client.field121 -= 15;
								Client.field122 -= 10;
							}

							if (var81 == 3) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								Client.field121 += 15;
								Client.field122 -= 10;
							}

							class115 var96 = null;
							class115 var94 = null;
							class115 var95 = null;
							class115 var97 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class115 var31 = null;
							class115 var32 = null;
							class115 var33 = null;
							class115 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var96 = var86.method866();
							int var44;
							if (var96 != null) {
								var23 = var96.field1084;
								var44 = var96.field1080;
								if (var44 > var43) {
									if (var6 == -1) {
										return;
									}

									var43 = var44;
								}

								var27 = var96.field1078;
							}

							var94 = var86.method863();
							if (null != var94) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var24 = var94.field1084;
								var44 = var94.field1080;
								if (var44 > var43) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var43 = var44;
								}

								var28 = var94.field1078;
							}

							var95 = var86.method867();
							if (var95 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var25 = var95.field1084;
								var44 = var95.field1080;
								if (var44 > var43) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var43 = var44;
								}

								var29 = var95.field1078;
							}

							var97 = var86.method868();
							if (null != var97) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var26 = var97.field1084;
								var44 = var97.field1080;
								if (var44 > var43) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var43 = var44;
								}

								var30 = var97.field1078;
							}

							if (var93 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var31 = var93.method866();
								if (null != var31) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var35 = var31.field1084;
									var44 = var31.field1080;
									if (var44 > var43) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var43 = var44;
									}

									var39 = var31.field1078;
								}

								var32 = var93.method863();
								if (null != var32) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var36 = var32.field1084;
									var44 = var32.field1080;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.field1078;
								}

								var33 = var93.method867();
								if (var33 != null) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var37 = var33.field1084;
									var44 = var33.field1080;
									if (var44 > var43) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var43 = var44;
									}

									var41 = var33.field1078;
								}

								var34 = var93.method868();
								if (null != var34) {
									var38 = var34.field1084;
									var44 = var34.field1080;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.field1078;
								}
							}

							class253 var98 = var86.method872();
							if (var98 == null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var98 = class177.field1705;
							}

							class253 var45;
							if (var93 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var45 = var93.method872();
								if (var45 == null) {
									if (var6 == -1) {
										return;
									}

									var45 = class177.field1705;
								}
							} else {
								var45 = class177.field1705;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var86.method870(var0.field1537[var81]);
							int var99 = var98.method1292(var46);
							if (null != var93) {
								if (var6 == -1) {
									return;
								}

								var47 = var93.method870(var0.field1558[var81]);
								var49 = var45.method1292(var47);
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

							var63 = var0.field1556[var81] - Client.field306;
							int var64 = var86.field1423 - var86.field1423 * var63 / var86.field1425;
							int var65 = var63 * var86.field1417 / var86.field1425 + -var86.field1417;
							int var66 = var2 + Client.field121 - (var52 >> 1) + var64;
							int var67 = Client.field122 + var3 - 12 + var65;
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var86.field1427 + var67 + 15;
							int var71 = var70 - var98.field2070;
							int var72 = var70 + var98.field2071;
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

								var73 = var93.field1427 + var67 + 15;
								var74 = var73 - var45.field2070;
								var75 = var73 + var45.field2071;
								if (var74 < var68 && var6 == -1) {
									return;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var86.field1412 >= 0) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var74 = (var63 << 8) / (var86.field1425 - var86.field1412);
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

										var96.method730(var66 + var53 - var27, var67, var74);
									}

									if (var95 != null) {
										if (var6 == -1) {
											return;
										}

										var95.method730(var66 + var54 - var29, var67, var74);
									}

									if (var94 != null) {
										for (var75 = 0; var75 < var50; ++var75) {
											if (var6 == -1) {
												throw new IllegalStateException();
											}

											var94.method730(var75 * var24 + (var55 + var66 - var28), var67, var74);
										}
									}

									if (null != var97) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var97.method730(var66 + var57 - var30, var67, var74);
									}

									var98.method1297(var46, var66 + var56, var70, var86.field1415, 0, var74);
									if (var93 == null) {
										continue;
									}

									if (var6 == -1) {
										throw new IllegalStateException();
									}

									if (null != var31) {
										var31.method730(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.method730(var59 + var66 - var41, var67, var74);
									}

									if (null != var32) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										for (var75 = 0; var75 < var51; ++var75) {
											if (var6 == -1) {
												throw new IllegalStateException();
											}

											var32.method730(var75 * var36 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (null != var34) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var34.method730(var66 + var61 - var42, var67, var74);
									}

									var45.method1297(var47, var62 + var66, var73, var93.field1415, 0, var74);
									continue;
								}
							}

							if (var96 != null) {
								var96.method732(var66 + var53 - var27, var67);
							}

							if (var95 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var95.method732(var66 + var54 - var29, var67);
							}

							if (null != var94) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								for (var75 = 0; var75 < var50; ++var75) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var94.method732(var24 * var75 + (var66 + var55 - var28), var67);
								}
							}

							if (var97 != null) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								var97.method732(var57 + var66 - var30, var67);
							}

							var98.method1320(var46, var66 + var56, var70, var86.field1415 | -16777216, 0);
							if (null != var93) {
								if (var6 == -1) {
									throw new IllegalStateException();
								}

								if (null != var31) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var31.method732(var58 + var66 - var39, var67);
								}

								if (var33 != null) {
									var33.method732(var59 + var66 - var41, var67);
								}

								if (null != var32) {
									if (var6 == -1) {
										return;
									}

									for (var75 = 0; var75 < var51; ++var75) {
										if (var6 == -1) {
											throw new IllegalStateException();
										}

										var32.method732(var66 + var60 - var40 + var75 * var36, var67);
									}
								}

								if (null != var34) {
									if (var6 == -1) {
										throw new IllegalStateException();
									}

									var34.method732(var66 + var61 - var42, var67);
								}

								var45.method1320(var47, var66 + var62, var73, var93.field1415 | -16777216, 0);
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

	static void method1867(class60[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class60 var7 = var0[var6];
			if (null != var7 && var7.field661 == var1) {
				class110.method693(var7, var2, var3, var4);
				class8.method75(var7, var2, var3);
				if (var7.field663 > var7.field731 - var7.field659) {
					var7.field663 = var7.field731 - var7.field659;
				}

				if (var7.field663 < 0) {
					var7.field663 = 0;
				}

				if (var7.field677 > var7.field666 - var7.field636) {
					var7.field677 = var7.field666 - var7.field636;
				}

				if (var7.field677 < 0) {
					var7.field677 = 0;
				}

				if (var7.field646 == 0) {
					class116.method738(var0, var7, var4);
				}
			}
		}

	}
}
