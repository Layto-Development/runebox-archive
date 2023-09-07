public class class470 extends class510 {
    public static class289 field3360;
    public static class68 field3359;

    static {
        field3360 = new class289(64);
    }

    public int field3362;
    public int field3363;
    public int field3364;
    public int field3365;
    int field3361;

    public class470() {
        this.field3361 = 0;
    }

    public static void method2175(class68 var0) {
        field3359 = var0;
    }

    public void method2171() {
        this.method2174(this.field3361);
    }

    public void method2172(class78 var1, int var2) {
        while (true) {
            int var4 = var1.method260();
            if (var4 == 0) {
                return;
            }

            this.method2173(var1, var4, var2);
        }
    }

    void method2173(class78 var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3361 = var1.method316();
        }

    }

    void method2174(int var1) {
        double var3 = (double) (var1 >> 16 & 255) / 256.0D;
        double var5 = (double) (var1 >> 8 & 255) / 256.0D;
        double var7 = (double) (var1 & 255) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }

        if (var7 < var9) {
            var9 = var7;
        }

        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }

        if (var7 > var11) {
            var11 = var7;
        }

        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var11 != var9) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var11 == var7) {
                var13 = 4.0D + (var3 - var5) / (var11 - var9);
            }
        }

        var13 /= 6.0D;
        this.field3363 = (int) (var15 * 256.0D);
        this.field3362 = (int) (var17 * 256.0D);
        if (this.field3363 < 0) {
            this.field3363 = 0;
        } else if (this.field3363 > 255) {
            this.field3363 = 255;
        }

        if (this.field3362 < 0) {
            this.field3362 = 0;
        } else if (this.field3362 > 255) {
            this.field3362 = 255;
        }

        if (var17 > 0.5D) {
            this.field3364 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3364 = (int) (var15 * var17 * 512.0D);
        }

        if (this.field3364 < 1) {
            this.field3364 = 1;
        }

        this.field3365 = (int) (var13 * (double) this.field3364);
    }
}
