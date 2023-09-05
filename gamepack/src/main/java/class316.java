import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tr")
public class class316 {
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -822857019)
	static final int field2563;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -511636545)
	static final int field2564;

	static {
		field2563 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field2564 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class316() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(II)I")
	public static int method1738(int var0) {
		return var0 >>> 12;
	}

	@ObfInfo(name = "ae", desc = "(IB)I")
	public static int method1739(int var0) {
		return var0 >>> 4 & field2564;
	}

	@ObfInfo(name = "ao", desc = "(II)I")
	public static int method1740(int var0) {
		return (var0 & field2563) - 1;
	}

	@ObfInfo(name = "at", desc = "(Ltm;[II)[Ljava/lang/Object;")
	static Object[] method1737(class280 var0, int[] var1) {
		int var3 = var0.method1539();
		Object[] var4 = new Object[var3 * var1.length];

		for (int var5 = 0; var5 < var3; ++var5) {
			for (int var6 = 0; var6 < var1.length; ++var6) {
				int var7 = var6 + var1.length * var5;
				class49 var8 = class76.method517(var1[var6]);
				var4[var7] = var8.method451(var0);
			}
		}

		return var4;
	}
}
