import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "np")
public class class100 implements class425 {
	@ObfInfo(name = "at", desc = "Lnp;")
	public static final class100 field980;
	@ObfInfo(name = "ao", desc = "Lnp;")
	public static final class100 field981;
	@ObfInfo(name = "ae", desc = "Lnp;")
	public static final class100 field982;
	@ObfInfo(name = "au", desc = "Lnp;")
	public static final class100 field984;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1651266547)
	final int field983;

	static {
		field984 = new class100(-1);
		field982 = new class100(0);
		field981 = new class100(1);
		field980 = new class100(2);
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	class100(int var1) {
		this.field983 = var1;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field983;
	}
}
