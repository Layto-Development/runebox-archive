public class class334 {
    static final class110 field2433;
    static final class110 field2434;
    public static class364 field2431;
    public static int[] field2426;
    public static int[] field2427;
    public static int[] field2429;
    static class110 field2432;
    static int[] field2428;
    static int[] field2430;

    static {
        field2426 = new int[65536];
        field2430 = new int[512];
        field2428 = new int[2048];
        field2429 = new int[2048];
        field2427 = new int[2048];

        int var0;
        for (var0 = 1; var0 < 512; ++var0) {
            field2430[var0] = 32768 / var0;
        }

        for (var0 = 1; var0 < 2048; ++var0) {
            field2428[var0] = 65536 / var0;
        }

        for (var0 = 0; var0 < 2048; ++var0) {
            field2429[var0] = (int) (65536.0D * Math.sin((double) var0 * 0.0030679615D));
            field2427[var0] = (int) (65536.0D * Math.cos((double) var0 * 0.0030679615D));
        }

        field2431 = new class364();
        field2433 = new class233(field2431);
        field2434 = new class314(field2431);
        field2432 = field2433;
    }

    class334() throws Throwable {
    }

    public static void method1580(boolean var0) {
        if (var0 && class415.field2906 != null) {
            field2432 = field2434;
        } else {
            field2432 = field2433;
        }

    }

    public static void method1568(class302 var0) {
        field2431.field2606 = var0;
    }

    public static void method1569(double var0) {
        method1587(var0, 0, 512);
    }

    static void method1587(double var0, int var2, int var3) {
        int var4 = 0;

        for (int var5 = 0; var5 < 512; ++var5) {
            double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
            double var8 = (double) (var5 & 7) / 8.0D + 0.0625D;

            for (int var10 = 0; var10 < 128; ++var10) {
                double var11 = (double) var10 / 128.0D;
                double var13 = var11;
                double var15 = var11;
                double var17 = var11;
                if (var8 != 0.0D) {
                    double var19;
                    if (var11 < 0.5D) {
                        var19 = var11 * (var8 + 1.0D);
                    } else {
                        var19 = var11 + var8 - var11 * var8;
                    }

                    double var21 = var11 * 2.0D - var19;
                    double var23 = var6 + 0.3333333333333333D;
                    if (var23 > 1.0D) {
                        --var23;
                    }

                    double var27 = var6 - 0.3333333333333333D;
                    if (var27 < 0.0D) {
                        ++var27;
                    }

                    if (var23 * 6.0D < 1.0D) {
                        var13 = var21 + (var19 - var21) * 6.0D * var23;
                    } else if (var23 * 2.0D < 1.0D) {
                        var13 = var19;
                    } else if (var23 * 3.0D < 2.0D) {
                        var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
                    } else {
                        var13 = var21;
                    }

                    if (var6 * 6.0D < 1.0D) {
                        var15 = var21 + (var19 - var21) * 6.0D * var6;
                    } else if (var6 * 2.0D < 1.0D) {
                        var15 = var19;
                    } else if (var6 * 3.0D < 2.0D) {
                        var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
                    } else {
                        var15 = var21;
                    }

                    if (var27 * 6.0D < 1.0D) {
                        var17 = var21 + (var19 - var21) * 6.0D * var27;
                    } else if (var27 * 2.0D < 1.0D) {
                        var17 = var19;
                    } else if (var27 * 3.0D < 2.0D) {
                        var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
                    } else {
                        var17 = var21;
                    }
                }

                int var29 = (int) (var13 * 256.0D);
                int var20 = (int) (var15 * 256.0D);
                int var30 = (int) (var17 * 256.0D);
                int var22 = (var29 << 16) + (var20 << 8) + var30;
                var22 = method1586(var22, var0);
                if (var22 == 0) {
                    var22 = 1;
                }

                field2426[var4++] = var22;
            }
        }

    }

    static int method1586(int var0, double var1) {
        double var3 = (double) (var0 >> 16) / 256.0D;
        double var5 = (double) (var0 >> 8 & 255) / 256.0D;
        double var7 = (double) (var0 & 255) / 256.0D;
        var3 = Math.pow(var3, var1);
        var5 = Math.pow(var5, var1);
        var7 = Math.pow(var7, var1);
        int var9 = (int) (var3 * 256.0D);
        int var10 = (int) (var5 * 256.0D);
        int var11 = (int) (var7 * 256.0D);
        return (var9 << 16) + (var10 << 8) + var11;
    }

    static int method1571() {
        return field2431.field2604;
    }

    static int method1572() {
        return field2431.field2613;
    }

    static int method1573() {
        return field2431.field2609;
    }

    static int method1570() {
        return field2431.field2615;
    }

    static int method1574() {
        return field2431.field2617;
    }

    static int method1575() {
        return field2431.field2616;
    }

    public static int method1576() {
        return field2431.field2607;
    }

    static int method1577() {
        return field2431.field2612;
    }

    public static void method1578(int[] var0, int var1, int var2, float[] var3) {
        if (var3 == null && field2432 == field2434) {
            field2432 = field2433;
        }

        field2432.method508(var0, var1, var2, var3);
    }

    public static void method1579() {
        method1588(class415.field2908, class415.field2909, class415.field2902, class415.field2907);
    }

    static void method1588(int var0, int var1, int var2, int var3) {
        field2431.field2612 = var2 - var0;
        field2431.field2610 = var3 - var1;
        method1581();
        if (field2431.field2614.length < field2431.field2610) {
            field2431.field2614 = new int[class82.method332(field2431.field2610)];
        }

        int var4 = var1 * class415.field2903 + var0;

        for (int var5 = 0; var5 < field2431.field2610; ++var5) {
            field2431.field2614[var5] = var4;
            var4 += class415.field2903;
        }

    }

    public static void method1581() {
        field2431.method1717();
    }

    public static void method1590(int var0, int var1) {
        int var2 = field2431.field2614[0];
        int var3 = var2 / class415.field2903;
        int var4 = var2 - var3 * class415.field2903;
        field2431.method1719(var0, var4, var1, var3);
    }

    public static void method1582(int var0, int var1, int var2) {
        field2431.method1718(var0, var1, var2);
    }

    static void method1585(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
        field2432.method512(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
    }

    public static void method1592(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
        field2432.method513(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    static void method1583(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
        field2432.method514(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
    }

    static void method1584(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
        field2432.method511(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
    }

    static void method1589(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
        field2432.method510(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
    }

    static void method1591(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
        field2432.method507(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
    }
}
