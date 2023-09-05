import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qb")
public class class424 extends class179 {
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -585067103)
	public int field3234;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -344611225)
	public int field3235;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1542031327)
	public int field3236;

	@ObfInfo(name = "<init>", desc = "()V")
	class424() {
		this.field3235 = -1;
	}

	@ObfInfo(name = "by", desc = "(III)V")
	void method2219(int var1, int var2) {
		this.field3235 = var1;
		this.field3234 = var2;
	}

	@ObfInfo(name = "bs", desc = "(B)I")
	public int method2220() {
		return this.field3235;
	}

	@ObfInfo(name = "bm", desc = "(B)Z", opaqueValue = "1")
	public boolean method2221() {
		return this.field3235 > 0;
	}
}
