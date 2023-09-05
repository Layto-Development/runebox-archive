import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gt")
public class class11 extends class518 {
	@ObfInfo(name = "ko", desc = "[Lui;")
	static class150[] field343;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -207822203)
	int field342;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgf;")
	final class371 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgf;Ljava/lang/String;I)V")
	class11(class371 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field342 = var3;
	}

	@ObfInfo(name = "au", desc = "(B)I")
	public int method2541() {
		return 0;
	}

	@ObfInfo(name = "af", desc = "(I)I")
	public int method2540() {
		return this.field342;
	}
}
