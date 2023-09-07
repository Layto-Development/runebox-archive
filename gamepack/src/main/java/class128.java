public class class128 {

	static final int field1465;

	static final int field1466;

	static {
		field1465 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);
		field1466 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);
	}

	class128() throws Throwable {
	}

	public static int method853(int var0) {
		return var0 >>> 12;
	}

	public static int method854(int var0) {
		return var0 >>> 4 & field1466;
	}

	public static int method855(int var0) {
		return (var0 & field1465) - 1;
	}

	static Object[] method852(class187 var0, int[] var1) {
		int var3 = var0.method1143();
		Object[] var4 = new Object[var3 * var1.length];
		for (int var5 = 0; var5 < var3; ++var5) {
			for (int var6 = 0; var6 < var1.length; ++var6) {
				int var7 = var6 + var1.length * var5;
				class272 var8 = class367.method1901(var1[var6]);
				var4[var7] = var8.method1517(var0);
			}
		}
		return var4;
	}
}
