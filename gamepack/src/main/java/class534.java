import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dk")
public class class534 implements class425 {
	@ObfInfo(name = "bg", desc = "Lrb;")
	static class238 field4252;
	@ObfInfo(name = "ae", desc = "Ldk;")
	static final class534 field4253;
	@ObfInfo(name = "ao", desc = "Ldk;")
	static final class534 field4254;
	@ObfInfo(name = "at", desc = "Ldk;")
	static final class534 field4255;
	@ObfInfo(name = "ai", desc = "Ldk;")
	static final class534 field4256;
	@ObfInfo(name = "ac", desc = "Ldk;")
	static final class534 field4259;
	@ObfInfo(name = "au", desc = "Ldk;")
	static final class534 field4260;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1055124911)
	final int field4257;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 178610013)
	final int field4258;

	static {
		field4260 = new class534(0, -1);
		field4253 = new class534(1, 2);
		field4254 = new class534(2, 3);
		field4255 = new class534(3, 4);
		field4259 = new class534(4, 5);
		field4256 = new class534(5, 6);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class534(int var1, int var2) {
		this.field4257 = var1;
		this.field4258 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field4258;
	}

	@ObfInfo(name = "au", desc = "(I)[Ldk;")
	static class534[] method2584() {
		return new class534[]{field4253, field4255, field4259, field4260, field4254, field4256};
	}
}
