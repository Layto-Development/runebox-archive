import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "mn")
public class class200 {
	@ObfInfo(name = "ad", desc = "Lht;")
	static class325 field1814;

	@ObfInfo(name = "<init>", desc = "()V")
	class200() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(II)I")
	public static int method1122(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfInfo(name = "ae", desc = "(II)I")
	public static int method1124(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfInfo(name = "ao", desc = "(II)Z")
	public static boolean method1123(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
