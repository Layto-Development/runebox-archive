public class class368 {
	static final class368 field3099;
	static final class368 field3100;
	final int field3101;

	static {
		field3099 = new class368(0);
		field3100 = new class368(1);
	}

	class368(int var1) {
		this.field3101 = var1;
	}

	public static String method1972(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var9 = var0[var1];
			return var9 == null ? "null" : var9.toString();
		} else {
			int var4 = var2 + var1;
			int var5 = 0;

			for (int var6 = var1; var6 < var4; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}

			StringBuilder var10 = new StringBuilder(var5);

			for (int var11 = var1; var11 < var4; ++var11) {
				CharSequence var8 = var0[var11];
				if (null == var8) {
					var10.append("null");
				} else {
					var10.append(var8);
				}
			}

			return var10.toString();
		}
	}

	public static class114 method1973(int var0) {
		class114 var2 = (class114)class114.field1073.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class114.field1076.method1212(8, var0);
			var2 = new class114();
			if (null != var3) {
				var2.method700(new class42(var3));
			}

			class114.field1073.method1889(var2, (long)var0);
			return var2;
		}
	}

	static class61[] method1971() {
		return new class61[]{class61.field792, class61.field796, class61.field790, class61.field791, class61.field797, class61.field795, class61.field793};
	}

	static final void method1974(boolean var0, class347 var1) {
		Client.field79 = var0;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.field79) {
			int var3 = var1.method327();
			var4 = var1.method307();
			var5 = var1.method327();
			class280.field2501 = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class280.field2501[var6][var7] = var1.method282();
				}
			}

			class520.field4226 = new int[var5];
			class488.field4115 = new int[var5];
			class30.field464 = new int[var5];
			class51.field592 = new byte[var5][];
			class364.field3074 = new byte[var5][];
			var5 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					class520.field4226[var5] = var8;
					class488.field4115[var5] = class286.field2521.method1237("m" + var6 + "_" + var7);
					class30.field464[var5] = class286.field2521.method1237("l" + var6 + "_" + var7);
					++var5;
				}
			}

			class105.method677(var3, var4, true);
		} else {
			boolean var16 = var1.method278() == 1;
			var4 = var1.method327();
			var5 = var1.method327();
			var6 = var1.method327();
			var1.method1905();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method1903(1);
						if (var10 == 1) {
							Client.field80[var7][var8][var9] = var1.method1903(26);
						} else {
							Client.field80[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.method1906();
			class280.field2501 = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					class280.field2501[var7][var8] = var1.method282();
				}
			}

			class520.field4226 = new int[var6];
			class488.field4115 = new int[var6];
			class30.field464 = new int[var6];
			class51.field592 = new byte[var6][];
			class364.field3074 = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = Client.field80[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (class520.field4226[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								class520.field4226[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								class488.field4115[var6] = class286.field2521.method1237("m" + var14 + "_" + var15);
								class30.field464[var6] = class286.field2521.method1237("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			class105.method677(var5, var4, !var16);
		}

	}
}
