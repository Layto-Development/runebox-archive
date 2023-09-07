public class class494 {

	static int field3985;

	static int field3986;

	static int[] field3984;

	class494() throws Throwable {
	}

	public static class214[] method2359(class338 var0, int var1, int var2) {
		return !method2361(var0, var1, var2) ? null : method2360();
	}

	public static class84[] method2370(class338 var0, int var1, int var2) {
		return !method2361(var0, var1, var2) ? null : method2369();
	}

	public static class61 method2368(class338 var0, class338 var1, int var2, int var3) {
		return !method2361(var0, var2, var3) ? null : method2366(var1.method1762(var2, var3));
	}

	public static class214[] method2367(class338 var0, String var1, String var2) {
		if (!var0.method1784(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method1787(var1);
			int var5 = var0.method1779(var4, var2);
			return method2359(var0, var4, var5);
		}
	}

	public static class214 method2365(class338 var0, String var1, String var2) {
		if (!var0.method1784(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method1787(var1);
			int var5 = var0.method1779(var4, var2);
			class214 var6;
			if (!method2361(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = method2371();
			}
			return var6;
		}
	}

	public static class84[] method2358(class338 var0, String var1, String var2) {
		if (!var0.method1784(var1, var2)) {
			return null;
		} else {
			int var4 = var0.method1787(var1);
			int var5 = var0.method1779(var4, var2);
			return method2370(var0, var4, var5);
		}
	}

	static class214[] method2360() {
		class214[] var1 = new class214[field3985];
		for (int var2 = 0; var2 < field3985; ++var2) {
			class214 var3 = var1[var2] = new class214();
			var3.field1939 = field3986;
			var3.field1944 = class203.field1892;
			var3.field1938 = field3984[var2];
			var3.field1943 = class43.field204[var2];
			var3.field1940 = class123.field1451[var2];
			var3.field1941 = class427.field3346[var2];
			var3.field1945 = class251.field2124;
			var3.field1942 = class402.field3177[var2];
		}
		field3984 = null;
		class43.field204 = null;
		class123.field1451 = null;
		class427.field3346 = null;
		class251.field2124 = null;
		class402.field3177 = (byte[][]) null;
		return var1;
	}

	public static class214 method2371() {
		class214 var1 = new class214();
		var1.field1939 = field3986;
		var1.field1944 = class203.field1892;
		var1.field1938 = field3984[0];
		var1.field1943 = class43.field204[0];
		var1.field1940 = class123.field1451[0];
		var1.field1941 = class427.field3346[0];
		var1.field1945 = class251.field2124;
		var1.field1942 = class402.field3177[0];
		field3984 = null;
		class43.field204 = null;
		class123.field1451 = null;
		class427.field3346 = null;
		class251.field2124 = null;
		class402.field3177 = (byte[][]) null;
		return var1;
	}

	static class84[] method2369() {
		class84[] var1 = new class84[field3985];
		for (int var2 = 0; var2 < field3985; ++var2) {
			class84 var3 = var1[var2] = new class84();
			var3.field845 = field3986;
			var3.field846 = class203.field1892;
			var3.field842 = field3984[var2];
			var3.field843 = class43.field204[var2];
			var3.field848 = class123.field1451[var2];
			var3.field844 = class427.field3346[var2];
			int var4 = var3.field848 * var3.field844;
			byte[] var5 = class402.field3177[var2];
			var3.field847 = new int[var4];
			for (int var6 = 0; var6 < var4; ++var6) {
				var3.field847[var6] = class251.field2124[var5[var6] & 255];
			}
		}
		field3984 = null;
		class43.field204 = null;
		class123.field1451 = null;
		class427.field3346 = null;
		class251.field2124 = null;
		class402.field3177 = (byte[][]) null;
		return var1;
	}

	static class84 method2363() {
		class84 var1 = new class84();
		var1.field845 = field3986;
		var1.field846 = class203.field1892;
		var1.field842 = field3984[0];
		var1.field843 = class43.field204[0];
		var1.field848 = class123.field1451[0];
		var1.field844 = class427.field3346[0];
		int var2 = var1.field844 * var1.field848;
		byte[] var3 = class402.field3177[0];
		var1.field847 = new int[var2];
		for (int var4 = 0; var4 < var2; ++var4) {
			var1.field847[var4] = class251.field2124[var3[var4] & 255];
		}
		field3984 = null;
		class43.field204 = null;
		class123.field1451 = null;
		class427.field3346 = null;
		class251.field2124 = null;
		class402.field3177 = (byte[][]) null;
		return var1;
	}

	static class61 method2366(byte[] var0) {
		if (null == var0) {
			return null;
		} else {
			class61 var2 = new class61(var0, field3984, class43.field204, class123.field1451, class427.field3346, class251.field2124, class402.field3177);
			field3984 = null;
			class43.field204 = null;
			class123.field1451 = null;
			class427.field3346 = null;
			class251.field2124 = null;
			class402.field3177 = (byte[][]) null;
			return var2;
		}
	}

	static boolean method2361(class338 var0, int var1, int var2) {
		byte[] var4 = var0.method1762(var1, var2);
		if (null == var4) {
			return false;
		} else {
			method2364(var4);
			return true;
		}
	}

	public static boolean method2362(class338 var0, int var1) {
		byte[] var3 = var0.method1769(var1);
		if (null == var3) {
			return false;
		} else {
			method2364(var3);
			return true;
		}
	}

	static void method2364(byte[] var0) {
		class187 var2 = new class187(var0);
		var2.field1832 = var0.length - 2;
		field3985 = var2.method1145();
		field3984 = new int[field3985];
		class43.field204 = new int[field3985];
		class123.field1451 = new int[field3985];
		class427.field3346 = new int[field3985];
		class402.field3177 = new byte[field3985][];
		var2.field1832 = var0.length - 7 - field3985 * 8;
		field3986 = var2.method1145();
		class203.field1892 = var2.method1145();
		int var3 = (var2.method1096() & 255) + 1;
		int var4;
		for (var4 = 0; var4 < field3985; ++var4) {
			field3984[var4] = var2.method1145();
		}
		for (var4 = 0; var4 < field3985; ++var4) {
			class43.field204[var4] = var2.method1145();
		}
		for (var4 = 0; var4 < field3985; ++var4) {
			class123.field1451[var4] = var2.method1145();
		}
		for (var4 = 0; var4 < field3985; ++var4) {
			class427.field3346[var4] = var2.method1145();
		}
		var2.field1832 = var0.length - 7 - field3985 * 8 - (var3 - 1) * 3;
		class251.field2124 = new int[var3];
		for (var4 = 1; var4 < var3; ++var4) {
			class251.field2124[var4] = var2.method1152();
			if (class251.field2124[var4] == 0) {
				class251.field2124[var4] = 1;
			}
		}
		var2.field1832 = 0;
		for (var4 = 0; var4 < field3985; ++var4) {
			int var5 = class123.field1451[var4];
			int var6 = class427.field3346[var4];
			int var7 = var5 * var6;
			byte[] var8 = new byte[var7];
			class402.field3177[var4] = var8;
			int var9 = var2.method1096();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method1097();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var10 + var5 * var11] = var2.method1097();
					}
				}
			}
		}
	}
}
