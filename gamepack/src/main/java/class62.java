import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bu")
public class class62 extends class218 {
	@ObfInfo(name = "at", desc = "I")
	int field737;
	@ObfInfo(name = "ac", desc = "Z")
	public boolean field741;
	@ObfInfo(name = "ae", desc = "[B")
	public byte[] field738;
	@ObfInfo(name = "ao", desc = "I")
	public int field739;
	@ObfInfo(name = "au", desc = "I")
	public int field740;

	@ObfInfo(name = "<init>", desc = "(I[BII)V")
	class62(int var1, byte[] var2, int var3, int var4) {
		this.field740 = var1;
		this.field738 = var2;
		this.field739 = var3;
		this.field737 = var4;
	}

	@ObfInfo(name = "<init>", desc = "(I[BIIZ)V")
	class62(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field740 = var1;
		this.field738 = var2;
		this.field739 = var3;
		this.field737 = var4;
		this.field741 = var5;
	}

	@ObfInfo(name = "au", desc = "(Lcx;)Lbu;")
	public class62 method486(class124 var1) {
		this.field738 = var1.method696(this.field738);
		this.field740 = var1.method697(this.field740);
		if (this.field739 == this.field737) {
			this.field739 = this.field737 = var1.method695(this.field739);
		} else {
			this.field739 = var1.method695(this.field739);
			this.field737 = var1.method695(this.field737);
			if (this.field739 == this.field737) {
				--this.field739;
			}
		}

		return this;
	}
}
