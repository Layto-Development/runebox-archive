import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hg")
public class class2 {
	@ObfInfo(name = "jo", desc = "[I")
	static int[] field4;

	@ObfInfo(name = "<init>", desc = "()V")
	class2() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Ltm;Lsf;I)Lsf;")
	static final class525 method3(class280 var0, class525 var1) {
		int var3 = var0.method1492();
		int var4;
		if (null == var1) {
			var4 = class497.method2492(var3);
			var1 = new class525(var4);
		}

		for (var4 = 0; var4 < var3; ++var4) {
			boolean var5 = var0.method1492() == 1;
			int var6 = var0.method1548();
			Object var7;
			if (var5) {
				var7 = new class45(var0.method1500());
			} else {
				var7 = new class149(var0.method1496());
			}

			var1.method2562((class155)var7, (long)var6);
		}

		return var1;
	}

	@ObfInfo(name = "ae", desc = "(Lsf;III)I")
	static int method2(class525 var0, int var1, int var2) {
		if (null == var0) {
			return var2;
		} else {
			class149 var4 = (class149)var0.method2558((long)var1);
			return var4 == null ? var2 : var4.field1457;
		}
	}
}
