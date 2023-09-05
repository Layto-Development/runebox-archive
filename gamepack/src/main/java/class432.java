import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ed")
public final class class432 extends class510 {
	@ObfInfo(name = "au", desc = "I", intMultiplier = 943663449)
	int field3272;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -2002661055)
	int field3273;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 457828051)
	int field3274;

	@ObfInfo(name = "<init>", desc = "()V")
	class432() {
		this.field3274 = 31;
	}

	@ObfInfo(name = "au", desc = "(IS)V")
	void method2251(int var1) {
		this.field3274 = var1;
	}

	@ObfInfo(name = "ao", desc = "(II)Z", opaqueValue = "1464815066")
	boolean method2250(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field3274 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;")
	protected final class384 method2515() {
		return class270.method1424(this.field3272).method1409(this.field3273);
	}
}
