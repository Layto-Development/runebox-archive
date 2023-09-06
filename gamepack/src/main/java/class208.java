import java.util.Iterator;

public class class208 {
	int field1924;
	final class392 field1923;
	public final class220 field1925;
	public final class283 field1926;

	class208(class392 var1) {
		this.field1924 = 0;
		this.field1923 = var1;
		this.field1926 = new class283(var1);
		this.field1925 = new class220(var1);
	}

	boolean method1159() {
		return this.field1924 == 2;
	}

	final void method1160() {
		this.field1924 = 1;
	}

	final void method1171(class42 var1, int var2) {
		this.field1926.method1611(var1, var2, (byte)-1);
		this.field1924 = 2;

		for (int var4 = 0; var4 < class481.field4085; ++var4) {
			class287 var5 = Client.field176[class481.field4086[var4]];
			var5.method1633();
		}

		Iterator var7 = class41.field521.iterator();

		while (var7.hasNext()) {
			class445 var6 = (class445)var7.next();
			var6.method2224();
		}

		if (class141.field1358 != null) {
			class141.field1358.method823();
		}

	}

	final void method1161() {
		for (class314 var2 = (class314)this.field1926.field2510.method2292(); var2 != null; var2 = (class314)this.field1926.field2510.method2291()) {
			if ((long)var2.field2822 < class172.method977() / 1000L - 5L) {
				if (var2.field2820 > 0) {
					class184.method1019(5, "", var2.field2819 + class433.field3701);
				}

				if (var2.field2820 == 0) {
					class184.method1019(5, "", var2.field2819 + class433.field3595);
				}

				var2.method2560();
			}
		}

	}

	final void method1162() {
		this.field1924 = 0;
		this.field1926.method1703();
		this.field1925.method1703();
	}

	final boolean method1163(class440 var1, boolean var2) {
		if (null == var1) {
			return false;
		} else if (var1.equals(class82.field863.field2539)) {
			return true;
		} else {
			return this.field1926.method1610(var1, var2);
		}
	}

	final boolean method1164(class440 var1) {
		if (null == var1) {
			return false;
		} else {
			return this.field1925.method1719(var1);
		}
	}

	final void method1165(String var1) {
		if (var1 != null) {
			class440 var3 = new class440(var1, this.field1923);
			if (var3.method2215()) {
				if (this.method1166()) {
					class69.method503(class433.field3720);
				} else if (class82.field863.field2539.equals(var3)) {
					class50.method380();
				} else if (this.method1163(var3, false)) {
					class433.method2198(var1);
				} else if (this.method1164(var3)) {
					class69.method503(class433.field3726 + var1 + class433.field3727);
				} else {
					class184.method1020(var1);
				}
			}
		}
	}

	final boolean method1166() {
		return this.field1926.method1704() || this.field1926.method1724() >= 200 && Client.field132 != 1;
	}

	final void method1167(String var1) {
		if (null != var1) {
			class440 var3 = new class440(var1, this.field1923);
			if (var3.method2215()) {
				if (this.method1170()) {
					class69.method503(class433.field3722);
				} else if (class82.field863.field2539.equals(var3)) {
					class242.method1386();
				} else if (this.method1164(var3)) {
					class504.method2428(var1);
				} else if (this.method1163(var3, false)) {
					class69.method503(class433.field3540 + var1 + class433.field3699);
				} else {
					class160 var4 = class85.method556(class129.field1231, Client.field68.field2426);
					var4.field1483.method267(class431.method2196(var1));
					var4.field1483.method270(var1);
					Client.field68.method1570(var4);
				}
			}
		}
	}

	final boolean method1170() {
		return this.field1925.method1704() || this.field1925.method1724() >= 100 && Client.field132 != 1;
	}

	final void method1168(String var1) {
		if (null != var1) {
			class440 var3 = new class440(var1, this.field1923);
			if (var3.method2215()) {
				if (this.field1926.method1722(var3)) {
					class237.method1363();
					class160 var4 = class85.method556(class129.field1211, Client.field68.field2426);
					var4.field1483.method267(class431.method2196(var1));
					var4.field1483.method270(var1);
					Client.field68.method1570(var4);
				}

				for (int var6 = 0; var6 < class481.field4085; ++var6) {
					class287 var5 = Client.field176[class481.field4086[var6]];
					var5.method1633();
				}

				Iterator var7 = class41.field521.iterator();

				while (var7.hasNext()) {
					class445 var8 = (class445)var7.next();
					var8.method2224();
				}

				if (null != class141.field1358) {
					class141.field1358.method823();
				}

			}
		}
	}

	public final void method1169(String var1, boolean var2) {
		if (null != var1) {
			class440 var4 = new class440(var1, this.field1923);
			if (var4.method2215()) {
				if (this.field1925.method1722(var4)) {
					class237.method1363();
					if (var2) {
						class160 var5 = class85.method556(class129.field1233, Client.field68.field2426);
						var5.field1483.method267(class431.method2196(var1));
						var5.field1483.method270(var1);
						Client.field68.method1570(var5);
					}
				}

				class431.method2195();
			}
		}
	}

	final boolean method1172(class440 var1) {
		class9 var3 = (class9)this.field1926.method1705(var1);
		return null != var3 && var3.method1730();
	}

	public static void method1174(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			short var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var7 == null || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					short var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method1174(var0, var1, var2, var6 - 1);
			method1174(var0, var1, var6 + 1, var3);
		}

	}

	static int method1173() {
		if (null != Client.field300 && Client.field301 < Client.field300.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= Client.field301; ++var2) {
				var1 += ((class398)Client.field300.get(var2)).field3352;
			}

			return var1 * 10000 / Client.field302;
		} else {
			return 10000;
		}
	}
}
