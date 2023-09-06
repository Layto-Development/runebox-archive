public class class394 implements class367 {
	public static final class394 field3312;
	public static final class394 field3313;
	public static final class394 field3314;
	public static final class394 field3317;
	static byte[][][] field3316;
	public byte field3315;

	static {
		field3312 = new class394((byte)-1);
		field3313 = new class394((byte)0);
		field3317 = new class394((byte)1);
		field3314 = new class394((byte)2);
	}

	class394(byte var1) {
		this.field3315 = var1;
	}

	public int method1970() {
		return this.field3315;
	}

	static String method2064(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	public static int method2067(int var0) {
		return (var0 & class125.field1167) - 1;
	}

	static void method2066(int var0) {
		if (var0 != -1) {
			if (class292.method1669(var0)) {
				class60[] var2 = class160.field1484[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					class60 var4 = var2[var3];
					if (null != var4.field728) {
						class309 var5 = new class309();
						var5.field2791 = var4;
						var5.field2794 = var4.field728;
						class102.method670(var5, 5000000, 0);
					}
				}

			}
		}
	}

	static Object method2065(int var0) {
		return class439.method2210((class140)class451.method2249(class140.method841(), var0));
	}
}
