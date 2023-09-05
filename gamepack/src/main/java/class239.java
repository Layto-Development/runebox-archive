import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ub")
public class class239 {
	@ObfInfo(name = "ae", desc = "Lub;")
	public static final class239 field1991;
	@ObfInfo(name = "ao", desc = "Lub;")
	static final class239 field1989;
	@ObfInfo(name = "au", desc = "Lub;")
	static final class239 field1992;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -826058471)
	public final int field1990;

	static {
		field1992 = new class239(0);
		field1991 = new class239(1);
		field1989 = new class239(2);
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	class239(int var1) {
		this.field1990 = var1;
	}

	@ObfInfo(name = "au", desc = "(B)[Lub;")
	static class239[] method1259() {
		return new class239[]{field1992, field1989, field1991};
	}

	@ObfInfo(name = "ae", desc = "(II)Lub;")
	public static class239 method1258(int var0) {
		class239[] var2 = method1259();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class239 var4 = var2[var3];
			if (var4.field1990 == var0) {
				return var4;
			}
		}

		return null;
	}
}
