import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dd")
public class class23 extends class155 {
	@ObfInfo(name = "ap", desc = "Luk;")
	static class398 field408;
	@ObfInfo(name = "au", desc = "Lso;")
	static class405 field407;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field405;
	@ObfInfo(name = "ae", desc = "[I")
	int[] field406;

	static {
		field407 = new class405(32);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class23() {
		this.field406 = new int[]{-1};
		this.field405 = new int[]{0};
	}

	@ObfInfo(name = "au", desc = "(IIB)I")
	static int method341(int var0, int var1) {
		class23 var3 = (class23)field407.method2129((long)var0);
		if (null == var3) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field406.length ? var3.field406[var1] : -1;
		}
	}

	@ObfInfo(name = "ae", desc = "(IIB)I")
	static int method340(int var0, int var1) {
		class23 var3 = (class23)field407.method2129((long)var0);
		if (null == var3) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field405.length ? var3.field405[var1] : 0;
		}
	}

	@ObfInfo(name = "ao", desc = "(IIS)I")
	static int method342(int var0, int var1) {
		class23 var3 = (class23)field407.method2129((long)var0);
		if (null == var3) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field405.length; ++var5) {
				if (var1 == var3.field406[var5]) {
					var4 += var3.field405[var5];
				}
			}

			return var4;
		}
	}

	@ObfInfo(name = "at", desc = "(IIIII)V")
	static void method344(int var0, int var1, int var2, int var3) {
		class23 var5 = (class23)field407.method2129((long)var0);
		if (var5 == null) {
			var5 = new class23();
			field407.method2132(var5, (long)var0);
		}

		if (var5.field406.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field406.length; ++var8) {
				var6[var8] = var5.field406[var8];
				var7[var8] = var5.field405[var8];
			}

			for (var8 = var5.field406.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field406 = var6;
			var5.field405 = var7;
		}

		var5.field406[var1] = var2;
		var5.field405[var1] = var3;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public static void method337() {
		class1.field3.clear();
	}

	@ObfInfo(name = "ac", desc = "(II)V")
	static void method339(int var0) {
		class23 var2 = (class23)field407.method2129((long)var0);
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.field406.length; ++var3) {
				var2.field406[var3] = -1;
				var2.field405[var3] = 0;
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(IB)V")
	static void method338(int var0) {
		class23 var2 = (class23)field407.method2129((long)var0);
		if (null != var2) {
			var2.method907();
		}
	}

	@ObfInfo(name = "az", desc = "(I)V")
	static void method343() {
		field407 = new class405(32);
	}
}
