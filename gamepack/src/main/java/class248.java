import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class class248 {

	static byte[][] field2107;

	static byte[][] field2108;

	static byte[][] field2109;

	static byte[][] field2110;

	static int field2099;

	static int field2100;

	static int field2101;

	static int field2102;

	static int field2103;

	static int field2104;

	static int field2106;

	static int field2111;

	static ArrayList field2105;

	static {
		field2111 = 0;
		field2101 = 0;
		field2102 = 0;
		field2103 = 0;
		field2099 = 1000;
		field2104 = 250;
		field2100 = 100;
		field2106 = 50;
		field2107 = new byte[1000][];
		field2108 = new byte[250][];
		field2109 = new byte[100][];
		field2110 = new byte[50][];
		field2105 = new ArrayList();
		method1432();
		new HashMap();
	}

	class248() throws Throwable {
	}

	public static void method1434(int[] var0, int[] var1) {
		if (null != var0 && var1 != null) {
			class25.field124 = var0;
			class91.field1202 = new int[var0.length];
			class94.field1212 = new byte[var0.length][][];
			for (int var3 = 0; var3 < class25.field124.length; ++var3) {
				class94.field1212[var3] = new byte[var1[var3]][];
				field2105.add(var0[var3]);
			}
			Collections.sort(field2105);
		} else {
			class25.field124 = null;
			class91.field1202 = null;
			class94.field1212 = (byte[][][]) null;
			method1432();
		}
	}

	static void method1432() {
		field2105.clear();
		field2105.add(100);
		field2105.add(5000);
		field2105.add(10000);
		field2105.add(30000);
	}

	public static synchronized byte[] method1431(int var0, boolean var1) {
		byte[] var5;
		if ((var0 == 100 || var0 < 100 && var1) && field2111 > 0) {
			var5 = field2107[--field2111];
			field2107[field2111] = null;
			return var5;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field2101 > 0) {
			var5 = field2108[--field2101];
			field2108[field2101] = null;
			return var5;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field2102 > 0) {
			var5 = field2109[--field2102];
			field2109[field2102] = null;
			return var5;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field2103 > 0) {
			var5 = field2110[--field2103];
			field2110[field2103] = null;
			return var5;
		} else {
			int var3;
			if (null != class94.field1212) {
				for (var3 = 0; var3 < class25.field124.length; ++var3) {
					if ((var0 == class25.field124[var3] || var0 < class25.field124[var3] && var1) && class91.field1202[var3] > 0) {
						byte[] var4 = class94.field1212[var3][--class91.field1202[var3]];
						class94.field1212[var3][class91.field1202[var3]] = null;
						return var4;
					}
				}
			}
			if (var1 && null != class25.field124) {
				for (var3 = 0; var3 < class25.field124.length; ++var3) {
					if (var0 <= class25.field124[var3] && class91.field1202[var3] < class94.field1212[var3].length) {
						return new byte[class25.field124[var3]];
					}
				}
			}
			return new byte[var0];
		}
	}

	public static synchronized byte[] method1433(int var0) {
		return method1431(var0, false);
	}

	public static synchronized void method1435(byte[] var0) {
		if (var0.length == 100 && field2111 < field2099) {
			field2107[++field2111 - 1] = var0;
		} else if (var0.length == 5000 && field2101 < field2104) {
			field2108[++field2101 - 1] = var0;
		} else if (var0.length == 10000 && field2102 < field2100) {
			field2109[++field2102 - 1] = var0;
		} else if (var0.length == 30000 && field2103 < field2106) {
			field2110[++field2103 - 1] = var0;
		} else {
			if (null != class94.field1212) {
				for (int var2 = 0; var2 < class25.field124.length; ++var2) {
					if (class25.field124[var2] == var0.length && class91.field1202[var2] < class94.field1212[var2].length) {
						class94.field1212[var2][class91.field1202[var2]++] = var0;
						return;
					}
				}
			}
		}
	}
}
