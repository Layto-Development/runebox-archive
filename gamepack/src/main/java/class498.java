public class class498 implements class367 {
	static class460 field4148;
	static int field4147;
	static final class498 field4142;
	static final class498 field4143;
	static final class498 field4144;
	static final class498 field4149;
	final byte field4146;
	final int field4145;

	static {
		field4144 = new class498(2, (byte)0);
		field4142 = new class498(3, (byte)1);
		field4143 = new class498(1, (byte)2);
		field4149 = new class498(0, (byte)3);
	}

	class498(int var1, byte var2) {
		this.field4145 = var1;
		this.field4146 = var2;
	}

	public int method1970() {
		return this.field4146;
	}

	public static long method2416(int var0) {
		return class277.field2462[var0];
	}

	static String method2415(String var0, class60 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					var0 = var0.substring(0, var4) + class225.method1266(class521.method2530(var1, var3 - 1)) + var0.substring(var4 + 2);
				}
			}
		}

		return var0;
	}
}
