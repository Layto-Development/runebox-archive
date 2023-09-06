import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class class475 {
	public static class215 field4032;
	static Iterator field4034;
	int field4033;
	int field4036;
	int[][] field4035;

	public class475(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.field4033 = var1;
			this.field4036 = var2;
			this.field4035 = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.field4035[var7];
				double var9 = 6.0D + (double)var7 / (double)var1;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D);
				}
			}

		}
	}

	byte[] method2295(byte[] var1) {
		if (null != this.field4035) {
			int var3 = (int)((long)this.field4036 * (long)var1.length / (long)this.field4033) + 14;
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;

			int var7;
			for (var7 = 0; var7 < var1.length; ++var7) {
				byte var8 = var1[var7];
				int[] var9 = this.field4035[var6];

				int var10;
				for (var10 = 0; var10 < 14; ++var10) {
					var4[var10 + var5] += var8 * var9[var10];
				}

				var6 += this.field4036;
				var10 = var6 / this.field4033;
				var5 += var10;
				var6 -= var10 * this.field4033;
			}

			var1 = new byte[var3];

			for (var7 = 0; var7 < var3; ++var7) {
				int var11 = 32768 + var4[var7] >> 16;
				if (var11 < -128) {
					var1[var7] = -128;
				} else if (var11 > 127) {
					var1[var7] = 127;
				} else {
					var1[var7] = (byte)var11;
				}
			}
		}

		return var1;
	}

	int method2296(int var1) {
		if (null != this.field4035) {
			var1 = (int)((long)var1 * (long)this.field4036 / (long)this.field4033);
		}

		return var1;
	}

	int method2294(int var1) {
		if (this.field4035 != null) {
			var1 = 6 + (int)((long)var1 * (long)this.field4036 / (long)this.field4033);
		}

		return var1;
	}

	static final class526 method2299(class42 var0, class526 var1) {
		int var3 = var0.method278();
		int var4;
		if (null == var1) {
			var4 = class476.method2304(var3);
			var1 = new class526(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method278() == 1;
			int var6 = var0.method334();
			Object var7;
			if (var5) {
				var7 = new class509(var0.method286());
			} else {
				var7 = new class380(var0.method282());
			}

			var1.method2547((class462)var7, (long)var6);
		}

		return var1;
	}

	static final boolean method2300() {
		return class277.field2457;
	}

	public static boolean method2297(class215 var0, int var1) {
		byte[] var3 = var0.method1219(var1);
		if (null == var3) {
			return false;
		} else {
			class429.method2186(var3);
			return true;
		}
	}

	public static class307 method2301(String var0, String var1, boolean var2) {
		File var4 = new File(class297.field2736, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				class307 var11 = new class307(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (class297.field2741 == 33) {
			var5 = "_rc";
		} else if (class297.field2741 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(class493.field4135, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		class307 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new class307(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new class307(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	static int method2298(int var0, class167 var1, boolean var2) {
		String var4;
		int var10;
		if (var0 == 4100) {
			var4 = class139.field1331[--class429.field3529];
			var10 = class139.field1344[--class203.field1903];
			class139.field1331[++class429.field3529 - 1] = var4 + var10;
			return 1;
		} else {
			String var5;
			if (var0 == 4101) {
				class429.field3529 -= 2;
				var4 = class139.field1331[class429.field3529];
				var5 = class139.field1331[1 + class429.field3529];
				class139.field1331[++class429.field3529 - 1] = var4 + var5;
				return 1;
			} else if (var0 == 4102) {
				var4 = class139.field1331[--class429.field3529];
				var10 = class139.field1344[--class203.field1903];
				class139.field1331[++class429.field3529 - 1] = var4 + class326.method1832(var10, true);
				return 1;
			} else if (var0 == 4103) {
				var4 = class139.field1331[--class429.field3529];
				class139.field1331[++class429.field3529 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var13;
				if (var0 == 4104) {
					var13 = class139.field1344[--class203.field1903];
					long var16 = 86400000L * ((long)var13 + 11745L);
					class139.field1337.setTime(new Date(var16));
					var7 = class139.field1337.get(5);
					int var18 = class139.field1337.get(2);
					int var9 = class139.field1337.get(1);
					class139.field1331[++class429.field3529 - 1] = var7 + "-" + class139.field1338[var18] + "-" + var9;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var13 = class139.field1344[--class203.field1903];
						class139.field1331[++class429.field3529 - 1] = Integer.toString(var13);
						return 1;
					} else if (var0 == 4107) {
						class429.field3529 -= 2;
						class139.field1344[++class203.field1903 - 1] = class210.method1198(class460.method2267(class139.field1331[class429.field3529], class139.field1331[1 + class429.field3529], class395.field3318));
						return 1;
					} else {
						int var12;
						byte[] var15;
						class253 var17;
						if (var0 == 4108) {
							var4 = class139.field1331[--class429.field3529];
							class203.field1903 -= 2;
							var10 = class139.field1344[class203.field1903];
							var12 = class139.field1344[1 + class203.field1903];
							var15 = class287.field2551.method1212(var12, 0);
							var17 = new class253(var15);
							class139.field1344[++class203.field1903 - 1] = var17.method1294(var4, var10);
							return 1;
						} else if (var0 == 4109) {
							var4 = class139.field1331[--class429.field3529];
							class203.field1903 -= 2;
							var10 = class139.field1344[class203.field1903];
							var12 = class139.field1344[1 + class203.field1903];
							var15 = class287.field2551.method1212(var12, 0);
							var17 = new class253(var15);
							class139.field1344[++class203.field1903 - 1] = var17.method1315(var4, var10);
							return 1;
						} else if (var0 == 4110) {
							class429.field3529 -= 2;
							var4 = class139.field1331[class429.field3529];
							var5 = class139.field1331[class429.field3529 + 1];
							if (class139.field1344[--class203.field1903] == 1) {
								class139.field1331[++class429.field3529 - 1] = var4;
							} else {
								class139.field1331[++class429.field3529 - 1] = var5;
							}

							return 1;
						} else if (var0 == 4111) {
							var4 = class139.field1331[--class429.field3529];
							class139.field1331[++class429.field3529 - 1] = class228.method1305(var4);
							return 1;
						} else if (var0 == 4112) {
							var4 = class139.field1331[--class429.field3529];
							var10 = class139.field1344[--class203.field1903];
							class139.field1331[++class429.field3529 - 1] = var4 + (char)var10;
							return 1;
						} else if (var0 == 4113) {
							var13 = class139.field1344[--class203.field1903];
							class139.field1344[++class203.field1903 - 1] = class35.method241((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var13 = class139.field1344[--class203.field1903];
							class139.field1344[++class203.field1903 - 1] = class197.method1076((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var13 = class139.field1344[--class203.field1903];
							class139.field1344[++class203.field1903 - 1] = class518.method2526((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var13 = class139.field1344[--class203.field1903];
							class139.field1344[++class203.field1903 - 1] = class231.method1328((char)var13) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var4 = class139.field1331[--class429.field3529];
							if (null != var4) {
								class139.field1344[++class203.field1903 - 1] = var4.length();
							} else {
								class139.field1344[++class203.field1903 - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var4 = class139.field1331[--class429.field3529];
							class203.field1903 -= 2;
							var10 = class139.field1344[class203.field1903];
							var12 = class139.field1344[1 + class203.field1903];
							class139.field1331[++class429.field3529 - 1] = var4.substring(var10, var12);
							return 1;
						} else if (var0 == 4119) {
							var4 = class139.field1331[--class429.field3529];
							StringBuilder var11 = new StringBuilder(var4.length());
							boolean var14 = false;

							for (var7 = 0; var7 < var4.length(); ++var7) {
								char var8 = var4.charAt(var7);
								if (var8 == '<') {
									var14 = true;
								} else if (var8 == '>') {
									var14 = false;
								} else if (!var14) {
									var11.append(var8);
								}
							}

							class139.field1331[++class429.field3529 - 1] = var11.toString();
							return 1;
						} else if (var0 == 4120) {
							var4 = class139.field1331[--class429.field3529];
							var10 = class139.field1344[--class203.field1903];
							class139.field1344[++class203.field1903 - 1] = var4.indexOf(var10);
							return 1;
						} else if (var0 == 4121) {
							class429.field3529 -= 2;
							var4 = class139.field1331[class429.field3529];
							var5 = class139.field1331[class429.field3529 + 1];
							var12 = class139.field1344[--class203.field1903];
							class139.field1344[++class203.field1903 - 1] = var4.indexOf(var5, var12);
							return 1;
						} else if (var0 == 4122) {
							var4 = class139.field1331[--class429.field3529];
							class139.field1331[++class429.field3529 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class429.field3529 -= 3;
							var4 = class139.field1331[class429.field3529];
							var5 = class139.field1331[1 + class429.field3529];
							String var6 = class139.field1331[class429.field3529 + 2];
							if (null == class82.field863.field2523) {
								class139.field1331[++class429.field3529 - 1] = var6;
								return 1;
							} else {
								switch(class82.field863.field2523.field3056) {
								case 0:
									class139.field1331[++class429.field3529 - 1] = var4;
									break;
								case 1:
									class139.field1331[++class429.field3529 - 1] = var5;
									break;
								case 2:
								default:
									class139.field1331[++class429.field3529 - 1] = var6;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class429.field3529 -= 2;
					var4 = class139.field1331[class429.field3529];
					var5 = class139.field1331[class429.field3529 + 1];
					if (null != class82.field863.field2523 && class82.field863.field2523.field3054 != 0) {
						class139.field1331[++class429.field3529 - 1] = var5;
					} else {
						class139.field1331[++class429.field3529 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}
}
