import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "lk")
public class class32 implements class37 {
	@ObfInfo(name = "ao", desc = "Llk;")
	public static final class32 field475;
	@ObfInfo(name = "at", desc = "Llk;")
	public static final class32 field476;
	@ObfInfo(name = "ac", desc = "Llk;")
	public static final class32 field477;
	@ObfInfo(name = "au", desc = "Llk;")
	public static final class32 field481;
	@ObfInfo(name = "ai", desc = "Llk;")
	static final class32 field478;
	@ObfInfo(name = "ae", desc = "Llk;")
	static final class32 field480;
	@ObfInfo(name = "ap", desc = "[Llk;")
	static final class32[] field474;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -85411471)
	public final int field479;

	static {
		field481 = new class32(14, 0);
		field480 = new class32(15, 4);
		field475 = new class32(16, -2);
		field476 = new class32(18, -2);
		field477 = new class32(19, -2);
		field478 = new class32(27, 0);
		field474 = new class32[32];
		class32[] var0 = new class32[]{field481, field480, field476, field478, field477, field475};
		class32[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field474[var1[var2].field479] = var1[var2];
		}

	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class32(int var1, int var2) {
		this.field479 = var1;
	}
}
