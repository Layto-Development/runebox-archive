import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "um")
public class class394 implements class425 {
	@ObfInfo(name = "au", desc = "Lum;")
	public static final class394 field3048;
	@ObfInfo(name = "ae", desc = "Lum;")
	static final class394 field3046;
	@ObfInfo(name = "ao", desc = "Lum;")
	static final class394 field3049;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1910869001)
	final int field3047;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 2077273167)
	public final int field3045;

	static {
		field3048 = new class394(0, 0);
		field3046 = new class394(1, 1);
		field3049 = new class394(2, 2);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class394(int var1, int var2) {
		this.field3045 = var1;
		this.field3047 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field3047;
	}

	@ObfInfo(name = "au", desc = "(B)[Lum;")
	public static class394[] method2093() {
		return new class394[]{field3046, field3049, field3048};
	}
}
