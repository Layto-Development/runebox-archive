import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uf")
public class class273 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1742384459)
	static int field2226;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1418530649)
	static int field2227;
	@ObfInfo(name = "at", desc = "[I")
	static int[] field2225;

	@ObfInfo(name = "<init>", desc = "()V")
	class273() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Lnu;III)[Luk;")
	public static class398[] method1427(class437 var0, int var1, int var2) {
		return !method1429(var0, var1, var2) ? null : method1428();
	}

	@ObfInfo(name = "ae", desc = "(Lnu;IIB)[Lui;")
	public static class150[] method1438(class437 var0, int var1, int var2) {
		return !method1429(var0, var1, var2) ? null : method1437();
	}

	@ObfInfo(name = "at", desc = "(Lnu;Lnu;IIB)Lpi;")
	public static class258 method1436(class437 var0, class437 var1, int var2, int var3) {
		return !method1429(var0, var2, var3) ? null : method1434(var1.method2267(var2, var3));
	}

	@ObfInfo(name = "ac", desc = "(Lnu;Ljava/lang/String;Ljava/lang/String;B)[Luk;")
	public static class398[] method1435(class437 var0, String var1, String var2) {
		if (!var0.method2289(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method2292(var1);
			int var5 = var0.method2284(var4, var2);
			return method1427(var0, var4, var5);
		}
	}

	@ObfInfo(name = "ai", desc = "(Lnu;Ljava/lang/String;Ljava/lang/String;I)Luk;")
	public static class398 method1433(class437 var0, String var1, String var2) {
		if (!var0.method2289(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method2292(var1);
			int var5 = var0.method2284(var4, var2);
			class398 var6;
			if (!method1429(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = method1439();
			}

			return var6;
		}
	}

	@ObfInfo(name = "az", desc = "(Lnu;Ljava/lang/String;Ljava/lang/String;I)[Lui;")
	public static class150[] method1426(class437 var0, String var1, String var2) {
		if (!var0.method2289(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method2292(var1);
			int var5 = var0.method2284(var4, var2);
			return method1438(var0, var4, var5);
		}
	}

	@ObfInfo(name = "ap", desc = "(I)[Luk;")
	static class398[] method1428() {
		class398[] var1 = new class398[field2226];

		for (int var2 = 0; var2 < field2226; ++var2) {
			class398 var3 = var1[var2] = new class398();
			var3.field3104 = field2227;
			var3.field3109 = class118.field1123;
			var3.field3103 = field2225[var2];
			var3.field3108 = class136.field1380[var2];
			var3.field3105 = class209.field1872[var2];
			var3.field3106 = class356.field2808[var2];
			var3.field3110 = class96.field965;
			var3.field3107 = class50.field584[var2];
		}

		field2225 = null;
		class136.field1380 = null;
		class209.field1872 = null;
		class356.field2808 = null;
		class96.field965 = null;
		class50.field584 = (byte[][])null;
		return var1;
	}

	@ObfInfo(name = "aa", desc = "(B)Luk;")
	public static class398 method1439() {
		class398 var1 = new class398();
		var1.field3104 = field2227;
		var1.field3109 = class118.field1123;
		var1.field3103 = field2225[0];
		var1.field3108 = class136.field1380[0];
		var1.field3105 = class209.field1872[0];
		var1.field3106 = class356.field2808[0];
		var1.field3110 = class96.field965;
		var1.field3107 = class50.field584[0];
		field2225 = null;
		class136.field1380 = null;
		class209.field1872 = null;
		class356.field2808 = null;
		class96.field965 = null;
		class50.field584 = (byte[][])null;
		return var1;
	}

	@ObfInfo(name = "af", desc = "(B)[Lui;")
	static class150[] method1437() {
		class150[] var1 = new class150[field2226];

		for (int var2 = 0; var2 < field2226; ++var2) {
			class150 var3 = var1[var2] = new class150();
			var3.field1461 = field2227;
			var3.field1462 = class118.field1123;
			var3.field1458 = field2225[var2];
			var3.field1459 = class136.field1380[var2];
			var3.field1464 = class209.field1872[var2];
			var3.field1460 = class356.field2808[var2];
			int var4 = var3.field1464 * var3.field1460;
			byte[] var5 = class50.field584[var2];
			var3.field1463 = new int[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var3.field1463[var6] = class96.field965[var5[var6] & 255];
			}
		}

		field2225 = null;
		class136.field1380 = null;
		class209.field1872 = null;
		class356.field2808 = null;
		class96.field965 = null;
		class50.field584 = (byte[][])null;
		return var1;
	}

	@ObfInfo(name = "ad", desc = "(B)Lui;")
	static class150 method1431() {
		class150 var1 = new class150();
		var1.field1461 = field2227;
		var1.field1462 = class118.field1123;
		var1.field1458 = field2225[0];
		var1.field1459 = class136.field1380[0];
		var1.field1464 = class209.field1872[0];
		var1.field1460 = class356.field2808[0];
		int var2 = var1.field1460 * var1.field1464;
		byte[] var3 = class50.field584[0];
		var1.field1463 = new int[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var1.field1463[var4] = class96.field965[var3[var4] & 255];
		}

		field2225 = null;
		class136.field1380 = null;
		class209.field1872 = null;
		class356.field2808 = null;
		class96.field965 = null;
		class50.field584 = (byte[][])null;
		return var1;
	}

	@ObfInfo(name = "aq", desc = "([BI)Lpi;")
	static class258 method1434(byte[] var0) {
		if (null == var0) {
			return null;
		} else {
			class258 var2 = new class258(var0, field2225, class136.field1380, class209.field1872, class356.field2808, class96.field965, class50.field584);
			field2225 = null;
			class136.field1380 = null;
			class209.field1872 = null;
			class356.field2808 = null;
			class96.field965 = null;
			class50.field584 = (byte[][])null;
			return var2;
		}
	}

	@ObfInfo(name = "al", desc = "(Lnu;IIB)Z")
	static boolean method1429(class437 var0, int var1, int var2) {
		byte[] var4 = var0.method2267(var1, var2);
		if (null == var4) {
			return false;
		} else {
			method1432(var4);
			return true;
		}
	}

	@ObfInfo(name = "an", desc = "(Lnu;IB)Z")
	public static boolean method1430(class437 var0, int var1) {
		byte[] var3 = var0.method2274(var1);
		if (null == var3) {
			return false;
		} else {
			method1432(var3);
			return true;
		}
	}

	@ObfInfo(name = "ar", desc = "([BI)V")
	static void method1432(byte[] var0) {
		class280 var2 = new class280(var0);
		var2.field2254 = var0.length - 2;
		field2226 = var2.method1541();
		field2225 = new int[field2226];
		class136.field1380 = new int[field2226];
		class209.field1872 = new int[field2226];
		class356.field2808 = new int[field2226];
		class50.field584 = new byte[field2226][];
		var2.field2254 = var0.length - 7 - field2226 * 8;
		field2227 = var2.method1541();
		class118.field1123 = var2.method1541();
		int var3 = (var2.method1492() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < field2226; ++var4) {
			field2225[var4] = var2.method1541();
		}

		for (var4 = 0; var4 < field2226; ++var4) {
			class136.field1380[var4] = var2.method1541();
		}

		for (var4 = 0; var4 < field2226; ++var4) {
			class209.field1872[var4] = var2.method1541();
		}

		for (var4 = 0; var4 < field2226; ++var4) {
			class356.field2808[var4] = var2.method1541();
		}

		var2.field2254 = var0.length - 7 - field2226 * 8 - (var3 - 1) * 3;
		class96.field965 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			class96.field965[var4] = var2.method1548();
			if (class96.field965[var4] == 0) {
				class96.field965[var4] = 1;
			}
		}

		var2.field2254 = 0;

		for (var4 = 0; var4 < field2226; ++var4) {
			int var5 = class209.field1872[var4];
			int var6 = class356.field2808[var4];
			int var7 = var5 * var6;
			byte[] var8 = new byte[var7];
			class50.field584[var4] = var8;
			int var9 = var2.method1492();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method1493();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var10 + var5 * var11] = var2.method1493();
					}
				}
			}
		}

	}
}
