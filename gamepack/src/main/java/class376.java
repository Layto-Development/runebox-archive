public class class376 {
    static int field2725;

    class376() throws Throwable {
    }

    public static final int method1764(double var0, double var2, double var4) {
        double var6 = var4;
        double var8 = var4;
        double var10 = var4;
        if (var2 != 0.0D) {
            double var12;
            if (var4 < 0.5D) {
                var12 = var4 * (var2 + 1.0D);
            } else {
                var12 = var4 + var2 - var4 * var2;
            }

            double var14 = var4 * 2.0D - var12;
            double var16 = var0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                --var16;
            }

            double var20 = var0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                ++var20;
            }

            if (var16 * 6.0D < 1.0D) {
                var6 = var16 * (var12 - var14) * 6.0D + var14;
            } else if (var16 * 2.0D < 1.0D) {
                var6 = var12;
            } else if (var16 * 3.0D < 2.0D) {
                var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
            } else {
                var6 = var14;
            }

            if (var0 * 6.0D < 1.0D) {
                var8 = var0 * 6.0D * (var12 - var14) + var14;
            } else if (var0 * 2.0D < 1.0D) {
                var8 = var12;
            } else if (var0 * 3.0D < 2.0D) {
                var8 = (var12 - var14) * (0.6666666666666666D - var0) * 6.0D + var14;
            } else {
                var8 = var14;
            }

            if (var20 * 6.0D < 1.0D) {
                var10 = var20 * 6.0D * (var12 - var14) + var14;
            } else if (var20 * 2.0D < 1.0D) {
                var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
                var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
            } else {
                var10 = var14;
            }
        }

        int var22 = (int) (var6 * 256.0D);
        int var13 = (int) (var8 * 256.0D);
        int var23 = (int) (var10 * 256.0D);
        int var15 = var23 + (var13 << 8) + (var22 << 16);
        return var15;
    }
}
