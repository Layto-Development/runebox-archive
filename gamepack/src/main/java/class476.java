public class class476 implements class228 {

	public static final class476 field3732;

	public static final class476 field3733;

	public static final class476 field3734;

	public static final class476 field3736;

	public static final class476 field3738;

	public static final class476 field3739;

	final int field3735;

	public final String field3737;

	static {
		field3738 = new class476("runescape", "RuneScape", 0);
		field3732 = new class476("stellardawn", "Stellar Dawn", 1);
		field3734 = new class476("game3", "Game 3", 2);
		field3733 = new class476("game4", "Game 4", 3);
		field3739 = new class476("game5", "Game 5", 4);
		field3736 = new class476("oldscape", "RuneScape 2007", 5);
	}

	class476(String var1, String var2, int var3) {
		this.field3737 = var1;
		this.field3735 = var3;
	}

	@Override
	public int method1362() {
		return this.field3735;
	}

	public static int method2316(CharSequence var0, CharSequence var1, class267 var2) {
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
			var8 = class58.method232(var10);
			var9 = class58.method232(var11);
			var10 = class58.method231(var10, var2);
			var11 = class58.method231(var11, var2);
			if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var10 != var11) {
					return class58.method230(var10, var2) - class58.method230(var11, var2);
				}
			}
		}
		int var17 = Math.min(var4, var5);
		char var13;
		int var18;
		for (var18 = 0; var18 < var17; ++var18) {
			if (class267.field2188 == var2) {
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
					return class58.method230(var12, var2) - class58.method230(var13, var2);
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
					return class58.method230(var13, var2) - class58.method230(var14, var2);
				}
			}
			return 0;
		}
	}
}
