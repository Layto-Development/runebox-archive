public class class120 implements class330 {
    public static final class120 field1086;
    public static final class120 field1087;
    public static final class120 field1088;
    public static final class120 field1090;
    public static final class120 field1092;
    public static final class120 field1093;

    static {
        field1092 = new class120("runescape", "RuneScape", 0);
        field1086 = new class120("stellardawn", "Stellar Dawn", 1);
        field1088 = new class120("game3", "Game 3", 2);
        field1087 = new class120("game4", "Game 4", 3);
        field1093 = new class120("game5", "Game 5", 4);
        field1090 = new class120("oldscape", "RuneScape 2007", 5);
    }

    public final String field1091;
    final int field1089;

    class120(String var1, String var2, int var3) {
        this.field1091 = var1;
        this.field1089 = var3;
    }

    public static int method536(CharSequence var0, CharSequence var1, class492 var2) {
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

            var8 = class414.method1906(var10);
            var9 = class414.method1906(var11);
            var10 = class414.method1905(var10, var2);
            var11 = class414.method1905(var11, var2);
            if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                var10 = Character.toLowerCase(var10);
                var11 = Character.toLowerCase(var11);
                if (var10 != var11) {
                    return class414.method1904(var10, var2) - class414.method1904(var11, var2);
                }
            }
        }

        int var17 = Math.min(var4, var5);

        char var13;
        int var18;
        for (var18 = 0; var18 < var17; ++var18) {
            if (class492.field3612 == var2) {
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
                    return class414.method1904(var12, var2) - class414.method1904(var13, var2);
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
                    return class414.method1904(var13, var2) - class414.method1904(var14, var2);
                }
            }

            return 0;
        }
    }

    @Override
    public int method1533() {
        return this.field1089;
    }
}
