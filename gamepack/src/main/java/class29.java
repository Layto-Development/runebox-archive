import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hi")
public class class29 extends class180 {
	@ObfInfo(name = "ao", desc = "Lle;")
	public static class7 field468;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 2064232881)
	public static int field467;
	@ObfInfo(name = "au", desc = "Lnu;")
	static class437 field469;
	@ObfInfo(name = "ai", desc = "Lnu;")
	static class437 field470;
	@ObfInfo(name = "uk", desc = "I", intMultiplier = -1633851311)
	static int field471;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 543483367)
	public int field466;

	static {
		field468 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class29() {
		this.field466 = 0;
	}

	@ObfInfo(name = "ao", desc = "(Ltm;B)V")
	void method412(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method411(var1, var3);
		}
	}

	@ObfInfo(name = "at", desc = "(Ltm;II)V", opaqueValue = "633131524")
	void method411(class280 var1, int var2) {
		if (var2 == 5) {
			this.field466 = var1.method1541();
		}

	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V")
	public static void method413(class437 var0) {
		field469 = var0;
		field467 = field469.method2293(16);
	}
}
