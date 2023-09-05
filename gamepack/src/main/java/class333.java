import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "dh")
public class class333 extends class180 {
	@ObfInfo(name = "au", desc = "Lle;")
	static class7 field2641;
	@ObfInfo(name = "af", desc = "[Lsf;")
	class525[] field2650;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1597120201)
	int field2645;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -395613867)
	int field2647;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 942118187)
	int field2648;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1421158661)
	int field2649;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field2642;
	@ObfInfo(name = "at", desc = "[I")
	int[] field2643;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field2646;
	@ObfInfo(name = "ac", desc = "[Ljava/lang/String;")
	String[] field2644;

	static {
		field2641 = new class7(128);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class333() {
	}

	@ObfInfo(name = "ac", desc = "(II)[Lsf;")
	class525[] method1813(int var1) {
		return new class525[var1];
	}

	@ObfInfo(name = "au", desc = "(IB)Ldh;")
	static class333 method1816(int var0) {
		class333 var2 = (class333)field2641.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class454.field3714.method2267(var0, 0);
			if (null == var3) {
				return null;
			} else {
				var2 = method1817(var3);
				field2641.method293(var2, (long)var0);
				return var2;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(IIII)Ldh;")
	static class333 method1819(int var0, int var1, int var2) {
		int var4 = (var1 << 8) + var0;
		class333 var6 = method1818(var4, var0);
		if (null != var6) {
			return var6;
		} else {
			int var7 = (-3 - var2 << 8) + var0;
			var6 = method1818(var7, var0);
			if (null != var6) {
				return var6;
			} else {
				int var8 = var0 + -512;
				var6 = method1818(var8, var0);
				return null != var6 ? var6 : null;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(III)Ldh;")
	static class333 method1818(int var0, int var1) {
		class333 var3 = (class333)field2641.method294((long)(var0 << 16));
		if (null != var3) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = class454.field3714.method2292(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = class454.field3714.method2274(var5);
				if (null != var6) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = method1817(var6);
					if (var3 != null) {
						field2641.method293(var3, (long)(var0 << 16));
						return var3;
					}
				}

				return null;
			}
		}
	}

	@ObfInfo(name = "at", desc = "(IIB)V", opaqueValue = "0")
	public static void method1815(int var0, int var1) {
		class303.method1683(var0, var1, 0, 0);
		class303.field2448.clear();
		class303.field2449.clear();
		if (class303.field2447.isEmpty() || var0 == 0 && var1 == 0) {
			class303.method1684();
		} else {
			class303.field2449.add(new class156((class236)null, class303.field2451));
			class303.field2449.add(new class375((class236)null, 0, false, class303.field2452));
			ArrayList var4 = new ArrayList();
			Iterator var5 = class303.field2447.iterator();

			while (var5.hasNext()) {
				class503 var6 = (class503)var5.next();
				var4.add(var6);
			}

			class303.field2449.add(new class511((class236)null, var4));
		}

	}

	@ObfInfo(name = "at", desc = "([BB)Ldh;")
	static class333 method1817(byte[] var0) {
		class333 var2 = new class333();
		class280 var3 = new class280(var0);
		var3.field2254 = var3.field2252.length - 2;
		int var4 = var3.method1541();
		int var5 = var3.field2252.length - 2 - var4 - 12;
		var3.field2254 = var5;
		int var6 = var3.method1496();
		var2.field2645 = var3.method1541();
		var2.field2649 = var3.method1541();
		var2.field2647 = var3.method1541();
		var2.field2648 = var3.method1541();
		int var7 = var3.method1492();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field2650 = var2.method1813(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method1541();
				class525 var10 = new class525(var9 > 0 ? class497.method2492(var9) : 1);
				var2.field2650[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.method1496();
					int var12 = var3.method1496();
					var10.method2562(new class149(var12), (long)var11);
				}
			}
		}

		var3.field2254 = 0;
		var2.field2646 = var3.method1551();
		var2.field2642 = new int[var6];
		var2.field2643 = new int[var6];
		var2.field2644 = new String[var6];

		for (var8 = 0; var3.field2254 < var5; var2.field2642[var8++] = var9) {
			var9 = var3.method1541();
			if (var9 == 3) {
				var2.field2644[var8] = var3.method1500();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field2643[var8] = var3.method1496();
			} else {
				var2.field2643[var8] = var3.method1492();
			}
		}

		return var2;
	}

	@ObfInfo(name = "hf", desc = "(II)V")
	static final void method1814(int var0) {
		Client.method280();
		switch(var0) {
		case 1:
			class162.method939();
			break;
		case 2:
			class162.method924(24);
			class162.method936(class453.field3627, class453.field3628, class453.field3629);
		}

	}
}
