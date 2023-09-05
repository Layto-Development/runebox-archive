import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "ok")
public class class216 {
	@ObfInfo(name = "wr", desc = "I", intMultiplier = 1975263355)
	static int field1931;

	static {
		new HashMap();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class216() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "([Lob;II)Lob;")
	public static class425 method1198(class425[] var0, int var1) {
		class425[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class425 var5 = var3[var4];
			if (var1 == var5.method2222()) {
				return var5;
			}
		}

		return null;
	}

	@ObfInfo(name = "bh", desc = "(ILdh;ZB)I")
	static int method1197(int var0, class333 var1, boolean var2, byte var3) {
		if (var0 == 3300) {
			if (var3 != -1) {
				throw new IllegalStateException();
			} else {
				class175.field1621[++class293.field2375 - 1] = Client.field330;
				return 1;
			}
		} else {
			int var4;
			int var5;
			if (var0 == 3301) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					class293.field2375 -= 2;
					var4 = class175.field1621[class293.field2375];
					var5 = class175.field1621[class293.field2375 + 1];
					class175.field1621[++class293.field2375 - 1] = class23.method341(var4, var5);
					return 1;
				}
			} else if (var0 == 3302) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					class293.field2375 -= 2;
					var4 = class175.field1621[class293.field2375];
					var5 = class175.field1621[1 + class293.field2375];
					class175.field1621[++class293.field2375 - 1] = class23.method340(var4, var5);
					return 1;
				}
			} else if (var0 == 3303) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					class293.field2375 -= 2;
					var4 = class175.field1621[class293.field2375];
					var5 = class175.field1621[class293.field2375 + 1];
					class175.field1621[++class293.field2375 - 1] = class23.method342(var4, var5);
					return 1;
				}
			} else if (var0 == 3304) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class175.field1621[--class293.field2375];
					class175.field1621[++class293.field2375 - 1] = class446.method2349(var4).field3382;
					return 1;
				}
			} else if (var0 == 3305) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class175.field1621[--class293.field2375];
					class175.field1621[++class293.field2375 - 1] = Client.field171[var4];
					return 1;
				}
			} else if (var0 == 3306) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class175.field1621[--class293.field2375];
					class175.field1621[++class293.field2375 - 1] = Client.field319[var4];
					return 1;
				}
			} else if (var0 == 3307) {
				if (var3 != -1) {
					throw new IllegalStateException();
				} else {
					var4 = class175.field1621[--class293.field2375];
					class175.field1621[++class293.field2375 - 1] = Client.field322[var4];
					return 1;
				}
			} else {
				int var6;
				if (var0 == 3308) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class401.field3120;
						var5 = class265.field2147 + (class126.field1164.field1061 >> 7);
						var6 = (class126.field1164.field1032 >> 7) + class508.field4092;
						class175.field1621[++class293.field2375 - 1] = var6 + (var4 << 28) + (var5 << 14);
						return 1;
					}
				} else if (var0 == 3309) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class175.field1621[--class293.field2375];
						class175.field1621[++class293.field2375 - 1] = var4 >> 14 & 16383;
						return 1;
					}
				} else if (var0 == 3310) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class175.field1621[--class293.field2375];
						class175.field1621[++class293.field2375 - 1] = var4 >> 28;
						return 1;
					}
				} else if (var0 == 3311) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						var4 = class175.field1621[--class293.field2375];
						class175.field1621[++class293.field2375 - 1] = var4 & 16383;
						return 1;
					}
				} else if (var0 == 3312) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						int[] var10000 = class175.field1621;
						int var10001 = ++class293.field2375 - 1;
						byte var10002;
						if (Client.field54) {
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
					class293.field2375 -= 2;
					var4 = class175.field1621[class293.field2375] + 32768;
					var5 = class175.field1621[class293.field2375 + 1];
					class175.field1621[++class293.field2375 - 1] = class23.method341(var4, var5);
					return 1;
				} else if (var0 == 3314) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class293.field2375 -= 2;
						var4 = class175.field1621[class293.field2375] + 32768;
						var5 = class175.field1621[1 + class293.field2375];
						class175.field1621[++class293.field2375 - 1] = class23.method340(var4, var5);
						return 1;
					}
				} else if (var0 == 3315) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class293.field2375 -= 2;
						var4 = class175.field1621[class293.field2375] + 32768;
						var5 = class175.field1621[1 + class293.field2375];
						class175.field1621[++class293.field2375 - 1] = class23.method342(var4, var5);
						return 1;
					}
				} else if (var0 == 3316) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						if (Client.field115 >= 2) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							class175.field1621[++class293.field2375 - 1] = Client.field115;
						} else {
							class175.field1621[++class293.field2375 - 1] = 0;
						}

						return 1;
					}
				} else if (var0 == 3317) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class175.field1621[++class293.field2375 - 1] = Client.field47;
						return 1;
					}
				} else if (var0 == 3318) {
					class175.field1621[++class293.field2375 - 1] = Client.field27;
					return 1;
				} else if (var0 == 3321) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class175.field1621[++class293.field2375 - 1] = Client.field144 / 100;
						return 1;
					}
				} else if (var0 == 3322) {
					class175.field1621[++class293.field2375 - 1] = Client.field314;
					return 1;
				} else if (var0 == 3323) {
					if (Client.field323) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}

						class175.field1621[++class293.field2375 - 1] = 1;
					} else {
						class175.field1621[++class293.field2375 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class175.field1621[++class293.field2375 - 1] = Client.field28;
						return 1;
					}
				} else if (var0 == 3325) {
					class293.field2375 -= 4;
					var4 = class175.field1621[class293.field2375];
					var5 = class175.field1621[class293.field2375 + 1];
					var6 = class175.field1621[2 + class293.field2375];
					int var7 = class175.field1621[3 + class293.field2375];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					class175.field1621[++class293.field2375 - 1] = var4;
					return 1;
				} else if (var0 == 3326) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class175.field1621[++class293.field2375 - 1] = Client.field43;
						return 1;
					}
				} else if (var0 == 3327) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class175.field1621[++class293.field2375 - 1] = Client.field44;
						return 1;
					}
				} else if (var0 == 3331) {
					if (var3 != -1) {
						throw new IllegalStateException();
					} else {
						class175.field1621[++class293.field2375 - 1] = Client.field144;
						return 1;
					}
				} else {
					return 2;
				}
			}
		}
	}
}
