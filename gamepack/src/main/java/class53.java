public class class53 extends class77 {

	static class214 field241;

	static class535 field240;

	int[] field238;

	int[] field239;

	static {
		field240 = new class535(32);
	}

	class53() {
		this.field239 = new int[] { -1 };
		this.field238 = new int[] { 0 };
	}

	static int method213(int var0, int var1) {
		class53 var3 = (class53) field240.method2582((long) var0);
		if (null == var3) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field239.length ? var3.field239[var1] : -1;
		}
	}

	static int method212(int var0, int var1) {
		class53 var3 = (class53) field240.method2582((long) var0);
		if (null == var3) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field238.length ? var3.field238[var1] : 0;
		}
	}

	static int method214(int var0, int var1) {
		class53 var3 = (class53) field240.method2582((long) var0);
		if (null == var3) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;
			for (int var5 = 0; var5 < var3.field238.length; ++var5) {
				if (var1 == var3.field239[var5]) {
					var4 += var3.field238[var5];
				}
			}
			return var4;
		}
	}

	static void method216(int var0, int var1, int var2, int var3) {
		class53 var5 = (class53) field240.method2582((long) var0);
		if (var5 == null) {
			var5 = new class53();
			field240.method2585(var5, (long) var0);
		}
		if (var5.field239.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];
			int var8;
			for (var8 = 0; var8 < var5.field239.length; ++var8) {
				var6[var8] = var5.field239[var8];
				var7[var8] = var5.field238[var8];
			}
			for (var8 = var5.field239.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}
			var5.field239 = var6;
			var5.field238 = var7;
		}
		var5.field239[var1] = var2;
		var5.field238[var1] = var3;
	}

	public static void method209() {
		class15.field85.clear();
	}

	static void method211(int var0) {
		class53 var2 = (class53) field240.method2582((long) var0);
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.field239.length; ++var3) {
				var2.field239[var3] = -1;
				var2.field238[var3] = 0;
			}
		}
	}

	static void method210(int var0) {
		class53 var2 = (class53) field240.method2582((long) var0);
		if (null != var2) {
			var2.method318();
		}
	}

	static void method215() {
		field240 = new class535(32);
	}
}
