public class class525 {
	public static final float field4241;
	public static final float field4242;
	static class135 field4245;
	static class384 field4240;
	static float[] field4243;
	static float[] field4244;

	static {
		field4241 = Math.ulp(1.0F);
		field4242 = field4241 * 2.0F;
		field4243 = new float[4];
		field4244 = new float[5];
	}

	class525() throws Throwable {
	}

	public static byte[] method2540(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var7 = (byte[])((byte[])var0);
			if (var1) {
				int var5 = var7.length;
				byte[] var6 = new byte[var5];
				System.arraycopy(var7, 0, var6, 0, var5);
				return var6;
			} else {
				return var7;
			}
		} else if (var0 instanceof class178) {
			class178 var3 = (class178)var0;
			return var3.method1008();
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static void method2541() {
		class425.field3519.method1887();
	}

	static final void method2539(class60 var0, int var1, int var2, int var3) {
		if (null == var0.field719) {
			throw new RuntimeException();
		} else {
			var0.field719[var1] = var2;
			var0.field720[var1] = var3;
		}
	}

	static final void method2542(int var0, int var1, int var2) {
		if (class375.field3180 < var0) {
			class375.field3180 += class120.field1131 + class184.field1743 * (var0 - class375.field3180) / 1000;
			if (class375.field3180 > var0) {
				class375.field3180 = var0;
			}
		}

		if (class375.field3180 > var0) {
			class375.field3180 -= class120.field1131 + class184.field1743 * (class375.field3180 - var0) / 1000;
			if (class375.field3180 < var0) {
				class375.field3180 = var0;
			}
		}

		if (class463.field3989 < var1) {
			class463.field3989 += class120.field1131 + (var1 - class463.field3989) * class184.field1743 / 1000;
			if (class463.field3989 > var1) {
				class463.field3989 = var1;
			}
		}

		if (class463.field3989 > var1) {
			class463.field3989 -= (class463.field3989 - var1) * class184.field1743 / 1000 + class120.field1131;
			if (class463.field3989 < var1) {
				class463.field3989 = var1;
			}
		}

		if (class196.field1796 < var2) {
			class196.field1796 += class120.field1131 + (var2 - class196.field1796) * class184.field1743 / 1000;
			if (class196.field1796 > var2) {
				class196.field1796 = var2;
			}
		}

		if (class196.field1796 > var2) {
			class196.field1796 -= (class196.field1796 - var2) * class184.field1743 / 1000 + class120.field1131;
			if (class196.field1796 < var2) {
				class196.field1796 = var2;
			}
		}

	}
}
