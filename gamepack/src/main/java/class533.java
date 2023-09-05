import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "nv")
public class class533 {
	@ObfInfo(name = "au", desc = "Lnv;")
	static final class533 field4250;
	@ObfInfo(name = "ae", desc = "Lnv;")
	static final class533 field4251;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1646763659)
	final int field4248;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1219592589)
	final int field4249;

	static {
		field4250 = new class533(51, 27, 800, 0, 16, 16);
		field4251 = new class533(25, 28, 800, 656, 40, 40);
	}

	@ObfInfo(name = "<init>", desc = "(IIIIII)V")
	class533(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field4249 = var5;
		this.field4248 = var6;
	}

	@ObfInfo(name = "au", desc = "(B)[Lnv;")
	static class533[] method2583() {
		return new class533[]{field4250, field4251};
	}
}
