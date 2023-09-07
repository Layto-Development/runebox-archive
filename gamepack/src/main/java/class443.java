import java.util.ArrayList;
import java.util.Iterator;

public class class443 extends class510 {
    static class289 field3003;

    static {
        field3003 = new class289(128);
    }

    class208[] field3012;
    int field3007;
    int field3009;
    int field3010;
    int field3011;
    int[] field3004;
    int[] field3005;
    String field3008;
    String[] field3006;

    class443() {
    }

    static class443 method2022(int var0) {
        class443 var2 = (class443) field3003.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class249.field1902.method188(var0, 0);
            if (null == var3) {
                return null;
            } else {
                var2 = method2023(var3);
                field3003.method1306(var2, var0);
                return var2;
            }
        }
    }

    static class443 method2025(int var0, int var1, int var2) {
        int var4 = (var1 << 8) + var0;
        class443 var6 = method2024(var4, var0);
        if (null != var6) {
            return var6;
        } else {
            int var7 = (-3 - var2 << 8) + var0;
            var6 = method2024(var7, var0);
            if (null != var6) {
                return var6;
            } else {
                int var8 = var0 + -512;
                var6 = method2024(var8, var0);
                return var6;
            }
        }
    }

    static class443 method2024(int var0, int var1) {
        class443 var3 = (class443) field3003.method1307(var0 << 16);
        if (null != var3) {
            return var3;
        } else {
            String var4 = String.valueOf(var0);
            int var5 = class249.field1902.method213(var4);
            if (var5 == -1) {
                return null;
            } else {
                byte[] var6 = class249.field1902.method195(var5);
                if (null != var6) {
                    if (var6.length <= 1) {
                        return null;
                    }

                    var3 = method2023(var6);
                    if (var3 != null) {
                        field3003.method1306(var3, var0 << 16);
                        return var3;
                    }
                }

                return null;
            }
        }
    }

    public static void method2021(int var0, int var1) {
        class141.method654(var0, var1, 0, 0);
        class141.field1241.clear();
        class141.field1242.clear();
        if (class141.field1240.isEmpty() || var0 == 0 && var1 == 0) {
            class141.method655();
        } else {
            class141.field1242.add(new class416(null, class141.field1244));
            class141.field1242.add(new class473(null, 0, false, class141.field1245));
            ArrayList<class537> var4 = new ArrayList<class537>();
            Iterator<class537> var5 = class141.field1240.iterator();

            while (var5.hasNext()) {
                class537 var6 = var5.next();
                var4.add(var6);
            }

            class141.field1242.add(new class184(null, var4));
        }

    }

    static class443 method2023(byte[] var0) {
        class443 var2 = new class443();
        class78 var3 = new class78(var0);
        var3.field697 = var3.field695.length - 2;
        int var4 = var3.method309();
        int var5 = var3.field695.length - 2 - var4 - 12;
        var3.field697 = var5;
        int var6 = var3.method264();
        var2.field3007 = var3.method309();
        var2.field3011 = var3.method309();
        var2.field3009 = var3.method309();
        var2.field3010 = var3.method309();
        int var7 = var3.method260();
        int var8;
        int var9;
        if (var7 > 0) {
            var2.field3012 = var2.method2019(var7);

            for (var8 = 0; var8 < var7; ++var8) {
                var9 = var3.method309();
                class208 var10 = new class208(var9 > 0 ? class82.method332(var9) : 1);
                var2.field3012[var8] = var10;

                while (var9-- > 0) {
                    int var11 = var3.method264();
                    int var12 = var3.method264();
                    var10.method994(new class170(var12), var11);
                }
            }
        }

        var3.field697 = 0;
        var2.field3008 = var3.method319();
        var2.field3004 = new int[var6];
        var2.field3005 = new int[var6];
        var2.field3006 = new String[var6];

        for (var8 = 0; var3.field697 < var5; var2.field3004[var8++] = var9) {
            var9 = var3.method309();
            if (var9 == 3) {
                var2.field3006[var8] = var3.method268();
            } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
                var2.field3005[var8] = var3.method264();
            } else {
                var2.field3005[var8] = var3.method260();
            }
        }

        return var2;
    }

    static final void method2020(int var0) {
        Client.method2491();
        switch (var0) {
            case 1:
                class500.method2271();
                break;
            case 2:
                class500.method2256(24);
                class500.method2268(class32.field403, class32.field404, class32.field405);
        }

    }

    class208[] method2019(int var1) {
        return new class208[var1];
    }
}
