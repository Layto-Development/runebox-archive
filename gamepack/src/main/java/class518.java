import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gn")
public abstract class class518 {
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	String field4148;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgf;")
	final class371 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgf;Ljava/lang/String;)V")
	class518(class371 var1, String var2) {
		this.this$0 = var1;
		this.field4148 = var2;
	}

	@ObfInfo(name = "au", desc = "(B)I")
	public abstract int method2541();

	@ObfInfo(name = "al", desc = "(I)Ljava/lang/String;")
	public String method2538() {
		return this.field4148;
	}

	@ObfInfo(name = "ae", desc = "(I)Ljava/lang/String;")
	public String method2539() {
		return null;
	}

	@ObfInfo(name = "af", desc = "(I)I")
	public int method2540() {
		return -1;
	}
}
