import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jc")
public class class487 {
	@ObfInfo(name = "an", desc = "I", intMultiplier = 2126528347)
	public static int field3967;
	@ObfInfo(name = "ar", desc = "[J")
	public static long[] field3969;
	@ObfInfo(name = "at", desc = "Z")
	static boolean field3962;
	@ObfInfo(name = "au", desc = "Z")
	static boolean field3964;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -2143010385)
	static int field3959;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -719513937)
	static int field3960;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1213266783)
	static int field3961;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1387014137)
	static int field3963;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 951938557)
	static int field3965;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1054289517)
	static int field3966;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 180556539)
	static int field3968;

	static {
		field3964 = false;
		field3960 = 0;
		field3963 = 0;
		field3962 = false;
		field3967 = 0;
		field3969 = new long[1000];
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class487() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(IB)J")
	public static long method2466(int var0) {
		return field3969[var0];
	}

	@ObfInfo(name = "ae", desc = "(IB)I")
	public static int method2460(int var0) {
		long var3 = field3969[var0];
		int var2 = (int)(var3 >>> 0 & 127L);
		return var2;
	}

	@ObfInfo(name = "ao", desc = "(IB)I")
	public static int method2459(int var0) {
		long var3 = field3969[var0];
		int var2 = (int)(var3 >>> 7 & 127L);
		return var2;
	}

	@ObfInfo(name = "at", desc = "(J)I")
	public static int method2464(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfInfo(name = "ac", desc = "(J)I")
	public static int method2465(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfInfo(name = "ai", desc = "(IIIZIB)J")
	public static long method2467(int var0, int var1, int var2, boolean var3, int var4) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	@ObfInfo(name = "az", desc = "(III)V")
	public static final void method2462(int var0, int var1) {
		field3960 = var0;
		field3963 = var1;
		field3964 = true;
		field3967 = 0;
		field3962 = false;
	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public static final void method2463() {
		field3964 = false;
		field3967 = 0;
	}

	@ObfInfo(name = "aa", desc = "(B)Z")
	static final boolean method2461() {
		return field3964;
	}

	@ObfInfo(name = "af", desc = "(S)V")
	static final void method2458() {
		if (!field3962) {
			int var1 = class194.field1756;
			int var2 = class194.field1757;
			int var3 = class194.field1790;
			int var4 = class194.field1758;
			byte var5 = 50;
			short var6 = 3500;
			int var7 = (field3960 - class276.method1445()) * var5 / class276.method1450();
			int var8 = (field3963 - class276.method1446()) * var5 / class276.method1450();
			int var9 = (field3960 - class276.method1445()) * var6 / class276.method1450();
			int var10 = (field3963 - class276.method1446()) * var6 / class276.method1450();
			int var11 = class108.method610(var8, var5, var2, var1);
			int var12 = var5 * var2 - var1 * var8 >> 16;
			var8 = var11;
			var11 = class108.method610(var10, var6, var2, var1);
			int var13 = var6 * var2 - var1 * var10 >> 16;
			var10 = var11;
			var11 = class108.method611(var7, var12, var4, var3);
			int var14 = class108.method612(var7, var12, var4, var3);
			var7 = var11;
			var11 = class108.method611(var9, var13, var4, var3);
			int var15 = class108.method612(var9, var13, var4, var3);
			field3959 = (var11 + var7) / 2;
			field3968 = (var8 + var10) / 2;
			field3965 = (var14 + var15) / 2;
			class390.field3041 = (var11 - var7) / 2;
			field3961 = (var10 - var8) / 2;
			class399.field3111 = (var15 - var14) / 2;
			field3966 = Math.abs(class390.field3041);
			class463.field3759 = Math.abs(field3961);
			class499.field4035 = Math.abs(class399.field3111);
		}
	}
}
