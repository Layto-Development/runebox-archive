public class class163 extends class70 {
    static class178 field1423;
    static class539 field1424;

    static {
        field1423 = new class178(32);
    }

    int[] field1421;
    int[] field1422;

    class163() {
        this.field1422 = new int[]{-1};
        this.field1421 = new int[]{0};
    }

    static int method799(int var0, int var1) {
        class163 var3 = (class163) field1423.method857(var0);
        if (null == var3) {
            return -1;
        } else {
            return var1 >= 0 && var1 < var3.field1422.length ? var3.field1422[var1] : -1;
        }
    }

    static int method798(int var0, int var1) {
        class163 var3 = (class163) field1423.method857(var0);
        if (null == var3) {
            return 0;
        } else {
            return var1 >= 0 && var1 < var3.field1421.length ? var3.field1421[var1] : 0;
        }
    }

    static int method800(int var0, int var1) {
        class163 var3 = (class163) field1423.method857(var0);
        if (null == var3) {
            return 0;
        } else if (var1 == -1) {
            return 0;
        } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var3.field1421.length; ++var5) {
                if (var1 == var3.field1422[var5]) {
                    var4 += var3.field1421[var5];
                }
            }

            return var4;
        }
    }

    static void method802(int var0, int var1, int var2, int var3) {
        class163 var5 = (class163) field1423.method857(var0);
        if (var5 == null) {
            var5 = new class163();
            field1423.method860(var5, var0);
        }

        if (var5.field1422.length <= var1) {
            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[var1 + 1];

            int var8;
            for (var8 = 0; var8 < var5.field1422.length; ++var8) {
                var6[var8] = var5.field1422[var8];
                var7[var8] = var5.field1421[var8];
            }

            for (var8 = var5.field1422.length; var8 < var1; ++var8) {
                var6[var8] = -1;
                var7[var8] = 0;
            }

            var5.field1422 = var6;
            var5.field1421 = var7;
        }

        var5.field1422[var1] = var2;
        var5.field1421[var1] = var3;
    }

    public static void method795() {
        class66.field636.clear();
    }

    static void method797(int var0) {
        class163 var2 = (class163) field1423.method857(var0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field1422.length; ++var3) {
                var2.field1422[var3] = -1;
                var2.field1421[var3] = 0;
            }

        }
    }

    static void method796(int var0) {
        class163 var2 = (class163) field1423.method857(var0);
        if (null != var2) {
            var2.method221();
        }
    }

    static void method801() {
        field1423 = new class178(32);
    }
}
