import java.util.HashMap;

public class class349 {
    static String field2533;
    final HashMap<Integer, class331> field2531;
    class8 field2530;
    int field2532;
    int[] field2528;
    int[] field2529;

    public class349() {
        this.field2531 = new HashMap<>();
        this.field2530 = new class8(0, 0);
        this.field2528 = new int[2048];
        this.field2529 = new int[2048];
        this.field2532 = 0;
        method1644();
    }

    static void method1644() {
        class508.field3768 = new int[2000];
        int var1 = 0;
        int var2 = 240;

        boolean var3;
        int var4;
        for (var3 = true; var1 < 16; var2 -= 12) {
            var4 = class376.method1764((float) var2 / 360.0F, 0.9998999834060669D, (float) var1 * 0.425F / 16.0F + 0.075F);
            class508.field3768[var1] = var4;
            ++var1;
        }

        var2 = 48;

        for (var3 = true; var1 < class508.field3768.length; var2 -= 8) {
            var4 = var1 * 2;

            for (int var5 = class376.method1764((float) var2 / 360.0F, 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class508.field3768.length; ++var1) {
                class508.field3768[var1] = var5;
            }
        }

    }

    void method1642(int var1) {
        int var3 = var1 * 2 + 1;
        double[] var4 = class418.method1935(0.0D, (float) var1 / 3.0F, var1);
        double var5 = var4[var1] * var4[var1];
        int[] var7 = new int[var3 * var3];
        boolean var8 = false;

        for (int var9 = 0; var9 < var3; ++var9) {
            for (int var10 = 0; var10 < var3; ++var10) {
                int var11 = var7[var10 + var9 * var3] = (int) (256.0D * (var4[var9] * var4[var10] / var5));
                if (!var8 && var11 > 0) {
                    var8 = true;
                }
            }
        }

        class331 var12 = new class331(var7, var3, var3);
        this.field2531.put(var1, var12);
    }

    class331 method1638(int var1) {
        if (!this.field2531.containsKey(var1)) {
            this.method1642(var1);
        }

        return this.field2531.get(var1);
    }

    public final void method1639(int var1, int var2) {
        if (this.field2532 < this.field2528.length) {
            this.field2528[this.field2532] = var1;
            this.field2529[this.field2532] = var2;
            ++this.field2532;
        }
    }

    public final void method1640() {
        this.field2532 = 0;
    }

    public final void method1641(int var1, int var2, class331 var3, float var4) {
        int var6 = (int) (var4 * 18.0F);
        class331 var7 = this.method1638(var6);
        int var8 = var6 * 2 + 1;
        class8 var9 = new class8(0, 0, var3.field2423, var3.field2419);
        class8 var10 = new class8(0, 0);
        this.field2530.method12(var8, var8);
        System.nanoTime();

        int var11;
        int var12;
        int var13;
        for (var11 = 0; var11 < this.field2532; ++var11) {
            var12 = this.field2528[var11];
            var13 = this.field2529[var11];
            int var14 = (int) (var4 * (float) (var12 - var1)) - var6;
            int var15 = (int) ((float) var3.field2419 - (float) (var13 - var2) * var4) - var6;
            this.field2530.method11(var14, var15);
            this.field2530.method14(var9, var10);
            this.method1643(var7, var3, var10);
        }

        System.nanoTime();
        System.nanoTime();

        for (var11 = 0; var11 < var3.field2422.length; ++var11) {
            if (var3.field2422[var11] == 0) {
                var3.field2422[var11] = -16777216;
            } else {
                var12 = (var3.field2422[var11] + 64 - 1) / 256;
                if (var12 <= 0) {
                    var3.field2422[var11] = -16777216;
                } else {
                    if (var12 > class508.field3768.length) {
                        var12 = class508.field3768.length;
                    }

                    var13 = class508.field3768[var12 - 1];
                    var3.field2422[var11] = -16777216 | var13;
                }
            }
        }

        System.nanoTime();
    }

    void method1643(class331 var1, class331 var2, class8 var3) {
        if (var3.field42 != 0 && var3.field40 != 0) {
            int var5 = 0;
            int var6 = 0;
            if (var3.field43 == 0) {
                var5 = var1.field2423 - var3.field42;
            }

            if (var3.field41 == 0) {
                var6 = var1.field2419 - var3.field40;
            }

            int var7 = var6 * var1.field2423 + var5;
            int var8 = var2.field2423 * var3.field41 + var3.field43;

            for (int var9 = 0; var9 < var3.field40; ++var9) {
                for (int var10 = 0; var10 < var3.field42; ++var10) {
                    int[] var10000 = var2.field2422;
                    int var10001 = var8++;
                    var10000[var10001] += var1.field2422[var7++];
                }

                var7 += var1.field2423 - var3.field42;
                var8 += var2.field2423 - var3.field42;
            }

        }
    }
}
