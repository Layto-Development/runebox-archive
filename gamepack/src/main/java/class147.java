import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "kd")
public final class class147 {
	@ObfInfo(name = "ae", desc = "[I")
	final int[] field1456;

	@ObfInfo(name = "<init>", desc = "()V")
	class147() {
		this.field1456 = new int[4096];
	}

	@ObfInfo(name = "<init>", desc = "([I)V")
	class147(int[] var1) {
		this.field1456 = var1;
	}

	@ObfInfo(name = "au", desc = "(IIB)I")
	final int method846(int var1, int var2) {
		return this.field1456[var1 + var2 * 64];
	}
}
