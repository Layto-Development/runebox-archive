import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hy")
public class class263 implements class425 {
	@ObfInfo(name = "td", desc = "Lgo;")
	static class143 field2126;
	@ObfInfo(name = "ab", desc = "Luk;")
	static class398 field2125;
	@ObfInfo(name = "ae", desc = "Lhy;")
	static final class263 field2121;
	@ObfInfo(name = "ao", desc = "Lhy;")
	static final class263 field2122;
	@ObfInfo(name = "au", desc = "Lhy;")
	static final class263 field2123;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1855187977)
	final int field2124;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -76034327)
	public final int field2120;

	static {
		field2123 = new class263(1, 0);
		field2121 = new class263(0, 1);
		field2122 = new class263(2, 2);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class263(int var1, int var2) {
		this.field2120 = var1;
		this.field2124 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field2124;
	}

	@ObfInfo(name = "au", desc = "(B)[Lhy;")
	static class263[] method1372() {
		return new class263[]{field2121, field2123, field2122};
	}
}
