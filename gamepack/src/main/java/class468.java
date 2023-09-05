import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hl")
public class class468 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field3773;
	@ObfInfo(name = "ao", desc = "Lle;")
	public static class7 field3774;
	@ObfInfo(name = "at", desc = "Lle;")
	public static class7 field3775;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 626247901)
	int field3782;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 433036111)
	int field3783;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -70914857)
	public int field3776;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 113725845)
	public int field3777;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 169334753)
	public int field3778;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1864270997)
	public int field3779;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1305434313)
	public int field3780;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 468013671)
	public int field3781;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 398210675)
	public int field3784;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1998862717)
	public int field3785;

	static {
		field3774 = new class7(64);
		field3775 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public class468() {
		this.field3779 = 255;
		this.field3778 = 255;
		this.field3781 = -1;
		this.field3780 = 1;
		this.field3777 = 70;
		this.field3782 = -1;
		this.field3783 = -1;
		this.field3784 = 30;
		this.field3785 = 0;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;B)V", opaqueValue = "3")
	public void method2407(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method2404(var1, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "282695815")
	void method2404(class280 var1, int var2) {
		if (var2 == 1) {
			var1.method1541();
		} else if (var2 == 2) {
			this.field3779 = var1.method1492();
		} else if (var2 == 3) {
			this.field3778 = var1.method1492();
		} else if (var2 == 4) {
			this.field3781 = 0;
		} else if (var2 == 5) {
			this.field3777 = var1.method1541();
		} else if (var2 == 6) {
			var1.method1492();
		} else if (var2 == 7) {
			this.field3782 = var1.method1540();
		} else if (var2 == 8) {
			this.field3783 = var1.method1540();
		} else if (var2 == 11) {
			this.field3781 = var1.method1541();
		} else if (var2 == 14) {
			this.field3784 = var1.method1492();
		} else if (var2 == 15) {
			this.field3785 = var1.method1492();
		}

	}

	@ObfInfo(name = "at", desc = "(B)Lui;", opaqueValue = "11")
	public class150 method2405() {
		if (this.field3782 < 0) {
			return null;
		} else {
			class150 var2 = (class150)field3775.method294((long)this.field3782);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class411.method2150(class56.field723, this.field3782, 0);
				if (null != var2) {
					field3775.method293(var2, (long)this.field3782);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "ac", desc = "(I)Lui;", opaqueValue = "314676722")
	public class150 method2406() {
		if (this.field3783 < 0) {
			return null;
		} else {
			class150 var2 = (class150)field3775.method294((long)this.field3783);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class411.method2150(class56.field723, this.field3783, 0);
				if (null != var2) {
					field3775.method293(var2, (long)this.field3783);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "au", desc = "(Lnu;Lnu;I)V")
	public static void method2408(class437 var0, class437 var1) {
		field3773 = var0;
		class56.field723 = var1;
	}
}
