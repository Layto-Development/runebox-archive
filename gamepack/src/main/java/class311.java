import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rq")
public class class311 implements class425 {
	@ObfInfo(name = "ae", desc = "Lrq;")
	static final class311 field2526;
	@ObfInfo(name = "at", desc = "Lrq;")
	static final class311 field2527;
	@ObfInfo(name = "au", desc = "Lrq;")
	static final class311 field2528;
	@ObfInfo(name = "ao", desc = "Lrq;")
	static final class311 field2529;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1675057501)
	final int field2525;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -726522981)
	final int field2530;

	static {
		field2528 = new class311(0, 1);
		field2526 = new class311(2, 2);
		field2529 = new class311(3, 3);
		field2527 = new class311(1, 10);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class311(int var1, int var2) {
		this.field2525 = var1;
		this.field2530 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field2530;
	}

	@ObfInfo(name = "au", desc = "(I)[Lrq;")
	static class311[] method1724() {
		return new class311[]{field2528, field2526, field2529, field2527};
	}
}
