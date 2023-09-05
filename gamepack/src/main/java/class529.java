import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jl")
public class class529 {
	@ObfInfo(name = "au", desc = "Z")
	boolean field4227;
	@ObfInfo(name = "al", desc = "I")
	int field4223;
	@ObfInfo(name = "ag", desc = "I")
	int field4228;
	@ObfInfo(name = "ab", desc = "I")
	int field4229;
	@ObfInfo(name = "ao", desc = "I")
	int field4230;
	@ObfInfo(name = "ar", desc = "I")
	int field4231;
	@ObfInfo(name = "an", desc = "I")
	int field4232;
	@ObfInfo(name = "am", desc = "I")
	int field4234;
	@ObfInfo(name = "ax", desc = "I")
	int field4235;
	@ObfInfo(name = "ah", desc = "I")
	int field4236;
	@ObfInfo(name = "as", desc = "[I")
	int[] field4233;
	@ObfInfo(name = "ae", desc = "Z")
	public boolean field4224;
	@ObfInfo(name = "az", desc = "Ljs;")
	public class65 field4225;
	@ObfInfo(name = "ai", desc = "I")
	public int field4226;

	@ObfInfo(name = "<init>", desc = "()V")
	class529() {
		this.field4227 = false;
		this.field4224 = true;
		this.field4230 = 0;
		this.field4226 = 512;
		this.field4233 = new int[1024];
	}

	@ObfInfo(name = "au", desc = "()V")
	void method2573() {
		this.field4223 = this.field4231 / 2;
		this.field4232 = this.field4229 / 2;
		this.field4228 = -this.field4223;
		this.field4234 = this.field4231 - this.field4223;
		this.field4235 = -this.field4232;
		this.field4236 = this.field4229 - this.field4232;
	}

	@ObfInfo(name = "ae", desc = "(IIII)V")
	void method2575(int var1, int var2, int var3, int var4) {
		this.field4223 = var1 - var2;
		this.field4232 = var3 - var4;
		this.field4228 = -this.field4223;
		this.field4234 = this.field4231 - this.field4223;
		this.field4235 = -this.field4232;
		this.field4236 = this.field4229 - this.field4232;
	}

	@ObfInfo(name = "ao", desc = "(III)V")
	void method2574(int var1, int var2, int var3) {
		this.field4227 = var1 < 0 || var1 > this.field4231 || var2 < 0 || var2 > this.field4231 || var3 < 0 || var3 > this.field4231;
	}
}
