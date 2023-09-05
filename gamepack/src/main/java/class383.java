import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jb")
public class class383 {
	@ObfInfo(name = "ao", desc = "Ljb;")
	public static final class383 field2941;
	@ObfInfo(name = "ae", desc = "Ljb;")
	public static final class383 field2942;
	@ObfInfo(name = "au", desc = "Ljb;")
	public static final class383 field2947;
	@ObfInfo(name = "af", desc = "Let;")
	static class22 field2948;
	@ObfInfo(name = "cf", desc = "Lnb;")
	static class523 field2946;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1949670383)
	final int field2943;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1008526791)
	final int field2944;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1148385691)
	final int field2945;

	static {
		field2947 = new class383(2, 0, 4);
		field2942 = new class383(0, 1, 2);
		field2941 = new class383(1, 2, 0);
	}

	@ObfInfo(name = "<init>", desc = "(III)V")
	class383(int var1, int var2, int var3) {
		this.field2943 = var1;
		this.field2944 = var2;
		this.field2945 = var3;
	}

	@ObfInfo(name = "au", desc = "(FI)Z", opaqueValue = "1533766656")
	boolean method2040(float var1) {
		return var1 >= (float)this.field2945;
	}
}
