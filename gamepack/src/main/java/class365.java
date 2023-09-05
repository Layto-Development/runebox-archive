import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fr")
public class class365 implements class425 {
	@ObfInfo(name = "at", desc = "Lfr;")
	public static final class365 field2834;
	@ObfInfo(name = "ae", desc = "Lfr;")
	public static final class365 field2835;
	@ObfInfo(name = "ac", desc = "Lfr;")
	public static final class365 field2836;
	@ObfInfo(name = "au", desc = "Lfr;")
	public static final class365 field2838;
	@ObfInfo(name = "ao", desc = "Lfr;")
	public static final class365 field2841;
	@ObfInfo(name = "rj", desc = "Lrs;")
	static class173 field2842;
	@ObfInfo(name = "ag", desc = "Ldb;")
	static class264 field2837;
	@ObfInfo(name = "km", desc = "I", intMultiplier = 1907020251)
	static int field2843;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 456464061)
	final int field2840;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -726683121)
	public final int field2839;

	static {
		field2838 = new class365(0, 0);
		field2835 = new class365(2, 1);
		field2841 = new class365(3, 2);
		field2834 = new class365(4, 3);
		field2836 = new class365(1, 4);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class365(int var1, int var2) {
		this.field2839 = var1;
		this.field2840 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field2840;
	}
}
