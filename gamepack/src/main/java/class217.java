import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "my")
public class class217 {
	@ObfInfo(name = "au", desc = "Lmx;")
	static class393 field1932;

	@ObfInfo(name = "<init>", desc = "()V")
	class217() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Lmx;I)V")
	public static void method1199(class393 var0) {
		field1932 = var0;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;Ljava/lang/String;I)I")
	public static int method1201(class280 var0, String var1) {
		int var3 = var0.field2254;
		byte[] var4 = class244.method1267(var1);
		var0.method1536(var4.length);
		var0.field2254 += field1932.method2090(var4, 0, var4.length, var0.field2252, var0.field2254);
		return var0.field2254 - var3;
	}

	@ObfInfo(name = "ao", desc = "(Ltm;I)Ljava/lang/String;")
	public static String method1202(class280 var0) {
		return method1200(var0, 32767);
	}

	@ObfInfo(name = "at", desc = "(Ltm;IB)Ljava/lang/String;")
	static String method1200(class280 var0, int var1) {
		try {
			int var3 = var0.method1539();
			if (var3 > var1) {
				var3 = var1;
			}

			byte[] var4 = new byte[var3];
			var0.field2254 += field1932.method2091(var0.field2252, var0.field2254, var4, 0, var3);
			String var5 = class244.method1269(var4, 0, var3);
			return var5;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
