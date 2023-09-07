public class class475 extends class510 {
    public static class289 field3404;
    public static class68 field3409;
    static class331[] field3399;

    static {
        field3404 = new class289(64);
    }

    public boolean field3400;
    public int field3397;
    public int field3398;
    public int field3401;
    public int field3402;
    public int field3403;
    public int field3405;
    public int field3406;
    public int field3407;
    public int field3408;

    public class475() {
        this.field3398 = 0;
        this.field3397 = -1;
        this.field3400 = true;
        this.field3401 = -1;
    }

    public static void method2182(class68 var0) {
        field3409 = var0;
    }

    public static void method2181() {
        field3404.method1304();
    }

    public void method2178() {
        if (this.field3401 != -1) {
            this.method2180(this.field3401);
            this.field3406 = this.field3402;
            this.field3405 = this.field3403;
            this.field3407 = this.field3408;
        }

        this.method2180(this.field3398);
    }

    public void method2179(class78 var1, int var2) {
        while (true) {
            int var4 = var1.method260();
            if (var4 == 0) {
                return;
            }

            this.method2177(var1, var4, var2);
        }
    }

    void method2177(class78 var1, int var2, int var3) {
        if (var2 == 1) {
            this.field3398 = var1.method316();
        } else if (var2 == 2) {
            this.field3397 = var1.method260();
        } else if (var2 == 5) {
            this.field3400 = false;
        } else if (var2 == 7) {
            this.field3401 = var1.method316();
        } else if (var2 == 8) {
        }

    }

    void method2180(int var1) {
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
                var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var11 == var3) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
                var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if (var11 == var7) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }

        var13 /= 6.0D;
        this.field3402 = (int) (var13 * 256.0D);
        this.field3403 = (int) (var15 * 256.0D);
        this.field3408 = (int) (var17 * 256.0D);
        if (this.field3403 < 0) {
            this.field3403 = 0;
        } else if (this.field3403 > 255) {
            this.field3403 = 255;
        }

        if (this.field3408 < 0) {
            this.field3408 = 0;
        } else if (this.field3408 > 255) {
            this.field3408 = 255;
        }

    }
}
