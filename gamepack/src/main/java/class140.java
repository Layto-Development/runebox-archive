public class class140 implements class367 {
	public static final class140 field1347;
	public static final class140 field1352;
	public static final class140 field1353;
	static class115[] field1346;
	public final class187 field1351;
	public final int field1348;
	public final int field1349;
	public final Class field1350;

	static {
		field1352 = new class140(1, 0, Integer.class, new class286());
		field1353 = new class140(0, 1, Long.class, new class274());
		field1347 = new class140(2, 2, String.class, new class242());
	}

	class140(int var1, int var2, Class var3, class187 var4) {
		this.field1348 = var1;
		this.field1349 = var2;
		this.field1350 = var3;
		this.field1351 = var4;
	}

	public int method1970() {
		return this.field1349;
	}

	public Object method840(class42 var1) {
		return this.field1351.method1035(var1);
	}

	public static class140[] method841() {
		return new class140[]{field1352, field1347, field1353};
	}

	public static class140 method838(Class var0) {
		class140[] var2 = method841();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class140 var4 = var2[var3];
			if (var4.field1350 == var0) {
				return var4;
			}
		}

		return null;
	}
}
