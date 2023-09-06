public abstract class class232 {
	boolean field2102;
	boolean field2103;
	class232 field2099;
	String field2100;
	String field2101;

	class232(class232 var1) {
		this.field2099 = var1;
	}

	public abstract boolean method1330();

	public boolean method1331() {
		return this.field2102;
	}

	public boolean method1334() {
		return this.field2103;
	}

	public String method1329() {
		return "Error in task: " + this.field2101 + ", Error message: " + this.field2100;
	}

	public class232 method1332() {
		return this.field2099;
	}

	void method1333(String var1) {
		this.field2102 = true;
		this.field2100 = var1;
	}

	public static boolean method1335(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	public static int method1337(int var0) {
		return class370.field3103[var0 & 16383];
	}

	static final void method1336(class60 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field88) {
			Client.field207 = 32;
		} else {
			Client.field207 = 0;
		}

		Client.field88 = false;
		int var8;
		if (class184.field1735 == 1 || !class30.field467 && class184.field1735 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field677 -= 4;
				class185.method1024(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
				var0.field677 += 4;
				class185.method1024(var0);
			} else if (var5 >= var1 - Client.field207 && var5 < Client.field207 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
				var8 = var3 * (var3 - 32) / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field677 = var9 * (var4 - var3) / var10;
				class185.method1024(var0);
				Client.field88 = true;
			}
		}

		if (Client.field216 != 0) {
			var8 = var0.field659;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field677 += Client.field216 * 45;
				class185.method1024(var0);
			}
		}

	}
}
