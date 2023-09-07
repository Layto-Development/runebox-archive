public class class368 {
    public static int field2634;
    public static long[] field2636;
    static boolean field2629;
    static boolean field2631;
    static int field2626;
    static int field2627;
    static int field2628;
    static int field2630;
    static int field2632;
    static int field2633;
    static int field2635;

    static {
        field2631 = false;
        field2627 = 0;
        field2630 = 0;
        field2629 = false;
        field2634 = 0;
        field2636 = new long[1000];
    }

    class368() throws Throwable {
    }

    public static long method1740(int var0) {
        return field2636[var0];
    }

    public static int method1734(int var0) {
        long var3 = field2636[var0];
        int var2 = (int) (var3 >>> 0 & 127L);
        return var2;
    }

    public static int method1733(int var0) {
        long var3 = field2636[var0];
        int var2 = (int) (var3 >>> 7 & 127L);
        return var2;
    }

    public static int method1738(long var0) {
        return (int) (var0 >>> 14 & 3L);
    }

    public static int method1739(long var0) {
        return (int) (var0 >>> 17 & 4294967295L);
    }

    public static long method1741(int var0, int var1, int var2, boolean var3, int var4) {
        long var6 = (long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long) var4 & 4294967295L) << 17;
        if (var3) {
            var6 |= 65536L;
        }

        return var6;
    }

    public static final void method1736(int var0, int var1) {
        field2627 = var0;
        field2630 = var1;
        field2631 = true;
        field2634 = 0;
        field2629 = false;
    }

    public static final void method1737() {
        field2631 = false;
        field2634 = 0;
    }

    static final boolean method1735() {
        return field2631;
    }

    static final void method1732() {
        if (!field2629) {
            int var1 = class158.field1365;
            int var2 = class158.field1366;
            int var3 = class158.field1399;
            int var4 = class158.field1367;
            boolean var5 = true;
            boolean var6 = true;
            int var7 = (field2627 - class334.method1571()) * 50 / class334.method1576();
            int var8 = (field2630 - class334.method1572()) * 50 / class334.method1576();
            int var9 = (field2627 - class334.method1571()) * 3500 / class334.method1576();
            int var10 = (field2630 - class334.method1572()) * 3500 / class334.method1576();
            int var11 = class134.method613(var8, 50, var2, var1);
            int var12 = 50 * var2 - var1 * var8 >> 16;
            var8 = var11;
            var11 = class134.method613(var10, 3500, var2, var1);
            int var13 = 3500 * var2 - var1 * var10 >> 16;
            var10 = var11;
            var11 = class134.method614(var7, var12, var4, var3);
            int var14 = class134.method615(var7, var12, var4, var3);
            var7 = var11;
            var11 = class134.method614(var9, var13, var4, var3);
            int var15 = class134.method615(var9, var13, var4, var3);
            field2626 = (var11 + var7) / 2;
            field2635 = (var8 + var10) / 2;
            field2632 = (var14 + var15) / 2;
            class376.field2725 = (var11 - var7) / 2;
            field2628 = (var10 - var8) / 2;
            class516.field4170 = (var15 - var14) / 2;
            field2633 = Math.abs(class376.field2725);
            class92.field763 = Math.abs(field2628);
            class458.field3151 = Math.abs(class516.field4170);
        }
    }
}
