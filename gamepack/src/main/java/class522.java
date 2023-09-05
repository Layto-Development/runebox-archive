import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "de")
public class class522 {
	@ObfInfo(name = "bc", desc = "Lrb;")
	static class238 field4185;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 519228135)
	int field4186;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1506450929)
	int field4187;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -404137777)
	int field4188;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -184686117)
	int field4189;

	@ObfInfo(name = "<init>", desc = "(IIII)V")
	class522(int var1, int var2, int var3, int var4) {
		this.field4188 = var1;
		this.field4189 = var2;
		this.field4186 = var3;
		this.field4187 = var4;
	}

	@ObfInfo(name = "au", desc = "(B)I")
	int method2554() {
		return this.field4188;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	int method2555() {
		return this.field4189;
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	int method2553() {
		return this.field4186;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	int method2552() {
		return this.field4187;
	}
}
