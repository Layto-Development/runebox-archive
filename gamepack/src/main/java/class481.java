import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@ObfInfo(name = "pb")
public class class481 {
	@ObfInfo(name = "al", desc = "[[B")
	static byte[][] field3935;
	@ObfInfo(name = "an", desc = "[[B")
	static byte[][] field3936;
	@ObfInfo(name = "ar", desc = "[[B")
	static byte[][] field3937;
	@ObfInfo(name = "ab", desc = "[[B")
	static byte[][] field3938;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -128382617)
	static int field3927;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1802976855)
	static int field3928;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 261560463)
	static int field3929;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 928925253)
	static int field3930;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1819715831)
	static int field3931;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1836471235)
	static int field3932;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1478646587)
	static int field3934;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1270229297)
	static int field3939;
	@ObfInfo(name = "ah", desc = "Ljava/util/ArrayList;")
	static ArrayList field3933;

	static {
		field3939 = 0;
		field3929 = 0;
		field3930 = 0;
		field3931 = 0;
		field3927 = 1000;
		field3932 = 250;
		field3928 = 100;
		field3934 = 50;
		field3935 = new byte[1000][];
		field3936 = new byte[250][];
		field3937 = new byte[100][];
		field3938 = new byte[50][];
		field3933 = new ArrayList();
		method2445();
		new HashMap();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class481() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "([I[II)V")
	public static void method2447(int[] var0, int[] var1) {
		if (null != var0 && var1 != null) {
			class484.field3944 = var0;
			class12.field344 = new int[var0.length];
			class298.field2402 = new byte[var0.length][][];

			for (int var3 = 0; var3 < class484.field3944.length; ++var3) {
				class298.field2402[var3] = new byte[var1[var3]][];
				field3933.add(var0[var3]);
			}

			Collections.sort(field3933);
		} else {
			class484.field3944 = null;
			class12.field344 = null;
			class298.field2402 = (byte[][][])null;
			method2445();
		}
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	static void method2445() {
		field3933.clear();
		field3933.add(100);
		field3933.add(5000);
		field3933.add(10000);
		field3933.add(30000);
	}

	@ObfInfo(name = "ao", desc = "(IZI)[B", opaqueValue = "1429674191")
	public static synchronized byte[] method2444(int var0, boolean var1) {
		byte[] var5;
		if ((var0 == 100 || var0 < 100 && var1) && field3939 > 0) {
			var5 = field3935[--field3939];
			field3935[field3939] = null;
			return var5;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field3929 > 0) {
			var5 = field3936[--field3929];
			field3936[field3929] = null;
			return var5;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field3930 > 0) {
			var5 = field3937[--field3930];
			field3937[field3930] = null;
			return var5;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field3931 > 0) {
			var5 = field3938[--field3931];
			field3938[field3931] = null;
			return var5;
		} else {
			int var3;
			if (null != class298.field2402) {
				for (var3 = 0; var3 < class484.field3944.length; ++var3) {
					if ((var0 == class484.field3944[var3] || var0 < class484.field3944[var3] && var1) && class12.field344[var3] > 0) {
						byte[] var4 = class298.field2402[var3][--class12.field344[var3]];
						class298.field2402[var3][class12.field344[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != class484.field3944) {
				for (var3 = 0; var3 < class484.field3944.length; ++var3) {
					if (var0 <= class484.field3944[var3] && class12.field344[var3] < class298.field2402[var3].length) {
						return new byte[class484.field3944[var3]];
					}
				}
			}

			return new byte[var0];
		}
	}

	@ObfInfo(name = "at", desc = "(IB)[B")
	public static synchronized byte[] method2446(int var0) {
		return method2444(var0, false);
	}

	@ObfInfo(name = "ac", desc = "([BI)V")
	public static synchronized void method2448(byte[] var0) {
		if (var0.length == 100 && field3939 < field3927) {
			field3935[++field3939 - 1] = var0;
		} else if (var0.length == 5000 && field3929 < field3932) {
			field3936[++field3929 - 1] = var0;
		} else if (var0.length == 10000 && field3930 < field3928) {
			field3937[++field3930 - 1] = var0;
		} else if (var0.length == 30000 && field3931 < field3934) {
			field3938[++field3931 - 1] = var0;
		} else {
			if (null != class298.field2402) {
				for (int var2 = 0; var2 < class484.field3944.length; ++var2) {
					if (class484.field3944[var2] == var0.length && class12.field344[var2] < class298.field2402[var2].length) {
						class298.field2402[var2][class12.field344[var2]++] = var0;
						return;
					}
				}
			}

		}
	}
}
