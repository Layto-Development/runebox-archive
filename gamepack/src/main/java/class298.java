import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ph")
public class class298 {
	@ObfInfo(name = "ax", desc = "[[[B")
	static byte[][][] field2402;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 408775955)
	int field2403;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1744400735)
	int field2404;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 880720889)
	int field2405;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 488939871)
	int field2406;

	@ObfInfo(name = "<init>", desc = "()V")
	class298() throws Throwable {
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field2406).length();
		int var3 = 10 - Integer.toString(this.field2404).length();
		int var4 = 10 - Integer.toString(this.field2403).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field2406 + var5 + "Created: " + this.field2403 + var7 + "Total used: " + this.field2404 + var6 + "Max-In-Use: " + this.field2405;
	}
}
