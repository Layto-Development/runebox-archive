public class class274 {
    static int field2004;
    static int field2005;
    static int[] field2003;

    class274() throws Throwable {
    }

    public static class539[] method1220(class68 var0, int var1, int var2) {
        return !method1222(var0, var1, var2) ? null : method1221();
    }

    public static class331[] method1231(class68 var0, int var1, int var2) {
        return !method1222(var0, var1, var2) ? null : method1230();
    }

    public static class413 method1229(class68 var0, class68 var1, int var2, int var3) {
        return !method1222(var0, var2, var3) ? null : method1227(var1.method188(var2, var3));
    }

    public static class539[] method1228(class68 var0, String var1, String var2) {
        if (!var0.method210(var1, var2)) {
            return null;
        } else {
            int var4 = var0.method213(var1);
            int var5 = var0.method205(var4, var2);
            return method1220(var0, var4, var5);
        }
    }

    public static class539 method1226(class68 var0, String var1, String var2) {
        if (!var0.method210(var1, var2)) {
            return null;
        } else {
            int var4 = var0.method213(var1);
            int var5 = var0.method205(var4, var2);
            class539 var6;
            if (!method1222(var0, var4, var5)) {
                var6 = null;
            } else {
                var6 = method1232();
            }

            return var6;
        }
    }

    public static class331[] method1219(class68 var0, String var1, String var2) {
        if (!var0.method210(var1, var2)) {
            return null;
        } else {
            int var4 = var0.method213(var1);
            int var5 = var0.method205(var4, var2);
            return method1231(var0, var4, var5);
        }
    }

    static class539[] method1221() {
        class539[] var1 = new class539[field2004];

        for (int var2 = 0; var2 < field2004; ++var2) {
            class539 var3 = var1[var2] = new class539();
            var3.field4284 = field2005;
            var3.field4289 = class168.field1432;
            var3.field4283 = field2003[var2];
            var3.field4288 = class128.field1144[var2];
            var3.field4285 = class58.field607[var2];
            var3.field4286 = class42.field527[var2];
            var3.field4290 = class48.field548;
            var3.field4287 = class258.field1932[var2];
        }

        field2003 = null;
        class128.field1144 = null;
        class58.field607 = null;
        class42.field527 = null;
        class48.field548 = null;
        class258.field1932 = null;
        return var1;
    }

    public static class539 method1232() {
        class539 var1 = new class539();
        var1.field4284 = field2005;
        var1.field4289 = class168.field1432;
        var1.field4283 = field2003[0];
        var1.field4288 = class128.field1144[0];
        var1.field4285 = class58.field607[0];
        var1.field4286 = class42.field527[0];
        var1.field4290 = class48.field548;
        var1.field4287 = class258.field1932[0];
        field2003 = null;
        class128.field1144 = null;
        class58.field607 = null;
        class42.field527 = null;
        class48.field548 = null;
        class258.field1932 = null;
        return var1;
    }

    static class331[] method1230() {
        class331[] var1 = new class331[field2004];

        for (int var2 = 0; var2 < field2004; ++var2) {
            class331 var3 = var1[var2] = new class331();
            var3.field2420 = field2005;
            var3.field2421 = class168.field1432;
            var3.field2417 = field2003[var2];
            var3.field2418 = class128.field1144[var2];
            var3.field2423 = class58.field607[var2];
            var3.field2419 = class42.field527[var2];
            int var4 = var3.field2423 * var3.field2419;
            byte[] var5 = class258.field1932[var2];
            var3.field2422 = new int[var4];

            for (int var6 = 0; var6 < var4; ++var6) {
                var3.field2422[var6] = class48.field548[var5[var6] & 255];
            }
        }

        field2003 = null;
        class128.field1144 = null;
        class58.field607 = null;
        class42.field527 = null;
        class48.field548 = null;
        class258.field1932 = null;
        return var1;
    }

    static class331 method1224() {
        class331 var1 = new class331();
        var1.field2420 = field2005;
        var1.field2421 = class168.field1432;
        var1.field2417 = field2003[0];
        var1.field2418 = class128.field1144[0];
        var1.field2423 = class58.field607[0];
        var1.field2419 = class42.field527[0];
        int var2 = var1.field2419 * var1.field2423;
        byte[] var3 = class258.field1932[0];
        var1.field2422 = new int[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            var1.field2422[var4] = class48.field548[var3[var4] & 255];
        }

        field2003 = null;
        class128.field1144 = null;
        class58.field607 = null;
        class42.field527 = null;
        class48.field548 = null;
        class258.field1932 = null;
        return var1;
    }

    static class413 method1227(byte[] var0) {
        if (null == var0) {
            return null;
        } else {
            class413 var2 = new class413(var0, field2003, class128.field1144, class58.field607, class42.field527, class48.field548, class258.field1932);
            field2003 = null;
            class128.field1144 = null;
            class58.field607 = null;
            class42.field527 = null;
            class48.field548 = null;
            class258.field1932 = null;
            return var2;
        }
    }

    static boolean method1222(class68 var0, int var1, int var2) {
        byte[] var4 = var0.method188(var1, var2);
        if (null == var4) {
            return false;
        } else {
            method1225(var4);
            return true;
        }
    }

    public static boolean method1223(class68 var0, int var1) {
        byte[] var3 = var0.method195(var1);
        if (null == var3) {
            return false;
        } else {
            method1225(var3);
            return true;
        }
    }

    static void method1225(byte[] var0) {
        class78 var2 = new class78(var0);
        var2.field697 = var0.length - 2;
        field2004 = var2.method309();
        field2003 = new int[field2004];
        class128.field1144 = new int[field2004];
        class58.field607 = new int[field2004];
        class42.field527 = new int[field2004];
        class258.field1932 = new byte[field2004][];
        var2.field697 = var0.length - 7 - field2004 * 8;
        field2005 = var2.method309();
        class168.field1432 = var2.method309();
        int var3 = (var2.method260() & 255) + 1;

        int var4;
        for (var4 = 0; var4 < field2004; ++var4) {
            field2003[var4] = var2.method309();
        }

        for (var4 = 0; var4 < field2004; ++var4) {
            class128.field1144[var4] = var2.method309();
        }

        for (var4 = 0; var4 < field2004; ++var4) {
            class58.field607[var4] = var2.method309();
        }

        for (var4 = 0; var4 < field2004; ++var4) {
            class42.field527[var4] = var2.method309();
        }

        var2.field697 = var0.length - 7 - field2004 * 8 - (var3 - 1) * 3;
        class48.field548 = new int[var3];

        for (var4 = 1; var4 < var3; ++var4) {
            class48.field548[var4] = var2.method316();
            if (class48.field548[var4] == 0) {
                class48.field548[var4] = 1;
            }
        }

        var2.field697 = 0;

        for (var4 = 0; var4 < field2004; ++var4) {
            int var5 = class58.field607[var4];
            int var6 = class42.field527[var4];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            class258.field1932[var4] = var8;
            int var9 = var2.method260();
            int var10;
            if (var9 == 0) {
                for (var10 = 0; var10 < var7; ++var10) {
                    var8[var10] = var2.method261();
                }
            } else if (var9 == 1) {
                for (var10 = 0; var10 < var5; ++var10) {
                    for (int var11 = 0; var11 < var6; ++var11) {
                        var8[var10 + var5 * var11] = var2.method261();
                    }
                }
            }
        }

    }
}
