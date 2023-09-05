import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "re")
public class class329 {
	@ObfInfo(name = "au", desc = "Lre;")
	public static final class329 field2630;
	@ObfInfo(name = "ae", desc = "Lre;")
	static final class329 field2631;
	@ObfInfo(name = "ao", desc = "Ljava/lang/String;")
	String field2632;

	static {
		field2630 = new class329("application/json");
		field2631 = new class329("text/plain");
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;)V")
	class329(String var1) {
		this.field2632 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Ljava/lang/String;")
	public String method1805() {
		return this.field2632;
	}
}
