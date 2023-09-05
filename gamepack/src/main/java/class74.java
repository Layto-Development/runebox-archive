import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dg")
public class class74 {
	@ObfInfo(name = "ks", desc = "[Lui;")
	static class150[] field799;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1196292575)
	int field798;
	@ObfInfo(name = "ae", desc = "Lnk;")
	final class505 field796;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -161989157)
	final int field797;

	@ObfInfo(name = "<init>", desc = "(Lnk;Ljava/lang/String;)V")
	class74(class505 var1, String var2) {
		this.field798 = 0;
		this.field796 = var1;
		this.field797 = var1.method2279();
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1328846410")
	boolean method512() {
		this.field798 = 0;

		for (int var2 = 0; var2 < this.field797; ++var2) {
			if (!this.field796.method2506(var2) || this.field796.method2505(var2)) {
				++this.field798;
			}
		}

		return this.field798 >= this.field797;
	}
}
