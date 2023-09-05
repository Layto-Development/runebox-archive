import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "nb")
public class class523 {
	@ObfInfo(name = "ae", desc = "Lnb;")
	static final class523 field4191;
	@ObfInfo(name = "ao", desc = "Lnb;")
	static final class523 field4192;
	@ObfInfo(name = "au", desc = "Lnb;")
	static final class523 field4193;
	@ObfInfo(name = "at", desc = "Lnb;")
	static final class523 field4194;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 2123855839)
	public final int field4195;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public final String field4190;

	static {
		field4193 = new class523("LIVE", 0);
		field4191 = new class523("BUILDLIVE", 3);
		field4192 = new class523("RC", 1);
		field4194 = new class523("WIP", 2);
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;I)V")
	class523(String var1, int var2) {
		this.field4190 = var1;
		this.field4195 = var2;
	}

	@ObfInfo(name = "au", desc = "(I)[Lnb;")
	public static class523[] method2556() {
		return new class523[]{field4193, field4192, field4194, field4191};
	}
}
