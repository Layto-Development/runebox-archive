import java.util.HashMap;

public class class66 {
	static int field808;

	static {
		new HashMap();
	}

	class66() throws Throwable {
	}

	static final void method488(int var0, int var1, int var2) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				class38.field511[var0][var4 + var1][var5 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				class38.field511[var0][var1][var2 + var4] = class38.field511[var0][var1 - 1][var4 + var2];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				class38.field511[var0][var1 + var4][var2] = class38.field511[var0][var4 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && class38.field511[var0][var1 - 1][var2] != 0) {
			class38.field511[var0][var1][var2] = class38.field511[var0][var1 - 1][var2];
		} else if (var2 > 0 && class38.field511[var0][var1][var2 - 1] != 0) {
			class38.field511[var0][var1][var2] = class38.field511[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && class38.field511[var0][var1 - 1][var2 - 1] != 0) {
			class38.field511[var0][var1][var2] = class38.field511[var0][var1 - 1][var2 - 1];
		}

	}

	static int method487(int var0, class167 var1, boolean var2, byte var3) {
		if (var0 == 3300) {
			if (var3 != -1) {
				throw new IllegalStateException();
			} else {
				class139.field1344[++class203.field1903 - 1] = Client.field306;
				return 1;
			}
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					class203.field1903 -= 2;
					var4 = class139.field1344[class203.field1903];
					var5 = class139.field1344[class203.field1903 + 1];
					class139.field1344[++class203.field1903 - 1] = class100.method649(var4, var5);
					return 1;
				}
			} else if (var0 == 3302) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					class203.field1903 -= 2;
					var4 = class139.field1344[class203.field1903];
					var5 = class139.field1344[1 + class203.field1903];
					class139.field1344[++class203.field1903 - 1] = class165.method914(var4, var5);
					return 1;
				}
			} else if (var0 == 3303) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					class203.field1903 -= 2;
					var4 = class139.field1344[class203.field1903];
					var5 = class139.field1344[class203.field1903 + 1];
					class139.field1344[++class203.field1903 - 1] = class411.method2122(var4, var5);
					return 1;
				}
			} else if (var0 == 3304) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class139.field1344[--class203.field1903];
					class139.field1344[++class203.field1903 - 1] = class215.method1241(var4).field809;
					return 1;
				}
			} else if (var0 == 3305) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class139.field1344[--class203.field1903];
					class139.field1344[++class203.field1903 - 1] = Client.field147[var4];
					return 1;
				}
			} else if (var0 == 3306) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class139.field1344[--class203.field1903];
					class139.field1344[++class203.field1903 - 1] = Client.field295[var4];
					return 1;
				}
			} else if (var0 == 3307) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class139.field1344[--class203.field1903];
					class139.field1344[++class203.field1903 - 1] = Client.field298[var4];
					return 1;
				}
			} else {
				int var6;
				if (var0 == 3308) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class358.field3038;
						var5 = class296.field2735 + (class82.field863.field1555 >> 7);
						var6 = (class82.field863.field1526 >> 7) + class164.field1606;
						class139.field1344[++class203.field1903 - 1] = var6 + (var4 << 28) + (var5 << 14);
						return 1;
					}
				} else if (var0 == 3309) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = var4 >> 14 & 16383;
						return 1;
					}
				} else if (var0 == 3310) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = var4 >> 28;
						return 1;
					}
				} else if (var0 == 3311) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = var4 & 16383;
						return 1;
					}
				} else if (var0 == 3312) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						int[] var10000 = class139.field1344;
						int var10001 = ++class203.field1903 - 1;
						byte var10002;
						if (Client.field30) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							var10002 = 1;
						} else {
							var10002 = 0;
						}

						var10000[var10001] = var10002;
						return 1;
					}
				} else if (var0 == 3313) {
					class203.field1903 -= 2;
					var4 = class139.field1344[class203.field1903] + 32768;
					var5 = class139.field1344[class203.field1903 + 1];
					class139.field1344[++class203.field1903 - 1] = class100.method649(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class203.field1903 -= 2;
						var4 = class139.field1344[class203.field1903] + 32768;
						var5 = class139.field1344[1 + class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class165.method914(var4, var5);
						return 1;
					}
				} else if (var0 == 3315) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class203.field1903 -= 2;
						var4 = class139.field1344[class203.field1903] + 32768;
						var5 = class139.field1344[1 + class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class411.method2122(var4, var5);
						return 1;
					}
				} else if (var0 == 3316) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						if (Client.field91 >= 2) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							class139.field1344[++class203.field1903 - 1] = Client.field91;
						} else {
							class139.field1344[++class203.field1903 - 1] = 0;
						}

						return 1;
					}
				} else if (var0 == 3317) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class139.field1344[++class203.field1903 - 1] = Client.field23;
						return 1;
					}
				} else if (var0 == 3318) {
					class139.field1344[++class203.field1903 - 1] = Client.field3;
					return 1;
				} else if (var0 == 3321) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class139.field1344[++class203.field1903 - 1] = Client.field120 / 100;
						return 1;
					}
				} else if (var0 == 3322) {
					class139.field1344[++class203.field1903 - 1] = Client.field290;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field299) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}

						class139.field1344[++class203.field1903 - 1] = 1;
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class139.field1344[++class203.field1903 - 1] = Client.field4;
						return 1;
					}
				} else if (var0 == 3325) {
					class203.field1903 -= 4;
					var4 = class139.field1344[class203.field1903];
					var5 = class139.field1344[class203.field1903 + 1];
					var6 = class139.field1344[2 + class203.field1903];
					int var7 = class139.field1344[3 + class203.field1903];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					class139.field1344[++class203.field1903 - 1] = var4;
					return 1;
				} else if (var0 == 3326) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class139.field1344[++class203.field1903 - 1] = Client.field19;
						return 1;
					}
				} else if (var0 == 3327) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class139.field1344[++class203.field1903 - 1] = Client.field20;
						return 1;
					}
				} else if (var0 == 3331) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class139.field1344[++class203.field1903 - 1] = Client.field120;
						return 1;
					}
				} else {
					return 2;
				}
			}
		}
	}
}
