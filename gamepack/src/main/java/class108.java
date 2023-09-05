import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "je")
public class class108 {
	@ObfInfo(name = "<init>", desc = "()V")
	class108() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(IIIII)I")
	static final int method611(int var0, int var1, int var2, int var3) {
		return var2 * var0 - var3 * var1 >> 16;
	}

	@ObfInfo(name = "ae", desc = "(IIIII)I")
	static final int method612(int var0, int var1, int var2, int var3) {
		return var1 * var2 + var0 * var3 >> 16;
	}

	@ObfInfo(name = "ao", desc = "(IIIII)I")
	static final int method610(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var1 * var3 >> 16;
	}

	@ObfInfo(name = "at", desc = "(II)F")
	static final float method613(int var0) {
		float var2 = 10075.0F - (float)var0;
		return (var2 * 1.0075567F - 75.56675F) / var2;
	}
}
