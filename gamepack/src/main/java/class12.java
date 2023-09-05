import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hc")
public class class12 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field346;
	@ObfInfo(name = "ae", desc = "Lle;")
	public static class7 field347;
	@ObfInfo(name = "am", desc = "[I")
	static int[] field344;
	@ObfInfo(name = "ao", desc = "Lsf;")
	class525 field345;

	static {
		field347 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class12() {
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	void method298() {
	}

	@ObfInfo(name = "ao", desc = "(Ltm;B)V", opaqueValue = "-50")
	void method299(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method302(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;II)V")
	void method302(class280 var1, int var2) {
		if (var2 == 249) {
			this.field345 = class2.method3(var1, this.field345);
		}

	}

	@ObfInfo(name = "ac", desc = "(III)I")
	public int method300(int var1, int var2) {
		return class2.method2(this.field345, var1, var2);
	}

	@ObfInfo(name = "ai", desc = "(ILjava/lang/String;I)Ljava/lang/String;", opaqueValue = "-403219604")
	public String method301(int var1, String var2) {
		class525 var5 = this.field345;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class45 var6 = (class45)var5.method2558((long)var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String)var6.field562;
			}
		}

		return var4;
	}

	@ObfInfo(name = "au", desc = "(II)Lhc;")
	public static class12 method303(int var0) {
		class12 var2 = (class12)field347.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field346.method2267(34, var0);
			var2 = new class12();
			if (var3 != null) {
				var2.method299(new class280(var3));
			}

			var2.method298();
			field347.method293(var2, (long)var0);
			return var2;
		}
	}
}
