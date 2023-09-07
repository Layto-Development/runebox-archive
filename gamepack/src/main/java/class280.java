public class class280 {
    static final byte[] field2048;

    static {
        field2048 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    class78 field2046;
    int field2042;
    int field2049;
    int[] field2043;
    int[] field2044;
    int[] field2045;
    int[] field2047;
    long field2041;

    class280() {
        this.field2046 = new class78(null);
    }

    void method1273(byte[] var1) {
        this.field2046.field695 = var1;
        this.field2046.field697 = 10;
        int var2 = this.field2046.method309();
        this.field2042 = this.field2046.method309();
        this.field2049 = 500000;
        this.field2047 = new int[var2];

        class78 var10000;
        int var3;
        int var5;
        for (var3 = 0; var3 < var2; var10000.field697 += var5) {
            int var4 = this.field2046.method264();
            var5 = this.field2046.method264();
            if (var4 == 1297379947) {
                this.field2047[var3] = this.field2046.field697;
                ++var3;
            }

            var10000 = this.field2046;
        }

        this.field2041 = 0L;
        this.field2044 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            this.field2044[var3] = this.field2047[var3];
        }

        this.field2045 = new int[var2];
        this.field2043 = new int[var2];
    }

    void method1260() {
        this.field2046.field695 = null;
        this.field2047 = null;
        this.field2044 = null;
        this.field2045 = null;
        this.field2043 = null;
    }

    boolean method1274() {
        return this.field2046.field695 != null;
    }

    int method1261() {
        return this.field2044.length;
    }

    void method1262(int var1) {
        this.field2046.field697 = this.field2044[var1];
    }

    void method1263(int var1) {
        this.field2044[var1] = this.field2046.field697;
    }

    void method1264() {
        this.field2046.field697 = -1;
    }

    void method1265(int var1) {
        int var2 = this.field2046.method247();
        int[] var10000 = this.field2045;
        var10000[var1] += var2;
    }

    int method1266(int var1) {
        int var2 = this.method1267(var1);
        return var2;
    }

    int method1267(int var1) {
        byte var2 = this.field2046.field695[this.field2046.field697];
        int var5;
        if (var2 < 0) {
            var5 = var2 & 255;
            this.field2043[var1] = var5;
            ++this.field2046.field697;
        } else {
            var5 = this.field2043[var1];
        }

        if (var5 != 240 && var5 != 247) {
            return this.method1268(var1, var5);
        } else {
            int var3 = this.field2046.method247();
            if (var5 == 247 && var3 > 0) {
                int var4 = this.field2046.field695[this.field2046.field697] & 255;
                if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
                    ++this.field2046.field697;
                    this.field2043[var1] = var4;
                    return this.method1268(var1, var4);
                }
            }

            class78 var10000 = this.field2046;
            var10000.field697 += var3;
            return 0;
        }
    }

    int method1268(int var1, int var2) {
        int var4;
        if (var2 == 255) {
            int var7 = this.field2046.method260();
            var4 = this.field2046.method247();
            class78 var10000;
            if (var7 == 47) {
                var10000 = this.field2046;
                var10000.field697 += var4;
                return 1;
            } else if (var7 == 81) {
                int var5 = this.field2046.method316();
                var4 -= 3;
                int var6 = this.field2045[var1];
                this.field2041 += (long) var6 * (long) (this.field2049 - var5);
                this.field2049 = var5;
                var10000 = this.field2046;
                var10000.field697 += var4;
                return 2;
            } else {
                var10000 = this.field2046;
                var10000.field697 += var4;
                return 3;
            }
        } else {
            byte var3 = field2048[var2 - 128];
            var4 = var2;
            if (var3 >= 1) {
                var4 = var2 | this.field2046.method260() << 8;
            }

            if (var3 >= 2) {
                var4 |= this.field2046.method260() << 16;
            }

            return var4;
        }
    }

    long method1272(int var1) {
        return this.field2041 + (long) var1 * (long) this.field2049;
    }

    int method1269() {
        int var1 = this.field2044.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;

        for (int var4 = 0; var4 < var1; ++var4) {
            if (this.field2044[var4] >= 0 && this.field2045[var4] < var3) {
                var2 = var4;
                var3 = this.field2045[var4];
            }
        }

        return var2;
    }

    boolean method1270() {
        int var1 = this.field2044.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            if (this.field2044[var2] >= 0) {
                return false;
            }
        }

        return true;
    }

    void method1271(long var1) {
        this.field2041 = var1;
        int var3 = this.field2044.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            this.field2045[var4] = 0;
            this.field2043[var4] = 0;
            this.field2046.field697 = this.field2047[var4];
            this.method1265(var4);
            this.field2044[var4] = this.field2046.field697;
        }

    }
}
