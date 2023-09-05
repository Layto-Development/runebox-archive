import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bw")
public abstract class class449 extends class155 {
	@ObfInfo(name = "am", desc = "Lcp;")
	class218 field3389;
	@ObfInfo(name = "ab", desc = "Lbw;")
	class449 field3386;
	@ObfInfo(name = "ag", desc = "I")
	int field3387;
	@ObfInfo(name = "ax", desc = "Z")
	volatile boolean field3388;

	@ObfInfo(name = "<init>", desc = "()V")
	protected class449() {
		this.field3388 = true;
	}

	@ObfInfo(name = "ai", desc = "()Lbw;")
	protected abstract class449 method2354();

	@ObfInfo(name = "az", desc = "()Lbw;")
	protected abstract class449 method2355();

	@ObfInfo(name = "ap", desc = "()I")
	protected abstract int method2352();

	@ObfInfo(name = "ad", desc = "(I)V")
	protected abstract void method2356(int var1);

	@ObfInfo(name = "aa", desc = "([III)V")
	protected abstract void method2357(int[] var1, int var2, int var3);

	@ObfInfo(name = "br", desc = "()I")
	int method2353() {
		return 255;
	}

	@ObfInfo(name = "fq", desc = "([III)V")
	final void method2358(int[] var1, int var2, int var3) {
		if (this.field3388) {
			this.method2357(var1, var2, var3);
		} else {
			this.method2356(var3);
		}

	}
}
