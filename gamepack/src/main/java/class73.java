import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dl")
public class class73 implements class425 {
	@ObfInfo(name = "ao", desc = "Ldl;")
	static final class73 field789;
	@ObfInfo(name = "ae", desc = "Ldl;")
	static final class73 field790;
	@ObfInfo(name = "at", desc = "Ldl;")
	static final class73 field791;
	@ObfInfo(name = "au", desc = "Ldl;")
	static final class73 field794;
	@ObfInfo(name = "ac", desc = "Ldl;")
	static final class73 field795;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -423643843)
	final int field792;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1282500441)
	final int field793;

	static {
		field794 = new class73(0, -1);
		field790 = new class73(1, 1);
		field789 = new class73(2, 7);
		field791 = new class73(3, 8);
		field795 = new class73(4, 9);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	class73(int var1, int var2) {
		this.field793 = var1;
		this.field792 = var2;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field792;
	}

	@ObfInfo(name = "au", desc = "(I)[Ldl;")
	static class73[] method511() {
		return new class73[]{field790, field791, field789, field795, field794};
	}
}
