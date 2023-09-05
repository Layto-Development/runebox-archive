import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ni")
public class class492 {
	static {
		int var0 = 0;
		int var1 = 0;
		class533[] var2 = class533.method2583();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class533 var4 = var2[var3];
			if (var4.field4249 > var0) {
				var0 = var4.field4249;
			}

			if (var4.field4248 > var1) {
				var1 = var4.field4248;
			}
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class492() throws Throwable {
	}
}
