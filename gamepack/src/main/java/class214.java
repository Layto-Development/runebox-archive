public class class214 extends class40 {
	public static class215 field2006;
	byte field2004;
	int field2003;
	String field2005;
	// $FF: synthetic field
	final class90 this$0;

	class214(class90 var1) {
		this.this$0 = var1;
		this.field2005 = null;
	}

	void method258(class42 var1) {
		if (var1.method278() != 255) {
			--var1.field527;
			var1.method283();
		}

		this.field2005 = var1.method337();
		this.field2003 = var1.method327();
		this.field2004 = var1.method279();
		var1.method283();
	}

	void method259(class419 var1) {
		class395 var3 = new class395();
		var3.field3320 = new class440(this.field2005);
		var3.field3322 = this.field2003;
		var3.field3321 = this.field2004;
		var1.method2155(var3);
	}

	static String method1210(class42 var0, int var1) {
		try {
			int var3 = var0.method325();
			if (var3 > var1) {
				var3 = var1;
			}

			byte[] var4 = new byte[var3];
			var0.field527 += class496.field4140.method2580(var0.field525, var0.field527, var4, 0, var3);
			String var5 = class313.method1750(var4, 0, var3);
			return var5;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	static int method1211(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}
}
