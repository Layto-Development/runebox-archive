import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gv")
public class class349 extends class518 {
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	String field2762;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgf;")
	final class371 this$0;

	@ObfInfo(name = "<init>", desc = "(Lgf;Ljava/lang/String;Ljava/lang/String;)V")
	class349(class371 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2762 = var3;
	}

	@ObfInfo(name = "au", desc = "(B)I")
	public int method2541() {
		return 1;
	}

	@ObfInfo(name = "ae", desc = "(I)Ljava/lang/String;")
	public String method2539() {
		return this.field2762;
	}
}
