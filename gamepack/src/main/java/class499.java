public class class499 {
	public static final class499 field4150;
	public static final class499 field4151;
	public static final class499 field4153;
	public static final class499 field4155;
	static final class499 field4152;
	public final String field4154;

	static {
		field4155 = new class499("details");
		field4151 = new class499("compositemap");
		field4150 = new class499("compositetexture");
		field4152 = new class499("area");
		field4153 = new class499("labels");
	}

	class499(String var1) {
		this.field4154 = var1;
	}

	public static class151 method2417(int var0) {
		class151 var2 = (class151)class151.field1432.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class151.field1428.method1212(32, var0);
			var2 = new class151();
			if (var3 != null) {
				var2.method864(new class42(var3));
			}

			class151.field1432.method1889(var2, (long)var0);
			return var2;
		}
	}
}
