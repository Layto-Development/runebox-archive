import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ns")
public class class174 implements class425 {
	@ObfInfo(name = "ae", desc = "Lns;")
	public static final class174 field1600;
	@ObfInfo(name = "at", desc = "Lns;")
	public static final class174 field1601;
	@ObfInfo(name = "ao", desc = "Lns;")
	public static final class174 field1602;
	@ObfInfo(name = "ai", desc = "Lns;")
	public static final class174 field1604;
	@ObfInfo(name = "au", desc = "Lns;")
	public static final class174 field1606;
	@ObfInfo(name = "ac", desc = "Lns;")
	public static final class174 field1607;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1820413047)
	final int field1603;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public final String field1605;

	static {
		field1606 = new class174("runescape", "RuneScape", 0);
		field1600 = new class174("stellardawn", "Stellar Dawn", 1);
		field1602 = new class174("game3", "Game 3", 2);
		field1601 = new class174("game4", "Game 4", 3);
		field1607 = new class174("game5", "Game 5", 4);
		field1604 = new class174("oldscape", "RuneScape 2007", 5);
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;Ljava/lang/String;I)V")
	class174(String var1, String var2, int var3) {
		this.field1605 = var1;
		this.field1603 = var3;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field1603;
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lon;I)I", opaqueValue = "-999796722")
	public static int method964(CharSequence var0, CharSequence var1, class67 var2) {
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

			var8 = class261.method1369(var10);
			var9 = class261.method1369(var11);
			var10 = class261.method1368(var10, var2);
			var11 = class261.method1368(var11, var2);
			if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var10 != var11) {
					return class261.method1367(var10, var2) - class261.method1367(var11, var2);
				}
			}
		}

		int var17 = Math.min(var4, var5);

		char var13;
		int var18;
		for (var18 = 0; var18 < var17; ++var18) {
			if (class67.field759 == var2) {
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
					return class261.method1367(var12, var2) - class261.method1367(var13, var2);
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
					return class261.method1367(var13, var2) - class261.method1367(var14, var2);
				}
			}

			return 0;
		}
	}
}
