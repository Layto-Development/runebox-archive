import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "gx")
public class class69 {
	@ObfInfo(name = "ac", desc = "[Lch;")
	static class516[] field774;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lgf;")
	final class371 this$0;
	@ObfInfo(name = "au", desc = "Let;")
	public class22 field775;
	@ObfInfo(name = "ae", desc = "[F")
	public float[] field776;

	@ObfInfo(name = "<init>", desc = "(Lgf;)V")
	class69(class371 var1) {
		this.this$0 = var1;
		this.field776 = new float[4];
	}

	@ObfInfo(name = "mu", desc = "(II)Ljava/lang/String;", opaqueValue = "819514567")
	static final String method503(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
