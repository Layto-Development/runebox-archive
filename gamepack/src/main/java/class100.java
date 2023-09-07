public class class100 {

	public static final class100 field1267;

	static final class100 field1265;

	static final class100 field1268;

	public final int field1266;

	static {
		field1268 = new class100(0);
		field1267 = new class100(1);
		field1265 = new class100(2);
	}

	class100(int var1) {
		this.field1266 = var1;
	}

	static class100[] method628() {
		return new class100[] { field1268, field1265, field1267 };
	}

	public static class100 method627(int var0) {
		class100[] var2 = method628();
		for (int var3 = 0; var3 < var2.length; ++var3) {
			class100 var4 = var2[var3];
			if (var4.field1266 == var0) {
				return var4;
			}
		}
		return null;
	}
}
