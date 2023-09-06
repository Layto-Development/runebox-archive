public class class30 {
	static boolean field467;
	static int[] field464;
	public short[] field465;
	public short[] field466;

	public class30(int var1) {
		class210 var2 = class67.method492(var1);
		if (var2.method1197()) {
			this.field465 = new short[var2.field1941.length];
			System.arraycopy(var2.field1941, 0, this.field465, 0, this.field465.length);
		}

		if (var2.method1194()) {
			this.field466 = new short[var2.field1943.length];
			System.arraycopy(var2.field1943, 0, this.field466, 0, this.field466.length);
		}

	}

	public static class425 method216(int var0) {
		class425 var2 = (class425)class425.field3519.method1890((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class425.field3521.method1212(11, var0);
			var2 = new class425();
			if (var3 != null) {
				var2.method2173(new class42(var3));
			}

			var2.method2172();
			class425.field3519.method1889(var2, (long)var0);
			return var2;
		}
	}

	static int method215(int var0, class167 var1, boolean var2) {
		if (var0 == 6809) {
			int var4 = class139.field1344[--class203.field1903];
			class235 var5 = class96.method638(var4, (byte)104);
			class139.field1331[++class429.field3529 - 1] = null != var5 ? var5.field2116 : "";
			return 1;
		} else {
			return 2;
		}
	}

	static String method214(String var0) {
		class397[] var2 = class18.method154();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class397 var4 = var2[var3];
			if (var4.field3347 != -1 && var0.startsWith(class249.method1447(var4.field3347))) {
				var0 = var0.substring(6 + Integer.toString(var4.field3347).length());
				break;
			}
		}

		return var0;
	}
}
