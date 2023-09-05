import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "in")
public class class386 implements class425 {
	@ObfInfo(name = "au", desc = "Lin;")
	public static final class386 field3024;
	@ObfInfo(name = "ae", desc = "Lin;")
	public static final class386 field3025;
	@ObfInfo(name = "at", desc = "Lin;")
	public static final class386 field3026;
	@ObfInfo(name = "ao", desc = "Lin;")
	public static final class386 field3029;
	@ObfInfo(name = "ap", desc = "[[[B")
	static byte[][][] field3028;
	@ObfInfo(name = "ac", desc = "B")
	public byte field3027;

	static {
		field3024 = new class386((byte)-1);
		field3025 = new class386((byte)0);
		field3029 = new class386((byte)1);
		field3026 = new class386((byte)2);
	}

	@ObfInfo(name = "<init>", desc = "(B)V")
	class386(byte var1) {
		this.field3027 = var1;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field3027;
	}
}
