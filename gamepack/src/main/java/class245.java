public class class245 implements class330 {
    static final class245 field1868;
    static final class245 field1869;
    static final class245 field1870;
    static final class245 field1871;
    static final class245 field1872;
    static final class245 field1873;
    static final class245 field1874;
    static final class245 field1875;
    static final class245 field1876;
    static final class245 field1877;
    static final class245 field1878;
    static final class245 field1879;
    static final class245 field1880;
    static final class245 field1881;
    static final class245 field1882;
    static final class245 field1884;
    static final class245 field1886;
    static long field1887;

    static {
        field1872 = new class245(0, 0, null, -1, -1);
        field1868 = new class245(1, 1, null, 0, 2);
        field1869 = new class245(2, 2, null, 1, 2);
        field1870 = new class245(3, 3, null, 2, 2);
        field1876 = new class245(4, 4, null, 3, 1);
        field1886 = new class245(5, 5, null, 4, 1);
        field1873 = new class245(6, 6, null, 5, 1);
        field1874 = new class245(7, 7, null, 6, 3);
        field1884 = new class245(8, 8, null, 7, 3);
        field1878 = new class245(9, 9, null, 8, 3);
        field1877 = new class245(10, 10, null, 0, 7);
        field1875 = new class245(11, 11, null, 1, 7);
        field1879 = new class245(12, 12, null, 2, 7);
        field1871 = new class245(13, 13, null, 3, 7);
        field1880 = new class245(14, 14, null, 4, 7);
        field1881 = new class245(15, 15, null, 5, 7);
        field1882 = new class245(16, 16, null, 0, 5);
    }

    final int field1867;
    final int field1883;
    final int field1885;

    class245(int var1, int var2, String var3, int var4, int var5) {
        this.field1883 = var1;
        this.field1867 = var2;
        this.field1885 = var4;
    }

    static final void method1095(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class11[] var10) {
        int var13;
        for (int var12 = 0; var12 < 8; ++var12) {
            for (var13 = 0; var13 < 8; ++var13) {
                if (var12 + var2 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
                    int[] var10000 = var10[var1].field53[var12 + var2];
                    var10000[var13 + var3] &= -16777217;
                }
            }
        }

        class78 var20 = new class78(var0);

        for (var13 = 0; var13 < 4; ++var13) {
            for (int var14 = 0; var14 < 64; ++var14) {
                for (int var15 = 0; var15 < 64; ++var15) {
                    if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                        int var16 = var2 + class457.method2113(var14 & 7, var15 & 7, var7);
                        int var17 = var3 + class457.method2115(var14 & 7, var15 & 7, var7);
                        int var18 = (var14 & 7) + var2 + var8;
                        int var19 = var3 + var9 + (var15 & 7);
                        class122.method543(var20, var1, var16, var17, var18, var19, var7);
                    } else {
                        class122.method543(var20, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }

    }

    @Override
    public int method1533() {
        return this.field1867;
    }

    int method1094() {
        return this.field1885;
    }
}
