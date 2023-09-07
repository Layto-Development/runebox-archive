public class class450 {
    static final int[] field3107;

    static {
        field3107 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};
    }

    class450() throws Throwable {
    }

    public static class46 method2078(int var0, String var1, class492 var2, int var3) {
        class46 var5 = class46.method134(class488.field3534, Client.field3840.field2238);
        var5.field541.method249(0);
        int var6 = var5.field541.field697;
        var5.field541.method249(var0);
        String var7 = var1.toLowerCase();
        int var8 = 0;
        byte[] var9 = null;
        if (var7.startsWith(class32.field273)) {
            var8 = 0;
            var1 = var1.substring(class32.field273.length());
        } else if (var7.startsWith(class32.field364)) {
            var8 = 1;
            var1 = var1.substring(class32.field364.length());
        } else if (var7.startsWith(class32.field275)) {
            var8 = 2;
            var1 = var1.substring(class32.field275.length());
        } else if (var7.startsWith(class32.field366)) {
            var8 = 3;
            var1 = var1.substring(class32.field366.length());
        } else if (var7.startsWith(class32.field245)) {
            var8 = 4;
            var1 = var1.substring(class32.field245.length());
        } else if (var7.startsWith(class32.field368)) {
            var8 = 5;
            var1 = var1.substring(class32.field368.length());
        } else if (var7.startsWith(class32.field369)) {
            var8 = 6;
            var1 = var1.substring(class32.field369.length());
        } else if (var7.startsWith(class32.field180)) {
            var8 = 7;
            var1 = var1.substring(class32.field180.length());
        } else if (var7.startsWith(class32.field215)) {
            var8 = 8;
            var1 = var1.substring(class32.field215.length());
        } else if (var7.startsWith(class32.field237)) {
            var8 = 9;
            var1 = var1.substring(class32.field237.length());
        } else if (var7.startsWith(class32.field281)) {
            var8 = 10;
            var1 = var1.substring(class32.field281.length());
        } else if (var7.startsWith(class32.field374)) {
            var8 = 11;
            var1 = var1.substring(class32.field374.length());
        } else if (var7.startsWith(class32.field291)) {
            var8 = 12;
            var1 = var1.substring(class32.field291.length());
        } else if (var7.startsWith(class32.field376)) {
            var9 = method2077(var7);
            if (null != var9) {
                var8 = var9.length + 12;
                var1 = var1.substring(class32.field376.length() + var9.length + 1);
            }
        }

        var7 = var1.toLowerCase();
        byte var10 = 0;
        if (var7.startsWith(class32.field377)) {
            var10 = 1;
            var1 = var1.substring(class32.field377.length());
        } else if (var7.startsWith(class32.field378)) {
            var10 = 2;
            var1 = var1.substring(class32.field378.length());
        } else if (var7.startsWith(class32.field227)) {
            var10 = 3;
            var1 = var1.substring(class32.field227.length());
        } else if (var7.startsWith(class32.field380)) {
            var10 = 4;
            var1 = var1.substring(class32.field380.length());
        } else if (var7.startsWith(class32.field264)) {
            var10 = 5;
            var1 = var1.substring(class32.field264.length());
        }

        var5.field541.method249(var8);
        var5.field541.method249(var10);
        if (null != var9 && Client.field3957 >= 214) {
            for (int var11 = 0; var11 < var9.length; ++var11) {
                var5.field541.method249(var9[var11]);
            }
        }

        class385.method1781(var5.field541, var1);
        if (var0 == class361.field2590.method1533()) {
            var5.field541.method249(var3);
        }

        var5.field541.method258(var5.field541.field697 - var6);
        return var5;
    }

    static byte[] method2077(String var0) {
        boolean var2 = true;
        boolean var3 = true;
        int var4 = class32.field376.length();
        int var5 = 0;
        byte[] var6 = new byte[8];

        while (true) {
            int var7 = var5 + var4;
            if (var7 >= var0.length()) {
                return null;
            }

            char var8 = var0.charAt(var7);
            if (var8 == ':') {
                if (var5 == 0) {
                    return null;
                }

                byte[] var9 = new byte[var5];
                System.arraycopy(var6, 0, var9, 0, var5);
                return var9;
            }

            if (var6.length == var5) {
                return null;
            }

            if (var8 >= '0' && var8 <= '9') {
                var8 = (char) (var8 - '0');
            } else {
                if (var8 < 'a' || var8 > 'z') {
                    return null;
                }

                var8 = (char) (var8 - 'W');
            }

            var6[var5++] = (byte) var8;
        }
    }

    public static int[] method2079(byte[] var0) {
        if (var0 != null && var0.length != 0 && var0.length <= 8) {
            int[] var2 = new int[var0.length];

            for (int var3 = 0; var3 < var0.length; ++var3) {
                if (var0[var3] < 0 || var0[var3] > field3107.length) {
                    return null;
                }

                var2[var3] = field3107[var0[var3]];
            }

            return var2;
        } else {
            return null;
        }
    }
}
