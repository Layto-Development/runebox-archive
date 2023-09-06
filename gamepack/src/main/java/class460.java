public class class460 implements class367 {
	public static final class460 field3977;
	public static final class460 field3978;
	public static final class460 field3979;
	public static final class460 field3981;
	public static final class460 field3983;
	public static final class460 field3984;
	final int field3980;
	public final String field3982;

	static {
		field3983 = new class460("runescape", "RuneScape", 0);
		field3977 = new class460("stellardawn", "Stellar Dawn", 1);
		field3979 = new class460("game3", "Game 3", 2);
		field3978 = new class460("game4", "Game 4", 3);
		field3984 = new class460("game5", "Game 5", 4);
		field3981 = new class460("oldscape", "RuneScape 2007", 5);
	}

	class460(String var1, String var2, int var3) {
		this.field3982 = var1;
		this.field3980 = var3;
	}

	public int method1970() {
		return this.field3980;
	}

	public static int method2267(CharSequence var0, CharSequence var1, class168 var2) {
		int var4 = var0.length();
		int var5 = var1.length();
		int var6 = 0;
		int var7 = 0;
		char var8 = 0;
		char var9 = 0;

		while (var6 - var8 < var4 || var7 - var9 < var5) {
			if (var6 - var8 >= var4) {
				return -1;
			}

			if (var7 - var9 >= var5) {
				return 1;
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var0.charAt(var6++);
			}

			char var11;
			if (var9 != 0) {
				var11 = var9;
				boolean var16 = false;
			} else {
				var11 = var1.charAt(var7++);
			}

			var8 = class288.method1657(var10);
			var9 = class288.method1657(var11);
			var10 = class363.method1963(var10, var2);
			var11 = class363.method1963(var11, var2);
			if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var10 != var11) {
					return class488.method2403(var10, var2) - class488.method2403(var11, var2);
				}
			}
		}

		int var17 = Math.min(var4, var5);

		char var13;
		int var18;
		for (var18 = 0; var18 < var17; ++var18) {
			if (class168.field1630 == var2) {
				var6 = var4 - 1 - var18;
				var7 = var5 - 1 - var18;
			} else {
				var7 = var18;
				var6 = var18;
			}

			char var12 = var0.charAt(var6);
			var13 = var1.charAt(var7);
			if (var13 != var12 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
				var12 = Character.toLowerCase(var12);
				var13 = Character.toLowerCase(var13);
				if (var12 != var13) {
					return class488.method2403(var12, var2) - class488.method2403(var13, var2);
				}
			}
		}

		var18 = var4 - var5;
		if (var18 != 0) {
			return var18;
		} else {
			for (int var19 = 0; var19 < var17; ++var19) {
				var13 = var0.charAt(var19);
				char var14 = var1.charAt(var19);
				if (var14 != var13) {
					return class488.method2403(var13, var2) - class488.method2403(var14, var2);
				}
			}

			return 0;
		}
	}
}
