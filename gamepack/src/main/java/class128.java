import java.util.concurrent.Callable;

class class128 implements Callable {
	static int field1175;
	// $FF: synthetic field
	final class42 val$p;
	// $FF: synthetic field
	final class429 this$0;
	// $FF: synthetic field
	final int val$version;

	class128(class429 var1, class42 var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method2181(this.val$p, this.val$version);
		return null;
	}

	static long method770(CharSequence var0) {
		long var2 = 0L;
		int var4 = var0.length();

		for (int var5 = 0; var5 < var4; ++var5) {
			var2 *= 37L;
			char var6 = var0.charAt(var5);
			if (var6 >= 'A' && var6 <= 'Z') {
				var2 += (long)(var6 + 1 - 65);
			} else if (var6 >= 'a' && var6 <= 'z') {
				var2 += (long)(var6 + 1 - 97);
			} else if (var6 >= '0' && var6 <= '9') {
				var2 += (long)(var6 + 27 - 48);
			}

			if (var2 >= 177917621779460413L) {
				break;
			}
		}

		while (var2 % 37L == 0L && var2 != 0L) {
			var2 /= 37L;
		}

		return var2;
	}

	static final void method771(int var0, int var1, int var2, int var3) {
		if (Client.field168 == 0 && !Client.field95) {
			class465.method2277(class433.field3709, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = class277.field2460;
			if (var9 >= var11) {
				if (var5 != -1L) {
					var9 = (int)(var5 >>> 0 & 127L);
					var11 = (int)(var5 >>> 7 & 127L);
					class287 var13 = Client.field176[Client.field142];
					class469.method2286(var13, Client.field142, var9, var11);
				}

				return;
			}

			long var12 = class498.method2416(var9);
			if (var7 != var12) {
				label306: {
					var7 = var12;
					int var14 = class139.method836(var9);
					int var15 = class337.method1868(var9);
					int var16 = class5.method52(class277.field2462[var9]);
					int var18 = class67.method491(class277.field2462[var9]);
					int var19 = var18;
					int var23;
					if (var16 == 2 && class415.field3487.method1772(class358.field3038, var14, var15, var12) >= 0) {
						class235 var20 = class96.method638(var18, (byte)-22);
						if (var20.field2147 != null) {
							var20 = var20.method1350();
						}

						if (var20 == null) {
							break label306;
						}

						class353 var21 = null;

						for (class353 var22 = (class353)Client.field144.method563(); null != var22; var22 = (class353)Client.field144.method565()) {
							if (class358.field3038 == var22.field3028 && var22.field3021 == var14 && var22.field3027 == var15 && var22.field3020 == var19) {
								var21 = var22;
								break;
							}
						}

						if (Client.field168 == 1) {
							class465.method2277(class433.field3704, Client.field169 + " " + class278.field2468 + " " + class394.method2064(65535) + var20.field2116, 1, var19, var14, var15);
						} else if (Client.field95) {
							if ((class306.field2773 & 4) == 4) {
								class465.method2277(Client.field186, Client.field197 + " " + class278.field2468 + " " + class394.method2064(65535) + var20.field2116, 2, var19, var14, var15);
							}
						} else {
							String[] var30 = var20.field2125;
							if (null != var30) {
								for (var23 = 4; var23 >= 0; --var23) {
									if ((var21 == null || var21.method1924(var23)) && null != var30[var23]) {
										short var24 = 0;
										if (var23 == 0) {
											var24 = 3;
										}

										if (var23 == 1) {
											var24 = 4;
										}

										if (var23 == 2) {
											var24 = 5;
										}

										if (var23 == 3) {
											var24 = 6;
										}

										if (var23 == 4) {
											var24 = 1001;
										}

										class465.method2277(var30[var23], class394.method2064(65535) + var20.field2116, var24, var19, var14, var15);
									}
								}
							}

							class465.method2277(class433.field3705, class394.method2064(65535) + var20.field2116, 1002, var20.field2113, var14, var15);
						}
					}

					int var29;
					class102 var31;
					int[] var32;
					class287 var36;
					if (var16 == 1) {
						class102 var26 = Client.field63[var19];
						if (var26 == null) {
							break label306;
						}

						if (var26.field1018.field3150 == 1 && (var26.field1555 & 127) == 64 && (var26.field1526 & 127) == 64) {
							for (var29 = 0; var29 < Client.field64; ++var29) {
								var31 = Client.field63[Client.field2[var29]];
								if (null != var31 && var26 != var31 && var31.field1018.field3150 == 1 && var26.field1555 == var31.field1555 && var31.field1526 == var26.field1526) {
									class414.method2134(var31, Client.field2[var29], var14, var15);
								}
							}

							var29 = class481.field4085;
							var32 = class481.field4086;

							for (var23 = 0; var23 < var29; ++var23) {
								var36 = Client.field176[var32[var23]];
								if (var36 != null && var26.field1555 == var36.field1555 && var36.field1526 == var26.field1526) {
									class469.method2286(var36, var32[var23], var14, var15);
								}
							}
						}

						class414.method2134(var26, var19, var14, var15);
					}

					if (var16 == 0) {
						class287 var27 = Client.field176[var19];
						if (var27 == null) {
							break label306;
						}

						if ((var27.field1555 & 127) == 64 && (var27.field1526 & 127) == 64) {
							for (var29 = 0; var29 < Client.field64; ++var29) {
								var31 = Client.field63[Client.field2[var29]];
								if (null != var31 && var31.field1018.field3150 == 1 && var31.field1555 == var27.field1555 && var31.field1526 == var27.field1526) {
									class414.method2134(var31, Client.field2[var29], var14, var15);
								}
							}

							var29 = class481.field4085;
							var32 = class481.field4086;

							for (var23 = 0; var23 < var29; ++var23) {
								var36 = Client.field176[var32[var23]];
								if (var36 != null && var27 != var36 && var27.field1555 == var36.field1555 && var36.field1526 == var27.field1526) {
									class469.method2286(var36, var32[var23], var14, var15);
								}
							}
						}

						if (Client.field142 != var19) {
							class469.method2286(var27, var19, var14, var15);
						} else {
							var5 = var12;
						}
					}

					if (var16 == 3) {
						class86 var28 = Client.field143[class358.field3038][var14][var15];
						if (null != var28) {
							for (class13 var33 = (class13)var28.method564(); null != var33; var33 = (class13)var28.method569()) {
								class210 var34 = class67.method492(var33.field376);
								if (Client.field168 == 1) {
									class465.method2277(class433.field3704, Client.field169 + " " + class278.field2468 + " " + class394.method2064(16748608) + var34.field1954, 16, var33.field376, var14, var15);
								} else if (Client.field95) {
									if ((class306.field2773 & 1) == 1) {
										class465.method2277(Client.field186, Client.field197 + " " + class278.field2468 + " " + class394.method2064(16748608) + var34.field1954, 17, var33.field376, var14, var15);
									}
								} else {
									String[] var35 = var34.field1955;

									for (int var37 = 4; var37 >= 0; --var37) {
										if (var33.method120(var37)) {
											if (var35 != null && var35[var37] != null) {
												byte var25 = 0;
												if (var37 == 0) {
													var25 = 18;
												}

												if (var37 == 1) {
													var25 = 19;
												}

												if (var37 == 2) {
													var25 = 20;
												}

												if (var37 == 3) {
													var25 = 21;
												}

												if (var37 == 4) {
													var25 = 22;
												}

												class465.method2277(var35[var37], class394.method2064(16748608) + var34.field1954, var25, var33.field376, var14, var15);
											} else if (var37 == 2) {
												class465.method2277(class433.field3703, class394.method2064(16748608) + var34.field1954, 20, var33.field376, var14, var15);
											}
										}
									}

									class465.method2277(class433.field3705, class394.method2064(16748608) + var34.field1954, 1004, var33.field376, var14, var15);
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}
}
