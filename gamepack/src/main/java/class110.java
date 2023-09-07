public abstract class class110 extends class415 {
    boolean field1047;
    boolean field1049;
    class364 field1046;
    int[] field1048;

    class110(class364 var1) {
        this.field1049 = false;
        this.field1047 = false;
        this.field1048 = class334.field2426;
        this.field1046 = var1;
    }

    static int method515(int var0, byte var1, byte var2, byte var3, byte var4) {
        int var5 = var0 >> 10 & 63;
        int var6 = var0 >> 7 & 7;
        int var7 = var0 & 127;
        int var8 = var4 & 255;
        if (var1 != -1) {
            var5 += (var1 - var5) * var8 >> 7;
        }

        if (var2 != -1) {
            var6 += (var2 - var6) * var8 >> 7;
        }

        if (var3 != -1) {
            var7 += (var3 - var7) * var8 >> 7;
        }

        return (var5 << 10 | var6 << 7 | var7) & 65535;
    }

    static final int method509(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 65408) + var1;
    }

    abstract void method511(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

    abstract void method512(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

    abstract void method513(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

    abstract void method514(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

    void method508(int[] var1, int var2, int var3, float[] var4) {
        method1907(var1, var2, var3, var4);
    }

    void method510(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
        var10 = method515(var10, var13, var14, var15, var16);
        var11 = method515(var11, var13, var14, var15, var16);
        var12 = method515(var12, var13, var14, var15, var16);
        this.method512(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    void method507(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
        int var15 = method515(var10, var11, var12, var13, var14);
        var10 = this.field1048[var15];
        this.method513(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }
}
