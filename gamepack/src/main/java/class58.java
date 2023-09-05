import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ds")
public class class58 extends class155 {
	@ObfInfo(name = "ao", desc = "Z")
	boolean field726;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -2035314843)
	int field725;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 2086760251)
	int field727;

	@ObfInfo(name = "<init>", desc = "()V")
	class58() {
		this.field726 = false;
	}

	@ObfInfo(name = "bg", desc = "(ILdh;ZB)I", opaqueValue = "3")
	static int method470(int var0, class333 var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = class175.field1621[--class293.field2375] == 1;
			Client.method146(var4);
			return 1;
		} else {
			return 2;
		}
	}
}
