import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tv")
public class class347 implements class425 {
	@ObfInfo(name = "ae", desc = "Ltv;")
	public static final class347 field2747;
	@ObfInfo(name = "au", desc = "Ltv;")
	public static final class347 field2748;
	@ObfInfo(name = "ac", desc = "Ltv;")
	static final class347 field2746;
	@ObfInfo(name = "at", desc = "Ltv;")
	static final class347 field2749;
	@ObfInfo(name = "ai", desc = "Ltv;")
	static final class347 field2752;
	@ObfInfo(name = "ao", desc = "Ltv;")
	static final class347 field2753;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1493160685)
	final int field2750;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1294522359)
	final int field2751;

	static {
		field2748 = new class347(1, 0);
		field2747 = new class347(5, 2);
		field2753 = new class347(2, 5);
		field2749 = new class347(0, 6);
		field2746 = new class347(4, 7);
		field2752 = new class347(3, 8);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class347(int var1, int var2) {
		this.field2750 = var1;
		this.field2751 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field2751;
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "756163097")
	public boolean method1921() {
		return this == field2747;
	}
}
