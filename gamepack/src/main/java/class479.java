import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dq")
public class class479 {
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	static String field3819;
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	static String field3820;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	static String field3821;
	@ObfInfo(name = "ao", desc = "Ljava/lang/String;")
	static String field3822;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	static String field3823;
	@ObfInfo(name = "ai", desc = "Ljava/lang/String;")
	static String field3824;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	static String field3825;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	static String field3826;

	static {
		field3820 = "true";
		field3823 = ",";
		field3822 = "|";
		field3819 = " (";
		field3821 = ")";
		field3824 = "->";
		field3825 = "<br>";
		field3826 = "</col>";
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class479() throws Throwable {
	}

	@ObfInfo(name = "ae", desc = "(IB)Ljava/lang/String;")
	static String method2443(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
