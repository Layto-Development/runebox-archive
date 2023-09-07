public class class303 {
    static class413 field2170;
    static class75 field2168;
    static int[] field2171;
    boolean field2166;
    boolean[] field2169;
    class221 field2172;
    int[] field2167;
    int[] field2173;

    class303(class221 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
        this.field2172 = var1;
        this.field2166 = var2;
        this.field2167 = var3;
        this.field2173 = var4;
        this.field2169 = var5;
    }

    void method1336(float[] var1, int var2) {
        int var4 = this.field2172.field1750.length;
        class221 var10000 = this.field2172;
        int var5 = class221.field1749[this.field2172.field1748 - 1];
        boolean[] var6 = this.field2169;
        this.field2169[1] = true;
        var6[0] = true;

        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        for (var7 = 2; var7 < var4; ++var7) {
            var8 = this.field2172.method1030(this.field2167, var7);
            var9 = this.field2172.method1027(this.field2167, var7);
            var10 = this.field2172.method1028(this.field2167[var8], this.field2173[var8], this.field2167[var9], this.field2173[var9], this.field2167[var7]);
            var11 = this.field2173[var7];
            int var12 = var5 - var10;
            int var14 = (var12 < var10 ? var12 : var10) << 1;
            if (var11 != 0) {
                boolean[] var15 = this.field2169;
                this.field2169[var9] = true;
                var15[var8] = true;
                this.field2169[var7] = true;
                if (var11 >= var14) {
                    this.field2173[var7] = var12 > var10 ? var11 - var10 + var10 : var12 + (var10 - var11) - 1;
                } else {
                    this.field2173[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
                }
            } else {
                this.field2169[var7] = false;
                this.field2173[var7] = var10;
            }
        }

        this.method1338(0, var4 - 1);
        var7 = 0;
        var8 = this.field2172.field1748 * this.field2173[0];

        for (var9 = 1; var9 < var4; ++var9) {
            if (this.field2169[var9]) {
                var10 = this.field2167[var9];
                var11 = this.field2173[var9] * this.field2172.field1748;
                this.field2172.method1026(var7, var8, var10, var11, var1, var2);
                if (var10 >= var2) {
                    return;
                }

                var7 = var10;
                var8 = var11;
            }
        }

        var10000 = this.field2172;
        float var17 = class221.field1751[var8];

        for (var10 = var7; var10 < var2; ++var10) {
            var1[var10] *= var17;
        }

    }

    boolean method1337() {
        return this.field2166;
    }

    void method1338(int var1, int var2) {
        if (var1 < var2) {
            int var4 = var1;
            int var5 = this.field2167[var1];
            int var6 = this.field2173[var1];
            boolean var7 = this.field2169[var1];

            for (int var8 = var1 + 1; var8 <= var2; ++var8) {
                int var9 = this.field2167[var8];
                if (var9 < var5) {
                    this.field2167[var4] = var9;
                    this.field2173[var4] = this.field2173[var8];
                    this.field2169[var4] = this.field2169[var8];
                    ++var4;
                    this.field2167[var8] = this.field2167[var4];
                    this.field2173[var8] = this.field2173[var4];
                    this.field2169[var8] = this.field2169[var4];
                }
            }

            this.field2167[var4] = var5;
            this.field2173[var4] = var6;
            this.field2169[var4] = var7;
            this.method1338(var1, var4 - 1);
            this.method1338(var4 + 1, var2);
        }
    }
}
