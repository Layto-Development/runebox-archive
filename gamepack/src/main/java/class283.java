import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "na")
public class class283 implements class425 {
	@ObfInfo(name = "at", desc = "Lna;")
	public static final class283 field2271;
	@ObfInfo(name = "ac", desc = "Lna;")
	static final class283 field2267;
	@ObfInfo(name = "ae", desc = "Lna;")
	static final class283 field2268;
	@ObfInfo(name = "ao", desc = "Lna;")
	static final class283 field2269;
	@ObfInfo(name = "au", desc = "Lna;")
	static final class283 field2270;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1132792781)
	final int field2272;

	static {
		field2270 = new class283(0);
		field2268 = new class283(1);
		field2269 = new class283(2);
		field2271 = new class283(3);
		field2267 = new class283(4);
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	class283(int var1) {
		this.field2272 = var1;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field2272;
	}
}
