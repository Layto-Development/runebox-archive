import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "az")
public class class60 implements class425 {
	@ObfInfo(name = "wi", desc = "Lru;")
	static class387 field733;
	@ObfInfo(name = "au", desc = "Laz;")
	static final class60 field735;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 760206015)
	final int field732;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 2116991637)
	public final int field734;

	static {
		field735 = new class60(0, 0);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class60(int var1, int var2) {
		this.field734 = var1;
		this.field732 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field732;
	}

	@ObfInfo(name = "au", desc = "(I)[Laz;")
	public static class60[] method485() {
		return new class60[]{field735};
	}
}
