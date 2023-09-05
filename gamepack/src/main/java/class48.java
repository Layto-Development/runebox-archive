import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "he")
public class class48 implements class425 {
	@ObfInfo(name = "ao", desc = "Lhe;")
	static final class48 field568;
	@ObfInfo(name = "au", desc = "Lhe;")
	static final class48 field569;
	@ObfInfo(name = "ae", desc = "Lhe;")
	static final class48 field572;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 92174543)
	final int field571;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 649902559)
	public final int field570;

	static {
		field569 = new class48(0, 0);
		field572 = new class48(2, 1);
		field568 = new class48(1, 2);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class48(int var1, int var2) {
		this.field570 = var1;
		this.field571 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field571;
	}

	@ObfInfo(name = "au", desc = "(I)[Lhe;")
	static class48[] method448() {
		return new class48[]{field569, field568, field572};
	}
}
