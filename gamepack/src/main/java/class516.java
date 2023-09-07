public class class516 extends class510 {
    static int field4170;
    class74[] field4171;

    class516(class68 var1, class68 var2, int var3, boolean var4) {
        class43 var5 = new class43();
        int var6 = var1.method214(var3);
        this.field4171 = new class74[var6];
        int[] var7 = var1.method199(var3);

        for (int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.method188(var3, var7[var8]);
            class222 var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for (class222 var12 = (class222) var5.method122(); null != var12; var12 = (class222) var5.method124()) {
                if (var12.field1757 == var11) {
                    var10 = var12;
                    break;
                }
            }

            if (var10 == null) {
                byte[] var13 = var2.method196(var11, 0);
                var10 = new class222(var11, var13);
                var5.method126(var10);
            }

            this.field4171[var7[var8]] = new class74(var9, var10);
        }

    }

    public static class516 method2514(class68 var0, class68 var1, int var2, boolean var3) {
        boolean var5 = true;
        int[] var6 = var0.method199(var2);

        for (int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var0.method196(var2, var6[var7]);
            if (null == var8) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
                byte[] var10 = var1.method196(var9, 0);
                if (null == var10) {
                    var5 = false;
                }
            }
        }

        if (!var5) {
            return null;
        } else {
            try {
                return new class516(var0, var1, var2, false);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    public static void method2512(int var0, int var1) {
        class180 var3 = class180.method864(var0);
        int var4 = var3.field1523;
        int var5 = var3.field1524;
        int var6 = var3.field1527;
        int var7 = class10.field45[var6 - var5];
        if (var1 < 0 || var1 > var7) {
            var1 = 0;
        }

        var7 <<= var5;
        class10.field46[var4] = class10.field46[var4] & ~var7 | var1 << var5 & var7;
    }

    public boolean method2513(int var1) {
        return this.field4171[var1].field691;
    }
}
