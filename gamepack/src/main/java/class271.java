import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qn")
public class class271 {
	@ObfInfo(name = "au", desc = "Lqn;")
	static final class271 field2219;
	@ObfInfo(name = "ae", desc = "Lqn;")
	static final class271 field2220;
	@ObfInfo(name = "ao", desc = "Ljava/lang/String;")
	final String field2221;

	static {
		field2219 = new class271("Basic");
		field2220 = new class271("Bearer");
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;)V")
	class271(String var1) {
		this.field2221 = var1;
	}

	@ObfInfo(name = "au", desc = "(B)Ljava/lang/String;")
	String method1425() {
		return this.field2221;
	}
}
