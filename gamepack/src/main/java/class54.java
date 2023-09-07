import java.util.Arrays;

public class class54 {
    public long field594;
    class247 field593;
    long field595;

    public class54(class78 var1) {
        this.field594 = -1L;
        this.field593 = new class247();
        this.method159(var1);
    }

    static void method162(float[] var0) {
        var0[1] = 1.0F - var0[1];
        if (var0[0] < 0.0F) {
            var0[0] = 0.0F;
        }

        if (var0[1] < 0.0F) {
            var0[1] = 0.0F;
        }

        if (var0[0] > 1.0F || var0[1] > 1.0F) {
            float var2 = (float) (1.0D + (double) (var0[0] * (var0[0] - 2.0F + var0[1])) + ((double) var0[1] - 2.0D) * (double) var0[1]);
            if (var2 + class151.field1307 > 0.0F) {
                if (class151.field1307 + var0[0] < 1.3333334F) {
                    float var3 = var0[0] - 2.0F;
                    float var4 = var0[0] - 1.0F;
                    float var5 = (float) Math.sqrt(var3 * var3 - var4 * 4.0F * var4);
                    float var6 = 0.5F * (var5 + -var3);
                    if (var0[1] + class151.field1307 > var6) {
                        var0[1] = var6 - class151.field1307;
                    } else {
                        var6 = (-var3 - var5) * 0.5F;
                        if (var0[1] < var6 + class151.field1307) {
                            var0[1] = class151.field1307 + var6;
                        }
                    }
                } else {
                    var0[0] = 1.3333334F - class151.field1307;
                    var0[1] = 0.33333334F - class151.field1307;
                }
            }
        }

        var0[1] = 1.0F - var0[1];
    }

    public static void method161(class97 var0, class52 var1, boolean var2) {
        var0.field833 = 7;
        var0.field847 = new class52(var1);
        if (!var2) {
            var0.field847.field576 = Arrays.copyOf(var0.field847.field589, var0.field847.field589.length);
            var0.field847.method153();
        }

    }

    void method159(class78 var1) {
        this.field595 = var1.method265();
        this.field594 = var1.method265();

        for (int var3 = var1.method260(); var3 != 0; var3 = var1.method260()) {
            Object var4;
            if (var3 == 1) {
                var4 = new class538(this);
            } else if (var3 == 4) {
                var4 = new class227(this);
            } else if (var3 == 3) {
                var4 = new class270(this);
            } else if (var3 == 2) {
                var4 = new class59(this);
            } else {
                if (var3 != 5) {
                    throw new RuntimeException("");
                }

                var4 = new class30(this);
            }

            ((class493) var4).method2244(var1);
            this.field593.method1100((class70) var4);
        }

    }

    public void method160(class315 var1) {
        if (var1.field658 == this.field595 && var1.field2268 == this.field594) {
            for (class493 var3 = (class493) this.field593.method1106(); null != var3; var3 = (class493) this.field593.method1102()) {
                var3.method2245(var1);
            }

            ++var1.field2268;
        } else {
            throw new RuntimeException("");
        }
    }
}
