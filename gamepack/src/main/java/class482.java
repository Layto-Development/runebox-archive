import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uq")
public abstract class class482 {
	@ObfInfo(name = "ai", desc = "[F")
	protected float[] field3940;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 132368805)
	public int field3941;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 2105446071)
	public int field3943;
	@ObfInfo(name = "ao", desc = "[I")
	public int[] field3942;

	@ObfInfo(name = "<init>", desc = "()V")
	protected class482() {
	}

	@ObfInfo(name = "ae", desc = "(IIB)V")
	public abstract void method2449(int var1, int var2);

	@ObfInfo(name = "ao", desc = "(IIIII)V")
	public abstract void method2450(int var1, int var2, int var3, int var4);

	@ObfInfo(name = "as", desc = "(B)V")
	public final void method2452() {
		class83.method535(this.field3942, this.field3941, this.field3943, this.field3940);
	}

	@ObfInfo(name = "ay", desc = "(ZB)V")
	public final void method2451(boolean var1) {
		this.field3940 = var1 ? new float[this.field3943 * this.field3941 + 1] : null;
	}
}
