import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tq")
public class class76 {
	@ObfInfo(name = "ae", desc = "[I")
	static final int[] field825;

	static {
		field825 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, -1, 1, -1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 3, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class76() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(IB)I")
	public static int method516(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfInfo(name = "ae", desc = "(II)Ltb;")
	public static class49 method517(int var0) {
		int var2 = field825[var0];
		if (var2 == 1) {
			return class49.field579;
		} else if (var2 == 2) {
			return class49.field574;
		} else {
			return var2 == 3 ? class49.field580 : null;
		}
	}
}
