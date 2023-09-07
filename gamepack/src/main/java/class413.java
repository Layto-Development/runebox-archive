public final class class413 extends class197 {
    public class413(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    public class413(byte[] var1) {
        super(var1);
    }

    @Override
    void method918(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var2 + var3 * class415.field2903;
        int var8 = class415.field2903 - var4;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var3 < class415.field2909) {
            var11 = class415.field2909 - var3;
            var5 -= var11;
            var3 = class415.field2909;
            var10 = var11 * var4;
            var7 += var11 * class415.field2903;
        }

        if (var3 + var5 > class415.field2907) {
            var5 -= var3 + var5 - class415.field2907;
        }

        if (var2 < class415.field2908) {
            var11 = class415.field2908 - var2;
            var4 -= var11;
            var2 = class415.field2908;
            var10 += var11;
            var7 += var11;
            var9 = var11;
            var8 += var11;
        }

        if (var2 + var4 > class415.field2902) {
            var11 = var2 + var4 - class415.field2902;
            var4 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var4 > 0 && var5 > 0) {
            method939(class415.field2905, var1, var6, var10, var7, var4, var5, var8, var9);
        }
    }

    @Override
    void method938(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var2 + var3 * class415.field2903;
        int var9 = class415.field2903 - var4;
        int var10 = 0;
        int var11 = 0;
        int var12;
        if (var3 < class415.field2909) {
            var12 = class415.field2909 - var3;
            var5 -= var12;
            var3 = class415.field2909;
            var11 = var12 * var4;
            var8 += var12 * class415.field2903;
        }

        if (var3 + var5 > class415.field2907) {
            var5 -= var3 + var5 - class415.field2907;
        }

        if (var2 < class415.field2908) {
            var12 = class415.field2908 - var2;
            var4 -= var12;
            var2 = class415.field2908;
            var11 += var12;
            var8 += var12;
            var10 = var12;
            var9 += var12;
        }

        if (var2 + var4 > class415.field2902) {
            var12 = var2 + var4 - class415.field2902;
            var4 -= var12;
            var10 += var12;
            var9 += var12;
        }

        if (var4 > 0 && var5 > 0) {
            method941(class415.field2905, var1, var6, var11, var8, var4, var5, var9, var10, var7);
        }
    }
}
