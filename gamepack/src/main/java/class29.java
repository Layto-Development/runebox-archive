import java.util.Comparator;

public class class29 implements Comparator {
    static class16 field162;
    static class539[] field164;
    static int field161;
    boolean field163;

    class29() {
    }

    static final void method88(int var0, int var1, int var2, int var3, boolean var4) {
        if (var2 < 1) {
            var2 = 1;
        }

        if (var3 < 1) {
            var3 = 1;
        }

        int var6 = var3 - 334;
        int var7;
        if (var6 < 0) {
            var7 = Client.field4048;
        } else if (var6 >= 100) {
            var7 = Client.field3934;
        } else {
            var7 = Client.field4048 + var6 * (Client.field3934 - Client.field4048) / 100;
        }

        int var8 = 512 * var3 * var7 / (var2 * 334);
        int var9;
        int var10;
        short var17;
        if (var8 < Client.field4054) {
            var17 = Client.field4054;
            var7 = var2 * var17 * 334 / (var3 * 512);
            if (var7 > Client.field3884) {
                var7 = Client.field3884;
                var9 = var3 * var7 * 512 / (var17 * 334);
                var10 = (var2 - var9) / 2;
                if (var4) {
                    class415.method1908();
                    class415.method1914(var0, var1, var10, var3, -16777216);
                    class415.method1914(var0 + var2 - var10, var1, var10, var3, -16777216);
                }

                var0 += var10;
                var2 -= var10 * 2;
            }
        } else if (var8 > Client.field4055) {
            var17 = Client.field4055;
            var7 = var17 * var2 * 334 / (var3 * 512);
            if (var7 < Client.field4052) {
                var7 = Client.field4052;
                var9 = var17 * var2 * 334 / (var7 * 512);
                var10 = (var3 - var9) / 2;
                if (var4) {
                    class415.method1908();
                    class415.method1914(var0, var1, var2, var10, -16777216);
                    class415.method1914(var0, var3 + var1 - var10, var2, var10, -16777216);
                }

                var1 += var10;
                var3 -= var10 * 2;
            }
        }

        Client.field4060 = var7 * var3 / 334;
        if (var2 != Client.field3991 || Client.field3866 != var3) {
            int[] var18 = new int[9];

            for (var10 = 0; var10 < var18.length; ++var10) {
                int var11 = var10 * 32 + 128 + 15;
                int var12 = Client.method2415(var11);
                int var13 = class334.field2429[var11];
                int var15 = var3 - 334;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 100) {
                    var15 = 100;
                }

                int var16 = Client.field4050 + var15 * (Client.field4051 - Client.field4050) / 100;
                int var14 = var16 * var12 / 256;
                var18[var10] = var14 * var13 >> 16;
            }

            class158.method774(var18, 500, 800, var2 * 334 / var3, 334);
        }

        Client.field4056 = var0;
        Client.field4057 = var1;
        Client.field3991 = var2;
        Client.field3866 = var3;
    }

    int method89(class142 var1, class142 var2) {
        if (var2.field1252 == var1.field1252) {
            return 0;
        } else {
            if (this.field163) {
                if (var1.field1252 == Client.field3775) {
                    return -1;
                }

                if (var2.field1252 == Client.field3775) {
                    return 1;
                }
            }

            return var1.field1252 < var2.field1252 ? -1 : 1;
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method89((class142) var1, (class142) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
