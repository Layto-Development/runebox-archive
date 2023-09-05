import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dc")
public class class535 implements class425 {
	@ObfInfo(name = "bl", desc = "Luq;")
	public static class482 field4266;
	@ObfInfo(name = "fr", desc = "Lnk;")
	static class505 field4261;
	@ObfInfo(name = "ae", desc = "Ldc;")
	static final class535 field4262;
	@ObfInfo(name = "at", desc = "Ldc;")
	static final class535 field4263;
	@ObfInfo(name = "ac", desc = "Ldc;")
	static final class535 field4264;
	@ObfInfo(name = "ao", desc = "Ldc;")
	static final class535 field4265;
	@ObfInfo(name = "au", desc = "Ldc;")
	static final class535 field4267;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1356865323)
	final int field4268;

	static {
		field4267 = new class535(0);
		field4262 = new class535(1);
		field4265 = new class535(2);
		field4263 = new class535(3);
		field4264 = new class535(4);
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	class535(int var1) {
		this.field4268 = var1;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field4268;
	}

	@ObfInfo(name = "au", desc = "(I)[Ldc;")
	static class535[] method2585() {
		return new class535[]{field4265, field4267, field4263, field4262, field4264};
	}
}
