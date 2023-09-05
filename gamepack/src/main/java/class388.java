import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rw")
public class class388 {
	@ObfInfo(name = "an", desc = "[I")
	static final int[] field3035;
	@ObfInfo(name = "al", desc = "[I")
	static final int[] field3036;

	static {
		field3036 = new int[2048];
		field3035 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field3036[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field3035[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class388() throws Throwable {
	}
}
