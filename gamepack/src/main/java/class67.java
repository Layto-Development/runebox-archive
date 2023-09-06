public class class67 extends class218 {
	static class344 field810;
	public int field809;

	static {
		field810 = new class344(64);
	}

	class67() {
		this.field809 = 0;
	}

	void method489(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method490(var1, var3);
		}
	}

	void method490(class42 var1, int var2) {
		if (var2 == 2) {
			this.field809 = var1.method327();
		}

	}

	public static int method495(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}

		return var3;
	}

	public static int method493(int var0, int var1, int var2) {
		int var4 = class443.method2222(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	public static int method491(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	public static class210 method492(int var0) {
		class210 var2 = (class210)class210.field1935.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class389.field3271.method1212(10, var0);
			var2 = new class210();
			var2.field1938 = var0;
			if (null != var3) {
				var2.method1184(new class42(var3));
			}

			var2.method1196();
			if (var2.field1945 != -1) {
				var2.method1181(method492(var2.field1945), method492(var2.field1972));
			}

			if (var2.field1966 != -1) {
				var2.method1195(method492(var2.field1966), method492(var2.field1958));
			}

			if (var2.field1985 != -1) {
				var2.method1183(method492(var2.field1985), method492(var2.field1944));
			}

			if (!class210.field1934 && var2.field1942) {
				if (var2.field1945 == -1 && var2.field1966 == -1 && var2.field1985 == -1) {
					var2.field1954 = var2.field1954 + class433.field3769;
				}

				var2.field1982 = false;

				int var4;
				for (var4 = 0; var4 < var2.field1955.length; ++var4) {
					var2.field1955[var4] = null;
				}

				for (var4 = 0; var4 < var2.field1956.length; ++var4) {
					if (var4 != 4) {
						var2.field1956[var4] = null;
					}
				}

				var2.field1957 = -2;
				var2.field1979 = 0;
				if (null != var2.field1981) {
					boolean var7 = false;

					for (class462 var5 = var2.field1981.method2545(); var5 != null; var5 = var2.field1981.method2546()) {
						class425 var6 = class30.method216((int)var5.field3987);
						if (var6.field3517) {
							var5.method2269();
						} else {
							var7 = true;
						}
					}

					if (!var7) {
						var2.field1981 = null;
					}
				}
			}

			class210.field1935.method1889(var2, (long)var0);
			return var2;
		}
	}

	static void method494() {
		if (Client.field95) {
			class60 var1 = class203.method1149(class292.field2723, Client.field171);
			if (null != var1 && var1.field739 != null) {
				class309 var2 = new class309();
				var2.field2791 = var1;
				var2.field2794 = var1.field739;
				class186.method1031(var2);
			}

			Client.field137 = -1;
			Client.field95 = false;
			class185.method1024(var1);
		}
	}
}
