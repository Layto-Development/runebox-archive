import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ft")
public class class416 implements class425 {
	@ObfInfo(name = "ai", desc = "Lft;")
	static final class416 field3191;
	@ObfInfo(name = "ao", desc = "Lft;")
	static final class416 field3193;
	@ObfInfo(name = "at", desc = "Lft;")
	static final class416 field3194;
	@ObfInfo(name = "ac", desc = "Lft;")
	static final class416 field3195;
	@ObfInfo(name = "au", desc = "Lft;")
	static final class416 field3196;
	@ObfInfo(name = "ae", desc = "Lft;")
	static final class416 field3199;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -345362565)
	final int field3192;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -590541799)
	final int field3197;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 987522577)
	final int field3198;

	static {
		field3196 = new class416(0, 0, (String)null, 0);
		field3199 = new class416(1, 1, (String)null, 9);
		field3193 = new class416(2, 2, (String)null, 3);
		field3194 = new class416(3, 3, (String)null, 6);
		field3195 = new class416(4, 4, (String)null, 1);
		field3191 = new class416(5, 5, (String)null, 3);
	}

	@ObfInfo(name = "<init>", desc = "(IILjava/lang/String;I)V")
	class416(int var1, int var2, String var3, int var4) {
		this.field3197 = var1;
		this.field3198 = var2;
		this.field3192 = var4;
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	int method2194() {
		return this.field3192;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field3198;
	}

	@ObfInfo(name = "au", desc = "(I)[Lft;")
	static class416[] method2196() {
		return new class416[]{field3196, field3199, field3193, field3194, field3195, field3191};
	}
}
