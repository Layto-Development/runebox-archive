public class class409 extends class391 {
    boolean field2886;
    int field2873;
    int field2874;
    int field2875;
    int field2876;
    int field2877;
    int field2878;
    int field2879;
    int field2880;
    int field2881;
    int field2882;
    int field2883;
    int field2884;
    int field2885;
    int field2887;

    class409(class433 var1, int var2, int var3) {
        super.field2784 = var1;
        this.field2881 = var1.field2946;
        this.field2882 = var1.field2944;
        this.field2886 = var1.field2948;
        this.field2874 = var2;
        this.field2875 = var3;
        this.field2876 = 8192;
        this.field2883 = 0;
        this.method1895();
    }

    class409(class433 var1, int var2, int var3, int var4) {
        super.field2784 = var1;
        this.field2881 = var1.field2946;
        this.field2882 = var1.field2944;
        this.field2886 = var1.field2948;
        this.field2874 = var2;
        this.field2875 = var3;
        this.field2876 = var4;
        this.field2883 = 0;
        this.method1895();
    }

    static int method1887(int var0, int var1) {
        return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
    }

    static int method1859(int var0, int var1) {
        return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
    }

    public static class409 method1892(class433 var0, int var1, int var2) {
        return var0.field2945 != null && var0.field2945.length != 0 ? new class409(var0, (int) ((long) var0.field2947 * 256L * (long) 100 / (class398.field2800 * 100L)), var2 << 6) : null;
    }

    public static class409 method1861(class433 var0, int var1, int var2, int var3) {
        return var0.field2945 != null && var0.field2945.length != 0 ? new class409(var0, var1, var2, var3) : null;
    }

    static int method1860(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class409 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var7 - var2) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }

        var8.field2883 = var2 << 8;
        return var3;
    }

    static int method1876(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class409 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var9 - var3) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field2883 = var3 << 8;
        return var4 >> 1;
    }

    static int method1877(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class409 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }

        var8.field2883 = var2 << 8;
        return var3;
    }

    static int method1897(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class409 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field2883 = var3 << 8;
        return var4 >> 1;
    }

    static int method1878(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class409 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
            var7 = var8;
        }

        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
            var7 = var8;
        }

        for (var1 = var12; var5 < var7; var4 += var11) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
        }

        var10.field2883 = var4;
        return var5;
    }

    static int method1879(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class409 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field2883 = var4;
        return var5 >> 1;
    }

    static int method1868(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class409 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        var0 = var12;

        for (var1 = var11; var5 < var7; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
        }

        var10.field2883 = var4;
        return var5;
    }

    static int method1880(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class409 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field2883 = var4;
        return var5 >> 1;
    }

    static int method1881(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class409 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var8 - var2) > var7) {
            var6 = var7;
        }

        var9.field2885 += var9.field2878 * (var6 - var3);
        var9.field2879 += var9.field2887 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        var9.field2877 = var4 >> 2;
        var9.field2883 = var2 << 8;
        return var3;
    }

    static int method1882(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class409 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var11 - var3) > var10) {
            var9 = var10;
        }

        var12.field2877 += var12.field2873 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field2885 = var5 >> 2;
        var12.field2879 = var6 >> 2;
        var12.field2883 = var3 << 8;
        return var4 >> 1;
    }

    static int method1883(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class409 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
            var6 = var7;
        }

        var9.field2885 += var9.field2878 * (var6 - var3);
        var9.field2879 += var9.field2887 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        var9.field2877 = var4 >> 2;
        var9.field2883 = var2 << 8;
        return var3;
    }

    static int method1884(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class409 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
            var9 = var10;
        }

        var12.field2877 += var12.field2873 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field2885 = var5 >> 2;
        var12.field2879 = var6 >> 2;
        var12.field2883 = var3 << 8;
        return var4 >> 1;
    }

    static int method1885(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class409 var11, int var12, int var13) {
        var11.field2885 -= var11.field2878 * var5;
        var11.field2879 -= var11.field2887 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.field2885 += var11.field2878 * var5;
        var11.field2879 += var11.field2887 * var5;
        var11.field2877 = var6;
        var11.field2883 = var4;
        return var5;
    }

    static int method1886(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class409 var13, int var14, int var15) {
        var13.field2877 -= var13.field2873 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field2877 += var13.field2873 * var5;
        var13.field2885 = var6;
        var13.field2879 = var7;
        var13.field2883 = var4;
        return var5;
    }

    static int method1896(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class409 var11, int var12, int var13) {
        var11.field2885 -= var11.field2878 * var5;
        var11.field2879 -= var11.field2887 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var0 = var13;

        for (var1 = var12; var5 < var8; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.field2885 += var11.field2878 * var5;
        var11.field2879 += var11.field2887 * var5;
        var11.field2877 = var6;
        var11.field2883 = var4;
        return var5;
    }

    static int method1893(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class409 var13, int var14, int var15) {
        var13.field2877 -= var13.field2873 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field2877 += var13.field2873 * var5;
        var13.field2885 = var6;
        var13.field2879 = var7;
        var13.field2883 = var4;
        return var5;
    }

    @Override
    int method1810() {
        int var1 = this.field2877 * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field2880 == 0) {
            var1 -= var1 * this.field2883 / (((class433) super.field2784).field2945.length << 8);
        } else if (this.field2880 >= 0) {
            var1 -= var1 * this.field2881 / ((class433) super.field2784).field2945.length;
        }

        return var1 > 255 ? 255 : var1;
    }

    void method1895() {
        this.field2877 = this.field2875;
        this.field2885 = method1887(this.field2875, this.field2876);
        this.field2879 = method1859(this.field2875, this.field2876);
    }

    public synchronized void method1862(int var1) {
        this.field2880 = var1;
    }

    public synchronized void method1863(int var1) {
        this.method1864(var1 << 6, this.method1866());
    }

    synchronized void method1898(int var1) {
        this.method1864(0, this.method1866());
    }

    synchronized void method1864(int var1, int var2) {
        this.field2875 = var1;
        this.field2876 = var2;
        this.field2884 = 0;
        this.method1895();
    }

    public synchronized int method1865() {
        return this.field2875 == Integer.MIN_VALUE ? 0 : this.field2875;
    }

    public synchronized int method1866() {
        return this.field2876 < 0 ? -1 : this.field2876;
    }

    public synchronized void method1867(int var1) {
        int var2 = ((class433) super.field2784).field2945.length << 8;
        if (var1 < -1) {
            var1 = -1;
        }

        if (var1 > var2) {
            var1 = var2;
        }

        this.field2883 = var1;
    }

    public synchronized void method1891(boolean var1) {
        this.field2874 = (this.field2874 ^ this.field2874 >> 31) + (this.field2874 >>> 31);
        this.field2874 = -this.field2874;
    }

    void method1888() {
        if (this.field2884 != 0) {
            if (this.field2875 == Integer.MIN_VALUE) {
                this.field2875 = 0;
            }

            this.field2884 = 0;
            this.method1895();
        }

    }

    public synchronized void method1890(int var1, int var2) {
        this.method1874(var1, var2, this.method1866());
    }

    public synchronized void method1874(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.method1864(var2, var3);
        } else {
            int var4 = method1887(var2, var3);
            int var5 = method1859(var2, var3);
            if (this.field2885 == var4 && this.field2879 == var5) {
                this.field2884 = 0;
            } else {
                int var6 = var2 - this.field2877;
                if (this.field2877 - var2 > var6) {
                    var6 = this.field2877 - var2;
                }

                if (var4 - this.field2885 > var6) {
                    var6 = var4 - this.field2885;
                }

                if (this.field2885 - var4 > var6) {
                    var6 = this.field2885 - var4;
                }

                if (var5 - this.field2879 > var6) {
                    var6 = var5 - this.field2879;
                }

                if (this.field2879 - var5 > var6) {
                    var6 = this.field2879 - var5;
                }

                if (var1 > var6) {
                    var1 = var6;
                }

                this.field2884 = var1;
                this.field2875 = var2;
                this.field2876 = var3;
                this.field2873 = (var2 - this.field2877) / var1;
                this.field2878 = (var4 - this.field2885) / var1;
                this.field2887 = (var5 - this.field2879) / var1;
            }
        }
    }

    public synchronized void method1869(int var1) {
        if (var1 == 0) {
            this.method1898(0);
            this.method221();
        } else if (this.field2885 == 0 && this.field2879 == 0) {
            this.field2884 = 0;
            this.field2875 = 0;
            this.field2877 = 0;
            this.method221();
        } else {
            int var2 = -this.field2877;
            if (this.field2877 > var2) {
                var2 = this.field2877;
            }

            if (-this.field2885 > var2) {
                var2 = -this.field2885;
            }

            if (this.field2885 > var2) {
                var2 = this.field2885;
            }

            if (-this.field2879 > var2) {
                var2 = -this.field2879;
            }

            if (this.field2879 > var2) {
                var2 = this.field2879;
            }

            if (var1 > var2) {
                var1 = var2;
            }

            this.field2884 = var1;
            this.field2875 = Integer.MIN_VALUE;
            this.field2873 = -this.field2877 / var1;
            this.field2878 = -this.field2885 / var1;
            this.field2887 = -this.field2879 / var1;
        }
    }

    public synchronized void method1870(int var1) {
        if (this.field2874 < 0) {
            this.field2874 = -var1;
        } else {
            this.field2874 = var1;
        }

    }

    public synchronized int method1871() {
        return this.field2874 < 0 ? -this.field2874 : this.field2874;
    }

    public boolean method1872() {
        return this.field2883 < 0 || this.field2883 >= ((class433) super.field2784).field2945.length << 8;
    }

    public boolean method1873() {
        return this.field2884 != 0;
    }

    @Override
    protected class391 method1811() {
        return null;
    }

    @Override
    protected class391 method1812() {
        return null;
    }

    @Override
    protected int method1809() {
        return this.field2875 == 0 && this.field2884 == 0 ? 0 : 1;
    }

    @Override
    public synchronized void method1814(int[] var1, int var2, int var3) {
        if (this.field2875 == 0 && this.field2884 == 0) {
            this.method1813(var3);
        } else {
            class433 var4 = (class433) super.field2784;
            int var5 = this.field2881 << 8;
            int var6 = this.field2882 << 8;
            int var7 = var4.field2945.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2880 = 0;
            }

            int var9 = var2;
            var3 += var2;
            if (this.field2883 < 0) {
                if (this.field2874 <= 0) {
                    this.method1888();
                    this.method221();
                    return;
                }

                this.field2883 = 0;
            }

            if (this.field2883 >= var7) {
                if (this.field2874 >= 0) {
                    this.method1888();
                    this.method221();
                    return;
                }

                this.field2883 = var7 - 1;
            }

            if (this.field2880 < 0) {
                if (this.field2886) {
                    if (this.field2874 < 0) {
                        var9 = this.method1875(var1, var2, var5, var3, var4.field2945[this.field2881]);
                        if (this.field2883 >= var5) {
                            return;
                        }

                        this.field2883 = var5 + var5 - 1 - this.field2883;
                        this.field2874 = -this.field2874;
                    }

                    while (true) {
                        var9 = this.method1889(var1, var9, var6, var3, var4.field2945[this.field2882 - 1]);
                        if (this.field2883 < var6) {
                            return;
                        }

                        this.field2883 = var6 + var6 - 1 - this.field2883;
                        this.field2874 = -this.field2874;
                        var9 = this.method1875(var1, var9, var5, var3, var4.field2945[this.field2881]);
                        if (this.field2883 >= var5) {
                            return;
                        }

                        this.field2883 = var5 + var5 - 1 - this.field2883;
                        this.field2874 = -this.field2874;
                    }
                } else if (this.field2874 < 0) {
                    while (true) {
                        var9 = this.method1875(var1, var9, var5, var3, var4.field2945[this.field2882 - 1]);
                        if (this.field2883 >= var5) {
                            return;
                        }

                        this.field2883 = var6 - 1 - (var6 - 1 - this.field2883) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1889(var1, var9, var6, var3, var4.field2945[this.field2881]);
                        if (this.field2883 < var6) {
                            return;
                        }

                        this.field2883 = var5 + (this.field2883 - var5) % var8;
                    }
                }
            } else {
                if (this.field2880 > 0) {
                    if (this.field2886) {
                        label131:
                        {
                            if (this.field2874 < 0) {
                                var9 = this.method1875(var1, var2, var5, var3, var4.field2945[this.field2881]);
                                if (this.field2883 >= var5) {
                                    return;
                                }

                                this.field2883 = var5 + var5 - 1 - this.field2883;
                                this.field2874 = -this.field2874;
                                if (--this.field2880 == 0) {
                                    break label131;
                                }
                            }

                            do {
                                var9 = this.method1889(var1, var9, var6, var3, var4.field2945[this.field2882 - 1]);
                                if (this.field2883 < var6) {
                                    return;
                                }

                                this.field2883 = var6 + var6 - 1 - this.field2883;
                                this.field2874 = -this.field2874;
                                if (--this.field2880 == 0) {
                                    break;
                                }

                                var9 = this.method1875(var1, var9, var5, var3, var4.field2945[this.field2881]);
                                if (this.field2883 >= var5) {
                                    return;
                                }

                                this.field2883 = var5 + var5 - 1 - this.field2883;
                                this.field2874 = -this.field2874;
                            } while (--this.field2880 != 0);
                        }
                    } else {
                        int var10;
                        if (this.field2874 < 0) {
                            while (true) {
                                var9 = this.method1875(var1, var9, var5, var3, var4.field2945[this.field2882 - 1]);
                                if (this.field2883 >= var5) {
                                    return;
                                }

                                var10 = (var6 - 1 - this.field2883) / var8;
                                if (var10 >= this.field2880) {
                                    this.field2883 += var8 * this.field2880;
                                    this.field2880 = 0;
                                    break;
                                }

                                this.field2883 += var8 * var10;
                                this.field2880 -= var10;
                            }
                        } else {
                            while (true) {
                                var9 = this.method1889(var1, var9, var6, var3, var4.field2945[this.field2881]);
                                if (this.field2883 < var6) {
                                    return;
                                }

                                var10 = (this.field2883 - var5) / var8;
                                if (var10 >= this.field2880) {
                                    this.field2883 -= var8 * this.field2880;
                                    this.field2880 = 0;
                                    break;
                                }

                                this.field2883 -= var8 * var10;
                                this.field2880 -= var10;
                            }
                        }
                    }
                }

                if (this.field2874 < 0) {
                    this.method1875(var1, var9, 0, var3, 0);
                    if (this.field2883 < 0) {
                        this.field2883 = -1;
                        this.method1888();
                        this.method221();
                    }
                } else {
                    this.method1889(var1, var9, var7, var3, 0);
                    if (this.field2883 >= var7) {
                        this.field2883 = var7;
                        this.method1888();
                        this.method221();
                    }
                }

            }
        }
    }

    @Override
    public synchronized void method1813(int var1) {
        if (this.field2884 > 0) {
            if (var1 >= this.field2884) {
                if (this.field2875 == Integer.MIN_VALUE) {
                    this.field2875 = 0;
                    this.field2879 = 0;
                    this.field2885 = 0;
                    this.field2877 = 0;
                    this.method221();
                    var1 = this.field2884;
                }

                this.field2884 = 0;
                this.method1895();
            } else {
                this.field2877 += this.field2873 * var1;
                this.field2885 += this.field2878 * var1;
                this.field2879 += this.field2887 * var1;
                this.field2884 -= var1;
            }
        }

        class433 var2 = (class433) super.field2784;
        int var3 = this.field2881 << 8;
        int var4 = this.field2882 << 8;
        int var5 = var2.field2945.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2880 = 0;
        }

        if (this.field2883 < 0) {
            if (this.field2874 <= 0) {
                this.method1888();
                this.method221();
                return;
            }

            this.field2883 = 0;
        }

        if (this.field2883 >= var5) {
            if (this.field2874 >= 0) {
                this.method1888();
                this.method221();
                return;
            }

            this.field2883 = var5 - 1;
        }

        this.field2883 += this.field2874 * var1;
        if (this.field2880 < 0) {
            if (!this.field2886) {
                if (this.field2874 < 0) {
                    if (this.field2883 >= var3) {
                        return;
                    }

                    this.field2883 = var4 - 1 - (var4 - 1 - this.field2883) % var6;
                } else {
                    if (this.field2883 < var4) {
                        return;
                    }

                    this.field2883 = var3 + (this.field2883 - var3) % var6;
                }

            } else {
                if (this.field2874 < 0) {
                    if (this.field2883 >= var3) {
                        return;
                    }

                    this.field2883 = var3 + var3 - 1 - this.field2883;
                    this.field2874 = -this.field2874;
                }

                while (this.field2883 >= var4) {
                    this.field2883 = var4 + var4 - 1 - this.field2883;
                    this.field2874 = -this.field2874;
                    if (this.field2883 >= var3) {
                        return;
                    }

                    this.field2883 = var3 + var3 - 1 - this.field2883;
                    this.field2874 = -this.field2874;
                }

            }
        } else {
            if (this.field2880 > 0) {
                if (this.field2886) {
                    label120:
                    {
                        if (this.field2874 < 0) {
                            if (this.field2883 >= var3) {
                                return;
                            }

                            this.field2883 = var3 + var3 - 1 - this.field2883;
                            this.field2874 = -this.field2874;
                            if (--this.field2880 == 0) {
                                break label120;
                            }
                        }

                        do {
                            if (this.field2883 < var4) {
                                return;
                            }

                            this.field2883 = var4 + var4 - 1 - this.field2883;
                            this.field2874 = -this.field2874;
                            if (--this.field2880 == 0) {
                                break;
                            }

                            if (this.field2883 >= var3) {
                                return;
                            }

                            this.field2883 = var3 + var3 - 1 - this.field2883;
                            this.field2874 = -this.field2874;
                        } while (--this.field2880 != 0);
                    }
                } else {
                    label152:
                    {
                        int var7;
                        if (this.field2874 < 0) {
                            if (this.field2883 >= var3) {
                                return;
                            }

                            var7 = (var4 - 1 - this.field2883) / var6;
                            if (var7 >= this.field2880) {
                                this.field2883 += var6 * this.field2880;
                                this.field2880 = 0;
                                break label152;
                            }

                            this.field2883 += var6 * var7;
                            this.field2880 -= var7;
                        } else {
                            if (this.field2883 < var4) {
                                return;
                            }

                            var7 = (this.field2883 - var3) / var6;
                            if (var7 >= this.field2880) {
                                this.field2883 -= var6 * this.field2880;
                                this.field2880 = 0;
                                break label152;
                            }

                            this.field2883 -= var6 * var7;
                            this.field2880 -= var7;
                        }

                        return;
                    }
                }
            }

            if (this.field2874 < 0) {
                if (this.field2883 < 0) {
                    this.field2883 = -1;
                    this.method1888();
                    this.method221();
                }
            } else if (this.field2883 >= var5) {
                this.field2883 = var5;
                this.method1888();
                this.method221();
            }

        }
    }

    int method1889(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field2884 > 0) {
                int var6 = var2 + this.field2884;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.field2884 += var2;
                if (this.field2874 == 256 && (this.field2883 & 255) == 0) {
                    if (class398.field2815) {
                        var2 = method1882(0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, this.field2878, this.field2887, 0, var6, var3, this);
                    } else {
                        var2 = method1881(((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, this.field2873, 0, var6, var3, this);
                    }
                } else if (class398.field2815) {
                    var2 = method1886(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, this.field2878, this.field2887, 0, var6, var3, this, this.field2874, var5);
                } else {
                    var2 = method1885(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, this.field2873, 0, var6, var3, this, this.field2874, var5);
                }

                this.field2884 -= var2;
                if (this.field2884 != 0) {
                    return var2;
                }

                if (!this.method1894()) {
                    continue;
                }

                return var4;
            }

            if (this.field2874 == 256 && (this.field2883 & 255) == 0) {
                if (class398.field2815) {
                    return method1876(0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, 0, var4, var3, this);
                }

                return method1860(((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, 0, var4, var3, this);
            }

            if (class398.field2815) {
                return method1879(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, 0, var4, var3, this, this.field2874, var5);
            }

            return method1878(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, 0, var4, var3, this, this.field2874, var5);
        }
    }

    int method1875(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field2884 > 0) {
                int var6 = var2 + this.field2884;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.field2884 += var2;
                if (this.field2874 == -256 && (this.field2883 & 255) == 0) {
                    if (class398.field2815) {
                        var2 = method1884(0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, this.field2878, this.field2887, 0, var6, var3, this);
                    } else {
                        var2 = method1883(((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, this.field2873, 0, var6, var3, this);
                    }
                } else if (class398.field2815) {
                    var2 = method1893(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, this.field2878, this.field2887, 0, var6, var3, this, this.field2874, var5);
                } else {
                    var2 = method1896(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, this.field2873, 0, var6, var3, this, this.field2874, var5);
                }

                this.field2884 -= var2;
                if (this.field2884 != 0) {
                    return var2;
                }

                if (!this.method1894()) {
                    continue;
                }

                return var4;
            }

            if (this.field2874 == -256 && (this.field2883 & 255) == 0) {
                if (class398.field2815) {
                    return method1897(0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, 0, var4, var3, this);
                }

                return method1877(((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, 0, var4, var3, this);
            }

            if (class398.field2815) {
                return method1880(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2885, this.field2879, 0, var4, var3, this, this.field2874, var5);
            }

            return method1868(0, 0, ((class433) super.field2784).field2945, var1, this.field2883, var2, this.field2877, 0, var4, var3, this, this.field2874, var5);
        }
    }

    boolean method1894() {
        int var1 = this.field2875;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var3 = 0;
            var2 = 0;
            var1 = 0;
        } else {
            var2 = method1887(var1, this.field2876);
            var3 = method1859(var1, this.field2876);
        }

        if (this.field2877 == var1 && this.field2885 == var2 && this.field2879 == var3) {
            if (this.field2875 == Integer.MIN_VALUE) {
                this.field2875 = 0;
                this.field2879 = 0;
                this.field2885 = 0;
                this.field2877 = 0;
                this.method221();
                return true;
            } else {
                this.method1895();
                return false;
            }
        } else {
            if (this.field2877 < var1) {
                this.field2873 = 1;
                this.field2884 = var1 - this.field2877;
            } else if (this.field2877 > var1) {
                this.field2873 = -1;
                this.field2884 = this.field2877 - var1;
            } else {
                this.field2873 = 0;
            }

            if (this.field2885 < var2) {
                this.field2878 = 1;
                if (this.field2884 == 0 || this.field2884 > var2 - this.field2885) {
                    this.field2884 = var2 - this.field2885;
                }
            } else if (this.field2885 > var2) {
                this.field2878 = -1;
                if (this.field2884 == 0 || this.field2884 > this.field2885 - var2) {
                    this.field2884 = this.field2885 - var2;
                }
            } else {
                this.field2878 = 0;
            }

            if (this.field2879 < var3) {
                this.field2887 = 1;
                if (this.field2884 == 0 || this.field2884 > var3 - this.field2879) {
                    this.field2884 = var3 - this.field2879;
                }
            } else if (this.field2879 > var3) {
                this.field2887 = -1;
                if (this.field2884 == 0 || this.field2884 > this.field2879 - var3) {
                    this.field2884 = this.field2879 - var3;
                }
            } else {
                this.field2887 = 0;
            }

            return false;
        }
    }
}
