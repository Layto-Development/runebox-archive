public class class96 {
    public static int[] field775;
    static class133 field777;
    static int[] field776;
    static int[] field778;

    static {
        field776 = new int[32768];

        for (int var0 = 0; var0 < 32768; ++var0) {
            field776[var0] = method379(var0);
        }

        method381();
    }

    class96() throws Throwable {
    }

    static final int method379(int var0) {
        double var2 = (double) (var0 >> 10 & 31) / 31.0D;
        double var4 = (double) (var0 >> 5 & 31) / 31.0D;
        double var6 = (double) (var0 & 31) / 31.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }

        if (var6 < var8) {
            var8 = var6;
        }

        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }

        if (var6 > var10) {
            var10 = var6;
        }

        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var10 + var8) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }

            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }

            if (var10 == var2) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = 2.0D + (var6 - var2) / (var10 - var8);
            } else if (var6 == var10) {
                var12 = 4.0D + (var2 - var4) / (var10 - var8);
            }
        }

        int var18 = (int) (var12 * 256.0D / 6.0D);
        var18 &= 255;
        double var19 = var14 * 256.0D;
        if (var19 < 0.0D) {
            var19 = 0.0D;
        } else if (var19 > 255.0D) {
            var19 = 255.0D;
        }

        if (var16 > 0.7D) {
            var19 /= 2.0D;
            var19 = Math.floor(var19);
        }

        if (var16 > 0.75D) {
            var19 /= 2.0D;
            var19 = Math.floor(var19);
        }

        if (var16 > 0.85D) {
            var19 /= 2.0D;
            var19 = Math.floor(var19);
        }

        if (var16 > 0.95D) {
            var19 /= 2.0D;
            var19 = Math.floor(var19);
        }

        if (var16 > 0.995D) {
            var16 = 0.995D;
        }

        int var21 = (int) ((double) (var18 / 4 * 8) + var19 / 32.0D);
        return (int) (var16 * 128.0D) + (var21 << 7);
    }

    static void method381() {
        if (field775 == null) {
            field775 = new int[65536];
            double var1 = 0.949999988079071D;

            for (int var3 = 0; var3 < 65536; ++var3) {
                double var4 = 0.0078125D + (double) (var3 >> 10 & 63) / 64.0D;
                double var6 = 0.0625D + (double) (var3 >> 7 & 7) / 8.0D;
                double var8 = (double) (var3 & 127) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (0.0D != var6) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = var8 * (var6 + 1.0D);
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }

                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }

                    double var24 = var4 - 0.3333333333333333D;
                    if (var24 < 0.0D) {
                        ++var24;
                    }

                    if (var20 * 6.0D < 1.0D) {
                        var10 = var20 * 6.0D * (var16 - var18) + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (var20 * 3.0D < 2.0D) {
                        var10 = var18 + (var16 - var18) * (0.6666666666666666D - var20) * 6.0D;
                    } else {
                        var10 = var18;
                    }

                    if (var4 * 6.0D < 1.0D) {
                        var12 = var18 + (var16 - var18) * 6.0D * var4;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (var4 * 3.0D < 2.0D) {
                        var12 = 6.0D * (var16 - var18) * (0.6666666666666666D - var4) + var18;
                    } else {
                        var12 = var18;
                    }

                    if (var24 * 6.0D < 1.0D) {
                        var14 = 6.0D * (var16 - var18) * var24 + var18;
                    } else if (var24 * 2.0D < 1.0D) {
                        var14 = var16;
                    } else if (var24 * 3.0D < 2.0D) {
                        var14 = var18 + (0.6666666666666666D - var24) * (var16 - var18) * 6.0D;
                    } else {
                        var14 = var18;
                    }
                }

                var10 = Math.pow(var10, var1);
                var12 = Math.pow(var12, var1);
                var14 = Math.pow(var14, var1);
                int var26 = (int) (var10 * 256.0D);
                int var17 = (int) (var12 * 256.0D);
                int var27 = (int) (var14 * 256.0D);
                int var19 = (var26 << 16) + (var17 << 8) + var27;
                field775[var3] = var19 & 16777215;
            }

        }
    }

    public static int method380(int var0) {
        return 255 - (var0 & 255);
    }

    static int method382() {
        return class500.field3665;
    }
}
