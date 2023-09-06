public class class392 {
	public static final class392 field3285;
	public static final class392 field3287;
	static final class392 field3277;
	static final class392 field3279;
	static final class392 field3280;
	static final class392 field3281;
	static final class392 field3282;
	static final class392 field3283;
	static final class392 field3284;
	final String field3286;
	public final int field3278;

	static {
		field3285 = new class392(8, 0, "", "");
		field3277 = new class392(4, 1, "", "");
		field3284 = new class392(1, 2, "", "");
		field3279 = new class392(6, 3, "", "");
		field3280 = new class392(2, 4, "", "");
		field3281 = new class392(0, 5, "", "");
		field3282 = new class392(5, 6, "", "");
		field3283 = new class392(7, 7, "", "");
		field3287 = new class392(3, -1, "", "", true, new class392[]{field3285, field3277, field3284, field3280, field3279});
	}

	class392(int var1, int var2, String var3, String var4) {
		this.field3278 = var1;
		this.field3286 = var4;
	}

	class392(int var1, int var2, String var3, String var4, boolean var5, class392[] var6) {
		this.field3278 = var1;
		this.field3286 = var4;
	}

	public String toString() {
		return this.field3286;
	}

	static void method2050(class287 var0, int var1, int var2) {
		if (var1 == var0.field1570 && var1 != -1) {
			int var4 = class114.method702(var1).field3311;
			if (var4 == 1) {
				var0.field1571 = 0;
				var0.field1572 = 0;
				var0.field1587 = var2;
				var0.field1552 = 0;
			}

			if (var4 == 2) {
				var0.field1552 = 0;
			}
		} else if (var1 == -1 || var0.field1570 == -1 || class114.method702(var1).field3304 >= class114.method702(var0.field1570).field3304) {
			var0.field1570 = var1;
			var0.field1571 = 0;
			var0.field1572 = 0;
			var0.field1587 = var2;
			var0.field1552 = 0;
			var0.field1589 = var0.field1573;
		}

	}
}
