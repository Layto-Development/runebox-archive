public class class272 implements class228 {

	public static final class272 field2229;

	public static final class272 field2234;

	public static final class272 field2235;

	static class84[] field2228;

	public final class378 field2233;

	public final int field2230;

	public final int field2231;

	public final Class field2232;

	static {
		field2234 = new class272(1, 0, Integer.class, new class167());
		field2235 = new class272(0, 1, Long.class, new class210());
		field2229 = new class272(2, 2, String.class, new class327());
	}

	class272(int var1, int var2, Class var3, class378 var4) {
		this.field2230 = var1;
		this.field2231 = var2;
		this.field2232 = var3;
		this.field2233 = var4;
	}

	@Override
	public int method1362() {
		return this.field2231;
	}

	public Object method1517(class187 var1) {
		return this.field2233.method2005(var1);
	}

	public static class272[] method1518() {
		return new class272[] { field2234, field2229, field2235 };
	}

	public static class272 method1516(Class var0) {
		class272[] var2 = method1518();
		for (int var3 = 0; var3 < var2.length; ++var3) {
			class272 var4 = var2[var3];
			if (var4.field2232 == var0) {
				return var4;
			}
		}
		return null;
	}
}
